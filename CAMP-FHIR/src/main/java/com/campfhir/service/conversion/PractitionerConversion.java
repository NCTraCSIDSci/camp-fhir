package com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu3.model.Identifier;

import com.campfhir.model.Practitioner;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class PractitionerConversion 
{
	public Bundle Practitioners(List<Practitioner> practitioners) throws ParseException, IOException
	{
		Bundle bundle = new Bundle();

		for (Practitioner practitioner : practitioners) 
		{
            org.hl7.fhir.dstu3.model.Practitioner p = new org.hl7.fhir.dstu3.model.Practitioner();   
        
			/******************** PRACT_IDENTIFIER ******************************************************************************
			 * PRACT_IDENTIFIER maps to Practitioner / identifier
			 ********************************************************************************************************************/
            if(practitioner.getPRACT_IDENTIFIER() != null)
            {
	            List<Identifier> identifier = new ArrayList<Identifier>();
				identifier.add(new Identifier().setValue(practitioner.getPRACT_IDENTIFIER()));
	            
	            p.setIdentifier(identifier);
            }
			/******************** PRACT_GENDER **********************************************************************************
			 * PRACT_GENDER maps to Practitioner / gender
			 ********************************************************************************************************************/
            if(practitioner.getPRACT_GENDER() != null)
            {
            	p.setGender(AdministrativeGender.valueOf(practitioner.getPRACT_GENDER()));
            }
            
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/practitioner.html")
			   .setResource(p);
            
		}
		
		return bundle;
	}
}
