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
import main.java.com.campfhir.dao.SubstancepolymerDao;
import main.java.com.campfhir.service.conversion.SubstancepolymerConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Substancepolymer.
 * @see .Substancepolymer
 * @author Paul Kovach
 */

public class SubstancepolymerService {

	private static SubstancepolymerDao SubstancepolymerDao;
	private static SubstancepolymerConversion SubstancepolymerConversion;

	public SubstancepolymerService() 
	{
		SubstancepolymerDao = new SubstancepolymerDao();
		SubstancepolymerConversion = new SubstancepolymerConversion();
	}

	public void persist(main.java.com.campfhir.model.Substancepolymer entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancepolymerDao.openCurrentSessionwithTransaction();
		 SubstancepolymerDao.persist(entity);
		 SubstancepolymerDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Substancepolymer entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancepolymerDao.openCurrentSessionwithTransaction();
		 SubstancepolymerDao.update(entity);
		 SubstancepolymerDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Substancepolymer findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancepolymerDao.openCurrentSession();
		main.java.com.campfhir.model.Substancepolymer resource = SubstancepolymerDao.findById(id);
		SubstancepolymerDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Substancepolymer> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancepolymerDao.openCurrentSession();
		List<main.java.com.campfhir.model.Substancepolymer> resource =  SubstancepolymerDao.findByPatientId(id);
		SubstancepolymerDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancepolymerDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Substancepolymer resource =  SubstancepolymerDao.findById(id);
		SubstancepolymerDao.delete(resource);
		SubstancepolymerDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubstancepolymerDao.openCurrentSession();
		ScrollableResults resources =  SubstancepolymerDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Substancepolymer.html")  			   
			   .setResource(SubstancepolymerConversion.Substancepolymers((main.java.com.campfhir.model.Substancepolymer) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubstancepolymerDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Substancepolymer> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubstancepolymerDao.findAll();
		List<main.java.com.campfhir.model.Substancepolymer> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Substancepolymer) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancepolymerDao.openCurrentSessionwithTransaction();
		 SubstancepolymerDao.deleteAll();
		 SubstancepolymerDao.closeCurrentSessionwithTransaction();
	}

	public SubstancepolymerDao  SubstancepolymerDao() 
	{
		return  SubstancepolymerDao;
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

