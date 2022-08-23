package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceRequest;
public class DeviceRequestConversion 
{
	public org.hl7.fhir.r4.model.DeviceRequest DeviceRequests(DeviceRequest d) throws ParseException
	{
		org.hl7.fhir.r4.model.DeviceRequest devicerequest = new org.hl7.fhir.r4.model.DeviceRequest();

		/******************** id ********************************************************************************/
		devicerequest.setId(d.getId());

		/******************** DvcRqst_AthredOn ********************************************************************************/
		if(d.getDvcRqstAthredOn() != null ) {

			if(d.getDvcRqstAthredOn().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstAthredOn()==null) {} else {
			devicerequest.setAuthoredOn(d.getDvcRqstAthredOn().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstAthredOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcRqstAthredOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_BasedOn ********************************************************************************/
		if(d.getDvcRqstBasedOn() != null ) {

				for( String currListStrSplit : d.getDvcRqstBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstCdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getCodeCodeableConcept().getCoding().size() < i0+1) { devicerequest.getCodeCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getCodeCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstCdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getCodeCodeableConcept().getCoding().size() < i0+1) { devicerequest.getCodeCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getCodeCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstCdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getCodeCodeableConcept().getCoding().size() < i0+1) { devicerequest.getCodeCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getCodeCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstCdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getCodeCodeableConcept().getCoding().size() < i0+1) { devicerequest.getCodeCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getCodeCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstCdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getCodeCodeableConcept().getCoding().size() < i0+1) { devicerequest.getCodeCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getCodeCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_CdCdbleCncpt_Txt ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptTxt() != null ) {

			if(d.getDvcRqstCdCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstCdCdbleCncptTxt()==null) {} else {
			devicerequest.getCodeCodeableConcept().setText(d.getDvcRqstCdCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_CdRfrnc ********************************************************************************/
		if(d.getDvcRqstCdRfrnc() != null ) {

			if(d.getDvcRqstCdRfrnc().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstCdRfrnc()==null) {} else {
			devicerequest.setCode(new org.hl7.fhir.r4.model.Reference(d.getDvcRqstCdRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_Enc ********************************************************************************/
		if(d.getDvcRqstEnc() != null ) {

			if(d.getDvcRqstEnc().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstEnc()==null) {} else {
			devicerequest.setEncounter(new org.hl7.fhir.r4.model.Reference(d.getDvcRqstEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_GrpId_Assigner ********************************************************************************/
		if(d.getDvcRqstGrpIdAssigner() != null ) {

			if(d.getDvcRqstGrpIdAssigner().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdAssigner()==null) {} else {
			devicerequest.getGroupIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(d.getDvcRqstGrpIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_GrpId_Prd_End ********************************************************************************/
		if(d.getDvcRqstGrpIdPrdEnd() != null ) {

			if(d.getDvcRqstGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdPrdEnd()==null) {} else {
			devicerequest.getGroupIdentifier().getPeriod().setEnd(d.getDvcRqstGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcRqstGrpIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_GrpId_Prd_Strt ********************************************************************************/
		if(d.getDvcRqstGrpIdPrdStrt() != null ) {

			if(d.getDvcRqstGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdPrdStrt()==null) {} else {
			devicerequest.getGroupIdentifier().getPeriod().setStart(d.getDvcRqstGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcRqstGrpIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_GrpId_Sys ********************************************************************************/
		if(d.getDvcRqstGrpIdSys() != null ) {

			if(d.getDvcRqstGrpIdSys().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdSys()==null) {} else {
			devicerequest.getGroupIdentifier().setSystem(d.getDvcRqstGrpIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { devicerequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getGroupIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { devicerequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getGroupIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { devicerequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getGroupIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { devicerequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getGroupIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { devicerequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getGroupIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_GrpId_Typ_Txt ********************************************************************************/
		if(d.getDvcRqstGrpIdTypTxt() != null ) {

			if(d.getDvcRqstGrpIdTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdTypTxt()==null) {} else {
			devicerequest.getGroupIdentifier().getType().setText(d.getDvcRqstGrpIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_GrpId_Use ********************************************************************************/
		if(d.getDvcRqstGrpIdUse() != null ) {

			if(d.getDvcRqstGrpIdUse().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdUse()==null) {} else {
			devicerequest.getGroupIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(d.getDvcRqstGrpIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_GrpId_Vl ********************************************************************************/
		if(d.getDvcRqstGrpIdVl() != null ) {

			if(d.getDvcRqstGrpIdVl().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstGrpIdVl()==null) {} else {
			devicerequest.getGroupIdentifier().setValue(d.getDvcRqstGrpIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_Id_Assigner ********************************************************************************/
		if(d.getDvcRqstIdAssigner() != null ) {

			String[] arrayi0 = d.getDvcRqstIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Id_Prd_End ********************************************************************************/
		if(d.getDvcRqstIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcRqstIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcRqstIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcRqstIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Id_Sys ********************************************************************************/
		if(d.getDvcRqstIdSys() != null ) {

			String[] arrayi0 = d.getDvcRqstIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				String[] arrayi1 = d.getDvcRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				String[] arrayi1 = d.getDvcRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				String[] arrayi1 = d.getDvcRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				String[] arrayi1 = d.getDvcRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				String[] arrayi1 = d.getDvcRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcRqstIdTypTxt() != null ) {

			String[] arrayi0 = d.getDvcRqstIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Id_Use ********************************************************************************/
		if(d.getDvcRqstIdUse() != null ) {

			String[] arrayi0 = d.getDvcRqstIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Id_Vl ********************************************************************************/
		if(d.getDvcRqstIdVl() != null ) {

			String[] arrayi0 = d.getDvcRqstIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getIdentifier().size() < i0+1) { devicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_InstantiatesCanonical ********************************************************************************/
		if(d.getDvcRqstInstantiatesCanonical() != null ) {

				for( String currListStrSplit : d.getDvcRqstInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** DvcRqst_InstantiatesUri ********************************************************************************/
		if(d.getDvcRqstInstantiatesUri() != null ) {

				for( String currListStrSplit : d.getDvcRqstInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** DvcRqst_Insrnc ********************************************************************************/
		if(d.getDvcRqstInsrnc() != null ) {

				for( String currListStrSplit : d.getDvcRqstInsrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addInsurance(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcRqst_Intent ********************************************************************************/
		if(d.getDvcRqstIntent() != null ) {

			if(d.getDvcRqstIntent().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstIntent()==null) {} else {
			devicerequest.setIntent(new org.hl7.fhir.r4.model.DeviceRequest.RequestIntentEnumFactory().fromCode(d.getDvcRqstIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcRqstNtAthrRfrnc() != null ) {

			String[] arrayi0 = d.getDvcRqstNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getNote().size() < i0+1) { devicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcRqstNtAthrStrgTyp() != null ) {

			String[] arrayi0 = d.getDvcRqstNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getNote().size() < i0+1) { devicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Nt_Txt ********************************************************************************/
		if(d.getDvcRqstNtTxt() != null ) {

			String[] arrayi0 = d.getDvcRqstNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getNote().size() < i0+1) { devicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Nt_Time ********************************************************************************/
		if(d.getDvcRqstNtTime() != null ) {

			String[] arrayi0 = d.getDvcRqstNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getNote().size() < i0+1) { devicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(d.getDvcRqstOccrnceDtTimeTyp() != null ) {

			if(d.getDvcRqstOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceDtTimeTyp()==null) {} else {
			devicerequest.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(d.getDvcRqstOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrncePrd_End ********************************************************************************/
		if(d.getDvcRqstOccrncePrdEnd() != null ) {

			if(d.getDvcRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrncePrdEnd()==null) {} else {
			devicerequest.getOccurrencePeriod().setEnd(d.getDvcRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrncePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcRqstOccrncePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrncePrd_Strt ********************************************************************************/
		if(d.getDvcRqstOccrncePrdStrt() != null ) {

			if(d.getDvcRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrncePrdStrt()==null) {} else {
			devicerequest.getOccurrencePeriod().setStart(d.getDvcRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrncePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcRqstOccrncePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { devicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { devicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { devicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { devicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { devicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdTxt() != null ) {

			if(d.getDvcRqstOccrnceTmgCdTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgCdTxt()==null) {} else {
			devicerequest.getOccurrenceTiming().getCode().setText(d.getDvcRqstOccrnceTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgEvnt() != null ) {

				for( String currListStrSplit : d.getDvcRqstOccrnceTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.getOccurrenceTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationCd() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsDurationCd()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setCode(d.getDvcRqstOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationCmprtr() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsDurationCmprtr()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcRqstOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationSys() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsDurationSys()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setSystem(d.getDvcRqstOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationUnt() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsDurationUnt()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setUnit(d.getDvcRqstOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationVl() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsDurationVl()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((d.getDvcRqstOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsPrdEnd() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsPrdEnd()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsPeriod().setEnd(d.getDvcRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsPrdStrt() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsPrdStrt()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsPeriod().setStart(d.getDvcRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiCd() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngHiCd()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setCode(d.getDvcRqstOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiCmprtr() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngHiCmprtr()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcRqstOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiSys() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngHiSys()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setSystem(d.getDvcRqstOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiUnt() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngHiUnt()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setUnit(d.getDvcRqstOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiVl() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngHiVl()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((d.getDvcRqstOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwCd() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngLwCd()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setCode(d.getDvcRqstOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwCmprtr() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngLwCmprtr()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcRqstOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwSys() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngLwSys()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setSystem(d.getDvcRqstOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwUnt() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngLwUnt()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setUnit(d.getDvcRqstOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwVl() != null ) {

			if(d.getDvcRqstOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptBndsRngLwVl()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((d.getDvcRqstOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptCnt() != null ) {

			if(d.getDvcRqstOccrnceTmgRptCnt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptCnt()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setCount(Integer.parseInt(d.getDvcRqstOccrnceTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptCntMx() != null ) {

			if(d.getDvcRqstOccrnceTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptCntMx()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setCountMax(Integer.parseInt(d.getDvcRqstOccrnceTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptDuration() != null ) {

			if(d.getDvcRqstOccrnceTmgRptDuration().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptDuration()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setDuration((Double.parseDouble((d.getDvcRqstOccrnceTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptDurationMx() != null ) {

			if(d.getDvcRqstOccrnceTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptDurationMx()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setDurationMax((Double.parseDouble((d.getDvcRqstOccrnceTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_DurationUnt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptDurationUnt() != null ) {

			if(d.getDvcRqstOccrnceTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptDurationUnt()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(d.getDvcRqstOccrnceTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptFrqncy() != null ) {

			if(d.getDvcRqstOccrnceTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptFrqncy()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setFrequency(Integer.parseInt(d.getDvcRqstOccrnceTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptFrqncyMx() != null ) {

			if(d.getDvcRqstOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptFrqncyMx()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setFrequencyMax(Integer.parseInt(d.getDvcRqstOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptOff() != null ) {

			if(d.getDvcRqstOccrnceTmgRptOff().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptOff()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setOffset(Integer.parseInt(d.getDvcRqstOccrnceTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptPrd() != null ) {

			if(d.getDvcRqstOccrnceTmgRptPrd().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptPrd()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setPeriod((new java.math.BigDecimal((d.getDvcRqstOccrnceTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptPrdMx() != null ) {

			if(d.getDvcRqstOccrnceTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptPrdMx()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((d.getDvcRqstOccrnceTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_PrdUnt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptPrdUnt() != null ) {

			if(d.getDvcRqstOccrnceTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstOccrnceTmgRptPrdUnt()==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(d.getDvcRqstOccrnceTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : d.getDvcRqstOccrnceTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.getOccurrenceTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(d.getDvcRqstPrmtrCdTxt() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(d.getDvcRqstPrmtrVlBooleanTyp() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				String[] arrayi1 = d.getDvcRqstPrmtrVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { devicerequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntyCd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlQnty_Cmprtr ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntyCmprtr() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntySys() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntyUnt() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntyVl() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiCd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Cmprtr ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiCmprtr() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiSys() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiUnt() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiVl() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwCd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Cmprtr ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwCmprtr() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwSys() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwUnt() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwVl() != null ) {

			String[] arrayi0 = d.getDvcRqstPrmtrVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getParameter().size() < i0+1) { devicerequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getParameter().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** DvcRqst_Prfrmr ********************************************************************************/
		if(d.getDvcRqstPrfrmr() != null ) {

			if(d.getDvcRqstPrfrmr().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstPrfrmr()==null) {} else {
			devicerequest.setPerformer(new org.hl7.fhir.r4.model.Reference(d.getDvcRqstPrfrmr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getPerformerType().getCoding().size() < i0+1) { devicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getPerformerType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getPerformerType().getCoding().size() < i0+1) { devicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getPerformerType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getPerformerType().getCoding().size() < i0+1) { devicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getPerformerType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getPerformerType().getCoding().size() < i0+1) { devicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getPerformerType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getPerformerType().getCoding().size() < i0+1) { devicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getPerformerType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypTxt() != null ) {

			if(d.getDvcRqstPrfrmrTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstPrfrmrTypTxt()==null) {} else {
			devicerequest.getPerformerType().setText(d.getDvcRqstPrfrmrTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcRqst_PriorRqst ********************************************************************************/
		if(d.getDvcRqstPriorRqst() != null ) {

				for( String currListStrSplit : d.getDvcRqstPriorRqst().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addPriorRequest(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcRqst_Priority ********************************************************************************/
		if(d.getDvcRqstPriority() != null ) {

			if(d.getDvcRqstPriority().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstPriority()==null) {} else {
			devicerequest.setPriority(new org.hl7.fhir.r4.model.DeviceRequest.RequestPriorityEnumFactory().fromCode(d.getDvcRqstPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getReasonCode().size() < i0+1) { devicerequest.addReasonCode(); }
				String[] arrayi1 = d.getDvcRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { devicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getReasonCode().size() < i0+1) { devicerequest.addReasonCode(); }
				String[] arrayi1 = d.getDvcRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { devicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getReasonCode().size() < i0+1) { devicerequest.addReasonCode(); }
				String[] arrayi1 = d.getDvcRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { devicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getReasonCode().size() < i0+1) { devicerequest.addReasonCode(); }
				String[] arrayi1 = d.getDvcRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { devicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getReasonCode().size() < i0+1) { devicerequest.addReasonCode(); }
				String[] arrayi1 = d.getDvcRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { devicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicerequest.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcRqst_RsnCd_Txt ********************************************************************************/
		if(d.getDvcRqstRsnCdTxt() != null ) {

			String[] arrayi0 = d.getDvcRqstRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicerequest.getReasonCode().size() < i0+1) { devicerequest.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicerequest.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcRqst_RsnRfrnc ********************************************************************************/
		if(d.getDvcRqstRsnRfrnc() != null ) {

				for( String currListStrSplit : d.getDvcRqstRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcRqst_RelevantHis ********************************************************************************/
		if(d.getDvcRqstRelevantHis() != null ) {

				for( String currListStrSplit : d.getDvcRqstRelevantHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addRelevantHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcRqst_Rqster ********************************************************************************/
		if(d.getDvcRqstRqster() != null ) {

			if(d.getDvcRqstRqster().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstRqster()==null) {} else {
			devicerequest.setRequester(new org.hl7.fhir.r4.model.Reference(d.getDvcRqstRqster().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_Sts ********************************************************************************/
		if(d.getDvcRqstSts() != null ) {

			if(d.getDvcRqstSts().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstSts()==null) {} else {
			devicerequest.setStatus(new org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestStatusEnumFactory().fromCode(d.getDvcRqstSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_Sbjct ********************************************************************************/
		if(d.getDvcRqstSbjct() != null ) {

			if(d.getDvcRqstSbjct().replace("[","").replace("]","").equals("NULL") | d.getDvcRqstSbjct()==null) {} else {
			devicerequest.setSubject(new org.hl7.fhir.r4.model.Reference(d.getDvcRqstSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcRqst_SprtingInfo ********************************************************************************/
		if(d.getDvcRqstSprtingInfo() != null ) {

				for( String currListStrSplit : d.getDvcRqstSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicerequest.addSupportingInfo(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return devicerequest;
	}
}
