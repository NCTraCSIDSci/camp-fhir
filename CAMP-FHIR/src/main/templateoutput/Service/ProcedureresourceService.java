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
import main.java.com.campfhir.dao.ProcedureresourceDao;
import main.java.com.campfhir.service.conversion.ProcedureresourceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Procedureresource.
 * @see .Procedureresource
 * @author Paul Kovach
 */

public class ProcedureresourceService {

	private static ProcedureresourceDao ProcedureresourceDao;
	private static ProcedureresourceConversion ProcedureresourceConversion;

	public ProcedureresourceService() 
	{
		ProcedureresourceDao = new ProcedureresourceDao();
		ProcedureresourceConversion = new ProcedureresourceConversion();
	}

	public void persist(main.java.com.campfhir.model.Procedureresource entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ProcedureresourceDao.openCurrentSessionwithTransaction();
		 ProcedureresourceDao.persist(entity);
		 ProcedureresourceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Procedureresource entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ProcedureresourceDao.openCurrentSessionwithTransaction();
		 ProcedureresourceDao.update(entity);
		 ProcedureresourceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Procedureresource findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProcedureresourceDao.openCurrentSession();
		main.java.com.campfhir.model.Procedureresource resource = ProcedureresourceDao.findById(id);
		ProcedureresourceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Procedureresource> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProcedureresourceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Procedureresource> resource =  ProcedureresourceDao.findByPatientId(id);
		ProcedureresourceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProcedureresourceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Procedureresource resource =  ProcedureresourceDao.findById(id);
		ProcedureresourceDao.delete(resource);
		ProcedureresourceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ProcedureresourceDao.openCurrentSession();
		ScrollableResults resources =  ProcedureresourceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Procedureresource.html")  			   
			   .setResource(ProcedureresourceConversion.Procedureresources((main.java.com.campfhir.model.Procedureresource) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ProcedureresourceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Procedureresource> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ProcedureresourceDao.findAll();
		List<main.java.com.campfhir.model.Procedureresource> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Procedureresource) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ProcedureresourceDao.openCurrentSessionwithTransaction();
		 ProcedureresourceDao.deleteAll();
		 ProcedureresourceDao.closeCurrentSessionwithTransaction();
	}

	public ProcedureresourceDao  ProcedureresourceDao() 
	{
		return  ProcedureresourceDao;
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

