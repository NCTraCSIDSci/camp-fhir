package main.java.com.campfhir.model;

import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
@Entity
public class Procedure 
{
	String PCD_IDENTIFIER;
	String PCD_SUBJECT_REFERENCE;
	String PCD_CONTEXT_REFERENCE;
	String PCD_CODE_CODING_SYST;
	String PCD_CODE_CODING_CODE;
	String PCD_PERFORMED_PDT;
	String PCD_PERF_ACTOR_REF;
	String PCD_STATUS;
	


	public Procedure() {}

	public String getPCD_IDENTIFIER() 
	{
		return PCD_IDENTIFIER;
	}

	public void setPCD_IDENTIFIER(String pCD_IDENTIFIER) 
	{
		PCD_IDENTIFIER = pCD_IDENTIFIER;
	}
	 
	public String getPCD_SUBJECT_REFERENCE() 
	{
		return PCD_SUBJECT_REFERENCE;
	}

	public void setPCD_SUBJECT_REFERENCE(String pCD_SUBJECT_REFERENCE) 
	{
		PCD_SUBJECT_REFERENCE = pCD_SUBJECT_REFERENCE;
	}

	public String getPCD_CONTEXT_REFERENCE() 
	{
		return PCD_CONTEXT_REFERENCE;
	}

	public void setPCD_CONTEXT_REFERENCE(String pCD_CONTEXT_REFERENCE) 
	{
		PCD_CONTEXT_REFERENCE = pCD_CONTEXT_REFERENCE;
	}

	public String getPCD_CODE_CODING_SYST() 
	{
		return PCD_CODE_CODING_SYST;
	}

	public void setPCD_CODE_CODING_SYST(String pCD_CODE_CODING_SYST) 
	{
		PCD_CODE_CODING_SYST = pCD_CODE_CODING_SYST;
	}

	public String getPCD_CODE_CODING_CODE() 
	{
		return PCD_CODE_CODING_CODE;
	}

	public void setPCD_CODE_CODING_CODE(String pCD_CODE_CODING_CODE) 
	{
		PCD_CODE_CODING_CODE = pCD_CODE_CODING_CODE;
	}

	public String getPCD_PERFORMED_PDT() 
	{
		return PCD_PERFORMED_PDT;
	}

	public void setPCD_PERFORMED_PDT(String pCD_PERFORMED_PDT) 
	{
		PCD_PERFORMED_PDT = pCD_PERFORMED_PDT;
	}
	
	public String getPCD_PERF_ACTOR_REF() 
	{
		return PCD_PERF_ACTOR_REF;
	}

	public void setPCD_PERF_ACTOR_REF(String pCD_PERF_ACTOR_REF) 
	{
		PCD_PERF_ACTOR_REF = pCD_PERF_ACTOR_REF;
	}
	
	public String getPCD_STATUS() 
	{
		return PCD_STATUS;
	}

	public void setPCD_STATUS(String pCD_STATUS) 
	{
		PCD_STATUS = pCD_STATUS;
	}

	@Override
	public String toString() 
	{
		return "Condition: " ;
	}
}