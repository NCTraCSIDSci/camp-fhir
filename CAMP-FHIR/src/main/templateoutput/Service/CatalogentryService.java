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
import main.java.com.campfhir.dao.CatalogentryDao;
import main.java.com.campfhir.service.conversion.CatalogentryConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Catalogentry.
 * @see .Catalogentry
 * @author Paul Kovach
 */

public class CatalogentryService {

	private static CatalogentryDao CatalogentryDao;
	private static CatalogentryConversion CatalogentryConversion;

	public CatalogentryService() 
	{
		CatalogentryDao = new CatalogentryDao();
		CatalogentryConversion = new CatalogentryConversion();
	}

	public void persist(main.java.com.campfhir.model.Catalogentry entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CatalogentryDao.openCurrentSessionwithTransaction();
		 CatalogentryDao.persist(entity);
		 CatalogentryDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Catalogentry entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CatalogentryDao.openCurrentSessionwithTransaction();
		 CatalogentryDao.update(entity);
		 CatalogentryDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Catalogentry findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CatalogentryDao.openCurrentSession();
		main.java.com.campfhir.model.Catalogentry resource = CatalogentryDao.findById(id);
		CatalogentryDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Catalogentry> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CatalogentryDao.openCurrentSession();
		List<main.java.com.campfhir.model.Catalogentry> resource =  CatalogentryDao.findByPatientId(id);
		CatalogentryDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CatalogentryDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Catalogentry resource =  CatalogentryDao.findById(id);
		CatalogentryDao.delete(resource);
		CatalogentryDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CatalogentryDao.openCurrentSession();
		ScrollableResults resources =  CatalogentryDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Catalogentry.html")  			   
			   .setResource(CatalogentryConversion.Catalogentrys((main.java.com.campfhir.model.Catalogentry) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CatalogentryDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Catalogentry> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CatalogentryDao.findAll();
		List<main.java.com.campfhir.model.Catalogentry> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Catalogentry) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CatalogentryDao.openCurrentSessionwithTransaction();
		 CatalogentryDao.deleteAll();
		 CatalogentryDao.closeCurrentSessionwithTransaction();
	}

	public CatalogentryDao  CatalogentryDao() 
	{
		return  CatalogentryDao;
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

