package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceUseStatement;
public class DeviceUseStatementConversion 
{
	public org.hl7.fhir.r4.model.DeviceUseStatement DeviceUseStatements(DeviceUseStatement d) throws ParseException
	{
		org.hl7.fhir.r4.model.DeviceUseStatement deviceusestatement = new org.hl7.fhir.r4.model.DeviceUseStatement();

		/******************** id ********************************************************************************/
		deviceusestatement.setId(d.getId());

		/******************** DvcUseStmnt_BasedOn ********************************************************************************/
		if(d.getDvcUseStmntBasedOn() != null ) {

				for( String currListStrSplit : d.getDvcUseStmntBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			deviceusestatement.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcUseStmnt_BodySite_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgCd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getBodySite().getCoding().size() < i0+1) { deviceusestatement.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getBodySite().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_BodySite_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcUseStmntBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getBodySite().getCoding().size() < i0+1) { deviceusestatement.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getBodySite().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_BodySite_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgSys() != null ) {

			String[] arrayi0 = d.getDvcUseStmntBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getBodySite().getCoding().size() < i0+1) { deviceusestatement.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getBodySite().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getBodySite().getCoding().size() < i0+1) { deviceusestatement.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getBodySite().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_BodySite_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcUseStmntBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getBodySite().getCoding().size() < i0+1) { deviceusestatement.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getBodySite().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_BodySite_Txt ********************************************************************************/
		if(d.getDvcUseStmntBodySiteTxt() != null ) {

			if(d.getDvcUseStmntBodySiteTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntBodySiteTxt()==null) {} else {
			deviceusestatement.getBodySite().setText(d.getDvcUseStmntBodySiteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_DerivedFrom ********************************************************************************/
		if(d.getDvcUseStmntDerivedFrom() != null ) {

				for( String currListStrSplit : d.getDvcUseStmntDerivedFrom().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			deviceusestatement.addDerivedFrom(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcUseStmnt_Dvc ********************************************************************************/
		if(d.getDvcUseStmntDvc() != null ) {

			if(d.getDvcUseStmntDvc().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntDvc()==null) {} else {
			deviceusestatement.setDevice(new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntDvc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_Id_Assigner ********************************************************************************/
		if(d.getDvcUseStmntIdAssigner() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_Id_Prd_End ********************************************************************************/
		if(d.getDvcUseStmntIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcUseStmntIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_Id_Sys ********************************************************************************/
		if(d.getDvcUseStmntIdSys() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				String[] arrayi1 = d.getDvcUseStmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { deviceusestatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				String[] arrayi1 = d.getDvcUseStmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { deviceusestatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				String[] arrayi1 = d.getDvcUseStmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { deviceusestatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				String[] arrayi1 = d.getDvcUseStmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { deviceusestatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				String[] arrayi1 = d.getDvcUseStmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { deviceusestatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcUseStmntIdTypTxt() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_Id_Use ********************************************************************************/
		if(d.getDvcUseStmntIdUse() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_Id_Vl ********************************************************************************/
		if(d.getDvcUseStmntIdVl() != null ) {

			String[] arrayi0 = d.getDvcUseStmntIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getIdentifier().size() < i0+1) { deviceusestatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcUseStmntNtAthrRfrnc() != null ) {

			String[] arrayi0 = d.getDvcUseStmntNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getNote().size() < i0+1) { deviceusestatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcUseStmntNtAthrStrgTyp() != null ) {

			String[] arrayi0 = d.getDvcUseStmntNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getNote().size() < i0+1) { deviceusestatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_Nt_Txt ********************************************************************************/
		if(d.getDvcUseStmntNtTxt() != null ) {

			String[] arrayi0 = d.getDvcUseStmntNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getNote().size() < i0+1) { deviceusestatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_Nt_Time ********************************************************************************/
		if(d.getDvcUseStmntNtTime() != null ) {

			String[] arrayi0 = d.getDvcUseStmntNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getNote().size() < i0+1) { deviceusestatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getReasonCode().size() < i0+1) { deviceusestatement.addReasonCode(); }
				String[] arrayi1 = d.getDvcUseStmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getReasonCode().get(i0).getCoding().size() < i1+1) { deviceusestatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcUseStmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getReasonCode().size() < i0+1) { deviceusestatement.addReasonCode(); }
				String[] arrayi1 = d.getDvcUseStmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getReasonCode().get(i0).getCoding().size() < i1+1) { deviceusestatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcUseStmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getReasonCode().size() < i0+1) { deviceusestatement.addReasonCode(); }
				String[] arrayi1 = d.getDvcUseStmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getReasonCode().get(i0).getCoding().size() < i1+1) { deviceusestatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getReasonCode().size() < i0+1) { deviceusestatement.addReasonCode(); }
				String[] arrayi1 = d.getDvcUseStmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getReasonCode().get(i0).getCoding().size() < i1+1) { deviceusestatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcUseStmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getReasonCode().size() < i0+1) { deviceusestatement.addReasonCode(); }
				String[] arrayi1 = d.getDvcUseStmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(deviceusestatement.getReasonCode().get(i0).getCoding().size() < i1+1) { deviceusestatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {deviceusestatement.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcUseStmnt_RsnCd_Txt ********************************************************************************/
		if(d.getDvcUseStmntRsnCdTxt() != null ) {

			String[] arrayi0 = d.getDvcUseStmntRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getReasonCode().size() < i0+1) { deviceusestatement.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_RsnRfrnc ********************************************************************************/
		if(d.getDvcUseStmntRsnRfrnc() != null ) {

				for( String currListStrSplit : d.getDvcUseStmntRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			deviceusestatement.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcUseStmnt_RecordedOn ********************************************************************************/
		if(d.getDvcUseStmntRecordedOn() != null ) {

			if(d.getDvcUseStmntRecordedOn().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntRecordedOn()==null) {} else {
			deviceusestatement.setRecordedOn(d.getDvcUseStmntRecordedOn().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntRecordedOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcUseStmntRecordedOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_Src ********************************************************************************/
		if(d.getDvcUseStmntSrc() != null ) {

			if(d.getDvcUseStmntSrc().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntSrc()==null) {} else {
			deviceusestatement.setSource(new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntSrc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_Sts ********************************************************************************/
		if(d.getDvcUseStmntSts() != null ) {

			if(d.getDvcUseStmntSts().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntSts()==null) {} else {
			deviceusestatement.setStatus(new org.hl7.fhir.r4.model.DeviceUseStatement.DeviceUseStatementStatusEnumFactory().fromCode(d.getDvcUseStmntSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_Sbjct ********************************************************************************/
		if(d.getDvcUseStmntSbjct() != null ) {

			if(d.getDvcUseStmntSbjct().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntSbjct()==null) {} else {
			deviceusestatement.setSubject(new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgDtTimeTyp ********************************************************************************/
		if(d.getDvcUseStmntTmgDtTimeTyp() != null ) {

			if(d.getDvcUseStmntTmgDtTimeTyp().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgDtTimeTyp()==null) {} else {
			deviceusestatement.setTiming(new org.hl7.fhir.r4.model.DateTimeType(d.getDvcUseStmntTmgDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgPrd_End ********************************************************************************/
		if(d.getDvcUseStmntTmgPrdEnd() != null ) {

			if(d.getDvcUseStmntTmgPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgPrdEnd()==null) {} else {
			deviceusestatement.getTimingPeriod().setEnd(d.getDvcUseStmntTmgPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcUseStmntTmgPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgPrd_Strt ********************************************************************************/
		if(d.getDvcUseStmntTmgPrdStrt() != null ) {

			if(d.getDvcUseStmntTmgPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgPrdStrt()==null) {} else {
			deviceusestatement.getTimingPeriod().setStart(d.getDvcUseStmntTmgPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcUseStmntTmgPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getTimingTiming().getCode().getCoding().size() < i0+1) { deviceusestatement.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getTimingTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcUseStmntTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getTimingTiming().getCode().getCoding().size() < i0+1) { deviceusestatement.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getTimingTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcUseStmntTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getTimingTiming().getCode().getCoding().size() < i0+1) { deviceusestatement.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getTimingTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcUseStmntTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getTimingTiming().getCode().getCoding().size() < i0+1) { deviceusestatement.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getTimingTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcUseStmntTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(deviceusestatement.getTimingTiming().getCode().getCoding().size() < i0+1) { deviceusestatement.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {deviceusestatement.getTimingTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Txt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdTxt() != null ) {

			if(d.getDvcUseStmntTmgTmgCdTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgCdTxt()==null) {} else {
			deviceusestatement.getTimingTiming().getCode().setText(d.getDvcUseStmntTmgTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Evnt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgEvnt() != null ) {

				for( String currListStrSplit : d.getDvcUseStmntTmgTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			deviceusestatement.getTimingTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsDurationCd() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsDurationCd()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsDuration().setCode(d.getDvcUseStmntTmgTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsDurationCmprtr() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsDurationCmprtr()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcUseStmntTmgTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsDurationSys() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsDurationSys()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsDuration().setSystem(d.getDvcUseStmntTmgTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsDurationUnt() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsDurationUnt()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsDuration().setUnit(d.getDvcUseStmntTmgTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsDurationVl() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsDurationVl()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((d.getDvcUseStmntTmgTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsPrdEnd() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsPrdEnd()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsPeriod().setEnd(d.getDvcUseStmntTmgTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcUseStmntTmgTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsPrdStrt() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsPrdStrt()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsPeriod().setStart(d.getDvcUseStmntTmgTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcUseStmntTmgTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiCd() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngHiCd()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getHigh().setCode(d.getDvcUseStmntTmgTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiCmprtr() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngHiCmprtr()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcUseStmntTmgTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiSys() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngHiSys()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getHigh().setSystem(d.getDvcUseStmntTmgTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiUnt() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngHiUnt()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getHigh().setUnit(d.getDvcUseStmntTmgTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiVl() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngHiVl()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((d.getDvcUseStmntTmgTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwCd() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngLwCd()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getLow().setCode(d.getDvcUseStmntTmgTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwCmprtr() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngLwCmprtr()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcUseStmntTmgTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwSys() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngLwSys()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getLow().setSystem(d.getDvcUseStmntTmgTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwUnt() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngLwUnt()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getLow().setUnit(d.getDvcUseStmntTmgTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwVl() != null ) {

			if(d.getDvcUseStmntTmgTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptBndsRngLwVl()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((d.getDvcUseStmntTmgTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptCnt() != null ) {

			if(d.getDvcUseStmntTmgTmgRptCnt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptCnt()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setCount(Integer.parseInt(d.getDvcUseStmntTmgTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptCntMx() != null ) {

			if(d.getDvcUseStmntTmgTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptCntMx()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setCountMax(Integer.parseInt(d.getDvcUseStmntTmgTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Duration ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptDuration() != null ) {

			if(d.getDvcUseStmntTmgTmgRptDuration().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptDuration()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setDuration((Double.parseDouble((d.getDvcUseStmntTmgTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptDurationMx() != null ) {

			if(d.getDvcUseStmntTmgTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptDurationMx()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setDurationMax((Double.parseDouble((d.getDvcUseStmntTmgTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_DurationUnt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptDurationUnt() != null ) {

			if(d.getDvcUseStmntTmgTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptDurationUnt()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(d.getDvcUseStmntTmgTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptFrqncy() != null ) {

			if(d.getDvcUseStmntTmgTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptFrqncy()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setFrequency(Integer.parseInt(d.getDvcUseStmntTmgTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptFrqncyMx() != null ) {

			if(d.getDvcUseStmntTmgTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptFrqncyMx()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setFrequencyMax(Integer.parseInt(d.getDvcUseStmntTmgTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Off ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptOff() != null ) {

			if(d.getDvcUseStmntTmgTmgRptOff().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptOff()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setOffset(Integer.parseInt(d.getDvcUseStmntTmgTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Prd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptPrd() != null ) {

			if(d.getDvcUseStmntTmgTmgRptPrd().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptPrd()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setPeriod((new java.math.BigDecimal((d.getDvcUseStmntTmgTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptPrdMx() != null ) {

			if(d.getDvcUseStmntTmgTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptPrdMx()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((d.getDvcUseStmntTmgTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_PrdUnt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptPrdUnt() != null ) {

			if(d.getDvcUseStmntTmgTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcUseStmntTmgTmgRptPrdUnt()==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(d.getDvcUseStmntTmgTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : d.getDvcUseStmntTmgTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			deviceusestatement.getTimingTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		return deviceusestatement;
	}
}
