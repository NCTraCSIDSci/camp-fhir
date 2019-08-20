package com.campfhir.model;

import javax.persistence.MappedSuperclass;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
@MappedSuperclass
public class Observation 
{
	String OBS_IDENTIFIER;
	String OBS_STATUS;
	String OBS_SUBJECT_REFERENCE;
	String OBS_CONTEXT_REFERENCE;
	String OBS_CATEGORY_SYST;
	String OBS_CATEGORY_CODE;
	String OBS_CATEGORY_DISPLAY;
	String OBS_CODE_CODING_SYST;
	String OBS_CODE_CODING_CODE;
	String OBS_CODE_CODING_DISPLAY;
	String OBS_VALUEQUANTITY_VALUE;
	String OBS_VALUEQUANTITY_CODE;
	String OBS_VALUEQUANTITY_COMPARATOR;
	String OBS_VALUESTRING;
	String OBS_EFFECTIVEDATETIME;
	String OBS_ISSUED;
	String OBS_REFRANGE_LOW;
	String OBS_REFRANGE_HIGH;
	String OBS_INTERPRETATION_CODE;
	String OBS_INTERPRETATION_SYST;
	
	public Observation() {}
	
	public String getOBS_IDENTIFIER()  
	{
		return OBS_IDENTIFIER;
	}

	public void setOBS_IDENTIFIER(String oBS_IDENTIFIER) 
	{
		OBS_IDENTIFIER = oBS_IDENTIFIER;
	}
	
	public String getOBS_STATUS()  
	{
		return OBS_STATUS;
	}

	public void setOBS_STATUS(String oBS_STATUS) 
	{
		OBS_STATUS = oBS_STATUS;
	}

	public String getOBS_SUBJECT_REFERENCE() 
	{
		return OBS_SUBJECT_REFERENCE;
	}

	public void setOBS_SUBJECT_REFERENCE(String oBS_SUBJECT_REFERENCE) 
	{
		OBS_SUBJECT_REFERENCE = oBS_SUBJECT_REFERENCE;
	}

	public String getOBS_CONTEXT_REFERENCE() 
	{
		return OBS_CONTEXT_REFERENCE;
	}

	public void setOBS_CONTEXT_REFERENCE(String oBS_CONTEXT_REFERENCE) 
	{
		OBS_CONTEXT_REFERENCE = oBS_CONTEXT_REFERENCE;
	}

	public String getOBS_CATEGORY_SYST() 
	{
		return OBS_CATEGORY_SYST;
	}

	public void setOBS_CATEGORY_SYST(String oBS_CATEGORY_SYST) 
	{
		OBS_CATEGORY_SYST = oBS_CATEGORY_SYST;
	}

	public String getOBS_CATEGORY_CODE() 
	{
		return OBS_CATEGORY_CODE;
	}

	public void setOBS_CATEGORY_CODE(String oBS_CATEGORY_CODE) 
	{
		OBS_CATEGORY_CODE = oBS_CATEGORY_CODE;
	}

	public String getOBS_CATEGORY_DISPLAY() 
	{
		return OBS_CATEGORY_DISPLAY;
	}

	public void setOBS_CATEGORY_DISPLAY(String oBS_CATEGORY_DISPLAY) 
	{
		OBS_CATEGORY_DISPLAY = oBS_CATEGORY_DISPLAY;
	}

	public String getOBS_CODE_CODING_SYST() 
	{
		return OBS_CODE_CODING_SYST;
	}

	public void setOBS_CODE_CODING_SYST(String oBS_CODE_CODING_SYST) 
	{
		OBS_CODE_CODING_SYST = oBS_CODE_CODING_SYST;
	}

	public String getOBS_CODE_CODING_CODE() 
	{
		return OBS_CODE_CODING_CODE;
	}

	public void setOBS_CODE_CODING_CODE(String oBS_CODE_CODING_CODE) 
	{
		OBS_CODE_CODING_CODE = oBS_CODE_CODING_CODE;
	}

	public String getOBS_CODE_CODING_DISPLAY() 
	{
		return OBS_CODE_CODING_DISPLAY;
	}

	public void setOBS_CODE_CODING_DISPLAY(String oBS_CODE_CODING_DISPLAY) 
	{
		OBS_CODE_CODING_DISPLAY = oBS_CODE_CODING_DISPLAY;
	}

	public String getOBS_VALUEQUANTITY_COMPARATOR() 
	{
		return OBS_VALUEQUANTITY_COMPARATOR;
	}

	public void setOBS_VALUEQUANTITY_COMPARATOR(String oBS_VALUEQUANTITY_COMPARATOR) 
	{
		OBS_VALUEQUANTITY_COMPARATOR = oBS_VALUEQUANTITY_COMPARATOR;
	}

	public String getOBS_VALUEQUANTITY_CODE() 
	{
		return OBS_VALUEQUANTITY_CODE;
	}

	public void setOBS_VALUEQUANTITY_CODE(String oBS_VALUEQUANTITY_CODE) 
	{
		OBS_VALUEQUANTITY_CODE = oBS_VALUEQUANTITY_CODE;
	}

	public String getOBS_VALUESTRING() 
	{
		return OBS_VALUESTRING;
	}

	public void setOBS_VALUESTRING(String oBS_VALUESTRING) 
	{
		OBS_VALUESTRING = oBS_VALUESTRING;
	}

	public String getOBS_VALUEQUANTITY_VALUE() 
	{
		return OBS_VALUEQUANTITY_VALUE;
	}

	public void setOBS_VALUEQUANTITY_VALUE(String oBS_VALUEQUANTITY_VALUE) 
	{
		OBS_VALUEQUANTITY_VALUE = oBS_VALUEQUANTITY_VALUE;
	}

	public String getOBS_EFFECTIVEDATETIME() 
	{
		return OBS_EFFECTIVEDATETIME;
	}

	public void setOBS_EFFECTIVEDATETIME(String oBS_EFFECTIVEDATETIME) 
	{
		OBS_EFFECTIVEDATETIME = oBS_EFFECTIVEDATETIME;
	}

	public String getOBS_ISSUED() 
	{
		return OBS_ISSUED;
	}

	public void setOBS_ISSUED(String oBS_ISSUED) 
	{
		OBS_ISSUED = oBS_ISSUED;
	}

	public String getOBS_REFRANGE_LOW() 
	{
		return OBS_REFRANGE_LOW;
	}

	public void setOBS_REFRANGE_LOW(String oBS_REFRANGE_LOW) 
	{
		OBS_REFRANGE_LOW = oBS_REFRANGE_LOW;
	}

	public String getOBS_REFRANGE_HIGH() 
	{
		return OBS_REFRANGE_HIGH;
	}

	public void setOBS_REFRANGE_HIGH(String oBS_REFRANGE_HIGH) 
	{
		OBS_REFRANGE_HIGH = oBS_REFRANGE_HIGH;
	}

	public String getOBS_INTERPRETATION_CODE() 
	{
		return OBS_INTERPRETATION_CODE;
	}

	public void setOBS_INTERPRETATION_CODE(String oBS_INTERPRETATION_CODE) 
	{
		OBS_INTERPRETATION_CODE = oBS_INTERPRETATION_CODE;
	}

	public String getOBS_INTERPRETATION_SYST() 
	{
		return OBS_INTERPRETATION_SYST;
	}

	public void setOBS_INTERPRETATION_SYST(String oBS_INTERPRETATION_SYST) 
	{
		OBS_INTERPRETATION_SYST = oBS_INTERPRETATION_SYST;
	}

	@Override
	public String toString() 
	{
		return "Observation: ";
	}
}