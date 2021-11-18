//// default package
package main.templateoutput.Service;

// Generated on Nov 18, 2021, 1:48:14 PM 


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
import main.java.com.campfhir.dao.QuestionnaireDao;
import main.java.com.campfhir.service.conversion.QuestionnaireConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Questionnaire.
 * @see .Questionnaire
 * @author Paul Kovach
 */

public class QuestionnaireService {

	private static QuestionnaireDao QuestionnaireDao;
	private static QuestionnaireConversion QuestionnaireConversion;

	public QuestionnaireService() 
	{
		QuestionnaireDao = new QuestionnaireDao();
		QuestionnaireConversion = new QuestionnaireConversion();
	}

	public void persist(main.java.com.campfhir.model.Questionnaire entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 QuestionnaireDao.openCurrentSessionwithTransaction();
		 QuestionnaireDao.persist(entity);
		 QuestionnaireDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Questionnaire entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 QuestionnaireDao.openCurrentSessionwithTransaction();
		 QuestionnaireDao.update(entity);
		 QuestionnaireDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Questionnaire findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		QuestionnaireDao.openCurrentSession();
		main.java.com.campfhir.model.Questionnaire resource = QuestionnaireDao.findById(id);
		QuestionnaireDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Questionnaire> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		QuestionnaireDao.openCurrentSession();
		List<main.java.com.campfhir.model.Questionnaire> resource =  QuestionnaireDao.findByPatientId(id);
		QuestionnaireDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		QuestionnaireDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Questionnaire resource =  QuestionnaireDao.findById(id);
		QuestionnaireDao.delete(resource);
		QuestionnaireDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  QuestionnaireDao.openCurrentSession();
		ScrollableResults resources =  QuestionnaireDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Questionnaire.html")  			   
			   .setResource(QuestionnaireConversion.Questionnaires((main.java.com.campfhir.model.Questionnaire) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  QuestionnaireDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Questionnaire> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  QuestionnaireDao.findAll();
		List<main.java.com.campfhir.model.Questionnaire> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Questionnaire) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 QuestionnaireDao.openCurrentSessionwithTransaction();
		 QuestionnaireDao.deleteAll();
		 QuestionnaireDao.closeCurrentSessionwithTransaction();
	}

	public QuestionnaireDao  QuestionnaireDao() 
	{
		return  QuestionnaireDao;
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

