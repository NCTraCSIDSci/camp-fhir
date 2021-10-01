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
	String PNT_NAME_HUMANNAME_USE;
	String PNT_NAME_HUMANNAME_TEXT;
	String PNT_NAME_HUMANNAME_FAMILY;
	String PNT_NAME_HUMANNAME_GIVEN;
	String PNT_NAME_HUMANNAME_PREFIX;
	String PNT_NAME_HUMANNAME_SUFFIX;
	String PNT_NAME_HUMANNAME_PERIOD;
	String PNT_TELECOM;
	String PNT_TELECOM_CONTACTPOINT_SYSTEM;
	String PNT_TELECOM_CONTACTPOINT_VALUE;
	String PNT_TELECOM_CONTACTPOINT_USE;
	String PNT_TELECOM_CONTACTPOINT_RANK;
	String PNT_TELECOM_CONTACTPOINT_PERIOD;
	String PNT_GENDER;
	String PNT_BIRTHDATE;	
	String PNT_DECEASEDBOOLEAN;
	String PNT_DECEASEDDATETIME;
	String PNT_ADDRESS;
	String PNT_ADDRESS_USE;
	String PNT_ADDRESS_TYPE;
	String PNT_ADDRESS_TEXT;
	String PNT_ADDRESS_LINE;
	String PNT_ADDRESS_CITY;
	String PNT_ADDRESS_DISTRICT;
	String PNT_ADDRESS_STATE;
	String PNT_ADDRESS_POSTAL_CODE;
	String PNT_ADDRESS_COUNTRY;
	String PNT_ADDRESS_PERIOD;
	String PNT_MARITAL_STATUS_CODE;	
	String PNT_MULTIPLE_BIRTH_BOOLEAN;
	String PNT_MULTIPLE_BIRTH_INTEGER;
	String PNT_PHOTO;
	String PNT_CONTACT;
	String PNT_CONTACT_RELATIONSHIP;
	String PNT_CONTACT_NAME;
	String PNT_CONTACT_TELECOM;
	String PNT_CONTACT_ADDRESS;
	String PNT_CONTACT_GENDER;
	String PNT_CONTACT_ORGANIZATION;
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
	
	public String getPNT_NAME_HUMANNAME_USE() {
		return this.PNT_NAME_HUMANNAME_USE;
	}

	public void setPNT_NAME_HUMANNAME_USE(String pNT_NAME_HUMANNAME_USE) {
		this.PNT_NAME_HUMANNAME_USE = pNT_NAME_HUMANNAME_USE;
	}

	public String getPNT_NAME_HUMANNAME_TEXT() {
		return this.PNT_NAME_HUMANNAME_TEXT;
	}

	public void setPNT_NAME_HUMANNAME_TEXT(String pNT_NAME_HUMANNAME_TEXT) {
		this.PNT_NAME_HUMANNAME_TEXT = pNT_NAME_HUMANNAME_TEXT;
	}

	public String getPNT_NAME_HUMANNAME_FAMILY() {
		return this.PNT_NAME_HUMANNAME_FAMILY;
	}

	public void setPNT_NAME_HUMANNAME_FAMILY(String pNT_NAME_HUMANNAME_FAMILY) {
		this.PNT_NAME_HUMANNAME_FAMILY = pNT_NAME_HUMANNAME_FAMILY;
	}

	public String getPNT_NAME_HUMANNAME_GIVEN() {
		return this.PNT_NAME_HUMANNAME_GIVEN;
	}

	public void setPNT_NAME_HUMANNAME_GIVEN(String pNT_NAME_HUMANNAME_GIVEN) {
		this.PNT_NAME_HUMANNAME_GIVEN = pNT_NAME_HUMANNAME_GIVEN;
	}

	public String getPNT_NAME_HUMANNAME_PREFIX() {
		return this.PNT_NAME_HUMANNAME_PREFIX;
	}

	public void setPNT_NAME_HUMANNAME_PREFIX(String pNT_NAME_HUMANNAME_PREFIX) {
		this.PNT_NAME_HUMANNAME_PREFIX = pNT_NAME_HUMANNAME_PREFIX;
	}

	public String getPNT_NAME_HUMANNAME_SUFFIX() {
		return this.PNT_NAME_HUMANNAME_SUFFIX;
	}

	public void setPNT_NAME_HUMANNAME_SUFFIX(String pNT_NAME_HUMANNAME_SUFFIX) {
		this.PNT_NAME_HUMANNAME_SUFFIX = pNT_NAME_HUMANNAME_SUFFIX;
	}

	public String getPNT_NAME_HUMANNAME_PERIOD() {
		return this.PNT_NAME_HUMANNAME_PERIOD;
	}

	public void setPNT_NAME_HUMANNAME_PERIOD(String pNT_NAME_HUMANNAME_PERIOD) {
		this.PNT_NAME_HUMANNAME_PERIOD = pNT_NAME_HUMANNAME_PERIOD;
	}

	public String getPNT_TELECOM() {
		return this.PNT_TELECOM;
	}

	public void setPNT_TELECOM(String pNT_TELECOM) {
		this.PNT_TELECOM = pNT_TELECOM;
	}
	
	public String getPNT_TELECOM_CONTACTPOINT_SYSTEM() {
		return this.PNT_TELECOM_CONTACTPOINT_SYSTEM;
	}

	public void setPNT_TELECOM_CONTACTPOINT_SYSTEM(String pNT_TELECOM_CONTACTPOINT_SYSTEM) {
		this.PNT_TELECOM_CONTACTPOINT_SYSTEM = pNT_TELECOM_CONTACTPOINT_SYSTEM;
	}
	
	public String getPNT_TELECOM_CONTACTPOINT_VALUE() {
		return this.PNT_TELECOM_CONTACTPOINT_VALUE;
	}

	public void setPNT_TELECOM_CONTACTPOINT_VALUE(String pNT_TELECOM_CONTACTPOINT_VALUE) {
		this.PNT_TELECOM_CONTACTPOINT_VALUE = pNT_TELECOM_CONTACTPOINT_VALUE;
	}

	public String getPNT_TELECOM_CONTACTPOINT_USE() {
		return this.PNT_TELECOM_CONTACTPOINT_USE;
	}

	public void setPNT_TELECOM_CONTACTPOINT_USE(String pNT_TELECOM_CONTACTPOINT_USE) {
		this.PNT_TELECOM_CONTACTPOINT_USE = pNT_TELECOM_CONTACTPOINT_USE;
	}

	public String getPNT_TELECOM_CONTACTPOINT_RANK() {
		return this.PNT_TELECOM_CONTACTPOINT_RANK;
	}

	public void setPNT_TELECOM_CONTACTPOINT_RANK(String pNT_TELECOM_CONTACTPOINT_RANK) {
		this.PNT_TELECOM_CONTACTPOINT_RANK = pNT_TELECOM_CONTACTPOINT_RANK;
	}

	public String getPNT_TELECOM_CONTACTPOINT_PERIOD() {
		return this.PNT_TELECOM_CONTACTPOINT_PERIOD;
	}

	public void setPNT_TELECOM_CONTACTPOINT_PERIOD(String pNT_TELECOM_CONTACTPOINT_PERIOD) {
		this.PNT_TELECOM_CONTACTPOINT_PERIOD = pNT_TELECOM_CONTACTPOINT_PERIOD;
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
	
	public String getPNT_ADDRESS_USE() {
		return this.PNT_ADDRESS_USE;
	}

	public void setPNT_ADDRESS_USE(String pNT_ADDRESS_USE) {
		this.PNT_ADDRESS_USE = pNT_ADDRESS_USE;
	}

	public String getPNT_ADDRESS_TYPE() {
		return this.PNT_ADDRESS_TYPE;
	}

	public void setPNT_ADDRESS_TYPE(String pNT_ADDRESS_TYPE) {
		this.PNT_ADDRESS_TYPE = pNT_ADDRESS_TYPE;
	}

	public String getPNT_ADDRESS_TEXT() {
		return this.PNT_ADDRESS_TEXT;
	}

	public void setPNT_ADDRESS_TEXT(String pNT_ADDRESS_TEXT) {
		this.PNT_ADDRESS_TEXT = pNT_ADDRESS_TEXT;
	}

	public String getPNT_ADDRESS_LINE() {
		return this.PNT_ADDRESS_LINE;
	}

	public void setPNT_ADDRESS_LINE(String pNT_ADDRESS_LINE) {
		this.PNT_ADDRESS_LINE = pNT_ADDRESS_LINE;
	}

	public String getPNT_ADDRESS_CITY() {
		return this.PNT_ADDRESS_CITY;
	}

	public void setPNT_ADDRESS_CITY(String pNT_ADDRESS_CITY) {
		this.PNT_ADDRESS_CITY = pNT_ADDRESS_CITY;
	}

	public String getPNT_ADDRESS_DISTRICT() {
		return this.PNT_ADDRESS_DISTRICT;
	}

	public void setPNT_ADDRESS_DISTRICT(String pNT_ADDRESS_DISTRICT) {
		this.PNT_ADDRESS_DISTRICT = pNT_ADDRESS_DISTRICT;
	}

	public String getPNT_ADDRESS_STATE() {
		return this.PNT_ADDRESS_STATE;
	}

	public void setPNT_ADDRESS_STATE(String pNT_ADDRESS_STATE) {
		this.PNT_ADDRESS_STATE = pNT_ADDRESS_STATE;
	}

	public String getPNT_ADDRESS_POSTAL_CODE() {
		return this.PNT_ADDRESS_POSTAL_CODE;
	}

	public void setPNT_ADDRESS_POSTAL_CODE(String pNT_ADDRESS_POSTAL_CODE) {
		this.PNT_ADDRESS_POSTAL_CODE = pNT_ADDRESS_POSTAL_CODE;
	}

	public String getPNT_ADDRESS_COUNTRY() {
		return this.PNT_ADDRESS_COUNTRY;
	}

	public void setPNT_ADDRESS_COUNTRY(String pNT_ADDRESS_COUNTRY) {
		this.PNT_ADDRESS_COUNTRY = pNT_ADDRESS_COUNTRY;
	}

	public String getPNT_ADDRESS_PERIOD() {
		return this.PNT_ADDRESS_PERIOD;
	}

	public void setPNT_ADDRESS_PERIOD(String pNT_ADDRESS_PERIOD) {
		this.PNT_ADDRESS_PERIOD = pNT_ADDRESS_PERIOD;
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
	
	public String getPNT_MULTIPLE_BIRTH_INTEGER() {
		return this.PNT_MULTIPLE_BIRTH_INTEGER;
	}

	public void setPNT_MULTIPLE_BIRTH_INTEGER(String pNT_MULTIPLE_BIRTH_INTEGER) {
		this.PNT_MULTIPLE_BIRTH_INTEGER = pNT_MULTIPLE_BIRTH_INTEGER;
	}
	
	public String getPNT_PHOTO() {
		return this.PNT_PHOTO;
	}

	public void setPNT_PHOTO(String pNT_PHOTO) {
		this.PNT_PHOTO = pNT_PHOTO;
	}
	
	public String getPNT_CONTACT() {
		return this.PNT_CONTACT;
	}

	public void setPNT_CONTACT(String pNT_CONTACT) {
		this.PNT_CONTACT = pNT_CONTACT;
	}

	public String getPNT_CONTACT_RELATIONSHIP() {
		return this.PNT_CONTACT_RELATIONSHIP;
	}

	public void setPNT_CONTACT_RELATIONSHIP(String pNT_CONTACT_RELATIONSHIP) {
		this.PNT_CONTACT_RELATIONSHIP = pNT_CONTACT_RELATIONSHIP;
	}
	
	public String getPNT_CONTACT_NAME() {
		return this.PNT_CONTACT_NAME;
	}

	public void setPNT_CONTACT_NAME(String pNT_CONTACT_NAME) {
		this.PNT_CONTACT_NAME = pNT_CONTACT_NAME;
	}
	
	public String getPNT_CONTACT_TELECOM() {
		return this.PNT_CONTACT_TELECOM;
	}

	public void setPNT_CONTACT_TELECOM(String pNT_CONTACT_TELECOM) {
		this.PNT_CONTACT_TELECOM = pNT_CONTACT_TELECOM;
	}
	
	public String getPNT_CONTACT_ADDRESS() {
		return this.PNT_CONTACT_ADDRESS;
	}

	public void setPNT_CONTACT_ADDRESS(String pNT_CONTACT_ADDRESS) {
		this.PNT_CONTACT_ADDRESS = pNT_CONTACT_ADDRESS;
	}
	
	public String getPNT_CONTACT_GENDER() {
		return this.PNT_CONTACT_GENDER;
	}

	public void setPNT_CONTACT_GENDER(String pNT_CONTACT_GENDER) {
		this.PNT_CONTACT_GENDER = pNT_CONTACT_GENDER;
	}
	
	public String getPNT_CONTACT_ORGANIZATION() {
		return this.PNT_CONTACT_ORGANIZATION;
	}

	public void setPNT_CONTACT_ORGANIZATION(String pNT_CONTACT_ORGANIZATION) {
		this.PNT_CONTACT_ORGANIZATION = pNT_CONTACT_ORGANIZATION;
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