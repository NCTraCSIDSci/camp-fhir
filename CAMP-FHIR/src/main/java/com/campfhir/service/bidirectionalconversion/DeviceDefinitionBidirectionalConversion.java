package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceDefinition;
public class DeviceDefinitionBidirectionalConversion 
{
	public DeviceDefinition DeviceDefinitions(org.hl7.fhir.r4.model.DeviceDefinition devicedefinition) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceDefinition d = new  main.java.com.campfhir.model.DeviceDefinition();

		/******************** id ********************************************************************************/
		d.setId(devicedefinition.getIdElement().getIdPart());

		/******************** devicedefinitionproperty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent> devicedefinitionpropertylist = devicedefinition.getProperty();
		for(int devicedefinitionpropertyi = 0; devicedefinitionpropertyi<devicedefinitionpropertylist.size();devicedefinitionpropertyi++ ) {
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent  devicedefinitionproperty = devicedefinitionpropertylist.get(devicedefinitionpropertyi);

		/******************** devicedefinitionpropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionpropertytype = devicedefinitionproperty.getType();

		/******************** DvcDfn_Prpty_Typ_Txt ********************************************************************************/
		if(devicedefinitionpropertyi == 0) {d.addDvcDfnPrptyTypTxt("[");}
		if(devicedefinitionpropertytype.hasText()) {

			d.addDvcDfnPrptyTypTxt(String.valueOf(devicedefinitionpropertytype.getText()));
		} else {
			d.addDvcDfnPrptyTypTxt("NULL");
		}

		if(devicedefinitionpropertyi == devicedefinitionpropertylist.size()-1) {d.addDvcDfnPrptyTypTxt("]");}


		/******************** devicedefinitionpropertytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionpropertytypecodinglist = devicedefinitionpropertytype.getCoding();
		for(int devicedefinitionpropertytypecodingi = 0; devicedefinitionpropertytypecodingi<devicedefinitionpropertytypecodinglist.size();devicedefinitionpropertytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionpropertytypecoding = devicedefinitionpropertytypecodinglist.get(devicedefinitionpropertytypecodingi);

		/******************** DvcDfn_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionpropertytypecodingi == 0) {d.addDvcDfnPrptyTypCdgDsply("[[");}
		if(devicedefinitionpropertytypecoding.hasDisplay()) {

			d.addDvcDfnPrptyTypCdgDsply(String.valueOf(devicedefinitionpropertytypecoding.getDisplay()));
		} else {
			d.addDvcDfnPrptyTypCdgDsply("NULL");
		}

		if(devicedefinitionpropertytypecodingi == devicedefinitionpropertytypecodinglist.size()-1) {d.addDvcDfnPrptyTypCdgDsply("]]");}


		/******************** DvcDfn_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionpropertytypecodingi == 0) {d.addDvcDfnPrptyTypCdgVrsn("[[");}
		if(devicedefinitionpropertytypecoding.hasVersion()) {

			d.addDvcDfnPrptyTypCdgVrsn(String.valueOf(devicedefinitionpropertytypecoding.getVersion()));
		} else {
			d.addDvcDfnPrptyTypCdgVrsn("NULL");
		}

		if(devicedefinitionpropertytypecodingi == devicedefinitionpropertytypecodinglist.size()-1) {d.addDvcDfnPrptyTypCdgVrsn("]]");}


		/******************** DvcDfn_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionpropertytypecodingi == 0) {d.addDvcDfnPrptyTypCdgCd("[[");}
		if(devicedefinitionpropertytypecoding.hasCode()) {

			d.addDvcDfnPrptyTypCdgCd(String.valueOf(devicedefinitionpropertytypecoding.getCode()));
		} else {
			d.addDvcDfnPrptyTypCdgCd("NULL");
		}

		if(devicedefinitionpropertytypecodingi == devicedefinitionpropertytypecodinglist.size()-1) {d.addDvcDfnPrptyTypCdgCd("]]");}


		/******************** DvcDfn_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionpropertytypecodingi == 0) {d.addDvcDfnPrptyTypCdgUsrSltd("[[");}
		if(devicedefinitionpropertytypecoding.hasUserSelected()) {

			d.addDvcDfnPrptyTypCdgUsrSltd(String.valueOf(devicedefinitionpropertytypecoding.getUserSelected()));
		} else {
			d.addDvcDfnPrptyTypCdgUsrSltd("NULL");
		}

		if(devicedefinitionpropertytypecodingi == devicedefinitionpropertytypecodinglist.size()-1) {d.addDvcDfnPrptyTypCdgUsrSltd("]]");}


		/******************** DvcDfn_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionpropertytypecodingi == 0) {d.addDvcDfnPrptyTypCdgSys("[[");}
		if(devicedefinitionpropertytypecoding.hasSystem()) {

			d.addDvcDfnPrptyTypCdgSys(String.valueOf(devicedefinitionpropertytypecoding.getSystem()));
		} else {
			d.addDvcDfnPrptyTypCdgSys("NULL");
		}

		if(devicedefinitionpropertytypecodingi == devicedefinitionpropertytypecodinglist.size()-1) {d.addDvcDfnPrptyTypCdgSys("]]");}


		 };
		/******************** devicedefinitionpropertyvaluecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicedefinitionpropertyvaluecodelist = devicedefinitionproperty.getValueCode();
		for(int devicedefinitionpropertyvaluecodei = 0; devicedefinitionpropertyvaluecodei<devicedefinitionpropertyvaluecodelist.size();devicedefinitionpropertyvaluecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicedefinitionpropertyvaluecode = devicedefinitionpropertyvaluecodelist.get(devicedefinitionpropertyvaluecodei);

		/******************** DvcDfn_Prpty_VlCd_Txt ********************************************************************************/
		if(devicedefinitionpropertyvaluecodei == 0) {d.addDvcDfnPrptyVlCdTxt("[[");}
		if(devicedefinitionpropertyvaluecode.hasText()) {

			d.addDvcDfnPrptyVlCdTxt(String.valueOf(devicedefinitionpropertyvaluecode.getText()));
		} else {
			d.addDvcDfnPrptyVlCdTxt("NULL");
		}

		if(devicedefinitionpropertyvaluecodei == devicedefinitionpropertyvaluecodelist.size()-1) {d.addDvcDfnPrptyVlCdTxt("]]");}


		/******************** devicedefinitionpropertyvaluecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionpropertyvaluecodecodinglist = devicedefinitionpropertyvaluecode.getCoding();
		for(int devicedefinitionpropertyvaluecodecodingi = 0; devicedefinitionpropertyvaluecodecodingi<devicedefinitionpropertyvaluecodecodinglist.size();devicedefinitionpropertyvaluecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionpropertyvaluecodecoding = devicedefinitionpropertyvaluecodecodinglist.get(devicedefinitionpropertyvaluecodecodingi);

		/******************** DvcDfn_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecodingi == 0) {d.addDvcDfnPrptyVlCdCdgDsply("[[[");}
		if(devicedefinitionpropertyvaluecodecoding.hasDisplay()) {

			d.addDvcDfnPrptyVlCdCdgDsply(String.valueOf(devicedefinitionpropertyvaluecodecoding.getDisplay()));
		} else {
			d.addDvcDfnPrptyVlCdCdgDsply("NULL");
		}

		if(devicedefinitionpropertyvaluecodecodingi == devicedefinitionpropertyvaluecodecodinglist.size()-1) {d.addDvcDfnPrptyVlCdCdgDsply("]]]");}


		/******************** DvcDfn_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecodingi == 0) {d.addDvcDfnPrptyVlCdCdgVrsn("[[[");}
		if(devicedefinitionpropertyvaluecodecoding.hasVersion()) {

			d.addDvcDfnPrptyVlCdCdgVrsn(String.valueOf(devicedefinitionpropertyvaluecodecoding.getVersion()));
		} else {
			d.addDvcDfnPrptyVlCdCdgVrsn("NULL");
		}

		if(devicedefinitionpropertyvaluecodecodingi == devicedefinitionpropertyvaluecodecodinglist.size()-1) {d.addDvcDfnPrptyVlCdCdgVrsn("]]]");}


		/******************** DvcDfn_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecodingi == 0) {d.addDvcDfnPrptyVlCdCdgCd("[[[");}
		if(devicedefinitionpropertyvaluecodecoding.hasCode()) {

			d.addDvcDfnPrptyVlCdCdgCd(String.valueOf(devicedefinitionpropertyvaluecodecoding.getCode()));
		} else {
			d.addDvcDfnPrptyVlCdCdgCd("NULL");
		}

		if(devicedefinitionpropertyvaluecodecodingi == devicedefinitionpropertyvaluecodecodinglist.size()-1) {d.addDvcDfnPrptyVlCdCdgCd("]]]");}


		/******************** DvcDfn_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecodingi == 0) {d.addDvcDfnPrptyVlCdCdgUsrSltd("[[[");}
		if(devicedefinitionpropertyvaluecodecoding.hasUserSelected()) {

			d.addDvcDfnPrptyVlCdCdgUsrSltd(String.valueOf(devicedefinitionpropertyvaluecodecoding.getUserSelected()));
		} else {
			d.addDvcDfnPrptyVlCdCdgUsrSltd("NULL");
		}

		if(devicedefinitionpropertyvaluecodecodingi == devicedefinitionpropertyvaluecodecodinglist.size()-1) {d.addDvcDfnPrptyVlCdCdgUsrSltd("]]]");}


		/******************** DvcDfn_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecodingi == 0) {d.addDvcDfnPrptyVlCdCdgSys("[[[");}
		if(devicedefinitionpropertyvaluecodecoding.hasSystem()) {

			d.addDvcDfnPrptyVlCdCdgSys(String.valueOf(devicedefinitionpropertyvaluecodecoding.getSystem()));
		} else {
			d.addDvcDfnPrptyVlCdCdgSys("NULL");
		}

		if(devicedefinitionpropertyvaluecodecodingi == devicedefinitionpropertyvaluecodecodinglist.size()-1) {d.addDvcDfnPrptyVlCdCdgSys("]]]");}


		 };
		 };
		/******************** devicedefinitionpropertyvaluequantity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Quantity> devicedefinitionpropertyvaluequantitylist = devicedefinitionproperty.getValueQuantity();
		for(int devicedefinitionpropertyvaluequantityi = 0; devicedefinitionpropertyvaluequantityi<devicedefinitionpropertyvaluequantitylist.size();devicedefinitionpropertyvaluequantityi++ ) {
		org.hl7.fhir.r4.model.Quantity  devicedefinitionpropertyvaluequantity = devicedefinitionpropertyvaluequantitylist.get(devicedefinitionpropertyvaluequantityi);

		/******************** DvcDfn_Prpty_VlQnty_Vl ********************************************************************************/
		if(devicedefinitionpropertyvaluequantityi == 0) {d.addDvcDfnPrptyVlQntyVl("[[");}
		if(devicedefinitionpropertyvaluequantity.hasValue()) {

			d.addDvcDfnPrptyVlQntyVl(String.valueOf(devicedefinitionpropertyvaluequantity.getValue()));
		} else {
			d.addDvcDfnPrptyVlQntyVl("NULL");
		}

		if(devicedefinitionpropertyvaluequantityi == devicedefinitionpropertyvaluequantitylist.size()-1) {d.addDvcDfnPrptyVlQntyVl("]]");}


		/******************** devicedefinitionpropertyvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionpropertyvaluequantitycomparator = devicedefinitionpropertyvaluequantity.getComparator();
		if(devicedefinitionpropertyvaluequantitycomparator!=null) {
		if(devicedefinitionpropertyvaluequantityi == 0) {

		d.addDvcDfnPrptyVlQntyCmprtr("[[");		}
			d.addDvcDfnPrptyVlQntyCmprtr(devicedefinitionpropertyvaluequantitycomparator.toCode());
		if(devicedefinitionpropertyvaluequantityi == devicedefinitionpropertyvaluequantitylist.size()-1) {

		d.addDvcDfnPrptyVlQntyCmprtr("]]");		}

		} else {
			d.addDvcDfnPrptyVlQntyCmprtr("NULL");
		}

		/******************** DvcDfn_Prpty_VlQnty_Cd ********************************************************************************/
		if(devicedefinitionpropertyvaluequantityi == 0) {d.addDvcDfnPrptyVlQntyCd("[[");}
		if(devicedefinitionpropertyvaluequantity.hasCode()) {

			d.addDvcDfnPrptyVlQntyCd(String.valueOf(devicedefinitionpropertyvaluequantity.getCode()));
		} else {
			d.addDvcDfnPrptyVlQntyCd("NULL");
		}

