package main.java.utils;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.hl7.fhir.exceptions.FHIRException; 
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.service.ConditionService;
import main.java.com.campfhir.service.DocumentReferenceService;
import main.java.com.campfhir.service.EncounterService;
import main.java.com.campfhir.service.MedicationRequestService;
import main.java.com.campfhir.service.ObservationService;
import main.java.com.campfhir.service.PatientService;
import main.java.com.campfhir.service.PractitionerService;
import main.java.com.campfhir.service.ProcedureService;

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
			ClassNotFoundException, org.apache.commons.cli.ParseException 
	{
		
		File directory = new File("config.json");
		ObjectMapper mapper = new ObjectMapper();
        Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);

		int p = Integer.parseInt(cf.getPartition());
		//System.setProperty("CONFIG", cmd.getOptionValue("c"));
		

		
		if(cf.getResource().equals("Condition"))
		{
		     new ConditionService().findAll(p, cf.getOutputfolder());			
		}
		
		else if(cf.getResource().equals("DocumentReference"))
		{			
		    new DocumentReferenceService().findAll(p, cf.getOutputfolder());			
		}	
		
		else if(cf.getResource().equals("Encounter"))
		{			
		    new EncounterService().findAll(p, cf.getOutputfolder());			
		}	
		
		else if(cf.getResource().equals("Observation_Labs"))
		{
			new ObservationService().findAllLab(p, cf.getOutputfolder());
		}	

		else if(cf.getResource().equals("MedicationRequest"))
		{
		    new MedicationRequestService().findAll(p, cf.getOutputfolder());
		}	
		
		else if(cf.getResource().equals("Patient"))
		{
		    new PatientService().findAll(p, cf.getOutputfolder());
		}
		
		else if(cf.getResource().equals("Practitioner"))
		{
			new PractitionerService().findAll(p, cf.getOutputfolder());
		}
		
		else if(cf.getResource().equals("Procedure"))
		{
		    new ProcedureService().findAll(p, cf.getOutputfolder());
		}	
		
		else if(cf.getResource().equals("Observation_VitalsSmoking"))
		{
		    new ObservationService().findAllVital(p, cf.getOutputfolder());
		}
		System.out.println("Finished");
	}
	
}


