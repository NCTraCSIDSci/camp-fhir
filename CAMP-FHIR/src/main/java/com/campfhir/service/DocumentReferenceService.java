package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.DocumentReferenceDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.DocumentReference;
import main.java.com.campfhir.service.conversion.DocumentReferenceConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2021-02-22 
*/
public class DocumentReferenceService 
{

	private static DocumentReferenceDao documentReferenceDao;
	private static DocumentReferenceConversion drc;

	public DocumentReferenceService() 
	{
		documentReferenceDao = new DocumentReferenceDao();
		drc = new DocumentReferenceConversion();
	}
/*
	public void persist(DocumentReference entity) throws ParserConfigurationException, SAXException, IOException 
	{
		documentReferenceDao.openCurrentSessionwithTransaction();
		documentReferenceDao.persist(entity);
		documentReferenceDao.closeCurrentSessionwithTransaction();
	}

	public void update(DocumentReference entity) throws ParserConfigurationException, SAXException, IOException 
	{
		documentReferenceDao.openCurrentSessionwithTransaction();
		documentReferenceDao.update(entity);
		documentReferenceDao.closeCurrentSessionwithTransaction();
	}

	public DocumentReference findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		documentReferenceDao.openCurrentSession();
		DocumentReference documentReference = documentReferenceDao.findById(id);
		documentReferenceDao.closeCurrentSession();
		return documentReference;
	}
	
	public List<DocumentReference> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		documentReferenceDao.openCurrentSession();
		List<DocumentReference> documentReferences = documentReferenceDao.findByPatientId(id);
		documentReferenceDao.closeCurrentSession();
		return documentReferences;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		documentReferenceDao.openCurrentSessionwithTransaction();
		DocumentReference documentReference = documentReferenceDao.findById(id);
		documentReferenceDao.delete(documentReference);
		documentReferenceDao.closeCurrentSessionwithTransaction();
	}
*/
	public void findAll(int partition, Campfhir cf) throws ParserConfigurationException, SAXException, IOException, ParseException, ClassNotFoundException 
	{
		Session session = documentReferenceDao.openCurrentSession(cf);
		ScrollableResults conditions = documentReferenceDao.findAll();
		
	     int i = 1;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( conditions.next() ) 
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
			   .setFullUrl("https://www.hl7.org/fhir/condition.html")  			   
			   .setResource(drc.DocumentReferences((DocumentReference) conditions.get(0)));
			
	     }
	     
	     writeFile(cf.getOutputfolder(), i, bundle);
		 documentReferenceDao.closeCurrentSession();
	}
	
	public List<DocumentReference> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults documentReferences = documentReferenceDao.findAll();
		List<DocumentReference> e = new ArrayList<>();  

		while ( documentReferences.next() ) 
		{		
			e.add((DocumentReference) documentReferences.get(0));
		}

		return e;
	}

	
/*	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		documentReferenceDao.openCurrentSessionwithTransaction();
		documentReferenceDao.deleteAll();
		documentReferenceDao.closeCurrentSessionwithTransaction();
	}
*/
	public DocumentReferenceDao documentReferenceDao() 
	{
		return documentReferenceDao;
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
