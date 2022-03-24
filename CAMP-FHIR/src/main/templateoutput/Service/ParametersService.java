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
import main.java.com.campfhir.dao.ParametersDao;
import main.java.com.campfhir.service.conversion.ParametersConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Parameters.
 * @see .Parameters
 * @author Paul Kovach
 */

public class ParametersService {

	private static ParametersDao ParametersDao;
	private static ParametersConversion ParametersConversion;

	public ParametersService() 
	{
		ParametersDao = new ParametersDao();
		ParametersConversion = new ParametersConversion();
	}

	public void persist(main.java.com.campfhir.model.Parameters entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ParametersDao.openCurrentSessionwithTransaction();
		 ParametersDao.persist(entity);
		 ParametersDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Parameters entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ParametersDao.openCurrentSessionwithTransaction();
		 ParametersDao.update(entity);
		 ParametersDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Parameters findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ParametersDao.openCurrentSession();
		main.java.com.campfhir.model.Parameters resource = ParametersDao.findById(id);
		ParametersDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Parameters> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ParametersDao.openCurrentSession();
		List<main.java.com.campfhir.model.Parameters> resource =  ParametersDao.findByPatientId(id);
		ParametersDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ParametersDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Parameters resource =  ParametersDao.findById(id);
		ParametersDao.delete(resource);
		ParametersDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ParametersDao.openCurrentSession();
		ScrollableResults resources =  ParametersDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Parameters.html")  			   
			   .setResource(ParametersConversion.Parameterss((main.java.com.campfhir.model.Parameters) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ParametersDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Parameters> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ParametersDao.findAll();
		List<main.java.com.campfhir.model.Parameters> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Parameters) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ParametersDao.openCurrentSessionwithTransaction();
		 ParametersDao.deleteAll();
		 ParametersDao.closeCurrentSessionwithTransaction();
	}

	public ParametersDao  ParametersDao() 
	{
		return  ParametersDao;
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
