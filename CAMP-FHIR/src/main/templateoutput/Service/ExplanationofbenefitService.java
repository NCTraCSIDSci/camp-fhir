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
import main.java.com.campfhir.dao.ExplanationofbenefitDao;
import main.java.com.campfhir.service.conversion.ExplanationofbenefitConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Explanationofbenefit.
 * @see .Explanationofbenefit
 * @author Paul Kovach
 */

public class ExplanationofbenefitService {

	private static ExplanationofbenefitDao ExplanationofbenefitDao;
	private static ExplanationofbenefitConversion ExplanationofbenefitConversion;

	public ExplanationofbenefitService() 
	{
		ExplanationofbenefitDao = new ExplanationofbenefitDao();
		ExplanationofbenefitConversion = new ExplanationofbenefitConversion();
	}

	public void persist(main.java.com.campfhir.model.Explanationofbenefit entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ExplanationofbenefitDao.openCurrentSessionwithTransaction();
		 ExplanationofbenefitDao.persist(entity);
		 ExplanationofbenefitDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Explanationofbenefit entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ExplanationofbenefitDao.openCurrentSessionwithTransaction();
		 ExplanationofbenefitDao.update(entity);
		 ExplanationofbenefitDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Explanationofbenefit findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ExplanationofbenefitDao.openCurrentSession();
		main.java.com.campfhir.model.Explanationofbenefit resource = ExplanationofbenefitDao.findById(id);
		ExplanationofbenefitDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Explanationofbenefit> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ExplanationofbenefitDao.openCurrentSession();
		List<main.java.com.campfhir.model.Explanationofbenefit> resource =  ExplanationofbenefitDao.findByPatientId(id);
		ExplanationofbenefitDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ExplanationofbenefitDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Explanationofbenefit resource =  ExplanationofbenefitDao.findById(id);
		ExplanationofbenefitDao.delete(resource);
		ExplanationofbenefitDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ExplanationofbenefitDao.openCurrentSession();
		ScrollableResults resources =  ExplanationofbenefitDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Explanationofbenefit.html")  			   
			   .setResource(ExplanationofbenefitConversion.Explanationofbenefits((main.java.com.campfhir.model.Explanationofbenefit) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ExplanationofbenefitDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Explanationofbenefit> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ExplanationofbenefitDao.findAll();
		List<main.java.com.campfhir.model.Explanationofbenefit> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Explanationofbenefit) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ExplanationofbenefitDao.openCurrentSessionwithTransaction();
		 ExplanationofbenefitDao.deleteAll();
		 ExplanationofbenefitDao.closeCurrentSessionwithTransaction();
	}

	public ExplanationofbenefitDao  ExplanationofbenefitDao() 
	{
		return  ExplanationofbenefitDao;
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

