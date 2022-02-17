package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentReference;
public class DocumentReferenceConversion 
{
	public org.hl7.fhir.r4.model.DocumentReference DocumentReferences(DocumentReference d) throws ParseException
	{
		org.hl7.fhir.r4.model.DocumentReference documentreference = new org.hl7.fhir.r4.model.DocumentReference();
		/******************** Documentreference_Authenticator ********************************************************************************/
		if(d.getDocumentreferenceAuthenticator() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceAuthenticatorref = new org.hl7.fhir.r4.model.Reference();
			documentreference.setAuthenticator(DocumentreferenceAuthenticatorref.setReference(d.getDocumentreferenceAuthenticator()));
		}
		/******************** Documentreference_Author ********************************************************************************/
		if(d.getDocumentreferenceAuthor() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceAuthorref = new org.hl7.fhir.r4.model.Reference();
			documentreference.addAuthor(DocumentreferenceAuthorref.setReference(d.getDocumentreferenceAuthor()));
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferenceaddcategory = documentreference.addCategory();


		org.hl7.fhir.r4.model.Coding documentreferenceaddcategoryaddcoding = documentreferenceaddcategory.addCoding();

		/******************** Documentreference_Category_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceCategoryCodingCode() != null) {
			documentreferenceaddcategoryaddcoding.setCode(d.getDocumentreferenceCategoryCodingCode());
		}
		/******************** Documentreference_Category_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceCategoryCodingDisplay() != null) {
			documentreferenceaddcategoryaddcoding.setDisplay(d.getDocumentreferenceCategoryCodingDisplay());
		}
		/******************** Documentreference_Category_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceCategoryCodingSystem() != null) {
			documentreferenceaddcategoryaddcoding.setSystem(d.getDocumentreferenceCategoryCodingSystem());
		}
		/******************** Documentreference_Category_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceCategoryCodingUserSelected() != null) {
			documentreferenceaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceCategoryCodingUserSelected()));
		}
		/******************** Documentreference_Category_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceCategoryCodingVersion() != null) {
			documentreferenceaddcategoryaddcoding.setVersion(d.getDocumentreferenceCategoryCodingVersion());
		}
		/******************** Documentreference_Category_Text ********************************************************************************/
		if(d.getDocumentreferenceCategoryText() != null) {
			documentreferenceaddcategory.setText(d.getDocumentreferenceCategoryText());
		}

		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent documentreferenceaddcontent = documentreference.addContent();


		org.hl7.fhir.r4.model.Attachment documentreferenceaddcontentsetattachment = new org.hl7.fhir.r4.model.Attachment();
		documentreferenceaddcontent.setAttachment(documentreferenceaddcontentsetattachment);

		/******************** Documentreference_Content_Attachment_ContentType ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentContentType() != null) {
			documentreferenceaddcontentsetattachment.setContentType(d.getDocumentreferenceContentAttachmentContentType());
		}
		/******************** Documentreference_Content_Attachment_Creation ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentCreation() != null) {
			java.text.SimpleDateFormat DocumentreferenceContentAttachmentCreationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceContentAttachmentCreationdate = DocumentreferenceContentAttachmentCreationsdf.parse(d.getDocumentreferenceContentAttachmentCreation());
			documentreferenceaddcontentsetattachment.setCreation(DocumentreferenceContentAttachmentCreationdate);
		}
		/******************** Documentreference_Content_Attachment_Data ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentData() != null) {
			documentreferenceaddcontentsetattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDocumentreferenceContentAttachmentData()));
		}
		/******************** Documentreference_Content_Attachment_Hash ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentHash() != null) {
			documentreferenceaddcontentsetattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDocumentreferenceContentAttachmentHash()));
		}
		/******************** Documentreference_Content_Attachment_Language ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentLanguage() != null) {
			documentreferenceaddcontentsetattachment.setLanguage(d.getDocumentreferenceContentAttachmentLanguage());
		}
		/******************** Documentreference_Content_Attachment_Size ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentSize() != null) {
			documentreferenceaddcontentsetattachment.setSize(Integer.parseInt(d.getDocumentreferenceContentAttachmentSize()));
		}
		/******************** Documentreference_Content_Attachment_Title ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentTitle() != null) {
			documentreferenceaddcontentsetattachment.setTitle(d.getDocumentreferenceContentAttachmentTitle());
		}
		/******************** Documentreference_Content_Attachment_Url ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentUrl() != null) {
			documentreferenceaddcontentsetattachment.setUrl(d.getDocumentreferenceContentAttachmentUrl());
		}

		org.hl7.fhir.r4.model.Coding documentreferenceaddcontentsetformat = new org.hl7.fhir.r4.model.Coding();
		documentreferenceaddcontent.setFormat(documentreferenceaddcontentsetformat);

		/******************** Documentreference_Content_Format_Code ********************************************************************************/
		if(d.getDocumentreferenceContentFormatCode() != null) {
			documentreferenceaddcontentsetformat.setCode(d.getDocumentreferenceContentFormatCode());
		}
		/******************** Documentreference_Content_Format_Display ********************************************************************************/
		if(d.getDocumentreferenceContentFormatDisplay() != null) {
			documentreferenceaddcontentsetformat.setDisplay(d.getDocumentreferenceContentFormatDisplay());
		}
		/******************** Documentreference_Content_Format_System ********************************************************************************/
		if(d.getDocumentreferenceContentFormatSystem() != null) {
			documentreferenceaddcontentsetformat.setSystem(d.getDocumentreferenceContentFormatSystem());
		}
		/******************** Documentreference_Content_Format_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceContentFormatUserSelected() != null) {
			documentreferenceaddcontentsetformat.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContentFormatUserSelected()));
		}
		/******************** Documentreference_Content_Format_Version ********************************************************************************/
		if(d.getDocumentreferenceContentFormatVersion() != null) {
			documentreferenceaddcontentsetformat.setVersion(d.getDocumentreferenceContentFormatVersion());
		}

		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent documentreferencesetcontext = new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent();
		documentreference.setContext(documentreferencesetcontext);

		/******************** Documentreference_Context_Encounter ********************************************************************************/
		if(d.getDocumentreferenceContextEncounter() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceContextEncounterref = new org.hl7.fhir.r4.model.Reference();
			documentreferencesetcontext.addEncounter(DocumentreferenceContextEncounterref.setReference(d.getDocumentreferenceContextEncounter()));
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferencesetcontextaddevent = documentreferencesetcontext.addEvent();


		org.hl7.fhir.r4.model.Coding documentreferencesetcontextaddeventaddcoding = documentreferencesetcontextaddevent.addCoding();

		/******************** Documentreference_Context_Event_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceContextEventCodingCode() != null) {
			documentreferencesetcontextaddeventaddcoding.setCode(d.getDocumentreferenceContextEventCodingCode());
		}
		/******************** Documentreference_Context_Event_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceContextEventCodingDisplay() != null) {
			documentreferencesetcontextaddeventaddcoding.setDisplay(d.getDocumentreferenceContextEventCodingDisplay());
		}
		/******************** Documentreference_Context_Event_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceContextEventCodingSystem() != null) {
			documentreferencesetcontextaddeventaddcoding.setSystem(d.getDocumentreferenceContextEventCodingSystem());
		}
		/******************** Documentreference_Context_Event_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceContextEventCodingUserSelected() != null) {
			documentreferencesetcontextaddeventaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContextEventCodingUserSelected()));
		}
		/******************** Documentreference_Context_Event_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceContextEventCodingVersion() != null) {
			documentreferencesetcontextaddeventaddcoding.setVersion(d.getDocumentreferenceContextEventCodingVersion());
		}
		/******************** Documentreference_Context_Event_Text ********************************************************************************/
		if(d.getDocumentreferenceContextEventText() != null) {
			documentreferencesetcontextaddevent.setText(d.getDocumentreferenceContextEventText());
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferencesetcontextsetfacilitytype = new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencesetcontext.setFacilityType(documentreferencesetcontextsetfacilitytype);


		org.hl7.fhir.r4.model.Coding documentreferencesetcontextsetfacilitytypeaddcoding = documentreferencesetcontextsetfacilitytype.addCoding();

		/******************** Documentreference_Context_FacilityType_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceContextFacilityTypeCodingCode() != null) {
			documentreferencesetcontextsetfacilitytypeaddcoding.setCode(d.getDocumentreferenceContextFacilityTypeCodingCode());
		}
		/******************** Documentreference_Context_FacilityType_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceContextFacilityTypeCodingDisplay() != null) {
			documentreferencesetcontextsetfacilitytypeaddcoding.setDisplay(d.getDocumentreferenceContextFacilityTypeCodingDisplay());
		}
		/******************** Documentreference_Context_FacilityType_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceContextFacilityTypeCodingSystem() != null) {
			documentreferencesetcontextsetfacilitytypeaddcoding.setSystem(d.getDocumentreferenceContextFacilityTypeCodingSystem());
		}
		/******************** Documentreference_Context_FacilityType_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceContextFacilityTypeCodingUserSelected() != null) {
			documentreferencesetcontextsetfacilitytypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContextFacilityTypeCodingUserSelected()));
		}
		/******************** Documentreference_Context_FacilityType_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceContextFacilityTypeCodingVersion() != null) {
			documentreferencesetcontextsetfacilitytypeaddcoding.setVersion(d.getDocumentreferenceContextFacilityTypeCodingVersion());
		}
		/******************** Documentreference_Context_FacilityType_Text ********************************************************************************/
		if(d.getDocumentreferenceContextFacilityTypeText() != null) {
			documentreferencesetcontextsetfacilitytype.setText(d.getDocumentreferenceContextFacilityTypeText());
		}

		org.hl7.fhir.r4.model.Period documentreferencesetcontextsetperiod = new org.hl7.fhir.r4.model.Period();
		documentreferencesetcontext.setPeriod(documentreferencesetcontextsetperiod);

		/******************** Documentreference_Context_Period_End ********************************************************************************/
		if(d.getDocumentreferenceContextPeriodEnd() != null) {
			java.text.SimpleDateFormat DocumentreferenceContextPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceContextPeriodEnddate = DocumentreferenceContextPeriodEndsdf.parse(d.getDocumentreferenceContextPeriodEnd());
			documentreferencesetcontextsetperiod.setEnd(DocumentreferenceContextPeriodEnddate);
		}
		/******************** Documentreference_Context_Period_Start ********************************************************************************/
		if(d.getDocumentreferenceContextPeriodStart() != null) {
			java.text.SimpleDateFormat DocumentreferenceContextPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceContextPeriodStartdate = DocumentreferenceContextPeriodStartsdf.parse(d.getDocumentreferenceContextPeriodStart());
			documentreferencesetcontextsetperiod.setStart(DocumentreferenceContextPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferencesetcontextsetpracticesetting = new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencesetcontext.setPracticeSetting(documentreferencesetcontextsetpracticesetting);


		org.hl7.fhir.r4.model.Coding documentreferencesetcontextsetpracticesettingaddcoding = documentreferencesetcontextsetpracticesetting.addCoding();

		/******************** Documentreference_Context_PracticeSetting_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceContextPracticeSettingCodingCode() != null) {
			documentreferencesetcontextsetpracticesettingaddcoding.setCode(d.getDocumentreferenceContextPracticeSettingCodingCode());
		}
		/******************** Documentreference_Context_PracticeSetting_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceContextPracticeSettingCodingDisplay() != null) {
			documentreferencesetcontextsetpracticesettingaddcoding.setDisplay(d.getDocumentreferenceContextPracticeSettingCodingDisplay());
		}
		/******************** Documentreference_Context_PracticeSetting_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceContextPracticeSettingCodingSystem() != null) {
			documentreferencesetcontextsetpracticesettingaddcoding.setSystem(d.getDocumentreferenceContextPracticeSettingCodingSystem());
		}
		/******************** Documentreference_Context_PracticeSetting_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceContextPracticeSettingCodingUserSelected() != null) {
			documentreferencesetcontextsetpracticesettingaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContextPracticeSettingCodingUserSelected()));
		}
		/******************** Documentreference_Context_PracticeSetting_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceContextPracticeSettingCodingVersion() != null) {
			documentreferencesetcontextsetpracticesettingaddcoding.setVersion(d.getDocumentreferenceContextPracticeSettingCodingVersion());
		}
		/******************** Documentreference_Context_PracticeSetting_Text ********************************************************************************/
		if(d.getDocumentreferenceContextPracticeSettingText() != null) {
			documentreferencesetcontextsetpracticesetting.setText(d.getDocumentreferenceContextPracticeSettingText());
		}
		/******************** Documentreference_Context_Related ********************************************************************************/
		if(d.getDocumentreferenceContextRelated() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceContextRelatedref = new org.hl7.fhir.r4.model.Reference();
			documentreferencesetcontext.addRelated(DocumentreferenceContextRelatedref.setReference(d.getDocumentreferenceContextRelated()));
		}
		/******************** Documentreference_Context_SourcePatientInfo ********************************************************************************/
		if(d.getDocumentreferenceContextSourcePatientInfo() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceContextSourcePatientInforef = new org.hl7.fhir.r4.model.Reference();
			documentreferencesetcontext.setSourcePatientInfo(DocumentreferenceContextSourcePatientInforef.setReference(d.getDocumentreferenceContextSourcePatientInfo()));
		}
		/******************** Documentreference_Custodian ********************************************************************************/
		if(d.getDocumentreferenceCustodian() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceCustodianref = new org.hl7.fhir.r4.model.Reference();
			documentreference.setCustodian(DocumentreferenceCustodianref.setReference(d.getDocumentreferenceCustodian()));
		}
		/******************** Documentreference_Date ********************************************************************************/
		if(d.getDocumentreferenceDate() != null) {
			java.text.SimpleDateFormat DocumentreferenceDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceDatedate = DocumentreferenceDatesdf.parse(d.getDocumentreferenceDate());
			documentreference.setDate(DocumentreferenceDatedate);
		}
		/******************** Documentreference_Description ********************************************************************************/
		if(d.getDocumentreferenceDescription() != null) {
			documentreference.setDescription(d.getDocumentreferenceDescription());
		}

		org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatusEnumFactory documentreferencesetdocstatusEnumFactory = new org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatusEnumFactory();

		/******************** Documentreference_DocStatus_Code ********************************************************************************/
		if(d.getDocumentreferenceDocStatusCode() != null) {
			documentreference.setDocStatus(documentreferencesetdocstatusEnumFactory.fromCode(d.getDocumentreferenceDocStatusCode()));

		}

		org.hl7.fhir.r4.model.Identifier documentreferenceaddidentifier = documentreference.addIdentifier();

		/******************** Documentreference_Identifier_Assigner ********************************************************************************/
		if(d.getDocumentreferenceIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			documentreferenceaddidentifier.setAssigner(DocumentreferenceIdentifierAssignerref.setReference(d.getDocumentreferenceIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period documentreferenceaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		documentreferenceaddidentifier.setPeriod(documentreferenceaddidentifiersetperiod);

		/******************** Documentreference_Identifier_Period_End ********************************************************************************/
		if(d.getDocumentreferenceIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat DocumentreferenceIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceIdentifierPeriodEnddate = DocumentreferenceIdentifierPeriodEndsdf.parse(d.getDocumentreferenceIdentifierPeriodEnd());
			documentreferenceaddidentifiersetperiod.setEnd(DocumentreferenceIdentifierPeriodEnddate);
		}
		/******************** Documentreference_Identifier_Period_Start ********************************************************************************/
		if(d.getDocumentreferenceIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat DocumentreferenceIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceIdentifierPeriodStartdate = DocumentreferenceIdentifierPeriodStartsdf.parse(d.getDocumentreferenceIdentifierPeriodStart());
			documentreferenceaddidentifiersetperiod.setStart(DocumentreferenceIdentifierPeriodStartdate);
		}
		/******************** Documentreference_Identifier_System ********************************************************************************/
		if(d.getDocumentreferenceIdentifierSystem() != null) {
			documentreferenceaddidentifier.setSystem(d.getDocumentreferenceIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferenceaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferenceaddidentifier.setType(documentreferenceaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding documentreferenceaddidentifiersettypeaddcoding = documentreferenceaddidentifiersettype.addCoding();

		/******************** Documentreference_Identifier_Type_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceIdentifierTypeCodingCode() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setCode(d.getDocumentreferenceIdentifierTypeCodingCode());
		}
		/******************** Documentreference_Identifier_Type_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceIdentifierTypeCodingDisplay() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setDisplay(d.getDocumentreferenceIdentifierTypeCodingDisplay());
		}
		/******************** Documentreference_Identifier_Type_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceIdentifierTypeCodingSystem() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setSystem(d.getDocumentreferenceIdentifierTypeCodingSystem());
		}
		/******************** Documentreference_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceIdentifierTypeCodingUserSelected() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceIdentifierTypeCodingUserSelected()));
		}
		/******************** Documentreference_Identifier_Type_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceIdentifierTypeCodingVersion() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setVersion(d.getDocumentreferenceIdentifierTypeCodingVersion());
		}
		/******************** Documentreference_Identifier_Type_Text ********************************************************************************/
		if(d.getDocumentreferenceIdentifierTypeText() != null) {
			documentreferenceaddidentifiersettype.setText(d.getDocumentreferenceIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentreferenceaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Documentreference_Identifier_Use_Code ********************************************************************************/
		if(d.getDocumentreferenceIdentifierUseCode() != null) {
			documentreferenceaddidentifier.setUse(documentreferenceaddidentifiersetuseEnumFactory.fromCode(d.getDocumentreferenceIdentifierUseCode()));

		}
		/******************** Documentreference_Identifier_Value ********************************************************************************/
		if(d.getDocumentreferenceIdentifierValue() != null) {
			documentreferenceaddidentifier.setValue(d.getDocumentreferenceIdentifierValue());
		}

		org.hl7.fhir.r4.model.Identifier documentreferencesetmasteridentifier = new org.hl7.fhir.r4.model.Identifier();
		documentreference.setMasterIdentifier(documentreferencesetmasteridentifier);

		/******************** Documentreference_MasterIdentifier_Assigner ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceMasterIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			documentreferencesetmasteridentifier.setAssigner(DocumentreferenceMasterIdentifierAssignerref.setReference(d.getDocumentreferenceMasterIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period documentreferencesetmasteridentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		documentreferencesetmasteridentifier.setPeriod(documentreferencesetmasteridentifiersetperiod);

		/******************** Documentreference_MasterIdentifier_Period_End ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat DocumentreferenceMasterIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceMasterIdentifierPeriodEnddate = DocumentreferenceMasterIdentifierPeriodEndsdf.parse(d.getDocumentreferenceMasterIdentifierPeriodEnd());
			documentreferencesetmasteridentifiersetperiod.setEnd(DocumentreferenceMasterIdentifierPeriodEnddate);
		}
		/******************** Documentreference_MasterIdentifier_Period_Start ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat DocumentreferenceMasterIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceMasterIdentifierPeriodStartdate = DocumentreferenceMasterIdentifierPeriodStartsdf.parse(d.getDocumentreferenceMasterIdentifierPeriodStart());
			documentreferencesetmasteridentifiersetperiod.setStart(DocumentreferenceMasterIdentifierPeriodStartdate);
		}
		/******************** Documentreference_MasterIdentifier_System ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierSystem() != null) {
			documentreferencesetmasteridentifier.setSystem(d.getDocumentreferenceMasterIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferencesetmasteridentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencesetmasteridentifier.setType(documentreferencesetmasteridentifiersettype);


		org.hl7.fhir.r4.model.Coding documentreferencesetmasteridentifiersettypeaddcoding = documentreferencesetmasteridentifiersettype.addCoding();

		/******************** Documentreference_MasterIdentifier_Type_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierTypeCodingCode() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setCode(d.getDocumentreferenceMasterIdentifierTypeCodingCode());
		}
		/******************** Documentreference_MasterIdentifier_Type_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierTypeCodingDisplay() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setDisplay(d.getDocumentreferenceMasterIdentifierTypeCodingDisplay());
		}
		/******************** Documentreference_MasterIdentifier_Type_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierTypeCodingSystem() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setSystem(d.getDocumentreferenceMasterIdentifierTypeCodingSystem());
		}
		/******************** Documentreference_MasterIdentifier_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierTypeCodingUserSelected() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceMasterIdentifierTypeCodingUserSelected()));
		}
		/******************** Documentreference_MasterIdentifier_Type_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierTypeCodingVersion() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setVersion(d.getDocumentreferenceMasterIdentifierTypeCodingVersion());
		}
		/******************** Documentreference_MasterIdentifier_Type_Text ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierTypeText() != null) {
			documentreferencesetmasteridentifiersettype.setText(d.getDocumentreferenceMasterIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentreferencesetmasteridentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Documentreference_MasterIdentifier_Use_Code ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierUseCode() != null) {
			documentreferencesetmasteridentifier.setUse(documentreferencesetmasteridentifiersetuseEnumFactory.fromCode(d.getDocumentreferenceMasterIdentifierUseCode()));

		}
		/******************** Documentreference_MasterIdentifier_Value ********************************************************************************/
		if(d.getDocumentreferenceMasterIdentifierValue() != null) {
			documentreferencesetmasteridentifier.setValue(d.getDocumentreferenceMasterIdentifierValue());
		}

		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent documentreferenceaddrelatesto = documentreference.addRelatesTo();


		org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipTypeEnumFactory documentreferenceaddrelatestosetcodeEnumFactory = new org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipTypeEnumFactory();

		/******************** Documentreference_RelatesTo_Code_Code ********************************************************************************/
		if(d.getDocumentreferenceRelatesToCodeCode() != null) {
			documentreferenceaddrelatesto.setCode(documentreferenceaddrelatestosetcodeEnumFactory.fromCode(d.getDocumentreferenceRelatesToCodeCode()));

		}
		/******************** Documentreference_RelatesTo_ ********************************************************************************/
		if(d.getDocumentreferenceRelatesTo() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceRelatesToref = new org.hl7.fhir.r4.model.Reference();
			documentreferenceaddrelatesto.setTarget(DocumentreferenceRelatesToref.setReference(d.getDocumentreferenceRelatesTo()));
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferenceaddsecuritylabel = documentreference.addSecurityLabel();


		org.hl7.fhir.r4.model.Coding documentreferenceaddsecuritylabeladdcoding = documentreferenceaddsecuritylabel.addCoding();

		/******************** Documentreference_SecurityLabel_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceSecurityLabelCodingCode() != null) {
			documentreferenceaddsecuritylabeladdcoding.setCode(d.getDocumentreferenceSecurityLabelCodingCode());
		}
		/******************** Documentreference_SecurityLabel_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceSecurityLabelCodingDisplay() != null) {
			documentreferenceaddsecuritylabeladdcoding.setDisplay(d.getDocumentreferenceSecurityLabelCodingDisplay());
		}
		/******************** Documentreference_SecurityLabel_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceSecurityLabelCodingSystem() != null) {
			documentreferenceaddsecuritylabeladdcoding.setSystem(d.getDocumentreferenceSecurityLabelCodingSystem());
		}
		/******************** Documentreference_SecurityLabel_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceSecurityLabelCodingUserSelected() != null) {
			documentreferenceaddsecuritylabeladdcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceSecurityLabelCodingUserSelected()));
		}
		/******************** Documentreference_SecurityLabel_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceSecurityLabelCodingVersion() != null) {
			documentreferenceaddsecuritylabeladdcoding.setVersion(d.getDocumentreferenceSecurityLabelCodingVersion());
		}
		/******************** Documentreference_SecurityLabel_Text ********************************************************************************/
		if(d.getDocumentreferenceSecurityLabelText() != null) {
			documentreferenceaddsecuritylabel.setText(d.getDocumentreferenceSecurityLabelText());
		}

		org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory documentreferencesetstatusEnumFactory = new org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory();

		/******************** Documentreference_Status_Code ********************************************************************************/
		if(d.getDocumentreferenceStatusCode() != null) {
			documentreference.setStatus(documentreferencesetstatusEnumFactory.fromCode(d.getDocumentreferenceStatusCode()));

		}
		/******************** Documentreference_Subject ********************************************************************************/
		if(d.getDocumentreferenceSubject() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceSubjectref = new org.hl7.fhir.r4.model.Reference();
			documentreference.setSubject(DocumentreferenceSubjectref.setReference(d.getDocumentreferenceSubject()));
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferencesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		documentreference.setType(documentreferencesettype);


		org.hl7.fhir.r4.model.Coding documentreferencesettypeaddcoding = documentreferencesettype.addCoding();

		/******************** Documentreference_Type_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceTypeCodingCode() != null) {
			documentreferencesettypeaddcoding.setCode(d.getDocumentreferenceTypeCodingCode());
		}
		/******************** Documentreference_Type_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceTypeCodingDisplay() != null) {
			documentreferencesettypeaddcoding.setDisplay(d.getDocumentreferenceTypeCodingDisplay());
		}
		/******************** Documentreference_Type_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceTypeCodingSystem() != null) {
			documentreferencesettypeaddcoding.setSystem(d.getDocumentreferenceTypeCodingSystem());
		}
		/******************** Documentreference_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDocumentreferenceTypeCodingUserSelected() != null) {
			documentreferencesettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceTypeCodingUserSelected()));
		}
		/******************** Documentreference_Type_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceTypeCodingVersion() != null) {
			documentreferencesettypeaddcoding.setVersion(d.getDocumentreferenceTypeCodingVersion());
		}
		return documentreference;
	}
}
