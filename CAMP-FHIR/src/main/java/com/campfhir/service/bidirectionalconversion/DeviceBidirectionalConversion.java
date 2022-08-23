package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Device;
public class DeviceBidirectionalConversion 
{
	public Device Devices(org.hl7.fhir.r4.model.Device device) throws ParseException
	{
		 main.java.com.campfhir.model.Device d = new  main.java.com.campfhir.model.Device();

		/******************** id ********************************************************************************/
		d.setId(device.getIdElement().getIdPart());

		/******************** deviceproperty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Device.DevicePropertyComponent> devicepropertylist = device.getProperty();
		for(int devicepropertyi = 0; devicepropertyi<devicepropertylist.size();devicepropertyi++ ) {
		org.hl7.fhir.r4.model.Device.DevicePropertyComponent  deviceproperty = devicepropertylist.get(devicepropertyi);

		/******************** devicepropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicepropertytype = deviceproperty.getType();

		/******************** Dvc_Prpty_Typ_Txt ********************************************************************************/
		if(devicepropertyi == 0) {d.addDvcPrptyTypTxt("[");}
		if(devicepropertytype.hasText()) {

			d.addDvcPrptyTypTxt(String.valueOf(devicepropertytype.getText()));
		} else {
			d.addDvcPrptyTypTxt("NULL");
		}

		if(devicepropertyi == devicepropertylist.size()-1) {d.addDvcPrptyTypTxt("]");}


		/******************** devicepropertytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicepropertytypecodinglist = devicepropertytype.getCoding();
		for(int devicepropertytypecodingi = 0; devicepropertytypecodingi<devicepropertytypecodinglist.size();devicepropertytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicepropertytypecoding = devicepropertytypecodinglist.get(devicepropertytypecodingi);

		/******************** Dvc_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(devicepropertytypecodingi == 0) {d.addDvcPrptyTypCdgDsply("[[");}
		if(devicepropertytypecoding.hasDisplay()) {

			d.addDvcPrptyTypCdgDsply(String.valueOf(devicepropertytypecoding.getDisplay()));
		} else {
			d.addDvcPrptyTypCdgDsply("NULL");
		}

		if(devicepropertytypecodingi == devicepropertytypecodinglist.size()-1) {d.addDvcPrptyTypCdgDsply("]]");}


		/******************** Dvc_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicepropertytypecodingi == 0) {d.addDvcPrptyTypCdgVrsn("[[");}
		if(devicepropertytypecoding.hasVersion()) {

			d.addDvcPrptyTypCdgVrsn(String.valueOf(devicepropertytypecoding.getVersion()));
		} else {
			d.addDvcPrptyTypCdgVrsn("NULL");
		}

		if(devicepropertytypecodingi == devicepropertytypecodinglist.size()-1) {d.addDvcPrptyTypCdgVrsn("]]");}


		/******************** Dvc_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(devicepropertytypecodingi == 0) {d.addDvcPrptyTypCdgCd("[[");}
		if(devicepropertytypecoding.hasCode()) {

			d.addDvcPrptyTypCdgCd(String.valueOf(devicepropertytypecoding.getCode()));
		} else {
			d.addDvcPrptyTypCdgCd("NULL");
		}

		if(devicepropertytypecodingi == devicepropertytypecodinglist.size()-1) {d.addDvcPrptyTypCdgCd("]]");}


		/******************** Dvc_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicepropertytypecodingi == 0) {d.addDvcPrptyTypCdgUsrSltd("[[");}
		if(devicepropertytypecoding.hasUserSelected()) {

			d.addDvcPrptyTypCdgUsrSltd(String.valueOf(devicepropertytypecoding.getUserSelected()));
		} else {
			d.addDvcPrptyTypCdgUsrSltd("NULL");
		}

		if(devicepropertytypecodingi == devicepropertytypecodinglist.size()-1) {d.addDvcPrptyTypCdgUsrSltd("]]");}


		/******************** Dvc_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(devicepropertytypecodingi == 0) {d.addDvcPrptyTypCdgSys("[[");}
		if(devicepropertytypecoding.hasSystem()) {

			d.addDvcPrptyTypCdgSys(String.valueOf(devicepropertytypecoding.getSystem()));
		} else {
			d.addDvcPrptyTypCdgSys("NULL");
		}

		if(devicepropertytypecodingi == devicepropertytypecodinglist.size()-1) {d.addDvcPrptyTypCdgSys("]]");}


		 };
		/******************** devicepropertyvaluecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicepropertyvaluecodelist = deviceproperty.getValueCode();
		for(int devicepropertyvaluecodei = 0; devicepropertyvaluecodei<devicepropertyvaluecodelist.size();devicepropertyvaluecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicepropertyvaluecode = devicepropertyvaluecodelist.get(devicepropertyvaluecodei);

		/******************** Dvc_Prpty_VlCd_Txt ********************************************************************************/
		if(devicepropertyvaluecodei == 0) {d.addDvcPrptyVlCdTxt("[[");}
		if(devicepropertyvaluecode.hasText()) {

			d.addDvcPrptyVlCdTxt(String.valueOf(devicepropertyvaluecode.getText()));
		} else {
			d.addDvcPrptyVlCdTxt("NULL");
		}

		if(devicepropertyvaluecodei == devicepropertyvaluecodelist.size()-1) {d.addDvcPrptyVlCdTxt("]]");}


		/******************** devicepropertyvaluecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicepropertyvaluecodecodinglist = devicepropertyvaluecode.getCoding();
		for(int devicepropertyvaluecodecodingi = 0; devicepropertyvaluecodecodingi<devicepropertyvaluecodecodinglist.size();devicepropertyvaluecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicepropertyvaluecodecoding = devicepropertyvaluecodecodinglist.get(devicepropertyvaluecodecodingi);

		/******************** Dvc_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(devicepropertyvaluecodecodingi == 0) {d.addDvcPrptyVlCdCdgDsply("[[[");}
		if(devicepropertyvaluecodecoding.hasDisplay()) {

			d.addDvcPrptyVlCdCdgDsply(String.valueOf(devicepropertyvaluecodecoding.getDisplay()));
		} else {
			d.addDvcPrptyVlCdCdgDsply("NULL");
		}

		if(devicepropertyvaluecodecodingi == devicepropertyvaluecodecodinglist.size()-1) {d.addDvcPrptyVlCdCdgDsply("]]]");}


		/******************** Dvc_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(devicepropertyvaluecodecodingi == 0) {d.addDvcPrptyVlCdCdgVrsn("[[[");}
		if(devicepropertyvaluecodecoding.hasVersion()) {

			d.addDvcPrptyVlCdCdgVrsn(String.valueOf(devicepropertyvaluecodecoding.getVersion()));
		} else {
			d.addDvcPrptyVlCdCdgVrsn("NULL");
		}

		if(devicepropertyvaluecodecodingi == devicepropertyvaluecodecodinglist.size()-1) {d.addDvcPrptyVlCdCdgVrsn("]]]");}


		/******************** Dvc_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(devicepropertyvaluecodecodingi == 0) {d.addDvcPrptyVlCdCdgCd("[[[");}
		if(devicepropertyvaluecodecoding.hasCode()) {

			d.addDvcPrptyVlCdCdgCd(String.valueOf(devicepropertyvaluecodecoding.getCode()));
		} else {
			d.addDvcPrptyVlCdCdgCd("NULL");
		}

		if(devicepropertyvaluecodecodingi == devicepropertyvaluecodecodinglist.size()-1) {d.addDvcPrptyVlCdCdgCd("]]]");}


		/******************** Dvc_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(devicepropertyvaluecodecodingi == 0) {d.addDvcPrptyVlCdCdgUsrSltd("[[[");}
		if(devicepropertyvaluecodecoding.hasUserSelected()) {

			d.addDvcPrptyVlCdCdgUsrSltd(String.valueOf(devicepropertyvaluecodecoding.getUserSelected()));
		} else {
			d.addDvcPrptyVlCdCdgUsrSltd("NULL");
		}

		if(devicepropertyvaluecodecodingi == devicepropertyvaluecodecodinglist.size()-1) {d.addDvcPrptyVlCdCdgUsrSltd("]]]");}


		/******************** Dvc_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(devicepropertyvaluecodecodingi == 0) {d.addDvcPrptyVlCdCdgSys("[[[");}
		if(devicepropertyvaluecodecoding.hasSystem()) {

			d.addDvcPrptyVlCdCdgSys(String.valueOf(devicepropertyvaluecodecoding.getSystem()));
		} else {
			d.addDvcPrptyVlCdCdgSys("NULL");
		}

		if(devicepropertyvaluecodecodingi == devicepropertyvaluecodecodinglist.size()-1) {d.addDvcPrptyVlCdCdgSys("]]]");}


		 };
		 };
		/******************** devicepropertyvaluequantity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Quantity> devicepropertyvaluequantitylist = deviceproperty.getValueQuantity();
		for(int devicepropertyvaluequantityi = 0; devicepropertyvaluequantityi<devicepropertyvaluequantitylist.size();devicepropertyvaluequantityi++ ) {
		org.hl7.fhir.r4.model.Quantity  devicepropertyvaluequantity = devicepropertyvaluequantitylist.get(devicepropertyvaluequantityi);

		/******************** Dvc_Prpty_VlQnty_Vl ********************************************************************************/
		if(devicepropertyvaluequantityi == 0) {d.addDvcPrptyVlQntyVl("[[");}
		if(devicepropertyvaluequantity.hasValue()) {

			d.addDvcPrptyVlQntyVl(String.valueOf(devicepropertyvaluequantity.getValue()));
		} else {
			d.addDvcPrptyVlQntyVl("NULL");
		}

		if(devicepropertyvaluequantityi == devicepropertyvaluequantitylist.size()-1) {d.addDvcPrptyVlQntyVl("]]");}


		/******************** devicepropertyvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicepropertyvaluequantitycomparator = devicepropertyvaluequantity.getComparator();
		if(devicepropertyvaluequantitycomparator!=null) {
		if(devicepropertyvaluequantityi == 0) {

		d.addDvcPrptyVlQntyCmprtr("[[");		}
			d.addDvcPrptyVlQntyCmprtr(devicepropertyvaluequantitycomparator.toCode());
		if(devicepropertyvaluequantityi == devicepropertyvaluequantitylist.size()-1) {

		d.addDvcPrptyVlQntyCmprtr("]]");		}

		} else {
			d.addDvcPrptyVlQntyCmprtr("NULL");
		}

		/******************** Dvc_Prpty_VlQnty_Cd ********************************************************************************/
		if(devicepropertyvaluequantityi == 0) {d.addDvcPrptyVlQntyCd("[[");}
		if(devicepropertyvaluequantity.hasCode()) {

			d.addDvcPrptyVlQntyCd(String.valueOf(devicepropertyvaluequantity.getCode()));
		} else {
			d.addDvcPrptyVlQntyCd("NULL");
		}

		if(devicepropertyvaluequantityi == devicepropertyvaluequantitylist.size()-1) {d.addDvcPrptyVlQntyCd("]]");}


		/******************** Dvc_Prpty_VlQnty_Unt ********************************************************************************/
		if(devicepropertyvaluequantityi == 0) {d.addDvcPrptyVlQntyUnt("[[");}
		if(devicepropertyvaluequantity.hasUnit()) {

			d.addDvcPrptyVlQntyUnt(String.valueOf(devicepropertyvaluequantity.getUnit()));
		} else {
			d.addDvcPrptyVlQntyUnt("NULL");
		}

		if(devicepropertyvaluequantityi == devicepropertyvaluequantitylist.size()-1) {d.addDvcPrptyVlQntyUnt("]]");}


		/******************** Dvc_Prpty_VlQnty_Sys ********************************************************************************/
		if(devicepropertyvaluequantityi == 0) {d.addDvcPrptyVlQntySys("[[");}
		if(devicepropertyvaluequantity.hasSystem()) {

			d.addDvcPrptyVlQntySys(String.valueOf(devicepropertyvaluequantity.getSystem()));
		} else {
			d.addDvcPrptyVlQntySys("NULL");
		}

		if(devicepropertyvaluequantityi == devicepropertyvaluequantitylist.size()-1) {d.addDvcPrptyVlQntySys("]]");}


		 };
		 };
		/******************** Dvc_Lctn ********************************************************************************/
		if(device.hasLocation()) {

			if(device.getLocation().getReference() != null) {
			d.addDvcLctn(device.getLocation().getReference());
			}
		} else {
			d.addDvcLctn("NULL");
		}


		/******************** Dvc_Parent ********************************************************************************/
		if(device.hasParent()) {

			if(device.getParent().getReference() != null) {
			d.addDvcParent(device.getParent().getReference());
			}
		} else {
			d.addDvcParent("NULL");
		}


		/******************** devicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicetype = device.getType();

		/******************** Dvc_Typ_Txt ********************************************************************************/
		if(devicetype.hasText()) {

			d.addDvcTypTxt(String.valueOf(devicetype.getText()));
		} else {
			d.addDvcTypTxt("NULL");
		}


		/******************** devicetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicetypecodinglist = devicetype.getCoding();
		for(int devicetypecodingi = 0; devicetypecodingi<devicetypecodinglist.size();devicetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicetypecoding = devicetypecodinglist.get(devicetypecodingi);

		/******************** Dvc_Typ_Cdg_Dsply ********************************************************************************/
		if(devicetypecodingi == 0) {d.addDvcTypCdgDsply("[");}
		if(devicetypecoding.hasDisplay()) {

			d.addDvcTypCdgDsply(String.valueOf(devicetypecoding.getDisplay()));
		} else {
			d.addDvcTypCdgDsply("NULL");
		}

		if(devicetypecodingi == devicetypecodinglist.size()-1) {d.addDvcTypCdgDsply("]");}


		/******************** Dvc_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicetypecodingi == 0) {d.addDvcTypCdgVrsn("[");}
		if(devicetypecoding.hasVersion()) {

			d.addDvcTypCdgVrsn(String.valueOf(devicetypecoding.getVersion()));
		} else {
			d.addDvcTypCdgVrsn("NULL");
		}

		if(devicetypecodingi == devicetypecodinglist.size()-1) {d.addDvcTypCdgVrsn("]");}


		/******************** Dvc_Typ_Cdg_Cd ********************************************************************************/
		if(devicetypecodingi == 0) {d.addDvcTypCdgCd("[");}
		if(devicetypecoding.hasCode()) {

			d.addDvcTypCdgCd(String.valueOf(devicetypecoding.getCode()));
		} else {
			d.addDvcTypCdgCd("NULL");
		}

		if(devicetypecodingi == devicetypecodinglist.size()-1) {d.addDvcTypCdgCd("]");}


		/******************** Dvc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicetypecodingi == 0) {d.addDvcTypCdgUsrSltd("[");}
		if(devicetypecoding.hasUserSelected()) {

			d.addDvcTypCdgUsrSltd(String.valueOf(devicetypecoding.getUserSelected()));
		} else {
			d.addDvcTypCdgUsrSltd("NULL");
		}

		if(devicetypecodingi == devicetypecodinglist.size()-1) {d.addDvcTypCdgUsrSltd("]");}


		/******************** Dvc_Typ_Cdg_Sys ********************************************************************************/
		if(devicetypecodingi == 0) {d.addDvcTypCdgSys("[");}
		if(devicetypecoding.hasSystem()) {

			d.addDvcTypCdgSys(String.valueOf(devicetypecoding.getSystem()));
		} else {
			d.addDvcTypCdgSys("NULL");
		}

		if(devicetypecodingi == devicetypecodinglist.size()-1) {d.addDvcTypCdgSys("]");}


		 };
		/******************** Dvc_Dfn ********************************************************************************/
		if(device.hasDefinition()) {

			if(device.getDefinition().getReference() != null) {
			d.addDvcDfn(device.getDefinition().getReference());
			}
		} else {
			d.addDvcDfn("NULL");
		}


		/******************** deviceversion ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Device.DeviceVersionComponent> deviceversionlist = device.getVersion();
		for(int deviceversioni = 0; deviceversioni<deviceversionlist.size();deviceversioni++ ) {
		org.hl7.fhir.r4.model.Device.DeviceVersionComponent  deviceversion = deviceversionlist.get(deviceversioni);

		/******************** Dvc_Vrsn_Vl ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnVl("[");}
		if(deviceversion.hasValue()) {

			d.addDvcVrsnVl(String.valueOf(deviceversion.getValue()));
		} else {
			d.addDvcVrsnVl("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnVl("]");}


		/******************** deviceversiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceversiontype = deviceversion.getType();

		/******************** Dvc_Vrsn_Typ_Txt ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnTypTxt("[");}
		if(deviceversiontype.hasText()) {

			d.addDvcVrsnTypTxt(String.valueOf(deviceversiontype.getText()));
		} else {
			d.addDvcVrsnTypTxt("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnTypTxt("]");}


		/******************** deviceversiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> deviceversiontypecodinglist = deviceversiontype.getCoding();
		for(int deviceversiontypecodingi = 0; deviceversiontypecodingi<deviceversiontypecodinglist.size();deviceversiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  deviceversiontypecoding = deviceversiontypecodinglist.get(deviceversiontypecodingi);

		/******************** Dvc_Vrsn_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceversiontypecodingi == 0) {d.addDvcVrsnTypCdgDsply("[[");}
		if(deviceversiontypecoding.hasDisplay()) {

			d.addDvcVrsnTypCdgDsply(String.valueOf(deviceversiontypecoding.getDisplay()));
		} else {
			d.addDvcVrsnTypCdgDsply("NULL");
		}

		if(deviceversiontypecodingi == deviceversiontypecodinglist.size()-1) {d.addDvcVrsnTypCdgDsply("]]");}


		/******************** Dvc_Vrsn_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceversiontypecodingi == 0) {d.addDvcVrsnTypCdgVrsn("[[");}
		if(deviceversiontypecoding.hasVersion()) {

			d.addDvcVrsnTypCdgVrsn(String.valueOf(deviceversiontypecoding.getVersion()));
		} else {
			d.addDvcVrsnTypCdgVrsn("NULL");
		}

		if(deviceversiontypecodingi == deviceversiontypecodinglist.size()-1) {d.addDvcVrsnTypCdgVrsn("]]");}


		/******************** Dvc_Vrsn_Typ_Cdg_Cd ********************************************************************************/
		if(deviceversiontypecodingi == 0) {d.addDvcVrsnTypCdgCd("[[");}
		if(deviceversiontypecoding.hasCode()) {

			d.addDvcVrsnTypCdgCd(String.valueOf(deviceversiontypecoding.getCode()));
		} else {
			d.addDvcVrsnTypCdgCd("NULL");
		}

		if(deviceversiontypecodingi == deviceversiontypecodinglist.size()-1) {d.addDvcVrsnTypCdgCd("]]");}


		/******************** Dvc_Vrsn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceversiontypecodingi == 0) {d.addDvcVrsnTypCdgUsrSltd("[[");}
		if(deviceversiontypecoding.hasUserSelected()) {

			d.addDvcVrsnTypCdgUsrSltd(String.valueOf(deviceversiontypecoding.getUserSelected()));
		} else {
			d.addDvcVrsnTypCdgUsrSltd("NULL");
		}

		if(deviceversiontypecodingi == deviceversiontypecodinglist.size()-1) {d.addDvcVrsnTypCdgUsrSltd("]]");}


		/******************** Dvc_Vrsn_Typ_Cdg_Sys ********************************************************************************/
		if(deviceversiontypecodingi == 0) {d.addDvcVrsnTypCdgSys("[[");}
		if(deviceversiontypecoding.hasSystem()) {

			d.addDvcVrsnTypCdgSys(String.valueOf(deviceversiontypecoding.getSystem()));
		} else {
			d.addDvcVrsnTypCdgSys("NULL");
		}

		if(deviceversiontypecodingi == deviceversiontypecodinglist.size()-1) {d.addDvcVrsnTypCdgSys("]]");}


		 };
		/******************** deviceversioncomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier deviceversioncomponent = deviceversion.getComponent();

		/******************** Dvc_Vrsn_Cmpnt_Vl ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnCmpntVl("[");}
		if(deviceversioncomponent.hasValue()) {

			d.addDvcVrsnCmpntVl(String.valueOf(deviceversioncomponent.getValue()));
		} else {
			d.addDvcVrsnCmpntVl("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnCmpntVl("]");}


		/******************** deviceversioncomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceversioncomponenttype = deviceversioncomponent.getType();

		/******************** Dvc_Vrsn_Cmpnt_Typ_Txt ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnCmpntTypTxt("[");}
		if(deviceversioncomponenttype.hasText()) {

			d.addDvcVrsnCmpntTypTxt(String.valueOf(deviceversioncomponenttype.getText()));
		} else {
			d.addDvcVrsnCmpntTypTxt("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnCmpntTypTxt("]");}


		/******************** deviceversioncomponenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> deviceversioncomponenttypecodinglist = deviceversioncomponenttype.getCoding();
		for(int deviceversioncomponenttypecodingi = 0; deviceversioncomponenttypecodingi<deviceversioncomponenttypecodinglist.size();deviceversioncomponenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  deviceversioncomponenttypecoding = deviceversioncomponenttypecodinglist.get(deviceversioncomponenttypecodingi);

		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceversioncomponenttypecodingi == 0) {d.addDvcVrsnCmpntTypCdgDsply("[[");}
		if(deviceversioncomponenttypecoding.hasDisplay()) {

			d.addDvcVrsnCmpntTypCdgDsply(String.valueOf(deviceversioncomponenttypecoding.getDisplay()));
		} else {
			d.addDvcVrsnCmpntTypCdgDsply("NULL");
		}

		if(deviceversioncomponenttypecodingi == deviceversioncomponenttypecodinglist.size()-1) {d.addDvcVrsnCmpntTypCdgDsply("]]");}


		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceversioncomponenttypecodingi == 0) {d.addDvcVrsnCmpntTypCdgVrsn("[[");}
		if(deviceversioncomponenttypecoding.hasVersion()) {

			d.addDvcVrsnCmpntTypCdgVrsn(String.valueOf(deviceversioncomponenttypecoding.getVersion()));
		} else {
			d.addDvcVrsnCmpntTypCdgVrsn("NULL");
		}

		if(deviceversioncomponenttypecodingi == deviceversioncomponenttypecodinglist.size()-1) {d.addDvcVrsnCmpntTypCdgVrsn("]]");}


		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Cd ********************************************************************************/
		if(deviceversioncomponenttypecodingi == 0) {d.addDvcVrsnCmpntTypCdgCd("[[");}
		if(deviceversioncomponenttypecoding.hasCode()) {

			d.addDvcVrsnCmpntTypCdgCd(String.valueOf(deviceversioncomponenttypecoding.getCode()));
		} else {
			d.addDvcVrsnCmpntTypCdgCd("NULL");
		}

		if(deviceversioncomponenttypecodingi == deviceversioncomponenttypecodinglist.size()-1) {d.addDvcVrsnCmpntTypCdgCd("]]");}


		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceversioncomponenttypecodingi == 0) {d.addDvcVrsnCmpntTypCdgUsrSltd("[[");}
		if(deviceversioncomponenttypecoding.hasUserSelected()) {

			d.addDvcVrsnCmpntTypCdgUsrSltd(String.valueOf(deviceversioncomponenttypecoding.getUserSelected()));
		} else {
			d.addDvcVrsnCmpntTypCdgUsrSltd("NULL");
		}

		if(deviceversioncomponenttypecodingi == deviceversioncomponenttypecodinglist.size()-1) {d.addDvcVrsnCmpntTypCdgUsrSltd("]]");}


		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Sys ********************************************************************************/
		if(deviceversioncomponenttypecodingi == 0) {d.addDvcVrsnCmpntTypCdgSys("[[");}
		if(deviceversioncomponenttypecoding.hasSystem()) {

			d.addDvcVrsnCmpntTypCdgSys(String.valueOf(deviceversioncomponenttypecoding.getSystem()));
		} else {
			d.addDvcVrsnCmpntTypCdgSys("NULL");
		}

		if(deviceversioncomponenttypecodingi == deviceversioncomponenttypecodinglist.size()-1) {d.addDvcVrsnCmpntTypCdgSys("]]");}


		 };
		/******************** deviceversioncomponentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceversioncomponentperiod = deviceversioncomponent.getPeriod();

		/******************** Dvc_Vrsn_Cmpnt_Prd_Strt ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnCmpntPrdStrt("[");}
		if(deviceversioncomponentperiod.hasStart()) {

			d.addDvcVrsnCmpntPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceversioncomponentperiod.getStart())+"\"");
		} else {
			d.addDvcVrsnCmpntPrdStrt("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnCmpntPrdStrt("]");}


		/******************** Dvc_Vrsn_Cmpnt_Prd_End ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnCmpntPrdEnd("[");}
		if(deviceversioncomponentperiod.hasEnd()) {

			d.addDvcVrsnCmpntPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceversioncomponentperiod.getEnd())+"\"");
		} else {
			d.addDvcVrsnCmpntPrdEnd("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnCmpntPrdEnd("]");}


		/******************** deviceversioncomponentuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse deviceversioncomponentuse = deviceversioncomponent.getUse();
		if(deviceversioncomponentuse!=null) {
		if(deviceversioni == 0) {

		d.addDvcVrsnCmpntUse("[");		}
			d.addDvcVrsnCmpntUse(deviceversioncomponentuse.toCode());
		if(deviceversioni == deviceversionlist.size()-1) {

		d.addDvcVrsnCmpntUse("]");		}

		} else {
			d.addDvcVrsnCmpntUse("NULL");
		}

		/******************** Dvc_Vrsn_Cmpnt_Assigner ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnCmpntAssigner("[");}
		if(deviceversioncomponent.hasAssigner()) {

			if(deviceversioncomponent.getAssigner().getReference() != null) {
			d.addDvcVrsnCmpntAssigner(deviceversioncomponent.getAssigner().getReference());
			}
		} else {
			d.addDvcVrsnCmpntAssigner("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnCmpntAssigner("]");}


		/******************** Dvc_Vrsn_Cmpnt_Sys ********************************************************************************/
		if(deviceversioni == 0) {d.addDvcVrsnCmpntSys("[");}
		if(deviceversioncomponent.hasSystem()) {

			d.addDvcVrsnCmpntSys(String.valueOf(deviceversioncomponent.getSystem()));
		} else {
			d.addDvcVrsnCmpntSys("NULL");
		}

		if(deviceversioni == deviceversionlist.size()-1) {d.addDvcVrsnCmpntSys("]");}


		 };
		/******************** devicestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Device.FHIRDeviceStatus devicestatus = device.getStatus();
		if(devicestatus!=null) {
			d.addDvcSts(devicestatus.toCode());
		} else {
			d.addDvcSts("NULL");
		}

		/******************** devicenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> devicenotelist = device.getNote();
		for(int devicenotei = 0; devicenotei<devicenotelist.size();devicenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  devicenote = devicenotelist.get(devicenotei);

		/******************** Dvc_Nt_Time ********************************************************************************/
		if(devicenotei == 0) {d.addDvcNtTime("[");}
		if(devicenote.hasTime()) {

			d.addDvcNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicenote.getTime())+"\"");
		} else {
			d.addDvcNtTime("NULL");
		}

		if(devicenotei == devicenotelist.size()-1) {d.addDvcNtTime("]");}


		/******************** Dvc_Nt_AthrRfrnc ********************************************************************************/
		if(devicenotei == 0) {d.addDvcNtAthrRfrnc("[");}
		if(devicenote.hasAuthorReference()) {

			if(devicenote.getAuthorReference().getReference() != null) {
			d.addDvcNtAthrRfrnc(devicenote.getAuthorReference().getReference());
			}
		} else {
			d.addDvcNtAthrRfrnc("NULL");
		}

		if(devicenotei == devicenotelist.size()-1) {d.addDvcNtAthrRfrnc("]");}


		/******************** Dvc_Nt_Txt ********************************************************************************/
		if(devicenotei == 0) {d.addDvcNtTxt("[");}
		if(devicenote.hasText()) {

			d.addDvcNtTxt(String.valueOf(devicenote.getText()));
		} else {
			d.addDvcNtTxt("NULL");
		}

		if(devicenotei == devicenotelist.size()-1) {d.addDvcNtTxt("]");}


		/******************** Dvc_Nt_AthrStrgTyp ********************************************************************************/
		if(devicenotei == 0) {d.addDvcNtAthrStrgTyp("[");}
		if(devicenote.hasAuthorStringType()) {

			d.addDvcNtAthrStrgTyp("\""+devicenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			d.addDvcNtAthrStrgTyp("NULL");
		}

		if(devicenotei == devicenotelist.size()-1) {d.addDvcNtAthrStrgTyp("]");}


		 };
		/******************** deviceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> deviceidentifierlist = device.getIdentifier();
		for(int deviceidentifieri = 0; deviceidentifieri<deviceidentifierlist.size();deviceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  deviceidentifier = deviceidentifierlist.get(deviceidentifieri);

		/******************** Dvc_Id_Vl ********************************************************************************/
		if(deviceidentifieri == 0) {d.addDvcIdVl("[");}
		if(deviceidentifier.hasValue()) {

			d.addDvcIdVl(String.valueOf(deviceidentifier.getValue()));
		} else {
			d.addDvcIdVl("NULL");
		}

		if(deviceidentifieri == deviceidentifierlist.size()-1) {d.addDvcIdVl("]");}


		/******************** deviceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceidentifiertype = deviceidentifier.getType();

		/******************** Dvc_Id_Typ_Txt ********************************************************************************/
		if(deviceidentifieri == 0) {d.addDvcIdTypTxt("[");}
		if(deviceidentifiertype.hasText()) {

			d.addDvcIdTypTxt(String.valueOf(deviceidentifiertype.getText()));
		} else {
			d.addDvcIdTypTxt("NULL");
		}

		if(deviceidentifieri == deviceidentifierlist.size()-1) {d.addDvcIdTypTxt("]");}


		/******************** deviceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> deviceidentifiertypecodinglist = deviceidentifiertype.getCoding();
		for(int deviceidentifiertypecodingi = 0; deviceidentifiertypecodingi<deviceidentifiertypecodinglist.size();deviceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  deviceidentifiertypecoding = deviceidentifiertypecodinglist.get(deviceidentifiertypecodingi);

		/******************** Dvc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceidentifiertypecodingi == 0) {d.addDvcIdTypCdgDsply("[[");}
		if(deviceidentifiertypecoding.hasDisplay()) {

			d.addDvcIdTypCdgDsply(String.valueOf(deviceidentifiertypecoding.getDisplay()));
		} else {
			d.addDvcIdTypCdgDsply("NULL");
		}

		if(deviceidentifiertypecodingi == deviceidentifiertypecodinglist.size()-1) {d.addDvcIdTypCdgDsply("]]");}


		/******************** Dvc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceidentifiertypecodingi == 0) {d.addDvcIdTypCdgVrsn("[[");}
		if(deviceidentifiertypecoding.hasVersion()) {

			d.addDvcIdTypCdgVrsn(String.valueOf(deviceidentifiertypecoding.getVersion()));
		} else {
			d.addDvcIdTypCdgVrsn("NULL");
		}

		if(deviceidentifiertypecodingi == deviceidentifiertypecodinglist.size()-1) {d.addDvcIdTypCdgVrsn("]]");}


		/******************** Dvc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(deviceidentifiertypecodingi == 0) {d.addDvcIdTypCdgCd("[[");}
		if(deviceidentifiertypecoding.hasCode()) {

			d.addDvcIdTypCdgCd(String.valueOf(deviceidentifiertypecoding.getCode()));
		} else {
			d.addDvcIdTypCdgCd("NULL");
		}

		if(deviceidentifiertypecodingi == deviceidentifiertypecodinglist.size()-1) {d.addDvcIdTypCdgCd("]]");}


		/******************** Dvc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceidentifiertypecodingi == 0) {d.addDvcIdTypCdgUsrSltd("[[");}
		if(deviceidentifiertypecoding.hasUserSelected()) {

			d.addDvcIdTypCdgUsrSltd(String.valueOf(deviceidentifiertypecoding.getUserSelected()));
		} else {
			d.addDvcIdTypCdgUsrSltd("NULL");
		}

		if(deviceidentifiertypecodingi == deviceidentifiertypecodinglist.size()-1) {d.addDvcIdTypCdgUsrSltd("]]");}


		/******************** Dvc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(deviceidentifiertypecodingi == 0) {d.addDvcIdTypCdgSys("[[");}
		if(deviceidentifiertypecoding.hasSystem()) {

			d.addDvcIdTypCdgSys(String.valueOf(deviceidentifiertypecoding.getSystem()));
		} else {
			d.addDvcIdTypCdgSys("NULL");
		}

		if(deviceidentifiertypecodingi == deviceidentifiertypecodinglist.size()-1) {d.addDvcIdTypCdgSys("]]");}


		 };
		/******************** deviceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceidentifierperiod = deviceidentifier.getPeriod();

		/******************** Dvc_Id_Prd_Strt ********************************************************************************/
		if(deviceidentifieri == 0) {d.addDvcIdPrdStrt("[");}
		if(deviceidentifierperiod.hasStart()) {

			d.addDvcIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceidentifierperiod.getStart())+"\"");
		} else {
			d.addDvcIdPrdStrt("NULL");
		}

		if(deviceidentifieri == deviceidentifierlist.size()-1) {d.addDvcIdPrdStrt("]");}


		/******************** Dvc_Id_Prd_End ********************************************************************************/
		if(deviceidentifieri == 0) {d.addDvcIdPrdEnd("[");}
		if(deviceidentifierperiod.hasEnd()) {

			d.addDvcIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceidentifierperiod.getEnd())+"\"");
		} else {
			d.addDvcIdPrdEnd("NULL");
		}

		if(deviceidentifieri == deviceidentifierlist.size()-1) {d.addDvcIdPrdEnd("]");}


		/******************** deviceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse deviceidentifieruse = deviceidentifier.getUse();
		if(deviceidentifieruse!=null) {
		if(deviceidentifieri == 0) {

		d.addDvcIdUse("[");		}
			d.addDvcIdUse(deviceidentifieruse.toCode());
		if(deviceidentifieri == deviceidentifierlist.size()-1) {

		d.addDvcIdUse("]");		}

		} else {
			d.addDvcIdUse("NULL");
		}

		/******************** Dvc_Id_Assigner ********************************************************************************/
		if(deviceidentifieri == 0) {d.addDvcIdAssigner("[");}
		if(deviceidentifier.hasAssigner()) {

			if(deviceidentifier.getAssigner().getReference() != null) {
			d.addDvcIdAssigner(deviceidentifier.getAssigner().getReference());
			}
		} else {
			d.addDvcIdAssigner("NULL");
		}

		if(deviceidentifieri == deviceidentifierlist.size()-1) {d.addDvcIdAssigner("]");}


		/******************** Dvc_Id_Sys ********************************************************************************/
		if(deviceidentifieri == 0) {d.addDvcIdSys("[");}
		if(deviceidentifier.hasSystem()) {

			d.addDvcIdSys(String.valueOf(deviceidentifier.getSystem()));
		} else {
			d.addDvcIdSys("NULL");
		}

		if(deviceidentifieri == deviceidentifierlist.size()-1) {d.addDvcIdSys("]");}


		 };
		/******************** devicecontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> devicecontactlist = device.getContact();
		for(int devicecontacti = 0; devicecontacti<devicecontactlist.size();devicecontacti++ ) {
		org.hl7.fhir.r4.model.ContactPoint  devicecontact = devicecontactlist.get(devicecontacti);

		/******************** Dvc_Cntct_Vl ********************************************************************************/
		if(devicecontacti == 0) {d.addDvcCntctVl("[");}
		if(devicecontact.hasValue()) {

			d.addDvcCntctVl(String.valueOf(devicecontact.getValue()));
		} else {
			d.addDvcCntctVl("NULL");
		}

		if(devicecontacti == devicecontactlist.size()-1) {d.addDvcCntctVl("]");}


		/******************** devicecontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicecontactperiod = devicecontact.getPeriod();

		/******************** Dvc_Cntct_Prd_Strt ********************************************************************************/
		if(devicecontacti == 0) {d.addDvcCntctPrdStrt("[");}
		if(devicecontactperiod.hasStart()) {

			d.addDvcCntctPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicecontactperiod.getStart())+"\"");
		} else {
			d.addDvcCntctPrdStrt("NULL");
		}

		if(devicecontacti == devicecontactlist.size()-1) {d.addDvcCntctPrdStrt("]");}


		/******************** Dvc_Cntct_Prd_End ********************************************************************************/
		if(devicecontacti == 0) {d.addDvcCntctPrdEnd("[");}
		if(devicecontactperiod.hasEnd()) {

			d.addDvcCntctPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicecontactperiod.getEnd())+"\"");
		} else {
			d.addDvcCntctPrdEnd("NULL");
		}

		if(devicecontacti == devicecontactlist.size()-1) {d.addDvcCntctPrdEnd("]");}


		/******************** devicecontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse devicecontactuse = devicecontact.getUse();
		if(devicecontactuse!=null) {
		if(devicecontacti == 0) {

		d.addDvcCntctUse("[");		}
			d.addDvcCntctUse(devicecontactuse.toCode());
		if(devicecontacti == devicecontactlist.size()-1) {

		d.addDvcCntctUse("]");		}

		} else {
			d.addDvcCntctUse("NULL");
		}

		/******************** devicecontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem devicecontactsystem = devicecontact.getSystem();
		if(devicecontactsystem!=null) {
		if(devicecontacti == 0) {

		d.addDvcCntctSys("[");		}
			d.addDvcCntctSys(devicecontactsystem.toCode());
		if(devicecontacti == devicecontactlist.size()-1) {

		d.addDvcCntctSys("]");		}

		} else {
			d.addDvcCntctSys("NULL");
		}

		/******************** Dvc_Cntct_Rnk ********************************************************************************/
		if(devicecontacti == 0) {d.addDvcCntctRnk("[");}
		if(devicecontact.hasRank()) {

			d.addDvcCntctRnk(String.valueOf(devicecontact.getRank()));
		} else {
			d.addDvcCntctRnk("NULL");
		}

		if(devicecontacti == devicecontactlist.size()-1) {d.addDvcCntctRnk("]");}


		 };
		/******************** Dvc_DistinctId ********************************************************************************/
		if(device.hasDistinctIdentifier()) {

			d.addDvcDistinctId(String.valueOf(device.getDistinctIdentifier()));
		} else {
			d.addDvcDistinctId("NULL");
		}


		/******************** Dvc_Url ********************************************************************************/
		if(device.hasUrl()) {

			d.addDvcUrl(String.valueOf(device.getUrl()));
		} else {
			d.addDvcUrl("NULL");
		}


		/******************** Dvc_Pnt ********************************************************************************/
		if(device.hasPatient()) {

			if(device.getPatient().getReference() != null) {
			d.addDvcPnt(device.getPatient().getReference());
			}
		} else {
			d.addDvcPnt("NULL");
		}


		/******************** devicespecialization ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent> devicespecializationlist = device.getSpecialization();
		for(int devicespecializationi = 0; devicespecializationi<devicespecializationlist.size();devicespecializationi++ ) {
		org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent  devicespecialization = devicespecializationlist.get(devicespecializationi);

		/******************** devicespecializationsystemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicespecializationsystemtype = devicespecialization.getSystemType();

		/******************** Dvc_Spclization_SysTyp_Txt ********************************************************************************/
		if(devicespecializationi == 0) {d.addDvcSpclizationSysTypTxt("[");}
		if(devicespecializationsystemtype.hasText()) {

			d.addDvcSpclizationSysTypTxt(String.valueOf(devicespecializationsystemtype.getText()));
		} else {
			d.addDvcSpclizationSysTypTxt("NULL");
		}

		if(devicespecializationi == devicespecializationlist.size()-1) {d.addDvcSpclizationSysTypTxt("]");}


		/******************** devicespecializationsystemtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicespecializationsystemtypecodinglist = devicespecializationsystemtype.getCoding();
		for(int devicespecializationsystemtypecodingi = 0; devicespecializationsystemtypecodingi<devicespecializationsystemtypecodinglist.size();devicespecializationsystemtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicespecializationsystemtypecoding = devicespecializationsystemtypecodinglist.get(devicespecializationsystemtypecodingi);

		/******************** Dvc_Spclization_SysTyp_Cdg_Dsply ********************************************************************************/
		if(devicespecializationsystemtypecodingi == 0) {d.addDvcSpclizationSysTypCdgDsply("[[");}
		if(devicespecializationsystemtypecoding.hasDisplay()) {

			d.addDvcSpclizationSysTypCdgDsply(String.valueOf(devicespecializationsystemtypecoding.getDisplay()));
		} else {
			d.addDvcSpclizationSysTypCdgDsply("NULL");
		}

		if(devicespecializationsystemtypecodingi == devicespecializationsystemtypecodinglist.size()-1) {d.addDvcSpclizationSysTypCdgDsply("]]");}


		/******************** Dvc_Spclization_SysTyp_Cdg_Vrsn ********************************************************************************/
		if(devicespecializationsystemtypecodingi == 0) {d.addDvcSpclizationSysTypCdgVrsn("[[");}
		if(devicespecializationsystemtypecoding.hasVersion()) {

			d.addDvcSpclizationSysTypCdgVrsn(String.valueOf(devicespecializationsystemtypecoding.getVersion()));
		} else {
			d.addDvcSpclizationSysTypCdgVrsn("NULL");
		}

		if(devicespecializationsystemtypecodingi == devicespecializationsystemtypecodinglist.size()-1) {d.addDvcSpclizationSysTypCdgVrsn("]]");}


		/******************** Dvc_Spclization_SysTyp_Cdg_Cd ********************************************************************************/
		if(devicespecializationsystemtypecodingi == 0) {d.addDvcSpclizationSysTypCdgCd("[[");}
		if(devicespecializationsystemtypecoding.hasCode()) {

			d.addDvcSpclizationSysTypCdgCd(String.valueOf(devicespecializationsystemtypecoding.getCode()));
		} else {
			d.addDvcSpclizationSysTypCdgCd("NULL");
		}

		if(devicespecializationsystemtypecodingi == devicespecializationsystemtypecodinglist.size()-1) {d.addDvcSpclizationSysTypCdgCd("]]");}


		/******************** Dvc_Spclization_SysTyp_Cdg_UsrSltd ********************************************************************************/
		if(devicespecializationsystemtypecodingi == 0) {d.addDvcSpclizationSysTypCdgUsrSltd("[[");}
		if(devicespecializationsystemtypecoding.hasUserSelected()) {

			d.addDvcSpclizationSysTypCdgUsrSltd(String.valueOf(devicespecializationsystemtypecoding.getUserSelected()));
		} else {
			d.addDvcSpclizationSysTypCdgUsrSltd("NULL");
		}

		if(devicespecializationsystemtypecodingi == devicespecializationsystemtypecodinglist.size()-1) {d.addDvcSpclizationSysTypCdgUsrSltd("]]");}


		/******************** Dvc_Spclization_SysTyp_Cdg_Sys ********************************************************************************/
		if(devicespecializationsystemtypecodingi == 0) {d.addDvcSpclizationSysTypCdgSys("[[");}
		if(devicespecializationsystemtypecoding.hasSystem()) {

			d.addDvcSpclizationSysTypCdgSys(String.valueOf(devicespecializationsystemtypecoding.getSystem()));
		} else {
			d.addDvcSpclizationSysTypCdgSys("NULL");
		}

		if(devicespecializationsystemtypecodingi == devicespecializationsystemtypecodinglist.size()-1) {d.addDvcSpclizationSysTypCdgSys("]]");}


		 };
		 };
		/******************** Dvc_PartNmbr ********************************************************************************/
		if(device.hasPartNumber()) {

			d.addDvcPartNmbr(String.valueOf(device.getPartNumber()));
		} else {
			d.addDvcPartNmbr("NULL");
		}


		/******************** Dvc_ModelNmbr ********************************************************************************/
		if(device.hasModelNumber()) {

			d.addDvcModelNmbr(String.valueOf(device.getModelNumber()));
		} else {
			d.addDvcModelNmbr("NULL");
		}


		/******************** devicesafety ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicesafetylist = device.getSafety();
		for(int devicesafetyi = 0; devicesafetyi<devicesafetylist.size();devicesafetyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicesafety = devicesafetylist.get(devicesafetyi);

		/******************** Dvc_Safety_Txt ********************************************************************************/
		if(devicesafetyi == 0) {d.addDvcSafetyTxt("[");}
		if(devicesafety.hasText()) {

			d.addDvcSafetyTxt(String.valueOf(devicesafety.getText()));
		} else {
			d.addDvcSafetyTxt("NULL");
		}

		if(devicesafetyi == devicesafetylist.size()-1) {d.addDvcSafetyTxt("]");}


		/******************** devicesafetycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicesafetycodinglist = devicesafety.getCoding();
		for(int devicesafetycodingi = 0; devicesafetycodingi<devicesafetycodinglist.size();devicesafetycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicesafetycoding = devicesafetycodinglist.get(devicesafetycodingi);

		/******************** Dvc_Safety_Cdg_Dsply ********************************************************************************/
		if(devicesafetycodingi == 0) {d.addDvcSafetyCdgDsply("[[");}
		if(devicesafetycoding.hasDisplay()) {

			d.addDvcSafetyCdgDsply(String.valueOf(devicesafetycoding.getDisplay()));
		} else {
			d.addDvcSafetyCdgDsply("NULL");
		}

		if(devicesafetycodingi == devicesafetycodinglist.size()-1) {d.addDvcSafetyCdgDsply("]]");}


		/******************** Dvc_Safety_Cdg_Vrsn ********************************************************************************/
		if(devicesafetycodingi == 0) {d.addDvcSafetyCdgVrsn("[[");}
		if(devicesafetycoding.hasVersion()) {

			d.addDvcSafetyCdgVrsn(String.valueOf(devicesafetycoding.getVersion()));
		} else {
			d.addDvcSafetyCdgVrsn("NULL");
		}

		if(devicesafetycodingi == devicesafetycodinglist.size()-1) {d.addDvcSafetyCdgVrsn("]]");}


		/******************** Dvc_Safety_Cdg_Cd ********************************************************************************/
		if(devicesafetycodingi == 0) {d.addDvcSafetyCdgCd("[[");}
		if(devicesafetycoding.hasCode()) {

			d.addDvcSafetyCdgCd(String.valueOf(devicesafetycoding.getCode()));
		} else {
			d.addDvcSafetyCdgCd("NULL");
		}

		if(devicesafetycodingi == devicesafetycodinglist.size()-1) {d.addDvcSafetyCdgCd("]]");}


		/******************** Dvc_Safety_Cdg_UsrSltd ********************************************************************************/
		if(devicesafetycodingi == 0) {d.addDvcSafetyCdgUsrSltd("[[");}
		if(devicesafetycoding.hasUserSelected()) {

			d.addDvcSafetyCdgUsrSltd(String.valueOf(devicesafetycoding.getUserSelected()));
		} else {
			d.addDvcSafetyCdgUsrSltd("NULL");
		}

		if(devicesafetycodingi == devicesafetycodinglist.size()-1) {d.addDvcSafetyCdgUsrSltd("]]");}


		/******************** Dvc_Safety_Cdg_Sys ********************************************************************************/
		if(devicesafetycodingi == 0) {d.addDvcSafetyCdgSys("[[");}
		if(devicesafetycoding.hasSystem()) {

			d.addDvcSafetyCdgSys(String.valueOf(devicesafetycoding.getSystem()));
		} else {
			d.addDvcSafetyCdgSys("NULL");
		}

		if(devicesafetycodingi == devicesafetycodinglist.size()-1) {d.addDvcSafetyCdgSys("]]");}


		 };
		 };
		/******************** Dvc_ManufactureDt ********************************************************************************/
		if(device.hasManufactureDate()) {

			d.addDvcManufactureDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(device.getManufactureDate())+"\"");
		} else {
			d.addDvcManufactureDt("NULL");
		}


		/******************** Dvc_SerialNmbr ********************************************************************************/
		if(device.hasSerialNumber()) {

			d.addDvcSerialNmbr(String.valueOf(device.getSerialNumber()));
		} else {
			d.addDvcSerialNmbr("NULL");
		}


		/******************** Dvc_ExpirationDt ********************************************************************************/
		if(device.hasExpirationDate()) {

			d.addDvcExpirationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(device.getExpirationDate())+"\"");
		} else {
			d.addDvcExpirationDt("NULL");
		}


		/******************** Dvc_LotNmbr ********************************************************************************/
		if(device.hasLotNumber()) {

			d.addDvcLotNmbr(String.valueOf(device.getLotNumber()));
		} else {
			d.addDvcLotNmbr("NULL");
		}


		/******************** devicedevicename ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent> devicedevicenamelist = device.getDeviceName();
		for(int devicedevicenamei = 0; devicedevicenamei<devicedevicenamelist.size();devicedevicenamei++ ) {
		org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent  devicedevicename = devicedevicenamelist.get(devicedevicenamei);

		/******************** Dvc_DvcNm_Nm ********************************************************************************/
		if(devicedevicenamei == 0) {d.addDvcDvcNmNm("[");}
		if(devicedevicename.hasName()) {

			d.addDvcDvcNmNm(String.valueOf(devicedevicename.getName()));
		} else {
			d.addDvcDvcNmNm("NULL");
		}

		if(devicedevicenamei == devicedevicenamelist.size()-1) {d.addDvcDvcNmNm("]");}


		/******************** devicedevicenametype ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceNameType devicedevicenametype = devicedevicename.getType();
		if(devicedevicenametype!=null) {
		if(devicedevicenamei == 0) {

		d.addDvcDvcNmTyp("[");		}
			d.addDvcDvcNmTyp(devicedevicenametype.toCode());
		if(devicedevicenamei == devicedevicenamelist.size()-1) {

		d.addDvcDvcNmTyp("]");		}

		} else {
			d.addDvcDvcNmTyp("NULL");
		}

		 };
		/******************** Dvc_Manufacturer ********************************************************************************/
		if(device.hasManufacturer()) {

			d.addDvcManufacturer(String.valueOf(device.getManufacturer()));
		} else {
			d.addDvcManufacturer("NULL");
		}


		/******************** devicestatusreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicestatusreasonlist = device.getStatusReason();
		for(int devicestatusreasoni = 0; devicestatusreasoni<devicestatusreasonlist.size();devicestatusreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicestatusreason = devicestatusreasonlist.get(devicestatusreasoni);

		/******************** Dvc_StsRsn_Txt ********************************************************************************/
		if(devicestatusreasoni == 0) {d.addDvcStsRsnTxt("[");}
		if(devicestatusreason.hasText()) {

			d.addDvcStsRsnTxt(String.valueOf(devicestatusreason.getText()));
		} else {
			d.addDvcStsRsnTxt("NULL");
		}

		if(devicestatusreasoni == devicestatusreasonlist.size()-1) {d.addDvcStsRsnTxt("]");}


		/******************** devicestatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicestatusreasoncodinglist = devicestatusreason.getCoding();
		for(int devicestatusreasoncodingi = 0; devicestatusreasoncodingi<devicestatusreasoncodinglist.size();devicestatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicestatusreasoncoding = devicestatusreasoncodinglist.get(devicestatusreasoncodingi);

		/******************** Dvc_StsRsn_Cdg_Dsply ********************************************************************************/
		if(devicestatusreasoncodingi == 0) {d.addDvcStsRsnCdgDsply("[[");}
		if(devicestatusreasoncoding.hasDisplay()) {

			d.addDvcStsRsnCdgDsply(String.valueOf(devicestatusreasoncoding.getDisplay()));
		} else {
			d.addDvcStsRsnCdgDsply("NULL");
		}

		if(devicestatusreasoncodingi == devicestatusreasoncodinglist.size()-1) {d.addDvcStsRsnCdgDsply("]]");}


		/******************** Dvc_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(devicestatusreasoncodingi == 0) {d.addDvcStsRsnCdgVrsn("[[");}
		if(devicestatusreasoncoding.hasVersion()) {

			d.addDvcStsRsnCdgVrsn(String.valueOf(devicestatusreasoncoding.getVersion()));
		} else {
			d.addDvcStsRsnCdgVrsn("NULL");
		}

		if(devicestatusreasoncodingi == devicestatusreasoncodinglist.size()-1) {d.addDvcStsRsnCdgVrsn("]]");}


		/******************** Dvc_StsRsn_Cdg_Cd ********************************************************************************/
		if(devicestatusreasoncodingi == 0) {d.addDvcStsRsnCdgCd("[[");}
		if(devicestatusreasoncoding.hasCode()) {

			d.addDvcStsRsnCdgCd(String.valueOf(devicestatusreasoncoding.getCode()));
		} else {
			d.addDvcStsRsnCdgCd("NULL");
		}

		if(devicestatusreasoncodingi == devicestatusreasoncodinglist.size()-1) {d.addDvcStsRsnCdgCd("]]");}


		/******************** Dvc_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(devicestatusreasoncodingi == 0) {d.addDvcStsRsnCdgUsrSltd("[[");}
		if(devicestatusreasoncoding.hasUserSelected()) {

			d.addDvcStsRsnCdgUsrSltd(String.valueOf(devicestatusreasoncoding.getUserSelected()));
		} else {
			d.addDvcStsRsnCdgUsrSltd("NULL");
		}

		if(devicestatusreasoncodingi == devicestatusreasoncodinglist.size()-1) {d.addDvcStsRsnCdgUsrSltd("]]");}


		/******************** Dvc_StsRsn_Cdg_Sys ********************************************************************************/
		if(devicestatusreasoncodingi == 0) {d.addDvcStsRsnCdgSys("[[");}
		if(devicestatusreasoncoding.hasSystem()) {

			d.addDvcStsRsnCdgSys(String.valueOf(devicestatusreasoncoding.getSystem()));
		} else {
			d.addDvcStsRsnCdgSys("NULL");
		}

		if(devicestatusreasoncodingi == devicestatusreasoncodinglist.size()-1) {d.addDvcStsRsnCdgSys("]]");}


		 };
		 };
		/******************** deviceudicarrier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent> deviceudicarrierlist = device.getUdiCarrier();
		for(int deviceudicarrieri = 0; deviceudicarrieri<deviceudicarrierlist.size();deviceudicarrieri++ ) {
		org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent  deviceudicarrier = deviceudicarrierlist.get(deviceudicarrieri);

		/******************** Dvc_UdiCarrier_CarrierHrf ********************************************************************************/
		if(deviceudicarrieri == 0) {d.addDvcUdiCarrierCarrierHrf("[");}
		if(deviceudicarrier.hasCarrierHRF()) {

			d.addDvcUdiCarrierCarrierHrf(String.valueOf(deviceudicarrier.getCarrierHRF()));
		} else {
			d.addDvcUdiCarrierCarrierHrf("NULL");
		}

		if(deviceudicarrieri == deviceudicarrierlist.size()-1) {d.addDvcUdiCarrierCarrierHrf("]");}


		/******************** Dvc_UdiCarrier_CarrierAidc ********************************************************************************/
		if(deviceudicarrieri == 0) {d.addDvcUdiCarrierCarrierAidc("[");}
		if(deviceudicarrier.hasCarrierAIDC()) {

			d.addDvcUdiCarrierCarrierAidc(new String(deviceudicarrier.getCarrierAIDC()));
		} else {
			d.addDvcUdiCarrierCarrierAidc("NULL");
		}

		if(deviceudicarrieri == deviceudicarrierlist.size()-1) {d.addDvcUdiCarrierCarrierAidc("]");}


		/******************** deviceudicarrierentrytype ********************************************************************************/
		org.hl7.fhir.r4.model.Device.UDIEntryType deviceudicarrierentrytype = deviceudicarrier.getEntryType();
		if(deviceudicarrierentrytype!=null) {
		if(deviceudicarrieri == 0) {

		d.addDvcUdiCarrierEntryTyp("[");		}
			d.addDvcUdiCarrierEntryTyp(deviceudicarrierentrytype.toCode());
		if(deviceudicarrieri == deviceudicarrierlist.size()-1) {

		d.addDvcUdiCarrierEntryTyp("]");		}

		} else {
			d.addDvcUdiCarrierEntryTyp("NULL");
		}

		/******************** Dvc_UdiCarrier_Jrsdctn ********************************************************************************/
		if(deviceudicarrieri == 0) {d.addDvcUdiCarrierJrsdctn("[");}
		if(deviceudicarrier.hasJurisdiction()) {

			d.addDvcUdiCarrierJrsdctn(String.valueOf(deviceudicarrier.getJurisdiction()));
		} else {
			d.addDvcUdiCarrierJrsdctn("NULL");
		}

		if(deviceudicarrieri == deviceudicarrierlist.size()-1) {d.addDvcUdiCarrierJrsdctn("]");}


		/******************** Dvc_UdiCarrier_DvcId ********************************************************************************/
		if(deviceudicarrieri == 0) {d.addDvcUdiCarrierDvcId("[");}
		if(deviceudicarrier.hasDeviceIdentifier()) {

			d.addDvcUdiCarrierDvcId(String.valueOf(deviceudicarrier.getDeviceIdentifier()));
		} else {
			d.addDvcUdiCarrierDvcId("NULL");
		}

		if(deviceudicarrieri == deviceudicarrierlist.size()-1) {d.addDvcUdiCarrierDvcId("]");}


		/******************** Dvc_UdiCarrier_Issuer ********************************************************************************/
		if(deviceudicarrieri == 0) {d.addDvcUdiCarrierIssuer("[");}
		if(deviceudicarrier.hasIssuer()) {

			d.addDvcUdiCarrierIssuer(String.valueOf(deviceudicarrier.getIssuer()));
		} else {
			d.addDvcUdiCarrierIssuer("NULL");
		}

		if(deviceudicarrieri == deviceudicarrierlist.size()-1) {d.addDvcUdiCarrierIssuer("]");}


		 };
		/******************** Dvc_Owner ********************************************************************************/
		if(device.hasOwner()) {

			if(device.getOwner().getReference() != null) {
			d.addDvcOwner(device.getOwner().getReference());
			}
		} else {
			d.addDvcOwner("NULL");
		}


		return d;
	}
}
