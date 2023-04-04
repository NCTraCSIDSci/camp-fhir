package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.hl7.fhir.r4.model.Patient;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Resource;
import main.java.com.campfhir.service.bidirectionalconversion.PatientBidirectionalConversion;

/**
*
* @author  James Champion
* @version 1.0
* @since   2022-08-31 
*/
public class ResourceOutService 
{

	private static ResourceDao resourceDao;
	
	FhirContext ctx = FhirContext.forR4();
	IGenericClient client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");

	public ResourceOutService() 
	{
		resourceDao = new ResourceDao();
	}

	public void run(Resource resource) 
	{	    
		    resourceDao.persist(resource);
	}
	
	public static void run(Campfhir cf, int domain, Bundle bundle) throws IOException
	{			
		FhirContext ctx = FhirContext.forR4();
		
		String file = null;
		
			if(cf.getiFileType().equals("json"))
			{
				file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
			}
			else if(cf.getiFileType().equals("xml"))
			{
				file = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(bundle);
			}
			else if(cf.getiFileType().equals("rdf"))
			{
				file = ctx.newRDFParser().setPrettyPrint(true).encodeResourceToString(bundle);
			}
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cf.getoOutputfolder()+"/"+domain+"."+cf.getiFileType(), true), StandardCharsets.UTF_8));
		    writer.write(file);
		    writer.close();
		
	
	}
}
