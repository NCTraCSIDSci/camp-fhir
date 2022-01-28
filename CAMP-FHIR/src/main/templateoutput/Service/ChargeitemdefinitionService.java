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
import main.java.com.campfhir.dao.ChargeitemdefinitionDao;
import main.java.com.campfhir.service.conversion.ChargeitemdefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Chargeitemdefinition.
 * @see .Chargeitemdefinition
 * @author Paul Kovach
 */

public class ChargeitemdefinitionService {

	private static ChargeitemdefinitionDao ChargeitemdefinitionDao;
	private static ChargeitemdefinitionConversion ChargeitemdefinitionConversion;

	public ChargeitemdefinitionService() 
	{
		ChargeitemdefinitionDao = new ChargeitemdefinitionDao();
		ChargeitemdefinitionConversion = new ChargeitemdefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Chargeitemdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ChargeitemdefinitionDao.openCurrentSessionwithTransaction();
		 ChargeitemdefinitionDao.persist(entity);
		 ChargeitemdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Chargeitemdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ChargeitemdefinitionDao.openCurrentSessionwithTransaction();
		 ChargeitemdefinitionDao.update(entity);
		 ChargeitemdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Chargeitemdefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ChargeitemdefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Chargeitemdefinition resource = ChargeitemdefinitionDao.findById(id);
		ChargeitemdefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Chargeitemdefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ChargeitemdefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Chargeitemdefinition> resource =  ChargeitemdefinitionDao.findByPatientId(id);
		ChargeitemdefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ChargeitemdefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Chargeitemdefinition resource =  ChargeitemdefinitionDao.findById(id);
		ChargeitemdefinitionDao.delete(resource);
		ChargeitemdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ChargeitemdefinitionDao.openCurrentSession();
		ScrollableResults resources =  ChargeitemdefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Chargeitemdefinition.html")  			   
			   .setResource(ChargeitemdefinitionConversion.Chargeitemdefinitions((main.java.com.campfhir.model.Chargeitemdefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ChargeitemdefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Chargeitemdefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ChargeitemdefinitionDao.findAll();
		List<main.java.com.campfhir.model.Chargeitemdefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Chargeitemdefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ChargeitemdefinitionDao.openCurrentSessionwithTransaction();
		 ChargeitemdefinitionDao.deleteAll();
		 ChargeitemdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public ChargeitemdefinitionDao  ChargeitemdefinitionDao() 
	{
		return  ChargeitemdefinitionDao;
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

