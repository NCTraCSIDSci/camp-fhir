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
import org.hl7.fhir.dstu3.model.Condition.ConditionClinicalStatus;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.exceptions.FHIRException;

import com.campfhir.model.Condition;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ConditionConversion 
{
	public Bundle Conditions(List<Condition> conditions) throws ParseException, IOException
	{
		Bundle bundle = new Bundle();

		for (Condition condition : conditions) 
		{
			org.hl7.fhir.dstu3.model.Condition c = new org.hl7.fhir.dstu3.model.Condition();				
			
			/******************** CON_IDENTIFIER ********************************************************************************
			 * CON_IDENTIFIER maps to Condition / identifier
			 ********************************************************************************************************************/
			if(condition.getCON_IDENTIFIER() != null)
			{
				c.setId(condition.getCON_IDENTIFIER());
			}
			
			/******************** CON_SUBJECT_REFERENCE *************************************************************************
			 * CON_SUBJECT_REFERENCE maps to Condition / subject / reference
			 ********************************************************************************************************************/
			Reference subject = new Reference();
			subject.setReference(condition.getCON_SUBJECT_REFERENCE());			
			c.setSubject(subject);
			
			/******************** CON_CONTEXT_REFERENCE *************************************************************************
			 * CON_CONTEXT_REFERENCE maps to Condition / context / reference
			 ********************************************************************************************************************/
			Reference con = new Reference();
			con.setReference(condition.getCON_CONTEXT_REFERENCE());
			c.setContext(con);
			
			/******************** CON_ASSERTER_REFERENCE ************************************************************************
			 * CON_ASSERTER_REFERENCE maps to Condition / asserter / reference
			 ********************************************************************************************************************/
			Reference ass = new Reference();
			ass.setReference(condition.getCON_ASSERTER_REFERENCE());
			c.setAsserter(ass);
			
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
			Date date1;
			try 
			{
				/******************** CON_ASSERT_DATE *******************************************************************************
				 * CON_ASSERT_DATE maps to Condition / assertedDat
				 ********************************************************************************************************************/
				date1 = sdf.parse(condition.getCON_ASSERT_DATE());
				c.setAssertedDate(date1);
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
					c.setClinicalStatus(ConditionClinicalStatus.fromCode(condition.getCON_CLINSTATUS()));
				} 
				catch (FHIRException e) 
				{
					e.printStackTrace();
				}
			}
			
			if(condition.getCON_ABATEDATE() != null)
			{
				try 
				{
					Date date2;
					/******************** CON_ABATEDATE *********************************************************************************
					 * CON_ABATEDATE maps to Condition / abatementDateTime
					 ********************************************************************************************************************/
					date2 = sdf.parse(condition.getCON_ABATEDATE());
					c.setAbatement(new DateTimeType().setValue(date2));
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
					Date date3;
					/******************** CON_ONSETDATE *********************************************************************************
					 * CON_ONSETDATE maps to Condition / onsetDateTime
					 ********************************************************************************************************************/
					date3 = sdf.parse(condition.getCON_ONSETDATE());
					c.setOnset(new DateTimeType().setValue(date3));
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}
			}

			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/condition.html")
			   .setResource(c);			
		}
		
		return bundle;
	}
}
