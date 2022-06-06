package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CommunicationRequest;
public class CommunicationRequestConversion 
{
	public org.hl7.fhir.r4.model.CommunicationRequest CommunicationRequests(CommunicationRequest c) throws ParseException
	{
		org.hl7.fhir.r4.model.CommunicationRequest communicationrequest = new org.hl7.fhir.r4.model.CommunicationRequest();

		/******************** id ********************************************************************************/
		communicationrequest.setId(c.getId());

		/******************** CmmnctnRqst_About ********************************************************************************/
		if(c.getCmmnctnRqstAbout() != null) {
			communicationrequest.addAbout( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstAbout()));
		}
		/******************** CmmnctnRqst_AthredOn ********************************************************************************/
		if(c.getCmmnctnRqstAthredOn() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_AthredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_AthredOndate = CmmnctnRqst_AthredOnsdf.parse(c.getCmmnctnRqstAthredOn());
			communicationrequest.setAuthoredOn(CmmnctnRqst_AthredOndate);
		}
		/******************** CmmnctnRqst_BasedOn ********************************************************************************/
		if(c.getCmmnctnRqstBasedOn() != null) {
			communicationrequest.addBasedOn( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstBasedOn()));
		}
		/******************** communicationrequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		communicationrequest.addCategory(communicationrequestcategory);

		/******************** communicationrequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		communicationrequestcategory.addCoding(communicationrequestcategorycoding);

		/******************** CmmnctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgCd() != null) {
			communicationrequestcategorycoding.setCode(c.getCmmnctnRqstCtgryCdgCd());
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgDsply() != null) {
			communicationrequestcategorycoding.setDisplay(c.getCmmnctnRqstCtgryCdgDsply());
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgSys() != null) {
			communicationrequestcategorycoding.setSystem(c.getCmmnctnRqstCtgryCdgSys());
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgUsrSltd() != null) {
			communicationrequestcategorycoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnRqstCtgryCdgUsrSltd()));
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstCtgryCdgVrsn() != null) {
			communicationrequestcategorycoding.setVersion(c.getCmmnctnRqstCtgryCdgVrsn());
		}
		/******************** CmmnctnRqst_Ctgry_Txt ********************************************************************************/
		if(c.getCmmnctnRqstCtgryTxt() != null) {
			communicationrequestcategory.setText(c.getCmmnctnRqstCtgryTxt());
		}
		/******************** CmmnctnRqst_DoNotPerform ********************************************************************************/
		if(c.getCmmnctnRqstDoNotPerform() != null) {
			communicationrequest.setDoNotPerform(Boolean.parseBoolean(c.getCmmnctnRqstDoNotPerform()));
		}
		/******************** CmmnctnRqst_Enc ********************************************************************************/
		if(c.getCmmnctnRqstEnc() != null) {
			communicationrequest.setEncounter( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstEnc()));
		}
		/******************** communicationrequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier communicationrequestgroupidentifier =  new org.hl7.fhir.r4.model.Identifier();
		communicationrequest.setGroupIdentifier(communicationrequestgroupidentifier);

		/******************** CmmnctnRqst_GrpId_Assigner ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdAssigner() != null) {
			communicationrequestgroupidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstGrpIdAssigner()));
		}
		/******************** communicationrequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestgroupidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		communicationrequestgroupidentifier.setPeriod(communicationrequestgroupidentifierperiod);

		/******************** CmmnctnRqst_GrpId_Prd_End ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdPrdEnd() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_GrpId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_GrpId_Prd_Enddate = CmmnctnRqst_GrpId_Prd_Endsdf.parse(c.getCmmnctnRqstGrpIdPrdEnd());
			communicationrequestgroupidentifierperiod.setEnd(CmmnctnRqst_GrpId_Prd_Enddate);
		}
		/******************** CmmnctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdPrdStrt() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_GrpId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_GrpId_Prd_Strtdate = CmmnctnRqst_GrpId_Prd_Strtsdf.parse(c.getCmmnctnRqstGrpIdPrdStrt());
			communicationrequestgroupidentifierperiod.setStart(CmmnctnRqst_GrpId_Prd_Strtdate);
		}
		/******************** CmmnctnRqst_GrpId_Sys ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdSys() != null) {
			communicationrequestgroupidentifier.setSystem(c.getCmmnctnRqstGrpIdSys());
		}
		/******************** communicationrequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestgroupidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		communicationrequestgroupidentifier.setType(communicationrequestgroupidentifiertype);

		/******************** communicationrequestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestgroupidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		communicationrequestgroupidentifiertype.addCoding(communicationrequestgroupidentifiertypecoding);

		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgCd() != null) {
			communicationrequestgroupidentifiertypecoding.setCode(c.getCmmnctnRqstGrpIdTypCdgCd());
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgDsply() != null) {
			communicationrequestgroupidentifiertypecoding.setDisplay(c.getCmmnctnRqstGrpIdTypCdgDsply());
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgSys() != null) {
			communicationrequestgroupidentifiertypecoding.setSystem(c.getCmmnctnRqstGrpIdTypCdgSys());
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgUsrSltd() != null) {
			communicationrequestgroupidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnRqstGrpIdTypCdgUsrSltd()));
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypCdgVrsn() != null) {
			communicationrequestgroupidentifiertypecoding.setVersion(c.getCmmnctnRqstGrpIdTypCdgVrsn());
		}
		/******************** CmmnctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdTypTxt() != null) {
			communicationrequestgroupidentifiertype.setText(c.getCmmnctnRqstGrpIdTypTxt());
		}
		/******************** communicationrequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory communicationrequestgroupidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		communicationrequestgroupidentifier.setUse(communicationrequestgroupidentifieruse.fromCode(c.getCmmnctnRqstGrpIdUse()));

		/******************** CmmnctnRqst_GrpId_Vl ********************************************************************************/
		if(c.getCmmnctnRqstGrpIdVl() != null) {
			communicationrequestgroupidentifier.setValue(c.getCmmnctnRqstGrpIdVl());
		}
		/******************** communicationrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier communicationrequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		communicationrequest.addIdentifier(communicationrequestidentifier);

		/******************** CmmnctnRqst_Id_Assigner ********************************************************************************/
		if(c.getCmmnctnRqstIdAssigner() != null) {
			communicationrequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstIdAssigner()));
		}
		/******************** communicationrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		communicationrequestidentifier.setPeriod(communicationrequestidentifierperiod);

		/******************** CmmnctnRqst_Id_Prd_End ********************************************************************************/
		if(c.getCmmnctnRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_Id_Prd_Enddate = CmmnctnRqst_Id_Prd_Endsdf.parse(c.getCmmnctnRqstIdPrdEnd());
			communicationrequestidentifierperiod.setEnd(CmmnctnRqst_Id_Prd_Enddate);
		}
		/******************** CmmnctnRqst_Id_Prd_Strt ********************************************************************************/
		if(c.getCmmnctnRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_Id_Prd_Strtdate = CmmnctnRqst_Id_Prd_Strtsdf.parse(c.getCmmnctnRqstIdPrdStrt());
			communicationrequestidentifierperiod.setStart(CmmnctnRqst_Id_Prd_Strtdate);
		}
		/******************** CmmnctnRqst_Id_Sys ********************************************************************************/
		if(c.getCmmnctnRqstIdSys() != null) {
			communicationrequestidentifier.setSystem(c.getCmmnctnRqstIdSys());
		}
		/******************** communicationrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		communicationrequestidentifier.setType(communicationrequestidentifiertype);

		/******************** communicationrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		communicationrequestidentifiertype.addCoding(communicationrequestidentifiertypecoding);

		/******************** CmmnctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgCd() != null) {
			communicationrequestidentifiertypecoding.setCode(c.getCmmnctnRqstIdTypCdgCd());
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgDsply() != null) {
			communicationrequestidentifiertypecoding.setDisplay(c.getCmmnctnRqstIdTypCdgDsply());
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgSys() != null) {
			communicationrequestidentifiertypecoding.setSystem(c.getCmmnctnRqstIdTypCdgSys());
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgUsrSltd() != null) {
			communicationrequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnRqstIdTypCdgUsrSltd()));
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstIdTypCdgVrsn() != null) {
			communicationrequestidentifiertypecoding.setVersion(c.getCmmnctnRqstIdTypCdgVrsn());
		}
		/******************** CmmnctnRqst_Id_Typ_Txt ********************************************************************************/
		if(c.getCmmnctnRqstIdTypTxt() != null) {
			communicationrequestidentifiertype.setText(c.getCmmnctnRqstIdTypTxt());
		}
		/******************** communicationrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory communicationrequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		communicationrequestidentifier.setUse(communicationrequestidentifieruse.fromCode(c.getCmmnctnRqstIdUse()));

		/******************** CmmnctnRqst_Id_Vl ********************************************************************************/
		if(c.getCmmnctnRqstIdVl() != null) {
			communicationrequestidentifier.setValue(c.getCmmnctnRqstIdVl());
		}
		/******************** communicationrequestmedium ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestmedium =  new org.hl7.fhir.r4.model.CodeableConcept();
		communicationrequest.addMedium(communicationrequestmedium);

		/******************** communicationrequestmediumcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestmediumcoding =  new org.hl7.fhir.r4.model.Coding();
		communicationrequestmedium.addCoding(communicationrequestmediumcoding);

		/******************** CmmnctnRqst_Medium_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgCd() != null) {
			communicationrequestmediumcoding.setCode(c.getCmmnctnRqstMediumCdgCd());
		}
		/******************** CmmnctnRqst_Medium_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgDsply() != null) {
			communicationrequestmediumcoding.setDisplay(c.getCmmnctnRqstMediumCdgDsply());
		}
		/******************** CmmnctnRqst_Medium_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgSys() != null) {
			communicationrequestmediumcoding.setSystem(c.getCmmnctnRqstMediumCdgSys());
		}
		/******************** CmmnctnRqst_Medium_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgUsrSltd() != null) {
			communicationrequestmediumcoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnRqstMediumCdgUsrSltd()));
		}
		/******************** CmmnctnRqst_Medium_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstMediumCdgVrsn() != null) {
			communicationrequestmediumcoding.setVersion(c.getCmmnctnRqstMediumCdgVrsn());
		}
		/******************** CmmnctnRqst_Medium_Txt ********************************************************************************/
		if(c.getCmmnctnRqstMediumTxt() != null) {
			communicationrequestmedium.setText(c.getCmmnctnRqstMediumTxt());
		}
		/******************** communicationrequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation communicationrequestnote =  new org.hl7.fhir.r4.model.Annotation();
		communicationrequest.addNote(communicationrequestnote);

		/******************** CmmnctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCmmnctnRqstNtAthrRfrnc() != null) {
			communicationrequestnote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstNtAthrRfrnc()));
		}
		/******************** CmmnctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCmmnctnRqstNtAthrStrgTyp() != null) {
			communicationrequestnote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getCmmnctnRqstNtAthrStrgTyp()));
		}
		/******************** CmmnctnRqst_Nt_Txt ********************************************************************************/
		if(c.getCmmnctnRqstNtTxt() != null) {
			communicationrequestnote.setText(c.getCmmnctnRqstNtTxt());
		}
		/******************** CmmnctnRqst_Nt_Time ********************************************************************************/
		if(c.getCmmnctnRqstNtTime() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_Nt_Timedate = CmmnctnRqst_Nt_Timesdf.parse(c.getCmmnctnRqstNtTime());
			communicationrequestnote.setTime(CmmnctnRqst_Nt_Timedate);
		}
		/******************** CmmnctnRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(c.getCmmnctnRqstOccrnceDtTimeTyp() != null) {
			communicationrequest.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(c.getCmmnctnRqstOccrnceDtTimeTyp()));
		}
		/******************** communicationrequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		communicationrequest.setOccurrence(communicationrequestoccurrenceperiod);

		/******************** CmmnctnRqst_OccrncePrd_End ********************************************************************************/
		if(c.getCmmnctnRqstOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_OccrncePrd_Enddate = CmmnctnRqst_OccrncePrd_Endsdf.parse(c.getCmmnctnRqstOccrncePrdEnd());
			communicationrequestoccurrenceperiod.setEnd(CmmnctnRqst_OccrncePrd_Enddate);
		}
		/******************** CmmnctnRqst_OccrncePrd_Strt ********************************************************************************/
		if(c.getCmmnctnRqstOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_OccrncePrd_Strtdate = CmmnctnRqst_OccrncePrd_Strtsdf.parse(c.getCmmnctnRqstOccrncePrdStrt());
			communicationrequestoccurrenceperiod.setStart(CmmnctnRqst_OccrncePrd_Strtdate);
		}
		/******************** communicationrequestpayload ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent communicationrequestpayload =  new org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent();
		communicationrequest.addPayload(communicationrequestpayload);

		/******************** communicationrequestpayloadcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment communicationrequestpayloadcontentattachment =  new org.hl7.fhir.r4.model.Attachment();
		communicationrequestpayload.setContent(communicationrequestpayloadcontentattachment);

		/******************** CmmnctnRqst_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntCntntTyp() != null) {
			communicationrequestpayloadcontentattachment.setContentType(c.getCmmnctnRqstPayloadCntntAttchmntCntntTyp());
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntCreation() != null) {
			java.text.SimpleDateFormat CmmnctnRqst_Payload_CntntAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmmnctnRqst_Payload_CntntAttchmnt_Creationdate = CmmnctnRqst_Payload_CntntAttchmnt_Creationsdf.parse(c.getCmmnctnRqstPayloadCntntAttchmntCreation());
			communicationrequestpayloadcontentattachment.setCreation(CmmnctnRqst_Payload_CntntAttchmnt_Creationdate);
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntData() != null) {
			communicationrequestpayloadcontentattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCmmnctnRqstPayloadCntntAttchmntData()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntHash() != null) {
			communicationrequestpayloadcontentattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCmmnctnRqstPayloadCntntAttchmntHash()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntLnguage() != null) {
			communicationrequestpayloadcontentattachment.setLanguage(c.getCmmnctnRqstPayloadCntntAttchmntLnguage());
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntSz() != null) {
			communicationrequestpayloadcontentattachment.setSize(Integer.parseInt(c.getCmmnctnRqstPayloadCntntAttchmntSz()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntTtl() != null) {
			communicationrequestpayloadcontentattachment.setTitle(c.getCmmnctnRqstPayloadCntntAttchmntTtl());
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntAttchmntUrl() != null) {
			communicationrequestpayloadcontentattachment.setUrl(c.getCmmnctnRqstPayloadCntntAttchmntUrl());
		}
		/******************** CmmnctnRqst_Payload_CntntRfrnc ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntRfrnc() != null) {
			communicationrequestpayload.setContent( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstPayloadCntntRfrnc()));
		}
		/******************** CmmnctnRqst_Payload_CntntStrgTyp ********************************************************************************/
		if(c.getCmmnctnRqstPayloadCntntStrgTyp() != null) {
			communicationrequestpayload.setContent( new org.hl7.fhir.r4.model.StringType(c.getCmmnctnRqstPayloadCntntStrgTyp()));
		}
		/******************** communicationrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationPriorityEnumFactory communicationrequestpriority =  new org.hl7.fhir.r4.model.CommunicationRequest.CommunicationPriorityEnumFactory();
		communicationrequest.setPriority(communicationrequestpriority.fromCode(c.getCmmnctnRqstPriority()));

		/******************** communicationrequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		communicationrequest.addReasonCode(communicationrequestreasoncode);

		/******************** communicationrequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		communicationrequestreasoncode.addCoding(communicationrequestreasoncodecoding);

		/******************** CmmnctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgCd() != null) {
			communicationrequestreasoncodecoding.setCode(c.getCmmnctnRqstRsnCdCdgCd());
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgDsply() != null) {
			communicationrequestreasoncodecoding.setDisplay(c.getCmmnctnRqstRsnCdCdgDsply());
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgSys() != null) {
			communicationrequestreasoncodecoding.setSystem(c.getCmmnctnRqstRsnCdCdgSys());
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgUsrSltd() != null) {
			communicationrequestreasoncodecoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnRqstRsnCdCdgUsrSltd()));
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdCdgVrsn() != null) {
			communicationrequestreasoncodecoding.setVersion(c.getCmmnctnRqstRsnCdCdgVrsn());
		}
		/******************** CmmnctnRqst_RsnCd_Txt ********************************************************************************/
		if(c.getCmmnctnRqstRsnCdTxt() != null) {
			communicationrequestreasoncode.setText(c.getCmmnctnRqstRsnCdTxt());
		}
		/******************** CmmnctnRqst_RsnRfrnc ********************************************************************************/
		if(c.getCmmnctnRqstRsnRfrnc() != null) {
			communicationrequest.addReasonReference( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstRsnRfrnc()));
		}
		/******************** CmmnctnRqst_Recipient ********************************************************************************/
		if(c.getCmmnctnRqstRecipient() != null) {
			communicationrequest.addRecipient( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstRecipient()));
		}
		/******************** CmmnctnRqst_Replaces ********************************************************************************/
		if(c.getCmmnctnRqstReplaces() != null) {
			communicationrequest.addReplaces( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstReplaces()));
		}
		/******************** CmmnctnRqst_Rqster ********************************************************************************/
		if(c.getCmmnctnRqstRqster() != null) {
			communicationrequest.setRequester( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstRqster()));
		}
		/******************** CmmnctnRqst_Sender ********************************************************************************/
		if(c.getCmmnctnRqstSender() != null) {
			communicationrequest.setSender( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstSender()));
		}
		/******************** communicationrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestStatusEnumFactory communicationrequeststatus =  new org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestStatusEnumFactory();
		communicationrequest.setStatus(communicationrequeststatus.fromCode(c.getCmmnctnRqstSts()));

		/******************** communicationrequeststatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequeststatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		communicationrequest.setStatusReason(communicationrequeststatusreason);

		/******************** communicationrequeststatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequeststatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		communicationrequeststatusreason.addCoding(communicationrequeststatusreasoncoding);

		/******************** CmmnctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgCd() != null) {
			communicationrequeststatusreasoncoding.setCode(c.getCmmnctnRqstStsRsnCdgCd());
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgDsply() != null) {
			communicationrequeststatusreasoncoding.setDisplay(c.getCmmnctnRqstStsRsnCdgDsply());
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgSys() != null) {
			communicationrequeststatusreasoncoding.setSystem(c.getCmmnctnRqstStsRsnCdgSys());
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgUsrSltd() != null) {
			communicationrequeststatusreasoncoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnRqstStsRsnCdgUsrSltd()));
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnCdgVrsn() != null) {
			communicationrequeststatusreasoncoding.setVersion(c.getCmmnctnRqstStsRsnCdgVrsn());
		}
		/******************** CmmnctnRqst_StsRsn_Txt ********************************************************************************/
		if(c.getCmmnctnRqstStsRsnTxt() != null) {
			communicationrequeststatusreason.setText(c.getCmmnctnRqstStsRsnTxt());
		}
		/******************** CmmnctnRqst_Sbjct ********************************************************************************/
		if(c.getCmmnctnRqstSbjct() != null) {
			communicationrequest.setSubject( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRqstSbjct()));
		}
		return communicationrequest;
	}
}
