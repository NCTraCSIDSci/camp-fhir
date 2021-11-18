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
import main.java.com.campfhir.dao.DocumentmanifestDao;
import main.java.com.campfhir.service.conversion.DocumentmanifestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Documentmanifest.
 * @see .Documentmanifest
 * @author Paul Kovach
 */

public class DocumentmanifestService {

	private static DocumentmanifestDao DocumentmanifestDao;
	private static DocumentmanifestConversion DocumentmanifestConversion;

	public DocumentmanifestService() 
	{
		DocumentmanifestDao = new DocumentmanifestDao();
		DocumentmanifestConversion = new DocumentmanifestConversion();
	}

	public void persist(main.java.com.campfhir.model.Documentmanifest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DocumentmanifestDao.openCurrentSessionwithTransaction();
		 DocumentmanifestDao.persist(entity);
		 DocumentmanifestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Documentmanifest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DocumentmanifestDao.openCurrentSessionwithTransaction();
		 DocumentmanifestDao.update(entity);
		 DocumentmanifestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Documentmanifest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DocumentmanifestDao.openCurrentSession();
		main.java.com.campfhir.model.Documentmanifest resource = DocumentmanifestDao.findById(id);
		DocumentmanifestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Documentmanifest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DocumentmanifestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Documentmanifest> resource =  DocumentmanifestDao.findByPatientId(id);
		DocumentmanifestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DocumentmanifestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Documentmanifest resource =  DocumentmanifestDao.findById(id);
		DocumentmanifestDao.delete(resource);
		DocumentmanifestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DocumentmanifestDao.openCurrentSession();
		ScrollableResults resources =  DocumentmanifestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Documentmanifest.html")  			   
			   .setResource(DocumentmanifestConversion.Documentmanifests((main.java.com.campfhir.model.Documentmanifest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DocumentmanifestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Documentmanifest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DocumentmanifestDao.findAll();
		List<main.java.com.campfhir.model.Documentmanifest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Documentmanifest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DocumentmanifestDao.openCurrentSessionwithTransaction();
		 DocumentmanifestDao.deleteAll();
		 DocumentmanifestDao.closeCurrentSessionwithTransaction();
	}

	public DocumentmanifestDao  DocumentmanifestDao() 
	{
		return  DocumentmanifestDao;
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

