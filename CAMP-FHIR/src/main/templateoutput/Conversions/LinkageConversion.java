package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Linkage.
 * @see .Linkage
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class LinkageConversion 
{
	public Patient Linkages(main.templateoutput.Model.Linkage linkage) 
	{
			Patient  Linkageobj = new Patient(); 

						Linkageobj.setActive(HapiFHIRHelpers.createboolean(linkage.getLinkageActiveBoolean() /** { "tree" :"Linkage.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Linkageobj.setAuthor(HapiFHIRHelpers.createReference(linkage.getLinkageAuthorReference() /** { "tree" :"Linkage.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
						));
Linkageobj.setType(HapiFHIRHelpers.createcode(linkage.getLinkageItemTypeCode() /** { "tree" :"Linkage.item.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setItem"] , "methodName" : "setType"} **/
						));
Linkageobj.setResource(HapiFHIRHelpers.createReference(linkage.getLinkageItemResourceReference() /** { "tree" :"Linkage.item.resource", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setItem"] , "methodName" : "setResource"} **/
		));
	}
}
