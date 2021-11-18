// default package
// Generated on Nov 17, 2021, 8:32:01 AM 


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
import main.java.com.campfhir.dao.MedicationknowledgeDao;
import main.java.com.campfhir.service.conversion.MedicationknowledgeConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicationknowledge.
 * @see .Medicationknowledge
 * @author Paul Kovach
 */

public class MedicationknowledgeService {

	private static MedicationknowledgeDao MedicationknowledgeDao;
	private static MedicationknowledgeConversion MedicationknowledgeConversion;

	public MedicationknowledgeService() 
	{
		MedicationknowledgeDao = new MedicationknowledgeDao();
		MedicationknowledgeConversion = new MedicationknowledgeConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicationknowledge entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationknowledgeDao.openCurrentSessionwithTransaction();
		 MedicationknowledgeDao.persist(entity);
		 MedicationknowledgeDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicationknowledge entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationknowledgeDao.openCurrentSessionwithTransaction();
		 MedicationknowledgeDao.update(entity);
		 MedicationknowledgeDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicationknowledge findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationknowledgeDao.openCurrentSession();
		main.java.com.campfhir.model.Medicationknowledge resource = MedicationknowledgeDao.findById(id);
		MedicationknowledgeDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicationknowledge> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationknowledgeDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicationknowledge> resource =  MedicationknowledgeDao.findByPatientId(id);
		MedicationknowledgeDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationknowledgeDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicationknowledge resource =  MedicationknowledgeDao.findById(id);
		MedicationknowledgeDao.delete(resource);
		MedicationknowledgeDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicationknowledgeDao.openCurrentSession();
		ScrollableResults resources =  MedicationknowledgeDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicationknowledge.html")  			   
			   .setResource(MedicationknowledgeConversion.Medicationknowledges((main.java.com.campfhir.model.Medicationknowledge) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicationknowledgeDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicationknowledge> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicationknowledgeDao.findAll();
		List<main.java.com.campfhir.model.Medicationknowledge> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicationknowledge) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationknowledgeDao.openCurrentSessionwithTransaction();
		 MedicationknowledgeDao.deleteAll();
		 MedicationknowledgeDao.closeCurrentSessionwithTransaction();
	}

	public MedicationknowledgeDao  MedicationknowledgeDao() 
	{
		return  MedicationknowledgeDao;
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

