package main.java.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

import org.hl7.fhir.exceptions.FHIRException; 
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.service.ConditionService;

import main.java.com.campfhir.service.DeviceService;
import main.java.com.campfhir.service.DocumentReferenceService;
import main.java.com.campfhir.service.EncounterService;
import main.java.com.campfhir.service.MedicationRequestService;
import main.java.com.campfhir.service.ObservationService;
import main.java.com.campfhir.service.PatientService;
import main.java.com.campfhir.service.PractitionerService;
import main.java.com.campfhir.service.ProcedureService;
import main.java.com.campfhir.service.ResourceService;

/**
*
* @author  James Champion	
* @version 1.0
* @since   2019-08-20
*/
public class CAMPFHIR 
{
	public static void main(String[] args) 
			throws ParseException, 
			FHIRException, 
			IOException, 
			ParserConfigurationException, 
			SAXException, 
			InterruptedException, 
			ClassNotFoundException, org.apache.commons.cli.ParseException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException 
	{
		
		File directory = new File("config.json");
		ObjectMapper mapper = new ObjectMapper();
        Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);

        new ResourceService().findAll(cf);
		
		System.out.println("Finished");
	}
	
}


