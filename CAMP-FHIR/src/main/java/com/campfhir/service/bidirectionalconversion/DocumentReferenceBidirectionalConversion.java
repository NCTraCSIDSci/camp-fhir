package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentReference;
public class DocumentReferenceBidirectionalConversion 
{
	public DocumentReference DocumentReferences(org.hl7.fhir.r4.model.DocumentReference documentreference) throws ParseException
	{
		 main.java.com.campfhir.model.DocumentReference d = new  main.java.com.campfhir.model.DocumentReference();

		/******************** id ********************************************************************************/
		d.setId(documentreference.getIdElement().getIdPart());

		/******************** documentreferencecontext ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent documentreferencecontext = documentreference.getContext();

		/******************** DocRfrnc_Cntxt_Enc ********************************************************************************/
		if(documentreferencecontext.hasEncounter()) {

			String  array = "[";
			for(int incr=0; incr<documentreferencecontext.getEncounter().size(); incr++) {
				array = array + documentreferencecontext.getEncounter().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDocRfrncCntxtEnc(array);

		} else {
			d.addDocRfrncCntxtEnc("NULL");
		}


		/******************** documentreferencecontextperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferencecontextperiod = documentreferencecontext.getPeriod();

		/******************** DocRfrnc_Cntxt_Prd_Strt ********************************************************************************/
		if(documentreferencecontextperiod.hasStart()) {

			d.addDocRfrncCntxtPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreferencecontextperiod.getStart())+"\"");
		} else {
			d.addDocRfrncCntxtPrdStrt("NULL");
		}


