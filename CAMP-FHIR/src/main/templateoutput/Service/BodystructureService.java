//// default package
package main.templateoutput.Service;

// Generated on Jan 28, 2022, 7:59:48 AM 


import ca.uhn.fhir.context.FhirContext;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import main.java.com.campfhir.dao.BodystructureDao;
import main.java.com.campfhir.service.conversion.BodystructureConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Bodystructure.
 * @see .Bodystructure
 * @author Paul Kovach
 */

public class BodystructureService {

	private static BodystructureDao BodystructureDao;
	private static BodystructureConversion BodystructureConversion;

	public BodystructureService() 
	{
		BodystructureDao = new BodystructureDao();
		BodystructureConversion = new BodystructureConversion();
	}

	public void persist(main.java.com.campfhir.model.Bodystructure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BodystructureDao.openCurrentSessionwithTransaction();
		 BodystructureDao.persist(entity);
		 BodystructureDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Bodystructure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BodystructureDao.openCurrentSessionwithTransaction();
		 BodystructureDao.update(entity);
		 BodystructureDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Bodystructure findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BodystructureDao.openCurrentSession();
		main.java.com.campfhir.model.Bodystructure resource = BodystructureDao.findById(id);
		BodystructureDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Bodystructure> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BodystructureDao.openCurrentSession();
		List<main.java.com.campfhir.model.Bodystructure> resource =  BodystructureDao.findByPatientId(id);
		BodystructureDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BodystructureDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Bodystructure resource =  BodystructureDao.findById(id);
		BodystructureDao.delete(resource);
		BodystructureDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  BodystructureDao.openCurrentSession();
		ScrollableResults resources =  BodystructureDao.findAll();
		
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( resources.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				session.clear();
				
		    	writeFile(path, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/Bodystructure.html")  			   
			   .setResource(BodystructureConversion.Bodystructures((main.java.com.campfhir.model.Bodystructure) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  BodystructureDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Bodystructure> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  BodystructureDao.findAll();
		List<main.java.com.campfhir.model.Bodystructure> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Bodystructure) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 BodystructureDao.openCurrentSessionwithTransaction();
		 BodystructureDao.deleteAll();
		 BodystructureDao.closeCurrentSessionwithTransaction();
	}

	public BodystructureDao  BodystructureDao() 
	{
		return  BodystructureDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
	    
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+"/"+domain+".json", true), StandardCharsets.UTF_8));
			
			String file = FhirContext.forR4().newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);			
			
		    writer.write(file);
		    writer.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	    
	}
}

