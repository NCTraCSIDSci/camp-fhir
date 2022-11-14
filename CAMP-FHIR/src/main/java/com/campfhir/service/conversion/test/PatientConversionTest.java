package main.java.com.campfhir.service.conversion.test;
import java.io.File;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Resource;
import main.java.com.campfhir.service.ResourceService;
import main.java.com.campfhir.service.bidirectionalconversion.PatientBidirectionalConversion;
import main.java.com.campfhir.service.conversion.PatientConversion;
public class PatientConversionTest {
	
private static PatientConversion pc;
private static ResourceService patientService;
private static ResourceDao patientDao;
private static PatientBidirectionalConversion PatientBidirectionalConversion;


FhirContext ctx = FhirContext.forR4();
IGenericClient client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
@Test
	void testBiConversion() throws ParseException, JsonParseException, JsonMappingException, IOException, HibernateException, FHIRException, ParserConfigurationException, SAXException, ClassNotFoundException 
	{

		File directory = new File("config.json");
		ObjectMapper mapper = new ObjectMapper();
	    Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);
	
		int p = Integer.parseInt(cf.getPartition());
	
//		 if(cf.getResource().equals("Patient"))
//		{
//		
		 @SuppressWarnings("deprecation")
		Bundle bundle = (Bundle) client.search().forResource(Patient.class)
				 .where(new TokenClientParam("_id").exactly().code("1963461"))
			//	 .where(new TokenClientParam("active").exactly().code("true"))
				 .prettyPrint()
			//	 .limitTo(100)
				 .execute();
		PatientBidirectionalConversion pbc = new PatientBidirectionalConversion();
		List<main.java.com.campfhir.model.Resource> patList = new ArrayList<main.java.com.campfhir.model.Resource>();
		System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle));
		for (BundleEntryComponent bec :  bundle.getEntry()) 
		{ 
			org.hl7.fhir.r4.model.Resource pat = bec.getResource();
			main.java.com.campfhir.model.Resource pathibernate = (main.java.com.campfhir.model.Resource) pbc.Patients((Patient) pat);
		    patList.add(pathibernate);
		}
		
		new  ResourceService().persist(patList, cf);
			     
	//	}
		System.out.println("Finished");
		
		//fail("Not yet implemented");
	}

	@Test
	void testConversion() throws ParseException, JsonParseException, JsonMappingException, IOException, HibernateException, FHIRException, ParserConfigurationException, SAXException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException 
	{
		File directory = new File("config.json");
		ObjectMapper mapper = new ObjectMapper();
	    Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);
		int p = Integer.parseInt(cf.getPartition());
		new  ResourceService().findAll(cf);			
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
	



