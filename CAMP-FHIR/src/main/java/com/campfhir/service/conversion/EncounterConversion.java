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
import org.hl7.fhir.r4.model.Encounter.EncounterLocationStatus;
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
		e.setIdBase(encounter.getEncIdentifier());
		
		/******************** ENC_STATUS **************************************************************************************
		 * ENC_STATUS maps to Encounter / status
		 ********************************************************************************************************************/

		e.setStatus(EncounterStatus.fromCode(encounter.getEncStatus()));													
		
		/******************** ENC_STATUSHISTORY **************************************************************************************
		 * ENC_STATUS maps to Encounter / statusHistory
		 ********************************************************************************************************************/
	 	
		StatusHistoryComponent statusHistory = e.addStatusHistory();
		
		statusHistory.setStatus(EncounterStatus.fromCode(encounter.getEncStatusHistoryStatusCode()));
		Period statushistoryperiod = createPeriod(encounter.getEncStatusHistoryPeriodStart(), encounter.getEncStatusHistoryPeriodEnd());
		statusHistory.setPeriod(statushistoryperiod);
		

		/******************** ENC_CLASS **************************************************************************************
		 * ENC_CLASS maps to Encounter / class
		 ********************************************************************************************************************/
		if(encounter.getEncClassCode() != null)
		{			
			
			Coding encclasscode = createCoding("urn:oid:2.16.840.1.113883.1.11.13955", "4.0.1", encounter.getEncClassCode(), encounter.getEncClassDisplay(), encounter.getEncClassUserSelected());
			e.setClass_(encclasscode);
		}
		
		/******************** ENC_CLASSHISTORY **************************************************************************************
		 * ENC_CLASSHISTORY maps to Encounter / classHistory
		 ********************************************************************************************************************/
		
		ClassHistoryComponent classhistory = e.addClassHistory();
		Coding encclasshistory = createCoding("urn:oid:2.16.840.1.113883.1.11.13955", "4.0.1", encounter.getEncClasshistoryClassCodingCode(), encounter.getEncClasshistoryClassCodingDisplay(), encounter.getEncClasshistoryClassCodingUserselected());
		classhistory.setClass_(encclasshistory);
		Period encclasshistoryperiod = createPeriod(encounter.getEncClasshistoryPeriodStart(), encounter.getEncClasshistoryPeriodEnd());
		classhistory.setPeriod(encclasshistoryperiod);
		
		/******************** ENC_TYPE **************************************************************************************
		 * ENC_TYPE maps to Encounter / type
		 ********************************************************************************************************************/
		
		CodeableConcept enctype = new CodeableConcept();
		enctype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.248", "4.0.1", encounter.getEncTypeCodeableconceptCodingCode(), encounter.getEncTypeCodeableconceptCodingDisplay(),encounter.getEncTypeCodeableconceptCodingUserselected()));
		enctype.setText(encounter.getEncTypeText());
		e.addType(enctype);
		
		/******************** ENC_SERVICETYPE **************************************************************************************
		 * ENC_TYPE maps to Encounter / serviceType
		 ********************************************************************************************************************/
		
		CodeableConcept encservicetype = new CodeableConcept();
		encservicetype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.518", "4.0.1", encounter.getEncServicetypeCodeableconceptCodingCode(), encounter.getEncServicetypeCodeableconceptCodingDisplay(),	encounter.getEncServicetypeCodeableconceptCodingUserselected()));
		encservicetype.setText(encounter.getEncServicetypeText());
		e.setServiceType(encservicetype);
		
		/******************** ENC_PRIORITY **************************************************************************************
		 * ENC_TYPE maps to Encounter / priority
		 ********************************************************************************************************************/
		
		CodeableConcept encpriority = new CodeableConcept();
		encpriority.addCoding(createCoding("http://terminology.hl7.org/ValueSet/v3-ActPriority", "2018-08-12", encounter.getEncPriorityCodeableconceptCodingCode(), encounter.getEncPriorityCodeableconceptCodingDisplay(),	encounter.getEncPriorityCodeableconceptCodingUserselected()));
		encpriority.setText(encounter.getEncPriorityText());
		e.setPriority(encpriority);
		
		/******************** ENC_SUBJECT_REFERENCE *************************************************************************
		 * ENC_SUBJECT_REFERENCE maps to Encounter / subject / reference
		 ********************************************************************************************************************/
		Reference subjectreference = createReference(encounter.getEncSubjectReferenceReference(), encounter.getEncSubjectReferenceType(), encounter.getEncSubjectReferenceIdentifier(), encounter.getEncSubjectReferenceDisplay());
		e.setSubject(subjectreference);
		
		/******************** ENC_EPISODEOFCARE *************************************************************************
		 * ENC_EPISODEOFCARE maps to Encounter / episodeOfCare
		 ********************************************************************************************************************/
		Reference EOCreference = createReference(encounter.getEncEpisodeofcareReferenceReference(), encounter.getEncEpisodeofcareReferenceType(), encounter.getEncEpisodeofcareReferenceIdentifier(), encounter.getEncEpisodeofcareReferenceDisplay());
		e.addEpisodeOfCare(EOCreference);
		
		/******************** ENC_BASEDON *************************************************************************
		 * ENC_BASEDON maps to Encounter / basedOn
		 ********************************************************************************************************************/
		Reference BasedOnreference = createReference(encounter.getEncBasedonReferenceReference(), encounter.getEncBasedonReferenceType(), encounter.getEncBasedonReferenceIdentifier(), encounter.getEncBasedonReferenceDisplay());
		e.addBasedOn(BasedOnreference);
		
		/******************** ENC_PARTICIPANT *********************************************************************
		 * ENC_PARTICIPANT maps to Encounter / participant
		 ********************************************************************************************************************/
		
		EncounterParticipantComponent encparticipant = e.addParticipant();
		CodeableConcept encparticipanttype = new CodeableConcept();
		encparticipanttype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.250", "4.0.1", encounter.getEncParticipantTypeCodeableconceptCodingCode(), encounter.getEncParticipantTypeCodeableconceptCodingDisplay(),encounter.getEncParticipantTypeCodeableconceptCodingUserselected()));
		encparticipanttype.setText(encounter.getEncParticipantTypeText());
		encparticipant.addType(encparticipanttype);
		encparticipant.setPeriod(createPeriod(encounter.getEncParticipantPeriodStart(),encounter.getEncParticipantPeriodEnd()));
		encparticipant.setIndividual(createReference(encounter.getEncParticipantIndividualReferenceReference(), encounter.getEncParticipantIndividualReferenceType(), encounter.getEncParticipantIndividualReferenceIdentifier(), encounter.getEncParticipantIndividualReferenceDisplay()));

		
		/******************** ENC_APPOINTMENT *********************************************************************
		 * ENC_APPOINTMENT maps to Encounter / appointment
		 ********************************************************************************************************************/
	
		e.addAppointment(createReference(encounter.getEncAppointmentReferenceReference(),encounter.getEncAppointmentReferenceType(),encounter.getEncAppointmentReferenceIdentifier(),encounter.getEncAppointmentReferenceDisplay()));
		
		/******************** ENC_PERIOD *********************************************************************
		 * ENC_PERIOD maps to Encounter / period
		 ********************************************************************************************************************/		
		
		e.setPeriod(createPeriod(encounter.getEncPeriodStart(),encounter.getEncPeriodEnd()));
		
		/******************** ENC_LENGTH *********************************************************************
		 * ENC_LENGTH maps to Encounter / length
		 ********************************************************************************************************************/	
		Duration len = new Duration();
		DecimalType lenval = new DecimalType(encounter.getEncLengthValue());
		len.setValueElement(lenval);
		len.setUnit(encounter.getEncLengthUnit());
		e.setLength(len);
		
		/******************** ENC_REASONCODE *********************************************************************
		 * ENC_REASONCODE maps to Encounter / reasonCode
		 ********************************************************************************************************************/	
		
		CodeableConcept encreasoncode = new CodeableConcept();
		encreasoncode.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.261", "4.0.1", encounter.getEncReasoncodeCodeableconceptCodingCode(), encounter.getEncReasoncodeCodeableconceptCodingDisplay(),encounter.getEncReasoncodeCodeableconceptCodingUserselected()));
		encreasoncode.setText(encounter.getEncReasoncodeCodeableconceptText());
		e.addReasonCode(encreasoncode);
		
		/******************** ENC_REASONREFERENCE *********************************************************************
		 * ENC_REASONCODE maps to Encounter / reasonReference
		 ********************************************************************************************************************/	
		e.addReasonReference(createReference(encounter.getEncReasonreferenceReferenceReference(),encounter.getEncReasonreferenceReferenceType(),encounter.getEncReasonreferenceReferenceIdentifier(),encounter.getEncReasonreferenceReferenceDisplay()));

		/******************** ENC_DIAGNOSIS *********************************************************************
		 * ENC_DIAGNOSIS maps to Encounter / diagnosis
		 ********************************************************************************************************************/	
		DiagnosisComponent diagnoiscomponent = e.addDiagnosis();
		CodeableConcept diagnosisuse = new CodeableConcept();
		
		/******************** ENC_DIAGNOSIS_CONDITION_REFERENCE *****************************************************************************
		 *  ENC_DIAGN_CON_REF maps to Encounter / diagnosis / condition / reference
		 ********************************************************************************************************************/
		
		diagnoiscomponent.setCondition(createReference(encounter.getEncDiagnosisConditionReferenceReference(),encounter.getEncDiagnosisConditionReferenceType(),encounter.getEncDiagnosisConditionReferenceIdentifier(),encounter.getEncDiagnosisConditionReferenceDisplay()));
		
		/******************** ENC_DIAGNOSIS_USE *****************************************************************************
		 *  ENC_DIAGNOSIS_USE maps to Encounter / diagnosis / use 
		 ********************************************************************************************************************/
		
		CodeableConcept encdiagusecode = new CodeableConcept();
		encdiagusecode.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.49", "4.0.1", encounter.getEncDiagnosisUseCodeableconceptCodingCode(), encounter.getEncDiagnosisUseCodeableconceptCodingDisplay(),encounter.getEncDiagnosisUseCodeableconceptCodingUserselected()));
		encdiagusecode.setText(encounter.getEncDiagnosisUseCodeableconceptText());
		diagnoiscomponent.setUse(encdiagusecode);
		
		/******************** ENC_DIAGN_RANK ********************************************************************************
		 *  ENC_DIAGN_RANK  maps to Encounter / diagnosis / rank
		 ********************************************************************************************************************/
		if(encounter.getEncDiagnosisRank() != null)
		{
			diagnoiscomponent.setRank(Integer.parseInt(encounter.getEncDiagnosisRank()));
		}
		
		/******************** ENC_ACCOUNT ********************************************************************************
		 *  ENC_ACCOUNT  maps to Encounter / account
		 ********************************************************************************************************************/
		
		e.addAccount(createReference(encounter.getEncAccountReferenceReference(),encounter.getEncAccountReferenceType(),encounter.getEncAccountReferenceIdentifier(),encounter.getEncAccountReferenceDisplay()));

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
		
		elc.setLocation(createReference(encounter.getEncLocationLocationReferenceReference(),encounter.getEncLocationLocationReferenceType(),encounter.getEncLocationLocationReferenceIdentifier(),encounter.getEncLocationLocationReferenceDisplay()));
		
		EncounterLocationStatusEnumFactory enclocstatusfact = new EncounterLocationStatusEnumFactory();
		//elc.setStatus((EncounterLocationStatus) enclocstatusfact.fromCode(encounter.getEncLocationStatus()));
		
		CodeableConcept enclocphystype = new CodeableConcept();
		enclocphystype.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.257", "4.0.1", encounter.getEncLocationPhysicaltypeCodeableconceptCodingCode(), encounter.getEncLocationPhysicaltypeCodeableconceptCodingDisplay(),encounter.getEncLocationPhysicaltypeCodeableconceptCodingUserselected()));
		enclocphystype.setText(encounter.getEncLocationPhysicaltypeCodeableconceptText());
		elc.setPhysicalType(enclocphystype);
		
		Period enclocationperiod = createPeriod(encounter.getEncLocationPeriodStart(), encounter.getEncLocationPeriodEnd());
		elc.setPeriod(enclocationperiod);
		
		/******************** ENC_SERVICEPROVIDER ******************************************************************
		 * ENC_SERVICEPROVIDER  maps to Encounter / serviceProvider 
		 ********************************************************************************************************************/
		
		e.addAccount(createReference(encounter.getEncServiceproviderReferenceReference(),encounter.getEncServiceproviderReferenceType(),encounter.getEncServiceproviderReferenceIdentifier(),encounter.getEncServiceproviderReferenceDisplay()));

		/******************** ENC_PARTOF ******************************************************************
		 * ENC_PARTOF  maps to Encounter / partOf 
		 ********************************************************************************************************************/
		
		e.addAccount(createReference(encounter.getEncPartofReferenceReference(),encounter.getEncPartofReferenceType(),encounter.getEncPartofReferenceIdentifier(),encounter.getEncPartofReferenceDisplay()));	
		
		return e;
	}
	

	public static  EncounterHospitalizationComponent setDischargeDisp(Encounter encounter) throws FHIRException, ParseException
	{
		EncounterHospitalizationComponent ehc = new EncounterHospitalizationComponent();
		Identifier preAdmissionIdentifier = new Identifier();
		
		/******************** ENC_HOSPITALIZATION ******************************************************************
		 * ENC_HOSP_DISDISP_CODING_CODE maps to Encounter / hospitalization 
		 ********************************************************************************************************************/
		
		ehc.setPreAdmissionIdentifier(preAdmissionIdentifier.setValue(encounter.getEncHspPreadmissionidentifier()));
		
		ehc.setOrigin(createReference(encounter.getEncHspOriginReferenceReference(),encounter.getEncHspOriginReferenceType(),encounter.getEncHspOriginReferenceIdentifier(),encounter.getEncHspOriginReferenceDisplay()));

		CodeableConcept enchospadmitsrc = new CodeableConcept();
		enchospadmitsrc.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.257", "4.0.1", encounter.getEncHspAdmitsourceCodeableconceptCodingCode(), encounter.getEncHspAdmitsourceCodeableconceptCodingDisplay(),encounter.getEncHspAdmitsourceCodeableconceptCodingUserselected()));
		enchospadmitsrc.setText(encounter.getEncHspAdmitsourceCodeableconceptText());
		ehc.setAdmitSource(enchospadmitsrc);
		
		
		CodeableConcept enchospreadmin = new CodeableConcept();
		enchospreadmin.addCoding(createCoding("http://terminology.hl7.org/ValueSet/v2-0092", "v2.0092", encounter.getEncHspReadmissionCodeableconceptCodingCode(), encounter.getEncHspReadmissionCodeableconceptCodingDisplay(),encounter.getEncHspReadmissionCodeableconceptCodingUserselected()));
		enchospreadmin.setText(encounter.getEncHspReadmissionCodeableconceptText());
		ehc.setReAdmission(enchospreadmin);
		
		CodeableConcept enchospdietpref = new CodeableConcept();
		enchospdietpref.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.255", "4.0.1", encounter.getEncHspDietpreferenceCodeableconceptCodingCode(), encounter.getEncHspDietpreferenceCodeableconceptCodingDisplay(),encounter.getEncHspDietpreferenceCodeableconceptCodingUserselected()));
		enchospdietpref.setText(encounter.getEncHspDietpreferenceCodeableconceptText());
		ehc.addDietPreference(enchospdietpref);
		
		CodeableConcept enchospspeccourt = new CodeableConcept();
		enchospspeccourt.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.252", "4.0.1", encounter.getEncHspSpecialcourtesyCodeableconceptCodingCode(), encounter.getEncHspSpecialcourtesyCodeableconceptCodingDisplay(),encounter.getEncHspSpecialcourtesyCodeableconceptCodingUserselected()));
		enchospspeccourt.setText(encounter.getEncHspSpecialcourtesyCodeableconceptText());
		ehc.addSpecialCourtesy(enchospspeccourt);
		
		CodeableConcept enchospspecarrangement = new CodeableConcept();
		enchospspecarrangement.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.253", "4.0.1", encounter.getEncHspSpecialarrangementCodeableconceptCodingCode(), encounter.getEncHspSpecialarrangementCodeableconceptCodingDisplay(),encounter.getEncHspSpecialarrangementCodeableconceptCodingUserselected()));
		enchospspecarrangement.setText(encounter.getEncHspSpecialarrangementCodeableconceptText());
		ehc.addSpecialArrangement(enchospspecarrangement);
		
		ehc.setDestination(createReference(encounter.getEncHspDestinationReferenceReference(),encounter.getEncHspDestinationReferenceType(),encounter.getEncHspDestinationReferenceIdentifier(),encounter.getEncHspDestinationReferenceDisplay()));
		
		CodeableConcept enchospdischdisp = new CodeableConcept();
		enchospdischdisp.addCoding(createCoding("urn:oid:2.16.840.1.113883.4.642.3.259", "4.0.1", encounter.getEncHspDischargedispositionCodeableconceptCodingCode(), encounter.getEncHspDischargedispositionCodeableconceptCodingDisplay(),encounter.getEncHspDischargedispositionCodeableconceptCodingUserselected()));
		enchospdischdisp.setText(encounter.getEncHspDischargedispositionCodeableconceptText());
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
