package main.java.com.campfhir.service.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.BooleanType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.ContactPoint;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.PositiveIntType;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Type;
import org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory;
import org.hl7.fhir.r4.model.Address.AddressUseEnumFactory;
import org.hl7.fhir.r4.model.Attachment;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointUse;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory;
import org.hl7.fhir.r4.model.IntegerType;
import org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory;

import ca.uhn.fhir.parser.DataFormatException;

public class HapiFHIRHelpers {
	public static Identifier createIdentifier( String identifieruse, String ccsystemstring, String versionstring, String codingcodestring, String displaystring,String userselected, String textstring, String periodstart, String periodend, String referencestring ,String valuestring, String systemstring ) throws ParseException {

		Identifier identifier = new Identifier();
		IdentifierUseEnumFactory identifieruseenumfactory = new Identifier.IdentifierUseEnumFactory(); 
		identifier.setUse(identifieruseenumfactory.fromCode(identifieruse));
		CodeableConcept cc_type = new CodeableConcept();
		Coding coding = new Coding(); 
		coding.setSystem(ccsystemstring);
		coding.setVersion(versionstring);
		coding.setCode(codingcodestring);
		coding.setDisplay(displaystring);
		
		try {
			BooleanType bt = new BooleanType(userselected);
			coding.setUserSelectedElement(bt);
		} catch (DataFormatException booleanerror) {
			booleanerror.printStackTrace();

		}
		cc_type.setText(textstring);
		cc_type.addCoding(coding);
		identifier.setType(cc_type);
		identifier.setPeriod(createPeriod(periodstart, periodend));
		Reference reference1 = new Reference();
		identifier.setAssigner(reference1.setReference(referencestring));
		identifier.setValue(valuestring);
		identifier.setSystem(systemstring);
		return identifier;
	}
	public static Period createPeriod( String startdatestring, String enddatastring) throws ParseException {
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
	
	public static Coding createCoding(String systemString, String versionString, String codeString, String displayString, String userSelectedString ) {
		Coding coding = new Coding();
		
		coding.setSystem(systemString);
		coding.setVersion(versionString);
		
		coding.setCode(codeString);
		coding.setDisplay(displayString);

		try {
			BooleanType bt = new BooleanType(userSelectedString);
			coding.setUserSelectedElement(bt);
		} catch (DataFormatException booleanerror) {
			booleanerror.printStackTrace();

		}
		
		return coding;
	}
	
	public static Reference createReference( String referenceString, String typeString, String identifierString, String displayString) throws ParseException {
		Reference reference = new Reference();
		reference.setReference(referenceString);
		reference.setType(typeString);
		reference.setId(identifierString);
		reference.setDisplay(displayString);
		return reference;
	}
	
	public static ContactPoint createTelecom(String telecomSystemString, String telcomValueString, String telecomUseString, String telecomRankString
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
	
	public static Address createAddress(String addressUseString, String addressTypeString, String addressTextString, String addressLineString, 
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
	
	public static HumanName createHumanName(String useString, String textString, String familyString, String givenString, String prefixString, String suffixString,
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
	public static BooleanType createbooleantype(String booleanstring) {
		return new BooleanType(booleanstring);
	}
	
	public static boolean createboolean(String booleanstring) {
		return Boolean.parseBoolean(booleanstring);
	}
	
	public static ContactPoint createContactPoint(String systemstring, String usestring,
			String periodstartstring, String periodendtring, String rankstring,
			String valuestring) {
		ContactPoint conpt = new ContactPoint();
		ContactPointSystemEnumFactory contactptsystemfactory = new ContactPointSystemEnumFactory(); 
		conpt.setSystem(contactptsystemfactory.fromCode(systemstring));
		ContactPointUseEnumFactory cpu = new ContactPointUseEnumFactory();
		conpt.setUse(cpu.fromCode(usestring));
		try {
			conpt.setPeriod(createPeriod(periodstartstring,periodendtring));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		PositiveIntType pit = new PositiveIntType(rankstring);
		conpt.setRankElement(pit);
		conpt.setValue(valuestring);
		return conpt;
		
	}

	public static DateTimeType createdateTimetype(String datetimestring) {
		return new DateTimeType(datetimestring);
		
	}
	public static CodeableConcept createCodeableConcept(String codingsystemstring, String codingversionstring,
			String codingcodestring, String codingdisplaystring, String codinguserselectedstring,
			String textstring) {
			CodeableConcept cc = new CodeableConcept();
			Coding coding = new Coding(); 
			coding.setSystem(codingsystemstring);
			coding.setVersion(codingversionstring);
			coding.setCode(codingcodestring);
			coding.setDisplay(codingdisplaystring);
			try {
				BooleanType bt = new BooleanType(codinguserselectedstring);
				coding.setUserSelectedElement(bt);
			} catch (DataFormatException booleanerror) {
				booleanerror.printStackTrace();

			}
			cc.setText(textstring);
			cc.addCoding(coding);
			return cc;

		
	}
	public static IntegerType createintegertype(String integerstring) {
		return new IntegerType(integerstring);
	}
	public static Attachment createAttachment(String patientPhotoAttachmentData, String patientPhotoAttachmentHash,
			String ptntPhtTtchmntCntntTpe, String patientPhotoAttachmentLanguage, String patientPhotoAttachmentCreation,
			String patientPhotoAttachmentTitle, String patientPhotoAttachmentSize, String patientPhotoAttachmentUrl) {
				return null;
		// TODO Auto-generated method stub
		
	}
	public static void createReference(String ptntCntctRgnztnRfrnce) {
		// TODO Auto-generated method stub
		
	}
	public static Date createdate(String patientBirthDateDate) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
