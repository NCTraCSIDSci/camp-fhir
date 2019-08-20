package com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.HibernateException;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleType;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import com.campfhir.dao.PatientDao;
import com.campfhir.model.Condition;
import com.campfhir.model.Encounter;
import com.campfhir.model.Lab;
import com.campfhir.model.MedicationRequest;
import com.campfhir.model.Patient;
import com.campfhir.model.Procedure;
import com.campfhir.model.Vital;
import com.campfhir.service.conversion.PatientAllConversion;
import com.campfhir.service.conversion.PatientConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20
*/
public class PatientService 
{

	private static PatientDao patientDao;
	private static PatientConversion pc;
	private static PatientAllConversion pac;

	public PatientService() 
	{
		patientDao = new PatientDao();
		pc = new PatientConversion();
		pac = new PatientAllConversion();
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
		
	    int i = 0;
	    System.out.println("start");

		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);	     

	     while ( patients.next() ) 
	     {	
			if ((i % partition) == 0)
			{
		    	session.flush();
		    	session.clear();		    	
		    	
		    	writeFile(path, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			Patient p = (Patient) patients.get(0);			
			
//			p.setPNT_ADDRESS_EXT_LAT_VALUE(latLong.get(p.getPNT_IDENTIFIER()).get("lat"));
//			p.setPNT_ADDRESS_EXT_LONG_VALUE(latLong.get(p.getPNT_IDENTIFIER()).get("long"));
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/patient.html")  			   
			   .setResource(pc.Patients((Patient) patients.get(0)));			
			
			System.out.println(i);
	     }
	     
	     writeFile(path, i, bundle);
	}
	
	public void patientRecordViewAll() throws ParserConfigurationException, SAXException, IOException, HibernateException, ParseException, FHIRException 
	{
		patientDao.openCurrentSession();
		ScrollableResults patients = patientDao.findAll();
	
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle();
	     

	    List<Encounter> elist = new EncounterService().findPatientAll();
	    System.out.println("Encounters Loaded...");
	    List<Condition> clist = new ConditionService().findPatientAll();
	    System.out.println("Conditions Loaded...");
	    List<MedicationRequest> mlist = new MedicationRequestService().findPatientAll();
	    System.out.println("Medication Requests Loaded...");
	    List<Procedure> plist = new ProcedureService().findPatientAllProcedure();
	    System.out.println("Procedures Loaded...");
	    List<Lab> llist = new ObservationService().findPatientAllLab();
	    System.out.println("Labs Loaded...");
	    List<Vital> vlist = new ObservationService().findPatientAllVital();
	    System.out.println("Vitals Loaded...");

	     while ( patients.next() ) 
	     {	
				bundle.addEntry()
				   .setFullUrl("https://www.hl7.org/fhir/patient.html")
				   .setResource(pac.Patients((Patient) patients.get(0), elist, clist, mlist, plist, llist, vlist));
				i++;
				writeFile("/opt/all", i, bundle);	
				bundle = new Bundle();
	     }
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forDstu3();
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
		

		
		try 
		{
		    BufferedWriter writer;
			writer = new BufferedWriter(new FileWriter(path+"/"+domain+".json"));
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
