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
import javax.xml.parsers.ParserConfigurationException;
import main.java.com.campfhir.dao.ListDao;
import main.java.com.campfhir.service.conversion.ListConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class List.
 * @see .List
 * @author Paul Kovach
 */

public class ListService {

	private static ListDao ListDao;
	private static ListConversion ListConversion;

	public ListService() 
	{
		ListDao = new ListDao();
		ListConversion = new ListConversion();
	}

	public void persist(main.java.com.campfhir.model.List entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ListDao.openCurrentSessionwithTransaction();
		 ListDao.persist(entity);
		 ListDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.List entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ListDao.openCurrentSessionwithTransaction();
		 ListDao.update(entity);
		 ListDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.List findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ListDao.openCurrentSession();
		main.java.com.campfhir.model.List resource = ListDao.findById(id);
		ListDao.closeCurrentSession();
		return resource;
	}
	
	public java.util.List<main.java.com.campfhir.model.List> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ListDao.openCurrentSession();
		java.util.List<main.java.com.campfhir.model.List> resource =  ListDao.findByPatientId(id);
		ListDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ListDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.List resource =  ListDao.findById(id);
		ListDao.delete(resource);
		ListDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ListDao.openCurrentSession();
		ScrollableResults resources =  ListDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/List.html")  			   
			   .setResource(ListConversion.Lists((main.java.com.campfhir.model.List) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ListDao.closeCurrentSession();
	}
	
	public java.util.List<main.java.com.campfhir.model.List> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ListDao.findAll();
		java.util.List<main.java.com.campfhir.model.List> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.List) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ListDao.openCurrentSessionwithTransaction();
		 ListDao.deleteAll();
		 ListDao.closeCurrentSessionwithTransaction();
	}

	public ListDao  ListDao() 
	{
		return  ListDao;
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

