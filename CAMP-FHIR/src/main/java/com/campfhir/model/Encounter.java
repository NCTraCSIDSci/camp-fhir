package main.java.com.campfhir.model;

import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
@Entity
public class Encounter 
{
	String ENC_IDENTIFIER;
	String ENC_SERVICE_TYPE_CODEABLECONCEPT_CODING;
	String ENC_SERVICE_TYPE_CODEABLECONCEPT_TEXT;
	String ENC_SUBJECT_REFERENCE;
	String ENC_PARTICIPANT_INDIV_REF;
	String ENC_CLASS_SYST;
	String ENC_CLASS_CODE;
	String ENC_CLASS_DISPLAY;
	String ENC_PERIOD_START;
	String ENC_PERIOD_END;
	String ENC_HOSP_DISDISP_CODING_CODE;
	String ENC_HOSP_DISDISP_CODING_SYST;
	String ENC_HOSP_DISDISP_TEXT;
	String ENC_HOSP_ADMSRC_CODING_CODE;
	String ENC_HOSP_ADMSRC_TEXT;
	String ENC_DIAGN_CON_REF;
	String ENC_DIAGN_ROLE_SYST;
	String ENC_DIAGN_ROLE_CODING_CODE;
	String ENC_DIAGN_RANK;
	String ENC_STATUS;

	public Encounter() {}
	
	public String getENC_IDENTIFIER() 
	{
		return this.ENC_IDENTIFIER;
	}

	public void setENC_IDENTIFIER(String eNC_IDENTIFIER) 
	{
		this.ENC_IDENTIFIER = eNC_IDENTIFIER;
	}
	
	public String getENC_SERVICE_TYPE_CODEABLECONCEPT_CODING() {
		return this.ENC_SERVICE_TYPE_CODEABLECONCEPT_CODING;
	}

	public void setENC_SERVICE_TYPE_CODEABLECONCEPT_CODING(String eNC_SERVICE_TYPE_CODEABLECONCEPT_CODING) {
		this.ENC_SERVICE_TYPE_CODEABLECONCEPT_CODING = eNC_SERVICE_TYPE_CODEABLECONCEPT_CODINGG;
	}

	public String getENC_SERVICE_TYPE_CODEABLECONCEPT_TEXT() {
		return this.ENC_SERVICE_TYPE_CODEABLECONCEPT_TEXT;
	}

	public void setENC_SERVICE_TYPE_CODEABLECONCEPT_TEXT(String eNC_SERVICE_TYPE_CODEABLECONCEPT_TEXT) {
		this.ENC_SERVICE_TYPE_CODEABLECONCEPT_CODING = eNC_SERVICE_TYPE_CODEABLECONCEPT_CODING;
	}


	public void setENC_SUBJECT_REFERENCE(String eNC_SUBJECT_REFERENCE) 
	{
		this.ENC_SUBJECT_REFERENCE = eNC_SUBJECT_REFERENCE;
	}

	public String getENC_CLASS_SYST() 
	{
		return this.ENC_CLASS_SYST;
	}

	public void setENC_CLASS_SYST(String eNC_CLASS_SYST) 
	{
		this.ENC_CLASS_SYST = eNC_CLASS_SYST;
	}

	public String getENC_CLASS_CODE() 
	{
		return this.ENC_CLASS_CODE;
	}

	public void setENC_CLASS_CODE(String eNC_CLASS_CODE) 
	{
		this.ENC_CLASS_CODE = eNC_CLASS_CODE;
	}

	public String getENC_CLASS_DISPLAY() 
	{
		return this.ENC_CLASS_DISPLAY;
	}

	public void setENC_CLASS_DISPLAY(String eNC_CLASS_DISPLAY) 
	{
		this.ENC_CLASS_DISPLAY = eNC_CLASS_DISPLAY;
	}

	public String getENC_PERIOD_START() 
	{
		return this.ENC_PERIOD_START;
	}

	public void setENC_PERIOD_START(String eNC_PERIOD_START) 
	{
		this.ENC_PERIOD_START = eNC_PERIOD_START;
	}

	public String getENC_PERIOD_END() 
	{
		return this.ENC_PERIOD_END;
	}

	public void setENC_PERIOD_END(String eNC_PERIOD_END) 
	{
		this.ENC_PERIOD_END = eNC_PERIOD_END;
	}

