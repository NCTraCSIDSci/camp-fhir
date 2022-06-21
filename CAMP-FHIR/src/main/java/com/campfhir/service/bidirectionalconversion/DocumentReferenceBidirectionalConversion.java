package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentReference;
public class DocumentReferenceBidirectionalConversion 
{
	public DocumentReference DocumentReferences(org.hl7.fhir.r4.model.DocumentReference documentreference) throws ParseException
	{
		 main.java.com.campfhir.model.DocumentReference d = new  main.java.com.campfhir.model.DocumentReference();

		/******************** id ********************************************************************************/
		documentreference.setId(d.getId());

		/******************** documentreferencecontext ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent documentreferencecontext = documentreference.getContext();

		/******************** documentreferencecontextperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferencecontextperiod = documentreferencecontext.getPeriod();

		/******************** DocRfrnc_Cntxt_Prd_End ********************************************************************************/
		if(documentreferencecontextperiod.hasEnd()) {
			d.setDocRfrncCntxtPrdEnd(String.valueOf(documentreferencecontextperiod.getEnd()));
		}
		/******************** DocRfrnc_Cntxt_Prd_Strt ********************************************************************************/
		if(documentreferencecontextperiod.hasStart()) {
			d.setDocRfrncCntxtPrdStrt(String.valueOf(documentreferencecontextperiod.getStart()));
		}
		/******************** DocRfrnc_Cntxt_Enc ********************************************************************************/
		if(documentreferencecontext.hasEncounter()) {
			d.setDocRfrncCntxtEnc(String.valueOf(documentreferencecontext.getEncounterFirstRep()));
		}
		/******************** DocRfrnc_Cntxt_SrcPntInfo ********************************************************************************/
		if(documentreferencecontext.hasSourcePatientInfo()) {
			d.setDocRfrncCntxtSrcPntInfo(String.valueOf(documentreferencecontext.getSourcePatientInfo()));
		}
		/******************** documentreferencecontextfacilitytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextfacilitytype = documentreferencecontext.getFacilityType();

		/******************** documentreferencecontextfacilitytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontextfacilitytypecoding = documentreferencecontextfacilitytype.getCodingFirstRep();

		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Dsply ********************************************************************************/
		if(documentreferencecontextfacilitytypecoding.hasDisplay()) {
			d.setDocRfrncCntxtFacilityTypCdgDsply(String.valueOf(documentreferencecontextfacilitytypecoding.getDisplay()));
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecontextfacilitytypecoding.hasVersion()) {
			d.setDocRfrncCntxtFacilityTypCdgVrsn(String.valueOf(documentreferencecontextfacilitytypecoding.getVersion()));
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Cd ********************************************************************************/
		if(documentreferencecontextfacilitytypecoding.hasCode()) {
			d.setDocRfrncCntxtFacilityTypCdgCd(String.valueOf(documentreferencecontextfacilitytypecoding.getCode()));
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Sys ********************************************************************************/
		if(documentreferencecontextfacilitytypecoding.hasSystem()) {
			d.setDocRfrncCntxtFacilityTypCdgSys(String.valueOf(documentreferencecontextfacilitytypecoding.getSystem()));
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecontextfacilitytypecoding.hasUserSelected()) {
			d.setDocRfrncCntxtFacilityTypCdgUsrSltd(String.valueOf(documentreferencecontextfacilitytypecoding.getUserSelected()));
		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Txt ********************************************************************************/
		if(documentreferencecontextfacilitytype.hasText()) {
			d.setDocRfrncCntxtFacilityTypTxt(String.valueOf(documentreferencecontextfacilitytype.getText()));
		}
		/******************** documentreferencecontextpracticesetting ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextpracticesetting = documentreferencecontext.getPracticeSetting();

		/******************** documentreferencecontextpracticesettingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontextpracticesettingcoding = documentreferencecontextpracticesetting.getCodingFirstRep();

		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Dsply ********************************************************************************/
		if(documentreferencecontextpracticesettingcoding.hasDisplay()) {
			d.setDocRfrncCntxtPracticeSttingCdgDsply(String.valueOf(documentreferencecontextpracticesettingcoding.getDisplay()));
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecontextpracticesettingcoding.hasVersion()) {
			d.setDocRfrncCntxtPracticeSttingCdgVrsn(String.valueOf(documentreferencecontextpracticesettingcoding.getVersion()));
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Cd ********************************************************************************/
		if(documentreferencecontextpracticesettingcoding.hasCode()) {
			d.setDocRfrncCntxtPracticeSttingCdgCd(String.valueOf(documentreferencecontextpracticesettingcoding.getCode()));
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Sys ********************************************************************************/
		if(documentreferencecontextpracticesettingcoding.hasSystem()) {
			d.setDocRfrncCntxtPracticeSttingCdgSys(String.valueOf(documentreferencecontextpracticesettingcoding.getSystem()));
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecontextpracticesettingcoding.hasUserSelected()) {
			d.setDocRfrncCntxtPracticeSttingCdgUsrSltd(String.valueOf(documentreferencecontextpracticesettingcoding.getUserSelected()));
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Txt ********************************************************************************/
		if(documentreferencecontextpracticesetting.hasText()) {
			d.setDocRfrncCntxtPracticeSttingTxt(String.valueOf(documentreferencecontextpracticesetting.getText()));
		}
		/******************** documentreferencecontextevent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextevent = documentreferencecontext.getEventFirstRep();

		/******************** documentreferencecontexteventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontexteventcoding = documentreferencecontextevent.getCodingFirstRep();

		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Dsply ********************************************************************************/
		if(documentreferencecontexteventcoding.hasDisplay()) {
			d.setDocRfrncCntxtEvntCdgDsply(String.valueOf(documentreferencecontexteventcoding.getDisplay()));
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecontexteventcoding.hasVersion()) {
			d.setDocRfrncCntxtEvntCdgVrsn(String.valueOf(documentreferencecontexteventcoding.getVersion()));
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Cd ********************************************************************************/
		if(documentreferencecontexteventcoding.hasCode()) {
			d.setDocRfrncCntxtEvntCdgCd(String.valueOf(documentreferencecontexteventcoding.getCode()));
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Sys ********************************************************************************/
		if(documentreferencecontexteventcoding.hasSystem()) {
			d.setDocRfrncCntxtEvntCdgSys(String.valueOf(documentreferencecontexteventcoding.getSystem()));
		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecontexteventcoding.hasUserSelected()) {
			d.setDocRfrncCntxtEvntCdgUsrSltd(String.valueOf(documentreferencecontexteventcoding.getUserSelected()));
		}
		/******************** DocRfrnc_Cntxt_Evnt_Txt ********************************************************************************/
		if(documentreferencecontextevent.hasText()) {
			d.setDocRfrncCntxtEvntTxt(String.valueOf(documentreferencecontextevent.getText()));
		}
		/******************** DocRfrnc_Cntxt_Rlted ********************************************************************************/
		if(documentreferencecontext.hasRelated()) {
			d.setDocRfrncCntxtRlted(String.valueOf(documentreferencecontext.getRelatedFirstRep()));
		}
		/******************** documentreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencetype = documentreference.getType();

		/******************** documentreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencetypecoding = documentreferencetype.getCodingFirstRep();

		/******************** DocRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(documentreferencetypecoding.hasDisplay()) {
			d.setDocRfrncTypCdgDsply(String.valueOf(documentreferencetypecoding.getDisplay()));
		}
		/******************** DocRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentreferencetypecoding.hasVersion()) {
			d.setDocRfrncTypCdgVrsn(String.valueOf(documentreferencetypecoding.getVersion()));
		}
		/******************** DocRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(documentreferencetypecoding.hasCode()) {
			d.setDocRfrncTypCdgCd(String.valueOf(documentreferencetypecoding.getCode()));
		}
		/******************** DocRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(documentreferencetypecoding.hasSystem()) {
			d.setDocRfrncTypCdgSys(String.valueOf(documentreferencetypecoding.getSystem()));
		}
		/******************** DocRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencetypecoding.hasUserSelected()) {
			d.setDocRfrncTypCdgUsrSltd(String.valueOf(documentreferencetypecoding.getUserSelected()));
		}
		/******************** DocRfrnc_Typ_Txt ********************************************************************************/
		if(documentreferencetype.hasText()) {
			d.setDocRfrncTypTxt(String.valueOf(documentreferencetype.getText()));
		}
		/******************** DocRfrnc_Dt ********************************************************************************/
		if(documentreference.hasDate()) {
			d.setDocRfrncDt(String.valueOf(documentreference.getDate()));
		}
		/******************** DocRfrnc_Sbjct ********************************************************************************/
		if(documentreference.hasSubject()) {
			d.setDocRfrncSbjct(String.valueOf(documentreference.getSubject()));
		}
		/******************** documentreferencestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus documentreferencestatus = documentreference.getStatus();
		d.setDocRfrncSts(documentreferencestatus.toCode());

		/******************** DocRfrnc_Dscrptn ********************************************************************************/
		if(documentreference.hasDescription()) {
			d.setDocRfrncDscrptn(String.valueOf(documentreference.getDescription()));
		}
		/******************** documentreferencecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecategory = documentreference.getCategoryFirstRep();

		/******************** documentreferencecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecategorycoding = documentreferencecategory.getCodingFirstRep();

		/******************** DocRfrnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(documentreferencecategorycoding.hasDisplay()) {
			d.setDocRfrncCtgryCdgDsply(String.valueOf(documentreferencecategorycoding.getDisplay()));
		}
		/******************** DocRfrnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecategorycoding.hasVersion()) {
			d.setDocRfrncCtgryCdgVrsn(String.valueOf(documentreferencecategorycoding.getVersion()));
		}
		/******************** DocRfrnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(documentreferencecategorycoding.hasCode()) {
			d.setDocRfrncCtgryCdgCd(String.valueOf(documentreferencecategorycoding.getCode()));
		}
		/******************** DocRfrnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(documentreferencecategorycoding.hasSystem()) {
			d.setDocRfrncCtgryCdgSys(String.valueOf(documentreferencecategorycoding.getSystem()));
		}
		/******************** DocRfrnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecategorycoding.hasUserSelected()) {
			d.setDocRfrncCtgryCdgUsrSltd(String.valueOf(documentreferencecategorycoding.getUserSelected()));
		}
		/******************** DocRfrnc_Ctgry_Txt ********************************************************************************/
		if(documentreferencecategory.hasText()) {
			d.setDocRfrncCtgryTxt(String.valueOf(documentreferencecategory.getText()));
		}
		/******************** documentreferenceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentreferenceidentifier = documentreference.getIdentifierFirstRep();

		/******************** DocRfrnc_Id_Vl ********************************************************************************/
		if(documentreferenceidentifier.hasValue()) {
			d.setDocRfrncIdVl(String.valueOf(documentreferenceidentifier.getValue()));
		}
		/******************** documentreferenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferenceidentifiertype = documentreferenceidentifier.getType();

		/******************** documentreferenceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferenceidentifiertypecoding = documentreferenceidentifiertype.getCodingFirstRep();

		/******************** DocRfrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(documentreferenceidentifiertypecoding.hasDisplay()) {
			d.setDocRfrncIdTypCdgDsply(String.valueOf(documentreferenceidentifiertypecoding.getDisplay()));
		}
		/******************** DocRfrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentreferenceidentifiertypecoding.hasVersion()) {
			d.setDocRfrncIdTypCdgVrsn(String.valueOf(documentreferenceidentifiertypecoding.getVersion()));
		}
		/******************** DocRfrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(documentreferenceidentifiertypecoding.hasCode()) {
			d.setDocRfrncIdTypCdgCd(String.valueOf(documentreferenceidentifiertypecoding.getCode()));
		}
		/******************** DocRfrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(documentreferenceidentifiertypecoding.hasSystem()) {
			d.setDocRfrncIdTypCdgSys(String.valueOf(documentreferenceidentifiertypecoding.getSystem()));
		}
		/******************** DocRfrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentreferenceidentifiertypecoding.hasUserSelected()) {
			d.setDocRfrncIdTypCdgUsrSltd(String.valueOf(documentreferenceidentifiertypecoding.getUserSelected()));
		}
		/******************** DocRfrnc_Id_Typ_Txt ********************************************************************************/
		if(documentreferenceidentifiertype.hasText()) {
			d.setDocRfrncIdTypTxt(String.valueOf(documentreferenceidentifiertype.getText()));
		}
		/******************** DocRfrnc_Id_Sys ********************************************************************************/
		if(documentreferenceidentifier.hasSystem()) {
			d.setDocRfrncIdSys(String.valueOf(documentreferenceidentifier.getSystem()));
		}
		/******************** DocRfrnc_Id_Assigner ********************************************************************************/
		if(documentreferenceidentifier.hasAssigner()) {
			d.setDocRfrncIdAssigner(String.valueOf(documentreferenceidentifier.getAssigner()));
		}
		/******************** documentreferenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferenceidentifierperiod = documentreferenceidentifier.getPeriod();

		/******************** DocRfrnc_Id_Prd_End ********************************************************************************/
		if(documentreferenceidentifierperiod.hasEnd()) {
			d.setDocRfrncIdPrdEnd(String.valueOf(documentreferenceidentifierperiod.getEnd()));
		}
		/******************** DocRfrnc_Id_Prd_Strt ********************************************************************************/
		if(documentreferenceidentifierperiod.hasStart()) {
			d.setDocRfrncIdPrdStrt(String.valueOf(documentreferenceidentifierperiod.getStart()));
		}
		/******************** documentreferenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentreferenceidentifieruse = documentreferenceidentifier.getUse();
		d.setDocRfrncIdUse(documentreferenceidentifieruse.toCode());

		/******************** documentreferencedocstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatus documentreferencedocstatus = documentreference.getDocStatus();
		d.setDocRfrncDocSts(documentreferencedocstatus.toCode());

		/******************** DocRfrnc_Athr ********************************************************************************/
		if(documentreference.hasAuthor()) {
			d.setDocRfrncAthr(String.valueOf(documentreference.getAuthorFirstRep()));
		}
		/******************** DocRfrnc_Authenticator ********************************************************************************/
		if(documentreference.hasAuthenticator()) {
			d.setDocRfrncAuthenticator(String.valueOf(documentreference.getAuthenticator()));
		}
		/******************** DocRfrnc_Custodian ********************************************************************************/
		if(documentreference.hasCustodian()) {
			d.setDocRfrncCustodian(String.valueOf(documentreference.getCustodian()));
		}
		/******************** documentreferencecontent ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent documentreferencecontent = documentreference.getContentFirstRep();

		/******************** documentreferencecontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment documentreferencecontentattachment = documentreferencecontent.getAttachment();

		/******************** DocRfrnc_Cntnt_Attchmnt_Sz ********************************************************************************/
		if(documentreferencecontentattachment.hasSize()) {
			d.setDocRfrncCntntAttchmntSz(String.valueOf(documentreferencecontentattachment.getSize()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Lnguage ********************************************************************************/
		if(documentreferencecontentattachment.hasLanguage()) {
			d.setDocRfrncCntntAttchmntLnguage(String.valueOf(documentreferencecontentattachment.getLanguage()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_CntntTyp ********************************************************************************/
		if(documentreferencecontentattachment.hasContentType()) {
			d.setDocRfrncCntntAttchmntCntntTyp(String.valueOf(documentreferencecontentattachment.getContentType()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Url ********************************************************************************/
		if(documentreferencecontentattachment.hasUrl()) {
			d.setDocRfrncCntntAttchmntUrl(String.valueOf(documentreferencecontentattachment.getUrl()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Ttl ********************************************************************************/
		if(documentreferencecontentattachment.hasTitle()) {
			d.setDocRfrncCntntAttchmntTtl(String.valueOf(documentreferencecontentattachment.getTitle()));
		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Hash ********************************************************************************/
		if(documentreferencecontentattachment.hasHash()) {
			d.setDocRfrncCntntAttchmntHash(String.valueOf(documentreferencecontentattachment.getHash()));
		}

		/******************** DocRfrnc_Cntnt_Attchmnt_Data ********************************************************************************/
		if(documentreferencecontentattachment.hasData()) {
			d.setDocRfrncCntntAttchmntData(String.valueOf(documentreferencecontentattachment.getData()));
		}

		/******************** DocRfrnc_Cntnt_Attchmnt_Creation ********************************************************************************/
		if(documentreferencecontentattachment.hasCreation()) {
			d.setDocRfrncCntntAttchmntCreation(String.valueOf(documentreferencecontentattachment.getCreation()));
		}
		/******************** documentreferencecontentformat ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontentformat = documentreferencecontent.getFormat();

		/******************** DocRfrnc_Cntnt_Frmat_Dsply ********************************************************************************/
		if(documentreferencecontentformat.hasDisplay()) {
			d.setDocRfrncCntntFrmatDsply(String.valueOf(documentreferencecontentformat.getDisplay()));
		}
		/******************** DocRfrnc_Cntnt_Frmat_Vrsn ********************************************************************************/
		if(documentreferencecontentformat.hasVersion()) {
			d.setDocRfrncCntntFrmatVrsn(String.valueOf(documentreferencecontentformat.getVersion()));
		}
		/******************** DocRfrnc_Cntnt_Frmat_Cd ********************************************************************************/
		if(documentreferencecontentformat.hasCode()) {
			d.setDocRfrncCntntFrmatCd(String.valueOf(documentreferencecontentformat.getCode()));
		}
		/******************** DocRfrnc_Cntnt_Frmat_Sys ********************************************************************************/
		if(documentreferencecontentformat.hasSystem()) {
			d.setDocRfrncCntntFrmatSys(String.valueOf(documentreferencecontentformat.getSystem()));
		}
		/******************** DocRfrnc_Cntnt_Frmat_UsrSltd ********************************************************************************/
		if(documentreferencecontentformat.hasUserSelected()) {
			d.setDocRfrncCntntFrmatUsrSltd(String.valueOf(documentreferencecontentformat.getUserSelected()));
		}
		/******************** documentreferencemasteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentreferencemasteridentifier = documentreference.getMasterIdentifier();

		/******************** DocRfrnc_MasterId_Vl ********************************************************************************/
		if(documentreferencemasteridentifier.hasValue()) {
			d.setDocRfrncMasterIdVl(String.valueOf(documentreferencemasteridentifier.getValue()));
		}
		/******************** documentreferencemasteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencemasteridentifiertype = documentreferencemasteridentifier.getType();

		/******************** documentreferencemasteridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencemasteridentifiertypecoding = documentreferencemasteridentifiertype.getCodingFirstRep();

		/******************** DocRfrnc_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(documentreferencemasteridentifiertypecoding.hasDisplay()) {
			d.setDocRfrncMasterIdTypCdgDsply(String.valueOf(documentreferencemasteridentifiertypecoding.getDisplay()));
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentreferencemasteridentifiertypecoding.hasVersion()) {
			d.setDocRfrncMasterIdTypCdgVrsn(String.valueOf(documentreferencemasteridentifiertypecoding.getVersion()));
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(documentreferencemasteridentifiertypecoding.hasCode()) {
			d.setDocRfrncMasterIdTypCdgCd(String.valueOf(documentreferencemasteridentifiertypecoding.getCode()));
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(documentreferencemasteridentifiertypecoding.hasSystem()) {
			d.setDocRfrncMasterIdTypCdgSys(String.valueOf(documentreferencemasteridentifiertypecoding.getSystem()));
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencemasteridentifiertypecoding.hasUserSelected()) {
			d.setDocRfrncMasterIdTypCdgUsrSltd(String.valueOf(documentreferencemasteridentifiertypecoding.getUserSelected()));
		}
		/******************** DocRfrnc_MasterId_Typ_Txt ********************************************************************************/
		if(documentreferencemasteridentifiertype.hasText()) {
			d.setDocRfrncMasterIdTypTxt(String.valueOf(documentreferencemasteridentifiertype.getText()));
		}
		/******************** DocRfrnc_MasterId_Sys ********************************************************************************/
		if(documentreferencemasteridentifier.hasSystem()) {
			d.setDocRfrncMasterIdSys(String.valueOf(documentreferencemasteridentifier.getSystem()));
		}
		/******************** DocRfrnc_MasterId_Assigner ********************************************************************************/
		if(documentreferencemasteridentifier.hasAssigner()) {
			d.setDocRfrncMasterIdAssigner(String.valueOf(documentreferencemasteridentifier.getAssigner()));
		}
		/******************** documentreferencemasteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferencemasteridentifierperiod = documentreferencemasteridentifier.getPeriod();

		/******************** DocRfrnc_MasterId_Prd_End ********************************************************************************/
		if(documentreferencemasteridentifierperiod.hasEnd()) {
			d.setDocRfrncMasterIdPrdEnd(String.valueOf(documentreferencemasteridentifierperiod.getEnd()));
		}
		/******************** DocRfrnc_MasterId_Prd_Strt ********************************************************************************/
		if(documentreferencemasteridentifierperiod.hasStart()) {
			d.setDocRfrncMasterIdPrdStrt(String.valueOf(documentreferencemasteridentifierperiod.getStart()));
		}
		/******************** documentreferencemasteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentreferencemasteridentifieruse = documentreferencemasteridentifier.getUse();
		d.setDocRfrncMasterIdUse(documentreferencemasteridentifieruse.toCode());

		/******************** documentreferencesecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencesecuritylabel = documentreference.getSecurityLabelFirstRep();

		/******************** documentreferencesecuritylabelcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencesecuritylabelcoding = documentreferencesecuritylabel.getCodingFirstRep();

		/******************** DocRfrnc_SecurityLbl_Cdg_Dsply ********************************************************************************/
		if(documentreferencesecuritylabelcoding.hasDisplay()) {
			d.setDocRfrncSecurityLblCdgDsply(String.valueOf(documentreferencesecuritylabelcoding.getDisplay()));
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Vrsn ********************************************************************************/
		if(documentreferencesecuritylabelcoding.hasVersion()) {
			d.setDocRfrncSecurityLblCdgVrsn(String.valueOf(documentreferencesecuritylabelcoding.getVersion()));
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Cd ********************************************************************************/
		if(documentreferencesecuritylabelcoding.hasCode()) {
			d.setDocRfrncSecurityLblCdgCd(String.valueOf(documentreferencesecuritylabelcoding.getCode()));
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Sys ********************************************************************************/
		if(documentreferencesecuritylabelcoding.hasSystem()) {
			d.setDocRfrncSecurityLblCdgSys(String.valueOf(documentreferencesecuritylabelcoding.getSystem()));
		}
		/******************** DocRfrnc_SecurityLbl_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencesecuritylabelcoding.hasUserSelected()) {
			d.setDocRfrncSecurityLblCdgUsrSltd(String.valueOf(documentreferencesecuritylabelcoding.getUserSelected()));
		}
		/******************** DocRfrnc_SecurityLbl_Txt ********************************************************************************/
		if(documentreferencesecuritylabel.hasText()) {
			d.setDocRfrncSecurityLblTxt(String.valueOf(documentreferencesecuritylabel.getText()));
		}
		/******************** documentreferencerelatesto ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent documentreferencerelatesto = documentreference.getRelatesToFirstRep();

		/******************** documentreferencerelatestocode ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType documentreferencerelatestocode = documentreferencerelatesto.getCode();
		d.setDocRfrncRelatesToCd(documentreferencerelatestocode.toCode());

		return d;
	}
}
