package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CatalogEntry;
public class CatalogEntryConversion 
{
	public org.hl7.fhir.r4.model.CatalogEntry CatalogEntrys(CatalogEntry c) throws ParseException
	{
		org.hl7.fhir.r4.model.CatalogEntry catalogentry = new org.hl7.fhir.r4.model.CatalogEntry();

		/******************** id ********************************************************************************/
		catalogentry.setId(c.getId());

		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgCd() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlCrctrstcCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalCharacteristic().size() < i0+1) { catalogentry.addAdditionalCharacteristic(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlCrctrstcCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalCharacteristic().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalCharacteristic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgDsply() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlCrctrstcCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalCharacteristic().size() < i0+1) { catalogentry.addAdditionalCharacteristic(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlCrctrstcCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalCharacteristic().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalCharacteristic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlCrctrstcCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalCharacteristic().size() < i0+1) { catalogentry.addAdditionalCharacteristic(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlCrctrstcCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalCharacteristic().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalCharacteristic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlCrctrstcCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalCharacteristic().size() < i0+1) { catalogentry.addAdditionalCharacteristic(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlCrctrstcCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalCharacteristic().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalCharacteristic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlCrctrstc_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcCdgVrsn() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlCrctrstcCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalCharacteristic().size() < i0+1) { catalogentry.addAdditionalCharacteristic(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlCrctrstcCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalCharacteristic().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalCharacteristic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlCrctrstc_Txt ********************************************************************************/
		if(c.getCatalogEntryAddtnlCrctrstcTxt() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlCrctrstcTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalCharacteristic().size() < i0+1) { catalogentry.addAdditionalCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalCharacteristic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgCd() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalClassification().size() < i0+1) { catalogentry.addAdditionalClassification(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalClassification().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgDsply() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalClassification().size() < i0+1) { catalogentry.addAdditionalClassification(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalClassification().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalClassification().size() < i0+1) { catalogentry.addAdditionalClassification(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalClassification().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalClassification().size() < i0+1) { catalogentry.addAdditionalClassification(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalClassification().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlClsfctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalClassification().size() < i0+1) { catalogentry.addAdditionalClassification(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getAdditionalClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalClassification().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlClsfctn_Txt ********************************************************************************/
		if(c.getCatalogEntryAddtnlClsfctnTxt() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlClsfctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalClassification().size() < i0+1) { catalogentry.addAdditionalClassification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalClassification().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_AddtnlId_Assigner ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdAssigner() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_AddtnlId_Prd_End ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_AddtnlId_Prd_Strt ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_AddtnlId_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getAdditionalIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getAdditionalIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getAdditionalIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getAdditionalIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlId_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryAddtnlIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getAdditionalIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_AddtnlId_Typ_Txt ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdTypTxt() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_AddtnlId_Use ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdUse() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_AddtnlId_Vl ********************************************************************************/
		if(c.getCatalogEntryAddtnlIdVl() != null ) {

			String[] arrayi0 = c.getCatalogEntryAddtnlIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getAdditionalIdentifier().size() < i0+1) { catalogentry.addAdditionalIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getAdditionalIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Clsfctn_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgCd() != null ) {

			String[] arrayi0 = c.getCatalogEntryClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getClassification().size() < i0+1) { catalogentry.addClassification(); }
				String[] arrayi1 = c.getCatalogEntryClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getClassification().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgDsply() != null ) {

			String[] arrayi0 = c.getCatalogEntryClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getClassification().size() < i0+1) { catalogentry.addClassification(); }
				String[] arrayi1 = c.getCatalogEntryClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getClassification().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Clsfctn_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getClassification().size() < i0+1) { catalogentry.addClassification(); }
				String[] arrayi1 = c.getCatalogEntryClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getClassification().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCatalogEntryClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getClassification().size() < i0+1) { catalogentry.addClassification(); }
				String[] arrayi1 = c.getCatalogEntryClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getClassification().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CatalogEntry_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryClsfctnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCatalogEntryClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getClassification().size() < i0+1) { catalogentry.addClassification(); }
				String[] arrayi1 = c.getCatalogEntryClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getClassification().get(i0).getCoding().size() < i1+1) { catalogentry.getClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getClassification().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Clsfctn_Txt ********************************************************************************/
		if(c.getCatalogEntryClsfctnTxt() != null ) {

			String[] arrayi0 = c.getCatalogEntryClsfctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getClassification().size() < i0+1) { catalogentry.addClassification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getClassification().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Id_Assigner ********************************************************************************/
		if(c.getCatalogEntryIdAssigner() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_Id_Prd_End ********************************************************************************/
		if(c.getCatalogEntryIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_Id_Prd_Strt ********************************************************************************/
		if(c.getCatalogEntryIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_Id_Sys ********************************************************************************/
		if(c.getCatalogEntryIdSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CatalogEntry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				String[] arrayi1 = c.getCatalogEntryIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(catalogentry.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { catalogentry.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {catalogentry.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CatalogEntry_Id_Typ_Txt ********************************************************************************/
		if(c.getCatalogEntryIdTypTxt() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Id_Use ********************************************************************************/
		if(c.getCatalogEntryIdUse() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_Id_Vl ********************************************************************************/
		if(c.getCatalogEntryIdVl() != null ) {

			String[] arrayi0 = c.getCatalogEntryIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getIdentifier().size() < i0+1) { catalogentry.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_LastUpdated ********************************************************************************/
		if(c.getCatalogEntryLastUpdated() != null ) {

			if(c.getCatalogEntryLastUpdated().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryLastUpdated()==null) {} else {
			catalogentry.setLastUpdated(c.getCatalogEntryLastUpdated().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryLastUpdated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCatalogEntryLastUpdated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CatalogEntry_Ordrable ********************************************************************************/
		if(c.getCatalogEntryOrdrable() != null ) {

			if(c.getCatalogEntryOrdrable().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryOrdrable()==null) {} else {
			catalogentry.setOrderable(Boolean.parseBoolean(c.getCatalogEntryOrdrable().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CatalogEntry_RfrncdItm ********************************************************************************/
		if(c.getCatalogEntryRfrncdItm() != null ) {

			if(c.getCatalogEntryRfrncdItm().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryRfrncdItm()==null) {} else {
			catalogentry.setReferencedItem(new org.hl7.fhir.r4.model.Reference(c.getCatalogEntryRfrncdItm().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CatalogEntry_RltedEntry_Itm ********************************************************************************/
		if(c.getCatalogEntryRltedEntryItm() != null ) {

			String[] arrayi0 = c.getCatalogEntryRltedEntryItm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getRelatedEntry().size() < i0+1) { catalogentry.addRelatedEntry(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getRelatedEntry().get(i0).setItem(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_RltedEntry_Relationtype ********************************************************************************/
		if(c.getCatalogEntryRltedEntryRelationtype() != null ) {

			String[] arrayi0 = c.getCatalogEntryRltedEntryRelationtype().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getRelatedEntry().size() < i0+1) { catalogentry.addRelatedEntry(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getRelatedEntry().get(i0).setRelationtype(new org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelationTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_Sts ********************************************************************************/
		if(c.getCatalogEntrySts() != null ) {

			if(c.getCatalogEntrySts().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntrySts()==null) {} else {
			catalogentry.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(c.getCatalogEntrySts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CatalogEntry_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCatalogEntryTypCdgCd() != null ) {

			String[] arrayi0 = c.getCatalogEntryTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getType().getCoding().size() < i0+1) { catalogentry.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCatalogEntryTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCatalogEntryTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getType().getCoding().size() < i0+1) { catalogentry.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCatalogEntryTypCdgSys() != null ) {

			String[] arrayi0 = c.getCatalogEntryTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getType().getCoding().size() < i0+1) { catalogentry.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCatalogEntryTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCatalogEntryTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getType().getCoding().size() < i0+1) { catalogentry.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CatalogEntry_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCatalogEntryTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCatalogEntryTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(catalogentry.getType().getCoding().size() < i0+1) { catalogentry.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {catalogentry.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CatalogEntry_Typ_Txt ********************************************************************************/
		if(c.getCatalogEntryTypTxt() != null ) {

			if(c.getCatalogEntryTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryTypTxt()==null) {} else {
			catalogentry.getType().setText(c.getCatalogEntryTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CatalogEntry_ValidTo ********************************************************************************/
		if(c.getCatalogEntryValidTo() != null ) {

			if(c.getCatalogEntryValidTo().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryValidTo()==null) {} else {
			catalogentry.setValidTo(c.getCatalogEntryValidTo().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryValidTo()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCatalogEntryValidTo().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CatalogEntry_ValidityPrd_End ********************************************************************************/
		if(c.getCatalogEntryValidityPrdEnd() != null ) {

			if(c.getCatalogEntryValidityPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryValidityPrdEnd()==null) {} else {
			catalogentry.getValidityPeriod().setEnd(c.getCatalogEntryValidityPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryValidityPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCatalogEntryValidityPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CatalogEntry_ValidityPrd_Strt ********************************************************************************/
		if(c.getCatalogEntryValidityPrdStrt() != null ) {

			if(c.getCatalogEntryValidityPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryValidityPrdStrt()==null) {} else {
			catalogentry.getValidityPeriod().setStart(c.getCatalogEntryValidityPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCatalogEntryValidityPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCatalogEntryValidityPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return catalogentry;
	}
}
