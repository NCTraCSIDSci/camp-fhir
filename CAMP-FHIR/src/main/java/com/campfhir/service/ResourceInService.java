package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.service.bidirectionalconversion.PatientBidirectionalConversion;

/**
*
* @author  James Champion
* @version 1.0
* @since   2022-08-31 
*/
public class ResourceInService 
{

	public static ResourceDao resourceDao;
	
	FhirContext ctx = FhirContext.forR4();
	IGenericClient client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");

	public  ResourceInService() 
	{
		resourceDao = new ResourceDao();
	}

	public void run(Campfhir cf) throws IllegalAccessException, 
															IllegalArgumentException, 
															InvocationTargetException, 
															ClassNotFoundException, 
															NoSuchMethodException, 
															SecurityException, 
															InstantiationException, 
															ParserConfigurationException, 
															SAXException, 
															IOException, ParseException 
	{	
		
		if(cf.getiFileType().equals(""))
		{
			ClassLoader classLoader = this.getClass().getClassLoader();
			Class<?> loadedMyClass = classLoader.loadClass("main.java.com.campfhir.service.conversion."+cf.getResource()+"Conversion");

			Method method = loadedMyClass.getMethods()[0];
		
			Constructor<?> constructor = loadedMyClass.getConstructor();
			Object myClassObject = constructor.newInstance();
		
			Session session = resourceDao.openCurrentSessionwithTransaction(cf, "in");
			ScrollableResults records = resourceDao.findAll(cf);
			
		    int i = 1;
		    
			BundleEntryComponent b = new BundleEntryComponent();
			
			Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
			
		    while ( records.next() ) 
		    {	 
				if ((i % Integer.parseInt(cf.getoPartition())) == 0)
				{
			    	session.clear();		    	
			    	
			    	writeFile(cf, i, bundle);
				    bundle = new Bundle().setType(BundleType.COLLECTION);
				}
				
				i++;
				
				
				b = new BundleEntryComponent();
				
				b.setFullUrl("https://www.hl7.org/fhir/"+cf.getResource()+".html")
				.setResource((Resource) method.invoke(myClassObject, records.get()));  	
				
				bundle.addEntry(b);
		     }
		     
		     writeFile(cf, i, bundle);
		     resourceDao.closeCurrentSessionwithTransaction();

		}
		else
		{
			ClassLoader classLoader = this.getClass().getClassLoader();
			Class<?> loadedMyClass = classLoader.loadClass("main.java.com.campfhir.service.bidirectionalconversion."+cf.getResource()+"BidirectionalConversion");

			Method method = loadedMyClass.getMethods()[0];
			
			Constructor<?> constructor = loadedMyClass.getConstructor();
			Object myClassObject = constructor.newInstance();
			
			String content = new String(Files.readAllBytes(Paths.get(cf.getiInputfolder())));

			IParser parser = ctx.newJsonParser();

			Bundle bd = parser.parseResource(Bundle.class, content);
			
			Session session = resourceDao.openCurrentSessionwithTransaction(cf, "out"); 
			
			for (BundleEntryComponent bec :  bd.getEntry()) 
			{ 
			    Resource r = (Resource) bec.getResource();
			    main.java.com.campfhir.model.Resource out = (main.java.com.campfhir.model.Resource) method.invoke(myClassObject, r);
			    
			    resourceDao.persist(out);
			}
			resourceDao.closeCurrentSessionwithTransaction();
		} 
	}
	
	public static void writeFile(Campfhir cf, int domain, Bundle bundle) throws IOException
	{			 
		FhirContext ctx = FhirContext.forR4();
		
		String file = null;
		
			if(cf.getoFileType().equals("json"))
			{
				file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
			}
			else if(cf.getoFileType().equals("xml"))
			{
				file = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(bundle);
			}
			else if(cf.getoFileType().equals("rdf"))
			{
				file = ctx.newRDFParser().setPrettyPrint(true).encodeResourceToString(bundle);
			}
			System.out.println(cf.getoOutputfolder()+"/"+domain+"."+cf.getoFileType());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cf.getoOutputfolder()+"/"+domain+"."+cf.getoFileType(), true), StandardCharsets.UTF_8));
		    writer.write(file);
		    writer.close();
		
		
	
	}
}
