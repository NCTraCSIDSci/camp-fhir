package main.java.com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

//import org.hl7.fhir.dstu3.model.codesystems.V3RaceEnumFactory;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DecimalType;
import org.hl7.fhir.r4.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.r4.model.Extension;
import org.xml.sax.SAXException;

import main.java.com.campfhir.model.Patient;


/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class PatientConversion 
{
	public org.hl7.fhir.r4.model.Patient Patients(Patient patient, Map<String, Map<String, String>> latlong) throws ParseException, IOException, ParserConfigurationException, SAXException
	{
			org.hl7.fhir.r4.model.Patient n = new org.hl7.fhir.r4.model.Patient(); 
			

			/******************** PNT_IDENTIFIER ******************************************************************************** 
			 * PNT_IDENTIFIER maps to Patient / identifier
			 ********************************************************************************************************************/
			n.setId(patient.getPNT_IDENTIFIER());
			
			
			if(latlong.get(patient.getPNT_IDENTIFIER()) != null)
			{
				if(!latlong.get(patient.getPNT_IDENTIFIER()).get("lat").isEmpty())
				{
					patient.setPNT_ADDRESS_EXT_LAT_VALUE(latlong.get(patient.getPNT_IDENTIFIER()).get("lat")); 
					patient.setPNT_ADDRESS_EXT_LONG_VALUE(latlong.get(patient.getPNT_IDENTIFIER()).get("long"));
				}
			}
			
			/******************** PNT_GENDER ************************************************************************************ 
			 * PNT_GENDER maps to Patient / gender
			 */

			n.setGender(AdministrativeGender.fromCode(patient.getPNT_GENDER()));

				
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
			
			if(patient.getPNT_MARITAL_STATUS_CODE() != null)
			{
				CodeableConcept ms = new CodeableConcept();
				
				Coding c = new Coding();
				
				/******************** PNT_MARITAL_STATUS_CODE ***********************************************************************
				 * PNT_MARITAL_STATUS_CODE  maps to Patient / maritalStatus / coding / code
				 ********************************************************************************************************************/
	
				c.setCode(patient.getPNT_MARITAL_STATUS_CODE());
				
				
				/******************** PNT_MARITAL_STATUS_SYSTEM *********************************************************************
				 * PNT_MARITAL_STATUS_SYSTEM maps to Patient / maritalStatus / coding / system
				 ********************************************************************************************************************/
				c.setSystem("http://terminology.hl7.org/CodeSystem/v3-MaritalStatus");//patient.getPNT_MARITAL_STATUS_SYSTEM());
				
				List<Coding> theCoding = new ArrayList<Coding>();
				
				theCoding.add(c);
				
				ms.setCoding(theCoding);
				n.setMaritalStatus(ms);	
			}
		
			/******************** PNT_RACE **************************************************************************************
			 * PNT_RACE maps to Patient / extension / race / coding / code
			 ********************************************************************************************************************/
			List<Extension> extList = new ArrayList<>();
			if(patient.getPNT_RACE() != null)
			{
				
				Extension t2 = new Extension();
				t2.setUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race");
				
				Coding race = new Coding();
				race.setCode(patient.getPNT_RACE());
				race.setSystem("urn:oid:2.16.840.1.113883.6.238");
				race.setDisplay(patient.getPNT_RACE_DISP());
				t2.addExtension("ombCategory", race);
				
				extList.add(t2);
			}
		
			
			/******************** PNT_ETHNICITY *********************************************************************************
			 * PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code
			 ********************************************************************************************************************/
			
			if(patient.getPNT_ETHNICITY() != null)
			{
				Extension t3 = new Extension();			
				
				t3.setUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity");
				
				Coding ethnicity = new Coding();
				ethnicity.setCode(patient.getPNT_ETHNICITY());
				ethnicity.setSystem("urn:oid:2.16.840.1.113883.6.238");
				ethnicity.setDisplay(patient.getPNT_ETHNICITY_DISP());			
				
				t3.addExtension("ombCategory", ethnicity);
				
				extList.add(t3);
			}
			
			if(patient.getPNT_ETHNICITY() != null || patient.getPNT_RACE() != null)
			{
				n.setExtension(extList);
			}
			
			Map<String, Map<String, String>> t = latlong;
			
			Address addrResource = n.addAddress();
			if(patient.getPNT_ADDRESS_EXT_LAT_VALUE() !=null && patient.getPNT_ADDRESS_EXT_LONG_VALUE() != null)
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

		  return n;
	}
}
