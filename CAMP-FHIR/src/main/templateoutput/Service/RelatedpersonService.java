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
import main.java.com.campfhir.dao.RelatedpersonDao;
import main.java.com.campfhir.service.conversion.RelatedpersonConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Relatedperson.
 * @see .Relatedperson
 * @author Paul Kovach
 */

public class RelatedpersonService {

	private static RelatedpersonDao RelatedpersonDao;
	private static RelatedpersonConversion RelatedpersonConversion;

	public RelatedpersonService() 
	{
		RelatedpersonDao = new RelatedpersonDao();
		RelatedpersonConversion = new RelatedpersonConversion();
	}

	public void persist(main.java.com.campfhir.model.Relatedperson entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 RelatedpersonDao.openCurrentSessionwithTransaction();
		 RelatedpersonDao.persist(entity);
		 RelatedpersonDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Relatedperson entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 RelatedpersonDao.openCurrentSessionwithTransaction();
		 RelatedpersonDao.update(entity);
		 RelatedpersonDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Relatedperson findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		RelatedpersonDao.openCurrentSession();
		main.java.com.campfhir.model.Relatedperson resource = RelatedpersonDao.findById(id);
		RelatedpersonDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Relatedperson> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		RelatedpersonDao.openCurrentSession();
		List<main.java.com.campfhir.model.Relatedperson> resource =  RelatedpersonDao.findByPatientId(id);
		RelatedpersonDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		RelatedpersonDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Relatedperson resource =  RelatedpersonDao.findById(id);
		RelatedpersonDao.delete(resource);
		RelatedpersonDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  RelatedpersonDao.openCurrentSession();
		ScrollableResults resources =  RelatedpersonDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Relatedperson.html")  			   
			   .setResource(RelatedpersonConversion.Relatedpersons((main.java.com.campfhir.model.Relatedperson) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  RelatedpersonDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Relatedperson> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  RelatedpersonDao.findAll();
		List<main.java.com.campfhir.model.Relatedperson> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Relatedperson) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 RelatedpersonDao.openCurrentSessionwithTransaction();
		 RelatedpersonDao.deleteAll();
		 RelatedpersonDao.closeCurrentSessionwithTransaction();
	}

	public RelatedpersonDao  RelatedpersonDao() 
	{
		return  RelatedpersonDao;
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

