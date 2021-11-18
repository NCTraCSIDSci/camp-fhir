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
import main.java.com.campfhir.dao.SearchparameterDao;
import main.java.com.campfhir.service.conversion.SearchparameterConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Searchparameter.
 * @see .Searchparameter
 * @author Paul Kovach
 */

public class SearchparameterService {

	private static SearchparameterDao SearchparameterDao;
	private static SearchparameterConversion SearchparameterConversion;

	public SearchparameterService() 
	{
		SearchparameterDao = new SearchparameterDao();
		SearchparameterConversion = new SearchparameterConversion();
	}

	public void persist(main.java.com.campfhir.model.Searchparameter entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SearchparameterDao.openCurrentSessionwithTransaction();
		 SearchparameterDao.persist(entity);
		 SearchparameterDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Searchparameter entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SearchparameterDao.openCurrentSessionwithTransaction();
		 SearchparameterDao.update(entity);
		 SearchparameterDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Searchparameter findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SearchparameterDao.openCurrentSession();
		main.java.com.campfhir.model.Searchparameter resource = SearchparameterDao.findById(id);
		SearchparameterDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Searchparameter> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SearchparameterDao.openCurrentSession();
		List<main.java.com.campfhir.model.Searchparameter> resource =  SearchparameterDao.findByPatientId(id);
		SearchparameterDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SearchparameterDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Searchparameter resource =  SearchparameterDao.findById(id);
		SearchparameterDao.delete(resource);
		SearchparameterDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SearchparameterDao.openCurrentSession();
		ScrollableResults resources =  SearchparameterDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Searchparameter.html")  			   
			   .setResource(SearchparameterConversion.Searchparameters((main.java.com.campfhir.model.Searchparameter) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SearchparameterDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Searchparameter> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SearchparameterDao.findAll();
		List<main.java.com.campfhir.model.Searchparameter> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Searchparameter) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SearchparameterDao.openCurrentSessionwithTransaction();
		 SearchparameterDao.deleteAll();
		 SearchparameterDao.closeCurrentSessionwithTransaction();
	}

	public SearchparameterDao  SearchparameterDao() 
	{
		return  SearchparameterDao;
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

