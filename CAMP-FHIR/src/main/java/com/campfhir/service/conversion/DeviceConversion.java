package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Device;
public class DeviceConversion 
{
	public org.hl7.fhir.r4.model.Device Devices(Device d) throws ParseException
	{
		org.hl7.fhir.r4.model.Device device = new org.hl7.fhir.r4.model.Device();

		/******************** id ********************************************************************************/
		device.setId(d.getId());

<<<<<<< HEAD
		/******************** Dvc_Cntct_Prd_End ********************************************************************************/
		if(d.getDvcCntctPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcCntctPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getContact().size() < i0+1) { device.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getContact().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Cntct_Prd_Strt ********************************************************************************/
		if(d.getDvcCntctPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcCntctPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getContact().size() < i0+1) { device.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getContact().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Cntct_Rnk ********************************************************************************/
		if(d.getDvcCntctRnk() != null ) {

			String[] arrayi0 = d.getDvcCntctRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getContact().size() < i0+1) { device.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getContact().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Cntct_Sys ********************************************************************************/
		if(d.getDvcCntctSys() != null ) {

			String[] arrayi0 = d.getDvcCntctSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getContact().size() < i0+1) { device.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getContact().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Cntct_Use ********************************************************************************/
		if(d.getDvcCntctUse() != null ) {

			String[] arrayi0 = d.getDvcCntctUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getContact().size() < i0+1) { device.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getContact().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Cntct_Vl ********************************************************************************/
		if(d.getDvcCntctVl() != null ) {

			String[] arrayi0 = d.getDvcCntctVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getContact().size() < i0+1) { device.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getContact().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Dfn ********************************************************************************/
		if(d.getDvcDfn() != null ) {

			if(d.getDvcDfn().replace("[","").replace("]","").equals("NULL") | d.getDvcDfn()==null) {} else {
			device.setDefinition(new org.hl7.fhir.r4.model.Reference(d.getDvcDfn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_DvcNm_Nm ********************************************************************************/
		if(d.getDvcDvcNmNm() != null ) {

			String[] arrayi0 = d.getDvcDvcNmNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getDeviceName().size() < i0+1) { device.addDeviceName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getDeviceName().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_DvcNm_Typ ********************************************************************************/
		if(d.getDvcDvcNmTyp() != null ) {

			String[] arrayi0 = d.getDvcDvcNmTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getDeviceName().size() < i0+1) { device.addDeviceName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getDeviceName().get(i0).setType(new org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_DistinctId ********************************************************************************/
		if(d.getDvcDistinctId() != null ) {

			if(d.getDvcDistinctId().replace("[","").replace("]","").equals("NULL") | d.getDvcDistinctId()==null) {} else {
			device.setDistinctIdentifier(d.getDvcDistinctId().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_ExpirationDt ********************************************************************************/
		if(d.getDvcExpirationDt() != null ) {

			if(d.getDvcExpirationDt().replace("[","").replace("]","").equals("NULL") | d.getDvcExpirationDt()==null) {} else {
			device.setExpirationDate(d.getDvcExpirationDt().replace("[","").replace("]","").equals("NULL") | d.getDvcExpirationDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcExpirationDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_Id_Assigner ********************************************************************************/
		if(d.getDvcIdAssigner() != null ) {

			String[] arrayi0 = d.getDvcIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Id_Prd_End ********************************************************************************/
		if(d.getDvcIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Id_Sys ********************************************************************************/
		if(d.getDvcIdSys() != null ) {

			String[] arrayi0 = d.getDvcIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				String[] arrayi1 = d.getDvcIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { device.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				String[] arrayi1 = d.getDvcIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { device.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				String[] arrayi1 = d.getDvcIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { device.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				String[] arrayi1 = d.getDvcIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { device.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				String[] arrayi1 = d.getDvcIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { device.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcIdTypTxt() != null ) {

			String[] arrayi0 = d.getDvcIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Id_Use ********************************************************************************/
		if(d.getDvcIdUse() != null ) {

			String[] arrayi0 = d.getDvcIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Id_Vl ********************************************************************************/
		if(d.getDvcIdVl() != null ) {

			String[] arrayi0 = d.getDvcIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getIdentifier().size() < i0+1) { device.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Lctn ********************************************************************************/
		if(d.getDvcLctn() != null ) {

			if(d.getDvcLctn().replace("[","").replace("]","").equals("NULL") | d.getDvcLctn()==null) {} else {
			device.setLocation(new org.hl7.fhir.r4.model.Reference(d.getDvcLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_LotNmbr ********************************************************************************/
		if(d.getDvcLotNmbr() != null ) {

			if(d.getDvcLotNmbr().replace("[","").replace("]","").equals("NULL") | d.getDvcLotNmbr()==null) {} else {
			device.setLotNumber(d.getDvcLotNmbr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_ManufactureDt ********************************************************************************/
		if(d.getDvcManufactureDt() != null ) {

			if(d.getDvcManufactureDt().replace("[","").replace("]","").equals("NULL") | d.getDvcManufactureDt()==null) {} else {
			device.setManufactureDate(d.getDvcManufactureDt().replace("[","").replace("]","").equals("NULL") | d.getDvcManufactureDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcManufactureDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_Manufacturer ********************************************************************************/
		if(d.getDvcManufacturer() != null ) {

			if(d.getDvcManufacturer().replace("[","").replace("]","").equals("NULL") | d.getDvcManufacturer()==null) {} else {
			device.setManufacturer(d.getDvcManufacturer().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_ModelNmbr ********************************************************************************/
		if(d.getDvcModelNmbr() != null ) {

			if(d.getDvcModelNmbr().replace("[","").replace("]","").equals("NULL") | d.getDvcModelNmbr()==null) {} else {
			device.setModelNumber(d.getDvcModelNmbr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcNtAthrRfrnc() != null ) {

			String[] arrayi0 = d.getDvcNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getNote().size() < i0+1) { device.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcNtAthrStrgTyp() != null ) {

			String[] arrayi0 = d.getDvcNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getNote().size() < i0+1) { device.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Nt_Txt ********************************************************************************/
		if(d.getDvcNtTxt() != null ) {

			String[] arrayi0 = d.getDvcNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getNote().size() < i0+1) { device.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Nt_Time ********************************************************************************/
		if(d.getDvcNtTime() != null ) {

			String[] arrayi0 = d.getDvcNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getNote().size() < i0+1) { device.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Owner ********************************************************************************/
		if(d.getDvcOwner() != null ) {

			if(d.getDvcOwner().replace("[","").replace("]","").equals("NULL") | d.getDvcOwner()==null) {} else {
			device.setOwner(new org.hl7.fhir.r4.model.Reference(d.getDvcOwner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_Parent ********************************************************************************/
		if(d.getDvcParent() != null ) {

			if(d.getDvcParent().replace("[","").replace("]","").equals("NULL") | d.getDvcParent()==null) {} else {
			device.setParent(new org.hl7.fhir.r4.model.Reference(d.getDvcParent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_PartNmbr ********************************************************************************/
		if(d.getDvcPartNmbr() != null ) {

			if(d.getDvcPartNmbr().replace("[","").replace("]","").equals("NULL") | d.getDvcPartNmbr()==null) {} else {
			device.setPartNumber(d.getDvcPartNmbr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_Pnt ********************************************************************************/
		if(d.getDvcPnt() != null ) {

			if(d.getDvcPnt().replace("[","").replace("]","").equals("NULL") | d.getDvcPnt()==null) {} else {
			device.setPatient(new org.hl7.fhir.r4.model.Reference(d.getDvcPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcPrptyTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcPrptyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getType().getCoding().size() < i1+1) { device.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcPrptyTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcPrptyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getType().getCoding().size() < i1+1) { device.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcPrptyTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcPrptyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getType().getCoding().size() < i1+1) { device.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcPrptyTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcPrptyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getType().getCoding().size() < i1+1) { device.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcPrptyTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcPrptyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getType().getCoding().size() < i1+1) { device.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_Typ_Txt ********************************************************************************/
		if(d.getDvcPrptyTypTxt() != null ) {

			String[] arrayi0 = d.getDvcPrptyTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getProperty().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueCode().size() < i1+1) { device.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcPrptyVlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(device.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { device.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {device.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Dvc_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueCode().size() < i1+1) { device.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcPrptyVlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(device.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { device.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {device.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Dvc_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueCode().size() < i1+1) { device.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcPrptyVlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(device.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { device.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {device.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Dvc_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueCode().size() < i1+1) { device.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcPrptyVlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(device.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { device.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {device.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Dvc_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueCode().size() < i1+1) { device.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcPrptyVlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(device.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { device.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {device.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Dvc_Prpty_VlCd_Txt ********************************************************************************/
		if(d.getDvcPrptyVlCdTxt() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueCode().size() < i1+1) { device.getProperty().get(i0).addValueCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getValueCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_VlQnty_Cd ********************************************************************************/
		if(d.getDvcPrptyVlQntyCd() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueQuantity().size() < i1+1) { device.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getValueQuantity().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_VlQnty_Cmprtr ********************************************************************************/
		if(d.getDvcPrptyVlQntyCmprtr() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueQuantity().size() < i1+1) { device.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getValueQuantity().get(i1).setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_Prpty_VlQnty_Sys ********************************************************************************/
		if(d.getDvcPrptyVlQntySys() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueQuantity().size() < i1+1) { device.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getValueQuantity().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_VlQnty_Unt ********************************************************************************/
		if(d.getDvcPrptyVlQntyUnt() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueQuantity().size() < i1+1) { device.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getValueQuantity().get(i1).setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Prpty_VlQnty_Vl ********************************************************************************/
		if(d.getDvcPrptyVlQntyVl() != null ) {

			String[] arrayi0 = d.getDvcPrptyVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getProperty().size() < i0+1) { device.addProperty(); }
				String[] arrayi1 = d.getDvcPrptyVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getProperty().get(i0).getValueQuantity().size() < i1+1) { device.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getProperty().get(i0).getValueQuantity().get(i1).setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Dvc_Safety_Cdg_Cd ********************************************************************************/
		if(d.getDvcSafetyCdgCd() != null ) {

			String[] arrayi0 = d.getDvcSafetyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSafety().size() < i0+1) { device.addSafety(); }
				String[] arrayi1 = d.getDvcSafetyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSafety().get(i0).getCoding().size() < i1+1) { device.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSafety().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Safety_Cdg_Dsply ********************************************************************************/
		if(d.getDvcSafetyCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcSafetyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSafety().size() < i0+1) { device.addSafety(); }
				String[] arrayi1 = d.getDvcSafetyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSafety().get(i0).getCoding().size() < i1+1) { device.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSafety().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Safety_Cdg_Sys ********************************************************************************/
		if(d.getDvcSafetyCdgSys() != null ) {

			String[] arrayi0 = d.getDvcSafetyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSafety().size() < i0+1) { device.addSafety(); }
				String[] arrayi1 = d.getDvcSafetyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSafety().get(i0).getCoding().size() < i1+1) { device.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSafety().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Safety_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcSafetyCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcSafetyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSafety().size() < i0+1) { device.addSafety(); }
				String[] arrayi1 = d.getDvcSafetyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSafety().get(i0).getCoding().size() < i1+1) { device.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSafety().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_Safety_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcSafetyCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcSafetyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSafety().size() < i0+1) { device.addSafety(); }
				String[] arrayi1 = d.getDvcSafetyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSafety().get(i0).getCoding().size() < i1+1) { device.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSafety().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Safety_Txt ********************************************************************************/
		if(d.getDvcSafetyTxt() != null ) {

			String[] arrayi0 = d.getDvcSafetyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSafety().size() < i0+1) { device.addSafety(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getSafety().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_SerialNmbr ********************************************************************************/
		if(d.getDvcSerialNmbr() != null ) {

			if(d.getDvcSerialNmbr().replace("[","").replace("]","").equals("NULL") | d.getDvcSerialNmbr()==null) {} else {
			device.setSerialNumber(d.getDvcSerialNmbr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Cd ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcSpclizationSysTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSpecialization().size() < i0+1) { device.addSpecialization(); }
				String[] arrayi1 = d.getDvcSpclizationSysTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSpecialization().get(i0).getSystemType().getCoding().size() < i1+1) { device.getSpecialization().get(i0).getSystemType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSpecialization().get(i0).getSystemType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Dsply ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcSpclizationSysTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSpecialization().size() < i0+1) { device.addSpecialization(); }
				String[] arrayi1 = d.getDvcSpclizationSysTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSpecialization().get(i0).getSystemType().getCoding().size() < i1+1) { device.getSpecialization().get(i0).getSystemType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSpecialization().get(i0).getSystemType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Sys ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcSpclizationSysTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSpecialization().size() < i0+1) { device.addSpecialization(); }
				String[] arrayi1 = d.getDvcSpclizationSysTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSpecialization().get(i0).getSystemType().getCoding().size() < i1+1) { device.getSpecialization().get(i0).getSystemType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSpecialization().get(i0).getSystemType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Spclization_SysTyp_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcSpclizationSysTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSpecialization().size() < i0+1) { device.addSpecialization(); }
				String[] arrayi1 = d.getDvcSpclizationSysTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSpecialization().get(i0).getSystemType().getCoding().size() < i1+1) { device.getSpecialization().get(i0).getSystemType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSpecialization().get(i0).getSystemType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcSpclizationSysTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSpecialization().size() < i0+1) { device.addSpecialization(); }
				String[] arrayi1 = d.getDvcSpclizationSysTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getSpecialization().get(i0).getSystemType().getCoding().size() < i1+1) { device.getSpecialization().get(i0).getSystemType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getSpecialization().get(i0).getSystemType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Spclization_SysTyp_Txt ********************************************************************************/
		if(d.getDvcSpclizationSysTypTxt() != null ) {

			String[] arrayi0 = d.getDvcSpclizationSysTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSpecialization().size() < i0+1) { device.addSpecialization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getSpecialization().get(i0).getSystemType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Spclization_Vrsn ********************************************************************************/
		if(d.getDvcSpclizationVrsn() != null ) {

			String[] arrayi0 = d.getDvcSpclizationVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getSpecialization().size() < i0+1) { device.addSpecialization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getSpecialization().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Sts ********************************************************************************/
		if(d.getDvcSts() != null ) {

			if(d.getDvcSts().replace("[","").replace("]","").equals("NULL") | d.getDvcSts()==null) {} else {
			device.setStatus(new org.hl7.fhir.r4.model.Device.FHIRDeviceStatusEnumFactory().fromCode(d.getDvcSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Dvc_StsRsn_Cdg_Cd ********************************************************************************/
		if(d.getDvcStsRsnCdgCd() != null ) {

			String[] arrayi0 = d.getDvcStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getStatusReason().size() < i0+1) { device.addStatusReason(); }
				String[] arrayi1 = d.getDvcStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getStatusReason().get(i0).getCoding().size() < i1+1) { device.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getStatusReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_StsRsn_Cdg_Dsply ********************************************************************************/
		if(d.getDvcStsRsnCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getStatusReason().size() < i0+1) { device.addStatusReason(); }
				String[] arrayi1 = d.getDvcStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getStatusReason().get(i0).getCoding().size() < i1+1) { device.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getStatusReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_StsRsn_Cdg_Sys ********************************************************************************/
		if(d.getDvcStsRsnCdgSys() != null ) {

			String[] arrayi0 = d.getDvcStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getStatusReason().size() < i0+1) { device.addStatusReason(); }
				String[] arrayi1 = d.getDvcStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getStatusReason().get(i0).getCoding().size() < i1+1) { device.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getStatusReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getStatusReason().size() < i0+1) { device.addStatusReason(); }
				String[] arrayi1 = d.getDvcStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getStatusReason().get(i0).getCoding().size() < i1+1) { device.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getStatusReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getStatusReason().size() < i0+1) { device.addStatusReason(); }
				String[] arrayi1 = d.getDvcStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getStatusReason().get(i0).getCoding().size() < i1+1) { device.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getStatusReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_StsRsn_Txt ********************************************************************************/
		if(d.getDvcStsRsnTxt() != null ) {

			String[] arrayi0 = d.getDvcStsRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getStatusReason().size() < i0+1) { device.addStatusReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getStatusReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getType().getCoding().size() < i0+1) { device.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getType().getCoding().size() < i0+1) { device.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getType().getCoding().size() < i0+1) { device.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getType().getCoding().size() < i0+1) { device.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getType().getCoding().size() < i0+1) { device.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Typ_Txt ********************************************************************************/
		if(d.getDvcTypTxt() != null ) {

			if(d.getDvcTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcTypTxt()==null) {} else {
			device.getType().setText(d.getDvcTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_UdiCarrier_CarrierAidc ********************************************************************************/
		if(d.getDvcUdiCarrierCarrierAidc() != null ) {

			String[] arrayi0 = d.getDvcUdiCarrierCarrierAidc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getUdiCarrier().size() < i0+1) { device.addUdiCarrier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getUdiCarrier().get(i0).setCarrierAIDC(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Dvc_UdiCarrier_CarrierHrf ********************************************************************************/
		if(d.getDvcUdiCarrierCarrierHrf() != null ) {

			String[] arrayi0 = d.getDvcUdiCarrierCarrierHrf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getUdiCarrier().size() < i0+1) { device.addUdiCarrier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getUdiCarrier().get(i0).setCarrierHRF(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_UdiCarrier_DvcId ********************************************************************************/
		if(d.getDvcUdiCarrierDvcId() != null ) {

			String[] arrayi0 = d.getDvcUdiCarrierDvcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getUdiCarrier().size() < i0+1) { device.addUdiCarrier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getUdiCarrier().get(i0).setDeviceIdentifier(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_UdiCarrier_EntryTyp ********************************************************************************/
		if(d.getDvcUdiCarrierEntryTyp() != null ) {

			String[] arrayi0 = d.getDvcUdiCarrierEntryTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getUdiCarrier().size() < i0+1) { device.addUdiCarrier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getUdiCarrier().get(i0).setEntryType(new org.hl7.fhir.r4.model.Device.UDIEntryTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_UdiCarrier_Issuer ********************************************************************************/
		if(d.getDvcUdiCarrierIssuer() != null ) {

			String[] arrayi0 = d.getDvcUdiCarrierIssuer().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getUdiCarrier().size() < i0+1) { device.addUdiCarrier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getUdiCarrier().get(i0).setIssuer(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_UdiCarrier_Jrsdctn ********************************************************************************/
		if(d.getDvcUdiCarrierJrsdctn() != null ) {

			String[] arrayi0 = d.getDvcUdiCarrierJrsdctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getUdiCarrier().size() < i0+1) { device.addUdiCarrier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getUdiCarrier().get(i0).setJurisdiction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Url ********************************************************************************/
		if(d.getDvcUrl() != null ) {

			if(d.getDvcUrl().replace("[","").replace("]","").equals("NULL") | d.getDvcUrl()==null) {} else {
			device.setUrl(d.getDvcUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Dvc_Vrsn_Cmpnt_Assigner ********************************************************************************/
		if(d.getDvcVrsnCmpntAssigner() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getComponent().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Prd_End ********************************************************************************/
		if(d.getDvcVrsnCmpntPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getComponent().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Prd_Strt ********************************************************************************/
		if(d.getDvcVrsnCmpntPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getComponent().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Sys ********************************************************************************/
		if(d.getDvcVrsnCmpntSys() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getComponent().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnCmpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getComponent().getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getComponent().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getComponent().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnCmpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getComponent().getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getComponent().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getComponent().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnCmpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getComponent().getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getComponent().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getComponent().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnCmpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getComponent().getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getComponent().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getComponent().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnCmpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getComponent().getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getComponent().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getComponent().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Txt ********************************************************************************/
		if(d.getDvcVrsnCmpntTypTxt() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getComponent().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Use ********************************************************************************/
		if(d.getDvcVrsnCmpntUse() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getComponent().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Dvc_Vrsn_Cmpnt_Vl ********************************************************************************/
		if(d.getDvcVrsnCmpntVl() != null ) {

			String[] arrayi0 = d.getDvcVrsnCmpntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getComponent().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Vrsn_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcVrsnTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcVrsnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcVrsnTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcVrsnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcVrsnTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcVrsnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcVrsnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcVrsnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Dvc_Vrsn_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcVrsnTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcVrsnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				String[] arrayi1 = d.getDvcVrsnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(device.getVersion().get(i0).getType().getCoding().size() < i1+1) { device.getVersion().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {device.getVersion().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Dvc_Vrsn_Typ_Txt ********************************************************************************/
		if(d.getDvcVrsnTypTxt() != null ) {

			String[] arrayi0 = d.getDvcVrsnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Dvc_Vrsn_Vl ********************************************************************************/
		if(d.getDvcVrsnVl() != null ) {

			String[] arrayi0 = d.getDvcVrsnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(device.getVersion().size() < i0+1) { device.addVersion(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {device.getVersion().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

=======

		org.hl7.fhir.r4.model.ContactPoint deviceaddcontact = device.addContact();


		org.hl7.fhir.r4.model.Period deviceaddcontactsetperiod = new org.hl7.fhir.r4.model.Period();
		deviceaddcontact.setPeriod(deviceaddcontactsetperiod);

		/******************** Device_Contact_Period_End ********************************************************************************/
		if(d.getDeviceContactPeriodEnd() != null) {
			java.text.SimpleDateFormat DeviceContactPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceContactPeriodEnddate = DeviceContactPeriodEndsdf.parse(d.getDeviceContactPeriodEnd());
			deviceaddcontactsetperiod.setEnd(DeviceContactPeriodEnddate);
		}
		/******************** Device_Contact_Period_Start ********************************************************************************/
		if(d.getDeviceContactPeriodStart() != null) {
			java.text.SimpleDateFormat DeviceContactPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceContactPeriodStartdate = DeviceContactPeriodStartsdf.parse(d.getDeviceContactPeriodStart());
			deviceaddcontactsetperiod.setStart(DeviceContactPeriodStartdate);
		}
		/******************** Device_Contact_Rank ********************************************************************************/
		if(d.getDeviceContactRank() != null) {
			deviceaddcontact.setRank(Integer.parseInt(d.getDeviceContactRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory deviceaddcontactsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Device_Contact_System_Code ********************************************************************************/
		if(d.getDeviceContactSystemCode() != null) {
			deviceaddcontact.setSystem(deviceaddcontactsetsystemEnumFactory.fromCode(d.getDeviceContactSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory deviceaddcontactsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Device_Contact_Use_Code ********************************************************************************/
		if(d.getDeviceContactUseCode() != null) {
			deviceaddcontact.setUse(deviceaddcontactsetuseEnumFactory.fromCode(d.getDeviceContactUseCode()));

		}
		/******************** Device_Contact_Value ********************************************************************************/
		if(d.getDeviceContactValue() != null) {
			deviceaddcontact.setValue(d.getDeviceContactValue());
		}
		/******************** Device_Definition ********************************************************************************/
		if(d.getDeviceDefinition() != null) {
			org.hl7.fhir.r4.model.Reference DeviceDefinitionref = new org.hl7.fhir.r4.model.Reference();
			device.setDefinition(DeviceDefinitionref.setReference(d.getDeviceDefinition()));
		}

		org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent deviceadddevicename = device.addDeviceName();

		/******************** Device_DeviceName_Name ********************************************************************************/
		if(d.getDeviceDeviceNameName() != null) {
			deviceadddevicename.setName(d.getDeviceDeviceNameName());
		}

		org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory deviceadddevicenamesettypeEnumFactory = new org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory();

		/******************** Device_DeviceName_Type_Code ********************************************************************************/
		if(d.getDeviceDeviceNameTypeCode() != null) {
			deviceadddevicename.setType(deviceadddevicenamesettypeEnumFactory.fromCode(d.getDeviceDeviceNameTypeCode()));

		}
		/******************** Device_DistinctId ********************************************************************************/
		if(d.getDeviceDistinctId() != null) {
			device.setDistinctIdentifier(d.getDeviceDistinctId());
		}
		/******************** Device_ExpirationDate ********************************************************************************/
		if(d.getDeviceExpirationDate() != null) {
			java.text.SimpleDateFormat DeviceExpirationDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceExpirationDatedate = DeviceExpirationDatesdf.parse(d.getDeviceExpirationDate());
			device.setExpirationDate(DeviceExpirationDatedate);
		}

		org.hl7.fhir.r4.model.Identifier deviceaddidentifier = device.addIdentifier();

		/******************** Device_Id_Assigner ********************************************************************************/
		if(d.getDeviceIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DeviceIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			deviceaddidentifier.setAssigner(DeviceIdAssignerref.setReference(d.getDeviceIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period deviceaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		deviceaddidentifier.setPeriod(deviceaddidentifiersetperiod);

		/******************** Device_Id_Period_End ********************************************************************************/
		if(d.getDeviceIdPeriodEnd() != null) {
			java.text.SimpleDateFormat DeviceIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceIdPeriodEnddate = DeviceIdPeriodEndsdf.parse(d.getDeviceIdPeriodEnd());
			deviceaddidentifiersetperiod.setEnd(DeviceIdPeriodEnddate);
		}
		/******************** Device_Id_Period_Start ********************************************************************************/
		if(d.getDeviceIdPeriodStart() != null) {
			java.text.SimpleDateFormat DeviceIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceIdPeriodStartdate = DeviceIdPeriodStartsdf.parse(d.getDeviceIdPeriodStart());
			deviceaddidentifiersetperiod.setStart(DeviceIdPeriodStartdate);
		}
		/******************** Device_Id_System ********************************************************************************/
		if(d.getDeviceIdSystem() != null) {
			deviceaddidentifier.setSystem(d.getDeviceIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddidentifier.setType(deviceaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding deviceaddidentifiersettypeaddcoding = deviceaddidentifiersettype.addCoding();

		/******************** Device_Id_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceIdTypeCodingCode() != null) {
			deviceaddidentifiersettypeaddcoding.setCode(d.getDeviceIdTypeCodingCode());
		}
		/******************** Device_Id_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceIdTypeCodingDisplay() != null) {
			deviceaddidentifiersettypeaddcoding.setDisplay(d.getDeviceIdTypeCodingDisplay());
		}
		/******************** Device_Id_Type_Coding_System ********************************************************************************/
		if(d.getDeviceIdTypeCodingSystem() != null) {
			deviceaddidentifiersettypeaddcoding.setSystem(d.getDeviceIdTypeCodingSystem());
		}
		/******************** Device_Id_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDeviceIdTypeCodingUsrslt() != null) {
			deviceaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceIdTypeCodingUsrslt()));
		}
		/******************** Device_Id_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceIdTypeCodingVersion() != null) {
			deviceaddidentifiersettypeaddcoding.setVersion(d.getDeviceIdTypeCodingVersion());
		}
		/******************** Device_Id_Type_Text ********************************************************************************/
		if(d.getDeviceIdTypeText() != null) {
			deviceaddidentifiersettype.setText(d.getDeviceIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory deviceaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Device_Id_Use_Code ********************************************************************************/
		if(d.getDeviceIdUseCode() != null) {
			deviceaddidentifier.setUse(deviceaddidentifiersetuseEnumFactory.fromCode(d.getDeviceIdUseCode()));

		}
		/******************** Device_Id_Value ********************************************************************************/
		if(d.getDeviceIdValue() != null) {
			deviceaddidentifier.setValue(d.getDeviceIdValue());
		}
		/******************** Device_Location ********************************************************************************/
		if(d.getDeviceLocation() != null) {
			org.hl7.fhir.r4.model.Reference DeviceLocationref = new org.hl7.fhir.r4.model.Reference();
			device.setLocation(DeviceLocationref.setReference(d.getDeviceLocation()));
		}
		/******************** Device_LotNumber ********************************************************************************/
		if(d.getDeviceLotNumber() != null) {
			device.setLotNumber(d.getDeviceLotNumber());
		}
		/******************** Device_ManufactureDate ********************************************************************************/
		if(d.getDeviceManufactureDate() != null) {
			java.text.SimpleDateFormat DeviceManufactureDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceManufactureDatedate = DeviceManufactureDatesdf.parse(d.getDeviceManufactureDate());
			device.setManufactureDate(DeviceManufactureDatedate);
		}
		/******************** Device_Manufacturer ********************************************************************************/
		if(d.getDeviceManufacturer() != null) {
			device.setManufacturer(d.getDeviceManufacturer());
		}
		/******************** Device_ModelNumber ********************************************************************************/
		if(d.getDeviceModelNumber() != null) {
			device.setModelNumber(d.getDeviceModelNumber());
		}

		org.hl7.fhir.r4.model.Annotation deviceaddnote = device.addNote();

		/******************** Device_Note_AuthorReference ********************************************************************************/
		if(d.getDeviceNoteAuthorReference() != null) {
			org.hl7.fhir.r4.model.Reference DeviceNoteAuthorReferenceref = new org.hl7.fhir.r4.model.Reference();
			deviceaddnote.setAuthor(DeviceNoteAuthorReferenceref.setReference(d.getDeviceNoteAuthorReference()));
		}
		/******************** Device_Note_AuthorString ********************************************************************************/
		if(d.getDeviceNoteAuthorString() != null) {
			deviceaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(d.getDeviceNoteAuthorString()));
		}
		/******************** Device_Note_Text ********************************************************************************/
		if(d.getDeviceNoteText() != null) {
			deviceaddnote.setText(d.getDeviceNoteText());
		}
		/******************** Device_Note_Time ********************************************************************************/
		if(d.getDeviceNoteTime() != null) {
			java.text.SimpleDateFormat DeviceNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceNoteTimedate = DeviceNoteTimesdf.parse(d.getDeviceNoteTime());
			deviceaddnote.setTime(DeviceNoteTimedate);
		}
		/******************** Device_Owner ********************************************************************************/
		if(d.getDeviceOwner() != null) {
			org.hl7.fhir.r4.model.Reference DeviceOwnerref = new org.hl7.fhir.r4.model.Reference();
			device.setOwner(DeviceOwnerref.setReference(d.getDeviceOwner()));
		}
		/******************** Device_Parent ********************************************************************************/
		if(d.getDeviceParent() != null) {
			org.hl7.fhir.r4.model.Reference DeviceParentref = new org.hl7.fhir.r4.model.Reference();
			device.setParent(DeviceParentref.setReference(d.getDeviceParent()));
		}
		/******************** Device_PartNumber ********************************************************************************/
		if(d.getDevicePartNumber() != null) {
			device.setPartNumber(d.getDevicePartNumber());
		}
		/******************** Device_Patient ********************************************************************************/
		if(d.getDevicePatient() != null) {
			org.hl7.fhir.r4.model.Reference DevicePatientref = new org.hl7.fhir.r4.model.Reference();
			device.setPatient(DevicePatientref.setReference(d.getDevicePatient()));
		}

		org.hl7.fhir.r4.model.Device.DevicePropertyComponent deviceaddproperty = device.addProperty();


		org.hl7.fhir.r4.model.CodeableConcept deviceaddpropertysettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddproperty.setType(deviceaddpropertysettype);


		org.hl7.fhir.r4.model.Coding deviceaddpropertysettypeaddcoding = deviceaddpropertysettype.addCoding();

		/******************** Device_Property_Type_Coding_Code ********************************************************************************/
		if(d.getDevicePropertyTypeCodingCode() != null) {
			deviceaddpropertysettypeaddcoding.setCode(d.getDevicePropertyTypeCodingCode());
		}
		/******************** Device_Property_Type_Coding_Display ********************************************************************************/
		if(d.getDevicePropertyTypeCodingDisplay() != null) {
			deviceaddpropertysettypeaddcoding.setDisplay(d.getDevicePropertyTypeCodingDisplay());
		}
		/******************** Device_Property_Type_Coding_System ********************************************************************************/
		if(d.getDevicePropertyTypeCodingSystem() != null) {
			deviceaddpropertysettypeaddcoding.setSystem(d.getDevicePropertyTypeCodingSystem());
		}
		/******************** Device_Property_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDevicePropertyTypeCodingUsrslt() != null) {
			deviceaddpropertysettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDevicePropertyTypeCodingUsrslt()));
		}
		/******************** Device_Property_Type_Coding_Version ********************************************************************************/
		if(d.getDevicePropertyTypeCodingVersion() != null) {
			deviceaddpropertysettypeaddcoding.setVersion(d.getDevicePropertyTypeCodingVersion());
		}
		/******************** Device_Property_Type_Text ********************************************************************************/
		if(d.getDevicePropertyTypeText() != null) {
			deviceaddpropertysettype.setText(d.getDevicePropertyTypeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddpropertyaddvaluecode = deviceaddproperty.addValueCode();


		org.hl7.fhir.r4.model.Coding deviceaddpropertyaddvaluecodeaddcoding = deviceaddpropertyaddvaluecode.addCoding();

		/******************** Device_Property_ValueCode_Coding_Code ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingCode() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setCode(d.getDevicePropertyValueCodeCodingCode());
		}
		/******************** Device_Property_ValueCode_Coding_Display ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingDisplay() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setDisplay(d.getDevicePropertyValueCodeCodingDisplay());
		}
		/******************** Device_Property_ValueCode_Coding_System ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingSystem() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setSystem(d.getDevicePropertyValueCodeCodingSystem());
		}
		/******************** Device_Property_ValueCode_Coding_Usrslt ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingUsrslt() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDevicePropertyValueCodeCodingUsrslt()));
		}
		/******************** Device_Property_ValueCode_Coding_Version ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingVersion() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setVersion(d.getDevicePropertyValueCodeCodingVersion());
		}
		/******************** Device_Property_ValueCode_Text ********************************************************************************/
		if(d.getDevicePropertyValueCodeText() != null) {
			deviceaddpropertyaddvaluecode.setText(d.getDevicePropertyValueCodeText());
		}

		org.hl7.fhir.r4.model.Quantity deviceaddpropertyaddvaluequantity = deviceaddproperty.addValueQuantity();

		/******************** Device_Property_ValueQuantity_Code ********************************************************************************/
		if(d.getDevicePropertyValueQuantityCode() != null) {
			deviceaddpropertyaddvaluequantity.setCode(d.getDevicePropertyValueQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory deviceaddpropertyaddvaluequantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Device_Property_ValueQuantity_Compartr_Code ********************************************************************************/
		if(d.getDevicePropertyValueQuantityCompartrCode() != null) {
			deviceaddpropertyaddvaluequantity.setComparator(deviceaddpropertyaddvaluequantitysetcomparatorEnumFactory.fromCode(d.getDevicePropertyValueQuantityCompartrCode()));

		}
		/******************** Device_Property_ValueQuantity_System ********************************************************************************/
		if(d.getDevicePropertyValueQuantitySystem() != null) {
			deviceaddpropertyaddvaluequantity.setSystem(d.getDevicePropertyValueQuantitySystem());
		}
		/******************** Device_Property_ValueQuantity_Unit ********************************************************************************/
		if(d.getDevicePropertyValueQuantityUnit() != null) {
			deviceaddpropertyaddvaluequantity.setUnit(d.getDevicePropertyValueQuantityUnit());
		}
		/******************** Device_Property_ValueQuantity_Value ********************************************************************************/
		if(d.getDevicePropertyValueQuantityValue() != null) {
			deviceaddpropertyaddvaluequantity.setValue(Double.parseDouble((d.getDevicePropertyValueQuantityValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddsafety = device.addSafety();


		org.hl7.fhir.r4.model.Coding deviceaddsafetyaddcoding = deviceaddsafety.addCoding();

		/******************** Device_Safety_Coding_Code ********************************************************************************/
		if(d.getDeviceSafetyCodingCode() != null) {
			deviceaddsafetyaddcoding.setCode(d.getDeviceSafetyCodingCode());
		}
		/******************** Device_Safety_Coding_Display ********************************************************************************/
		if(d.getDeviceSafetyCodingDisplay() != null) {
			deviceaddsafetyaddcoding.setDisplay(d.getDeviceSafetyCodingDisplay());
		}
		/******************** Device_Safety_Coding_System ********************************************************************************/
		if(d.getDeviceSafetyCodingSystem() != null) {
			deviceaddsafetyaddcoding.setSystem(d.getDeviceSafetyCodingSystem());
		}
		/******************** Device_Safety_Coding_Usrslt ********************************************************************************/
		if(d.getDeviceSafetyCodingUsrslt() != null) {
			deviceaddsafetyaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceSafetyCodingUsrslt()));
		}
		/******************** Device_Safety_Coding_Version ********************************************************************************/
		if(d.getDeviceSafetyCodingVersion() != null) {
			deviceaddsafetyaddcoding.setVersion(d.getDeviceSafetyCodingVersion());
		}
		/******************** Device_Safety_Text ********************************************************************************/
		if(d.getDeviceSafetyText() != null) {
			deviceaddsafety.setText(d.getDeviceSafetyText());
		}
		/******************** Device_SerialNumber ********************************************************************************/
		if(d.getDeviceSerialNumber() != null) {
			device.setSerialNumber(d.getDeviceSerialNumber());
		}

		org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent deviceaddspecialization = device.addSpecialization();


		org.hl7.fhir.r4.model.CodeableConcept deviceaddspecializationsetsystemtype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddspecialization.setSystemType(deviceaddspecializationsetsystemtype);


		org.hl7.fhir.r4.model.Coding deviceaddspecializationsetsystemtypeaddcoding = deviceaddspecializationsetsystemtype.addCoding();

		/******************** Device_Specialization_SystemType_Coding_Code ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingCode() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setCode(d.getDeviceSpecializationSystemTypeCodingCode());
		}
		/******************** Device_Specialization_SystemType_Coding_Display ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingDisplay() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setDisplay(d.getDeviceSpecializationSystemTypeCodingDisplay());
		}
		/******************** Device_Specialization_SystemType_Coding_System ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingSystem() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setSystem(d.getDeviceSpecializationSystemTypeCodingSystem());
		}
		/******************** Device_Specialization_SystemType_Coding_Usrslt ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingUsrslt() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceSpecializationSystemTypeCodingUsrslt()));
		}
		/******************** Device_Specialization_SystemType_Coding_Version ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingVersion() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setVersion(d.getDeviceSpecializationSystemTypeCodingVersion());
		}
		/******************** Device_Specialization_SystemType_Text ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeText() != null) {
			deviceaddspecializationsetsystemtype.setText(d.getDeviceSpecializationSystemTypeText());
		}
		/******************** Device_Specialization_Version ********************************************************************************/
		if(d.getDeviceSpecializationVersion() != null) {
			deviceaddspecialization.setVersion(d.getDeviceSpecializationVersion());
		}

		org.hl7.fhir.r4.model.Device.FHIRDeviceStatusEnumFactory devicesetstatusEnumFactory = new org.hl7.fhir.r4.model.Device.FHIRDeviceStatusEnumFactory();

		/******************** Device_Status_Code ********************************************************************************/
		if(d.getDeviceStatusCode() != null) {
			device.setStatus(devicesetstatusEnumFactory.fromCode(d.getDeviceStatusCode()));

		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddstatusreason = device.addStatusReason();


		org.hl7.fhir.r4.model.Coding deviceaddstatusreasonaddcoding = deviceaddstatusreason.addCoding();

		/******************** Device_StatusReason_Coding_Code ********************************************************************************/
		if(d.getDeviceStatusReasonCodingCode() != null) {
			deviceaddstatusreasonaddcoding.setCode(d.getDeviceStatusReasonCodingCode());
		}
		/******************** Device_StatusReason_Coding_Display ********************************************************************************/
		if(d.getDeviceStatusReasonCodingDisplay() != null) {
			deviceaddstatusreasonaddcoding.setDisplay(d.getDeviceStatusReasonCodingDisplay());
		}
		/******************** Device_StatusReason_Coding_System ********************************************************************************/
		if(d.getDeviceStatusReasonCodingSystem() != null) {
			deviceaddstatusreasonaddcoding.setSystem(d.getDeviceStatusReasonCodingSystem());
		}
		/******************** Device_StatusReason_Coding_Usrslt ********************************************************************************/
		if(d.getDeviceStatusReasonCodingUsrslt() != null) {
			deviceaddstatusreasonaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceStatusReasonCodingUsrslt()));
		}
		/******************** Device_StatusReason_Coding_Version ********************************************************************************/
		if(d.getDeviceStatusReasonCodingVersion() != null) {
			deviceaddstatusreasonaddcoding.setVersion(d.getDeviceStatusReasonCodingVersion());
		}
		/******************** Device_StatusReason_Text ********************************************************************************/
		if(d.getDeviceStatusReasonText() != null) {
			deviceaddstatusreason.setText(d.getDeviceStatusReasonText());
		}

		org.hl7.fhir.r4.model.CodeableConcept devicesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		device.setType(devicesettype);


		org.hl7.fhir.r4.model.Coding devicesettypeaddcoding = devicesettype.addCoding();

		/******************** Device_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceTypeCodingCode() != null) {
			devicesettypeaddcoding.setCode(d.getDeviceTypeCodingCode());
		}
		/******************** Device_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceTypeCodingDisplay() != null) {
			devicesettypeaddcoding.setDisplay(d.getDeviceTypeCodingDisplay());
		}
		/******************** Device_Type_Coding_System ********************************************************************************/
		if(d.getDeviceTypeCodingSystem() != null) {
			devicesettypeaddcoding.setSystem(d.getDeviceTypeCodingSystem());
		}
		/******************** Device_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDeviceTypeCodingUsrslt() != null) {
			devicesettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceTypeCodingUsrslt()));
		}
		/******************** Device_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceTypeCodingVersion() != null) {
			devicesettypeaddcoding.setVersion(d.getDeviceTypeCodingVersion());
		}
		/******************** Device_Type_Text ********************************************************************************/
		if(d.getDeviceTypeText() != null) {
			devicesettype.setText(d.getDeviceTypeText());
		}

		org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent deviceaddudicarrier = device.addUdiCarrier();

		/******************** Device_UdiCarrier_CarrierAIDC ********************************************************************************/
		if(d.getDeviceUdiCarrierCarrierAidc() != null) {
			deviceaddudicarrier.setCarrierAIDCElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDeviceUdiCarrierCarrierAidc()));
		}
		/******************** Device_UdiCarrier_CarrierHRF ********************************************************************************/
		if(d.getDeviceUdiCarrierCarrierHrf() != null) {
			deviceaddudicarrier.setCarrierHRF(d.getDeviceUdiCarrierCarrierHrf());
		}
		/******************** Device_UdiCarrier_DeviceId ********************************************************************************/
		if(d.getDeviceUdiCarrierDeviceId() != null) {
			deviceaddudicarrier.setDeviceIdentifier(d.getDeviceUdiCarrierDeviceId());
		}

		org.hl7.fhir.r4.model.Device.UDIEntryTypeEnumFactory deviceaddudicarriersetentrytypeEnumFactory = new org.hl7.fhir.r4.model.Device.UDIEntryTypeEnumFactory();

		/******************** Device_UdiCarrier_EntryType_Code ********************************************************************************/
		if(d.getDeviceUdiCarrierEntryTypeCode() != null) {
			deviceaddudicarrier.setEntryType(deviceaddudicarriersetentrytypeEnumFactory.fromCode(d.getDeviceUdiCarrierEntryTypeCode()));

		}
		/******************** Device_UdiCarrier_Issuer ********************************************************************************/
		if(d.getDeviceUdiCarrierIssuer() != null) {
			deviceaddudicarrier.setIssuer(d.getDeviceUdiCarrierIssuer());
		}
		/******************** Device_UdiCarrier_Jurisdiction ********************************************************************************/
		if(d.getDeviceUdiCarrierJurisdiction() != null) {
			deviceaddudicarrier.setJurisdiction(d.getDeviceUdiCarrierJurisdiction());
		}
		/******************** Device_Url ********************************************************************************/
		if(d.getDeviceUrl() != null) {
			device.setUrl(d.getDeviceUrl());
		}

		org.hl7.fhir.r4.model.Device.DeviceVersionComponent deviceaddversion = device.addVersion();


		org.hl7.fhir.r4.model.Identifier deviceaddversionsetcomponent = new org.hl7.fhir.r4.model.Identifier();
		deviceaddversion.setComponent(deviceaddversionsetcomponent);

		/******************** Device_Version_Component_Assigner ********************************************************************************/
		if(d.getDeviceVersionComponentAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DeviceVersionComponentAssignerref = new org.hl7.fhir.r4.model.Reference();
			deviceaddversionsetcomponent.setAssigner(DeviceVersionComponentAssignerref.setReference(d.getDeviceVersionComponentAssigner()));
		}

		org.hl7.fhir.r4.model.Period deviceaddversionsetcomponentsetperiod = new org.hl7.fhir.r4.model.Period();
		deviceaddversionsetcomponent.setPeriod(deviceaddversionsetcomponentsetperiod);

		/******************** Device_Version_Component_Period_End ********************************************************************************/
		if(d.getDeviceVersionComponentPeriodEnd() != null) {
			java.text.SimpleDateFormat DeviceVersionComponentPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceVersionComponentPeriodEnddate = DeviceVersionComponentPeriodEndsdf.parse(d.getDeviceVersionComponentPeriodEnd());
			deviceaddversionsetcomponentsetperiod.setEnd(DeviceVersionComponentPeriodEnddate);
		}
		/******************** Device_Version_Component_Period_Start ********************************************************************************/
		if(d.getDeviceVersionComponentPeriodStart() != null) {
			java.text.SimpleDateFormat DeviceVersionComponentPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceVersionComponentPeriodStartdate = DeviceVersionComponentPeriodStartsdf.parse(d.getDeviceVersionComponentPeriodStart());
			deviceaddversionsetcomponentsetperiod.setStart(DeviceVersionComponentPeriodStartdate);
		}
		/******************** Device_Version_Component_System ********************************************************************************/
		if(d.getDeviceVersionComponentSystem() != null) {
			deviceaddversionsetcomponent.setSystem(d.getDeviceVersionComponentSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddversionsetcomponentsettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddversionsetcomponent.setType(deviceaddversionsetcomponentsettype);


		org.hl7.fhir.r4.model.Coding deviceaddversionsetcomponentsettypeaddcoding = deviceaddversionsetcomponentsettype.addCoding();

		/******************** Device_Version_Component_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingCode() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setCode(d.getDeviceVersionComponentTypeCodingCode());
		}
		/******************** Device_Version_Component_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingDisplay() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setDisplay(d.getDeviceVersionComponentTypeCodingDisplay());
		}
		/******************** Device_Version_Component_Type_Coding_System ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingSystem() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setSystem(d.getDeviceVersionComponentTypeCodingSystem());
		}
		/******************** Device_Version_Component_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingUsrslt() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceVersionComponentTypeCodingUsrslt()));
		}
		/******************** Device_Version_Component_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingVersion() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setVersion(d.getDeviceVersionComponentTypeCodingVersion());
		}
		/******************** Device_Version_Component_Type_Text ********************************************************************************/
		if(d.getDeviceVersionComponentTypeText() != null) {
			deviceaddversionsetcomponentsettype.setText(d.getDeviceVersionComponentTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory deviceaddversionsetcomponentsetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Device_Version_Component_Use_Code ********************************************************************************/
		if(d.getDeviceVersionComponentUseCode() != null) {
			deviceaddversionsetcomponent.setUse(deviceaddversionsetcomponentsetuseEnumFactory.fromCode(d.getDeviceVersionComponentUseCode()));

		}
		/******************** Device_Version_Component_Value ********************************************************************************/
		if(d.getDeviceVersionComponentValue() != null) {
			deviceaddversionsetcomponent.setValue(d.getDeviceVersionComponentValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddversionsettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddversion.setType(deviceaddversionsettype);


		org.hl7.fhir.r4.model.Coding deviceaddversionsettypeaddcoding = deviceaddversionsettype.addCoding();

		/******************** Device_Version_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceVersionTypeCodingCode() != null) {
			deviceaddversionsettypeaddcoding.setCode(d.getDeviceVersionTypeCodingCode());
		}
		/******************** Device_Version_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceVersionTypeCodingDisplay() != null) {
			deviceaddversionsettypeaddcoding.setDisplay(d.getDeviceVersionTypeCodingDisplay());
		}
		/******************** Device_Version_Type_Coding_System ********************************************************************************/
		if(d.getDeviceVersionTypeCodingSystem() != null) {
			deviceaddversionsettypeaddcoding.setSystem(d.getDeviceVersionTypeCodingSystem());
		}
		/******************** Device_Version_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDeviceVersionTypeCodingUsrslt() != null) {
			deviceaddversionsettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceVersionTypeCodingUsrslt()));
		}
		/******************** Device_Version_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceVersionTypeCodingVersion() != null) {
			deviceaddversionsettypeaddcoding.setVersion(d.getDeviceVersionTypeCodingVersion());
		}
		/******************** Device_Version_Type_Text ********************************************************************************/
		if(d.getDeviceVersionTypeText() != null) {
			deviceaddversionsettype.setText(d.getDeviceVersionTypeText());
		}
		/******************** Device_Version_Value ********************************************************************************/
		if(d.getDeviceVersionValue() != null) {
			deviceaddversion.setValue(d.getDeviceVersionValue());
>>>>>>> master
		}
		return device;
	}
}
