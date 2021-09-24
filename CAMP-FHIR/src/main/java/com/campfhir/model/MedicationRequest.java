package main.java.com.campfhir.model;

import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
@Entity
public class MedicationRequest 
{
	String MED_IDENTIFIER;
	String MED_SUBJECT_REFERENCE;
	String MED_CONTEXT_REFERENCE;
	String MED_MEDREF_REFERENCE;	
	String MED_MEDCODCON_CODING_CODE;
	String MED_MEDCODCON_CODING_SYS;
	String MED_MEDCODCON_CODING_DISPLAY;	
	String MED_AUTHORED_ON;
	String MED_DISPREQ_PERIOD_START;
	String MED_DISPREQ_PERIOD_END;
	String MED_REQ_AGENT_REFERENCE;
	String MED_INTENT_CODE;
	String MED_CAT_CODING_SYS;
	String MED_CAT_CODING_CODE;
	String MED_CAT_CODING_DISPLAY;
	String MED_DOSINSTX_DOSEQUANT_VAL;
	String MED_DOSINSTX_DOSEQUANT_UNIT;
	String MED_DISPREQ_QUANT;
	String MED_DISPREQ_NUMREPS;
	String MED_DISPREQ_EXPSUPP;
	String MED_DOSINSTX_TEXT;
	String MED_DOSINSTX_ASNDBOOL;
	String MED_DOSINSTX_ROUTE;
	String MED_SUBSTITU_ALLOWED;
	String MED_STATUS;

	public MedicationRequest() {}	

	public String getMED_IDENTIFIER() 
	{
		return MED_IDENTIFIER;
	}

	public void setMED_IDENTIFIER(String mED_IDENTIFIER) 
	{
		MED_IDENTIFIER = mED_IDENTIFIER;
	}

	public String getMED_CONTEXT_REFERENCE() 
	{
		return MED_CONTEXT_REFERENCE;
	}

	public void setMED_CONTEXT_REFERENCE(String mED_CONTEXT_REFERENCE) 
	{
		MED_CONTEXT_REFERENCE = mED_CONTEXT_REFERENCE;
	}

	public String getMED_SUBJECT_REFERENCE() 
	{
		return MED_SUBJECT_REFERENCE;
	}

	public void setMED_SUBJECT_REFERENCE(String mED_SUBJECT_REFERENCE) 
	{
		MED_SUBJECT_REFERENCE = mED_SUBJECT_REFERENCE;
	}

	public String getMED_MEDREF_REFERENCE() 
	{
		return MED_MEDREF_REFERENCE;
	}

	public void setMED_MEDREF_REFERENCE(String mED_MEDREF_REFERENCE) 
	{
		MED_MEDREF_REFERENCE = mED_MEDREF_REFERENCE;
	}
	
	public String getMED_MEDCODCON_CODING_CODE() 
	{
		return MED_MEDCODCON_CODING_CODE;
	}

	public void setMED_MEDCODCON_CODING_CODE(String mED_MEDCODCON_CODING_CODE) 
	{
		MED_MEDCODCON_CODING_CODE = mED_MEDCODCON_CODING_CODE;
	}

	public String getMED_MEDCODCON_CODING_SYS() 
	{
		return MED_MEDCODCON_CODING_SYS;
	}

	public void setMED_MEDCODCON_CODING_SYS(String mED_MEDCODCON_CODING_SYS) 
	{
		MED_MEDCODCON_CODING_SYS = mED_MEDCODCON_CODING_SYS;
	}

	public String getMED_MEDCODCON_CODING_DISPLAY() 
	{
		return MED_MEDCODCON_CODING_DISPLAY;
	}

	public void setMED_MEDCODCON_CODING_DISPLAY(String mED_MEDCODCON_CODING_DISPLAY) 
	{
		MED_MEDCODCON_CODING_DISPLAY = mED_MEDCODCON_CODING_DISPLAY;
	}

	public String getMED_AUTHORED_ON() 
	{
		return MED_AUTHORED_ON;
	}

	public void setMED_AUTHORED_ON(String mED_AUTHORED_ON) 
	{
		MED_AUTHORED_ON = mED_AUTHORED_ON;
	}

	public String getMED_DISPREQ_PERIOD_START() 
	{
		return MED_DISPREQ_PERIOD_START;
	}

	public void setMED_DISPREQ_PERIOD_START(String mED_DISPREQ_PERIOD_START) 
	{
		MED_DISPREQ_PERIOD_START = mED_DISPREQ_PERIOD_START;
	}

	public String getMED_DISPREQ_PERIOD_END() 
	{
		return MED_DISPREQ_PERIOD_END;
	}

	public void setMED_DISPREQ_PERIOD_END(String mED_DISPREQ_PERIOD_END) 
	{
		MED_DISPREQ_PERIOD_END = mED_DISPREQ_PERIOD_END;
	}

	public String getMED_REQ_AGENT_REFERENCE() 
	{
		return MED_REQ_AGENT_REFERENCE;
	}