		if(devicedefinitionpropertyvaluequantityi == devicedefinitionpropertyvaluequantitylist.size()-1) {d.addDvcDfnPrptyVlQntyCd("]]");}


		/******************** DvcDfn_Prpty_VlQnty_Unt ********************************************************************************/
		if(devicedefinitionpropertyvaluequantityi == 0) {d.addDvcDfnPrptyVlQntyUnt("[[");}
		if(devicedefinitionpropertyvaluequantity.hasUnit()) {

			d.addDvcDfnPrptyVlQntyUnt(String.valueOf(devicedefinitionpropertyvaluequantity.getUnit()));
		} else {
			d.addDvcDfnPrptyVlQntyUnt("NULL");
		}

		if(devicedefinitionpropertyvaluequantityi == devicedefinitionpropertyvaluequantitylist.size()-1) {d.addDvcDfnPrptyVlQntyUnt("]]");}


		/******************** DvcDfn_Prpty_VlQnty_Sys ********************************************************************************/
		if(devicedefinitionpropertyvaluequantityi == 0) {d.addDvcDfnPrptyVlQntySys("[[");}
		if(devicedefinitionpropertyvaluequantity.hasSystem()) {

			d.addDvcDfnPrptyVlQntySys(String.valueOf(devicedefinitionpropertyvaluequantity.getSystem()));
		} else {
			d.addDvcDfnPrptyVlQntySys("NULL");
		}

