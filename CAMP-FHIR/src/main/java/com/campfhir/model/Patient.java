package main.java.com.campfhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
@Entity
public class Patient  implements java.io.Serializable 
{
	private static final long serialVersionUID = 1L;
	
	String PNT_IDENTIFIER;
	String PNT_ACTIVE;
	String PNT_NAME;
	String PNT_TELECOM;
	String PNT_GENDER;
	String PNT_BIRTHDATE;	
	String PNT_DECEASEDBOOLEAN;
	String PNT_DECEASEDDATETIME;
	String PNT_ADDRESS;
	String PNT_MARITAL_STATUS_CODE;	
	String PNT_MULTIPLE_BIRTH_BOOLEAN;
	String PNT_RACE;
	String PNT_RACE_DISP;
	String PNT_ETHNICITY;
	String PNT_ETHNICITY_DISP;
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
	
	public String getPNT_ACTIVE() {
		return this.PNT_ACTIVE;
	}
	
	public void setPNT_ACTIVE(String pNT_ACTIVE) {
		this.PNT_ACTIVE = pNT_ACTIVE;
	}
	
	public String getPNT_NAME() {
		return this.PNT_NAME;
	}

	public void setPNT_NAME(String pNT_NAME) {
		this.PNT_NAME = pNT_NAME;
	}

	public String getPNT_TELECOM() {
		return this.PNT_TELECOM;
	}

	public void setPNT_TELECOM(String pNT_TELECOM) {
		this.PNT_TELECOM = pNT_TELECOM;
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
	public String getPNT_DECEASEDBOOLEAN() {
		return this.PNT_DECEASEDBOOLEAN;
	}

	public void setPNT_DECEASEDBOOLEAN(String pNT_DECEASEDBOOLEAN) {
		this.PNT_DECEASEDBOOLEAN = pNT_DECEASEDBOOLEAN;
	}
	
	public String getPNT_DECEASEDDATETIME() {
		return this.PNT_DECEASEDDATETIME;
	}

	public void setPNT_DECEASEDDATETIME(String pNT_DECEASEDDATETIME) {
		this.PNT_DECEASEDDATETIME = pNT_DECEASEDDATETIME;
	}
	
	public String getPNT_ADDRESS() {
		return this.PNT_ADDRESS;
	}

	public void setPNT_ADDRESS(String pNT_ADDRESS) {
		this.PNT_ADDRESS = pNT_ADDRESS;
	}
	
	public String getPNT_MARITAL_STATUS_CODE() 
	{
		return this.PNT_MARITAL_STATUS_CODE;
	}

	public void setPNT_MARITAL_STATUS_CODE(String pNT_MARITAL_STATUS_CODE) 
	{
		this.PNT_MARITAL_STATUS_CODE = pNT_MARITAL_STATUS_CODE;
	}
	
	public String getPNT_MULTIPLE_BIRTH_BOOLEAN() {
		return this.PNT_MULTIPLE_BIRTH_BOOLEAN;
	}

	public void setPNT_MULTIPLE_BIRTH_BOOLEAN(String pNT_MULTIPLE_BIRTH_BOOLEAN) {
		this.PNT_MULTIPLE_BIRTH_BOOLEAN = pNT_MULTIPLE_BIRTH_BOOLEAN;
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
	
	public String getPNT_RACE_DISP() 
	{
		return PNT_RACE_DISP;
	}

	public void setPNT_RACE_DISP(String pNT_RACE_DISP) 
	{
		PNT_RACE_DISP = pNT_RACE_DISP;
	}

	public String getPNT_ETHNICITY_DISP() 
	{
		return PNT_ETHNICITY_DISP;
	}

	public void setPNT_ETHNICITY_DISP(String pNT_ETHNICITY_DISP) 
	{
		PNT_ETHNICITY_DISP = pNT_ETHNICITY_DISP;
	}

	@Override
	public String toString() 
	{
		return "Patient: ";
	}
}