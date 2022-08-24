package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.MedicationRequestDao;
import main.java.com.campfhir.dao.PatientDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.MedicationRequest;
import main.java.com.campfhir.service.conversion.MedicationRequestConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class MedicationRequestService 
{

	private static MedicationRequestDao medicationRequestDao;
	public MedicationRequestService() 
	{
		new PatientDao();
		medicationRequestDao = new MedicationRequestDao();
	}
/*
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
*/
	public void findAll(int partition, Campfhir cf) throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		Session session = medicationRequestDao.openCurrentSession(cf);
		
		ScrollableResults medicationRequests = medicationRequestDao.findAll();
		
		int i = 1;
		System.out.println("start");
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
		while ( medicationRequests.next() ) 
		{	
			if ((i % partition) == 0)
			{
				System.out.println(i);
				session.clear();
				
				writeFile(cf.getOutputfolder(), i, bundle);
				bundle = new Bundle().setType(BundleType.COLLECTION);
			}
		
			i++;
		
			bundle.addEntry()
		   .setFullUrl("https://www.hl7.org/fhir/medicationrequest.html")
			   .setResource(new MedicationRequestConversion().MedicationRequests((MedicationRequest) medicationRequests.get(0)));

		 }
	     
		writeFile(cf.getOutputfolder(), i, bundle);
		
		medicationRequestDao.closeCurrentSession();
	}
//	public void findAll(int start, int max, String path) throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException, NumberFormatException, SQLException 
//	{
//		Session session = patientDao.openCurrentSession();
//		ScrollableResults patients = patientDao.findAll(start, max);
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//
//			e.printStackTrace();
//		}  
//
//
//		con = DriverManager.getConnection(  
//		"jdbc:oracle:thin:@DBPROD32.ITS.UNC.EDU:1521:i2b2prd","UNC_TRACSDATA","PV$_5HkNTujrtZPh6G37Pm5");  
//		
//		
//		
//		while(patients.next()) 
//		{    	        
//		    	Patient p = (Patient) patients.get(0);	  
//			    
//		    	System.out.println(p.getPNT_IDENTIFIER());
//		    	
//		    	System.out.println("Start " + p.getPNT_IDENTIFIER() + " " + LocalTime.now());	
//				medicationRequests = medicationRequestDao.findAll(p.getPNT_IDENTIFIER(), con).iterator();			
//	
//				
//				Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
//				while (medicationRequests.hasNext()) 
//				{	
//					bundle.addEntry()
//				   .setFullUrl("https://www.hl7.org/fhir/medicationrequest.html")
//					   .setResource(new MedicationRequestConversion().MedicationRequests(medicationRequests.next()));	
//				 }
//				
//				 System.out.println("Write" + start + " " + p.getPNT_IDENTIFIER() + " " + LocalTime.now());
//			     writeFile(path, Integer.parseInt(p.getPNT_IDENTIFIER()), bundle);
//			     start++;
//    	}
//		con.close(); 
//    	    
//	    }

	    
	
	
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
/*
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		medicationRequestDao.deleteAll();
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}
*/
	public MedicationRequestDao medicationRequestDao() 
	{
		return medicationRequestDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forR4();
		String file = ctx.newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);
		
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
}
