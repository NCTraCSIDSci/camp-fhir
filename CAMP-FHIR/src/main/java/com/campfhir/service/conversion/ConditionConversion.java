package main.java.com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.r4.model.BaseDateTimeType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Reference;

import main.java.com.campfhir.model.Condition;

import org.hl7.fhir.exceptions.FHIRException;


/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ConditionConversion 
{
	public org.hl7.fhir.r4.model.Condition Conditions(Condition condition) throws ParseException, IOException
	{
		org.hl7.fhir.r4.model.Condition c = new org.hl7.fhir.r4.model.Condition();	
	
		
		/******************** CON_IDENTIFIER ********************************************************************************
		 * CON_IDENTIFIER maps to Condition / identifier
		 ********************************************************************************************************************/
		if(condition.getCON_IDENTIFIER() != null)
		{
			c.setId(condition.getCON_IDENTIFIER());
		}
		
		//c.setVerificationStatus(CodeableConcept.setText(value));
		
	
		/******************** CON_SUBJECT_REFERENCE *************************************************************************
		 * CON_SUBJECT_REFERENCE maps to Condition / subject / reference
		 ********************************************************************************************************************/
		c.setSubject(new Reference().setReference(condition.getCON_SUBJECT_REFERENCE()));
		
		/******************** CON_CONTEXT_REFERENCE *************************************************************************
		 * CON_CONTEXT_REFERENCE maps to Condition / context / reference
		 ********************************************************************************************************************/
		c.setEncounter(new Reference().setReference(condition.getCON_CONTEXT_REFERENCE()));
		
		/******************** CON_ASSERTER_REFERENCE ************************************************************************
		 * CON_ASSERTER_REFERENCE maps to Condition / asserter / reference
		 ********************************************************************************************************************/
		c.setAsserter(new Reference().setReference(condition.getCON_ASSERTER_REFERENCE()));
		
		CodeableConcept c1 = new CodeableConcept();
		Coding cl = new Coding();
		/******************** CON_CODE_CODING_CODE **************************************************************************
		 * CON_CODE_CODING_CODE maps to Condition / code / coding / code
		 ********************************************************************************************************************/
		cl.setCode(condition.getCON_CODE_CODING_CODE());
		
		/******************** CON_CODE_CODING_SYST **************************************************************************
		 * CON_CODE_CODING_SYST maps to Condition / code / coding / system
		 ********************************************************************************************************************/
		cl.setSystem(condition.getCON_CODE_CODING_SYST());			
	    c1.addCoding(cl);
		c.setCode(c1);
		

		CodeableConcept c2 = new CodeableConcept();
		Coding cl2 = new Coding();
		/******************** CON_CATEGORY_CODING_CODE **********************************************************************
		 * CON_CATEGORY_CODING_CODE maps to Condition / category / coding / code
		 ********************************************************************************************************************/
		cl2.setCode(condition.getCON_CATEGORY_CODING_CODE());
		
		/******************** CON_CATEGORY_CODING_SYST **************************************************************************
		 * CON_CATEGORY_CODING_SYST maps to Condition / category / coding / system
		 ********************************************************************************************************************/
		cl2.setSystem(condition.getCON_CATEGORY_CODING_SYST());			
	    c2.addCoding(cl2);
		List<CodeableConcept> cat = new ArrayList<CodeableConcept>();
		
		cat.add(c2);
		c.setCategory(cat);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");

		try 
		{
			/******************** CON_ASSERT_DATE *******************************************************************************
			 * CON_ASSERT_DATE maps to Condition / assertedDat
			 ********************************************************************************************************************/
			c.setRecordedDate(sdf.parse(condition.getCON_ASSERT_DATE()));
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}	
		
		/******************** CON_CLINSTATUS ********************************************************************************
		 * CON_CLINSTATUS maps to Condition / clinicalStatus
		 ********************************************************************************************************************/
		if(condition.getCON_CLINSTATUS() != null)
		{
			try 
			{
				//c.setClinicalStatus(ConditionClinicalStatus.fromCode(condition.getCON_CLINSTATUS()));
				CodeableConcept cs = new CodeableConcept();
				Coding t = new Coding();
				t.setCode(condition.getCON_CLINSTATUS());
				cs.addCoding(t);
				c.setClinicalStatus(cs);
			} 
			catch (FHIRException e) 
			{
				e.printStackTrace();
			}
		}
		BaseDateTimeType dt = new DateTimeType();
		if(condition.getCON_ABATEDATE() != null)
		{
			try 
			{
				/******************** CON_ABATEDATE *********************************************************************************
				 * CON_ABATEDATE maps to Condition / abatementDateTime
				 ********************************************************************************************************************/
				
				dt.setValue(sdf.parse(condition.getCON_ABATEDATE()));
				
				c.setAbatement(dt);
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		}
		
		if(condition.getCON_ONSETDATE() != null)
		{	
			try 
			{
				/******************** CON_ONSETDATE *********************************************************************************
				 * CON_ONSETDATE maps to Condition / onsetDateTime
				 ********************************************************************************************************************/
				dt.setValue(sdf.parse(condition.getCON_ONSETDATE()));
				c.setOnset(dt);
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		}		
		
		return c;
	}
}
