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
import main.java.com.campfhir.dao.ImmunizationrecommendationDao;
import main.java.com.campfhir.service.conversion.ImmunizationrecommendationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Immunizationrecommendation.
 * @see .Immunizationrecommendation
 * @author Paul Kovach
 */

public class ImmunizationrecommendationService {

	private static ImmunizationrecommendationDao ImmunizationrecommendationDao;
	private static ImmunizationrecommendationConversion ImmunizationrecommendationConversion;

	public ImmunizationrecommendationService() 
	{
		ImmunizationrecommendationDao = new ImmunizationrecommendationDao();
		ImmunizationrecommendationConversion = new ImmunizationrecommendationConversion();
	}

	public void persist(main.java.com.campfhir.model.Immunizationrecommendation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationrecommendationDao.openCurrentSessionwithTransaction();
		 ImmunizationrecommendationDao.persist(entity);
		 ImmunizationrecommendationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Immunizationrecommendation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationrecommendationDao.openCurrentSessionwithTransaction();
		 ImmunizationrecommendationDao.update(entity);
		 ImmunizationrecommendationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Immunizationrecommendation findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationrecommendationDao.openCurrentSession();
		main.java.com.campfhir.model.Immunizationrecommendation resource = ImmunizationrecommendationDao.findById(id);
		ImmunizationrecommendationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Immunizationrecommendation> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationrecommendationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Immunizationrecommendation> resource =  ImmunizationrecommendationDao.findByPatientId(id);
		ImmunizationrecommendationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationrecommendationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Immunizationrecommendation resource =  ImmunizationrecommendationDao.findById(id);
		ImmunizationrecommendationDao.delete(resource);
		ImmunizationrecommendationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ImmunizationrecommendationDao.openCurrentSession();
		ScrollableResults resources =  ImmunizationrecommendationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Immunizationrecommendation.html")  			   
			   .setResource(ImmunizationrecommendationConversion.Immunizationrecommendations((main.java.com.campfhir.model.Immunizationrecommendation) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ImmunizationrecommendationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Immunizationrecommendation> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ImmunizationrecommendationDao.findAll();
		List<main.java.com.campfhir.model.Immunizationrecommendation> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Immunizationrecommendation) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationrecommendationDao.openCurrentSessionwithTransaction();
		 ImmunizationrecommendationDao.deleteAll();
		 ImmunizationrecommendationDao.closeCurrentSessionwithTransaction();
	}

	public ImmunizationrecommendationDao  ImmunizationrecommendationDao() 
	{
		return  ImmunizationrecommendationDao;
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