	public String getENC_HOSP_DISDISP_CODING_CODE() 
	{
		return this.ENC_HOSP_DISDISP_CODING_CODE;
	}

	public void setENC_HOSP_DISDISP_CODING_CODE(String eNC_HOSP_DISDISP_CODING_CODE) 
	{
		this.ENC_HOSP_DISDISP_CODING_CODE = eNC_HOSP_DISDISP_CODING_CODE;
	}

	public String getENC_HOSP_DISDISP_TEXT() 
	{
		return this.ENC_HOSP_DISDISP_TEXT;
	}

	public void setENC_HOSP_DISDISP_TEXT(String eNC_HOSP_DISDISP_TEXT) 
	{
		this.ENC_HOSP_DISDISP_TEXT = eNC_HOSP_DISDISP_TEXT;
	}
	
	public String getENC_PARTICIPANT_INDIV_REF() 
	{
		return this.ENC_PARTICIPANT_INDIV_REF;
	}

	public void setENC_PARTICIPANT_INDIV_REF(String eNC_PARTICIPANT_INDIV_REF) 
	{
		this.ENC_PARTICIPANT_INDIV_REF = eNC_PARTICIPANT_INDIV_REF;
	}

	public String getENC_HOSP_ADMSRC_CODING_CODE() 
	{
		return this.ENC_HOSP_ADMSRC_CODING_CODE;
	}

	public void setENC_HOSP_ADMSRC_CODING_CODE(String eNC_HOSP_ADMSRC_CODING_CODE) 
	{
		this.ENC_HOSP_ADMSRC_CODING_CODE = eNC_HOSP_ADMSRC_CODING_CODE;
	}

	public String getENC_HOSP_ADMSRC_TEXT() 
	{
		return this.ENC_HOSP_ADMSRC_TEXT;
	}

	public void setENC_HOSP_ADMSRC_TEXT(String eNC_HOSP_ADMSRC_TEXT) 
	{
		this.ENC_HOSP_ADMSRC_TEXT = eNC_HOSP_ADMSRC_TEXT;
	}

	public String getENC_DIAGN_CON_REF() 
	{
		return this.ENC_DIAGN_CON_REF;
	}

	public void setENC_DIAGN_CON_REF(String eNC_DIAGN_CON_REF) 
	{
		this.ENC_DIAGN_CON_REF = eNC_DIAGN_CON_REF;
	}

	public String getENC_DIAGN_ROLE_CODING_CODE() 
	{
		return this.ENC_DIAGN_ROLE_CODING_CODE;
	}

	public void setENC_DIAGN_ROLE_CODING_CODE(String eNC_DIAGN_ROLE_CODING_CODE) 
	{
		this.ENC_DIAGN_ROLE_CODING_CODE = eNC_DIAGN_ROLE_CODING_CODE;
	}

	public String getENC_DIAGN_RANK() 
	{
		return this.ENC_DIAGN_RANK;
	}

	public void setENC_DIAGN_RANK(String eNC_DIAGN_RANK) 
	{
		this.ENC_DIAGN_RANK = eNC_DIAGN_RANK;
	}
	
	public String getENC_HOSP_DISDISP_CODING_SYST() 
	{
		return this.ENC_HOSP_DISDISP_CODING_SYST;
	}

	public void setENC_HOSP_DISDISP_CODING_SYST(String eNC_HOSP_DISDISP_CODING_SYST) 
	{
		this.ENC_HOSP_DISDISP_CODING_SYST = eNC_HOSP_DISDISP_CODING_SYST;
	}
	
	public String getENC_DIAGN_ROLE_SYST() 
	{
		return this.ENC_DIAGN_ROLE_SYST;
	}

	public void setENC_DIAGN_ROLE_SYST(String eNC_DIAGN_ROLE_SYST) 
	{
		this.ENC_DIAGN_ROLE_SYST = eNC_DIAGN_ROLE_SYST;
	}
	
	public String getENC_STATUS() 
	{
		return this.ENC_STATUS;
	}

	public void setENC_STATUS(String eNC_STATUS)
	{
		this.ENC_STATUS = eNC_STATUS;
	}

	@Override
	public String toString() 
	{
		return "Condition: " ;
	}
}