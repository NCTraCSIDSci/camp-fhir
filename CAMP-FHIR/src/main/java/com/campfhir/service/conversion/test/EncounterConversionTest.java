//package main.java.com.campfhir.service.conversion.test;
//
//import java.io.IOException;
//import java.text.ParseException;
//
//import javax.xml.parsers.ParserConfigurationException;
//
//import org.hl7.fhir.r4.model.Bundle;
//import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
//import org.hl7.fhir.r4.model.Encounter;
//import org.junit.jupiter.api.Test;
//import org.xml.sax.SAXException;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//import com.fasterxml.jackson.databind.node.ArrayNode;
//import com.fasterxml.jackson.databind.node.ObjectNode;
//
//import ca.uhn.fhir.context.FhirContext;
//import ca.uhn.fhir.model.api.Include;
//import ca.uhn.fhir.parser.DataFormatException;
//import ca.uhn.fhir.parser.IParser;
//import ca.uhn.fhir.rest.client.api.IGenericClient;
//import ca.uhn.fhir.rest.gclient.TokenClientParam;
//import main.java.com.campfhir.service.EncounterService;
//import main.java.com.campfhir.service.PatientService;
//import main.java.com.campfhir.service.conversion.EncounterConversion;
//import main.java.com.campfhir.service.conversion.PatientConversion;
//public class EncounterConversionTest {
//	
//	private static EncounterConversion encConversion;
//	private static EncounterService encService;
//
//	FhirContext ctx = FhirContext.forR4();
//	IGenericClient client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
//	@Test
//	//removed IDs for now 
//	void testHumanName() throws ParseException, IOException, DataFormatException, ParserConfigurationException, SAXException 
//	{
//		main.java.com.campfhir.model.Encounter modelenc = new main.java.com.campfhir.model.Encounter();
//		encService = new EncounterService();
//
//		//code for pulling test fhir from hapi fhir
//		EncounterConversion encConversion = new EncounterConversion();
////		Bundle bundle = (Bundle) client.search().forResource(Encounter.class)
////				.where(new TokenClientParam("_id").exactly().code("14693cea-02b9-3743-9010-fa549107ea68"))
////				.include(new Include("*"))
////				.prettyPrint()
////				.execute();
////				
////	
////	    for (BundleEntryComponent entry: bundle.getEntry()) {
////	    	Encounter enc = (Encounter) entry.getResource();
////	    	System.out.println(enc.getIdentifier().get(0).getValue());
////
////	
////	
////	    }
//	
//		try {
//			modelenc = encService.findById("1");
//			//System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pc.Patients(p)));
//		} catch (ParserConfigurationException | SAXException | IOException e) {
//			e.printStackTrace();
//		}
//			   
//		System.out.println(modelenc.getEncIdVl());
//		
//	
//		//fail("Not yet implemented");
//		}
//}
