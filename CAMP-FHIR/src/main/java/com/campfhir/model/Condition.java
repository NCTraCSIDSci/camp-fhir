package com.campfhir.model;

import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/

@Entity
public class Condition 
{
	String CON_IDENTIFIER;
	String CON_SUBJECT_REFERENCE;
	String CON_CONTEXT_REFERENCE;
	String CON_ASSERTER_REFERENCE;
	String CON_CODE_CODING_SYST;
	String CON_CODE_CODING_CODE;
	String CON_CATEGORY_CODING_SYST;
	String CON_CATEGORY_CODING_CODE;
	String CON_ASSERT_DATE;
	String CON_CLINSTATUS;
	String CON_ABATEDATE;
	String CON_ONSETDATE;
	
	public String getCON_IDENTIFIER() 
	{
		return CON_IDENTIFIER;
	}

	public void setCON_IDENTIFIER(String CON_IDENTIFIER) 
	{
		this.CON_IDENTIFIER = CON_IDENTIFIER;
	}

	public String getCON_SUBJECT_REFERENCE() 
	{
		return CON_SUBJECT_REFERENCE;
	}

	public void setCON_SUBJECT_REFERENCE(String CON_SUBJECT_REFERENCE) 
	{
		this.CON_SUBJECT_REFERENCE = CON_SUBJECT_REFERENCE;
	}

	public String getCON_CONTEXT_REFERENCE() 
	{
		return CON_CONTEXT_REFERENCE;
	}

	public void setCON_CONTEXT_REFERENCE(String CON_CONTEXT_REFERENCE) 
	{
		this.CON_CONTEXT_REFERENCE = CON_CONTEXT_REFERENCE;
	}
	
	public String getCON_CODE_CODING_SYST() 
	{
		return CON_CODE_CODING_SYST;
	}

	public void setCON_CODE_CODING_SYST(String CON_CODE_CODING_SYST) 
	{
		this.CON_CODE_CODING_SYST = CON_CODE_CODING_SYST;
	}
	
	public String getCON_CODE_CODING_CODE() 
	{
		return CON_CODE_CODING_CODE;
	}

	public void setCON_CODE_CODING_CODE(String CON_CODE_CODING_CODE) 
	{
		this.CON_CODE_CODING_CODE = CON_CODE_CODING_CODE;
	}	
	
	public String getCON_CATEGORY_CODING_SYST() 
	{
		return CON_CATEGORY_CODING_SYST;
	}

	public void setCON_CATEGORY_CODING_SYST(String CON_CATEGORY_CODING_SYST) 
	{
		this.CON_CATEGORY_CODING_SYST = CON_CATEGORY_CODING_SYST;
	}
	
	public String getCON_CATEGORY_CODING_CODE() 
	{
		return CON_CATEGORY_CODING_CODE;
	}

	public void setCON_CATEGORY_CODING_CODE(String CON_CATEGORY_CODING_CODE) 
	{
		this.CON_CATEGORY_CODING_CODE = CON_CATEGORY_CODING_CODE;
	}
	
	public String getCON_ASSERT_DATE() 
	{
		return CON_ASSERT_DATE;
	}

	public void setCON_ASSERT_DATE(String CON_ASSERT_DATE) 
	{
		this.CON_ASSERT_DATE = CON_ASSERT_DATE;
	}
	
	public String getCON_ASSERTER_REFERENCE() 
	{
		return CON_ASSERTER_REFERENCE;
	}

	public void setCON_ASSERTER_REFERENCE(String cON_ASSERTER_REFERENCE) 
	{
		CON_ASSERTER_REFERENCE = cON_ASSERTER_REFERENCE;
	}

	public String getCON_CLINSTATUS() 
	{
		return CON_CLINSTATUS;
	}

	public void setCON_CLINSTATUS(String cON_CLINSTATUS) 
	{
		CON_CLINSTATUS = cON_CLINSTATUS;
	}

	public String getCON_ABATEDATE() 
	{
		return CON_ABATEDATE;
	}

	public void setCON_ABATEDATE(String cON_ABATEDATE) 
	{
		CON_ABATEDATE = cON_ABATEDATE;
	}

	public String getCON_ONSETDATE() 
	{
		return CON_ONSETDATE;
	}

	public void setCON_ONSETDATE(String cON_ONSETDATE) 
	{
		CON_ONSETDATE = cON_ONSETDATE;
	}

	@Override
	public String toString() {
		return "Condition: " 
				+ this.CON_IDENTIFIER 
				+ ", " + this.CON_SUBJECT_REFERENCE 
				+ ", " + this.CON_CONTEXT_REFERENCE;
	}
}