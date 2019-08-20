package com.campfhir.model;

import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
@Entity
public class Practitioner 
{
	String PRACT_IDENTIFIER;
	String PRACT_GENDER;

	public String getPRACT_IDENTIFIER() 
	{
		return PRACT_IDENTIFIER;
	}

	public void setPRACT_IDENTIFIER(String pRACT_IDENTIFIER) 
	{
		PRACT_IDENTIFIER = pRACT_IDENTIFIER;
	}

	public String getPRACT_GENDER() 
	{
		return PRACT_GENDER;
	}

	public void setPRACT_GENDER(String pRACT_GENDER) 
	{
		PRACT_GENDER = pRACT_GENDER;
	}
}