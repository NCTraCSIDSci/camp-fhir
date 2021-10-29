package main.java.com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.BooleanType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DecimalType;
import org.hl7.fhir.r4.model.Duration;
import org.hl7.fhir.r4.model.IntegerType;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.codesystems.EncounterLocationStatusEnumFactory;
import org.hl7.fhir.r4.model.Address.AddressUseEnumFactory;

import main.java.com.campfhir.model.Encounter;

import org.hl7.fhir.r4.model.Encounter.ClassHistoryComponent;
import org.hl7.fhir.r4.model.Encounter.DiagnosisComponent;
import org.hl7.fhir.r4.model.Encounter.EncounterHospitalizationComponent;
import org.hl7.fhir.r4.model.Encounter.EncounterLocationComponent;
import org.hl7.fhir.r4.model.Encounter.EncounterParticipantComponent;
import org.hl7.fhir.r4.model.Encounter.EncounterStatus;
import org.hl7.fhir.r4.model.Encounter.EncounterStatusEnumFactory;
import org.hl7.fhir.r4.model.Encounter.StatusHistoryComponent;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory;

import ca.uhn.fhir.parser.DataFormatException;

import org.hl7.fhir.exceptions.FHIRException;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/

public class EncounterConversion 
{
	public org.hl7.fhir.r4.model.Encounter Encounters(Encounter encounter) throws ParseException, FHIRException, IOException
	{		
		org.hl7.fhir.r4.model.Encounter e = new org.hl7.fhir.r4.model.Encounter();	
		
	
		/******************** ENC_IDENTIFIER **************************************************************************************
		 * ENC_IDENTIFIER maps to Encounter / identifier
		 ********************************************************************************************************************/
		e.setIdBase(encounter.getENC_IDENTIFIER());
		
		/******************** ENC_STATUS **************************************************************************************
		 * ENC_STATUS maps to Encounter / status
		 ********************************************************************************************************************/

		e.setStatus(EncounterStatus.fromCode(encounter.getENC_STATUS()));													
		
		/******************** ENC_STATUSHISTORY **************************************************************************************
		 * ENC_STATUS maps to Encounter / statusHistory
		 ********************************************************************************************************************/
	 	
		StatusHistoryComponent statusHistory = e.addStatusHistory();
		
		statusHistory.setStatus(EncounterStatus.fromCode(encounter.getENC_STATUSHISTORY_STATUS_CODE()));
		Period statushistoryperiod = createPeriod(encounter.getENC_STATUSHISTORY_PERIOD_START(), encounter.getENC_STATUSHISTORY_PERIOD_END());
		statusHistory.setPeriod(statushistoryperiod);
		

		/******************** ENC_CLASS **************************************************************************************
		 * ENC_CLASS maps to Encounter / class
		 ********************************************************************************************************************/
		if(encounter.getENC_CLASS_CODE() != null)
		{			
			
			Coding encclasscode = createCoding("urn:oid:2.16.840.1.113883.1.11.13955", "4.0.1", encounter.getENC_CLASS_CODE(), encounter.getENC_CLASS_DISPLAY(), encounter.getENC_CLASS_USER_SELECTED());
			e.setClass_(encclasscode);
		}
		
		/******************** ENC_CLASSHISTORY **************************************************************************************
		 * ENC_CLASSHISTORY maps to Encounter / classHistory
		 ********************************************************************************************************************/
		
		ClassHistoryComponent classhistory = e.addClassHistory();
		Coding encclasshistory = createCoding("urn:oid:2.16.840.1.113883.1.11.13955", "4.0.1", encounter.getENC_CLASSHISTORY_CLASS_CODING_CODE(), encounter.getENC_CLASSHISTORY_CLASS_CODING_DISPLAY(), encounter.getENC_CLASSHISTORY_CLASS_CODING_USERSELECTED());
		classhistory.setClass_(encclasshistory);
		Period encclasshistoryperiod = createPeriod(encounter.getENC_CLASSHISTORY_PERIOD_START(), encounter.getENC_CLASSHISTORY_PERIOD_END());
		classhistory.setPeriod(encclasshistoryperiod);
		
		/******************** ENC_TYPE **************************************************************************************
		 * ENC_TYPE maps to Encounter / type
		 ********************************************************************************************************************/
		
		CodeableConcept enctype = new CodeableConcept();
		enctype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.248", "4.0.1", encounter.getENC_TYPE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_TYPE_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_TYPE_CODEABLECONCEPT_CODING_USERSELECTED()));
		enctype.setText(encounter.getENC_TYPE_TEXT());
		e.addType(enctype);
		
		/******************** ENC_SERVICETYPE **************************************************************************************
		 * ENC_TYPE maps to Encounter / serviceType
		 ********************************************************************************************************************/
		
		CodeableConcept encservicetype = new CodeableConcept();
		encservicetype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.518", "4.0.1", encounter.getENC_SERVICETYPE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_SERVICETYPE_CODEABLECONCEPT_CODING_DISPLAY(),	encounter.getENC_SERVICETYPE_CODEABLECONCEPT_CODING_USERSELECTED()));
		encservicetype.setText(encounter.getENC_SERVICETYPE_TEXT());
		e.setServiceType(encservicetype);
		
		/******************** ENC_PRIORITY **************************************************************************************
		 * ENC_TYPE maps to Encounter / priority
		 ********************************************************************************************************************/
		
		CodeableConcept encpriority = new CodeableConcept();
		encpriority.addCoding(createCoding("http://terminology.hl7.org/ValueSet/v3-ActPriority", "2018-08-12", encounter.getENC_PRIORITY_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_PRIORITY_CODEABLECONCEPT_CODING_DISPLAY(),	encounter.getENC_PRIORITY_CODEABLECONCEPT_CODING_USERSELECTED()));
		encpriority.setText(encounter.getENC_PRIORITY_TEXT());
		e.setPriority(encpriority);
		
		/******************** ENC_SUBJECT_REFERENCE *************************************************************************
		 * ENC_SUBJECT_REFERENCE maps to Encounter / subject / reference
		 ********************************************************************************************************************/
		Reference subjectreference = createReference(encounter.getENC_SUBJECT_REFERENCE_REFERENCE(), encounter.getENC_SUBJECT_REFERENCE_TYPE(), encounter.getENC_SUBJECT_REFERENCE_IDENTIFIER(), encounter.getENC_SUBJECT_REFERENCE_DISPLAY());
		e.setSubject(subjectreference);
		
		/******************** ENC_EPISODEOFCARE *************************************************************************
		 * ENC_EPISODEOFCARE maps to Encounter / episodeOfCare
		 ********************************************************************************************************************/
		Reference EOCreference = createReference(encounter.getENC_EPISODEOFCARE_REFERENCE_REFERENCE(), encounter.getENC_EPISODEOFCARE_REFERENCE_TYPE(), encounter.getENC_EPISODEOFCARE_REFERENCE_IDENTIFIER(), encounter.getENC_EPISODEOFCARE_REFERENCE_DISPLAY());
		e.addEpisodeOfCare(EOCreference);
		
		/******************** ENC_BASEDON *************************************************************************
		 * ENC_BASEDON maps to Encounter / basedOn
		 ********************************************************************************************************************/
		Reference BasedOnreference = createReference(encounter.getENC_BASEDON_REFERENCE_REFERENCE(), encounter.getENC_BASEDON_REFERENCE_TYPE(), encounter.getENC_BASEDON_REFERENCE_IDENTIFIER(), encounter.getENC_BASEDON_REFERENCE_DISPLAY());
		e.addBasedOn(BasedOnreference);
		
		/******************** ENC_PARTICIPANT *********************************************************************
		 * ENC_PARTICIPANT maps to Encounter / participant
		 ********************************************************************************************************************/
		
		EncounterParticipantComponent encparticipant = e.addParticipant();
		CodeableConcept encparticipanttype = new CodeableConcept();
		encparticipanttype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.250", "4.0.1", encounter.getENC_PARTICIPANT_TYPE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_PARTICIPANT_TYPE_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_PARTICIPANT_TYPE_CODEABLECONCEPT_CODING_USERSELECTED()));
		encparticipanttype.setText(encounter.getENC_PARTICIPANT_TYPE_TEXT());
		encparticipant.addType(encparticipanttype);
		encparticipant.setPeriod(createPeriod(encounter.getENC_PARTICIPANT_PERIOD_START(),encounter.getENC_PARTICIPANT_PERIOD_END()));
		encparticipant.setIndividual(createReference(encounter.getENC_PARTICIPANT_INDIVIDUAL_REFERENCE_REFERENCE(), encounter.getENC_PARTICIPANT_INDIVIDUAL_REFERENCE_TYPE(), encounter.getENC_PARTICIPANT_INDIVIDUAL_REFERENCE_IDENTIFIER(), encounter.getENC_PARTICIPANT_INDIVIDUAL_REFERENCE_DISPLAY()));

		
		/******************** ENC_APPOINTMENT *********************************************************************
		 * ENC_APPOINTMENT maps to Encounter / appointment
		 ********************************************************************************************************************/
	
		e.addAppointment(createReference(encounter.getENC_APPOINTMENT_REFERENCE_REFERENCE(),encounter.getENC_APPOINTMENT_REFERENCE_TYPE(),encounter.getENC_APPOINTMENT_REFERENCE_IDENTIFIER(),encounter.getENC_APPOINTMENT_REFERENCE_DISPLAY()));
		
		/******************** ENC_PERIOD *********************************************************************
		 * ENC_PERIOD maps to Encounter / period
		 ********************************************************************************************************************/		
		
		e.setPeriod(createPeriod(encounter.getENC_PERIOD_START(),encounter.getENC_PERIOD_END()));
		
		/******************** ENC_LENGTH *********************************************************************
		 * ENC_LENGTH maps to Encounter / length
		 ********************************************************************************************************************/	
		Duration len = new Duration();
		DecimalType lenval = new DecimalType(encounter.getENC_LENGTH_VALUE());
		len.setValueElement(lenval);
		len.setUnit(encounter.getENC_LENGTH_UNIT());
		e.setLength(len);
		
		/******************** ENC_REASONCODE *********************************************************************
		 * ENC_REASONCODE maps to Encounter / reasonCode
		 ********************************************************************************************************************/	
		
		CodeableConcept encreasoncode = new CodeableConcept();
		encreasoncode.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.261", "4.0.1", encounter.getENC_REASONCODE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_REASONCODE_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_REASONCODE_CODEABLECONCEPT_CODING_USERSELECTED()));
		encreasoncode.setText(encounter.getENC_REASONCODE_CODEABLECONCEPT_TEXT());
		e.addReasonCode(encreasoncode);
		
		/******************** ENC_REASONREFERENCE *********************************************************************
		 * ENC_REASONCODE maps to Encounter / reasonReference
		 ********************************************************************************************************************/	
		e.addReasonReference(createReference(encounter.getENC_REASONREFERENCE_REFERENCE_REFERENCE(),encounter.getENC_REASONREFERENCE_REFERENCE_TYPE(),encounter.getENC_REASONREFERENCE_REFERENCE_IDENTIFIER(),encounter.getENC_REASONREFERENCE_REFERENCE_DISPLAY()));

		/******************** ENC_DIAGNOSIS *********************************************************************
		 * ENC_DIAGNOSIS maps to Encounter / diagnosis
		 ********************************************************************************************************************/	
		DiagnosisComponent diagnoiscomponent = e.addDiagnosis();
		CodeableConcept diagnosisuse = new CodeableConcept();
		
		/******************** ENC_DIAGNOSIS_CONDITION_REFERENCE *****************************************************************************
		 *  ENC_DIAGN_CON_REF maps to Encounter / diagnosis / condition / reference
		 ********************************************************************************************************************/
		
		diagnoiscomponent.setCondition(createReference(encounter.getENC_DIAGNOSIS_CONDITION_REFERENCE_REFERENCE(),encounter.getENC_DIAGNOSIS_CONDITION_REFERENCE_TYPE(),encounter.getENC_DIAGNOSIS_CONDITION_REFERENCE_IDENTIFIER(),encounter.getENC_DIAGNOSIS_CONDITION_REFERENCE_DISPLAY()));
		
		/******************** ENC_DIAGNOSIS_USE *****************************************************************************
		 *  ENC_DIAGNOSIS_USE maps to Encounter / diagnosis / use 
		 ********************************************************************************************************************/
		
		CodeableConcept encdiagusecode = new CodeableConcept();
		encdiagusecode.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.49", "4.0.1", encounter.getENC_DIAGNOSIS_USE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_DIAGNOSIS_USE_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_DIAGNOSIS_USE_CODEABLECONCEPT_CODING_USERSELECTED()));
		encdiagusecode.setText(encounter.getENC_DIAGNOSIS_USE_CODEABLECONCEPT_TEXT());
		diagnoiscomponent.setUse(encdiagusecode);
		
		/******************** ENC_DIAGN_RANK ********************************************************************************
		 *  ENC_DIAGN_RANK  maps to Encounter / diagnosis / rank
		 ********************************************************************************************************************/
		if(encounter.getENC_DIAGNOSIS_RANK() != null)
		{
			diagnoiscomponent.setRank(Integer.parseInt(encounter.getENC_DIAGNOSIS_RANK()));
		}
		
		/******************** ENC_ACCOUNT ********************************************************************************
		 *  ENC_ACCOUNT  maps to Encounter / account
		 ********************************************************************************************************************/
		
		e.addAccount(createReference(encounter.getENC_ACCOUNT_REFERENCE_REFERENCE(),encounter.getENC_ACCOUNT_REFERENCE_TYPE(),encounter.getENC_ACCOUNT_REFERENCE_IDENTIFIER(),encounter.getENC_ACCOUNT_REFERENCE_DISPLAY()));

		/******************** ENC_HOSPITALIZATION ******************************************************************
		 * ENC_HOSPITALIZATION maps to Encounter / hospitalization 
		 ********************************************************************************************************************/
		
		try 
		{
			e.setHospitalization(setDischargeDisp(encounter));
		} 
		catch (FHIRException e1) 
		{
			e1.printStackTrace();
		}
		
		/******************** ENC_LOCATION ******************************************************************
		 * ENC_LOCATION  maps to Encounter / location 
		 ********************************************************************************************************************/
		
		EncounterLocationComponent elc = e.addLocation();
		
		elc.setLocation(createReference(encounter.getENC_LOCATION_LOCATION_REFERENCE_REFERENCE(),encounter.getENC_LOCATION_LOCATION_REFERENCE_TYPE(),encounter.getENC_LOCATION_LOCATION_REFERENCE_IDENTIFIER(),encounter.getENC_LOCATION_LOCATION_REFERENCE_DISPLAY()));
		
		EncounterLocationStatusEnumFactory enclocstatusfact = new EncounterLocationStatusEnumFactory();
		enclocstatuscode.setCode(enclocstatusfact.fromCode(encounter.getENC_LOCATION_STATUS()));
		
		CodeableConcept enclocphystype = new CodeableConcept();
		enclocphystype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.257", "4.0.1", encounter.getENC_LOCATION_PHYSICALTYPE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_LOCATION_PHYSICALTYPE_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_LOCATION_PHYSICALTYPE_CODEABLECONCEPT_CODING_USERSELECTED()));
		enclocphystype.setText(encounter.getENC_LOCATION_PHYSICALTYPE_CODEABLECONCEPT_TEXT());
		elc.setPhysicalType(enclocphystype);
		
		Period enclocationperiod = createPeriod(encounter.getENC_LOCATION_PERIOD_START(), encounter.getENC_LOCATION_PERIOD_END());
		elc.setPeriod(enclocationperiod);
		
		/******************** ENC_SERVICEPROVIDER ******************************************************************
		 * ENC_SERVICEPROVIDER  maps to Encounter / serviceProvider 
		 ********************************************************************************************************************/
		
		e.addAccount(createReference(encounter.getENC_SERVICEPROVIDER_REFERENCE_REFERENCE(),encounter.getENC_SERVICEPROVIDER_REFERENCE_TYPE(),encounter.getENC_SERVICEPROVIDER_REFERENCE_IDENTIFIER(),encounter.getENC_SERVICEPROVIDER_REFERENCE_DISPLAY()));

		/******************** ENC_PARTOF ******************************************************************
		 * ENC_PARTOF  maps to Encounter / partOf 
		 ********************************************************************************************************************/
		
		e.addAccount(createReference(encounter.getENC_PARTOF_REFERENCE_REFERENCE(),encounter.getENC_PARTOF_REFERENCE_TYPE(),encounter.getENC_PARTOF_REFERENCE_IDENTIFIER(),encounter.getENC_PARTOF_REFERENCE_DISPLAY()));	
		
		return e;
	}
	

