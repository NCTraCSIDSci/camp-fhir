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
		if(l.getLinkageActive() != null) {
			linkage.setActive(Boolean.parseBoolean(l.getLinkageActive()));
		}
		/******************** Linkage_Athr ********************************************************************************/
		if(l.getLinkageAthr() != null) {
			linkage.setAuthor( new org.hl7.fhir.r4.model.Reference(l.getLinkageAthr()));
		}
		/******************** linkageitem ********************************************************************************/
		org.hl7.fhir.r4.model.Linkage.LinkageItemComponent linkageitem =  new org.hl7.fhir.r4.model.Linkage.LinkageItemComponent();
		linkage.addItem(linkageitem);

		/******************** Linkage_Itm_Rsrc ********************************************************************************/
		if(l.getLinkageItmRsrc() != null) {
			linkageitem.setResource( new org.hl7.fhir.r4.model.Reference(l.getLinkageItmRsrc()));
		}
		/******************** linkageitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.Linkage.LinkageTypeEnumFactory linkageitemtype =  new org.hl7.fhir.r4.model.Linkage.LinkageTypeEnumFactory();
		linkageitem.setType(linkageitemtype.fromCode(l.getLinkageItmTyp()));

		return linkage;
	}
}
