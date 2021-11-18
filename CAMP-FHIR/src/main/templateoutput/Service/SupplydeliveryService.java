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
import main.java.com.campfhir.dao.SupplydeliveryDao;
import main.java.com.campfhir.service.conversion.SupplydeliveryConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Supplydelivery.
 * @see .Supplydelivery
 * @author Paul Kovach
 */

public class SupplydeliveryService {

	private static SupplydeliveryDao SupplydeliveryDao;
	private static SupplydeliveryConversion SupplydeliveryConversion;

	public SupplydeliveryService() 
	{
		SupplydeliveryDao = new SupplydeliveryDao();
		SupplydeliveryConversion = new SupplydeliveryConversion();
	}

	public void persist(main.java.com.campfhir.model.Supplydelivery entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SupplydeliveryDao.openCurrentSessionwithTransaction();
		 SupplydeliveryDao.persist(entity);
		 SupplydeliveryDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Supplydelivery entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SupplydeliveryDao.openCurrentSessionwithTransaction();
		 SupplydeliveryDao.update(entity);
		 SupplydeliveryDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Supplydelivery findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SupplydeliveryDao.openCurrentSession();
		main.java.com.campfhir.model.Supplydelivery resource = SupplydeliveryDao.findById(id);
		SupplydeliveryDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Supplydelivery> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SupplydeliveryDao.openCurrentSession();
		List<main.java.com.campfhir.model.Supplydelivery> resource =  SupplydeliveryDao.findByPatientId(id);
		SupplydeliveryDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SupplydeliveryDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Supplydelivery resource =  SupplydeliveryDao.findById(id);
		SupplydeliveryDao.delete(resource);
		SupplydeliveryDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SupplydeliveryDao.openCurrentSession();
		ScrollableResults resources =  SupplydeliveryDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Supplydelivery.html")  			   
			   .setResource(SupplydeliveryConversion.Supplydeliverys((main.java.com.campfhir.model.Supplydelivery) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SupplydeliveryDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Supplydelivery> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SupplydeliveryDao.findAll();
		List<main.java.com.campfhir.model.Supplydelivery> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Supplydelivery) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SupplydeliveryDao.openCurrentSessionwithTransaction();
		 SupplydeliveryDao.deleteAll();
		 SupplydeliveryDao.closeCurrentSessionwithTransaction();
	}

	public SupplydeliveryDao  SupplydeliveryDao() 
	{
		return  SupplydeliveryDao;
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

