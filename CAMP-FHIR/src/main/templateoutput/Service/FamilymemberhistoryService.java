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
import main.java.com.campfhir.dao.FamilymemberhistoryDao;
import main.java.com.campfhir.service.conversion.FamilymemberhistoryConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Familymemberhistory.
 * @see .Familymemberhistory
 * @author Paul Kovach
 */

public class FamilymemberhistoryService {

	private static FamilymemberhistoryDao FamilymemberhistoryDao;
	private static FamilymemberhistoryConversion FamilymemberhistoryConversion;

	public FamilymemberhistoryService() 
	{
		FamilymemberhistoryDao = new FamilymemberhistoryDao();
		FamilymemberhistoryConversion = new FamilymemberhistoryConversion();
	}

	public void persist(main.java.com.campfhir.model.Familymemberhistory entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 FamilymemberhistoryDao.openCurrentSessionwithTransaction();
		 FamilymemberhistoryDao.persist(entity);
		 FamilymemberhistoryDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Familymemberhistory entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 FamilymemberhistoryDao.openCurrentSessionwithTransaction();
		 FamilymemberhistoryDao.update(entity);
		 FamilymemberhistoryDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Familymemberhistory findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		FamilymemberhistoryDao.openCurrentSession();
		main.java.com.campfhir.model.Familymemberhistory resource = FamilymemberhistoryDao.findById(id);
		FamilymemberhistoryDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Familymemberhistory> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		FamilymemberhistoryDao.openCurrentSession();
		List<main.java.com.campfhir.model.Familymemberhistory> resource =  FamilymemberhistoryDao.findByPatientId(id);
		FamilymemberhistoryDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		FamilymemberhistoryDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Familymemberhistory resource =  FamilymemberhistoryDao.findById(id);
		FamilymemberhistoryDao.delete(resource);
		FamilymemberhistoryDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  FamilymemberhistoryDao.openCurrentSession();
		ScrollableResults resources =  FamilymemberhistoryDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Familymemberhistory.html")  			   
			   .setResource(FamilymemberhistoryConversion.Familymemberhistorys((main.java.com.campfhir.model.Familymemberhistory) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  FamilymemberhistoryDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Familymemberhistory> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  FamilymemberhistoryDao.findAll();
		List<main.java.com.campfhir.model.Familymemberhistory> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Familymemberhistory) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 FamilymemberhistoryDao.openCurrentSessionwithTransaction();
		 FamilymemberhistoryDao.deleteAll();
		 FamilymemberhistoryDao.closeCurrentSessionwithTransaction();
	}

	public FamilymemberhistoryDao  FamilymemberhistoryDao() 
	{
		return  FamilymemberhistoryDao;
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

