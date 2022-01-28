package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Parameters.
 * @see .Parameters
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ParametersConversion 
{
	public Patient Parameterss(main.templateoutput.Model.Parameters parameters) 
	{
			Patient  Parametersobj = new Patient(); 

						Parametersobj.setName(HapiFHIRHelpers.createstring(parameters.getParametersParameterNameString() /** { "tree" :"Parameters.parameter.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addParameter"] , "methodName" : "setName"} **/
						));
Parametersobj.setResource(HapiFHIRHelpers.createResource(parameters.getPrmtrsPrmtrRsrcRsrce() /** { "tree" :"Parameters.parameter.resource", "datatype" : "Resource", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setResource"} **/
						));
Parametersobj.addPart(HapiFHIRHelpers.createparameter(parameters.getPrmtrsPrmtrPrtPrmtr() /** { "tree" :"Parameters.parameter.part", "datatype" : "parameter", "cardinality" : "Many", "elementtree" : ["addParameter"] , "methodName" : "addPart"} **/
		));
	}
}
