package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Binary.
 * @see .Binary
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class BinaryConversion 
{
	public Patient Binarys(main.templateoutput.Model.Binary binary) 
	{
			Patient  Binaryobj = new Patient(); 

						Binaryobj.setContentType(HapiFHIRHelpers.createcode(binary.getBinaryContentTypeCode() /** { "tree" :"Binary.contentType", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContentType"} **/
						));
Binaryobj.setSecurityContext(HapiFHIRHelpers.createReference(binary.getBinarySecurityContextReference() /** { "tree" :"Binary.securityContext", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSecurityContext"} **/
						));
Binaryobj.setData(HapiFHIRHelpers.createbase64Binary(binary.getBinaryDataBase64binary() /** { "tree" :"Binary.data", "datatype" : "base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setData"} **/
		));
	}
}
