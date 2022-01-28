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
import main.java.com.campfhir.dao.SubstancespecificationDao;
import main.java.com.campfhir.service.conversion.SubstancespecificationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Substancespecification.
 * @see .Substancespecification
 * @author Paul Kovach
 */

public class SubstancespecificationService {

	private static SubstancespecificationDao SubstancespecificationDao;
	private static SubstancespecificationConversion SubstancespecificationConversion;

	public SubstancespecificationService() 
	{
		SubstancespecificationDao = new SubstancespecificationDao();
		SubstancespecificationConversion = new SubstancespecificationConversion();
	}

	public void persist(main.java.com.campfhir.model.Substancespecification entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancespecificationDao.openCurrentSessionwithTransaction();
		 SubstancespecificationDao.persist(entity);
		 SubstancespecificationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Substancespecification entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancespecificationDao.openCurrentSessionwithTransaction();
		 SubstancespecificationDao.update(entity);
		 SubstancespecificationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Substancespecification findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancespecificationDao.openCurrentSession();
		main.java.com.campfhir.model.Substancespecification resource = SubstancespecificationDao.findById(id);
		SubstancespecificationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Substancespecification> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancespecificationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Substancespecification> resource =  SubstancespecificationDao.findByPatientId(id);
		SubstancespecificationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancespecificationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Substancespecification resource =  SubstancespecificationDao.findById(id);
		SubstancespecificationDao.delete(resource);
		SubstancespecificationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubstancespecificationDao.openCurrentSession();
		ScrollableResults resources =  SubstancespecificationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Substancespecification.html")  			   
			   .setResource(SubstancespecificationConversion.Substancespecifications((main.java.com.campfhir.model.Substancespecification) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubstancespecificationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Substancespecification> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubstancespecificationDao.findAll();
		List<main.java.com.campfhir.model.Substancespecification> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Substancespecification) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancespecificationDao.openCurrentSessionwithTransaction();
		 SubstancespecificationDao.deleteAll();
		 SubstancespecificationDao.closeCurrentSessionwithTransaction();
	}

	public SubstancespecificationDao  SubstancespecificationDao() 
	{
		return  SubstancespecificationDao;
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

