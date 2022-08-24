package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Group;
public class GroupConversion 
{
	public org.hl7.fhir.r4.model.Group Groups(Group g) throws ParseException
	{
		org.hl7.fhir.r4.model.Group group = new org.hl7.fhir.r4.model.Group();

		/******************** id ********************************************************************************/
		group.setId(g.getId());

		/******************** Grp_Active ********************************************************************************/
		if(g.getGrpActive() != null ) {

			if(g.getGrpActive().replace("[","").replace("]","").equals("NULL") | g.getGrpActive()==null) {} else {
			group.setActive(Boolean.parseBoolean(g.getGrpActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Grp_Actual ********************************************************************************/
		if(g.getGrpActual() != null ) {

			if(g.getGrpActual().replace("[","").replace("]","").equals("NULL") | g.getGrpActual()==null) {} else {
			group.setActual(Boolean.parseBoolean(g.getGrpActual().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Grp_Crctrstc_Cd_Cdg_Cd ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgCd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getCode().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_Cd_Cdg_Dsply ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgDsply() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getCode().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_Cd_Cdg_Sys ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgSys() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getCode().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getCode().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Grp_Crctrstc_Cd_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpCrctrstcCdCdgVrsn() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getCode().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_Cd_Txt ********************************************************************************/
		if(g.getGrpCrctrstcCdTxt() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_Exclude ********************************************************************************/
		if(g.getGrpCrctrstcExclude() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcExclude().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).setExclude(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Crctrstc_Prd_End ********************************************************************************/
		if(g.getGrpCrctrstcPrdEnd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Crctrstc_Prd_Strt ********************************************************************************/
		if(g.getGrpCrctrstcPrdStrt() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Crctrstc_VlBooleanTyp ********************************************************************************/
		if(g.getGrpCrctrstcVlBooleanTyp() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				String[] arrayi1 = g.getGrpCrctrstcVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { group.getCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Crctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(g.getGrpCrctrstcVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlQnty_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlQntyCd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlQnty_Cmprtr ********************************************************************************/
		if(g.getGrpCrctrstcVlQntyCmprtr() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Crctrstc_VlQnty_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlQntySys() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlQnty_Unt ********************************************************************************/
		if(g.getGrpCrctrstcVlQntyUnt() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlQnty_Vl ********************************************************************************/
		if(g.getGrpCrctrstcVlQntyVl() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Hi_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiCd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Hi_Cmprtr ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiCmprtr() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Hi_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiSys() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Hi_Unt ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiUnt() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Hi_Vl ********************************************************************************/
		if(g.getGrpCrctrstcVlRngHiVl() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Lw_Cd ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwCd() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Lw_Cmprtr ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwCmprtr() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Lw_Sys ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwSys() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Lw_Unt ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwUnt() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Crctrstc_VlRng_Lw_Vl ********************************************************************************/
		if(g.getGrpCrctrstcVlRngLwVl() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Grp_Crctrstc_VlRfrnc ********************************************************************************/
		if(g.getGrpCrctrstcVlRfrnc() != null ) {

			String[] arrayi0 = g.getGrpCrctrstcVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCharacteristic().size() < i0+1) { group.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCharacteristic().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Cd_Cdg_Cd ********************************************************************************/
		if(g.getGrpCdCdgCd() != null ) {

			String[] arrayi0 = g.getGrpCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCode().getCoding().size() < i0+1) { group.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(g.getGrpCdCdgDsply() != null ) {

			String[] arrayi0 = g.getGrpCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCode().getCoding().size() < i0+1) { group.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Cd_Cdg_Sys ********************************************************************************/
		if(g.getGrpCdCdgSys() != null ) {

			String[] arrayi0 = g.getGrpCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCode().getCoding().size() < i0+1) { group.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpCdCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGrpCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCode().getCoding().size() < i0+1) { group.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpCdCdgVrsn() != null ) {

			String[] arrayi0 = g.getGrpCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getCode().getCoding().size() < i0+1) { group.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Cd_Txt ********************************************************************************/
		if(g.getGrpCdTxt() != null ) {

			if(g.getGrpCdTxt().replace("[","").replace("]","").equals("NULL") | g.getGrpCdTxt()==null) {} else {
			group.getCode().setText(g.getGrpCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Grp_Id_Assigner ********************************************************************************/
		if(g.getGrpIdAssigner() != null ) {

			String[] arrayi0 = g.getGrpIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Id_Prd_End ********************************************************************************/
		if(g.getGrpIdPrdEnd() != null ) {

			String[] arrayi0 = g.getGrpIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Id_Prd_Strt ********************************************************************************/
		if(g.getGrpIdPrdStrt() != null ) {

			String[] arrayi0 = g.getGrpIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Id_Sys ********************************************************************************/
		if(g.getGrpIdSys() != null ) {

			String[] arrayi0 = g.getGrpIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGrpIdTypCdgCd() != null ) {

			String[] arrayi0 = g.getGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				String[] arrayi1 = g.getGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { group.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGrpIdTypCdgDsply() != null ) {

			String[] arrayi0 = g.getGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				String[] arrayi1 = g.getGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { group.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGrpIdTypCdgSys() != null ) {

			String[] arrayi0 = g.getGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				String[] arrayi1 = g.getGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { group.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGrpIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				String[] arrayi1 = g.getGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { group.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Grp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGrpIdTypCdgVrsn() != null ) {

			String[] arrayi0 = g.getGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				String[] arrayi1 = g.getGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(group.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { group.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {group.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Grp_Id_Typ_Txt ********************************************************************************/
		if(g.getGrpIdTypTxt() != null ) {

			String[] arrayi0 = g.getGrpIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_Id_Use ********************************************************************************/
		if(g.getGrpIdUse() != null ) {

			String[] arrayi0 = g.getGrpIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Id_Vl ********************************************************************************/
		if(g.getGrpIdVl() != null ) {

			String[] arrayi0 = g.getGrpIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getIdentifier().size() < i0+1) { group.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Grp_ManagingEntity ********************************************************************************/
		if(g.getGrpManagingEntity() != null ) {

			if(g.getGrpManagingEntity().replace("[","").replace("]","").equals("NULL") | g.getGrpManagingEntity()==null) {} else {
			group.setManagingEntity(new org.hl7.fhir.r4.model.Reference(g.getGrpManagingEntity().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Grp_Mmbr_Entity ********************************************************************************/
		if(g.getGrpMmbrEntity() != null ) {

			String[] arrayi0 = g.getGrpMmbrEntity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getMember().size() < i0+1) { group.addMember(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getMember().get(i0).setEntity(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Mmbr_Inactive ********************************************************************************/
		if(g.getGrpMmbrInactive() != null ) {

			String[] arrayi0 = g.getGrpMmbrInactive().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getMember().size() < i0+1) { group.addMember(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getMember().get(i0).setInactive(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Mmbr_Prd_End ********************************************************************************/
		if(g.getGrpMmbrPrdEnd() != null ) {

			String[] arrayi0 = g.getGrpMmbrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getMember().size() < i0+1) { group.addMember(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getMember().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Mmbr_Prd_Strt ********************************************************************************/
		if(g.getGrpMmbrPrdStrt() != null ) {

			String[] arrayi0 = g.getGrpMmbrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(group.getMember().size() < i0+1) { group.addMember(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {group.getMember().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Grp_Nm ********************************************************************************/
		if(g.getGrpNm() != null ) {

			if(g.getGrpNm().replace("[","").replace("]","").equals("NULL") | g.getGrpNm()==null) {} else {
			group.setName(g.getGrpNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Grp_Qnty ********************************************************************************/
		if(g.getGrpQnty() != null ) {

			if(g.getGrpQnty().replace("[","").replace("]","").equals("NULL") | g.getGrpQnty()==null) {} else {
			group.setQuantity(Integer.parseInt(g.getGrpQnty().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Grp_Typ ********************************************************************************/
		if(g.getGrpTyp() != null ) {

			if(g.getGrpTyp().replace("[","").replace("]","").equals("NULL") | g.getGrpTyp()==null) {} else {
			group.setType(new org.hl7.fhir.r4.model.Group.GroupTypeEnumFactory().fromCode(g.getGrpTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return group;
	}
}
