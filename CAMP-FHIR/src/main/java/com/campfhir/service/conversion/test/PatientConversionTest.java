package main.java.com.campfhir.service.conversion.test;
import java.io.IOException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import main.java.com.campfhir.service.PatientService;
import main.java.com.campfhir.service.conversion.PatientConversion;
public class PatientConversionTest {
	
private static PatientConversion patientConversion;
private static PatientService patientService;
FhirContext ctx = FhirContext.forR4();
IGenericClient client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
@Test
//removed IDs for now 
void testHumanName() throws ParseException 
{
	patientService = new PatientService();
	main.java.com.campfhir.model.Patient p = new main.java.com.campfhir.model.Patient();
	
	//code for pulling test fhir from hapi fhir
	PatientConversion pc = new PatientConversion();
	Bundle bundle = (Bundle) client.search().forResource(Patient.class)
			.where(new TokenClientParam("_id").exactly().code("PLACEHOLDER"))
			.include(new Include("Patient:general-practitioner"))
			.include(new Include("Patient:link"))
			.include(new Include("Patient:organization"))
			.prettyPrint()
			.execute();
	System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle));

	try {
		p = patientService.findById("PLACEHOLDER");
		System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pc.Patients(p)));
	} catch (ParserConfigurationException | SAXException | IOException e) {
		e.printStackTrace();
	}
		   
	System.out.println(p.getPNT_IDENTIFIER());
	

	//fail("Not yet implemented");
	}
}


