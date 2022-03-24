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
import main.java.com.campfhir.dao.AppointmentDao;
import main.java.com.campfhir.service.conversion.AppointmentConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Appointment.
 * @see .Appointment
 * @author Paul Kovach
 */

public class AppointmentService {

	private static AppointmentDao AppointmentDao;
	private static AppointmentConversion AppointmentConversion;

	public AppointmentService() 
	{
		AppointmentDao = new AppointmentDao();
		AppointmentConversion = new AppointmentConversion();
	}

	public void persist(main.java.com.campfhir.model.Appointment entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AppointmentDao.openCurrentSessionwithTransaction();
		 AppointmentDao.persist(entity);
		 AppointmentDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Appointment entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AppointmentDao.openCurrentSessionwithTransaction();
		 AppointmentDao.update(entity);
		 AppointmentDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Appointment findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AppointmentDao.openCurrentSession();
		main.java.com.campfhir.model.Appointment resource = AppointmentDao.findById(id);
		AppointmentDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Appointment> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AppointmentDao.openCurrentSession();
		List<main.java.com.campfhir.model.Appointment> resource =  AppointmentDao.findByPatientId(id);
		AppointmentDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AppointmentDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Appointment resource =  AppointmentDao.findById(id);
		AppointmentDao.delete(resource);
		AppointmentDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  AppointmentDao.openCurrentSession();
		ScrollableResults resources =  AppointmentDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Appointment.html")  			   
			   .setResource(AppointmentConversion.Appointments((main.java.com.campfhir.model.Appointment) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  AppointmentDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Appointment> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  AppointmentDao.findAll();
		List<main.java.com.campfhir.model.Appointment> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Appointment) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 AppointmentDao.openCurrentSessionwithTransaction();
		 AppointmentDao.deleteAll();
		 AppointmentDao.closeCurrentSessionwithTransaction();
	}

	public AppointmentDao  AppointmentDao() 
	{
		return  AppointmentDao;
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
