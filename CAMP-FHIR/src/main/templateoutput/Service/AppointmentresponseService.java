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
import main.java.com.campfhir.dao.AppointmentresponseDao;
import main.java.com.campfhir.service.conversion.AppointmentresponseConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Appointmentresponse.
 * @see .Appointmentresponse
 * @author Paul Kovach
 */

public class AppointmentresponseService {

	private static AppointmentresponseDao AppointmentresponseDao;
	private static AppointmentresponseConversion AppointmentresponseConversion;

	public AppointmentresponseService() 
	{
		AppointmentresponseDao = new AppointmentresponseDao();
		AppointmentresponseConversion = new AppointmentresponseConversion();
	}

	public void persist(main.java.com.campfhir.model.Appointmentresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AppointmentresponseDao.openCurrentSessionwithTransaction();
		 AppointmentresponseDao.persist(entity);
		 AppointmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Appointmentresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AppointmentresponseDao.openCurrentSessionwithTransaction();
		 AppointmentresponseDao.update(entity);
		 AppointmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Appointmentresponse findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AppointmentresponseDao.openCurrentSession();
		main.java.com.campfhir.model.Appointmentresponse resource = AppointmentresponseDao.findById(id);
		AppointmentresponseDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Appointmentresponse> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AppointmentresponseDao.openCurrentSession();
		List<main.java.com.campfhir.model.Appointmentresponse> resource =  AppointmentresponseDao.findByPatientId(id);
		AppointmentresponseDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AppointmentresponseDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Appointmentresponse resource =  AppointmentresponseDao.findById(id);
		AppointmentresponseDao.delete(resource);
		AppointmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  AppointmentresponseDao.openCurrentSession();
		ScrollableResults resources =  AppointmentresponseDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Appointmentresponse.html")  			   
			   .setResource(AppointmentresponseConversion.Appointmentresponses((main.java.com.campfhir.model.Appointmentresponse) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  AppointmentresponseDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Appointmentresponse> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  AppointmentresponseDao.findAll();
		List<main.java.com.campfhir.model.Appointmentresponse> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Appointmentresponse) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 AppointmentresponseDao.openCurrentSessionwithTransaction();
		 AppointmentresponseDao.deleteAll();
		 AppointmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public AppointmentresponseDao  AppointmentresponseDao() 
	{
		return  AppointmentresponseDao;
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

