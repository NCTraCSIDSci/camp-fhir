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
import main.java.com.campfhir.dao.SubstanceproteinDao;
import main.java.com.campfhir.service.conversion.SubstanceproteinConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Substanceprotein.
 * @see .Substanceprotein
 * @author Paul Kovach
 */

public class SubstanceproteinService {

	private static SubstanceproteinDao SubstanceproteinDao;
	private static SubstanceproteinConversion SubstanceproteinConversion;

	public SubstanceproteinService() 
	{
		SubstanceproteinDao = new SubstanceproteinDao();
		SubstanceproteinConversion = new SubstanceproteinConversion();
	}

	public void persist(main.java.com.campfhir.model.Substanceprotein entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstanceproteinDao.openCurrentSessionwithTransaction();
		 SubstanceproteinDao.persist(entity);
		 SubstanceproteinDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Substanceprotein entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstanceproteinDao.openCurrentSessionwithTransaction();
		 SubstanceproteinDao.update(entity);
		 SubstanceproteinDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Substanceprotein findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstanceproteinDao.openCurrentSession();
		main.java.com.campfhir.model.Substanceprotein resource = SubstanceproteinDao.findById(id);
		SubstanceproteinDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Substanceprotein> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstanceproteinDao.openCurrentSession();
		List<main.java.com.campfhir.model.Substanceprotein> resource =  SubstanceproteinDao.findByPatientId(id);
		SubstanceproteinDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstanceproteinDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Substanceprotein resource =  SubstanceproteinDao.findById(id);
		SubstanceproteinDao.delete(resource);
		SubstanceproteinDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubstanceproteinDao.openCurrentSession();
		ScrollableResults resources =  SubstanceproteinDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Substanceprotein.html")  			   
			   .setResource(SubstanceproteinConversion.Substanceproteins((main.java.com.campfhir.model.Substanceprotein) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubstanceproteinDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Substanceprotein> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubstanceproteinDao.findAll();
		List<main.java.com.campfhir.model.Substanceprotein> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Substanceprotein) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstanceproteinDao.openCurrentSessionwithTransaction();
		 SubstanceproteinDao.deleteAll();
		 SubstanceproteinDao.closeCurrentSessionwithTransaction();
	}

	public SubstanceproteinDao  SubstanceproteinDao() 
	{
		return  SubstanceproteinDao;
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

