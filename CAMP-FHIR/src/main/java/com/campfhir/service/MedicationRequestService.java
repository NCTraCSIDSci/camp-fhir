package com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleType;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import com.campfhir.dao.MedicationRequestDao;
import com.campfhir.model.Condition;
import com.campfhir.model.Encounter;
import com.campfhir.model.MedicationRequest;
import com.campfhir.service.conversion.EncounterConversion;
import com.campfhir.service.conversion.MedicationRequestConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class MedicationRequestService 
{

	private static MedicationRequestDao medicationRequestDao;

	public MedicationRequestService() 
	{
		medicationRequestDao = new MedicationRequestDao();
	}

	public void persist(MedicationRequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		medicationRequestDao.persist(entity);
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}
	
	public void persist(List<MedicationRequest> medicationList) throws ParserConfigurationException, SAXException, IOException 
	{
		Iterator<MedicationRequest> medicationIterator = medicationList.iterator();
		
		medicationRequestDao.openCurrentSessionwithTransaction();
		
		while (medicationIterator.hasNext()) 
		{
			medicationRequestDao.persist(medicationIterator.next());
		}
		
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(MedicationRequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		medicationRequestDao.update(entity);
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public MedicationRequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSession();
		MedicationRequest medication = medicationRequestDao.findById(id);
		medicationRequestDao.closeCurrentSession();
		return medication;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		MedicationRequest medication = medicationRequestDao.findById(id);
		medicationRequestDao.delete(medication);
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		Session session = medicationRequestDao.openCurrentSession();
		
		ScrollableResults medicationRequests = medicationRequestDao.findAll();
		
		int i = 0;
		System.out.println("start");
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
		while ( medicationRequests.next() ) 
		{	
			if ((i % partition) == 0)
			{
		    	session.flush();
		    	session.clear();
				System.out.println("Write");				
				writeFile(path, i, bundle);
				bundle = new Bundle().setType(BundleType.COLLECTION);
			}
		
			i++;
		
			bundle.addEntry()
		   .setFullUrl("https://www.hl7.org/fhir/medicationrequest.html")
			   .setResource(new MedicationRequestConversion().MedicationRequests((MedicationRequest) medicationRequests.get(0)));
			
			System.out.println(i);
		 }
	     
	     writeFile(path, i, bundle);
		
		medicationRequestDao.closeCurrentSession();
	}
	
	public List<MedicationRequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults medicationRequests = medicationRequestDao.findAll();
		List<MedicationRequest> e = new ArrayList<>();  

		while ( medicationRequests.next() ) 
		{		
			e.add((MedicationRequest) medicationRequests.get(0));
		}

		return e;
	}

	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		medicationRequestDao.deleteAll();
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public MedicationRequestDao medicationRequestDao() 
	{
		return medicationRequestDao;
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
}
