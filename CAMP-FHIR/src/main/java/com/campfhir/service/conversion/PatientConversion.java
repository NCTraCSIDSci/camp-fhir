package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Patient;
public class PatientConversion 
{
	public org.hl7.fhir.r4.model.Patient Patients(Patient p) throws ParseException
	{
		org.hl7.fhir.r4.model.Patient patient = new org.hl7.fhir.r4.model.Patient();

		/******************** id ********************************************************************************/
		patient.setId(p.getId());

<<<<<<< HEAD
		/******************** Pnt_Active ********************************************************************************/
		if(p.getPntActive() != null ) {

			if(p.getPntActive().replace("[","").replace("]","").equals("NULL") | p.getPntActive()==null) {} else {
			patient.setActive(Boolean.parseBoolean(p.getPntActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_Addr_City ********************************************************************************/
		if(p.getPntAddrCity() != null ) {

			String[] arrayi0 = p.getPntAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Addr_Cntry ********************************************************************************/
		if(p.getPntAddrCntry() != null ) {

			String[] arrayi0 = p.getPntAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Addr_District ********************************************************************************/
		if(p.getPntAddrDistrict() != null ) {

			String[] arrayi0 = p.getPntAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Addr_Line ********************************************************************************/
		if(p.getPntAddrLine() != null ) {

			String[] arrayi0 = p.getPntAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getAddress().get(i0).addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Addr_Prd_End ********************************************************************************/
		if(p.getPntAddrPrdEnd() != null ) {

			String[] arrayi0 = p.getPntAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Addr_Prd_Strt ********************************************************************************/
		if(p.getPntAddrPrdStrt() != null ) {

			String[] arrayi0 = p.getPntAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Addr_PostalCd ********************************************************************************/
		if(p.getPntAddrPostalCd() != null ) {

			String[] arrayi0 = p.getPntAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Addr_State ********************************************************************************/
		if(p.getPntAddrState() != null ) {

			String[] arrayi0 = p.getPntAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Addr_Txt ********************************************************************************/
		if(p.getPntAddrTxt() != null ) {

			String[] arrayi0 = p.getPntAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Addr_Typ ********************************************************************************/
		if(p.getPntAddrTyp() != null ) {

			String[] arrayi0 = p.getPntAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Addr_Use ********************************************************************************/
		if(p.getPntAddrUse() != null ) {

			String[] arrayi0 = p.getPntAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getAddress().size() < i0+1) { patient.addAddress(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getAddress().get(i0).setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_BirthDt ********************************************************************************/
		if(p.getPntBirthDt() != null ) {

			if(p.getPntBirthDt().replace("[","").replace("]","").equals("NULL") | p.getPntBirthDt()==null) {} else {
			patient.setBirthDate(p.getPntBirthDt().replace("[","").replace("]","").equals("NULL") | p.getPntBirthDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPntBirthDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgCd() != null ) {

			String[] arrayi0 = p.getPntCmmnctnLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getCommunication().size() < i0+1) { patient.addCommunication(); }
				String[] arrayi1 = p.getPntCmmnctnLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { patient.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getCommunication().get(i0).getLanguage().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgDsply() != null ) {

			String[] arrayi0 = p.getPntCmmnctnLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getCommunication().size() < i0+1) { patient.addCommunication(); }
				String[] arrayi1 = p.getPntCmmnctnLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { patient.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getCommunication().get(i0).getLanguage().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgSys() != null ) {

			String[] arrayi0 = p.getPntCmmnctnLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getCommunication().size() < i0+1) { patient.addCommunication(); }
				String[] arrayi1 = p.getPntCmmnctnLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { patient.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getCommunication().get(i0).getLanguage().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPntCmmnctnLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getCommunication().size() < i0+1) { patient.addCommunication(); }
				String[] arrayi1 = p.getPntCmmnctnLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { patient.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getCommunication().get(i0).getLanguage().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgVrsn() != null ) {

			String[] arrayi0 = p.getPntCmmnctnLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getCommunication().size() < i0+1) { patient.addCommunication(); }
				String[] arrayi1 = p.getPntCmmnctnLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getCommunication().get(i0).getLanguage().getCoding().size() < i1+1) { patient.getCommunication().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getCommunication().get(i0).getLanguage().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(p.getPntCmmnctnLnguageTxt() != null ) {

			String[] arrayi0 = p.getPntCmmnctnLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getCommunication().size() < i0+1) { patient.addCommunication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getCommunication().get(i0).getLanguage().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cmmnctn_Preferred ********************************************************************************/
		if(p.getPntCmmnctnPreferred() != null ) {

			String[] arrayi0 = p.getPntCmmnctnPreferred().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getCommunication().size() < i0+1) { patient.addCommunication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getCommunication().get(i0).setPreferred(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Addr_City ********************************************************************************/
		if(p.getPntCntctAddrCity() != null ) {

			String[] arrayi0 = p.getPntCntctAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Addr_Cntry ********************************************************************************/
		if(p.getPntCntctAddrCntry() != null ) {

			String[] arrayi0 = p.getPntCntctAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Addr_District ********************************************************************************/
		if(p.getPntCntctAddrDistrict() != null ) {

			String[] arrayi0 = p.getPntCntctAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Addr_Line ********************************************************************************/
		if(p.getPntCntctAddrLine() != null ) {

			String[] arrayi0 = p.getPntCntctAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getContact().get(i0).getAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cntct_Addr_Prd_End ********************************************************************************/
		if(p.getPntCntctAddrPrdEnd() != null ) {

			String[] arrayi0 = p.getPntCntctAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(p.getPntCntctAddrPrdStrt() != null ) {

			String[] arrayi0 = p.getPntCntctAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Addr_PostalCd ********************************************************************************/
		if(p.getPntCntctAddrPostalCd() != null ) {

			String[] arrayi0 = p.getPntCntctAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Addr_State ********************************************************************************/
		if(p.getPntCntctAddrState() != null ) {

			String[] arrayi0 = p.getPntCntctAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Addr_Txt ********************************************************************************/
		if(p.getPntCntctAddrTxt() != null ) {

			String[] arrayi0 = p.getPntCntctAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Addr_Typ ********************************************************************************/
		if(p.getPntCntctAddrTyp() != null ) {

			String[] arrayi0 = p.getPntCntctAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Addr_Use ********************************************************************************/
		if(p.getPntCntctAddrUse() != null ) {

			String[] arrayi0 = p.getPntCntctAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Gender ********************************************************************************/
		if(p.getPntCntctGender() != null ) {

			String[] arrayi0 = p.getPntCntctGender().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).setGender(new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Nm_Fmly ********************************************************************************/
		if(p.getPntCntctNmFmly() != null ) {

			String[] arrayi0 = p.getPntCntctNmFmly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getName().setFamily(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Nm_Given ********************************************************************************/
		if(p.getPntCntctNmGiven() != null ) {

			String[] arrayi0 = p.getPntCntctNmGiven().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getContact().get(i0).getName().addGiven(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cntct_Nm_Prd_End ********************************************************************************/
		if(p.getPntCntctNmPrdEnd() != null ) {

			String[] arrayi0 = p.getPntCntctNmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getName().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(p.getPntCntctNmPrdStrt() != null ) {

			String[] arrayi0 = p.getPntCntctNmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getName().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Nm_Prefix ********************************************************************************/
		if(p.getPntCntctNmPrefix() != null ) {

			String[] arrayi0 = p.getPntCntctNmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getContact().get(i0).getName().addPrefix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cntct_Nm_Suffix ********************************************************************************/
		if(p.getPntCntctNmSuffix() != null ) {

			String[] arrayi0 = p.getPntCntctNmSuffix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getContact().get(i0).getName().addSuffix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cntct_Nm_Txt ********************************************************************************/
		if(p.getPntCntctNmTxt() != null ) {

			String[] arrayi0 = p.getPntCntctNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getName().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Cntct_Nm_Use ********************************************************************************/
		if(p.getPntCntctNmUse() != null ) {

			String[] arrayi0 = p.getPntCntctNmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getName().setUse(new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Orgnztn ********************************************************************************/
		if(p.getPntCntctOrgnztn() != null ) {

			String[] arrayi0 = p.getPntCntctOrgnztn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).setOrganization(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Prd_End ********************************************************************************/
		if(p.getPntCntctPrdEnd() != null ) {

			String[] arrayi0 = p.getPntCntctPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Prd_Strt ********************************************************************************/
		if(p.getPntCntctPrdStrt() != null ) {

			String[] arrayi0 = p.getPntCntctPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getContact().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Cd ********************************************************************************/
		if(p.getPntCntctRltnshipCdgCd() != null ) {

			String[] arrayi0 = p.getPntCntctRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getRelationship().size() < i1+1) { patient.getContact().get(i0).addRelationship(); }
					String[] arrayi2 = p.getPntCntctRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(patient.getContact().get(i0).getRelationship().get(i1).getCoding().size() < i2+1) { patient.getContact().get(i0).getRelationship().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {patient.getContact().get(i0).getRelationship().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Dsply ********************************************************************************/
		if(p.getPntCntctRltnshipCdgDsply() != null ) {

			String[] arrayi0 = p.getPntCntctRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getRelationship().size() < i1+1) { patient.getContact().get(i0).addRelationship(); }
					String[] arrayi2 = p.getPntCntctRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(patient.getContact().get(i0).getRelationship().get(i1).getCoding().size() < i2+1) { patient.getContact().get(i0).getRelationship().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {patient.getContact().get(i0).getRelationship().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Sys ********************************************************************************/
		if(p.getPntCntctRltnshipCdgSys() != null ) {

			String[] arrayi0 = p.getPntCntctRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getRelationship().size() < i1+1) { patient.getContact().get(i0).addRelationship(); }
					String[] arrayi2 = p.getPntCntctRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(patient.getContact().get(i0).getRelationship().get(i1).getCoding().size() < i2+1) { patient.getContact().get(i0).getRelationship().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {patient.getContact().get(i0).getRelationship().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Pnt_Cntct_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntCntctRltnshipCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPntCntctRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getRelationship().size() < i1+1) { patient.getContact().get(i0).addRelationship(); }
					String[] arrayi2 = p.getPntCntctRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(patient.getContact().get(i0).getRelationship().get(i1).getCoding().size() < i2+1) { patient.getContact().get(i0).getRelationship().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {patient.getContact().get(i0).getRelationship().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(p.getPntCntctRltnshipCdgVrsn() != null ) {

			String[] arrayi0 = p.getPntCntctRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getRelationship().size() < i1+1) { patient.getContact().get(i0).addRelationship(); }
					String[] arrayi2 = p.getPntCntctRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(patient.getContact().get(i0).getRelationship().get(i1).getCoding().size() < i2+1) { patient.getContact().get(i0).getRelationship().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {patient.getContact().get(i0).getRelationship().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Pnt_Cntct_Rltnship_Txt ********************************************************************************/
		if(p.getPntCntctRltnshipTxt() != null ) {

			String[] arrayi0 = p.getPntCntctRltnshipTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctRltnshipTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getRelationship().size() < i1+1) { patient.getContact().get(i0).addRelationship(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getContact().get(i0).getRelationship().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(p.getPntCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPntCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getTelecom().size() < i1+1) { patient.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Pnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPntCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPntCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getTelecom().size() < i1+1) { patient.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Pnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(p.getPntCntctTlcmRnk() != null ) {

			String[] arrayi0 = p.getPntCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getTelecom().size() < i1+1) { patient.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Pnt_Cntct_Tlcm_Sys ********************************************************************************/
		if(p.getPntCntctTlcmSys() != null ) {

			String[] arrayi0 = p.getPntCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getTelecom().size() < i1+1) { patient.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Pnt_Cntct_Tlcm_Use ********************************************************************************/
		if(p.getPntCntctTlcmUse() != null ) {

			String[] arrayi0 = p.getPntCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getTelecom().size() < i1+1) { patient.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Pnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(p.getPntCntctTlcmVl() != null ) {

			String[] arrayi0 = p.getPntCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getContact().size() < i0+1) { patient.addContact(); }
				String[] arrayi1 = p.getPntCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getContact().get(i0).getTelecom().size() < i1+1) { patient.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_DeceasedBooleanTyp ********************************************************************************/
		if(p.getPntDeceasedBooleanTyp() != null ) {

			if(p.getPntDeceasedBooleanTyp().replace("[","").replace("]","").equals("NULL") | p.getPntDeceasedBooleanTyp()==null) {} else {
			patient.setDeceased(new org.hl7.fhir.r4.model.BooleanType(p.getPntDeceasedBooleanTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_DeceasedDtTimeTyp ********************************************************************************/
		if(p.getPntDeceasedDtTimeTyp() != null ) {

			if(p.getPntDeceasedDtTimeTyp().replace("[","").replace("]","").equals("NULL") | p.getPntDeceasedDtTimeTyp()==null) {} else {
			patient.setDeceased(new org.hl7.fhir.r4.model.DateTimeType(p.getPntDeceasedDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_Gender ********************************************************************************/
		if(p.getPntGender() != null ) {

			if(p.getPntGender().replace("[","").replace("]","").equals("NULL") | p.getPntGender()==null) {} else {
			patient.setGender(new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory().fromCode(p.getPntGender().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_GeneralPrctitnr ********************************************************************************/
		if(p.getPntGeneralPrctitnr() != null ) {

				for( String currListStrSplit : p.getPntGeneralPrctitnr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			patient.addGeneralPractitioner(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Pnt_Id_Assigner ********************************************************************************/
		if(p.getPntIdAssigner() != null ) {

			String[] arrayi0 = p.getPntIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Id_Prd_End ********************************************************************************/
		if(p.getPntIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPntIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Id_Prd_Strt ********************************************************************************/
		if(p.getPntIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPntIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Id_Sys ********************************************************************************/
		if(p.getPntIdSys() != null ) {

			String[] arrayi0 = p.getPntIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPntIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				String[] arrayi1 = p.getPntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { patient.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPntIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				String[] arrayi1 = p.getPntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { patient.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPntIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				String[] arrayi1 = p.getPntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { patient.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				String[] arrayi1 = p.getPntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { patient.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Pnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				String[] arrayi1 = p.getPntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(patient.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { patient.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {patient.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Id_Typ_Txt ********************************************************************************/
		if(p.getPntIdTypTxt() != null ) {

			String[] arrayi0 = p.getPntIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Id_Use ********************************************************************************/
		if(p.getPntIdUse() != null ) {

			String[] arrayi0 = p.getPntIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Id_Vl ********************************************************************************/
		if(p.getPntIdVl() != null ) {

			String[] arrayi0 = p.getPntIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getIdentifier().size() < i0+1) { patient.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Link_Other ********************************************************************************/
		if(p.getPntLinkOther() != null ) {

			String[] arrayi0 = p.getPntLinkOther().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getLink().size() < i0+1) { patient.addLink(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getLink().get(i0).setOther(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Link_Typ ********************************************************************************/
		if(p.getPntLinkTyp() != null ) {

			String[] arrayi0 = p.getPntLinkTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getLink().size() < i0+1) { patient.addLink(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getLink().get(i0).setType(new org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_ManagingOrgnztn ********************************************************************************/
		if(p.getPntManagingOrgnztn() != null ) {

			if(p.getPntManagingOrgnztn().replace("[","").replace("]","").equals("NULL") | p.getPntManagingOrgnztn()==null) {} else {
			patient.setManagingOrganization(new org.hl7.fhir.r4.model.Reference(p.getPntManagingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_MaritalSts_Cdg_Cd ********************************************************************************/
		if(p.getPntMaritalStsCdgCd() != null ) {

			String[] arrayi0 = p.getPntMaritalStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getMaritalStatus().getCoding().size() < i0+1) { patient.getMaritalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getMaritalStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_MaritalSts_Cdg_Dsply ********************************************************************************/
		if(p.getPntMaritalStsCdgDsply() != null ) {

			String[] arrayi0 = p.getPntMaritalStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getMaritalStatus().getCoding().size() < i0+1) { patient.getMaritalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getMaritalStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_MaritalSts_Cdg_Sys ********************************************************************************/
		if(p.getPntMaritalStsCdgSys() != null ) {

			String[] arrayi0 = p.getPntMaritalStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getMaritalStatus().getCoding().size() < i0+1) { patient.getMaritalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getMaritalStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_MaritalSts_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntMaritalStsCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPntMaritalStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getMaritalStatus().getCoding().size() < i0+1) { patient.getMaritalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getMaritalStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_MaritalSts_Cdg_Vrsn ********************************************************************************/
		if(p.getPntMaritalStsCdgVrsn() != null ) {

			String[] arrayi0 = p.getPntMaritalStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getMaritalStatus().getCoding().size() < i0+1) { patient.getMaritalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getMaritalStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_MaritalSts_Txt ********************************************************************************/
		if(p.getPntMaritalStsTxt() != null ) {

			if(p.getPntMaritalStsTxt().replace("[","").replace("]","").equals("NULL") | p.getPntMaritalStsTxt()==null) {} else {
			patient.getMaritalStatus().setText(p.getPntMaritalStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Pnt_MultipleBirthBooleanTyp ********************************************************************************/
		if(p.getPntMultipleBirthBooleanTyp() != null ) {

			if(p.getPntMultipleBirthBooleanTyp().replace("[","").replace("]","").equals("NULL") | p.getPntMultipleBirthBooleanTyp()==null) {} else {
			patient.setMultipleBirth(new org.hl7.fhir.r4.model.BooleanType(p.getPntMultipleBirthBooleanTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_MultipleBirthIntegerTyp ********************************************************************************/
		if(p.getPntMultipleBirthIntegerTyp() != null ) {

			if(p.getPntMultipleBirthIntegerTyp().replace("[","").replace("]","").equals("NULL") | p.getPntMultipleBirthIntegerTyp()==null) {} else {
			patient.setMultipleBirth(new org.hl7.fhir.r4.model.IntegerType(p.getPntMultipleBirthIntegerTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Pnt_Nm_Fmly ********************************************************************************/
		if(p.getPntNmFmly() != null ) {

			String[] arrayi0 = p.getPntNmFmly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getName().get(i0).setFamily(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Nm_Given ********************************************************************************/
		if(p.getPntNmGiven() != null ) {

			String[] arrayi0 = p.getPntNmGiven().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getName().get(i0).addGiven(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Nm_Prd_End ********************************************************************************/
		if(p.getPntNmPrdEnd() != null ) {

			String[] arrayi0 = p.getPntNmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getName().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Nm_Prd_Strt ********************************************************************************/
		if(p.getPntNmPrdStrt() != null ) {

			String[] arrayi0 = p.getPntNmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getName().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Nm_Prefix ********************************************************************************/
		if(p.getPntNmPrefix() != null ) {

			String[] arrayi0 = p.getPntNmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getName().get(i0).addPrefix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Nm_Suffix ********************************************************************************/
		if(p.getPntNmSuffix() != null ) {

			String[] arrayi0 = p.getPntNmSuffix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {patient.getName().get(i0).addSuffix(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Pnt_Nm_Txt ********************************************************************************/
		if(p.getPntNmTxt() != null ) {

			String[] arrayi0 = p.getPntNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getName().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Nm_Use ********************************************************************************/
		if(p.getPntNmUse() != null ) {

			String[] arrayi0 = p.getPntNmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getName().size() < i0+1) { patient.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getName().get(i0).setUse(new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Photo_CntntTyp ********************************************************************************/
		if(p.getPntPhotoCntntTyp() != null ) {

			String[] arrayi0 = p.getPntPhotoCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Photo_Creation ********************************************************************************/
		if(p.getPntPhotoCreation() != null ) {

			String[] arrayi0 = p.getPntPhotoCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Photo_Data ********************************************************************************/
		if(p.getPntPhotoData() != null ) {

			String[] arrayi0 = p.getPntPhotoData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Pnt_Photo_Hash ********************************************************************************/
		if(p.getPntPhotoHash() != null ) {

			String[] arrayi0 = p.getPntPhotoHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Pnt_Photo_Lnguage ********************************************************************************/
		if(p.getPntPhotoLnguage() != null ) {

			String[] arrayi0 = p.getPntPhotoLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Photo_Sz ********************************************************************************/
		if(p.getPntPhotoSz() != null ) {

			String[] arrayi0 = p.getPntPhotoSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Photo_Ttl ********************************************************************************/
		if(p.getPntPhotoTtl() != null ) {

			String[] arrayi0 = p.getPntPhotoTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Photo_Url ********************************************************************************/
		if(p.getPntPhotoUrl() != null ) {

			String[] arrayi0 = p.getPntPhotoUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getPhoto().size() < i0+1) { patient.addPhoto(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getPhoto().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Pnt_Tlcm_Prd_End ********************************************************************************/
		if(p.getPntTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPntTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getTelecom().size() < i0+1) { patient.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPntTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPntTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getTelecom().size() < i0+1) { patient.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Tlcm_Rnk ********************************************************************************/
		if(p.getPntTlcmRnk() != null ) {

			String[] arrayi0 = p.getPntTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getTelecom().size() < i0+1) { patient.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Tlcm_Sys ********************************************************************************/
		if(p.getPntTlcmSys() != null ) {

			String[] arrayi0 = p.getPntTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getTelecom().size() < i0+1) { patient.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Tlcm_Use ********************************************************************************/
		if(p.getPntTlcmUse() != null ) {

			String[] arrayi0 = p.getPntTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getTelecom().size() < i0+1) { patient.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Pnt_Tlcm_Vl ********************************************************************************/
		if(p.getPntTlcmVl() != null ) {

			String[] arrayi0 = p.getPntTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(patient.getTelecom().size() < i0+1) { patient.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {patient.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
=======
		/******************** Patient_Active ********************************************************************************/
		if(p.getPatientActive() != null) {
			patient.setActive(Boolean.parseBoolean(p.getPatientActive()));
		}

		org.hl7.fhir.r4.model.Address patientaddaddress = patient.addAddress();

		/******************** Patient_Address_City ********************************************************************************/
		if(p.getPatientAddressCity() != null) {
			patientaddaddress.setCity(p.getPatientAddressCity());
		}
		/******************** Patient_Address_Country ********************************************************************************/
		if(p.getPatientAddressCountry() != null) {
			patientaddaddress.setCountry(p.getPatientAddressCountry());
		}
		/******************** Patient_Address_District ********************************************************************************/
		if(p.getPatientAddressDistrict() != null) {
			patientaddaddress.setDistrict(p.getPatientAddressDistrict());
		}
		/******************** Patient_Address_Line ********************************************************************************/
		if(p.getPatientAddressLine() != null) {
			patientaddaddress.addLine(p.getPatientAddressLine());
		}

		org.hl7.fhir.r4.model.Period patientaddaddresssetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddaddress.setPeriod(patientaddaddresssetperiod);

		/******************** Patient_Address_Period_End ********************************************************************************/
		if(p.getPatientAddressPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientAddressPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientAddressPeriodEnddate = PatientAddressPeriodEndsdf.parse(p.getPatientAddressPeriodEnd());
			patientaddaddresssetperiod.setEnd(PatientAddressPeriodEnddate);
		}
		/******************** Patient_Address_Period_Start ********************************************************************************/
		if(p.getPatientAddressPeriodStart() != null) {
			java.text.SimpleDateFormat PatientAddressPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientAddressPeriodStartdate = PatientAddressPeriodStartsdf.parse(p.getPatientAddressPeriodStart());
			patientaddaddresssetperiod.setStart(PatientAddressPeriodStartdate);
		}
		/******************** Patient_Address_PostalCode ********************************************************************************/
		if(p.getPatientAddressPostalCode() != null) {
			patientaddaddress.setPostalCode(p.getPatientAddressPostalCode());
		}
		/******************** Patient_Address_State ********************************************************************************/
		if(p.getPatientAddressState() != null) {
			patientaddaddress.setState(p.getPatientAddressState());
		}
		/******************** Patient_Address_Text ********************************************************************************/
		if(p.getPatientAddressText() != null) {
			patientaddaddress.setText(p.getPatientAddressText());
		}

		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory patientaddaddresssettypeEnumFactory = new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();

		/******************** Patient_Address_Type_Code ********************************************************************************/
		if(p.getPatientAddressTypeCode() != null) {
			patientaddaddress.setType(patientaddaddresssettypeEnumFactory.fromCode(p.getPatientAddressTypeCode()));

		}

		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory patientaddaddresssetuseEnumFactory = new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();

		/******************** Patient_Address_Use_Code ********************************************************************************/
		if(p.getPatientAddressUseCode() != null) {
			patientaddaddress.setUse(patientaddaddresssetuseEnumFactory.fromCode(p.getPatientAddressUseCode()));

		}
		/******************** Patient_BirthDate ********************************************************************************/
		if(p.getPatientBirthDate() != null) {
			java.text.SimpleDateFormat PatientBirthDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientBirthDatedate = PatientBirthDatesdf.parse(p.getPatientBirthDate());
			patient.setBirthDate(PatientBirthDatedate);
		}

		org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent patientaddcommunication = patient.addCommunication();


		org.hl7.fhir.r4.model.CodeableConcept patientaddcommunicationsetlanguage = new org.hl7.fhir.r4.model.CodeableConcept();
		patientaddcommunication.setLanguage(patientaddcommunicationsetlanguage);


		org.hl7.fhir.r4.model.Coding patientaddcommunicationsetlanguageaddcoding = patientaddcommunicationsetlanguage.addCoding();

		/******************** Patient_Commn_Lang_Coding_Code ********************************************************************************/
		if(p.getPatientCommnLangCodingCode() != null) {
			patientaddcommunicationsetlanguageaddcoding.setCode(p.getPatientCommnLangCodingCode());
		}
		/******************** Patient_Commn_Lang_Coding_Display ********************************************************************************/
		if(p.getPatientCommnLangCodingDisplay() != null) {
			patientaddcommunicationsetlanguageaddcoding.setDisplay(p.getPatientCommnLangCodingDisplay());
		}
		/******************** Patient_Commn_Lang_Coding_System ********************************************************************************/
		if(p.getPatientCommnLangCodingSystem() != null) {
			patientaddcommunicationsetlanguageaddcoding.setSystem(p.getPatientCommnLangCodingSystem());
		}
		/******************** Patient_Commn_Lang_Coding_Usrslt ********************************************************************************/
		if(p.getPatientCommnLangCodingUsrslt() != null) {
			patientaddcommunicationsetlanguageaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientCommnLangCodingUsrslt()));
		}
		/******************** Patient_Commn_Lang_Coding_Version ********************************************************************************/
		if(p.getPatientCommnLangCodingVersion() != null) {
			patientaddcommunicationsetlanguageaddcoding.setVersion(p.getPatientCommnLangCodingVersion());
		}
		/******************** Patient_Commn_Lang_Text ********************************************************************************/
		if(p.getPatientCommnLangText() != null) {
			patientaddcommunicationsetlanguage.setText(p.getPatientCommnLangText());
		}
		/******************** Patient_Commn_Preferred ********************************************************************************/
		if(p.getPatientCommnPreferred() != null) {
			patientaddcommunication.setPreferred(Boolean.parseBoolean(p.getPatientCommnPreferred()));
		}

		org.hl7.fhir.r4.model.Patient.ContactComponent patientaddcontact = patient.addContact();


		org.hl7.fhir.r4.model.Address patientaddcontactsetaddress = new org.hl7.fhir.r4.model.Address();
		patientaddcontact.setAddress(patientaddcontactsetaddress);

		/******************** Patient_Contact_Address_City ********************************************************************************/
		if(p.getPatientContactAddressCity() != null) {
			patientaddcontactsetaddress.setCity(p.getPatientContactAddressCity());
		}
		/******************** Patient_Contact_Address_Country ********************************************************************************/
		if(p.getPatientContactAddressCountry() != null) {
			patientaddcontactsetaddress.setCountry(p.getPatientContactAddressCountry());
		}
		/******************** Patient_Contact_Address_District ********************************************************************************/
		if(p.getPatientContactAddressDistrict() != null) {
			patientaddcontactsetaddress.setDistrict(p.getPatientContactAddressDistrict());
		}
		/******************** Patient_Contact_Address_Line ********************************************************************************/
		if(p.getPatientContactAddressLine() != null) {
			patientaddcontactsetaddress.addLine(p.getPatientContactAddressLine());
		}

		org.hl7.fhir.r4.model.Period patientaddcontactsetaddresssetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontactsetaddress.setPeriod(patientaddcontactsetaddresssetperiod);

		/******************** Patient_Contact_Address_Period_End ********************************************************************************/
		if(p.getPatientContactAddressPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactAddressPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactAddressPeriodEnddate = PatientContactAddressPeriodEndsdf.parse(p.getPatientContactAddressPeriodEnd());
			patientaddcontactsetaddresssetperiod.setEnd(PatientContactAddressPeriodEnddate);
		}
		/******************** Patient_Contact_Address_Period_Start ********************************************************************************/
		if(p.getPatientContactAddressPeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactAddressPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactAddressPeriodStartdate = PatientContactAddressPeriodStartsdf.parse(p.getPatientContactAddressPeriodStart());
			patientaddcontactsetaddresssetperiod.setStart(PatientContactAddressPeriodStartdate);
		}
		/******************** Patient_Contact_Address_PostalCode ********************************************************************************/
		if(p.getPatientContactAddressPostalCode() != null) {
			patientaddcontactsetaddress.setPostalCode(p.getPatientContactAddressPostalCode());
		}
		/******************** Patient_Contact_Address_State ********************************************************************************/
		if(p.getPatientContactAddressState() != null) {
			patientaddcontactsetaddress.setState(p.getPatientContactAddressState());
		}
		/******************** Patient_Contact_Address_Text ********************************************************************************/
		if(p.getPatientContactAddressText() != null) {
			patientaddcontactsetaddress.setText(p.getPatientContactAddressText());
		}

		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory patientaddcontactsetaddresssettypeEnumFactory = new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();

		/******************** Patient_Contact_Address_Type_Code ********************************************************************************/
		if(p.getPatientContactAddressTypeCode() != null) {
			patientaddcontactsetaddress.setType(patientaddcontactsetaddresssettypeEnumFactory.fromCode(p.getPatientContactAddressTypeCode()));

		}

		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory patientaddcontactsetaddresssetuseEnumFactory = new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();

		/******************** Patient_Contact_Address_Use_Code ********************************************************************************/
		if(p.getPatientContactAddressUseCode() != null) {
			patientaddcontactsetaddress.setUse(patientaddcontactsetaddresssetuseEnumFactory.fromCode(p.getPatientContactAddressUseCode()));

		}

		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory patientaddcontactsetgenderEnumFactory = new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();

		/******************** Patient_Contact_Gender_Code ********************************************************************************/
		if(p.getPatientContactGenderCode() != null) {
			patientaddcontact.setGender(patientaddcontactsetgenderEnumFactory.fromCode(p.getPatientContactGenderCode()));

		}

		org.hl7.fhir.r4.model.HumanName patientaddcontactsetname = new org.hl7.fhir.r4.model.HumanName();
		patientaddcontact.setName(patientaddcontactsetname);

		/******************** Patient_Contact_Name_Family ********************************************************************************/
		if(p.getPatientContactNameFamily() != null) {
			patientaddcontactsetname.setFamily(p.getPatientContactNameFamily());
		}
		/******************** Patient_Contact_Name_Given ********************************************************************************/
		if(p.getPatientContactNameGiven() != null) {
			patientaddcontactsetname.addGiven(p.getPatientContactNameGiven());
		}

		org.hl7.fhir.r4.model.Period patientaddcontactsetnamesetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontactsetname.setPeriod(patientaddcontactsetnamesetperiod);

		/******************** Patient_Contact_Name_Period_End ********************************************************************************/
		if(p.getPatientContactNamePeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactNamePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactNamePeriodEnddate = PatientContactNamePeriodEndsdf.parse(p.getPatientContactNamePeriodEnd());
			patientaddcontactsetnamesetperiod.setEnd(PatientContactNamePeriodEnddate);
		}
		/******************** Patient_Contact_Name_Period_Start ********************************************************************************/
		if(p.getPatientContactNamePeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactNamePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactNamePeriodStartdate = PatientContactNamePeriodStartsdf.parse(p.getPatientContactNamePeriodStart());
			patientaddcontactsetnamesetperiod.setStart(PatientContactNamePeriodStartdate);
		}
		/******************** Patient_Contact_Name_Prefix ********************************************************************************/
		if(p.getPatientContactNamePrefix() != null) {
			patientaddcontactsetname.addPrefix(p.getPatientContactNamePrefix());
		}
		/******************** Patient_Contact_Name_Suffix ********************************************************************************/
		if(p.getPatientContactNameSuffix() != null) {
			patientaddcontactsetname.addSuffix(p.getPatientContactNameSuffix());
		}
		/******************** Patient_Contact_Name_Text ********************************************************************************/
		if(p.getPatientContactNameText() != null) {
			patientaddcontactsetname.setText(p.getPatientContactNameText());
		}

		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory patientaddcontactsetnamesetuseEnumFactory = new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();

		/******************** Patient_Contact_Name_Use_Code ********************************************************************************/
		if(p.getPatientContactNameUseCode() != null) {
			patientaddcontactsetname.setUse(patientaddcontactsetnamesetuseEnumFactory.fromCode(p.getPatientContactNameUseCode()));

		}
		/******************** Patient_Contact_Organization ********************************************************************************/
		if(p.getPatientContactOrganization() != null) {
			org.hl7.fhir.r4.model.Reference PatientContactOrganizationref = new org.hl7.fhir.r4.model.Reference();
			patientaddcontact.setOrganization(PatientContactOrganizationref.setReference(p.getPatientContactOrganization()));
		}

		org.hl7.fhir.r4.model.Period patientaddcontactsetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontact.setPeriod(patientaddcontactsetperiod);

		/******************** Patient_Contact_Period_End ********************************************************************************/
		if(p.getPatientContactPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactPeriodEnddate = PatientContactPeriodEndsdf.parse(p.getPatientContactPeriodEnd());
			patientaddcontactsetperiod.setEnd(PatientContactPeriodEnddate);
		}
		/******************** Patient_Contact_Period_Start ********************************************************************************/
		if(p.getPatientContactPeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactPeriodStartdate = PatientContactPeriodStartsdf.parse(p.getPatientContactPeriodStart());
			patientaddcontactsetperiod.setStart(PatientContactPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept patientaddcontactaddrelationship = patientaddcontact.addRelationship();


		org.hl7.fhir.r4.model.Coding patientaddcontactaddrelationshipaddcoding = patientaddcontactaddrelationship.addCoding();

		/******************** Patient_Contact_Relationship_Coding_Code ********************************************************************************/
		if(p.getPatientContactRelationshipCodingCode() != null) {
			patientaddcontactaddrelationshipaddcoding.setCode(p.getPatientContactRelationshipCodingCode());
		}
		/******************** Patient_Contact_Relationship_Coding_Display ********************************************************************************/
		if(p.getPatientContactRelationshipCodingDisplay() != null) {
			patientaddcontactaddrelationshipaddcoding.setDisplay(p.getPatientContactRelationshipCodingDisplay());
		}
		/******************** Patient_Contact_Relationship_Coding_System ********************************************************************************/
		if(p.getPatientContactRelationshipCodingSystem() != null) {
			patientaddcontactaddrelationshipaddcoding.setSystem(p.getPatientContactRelationshipCodingSystem());
		}
		/******************** Patient_Contact_Relationship_Coding_Usrslt ********************************************************************************/
		if(p.getPatientContactRelationshipCodingUsrslt() != null) {
			patientaddcontactaddrelationshipaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientContactRelationshipCodingUsrslt()));
		}
		/******************** Patient_Contact_Relationship_Coding_Version ********************************************************************************/
		if(p.getPatientContactRelationshipCodingVersion() != null) {
			patientaddcontactaddrelationshipaddcoding.setVersion(p.getPatientContactRelationshipCodingVersion());
		}
		/******************** Patient_Contact_Relationship_Text ********************************************************************************/
		if(p.getPatientContactRelationshipText() != null) {
			patientaddcontactaddrelationship.setText(p.getPatientContactRelationshipText());
		}

		org.hl7.fhir.r4.model.ContactPoint patientaddcontactaddtelecom = patientaddcontact.addTelecom();


		org.hl7.fhir.r4.model.Period patientaddcontactaddtelecomsetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontactaddtelecom.setPeriod(patientaddcontactaddtelecomsetperiod);

		/******************** Patient_Contact_Telecom_Period_End ********************************************************************************/
		if(p.getPatientContactTelecomPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactTelecomPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactTelecomPeriodEnddate = PatientContactTelecomPeriodEndsdf.parse(p.getPatientContactTelecomPeriodEnd());
			patientaddcontactaddtelecomsetperiod.setEnd(PatientContactTelecomPeriodEnddate);
		}
		/******************** Patient_Contact_Telecom_Period_Start ********************************************************************************/
		if(p.getPatientContactTelecomPeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactTelecomPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactTelecomPeriodStartdate = PatientContactTelecomPeriodStartsdf.parse(p.getPatientContactTelecomPeriodStart());
			patientaddcontactaddtelecomsetperiod.setStart(PatientContactTelecomPeriodStartdate);
		}
		/******************** Patient_Contact_Telecom_Rank ********************************************************************************/
		if(p.getPatientContactTelecomRank() != null) {
			patientaddcontactaddtelecom.setRank(Integer.parseInt(p.getPatientContactTelecomRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory patientaddcontactaddtelecomsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Patient_Contact_Telecom_System_Code ********************************************************************************/
		if(p.getPatientContactTelecomSystemCode() != null) {
			patientaddcontactaddtelecom.setSystem(patientaddcontactaddtelecomsetsystemEnumFactory.fromCode(p.getPatientContactTelecomSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory patientaddcontactaddtelecomsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Patient_Contact_Telecom_Use_Code ********************************************************************************/
		if(p.getPatientContactTelecomUseCode() != null) {
			patientaddcontactaddtelecom.setUse(patientaddcontactaddtelecomsetuseEnumFactory.fromCode(p.getPatientContactTelecomUseCode()));

		}
		/******************** Patient_Contact_Telecom_Value ********************************************************************************/
		if(p.getPatientContactTelecomValue() != null) {
			patientaddcontactaddtelecom.setValue(p.getPatientContactTelecomValue());
		}
		/******************** Patient_DeceasedBoolean ********************************************************************************/
		if(p.getPatientDeceasedBoolean() != null) {
			patient.setDeceased(new org.hl7.fhir.r4.model.BooleanType(p.getPatientDeceasedBoolean()));
		}
		/******************** Patient_DeceasedDateTime ********************************************************************************/
		if(p.getPatientDeceasedDateTime() != null) {
			patient.setDeceased(new org.hl7.fhir.r4.model.DateTimeType(p.getPatientDeceasedDateTime()));
		}

		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory patientsetgenderEnumFactory = new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();

		/******************** Patient_Gender_Code ********************************************************************************/
		if(p.getPatientGenderCode() != null) {
			patient.setGender(patientsetgenderEnumFactory.fromCode(p.getPatientGenderCode()));

		}
		/******************** Patient_GeneralPract ********************************************************************************/
		if(p.getPatientGeneralPract() != null) {
			org.hl7.fhir.r4.model.Reference PatientGeneralPractref = new org.hl7.fhir.r4.model.Reference();
			patient.addGeneralPractitioner(PatientGeneralPractref.setReference(p.getPatientGeneralPract()));
		}

		org.hl7.fhir.r4.model.Identifier patientaddidentifier = patient.addIdentifier();

		/******************** Patient_Id_Assigner ********************************************************************************/
		if(p.getPatientIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PatientIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			patientaddidentifier.setAssigner(PatientIdAssignerref.setReference(p.getPatientIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period patientaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddidentifier.setPeriod(patientaddidentifiersetperiod);

		/******************** Patient_Id_Period_End ********************************************************************************/
		if(p.getPatientIdPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientIdPeriodEnddate = PatientIdPeriodEndsdf.parse(p.getPatientIdPeriodEnd());
			patientaddidentifiersetperiod.setEnd(PatientIdPeriodEnddate);
		}
		/******************** Patient_Id_Period_Start ********************************************************************************/
		if(p.getPatientIdPeriodStart() != null) {
			java.text.SimpleDateFormat PatientIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientIdPeriodStartdate = PatientIdPeriodStartsdf.parse(p.getPatientIdPeriodStart());
			patientaddidentifiersetperiod.setStart(PatientIdPeriodStartdate);
		}
		/******************** Patient_Id_System ********************************************************************************/
		if(p.getPatientIdSystem() != null) {
			patientaddidentifier.setSystem(p.getPatientIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept patientaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		patientaddidentifier.setType(patientaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding patientaddidentifiersettypeaddcoding = patientaddidentifiersettype.addCoding();

		/******************** Patient_Id_Type_Coding_Code ********************************************************************************/
		if(p.getPatientIdTypeCodingCode() != null) {
			patientaddidentifiersettypeaddcoding.setCode(p.getPatientIdTypeCodingCode());
		}
		/******************** Patient_Id_Type_Coding_Display ********************************************************************************/
		if(p.getPatientIdTypeCodingDisplay() != null) {
			patientaddidentifiersettypeaddcoding.setDisplay(p.getPatientIdTypeCodingDisplay());
		}
		/******************** Patient_Id_Type_Coding_System ********************************************************************************/
		if(p.getPatientIdTypeCodingSystem() != null) {
			patientaddidentifiersettypeaddcoding.setSystem(p.getPatientIdTypeCodingSystem());
		}
		/******************** Patient_Id_Type_Coding_Usrslt ********************************************************************************/
		if(p.getPatientIdTypeCodingUsrslt() != null) {
			patientaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientIdTypeCodingUsrslt()));
		}
		/******************** Patient_Id_Type_Coding_Version ********************************************************************************/
		if(p.getPatientIdTypeCodingVersion() != null) {
			patientaddidentifiersettypeaddcoding.setVersion(p.getPatientIdTypeCodingVersion());
		}
		/******************** Patient_Id_Type_Text ********************************************************************************/
		if(p.getPatientIdTypeText() != null) {
			patientaddidentifiersettype.setText(p.getPatientIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory patientaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Patient_Id_Use_Code ********************************************************************************/
		if(p.getPatientIdUseCode() != null) {
			patientaddidentifier.setUse(patientaddidentifiersetuseEnumFactory.fromCode(p.getPatientIdUseCode()));

		}
		/******************** Patient_Id_Value ********************************************************************************/
		if(p.getPatientIdValue() != null) {
			patientaddidentifier.setValue(p.getPatientIdValue());
		}

		org.hl7.fhir.r4.model.Patient.PatientLinkComponent patientaddlink = patient.addLink();

		/******************** Patient_Link_Other ********************************************************************************/
		if(p.getPatientLinkOther() != null) {
			org.hl7.fhir.r4.model.Reference PatientLinkOtherref = new org.hl7.fhir.r4.model.Reference();
			patientaddlink.setOther(PatientLinkOtherref.setReference(p.getPatientLinkOther()));
		}

		org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory patientaddlinksettypeEnumFactory = new org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory();

		/******************** Patient_Link_Type_Code ********************************************************************************/
		if(p.getPatientLinkTypeCode() != null) {
			patientaddlink.setType(patientaddlinksettypeEnumFactory.fromCode(p.getPatientLinkTypeCode()));

		}
		/******************** Patient_ManagingOrganization ********************************************************************************/
		if(p.getPatientManagingOrganization() != null) {
			org.hl7.fhir.r4.model.Reference PatientManagingOrganizationref = new org.hl7.fhir.r4.model.Reference();
			patient.setManagingOrganization(PatientManagingOrganizationref.setReference(p.getPatientManagingOrganization()));
		}

		org.hl7.fhir.r4.model.CodeableConcept patientsetmaritalstatus = new org.hl7.fhir.r4.model.CodeableConcept();
		patient.setMaritalStatus(patientsetmaritalstatus);


		org.hl7.fhir.r4.model.Coding patientsetmaritalstatusaddcoding = patientsetmaritalstatus.addCoding();

		/******************** Patient_MaritalStatus_Coding_Code ********************************************************************************/
		if(p.getPatientMaritalStatusCodingCode() != null) {
			patientsetmaritalstatusaddcoding.setCode(p.getPatientMaritalStatusCodingCode());
		}
		/******************** Patient_MaritalStatus_Coding_Display ********************************************************************************/
		if(p.getPatientMaritalStatusCodingDisplay() != null) {
			patientsetmaritalstatusaddcoding.setDisplay(p.getPatientMaritalStatusCodingDisplay());
		}
		/******************** Patient_MaritalStatus_Coding_System ********************************************************************************/
		if(p.getPatientMaritalStatusCodingSystem() != null) {
			patientsetmaritalstatusaddcoding.setSystem(p.getPatientMaritalStatusCodingSystem());
		}
		/******************** Patient_MaritalStatus_Coding_Usrslt ********************************************************************************/
		if(p.getPatientMaritalStatusCodingUsrslt() != null) {
			patientsetmaritalstatusaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientMaritalStatusCodingUsrslt()));
		}
		/******************** Patient_MaritalStatus_Coding_Version ********************************************************************************/
		if(p.getPatientMaritalStatusCodingVersion() != null) {
			patientsetmaritalstatusaddcoding.setVersion(p.getPatientMaritalStatusCodingVersion());
		}
		/******************** Patient_MaritalStatus_Text ********************************************************************************/
		if(p.getPatientMaritalStatusText() != null) {
			patientsetmaritalstatus.setText(p.getPatientMaritalStatusText());
		}
		/******************** Patient_MultipleBirthBoolean ********************************************************************************/
		if(p.getPatientMultipleBirthBoolean() != null) {
			patient.setMultipleBirth(new org.hl7.fhir.r4.model.BooleanType(p.getPatientMultipleBirthBoolean()));
		}
		/******************** Patient_MultipleBirthInteger ********************************************************************************/
		if(p.getPatientMultipleBirthInteger() != null) {
			patient.setMultipleBirth(new org.hl7.fhir.r4.model.IntegerType(p.getPatientMultipleBirthInteger()));
		}

		org.hl7.fhir.r4.model.HumanName patientaddname = patient.addName();

		/******************** Patient_Name_Family ********************************************************************************/
		if(p.getPatientNameFamily() != null) {
			patientaddname.setFamily(p.getPatientNameFamily());
		}
		/******************** Patient_Name_Given ********************************************************************************/
		if(p.getPatientNameGiven() != null) {
			patientaddname.addGiven(p.getPatientNameGiven());
		}

		org.hl7.fhir.r4.model.Period patientaddnamesetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddname.setPeriod(patientaddnamesetperiod);

		/******************** Patient_Name_Period_End ********************************************************************************/
		if(p.getPatientNamePeriodEnd() != null) {
			java.text.SimpleDateFormat PatientNamePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientNamePeriodEnddate = PatientNamePeriodEndsdf.parse(p.getPatientNamePeriodEnd());
			patientaddnamesetperiod.setEnd(PatientNamePeriodEnddate);
		}
		/******************** Patient_Name_Period_Start ********************************************************************************/
		if(p.getPatientNamePeriodStart() != null) {
			java.text.SimpleDateFormat PatientNamePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientNamePeriodStartdate = PatientNamePeriodStartsdf.parse(p.getPatientNamePeriodStart());
			patientaddnamesetperiod.setStart(PatientNamePeriodStartdate);
		}
		/******************** Patient_Name_Prefix ********************************************************************************/
		if(p.getPatientNamePrefix() != null) {
			patientaddname.addPrefix(p.getPatientNamePrefix());
		}
		/******************** Patient_Name_Suffix ********************************************************************************/
		if(p.getPatientNameSuffix() != null) {
			patientaddname.addSuffix(p.getPatientNameSuffix());
		}
		/******************** Patient_Name_Text ********************************************************************************/
		if(p.getPatientNameText() != null) {
			patientaddname.setText(p.getPatientNameText());
		}

		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory patientaddnamesetuseEnumFactory = new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();

		/******************** Patient_Name_Use_Code ********************************************************************************/
		if(p.getPatientNameUseCode() != null) {
			patientaddname.setUse(patientaddnamesetuseEnumFactory.fromCode(p.getPatientNameUseCode()));

		}

		org.hl7.fhir.r4.model.Attachment patientaddphoto = patient.addPhoto();

		/******************** Patient_Photo_ContentType ********************************************************************************/
		if(p.getPatientPhotoContentType() != null) {
			patientaddphoto.setContentType(p.getPatientPhotoContentType());
		}
		/******************** Patient_Photo_Creation ********************************************************************************/
		if(p.getPatientPhotoCreation() != null) {
			java.text.SimpleDateFormat PatientPhotoCreationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientPhotoCreationdate = PatientPhotoCreationsdf.parse(p.getPatientPhotoCreation());
			patientaddphoto.setCreation(PatientPhotoCreationdate);
		}
		/******************** Patient_Photo_Data ********************************************************************************/
		if(p.getPatientPhotoData() != null) {
			patientaddphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPatientPhotoData()));
		}
		/******************** Patient_Photo_Hash ********************************************************************************/
		if(p.getPatientPhotoHash() != null) {
			patientaddphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPatientPhotoHash()));
		}
		/******************** Patient_Photo_Lang ********************************************************************************/
		if(p.getPatientPhotoLang() != null) {
			patientaddphoto.setLanguage(p.getPatientPhotoLang());
		}
		/******************** Patient_Photo_Size ********************************************************************************/
		if(p.getPatientPhotoSize() != null) {
			patientaddphoto.setSize(Integer.parseInt(p.getPatientPhotoSize()));
		}
		/******************** Patient_Photo_Title ********************************************************************************/
		if(p.getPatientPhotoTitle() != null) {
			patientaddphoto.setTitle(p.getPatientPhotoTitle());
		}
		/******************** Patient_Photo_Url ********************************************************************************/
		if(p.getPatientPhotoUrl() != null) {
			patientaddphoto.setUrl(p.getPatientPhotoUrl());
		}

		org.hl7.fhir.r4.model.ContactPoint patientaddtelecom = patient.addTelecom();


		org.hl7.fhir.r4.model.Period patientaddtelecomsetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddtelecom.setPeriod(patientaddtelecomsetperiod);

		/******************** Patient_Telecom_Period_End ********************************************************************************/
		if(p.getPatientTelecomPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientTelecomPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientTelecomPeriodEnddate = PatientTelecomPeriodEndsdf.parse(p.getPatientTelecomPeriodEnd());
			patientaddtelecomsetperiod.setEnd(PatientTelecomPeriodEnddate);
		}
		/******************** Patient_Telecom_Period_Start ********************************************************************************/
		if(p.getPatientTelecomPeriodStart() != null) {
			java.text.SimpleDateFormat PatientTelecomPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientTelecomPeriodStartdate = PatientTelecomPeriodStartsdf.parse(p.getPatientTelecomPeriodStart());
			patientaddtelecomsetperiod.setStart(PatientTelecomPeriodStartdate);
		}
		/******************** Patient_Telecom_Rank ********************************************************************************/
		if(p.getPatientTelecomRank() != null) {
			patientaddtelecom.setRank(Integer.parseInt(p.getPatientTelecomRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory patientaddtelecomsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Patient_Telecom_System_Code ********************************************************************************/
		if(p.getPatientTelecomSystemCode() != null) {
			patientaddtelecom.setSystem(patientaddtelecomsetsystemEnumFactory.fromCode(p.getPatientTelecomSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory patientaddtelecomsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Patient_Telecom_Use_Code ********************************************************************************/
		if(p.getPatientTelecomUseCode() != null) {
			patientaddtelecom.setUse(patientaddtelecomsetuseEnumFactory.fromCode(p.getPatientTelecomUseCode()));

		}
		/******************** Patient_Telecom_Value ********************************************************************************/
		if(p.getPatientTelecomValue() != null) {
			patientaddtelecom.setValue(p.getPatientTelecomValue());
		}
>>>>>>> master
		return patient;
	}
}
