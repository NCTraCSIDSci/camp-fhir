package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

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
import main.java.com.campfhir.model.Campfhir;
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
/*
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
*/
	public void findAll(int partition, Campfhir cf) throws ParserConfigurationException, SAXException, IOException, HibernateException, ParseException, FHIRException 
	{	
		Session session = patientDao.openCurrentSession(cf);
		ScrollableResults patients = patientDao.findAll();
		
		patients = patientDao.findAll();
		
	    int i = 1;
	    
	    System.out.println("start");

		BundleEntryComponent b = new BundleEntryComponent();
		
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
		

	     while ( patients.next() ) 
	     {	 
			if ((i % partition) == 0)
			{
				System.out.println(i);
				
		    	session.clear();		    	
		    	
		    	writeFile(cf.getOutputfolder(), i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			b = new BundleEntryComponent();
			
			b.setFullUrl("https://www.hl7.org/fhir/patient.html")
			.setResource(pc.Patients((Patient) patients.get(0)));  	
			
			bundle.addEntry(b);
	     }
	     
	     writeFile(cf.getOutputfolder(), i, bundle);
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

/*
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSessionwithTransaction();
		patientDao.deleteAll();
		patientDao.closeCurrentSessionwithTransaction();
	}
*/
	public PatientDao patientDao() 
	{
		return patientDao;
	}
}
