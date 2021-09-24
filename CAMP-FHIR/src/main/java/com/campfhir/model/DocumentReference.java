package main.java.com.campfhir.model;

import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/

@Entity
public class DocumentReference 
{
	String DOC_SUBJECT_REFERENCE;
	String DOC_ID;
	String DOC_DATE;
	String DOC_START_DATE;
	String DOC_END_DATE;
	String DOC_TYPE_CODE;
	String DOC_TYPE_SYSTEM;
	String DOC_TYPE_DISPLAY;
	String DOC_TYPE;
	String DOC_CATEGORY;
	String DOC_STATUS;
	String DOC_CONTENT_TYPE;
	String DOC_CONTENT_DATA;
	


	public String getDOC_SUBJECT_REFERENCE() 
	{
		return DOC_SUBJECT_REFERENCE;
	}

	public void setDOC_SUBJECT_REFERENCE(String dOC_SUBJECT_REFERENCE) 
	{
		this.DOC_SUBJECT_REFERENCE = dOC_SUBJECT_REFERENCE;
	}

	public String getDOC_ID() 
	{
		return DOC_ID;
	}

	public void setDOC_ID(String dOC_ID) 
	{
		this.DOC_ID = dOC_ID;
	}

	public String getDOC_DATE() 
	{
		return DOC_DATE;
	}

	public void setDOC_DATE(String dOC_DATE) 
	{
		this.DOC_DATE = dOC_DATE;
	}

	public String getDOC_START_DATE() 
	{
		return DOC_START_DATE;
	}

	public void setDOC_START_DATE(String dOC_START_DATE) 
	{
		this.DOC_START_DATE = dOC_START_DATE;
	}

	public String getDOC_END_DATE() 
	{
		return DOC_END_DATE;
	}

	public void setDOC_END_DATE(String dOC_END_DATE) 
	{
		this.DOC_END_DATE = dOC_END_DATE;
	}

	public String getDOC_TYPE_CODE() 
	{
		return DOC_TYPE_CODE;
	}

	public void setDOC_TYPE_CODE(String dOC_TYPE_CODE) 
	{
		this.DOC_TYPE_CODE = dOC_TYPE_CODE;
	}

	public String getDOC_TYPE_SYSTEM() 
	{
		return DOC_TYPE_SYSTEM;
	}

	public void setDOC_TYPE_SYSTEM(String dOC_TYPE_SYSTEM) 
	{
		this.DOC_TYPE_SYSTEM = dOC_TYPE_SYSTEM;
	}

	public String getDOC_TYPE_DISPLAY() 
	{
		return DOC_TYPE_DISPLAY;
	}

	public void setDOC_TYPE_DISPLAY(String dOC_TYPE_DISPLAY) 
	{
		this.DOC_TYPE_DISPLAY = dOC_TYPE_DISPLAY;
	}

	public String getDOC_TYPE() 
	{
		return DOC_TYPE;
	}

	public void setDOC_TYPE(String dOC_TYPE) 
	{
		this.DOC_TYPE = dOC_TYPE;
	}

	public String getDOC_CATEGORY() 
	{
		return DOC_CATEGORY;
	}

	public void setDOC_CATEGORY(String dOC_CATEGORY) 
	{
		this.DOC_CATEGORY = dOC_CATEGORY;
	}

	public String getDOC_STATUS() 
	{
		return DOC_STATUS;
	}

	public void setDOC_STATUS(String dOC_STATUS) 
	{
		this.DOC_STATUS = dOC_STATUS;
	}

	public String getDOC_CONTENT_TYPE() 
	{
		return DOC_CONTENT_TYPE;
	}

	public void setDOC_CONTENT_TYPE(String dOC_CONTENT_TYPE) 
	{
		this.DOC_CONTENT_TYPE = dOC_CONTENT_TYPE;
	}

	public String getDOC_CONTENT_DATA() 
	{
		return DOC_CONTENT_DATA;
	}

	public void setDOC_CONTENT_DATA(String dOC_CONTENT_DATA) 
	{
		this.DOC_CONTENT_DATA = dOC_CONTENT_DATA;
	}
}