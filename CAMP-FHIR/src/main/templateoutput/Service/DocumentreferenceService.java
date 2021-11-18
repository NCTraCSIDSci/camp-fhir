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
import main.java.com.campfhir.dao.DocumentreferenceDao;
import main.java.com.campfhir.service.conversion.DocumentreferenceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Documentreference.
 * @see .Documentreference
 * @author Paul Kovach
 */

public class DocumentreferenceService {

	private static DocumentreferenceDao DocumentreferenceDao;
	private static DocumentreferenceConversion DocumentreferenceConversion;

	public DocumentreferenceService() 
	{
		DocumentreferenceDao = new DocumentreferenceDao();
		DocumentreferenceConversion = new DocumentreferenceConversion();
	}

	public void persist(main.java.com.campfhir.model.Documentreference entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DocumentreferenceDao.openCurrentSessionwithTransaction();
		 DocumentreferenceDao.persist(entity);
		 DocumentreferenceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Documentreference entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DocumentreferenceDao.openCurrentSessionwithTransaction();
		 DocumentreferenceDao.update(entity);
		 DocumentreferenceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Documentreference findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DocumentreferenceDao.openCurrentSession();
		main.java.com.campfhir.model.Documentreference resource = DocumentreferenceDao.findById(id);
		DocumentreferenceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Documentreference> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DocumentreferenceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Documentreference> resource =  DocumentreferenceDao.findByPatientId(id);
		DocumentreferenceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DocumentreferenceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Documentreference resource =  DocumentreferenceDao.findById(id);
		DocumentreferenceDao.delete(resource);
		DocumentreferenceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DocumentreferenceDao.openCurrentSession();
		ScrollableResults resources =  DocumentreferenceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Documentreference.html")  			   
			   .setResource(DocumentreferenceConversion.Documentreferences((main.java.com.campfhir.model.Documentreference) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DocumentreferenceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Documentreference> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DocumentreferenceDao.findAll();
		List<main.java.com.campfhir.model.Documentreference> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Documentreference) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DocumentreferenceDao.openCurrentSessionwithTransaction();
		 DocumentreferenceDao.deleteAll();
		 DocumentreferenceDao.closeCurrentSessionwithTransaction();
	}

	public DocumentreferenceDao  DocumentreferenceDao() 
	{
		return  DocumentreferenceDao;
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