		/******************** DocRfrnc_Cntxt_Prd_End ********************************************************************************/
		if(documentreferencecontextperiod.hasEnd()) {

			d.addDocRfrncCntxtPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreferencecontextperiod.getEnd())+"\"");
		} else {
			d.addDocRfrncCntxtPrdEnd("NULL");
		}


		/******************** DocRfrnc_Cntxt_Rlted ********************************************************************************/
		if(documentreferencecontext.hasRelated()) {

			String  array = "[";
			for(int incr=0; incr<documentreferencecontext.getRelated().size(); incr++) {
				array = array + documentreferencecontext.getRelated().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDocRfrncCntxtRlted(array);

		} else {
			d.addDocRfrncCntxtRlted("NULL");
		}


		/******************** documentreferencecontextevent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> documentreferencecontexteventlist = documentreferencecontext.getEvent();
		for(int documentreferencecontexteventi = 0; documentreferencecontexteventi<documentreferencecontexteventlist.size();documentreferencecontexteventi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  documentreferencecontextevent = documentreferencecontexteventlist.get(documentreferencecontexteventi);

		/******************** DocRfrnc_Cntxt_Evnt_Txt ********************************************************************************/
		if(documentreferencecontexteventi == 0) {d.addDocRfrncCntxtEvntTxt("[");}
		if(documentreferencecontextevent.hasText()) {

			d.addDocRfrncCntxtEvntTxt(String.valueOf(documentreferencecontextevent.getText()));
		} else {
			d.addDocRfrncCntxtEvntTxt("NULL");
		}

		if(documentreferencecontexteventi == documentreferencecontexteventlist.size()-1) {d.addDocRfrncCntxtEvntTxt("]");}


		/******************** documentreferencecontexteventcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferencecontexteventcodinglist = documentreferencecontextevent.getCoding();
		for(int documentreferencecontexteventcodingi = 0; documentreferencecontexteventcodingi<documentreferencecontexteventcodinglist.size();documentreferencecontexteventcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferencecontexteventcoding = documentreferencecontexteventcodinglist.get(documentreferencecontexteventcodingi);

		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Dsply ********************************************************************************/
		if(documentreferencecontexteventcodingi == 0) {d.addDocRfrncCntxtEvntCdgDsply("[[");}
		if(documentreferencecontexteventcoding.hasDisplay()) {

			d.addDocRfrncCntxtEvntCdgDsply(String.valueOf(documentreferencecontexteventcoding.getDisplay()));
		} else {
			d.addDocRfrncCntxtEvntCdgDsply("NULL");
		}

		if(documentreferencecontexteventcodingi == documentreferencecontexteventcodinglist.size()-1) {d.addDocRfrncCntxtEvntCdgDsply("]]");}


		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecontexteventcodingi == 0) {d.addDocRfrncCntxtEvntCdgVrsn("[[");}
		if(documentreferencecontexteventcoding.hasVersion()) {

			d.addDocRfrncCntxtEvntCdgVrsn(String.valueOf(documentreferencecontexteventcoding.getVersion()));
		} else {
			d.addDocRfrncCntxtEvntCdgVrsn("NULL");
		}

		if(documentreferencecontexteventcodingi == documentreferencecontexteventcodinglist.size()-1) {d.addDocRfrncCntxtEvntCdgVrsn("]]");}


		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Cd ********************************************************************************/
		if(documentreferencecontexteventcodingi == 0) {d.addDocRfrncCntxtEvntCdgCd("[[");}
		if(documentreferencecontexteventcoding.hasCode()) {

			d.addDocRfrncCntxtEvntCdgCd(String.valueOf(documentreferencecontexteventcoding.getCode()));
		} else {
			d.addDocRfrncCntxtEvntCdgCd("NULL");
		}

		if(documentreferencecontexteventcodingi == documentreferencecontexteventcodinglist.size()-1) {d.addDocRfrncCntxtEvntCdgCd("]]");}


		/******************** DocRfrnc_Cntxt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecontexteventcodingi == 0) {d.addDocRfrncCntxtEvntCdgUsrSltd("[[");}
		if(documentreferencecontexteventcoding.hasUserSelected()) {

			d.addDocRfrncCntxtEvntCdgUsrSltd(String.valueOf(documentreferencecontexteventcoding.getUserSelected()));
		} else {
			d.addDocRfrncCntxtEvntCdgUsrSltd("NULL");
		}

		if(documentreferencecontexteventcodingi == documentreferencecontexteventcodinglist.size()-1) {d.addDocRfrncCntxtEvntCdgUsrSltd("]]");}


		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Sys ********************************************************************************/
		if(documentreferencecontexteventcodingi == 0) {d.addDocRfrncCntxtEvntCdgSys("[[");}
		if(documentreferencecontexteventcoding.hasSystem()) {

			d.addDocRfrncCntxtEvntCdgSys(String.valueOf(documentreferencecontexteventcoding.getSystem()));
		} else {
			d.addDocRfrncCntxtEvntCdgSys("NULL");
		}

		if(documentreferencecontexteventcodingi == documentreferencecontexteventcodinglist.size()-1) {d.addDocRfrncCntxtEvntCdgSys("]]");}


		 };
		 };
		/******************** DocRfrnc_Cntxt_SrcPntInfo ********************************************************************************/
		if(documentreferencecontext.hasSourcePatientInfo()) {

			if(documentreferencecontext.getSourcePatientInfo().getReference() != null) {
			d.addDocRfrncCntxtSrcPntInfo(documentreferencecontext.getSourcePatientInfo().getReference());
			}
		} else {
			d.addDocRfrncCntxtSrcPntInfo("NULL");
		}


		/******************** documentreferencecontextfacilitytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextfacilitytype = documentreferencecontext.getFacilityType();

		/******************** DocRfrnc_Cntxt_FacilityTyp_Txt ********************************************************************************/
		if(documentreferencecontextfacilitytype.hasText()) {

			d.addDocRfrncCntxtFacilityTypTxt(String.valueOf(documentreferencecontextfacilitytype.getText()));
		} else {
			d.addDocRfrncCntxtFacilityTypTxt("NULL");
		}


		/******************** documentreferencecontextfacilitytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferencecontextfacilitytypecodinglist = documentreferencecontextfacilitytype.getCoding();
		for(int documentreferencecontextfacilitytypecodingi = 0; documentreferencecontextfacilitytypecodingi<documentreferencecontextfacilitytypecodinglist.size();documentreferencecontextfacilitytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferencecontextfacilitytypecoding = documentreferencecontextfacilitytypecodinglist.get(documentreferencecontextfacilitytypecodingi);

		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Dsply ********************************************************************************/
		if(documentreferencecontextfacilitytypecodingi == 0) {d.addDocRfrncCntxtFacilityTypCdgDsply("[");}
		if(documentreferencecontextfacilitytypecoding.hasDisplay()) {

			d.addDocRfrncCntxtFacilityTypCdgDsply(String.valueOf(documentreferencecontextfacilitytypecoding.getDisplay()));
		} else {
			d.addDocRfrncCntxtFacilityTypCdgDsply("NULL");
		}

		if(documentreferencecontextfacilitytypecodingi == documentreferencecontextfacilitytypecodinglist.size()-1) {d.addDocRfrncCntxtFacilityTypCdgDsply("]");}


		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecontextfacilitytypecodingi == 0) {d.addDocRfrncCntxtFacilityTypCdgVrsn("[");}
		if(documentreferencecontextfacilitytypecoding.hasVersion()) {

			d.addDocRfrncCntxtFacilityTypCdgVrsn(String.valueOf(documentreferencecontextfacilitytypecoding.getVersion()));
		} else {
			d.addDocRfrncCntxtFacilityTypCdgVrsn("NULL");
		}

		if(documentreferencecontextfacilitytypecodingi == documentreferencecontextfacilitytypecodinglist.size()-1) {d.addDocRfrncCntxtFacilityTypCdgVrsn("]");}


		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Cd ********************************************************************************/
		if(documentreferencecontextfacilitytypecodingi == 0) {d.addDocRfrncCntxtFacilityTypCdgCd("[");}
		if(documentreferencecontextfacilitytypecoding.hasCode()) {

			d.addDocRfrncCntxtFacilityTypCdgCd(String.valueOf(documentreferencecontextfacilitytypecoding.getCode()));
		} else {
			d.addDocRfrncCntxtFacilityTypCdgCd("NULL");
		}

		if(documentreferencecontextfacilitytypecodingi == documentreferencecontextfacilitytypecodinglist.size()-1) {d.addDocRfrncCntxtFacilityTypCdgCd("]");}


		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecontextfacilitytypecodingi == 0) {d.addDocRfrncCntxtFacilityTypCdgUsrSltd("[");}
		if(documentreferencecontextfacilitytypecoding.hasUserSelected()) {

			d.addDocRfrncCntxtFacilityTypCdgUsrSltd(String.valueOf(documentreferencecontextfacilitytypecoding.getUserSelected()));
		} else {
			d.addDocRfrncCntxtFacilityTypCdgUsrSltd("NULL");
		}

		if(documentreferencecontextfacilitytypecodingi == documentreferencecontextfacilitytypecodinglist.size()-1) {d.addDocRfrncCntxtFacilityTypCdgUsrSltd("]");}


		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Sys ********************************************************************************/
		if(documentreferencecontextfacilitytypecodingi == 0) {d.addDocRfrncCntxtFacilityTypCdgSys("[");}
		if(documentreferencecontextfacilitytypecoding.hasSystem()) {

			d.addDocRfrncCntxtFacilityTypCdgSys(String.valueOf(documentreferencecontextfacilitytypecoding.getSystem()));
		} else {
			d.addDocRfrncCntxtFacilityTypCdgSys("NULL");
		}

		if(documentreferencecontextfacilitytypecodingi == documentreferencecontextfacilitytypecodinglist.size()-1) {d.addDocRfrncCntxtFacilityTypCdgSys("]");}


		 };
		/******************** documentreferencecontextpracticesetting ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencecontextpracticesetting = documentreferencecontext.getPracticeSetting();

		/******************** DocRfrnc_Cntxt_PracticeStting_Txt ********************************************************************************/
		if(documentreferencecontextpracticesetting.hasText()) {

			d.addDocRfrncCntxtPracticeSttingTxt(String.valueOf(documentreferencecontextpracticesetting.getText()));
		} else {
			d.addDocRfrncCntxtPracticeSttingTxt("NULL");
		}


		/******************** documentreferencecontextpracticesettingcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferencecontextpracticesettingcodinglist = documentreferencecontextpracticesetting.getCoding();
		for(int documentreferencecontextpracticesettingcodingi = 0; documentreferencecontextpracticesettingcodingi<documentreferencecontextpracticesettingcodinglist.size();documentreferencecontextpracticesettingcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferencecontextpracticesettingcoding = documentreferencecontextpracticesettingcodinglist.get(documentreferencecontextpracticesettingcodingi);

		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Dsply ********************************************************************************/
		if(documentreferencecontextpracticesettingcodingi == 0) {d.addDocRfrncCntxtPracticeSttingCdgDsply("[");}
		if(documentreferencecontextpracticesettingcoding.hasDisplay()) {

			d.addDocRfrncCntxtPracticeSttingCdgDsply(String.valueOf(documentreferencecontextpracticesettingcoding.getDisplay()));
		} else {
			d.addDocRfrncCntxtPracticeSttingCdgDsply("NULL");
		}

		if(documentreferencecontextpracticesettingcodingi == documentreferencecontextpracticesettingcodinglist.size()-1) {d.addDocRfrncCntxtPracticeSttingCdgDsply("]");}


		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecontextpracticesettingcodingi == 0) {d.addDocRfrncCntxtPracticeSttingCdgVrsn("[");}
		if(documentreferencecontextpracticesettingcoding.hasVersion()) {

			d.addDocRfrncCntxtPracticeSttingCdgVrsn(String.valueOf(documentreferencecontextpracticesettingcoding.getVersion()));
		} else {
			d.addDocRfrncCntxtPracticeSttingCdgVrsn("NULL");
		}

		if(documentreferencecontextpracticesettingcodingi == documentreferencecontextpracticesettingcodinglist.size()-1) {d.addDocRfrncCntxtPracticeSttingCdgVrsn("]");}


		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Cd ********************************************************************************/
		if(documentreferencecontextpracticesettingcodingi == 0) {d.addDocRfrncCntxtPracticeSttingCdgCd("[");}
		if(documentreferencecontextpracticesettingcoding.hasCode()) {

			d.addDocRfrncCntxtPracticeSttingCdgCd(String.valueOf(documentreferencecontextpracticesettingcoding.getCode()));
		} else {
			d.addDocRfrncCntxtPracticeSttingCdgCd("NULL");
		}

		if(documentreferencecontextpracticesettingcodingi == documentreferencecontextpracticesettingcodinglist.size()-1) {d.addDocRfrncCntxtPracticeSttingCdgCd("]");}


		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecontextpracticesettingcodingi == 0) {d.addDocRfrncCntxtPracticeSttingCdgUsrSltd("[");}
		if(documentreferencecontextpracticesettingcoding.hasUserSelected()) {

			d.addDocRfrncCntxtPracticeSttingCdgUsrSltd(String.valueOf(documentreferencecontextpracticesettingcoding.getUserSelected()));
		} else {
			d.addDocRfrncCntxtPracticeSttingCdgUsrSltd("NULL");
		}

		if(documentreferencecontextpracticesettingcodingi == documentreferencecontextpracticesettingcodinglist.size()-1) {d.addDocRfrncCntxtPracticeSttingCdgUsrSltd("]");}


		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Sys ********************************************************************************/
		if(documentreferencecontextpracticesettingcodingi == 0) {d.addDocRfrncCntxtPracticeSttingCdgSys("[");}
		if(documentreferencecontextpracticesettingcoding.hasSystem()) {

			d.addDocRfrncCntxtPracticeSttingCdgSys(String.valueOf(documentreferencecontextpracticesettingcoding.getSystem()));
		} else {
			d.addDocRfrncCntxtPracticeSttingCdgSys("NULL");
		}

		if(documentreferencecontextpracticesettingcodingi == documentreferencecontextpracticesettingcodinglist.size()-1) {d.addDocRfrncCntxtPracticeSttingCdgSys("]");}


		 };
		/******************** documentreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencetype = documentreference.getType();

		/******************** DocRfrnc_Typ_Txt ********************************************************************************/
		if(documentreferencetype.hasText()) {

			d.addDocRfrncTypTxt(String.valueOf(documentreferencetype.getText()));
		} else {
			d.addDocRfrncTypTxt("NULL");
		}


		/******************** documentreferencetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferencetypecodinglist = documentreferencetype.getCoding();
		for(int documentreferencetypecodingi = 0; documentreferencetypecodingi<documentreferencetypecodinglist.size();documentreferencetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferencetypecoding = documentreferencetypecodinglist.get(documentreferencetypecodingi);

		/******************** DocRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(documentreferencetypecodingi == 0) {d.addDocRfrncTypCdgDsply("[");}
		if(documentreferencetypecoding.hasDisplay()) {

			d.addDocRfrncTypCdgDsply(String.valueOf(documentreferencetypecoding.getDisplay()));
		} else {
			d.addDocRfrncTypCdgDsply("NULL");
		}

		if(documentreferencetypecodingi == documentreferencetypecodinglist.size()-1) {d.addDocRfrncTypCdgDsply("]");}


		/******************** DocRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentreferencetypecodingi == 0) {d.addDocRfrncTypCdgVrsn("[");}
		if(documentreferencetypecoding.hasVersion()) {

			d.addDocRfrncTypCdgVrsn(String.valueOf(documentreferencetypecoding.getVersion()));
		} else {
			d.addDocRfrncTypCdgVrsn("NULL");
		}

		if(documentreferencetypecodingi == documentreferencetypecodinglist.size()-1) {d.addDocRfrncTypCdgVrsn("]");}


		/******************** DocRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(documentreferencetypecodingi == 0) {d.addDocRfrncTypCdgCd("[");}
		if(documentreferencetypecoding.hasCode()) {

			d.addDocRfrncTypCdgCd(String.valueOf(documentreferencetypecoding.getCode()));
		} else {
			d.addDocRfrncTypCdgCd("NULL");
		}

		if(documentreferencetypecodingi == documentreferencetypecodinglist.size()-1) {d.addDocRfrncTypCdgCd("]");}


		/******************** DocRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencetypecodingi == 0) {d.addDocRfrncTypCdgUsrSltd("[");}
		if(documentreferencetypecoding.hasUserSelected()) {

			d.addDocRfrncTypCdgUsrSltd(String.valueOf(documentreferencetypecoding.getUserSelected()));
		} else {
			d.addDocRfrncTypCdgUsrSltd("NULL");
		}

		if(documentreferencetypecodingi == documentreferencetypecodinglist.size()-1) {d.addDocRfrncTypCdgUsrSltd("]");}


		/******************** DocRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(documentreferencetypecodingi == 0) {d.addDocRfrncTypCdgSys("[");}
		if(documentreferencetypecoding.hasSystem()) {

			d.addDocRfrncTypCdgSys(String.valueOf(documentreferencetypecoding.getSystem()));
		} else {
			d.addDocRfrncTypCdgSys("NULL");
		}

		if(documentreferencetypecodingi == documentreferencetypecodinglist.size()-1) {d.addDocRfrncTypCdgSys("]");}


		 };
		/******************** documentreferencecontent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent> documentreferencecontentlist = documentreference.getContent();
		for(int documentreferencecontenti = 0; documentreferencecontenti<documentreferencecontentlist.size();documentreferencecontenti++ ) {
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent  documentreferencecontent = documentreferencecontentlist.get(documentreferencecontenti);

		/******************** documentreferencecontentformat ********************************************************************************/
		org.hl7.fhir.r4.model.Coding documentreferencecontentformat = documentreferencecontent.getFormat();

		/******************** DocRfrnc_Cntnt_Frmat_Dsply ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntFrmatDsply("[");}
		if(documentreferencecontentformat.hasDisplay()) {

			d.addDocRfrncCntntFrmatDsply(String.valueOf(documentreferencecontentformat.getDisplay()));
		} else {
			d.addDocRfrncCntntFrmatDsply("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntFrmatDsply("]");}


		/******************** DocRfrnc_Cntnt_Frmat_Vrsn ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntFrmatVrsn("[");}
		if(documentreferencecontentformat.hasVersion()) {

			d.addDocRfrncCntntFrmatVrsn(String.valueOf(documentreferencecontentformat.getVersion()));
		} else {
			d.addDocRfrncCntntFrmatVrsn("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntFrmatVrsn("]");}


		/******************** DocRfrnc_Cntnt_Frmat_Cd ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntFrmatCd("[");}
		if(documentreferencecontentformat.hasCode()) {

			d.addDocRfrncCntntFrmatCd(String.valueOf(documentreferencecontentformat.getCode()));
		} else {
			d.addDocRfrncCntntFrmatCd("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntFrmatCd("]");}


		/******************** DocRfrnc_Cntnt_Frmat_UsrSltd ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntFrmatUsrSltd("[");}
		if(documentreferencecontentformat.hasUserSelected()) {

			d.addDocRfrncCntntFrmatUsrSltd(String.valueOf(documentreferencecontentformat.getUserSelected()));
		} else {
			d.addDocRfrncCntntFrmatUsrSltd("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntFrmatUsrSltd("]");}


		/******************** DocRfrnc_Cntnt_Frmat_Sys ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntFrmatSys("[");}
		if(documentreferencecontentformat.hasSystem()) {

			d.addDocRfrncCntntFrmatSys(String.valueOf(documentreferencecontentformat.getSystem()));
		} else {
			d.addDocRfrncCntntFrmatSys("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntFrmatSys("]");}


		/******************** documentreferencecontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment documentreferencecontentattachment = documentreferencecontent.getAttachment();

		/******************** DocRfrnc_Cntnt_Attchmnt_Sz ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntSz("[");}
		if(documentreferencecontentattachment.hasSize()) {

			d.addDocRfrncCntntAttchmntSz(String.valueOf(documentreferencecontentattachment.getSize()));
		} else {
			d.addDocRfrncCntntAttchmntSz("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntSz("]");}


		/******************** DocRfrnc_Cntnt_Attchmnt_Lnguage ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntLnguage("[");}
		if(documentreferencecontentattachment.hasLanguage()) {

			d.addDocRfrncCntntAttchmntLnguage(String.valueOf(documentreferencecontentattachment.getLanguage()));
		} else {
			d.addDocRfrncCntntAttchmntLnguage("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntLnguage("]");}


		/******************** DocRfrnc_Cntnt_Attchmnt_CntntTyp ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntCntntTyp("[");}
		if(documentreferencecontentattachment.hasContentType()) {

			d.addDocRfrncCntntAttchmntCntntTyp(String.valueOf(documentreferencecontentattachment.getContentType()));
		} else {
			d.addDocRfrncCntntAttchmntCntntTyp("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntCntntTyp("]");}


		/******************** DocRfrnc_Cntnt_Attchmnt_Hash ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntHash("[");}
		if(documentreferencecontentattachment.hasHash()) {

			d.addDocRfrncCntntAttchmntHash(new String(documentreferencecontentattachment.getHash()));
		} else {
			d.addDocRfrncCntntAttchmntHash("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntHash("]");}


		/******************** DocRfrnc_Cntnt_Attchmnt_Data ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntData("[");}
		if(documentreferencecontentattachment.hasData()) {

			d.addDocRfrncCntntAttchmntData(new String(documentreferencecontentattachment.getData()));
		} else {
			d.addDocRfrncCntntAttchmntData("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntData("]");}


		/******************** DocRfrnc_Cntnt_Attchmnt_Creation ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntCreation("[");}
		if(documentreferencecontentattachment.hasCreation()) {

			d.addDocRfrncCntntAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreferencecontentattachment.getCreation())+"\"");
		} else {
			d.addDocRfrncCntntAttchmntCreation("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntCreation("]");}


		/******************** DocRfrnc_Cntnt_Attchmnt_Ttl ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntTtl("[");}
		if(documentreferencecontentattachment.hasTitle()) {

			d.addDocRfrncCntntAttchmntTtl(String.valueOf(documentreferencecontentattachment.getTitle()));
		} else {
			d.addDocRfrncCntntAttchmntTtl("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntTtl("]");}


		/******************** DocRfrnc_Cntnt_Attchmnt_Url ********************************************************************************/
		if(documentreferencecontenti == 0) {d.addDocRfrncCntntAttchmntUrl("[");}
		if(documentreferencecontentattachment.hasUrl()) {

			d.addDocRfrncCntntAttchmntUrl(String.valueOf(documentreferencecontentattachment.getUrl()));
		} else {
			d.addDocRfrncCntntAttchmntUrl("NULL");
		}

		if(documentreferencecontenti == documentreferencecontentlist.size()-1) {d.addDocRfrncCntntAttchmntUrl("]");}


		 };
		/******************** DocRfrnc_Dt ********************************************************************************/
		if(documentreference.hasDate()) {

			d.addDocRfrncDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreference.getDate())+"\"");
		} else {
			d.addDocRfrncDt("NULL");
		}


		/******************** DocRfrnc_Sbjct ********************************************************************************/
		if(documentreference.hasSubject()) {

			if(documentreference.getSubject().getReference() != null) {
			d.addDocRfrncSbjct(documentreference.getSubject().getReference());
			}
		} else {
			d.addDocRfrncSbjct("NULL");
		}


		/******************** documentreferencestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus documentreferencestatus = documentreference.getStatus();
		if(documentreferencestatus!=null) {
			d.addDocRfrncSts(documentreferencestatus.toCode());
		} else {
			d.addDocRfrncSts("NULL");
		}

		/******************** DocRfrnc_Dscrptn ********************************************************************************/
		if(documentreference.hasDescription()) {

			d.addDocRfrncDscrptn(String.valueOf(documentreference.getDescription()));
		} else {
			d.addDocRfrncDscrptn("NULL");
		}


		/******************** documentreferenceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> documentreferenceidentifierlist = documentreference.getIdentifier();
		for(int documentreferenceidentifieri = 0; documentreferenceidentifieri<documentreferenceidentifierlist.size();documentreferenceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  documentreferenceidentifier = documentreferenceidentifierlist.get(documentreferenceidentifieri);

		/******************** DocRfrnc_Id_Vl ********************************************************************************/
		if(documentreferenceidentifieri == 0) {d.addDocRfrncIdVl("[");}
		if(documentreferenceidentifier.hasValue()) {

			d.addDocRfrncIdVl(String.valueOf(documentreferenceidentifier.getValue()));
		} else {
			d.addDocRfrncIdVl("NULL");
		}

		if(documentreferenceidentifieri == documentreferenceidentifierlist.size()-1) {d.addDocRfrncIdVl("]");}


		/******************** documentreferenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferenceidentifiertype = documentreferenceidentifier.getType();

		/******************** DocRfrnc_Id_Typ_Txt ********************************************************************************/
		if(documentreferenceidentifieri == 0) {d.addDocRfrncIdTypTxt("[");}
		if(documentreferenceidentifiertype.hasText()) {

			d.addDocRfrncIdTypTxt(String.valueOf(documentreferenceidentifiertype.getText()));
		} else {
			d.addDocRfrncIdTypTxt("NULL");
		}

		if(documentreferenceidentifieri == documentreferenceidentifierlist.size()-1) {d.addDocRfrncIdTypTxt("]");}


		/******************** documentreferenceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferenceidentifiertypecodinglist = documentreferenceidentifiertype.getCoding();
		for(int documentreferenceidentifiertypecodingi = 0; documentreferenceidentifiertypecodingi<documentreferenceidentifiertypecodinglist.size();documentreferenceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferenceidentifiertypecoding = documentreferenceidentifiertypecodinglist.get(documentreferenceidentifiertypecodingi);

		/******************** DocRfrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(documentreferenceidentifiertypecodingi == 0) {d.addDocRfrncIdTypCdgDsply("[[");}
		if(documentreferenceidentifiertypecoding.hasDisplay()) {

			d.addDocRfrncIdTypCdgDsply(String.valueOf(documentreferenceidentifiertypecoding.getDisplay()));
		} else {
			d.addDocRfrncIdTypCdgDsply("NULL");
		}

		if(documentreferenceidentifiertypecodingi == documentreferenceidentifiertypecodinglist.size()-1) {d.addDocRfrncIdTypCdgDsply("]]");}


		/******************** DocRfrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentreferenceidentifiertypecodingi == 0) {d.addDocRfrncIdTypCdgVrsn("[[");}
		if(documentreferenceidentifiertypecoding.hasVersion()) {

			d.addDocRfrncIdTypCdgVrsn(String.valueOf(documentreferenceidentifiertypecoding.getVersion()));
		} else {
			d.addDocRfrncIdTypCdgVrsn("NULL");
		}

		if(documentreferenceidentifiertypecodingi == documentreferenceidentifiertypecodinglist.size()-1) {d.addDocRfrncIdTypCdgVrsn("]]");}


		/******************** DocRfrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(documentreferenceidentifiertypecodingi == 0) {d.addDocRfrncIdTypCdgCd("[[");}
		if(documentreferenceidentifiertypecoding.hasCode()) {

			d.addDocRfrncIdTypCdgCd(String.valueOf(documentreferenceidentifiertypecoding.getCode()));
		} else {
			d.addDocRfrncIdTypCdgCd("NULL");
		}

		if(documentreferenceidentifiertypecodingi == documentreferenceidentifiertypecodinglist.size()-1) {d.addDocRfrncIdTypCdgCd("]]");}


		/******************** DocRfrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentreferenceidentifiertypecodingi == 0) {d.addDocRfrncIdTypCdgUsrSltd("[[");}
		if(documentreferenceidentifiertypecoding.hasUserSelected()) {

			d.addDocRfrncIdTypCdgUsrSltd(String.valueOf(documentreferenceidentifiertypecoding.getUserSelected()));
		} else {
			d.addDocRfrncIdTypCdgUsrSltd("NULL");
		}

		if(documentreferenceidentifiertypecodingi == documentreferenceidentifiertypecodinglist.size()-1) {d.addDocRfrncIdTypCdgUsrSltd("]]");}


		/******************** DocRfrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(documentreferenceidentifiertypecodingi == 0) {d.addDocRfrncIdTypCdgSys("[[");}
		if(documentreferenceidentifiertypecoding.hasSystem()) {

			d.addDocRfrncIdTypCdgSys(String.valueOf(documentreferenceidentifiertypecoding.getSystem()));
		} else {
			d.addDocRfrncIdTypCdgSys("NULL");
		}

		if(documentreferenceidentifiertypecodingi == documentreferenceidentifiertypecodinglist.size()-1) {d.addDocRfrncIdTypCdgSys("]]");}


		 };
		/******************** documentreferenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferenceidentifierperiod = documentreferenceidentifier.getPeriod();

		/******************** DocRfrnc_Id_Prd_Strt ********************************************************************************/
		if(documentreferenceidentifieri == 0) {d.addDocRfrncIdPrdStrt("[");}
		if(documentreferenceidentifierperiod.hasStart()) {

			d.addDocRfrncIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreferenceidentifierperiod.getStart())+"\"");
		} else {
			d.addDocRfrncIdPrdStrt("NULL");
		}

		if(documentreferenceidentifieri == documentreferenceidentifierlist.size()-1) {d.addDocRfrncIdPrdStrt("]");}


		/******************** DocRfrnc_Id_Prd_End ********************************************************************************/
		if(documentreferenceidentifieri == 0) {d.addDocRfrncIdPrdEnd("[");}
		if(documentreferenceidentifierperiod.hasEnd()) {

			d.addDocRfrncIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreferenceidentifierperiod.getEnd())+"\"");
		} else {
			d.addDocRfrncIdPrdEnd("NULL");
		}

		if(documentreferenceidentifieri == documentreferenceidentifierlist.size()-1) {d.addDocRfrncIdPrdEnd("]");}


		/******************** documentreferenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentreferenceidentifieruse = documentreferenceidentifier.getUse();
		if(documentreferenceidentifieruse!=null) {
		if(documentreferenceidentifieri == 0) {

		d.addDocRfrncIdUse("[");		}
			d.addDocRfrncIdUse(documentreferenceidentifieruse.toCode());
		if(documentreferenceidentifieri == documentreferenceidentifierlist.size()-1) {

		d.addDocRfrncIdUse("]");		}

		} else {
			d.addDocRfrncIdUse("NULL");
		}

		/******************** DocRfrnc_Id_Assigner ********************************************************************************/
		if(documentreferenceidentifieri == 0) {d.addDocRfrncIdAssigner("[");}
		if(documentreferenceidentifier.hasAssigner()) {

			if(documentreferenceidentifier.getAssigner().getReference() != null) {
			d.addDocRfrncIdAssigner(documentreferenceidentifier.getAssigner().getReference());
			}
		} else {
			d.addDocRfrncIdAssigner("NULL");
		}

		if(documentreferenceidentifieri == documentreferenceidentifierlist.size()-1) {d.addDocRfrncIdAssigner("]");}


		/******************** DocRfrnc_Id_Sys ********************************************************************************/
		if(documentreferenceidentifieri == 0) {d.addDocRfrncIdSys("[");}
		if(documentreferenceidentifier.hasSystem()) {

			d.addDocRfrncIdSys(String.valueOf(documentreferenceidentifier.getSystem()));
		} else {
			d.addDocRfrncIdSys("NULL");
		}

		if(documentreferenceidentifieri == documentreferenceidentifierlist.size()-1) {d.addDocRfrncIdSys("]");}


		 };
		/******************** documentreferencecategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> documentreferencecategorylist = documentreference.getCategory();
		for(int documentreferencecategoryi = 0; documentreferencecategoryi<documentreferencecategorylist.size();documentreferencecategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  documentreferencecategory = documentreferencecategorylist.get(documentreferencecategoryi);

		/******************** DocRfrnc_Ctgry_Txt ********************************************************************************/
		if(documentreferencecategoryi == 0) {d.addDocRfrncCtgryTxt("[");}
		if(documentreferencecategory.hasText()) {

			d.addDocRfrncCtgryTxt(String.valueOf(documentreferencecategory.getText()));
		} else {
			d.addDocRfrncCtgryTxt("NULL");
		}

		if(documentreferencecategoryi == documentreferencecategorylist.size()-1) {d.addDocRfrncCtgryTxt("]");}


		/******************** documentreferencecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferencecategorycodinglist = documentreferencecategory.getCoding();
		for(int documentreferencecategorycodingi = 0; documentreferencecategorycodingi<documentreferencecategorycodinglist.size();documentreferencecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferencecategorycoding = documentreferencecategorycodinglist.get(documentreferencecategorycodingi);

		/******************** DocRfrnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(documentreferencecategorycodingi == 0) {d.addDocRfrncCtgryCdgDsply("[[");}
		if(documentreferencecategorycoding.hasDisplay()) {

			d.addDocRfrncCtgryCdgDsply(String.valueOf(documentreferencecategorycoding.getDisplay()));
		} else {
			d.addDocRfrncCtgryCdgDsply("NULL");
		}

		if(documentreferencecategorycodingi == documentreferencecategorycodinglist.size()-1) {d.addDocRfrncCtgryCdgDsply("]]");}


		/******************** DocRfrnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(documentreferencecategorycodingi == 0) {d.addDocRfrncCtgryCdgVrsn("[[");}
		if(documentreferencecategorycoding.hasVersion()) {

			d.addDocRfrncCtgryCdgVrsn(String.valueOf(documentreferencecategorycoding.getVersion()));
		} else {
			d.addDocRfrncCtgryCdgVrsn("NULL");
		}

		if(documentreferencecategorycodingi == documentreferencecategorycodinglist.size()-1) {d.addDocRfrncCtgryCdgVrsn("]]");}


		/******************** DocRfrnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(documentreferencecategorycodingi == 0) {d.addDocRfrncCtgryCdgCd("[[");}
		if(documentreferencecategorycoding.hasCode()) {

			d.addDocRfrncCtgryCdgCd(String.valueOf(documentreferencecategorycoding.getCode()));
		} else {
			d.addDocRfrncCtgryCdgCd("NULL");
		}

		if(documentreferencecategorycodingi == documentreferencecategorycodinglist.size()-1) {d.addDocRfrncCtgryCdgCd("]]");}


		/******************** DocRfrnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencecategorycodingi == 0) {d.addDocRfrncCtgryCdgUsrSltd("[[");}
		if(documentreferencecategorycoding.hasUserSelected()) {

			d.addDocRfrncCtgryCdgUsrSltd(String.valueOf(documentreferencecategorycoding.getUserSelected()));
		} else {
			d.addDocRfrncCtgryCdgUsrSltd("NULL");
		}

		if(documentreferencecategorycodingi == documentreferencecategorycodinglist.size()-1) {d.addDocRfrncCtgryCdgUsrSltd("]]");}


		/******************** DocRfrnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(documentreferencecategorycodingi == 0) {d.addDocRfrncCtgryCdgSys("[[");}
		if(documentreferencecategorycoding.hasSystem()) {

			d.addDocRfrncCtgryCdgSys(String.valueOf(documentreferencecategorycoding.getSystem()));
		} else {
			d.addDocRfrncCtgryCdgSys("NULL");
		}

		if(documentreferencecategorycodingi == documentreferencecategorycodinglist.size()-1) {d.addDocRfrncCtgryCdgSys("]]");}


		 };
		 };
		/******************** documentreferencemasteridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier documentreferencemasteridentifier = documentreference.getMasterIdentifier();

		/******************** DocRfrnc_MasterId_Vl ********************************************************************************/
		if(documentreferencemasteridentifier.hasValue()) {

			d.addDocRfrncMasterIdVl(String.valueOf(documentreferencemasteridentifier.getValue()));
		} else {
			d.addDocRfrncMasterIdVl("NULL");
		}


		/******************** documentreferencemasteridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept documentreferencemasteridentifiertype = documentreferencemasteridentifier.getType();

		/******************** DocRfrnc_MasterId_Typ_Txt ********************************************************************************/
		if(documentreferencemasteridentifiertype.hasText()) {

			d.addDocRfrncMasterIdTypTxt(String.valueOf(documentreferencemasteridentifiertype.getText()));
		} else {
			d.addDocRfrncMasterIdTypTxt("NULL");
		}


		/******************** documentreferencemasteridentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferencemasteridentifiertypecodinglist = documentreferencemasteridentifiertype.getCoding();
		for(int documentreferencemasteridentifiertypecodingi = 0; documentreferencemasteridentifiertypecodingi<documentreferencemasteridentifiertypecodinglist.size();documentreferencemasteridentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferencemasteridentifiertypecoding = documentreferencemasteridentifiertypecodinglist.get(documentreferencemasteridentifiertypecodingi);

		/******************** DocRfrnc_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(documentreferencemasteridentifiertypecodingi == 0) {d.addDocRfrncMasterIdTypCdgDsply("[");}
		if(documentreferencemasteridentifiertypecoding.hasDisplay()) {

			d.addDocRfrncMasterIdTypCdgDsply(String.valueOf(documentreferencemasteridentifiertypecoding.getDisplay()));
		} else {
			d.addDocRfrncMasterIdTypCdgDsply("NULL");
		}

		if(documentreferencemasteridentifiertypecodingi == documentreferencemasteridentifiertypecodinglist.size()-1) {d.addDocRfrncMasterIdTypCdgDsply("]");}


		/******************** DocRfrnc_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(documentreferencemasteridentifiertypecodingi == 0) {d.addDocRfrncMasterIdTypCdgVrsn("[");}
		if(documentreferencemasteridentifiertypecoding.hasVersion()) {

			d.addDocRfrncMasterIdTypCdgVrsn(String.valueOf(documentreferencemasteridentifiertypecoding.getVersion()));
		} else {
			d.addDocRfrncMasterIdTypCdgVrsn("NULL");
		}

		if(documentreferencemasteridentifiertypecodingi == documentreferencemasteridentifiertypecodinglist.size()-1) {d.addDocRfrncMasterIdTypCdgVrsn("]");}


		/******************** DocRfrnc_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(documentreferencemasteridentifiertypecodingi == 0) {d.addDocRfrncMasterIdTypCdgCd("[");}
		if(documentreferencemasteridentifiertypecoding.hasCode()) {

			d.addDocRfrncMasterIdTypCdgCd(String.valueOf(documentreferencemasteridentifiertypecoding.getCode()));
		} else {
			d.addDocRfrncMasterIdTypCdgCd("NULL");
		}

		if(documentreferencemasteridentifiertypecodingi == documentreferencemasteridentifiertypecodinglist.size()-1) {d.addDocRfrncMasterIdTypCdgCd("]");}


		/******************** DocRfrnc_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencemasteridentifiertypecodingi == 0) {d.addDocRfrncMasterIdTypCdgUsrSltd("[");}
		if(documentreferencemasteridentifiertypecoding.hasUserSelected()) {

			d.addDocRfrncMasterIdTypCdgUsrSltd(String.valueOf(documentreferencemasteridentifiertypecoding.getUserSelected()));
		} else {
			d.addDocRfrncMasterIdTypCdgUsrSltd("NULL");
		}

		if(documentreferencemasteridentifiertypecodingi == documentreferencemasteridentifiertypecodinglist.size()-1) {d.addDocRfrncMasterIdTypCdgUsrSltd("]");}


		/******************** DocRfrnc_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(documentreferencemasteridentifiertypecodingi == 0) {d.addDocRfrncMasterIdTypCdgSys("[");}
		if(documentreferencemasteridentifiertypecoding.hasSystem()) {

			d.addDocRfrncMasterIdTypCdgSys(String.valueOf(documentreferencemasteridentifiertypecoding.getSystem()));
		} else {
			d.addDocRfrncMasterIdTypCdgSys("NULL");
		}

		if(documentreferencemasteridentifiertypecodingi == documentreferencemasteridentifiertypecodinglist.size()-1) {d.addDocRfrncMasterIdTypCdgSys("]");}


		 };
		/******************** documentreferencemasteridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period documentreferencemasteridentifierperiod = documentreferencemasteridentifier.getPeriod();

		/******************** DocRfrnc_MasterId_Prd_Strt ********************************************************************************/
		if(documentreferencemasteridentifierperiod.hasStart()) {

			d.addDocRfrncMasterIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreferencemasteridentifierperiod.getStart())+"\"");
		} else {
			d.addDocRfrncMasterIdPrdStrt("NULL");
		}


		/******************** DocRfrnc_MasterId_Prd_End ********************************************************************************/
		if(documentreferencemasteridentifierperiod.hasEnd()) {

			d.addDocRfrncMasterIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(documentreferencemasteridentifierperiod.getEnd())+"\"");
		} else {
			d.addDocRfrncMasterIdPrdEnd("NULL");
		}


		/******************** documentreferencemasteridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse documentreferencemasteridentifieruse = documentreferencemasteridentifier.getUse();
		if(documentreferencemasteridentifieruse!=null) {
			d.addDocRfrncMasterIdUse(documentreferencemasteridentifieruse.toCode());
		} else {
			d.addDocRfrncMasterIdUse("NULL");
		}

		/******************** DocRfrnc_MasterId_Assigner ********************************************************************************/
		if(documentreferencemasteridentifier.hasAssigner()) {

			if(documentreferencemasteridentifier.getAssigner().getReference() != null) {
			d.addDocRfrncMasterIdAssigner(documentreferencemasteridentifier.getAssigner().getReference());
			}
		} else {
			d.addDocRfrncMasterIdAssigner("NULL");
		}


		/******************** DocRfrnc_MasterId_Sys ********************************************************************************/
		if(documentreferencemasteridentifier.hasSystem()) {

			d.addDocRfrncMasterIdSys(String.valueOf(documentreferencemasteridentifier.getSystem()));
		} else {
			d.addDocRfrncMasterIdSys("NULL");
		}


		/******************** DocRfrnc_Custodian ********************************************************************************/
		if(documentreference.hasCustodian()) {

			if(documentreference.getCustodian().getReference() != null) {
			d.addDocRfrncCustodian(documentreference.getCustodian().getReference());
			}
		} else {
			d.addDocRfrncCustodian("NULL");
		}


		/******************** documentreferencedocstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatus documentreferencedocstatus = documentreference.getDocStatus();
		if(documentreferencedocstatus!=null) {
			d.addDocRfrncDocSts(documentreferencedocstatus.toCode());
		} else {
			d.addDocRfrncDocSts("NULL");
		}

		/******************** DocRfrnc_Authenticator ********************************************************************************/
		if(documentreference.hasAuthenticator()) {

			if(documentreference.getAuthenticator().getReference() != null) {
			d.addDocRfrncAuthenticator(documentreference.getAuthenticator().getReference());
			}
		} else {
			d.addDocRfrncAuthenticator("NULL");
		}


		/******************** documentreferencesecuritylabel ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> documentreferencesecuritylabellist = documentreference.getSecurityLabel();
		for(int documentreferencesecuritylabeli = 0; documentreferencesecuritylabeli<documentreferencesecuritylabellist.size();documentreferencesecuritylabeli++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  documentreferencesecuritylabel = documentreferencesecuritylabellist.get(documentreferencesecuritylabeli);

		/******************** DocRfrnc_SecurityLbl_Txt ********************************************************************************/
		if(documentreferencesecuritylabeli == 0) {d.addDocRfrncSecurityLblTxt("[");}
		if(documentreferencesecuritylabel.hasText()) {

			d.addDocRfrncSecurityLblTxt(String.valueOf(documentreferencesecuritylabel.getText()));
		} else {
			d.addDocRfrncSecurityLblTxt("NULL");
		}

		if(documentreferencesecuritylabeli == documentreferencesecuritylabellist.size()-1) {d.addDocRfrncSecurityLblTxt("]");}


		/******************** documentreferencesecuritylabelcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> documentreferencesecuritylabelcodinglist = documentreferencesecuritylabel.getCoding();
		for(int documentreferencesecuritylabelcodingi = 0; documentreferencesecuritylabelcodingi<documentreferencesecuritylabelcodinglist.size();documentreferencesecuritylabelcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  documentreferencesecuritylabelcoding = documentreferencesecuritylabelcodinglist.get(documentreferencesecuritylabelcodingi);

		/******************** DocRfrnc_SecurityLbl_Cdg_Dsply ********************************************************************************/
		if(documentreferencesecuritylabelcodingi == 0) {d.addDocRfrncSecurityLblCdgDsply("[[");}
		if(documentreferencesecuritylabelcoding.hasDisplay()) {

			d.addDocRfrncSecurityLblCdgDsply(String.valueOf(documentreferencesecuritylabelcoding.getDisplay()));
		} else {
			d.addDocRfrncSecurityLblCdgDsply("NULL");
		}

		if(documentreferencesecuritylabelcodingi == documentreferencesecuritylabelcodinglist.size()-1) {d.addDocRfrncSecurityLblCdgDsply("]]");}


		/******************** DocRfrnc_SecurityLbl_Cdg_Vrsn ********************************************************************************/
		if(documentreferencesecuritylabelcodingi == 0) {d.addDocRfrncSecurityLblCdgVrsn("[[");}
		if(documentreferencesecuritylabelcoding.hasVersion()) {

			d.addDocRfrncSecurityLblCdgVrsn(String.valueOf(documentreferencesecuritylabelcoding.getVersion()));
		} else {
			d.addDocRfrncSecurityLblCdgVrsn("NULL");
		}

		if(documentreferencesecuritylabelcodingi == documentreferencesecuritylabelcodinglist.size()-1) {d.addDocRfrncSecurityLblCdgVrsn("]]");}


		/******************** DocRfrnc_SecurityLbl_Cdg_Cd ********************************************************************************/
		if(documentreferencesecuritylabelcodingi == 0) {d.addDocRfrncSecurityLblCdgCd("[[");}
		if(documentreferencesecuritylabelcoding.hasCode()) {

			d.addDocRfrncSecurityLblCdgCd(String.valueOf(documentreferencesecuritylabelcoding.getCode()));
		} else {
			d.addDocRfrncSecurityLblCdgCd("NULL");
		}

		if(documentreferencesecuritylabelcodingi == documentreferencesecuritylabelcodinglist.size()-1) {d.addDocRfrncSecurityLblCdgCd("]]");}


		/******************** DocRfrnc_SecurityLbl_Cdg_UsrSltd ********************************************************************************/
		if(documentreferencesecuritylabelcodingi == 0) {d.addDocRfrncSecurityLblCdgUsrSltd("[[");}
		if(documentreferencesecuritylabelcoding.hasUserSelected()) {

			d.addDocRfrncSecurityLblCdgUsrSltd(String.valueOf(documentreferencesecuritylabelcoding.getUserSelected()));
		} else {
			d.addDocRfrncSecurityLblCdgUsrSltd("NULL");
		}

		if(documentreferencesecuritylabelcodingi == documentreferencesecuritylabelcodinglist.size()-1) {d.addDocRfrncSecurityLblCdgUsrSltd("]]");}


		/******************** DocRfrnc_SecurityLbl_Cdg_Sys ********************************************************************************/
		if(documentreferencesecuritylabelcodingi == 0) {d.addDocRfrncSecurityLblCdgSys("[[");}
		if(documentreferencesecuritylabelcoding.hasSystem()) {

			d.addDocRfrncSecurityLblCdgSys(String.valueOf(documentreferencesecuritylabelcoding.getSystem()));
		} else {
			d.addDocRfrncSecurityLblCdgSys("NULL");
		}

		if(documentreferencesecuritylabelcodingi == documentreferencesecuritylabelcodinglist.size()-1) {d.addDocRfrncSecurityLblCdgSys("]]");}


		 };
		 };
		/******************** documentreferencerelatesto ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent> documentreferencerelatestolist = documentreference.getRelatesTo();
		for(int documentreferencerelatestoi = 0; documentreferencerelatestoi<documentreferencerelatestolist.size();documentreferencerelatestoi++ ) {
		org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceRelatesToComponent  documentreferencerelatesto = documentreferencerelatestolist.get(documentreferencerelatestoi);

		/******************** documentreferencerelatestocode ********************************************************************************/
		org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipType documentreferencerelatestocode = documentreferencerelatesto.getCode();
		if(documentreferencerelatestocode!=null) {
		if(documentreferencerelatestoi == 0) {

		d.addDocRfrncRelatesToCd("[");		}
			d.addDocRfrncRelatesToCd(documentreferencerelatestocode.toCode());
		if(documentreferencerelatestoi == documentreferencerelatestolist.size()-1) {

		d.addDocRfrncRelatesToCd("]");		}

		} else {
			d.addDocRfrncRelatesToCd("NULL");
		}

		 };
		/******************** DocRfrnc_Athr ********************************************************************************/
		if(documentreference.hasAuthor()) {

			String  array = "[";
			for(int incr=0; incr<documentreference.getAuthor().size(); incr++) {
				array = array + documentreference.getAuthor().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDocRfrncAthr(array);

		} else {
			d.addDocRfrncAthr("NULL");
		}


		return d;
	}
}
