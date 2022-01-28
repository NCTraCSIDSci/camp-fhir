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
import main.java.com.campfhir.dao.GroupDao;
import main.java.com.campfhir.service.conversion.GroupConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Group.
 * @see .Group
 * @author Paul Kovach
 */

public class GroupService {

	private static GroupDao GroupDao;
	private static GroupConversion GroupConversion;

	public GroupService() 
	{
		GroupDao = new GroupDao();
		GroupConversion = new GroupConversion();
	}

	public void persist(main.java.com.campfhir.model.Group entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 GroupDao.openCurrentSessionwithTransaction();
		 GroupDao.persist(entity);
		 GroupDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Group entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 GroupDao.openCurrentSessionwithTransaction();
		 GroupDao.update(entity);
		 GroupDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Group findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GroupDao.openCurrentSession();
		main.java.com.campfhir.model.Group resource = GroupDao.findById(id);
		GroupDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Group> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GroupDao.openCurrentSession();
		List<main.java.com.campfhir.model.Group> resource =  GroupDao.findByPatientId(id);
		GroupDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GroupDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Group resource =  GroupDao.findById(id);
		GroupDao.delete(resource);
		GroupDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  GroupDao.openCurrentSession();
		ScrollableResults resources =  GroupDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Group.html")  			   
			   .setResource(GroupConversion.Groups((main.java.com.campfhir.model.Group) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  GroupDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Group> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  GroupDao.findAll();
		List<main.java.com.campfhir.model.Group> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Group) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 GroupDao.openCurrentSessionwithTransaction();
		 GroupDao.deleteAll();
		 GroupDao.closeCurrentSessionwithTransaction();
	}

	public GroupDao  GroupDao() 
	{
		return  GroupDao;
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

