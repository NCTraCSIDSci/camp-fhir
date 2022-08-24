package main.java.utils;

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

        Options options = new Options();
        Option domain = new Option("d", "domain", true, "Domain");
        domain.setRequired(true);
        options.addOption(domain);
        Option fpath = new Option("f", "folderpath", true, "Folder Path");
        fpath.setRequired(true);
        options.addOption(fpath);
        Option partition = new Option("p", "partition", true, "Partition");
        partition.setRequired(true);
        options.addOption(partition);
        Option configpath = new Option("c", "configpath", true, "Config Path");
        configpath.setRequired(false);
        options.addOption(configpath);
        
        
        CommandLine cmd = new DefaultParser().parse(options, args);
 
		int p = Integer.parseInt(cmd.getOptionValue("partition"));
		System.setProperty("CONFIG", cmd.getOptionValue("c"));
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);

		System.out.println("Processing...");	
		
		if(cmd.getOptionValue("domain").equals("Condition"))
		{
		     new ConditionService().findAll(p, cmd.getOptionValue("folderpath"));			
		}
		
		else if(cmd.getOptionValue("domain").equals("DocumentReference"))
		{			
		    new DocumentReferenceService().findAll(p, cmd.getOptionValue("folderpath"));			
		}	
		
		else if(cmd.getOptionValue("domain").equals("Encounter"))
		{			
		    new EncounterService().findAll(p, cmd.getOptionValue("folderpath"));			
		}	
		
		else if(cmd.getOptionValue("domain").equals("Observation_Labs"))
		{
			new ObservationService().findAllLab(p, cmd.getOptionValue("folderpath"));
		}	

		else if(cmd.getOptionValue("domain").equals("MedicationRequest"))
		{
		    new MedicationRequestService().findAll(p, cmd.getOptionValue("folderpath"));
		}	
		
		else if(cmd.getOptionValue("domain").equals("Patient"))
		{
		    new PatientService().findAll(p, cmd.getOptionValue("folderpath"));
		}
		
		else if(cmd.getOptionValue("domain").equals("Practitioner"))
		{
			new PractitionerService().findAll(p, cmd.getOptionValue("folderpath"));
		}
		
		else if(cmd.getOptionValue("domain").equals("Procedure"))
		{
		    new ProcedureService().findAll(p, cmd.getOptionValue("folderpath"));
		}	
		
		else if(cmd.getOptionValue("domain").equals("Observation_VitalsSmoking"))
		{
		    new ObservationService().findAllVital(p, cmd.getOptionValue("folderpath"));
		}
		
		System.out.println("Finished...");
	}
}


