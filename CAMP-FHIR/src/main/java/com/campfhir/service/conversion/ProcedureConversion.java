package com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Procedure.ProcedurePerformerComponent;
import org.hl7.fhir.dstu3.model.Reference;

import com.campfhir.model.Procedure;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ProcedureConversion 
{
	public Bundle Procedures(List<Procedure> procedures) throws ParseException, IOException
	{
		Bundle bundle = new Bundle();
			
		for (Procedure procedure : procedures) 
		{    
            org.hl7.fhir.dstu3.model.Procedure c = new org.hl7.fhir.dstu3.model.Procedure();   
           
			/******************** PCD_IDENTIFIER ********************************************************************************
			 * PCD_IDENTIFIER maps to Procedure / identifier
			 ********************************************************************************************************************/
            c.setId(procedure.getPCD_IDENTIFIER());

			/******************** PCD_SUBJECT_REFERENCE *************************************************************************
			 * PCD_SUBJECT_REFERENCE maps to Procedure / subject / reference
			 ********************************************************************************************************************/
            Reference subject = new Reference();
            subject.setReference(procedure.getPCD_SUBJECT_REFERENCE());           
            c.setSubject(subject);
           
			/******************** PCD_CONTEXT_REFERENCE *************************************************************************
			 * PCD_CONTEXT_REFERENCE maps to Procedure / context / reference
			 ********************************************************************************************************************/
            Reference con = new Reference();
            con.setReference(procedure.getPCD_CONTEXT_REFERENCE());
            c.setContext(con);
           
           
            CodeableConcept c1 = new CodeableConcept();
            Coding cl = new Coding();
            
			/******************** PCD_CODE_CODING_CODE **************************************************************************
			 * PCD_CODE_CODING_CODE maps to Procedure / code / coding / code
			 ********************************************************************************************************************/
            cl.setCode(procedure.getPCD_CODE_CODING_CODE());
            
			/******************** PCD_CODE_CODING_SYST **************************************************************************
			 * PCD_CODE_CODING_SYST maps to Procedure / code / coding / system
			 ********************************************************************************************************************/
            cl.setSystem(procedure.getPCD_CODE_CODING_SYST());           
            c1.addCoding(cl);
            c.setCode(c1);
           
           
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
            try 
            {
                Date date1;
    			/******************** PCD_PERFORMED_PDT *****************************************************************************
    			 * PCD_PERFORMED_PDT maps to Procedure / performed / performedDateTime
    			 ********************************************************************************************************************/
                date1 = sdf.parse(procedure.getPCD_PERFORMED_PDT());
                c.setPerformed(new DateTimeType().setValue(date1));
            } 
            catch (ParseException e) 
            {
                e.printStackTrace();
            }           

			
			/******************** PCD_PERF_ACTOR_REF ****************************************************************************
			 * PCD_PERF_ACTOR_REF maps to Procedure / performer / actor / reference
			 ********************************************************************************************************************/    
            List<ProcedurePerformerComponent> performer= new ArrayList<ProcedurePerformerComponent>();
            ProcedurePerformerComponent ppp = new ProcedurePerformerComponent();
            Reference reference = new Reference();
            reference.setReference(procedure.getPCD_PERF_ACTOR_REF());
			ppp.setActor(reference);
			performer.add(ppp);
            c.setPerformer(performer);
            
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/procedure.html")
			   .setResource(c);
		}
		
		return bundle;
	}
}
