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
import main.java.com.campfhir.dao.ImmunizationevaluationDao;
import main.java.com.campfhir.service.conversion.ImmunizationevaluationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Immunizationevaluation.
 * @see .Immunizationevaluation
 * @author Paul Kovach
 */

public class ImmunizationevaluationService {

	private static ImmunizationevaluationDao ImmunizationevaluationDao;
	private static ImmunizationevaluationConversion ImmunizationevaluationConversion;

	public ImmunizationevaluationService() 
	{
		ImmunizationevaluationDao = new ImmunizationevaluationDao();
		ImmunizationevaluationConversion = new ImmunizationevaluationConversion();
	}

	public void persist(main.java.com.campfhir.model.Immunizationevaluation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationevaluationDao.openCurrentSessionwithTransaction();
		 ImmunizationevaluationDao.persist(entity);
		 ImmunizationevaluationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Immunizationevaluation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationevaluationDao.openCurrentSessionwithTransaction();
		 ImmunizationevaluationDao.update(entity);
		 ImmunizationevaluationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Immunizationevaluation findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationevaluationDao.openCurrentSession();
		main.java.com.campfhir.model.Immunizationevaluation resource = ImmunizationevaluationDao.findById(id);
		ImmunizationevaluationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Immunizationevaluation> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationevaluationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Immunizationevaluation> resource =  ImmunizationevaluationDao.findByPatientId(id);
		ImmunizationevaluationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationevaluationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Immunizationevaluation resource =  ImmunizationevaluationDao.findById(id);
		ImmunizationevaluationDao.delete(resource);
		ImmunizationevaluationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ImmunizationevaluationDao.openCurrentSession();
		ScrollableResults resources =  ImmunizationevaluationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Immunizationevaluation.html")  			   
			   .setResource(ImmunizationevaluationConversion.Immunizationevaluations((main.java.com.campfhir.model.Immunizationevaluation) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ImmunizationevaluationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Immunizationevaluation> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ImmunizationevaluationDao.findAll();
		List<main.java.com.campfhir.model.Immunizationevaluation> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Immunizationevaluation) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationevaluationDao.openCurrentSessionwithTransaction();
		 ImmunizationevaluationDao.deleteAll();
		 ImmunizationevaluationDao.closeCurrentSessionwithTransaction();
	}

	public ImmunizationevaluationDao  ImmunizationevaluationDao() 
	{
		return  ImmunizationevaluationDao;
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

