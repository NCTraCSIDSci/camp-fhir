package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Linkage;
public class LinkageBidirectionalConversion 
{
	public Linkage Linkages(org.hl7.fhir.r4.model.Linkage linkage) throws ParseException
	{
		 main.java.com.campfhir.model.Linkage l = new  main.java.com.campfhir.model.Linkage();

		/******************** id ********************************************************************************/
		l.setId(linkage.getIdElement().getIdPart());

		/******************** linkageitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Linkage.LinkageItemComponent> linkageitemlist = linkage.getItem();
		for(int linkageitemi = 0; linkageitemi<linkageitemlist.size();linkageitemi++ ) {
		org.hl7.fhir.r4.model.Linkage.LinkageItemComponent  linkageitem = linkageitemlist.get(linkageitemi);

		/******************** Linkage_Itm_Rsrc ********************************************************************************/
		if(linkageitemi == 0) {l.addLinkageItmRsrc("[");}
		if(linkageitem.hasResource()) {

			if(linkageitem.getResource().getReference() != null) {
			l.addLinkageItmRsrc(linkageitem.getResource().getReference());
			}
		} else {
			l.addLinkageItmRsrc("NULL");
		}

		if(linkageitemi == linkageitemlist.size()-1) {l.addLinkageItmRsrc("]");}


		/******************** linkageitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.Linkage.LinkageType linkageitemtype = linkageitem.getType();
		if(linkageitemtype!=null) {
		if(linkageitemi == 0) {

		l.addLinkageItmTyp("[");		}
			l.addLinkageItmTyp(linkageitemtype.toCode());
		if(linkageitemi == linkageitemlist.size()-1) {

		l.addLinkageItmTyp("]");		}

		} else {
			l.addLinkageItmTyp("NULL");
		}

		 };
		/******************** Linkage_Active ********************************************************************************/
		if(linkage.hasActive()) {

			l.addLinkageActive(String.valueOf(linkage.getActive()));
		} else {
			l.addLinkageActive("NULL");
		}


		/******************** Linkage_Athr ********************************************************************************/
		if(linkage.hasAuthor()) {

			if(linkage.getAuthor().getReference() != null) {
			l.addLinkageAthr(linkage.getAuthor().getReference());
			}
		} else {
			l.addLinkageAthr("NULL");
		}


		return l;
	}
}
