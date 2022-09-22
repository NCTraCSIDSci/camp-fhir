package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.hl7.fhir.r4.model.Resource;
import org.xml.sax.SAXException;

import ca.uhn.fhir.context.FhirContext;
import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;

/**
*
* @author  James Champion
* @version 1.0
* @since   2022-08-31 
*/
public class ResourceService 
{

	private static ResourceDao resourceDao;

	public ResourceService() 
	{
		resourceDao = new ResourceDao();
	}
//
//	public void persist(List<Patient> patientList) throws ParserConfigurationException, SAXException, IOException 
//	{
//		Iterator<Patient> patientIterator = patientList.iterator();
//		
	
//		patientDao.openCurrentSessionwithTransaction();
//		
//		while (patientIterator.hasNext()) 
//		{
//			patientDao.persist(patientIterator.next());
//		}
//		
//		patientDao.closeCurrentSessionwithTransaction();
//	}

	public void findAll(Campfhir cf) throws IllegalAccessException, 
															IllegalArgumentException, 
															InvocationTargetException, 
															ClassNotFoundException, 
															NoSuchMethodException, 
															SecurityException, 
															InstantiationException, 
															ParserConfigurationException, 
															SAXException, 
															IOException 
	{	
		
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class<?> loadedMyClass = classLoader.loadClass("main.java.com.campfhir.service.conversion."+cf.getResource()+"Conversion");

		
		Method method = loadedMyClass.getMethods()[0];
		
		Constructor<?> constructor = loadedMyClass.getConstructor();
		Object myClassObject = constructor.newInstance();	        

		
		Session session = resourceDao.openCurrentSession(cf);
		ScrollableResults records = resourceDao.findAll(cf);
		
	    int i = 1;
	    
	    System.out.println("start");

	    
		BundleEntryComponent b = new BundleEntryComponent();
		
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
		
	     while ( records.next() ) 
	     {	 
			if ((i % Integer.parseInt(cf.getPartition())) == 0)
			{
		    	session.clear();		    	
		    	
		    	writeFile(cf, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			b = new BundleEntryComponent();
			
			b.setFullUrl("https://www.hl7.org/fhir/patient.html")
			.setResource((Resource) method.invoke(myClassObject, records.get(0)));  	
			
			bundle.addEntry(b);
	     }
	     
	     writeFile(cf, i, bundle);
	}
	
	public static void writeFile(Campfhir cf, int domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forR4();
		//String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
		
		String file = ctx.newRDFParser().encodeResourceToString(bundle);
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cf.getOutputfolder()+"/"+domain+"."+cf.getFormat(), true), StandardCharsets.UTF_8));
		    writer.write(file);
		    writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
