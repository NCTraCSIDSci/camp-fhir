package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
import com.campfhir.service.conversion.PatientAllConversion;
import com.campfhir.service.conversion.PatientConversion;
import com.campfhir.service.conversion.PractitionerConversion;
import com.campfhir.service.conversion.ProcedureConversion;
import com.campfhir.service.conversion.VitalConversion;
import com.google.common.collect.Lists;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.resource.Person;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20
*/
public class CAMPFHIR 
{
	public static void main(String[] args) 
			throws ParseException, FHIRException, IOException, ParserConfigurationException, SAXException, InterruptedException 
	{
		String domain = args[0];		
		String path = args[1];
		int partition = Integer.parseInt(args[2]);
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);

		System.out.println("Processing...");	
		
		if(domain.equals("Condition"))
		{
		     new ConditionService().findAll(partition, path);			
		}
		
		else if(domain.equals("Encounter"))
		{			
		    new EncounterService().findAll(partition, path);			
		}	
		
		else if(domain.equals("Observation_Labs"))
		{
			new ObservationService().findAllLab(partition, path);
		}	

		else if(domain.equals("MedicationRequest"))
		{
		    new MedicationRequestService().findAll(partition, path);
		}	
		
		else if(domain.equals("Patient"))
		{
		    new PatientService().findAll(partition, path);
		}
		
		else if(domain.equals("PatientAll"))
		{
		    //List<List<Patient>> patients = Lists.partition(new PatientService().patientRecordViewAll(), 1);
//		    System.out.println("Patients Loaded...");
//		    List<Encounter> elist = new EncounterService().findAll();
//		    System.out.println("Encounters Loaded...");
//		    List<Condition> clist = null;//new ConditionService().findAll();
//		    System.out.println("Conditions Loaded...");
//		    List<MedicationRequest> mlist = new MedicationRequestService().findAll();
//		    System.out.println("Medication Requests Loaded...");
//		    List<Procedure> plist = new ProcedureService().findAll();
//		    System.out.println("Procedures Loaded...");
//		    List<Lab> llist = new ObservationService().findAllLab();
//		    System.out.println("Labs Loaded...");
//		    List<Vital> vlist = new ObservationService().findAllVital();
//		    System.out.println("Vitals Loaded...");
//		    
//		    int count = 0;
//			for (List<Patient> p : patients) 
//			{
//				count++;
//				System.out.println(count);
//				
//				Bundle bundle = new PatientAllConversion().Patients(p, 
//						elist, 
//						clist, 
//						mlist, 
//						plist, 
//						llist, 
//						vlist);
//				writeFile(path, p.get(0).getPNT_IDENTIFIER(), bundle);
//			}
		}
		else if(domain.equals("Practitioner"))
		{
			new PractitionerService().findAll(partition, path);
		}
		else if(domain.equals("Procedure"))
		{
		    new ProcedureService().findAll(partition, path);
		}	
		else if(domain.equals("Observation_VitalsSmoking"))
		{
		    new ObservationService().findAllVital(partition, path);
		}
		
		System.out.println("Finished...");
	}
	    
	public static void writeFile(String path, String domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forDstu3();
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
		

		
		try 
		{
		    BufferedWriter writer;
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


