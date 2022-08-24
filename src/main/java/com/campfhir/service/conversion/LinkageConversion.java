package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Linkage;
public class LinkageConversion 
{
	public org.hl7.fhir.r4.model.Linkage Linkages(Linkage l) throws ParseException
	{
		org.hl7.fhir.r4.model.Linkage linkage = new org.hl7.fhir.r4.model.Linkage();

		/******************** id ********************************************************************************/
		linkage.setId(l.getId());

		/******************** Linkage_Active ********************************************************************************/
		if(l.getLinkageActive() != null ) {

			if(l.getLinkageActive().replace("[","").replace("]","").equals("NULL") | l.getLinkageActive()==null) {} else {
			linkage.setActive(Boolean.parseBoolean(l.getLinkageActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Linkage_Athr ********************************************************************************/
		if(l.getLinkageAthr() != null ) {

			if(l.getLinkageAthr().replace("[","").replace("]","").equals("NULL") | l.getLinkageAthr()==null) {} else {
			linkage.setAuthor(new org.hl7.fhir.r4.model.Reference(l.getLinkageAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Linkage_Itm_Rsrc ********************************************************************************/
		if(l.getLinkageItmRsrc() != null ) {

			String[] arrayi0 = l.getLinkageItmRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(linkage.getItem().size() < i0+1) { linkage.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {linkage.getItem().get(i0).setResource(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Linkage_Itm_Typ ********************************************************************************/
		if(l.getLinkageItmTyp() != null ) {

			String[] arrayi0 = l.getLinkageItmTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(linkage.getItem().size() < i0+1) { linkage.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {linkage.getItem().get(i0).setType(new org.hl7.fhir.r4.model.Linkage.LinkageTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return linkage;
	}
}
