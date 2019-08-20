package com.campfhir.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
@Entity
public class Patient  implements java.io.Serializable 
{
	private static final long serialVersionUID = 1L;

	String PNT_IDENTIFIER;
	String PNT_GENDER;	
	String PNT_BIRTHDATE;	
	String PNT_MARITAL_STATUS_CODE;	
	String PNT_RACE;
	String PNT_ETHNICITY;
	String PNT_ADDRESS_EXT_LAT_VALUE;
	String PNT_ADDRESS_EXT_LONG_VALUE;
	
	List<Encounter> encounterList = new ArrayList<Encounter>();

	public String getPNT_IDENTIFIER() 
	{
		return this.PNT_IDENTIFIER;
	}

	public void setPNT_IDENTIFIER(String pNT_IDENTIFIER) 
	{
		this.PNT_IDENTIFIER = pNT_IDENTIFIER;
	}

	public String getPNT_GENDER() 
	{
		return this.PNT_GENDER;
	}

	public void setPNT_GENDER(String pNT_GENDER) 
	{
		this.PNT_GENDER = pNT_GENDER;
	}

	public String getPNT_BIRTHDATE() 
	{
		return this.PNT_BIRTHDATE;
	}

	public void setPNT_BIRTHDATE(String pNT_BIRTHDATE) 
	{
		this.PNT_BIRTHDATE = pNT_BIRTHDATE;
	}

	public String getPNT_MARITAL_STATUS_CODE() 
	{
		return this.PNT_MARITAL_STATUS_CODE;
	}

	public void setPNT_MARITAL_STATUS_CODE(String pNT_MARITAL_STATUS_CODE) 
	{
		this.PNT_MARITAL_STATUS_CODE = pNT_MARITAL_STATUS_CODE;
	}

	public String getPNT_RACE() 
	{
		return this.PNT_RACE;
	}

	public void setPNT_RACE(String pNT_RACE) 
	{
		this.PNT_RACE = pNT_RACE;
	}

	public String getPNT_ETHNICITY() 
	{
		return this.PNT_ETHNICITY;
	}

	public void setPNT_ETHNICITY(String pNT_ETHNICITY) 
	{
		this.PNT_ETHNICITY = pNT_ETHNICITY;
	}

	public String getPNT_ADDRESS_EXT_LAT_VALUE() 
	{
		return this.PNT_ADDRESS_EXT_LAT_VALUE;
	}

	public void setPNT_ADDRESS_EXT_LAT_VALUE(String pNT_ADDRESS_EXT_LAT_VALUE) 
	{
		this.PNT_ADDRESS_EXT_LAT_VALUE = pNT_ADDRESS_EXT_LAT_VALUE;
	}

	public String getPNT_ADDRESS_EXT_LONG_VALUE() 
	{
		return this.PNT_ADDRESS_EXT_LONG_VALUE;
	}

	public void setPNT_ADDRESS_EXT_LONG_VALUE(String pNT_ADDRESS_EXT_LONG_VALUE) 
	{
		this.PNT_ADDRESS_EXT_LONG_VALUE = pNT_ADDRESS_EXT_LONG_VALUE;
	}
	
	public List<Encounter> getEncounterList() 
	{
		return encounterList;
	}

	public void setEncounterList(List<Encounter> encounterList) 
	{
		this.encounterList = encounterList;
	}

	@Override
	public String toString() 
	{
		return "Condition: ";
	}
}