	public static  EncounterHospitalizationComponent setDischargeDisp(Encounter encounter) throws FHIRException
	{
		EncounterHospitalizationComponent ehc = new EncounterHospitalizationComponent();
		Identifier preAdmissionIdentifier = new Identifier();
		
		/******************** ENC_HOSPITALIZATION ******************************************************************
		 * ENC_HOSP_DISDISP_CODING_CODE maps to Encounter / hospitalization 
		 ********************************************************************************************************************/
		
		ehc.setPreAdmissionIdentifier(preAdmissionIdentifier.setValue(encounter.getENC_HOSPITALIZATION_PREADMISSIONIDENTIFIER()));
		
		ehc.setOrigin(createReference(encounter.getENC_HOSPITALIZATION_ORIGIN_REFERENCE_REFERENCE(),encounter.getENC_HOSPITALIZATION_ORIGIN_REFERENCE_TYPE(),encounter.getENC_HOSPITALIZATION_ORIGIN_REFERENCE_IDENTIFIER(),encounter.getENC_HOSPITALIZATION_ORIGIN_REFERENCE_DISPLAY()));

		CodeableConcept enchospadmitsrc = new CodeableConcept();
		enchospadmitsrc.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.257", "4.0.1", encounter.getENC_HOSPITALIZATION_ADMITSOURCE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_HOSPITALIZATION_ADMITSOURCE_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_HOSPITALIZATION_ADMITSOURCE_CODEABLECONCEPT_CODING_USERSELECTED()));
		enchospadmitsrc.setText(encounter.getENC_HOSPITALIZATION_ADMITSOURCE_CODEABLECONCEPT_TEXT());
		ehc.setAdmitSource(enchospadmitsrc);
		
		
		CodeableConcept enchospreadmin = new CodeableConcept();
		enchospreadmin.addCoding(createCoding("http://terminology.hl7.org/ValueSet/v2-0092", "v2.0092", encounter.getENC_HOSPITALIZATION_READMISSION_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_HOSPITALIZATION_READMISSION_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_HOSPITALIZATION_READMISSION_CODEABLECONCEPT_CODING_USERSELECTED()));
		enchospreadmin.setText(encounter.getENC_HOSPITALIZATION_READMISSION_CODEABLECONCEPT_TEXT());
		ehc.setReAdmission(enchospreadmin);
		
		CodeableConcept enchospdietpref = new CodeableConcept();
		enchospdietpref.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.255", "4.0.1", encounter.getENC_HOSPITALIZATION_DIETPREFERENCE_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_HOSPITALIZATION_DIETPREFERENCE_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_HOSPITALIZATION_DIETPREFERENCE_CODEABLECONCEPT_CODING_USERSELECTED()));
		enchospdietpref.setText(encounter.getENC_HOSPITALIZATION_DIETPREFERENCE_CODEABLECONCEPT_TEXT());
		ehc.addDietPreference(enchospdietpref);
		
		CodeableConcept enchospspeccourt = new CodeableConcept();
		enchospspeccourt.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.252", "4.0.1", encounter.getENC_HOSPITALIZATION_SPECIALCOURTESY_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_HOSPITALIZATION_SPECIALCOURTESY_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_HOSPITALIZATION_SPECIALCOURTESY_CODEABLECONCEPT_CODING_USERSELECTED()));
		enchospspeccourt.setText(encounter.getENC_HOSPITALIZATION_SPECIALCOURTESY_CODEABLECONCEPT_TEXT());
		ehc.addSpecialCourtesy(enchospspeccourt);
		
		CodeableConcept enchospspecarrangement = new CodeableConcept();
		enchospspecarrangement.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.253", "4.0.1", encounter.getENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODEABLECONCEPT_CODING_USERSELECTED()));
		enchospspecarrangement.setText(encounter.getENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODEABLECONCEPT_TEXT());
		ehc.addSpecialArrangement(enchospspecarrangement);
		
		ehc.setDestination(createReference(encounter.getENC_HOSPITALIZATION_DESTINATION_REFERENCE_REFERENCE(),encounter.getENC_HOSPITALIZATION_DESTINATION_REFERENCE_TYPE(),encounter.getENC_HOSPITALIZATION_DESTINATION_REFERENCE_IDENTIFIER(),encounter.getENC_HOSPITALIZATION_DESTINATION_REFERENCE_DISPLAY()));
		
		CodeableConcept enchospdischdisp = new CodeableConcept();
		enchospdischdisp.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.259", "4.0.1", encounter.getENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODEABLECONCEPT_CODING_CODE(), encounter.getENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODEABLECONCEPT_CODING_DISPLAY(),encounter.getENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODEABLECONCEPT_CODING_USERSELECTED()));
		enchospdischdisp.setText(encounter.getENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODEABLECONCEPT_TEXT());
		ehc.setDischargeDisposition(enchospdischdisp);
		
		return ehc;	
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
	
	private static Coding createCoding(String systemString, String versionString, String codeString, String displayString, String userSelectedString ) {
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
	
	private static Reference createReference( String referenceString, String typeString, String identifierString, String displayString) throws ParseException {
		Reference reference = new Reference();
		reference.setReference(referenceString);
		reference.setType(typeString);
		reference.setId(identifierString);
		reference.setDisplay(displayString);
		return reference;
	}
}
