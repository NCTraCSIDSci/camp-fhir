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
import main.java.com.campfhir.dao.PersonDao;
import main.java.com.campfhir.service.conversion.PersonConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Person.
 * @see .Person
 * @author Paul Kovach
 */

public class PersonService {

	private static PersonDao PersonDao;
	private static PersonConversion PersonConversion;

	public PersonService() 
	{
		PersonDao = new PersonDao();
		PersonConversion = new PersonConversion();
	}

	public void persist(main.java.com.campfhir.model.Person entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PersonDao.openCurrentSessionwithTransaction();
		 PersonDao.persist(entity);
		 PersonDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Person entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PersonDao.openCurrentSessionwithTransaction();
		 PersonDao.update(entity);
		 PersonDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Person findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PersonDao.openCurrentSession();
		main.java.com.campfhir.model.Person resource = PersonDao.findById(id);
		PersonDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Person> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PersonDao.openCurrentSession();
		List<main.java.com.campfhir.model.Person> resource =  PersonDao.findByPatientId(id);
		PersonDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PersonDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Person resource =  PersonDao.findById(id);
		PersonDao.delete(resource);
		PersonDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  PersonDao.openCurrentSession();
		ScrollableResults resources =  PersonDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Person.html")  			   
			   .setResource(PersonConversion.Persons((main.java.com.campfhir.model.Person) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  PersonDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Person> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  PersonDao.findAll();
		List<main.java.com.campfhir.model.Person> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Person) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 PersonDao.openCurrentSessionwithTransaction();
		 PersonDao.deleteAll();
		 PersonDao.closeCurrentSessionwithTransaction();
	}

	public PersonDao  PersonDao() 
	{
		return  PersonDao;
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

