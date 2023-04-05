package main.java.com.campfhir.service.conversion.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.HibernateException;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Resource;
import main.java.com.campfhir.service.ResourceInService;
//import main.java.com.campfhir.service.ResourceService;
import main.java.com.campfhir.service.bidirectionalconversion.PatientBidirectionalConversion;
import main.java.com.campfhir.service.conversion.PatientConversion;
public class ObservationConversionTest {
	


FhirContext ctx = FhirContext.forR4();
IGenericClient client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
//@Test
//	void testBiConversion() throws ParseException, JsonParseException, JsonMappingException, IOException, HibernateException, FHIRException, ParserConfigurationException, SAXException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException 
//	{
//
//		File directory = new File("config.json");
//		ObjectMapper mapper = new ObjectMapper();
//	    Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);
//	
//		int p = Integer.parseInt(cf.getPartition());
//	
////		 if(cf.getResource().equals("Patient"))
////		{
////		
////		File patientjson = new File("C:\\Users\\pikovach\\Downloads\\CAMPFHIR_1.0\\CAMPFHIR_ECLIPSE\\workspace\\Demo_Database\\patient_new.json");
////		FileReader fr=null
//		String fileName = "C:\\Users\\pikovach\\Downloads\\CAMPFHIR_2023_01_09\\CAMPFHIR_1.0\\CAMPFHIR_ECLIPSE\\workspace\\Demo_Database\\CAMPFHIR_JSON\\patient.json";
//
//		String content = new String(Files.readAllBytes(Paths.get(fileName)));
//	//	System.out.println(content);
//		// Instantiate a new parser
//		IParser parser = ctx.newJsonParser();
//
//		// Parse it
//		Bundle bundle = parser.parseResource(Bundle.class, content);
//		
//	//	try{fr = new FileReader(patientjson);}catch (FileNotFoundException fe){System.out.println("File not found");}
//		@SuppressWarnings("deprecation")
////		Bundle bundle = (Bundle) client.search().forResource(Patient.class)
////				 .where(new TokenClientParam("_id").exactly().code("1963461"))
////			//	 .where(new TokenClientParam("active").exactly().code("true"))
////				 .prettyPrint()
////			//	 .limitTo(100)
////				 .execute();
//		PatientBidirectionalConversion pbc = new PatientBidirectionalConversion();
//		List<main.java.com.campfhir.model.Resource> patList = new ArrayList<main.java.com.campfhir.model.Resource>();
//		//System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(parsed));
//		for (BundleEntryComponent bec :  bundle.getEntry()) 
//		{ 
//			org.hl7.fhir.r4.model.Resource pat = bec.getResource();
//			main.java.com.campfhir.model.Resource pathibernate = (main.java.com.campfhir.model.Resource) pbc.Patients((Patient) pat);
//		    patList.add(pathibernate);
//		}
//		  new ResourceInService().run(cf);
////		new  ResourceService().persist(patList, cf);
//			     
//	//	}
//		System.out.println("Finished");
//		
//		//fail("Not yet implemented");
//	}

	@Test
	void testConversion() throws ParseException, JsonParseException, JsonMappingException, IOException, HibernateException, FHIRException, ParserConfigurationException, SAXException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException 
	{
		File directory = new File("config.json");
		ObjectMapper mapper = new ObjectMapper();
	    Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);
		int p = Integer.parseInt(cf.getoPartition());
		  new ResourceInService().run(cf);
//		new  ResourceService().findAll(cf);			
	}
}


//patientService = new PatientService();
//main.java.com.campfhir.model.Patient p = new main.java.com.campfhir.model.Patient();
//
////code for pulling test fhir from hapi fhir
////PatientConversion pc = new PatientConversion();
////Bundle bundle = (Bundle) client.search().forResource(Patient.class)
////		//.where(new TokenClientParam("_id").exactly().code("a0b7e6a5-ed4b-4302-bd03-99cbb84d55c2"))
////		.include(new Include("Patient:general-practitioner"))
////		.include(new Include("Patient:link"))
////		.include(new Include("Patient:organization"))
////		.prettyPrint()
////		.execute();
////System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle));
//
//try {
//	p = patientService.findAll(0, null);
//	//System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pc.Patients(p)));
//} catch (ParserConfigurationException | SAXException | IOException e) {
//	e.printStackTrace();
//}
	   
//Patient pat = (Patient) bundle.getEntry().get(0).getResource();
////System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pat));
//PatientBidirectionalConversion pbc = new PatientBidirectionalConversion();
//main.java.com.campfhir.model.Patient pathibernate =  pbc.Patients(pat);
//List<main.java.com.campfhir.model.Patient> patList = new ArrayList<main.java.com.campfhir.model.Patient>();
//patList.add(pathibernate);

//System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString((IBaseResource) pat));
//	 	PatientBidirectionalConversion.Patients(org.hl7.fhir.r4.model.Patient patient) 
//new PatientService().findAll(p, cf);

//	Session session = patientDao.openCurrentSession(cf);
//	ScrollableResults patients = patientDao.findAll();
//	
//	patients = patientDao.findAll();
//	
//    int i = 1;
//    
//    System.out.println("start");
//
//	BundleEntryComponent b = new BundleEntryComponent();
//	
//	Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
//	
//
//	
//	b.setFullUrl("https://www.hl7.org/fhir/patient.html")
//	.setResource(PatientConversion.Patients((Patient) patients.get(0)));  	
//	
//	bundle.addEntry(b);
// 	Session session = patientDao.openCurrentSession(cf);
 	//new PatientService().findAll(p, cf);
//Bundle bundle = (Bundle) client.search().forResource(Patient.class)
////.where(new TokenClientParam("_id").exactly().code("a0b7e6a5-ed4b-4302-bd03-99cbb84d55c2"))
//.include(new Include("Patient:general-practitioner"))
//.include(new Include("Patient:link"))
//.include(new Include("Patient:organization"))
//.prettyPrint()
//.execute();
	



