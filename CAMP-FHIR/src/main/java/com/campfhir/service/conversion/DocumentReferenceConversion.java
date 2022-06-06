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

		/******************** DocRfrnc_Authenticator ********************************************************************************/
		if(d.getDocRfrncAuthenticator() != null) {
			documentreference.setAuthenticator( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncAuthenticator()));
		}
		/******************** DocRfrnc_Athr ********************************************************************************/
		if(d.getDocRfrncAthr() != null) {
			documentreference.addAuthor( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncAthr()));
		}
		/******************** documentreferencecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreference.addCategory(documentreferencecategory);

		/******************** documentreferencecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferencecategory.addCoding(documentreferencecategorycoding);

		/******************** DocRfrnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCtgryCdgCd() != null) {
			documentreferencecategorycoding.setCode(d.getDocRfrncCtgryCdgCd());
		}
		/******************** DocRfrnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCtgryCdgDsply() != null) {
			documentreferencecategorycoding.setDisplay(d.getDocRfrncCtgryCdgDsply());
		}
		/******************** DocRfrnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCtgryCdgSys() != null) {
			documentreferencecategorycoding.setSystem(d.getDocRfrncCtgryCdgSys());
		}
		/******************** DocRfrnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCtgryCdgUsrSltd() != null) {
			documentreferencecategorycoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncCtgryCdgUsrSltd()));
		}
		/******************** DocRfrnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCtgryCdgVrsn() != null) {
			documentreferencecategorycoding.setVersion(d.getDocRfrncCtgryCdgVrsn());
		}
		/******************** DocRfrnc_Ctgry_Txt ********************************************************************************/
		if(d.getDocRfrncCtgryTxt() != null) {
			documentreferencecategory.setText(d.getDocRfrncCtgryTxt());
		}
		/******************** documentreferencecontent ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent documentreferencecontent =  new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent();
		documentreference.addContent(documentreferencecontent);

		/******************** documentreferencecontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment documentreferencecontentattachment =  new org.hl7.fhir.r4.model.Attachment();
		documentreferencecontent.setAttachment(documentreferencecontentattachment);

		/******************** DocRfrnc_Cntnt_Attchmnt_CntntTyp ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntCntntTyp() != null) {
			documentreferencecontentattachment.setContentType(d.getDocRfrncCntntAttchmntCntntTyp());
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Creation ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntCreation() != null) {
			java.text.SimpleDateFormat DocRfrnc_Cntnt_Attchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_Cntnt_Attchmnt_Creationdate = DocRfrnc_Cntnt_Attchmnt_Creationsdf.parse(d.getDocRfrncCntntAttchmntCreation());
			documentreferencecontentattachment.setCreation(DocRfrnc_Cntnt_Attchmnt_Creationdate);
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Data ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntData() != null) {
			documentreferencecontentattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDocRfrncCntntAttchmntData()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Hash ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntHash() != null) {
			documentreferencecontentattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDocRfrncCntntAttchmntHash()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Lnguage ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntLnguage() != null) {
			documentreferencecontentattachment.setLanguage(d.getDocRfrncCntntAttchmntLnguage());
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Sz ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntSz() != null) {
			documentreferencecontentattachment.setSize(Integer.parseInt(d.getDocRfrncCntntAttchmntSz()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Ttl ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntTtl() != null) {
			documentreferencecontentattachment.setTitle(d.getDocRfrncCntntAttchmntTtl());
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Url ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntUrl() != null) {
			documentreferencecontentattachment.setUrl(d.getDocRfrncCntntAttchmntUrl());
		}
		/******************** documentreferencecontentformat ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontentformat =  new org.hl7.fhir.r4.model.Coding();
		documentreferencecontent.setFormat(documentreferencecontentformat);

		/******************** DocRfrnc_Cntnt_Frmat_Cd ********************************************************************************/
		if(d.getDocRfrncCntntFrmatCd() != null) {
			documentreferencecontentformat.setCode(d.getDocRfrncCntntFrmatCd());
		}
		/******************** DocRfrnc_Cntnt_Frmat_Dsply ********************************************************************************/
		if(d.getDocRfrncCntntFrmatDsply() != null) {
			documentreferencecontentformat.setDisplay(d.getDocRfrncCntntFrmatDsply());
		}
		/******************** DocRfrnc_Cntnt_Frmat_Sys ********************************************************************************/
		if(d.getDocRfrncCntntFrmatSys() != null) {
			documentreferencecontentformat.setSystem(d.getDocRfrncCntntFrmatSys());
		}
		/******************** DocRfrnc_Cntnt_Frmat_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntntFrmatUsrSltd() != null) {
			documentreferencecontentformat.setUserSelected(Boolean.parseBoolean(d.getDocRfrncCntntFrmatUsrSltd()));
		}
		/******************** DocRfrnc_Cntnt_Frmat_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntntFrmatVrsn() != null) {
			documentreferencecontentformat.setVersion(d.getDocRfrncCntntFrmatVrsn());
		}
		/******************** documentreferencecontext ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent documentreferencecontext =  new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent();
		documentreference.setContext(documentreferencecontext);

		/******************** DocRfrnc_Cntxt_Enc ********************************************************************************/
		if(d.getDocRfrncCntxtEnc() != null) {
			documentreferencecontext.addEncounter( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncCntxtEnc()));
		}
		/******************** documentreferencecontextevent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextevent =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencecontext.addEvent(documentreferencecontextevent);

		/******************** documentreferencecontexteventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontexteventcoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferencecontextevent.addCoding(documentreferencecontexteventcoding);

		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgCd() != null) {
			documentreferencecontexteventcoding.setCode(d.getDocRfrncCntxtEvntCdgCd());
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgDsply() != null) {
			documentreferencecontexteventcoding.setDisplay(d.getDocRfrncCntxtEvntCdgDsply());
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgSys() != null) {
			documentreferencecontexteventcoding.setSystem(d.getDocRfrncCntxtEvntCdgSys());
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgUsrSltd() != null) {
			documentreferencecontexteventcoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncCntxtEvntCdgUsrSltd()));
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgVrsn() != null) {
			documentreferencecontexteventcoding.setVersion(d.getDocRfrncCntxtEvntCdgVrsn());
		}
		/******************** DocRfrnc_Cntxt_Evnt_Txt ********************************************************************************/
		if(d.getDocRfrncCntxtEvntTxt() != null) {
			documentreferencecontextevent.setText(d.getDocRfrncCntxtEvntTxt());
		}
		/******************** documentreferencecontextfacilitytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextfacilitytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencecontext.setFacilityType(documentreferencecontextfacilitytype);

		/******************** documentreferencecontextfacilitytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontextfacilitytypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferencecontextfacilitytype.addCoding(documentreferencecontextfacilitytypecoding);

		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgCd() != null) {
			documentreferencecontextfacilitytypecoding.setCode(d.getDocRfrncCntxtFacilityTypCdgCd());
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgDsply() != null) {
			documentreferencecontextfacilitytypecoding.setDisplay(d.getDocRfrncCntxtFacilityTypCdgDsply());
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgSys() != null) {
			documentreferencecontextfacilitytypecoding.setSystem(d.getDocRfrncCntxtFacilityTypCdgSys());
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgUsrSltd() != null) {
			documentreferencecontextfacilitytypecoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncCntxtFacilityTypCdgUsrSltd()));
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgVrsn() != null) {
			documentreferencecontextfacilitytypecoding.setVersion(d.getDocRfrncCntxtFacilityTypCdgVrsn());
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Txt ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypTxt() != null) {
			documentreferencecontextfacilitytype.setText(d.getDocRfrncCntxtFacilityTypTxt());
		}
		/******************** documentreferencecontextperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferencecontextperiod =  new org.hl7.fhir.r4.model.Period();
		documentreferencecontext.setPeriod(documentreferencecontextperiod);

		/******************** DocRfrnc_Cntxt_Prd_End ********************************************************************************/
		if(d.getDocRfrncCntxtPrdEnd() != null) {
			java.text.SimpleDateFormat DocRfrnc_Cntxt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_Cntxt_Prd_Enddate = DocRfrnc_Cntxt_Prd_Endsdf.parse(d.getDocRfrncCntxtPrdEnd());
			documentreferencecontextperiod.setEnd(DocRfrnc_Cntxt_Prd_Enddate);
		}
		/******************** DocRfrnc_Cntxt_Prd_Strt ********************************************************************************/
		if(d.getDocRfrncCntxtPrdStrt() != null) {
			java.text.SimpleDateFormat DocRfrnc_Cntxt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_Cntxt_Prd_Strtdate = DocRfrnc_Cntxt_Prd_Strtsdf.parse(d.getDocRfrncCntxtPrdStrt());
			documentreferencecontextperiod.setStart(DocRfrnc_Cntxt_Prd_Strtdate);
		}
		/******************** documentreferencecontextpracticesetting ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextpracticesetting =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencecontext.setPracticeSetting(documentreferencecontextpracticesetting);

		/******************** documentreferencecontextpracticesettingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontextpracticesettingcoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferencecontextpracticesetting.addCoding(documentreferencecontextpracticesettingcoding);

		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgCd() != null) {
			documentreferencecontextpracticesettingcoding.setCode(d.getDocRfrncCntxtPracticeSttingCdgCd());
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgDsply() != null) {
			documentreferencecontextpracticesettingcoding.setDisplay(d.getDocRfrncCntxtPracticeSttingCdgDsply());
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgSys() != null) {
			documentreferencecontextpracticesettingcoding.setSystem(d.getDocRfrncCntxtPracticeSttingCdgSys());
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgUsrSltd() != null) {
			documentreferencecontextpracticesettingcoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncCntxtPracticeSttingCdgUsrSltd()));
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgVrsn() != null) {
			documentreferencecontextpracticesettingcoding.setVersion(d.getDocRfrncCntxtPracticeSttingCdgVrsn());
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Txt ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingTxt() != null) {
			documentreferencecontextpracticesetting.setText(d.getDocRfrncCntxtPracticeSttingTxt());
		}
		/******************** DocRfrnc_Cntxt_Rlted ********************************************************************************/
		if(d.getDocRfrncCntxtRlted() != null) {
			documentreferencecontext.addRelated( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncCntxtRlted()));
		}
		/******************** DocRfrnc_Cntxt_SrcPntInfo ********************************************************************************/
		if(d.getDocRfrncCntxtSrcPntInfo() != null) {
			documentreferencecontext.setSourcePatientInfo( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncCntxtSrcPntInfo()));
		}
		/******************** DocRfrnc_Custodian ********************************************************************************/
		if(d.getDocRfrncCustodian() != null) {
			documentreference.setCustodian( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncCustodian()));
		}
		/******************** DocRfrnc_Dt ********************************************************************************/
		if(d.getDocRfrncDt() != null) {
			java.text.SimpleDateFormat DocRfrnc_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_Dtdate = DocRfrnc_Dtsdf.parse(d.getDocRfrncDt());
			documentreference.setDate(DocRfrnc_Dtdate);
		}
		/******************** DocRfrnc_Dscrptn ********************************************************************************/
		if(d.getDocRfrncDscrptn() != null) {
			documentreference.setDescription(d.getDocRfrncDscrptn());
		}
		/******************** documentreferencedocstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatusEnumFactory documentreferencedocstatus =  new org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatusEnumFactory();
		documentreference.setDocStatus(documentreferencedocstatus.fromCode(d.getDocRfrncDocSts()));

		/******************** documentreferenceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentreferenceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		documentreference.addIdentifier(documentreferenceidentifier);

		/******************** DocRfrnc_Id_Assigner ********************************************************************************/
		if(d.getDocRfrncIdAssigner() != null) {
			documentreferenceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncIdAssigner()));
		}
		/******************** documentreferenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferenceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		documentreferenceidentifier.setPeriod(documentreferenceidentifierperiod);

		/******************** DocRfrnc_Id_Prd_End ********************************************************************************/
		if(d.getDocRfrncIdPrdEnd() != null) {
			java.text.SimpleDateFormat DocRfrnc_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_Id_Prd_Enddate = DocRfrnc_Id_Prd_Endsdf.parse(d.getDocRfrncIdPrdEnd());
			documentreferenceidentifierperiod.setEnd(DocRfrnc_Id_Prd_Enddate);
		}
		/******************** DocRfrnc_Id_Prd_Strt ********************************************************************************/
		if(d.getDocRfrncIdPrdStrt() != null) {
			java.text.SimpleDateFormat DocRfrnc_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_Id_Prd_Strtdate = DocRfrnc_Id_Prd_Strtsdf.parse(d.getDocRfrncIdPrdStrt());
			documentreferenceidentifierperiod.setStart(DocRfrnc_Id_Prd_Strtdate);
		}
		/******************** DocRfrnc_Id_Sys ********************************************************************************/
		if(d.getDocRfrncIdSys() != null) {
			documentreferenceidentifier.setSystem(d.getDocRfrncIdSys());
		}
		/******************** documentreferenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferenceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferenceidentifier.setType(documentreferenceidentifiertype);

		/******************** documentreferenceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferenceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferenceidentifiertype.addCoding(documentreferenceidentifiertypecoding);

		/******************** DocRfrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncIdTypCdgCd() != null) {
			documentreferenceidentifiertypecoding.setCode(d.getDocRfrncIdTypCdgCd());
		}
		/******************** DocRfrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncIdTypCdgDsply() != null) {
			documentreferenceidentifiertypecoding.setDisplay(d.getDocRfrncIdTypCdgDsply());
		}
		/******************** DocRfrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncIdTypCdgSys() != null) {
			documentreferenceidentifiertypecoding.setSystem(d.getDocRfrncIdTypCdgSys());
		}
		/******************** DocRfrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncIdTypCdgUsrSltd() != null) {
			documentreferenceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncIdTypCdgUsrSltd()));
		}
		/******************** DocRfrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncIdTypCdgVrsn() != null) {
			documentreferenceidentifiertypecoding.setVersion(d.getDocRfrncIdTypCdgVrsn());
		}
		/******************** DocRfrnc_Id_Typ_Txt ********************************************************************************/
		if(d.getDocRfrncIdTypTxt() != null) {
			documentreferenceidentifiertype.setText(d.getDocRfrncIdTypTxt());
		}
		/******************** documentreferenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentreferenceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		documentreferenceidentifier.setUse(documentreferenceidentifieruse.fromCode(d.getDocRfrncIdUse()));

		/******************** DocRfrnc_Id_Vl ********************************************************************************/
		if(d.getDocRfrncIdVl() != null) {
			documentreferenceidentifier.setValue(d.getDocRfrncIdVl());
		}
		/******************** documentreferencemasteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentreferencemasteridentifier =  new org.hl7.fhir.r4.model.Identifier();
		documentreference.setMasterIdentifier(documentreferencemasteridentifier);

		/******************** DocRfrnc_MasterId_Assigner ********************************************************************************/
		if(d.getDocRfrncMasterIdAssigner() != null) {
			documentreferencemasteridentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncMasterIdAssigner()));
		}
		/******************** documentreferencemasteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferencemasteridentifierperiod =  new org.hl7.fhir.r4.model.Period();
		documentreferencemasteridentifier.setPeriod(documentreferencemasteridentifierperiod);

		/******************** DocRfrnc_MasterId_Prd_End ********************************************************************************/
		if(d.getDocRfrncMasterIdPrdEnd() != null) {
			java.text.SimpleDateFormat DocRfrnc_MasterId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_MasterId_Prd_Enddate = DocRfrnc_MasterId_Prd_Endsdf.parse(d.getDocRfrncMasterIdPrdEnd());
			documentreferencemasteridentifierperiod.setEnd(DocRfrnc_MasterId_Prd_Enddate);
		}
		/******************** DocRfrnc_MasterId_Prd_Strt ********************************************************************************/
		if(d.getDocRfrncMasterIdPrdStrt() != null) {
			java.text.SimpleDateFormat DocRfrnc_MasterId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DocRfrnc_MasterId_Prd_Strtdate = DocRfrnc_MasterId_Prd_Strtsdf.parse(d.getDocRfrncMasterIdPrdStrt());
			documentreferencemasteridentifierperiod.setStart(DocRfrnc_MasterId_Prd_Strtdate);
		}
		/******************** DocRfrnc_MasterId_Sys ********************************************************************************/
		if(d.getDocRfrncMasterIdSys() != null) {
			documentreferencemasteridentifier.setSystem(d.getDocRfrncMasterIdSys());
		}
		/******************** documentreferencemasteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencemasteridentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreferencemasteridentifier.setType(documentreferencemasteridentifiertype);

		/******************** documentreferencemasteridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencemasteridentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferencemasteridentifiertype.addCoding(documentreferencemasteridentifiertypecoding);

		/******************** DocRfrnc_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgCd() != null) {
			documentreferencemasteridentifiertypecoding.setCode(d.getDocRfrncMasterIdTypCdgCd());
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgDsply() != null) {
			documentreferencemasteridentifiertypecoding.setDisplay(d.getDocRfrncMasterIdTypCdgDsply());
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgSys() != null) {
			documentreferencemasteridentifiertypecoding.setSystem(d.getDocRfrncMasterIdTypCdgSys());
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgUsrSltd() != null) {
			documentreferencemasteridentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncMasterIdTypCdgUsrSltd()));
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgVrsn() != null) {
			documentreferencemasteridentifiertypecoding.setVersion(d.getDocRfrncMasterIdTypCdgVrsn());
		}
		/******************** DocRfrnc_MasterId_Typ_Txt ********************************************************************************/
		if(d.getDocRfrncMasterIdTypTxt() != null) {
			documentreferencemasteridentifiertype.setText(d.getDocRfrncMasterIdTypTxt());
		}
		/******************** documentreferencemasteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory documentreferencemasteridentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		documentreferencemasteridentifier.setUse(documentreferencemasteridentifieruse.fromCode(d.getDocRfrncMasterIdUse()));

		/******************** DocRfrnc_MasterId_Vl ********************************************************************************/
		if(d.getDocRfrncMasterIdVl() != null) {
			documentreferencemasteridentifier.setValue(d.getDocRfrncMasterIdVl());
		}
		/******************** documentreferencerelatesto ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent documentreferencerelatesto =  new org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent();
		documentreference.addRelatesTo(documentreferencerelatesto);

		/******************** documentreferencerelatestocode ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipTypeEnumFactory documentreferencerelatestocode =  new org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipTypeEnumFactory();
		documentreferencerelatesto.setCode(documentreferencerelatestocode.fromCode(d.getDocRfrncRelatesToCd()));

		/******************** documentreferencesecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencesecuritylabel =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreference.addSecurityLabel(documentreferencesecuritylabel);

		/******************** documentreferencesecuritylabelcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencesecuritylabelcoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferencesecuritylabel.addCoding(documentreferencesecuritylabelcoding);

		/******************** DocRfrnc_SecurityLbl_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgCd() != null) {
			documentreferencesecuritylabelcoding.setCode(d.getDocRfrncSecurityLblCdgCd());
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgDsply() != null) {
			documentreferencesecuritylabelcoding.setDisplay(d.getDocRfrncSecurityLblCdgDsply());
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgSys() != null) {
			documentreferencesecuritylabelcoding.setSystem(d.getDocRfrncSecurityLblCdgSys());
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgUsrSltd() != null) {
			documentreferencesecuritylabelcoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncSecurityLblCdgUsrSltd()));
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgVrsn() != null) {
			documentreferencesecuritylabelcoding.setVersion(d.getDocRfrncSecurityLblCdgVrsn());
		}
		/******************** DocRfrnc_SecurityLbl_Txt ********************************************************************************/
		if(d.getDocRfrncSecurityLblTxt() != null) {
			documentreferencesecuritylabel.setText(d.getDocRfrncSecurityLblTxt());
		}
		/******************** documentreferencestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory documentreferencestatus =  new org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory();
		documentreference.setStatus(documentreferencestatus.fromCode(d.getDocRfrncSts()));

		/******************** DocRfrnc_Sbjct ********************************************************************************/
		if(d.getDocRfrncSbjct() != null) {
			documentreference.setSubject( new org.hl7.fhir.r4.model.Reference(d.getDocRfrncSbjct()));
		}
		/******************** documentreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		documentreference.setType(documentreferencetype);

		/******************** documentreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencetypecoding =  new org.hl7.fhir.r4.model.Coding();
		documentreferencetype.addCoding(documentreferencetypecoding);

		/******************** DocRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncTypCdgCd() != null) {
			documentreferencetypecoding.setCode(d.getDocRfrncTypCdgCd());
		}
		/******************** DocRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncTypCdgDsply() != null) {
			documentreferencetypecoding.setDisplay(d.getDocRfrncTypCdgDsply());
		}
		/******************** DocRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncTypCdgSys() != null) {
			documentreferencetypecoding.setSystem(d.getDocRfrncTypCdgSys());
		}
		/******************** DocRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncTypCdgUsrSltd() != null) {
			documentreferencetypecoding.setUserSelected(Boolean.parseBoolean(d.getDocRfrncTypCdgUsrSltd()));
		}
		/******************** DocRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncTypCdgVrsn() != null) {
			documentreferencetypecoding.setVersion(d.getDocRfrncTypCdgVrsn());
		}
		/******************** DocRfrnc_Typ_Txt ********************************************************************************/
		if(d.getDocRfrncTypTxt() != null) {
			documentreferencetype.setText(d.getDocRfrncTypTxt());
		}
		return documentreference;
	}
}
