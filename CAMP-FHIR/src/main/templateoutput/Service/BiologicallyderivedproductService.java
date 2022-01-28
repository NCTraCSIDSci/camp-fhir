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
import main.java.com.campfhir.dao.BiologicallyderivedproductDao;
import main.java.com.campfhir.service.conversion.BiologicallyderivedproductConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Biologicallyderivedproduct.
 * @see .Biologicallyderivedproduct
 * @author Paul Kovach
 */

public class BiologicallyderivedproductService {

	private static BiologicallyderivedproductDao BiologicallyderivedproductDao;
	private static BiologicallyderivedproductConversion BiologicallyderivedproductConversion;

	public BiologicallyderivedproductService() 
	{
		BiologicallyderivedproductDao = new BiologicallyderivedproductDao();
		BiologicallyderivedproductConversion = new BiologicallyderivedproductConversion();
	}

	public void persist(main.java.com.campfhir.model.Biologicallyderivedproduct entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BiologicallyderivedproductDao.openCurrentSessionwithTransaction();
		 BiologicallyderivedproductDao.persist(entity);
		 BiologicallyderivedproductDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Biologicallyderivedproduct entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BiologicallyderivedproductDao.openCurrentSessionwithTransaction();
		 BiologicallyderivedproductDao.update(entity);
		 BiologicallyderivedproductDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Biologicallyderivedproduct findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BiologicallyderivedproductDao.openCurrentSession();
		main.java.com.campfhir.model.Biologicallyderivedproduct resource = BiologicallyderivedproductDao.findById(id);
		BiologicallyderivedproductDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Biologicallyderivedproduct> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BiologicallyderivedproductDao.openCurrentSession();
		List<main.java.com.campfhir.model.Biologicallyderivedproduct> resource =  BiologicallyderivedproductDao.findByPatientId(id);
		BiologicallyderivedproductDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BiologicallyderivedproductDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Biologicallyderivedproduct resource =  BiologicallyderivedproductDao.findById(id);
		BiologicallyderivedproductDao.delete(resource);
		BiologicallyderivedproductDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  BiologicallyderivedproductDao.openCurrentSession();
		ScrollableResults resources =  BiologicallyderivedproductDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Biologicallyderivedproduct.html")  			   
			   .setResource(BiologicallyderivedproductConversion.Biologicallyderivedproducts((main.java.com.campfhir.model.Biologicallyderivedproduct) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  BiologicallyderivedproductDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Biologicallyderivedproduct> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  BiologicallyderivedproductDao.findAll();
		List<main.java.com.campfhir.model.Biologicallyderivedproduct> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Biologicallyderivedproduct) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 BiologicallyderivedproductDao.openCurrentSessionwithTransaction();
		 BiologicallyderivedproductDao.deleteAll();
		 BiologicallyderivedproductDao.closeCurrentSessionwithTransaction();
	}

	public BiologicallyderivedproductDao  BiologicallyderivedproductDao() 
	{
		return  BiologicallyderivedproductDao;
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

