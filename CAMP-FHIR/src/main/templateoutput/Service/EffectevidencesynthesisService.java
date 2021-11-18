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
import main.java.com.campfhir.dao.EffectevidencesynthesisDao;
import main.java.com.campfhir.service.conversion.EffectevidencesynthesisConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Effectevidencesynthesis.
 * @see .Effectevidencesynthesis
 * @author Paul Kovach
 */

public class EffectevidencesynthesisService {

	private static EffectevidencesynthesisDao EffectevidencesynthesisDao;
	private static EffectevidencesynthesisConversion EffectevidencesynthesisConversion;

	public EffectevidencesynthesisService() 
	{
		EffectevidencesynthesisDao = new EffectevidencesynthesisDao();
		EffectevidencesynthesisConversion = new EffectevidencesynthesisConversion();
	}

	public void persist(main.java.com.campfhir.model.Effectevidencesynthesis entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EffectevidencesynthesisDao.openCurrentSessionwithTransaction();
		 EffectevidencesynthesisDao.persist(entity);
		 EffectevidencesynthesisDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Effectevidencesynthesis entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EffectevidencesynthesisDao.openCurrentSessionwithTransaction();
		 EffectevidencesynthesisDao.update(entity);
		 EffectevidencesynthesisDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Effectevidencesynthesis findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EffectevidencesynthesisDao.openCurrentSession();
		main.java.com.campfhir.model.Effectevidencesynthesis resource = EffectevidencesynthesisDao.findById(id);
		EffectevidencesynthesisDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Effectevidencesynthesis> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EffectevidencesynthesisDao.openCurrentSession();
		List<main.java.com.campfhir.model.Effectevidencesynthesis> resource =  EffectevidencesynthesisDao.findByPatientId(id);
		EffectevidencesynthesisDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EffectevidencesynthesisDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Effectevidencesynthesis resource =  EffectevidencesynthesisDao.findById(id);
		EffectevidencesynthesisDao.delete(resource);
		EffectevidencesynthesisDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EffectevidencesynthesisDao.openCurrentSession();
		ScrollableResults resources =  EffectevidencesynthesisDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Effectevidencesynthesis.html")  			   
			   .setResource(EffectevidencesynthesisConversion.Effectevidencesynthesiss((main.java.com.campfhir.model.Effectevidencesynthesis) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EffectevidencesynthesisDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Effectevidencesynthesis> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EffectevidencesynthesisDao.findAll();
		List<main.java.com.campfhir.model.Effectevidencesynthesis> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Effectevidencesynthesis) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EffectevidencesynthesisDao.openCurrentSessionwithTransaction();
		 EffectevidencesynthesisDao.deleteAll();
		 EffectevidencesynthesisDao.closeCurrentSessionwithTransaction();
	}

	public EffectevidencesynthesisDao  EffectevidencesynthesisDao() 
	{
		return  EffectevidencesynthesisDao;
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

