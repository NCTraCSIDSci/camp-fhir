package main.java.com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent;
import org.hl7.fhir.r4.model.Procedure.ProcedureStatus;
import org.hl7.fhir.r4.model.Reference;

import main.java.com.campfhir.model.Procedure;

import org.hl7.fhir.exceptions.FHIRException;


/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ProcedureConversion 
{
	public org.hl7.fhir.r4.model.Procedure Procedures(Procedure procedure) throws ParseException, IOException, FHIRException
	{
  
        org.hl7.fhir.r4.model.Procedure c = new org.hl7.fhir.r4.model.Procedure();   

		c.setStatus(ProcedureStatus.fromCode(procedure.getPCD_STATUS()));
       
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
        c.setEncounter(con);
       
       
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
            
		return c;
	}
}
