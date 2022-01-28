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
import main.java.com.campfhir.dao.ChargeitemDao;
import main.java.com.campfhir.service.conversion.ChargeitemConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Chargeitem.
 * @see .Chargeitem
 * @author Paul Kovach
 */

public class ChargeitemService {

	private static ChargeitemDao ChargeitemDao;
	private static ChargeitemConversion ChargeitemConversion;

	public ChargeitemService() 
	{
		ChargeitemDao = new ChargeitemDao();
		ChargeitemConversion = new ChargeitemConversion();
	}

	public void persist(main.java.com.campfhir.model.Chargeitem entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ChargeitemDao.openCurrentSessionwithTransaction();
		 ChargeitemDao.persist(entity);
		 ChargeitemDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Chargeitem entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ChargeitemDao.openCurrentSessionwithTransaction();
		 ChargeitemDao.update(entity);
		 ChargeitemDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Chargeitem findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ChargeitemDao.openCurrentSession();
		main.java.com.campfhir.model.Chargeitem resource = ChargeitemDao.findById(id);
		ChargeitemDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Chargeitem> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ChargeitemDao.openCurrentSession();
		List<main.java.com.campfhir.model.Chargeitem> resource =  ChargeitemDao.findByPatientId(id);
		ChargeitemDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ChargeitemDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Chargeitem resource =  ChargeitemDao.findById(id);
		ChargeitemDao.delete(resource);
		ChargeitemDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ChargeitemDao.openCurrentSession();
		ScrollableResults resources =  ChargeitemDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Chargeitem.html")  			   
			   .setResource(ChargeitemConversion.Chargeitems((main.java.com.campfhir.model.Chargeitem) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ChargeitemDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Chargeitem> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ChargeitemDao.findAll();
		List<main.java.com.campfhir.model.Chargeitem> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Chargeitem) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ChargeitemDao.openCurrentSessionwithTransaction();
		 ChargeitemDao.deleteAll();
		 ChargeitemDao.closeCurrentSessionwithTransaction();
	}

	public ChargeitemDao  ChargeitemDao() 
	{
		return  ChargeitemDao;
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

