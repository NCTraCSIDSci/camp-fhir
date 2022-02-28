package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentReference;
public class DocumentReferenceConversion 
{
	public org.hl7.fhir.r4.model.DocumentReference DocumentReferences(DocumentReference d) throws ParseException
	{
		org.hl7.fhir.r4.model.DocumentReference documentreference = new org.hl7.fhir.r4.model.DocumentReference();

		/******************** id ********************************************************************************/
		documentreference.setId(d.getId());

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
		/******************** Documentreference_Category_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceCategoryCodingUsrslt() != null) {
			documentreferenceaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceCategoryCodingUsrslt()));
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
		/******************** Documentreference_Content_Attachment_Lang ********************************************************************************/
		if(d.getDocumentreferenceContentAttachmentLang() != null) {
			documentreferenceaddcontentsetattachment.setLanguage(d.getDocumentreferenceContentAttachmentLang());
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
		/******************** Documentreference_Content_Format_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceContentFormatUsrslt() != null) {
			documentreferenceaddcontentsetformat.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContentFormatUsrslt()));
		}
		/******************** Documentreference_Content_Format_Version ********************************************************************************/
		if(d.getDocumentreferenceContentFormatVersion() != null) {
			documentreferenceaddcontentsetformat.setVersion(d.getDocumentreferenceContentFormatVersion());
		}

		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent documentreferencesetcontext = new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent();
		documentreference.setContext(documentreferencesetcontext);

		/******************** Documentreference_Context_Enc ********************************************************************************/
		if(d.getDocumentreferenceContextEnc() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceContextEncref = new org.hl7.fhir.r4.model.Reference();
			documentreferencesetcontext.addEncounter(DocumentreferenceContextEncref.setReference(d.getDocumentreferenceContextEnc()));
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
		/******************** Documentreference_Context_Event_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceContextEventCodingUsrslt() != null) {
			documentreferencesetcontextaddeventaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContextEventCodingUsrslt()));
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
		/******************** Documentreference_Context_FacilityType_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceContextFacilityTypeCodingUsrslt() != null) {
			documentreferencesetcontextsetfacilitytypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContextFacilityTypeCodingUsrslt()));
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
		/******************** Documentreference_Context_PracticeSetting_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceContextPracticeSettingCodingUsrslt() != null) {
			documentreferencesetcontextsetpracticesettingaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceContextPracticeSettingCodingUsrslt()));
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

		/******************** Documentreference_Id_Assigner ********************************************************************************/
		if(d.getDocumentreferenceIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			documentreferenceaddidentifier.setAssigner(DocumentreferenceIdAssignerref.setReference(d.getDocumentreferenceIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period documentreferenceaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		documentreferenceaddidentifier.setPeriod(documentreferenceaddidentifiersetperiod);

		/******************** Documentreference_Id_Period_End ********************************************************************************/
		if(d.getDocumentreferenceIdPeriodEnd() != null) {
			java.text.SimpleDateFormat DocumentreferenceIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceIdPeriodEnddate = DocumentreferenceIdPeriodEndsdf.parse(d.getDocumentreferenceIdPeriodEnd());
			documentreferenceaddidentifiersetperiod.setEnd(DocumentreferenceIdPeriodEnddate);
		}
		/******************** Documentreference_Id_Period_Start ********************************************************************************/
		if(d.getDocumentreferenceIdPeriodStart() != null) {
			java.text.SimpleDateFormat DocumentreferenceIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceIdPeriodStartdate = DocumentreferenceIdPeriodStartsdf.parse(d.getDocumentreferenceIdPeriodStart());
			documentreferenceaddidentifiersetperiod.setStart(DocumentreferenceIdPeriodStartdate);
		}
		/******************** Documentreference_Id_System ********************************************************************************/
		if(d.getDocumentreferenceIdSystem() != null) {
			documentreferenceaddidentifier.setSystem(d.getDocumentreferenceIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferenceaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferenceaddidentifier.setType(documentreferenceaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding documentreferenceaddidentifiersettypeaddcoding = documentreferenceaddidentifiersettype.addCoding();

		/******************** Documentreference_Id_Type_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceIdTypeCodingCode() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setCode(d.getDocumentreferenceIdTypeCodingCode());
		}
		/******************** Documentreference_Id_Type_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceIdTypeCodingDisplay() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setDisplay(d.getDocumentreferenceIdTypeCodingDisplay());
		}
		/******************** Documentreference_Id_Type_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceIdTypeCodingSystem() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setSystem(d.getDocumentreferenceIdTypeCodingSystem());
		}
		/******************** Documentreference_Id_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceIdTypeCodingUsrslt() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceIdTypeCodingUsrslt()));
		}
		/******************** Documentreference_Id_Type_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceIdTypeCodingVersion() != null) {
			documentreferenceaddidentifiersettypeaddcoding.setVersion(d.getDocumentreferenceIdTypeCodingVersion());
		}
		/******************** Documentreference_Id_Type_Text ********************************************************************************/
		if(d.getDocumentreferenceIdTypeText() != null) {
			documentreferenceaddidentifiersettype.setText(d.getDocumentreferenceIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentreferenceaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Documentreference_Id_Use_Code ********************************************************************************/
		if(d.getDocumentreferenceIdUseCode() != null) {
			documentreferenceaddidentifier.setUse(documentreferenceaddidentifiersetuseEnumFactory.fromCode(d.getDocumentreferenceIdUseCode()));

		}
		/******************** Documentreference_Id_Value ********************************************************************************/
		if(d.getDocumentreferenceIdValue() != null) {
			documentreferenceaddidentifier.setValue(d.getDocumentreferenceIdValue());
		}

		org.hl7.fhir.r4.model.Identifier documentreferencesetmasteridentifier = new org.hl7.fhir.r4.model.Identifier();
		documentreference.setMasterIdentifier(documentreferencesetmasteridentifier);

		/******************** Documentreference_MasterId_Assigner ********************************************************************************/
		if(d.getDocumentreferenceMasterIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DocumentreferenceMasterIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			documentreferencesetmasteridentifier.setAssigner(DocumentreferenceMasterIdAssignerref.setReference(d.getDocumentreferenceMasterIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period documentreferencesetmasteridentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		documentreferencesetmasteridentifier.setPeriod(documentreferencesetmasteridentifiersetperiod);

		/******************** Documentreference_MasterId_Period_End ********************************************************************************/
		if(d.getDocumentreferenceMasterIdPeriodEnd() != null) {
			java.text.SimpleDateFormat DocumentreferenceMasterIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceMasterIdPeriodEnddate = DocumentreferenceMasterIdPeriodEndsdf.parse(d.getDocumentreferenceMasterIdPeriodEnd());
			documentreferencesetmasteridentifiersetperiod.setEnd(DocumentreferenceMasterIdPeriodEnddate);
		}
		/******************** Documentreference_MasterId_Period_Start ********************************************************************************/
		if(d.getDocumentreferenceMasterIdPeriodStart() != null) {
			java.text.SimpleDateFormat DocumentreferenceMasterIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocumentreferenceMasterIdPeriodStartdate = DocumentreferenceMasterIdPeriodStartsdf.parse(d.getDocumentreferenceMasterIdPeriodStart());
			documentreferencesetmasteridentifiersetperiod.setStart(DocumentreferenceMasterIdPeriodStartdate);
		}
		/******************** Documentreference_MasterId_System ********************************************************************************/
		if(d.getDocumentreferenceMasterIdSystem() != null) {
			documentreferencesetmasteridentifier.setSystem(d.getDocumentreferenceMasterIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept documentreferencesetmasteridentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencesetmasteridentifier.setType(documentreferencesetmasteridentifiersettype);


		org.hl7.fhir.r4.model.Coding documentreferencesetmasteridentifiersettypeaddcoding = documentreferencesetmasteridentifiersettype.addCoding();

		/******************** Documentreference_MasterId_Type_Coding_Code ********************************************************************************/
		if(d.getDocumentreferenceMasterIdTypeCodingCode() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setCode(d.getDocumentreferenceMasterIdTypeCodingCode());
		}
		/******************** Documentreference_MasterId_Type_Coding_Display ********************************************************************************/
		if(d.getDocumentreferenceMasterIdTypeCodingDisplay() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setDisplay(d.getDocumentreferenceMasterIdTypeCodingDisplay());
		}
		/******************** Documentreference_MasterId_Type_Coding_System ********************************************************************************/
		if(d.getDocumentreferenceMasterIdTypeCodingSystem() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setSystem(d.getDocumentreferenceMasterIdTypeCodingSystem());
		}
		/******************** Documentreference_MasterId_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceMasterIdTypeCodingUsrslt() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceMasterIdTypeCodingUsrslt()));
		}
		/******************** Documentreference_MasterId_Type_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceMasterIdTypeCodingVersion() != null) {
			documentreferencesetmasteridentifiersettypeaddcoding.setVersion(d.getDocumentreferenceMasterIdTypeCodingVersion());
		}
		/******************** Documentreference_MasterId_Type_Text ********************************************************************************/
		if(d.getDocumentreferenceMasterIdTypeText() != null) {
			documentreferencesetmasteridentifiersettype.setText(d.getDocumentreferenceMasterIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentreferencesetmasteridentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Documentreference_MasterId_Use_Code ********************************************************************************/
		if(d.getDocumentreferenceMasterIdUseCode() != null) {
			documentreferencesetmasteridentifier.setUse(documentreferencesetmasteridentifiersetuseEnumFactory.fromCode(d.getDocumentreferenceMasterIdUseCode()));

		}
		/******************** Documentreference_MasterId_Value ********************************************************************************/
		if(d.getDocumentreferenceMasterIdValue() != null) {
			documentreferencesetmasteridentifier.setValue(d.getDocumentreferenceMasterIdValue());
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
		/******************** Documentreference_SecurityLabel_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceSecurityLabelCodingUsrslt() != null) {
			documentreferenceaddsecuritylabeladdcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceSecurityLabelCodingUsrslt()));
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
		/******************** Documentreference_Type_Coding_Usrslt ********************************************************************************/
		if(d.getDocumentreferenceTypeCodingUsrslt() != null) {
			documentreferencesettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDocumentreferenceTypeCodingUsrslt()));
		}
		/******************** Documentreference_Type_Coding_Version ********************************************************************************/
		if(d.getDocumentreferenceTypeCodingVersion() != null) {
			documentreferencesettypeaddcoding.setVersion(d.getDocumentreferenceTypeCodingVersion());
		}
		/******************** Documentreference_Type_Text ********************************************************************************/
		if(d.getDocumentreferenceTypeText() != null) {
			documentreferencesettype.setText(d.getDocumentreferenceTypeText());
		}
		return documentreference;
	}
}
