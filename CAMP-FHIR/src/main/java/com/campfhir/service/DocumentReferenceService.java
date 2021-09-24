package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.DocumentReferenceDao;
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

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException, ClassNotFoundException 
	{
//		Session session = documentReferenceDao.openCurrentSession();
//		ScrollableResults documentReferences = documentReferenceDao.findAll();
		
		int i = 0;
		System.out.println("start");
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	        
		Connection conn = null;
	        
		try 
		{
			String dbURL = "jdbc:jtds:sqlserver://10.102.212.22:1433;databaseName=TRACS_CUSTOM;integratedSecurity=true;";
	         
	        Class.forName("net.sourceforge.jtds.jdbc.Driver");
	        
	        conn = DriverManager.getConnection(dbURL);   
	        
	        if (conn != null) 
	        {
            	String query = "SELECT [DOC_SUBJECT_REFERENCE]" + 
            			"      ,[DOC_ID] " + 
            			"      ,[DOC_DATE] " + 
            			"      ,[DOC_START_DATE] " + 
            			"      ,[DOC_END_DATE] " + 
            			"      ,[DOC_TYPE_CODE] " + 
            			"      ,[DOC_TYPE_SYSTEM] " + 
            			"      ,[DOC_TYPE_DISPLAY] " + 
            			"      ,[DOC_TYPE] " + 
            			"      ,[DOC_CATEGORY] " + 
            			"      ,[DOC_STATUS] " + 
            			"      ,[DOC_CONTENT_TYPE] " + 
            			"      ,[DOC_CONTENT_DATA] " + 
            			"  FROM [CFV_CLARITY_FHIR_DOC_REFERENCE_TESTING]";
	            	
            	try (Statement stmt = conn.createStatement()) 
            	{
					ResultSet rs = stmt.executeQuery(query);
	
					while (rs.next()) 
					{
						DocumentReference dr = new DocumentReference();
						dr.setDOC_SUBJECT_REFERENCE(rs.getString("DOC_SUBJECT_REFERENCE"));
						dr.setDOC_ID(rs.getString("DOC_ID"));
						dr.setDOC_DATE(rs.getString("DOC_DATE"));
						dr.setDOC_START_DATE(rs.getString("DOC_START_DATE"));
						dr.setDOC_END_DATE(rs.getString("DOC_END_DATE"));
						dr.setDOC_TYPE_CODE(rs.getString("DOC_TYPE_CODE"));
						dr.setDOC_TYPE_SYSTEM(rs.getString("DOC_TYPE_SYSTEM"));
						dr.setDOC_TYPE_DISPLAY(rs.getString("DOC_TYPE_DISPLAY"));
						dr.setDOC_TYPE(rs.getString("DOC_TYPE"));
						dr.setDOC_CATEGORY(rs.getString("DOC_CATEGORY"));
						dr.setDOC_STATUS(rs.getString("DOC_STATUS"));
						dr.setDOC_CONTENT_TYPE(rs.getString("DOC_CONTENT_TYPE"));
						dr.setDOC_CONTENT_DATA(rs.getString("DOC_CONTENT_DATA"));
						
						if ((i % partition) == 0)
						{
					    	writeFile(path, i, bundle);
						    bundle = new Bundle().setType(BundleType.COLLECTION);
						}
						
						i++;
						
						bundle.addEntry()
						   .setFullUrl("https://www.hl7.org/fhir/documentReference.html")  
						   
						   .setResource(drc.DocumentReferences((DocumentReference) dr)); 
					}
	    	        writeFile(path, i, bundle);
            	}
	        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
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

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		documentReferenceDao.openCurrentSessionwithTransaction();
		documentReferenceDao.deleteAll();
		documentReferenceDao.closeCurrentSessionwithTransaction();
	}

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
