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
import main.java.com.campfhir.dao.StructuremapDao;
import main.java.com.campfhir.service.conversion.StructuremapConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Structuremap.
 * @see .Structuremap
 * @author Paul Kovach
 */

public class StructuremapService {

	private static StructuremapDao StructuremapDao;
	private static StructuremapConversion StructuremapConversion;

	public StructuremapService() 
	{
		StructuremapDao = new StructuremapDao();
		StructuremapConversion = new StructuremapConversion();
	}

	public void persist(main.java.com.campfhir.model.Structuremap entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 StructuremapDao.openCurrentSessionwithTransaction();
		 StructuremapDao.persist(entity);
		 StructuremapDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Structuremap entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 StructuremapDao.openCurrentSessionwithTransaction();
		 StructuremapDao.update(entity);
		 StructuremapDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Structuremap findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		StructuremapDao.openCurrentSession();
		main.java.com.campfhir.model.Structuremap resource = StructuremapDao.findById(id);
		StructuremapDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Structuremap> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		StructuremapDao.openCurrentSession();
		List<main.java.com.campfhir.model.Structuremap> resource =  StructuremapDao.findByPatientId(id);
		StructuremapDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		StructuremapDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Structuremap resource =  StructuremapDao.findById(id);
		StructuremapDao.delete(resource);
		StructuremapDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  StructuremapDao.openCurrentSession();
		ScrollableResults resources =  StructuremapDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Structuremap.html")  			   
			   .setResource(StructuremapConversion.Structuremaps((main.java.com.campfhir.model.Structuremap) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  StructuremapDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Structuremap> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  StructuremapDao.findAll();
		List<main.java.com.campfhir.model.Structuremap> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Structuremap) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 StructuremapDao.openCurrentSessionwithTransaction();
		 StructuremapDao.deleteAll();
		 StructuremapDao.closeCurrentSessionwithTransaction();
	}

	public StructuremapDao  StructuremapDao() 
	{
		return  StructuremapDao;
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

