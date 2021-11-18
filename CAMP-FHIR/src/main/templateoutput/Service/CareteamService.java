//// default package
package main.templateoutput.Service;

// Generated on Nov 18, 2021, 1:48:14 PM 


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
import main.java.com.campfhir.dao.CareteamDao;
import main.java.com.campfhir.service.conversion.CareteamConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Careteam.
 * @see .Careteam
 * @author Paul Kovach
 */

public class CareteamService {

	private static CareteamDao CareteamDao;
	private static CareteamConversion CareteamConversion;

	public CareteamService() 
	{
		CareteamDao = new CareteamDao();
		CareteamConversion = new CareteamConversion();
	}

	public void persist(main.java.com.campfhir.model.Careteam entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CareteamDao.openCurrentSessionwithTransaction();
		 CareteamDao.persist(entity);
		 CareteamDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Careteam entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CareteamDao.openCurrentSessionwithTransaction();
		 CareteamDao.update(entity);
		 CareteamDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Careteam findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CareteamDao.openCurrentSession();
		main.java.com.campfhir.model.Careteam resource = CareteamDao.findById(id);
		CareteamDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Careteam> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CareteamDao.openCurrentSession();
		List<main.java.com.campfhir.model.Careteam> resource =  CareteamDao.findByPatientId(id);
		CareteamDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CareteamDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Careteam resource =  CareteamDao.findById(id);
		CareteamDao.delete(resource);
		CareteamDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CareteamDao.openCurrentSession();
		ScrollableResults resources =  CareteamDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Careteam.html")  			   
			   .setResource(CareteamConversion.Careteams((main.java.com.campfhir.model.Careteam) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CareteamDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Careteam> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CareteamDao.findAll();
		List<main.java.com.campfhir.model.Careteam> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Careteam) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CareteamDao.openCurrentSessionwithTransaction();
		 CareteamDao.deleteAll();
		 CareteamDao.closeCurrentSessionwithTransaction();
	}

	public CareteamDao  CareteamDao() 
	{
		return  CareteamDao;
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

