package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Communication;
public class CommunicationConversion 
{
	public org.hl7.fhir.r4.model.Communication Communications(Communication c) throws ParseException
	{
		org.hl7.fhir.r4.model.Communication communication = new org.hl7.fhir.r4.model.Communication();

		/******************** id ********************************************************************************/
		communication.setId(c.getId());

		/******************** Cmmnctn_About ********************************************************************************/
		if(c.getCmmnctnAbout() != null ) {

				for( String currListStrSplit : c.getCmmnctnAbout().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addAbout(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cmmnctn_BasedOn ********************************************************************************/
		if(c.getCmmnctnBasedOn() != null ) {

				for( String currListStrSplit : c.getCmmnctnBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cmmnctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getCategory().size() < i0+1) { communication.addCategory(); }
				String[] arrayi1 = c.getCmmnctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getCategory().get(i0).getCoding().size() < i1+1) { communication.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getCategory().size() < i0+1) { communication.addCategory(); }
				String[] arrayi1 = c.getCmmnctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getCategory().get(i0).getCoding().size() < i1+1) { communication.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getCategory().size() < i0+1) { communication.addCategory(); }
				String[] arrayi1 = c.getCmmnctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getCategory().get(i0).getCoding().size() < i1+1) { communication.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getCategory().size() < i0+1) { communication.addCategory(); }
				String[] arrayi1 = c.getCmmnctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getCategory().get(i0).getCoding().size() < i1+1) { communication.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmmnctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getCategory().size() < i0+1) { communication.addCategory(); }
				String[] arrayi1 = c.getCmmnctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getCategory().get(i0).getCoding().size() < i1+1) { communication.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Ctgry_Txt ********************************************************************************/
		if(c.getCmmnctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getCategory().size() < i0+1) { communication.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Enc ********************************************************************************/
		if(c.getCmmnctnEnc() != null ) {

			if(c.getCmmnctnEnc().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnEnc()==null) {} else {
			communication.setEncounter(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmmnctn_Id_Assigner ********************************************************************************/
		if(c.getCmmnctnIdAssigner() != null ) {

			String[] arrayi0 = c.getCmmnctnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Id_Prd_End ********************************************************************************/
		if(c.getCmmnctnIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCmmnctnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Id_Prd_Strt ********************************************************************************/
		if(c.getCmmnctnIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCmmnctnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Id_Sys ********************************************************************************/
		if(c.getCmmnctnIdSys() != null ) {

			String[] arrayi0 = c.getCmmnctnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmmnctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				String[] arrayi1 = c.getCmmnctnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { communication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Id_Typ_Txt ********************************************************************************/
		if(c.getCmmnctnIdTypTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Id_Use ********************************************************************************/
		if(c.getCmmnctnIdUse() != null ) {

			String[] arrayi0 = c.getCmmnctnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Id_Vl ********************************************************************************/
		if(c.getCmmnctnIdVl() != null ) {

			String[] arrayi0 = c.getCmmnctnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getIdentifier().size() < i0+1) { communication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_InRspsTo ********************************************************************************/
		if(c.getCmmnctnInRspsTo() != null ) {

				for( String currListStrSplit : c.getCmmnctnInRspsTo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addInResponseTo(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cmmnctn_InstantiatesCanonical ********************************************************************************/
		if(c.getCmmnctnInstantiatesCanonical() != null ) {

				for( String currListStrSplit : c.getCmmnctnInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Cmmnctn_InstantiatesUri ********************************************************************************/
		if(c.getCmmnctnInstantiatesUri() != null ) {

				for( String currListStrSplit : c.getCmmnctnInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Cmmnctn_Medium_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnMediumCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnMediumCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getMedium().size() < i0+1) { communication.addMedium(); }
				String[] arrayi1 = c.getCmmnctnMediumCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getMedium().get(i0).getCoding().size() < i1+1) { communication.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getMedium().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Medium_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnMediumCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnMediumCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getMedium().size() < i0+1) { communication.addMedium(); }
				String[] arrayi1 = c.getCmmnctnMediumCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getMedium().get(i0).getCoding().size() < i1+1) { communication.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getMedium().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Medium_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnMediumCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnMediumCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getMedium().size() < i0+1) { communication.addMedium(); }
				String[] arrayi1 = c.getCmmnctnMediumCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getMedium().get(i0).getCoding().size() < i1+1) { communication.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getMedium().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Medium_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnMediumCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnMediumCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getMedium().size() < i0+1) { communication.addMedium(); }
				String[] arrayi1 = c.getCmmnctnMediumCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getMedium().get(i0).getCoding().size() < i1+1) { communication.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getMedium().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmmnctn_Medium_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnMediumCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnMediumCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getMedium().size() < i0+1) { communication.addMedium(); }
				String[] arrayi1 = c.getCmmnctnMediumCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getMedium().get(i0).getCoding().size() < i1+1) { communication.getMedium().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getMedium().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_Medium_Txt ********************************************************************************/
		if(c.getCmmnctnMediumTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnMediumTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getMedium().size() < i0+1) { communication.addMedium(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getMedium().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCmmnctnNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getCmmnctnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getNote().size() < i0+1) { communication.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCmmnctnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getCmmnctnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getNote().size() < i0+1) { communication.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Nt_Txt ********************************************************************************/
		if(c.getCmmnctnNtTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getNote().size() < i0+1) { communication.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Nt_Time ********************************************************************************/
		if(c.getCmmnctnNtTime() != null ) {

			String[] arrayi0 = c.getCmmnctnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getNote().size() < i0+1) { communication.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_PartOf ********************************************************************************/
		if(c.getCmmnctnPartOf() != null ) {

				for( String currListStrSplit : c.getCmmnctnPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntCntntTyp() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntCreation() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntData() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntHash() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntLnguage() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntSz() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntTtl() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntUrl() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).getContentAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Payload_CntntRfrnc ********************************************************************************/
		if(c.getCmmnctnPayloadCntntRfrnc() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).setContent(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Payload_CntntStrgTyp ********************************************************************************/
		if(c.getCmmnctnPayloadCntntStrgTyp() != null ) {

			String[] arrayi0 = c.getCmmnctnPayloadCntntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getPayload().size() < i0+1) { communication.addPayload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getPayload().get(i0).setContent(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Priority ********************************************************************************/
		if(c.getCmmnctnPriority() != null ) {

			if(c.getCmmnctnPriority().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnPriority()==null) {} else {
			communication.setPriority(new org.hl7.fhir.r4.model.Communication.CommunicationPriorityEnumFactory().fromCode(c.getCmmnctnPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmmnctn_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getReasonCode().size() < i0+1) { communication.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getReasonCode().get(i0).getCoding().size() < i1+1) { communication.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getReasonCode().size() < i0+1) { communication.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getReasonCode().get(i0).getCoding().size() < i1+1) { communication.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getReasonCode().size() < i0+1) { communication.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getReasonCode().get(i0).getCoding().size() < i1+1) { communication.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getReasonCode().size() < i0+1) { communication.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getReasonCode().get(i0).getCoding().size() < i1+1) { communication.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmmnctn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getReasonCode().size() < i0+1) { communication.addReasonCode(); }
				String[] arrayi1 = c.getCmmnctnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(communication.getReasonCode().get(i0).getCoding().size() < i1+1) { communication.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {communication.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmmnctn_RsnCd_Txt ********************************************************************************/
		if(c.getCmmnctnRsnCdTxt() != null ) {

			String[] arrayi0 = c.getCmmnctnRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getReasonCode().size() < i0+1) { communication.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_RsnRfrnc ********************************************************************************/
		if(c.getCmmnctnRsnRfrnc() != null ) {

				for( String currListStrSplit : c.getCmmnctnRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cmmnctn_Received ********************************************************************************/
		if(c.getCmmnctnReceived() != null ) {

			if(c.getCmmnctnReceived().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnReceived()==null) {} else {
			communication.setReceived(c.getCmmnctnReceived().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnReceived()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmmnctnReceived().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmmnctn_Recipient ********************************************************************************/
		if(c.getCmmnctnRecipient() != null ) {

				for( String currListStrSplit : c.getCmmnctnRecipient().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			communication.addRecipient(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cmmnctn_Sender ********************************************************************************/
		if(c.getCmmnctnSender() != null ) {

			if(c.getCmmnctnSender().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnSender()==null) {} else {
			communication.setSender(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnSender().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmmnctn_Sent ********************************************************************************/
		if(c.getCmmnctnSent() != null ) {

			if(c.getCmmnctnSent().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnSent()==null) {} else {
			communication.setSent(c.getCmmnctnSent().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnSent()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmmnctnSent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmmnctn_Sts ********************************************************************************/
		if(c.getCmmnctnSts() != null ) {

			if(c.getCmmnctnSts().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnSts()==null) {} else {
			communication.setStatus(new org.hl7.fhir.r4.model.Communication.CommunicationStatusEnumFactory().fromCode(c.getCmmnctnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmmnctn_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getStatusReason().getCoding().size() < i0+1) { communication.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getStatusReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getStatusReason().getCoding().size() < i0+1) { communication.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getStatusReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getStatusReason().getCoding().size() < i0+1) { communication.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getStatusReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getStatusReason().getCoding().size() < i0+1) { communication.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getStatusReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getStatusReason().getCoding().size() < i0+1) { communication.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getStatusReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_StsRsn_Txt ********************************************************************************/
		if(c.getCmmnctnStsRsnTxt() != null ) {

			if(c.getCmmnctnStsRsnTxt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnStsRsnTxt()==null) {} else {
			communication.getStatusReason().setText(c.getCmmnctnStsRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cmmnctn_Sbjct ********************************************************************************/
		if(c.getCmmnctnSbjct() != null ) {

			if(c.getCmmnctnSbjct().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnSbjct()==null) {} else {
			communication.setSubject(new org.hl7.fhir.r4.model.Reference(c.getCmmnctnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmmnctn_Topic_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnTopicCdgCd() != null ) {

			String[] arrayi0 = c.getCmmnctnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getTopic().getCoding().size() < i0+1) { communication.getTopic().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getTopic().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Topic_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnTopicCdgDsply() != null ) {

			String[] arrayi0 = c.getCmmnctnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getTopic().getCoding().size() < i0+1) { communication.getTopic().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getTopic().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Topic_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnTopicCdgSys() != null ) {

			String[] arrayi0 = c.getCmmnctnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getTopic().getCoding().size() < i0+1) { communication.getTopic().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getTopic().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmmnctnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getTopic().getCoding().size() < i0+1) { communication.getTopic().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getTopic().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmmnctn_Topic_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnTopicCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmmnctnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(communication.getTopic().getCoding().size() < i0+1) { communication.getTopic().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {communication.getTopic().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmmnctn_Topic_Txt ********************************************************************************/
		if(c.getCmmnctnTopicTxt() != null ) {

			if(c.getCmmnctnTopicTxt().replace("[","").replace("]","").equals("NULL") | c.getCmmnctnTopicTxt()==null) {} else {
			communication.getTopic().setText(c.getCmmnctnTopicTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return communication;
	}
}
