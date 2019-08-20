package com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.parsers.ParserConfigurationException;

import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DecimalType;
import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import com.campfhir.model.Condition;
import com.campfhir.model.Encounter;
import com.campfhir.model.Lab;
import com.campfhir.model.MedicationRequest;
import com.campfhir.model.Patient;
import com.campfhir.model.Procedure;
import com.campfhir.model.Vital;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class PatientAllConversion 
{
    
	public Bundle Patients(Patient patient, 
			List<Encounter> elist, 
			List<Condition> clist, 
			List<MedicationRequest> mlist, 
			List<Procedure> plist, 
			List<Lab> llist, 
			List<Vital> vlist) throws ParseException, IOException, FHIRException, ParserConfigurationException, SAXException
	{
		Bundle bundle = new Bundle();


			org.hl7.fhir.dstu3.model.Patient n = new org.hl7.fhir.dstu3.model.Patient(); 
			
			/******************** PNT_IDENTIFIER ******************************************************************************** 
			 * PNT_IDENTIFIER maps to Patient / identifier
			 ********************************************************************************************************************/
			n.setId(patient.getPNT_IDENTIFIER());
			
			/******************** PNT_GENDER ************************************************************************************ 
			 * PNT_GENDER maps to Patient / gender
			 */
			try 
			{
				n.setGender(AdministrativeGender.fromCode(patient.getPNT_GENDER()));
			} 
			catch (FHIRException e) 
			{
				e.printStackTrace();
			}
				
			/******************** PNT_BIRTHDATE *********************************************************************************
			 * PNT_BIRTHDATE maps to Patient / birthDate 
			 ********************************************************************************************************************/
			if(patient.getPNT_BIRTHDATE() != null)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
				Date date;
				try 
				{
					date = sdf.parse(patient.getPNT_BIRTHDATE());
					n.setBirthDate(date);
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}				
			}
			
			CodeableConcept ms = new CodeableConcept();
			
			Coding c = new Coding();
			


			/******************** PNT_MARITAL_STATUS_CODE ***********************************************************************
			 * PNT_MARITAL_STATUS_CODE  maps to Patient / maritalStatus / coding / code
			 ********************************************************************************************************************/
			c.setCode(patient.getPNT_MARITAL_STATUS_CODE());
			
			List<Coding> theCoding = new ArrayList<Coding>();
			
			theCoding.add(c);
			
			ms.setCoding(theCoding);
			n.setMaritalStatus(ms);	
		
			/******************** PNT_RACE **************************************************************************************
			 * PNT_RACE maps to Patient / extension / race / coding / code
			 ********************************************************************************************************************/
			Extension race = new Extension().setUrl("http://hl7.org/fhir/v3/Race").setValue(new StringType(patient.getPNT_RACE())); 
			n.addExtension(race);
			
			/******************** PNT_ETHNICITY *********************************************************************************
			 * PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code
			 ********************************************************************************************************************/
			Extension ethnicity = new Extension().setUrl("http://hl7.org/fhir/v3/Ethnicity").setValue(new StringType(patient.getPNT_ETHNICITY())); 
			n.addExtension(ethnicity);
			
			Address addrResource = n.addAddress();
			if(patient.getPNT_ADDRESS_EXT_LAT_VALUE()!=null && patient.getPNT_ADDRESS_EXT_LONG_VALUE() != null)
			{
				Extension geolocation = addrResource.addExtension();
				
				/******************** PNT_ADDRESS_EXT_LAT_VALUE ****************************************************************
				 * PNT_ADDRESS_EXT_LAT_VALUE maps to Patient / address / extension / latitude / value
				 ***************************************************************************************************************/
			    geolocation.addExtension("Latitude", new DecimalType(patient.getPNT_ADDRESS_EXT_LAT_VALUE()));
			    
				/******************** PNT_ADDRESS_EXT_LONG_VALUE ***************************************************************
				 * PNT_ADDRESS_EXT_LONG_VALUE maps to Patient / address / extension / longitude / value
				 ***************************************************************************************************************/
			    geolocation.addExtension("Longitude", new DecimalType(patient.getPNT_ADDRESS_EXT_LONG_VALUE()));
			}
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/patient.html")
			   .setResource(n);
			
			List<Encounter> encounters = elist.stream()
					.filter(p -> p.getENC_SUBJECT_REFERENCE()
							.equals("Patient/"+patient.getPNT_IDENTIFIER())).collect(Collectors.toList());
			
			List<Condition> conditions = clist.stream()
					.filter(p -> p.getCON_SUBJECT_REFERENCE()
							.equals("Patient/"+patient.getPNT_IDENTIFIER())).collect(Collectors.toList());
			
			List<MedicationRequest> medicationRequests = mlist.stream()
					.filter(p -> p.getMED_SUBJECT_REFERENCE()
							.equals("Patient/"+patient.getPNT_IDENTIFIER())).collect(Collectors.toList());
			
			List<Procedure> procedures = plist.stream()
					.filter(p -> p.getPCD_SUBJECT_REFERENCE()
							.equals("Patient/"+patient.getPNT_IDENTIFIER())).collect(Collectors.toList());
			
			List<Lab> labs = llist.stream()
					.filter(p -> p.getOBS_SUBJECT_REFERENCE()
							.equals("Patient/"+patient.getPNT_IDENTIFIER())).collect(Collectors.toList());
			
			List<Vital> vitals = vlist.stream()
					.filter(p -> p.getOBS_SUBJECT_REFERENCE()
							.equals("Patient/"+patient.getPNT_IDENTIFIER())).collect(Collectors.toList());
			
//			bundle.addEntry()
//			   .setResource(new EncounterConversion().Encounters(encounters));
//			
//			bundle.addEntry()
//			   .setResource(new ConditionConversion().Conditions(conditions));
//			
//			bundle.addEntry()
//			   .setResource(new MedicationRequestConversion().MedicationRequests(medicationRequests));
//			
//			bundle.addEntry()
//			   .setResource(new ProcedureConversion().Procedures(procedures));
//			
//			bundle.addEntry()
//			   .setResource(new LabConversion().Labs(labs));
//			
//			bundle.addEntry()
//			   .setResource(new VitalConversion().Vitals(vitals));
			

		  return bundle;
	}
}
