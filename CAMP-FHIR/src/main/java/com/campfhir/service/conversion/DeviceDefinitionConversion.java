package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceDefinition;
public class DeviceDefinitionConversion 
{
	public org.hl7.fhir.r4.model.DeviceDefinition DeviceDefinitions(DeviceDefinition d) throws ParseException
	{
		org.hl7.fhir.r4.model.DeviceDefinition devicedefinition = new org.hl7.fhir.r4.model.DeviceDefinition();

		/******************** id ********************************************************************************/
		devicedefinition.setId(d.getId());

		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyDscrptnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyDscrptnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getDescription().size() < i1+1) { devicedefinition.getCapability().get(i0).addDescription(); }
					String[] arrayi2 = d.getDvcDfnCapbltyDscrptnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().size() < i2+1) { devicedefinition.getCapability().get(i0).getDescription().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyDscrptnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyDscrptnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getDescription().size() < i1+1) { devicedefinition.getCapability().get(i0).addDescription(); }
					String[] arrayi2 = d.getDvcDfnCapbltyDscrptnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().size() < i2+1) { devicedefinition.getCapability().get(i0).getDescription().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyDscrptnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyDscrptnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getDescription().size() < i1+1) { devicedefinition.getCapability().get(i0).addDescription(); }
					String[] arrayi2 = d.getDvcDfnCapbltyDscrptnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().size() < i2+1) { devicedefinition.getCapability().get(i0).getDescription().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyDscrptnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyDscrptnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getDescription().size() < i1+1) { devicedefinition.getCapability().get(i0).addDescription(); }
					String[] arrayi2 = d.getDvcDfnCapbltyDscrptnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().size() < i2+1) { devicedefinition.getCapability().get(i0).getDescription().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyDscrptnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyDscrptnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getDescription().size() < i1+1) { devicedefinition.getCapability().get(i0).addDescription(); }
					String[] arrayi2 = d.getDvcDfnCapbltyDscrptnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().size() < i2+1) { devicedefinition.getCapability().get(i0).getDescription().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getCapability().get(i0).getDescription().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Capblty_Dscrptn_Txt ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyDscrptnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyDscrptnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getDescription().size() < i1+1) { devicedefinition.getCapability().get(i0).addDescription(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getCapability().get(i0).getDescription().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getCapability().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getCapability().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getCapability().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getCapability().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getCapability().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getCapability().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Capblty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getCapability().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getCapability().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				String[] arrayi1 = d.getDvcDfnCapbltyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getCapability().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getCapability().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getCapability().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Capblty_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnCapbltyTypTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnCapbltyTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getCapability().size() < i0+1) { devicedefinition.addCapability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getCapability().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Cntct_Prd_End ********************************************************************************/
		if(d.getDvcDfnCntctPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcDfnCntctPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getContact().size() < i0+1) { devicedefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getContact().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Cntct_Prd_Strt ********************************************************************************/
		if(d.getDvcDfnCntctPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcDfnCntctPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getContact().size() < i0+1) { devicedefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getContact().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Cntct_Rnk ********************************************************************************/
		if(d.getDvcDfnCntctRnk() != null ) {

			String[] arrayi0 = d.getDvcDfnCntctRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getContact().size() < i0+1) { devicedefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getContact().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Cntct_Sys ********************************************************************************/
		if(d.getDvcDfnCntctSys() != null ) {

			String[] arrayi0 = d.getDvcDfnCntctSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getContact().size() < i0+1) { devicedefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getContact().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Cntct_Use ********************************************************************************/
		if(d.getDvcDfnCntctUse() != null ) {

			String[] arrayi0 = d.getDvcDfnCntctUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getContact().size() < i0+1) { devicedefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getContact().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Cntct_Vl ********************************************************************************/
		if(d.getDvcDfnCntctVl() != null ) {

			String[] arrayi0 = d.getDvcDfnCntctVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getContact().size() < i0+1) { devicedefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getContact().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_DvcNm_Nm ********************************************************************************/
		if(d.getDvcDfnDvcNmNm() != null ) {

			String[] arrayi0 = d.getDvcDfnDvcNmNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getDeviceName().size() < i0+1) { devicedefinition.addDeviceName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getDeviceName().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_DvcNm_Typ ********************************************************************************/
		if(d.getDvcDfnDvcNmTyp() != null ) {

			String[] arrayi0 = d.getDvcDfnDvcNmTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getDeviceName().size() < i0+1) { devicedefinition.addDeviceName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getDeviceName().get(i0).setType(new org.hl7.fhir.r4.model.DeviceDefinition.DeviceNameTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Id_Assigner ********************************************************************************/
		if(d.getDvcDfnIdAssigner() != null ) {

			String[] arrayi0 = d.getDvcDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Id_Prd_End ********************************************************************************/
		if(d.getDvcDfnIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcDfnIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Id_Sys ********************************************************************************/
		if(d.getDvcDfnIdSys() != null ) {

			String[] arrayi0 = d.getDvcDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				String[] arrayi1 = d.getDvcDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				String[] arrayi1 = d.getDvcDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				String[] arrayi1 = d.getDvcDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				String[] arrayi1 = d.getDvcDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				String[] arrayi1 = d.getDvcDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnIdTypTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Id_Use ********************************************************************************/
		if(d.getDvcDfnIdUse() != null ) {

			String[] arrayi0 = d.getDvcDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Id_Vl ********************************************************************************/
		if(d.getDvcDfnIdVl() != null ) {

			String[] arrayi0 = d.getDvcDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getIdentifier().size() < i0+1) { devicedefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_LnguageCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnLnguageCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getLanguageCode().size() < i0+1) { devicedefinition.addLanguageCode(); }
				String[] arrayi1 = d.getDvcDfnLnguageCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getLanguageCode().get(i0).getCoding().size() < i1+1) { devicedefinition.getLanguageCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getLanguageCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_LnguageCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnLnguageCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getLanguageCode().size() < i0+1) { devicedefinition.addLanguageCode(); }
				String[] arrayi1 = d.getDvcDfnLnguageCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getLanguageCode().get(i0).getCoding().size() < i1+1) { devicedefinition.getLanguageCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getLanguageCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_LnguageCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnLnguageCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getLanguageCode().size() < i0+1) { devicedefinition.addLanguageCode(); }
				String[] arrayi1 = d.getDvcDfnLnguageCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getLanguageCode().get(i0).getCoding().size() < i1+1) { devicedefinition.getLanguageCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getLanguageCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_LnguageCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnLnguageCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getLanguageCode().size() < i0+1) { devicedefinition.addLanguageCode(); }
				String[] arrayi1 = d.getDvcDfnLnguageCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getLanguageCode().get(i0).getCoding().size() < i1+1) { devicedefinition.getLanguageCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getLanguageCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_LnguageCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnLnguageCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getLanguageCode().size() < i0+1) { devicedefinition.addLanguageCode(); }
				String[] arrayi1 = d.getDvcDfnLnguageCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getLanguageCode().get(i0).getCoding().size() < i1+1) { devicedefinition.getLanguageCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getLanguageCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_LnguageCd_Txt ********************************************************************************/
		if(d.getDvcDfnLnguageCdTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnLnguageCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getLanguageCode().size() < i0+1) { devicedefinition.addLanguageCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getLanguageCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ManufacturerRfrnc ********************************************************************************/
		if(d.getDvcDfnManufacturerRfrnc() != null ) {

			if(d.getDvcDfnManufacturerRfrnc().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnManufacturerRfrnc()==null) {} else {
			devicedefinition.setManufacturer(new org.hl7.fhir.r4.model.Reference(d.getDvcDfnManufacturerRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_ManufacturerStrgTyp ********************************************************************************/
		if(d.getDvcDfnManufacturerStrgTyp() != null ) {

			if(d.getDvcDfnManufacturerStrgTyp().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnManufacturerStrgTyp()==null) {} else {
			devicedefinition.setManufacturer(new org.hl7.fhir.r4.model.StringType(d.getDvcDfnManufacturerStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_Mtrl_AllergenicIndicator ********************************************************************************/
		if(d.getDvcDfnMtrlAllergenicIndicator() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlAllergenicIndicator().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getMaterial().get(i0).setAllergenicIndicator(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Mtrl_Alternate ********************************************************************************/
		if(d.getDvcDfnMtrlAlternate() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlAlternate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getMaterial().get(i0).setAlternate(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				String[] arrayi1 = d.getDvcDfnMtrlSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getMaterial().get(i0).getSubstance().getCoding().size() < i1+1) { devicedefinition.getMaterial().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getMaterial().get(i0).getSubstance().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				String[] arrayi1 = d.getDvcDfnMtrlSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getMaterial().get(i0).getSubstance().getCoding().size() < i1+1) { devicedefinition.getMaterial().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getMaterial().get(i0).getSubstance().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				String[] arrayi1 = d.getDvcDfnMtrlSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getMaterial().get(i0).getSubstance().getCoding().size() < i1+1) { devicedefinition.getMaterial().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getMaterial().get(i0).getSubstance().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				String[] arrayi1 = d.getDvcDfnMtrlSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getMaterial().get(i0).getSubstance().getCoding().size() < i1+1) { devicedefinition.getMaterial().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getMaterial().get(i0).getSubstance().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				String[] arrayi1 = d.getDvcDfnMtrlSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getMaterial().get(i0).getSubstance().getCoding().size() < i1+1) { devicedefinition.getMaterial().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getMaterial().get(i0).getSubstance().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Mtrl_Sbstnc_Txt ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnMtrlSbstncTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getMaterial().size() < i0+1) { devicedefinition.addMaterial(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getMaterial().get(i0).getSubstance().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ModelNmbr ********************************************************************************/
		if(d.getDvcDfnModelNmbr() != null ) {

			if(d.getDvcDfnModelNmbr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnModelNmbr()==null) {} else {
			devicedefinition.setModelNumber(d.getDvcDfnModelNmbr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcDfnNtAthrRfrnc() != null ) {

			String[] arrayi0 = d.getDvcDfnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getNote().size() < i0+1) { devicedefinition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcDfnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = d.getDvcDfnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getNote().size() < i0+1) { devicedefinition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Nt_Txt ********************************************************************************/
		if(d.getDvcDfnNtTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getNote().size() < i0+1) { devicedefinition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Nt_Time ********************************************************************************/
		if(d.getDvcDfnNtTime() != null ) {

			String[] arrayi0 = d.getDvcDfnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getNote().size() < i0+1) { devicedefinition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_OnlineInfo ********************************************************************************/
		if(d.getDvcDfnOnlineInfo() != null ) {

			if(d.getDvcDfnOnlineInfo().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnOnlineInfo()==null) {} else {
			devicedefinition.setOnlineInformation(d.getDvcDfnOnlineInfo().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_Owner ********************************************************************************/
		if(d.getDvcDfnOwner() != null ) {

			if(d.getDvcDfnOwner().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnOwner()==null) {} else {
			devicedefinition.setOwner(new org.hl7.fhir.r4.model.Reference(d.getDvcDfnOwner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_ParentDvc ********************************************************************************/
		if(d.getDvcDfnParentDvc() != null ) {

			if(d.getDvcDfnParentDvc().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnParentDvc()==null) {} else {
			devicedefinition.setParentDevice(new org.hl7.fhir.r4.model.Reference(d.getDvcDfnParentDvc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Color ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsColor() != null ) {

				for( String currListStrSplit : d.getDvcDfnPhysclCrctrstcsColor().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicedefinition.getPhysicalCharacteristics().addColor(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthCd() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsDepthCd().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsDepthCd()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getDepth().setCode(d.getDvcDfnPhysclCrctrstcsDepthCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Cmprtr ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthCmprtr() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsDepthCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsDepthCmprtr()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getDepth().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcDfnPhysclCrctrstcsDepthCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthSys() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsDepthSys().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsDepthSys()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getDepth().setSystem(d.getDvcDfnPhysclCrctrstcsDepthSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthUnt() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsDepthUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsDepthUnt()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getDepth().setUnit(d.getDvcDfnPhysclCrctrstcsDepthUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthVl() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsDepthVl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsDepthVl()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getDepth().setValue((new java.math.BigDecimal((d.getDvcDfnPhysclCrctrstcsDepthVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterCd() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsExternalDiameterCd().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsExternalDiameterCd()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getExternalDiameter().setCode(d.getDvcDfnPhysclCrctrstcsExternalDiameterCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Cmprtr ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterCmprtr() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsExternalDiameterCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsExternalDiameterCmprtr()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getExternalDiameter().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcDfnPhysclCrctrstcsExternalDiameterCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterSys() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsExternalDiameterSys().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsExternalDiameterSys()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getExternalDiameter().setSystem(d.getDvcDfnPhysclCrctrstcsExternalDiameterSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterUnt() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsExternalDiameterUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsExternalDiameterUnt()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getExternalDiameter().setUnit(d.getDvcDfnPhysclCrctrstcsExternalDiameterUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterVl() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsExternalDiameterVl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsExternalDiameterVl()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getExternalDiameter().setValue((new java.math.BigDecimal((d.getDvcDfnPhysclCrctrstcsExternalDiameterVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightCd() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsHeightCd().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsHeightCd()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getHeight().setCode(d.getDvcDfnPhysclCrctrstcsHeightCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Cmprtr ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightCmprtr() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsHeightCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsHeightCmprtr()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getHeight().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcDfnPhysclCrctrstcsHeightCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightSys() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsHeightSys().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsHeightSys()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getHeight().setSystem(d.getDvcDfnPhysclCrctrstcsHeightSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightUnt() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsHeightUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsHeightUnt()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getHeight().setUnit(d.getDvcDfnPhysclCrctrstcsHeightUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightVl() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsHeightVl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsHeightVl()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getHeight().setValue((new java.math.BigDecimal((d.getDvcDfnPhysclCrctrstcsHeightVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageCntntTyp() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageCreation() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageData() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageHash() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageLnguage() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageSz() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageTtl() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageUrl() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsImageUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getImage().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getImage().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImprint() != null ) {

				for( String currListStrSplit : d.getDvcDfnPhysclCrctrstcsImprint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicedefinition.getPhysicalCharacteristics().addImprint(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeCd() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsNominalVolumeCd().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsNominalVolumeCd()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getNominalVolume().setCode(d.getDvcDfnPhysclCrctrstcsNominalVolumeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Cmprtr ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeCmprtr() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsNominalVolumeCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsNominalVolumeCmprtr()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getNominalVolume().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcDfnPhysclCrctrstcsNominalVolumeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeSys() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsNominalVolumeSys().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsNominalVolumeSys()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getNominalVolume().setSystem(d.getDvcDfnPhysclCrctrstcsNominalVolumeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeUnt() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsNominalVolumeUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsNominalVolumeUnt()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getNominalVolume().setUnit(d.getDvcDfnPhysclCrctrstcsNominalVolumeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeVl() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsNominalVolumeVl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsNominalVolumeVl()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getNominalVolume().setValue((new java.math.BigDecimal((d.getDvcDfnPhysclCrctrstcsNominalVolumeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsScoringCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsScoringCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsScoringCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsScoringCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnPhysclCrctrstcsScoringCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { devicedefinition.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringTxt() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsScoringTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsScoringTxt()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getScoring().setText(d.getDvcDfnPhysclCrctrstcsScoringTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Shape ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsShape() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsShape().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsShape()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().setShape(d.getDvcDfnPhysclCrctrstcsShape().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtCd() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWghtCd().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWghtCd()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWeight().setCode(d.getDvcDfnPhysclCrctrstcsWghtCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Cmprtr ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtCmprtr() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWghtCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWghtCmprtr()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWeight().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcDfnPhysclCrctrstcsWghtCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtSys() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWghtSys().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWghtSys()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWeight().setSystem(d.getDvcDfnPhysclCrctrstcsWghtSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtUnt() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWghtUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWghtUnt()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWeight().setUnit(d.getDvcDfnPhysclCrctrstcsWghtUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtVl() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWghtVl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWghtVl()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWeight().setValue((new java.math.BigDecimal((d.getDvcDfnPhysclCrctrstcsWghtVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthCd() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWidthCd().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWidthCd()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWidth().setCode(d.getDvcDfnPhysclCrctrstcsWidthCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Cmprtr ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthCmprtr() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWidthCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWidthCmprtr()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWidth().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcDfnPhysclCrctrstcsWidthCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthSys() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWidthSys().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWidthSys()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWidth().setSystem(d.getDvcDfnPhysclCrctrstcsWidthSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthUnt() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWidthUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWidthUnt()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWidth().setUnit(d.getDvcDfnPhysclCrctrstcsWidthUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthVl() != null ) {

			if(d.getDvcDfnPhysclCrctrstcsWidthVl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnPhysclCrctrstcsWidthVl()==null) {} else {
			devicedefinition.getPhysicalCharacteristics().getWidth().setValue((new java.math.BigDecimal((d.getDvcDfnPhysclCrctrstcsWidthVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getProperty().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnPrptyTypTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getProperty().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueCode().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcDfnPrptyVlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { devicedefinition.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueCode().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcDfnPrptyVlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { devicedefinition.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueCode().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcDfnPrptyVlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { devicedefinition.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueCode().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcDfnPrptyVlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { devicedefinition.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueCode().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueCode(); }
					String[] arrayi2 = d.getDvcDfnPrptyVlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().size() < i2+1) { devicedefinition.getProperty().get(i0).getValueCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getProperty().get(i0).getValueCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_Prpty_VlCd_Txt ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueCode().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getValueCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_VlQnty_Cd ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntyCd() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueQuantity().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getValueQuantity().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_VlQnty_Cmprtr ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntyCmprtr() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueQuantity().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getValueQuantity().get(i1).setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_Prpty_VlQnty_Sys ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntySys() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueQuantity().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getValueQuantity().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_VlQnty_Unt ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntyUnt() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueQuantity().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getValueQuantity().get(i1).setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Prpty_VlQnty_Vl ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntyVl() != null ) {

			String[] arrayi0 = d.getDvcDfnPrptyVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getProperty().size() < i0+1) { devicedefinition.addProperty(); }
				String[] arrayi1 = d.getDvcDfnPrptyVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getProperty().get(i0).getValueQuantity().size() < i1+1) { devicedefinition.getProperty().get(i0).addValueQuantity(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getProperty().get(i0).getValueQuantity().get(i1).setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** DvcDfn_Qnty_Cd ********************************************************************************/
		if(d.getDvcDfnQntyCd() != null ) {

			if(d.getDvcDfnQntyCd().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnQntyCd()==null) {} else {
			devicedefinition.getQuantity().setCode(d.getDvcDfnQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_Qnty_Cmprtr ********************************************************************************/
		if(d.getDvcDfnQntyCmprtr() != null ) {

			if(d.getDvcDfnQntyCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnQntyCmprtr()==null) {} else {
			devicedefinition.getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcDfnQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcDfn_Qnty_Sys ********************************************************************************/
		if(d.getDvcDfnQntySys() != null ) {

			if(d.getDvcDfnQntySys().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnQntySys()==null) {} else {
			devicedefinition.getQuantity().setSystem(d.getDvcDfnQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_Qnty_Unt ********************************************************************************/
		if(d.getDvcDfnQntyUnt() != null ) {

			if(d.getDvcDfnQntyUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnQntyUnt()==null) {} else {
			devicedefinition.getQuantity().setUnit(d.getDvcDfnQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_Qnty_Vl ********************************************************************************/
		if(d.getDvcDfnQntyVl() != null ) {

			if(d.getDvcDfnQntyVl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnQntyVl()==null) {} else {
			devicedefinition.getQuantity().setValue((new java.math.BigDecimal((d.getDvcDfnQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcDfn_Safety_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnSafetyCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnSafetyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSafety().size() < i0+1) { devicedefinition.addSafety(); }
				String[] arrayi1 = d.getDvcDfnSafetyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getSafety().get(i0).getCoding().size() < i1+1) { devicedefinition.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getSafety().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Safety_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnSafetyCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnSafetyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSafety().size() < i0+1) { devicedefinition.addSafety(); }
				String[] arrayi1 = d.getDvcDfnSafetyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getSafety().get(i0).getCoding().size() < i1+1) { devicedefinition.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getSafety().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Safety_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnSafetyCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnSafetyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSafety().size() < i0+1) { devicedefinition.addSafety(); }
				String[] arrayi1 = d.getDvcDfnSafetyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getSafety().get(i0).getCoding().size() < i1+1) { devicedefinition.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getSafety().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Safety_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnSafetyCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnSafetyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSafety().size() < i0+1) { devicedefinition.addSafety(); }
				String[] arrayi1 = d.getDvcDfnSafetyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getSafety().get(i0).getCoding().size() < i1+1) { devicedefinition.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getSafety().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_Safety_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnSafetyCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnSafetyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSafety().size() < i0+1) { devicedefinition.addSafety(); }
				String[] arrayi1 = d.getDvcDfnSafetyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getSafety().get(i0).getCoding().size() < i1+1) { devicedefinition.getSafety().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getSafety().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_Safety_Txt ********************************************************************************/
		if(d.getDvcDfnSafetyTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnSafetyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSafety().size() < i0+1) { devicedefinition.addSafety(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getSafety().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdAssigner() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdSys() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Use ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdUse() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdVl() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdCd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgPrdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getPeriod().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Cmprtr ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdCmprtr() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgPrdCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getPeriod().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdSys() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgPrdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getPeriod().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdUnt() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getPeriod().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdVl() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgPrdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getPeriod().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).addSpecialPrecautionsForStorage(); }
					String[] arrayi2 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().size() < i2+1) { devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).addSpecialPrecautionsForStorage(); }
					String[] arrayi2 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().size() < i2+1) { devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).addSpecialPrecautionsForStorage(); }
					String[] arrayi2 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().size() < i2+1) { devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).addSpecialPrecautionsForStorage(); }
					String[] arrayi2 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().size() < i2+1) { devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).addSpecialPrecautionsForStorage(); }
					String[] arrayi2 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().size() < i2+1) { devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).addSpecialPrecautionsForStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getSpecialPrecautionsForStorage().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				String[] arrayi1 = d.getDvcDfnShlfLfStrgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().size() < i1+1) { devicedefinition.getShelfLifeStorage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypTxt() != null ) {

			String[] arrayi0 = d.getDvcDfnShlfLfStrgTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getShelfLifeStorage().size() < i0+1) { devicedefinition.addShelfLifeStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getShelfLifeStorage().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Spclization_SysTyp ********************************************************************************/
		if(d.getDvcDfnSpclizationSysTyp() != null ) {

			String[] arrayi0 = d.getDvcDfnSpclizationSysTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSpecialization().size() < i0+1) { devicedefinition.addSpecialization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getSpecialization().get(i0).setSystemType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Spclization_Vrsn ********************************************************************************/
		if(d.getDvcDfnSpclizationVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnSpclizationVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getSpecialization().size() < i0+1) { devicedefinition.addSpecialization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getSpecialization().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcDfnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getType().getCoding().size() < i0+1) { devicedefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcDfnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getType().getCoding().size() < i0+1) { devicedefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcDfnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getType().getCoding().size() < i0+1) { devicedefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcDfnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getType().getCoding().size() < i0+1) { devicedefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcDfnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getType().getCoding().size() < i0+1) { devicedefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnTypTxt() != null ) {

			if(d.getDvcDfnTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnTypTxt()==null) {} else {
			devicedefinition.getType().setText(d.getDvcDfnTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_UdiDvcId_DvcId ********************************************************************************/
		if(d.getDvcDfnUdiDvcIdDvcId() != null ) {

			String[] arrayi0 = d.getDvcDfnUdiDvcIdDvcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getUdiDeviceIdentifier().size() < i0+1) { devicedefinition.addUdiDeviceIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getUdiDeviceIdentifier().get(i0).setDeviceIdentifier(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_UdiDvcId_Issuer ********************************************************************************/
		if(d.getDvcDfnUdiDvcIdIssuer() != null ) {

			String[] arrayi0 = d.getDvcDfnUdiDvcIdIssuer().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getUdiDeviceIdentifier().size() < i0+1) { devicedefinition.addUdiDeviceIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getUdiDeviceIdentifier().get(i0).setIssuer(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_UdiDvcId_Jrsdctn ********************************************************************************/
		if(d.getDvcDfnUdiDvcIdJrsdctn() != null ) {

			String[] arrayi0 = d.getDvcDfnUdiDvcIdJrsdctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicedefinition.getUdiDeviceIdentifier().size() < i0+1) { devicedefinition.addUdiDeviceIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicedefinition.getUdiDeviceIdentifier().get(i0).setJurisdiction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcDfn_Url ********************************************************************************/
		if(d.getDvcDfnUrl() != null ) {

			if(d.getDvcDfnUrl().replace("[","").replace("]","").equals("NULL") | d.getDvcDfnUrl()==null) {} else {
			devicedefinition.setUrl(d.getDvcDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcDfn_Vrsn ********************************************************************************/
		if(d.getDvcDfnVrsn() != null ) {

				for( String currListStrSplit : d.getDvcDfnVrsn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicedefinition.addVersion(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		return devicedefinition;
	}
}