	public void setMED_REQ_AGENT_REFERENCE(String mED_REQ_AGENT_REFERENCE) 
	{
		MED_REQ_AGENT_REFERENCE = mED_REQ_AGENT_REFERENCE;
	}

	public String getMED_INTENT_CODE() 
	{
		return MED_INTENT_CODE;
	}

	public void setMED_INTENT_CODE(String mED_INTENT_CODE) 
	{
		MED_INTENT_CODE = mED_INTENT_CODE;
	}

	public String getMED_CAT_CODING_SYS() 
	{
		return MED_CAT_CODING_SYS;
	}

	public void setMED_CAT_CODING_SYS(String mED_CAT_CODING_SYS) 
	{
		MED_CAT_CODING_SYS = mED_CAT_CODING_SYS;
	}

	public String getMED_CAT_CODING_CODE() 
	{
		return MED_CAT_CODING_CODE;
	}

	public void setMED_CAT_CODING_CODE(String mED_CAT_CODING_CODE) 
	{
		MED_CAT_CODING_CODE = mED_CAT_CODING_CODE;
	}

	public String getMED_DOSINSTX_DOSEQUANT_UNIT() 
	{
		return MED_DOSINSTX_DOSEQUANT_UNIT;
	}

	public void setMED_DOSINSTX_DOSEQUANT_UNIT(String mED_DOSINSTX_DOSEQUANT_UNIT) 
	{
		MED_DOSINSTX_DOSEQUANT_UNIT = mED_DOSINSTX_DOSEQUANT_UNIT;
	}

	public String getMED_DISPREQ_QUANT() 
	{
		return MED_DISPREQ_QUANT;
	}

	public void setMED_DISPREQ_QUANT(String mED_DISPREQ_QUANT) 
	{
		MED_DISPREQ_QUANT = mED_DISPREQ_QUANT;
	}

	public String getMED_DISPREQ_NUMREPS() 
	{
		return MED_DISPREQ_NUMREPS;
	}

	public void setMED_DISPREQ_NUMREPS(String mED_DISPREQ_NUMREPS) 
	{
		MED_DISPREQ_NUMREPS = mED_DISPREQ_NUMREPS;
	}

	public String getMED_DISPREQ_EXPSUPP() 
	{
		return MED_DISPREQ_EXPSUPP;
	}

	public void setMED_DISPREQ_EXPSUPP(String mED_DISPREQ_EXPSUPP) 
	{
		MED_DISPREQ_EXPSUPP = mED_DISPREQ_EXPSUPP;
	}

	public String getMED_DOSINSTX_TEXT() 
	{
		return MED_DOSINSTX_TEXT;
	}

	public void setMED_DOSINSTX_TEXT(String mED_DOSINSTX_TEXT) 
	{
		MED_DOSINSTX_TEXT = mED_DOSINSTX_TEXT;
	}

	public String getMED_DOSINSTX_ASNDBOOL() 
	{
		return MED_DOSINSTX_ASNDBOOL;
	}

	public void setMED_DOSINSTX_ASNDBOOL(String mED_DOSINSTX_ASNDBOOL) 
	{
		MED_DOSINSTX_ASNDBOOL = mED_DOSINSTX_ASNDBOOL;
	}

	public String getMED_DOSINSTX_ROUTE() 
	{
		return MED_DOSINSTX_ROUTE;
	}

	public void setMED_DOSINSTX_ROUTE(String mED_DOSINSTX_ROUTE) 
	{
		MED_DOSINSTX_ROUTE = mED_DOSINSTX_ROUTE;
	}

	public String getMED_SUBSTITU_ALLOWED() 
	{
		return MED_SUBSTITU_ALLOWED;
	}

	public void setMED_SUBSTITU_ALLOWED(String mED_SUBSTITU_ALLOWED) 
	{
		MED_SUBSTITU_ALLOWED = mED_SUBSTITU_ALLOWED;
	}
	
	

	public String getMED_CAT_CODING_DISPLAY() {
		return MED_CAT_CODING_DISPLAY;
	}

	public void setMED_CAT_CODING_DISPLAY(String mED_CAT_CODING_DISPLAY) {
		MED_CAT_CODING_DISPLAY = mED_CAT_CODING_DISPLAY;
	}

	public String getMED_DOSINSTX_DOSEQUANT_VAL() {
		return MED_DOSINSTX_DOSEQUANT_VAL;
	}

	public void setMED_DOSINSTX_DOSEQUANT_VAL(String mED_DOSINSTX_DOSEQUANT_VAL) {
		MED_DOSINSTX_DOSEQUANT_VAL = mED_DOSINSTX_DOSEQUANT_VAL;
	}
	
	public String getMED_STATUS() 
	{
		return MED_STATUS;
	}

	public void setMED_STATUS(String mED_STATUS) 
	{
		MED_STATUS = mED_STATUS;
	}

	@Override
	public String toString() 
	{
		return "Condition: ";
	}
}