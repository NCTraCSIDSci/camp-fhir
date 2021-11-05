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
			n.setId(patient.getPntIdentifier());

			
			/******************** PNT_ACTIVE ******************************************************************************** 
			 * PNT_ACTIVE maps to Patient / active
			 ********************************************************************************************************************/
			if(patient.getPntActive() != null) {
				n.setActive(Boolean.parseBoolean(patient.getPntActive()));
			}
			
			/******************** PNT_NAME ******************************************************************************** 
			 * PNT_NAME maps to Patient / name
			 ********************************************************************************************************************/
			HumanName hn = createName(patient.getPntNameHumannameUse(), patient.getPntNameHumannameText(), patient.getPntNameHumannameFamily(), patient.getPntNameHumannameGiven(), 
					patient.getPntNameHumannamePrefix(), patient.getPntNameHumannameSuffix(), patient.getPntNameHumannamePeriodStart(), patient.getPntNameHumannamePeriodEnd());
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

			n.setGender(AdministrativeGender.fromCode(patient.getPntGender()));

				
			/******************** PNT_BIRTHDATE *********************************************************************************
			 * PNT_BIRTHDATE maps to Patient / birthDate 
			 ********************************************************************************************************************/
			if(patient.getPntBirthdate() != null)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
				Date date;
				try 
				{
					date = sdf.parse(patient.getPntBirthdate());
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
				BooleanType bt = new BooleanType(patient.getPntDeceasedboolean());
				n.setDeceased(bt);
			} catch (DataFormatException booleanerror) {
				booleanerror.printStackTrace();

			}
			if(patient.getPntDeceaseddatetime() != null) {	
				SimpleDateFormat dspdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
				Date deceaseddate;
				try 
				{
					deceaseddate = dspdf.parse(patient.getPntDeceaseddatetime());
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
			address =  createAddress( patient.getPntAddressUse(), patient.getPntAddressType(), patient.getPntAddressText(), patient.getPntAddressLine(), 
					patient.getPntAddressCity(), patient.getPntAddressDistrict(), patient.getPntAddressState(), patient.getPntAddressPotalcode(), patient.getPntAddressCountry(),
					patient.getPntAddressPeriodStart(), patient.getPntAddressPeriodEnd());
			
			

			if(patient.getPntMaritalStatusCode() != null)
			{
				CodeableConcept ms = new CodeableConcept();
				
				Coding c = new Coding();
				
				/******************** PNT_MARITAL_STATUS_CODE ***********************************************************************
				 * PNT_MARITAL_STATUS_CODE  maps to Patient / maritalStatus / coding / code
				 ********************************************************************************************************************/
	
				c.setCode(patient.getPntMaritalStatusCode());
				
				
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
				IntegerType it = new IntegerType(patient.getPntMultipleBirthInteger());
				n.setMultipleBirth(it);
			} catch (DataFormatException integererror) {
				integererror.printStackTrace();

			}
			try {
				BooleanType bt = new BooleanType(patient.getPntMultipleBirthBoolean());
				n.setMultipleBirth(bt);
			} catch (DataFormatException booleanerror) {
				booleanerror.printStackTrace();

			}
		
			/******************** PNT_PHOTO **************************************************************************************
			 * PNT_PHOTO maps to Patient / photo
			 ********************************************************************************************************************/
			if(patient.getPntPhotoAttachmentContentType() != null) {
				Attachment photo = n.addPhoto();
				
				/******************** PNT_PHOTO_ATTACHMENT_CONTENT_TYPE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_CONTENT_TYPE maps to Patient / photo  / contentType
				 ********************************************************************************************************************/
				
				photo.setContentType(patient.getPntPhotoAttachmentContentType());
				
				/******************** PNT_PHOTO_ATTACHMENT_LANGUAGE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_LANGUAGE maps to Patient / photo  / language
				 ********************************************************************************************************************/
				
				photo.setLanguage(patient.getPntPhotoAttachmentLanguage());
				
				/******************** PNT_PHOTO_ATTACHMENT_DATA **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_DATA maps to Patient / photo  / data
				 ********************************************************************************************************************/
				Base64BinaryType base64photodata = new Base64BinaryType(patient.getPntPhotoAttachmentData());
				photo.setDataElement(base64photodata);
				
				/******************** PNT_PHOTO_ATTACHMENT_URL **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_URL maps to Patient / photo  / url
				 ********************************************************************************************************************/
				UrlType ut  = new UrlType(patient.getPntPhotoAttachmentUrl());
				photo.setUrlElement(ut);
				
				/******************** PNT_PHOTO_ATTACHMENT_SIZE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_SIZE maps to Patient / photo  / size
				 ********************************************************************************************************************/
				UnsignedIntType unsignedint = new UnsignedIntType(patient.getPntPhotoAttachmentSize());
				photo.setSizeElement(unsignedint);
				
				/******************** PNT_PHOTO_ATTACHMENT_HASH **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_HASH maps to Patient / photo  / hash
				 ********************************************************************************************************************/
				Base64BinaryType base64hashdata = new Base64BinaryType(patient.getPntPhotoAttachmentHash());
				photo.setHashElement(base64hashdata);
				
				/******************** PNT_PHOTO_ATTACHMENT_TITLE **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_TITLE maps to Patient / photo  / title
				 ********************************************************************************************************************/
				
				photo.setContentType(patient.getPntPhotoAttachmentTitle());
				
				/******************** PNT_PHOTO_ATTACHMENT_CREATION **************************************************************************************
				 * PNT_PHOTO_ATTACHMENT_CREATION  maps to Patient / photo  / creation
				 ********************************************************************************************************************/
				Date photoddate = null;
	
				try 
				{
					SimpleDateFormat photosdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
	
					if(patient.getPntPhotoAttachmentCreation() != null)  {
						photoddate = photosdf.parse(patient.getPntPhotoAttachmentCreation());
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
			if(patient.getPntContactNameHumannameText() != null | patient.getPntContactTelecomContactpointValue() != null | patient.getPntContactAddressLine() != null | patient.getPntContactOrganizationReferenceDisplay() != null ) {
				ContactComponent contact = n.addContact();
				
				/******************** PNT_CONTACT_RELATIONSHIP **************************************************************************************
				 * PNT_CONTACT_RELATIONSHIP maps to Patient / contact /relationship
				 ********************************************************************************************************************/
				CodeableConcept rel = contact.addRelationship();
				//Coding relcode = new Coding();
				
				Coding relcode = rel.addCoding();
				relcode.setSystem("urn:oid:2.16.840.1.113883.4.642.3.1130");
				relcode.setVersion("4.0.1");
				relcode.setCode(patient.getPntContactRelationshipCodeableconceptCodingCode()); 
				relcode.setDisplay(patient.getPntContactRelationshipCodeableconceptCodingDisplay());
//				relcode.setUserSelected(patient.getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED());
				try {
					BooleanType bt = new BooleanType(patient.getPntContactRelationshipCodeableconceptCodingUserselected());
					relcode.setUserSelectedElement(bt);
				} catch (DataFormatException booleanerror) {
					booleanerror.printStackTrace();

				}
				rel.setText(patient.getPntContactRelationshipCodeableconceptText());
				
				/******************** PNT_CONTACT_NAME **************************************************************************************
				 * PNT_CONTACT_NAME  maps to Patient / contact /name
				 ********************************************************************************************************************/
				HumanName contactname = createName(patient.getPntContactNameHumannameUse(), patient.getPntContactNameHumannameText(), patient.getPntContactNameHumannameFamily(),
						patient.getPntContactNameHumannameGiven(), patient.getPntContactNameHumannamePrefix(), patient.getPntContactNameHumannameSuffix(),
						patient.getPntContactNameHumannamePeriodStart(), patient.getPntContactNameHumannamePeriodEnd());
				contact.setName(contactname);

				/******************** PNT_CONTACT_TELECOM******************************************************************************** 
				 * PNT_CONTACT_ADDRESS maps to Patient / contact / telecom 
				 ********************************************************************************************************************/
				ContactPoint contactpt = contact.addTelecom();
				contactpt = createTelecom(patient.getPntContactTelecomContactpointSystem(), patient.getPntContactTelecomContactpointValue(), patient.getPntContactTelecomContactpointUse(),
						patient.getPntContactTelecomContactpointRank(), patient.getPntContactTelecomContactpointPeriodStart(), patient.getPntContactTelecomContactpointPeriodEnd());
				
				
				/******************** PNT_CONTACT_ADDRESS******************************************************************************** 
				 * PNT_CONTACT_ADDRESS maps to Patient / contact / address 
				 ********************************************************************************************************************/
				
				Address contactaddress = new Address();
				contactaddress =  createAddress( patient.getPntContactAddressUse(), patient.getPntContactAddressType(), patient.getPntContactAddressText(), patient.getPntContactAddressLine(), 
						patient.getPntContactAddressCity(), patient.getPntContactAddressDistrict(), patient.getPntContactAddressState(), patient.getPntContactAddressPotalcode(),
						patient.getPntContactAddressCountry(),patient.getPntContactAddressPeriodStart(), patient.getPntContactAddressPeriodEnd());
				contact.setAddress(contactaddress);

				
				/******************** PNT_CONTACT_GENDER ************************************************************************************ 
				 * PNT_CONTACT_GENDER maps to Patient / contact / gender
				 */

				contact.setGender(AdministrativeGender.fromCode(patient.getPntContactGender()));

				/******************** PNT_CONTACT_ORGANIZATION ************************************************************************************ 
				 * PNT_CONTACT_ORGANIZATION maps to Patient / contact / gender / organization
				 */
				Reference reference = createReference(patient.getPntContactOrganizationReferenceReference(), patient.getPntContactOrganizationReferenceType(),
						patient.getPntContactOrganizationReferenceIdentifier(),patient.getPntContactOrganizationReferenceDisplay());
				contact.setOrganization(reference);
				/******************** PNT_CONTACT_PERIOD ************************************************************************************ 
				 * PNT_CONTACT_ORGANIZATION maps to Patient / contact / gender / organization
				 */				
				contact.setPeriod(createPeriod(patient.getPntContactPeriodStart(), patient.getPntContactPeriodEnd()));
				
			}
			
			/******************** PNT_COMMUNICATION **************************************************************************************
			 * PNT_COMMUNICATION maps to Patient / communication 
			 ********************************************************************************************************************/

			PatientCommunicationComponent patcom = n.addCommunication();
			if(patient.getPntCommunicationLanguageCodeableconceptCodingCode() != null || patient.getPntCommunicationLanguageCodeableconceptCodingDisplay() != null) {

				/******************** PNT_COMMUNICATION_LANGUAGE **************************************************************************************
				 * PNT_COMMUNICATION_LANGUAGE maps to Patient / communication / language
				 ********************************************************************************************************************/
				CodeableConcept patcomlang = new CodeableConcept();
				
				Coding patcomcode = new Coding();
				
				
				patcomcode.setSystem("urn:oid:2.16.840.1.113883.4.642.3.20");
				patcomcode.setVersion("4.0.1");
				
				patcomcode.setCode(patient.getPntCommunicationLanguageCodeableconceptCodingCode());
				patcomcode.setDisplay(patient.getPntCommunicationLanguageCodeableconceptCodingDisplay());
				//patcomcode.setUserSelected(false);
				try {
					BooleanType bt = new BooleanType(patient.getPntCommunicationLanguageCodeableconceptCodingUserselected());
					patcomcode.setUserSelectedElement(bt);
				} catch (DataFormatException booleanerror) {
					booleanerror.printStackTrace();

				}
				patcomlang.addCoding(patcomcode);
				patcomlang.setText(patient.getPntCommunicationLanguageText());
				patcom.setLanguage(patcomlang);
			}
				
				/******************** PNT_COMMUNICATION_PREFERRED **************************************************************************************
				 * PNT_COMMUNICATION_PREFERRED maps to Patient / communication / preferred
				 ********************************************************************************************************************/
			if(patient.getPntCommunicationPreferred() != null ) {
				try {
					BooleanType bt = new BooleanType(patient.getPntCommunicationPreferred());
					patcom.setPreferredElement(bt);
				} catch (DataFormatException booleanerror) {
					booleanerror.printStackTrace();
				}
			}
			
			/******************** PNT_GENERAL_PRACTITIONER **************************************************************************************
			 * PNT_GENERAL_PRACTITIONER maps to Patient / generalPractitioner
			 ********************************************************************************************************************/
				
			Reference generalPractioner = n.addGeneralPractitioner();
			generalPractioner = createReference( patient.getPntGeneralPractictionerReferenceReference(), patient.getPntGeneralPractictionerReferenceType()
					, patient.getPntGeneralPractictionerReferenceIdentifier(), patient.getPntGeneralPractictionerReferenceDisplay());
			
			
			
			/******************** PNT_LINK **************************************************************************************
			 * PNT_LINK maps to Patient / Link
			 ********************************************************************************************************************/
			
			PatientLinkComponent link = n.addLink();
			Reference otherReference = createReference( patient.getPntLinkOtherReferenceReference(), patient.getPntLinkOtherReferenceType(), patient.getPntLinkOtherReferenceIdentifier(),
					patient.getPntLinkOtherReferenceDisplay());
			link.setOther(otherReference);
			LinkTypeEnumFactory linktypefactory = new LinkTypeEnumFactory(); 
			link.setType(linktypefactory.fromCode(patient.getPntLinkType()));
			
			/******************** PNT_RACE **************************************************************************************
			 * PNT_RACE maps to Patient / extension / race / coding / code
			 ********************************************************************************************************************/
			List<Extension> extList = new ArrayList<>();
			if(patient.getPntRaceCode() != null)
			{
				
				Extension t2 = new Extension();
				t2.setUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race");
				
				Coding race = new Coding();
				race.setCode(patient.getPntRaceCode());
				race.setSystem("urn:oid:2.16.840.1.113883.6.238");
				race.setDisplay(patient.getPntRaceDisplay());
				t2.addExtension("ombCategory", race);
				
				extList.add(t2);
			}
		
			
			/******************** PNT_ETHNICITY *********************************************************************************
			 * PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code
			 ********************************************************************************************************************/
			
			if(patient.getPntEthnicityCode() != null)
			{
				Extension t3 = new Extension();			
				
				t3.setUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity");
				
				Coding ethnicity = new Coding();
				ethnicity.setCode(patient.getPntEthnicityCode());
				ethnicity.setSystem("urn:oid:2.16.840.1.113883.6.238");
				ethnicity.setDisplay(patient.getPntEthnicityDisplay());			
				
				t3.addExtension("ombCategory", ethnicity);
				
				extList.add(t3);
			}
			
			if(patient.getPntEthnicityCode() != null || patient.getPntRaceCode() != null)
			{
				n.setExtension(extList);
			}
			
			//Map<String, Map<String, String>> t = latlong;
			
			Address addrResource = n.addAddress();
			if(patient.getPntAddressExtLatValue() !=null && patient.getPntAddressExtLongValue() != null)
			{
				Extension geolocation = addrResource.addExtension();
				/******************** PNT_ADDRESS_EXT_LAT_VALUE ****************************************************************
				 * PNT_ADDRESS_EXT_LAT_VALUE maps to Patient / address / extension / latitude / value
				 ***************************************************************************************************************/
			    geolocation.addExtension("Latitude", new DecimalType(patient.getPntAddressExtLatValue()));
			    
				/******************** PNT_ADDRESS_EXT_LONG_VALUE ***************************************************************
				 * PNT_ADDRESS_EXT_LONG_VALUE maps to Patient / address / extension / longitude / value
				 ***************************************************************************************************************/
			    geolocation.addExtension("Longitude", new DecimalType(patient.getPntAddressExtLongValue()));
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