		if(devicedefinitionpropertyvaluequantityi == devicedefinitionpropertyvaluequantitylist.size()-1) {d.addDvcDfnPrptyVlQntySys("]]");}


		 };
		 };
		/******************** devicedefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitiontype = devicedefinition.getType();

		/******************** DvcDfn_Typ_Txt ********************************************************************************/
		if(devicedefinitiontype.hasText()) {

			d.addDvcDfnTypTxt(String.valueOf(devicedefinitiontype.getText()));
		} else {
			d.addDvcDfnTypTxt("NULL");
		}


		/******************** devicedefinitiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitiontypecodinglist = devicedefinitiontype.getCoding();
		for(int devicedefinitiontypecodingi = 0; devicedefinitiontypecodingi<devicedefinitiontypecodinglist.size();devicedefinitiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitiontypecoding = devicedefinitiontypecodinglist.get(devicedefinitiontypecodingi);

		/******************** DvcDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitiontypecodingi == 0) {d.addDvcDfnTypCdgDsply("[");}
		if(devicedefinitiontypecoding.hasDisplay()) {

			d.addDvcDfnTypCdgDsply(String.valueOf(devicedefinitiontypecoding.getDisplay()));
		} else {
			d.addDvcDfnTypCdgDsply("NULL");
		}

		if(devicedefinitiontypecodingi == devicedefinitiontypecodinglist.size()-1) {d.addDvcDfnTypCdgDsply("]");}


		/******************** DvcDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitiontypecodingi == 0) {d.addDvcDfnTypCdgVrsn("[");}
		if(devicedefinitiontypecoding.hasVersion()) {

			d.addDvcDfnTypCdgVrsn(String.valueOf(devicedefinitiontypecoding.getVersion()));
		} else {
			d.addDvcDfnTypCdgVrsn("NULL");
		}

		if(devicedefinitiontypecodingi == devicedefinitiontypecodinglist.size()-1) {d.addDvcDfnTypCdgVrsn("]");}


		/******************** DvcDfn_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitiontypecodingi == 0) {d.addDvcDfnTypCdgCd("[");}
		if(devicedefinitiontypecoding.hasCode()) {

			d.addDvcDfnTypCdgCd(String.valueOf(devicedefinitiontypecoding.getCode()));
		} else {
			d.addDvcDfnTypCdgCd("NULL");
		}

		if(devicedefinitiontypecodingi == devicedefinitiontypecodinglist.size()-1) {d.addDvcDfnTypCdgCd("]");}


		/******************** DvcDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitiontypecodingi == 0) {d.addDvcDfnTypCdgUsrSltd("[");}
		if(devicedefinitiontypecoding.hasUserSelected()) {

			d.addDvcDfnTypCdgUsrSltd(String.valueOf(devicedefinitiontypecoding.getUserSelected()));
		} else {
			d.addDvcDfnTypCdgUsrSltd("NULL");
		}

		if(devicedefinitiontypecodingi == devicedefinitiontypecodinglist.size()-1) {d.addDvcDfnTypCdgUsrSltd("]");}


		/******************** DvcDfn_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitiontypecodingi == 0) {d.addDvcDfnTypCdgSys("[");}
		if(devicedefinitiontypecoding.hasSystem()) {

			d.addDvcDfnTypCdgSys(String.valueOf(devicedefinitiontypecoding.getSystem()));
		} else {
			d.addDvcDfnTypCdgSys("NULL");
		}

		if(devicedefinitiontypecodingi == devicedefinitiontypecodinglist.size()-1) {d.addDvcDfnTypCdgSys("]");}


		 };
		/******************** DvcDfn_Vrsn ********************************************************************************/
		if(devicedefinition.hasVersion()) {

			String  array = "[";
			for(int incr=0; incr<devicedefinition.getVersion().size(); incr++) {
				array = array + devicedefinition.getVersion().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcDfnVrsn(array);

		} else {
			d.addDvcDfnVrsn("NULL");
		}


		/******************** devicedefinitionnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> devicedefinitionnotelist = devicedefinition.getNote();
		for(int devicedefinitionnotei = 0; devicedefinitionnotei<devicedefinitionnotelist.size();devicedefinitionnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  devicedefinitionnote = devicedefinitionnotelist.get(devicedefinitionnotei);

		/******************** DvcDfn_Nt_Time ********************************************************************************/
		if(devicedefinitionnotei == 0) {d.addDvcDfnNtTime("[");}
		if(devicedefinitionnote.hasTime()) {

			d.addDvcDfnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitionnote.getTime())+"\"");
		} else {
			d.addDvcDfnNtTime("NULL");
		}

		if(devicedefinitionnotei == devicedefinitionnotelist.size()-1) {d.addDvcDfnNtTime("]");}


		/******************** DvcDfn_Nt_AthrRfrnc ********************************************************************************/
		if(devicedefinitionnotei == 0) {d.addDvcDfnNtAthrRfrnc("[");}
		if(devicedefinitionnote.hasAuthorReference()) {

			if(devicedefinitionnote.getAuthorReference().getReference() != null) {
			d.addDvcDfnNtAthrRfrnc(devicedefinitionnote.getAuthorReference().getReference());
			}
		} else {
			d.addDvcDfnNtAthrRfrnc("NULL");
		}

		if(devicedefinitionnotei == devicedefinitionnotelist.size()-1) {d.addDvcDfnNtAthrRfrnc("]");}


		/******************** DvcDfn_Nt_Txt ********************************************************************************/
		if(devicedefinitionnotei == 0) {d.addDvcDfnNtTxt("[");}
		if(devicedefinitionnote.hasText()) {

			d.addDvcDfnNtTxt(String.valueOf(devicedefinitionnote.getText()));
		} else {
			d.addDvcDfnNtTxt("NULL");
		}

		if(devicedefinitionnotei == devicedefinitionnotelist.size()-1) {d.addDvcDfnNtTxt("]");}


		/******************** DvcDfn_Nt_AthrStrgTyp ********************************************************************************/
		if(devicedefinitionnotei == 0) {d.addDvcDfnNtAthrStrgTyp("[");}
		if(devicedefinitionnote.hasAuthorStringType()) {

			d.addDvcDfnNtAthrStrgTyp("\""+devicedefinitionnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			d.addDvcDfnNtAthrStrgTyp("NULL");
		}

		if(devicedefinitionnotei == devicedefinitionnotelist.size()-1) {d.addDvcDfnNtAthrStrgTyp("]");}


		 };
		/******************** devicedefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> devicedefinitionidentifierlist = devicedefinition.getIdentifier();
		for(int devicedefinitionidentifieri = 0; devicedefinitionidentifieri<devicedefinitionidentifierlist.size();devicedefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  devicedefinitionidentifier = devicedefinitionidentifierlist.get(devicedefinitionidentifieri);

		/******************** DvcDfn_Id_Vl ********************************************************************************/
		if(devicedefinitionidentifieri == 0) {d.addDvcDfnIdVl("[");}
		if(devicedefinitionidentifier.hasValue()) {

			d.addDvcDfnIdVl(String.valueOf(devicedefinitionidentifier.getValue()));
		} else {
			d.addDvcDfnIdVl("NULL");
		}

		if(devicedefinitionidentifieri == devicedefinitionidentifierlist.size()-1) {d.addDvcDfnIdVl("]");}


		/******************** devicedefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionidentifiertype = devicedefinitionidentifier.getType();

		/******************** DvcDfn_Id_Typ_Txt ********************************************************************************/
		if(devicedefinitionidentifieri == 0) {d.addDvcDfnIdTypTxt("[");}
		if(devicedefinitionidentifiertype.hasText()) {

			d.addDvcDfnIdTypTxt(String.valueOf(devicedefinitionidentifiertype.getText()));
		} else {
			d.addDvcDfnIdTypTxt("NULL");
		}

		if(devicedefinitionidentifieri == devicedefinitionidentifierlist.size()-1) {d.addDvcDfnIdTypTxt("]");}


		/******************** devicedefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionidentifiertypecodinglist = devicedefinitionidentifiertype.getCoding();
		for(int devicedefinitionidentifiertypecodingi = 0; devicedefinitionidentifiertypecodingi<devicedefinitionidentifiertypecodinglist.size();devicedefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionidentifiertypecoding = devicedefinitionidentifiertypecodinglist.get(devicedefinitionidentifiertypecodingi);

		/******************** DvcDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionidentifiertypecodingi == 0) {d.addDvcDfnIdTypCdgDsply("[[");}
		if(devicedefinitionidentifiertypecoding.hasDisplay()) {

			d.addDvcDfnIdTypCdgDsply(String.valueOf(devicedefinitionidentifiertypecoding.getDisplay()));
		} else {
			d.addDvcDfnIdTypCdgDsply("NULL");
		}

		if(devicedefinitionidentifiertypecodingi == devicedefinitionidentifiertypecodinglist.size()-1) {d.addDvcDfnIdTypCdgDsply("]]");}


		/******************** DvcDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionidentifiertypecodingi == 0) {d.addDvcDfnIdTypCdgVrsn("[[");}
		if(devicedefinitionidentifiertypecoding.hasVersion()) {

			d.addDvcDfnIdTypCdgVrsn(String.valueOf(devicedefinitionidentifiertypecoding.getVersion()));
		} else {
			d.addDvcDfnIdTypCdgVrsn("NULL");
		}

		if(devicedefinitionidentifiertypecodingi == devicedefinitionidentifiertypecodinglist.size()-1) {d.addDvcDfnIdTypCdgVrsn("]]");}


		/******************** DvcDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionidentifiertypecodingi == 0) {d.addDvcDfnIdTypCdgCd("[[");}
		if(devicedefinitionidentifiertypecoding.hasCode()) {

			d.addDvcDfnIdTypCdgCd(String.valueOf(devicedefinitionidentifiertypecoding.getCode()));
		} else {
			d.addDvcDfnIdTypCdgCd("NULL");
		}

		if(devicedefinitionidentifiertypecodingi == devicedefinitionidentifiertypecodinglist.size()-1) {d.addDvcDfnIdTypCdgCd("]]");}


		/******************** DvcDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionidentifiertypecodingi == 0) {d.addDvcDfnIdTypCdgUsrSltd("[[");}
		if(devicedefinitionidentifiertypecoding.hasUserSelected()) {

			d.addDvcDfnIdTypCdgUsrSltd(String.valueOf(devicedefinitionidentifiertypecoding.getUserSelected()));
		} else {
			d.addDvcDfnIdTypCdgUsrSltd("NULL");
		}

		if(devicedefinitionidentifiertypecodingi == devicedefinitionidentifiertypecodinglist.size()-1) {d.addDvcDfnIdTypCdgUsrSltd("]]");}


		/******************** DvcDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionidentifiertypecodingi == 0) {d.addDvcDfnIdTypCdgSys("[[");}
		if(devicedefinitionidentifiertypecoding.hasSystem()) {

			d.addDvcDfnIdTypCdgSys(String.valueOf(devicedefinitionidentifiertypecoding.getSystem()));
		} else {
			d.addDvcDfnIdTypCdgSys("NULL");
		}

		if(devicedefinitionidentifiertypecodingi == devicedefinitionidentifiertypecodinglist.size()-1) {d.addDvcDfnIdTypCdgSys("]]");}


		 };
		/******************** devicedefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitionidentifierperiod = devicedefinitionidentifier.getPeriod();

		/******************** DvcDfn_Id_Prd_Strt ********************************************************************************/
		if(devicedefinitionidentifieri == 0) {d.addDvcDfnIdPrdStrt("[");}
		if(devicedefinitionidentifierperiod.hasStart()) {

			d.addDvcDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitionidentifierperiod.getStart())+"\"");
		} else {
			d.addDvcDfnIdPrdStrt("NULL");
		}

		if(devicedefinitionidentifieri == devicedefinitionidentifierlist.size()-1) {d.addDvcDfnIdPrdStrt("]");}


		/******************** DvcDfn_Id_Prd_End ********************************************************************************/
		if(devicedefinitionidentifieri == 0) {d.addDvcDfnIdPrdEnd("[");}
		if(devicedefinitionidentifierperiod.hasEnd()) {

			d.addDvcDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitionidentifierperiod.getEnd())+"\"");
		} else {
			d.addDvcDfnIdPrdEnd("NULL");
		}

		if(devicedefinitionidentifieri == devicedefinitionidentifierlist.size()-1) {d.addDvcDfnIdPrdEnd("]");}


		/******************** devicedefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicedefinitionidentifieruse = devicedefinitionidentifier.getUse();
		if(devicedefinitionidentifieruse!=null) {
		if(devicedefinitionidentifieri == 0) {

		d.addDvcDfnIdUse("[");		}
			d.addDvcDfnIdUse(devicedefinitionidentifieruse.toCode());
		if(devicedefinitionidentifieri == devicedefinitionidentifierlist.size()-1) {

		d.addDvcDfnIdUse("]");		}

		} else {
			d.addDvcDfnIdUse("NULL");
		}

		/******************** DvcDfn_Id_Assigner ********************************************************************************/
		if(devicedefinitionidentifieri == 0) {d.addDvcDfnIdAssigner("[");}
		if(devicedefinitionidentifier.hasAssigner()) {

			if(devicedefinitionidentifier.getAssigner().getReference() != null) {
			d.addDvcDfnIdAssigner(devicedefinitionidentifier.getAssigner().getReference());
			}
		} else {
			d.addDvcDfnIdAssigner("NULL");
		}

		if(devicedefinitionidentifieri == devicedefinitionidentifierlist.size()-1) {d.addDvcDfnIdAssigner("]");}


		/******************** DvcDfn_Id_Sys ********************************************************************************/
		if(devicedefinitionidentifieri == 0) {d.addDvcDfnIdSys("[");}
		if(devicedefinitionidentifier.hasSystem()) {

			d.addDvcDfnIdSys(String.valueOf(devicedefinitionidentifier.getSystem()));
		} else {
			d.addDvcDfnIdSys("NULL");
		}

		if(devicedefinitionidentifieri == devicedefinitionidentifierlist.size()-1) {d.addDvcDfnIdSys("]");}


		 };
		/******************** devicedefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> devicedefinitioncontactlist = devicedefinition.getContact();
		for(int devicedefinitioncontacti = 0; devicedefinitioncontacti<devicedefinitioncontactlist.size();devicedefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactPoint  devicedefinitioncontact = devicedefinitioncontactlist.get(devicedefinitioncontacti);

		/******************** DvcDfn_Cntct_Vl ********************************************************************************/
		if(devicedefinitioncontacti == 0) {d.addDvcDfnCntctVl("[");}
		if(devicedefinitioncontact.hasValue()) {

			d.addDvcDfnCntctVl(String.valueOf(devicedefinitioncontact.getValue()));
		} else {
			d.addDvcDfnCntctVl("NULL");
		}

		if(devicedefinitioncontacti == devicedefinitioncontactlist.size()-1) {d.addDvcDfnCntctVl("]");}


		/******************** devicedefinitioncontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitioncontactperiod = devicedefinitioncontact.getPeriod();

		/******************** DvcDfn_Cntct_Prd_Strt ********************************************************************************/
		if(devicedefinitioncontacti == 0) {d.addDvcDfnCntctPrdStrt("[");}
		if(devicedefinitioncontactperiod.hasStart()) {

			d.addDvcDfnCntctPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitioncontactperiod.getStart())+"\"");
		} else {
			d.addDvcDfnCntctPrdStrt("NULL");
		}

		if(devicedefinitioncontacti == devicedefinitioncontactlist.size()-1) {d.addDvcDfnCntctPrdStrt("]");}


		/******************** DvcDfn_Cntct_Prd_End ********************************************************************************/
		if(devicedefinitioncontacti == 0) {d.addDvcDfnCntctPrdEnd("[");}
		if(devicedefinitioncontactperiod.hasEnd()) {

			d.addDvcDfnCntctPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitioncontactperiod.getEnd())+"\"");
		} else {
			d.addDvcDfnCntctPrdEnd("NULL");
		}

		if(devicedefinitioncontacti == devicedefinitioncontactlist.size()-1) {d.addDvcDfnCntctPrdEnd("]");}


		/******************** devicedefinitioncontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse devicedefinitioncontactuse = devicedefinitioncontact.getUse();
		if(devicedefinitioncontactuse!=null) {
		if(devicedefinitioncontacti == 0) {

		d.addDvcDfnCntctUse("[");		}
			d.addDvcDfnCntctUse(devicedefinitioncontactuse.toCode());
		if(devicedefinitioncontacti == devicedefinitioncontactlist.size()-1) {

		d.addDvcDfnCntctUse("]");		}

		} else {
			d.addDvcDfnCntctUse("NULL");
		}

		/******************** devicedefinitioncontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem devicedefinitioncontactsystem = devicedefinitioncontact.getSystem();
		if(devicedefinitioncontactsystem!=null) {
		if(devicedefinitioncontacti == 0) {

		d.addDvcDfnCntctSys("[");		}
			d.addDvcDfnCntctSys(devicedefinitioncontactsystem.toCode());
		if(devicedefinitioncontacti == devicedefinitioncontactlist.size()-1) {

		d.addDvcDfnCntctSys("]");		}

		} else {
			d.addDvcDfnCntctSys("NULL");
		}

		/******************** DvcDfn_Cntct_Rnk ********************************************************************************/
		if(devicedefinitioncontacti == 0) {d.addDvcDfnCntctRnk("[");}
		if(devicedefinitioncontact.hasRank()) {

			d.addDvcDfnCntctRnk(String.valueOf(devicedefinitioncontact.getRank()));
		} else {
			d.addDvcDfnCntctRnk("NULL");
		}

		if(devicedefinitioncontacti == devicedefinitioncontactlist.size()-1) {d.addDvcDfnCntctRnk("]");}


		 };
		/******************** devicedefinitionlanguagecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicedefinitionlanguagecodelist = devicedefinition.getLanguageCode();
		for(int devicedefinitionlanguagecodei = 0; devicedefinitionlanguagecodei<devicedefinitionlanguagecodelist.size();devicedefinitionlanguagecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicedefinitionlanguagecode = devicedefinitionlanguagecodelist.get(devicedefinitionlanguagecodei);

		/******************** DvcDfn_LnguageCd_Txt ********************************************************************************/
		if(devicedefinitionlanguagecodei == 0) {d.addDvcDfnLnguageCdTxt("[");}
		if(devicedefinitionlanguagecode.hasText()) {

			d.addDvcDfnLnguageCdTxt(String.valueOf(devicedefinitionlanguagecode.getText()));
		} else {
			d.addDvcDfnLnguageCdTxt("NULL");
		}

		if(devicedefinitionlanguagecodei == devicedefinitionlanguagecodelist.size()-1) {d.addDvcDfnLnguageCdTxt("]");}


		/******************** devicedefinitionlanguagecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionlanguagecodecodinglist = devicedefinitionlanguagecode.getCoding();
		for(int devicedefinitionlanguagecodecodingi = 0; devicedefinitionlanguagecodecodingi<devicedefinitionlanguagecodecodinglist.size();devicedefinitionlanguagecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionlanguagecodecoding = devicedefinitionlanguagecodecodinglist.get(devicedefinitionlanguagecodecodingi);

		/******************** DvcDfn_LnguageCd_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionlanguagecodecodingi == 0) {d.addDvcDfnLnguageCdCdgDsply("[[");}
		if(devicedefinitionlanguagecodecoding.hasDisplay()) {

			d.addDvcDfnLnguageCdCdgDsply(String.valueOf(devicedefinitionlanguagecodecoding.getDisplay()));
		} else {
			d.addDvcDfnLnguageCdCdgDsply("NULL");
		}

		if(devicedefinitionlanguagecodecodingi == devicedefinitionlanguagecodecodinglist.size()-1) {d.addDvcDfnLnguageCdCdgDsply("]]");}


		/******************** DvcDfn_LnguageCd_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionlanguagecodecodingi == 0) {d.addDvcDfnLnguageCdCdgVrsn("[[");}
		if(devicedefinitionlanguagecodecoding.hasVersion()) {

			d.addDvcDfnLnguageCdCdgVrsn(String.valueOf(devicedefinitionlanguagecodecoding.getVersion()));
		} else {
			d.addDvcDfnLnguageCdCdgVrsn("NULL");
		}

		if(devicedefinitionlanguagecodecodingi == devicedefinitionlanguagecodecodinglist.size()-1) {d.addDvcDfnLnguageCdCdgVrsn("]]");}


		/******************** DvcDfn_LnguageCd_Cdg_Cd ********************************************************************************/
		if(devicedefinitionlanguagecodecodingi == 0) {d.addDvcDfnLnguageCdCdgCd("[[");}
		if(devicedefinitionlanguagecodecoding.hasCode()) {

			d.addDvcDfnLnguageCdCdgCd(String.valueOf(devicedefinitionlanguagecodecoding.getCode()));
		} else {
			d.addDvcDfnLnguageCdCdgCd("NULL");
		}

		if(devicedefinitionlanguagecodecodingi == devicedefinitionlanguagecodecodinglist.size()-1) {d.addDvcDfnLnguageCdCdgCd("]]");}


		/******************** DvcDfn_LnguageCd_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionlanguagecodecodingi == 0) {d.addDvcDfnLnguageCdCdgUsrSltd("[[");}
		if(devicedefinitionlanguagecodecoding.hasUserSelected()) {

			d.addDvcDfnLnguageCdCdgUsrSltd(String.valueOf(devicedefinitionlanguagecodecoding.getUserSelected()));
		} else {
			d.addDvcDfnLnguageCdCdgUsrSltd("NULL");
		}

		if(devicedefinitionlanguagecodecodingi == devicedefinitionlanguagecodecodinglist.size()-1) {d.addDvcDfnLnguageCdCdgUsrSltd("]]");}


		/******************** DvcDfn_LnguageCd_Cdg_Sys ********************************************************************************/
		if(devicedefinitionlanguagecodecodingi == 0) {d.addDvcDfnLnguageCdCdgSys("[[");}
		if(devicedefinitionlanguagecodecoding.hasSystem()) {

			d.addDvcDfnLnguageCdCdgSys(String.valueOf(devicedefinitionlanguagecodecoding.getSystem()));
		} else {
			d.addDvcDfnLnguageCdCdgSys("NULL");
		}

		if(devicedefinitionlanguagecodecodingi == devicedefinitionlanguagecodecodinglist.size()-1) {d.addDvcDfnLnguageCdCdgSys("]]");}


		 };
		 };
		/******************** devicedefinitioncapability ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent> devicedefinitioncapabilitylist = devicedefinition.getCapability();
		for(int devicedefinitioncapabilityi = 0; devicedefinitioncapabilityi<devicedefinitioncapabilitylist.size();devicedefinitioncapabilityi++ ) {
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent  devicedefinitioncapability = devicedefinitioncapabilitylist.get(devicedefinitioncapabilityi);

		/******************** devicedefinitioncapabilitytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitioncapabilitytype = devicedefinitioncapability.getType();

		/******************** DvcDfn_Capblty_Typ_Txt ********************************************************************************/
		if(devicedefinitioncapabilityi == 0) {d.addDvcDfnCapbltyTypTxt("[");}
		if(devicedefinitioncapabilitytype.hasText()) {

			d.addDvcDfnCapbltyTypTxt(String.valueOf(devicedefinitioncapabilitytype.getText()));
		} else {
			d.addDvcDfnCapbltyTypTxt("NULL");
		}

		if(devicedefinitioncapabilityi == devicedefinitioncapabilitylist.size()-1) {d.addDvcDfnCapbltyTypTxt("]");}


		/******************** devicedefinitioncapabilitytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitioncapabilitytypecodinglist = devicedefinitioncapabilitytype.getCoding();
		for(int devicedefinitioncapabilitytypecodingi = 0; devicedefinitioncapabilitytypecodingi<devicedefinitioncapabilitytypecodinglist.size();devicedefinitioncapabilitytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitioncapabilitytypecoding = devicedefinitioncapabilitytypecodinglist.get(devicedefinitioncapabilitytypecodingi);

		/******************** DvcDfn_Capblty_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitioncapabilitytypecodingi == 0) {d.addDvcDfnCapbltyTypCdgDsply("[[");}
		if(devicedefinitioncapabilitytypecoding.hasDisplay()) {

			d.addDvcDfnCapbltyTypCdgDsply(String.valueOf(devicedefinitioncapabilitytypecoding.getDisplay()));
		} else {
			d.addDvcDfnCapbltyTypCdgDsply("NULL");
		}

		if(devicedefinitioncapabilitytypecodingi == devicedefinitioncapabilitytypecodinglist.size()-1) {d.addDvcDfnCapbltyTypCdgDsply("]]");}


		/******************** DvcDfn_Capblty_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitioncapabilitytypecodingi == 0) {d.addDvcDfnCapbltyTypCdgVrsn("[[");}
		if(devicedefinitioncapabilitytypecoding.hasVersion()) {

			d.addDvcDfnCapbltyTypCdgVrsn(String.valueOf(devicedefinitioncapabilitytypecoding.getVersion()));
		} else {
			d.addDvcDfnCapbltyTypCdgVrsn("NULL");
		}

		if(devicedefinitioncapabilitytypecodingi == devicedefinitioncapabilitytypecodinglist.size()-1) {d.addDvcDfnCapbltyTypCdgVrsn("]]");}


		/******************** DvcDfn_Capblty_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitioncapabilitytypecodingi == 0) {d.addDvcDfnCapbltyTypCdgCd("[[");}
		if(devicedefinitioncapabilitytypecoding.hasCode()) {

			d.addDvcDfnCapbltyTypCdgCd(String.valueOf(devicedefinitioncapabilitytypecoding.getCode()));
		} else {
			d.addDvcDfnCapbltyTypCdgCd("NULL");
		}

		if(devicedefinitioncapabilitytypecodingi == devicedefinitioncapabilitytypecodinglist.size()-1) {d.addDvcDfnCapbltyTypCdgCd("]]");}


		/******************** DvcDfn_Capblty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitioncapabilitytypecodingi == 0) {d.addDvcDfnCapbltyTypCdgUsrSltd("[[");}
		if(devicedefinitioncapabilitytypecoding.hasUserSelected()) {

			d.addDvcDfnCapbltyTypCdgUsrSltd(String.valueOf(devicedefinitioncapabilitytypecoding.getUserSelected()));
		} else {
			d.addDvcDfnCapbltyTypCdgUsrSltd("NULL");
		}

		if(devicedefinitioncapabilitytypecodingi == devicedefinitioncapabilitytypecodinglist.size()-1) {d.addDvcDfnCapbltyTypCdgUsrSltd("]]");}


		/******************** DvcDfn_Capblty_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitioncapabilitytypecodingi == 0) {d.addDvcDfnCapbltyTypCdgSys("[[");}
		if(devicedefinitioncapabilitytypecoding.hasSystem()) {

			d.addDvcDfnCapbltyTypCdgSys(String.valueOf(devicedefinitioncapabilitytypecoding.getSystem()));
		} else {
			d.addDvcDfnCapbltyTypCdgSys("NULL");
		}

		if(devicedefinitioncapabilitytypecodingi == devicedefinitioncapabilitytypecodinglist.size()-1) {d.addDvcDfnCapbltyTypCdgSys("]]");}


		 };
		/******************** devicedefinitioncapabilitydescription ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicedefinitioncapabilitydescriptionlist = devicedefinitioncapability.getDescription();
		for(int devicedefinitioncapabilitydescriptioni = 0; devicedefinitioncapabilitydescriptioni<devicedefinitioncapabilitydescriptionlist.size();devicedefinitioncapabilitydescriptioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicedefinitioncapabilitydescription = devicedefinitioncapabilitydescriptionlist.get(devicedefinitioncapabilitydescriptioni);

		/******************** DvcDfn_Capblty_Dscrptn_Txt ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioni == 0) {d.addDvcDfnCapbltyDscrptnTxt("[[");}
		if(devicedefinitioncapabilitydescription.hasText()) {

			d.addDvcDfnCapbltyDscrptnTxt(String.valueOf(devicedefinitioncapabilitydescription.getText()));
		} else {
			d.addDvcDfnCapbltyDscrptnTxt("NULL");
		}

		if(devicedefinitioncapabilitydescriptioni == devicedefinitioncapabilitydescriptionlist.size()-1) {d.addDvcDfnCapbltyDscrptnTxt("]]");}


		/******************** devicedefinitioncapabilitydescriptioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitioncapabilitydescriptioncodinglist = devicedefinitioncapabilitydescription.getCoding();
		for(int devicedefinitioncapabilitydescriptioncodingi = 0; devicedefinitioncapabilitydescriptioncodingi<devicedefinitioncapabilitydescriptioncodinglist.size();devicedefinitioncapabilitydescriptioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitioncapabilitydescriptioncoding = devicedefinitioncapabilitydescriptioncodinglist.get(devicedefinitioncapabilitydescriptioncodingi);

		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncodingi == 0) {d.addDvcDfnCapbltyDscrptnCdgDsply("[[[");}
		if(devicedefinitioncapabilitydescriptioncoding.hasDisplay()) {

			d.addDvcDfnCapbltyDscrptnCdgDsply(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getDisplay()));
		} else {
			d.addDvcDfnCapbltyDscrptnCdgDsply("NULL");
		}

		if(devicedefinitioncapabilitydescriptioncodingi == devicedefinitioncapabilitydescriptioncodinglist.size()-1) {d.addDvcDfnCapbltyDscrptnCdgDsply("]]]");}


		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncodingi == 0) {d.addDvcDfnCapbltyDscrptnCdgVrsn("[[[");}
		if(devicedefinitioncapabilitydescriptioncoding.hasVersion()) {

			d.addDvcDfnCapbltyDscrptnCdgVrsn(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getVersion()));
		} else {
			d.addDvcDfnCapbltyDscrptnCdgVrsn("NULL");
		}

		if(devicedefinitioncapabilitydescriptioncodingi == devicedefinitioncapabilitydescriptioncodinglist.size()-1) {d.addDvcDfnCapbltyDscrptnCdgVrsn("]]]");}


		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Cd ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncodingi == 0) {d.addDvcDfnCapbltyDscrptnCdgCd("[[[");}
		if(devicedefinitioncapabilitydescriptioncoding.hasCode()) {

			d.addDvcDfnCapbltyDscrptnCdgCd(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getCode()));
		} else {
			d.addDvcDfnCapbltyDscrptnCdgCd("NULL");
		}

		if(devicedefinitioncapabilitydescriptioncodingi == devicedefinitioncapabilitydescriptioncodinglist.size()-1) {d.addDvcDfnCapbltyDscrptnCdgCd("]]]");}


		/******************** DvcDfn_Capblty_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncodingi == 0) {d.addDvcDfnCapbltyDscrptnCdgUsrSltd("[[[");}
		if(devicedefinitioncapabilitydescriptioncoding.hasUserSelected()) {

			d.addDvcDfnCapbltyDscrptnCdgUsrSltd(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getUserSelected()));
		} else {
			d.addDvcDfnCapbltyDscrptnCdgUsrSltd("NULL");
		}

		if(devicedefinitioncapabilitydescriptioncodingi == devicedefinitioncapabilitydescriptioncodinglist.size()-1) {d.addDvcDfnCapbltyDscrptnCdgUsrSltd("]]]");}


		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Sys ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncodingi == 0) {d.addDvcDfnCapbltyDscrptnCdgSys("[[[");}
		if(devicedefinitioncapabilitydescriptioncoding.hasSystem()) {

			d.addDvcDfnCapbltyDscrptnCdgSys(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getSystem()));
		} else {
			d.addDvcDfnCapbltyDscrptnCdgSys("NULL");
		}

		if(devicedefinitioncapabilitydescriptioncodingi == devicedefinitioncapabilitydescriptioncodinglist.size()-1) {d.addDvcDfnCapbltyDscrptnCdgSys("]]]");}


		 };
		 };
		 };
		/******************** devicedefinitionmaterial ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent> devicedefinitionmateriallist = devicedefinition.getMaterial();
		for(int devicedefinitionmateriali = 0; devicedefinitionmateriali<devicedefinitionmateriallist.size();devicedefinitionmateriali++ ) {
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent  devicedefinitionmaterial = devicedefinitionmateriallist.get(devicedefinitionmateriali);

		/******************** DvcDfn_Mtrl_Alternate ********************************************************************************/
		if(devicedefinitionmateriali == 0) {d.addDvcDfnMtrlAlternate("[");}
		if(devicedefinitionmaterial.hasAlternate()) {

			d.addDvcDfnMtrlAlternate(String.valueOf(devicedefinitionmaterial.getAlternate()));
		} else {
			d.addDvcDfnMtrlAlternate("NULL");
		}

		if(devicedefinitionmateriali == devicedefinitionmateriallist.size()-1) {d.addDvcDfnMtrlAlternate("]");}


		/******************** devicedefinitionmaterialsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionmaterialsubstance = devicedefinitionmaterial.getSubstance();

		/******************** DvcDfn_Mtrl_Sbstnc_Txt ********************************************************************************/
		if(devicedefinitionmateriali == 0) {d.addDvcDfnMtrlSbstncTxt("[");}
		if(devicedefinitionmaterialsubstance.hasText()) {

			d.addDvcDfnMtrlSbstncTxt(String.valueOf(devicedefinitionmaterialsubstance.getText()));
		} else {
			d.addDvcDfnMtrlSbstncTxt("NULL");
		}

		if(devicedefinitionmateriali == devicedefinitionmateriallist.size()-1) {d.addDvcDfnMtrlSbstncTxt("]");}


		/******************** devicedefinitionmaterialsubstancecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionmaterialsubstancecodinglist = devicedefinitionmaterialsubstance.getCoding();
		for(int devicedefinitionmaterialsubstancecodingi = 0; devicedefinitionmaterialsubstancecodingi<devicedefinitionmaterialsubstancecodinglist.size();devicedefinitionmaterialsubstancecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionmaterialsubstancecoding = devicedefinitionmaterialsubstancecodinglist.get(devicedefinitionmaterialsubstancecodingi);

		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionmaterialsubstancecodingi == 0) {d.addDvcDfnMtrlSbstncCdgDsply("[[");}
		if(devicedefinitionmaterialsubstancecoding.hasDisplay()) {

			d.addDvcDfnMtrlSbstncCdgDsply(String.valueOf(devicedefinitionmaterialsubstancecoding.getDisplay()));
		} else {
			d.addDvcDfnMtrlSbstncCdgDsply("NULL");
		}

		if(devicedefinitionmaterialsubstancecodingi == devicedefinitionmaterialsubstancecodinglist.size()-1) {d.addDvcDfnMtrlSbstncCdgDsply("]]");}


		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionmaterialsubstancecodingi == 0) {d.addDvcDfnMtrlSbstncCdgVrsn("[[");}
		if(devicedefinitionmaterialsubstancecoding.hasVersion()) {

			d.addDvcDfnMtrlSbstncCdgVrsn(String.valueOf(devicedefinitionmaterialsubstancecoding.getVersion()));
		} else {
			d.addDvcDfnMtrlSbstncCdgVrsn("NULL");
		}

		if(devicedefinitionmaterialsubstancecodingi == devicedefinitionmaterialsubstancecodinglist.size()-1) {d.addDvcDfnMtrlSbstncCdgVrsn("]]");}


		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Cd ********************************************************************************/
		if(devicedefinitionmaterialsubstancecodingi == 0) {d.addDvcDfnMtrlSbstncCdgCd("[[");}
		if(devicedefinitionmaterialsubstancecoding.hasCode()) {

			d.addDvcDfnMtrlSbstncCdgCd(String.valueOf(devicedefinitionmaterialsubstancecoding.getCode()));
		} else {
			d.addDvcDfnMtrlSbstncCdgCd("NULL");
		}

		if(devicedefinitionmaterialsubstancecodingi == devicedefinitionmaterialsubstancecodinglist.size()-1) {d.addDvcDfnMtrlSbstncCdgCd("]]");}


		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionmaterialsubstancecodingi == 0) {d.addDvcDfnMtrlSbstncCdgUsrSltd("[[");}
		if(devicedefinitionmaterialsubstancecoding.hasUserSelected()) {

			d.addDvcDfnMtrlSbstncCdgUsrSltd(String.valueOf(devicedefinitionmaterialsubstancecoding.getUserSelected()));
		} else {
			d.addDvcDfnMtrlSbstncCdgUsrSltd("NULL");
		}

		if(devicedefinitionmaterialsubstancecodingi == devicedefinitionmaterialsubstancecodinglist.size()-1) {d.addDvcDfnMtrlSbstncCdgUsrSltd("]]");}


		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Sys ********************************************************************************/
		if(devicedefinitionmaterialsubstancecodingi == 0) {d.addDvcDfnMtrlSbstncCdgSys("[[");}
		if(devicedefinitionmaterialsubstancecoding.hasSystem()) {

			d.addDvcDfnMtrlSbstncCdgSys(String.valueOf(devicedefinitionmaterialsubstancecoding.getSystem()));
		} else {
			d.addDvcDfnMtrlSbstncCdgSys("NULL");
		}

		if(devicedefinitionmaterialsubstancecodingi == devicedefinitionmaterialsubstancecodinglist.size()-1) {d.addDvcDfnMtrlSbstncCdgSys("]]");}


		 };
		/******************** DvcDfn_Mtrl_AllergenicIndicator ********************************************************************************/
		if(devicedefinitionmateriali == 0) {d.addDvcDfnMtrlAllergenicIndicator("[");}
		if(devicedefinitionmaterial.hasAllergenicIndicator()) {

			d.addDvcDfnMtrlAllergenicIndicator(String.valueOf(devicedefinitionmaterial.getAllergenicIndicator()));
		} else {
			d.addDvcDfnMtrlAllergenicIndicator("NULL");
		}

		if(devicedefinitionmateriali == devicedefinitionmateriallist.size()-1) {d.addDvcDfnMtrlAllergenicIndicator("]");}


		 };
		/******************** DvcDfn_ParentDvc ********************************************************************************/
		if(devicedefinition.hasParentDevice()) {

			if(devicedefinition.getParentDevice().getReference() != null) {
			d.addDvcDfnParentDvc(devicedefinition.getParentDevice().getReference());
			}
		} else {
			d.addDvcDfnParentDvc("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic devicedefinitionphysicalcharacteristics = devicedefinition.getPhysicalCharacteristics();

		/******************** DvcDfn_PhysclCrctrstcs_Shape ********************************************************************************/
		if(devicedefinitionphysicalcharacteristics.hasShape()) {

			d.addDvcDfnPhysclCrctrstcsShape(String.valueOf(devicedefinitionphysicalcharacteristics.getShape()));
		} else {
			d.addDvcDfnPhysclCrctrstcsShape("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsimage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> devicedefinitionphysicalcharacteristicsimagelist = devicedefinitionphysicalcharacteristics.getImage();
		for(int devicedefinitionphysicalcharacteristicsimagei = 0; devicedefinitionphysicalcharacteristicsimagei<devicedefinitionphysicalcharacteristicsimagelist.size();devicedefinitionphysicalcharacteristicsimagei++ ) {
		org.hl7.fhir.r4.model.Attachment  devicedefinitionphysicalcharacteristicsimage = devicedefinitionphysicalcharacteristicsimagelist.get(devicedefinitionphysicalcharacteristicsimagei);

		/******************** DvcDfn_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageSz("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasSize()) {

			d.addDvcDfnPhysclCrctrstcsImageSz(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getSize()));
		} else {
			d.addDvcDfnPhysclCrctrstcsImageSz("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageSz("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageLnguage("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasLanguage()) {

			d.addDvcDfnPhysclCrctrstcsImageLnguage(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getLanguage()));
		} else {
			d.addDvcDfnPhysclCrctrstcsImageLnguage("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageLnguage("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageCntntTyp("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasContentType()) {

			d.addDvcDfnPhysclCrctrstcsImageCntntTyp(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getContentType()));
		} else {
			d.addDvcDfnPhysclCrctrstcsImageCntntTyp("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageCntntTyp("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageHash("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasHash()) {

			d.addDvcDfnPhysclCrctrstcsImageHash(new String(devicedefinitionphysicalcharacteristicsimage.getHash()));
		} else {
			d.addDvcDfnPhysclCrctrstcsImageHash("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageHash("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageData("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasData()) {

			d.addDvcDfnPhysclCrctrstcsImageData(new String(devicedefinitionphysicalcharacteristicsimage.getData()));
		} else {
			d.addDvcDfnPhysclCrctrstcsImageData("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageData("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageCreation("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasCreation()) {

			d.addDvcDfnPhysclCrctrstcsImageCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitionphysicalcharacteristicsimage.getCreation())+"\"");
		} else {
			d.addDvcDfnPhysclCrctrstcsImageCreation("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageCreation("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageTtl("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasTitle()) {

			d.addDvcDfnPhysclCrctrstcsImageTtl(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getTitle()));
		} else {
			d.addDvcDfnPhysclCrctrstcsImageTtl("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageTtl("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimagei == 0) {d.addDvcDfnPhysclCrctrstcsImageUrl("[");}
		if(devicedefinitionphysicalcharacteristicsimage.hasUrl()) {

			d.addDvcDfnPhysclCrctrstcsImageUrl(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getUrl()));
		} else {
			d.addDvcDfnPhysclCrctrstcsImageUrl("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsimagei == devicedefinitionphysicalcharacteristicsimagelist.size()-1) {d.addDvcDfnPhysclCrctrstcsImageUrl("]");}


		 };
		/******************** devicedefinitionphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsheight = devicedefinitionphysicalcharacteristics.getHeight();

		/******************** DvcDfn_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasValue()) {

			d.addDvcDfnPhysclCrctrstcsHeightVl(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getValue()));
		} else {
			d.addDvcDfnPhysclCrctrstcsHeightVl("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsheightcomparator = devicedefinitionphysicalcharacteristicsheight.getComparator();
		if(devicedefinitionphysicalcharacteristicsheightcomparator!=null) {
			d.addDvcDfnPhysclCrctrstcsHeightCmprtr(devicedefinitionphysicalcharacteristicsheightcomparator.toCode());
		} else {
			d.addDvcDfnPhysclCrctrstcsHeightCmprtr("NULL");
		}

		/******************** DvcDfn_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasCode()) {

			d.addDvcDfnPhysclCrctrstcsHeightCd(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getCode()));
		} else {
			d.addDvcDfnPhysclCrctrstcsHeightCd("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasUnit()) {

			d.addDvcDfnPhysclCrctrstcsHeightUnt(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getUnit()));
		} else {
			d.addDvcDfnPhysclCrctrstcsHeightUnt("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasSystem()) {

			d.addDvcDfnPhysclCrctrstcsHeightSys(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getSystem()));
		} else {
			d.addDvcDfnPhysclCrctrstcsHeightSys("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicswidth = devicedefinitionphysicalcharacteristics.getWidth();

		/******************** DvcDfn_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasValue()) {

			d.addDvcDfnPhysclCrctrstcsWidthVl(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getValue()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWidthVl("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicswidthcomparator = devicedefinitionphysicalcharacteristicswidth.getComparator();
		if(devicedefinitionphysicalcharacteristicswidthcomparator!=null) {
			d.addDvcDfnPhysclCrctrstcsWidthCmprtr(devicedefinitionphysicalcharacteristicswidthcomparator.toCode());
		} else {
			d.addDvcDfnPhysclCrctrstcsWidthCmprtr("NULL");
		}

		/******************** DvcDfn_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasCode()) {

			d.addDvcDfnPhysclCrctrstcsWidthCd(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getCode()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWidthCd("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasUnit()) {

			d.addDvcDfnPhysclCrctrstcsWidthUnt(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getUnit()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWidthUnt("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasSystem()) {

			d.addDvcDfnPhysclCrctrstcsWidthSys(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getSystem()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWidthSys("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Color ********************************************************************************/
		if(devicedefinitionphysicalcharacteristics.hasColor()) {

			String  array = "[";
			for(int incr=0; incr<devicedefinitionphysicalcharacteristics.getColor().size(); incr++) {
				array = array + devicedefinitionphysicalcharacteristics.getColor().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcDfnPhysclCrctrstcsColor(array);

		} else {
			d.addDvcDfnPhysclCrctrstcsColor("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsexternaldiameter = devicedefinitionphysicalcharacteristics.getExternalDiameter();

		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasValue()) {

			d.addDvcDfnPhysclCrctrstcsExternalDiameterVl(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getValue()));
		} else {
			d.addDvcDfnPhysclCrctrstcsExternalDiameterVl("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsexternaldiametercomparator = devicedefinitionphysicalcharacteristicsexternaldiameter.getComparator();
		if(devicedefinitionphysicalcharacteristicsexternaldiametercomparator!=null) {
			d.addDvcDfnPhysclCrctrstcsExternalDiameterCmprtr(devicedefinitionphysicalcharacteristicsexternaldiametercomparator.toCode());
		} else {
			d.addDvcDfnPhysclCrctrstcsExternalDiameterCmprtr("NULL");
		}

		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasCode()) {

			d.addDvcDfnPhysclCrctrstcsExternalDiameterCd(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getCode()));
		} else {
			d.addDvcDfnPhysclCrctrstcsExternalDiameterCd("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasUnit()) {

			d.addDvcDfnPhysclCrctrstcsExternalDiameterUnt(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getUnit()));
		} else {
			d.addDvcDfnPhysclCrctrstcsExternalDiameterUnt("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasSystem()) {

			d.addDvcDfnPhysclCrctrstcsExternalDiameterSys(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getSystem()));
		} else {
			d.addDvcDfnPhysclCrctrstcsExternalDiameterSys("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionphysicalcharacteristicsscoring = devicedefinitionphysicalcharacteristics.getScoring();

		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoring.hasText()) {

			d.addDvcDfnPhysclCrctrstcsScoringTxt(String.valueOf(devicedefinitionphysicalcharacteristicsscoring.getText()));
		} else {
			d.addDvcDfnPhysclCrctrstcsScoringTxt("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsscoringcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionphysicalcharacteristicsscoringcodinglist = devicedefinitionphysicalcharacteristicsscoring.getCoding();
		for(int devicedefinitionphysicalcharacteristicsscoringcodingi = 0; devicedefinitionphysicalcharacteristicsscoringcodingi<devicedefinitionphysicalcharacteristicsscoringcodinglist.size();devicedefinitionphysicalcharacteristicsscoringcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionphysicalcharacteristicsscoringcoding = devicedefinitionphysicalcharacteristicsscoringcodinglist.get(devicedefinitionphysicalcharacteristicsscoringcodingi);

		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcodingi == 0) {d.addDvcDfnPhysclCrctrstcsScoringCdgDsply("[");}
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasDisplay()) {

			d.addDvcDfnPhysclCrctrstcsScoringCdgDsply(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getDisplay()));
		} else {
			d.addDvcDfnPhysclCrctrstcsScoringCdgDsply("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsscoringcodingi == devicedefinitionphysicalcharacteristicsscoringcodinglist.size()-1) {d.addDvcDfnPhysclCrctrstcsScoringCdgDsply("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcodingi == 0) {d.addDvcDfnPhysclCrctrstcsScoringCdgVrsn("[");}
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasVersion()) {

			d.addDvcDfnPhysclCrctrstcsScoringCdgVrsn(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getVersion()));
		} else {
			d.addDvcDfnPhysclCrctrstcsScoringCdgVrsn("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsscoringcodingi == devicedefinitionphysicalcharacteristicsscoringcodinglist.size()-1) {d.addDvcDfnPhysclCrctrstcsScoringCdgVrsn("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcodingi == 0) {d.addDvcDfnPhysclCrctrstcsScoringCdgCd("[");}
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasCode()) {

			d.addDvcDfnPhysclCrctrstcsScoringCdgCd(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getCode()));
		} else {
			d.addDvcDfnPhysclCrctrstcsScoringCdgCd("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsscoringcodingi == devicedefinitionphysicalcharacteristicsscoringcodinglist.size()-1) {d.addDvcDfnPhysclCrctrstcsScoringCdgCd("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcodingi == 0) {d.addDvcDfnPhysclCrctrstcsScoringCdgUsrSltd("[");}
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasUserSelected()) {

			d.addDvcDfnPhysclCrctrstcsScoringCdgUsrSltd(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getUserSelected()));
		} else {
			d.addDvcDfnPhysclCrctrstcsScoringCdgUsrSltd("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsscoringcodingi == devicedefinitionphysicalcharacteristicsscoringcodinglist.size()-1) {d.addDvcDfnPhysclCrctrstcsScoringCdgUsrSltd("]");}


		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcodingi == 0) {d.addDvcDfnPhysclCrctrstcsScoringCdgSys("[");}
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasSystem()) {

			d.addDvcDfnPhysclCrctrstcsScoringCdgSys(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getSystem()));
		} else {
			d.addDvcDfnPhysclCrctrstcsScoringCdgSys("NULL");
		}

		if(devicedefinitionphysicalcharacteristicsscoringcodingi == devicedefinitionphysicalcharacteristicsscoringcodinglist.size()-1) {d.addDvcDfnPhysclCrctrstcsScoringCdgSys("]");}


		 };
		/******************** devicedefinitionphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsdepth = devicedefinitionphysicalcharacteristics.getDepth();

		/******************** DvcDfn_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasValue()) {

			d.addDvcDfnPhysclCrctrstcsDepthVl(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getValue()));
		} else {
			d.addDvcDfnPhysclCrctrstcsDepthVl("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsdepthcomparator = devicedefinitionphysicalcharacteristicsdepth.getComparator();
		if(devicedefinitionphysicalcharacteristicsdepthcomparator!=null) {
			d.addDvcDfnPhysclCrctrstcsDepthCmprtr(devicedefinitionphysicalcharacteristicsdepthcomparator.toCode());
		} else {
			d.addDvcDfnPhysclCrctrstcsDepthCmprtr("NULL");
		}

		/******************** DvcDfn_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasCode()) {

			d.addDvcDfnPhysclCrctrstcsDepthCd(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getCode()));
		} else {
			d.addDvcDfnPhysclCrctrstcsDepthCd("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasUnit()) {

			d.addDvcDfnPhysclCrctrstcsDepthUnt(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getUnit()));
		} else {
			d.addDvcDfnPhysclCrctrstcsDepthUnt("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasSystem()) {

			d.addDvcDfnPhysclCrctrstcsDepthSys(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getSystem()));
		} else {
			d.addDvcDfnPhysclCrctrstcsDepthSys("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsweight = devicedefinitionphysicalcharacteristics.getWeight();

		/******************** DvcDfn_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasValue()) {

			d.addDvcDfnPhysclCrctrstcsWghtVl(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getValue()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWghtVl("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsweightcomparator = devicedefinitionphysicalcharacteristicsweight.getComparator();
		if(devicedefinitionphysicalcharacteristicsweightcomparator!=null) {
			d.addDvcDfnPhysclCrctrstcsWghtCmprtr(devicedefinitionphysicalcharacteristicsweightcomparator.toCode());
		} else {
			d.addDvcDfnPhysclCrctrstcsWghtCmprtr("NULL");
		}

		/******************** DvcDfn_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasCode()) {

			d.addDvcDfnPhysclCrctrstcsWghtCd(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getCode()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWghtCd("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasUnit()) {

			d.addDvcDfnPhysclCrctrstcsWghtUnt(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getUnit()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWghtUnt("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasSystem()) {

			d.addDvcDfnPhysclCrctrstcsWghtSys(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getSystem()));
		} else {
			d.addDvcDfnPhysclCrctrstcsWghtSys("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsnominalvolume = devicedefinitionphysicalcharacteristics.getNominalVolume();

		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasValue()) {

			d.addDvcDfnPhysclCrctrstcsNominalVolumeVl(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getValue()));
		} else {
			d.addDvcDfnPhysclCrctrstcsNominalVolumeVl("NULL");
		}


		/******************** devicedefinitionphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsnominalvolumecomparator = devicedefinitionphysicalcharacteristicsnominalvolume.getComparator();
		if(devicedefinitionphysicalcharacteristicsnominalvolumecomparator!=null) {
			d.addDvcDfnPhysclCrctrstcsNominalVolumeCmprtr(devicedefinitionphysicalcharacteristicsnominalvolumecomparator.toCode());
		} else {
			d.addDvcDfnPhysclCrctrstcsNominalVolumeCmprtr("NULL");
		}

		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasCode()) {

			d.addDvcDfnPhysclCrctrstcsNominalVolumeCd(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getCode()));
		} else {
			d.addDvcDfnPhysclCrctrstcsNominalVolumeCd("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasUnit()) {

			d.addDvcDfnPhysclCrctrstcsNominalVolumeUnt(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getUnit()));
		} else {
			d.addDvcDfnPhysclCrctrstcsNominalVolumeUnt("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasSystem()) {

			d.addDvcDfnPhysclCrctrstcsNominalVolumeSys(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getSystem()));
		} else {
			d.addDvcDfnPhysclCrctrstcsNominalVolumeSys("NULL");
		}


		/******************** DvcDfn_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(devicedefinitionphysicalcharacteristics.hasImprint()) {

			String  array = "[";
			for(int incr=0; incr<devicedefinitionphysicalcharacteristics.getImprint().size(); incr++) {
				array = array + devicedefinitionphysicalcharacteristics.getImprint().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcDfnPhysclCrctrstcsImprint(array);

		} else {
			d.addDvcDfnPhysclCrctrstcsImprint("NULL");
		}


		/******************** devicedefinitionudideviceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent> devicedefinitionudideviceidentifierlist = devicedefinition.getUdiDeviceIdentifier();
		for(int devicedefinitionudideviceidentifieri = 0; devicedefinitionudideviceidentifieri<devicedefinitionudideviceidentifierlist.size();devicedefinitionudideviceidentifieri++ ) {
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent  devicedefinitionudideviceidentifier = devicedefinitionudideviceidentifierlist.get(devicedefinitionudideviceidentifieri);

		/******************** DvcDfn_UdiDvcId_Jrsdctn ********************************************************************************/
		if(devicedefinitionudideviceidentifieri == 0) {d.addDvcDfnUdiDvcIdJrsdctn("[");}
		if(devicedefinitionudideviceidentifier.hasJurisdiction()) {

			d.addDvcDfnUdiDvcIdJrsdctn(String.valueOf(devicedefinitionudideviceidentifier.getJurisdiction()));
		} else {
			d.addDvcDfnUdiDvcIdJrsdctn("NULL");
		}

		if(devicedefinitionudideviceidentifieri == devicedefinitionudideviceidentifierlist.size()-1) {d.addDvcDfnUdiDvcIdJrsdctn("]");}


		/******************** DvcDfn_UdiDvcId_DvcId ********************************************************************************/
		if(devicedefinitionudideviceidentifieri == 0) {d.addDvcDfnUdiDvcIdDvcId("[");}
		if(devicedefinitionudideviceidentifier.hasDeviceIdentifier()) {

			d.addDvcDfnUdiDvcIdDvcId(String.valueOf(devicedefinitionudideviceidentifier.getDeviceIdentifier()));
		} else {
			d.addDvcDfnUdiDvcIdDvcId("NULL");
		}

		if(devicedefinitionudideviceidentifieri == devicedefinitionudideviceidentifierlist.size()-1) {d.addDvcDfnUdiDvcIdDvcId("]");}


		/******************** DvcDfn_UdiDvcId_Issuer ********************************************************************************/
		if(devicedefinitionudideviceidentifieri == 0) {d.addDvcDfnUdiDvcIdIssuer("[");}
		if(devicedefinitionudideviceidentifier.hasIssuer()) {

			d.addDvcDfnUdiDvcIdIssuer(String.valueOf(devicedefinitionudideviceidentifier.getIssuer()));
		} else {
			d.addDvcDfnUdiDvcIdIssuer("NULL");
		}

		if(devicedefinitionudideviceidentifieri == devicedefinitionudideviceidentifierlist.size()-1) {d.addDvcDfnUdiDvcIdIssuer("]");}


		 };
		/******************** devicedefinitionshelflifestorage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ProductShelfLife> devicedefinitionshelflifestoragelist = devicedefinition.getShelfLifeStorage();
		for(int devicedefinitionshelflifestoragei = 0; devicedefinitionshelflifestoragei<devicedefinitionshelflifestoragelist.size();devicedefinitionshelflifestoragei++ ) {
		org.hl7.fhir.r4.model.ProductShelfLife  devicedefinitionshelflifestorage = devicedefinitionshelflifestoragelist.get(devicedefinitionshelflifestoragei);

		/******************** devicedefinitionshelflifestoragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestoragetype = devicedefinitionshelflifestorage.getType();

		/******************** DvcDfn_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgTypTxt("[");}
		if(devicedefinitionshelflifestoragetype.hasText()) {

			d.addDvcDfnShlfLfStrgTypTxt(String.valueOf(devicedefinitionshelflifestoragetype.getText()));
		} else {
			d.addDvcDfnShlfLfStrgTypTxt("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgTypTxt("]");}


		/******************** devicedefinitionshelflifestoragetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionshelflifestoragetypecodinglist = devicedefinitionshelflifestoragetype.getCoding();
		for(int devicedefinitionshelflifestoragetypecodingi = 0; devicedefinitionshelflifestoragetypecodingi<devicedefinitionshelflifestoragetypecodinglist.size();devicedefinitionshelflifestoragetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionshelflifestoragetypecoding = devicedefinitionshelflifestoragetypecodinglist.get(devicedefinitionshelflifestoragetypecodingi);

		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecodingi == 0) {d.addDvcDfnShlfLfStrgTypCdgDsply("[[");}
		if(devicedefinitionshelflifestoragetypecoding.hasDisplay()) {

			d.addDvcDfnShlfLfStrgTypCdgDsply(String.valueOf(devicedefinitionshelflifestoragetypecoding.getDisplay()));
		} else {
			d.addDvcDfnShlfLfStrgTypCdgDsply("NULL");
		}

		if(devicedefinitionshelflifestoragetypecodingi == devicedefinitionshelflifestoragetypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgTypCdgDsply("]]");}


		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecodingi == 0) {d.addDvcDfnShlfLfStrgTypCdgVrsn("[[");}
		if(devicedefinitionshelflifestoragetypecoding.hasVersion()) {

			d.addDvcDfnShlfLfStrgTypCdgVrsn(String.valueOf(devicedefinitionshelflifestoragetypecoding.getVersion()));
		} else {
			d.addDvcDfnShlfLfStrgTypCdgVrsn("NULL");
		}

		if(devicedefinitionshelflifestoragetypecodingi == devicedefinitionshelflifestoragetypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgTypCdgVrsn("]]");}


		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecodingi == 0) {d.addDvcDfnShlfLfStrgTypCdgCd("[[");}
		if(devicedefinitionshelflifestoragetypecoding.hasCode()) {

			d.addDvcDfnShlfLfStrgTypCdgCd(String.valueOf(devicedefinitionshelflifestoragetypecoding.getCode()));
		} else {
			d.addDvcDfnShlfLfStrgTypCdgCd("NULL");
		}

		if(devicedefinitionshelflifestoragetypecodingi == devicedefinitionshelflifestoragetypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgTypCdgCd("]]");}


		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecodingi == 0) {d.addDvcDfnShlfLfStrgTypCdgUsrSltd("[[");}
		if(devicedefinitionshelflifestoragetypecoding.hasUserSelected()) {

			d.addDvcDfnShlfLfStrgTypCdgUsrSltd(String.valueOf(devicedefinitionshelflifestoragetypecoding.getUserSelected()));
		} else {
			d.addDvcDfnShlfLfStrgTypCdgUsrSltd("NULL");
		}

		if(devicedefinitionshelflifestoragetypecodingi == devicedefinitionshelflifestoragetypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgTypCdgUsrSltd("]]");}


		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecodingi == 0) {d.addDvcDfnShlfLfStrgTypCdgSys("[[");}
		if(devicedefinitionshelflifestoragetypecoding.hasSystem()) {

			d.addDvcDfnShlfLfStrgTypCdgSys(String.valueOf(devicedefinitionshelflifestoragetypecoding.getSystem()));
		} else {
			d.addDvcDfnShlfLfStrgTypCdgSys("NULL");
		}

		if(devicedefinitionshelflifestoragetypecodingi == devicedefinitionshelflifestoragetypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgTypCdgSys("]]");}


		 };
		/******************** devicedefinitionshelflifestorageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionshelflifestorageperiod = devicedefinitionshelflifestorage.getPeriod();

		/******************** DvcDfn_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgPrdVl("[");}
		if(devicedefinitionshelflifestorageperiod.hasValue()) {

			d.addDvcDfnShlfLfStrgPrdVl(String.valueOf(devicedefinitionshelflifestorageperiod.getValue()));
		} else {
			d.addDvcDfnShlfLfStrgPrdVl("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgPrdVl("]");}


		/******************** devicedefinitionshelflifestorageperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionshelflifestorageperiodcomparator = devicedefinitionshelflifestorageperiod.getComparator();
		if(devicedefinitionshelflifestorageperiodcomparator!=null) {
		if(devicedefinitionshelflifestoragei == 0) {

		d.addDvcDfnShlfLfStrgPrdCmprtr("[");		}
			d.addDvcDfnShlfLfStrgPrdCmprtr(devicedefinitionshelflifestorageperiodcomparator.toCode());
		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {

		d.addDvcDfnShlfLfStrgPrdCmprtr("]");		}

		} else {
			d.addDvcDfnShlfLfStrgPrdCmprtr("NULL");
		}

		/******************** DvcDfn_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgPrdCd("[");}
		if(devicedefinitionshelflifestorageperiod.hasCode()) {

			d.addDvcDfnShlfLfStrgPrdCd(String.valueOf(devicedefinitionshelflifestorageperiod.getCode()));
		} else {
			d.addDvcDfnShlfLfStrgPrdCd("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgPrdCd("]");}


		/******************** DvcDfn_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgPrdUnt("[");}
		if(devicedefinitionshelflifestorageperiod.hasUnit()) {

			d.addDvcDfnShlfLfStrgPrdUnt(String.valueOf(devicedefinitionshelflifestorageperiod.getUnit()));
		} else {
			d.addDvcDfnShlfLfStrgPrdUnt("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgPrdUnt("]");}


		/******************** DvcDfn_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgPrdSys("[");}
		if(devicedefinitionshelflifestorageperiod.hasSystem()) {

			d.addDvcDfnShlfLfStrgPrdSys(String.valueOf(devicedefinitionshelflifestorageperiod.getSystem()));
		} else {
			d.addDvcDfnShlfLfStrgPrdSys("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgPrdSys("]");}


		/******************** devicedefinitionshelflifestorageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicedefinitionshelflifestorageidentifier = devicedefinitionshelflifestorage.getIdentifier();

		/******************** DvcDfn_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgIdVl("[");}
		if(devicedefinitionshelflifestorageidentifier.hasValue()) {

			d.addDvcDfnShlfLfStrgIdVl(String.valueOf(devicedefinitionshelflifestorageidentifier.getValue()));
		} else {
			d.addDvcDfnShlfLfStrgIdVl("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgIdVl("]");}


		/******************** devicedefinitionshelflifestorageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestorageidentifiertype = devicedefinitionshelflifestorageidentifier.getType();

		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgIdTypTxt("[");}
		if(devicedefinitionshelflifestorageidentifiertype.hasText()) {

			d.addDvcDfnShlfLfStrgIdTypTxt(String.valueOf(devicedefinitionshelflifestorageidentifiertype.getText()));
		} else {
			d.addDvcDfnShlfLfStrgIdTypTxt("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgIdTypTxt("]");}


		/******************** devicedefinitionshelflifestorageidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionshelflifestorageidentifiertypecodinglist = devicedefinitionshelflifestorageidentifiertype.getCoding();
		for(int devicedefinitionshelflifestorageidentifiertypecodingi = 0; devicedefinitionshelflifestorageidentifiertypecodingi<devicedefinitionshelflifestorageidentifiertypecodinglist.size();devicedefinitionshelflifestorageidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionshelflifestorageidentifiertypecoding = devicedefinitionshelflifestorageidentifiertypecodinglist.get(devicedefinitionshelflifestorageidentifiertypecodingi);

		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecodingi == 0) {d.addDvcDfnShlfLfStrgIdTypCdgDsply("[[");}
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasDisplay()) {

			d.addDvcDfnShlfLfStrgIdTypCdgDsply(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getDisplay()));
		} else {
			d.addDvcDfnShlfLfStrgIdTypCdgDsply("NULL");
		}

		if(devicedefinitionshelflifestorageidentifiertypecodingi == devicedefinitionshelflifestorageidentifiertypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgIdTypCdgDsply("]]");}


		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecodingi == 0) {d.addDvcDfnShlfLfStrgIdTypCdgVrsn("[[");}
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasVersion()) {

			d.addDvcDfnShlfLfStrgIdTypCdgVrsn(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getVersion()));
		} else {
			d.addDvcDfnShlfLfStrgIdTypCdgVrsn("NULL");
		}

		if(devicedefinitionshelflifestorageidentifiertypecodingi == devicedefinitionshelflifestorageidentifiertypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgIdTypCdgVrsn("]]");}


		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecodingi == 0) {d.addDvcDfnShlfLfStrgIdTypCdgCd("[[");}
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasCode()) {

			d.addDvcDfnShlfLfStrgIdTypCdgCd(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getCode()));
		} else {
			d.addDvcDfnShlfLfStrgIdTypCdgCd("NULL");
		}

		if(devicedefinitionshelflifestorageidentifiertypecodingi == devicedefinitionshelflifestorageidentifiertypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgIdTypCdgCd("]]");}


		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecodingi == 0) {d.addDvcDfnShlfLfStrgIdTypCdgUsrSltd("[[");}
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasUserSelected()) {

			d.addDvcDfnShlfLfStrgIdTypCdgUsrSltd(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getUserSelected()));
		} else {
			d.addDvcDfnShlfLfStrgIdTypCdgUsrSltd("NULL");
		}

		if(devicedefinitionshelflifestorageidentifiertypecodingi == devicedefinitionshelflifestorageidentifiertypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgIdTypCdgUsrSltd("]]");}


		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecodingi == 0) {d.addDvcDfnShlfLfStrgIdTypCdgSys("[[");}
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasSystem()) {

			d.addDvcDfnShlfLfStrgIdTypCdgSys(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getSystem()));
		} else {
			d.addDvcDfnShlfLfStrgIdTypCdgSys("NULL");
		}

		if(devicedefinitionshelflifestorageidentifiertypecodingi == devicedefinitionshelflifestorageidentifiertypecodinglist.size()-1) {d.addDvcDfnShlfLfStrgIdTypCdgSys("]]");}


		 };
		/******************** devicedefinitionshelflifestorageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitionshelflifestorageidentifierperiod = devicedefinitionshelflifestorageidentifier.getPeriod();

		/******************** DvcDfn_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgIdPrdStrt("[");}
		if(devicedefinitionshelflifestorageidentifierperiod.hasStart()) {

			d.addDvcDfnShlfLfStrgIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitionshelflifestorageidentifierperiod.getStart())+"\"");
		} else {
			d.addDvcDfnShlfLfStrgIdPrdStrt("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgIdPrdStrt("]");}


		/******************** DvcDfn_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgIdPrdEnd("[");}
		if(devicedefinitionshelflifestorageidentifierperiod.hasEnd()) {

			d.addDvcDfnShlfLfStrgIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicedefinitionshelflifestorageidentifierperiod.getEnd())+"\"");
		} else {
			d.addDvcDfnShlfLfStrgIdPrdEnd("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgIdPrdEnd("]");}


		/******************** devicedefinitionshelflifestorageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicedefinitionshelflifestorageidentifieruse = devicedefinitionshelflifestorageidentifier.getUse();
		if(devicedefinitionshelflifestorageidentifieruse!=null) {
		if(devicedefinitionshelflifestoragei == 0) {

		d.addDvcDfnShlfLfStrgIdUse("[");		}
			d.addDvcDfnShlfLfStrgIdUse(devicedefinitionshelflifestorageidentifieruse.toCode());
		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {

		d.addDvcDfnShlfLfStrgIdUse("]");		}

		} else {
			d.addDvcDfnShlfLfStrgIdUse("NULL");
		}

		/******************** DvcDfn_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgIdAssigner("[");}
		if(devicedefinitionshelflifestorageidentifier.hasAssigner()) {

			if(devicedefinitionshelflifestorageidentifier.getAssigner().getReference() != null) {
			d.addDvcDfnShlfLfStrgIdAssigner(devicedefinitionshelflifestorageidentifier.getAssigner().getReference());
			}
		} else {
			d.addDvcDfnShlfLfStrgIdAssigner("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgIdAssigner("]");}


		/******************** DvcDfn_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(devicedefinitionshelflifestoragei == 0) {d.addDvcDfnShlfLfStrgIdSys("[");}
		if(devicedefinitionshelflifestorageidentifier.hasSystem()) {

			d.addDvcDfnShlfLfStrgIdSys(String.valueOf(devicedefinitionshelflifestorageidentifier.getSystem()));
		} else {
			d.addDvcDfnShlfLfStrgIdSys("NULL");
		}

		if(devicedefinitionshelflifestoragei == devicedefinitionshelflifestoragelist.size()-1) {d.addDvcDfnShlfLfStrgIdSys("]");}


		/******************** devicedefinitionshelflifestoragespecialprecautionsforstorage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicedefinitionshelflifestoragespecialprecautionsforstoragelist = devicedefinitionshelflifestorage.getSpecialPrecautionsForStorage();
		for(int devicedefinitionshelflifestoragespecialprecautionsforstoragei = 0; devicedefinitionshelflifestoragespecialprecautionsforstoragei<devicedefinitionshelflifestoragespecialprecautionsforstoragelist.size();devicedefinitionshelflifestoragespecialprecautionsforstoragei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicedefinitionshelflifestoragespecialprecautionsforstorage = devicedefinitionshelflifestoragespecialprecautionsforstoragelist.get(devicedefinitionshelflifestoragespecialprecautionsforstoragei);

		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragei == 0) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt("[[");}
		if(devicedefinitionshelflifestoragespecialprecautionsforstorage.hasText()) {

			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstorage.getText()));
		} else {
			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt("NULL");
		}

		if(devicedefinitionshelflifestoragespecialprecautionsforstoragei == devicedefinitionshelflifestoragespecialprecautionsforstoragelist.size()-1) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt("]]");}


		/******************** devicedefinitionshelflifestoragespecialprecautionsforstoragecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist = devicedefinitionshelflifestoragespecialprecautionsforstorage.getCoding();
		for(int devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi = 0; devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi<devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist.size();devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionshelflifestoragespecialprecautionsforstoragecoding = devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist.get(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi);

		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == 0) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply("[[[");}
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasDisplay()) {

			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getDisplay()));
		} else {
			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply("NULL");
		}

		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply("]]]");}


		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == 0) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn("[[[");}
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasVersion()) {

			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getVersion()));
		} else {
			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn("NULL");
		}

		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn("]]]");}


		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == 0) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd("[[[");}
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasCode()) {

			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getCode()));
		} else {
			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd("NULL");
		}

		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd("]]]");}


		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == 0) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd("[[[");}
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasUserSelected()) {

			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getUserSelected()));
		} else {
			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd("NULL");
		}

		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd("]]]");}


		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == 0) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys("[[[");}
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasSystem()) {

			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getSystem()));
		} else {
			d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys("NULL");
		}

		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecodingi == devicedefinitionshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {d.addDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys("]]]");}


		 };
		 };
		 };
		/******************** DvcDfn_ManufacturerStrgTyp ********************************************************************************/
		if(devicedefinition.hasManufacturerStringType()) {

			d.addDvcDfnManufacturerStrgTyp("\""+devicedefinition.getManufacturerStringType().getValueAsString()+"\"");
		} else {
			d.addDvcDfnManufacturerStrgTyp("NULL");
		}


		/******************** DvcDfn_ManufacturerRfrnc ********************************************************************************/
		if(devicedefinition.hasManufacturerReference()) {

			if(devicedefinition.getManufacturerReference().getReference() != null) {
			d.addDvcDfnManufacturerRfrnc(devicedefinition.getManufacturerReference().getReference());
			}
		} else {
			d.addDvcDfnManufacturerRfrnc("NULL");
		}


		/******************** DvcDfn_OnlineInfo ********************************************************************************/
		if(devicedefinition.hasOnlineInformation()) {

			d.addDvcDfnOnlineInfo(String.valueOf(devicedefinition.getOnlineInformation()));
		} else {
			d.addDvcDfnOnlineInfo("NULL");
		}


		/******************** DvcDfn_Url ********************************************************************************/
		if(devicedefinition.hasUrl()) {

			d.addDvcDfnUrl(String.valueOf(devicedefinition.getUrl()));
		} else {
			d.addDvcDfnUrl("NULL");
		}


		/******************** devicedefinitionspecialization ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent> devicedefinitionspecializationlist = devicedefinition.getSpecialization();
		for(int devicedefinitionspecializationi = 0; devicedefinitionspecializationi<devicedefinitionspecializationlist.size();devicedefinitionspecializationi++ ) {
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent  devicedefinitionspecialization = devicedefinitionspecializationlist.get(devicedefinitionspecializationi);

		/******************** DvcDfn_Spclization_SysTyp ********************************************************************************/
		if(devicedefinitionspecializationi == 0) {d.addDvcDfnSpclizationSysTyp("[");}
		if(devicedefinitionspecialization.hasSystemType()) {

			d.addDvcDfnSpclizationSysTyp(String.valueOf(devicedefinitionspecialization.getSystemType()));
		} else {
			d.addDvcDfnSpclizationSysTyp("NULL");
		}

		if(devicedefinitionspecializationi == devicedefinitionspecializationlist.size()-1) {d.addDvcDfnSpclizationSysTyp("]");}


		 };
		/******************** DvcDfn_ModelNmbr ********************************************************************************/
		if(devicedefinition.hasModelNumber()) {

			d.addDvcDfnModelNmbr(String.valueOf(devicedefinition.getModelNumber()));
		} else {
			d.addDvcDfnModelNmbr("NULL");
		}


		/******************** devicedefinitionsafety ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicedefinitionsafetylist = devicedefinition.getSafety();
		for(int devicedefinitionsafetyi = 0; devicedefinitionsafetyi<devicedefinitionsafetylist.size();devicedefinitionsafetyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicedefinitionsafety = devicedefinitionsafetylist.get(devicedefinitionsafetyi);

		/******************** DvcDfn_Safety_Txt ********************************************************************************/
		if(devicedefinitionsafetyi == 0) {d.addDvcDfnSafetyTxt("[");}
		if(devicedefinitionsafety.hasText()) {

			d.addDvcDfnSafetyTxt(String.valueOf(devicedefinitionsafety.getText()));
		} else {
			d.addDvcDfnSafetyTxt("NULL");
		}

		if(devicedefinitionsafetyi == devicedefinitionsafetylist.size()-1) {d.addDvcDfnSafetyTxt("]");}


		/******************** devicedefinitionsafetycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicedefinitionsafetycodinglist = devicedefinitionsafety.getCoding();
		for(int devicedefinitionsafetycodingi = 0; devicedefinitionsafetycodingi<devicedefinitionsafetycodinglist.size();devicedefinitionsafetycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicedefinitionsafetycoding = devicedefinitionsafetycodinglist.get(devicedefinitionsafetycodingi);

		/******************** DvcDfn_Safety_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionsafetycodingi == 0) {d.addDvcDfnSafetyCdgDsply("[[");}
		if(devicedefinitionsafetycoding.hasDisplay()) {

			d.addDvcDfnSafetyCdgDsply(String.valueOf(devicedefinitionsafetycoding.getDisplay()));
		} else {
			d.addDvcDfnSafetyCdgDsply("NULL");
		}

		if(devicedefinitionsafetycodingi == devicedefinitionsafetycodinglist.size()-1) {d.addDvcDfnSafetyCdgDsply("]]");}


		/******************** DvcDfn_Safety_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionsafetycodingi == 0) {d.addDvcDfnSafetyCdgVrsn("[[");}
		if(devicedefinitionsafetycoding.hasVersion()) {

			d.addDvcDfnSafetyCdgVrsn(String.valueOf(devicedefinitionsafetycoding.getVersion()));
		} else {
			d.addDvcDfnSafetyCdgVrsn("NULL");
		}

		if(devicedefinitionsafetycodingi == devicedefinitionsafetycodinglist.size()-1) {d.addDvcDfnSafetyCdgVrsn("]]");}


		/******************** DvcDfn_Safety_Cdg_Cd ********************************************************************************/
		if(devicedefinitionsafetycodingi == 0) {d.addDvcDfnSafetyCdgCd("[[");}
		if(devicedefinitionsafetycoding.hasCode()) {

			d.addDvcDfnSafetyCdgCd(String.valueOf(devicedefinitionsafetycoding.getCode()));
		} else {
			d.addDvcDfnSafetyCdgCd("NULL");
		}

		if(devicedefinitionsafetycodingi == devicedefinitionsafetycodinglist.size()-1) {d.addDvcDfnSafetyCdgCd("]]");}


		/******************** DvcDfn_Safety_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionsafetycodingi == 0) {d.addDvcDfnSafetyCdgUsrSltd("[[");}
		if(devicedefinitionsafetycoding.hasUserSelected()) {

			d.addDvcDfnSafetyCdgUsrSltd(String.valueOf(devicedefinitionsafetycoding.getUserSelected()));
		} else {
			d.addDvcDfnSafetyCdgUsrSltd("NULL");
		}

		if(devicedefinitionsafetycodingi == devicedefinitionsafetycodinglist.size()-1) {d.addDvcDfnSafetyCdgUsrSltd("]]");}


		/******************** DvcDfn_Safety_Cdg_Sys ********************************************************************************/
		if(devicedefinitionsafetycodingi == 0) {d.addDvcDfnSafetyCdgSys("[[");}
		if(devicedefinitionsafetycoding.hasSystem()) {

			d.addDvcDfnSafetyCdgSys(String.valueOf(devicedefinitionsafetycoding.getSystem()));
		} else {
			d.addDvcDfnSafetyCdgSys("NULL");
		}

		if(devicedefinitionsafetycodingi == devicedefinitionsafetycodinglist.size()-1) {d.addDvcDfnSafetyCdgSys("]]");}


		 };
		 };
		/******************** devicedefinitionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionquantity = devicedefinition.getQuantity();

		/******************** DvcDfn_Qnty_Vl ********************************************************************************/
		if(devicedefinitionquantity.hasValue()) {

			d.addDvcDfnQntyVl(String.valueOf(devicedefinitionquantity.getValue()));
		} else {
			d.addDvcDfnQntyVl("NULL");
		}


		/******************** devicedefinitionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionquantitycomparator = devicedefinitionquantity.getComparator();
		if(devicedefinitionquantitycomparator!=null) {
			d.addDvcDfnQntyCmprtr(devicedefinitionquantitycomparator.toCode());
		} else {
			d.addDvcDfnQntyCmprtr("NULL");
		}

		/******************** DvcDfn_Qnty_Cd ********************************************************************************/
		if(devicedefinitionquantity.hasCode()) {

			d.addDvcDfnQntyCd(String.valueOf(devicedefinitionquantity.getCode()));
		} else {
			d.addDvcDfnQntyCd("NULL");
		}


		/******************** DvcDfn_Qnty_Unt ********************************************************************************/
		if(devicedefinitionquantity.hasUnit()) {

			d.addDvcDfnQntyUnt(String.valueOf(devicedefinitionquantity.getUnit()));
		} else {
			d.addDvcDfnQntyUnt("NULL");
		}


		/******************** DvcDfn_Qnty_Sys ********************************************************************************/
		if(devicedefinitionquantity.hasSystem()) {

			d.addDvcDfnQntySys(String.valueOf(devicedefinitionquantity.getSystem()));
		} else {
			d.addDvcDfnQntySys("NULL");
		}


		/******************** devicedefinitiondevicename ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent> devicedefinitiondevicenamelist = devicedefinition.getDeviceName();
		for(int devicedefinitiondevicenamei = 0; devicedefinitiondevicenamei<devicedefinitiondevicenamelist.size();devicedefinitiondevicenamei++ ) {
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent  devicedefinitiondevicename = devicedefinitiondevicenamelist.get(devicedefinitiondevicenamei);

		/******************** DvcDfn_DvcNm_Nm ********************************************************************************/
		if(devicedefinitiondevicenamei == 0) {d.addDvcDfnDvcNmNm("[");}
		if(devicedefinitiondevicename.hasName()) {

			d.addDvcDfnDvcNmNm(String.valueOf(devicedefinitiondevicename.getName()));
		} else {
			d.addDvcDfnDvcNmNm("NULL");
		}

		if(devicedefinitiondevicenamei == devicedefinitiondevicenamelist.size()-1) {d.addDvcDfnDvcNmNm("]");}


		/******************** devicedefinitiondevicenametype ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceNameType devicedefinitiondevicenametype = devicedefinitiondevicename.getType();
		if(devicedefinitiondevicenametype!=null) {
		if(devicedefinitiondevicenamei == 0) {

		d.addDvcDfnDvcNmTyp("[");		}
			d.addDvcDfnDvcNmTyp(devicedefinitiondevicenametype.toCode());
		if(devicedefinitiondevicenamei == devicedefinitiondevicenamelist.size()-1) {

		d.addDvcDfnDvcNmTyp("]");		}

		} else {
			d.addDvcDfnDvcNmTyp("NULL");
		}

		 };
		/******************** DvcDfn_Owner ********************************************************************************/
		if(devicedefinition.hasOwner()) {

			if(devicedefinition.getOwner().getReference() != null) {
			d.addDvcDfnOwner(devicedefinition.getOwner().getReference());
			}
		} else {
			d.addDvcDfnOwner("NULL");
		}


		return d;
	}
}
