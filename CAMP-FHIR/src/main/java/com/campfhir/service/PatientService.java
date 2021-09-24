package main.java.com.campfhir.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.HibernateException;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.PatientDao;
import main.java.com.campfhir.model.Patient;
import main.java.com.campfhir.service.conversion.PatientConversion;

import ca.uhn.fhir.context.FhirContext;
//import utils.netezzaJdbcMain;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class PatientService 
{

	private static PatientDao patientDao;
	private static PatientConversion pc;

	public PatientService() 
	{
		patientDao = new PatientDao();
		pc = new PatientConversion();
	}

	public void persist(List<Patient> patientList) throws ParserConfigurationException, SAXException, IOException 
	{
		Iterator<Patient> patientIterator = patientList.iterator();
		
		patientDao.openCurrentSessionwithTransaction();
		
		while (patientIterator.hasNext()) 
		{
			patientDao.persist(patientIterator.next());
		}
		
		patientDao.closeCurrentSessionwithTransaction();
	}

	public void update(Patient entity) throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSessionwithTransaction();
		patientDao.update(entity);
		patientDao.closeCurrentSessionwithTransaction();
	}

	public Patient findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSession();
		Patient patient = patientDao.findById(id);
		patientDao.closeCurrentSession();
		return patient;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSessionwithTransaction();
		Patient patient = patientDao.findById(id);
		patientDao.delete(patient);
		patientDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, HibernateException, ParseException, FHIRException 
	{	
		Session session = patientDao.openCurrentSession();
		ScrollableResults patients = patientDao.findAll();
		
		patients = patientDao.findAll();
		
	    int i = 1;
	    
	    System.out.println("start");

		BundleEntryComponent b = new BundleEntryComponent();
		
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
		

	    String file = "C:\\Users\\champioj\\git\\camp-fhir\\CAMP-FHIR\\src\\main\\resources\\geo.txt";
	    Map<String, Map<String, String>> latlong = new HashMap<>();  
	    
	    try(BufferedReader br = new BufferedReader(new FileReader(file))) 
	    {
	        String line = "";
	        
	        while ((line = br.readLine()) != null) 
	        {
	        	String[] v = line.split(",");
	        	Map<String, String> ll = new HashMap<>(); 
	        	ll.put("lat", v[2]);
	        	ll.put("long", v[1]);
	        	latlong.put(v[0].replace("\"", ""), ll);
	        	//System.out.println(v[1]);
	        }
	    } catch (FileNotFoundException e) {
	      //Some error logging
	    }



	     while ( patients.next() ) 
	     {	
			if ((i % partition) == 0)
			{
		    	session.clear();		    	
		    	
		    	writeFile(path, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			b = new BundleEntryComponent();
			
			b.setFullUrl("https://www.hl7.org/fhir/patient.html")
			.setResource(pc.Patients((Patient) patients.get(0), latlong));  	
			
			bundle.addEntry(b);
	     }
	     
	     writeFile(path, i, bundle);
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forR4();
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+"/"+domain+".json", true), StandardCharsets.UTF_8));
		    writer.write(file);
		    writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}


	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSessionwithTransaction();
		patientDao.deleteAll();
		patientDao.closeCurrentSessionwithTransaction();
	}

	public PatientDao patientDao() 
	{
		return patientDao;
	}
}
