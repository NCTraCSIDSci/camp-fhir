package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Linkage;
public class LinkageBidirectionalConversion 
{
	public Linkage Linkages(org.hl7.fhir.r4.model.Linkage linkage) throws ParseException
	{
		 main.java.com.campfhir.model.Linkage l = new  main.java.com.campfhir.model.Linkage();

		/******************** id ********************************************************************************/
		linkage.setId(l.getId());

		/******************** linkageitem ********************************************************************************/
		org.hl7.fhir.r4.model.Linkage.LinkageItemComponent linkageitem = linkage.getItemFirstRep();

		/******************** Linkage_Itm_Rsrc ********************************************************************************/
		if(linkageitem.hasResource()) {
			l.setLinkageItmRsrc(String.valueOf(linkageitem.getResource()));
		}
		/******************** linkageitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.Linkage.LinkageType linkageitemtype = linkageitem.getType();
		l.setLinkageItmTyp(linkageitemtype.toCode());

		/******************** Linkage_Active ********************************************************************************/
		if(linkage.hasActive()) {
			l.setLinkageActive(String.valueOf(linkage.getActive()));
		}
		/******************** Linkage_Athr ********************************************************************************/
		if(linkage.hasAuthor()) {
			l.setLinkageAthr(String.valueOf(linkage.getAuthor()));
		}
		return l;
	}
}
