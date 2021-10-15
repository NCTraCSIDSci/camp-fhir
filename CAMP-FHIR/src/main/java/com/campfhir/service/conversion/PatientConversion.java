package main.java.com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

//import org.hl7.fhir.dstu3.model.codesystems.V3RaceEnumFactory;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory;
import org.hl7.fhir.r4.model.Address.AddressUseEnumFactory;
import org.hl7.fhir.r4.model.Attachment;
import org.hl7.fhir.r4.model.Base64BinaryType;
import org.hl7.fhir.r4.model.BooleanType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.ContactPoint;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.DecimalType;
import org.hl7.fhir.r4.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory;
import org.hl7.fhir.r4.model.IntegerType;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient.ContactComponent;
import org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory;
import org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent;
import org.hl7.fhir.r4.model.Patient.PatientLinkComponent;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.PositiveIntType;
import org.hl7.fhir.r4.model.Reference;

import org.hl7.fhir.r4.model.UnsignedIntType;
import org.hl7.fhir.r4.model.UrlType;
import org.xml.sax.SAXException;

import ca.uhn.fhir.parser.DataFormatException;
import main.java.com.campfhir.model.Patient;


/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class PatientConversion 
{
	public org.hl7.fhir.r4.model.Patient Patients(Patient patient) throws ParseException, IOException, ParserConfigurationException, SAXException
	{
			org.hl7.fhir.r4.model.Patient n = new org.hl7.fhir.r4.model.Patient(); 
			

			/******************** PNT_IDENTIFIER ******************************************************************************** 
			 * PNT_IDENTIFIER maps to Patient / identifier
			 ********************************************************************************************************************/
			n.setId(patient.getPNT_IDENTIFIER());

			
			/******************** PNT_ACTIVE ******************************************************************************** 
			 * PNT_ACTIVE maps to Patient / active
			 ********************************************************************************************************************/
			
			n.setActive(Boolean.parseBoolean(patient.getPNT_ACTIVE()));
			
			/******************** PNT_NAME ******************************************************************************** 
			 * PNT_NAME maps to Patient / name
			 ********************************************************************************************************************/
			HumanName hn = createName(patient.getPNT_NAME_HUMANNAME_USE(), patient.getPNT_NAME_HUMANNAME_TEXT(), patient.getPNT_NAME_HUMANNAME_FAMILY(), patient.getPNT_NAME_HUMANNAME_GIVEN(), 
					patient.getPNT_NAME_HUMANNAME_PREFIX(), patient.getPNT_NAME_HUMANNAME_SUFFIX(), patient.getPNT_NAME_HUMANNAME_PERIOD_START(), patient.getPNT_NAME_HUMANNAME_PERIOD_END());
			n.addName(hn);

//			if(latlong.get(patient.getPNT_IDENTIFIER()) != null)
//			{
//				if(!latlong.get(patient.getPNT_IDENTIFIER()).get("lat").isEmpty())
//				{
//					patient.setPNT_ADDRESS_EXT_LAT_VALUE(latlong.get(patient.getPNT_IDENTIFIER()).get("lat")); 
//					patient.setPNT_ADDRESS_EXT_LONG_VALUE(latlong.get(patient.getPNT_IDENTIFIER()).get("long"));
//				}
//			}

			
			/******************** PNT_GENDER ************************************************************************************ 
			 * PNT_GENDER maps to Patient / gender
			 */

			n.setGender(AdministrativeGender.fromCode(patient.getPNT_GENDER()));

				
			/******************** PNT_BIRTHDATE *********************************************************************************
			 * PNT_BIRTHDATE maps to Patient / birthDate 
			 ********************************************************************************************************************/
			if(patient.getPNT_BIRTHDATE() != null)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
				Date date;
				try 
				{
					date = sdf.parse(patient.getPNT_BIRTHDATE());
					n.setBirthDate(date);
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}				
			}
			
			/******************** PNT_DECEASED_X ******************************************************************************** 
			 * PNT_DECEASED maps to Patient / deceased / X (BOOLEAN or DATETIME)
			 ********************************************************************************************************************/
			
			try {
				BooleanType bt = new BooleanType(patient.getPNT_DECEASEDBOOLEAN());
				n.setDeceased(bt);
			} catch (DataFormatException booleanerror) {
				booleanerror.printStackTrace();

			}
			if(patient.getPNT_DECEASEDDATETIME() != null) {	
				SimpleDateFormat dspdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
				Date deceaseddate;
				try 
				{
					deceaseddate = dspdf.parse(patient.getPNT_DECEASEDDATETIME());
					DateTimeType dtt = new  DateTimeType(deceaseddate);
					n.setDeceased(dtt);
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}			
			}
			/******************** PNT_ADDRESS******************************************************************************** 
			 * PNT_ADDRESS maps to Patient / address 
			 ********************************************************************************************************************/
			
			Address address = n.addAddress();
			address =  createAddress( patient.getPNT_ADDRESS_USE(), patient.getPNT_ADDRESS_TYPE(), patient.getPNT_ADDRESS_TEXT(), patient.getPNT_ADDRESS_LINE(), 
					patient.getPNT_ADDRESS_CITY(), patient.getPNT_ADDRESS_DISTRICT(), patient.getPNT_ADDRESS_STATE(), patient.getPNT_ADDRESS_POSTAL_CODE(), patient.getPNT_ADDRESS_COUNTRY(),
					patient.getPNT_ADDRESS_PERIOD_START(), patient.getPNT_ADDRESS_PERIOD_END());
			
			

			if(patient.getPNT_MARITAL_STATUS_CODE() != null)
			{
				CodeableConcept ms = new CodeableConcept();
				
				Coding c = new Coding();
				
				/******************** PNT_MARITAL_STATUS_CODE ***********************************************************************
				 * PNT_MARITAL_STATUS_CODE  maps to Patient / maritalStatus / coding / code
				 ********************************************************************************************************************/
	
				c.setCode(patient.getPNT_MARITAL_STATUS_CODE());
				
				
				/******************** PNT_MARITAL_STATUS_SYSTEM *********************************************************************
				 * PNT_MARITAL_STATUS_SYSTEM maps to Patient / maritalStatus / coding / system
				 ********************************************************************************************************************/
				c.setSystem("http://terminology.hl7.org/CodeSystem/v3-MaritalStatus");//patient.getPNT_MARITAL_STATUS_SYSTEM());
				
				List<Coding> theCoding = new ArrayList<Coding>();
				
				theCoding.add(c);
				
				ms.setCoding(theCoding);
				n.setMaritalStatus(ms);	
			}
			
			/******************** PNT_MULTIPLE_BIRTH_X ******************************************************************************** 
			 * PNT_DECEASED maps to Patient / multipleBirth / X (BOOLEAN or Integer)
			 ********************************************************************************************************************/
			
			try {
				IntegerType it = new IntegerType(patient.getPNT_MULTIPLE_BIRTH_INTEGER());
				n.setMultipleBirth(it);
			} catch (DataFormatException integererror) {
				integererror.printStackTrace();

			}
			try {
				BooleanType bt = new BooleanType(patient.getPNT_MULTIPLE_BIRTH_BOOLEAN());
				n.setMultipleBirth(bt);
			} catch (DataFormatException booleanerror) {
				booleanerror.printStackTrace();

			}
		
			/******************** PNT_PHOTO **************************************************************************************
			 * PNT_PHOTO maps to Patient / photo
			 ********************************************************************************************************************/
			if(patient.getPNT_PHOTO_ATTACHMENT_CONTENT_TYPE() != null) {
				Attachment photo = n.addPhoto();
				
				/******************** PNT_PHOTO_ATTACHMENT_CONTENT_TYPE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_CONTENT_TYPE maps to Patient / photo  / contentType
				 ********************************************************************************************************************/
				
				photo.setContentType(patient.getPNT_PHOTO_ATTACHMENT_CONTENT_TYPE());
				
				/******************** PNT_PHOTO_ATTACHMENT_LANGUAGE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_LANGUAGE maps to Patient / photo  / language
				 ********************************************************************************************************************/
				
				photo.setLanguage(patient.getPNT_PHOTO_ATTACHMENT_LANGUAGE());
				
				/******************** PNT_PHOTO_ATTACHMENT_DATA **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_DATA maps to Patient / photo  / data
				 ********************************************************************************************************************/
				Base64BinaryType base64photodata = new Base64BinaryType(patient.getPNT_PHOTO_ATTACHMENT_DATA());
				photo.setDataElement(base64photodata);
				
				/******************** PNT_PHOTO_ATTACHMENT_URL **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_URL maps to Patient / photo  / url
				 ********************************************************************************************************************/
				UrlType ut  = new UrlType(patient.getPNT_PHOTO_ATTACHMENT_URL());
				photo.setUrlElement(ut);
				
				/******************** PNT_PHOTO_ATTACHMENT_SIZE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_SIZE maps to Patient / photo  / size
				 ********************************************************************************************************************/
				UnsignedIntType unsignedint = new UnsignedIntType(patient.getPNT_PHOTO_ATTACHMENT_SIZE());
				photo.setSizeElement(unsignedint);
				
				/******************** PNT_PHOTO_ATTACHMENT_HASH **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_HASH maps to Patient / photo  / hash
				 ********************************************************************************************************************/
				Base64BinaryType base64hashdata = new Base64BinaryType(patient.getPNT_PHOTO_ATTACHMENT_HASH());
				photo.setHashElement(base64hashdata);
				
				/******************** PNT_PHOTO_ATTACHMENT_TITLE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_TITLE maps to Patient / photo  / title
				 ********************************************************************************************************************/
				
				photo.setContentType(patient.getPNT_PHOTO_ATTACHMENT_TITLE());
				
				/******************** PNT_PHOTO_ATTACHMENT_CREATION **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_CREATION  maps to Patient / photo  / creation
				 ********************************************************************************************************************/
				Date photoddate = null;
	
				try 
				{
					SimpleDateFormat photosdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
	
					if(patient.getPNT_PHOTO_ATTACHMENT_CREATION() != null)  {
						photoddate = photosdf.parse(patient.getPNT_PHOTO_ATTACHMENT_CREATION());
					}
					
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}
				photo.setCreation(photoddate);
			}
			
			/******************** PNT_CONTACT **************************************************************************************
			 * PNT_CONTACT maps to Patient / contact
			 ********************************************************************************************************************/
			if(patient.getPNT_CONTACT_NAME() != null | patient.getPNT_CONTACT_TELECOM() != null | patient.getPNT_CONTACT_ADDRESS() != null | patient.getPNT_CONTACT_ORGANIZATION() != null ) {
				ContactComponent contact = n.addContact();
				
				/******************** PNT_CONTACT_RELATIONSHIP **************************************************************************************
				 * PNT_CONTACT_RELATIONSHIP maps to Patient / contact /relationship
				 ********************************************************************************************************************/
				CodeableConcept rel = contact.addRelationship();
				//Coding relcode = new Coding();
				
				Coding relcode = rel.addCoding();
				relcode.setSystem("urn:oid:2.16.840.1.113883.4.642.3.1130");
				relcode.setVersion("4.0.1");
				relcode.setCode(patient.getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE()); //TODO: CREATE SEPERATE DBASE FIELDS FOR CODING CODE AND DISPLAY AND USERSELECTED
				relcode.setDisplay(patient.getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY());
//				relcode.setUserSelected(patient.getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED());
				try {
					BooleanType bt = new BooleanType(patient.getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED());
					relcode.setUserSelectedElement(bt);
				} catch (DataFormatException booleanerror) {
					booleanerror.printStackTrace();

				}
				rel.setText(patient.getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT());
				
				/******************** PNT_CONTACT_NAME **************************************************************************************
				 * PNT_CONTACT_NAME  maps to Patient / contact /name
				 ********************************************************************************************************************/
				HumanName contactname = createName(patient.getPNT_CONTACT_NAME_HUMANNAME_USE(), patient.getPNT_CONTACT_NAME_HUMANNAME_TEXT(), patient.getPNT_CONTACT_NAME_HUMANNAME_FAMILY(),
						patient.getPNT_CONTACT_NAME_HUMANNAME_GIVEN(), patient.getPNT_CONTACT_NAME_HUMANNAME_PREFIX(), patient.getPNT_CONTACT_NAME_HUMANNAME_SUFFIX(),
						patient.getPNT_CONTACT_NAME_HUMANNAME_PERIOD_START(), patient.getPNT_CONTACT_NAME_HUMANNAME_PERIOD_END());
				contact.setName(contactname);

				/******************** PNT_CONTACT_TELECOM******************************************************************************** 
				 * PNT_CONTACT_ADDRESS maps to Patient / contact / telecom 
				 ********************************************************************************************************************/
				ContactPoint contactpt = contact.addTelecom();
				contactpt = createTelecom(patient.getPNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM(), patient.getPNT_CONTACT_TELECOM_CONTACTPOINT_VALUE(), patient.getPNT_CONTACT_TELECOM_CONTACTPOINT_USE(),
						patient.getPNT_CONTACT_TELECOM_CONTACTPOINT_RANK(), patient.getPNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START(), patient.getPNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END());
				
				
				/******************** PNT_CONTACT_ADDRESS******************************************************************************** 
				 * PNT_CONTACT_ADDRESS maps to Patient / contact / address 
				 ********************************************************************************************************************/
				
				Address contactaddress = new Address();
				contactaddress =  createAddress( patient.getPNT_CONTACT_ADDRESS_USE(), patient.getPNT_CONTACT_ADDRESS_TYPE(), patient.getPNT_CONTACT_ADDRESS_TEXT(), patient.getPNT_CONTACT_ADDRESS_LINE(), 
						patient.getPNT_CONTACT_ADDRESS_CITY(), patient.getPNT_CONTACT_ADDRESS_DISTRICT(), patient.getPNT_CONTACT_ADDRESS_STATE(), patient.getPNT_CONTACT_ADDRESS_POSTAL_CODE(),
						patient.getPNT_CONTACT_ADDRESS_COUNTRY(),patient.getPNT_CONTACT_ADDRESS_PERIOD_START(), patient.getPNT_CONTACT_ADDRESS_PERIOD_END());
				contact.setAddress(contactaddress);

				
				/******************** PNT_CONTACT_GENDER ************************************************************************************ 
				 * PNT_CONTACT_GENDER maps to Patient / contact / gender
				 */

				contact.setGender(AdministrativeGender.fromCode(patient.getPNT_CONTACT_GENDER()));

				/******************** PNT_CONTACT_ORGANIZATION ************************************************************************************ 
				 * PNT_CONTACT_ORGANIZATION maps to Patient / contact / gender / organization
				 */
				Reference reference = createReference(patient.getPNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE(), patient.getPNT_CONTACT_ORGANIZATION_REFERENCE_TYPE(),
						patient.getPNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER(),patient.getPNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY());
				contact.setOrganization(reference);
				/******************** PNT_CONTACT_PERIOD ************************************************************************************ 
				 * PNT_CONTACT_ORGANIZATION maps to Patient / contact / gender / organization
				 */				
				contact.setPeriod(createPeriod(patient.getPNT_CONTACT_PERIOD_START(), patient.getPNT_CONTACT_PERIOD_END()));
				
			}
			
			/******************** PNT_COMMUNICATION **************************************************************************************
			 * PNT_COMMUNICATION maps to Patient / communication 
			 ********************************************************************************************************************/
			
			PatientCommunicationComponent patcom = n.addCommunication();
			
				/******************** PNT_COMMUNICATION_LANGUAGE **************************************************************************************
				 * PNT_COMMUNICATION_LANGUAGE maps to Patient / communication / language
				 ********************************************************************************************************************/
				CodeableConcept patcomlang = new CodeableConcept();
				
				Coding patcomcode = new Coding();
				
				
				patcomcode.setSystem("urn:oid:2.16.840.1.113883.4.642.3.20");
				patcomcode.setVersion("4.0.1");
				
				patcomcode.setCode(patient.getPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE());
				patcomcode.setDisplay(patient.getPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY());
				//patcomcode.setUserSelected(false);
				try {
					BooleanType bt = new BooleanType(patient.getPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_USERSELECTED());
					patcomcode.setUserSelectedElement(bt);
				} catch (DataFormatException booleanerror) {
					booleanerror.printStackTrace();

				}
				patcomlang.addCoding(patcomcode);
				patcomlang.setText(patient.getPNT_COMMUNICATION_LANGUAGE_TEXT());
				patcom.setLanguage(patcomlang);
				
				/******************** PNT_COMMUNICATION_PREFERRED **************************************************************************************
				 * PNT_COMMUNICATION_PREFERRED maps to Patient / communication / preferred
				 ********************************************************************************************************************/
				
				try {
					BooleanType bt = new BooleanType(patient.getPNT_COMMUNICATION_PREFERRED());
					patcom.setPreferredElement(bt);
				} catch (DataFormatException booleanerror) {
					booleanerror.printStackTrace();
				}
			
			/******************** PNT_GENERAL_PRACTITIONER **************************************************************************************
			 * PNT_GENERAL_PRACTITIONER maps to Patient / generalPractitioner
			 ********************************************************************************************************************/
				
			Reference generalPractioner = n.addGeneralPractitioner();
			generalPractioner = createReference( patient.getPNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE(), patient.getPNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE()
					, patient.getPNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER(), patient.getPNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY());
			
			
			
			/******************** PNT_LINK **************************************************************************************
			 * PNT_LINK maps to Patient / Link
			 ********************************************************************************************************************/
			
			PatientLinkComponent link = n.addLink();
			Reference otherReference = createReference( patient.getPNT_LINK_OTHER_REFERENCE_REFERENCE(), patient.getPNT_LINK_OTHER_REFERENCE_TYPE(), patient.getPNT_LINK_OTHER_REFERENCE_IDENTIFIER(),
					patient.getPNT_LINK_OTHER_REFERENCE_DISPLAY());
			link.setOther(otherReference);
			LinkTypeEnumFactory linktypefactory = new LinkTypeEnumFactory(); 
			link.setType(linktypefactory.fromCode(patient.getPNT_LINK_TYPE()));
			
			/******************** PNT_RACE **************************************************************************************
			 * PNT_RACE maps to Patient / extension / race / coding / code
			 ********************************************************************************************************************/
			List<Extension> extList = new ArrayList<>();
			if(patient.getPNT_RACE() != null)
			{
				
				Extension t2 = new Extension();
				t2.setUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race");
				
				Coding race = new Coding();
				race.setCode(patient.getPNT_RACE());
				race.setSystem("urn:oid:2.16.840.1.113883.6.238");
				race.setDisplay(patient.getPNT_RACE_DISP());
				t2.addExtension("ombCategory", race);
				
				extList.add(t2);
			}
		
			
			/******************** PNT_ETHNICITY *********************************************************************************
			 * PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code
			 ********************************************************************************************************************/
			
			if(patient.getPNT_ETHNICITY() != null)
			{
				Extension t3 = new Extension();			
				
				t3.setUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity");
				
				Coding ethnicity = new Coding();
				ethnicity.setCode(patient.getPNT_ETHNICITY());
				ethnicity.setSystem("urn:oid:2.16.840.1.113883.6.238");
				ethnicity.setDisplay(patient.getPNT_ETHNICITY_DISP());			
				
				t3.addExtension("ombCategory", ethnicity);
				
				extList.add(t3);
			}
			
			if(patient.getPNT_ETHNICITY() != null || patient.getPNT_RACE() != null)
			{
				n.setExtension(extList);
			}
			
			//Map<String, Map<String, String>> t = latlong;
			
			Address addrResource = n.addAddress();
			if(patient.getPNT_ADDRESS_EXT_LAT_VALUE() !=null && patient.getPNT_ADDRESS_EXT_LONG_VALUE() != null)
			{
				Extension geolocation = addrResource.addExtension();
				/******************** PNT_ADDRESS_EXT_LAT_VALUE ****************************************************************
				 * PNT_ADDRESS_EXT_LAT_VALUE maps to Patient / address / extension / latitude / value
				 ***************************************************************************************************************/
			    geolocation.addExtension("Latitude", new DecimalType(patient.getPNT_ADDRESS_EXT_LAT_VALUE()));
			    
				/******************** PNT_ADDRESS_EXT_LONG_VALUE ***************************************************************
				 * PNT_ADDRESS_EXT_LONG_VALUE maps to Patient / address / extension / longitude / value
				 ***************************************************************************************************************/
			    geolocation.addExtension("Longitude", new DecimalType(patient.getPNT_ADDRESS_EXT_LONG_VALUE()));
			}

		  return n;
	}
	
	private static Period createPeriod( String startdatestring, String enddatastring) throws ParseException {
		Date startdate = null;
		Date enddate = null;
		
		Period period = new Period();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");

		if(startdatestring != null)  {
			startdate = sdf.parse(startdatestring);
			period.setStart(startdate);

		}
		if(enddatastring != null)  {
			enddate = sdf.parse(enddatastring);
			period.setEnd(enddate);

		}
		
	
		return period;
	}
	
	private static HumanName createName(String useString, String textString, String familyString, String givenString, String prefixString, String suffixString,
			String periodStartString, String periodEndString) throws ParseException {
		
		HumanName hn = new HumanName();
		
		
		NameUseEnumFactory nameusefactory = new HumanName.NameUseEnumFactory(); 
		hn.setUse(nameusefactory.fromCode(useString));

		/******************** PNT_NAME_FAMILY ******************************************************************************** 
		 * PNT_NAME_TEXT maps to Patient / name / text
		 * PNT_NAME_FAMILY maps to Patient / name / family
		 ********************************************************************************************************************/
		hn.setText(textString).setFamily(familyString);

		/******************** PNT_NAME_GIVEN ******************************************************************************** 
		 * PNT_NAME maps to Patient / name / given
		 ********************************************************************************************************************/
		
		hn.addGivenElement().setValue(givenString);
		
		/******************** PNT_NAME_PREFIX ******************************************************************************** 
		 * PNT_NAME maps to Patient / name / prefix
		 ********************************************************************************************************************/
		
		hn.addPrefixElement().setValue(prefixString);
		
		/******************** PNT_NAME_SUFFIX ******************************************************************************** 
		 * PNT_NAME maps to Patient / name / suffix
		 ********************************************************************************************************************/

		hn.addSuffixElement().setValue(suffixString);

		/******************** PNT_NAME_PERIOD ******************************************************************************** 
		 * PNT_NAME maps to Patient / name / period / start
		 * PNT_NAME maps to Patient / name / period / end
		 ********************************************************************************************************************/
		Period period = createPeriod( periodStartString, periodEndString );
		hn.setPeriod(period);			
		return hn;
		
	}
	
	private static Address createAddress(String addressUseString, String addressTypeString, String addressTextString, String addressLineString, 
			String addressCityString, String addressDistrictString, String addressStateSring, String addressPostalCodeString, String addressCountryString,
			String addressPeriodStart, String addressPeriodEnd) throws ParseException {
		
		Address address = new Address();
		
		/******************** PNT_ADDRESS_USE ******************************************************************************** 
		 * PNT_ADDRESS_USE maps to Patient / address / use
		 ********************************************************************************************************************/
		
		AddressUseEnumFactory addressusefactory = new Address.AddressUseEnumFactory(); 
		address.setUse(addressusefactory.fromCode(addressUseString));
		
		/******************** PNT_ADDRESS_TYPE ******************************************************************************** 
		 * PNT_ADDRESS_TYPE maps to Patient / address / TYPE
		 ********************************************************************************************************************/
		
		AddressTypeEnumFactory addresstypefactory = new Address.AddressTypeEnumFactory(); 
		address.setType(addresstypefactory.fromCode(addressTypeString));
		
		/******************** PNT_ADDRESS_TEXT ******************************************************************************** 
		 * PNT_ADDRESS_TEXT maps to Patient / address / TEXT
		 ********************************************************************************************************************/
		
		address.setText(addressTextString);
		
		/******************** PNT_ADDRESS_LINE ******************************************************************************** 
		 * PNT_ADDRESS_LINE maps to Patient / address / LINE
		 ********************************************************************************************************************/

		address.addLine(addressLineString);
		
		/******************** PNT_ADDRESS_CITY ******************************************************************************** 
		 * PNT_ADDRESS_CITY maps to Patient / address / CITY
		 ********************************************************************************************************************/
		
		address.setCity(addressCityString);
		
		/******************** PNT_ADDRESS_DISTRICT ******************************************************************************** 
		 * PNT_ADDRESS_DISTRICT maps to Patient / address / DISTRICT
		 ********************************************************************************************************************/
		
		address.setDistrict(addressDistrictString);
		
		/******************** PNT_ADDRESS_STATE ******************************************************************************** 
		 * PNT_ADDRESS_STATE maps to Patient / address / STATE
		 ********************************************************************************************************************/
		
		address.setState(addressStateSring);

		/******************** PNT_ADDRESS_POSTAL_CODE ******************************************************************************** 
		 * PNT_ADDRESS_POSTALCODE maps to Patient / address / POSTAL_CODE
		 ********************************************************************************************************************/
		
		address.setPostalCode(addressPostalCodeString);
		
		/******************** PNT_ADDRESS_COUNTRY ******************************************************************************** 
		 * PNT_ADDRESS_COUNTRY maps to Patient / address / COUNTRY
		 ********************************************************************************************************************/
		
		address.setCountry(addressCountryString);

		
		/******************** PNT_ADDRESS_PERIOD ******************************************************************************** 
		 * PNT_ADDRESS_PERIOD maps to Patient / address / PERIOD 
		 ********************************************************************************************************************/
		
	
		Period addressperiod = createPeriod(addressPeriodStart, addressPeriodEnd);
		address.setPeriod(addressperiod);
		return address;
		
	}
	
	private static ContactPoint createTelecom(String telecomSystemString, String telcomValueString, String telecomUseString, String telecomRankString
			, String telecomPeriodStartString, String telecomPeriodEndString) throws ParseException {
		ContactPoint contactpt = new ContactPoint();
		
		/******************** PNT_CONTACT_TELECOM_SYSTEM******************************************************************************** 
		 * PNT_CONTACT_TELECOM_SYSTEM maps to Patient / contact / telecom / system
		 ********************************************************************************************************************/
	
		ContactPointSystemEnumFactory contactpointsystfactory = new ContactPoint.ContactPointSystemEnumFactory(); 
		contactpt.setSystem(contactpointsystfactory.fromCode(telecomSystemString));
	
		/******************** PNT_CONTACT_TELECOM_VALUE******************************************************************************** 
		 * PNT_CONTACT_TELECOM_VALUE maps to Patient / contact / telecom / VALUE
		 ********************************************************************************************************************/
	
		contactpt.setValue(telcomValueString);
	
		/******************** PNT_CONTACT_TELECOM_USE******************************************************************************** 
		 * PNT_CONTACT_TELECOM_USE maps to Patient / contact / telecom / use
		 ********************************************************************************************************************/
	
		ContactPointUseEnumFactory contactpointusefactory = new ContactPoint.ContactPointUseEnumFactory(); 
		contactpt.setUse(contactpointusefactory.fromCode(telecomUseString));
	
		/******************** PNT_CONTACT_TELECOM_RANK******************************************************************************** 
		 * PNT_CONTACT_TELECOM_RANK maps to Patient / contact / telecom / rank
		 ********************************************************************************************************************/
		PositiveIntType positiveint = new PositiveIntType(telecomRankString);
		contactpt.setRankElement(positiveint);
	
		/******************** PNT_CONTACT_TELECOM_PERIOD******************************************************************************** 
		 * PNT_CONTACT_TELECOM_PERIOD maps to Patient / contact / telecom /period
		 ********************************************************************************************************************/
		Period contacttelecomeperiod = createPeriod(telecomPeriodStartString, telecomPeriodEndString);
		contactpt.setPeriod(contacttelecomeperiod);
		return contactpt;
	}
	private static Reference createReference( String referenceString, String typeString, String identifierString, String displayString) throws ParseException {
		Reference reference = new Reference();
		reference.setReference(referenceString);
		reference.setType(typeString);
		reference.setId(identifierString);
		reference.setDisplay(displayString);
		return reference;
	}
	
}
