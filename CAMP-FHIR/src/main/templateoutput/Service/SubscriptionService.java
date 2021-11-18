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
import main.java.com.campfhir.dao.SubscriptionDao;
import main.java.com.campfhir.service.conversion.SubscriptionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Subscription.
 * @see .Subscription
 * @author Paul Kovach
 */

public class SubscriptionService {

	private static SubscriptionDao SubscriptionDao;
	private static SubscriptionConversion SubscriptionConversion;

	public SubscriptionService() 
	{
		SubscriptionDao = new SubscriptionDao();
		SubscriptionConversion = new SubscriptionConversion();
	}

	public void persist(main.java.com.campfhir.model.Subscription entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubscriptionDao.openCurrentSessionwithTransaction();
		 SubscriptionDao.persist(entity);
		 SubscriptionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Subscription entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubscriptionDao.openCurrentSessionwithTransaction();
		 SubscriptionDao.update(entity);
		 SubscriptionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Subscription findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubscriptionDao.openCurrentSession();
		main.java.com.campfhir.model.Subscription resource = SubscriptionDao.findById(id);
		SubscriptionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Subscription> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubscriptionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Subscription> resource =  SubscriptionDao.findByPatientId(id);
		SubscriptionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubscriptionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Subscription resource =  SubscriptionDao.findById(id);
		SubscriptionDao.delete(resource);
		SubscriptionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubscriptionDao.openCurrentSession();
		ScrollableResults resources =  SubscriptionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Subscription.html")  			   
			   .setResource(SubscriptionConversion.Subscriptions((main.java.com.campfhir.model.Subscription) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubscriptionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Subscription> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubscriptionDao.findAll();
		List<main.java.com.campfhir.model.Subscription> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Subscription) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubscriptionDao.openCurrentSessionwithTransaction();
		 SubscriptionDao.deleteAll();
		 SubscriptionDao.closeCurrentSessionwithTransaction();
	}

	public SubscriptionDao  SubscriptionDao() 
	{
		return  SubscriptionDao;
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

