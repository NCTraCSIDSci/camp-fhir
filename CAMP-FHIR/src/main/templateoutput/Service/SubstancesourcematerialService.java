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
import main.java.com.campfhir.dao.SubstancesourcematerialDao;
import main.java.com.campfhir.service.conversion.SubstancesourcematerialConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Substancesourcematerial.
 * @see .Substancesourcematerial
 * @author Paul Kovach
 */

public class SubstancesourcematerialService {

	private static SubstancesourcematerialDao SubstancesourcematerialDao;
	private static SubstancesourcematerialConversion SubstancesourcematerialConversion;

	public SubstancesourcematerialService() 
	{
		SubstancesourcematerialDao = new SubstancesourcematerialDao();
		SubstancesourcematerialConversion = new SubstancesourcematerialConversion();
	}

	public void persist(main.java.com.campfhir.model.Substancesourcematerial entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancesourcematerialDao.openCurrentSessionwithTransaction();
		 SubstancesourcematerialDao.persist(entity);
		 SubstancesourcematerialDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Substancesourcematerial entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancesourcematerialDao.openCurrentSessionwithTransaction();
		 SubstancesourcematerialDao.update(entity);
		 SubstancesourcematerialDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Substancesourcematerial findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancesourcematerialDao.openCurrentSession();
		main.java.com.campfhir.model.Substancesourcematerial resource = SubstancesourcematerialDao.findById(id);
		SubstancesourcematerialDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Substancesourcematerial> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancesourcematerialDao.openCurrentSession();
		List<main.java.com.campfhir.model.Substancesourcematerial> resource =  SubstancesourcematerialDao.findByPatientId(id);
		SubstancesourcematerialDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancesourcematerialDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Substancesourcematerial resource =  SubstancesourcematerialDao.findById(id);
		SubstancesourcematerialDao.delete(resource);
		SubstancesourcematerialDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubstancesourcematerialDao.openCurrentSession();
		ScrollableResults resources =  SubstancesourcematerialDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Substancesourcematerial.html")  			   
			   .setResource(SubstancesourcematerialConversion.Substancesourcematerials((main.java.com.campfhir.model.Substancesourcematerial) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubstancesourcematerialDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Substancesourcematerial> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubstancesourcematerialDao.findAll();
		List<main.java.com.campfhir.model.Substancesourcematerial> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Substancesourcematerial) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancesourcematerialDao.openCurrentSessionwithTransaction();
		 SubstancesourcematerialDao.deleteAll();
		 SubstancesourcematerialDao.closeCurrentSessionwithTransaction();
	}

	public SubstancesourcematerialDao  SubstancesourcematerialDao() 
	{
		return  SubstancesourcematerialDao;
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

