package com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Observation.ObservationStatus;
import org.hl7.fhir.dstu3.model.Quantity;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.Quantity.QuantityComparator;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.exceptions.FHIRFormatError;
import com.campfhir.model.Vital;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class VitalConversion 
{
	public org.hl7.fhir.dstu3.model.Observation Vitals(Vital observation) throws ParseException, IOException, FHIRException
	{
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		
		org.hl7.fhir.dstu3.model.Observation o = new org.hl7.fhir.dstu3.model.Observation();

		o.setStatus(ObservationStatus.fromCode(observation.getOBS_STATUS()));

		/******************** OBS_IDENTIFIER ********************************************************************************
		 * OBS_IDENTIFIER maps to Observation / identifier
		 ********************************************************************************************************************/
		if(observation.getOBS_IDENTIFIER() != null)
		{
			o.setId(observation.getOBS_IDENTIFIER().replaceAll("\\W", "-"));
		}
        
		/******************** OBS_EFFECTIVEDATETIME *************************************************************************
		 * OBS_EFFECTIVEDATETIME maps to Observation / effectiveDateTime
		 ********************************************************************************************************************/
        
        if(observation.getOBS_EFFECTIVEDATETIME() != null)
        {
            try 
            {
                Date date2;
                date2 = sdf2.parse(observation.getOBS_EFFECTIVEDATETIME());
                DateTimeType t = new DateTimeType();
                t.setValue(date2);                    
                
                o.setEffective(t);
            } 
            catch (ParseException e) 
            {
                e.printStackTrace();
            }
        }
		/******************** OBS_SUBJECT_REFERENCE *************************************************************************
		 * OBS_SUBJECT_REFERENCE maps to Observation / subject / reference
		 ********************************************************************************************************************/
        if(observation.getOBS_SUBJECT_REFERENCE() != null)
        {
            Reference reference = new Reference().setReference(observation.getOBS_SUBJECT_REFERENCE());
            o.setSubject(reference);
        }
        
		/******************** OBS_CONTEXT_REFERENCE *************************************************************************
		 * OBS_CONTEXT_REFERENCE maps to Observation / context / reference
		 ********************************************************************************************************************/
        if(observation.getOBS_CONTEXT_REFERENCE() != null)
        {
            Reference reference2 = new Reference().setReference(observation.getOBS_CONTEXT_REFERENCE());
            o.setContext(reference2);
        }
        

        List<CodeableConcept> c1 = new ArrayList<CodeableConcept>();
        CodeableConcept t1 = new CodeableConcept();
        List<Coding> coding1 = new ArrayList<Coding>();
        
        Coding e1 = new Coding();
		/******************** OBS_CATEGORY_SYST *****************************************************************************
		 * OBS_CATEGORY_SYST maps to Observation / category / coding / system
		 ********************************************************************************************************************/
        if(observation.getOBS_CATEGORY_SYST() != null)
        {
        	e1.setSystem("http://hl7.org/fhir/observation-category");
        }
        
		/******************** OBS_CATEGORY_CODE *****************************************************************************
		 * OBS_CATEGORY_CODE maps to Observation / category / coding / code
		 ********************************************************************************************************************/
        if(observation.getOBS_CATEGORY_CODE() != null)
        {
        	e1.setCode(observation.getOBS_CATEGORY_CODE());
        }
        
		/******************** OBS_CATEGORY_DISPLAY **************************************************************************
		 * OBS_CATEGORY_DISPLAY maps to Observation / category / coding / display
		 ********************************************************************************************************************/
        if(observation.getOBS_CATEGORY_DISPLAY() != null)
        {
        	e1.setDisplay(observation.getOBS_CATEGORY_DISPLAY());
        }
        coding1.add(e1);
        t1.setCoding(coding1);
        c1.add(t1);
        o.setCategory(c1);
        
        CodeableConcept t2 = new CodeableConcept();
        List<Coding> coding2 = new ArrayList<Coding>(); 
        Coding e2 = new Coding();
		/******************** OBS_CODE_CODING_SYST **************************************************************************
		 * OBS_CODE_CODING_SYST maps to Observation / code / coding / system
		 ********************************************************************************************************************/
        if(observation.getOBS_CODE_CODING_SYST() != null)
        {
        	e2.setSystem(observation.getOBS_CODE_CODING_SYST());
        }
        
		/******************** OBS_CODE_CODING_CODE **************************************************************************
		 * OBS_CODE_CODING_CODE maps to Observation / code / coding / code
		 ********************************************************************************************************************/
        if(observation.getOBS_CODE_CODING_CODE() != null)
        {
        	e2.setCode(observation.getOBS_CODE_CODING_CODE());
        }
        
		/******************** OBS_CODE_CODING_DISPLAY ***********************************************************************
		 * OBS_CODE_CODING_DISPLAY maps to Observation / code / coding / display
		 ********************************************************************************************************************/
        if(observation.getOBS_CODE_CODING_DISPLAY() != null)
        {
        	e2.setDisplay(observation.getOBS_CODE_CODING_DISPLAY());
        }
        
        coding2.add(e2);
        t2.setCoding(coding2);
        o.setCode(t2); 
		
		
		Quantity q = new Quantity();
		/******************** OBS_VALUEQUANTITY_CODE ************************************************************************
		 * OBS_VALUEQUANTITY_CODE maps to Observation / valueQuantity / code
		 ********************************************************************************************************************/
		if(observation.getOBS_VALUEQUANTITY_CODE() != null)
		{
			q.setCode(observation.getOBS_VALUEQUANTITY_CODE());
		}
		
		
		/******************** OBS_VALUEQUANTITY_VALUE ***********************************************************************
		 * OBS_VALUEQUANTITY_VALUE maps to Observation / valueQuantity / value
		 ********************************************************************************************************************/
        if(observation.getOBS_VALUEQUANTITY_VALUE() != null)
        {   
        	q.setValue(Double.parseDouble(observation.getOBS_VALUEQUANTITY_VALUE()));
        }
		
		/******************** OBS_VALUEQUANTITY_COMPARATOR ******************************************************************
		 * OBS_VALUEQUANTITY_COMPARATOR maps to Observation / valueQuantity / comparator
		 ********************************************************************************************************************/
		if(observation.getOBS_VALUEQUANTITY_COMPARATOR() != null)
		{
			try 
			{
				q.setComparator(QuantityComparator.fromCode(observation.getOBS_VALUEQUANTITY_COMPARATOR()));
			} 
			catch (FHIRFormatError e3) 
			{
				e3.printStackTrace();
			} 
			catch (FHIRException e3) 
			{

				e3.printStackTrace();
			}
		}	
		
		o.setValue(q);
		
		/******************** OBS_VALUESTRING *******************************************************************************
		 * OBS_VALUESTRING maps to Observation / valueString
		 ********************************************************************************************************************/
		if(observation.getOBS_VALUESTRING() != null)
		{
			o.setValue(new StringType()
        		.setValue(observation.getOBS_VALUESTRING()));
		}
	
		return o;
	}
}
