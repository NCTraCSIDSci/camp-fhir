package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;

import javax.xml.parsers.ParserConfigurationException;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import com.campfhir.model.Condition;
import com.campfhir.model.Encounter;
import com.campfhir.model.Lab;
import com.campfhir.model.MedicationRequest;
import com.campfhir.model.Patient;
import com.campfhir.model.Practitioner;
import com.campfhir.model.Procedure;
import com.campfhir.model.Vital;
import com.campfhir.service.ConditionService;
import com.campfhir.service.EncounterService;
import com.campfhir.service.MedicationRequestService;
import com.campfhir.service.ObservationService;
import com.campfhir.service.PatientService;
import com.campfhir.service.PractitionerService;
import com.campfhir.service.ProcedureService;
import com.campfhir.service.conversion.ConditionConversion;
import com.campfhir.service.conversion.EncounterConversion;
import com.campfhir.service.conversion.LabConversion;
import com.campfhir.service.conversion.MedicationRequestConversion;
import com.campfhir.service.conversion.PatientConversion;
import com.campfhir.service.conversion.PractitionerConversion;
import com.campfhir.service.conversion.ProcedureConversion;
import com.campfhir.service.conversion.VitalConversion;
import com.google.common.collect.Lists;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class CAMPFHIR 
{
	public static void main(String[] args) 
			throws ParseException, FHIRException, IOException, ParserConfigurationException, SAXException 
	{
		String domain = args[0];		
		String path = args[1];
		int partition = Integer.parseInt(args[2]);
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);

		System.out.println("Processing...");	

		if(domain.equals("Condition"))
		{
		    List<List<Condition>> conditions = Lists.partition(new ConditionService().findAll(), partition);
		    
			for (List<Condition> c : conditions) 
			{
				Bundle bundle = new ConditionConversion().Conditions(c);
				writeFile(path, domain + conditions.indexOf(c), bundle);
			}
		}
		else if(domain.equals("Encounter"))
		{
		    List<List<Encounter>> encounters = Lists.partition(new EncounterService().findAll(), partition);
		    
			for (List<Encounter> e : encounters) 
			{
				Bundle bundle = new EncounterConversion().Encounters(e);
				writeFile(path, domain + encounters.indexOf(e), bundle);
			}		
		}	
		else if(domain.equals("Observation_Labs"))
		{
			List<List<Lab>> labs = Lists.partition(new ObservationService().findAllLab(), partition);
			
			for (List<Lab> l : labs) 
			{
				Bundle bundle = new LabConversion().Labs(l);
				writeFile(path, domain + labs.indexOf(l), bundle);	
			}
		}	

		else if(domain.equals("MedicationRequest"))
		{
		    List<List<MedicationRequest>> medicationRequests = Lists.partition(
		    		new MedicationRequestService().findAll(), partition);
		    
			for (List<MedicationRequest> m : medicationRequests) 
			{
				Bundle bundle = new MedicationRequestConversion().MedicationRequests(m);
				writeFile(path, domain + medicationRequests.indexOf(m), bundle);		
			}
		}	
		else if(domain.equals("Patient"))
		{
		    List<List<Patient>> patients = Lists.partition(new PatientService().findAll(), partition);
		    
			for (List<Patient> p : patients) 
			{
				Bundle bundle = new PatientConversion().Patients(p);
				writeFile(path, domain + patients.indexOf(p), bundle);
			}
		}
		else if(domain.equals("Practitioner"))
		{
		    List<List<Practitioner>> practitioners = Lists.partition(
		    		new PractitionerService().findAll(), partition);
		    
			for (List<Practitioner> p : practitioners) 
			{
				Bundle bundle = new PractitionerConversion().Practitioners(p);
				writeFile(path, domain + practitioners.indexOf(p), bundle);
			}
		}
		else if(domain.equals("Procedure"))
		{
		    List<List<Procedure>> procedures = Lists.partition(
		    		new ProcedureService().findAll(), partition);
		    
			for (List<Procedure> p : procedures) 
			{
				Bundle bundle = new ProcedureConversion().Procedures(p);
				writeFile(path, domain + procedures.indexOf(p), bundle);	
			}
		}	
		else if(domain.equals("Observation_VitalsSmoking"))
		{
		    List<List<Vital>> vitals = Lists.partition(
		    		new ObservationService().findAllVital(), partition);
		    
			for (List<Vital> v : vitals) 
			{
				Bundle bundle = new VitalConversion().Vitals(v);
				writeFile(path, domain + vitals.indexOf(v), bundle);	
			}
		}
		
		System.out.println("Finished...");
	}
	    
	public static void writeFile(String path, String domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forDstu3();
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
		
	    BufferedWriter writer;
		
		try 
		{
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


