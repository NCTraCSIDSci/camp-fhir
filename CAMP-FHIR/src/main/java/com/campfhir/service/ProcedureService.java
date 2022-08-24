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

import org.hibernate.HibernateException;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.ProcedureDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Procedure;
import main.java.com.campfhir.service.conversion.ProcedureConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ProcedureService 
{

	private static ProcedureDao procedureDao;
	private static ProcedureConversion pr;

	public ProcedureService() 
	{
		procedureDao = new ProcedureDao();
		pr = new ProcedureConversion();
	}
/*
	public void persist(Procedure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		procedureDao.persist(entity);
		procedureDao.closeCurrentSessionwithTransaction();
	}

	public void update(Procedure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		procedureDao.update(entity);
		procedureDao.closeCurrentSessionwithTransaction();
	}

	public Procedure findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSession();
		Procedure procedure = procedureDao.findById(id);
		procedureDao.closeCurrentSession();
		return procedure;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		Procedure procedure = procedureDao.findById(id);
		procedureDao.delete(procedure);
		procedureDao.closeCurrentSessionwithTransaction();
	}
*/
	public void findAll(int partition, Campfhir cf) throws ParserConfigurationException, SAXException, IOException, ParseException, HibernateException, FHIRException 
	{
		Session session = procedureDao.openCurrentSession(cf);
		
		ScrollableResults procedures = procedureDao.findAll();
	     int i = 1;
	     System.out.println("start");
	     
	     BundleEntryComponent b = new BundleEntryComponent();
	     
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( procedures.next() ) 
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
			
			b.setFullUrl("https://www.hl7.org/fhir/procedure.html")  			   
			   .setResource(pr.Procedures((Procedure) procedures.get(0)));
			
			bundle.addEntry(b);
			
	     }
	     
	     writeFile(cf.getOutputfolder(), i, bundle);
		 procedureDao.closeCurrentSession();
	}
	
	public List<Procedure> findPatientAllProcedure() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults procedures = procedureDao.findAll();
		List<Procedure> e = new ArrayList<>();  

		while ( procedures.next() ) 
		{		
			e.add((Procedure) procedures.get(0));
		}

		return e;
	}
/*
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		procedureDao.deleteAll();
		procedureDao.closeCurrentSessionwithTransaction();
	}
*/
	public ProcedureDao procedureDao() 
	{
		return procedureDao;
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
