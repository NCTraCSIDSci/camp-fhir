package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EventDefinition;
public class EventDefinitionBidirectionalConversion 
{
	public EventDefinition EventDefinitions(org.hl7.fhir.r4.model.EventDefinition eventdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.EventDefinition e = new  main.java.com.campfhir.model.EventDefinition();

		/******************** id ********************************************************************************/
		e.setId(eventdefinition.getIdElement().getIdPart());

		/******************** EvntDfn_Nm ********************************************************************************/
		if(eventdefinition.hasName()) {

			e.addEvntDfnNm(String.valueOf(eventdefinition.getName()));
		} else {
			e.addEvntDfnNm("NULL");
		}


		/******************** EvntDfn_Vrsn ********************************************************************************/
		if(eventdefinition.hasVersion()) {

			e.addEvntDfnVrsn(String.valueOf(eventdefinition.getVersion()));
		} else {
			e.addEvntDfnVrsn("NULL");
		}


		/******************** EvntDfn_Dt ********************************************************************************/
		if(eventdefinition.hasDate()) {

			e.addEvntDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinition.getDate())+"\"");
		} else {
			e.addEvntDfnDt("NULL");
		}


		/******************** eventdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus eventdefinitionstatus = eventdefinition.getStatus();
		if(eventdefinitionstatus!=null) {
			e.addEvntDfnSts(eventdefinitionstatus.toCode());
		} else {
			e.addEvntDfnSts("NULL");
		}

		/******************** EvntDfn_Dscrptn ********************************************************************************/
		if(eventdefinition.hasDescription()) {

			e.addEvntDfnDscrptn(String.valueOf(eventdefinition.getDescription()));
		} else {
			e.addEvntDfnDscrptn("NULL");
		}


		/******************** eventdefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> eventdefinitionidentifierlist = eventdefinition.getIdentifier();
		for(int eventdefinitionidentifieri = 0; eventdefinitionidentifieri<eventdefinitionidentifierlist.size();eventdefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  eventdefinitionidentifier = eventdefinitionidentifierlist.get(eventdefinitionidentifieri);

		/******************** EvntDfn_Id_Vl ********************************************************************************/
		if(eventdefinitionidentifieri == 0) {e.addEvntDfnIdVl("[");}
		if(eventdefinitionidentifier.hasValue()) {

			e.addEvntDfnIdVl(String.valueOf(eventdefinitionidentifier.getValue()));
		} else {
			e.addEvntDfnIdVl("NULL");
		}

		if(eventdefinitionidentifieri == eventdefinitionidentifierlist.size()-1) {e.addEvntDfnIdVl("]");}


		/******************** eventdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionidentifiertype = eventdefinitionidentifier.getType();

		/******************** EvntDfn_Id_Typ_Txt ********************************************************************************/
		if(eventdefinitionidentifieri == 0) {e.addEvntDfnIdTypTxt("[");}
		if(eventdefinitionidentifiertype.hasText()) {

			e.addEvntDfnIdTypTxt(String.valueOf(eventdefinitionidentifiertype.getText()));
		} else {
			e.addEvntDfnIdTypTxt("NULL");
		}

		if(eventdefinitionidentifieri == eventdefinitionidentifierlist.size()-1) {e.addEvntDfnIdTypTxt("]");}


		/******************** eventdefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitionidentifiertypecodinglist = eventdefinitionidentifiertype.getCoding();
		for(int eventdefinitionidentifiertypecodingi = 0; eventdefinitionidentifiertypecodingi<eventdefinitionidentifiertypecodinglist.size();eventdefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitionidentifiertypecoding = eventdefinitionidentifiertypecodinglist.get(eventdefinitionidentifiertypecodingi);

		/******************** EvntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionidentifiertypecodingi == 0) {e.addEvntDfnIdTypCdgDsply("[[");}
		if(eventdefinitionidentifiertypecoding.hasDisplay()) {

			e.addEvntDfnIdTypCdgDsply(String.valueOf(eventdefinitionidentifiertypecoding.getDisplay()));
		} else {
			e.addEvntDfnIdTypCdgDsply("NULL");
		}

		if(eventdefinitionidentifiertypecodingi == eventdefinitionidentifiertypecodinglist.size()-1) {e.addEvntDfnIdTypCdgDsply("]]");}


		/******************** EvntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionidentifiertypecodingi == 0) {e.addEvntDfnIdTypCdgVrsn("[[");}
		if(eventdefinitionidentifiertypecoding.hasVersion()) {

			e.addEvntDfnIdTypCdgVrsn(String.valueOf(eventdefinitionidentifiertypecoding.getVersion()));
		} else {
			e.addEvntDfnIdTypCdgVrsn("NULL");
		}

		if(eventdefinitionidentifiertypecodingi == eventdefinitionidentifiertypecodinglist.size()-1) {e.addEvntDfnIdTypCdgVrsn("]]");}


		/******************** EvntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(eventdefinitionidentifiertypecodingi == 0) {e.addEvntDfnIdTypCdgCd("[[");}
		if(eventdefinitionidentifiertypecoding.hasCode()) {

			e.addEvntDfnIdTypCdgCd(String.valueOf(eventdefinitionidentifiertypecoding.getCode()));
		} else {
			e.addEvntDfnIdTypCdgCd("NULL");
		}

		if(eventdefinitionidentifiertypecodingi == eventdefinitionidentifiertypecodinglist.size()-1) {e.addEvntDfnIdTypCdgCd("]]");}


		/******************** EvntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionidentifiertypecodingi == 0) {e.addEvntDfnIdTypCdgUsrSltd("[[");}
		if(eventdefinitionidentifiertypecoding.hasUserSelected()) {

			e.addEvntDfnIdTypCdgUsrSltd(String.valueOf(eventdefinitionidentifiertypecoding.getUserSelected()));
		} else {
			e.addEvntDfnIdTypCdgUsrSltd("NULL");
		}

		if(eventdefinitionidentifiertypecodingi == eventdefinitionidentifiertypecodinglist.size()-1) {e.addEvntDfnIdTypCdgUsrSltd("]]");}


		/******************** EvntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(eventdefinitionidentifiertypecodingi == 0) {e.addEvntDfnIdTypCdgSys("[[");}
		if(eventdefinitionidentifiertypecoding.hasSystem()) {

			e.addEvntDfnIdTypCdgSys(String.valueOf(eventdefinitionidentifiertypecoding.getSystem()));
		} else {
			e.addEvntDfnIdTypCdgSys("NULL");
		}

		if(eventdefinitionidentifiertypecodingi == eventdefinitionidentifiertypecodinglist.size()-1) {e.addEvntDfnIdTypCdgSys("]]");}


		 };
		/******************** eventdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionidentifierperiod = eventdefinitionidentifier.getPeriod();

		/******************** EvntDfn_Id_Prd_Strt ********************************************************************************/
		if(eventdefinitionidentifieri == 0) {e.addEvntDfnIdPrdStrt("[");}
		if(eventdefinitionidentifierperiod.hasStart()) {

			e.addEvntDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionidentifierperiod.getStart())+"\"");
		} else {
			e.addEvntDfnIdPrdStrt("NULL");
		}

		if(eventdefinitionidentifieri == eventdefinitionidentifierlist.size()-1) {e.addEvntDfnIdPrdStrt("]");}


		/******************** EvntDfn_Id_Prd_End ********************************************************************************/
		if(eventdefinitionidentifieri == 0) {e.addEvntDfnIdPrdEnd("[");}
		if(eventdefinitionidentifierperiod.hasEnd()) {

			e.addEvntDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionidentifierperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnIdPrdEnd("NULL");
		}

		if(eventdefinitionidentifieri == eventdefinitionidentifierlist.size()-1) {e.addEvntDfnIdPrdEnd("]");}


		/******************** eventdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse eventdefinitionidentifieruse = eventdefinitionidentifier.getUse();
		if(eventdefinitionidentifieruse!=null) {
		if(eventdefinitionidentifieri == 0) {

		e.addEvntDfnIdUse("[");		}
			e.addEvntDfnIdUse(eventdefinitionidentifieruse.toCode());
		if(eventdefinitionidentifieri == eventdefinitionidentifierlist.size()-1) {

		e.addEvntDfnIdUse("]");		}

		} else {
			e.addEvntDfnIdUse("NULL");
		}

		/******************** EvntDfn_Id_Assigner ********************************************************************************/
		if(eventdefinitionidentifieri == 0) {e.addEvntDfnIdAssigner("[");}
		if(eventdefinitionidentifier.hasAssigner()) {

			if(eventdefinitionidentifier.getAssigner().getReference() != null) {
			e.addEvntDfnIdAssigner(eventdefinitionidentifier.getAssigner().getReference());
			}
		} else {
			e.addEvntDfnIdAssigner("NULL");
		}

		if(eventdefinitionidentifieri == eventdefinitionidentifierlist.size()-1) {e.addEvntDfnIdAssigner("]");}


		/******************** EvntDfn_Id_Sys ********************************************************************************/
		if(eventdefinitionidentifieri == 0) {e.addEvntDfnIdSys("[");}
		if(eventdefinitionidentifier.hasSystem()) {

			e.addEvntDfnIdSys(String.valueOf(eventdefinitionidentifier.getSystem()));
		} else {
			e.addEvntDfnIdSys("NULL");
		}

		if(eventdefinitionidentifieri == eventdefinitionidentifierlist.size()-1) {e.addEvntDfnIdSys("]");}


		 };
		/******************** eventdefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> eventdefinitioncontactlist = eventdefinition.getContact();
		for(int eventdefinitioncontacti = 0; eventdefinitioncontacti<eventdefinitioncontactlist.size();eventdefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  eventdefinitioncontact = eventdefinitioncontactlist.get(eventdefinitioncontacti);

		/******************** EvntDfn_Cntct_Nm ********************************************************************************/
		if(eventdefinitioncontacti == 0) {e.addEvntDfnCntctNm("[");}
		if(eventdefinitioncontact.hasName()) {

			e.addEvntDfnCntctNm(String.valueOf(eventdefinitioncontact.getName()));
		} else {
			e.addEvntDfnCntctNm("NULL");
		}

		if(eventdefinitioncontacti == eventdefinitioncontactlist.size()-1) {e.addEvntDfnCntctNm("]");}


		/******************** eventdefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> eventdefinitioncontacttelecomlist = eventdefinitioncontact.getTelecom();
		for(int eventdefinitioncontacttelecomi = 0; eventdefinitioncontacttelecomi<eventdefinitioncontacttelecomlist.size();eventdefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  eventdefinitioncontacttelecom = eventdefinitioncontacttelecomlist.get(eventdefinitioncontacttelecomi);

		/******************** EvntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(eventdefinitioncontacttelecomi == 0) {e.addEvntDfnCntctTlcmVl("[[");}
		if(eventdefinitioncontacttelecom.hasValue()) {

			e.addEvntDfnCntctTlcmVl(String.valueOf(eventdefinitioncontacttelecom.getValue()));
		} else {
			e.addEvntDfnCntctTlcmVl("NULL");
		}

		if(eventdefinitioncontacttelecomi == eventdefinitioncontacttelecomlist.size()-1) {e.addEvntDfnCntctTlcmVl("]]");}


		/******************** eventdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioncontacttelecomperiod = eventdefinitioncontacttelecom.getPeriod();

		/******************** EvntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitioncontacttelecomi == 0) {e.addEvntDfnCntctTlcmPrdStrt("[[");}
		if(eventdefinitioncontacttelecomperiod.hasStart()) {

			e.addEvntDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			e.addEvntDfnCntctTlcmPrdStrt("NULL");
		}

		if(eventdefinitioncontacttelecomi == eventdefinitioncontacttelecomlist.size()-1) {e.addEvntDfnCntctTlcmPrdStrt("]]");}


		/******************** EvntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitioncontacttelecomi == 0) {e.addEvntDfnCntctTlcmPrdEnd("[[");}
		if(eventdefinitioncontacttelecomperiod.hasEnd()) {

			e.addEvntDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnCntctTlcmPrdEnd("NULL");
		}

		if(eventdefinitioncontacttelecomi == eventdefinitioncontacttelecomlist.size()-1) {e.addEvntDfnCntctTlcmPrdEnd("]]");}


		/******************** eventdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitioncontacttelecomuse = eventdefinitioncontacttelecom.getUse();
		if(eventdefinitioncontacttelecomuse!=null) {
		if(eventdefinitioncontacttelecomi == 0) {

		e.addEvntDfnCntctTlcmUse("[[");		}
			e.addEvntDfnCntctTlcmUse(eventdefinitioncontacttelecomuse.toCode());
		if(eventdefinitioncontacttelecomi == eventdefinitioncontacttelecomlist.size()-1) {

		e.addEvntDfnCntctTlcmUse("]]");		}

		} else {
			e.addEvntDfnCntctTlcmUse("NULL");
		}

		/******************** eventdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitioncontacttelecomsystem = eventdefinitioncontacttelecom.getSystem();
		if(eventdefinitioncontacttelecomsystem!=null) {
		if(eventdefinitioncontacttelecomi == 0) {

		e.addEvntDfnCntctTlcmSys("[[");		}
			e.addEvntDfnCntctTlcmSys(eventdefinitioncontacttelecomsystem.toCode());
		if(eventdefinitioncontacttelecomi == eventdefinitioncontacttelecomlist.size()-1) {

		e.addEvntDfnCntctTlcmSys("]]");		}

		} else {
			e.addEvntDfnCntctTlcmSys("NULL");
		}

		/******************** EvntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitioncontacttelecomi == 0) {e.addEvntDfnCntctTlcmRnk("[[");}
		if(eventdefinitioncontacttelecom.hasRank()) {

			e.addEvntDfnCntctTlcmRnk(String.valueOf(eventdefinitioncontacttelecom.getRank()));
		} else {
			e.addEvntDfnCntctTlcmRnk("NULL");
		}

		if(eventdefinitioncontacttelecomi == eventdefinitioncontacttelecomlist.size()-1) {e.addEvntDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** EvntDfn_Copyright ********************************************************************************/
		if(eventdefinition.hasCopyright()) {

			e.addEvntDfnCopyright(String.valueOf(eventdefinition.getCopyright()));
		} else {
			e.addEvntDfnCopyright("NULL");
		}


		/******************** EvntDfn_ApprovalDt ********************************************************************************/
		if(eventdefinition.hasApprovalDate()) {

			e.addEvntDfnApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinition.getApprovalDate())+"\"");
		} else {
			e.addEvntDfnApprovalDt("NULL");
		}


		/******************** eventdefinitionendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> eventdefinitionendorserlist = eventdefinition.getEndorser();
		for(int eventdefinitionendorseri = 0; eventdefinitionendorseri<eventdefinitionendorserlist.size();eventdefinitionendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  eventdefinitionendorser = eventdefinitionendorserlist.get(eventdefinitionendorseri);

		/******************** EvntDfn_Endsr_Nm ********************************************************************************/
		if(eventdefinitionendorseri == 0) {e.addEvntDfnEndsrNm("[");}
		if(eventdefinitionendorser.hasName()) {

			e.addEvntDfnEndsrNm(String.valueOf(eventdefinitionendorser.getName()));
		} else {
			e.addEvntDfnEndsrNm("NULL");
		}

		if(eventdefinitionendorseri == eventdefinitionendorserlist.size()-1) {e.addEvntDfnEndsrNm("]");}


		/******************** eventdefinitionendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> eventdefinitionendorsertelecomlist = eventdefinitionendorser.getTelecom();
		for(int eventdefinitionendorsertelecomi = 0; eventdefinitionendorsertelecomi<eventdefinitionendorsertelecomlist.size();eventdefinitionendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  eventdefinitionendorsertelecom = eventdefinitionendorsertelecomlist.get(eventdefinitionendorsertelecomi);

		/******************** EvntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(eventdefinitionendorsertelecomi == 0) {e.addEvntDfnEndsrTlcmVl("[[");}
		if(eventdefinitionendorsertelecom.hasValue()) {

			e.addEvntDfnEndsrTlcmVl(String.valueOf(eventdefinitionendorsertelecom.getValue()));
		} else {
			e.addEvntDfnEndsrTlcmVl("NULL");
		}

		if(eventdefinitionendorsertelecomi == eventdefinitionendorsertelecomlist.size()-1) {e.addEvntDfnEndsrTlcmVl("]]");}


		/******************** eventdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionendorsertelecomperiod = eventdefinitionendorsertelecom.getPeriod();

		/******************** EvntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitionendorsertelecomi == 0) {e.addEvntDfnEndsrTlcmPrdStrt("[[");}
		if(eventdefinitionendorsertelecomperiod.hasStart()) {

			e.addEvntDfnEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionendorsertelecomperiod.getStart())+"\"");
		} else {
			e.addEvntDfnEndsrTlcmPrdStrt("NULL");
		}

		if(eventdefinitionendorsertelecomi == eventdefinitionendorsertelecomlist.size()-1) {e.addEvntDfnEndsrTlcmPrdStrt("]]");}


		/******************** EvntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitionendorsertelecomi == 0) {e.addEvntDfnEndsrTlcmPrdEnd("[[");}
		if(eventdefinitionendorsertelecomperiod.hasEnd()) {

			e.addEvntDfnEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionendorsertelecomperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnEndsrTlcmPrdEnd("NULL");
		}

		if(eventdefinitionendorsertelecomi == eventdefinitionendorsertelecomlist.size()-1) {e.addEvntDfnEndsrTlcmPrdEnd("]]");}


		/******************** eventdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitionendorsertelecomuse = eventdefinitionendorsertelecom.getUse();
		if(eventdefinitionendorsertelecomuse!=null) {
		if(eventdefinitionendorsertelecomi == 0) {

		e.addEvntDfnEndsrTlcmUse("[[");		}
			e.addEvntDfnEndsrTlcmUse(eventdefinitionendorsertelecomuse.toCode());
		if(eventdefinitionendorsertelecomi == eventdefinitionendorsertelecomlist.size()-1) {

		e.addEvntDfnEndsrTlcmUse("]]");		}

		} else {
			e.addEvntDfnEndsrTlcmUse("NULL");
		}

		/******************** eventdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitionendorsertelecomsystem = eventdefinitionendorsertelecom.getSystem();
		if(eventdefinitionendorsertelecomsystem!=null) {
		if(eventdefinitionendorsertelecomi == 0) {

		e.addEvntDfnEndsrTlcmSys("[[");		}
			e.addEvntDfnEndsrTlcmSys(eventdefinitionendorsertelecomsystem.toCode());
		if(eventdefinitionendorsertelecomi == eventdefinitionendorsertelecomlist.size()-1) {

		e.addEvntDfnEndsrTlcmSys("]]");		}

		} else {
			e.addEvntDfnEndsrTlcmSys("NULL");
		}

		/******************** EvntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitionendorsertelecomi == 0) {e.addEvntDfnEndsrTlcmRnk("[[");}
		if(eventdefinitionendorsertelecom.hasRank()) {

			e.addEvntDfnEndsrTlcmRnk(String.valueOf(eventdefinitionendorsertelecom.getRank()));
		} else {
			e.addEvntDfnEndsrTlcmRnk("NULL");
		}

		if(eventdefinitionendorsertelecomi == eventdefinitionendorsertelecomlist.size()-1) {e.addEvntDfnEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** EvntDfn_LastReviewDt ********************************************************************************/
		if(eventdefinition.hasLastReviewDate()) {

			e.addEvntDfnLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinition.getLastReviewDate())+"\"");
		} else {
			e.addEvntDfnLastReviewDt("NULL");
		}


		/******************** eventdefinitioneditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> eventdefinitioneditorlist = eventdefinition.getEditor();
		for(int eventdefinitioneditori = 0; eventdefinitioneditori<eventdefinitioneditorlist.size();eventdefinitioneditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  eventdefinitioneditor = eventdefinitioneditorlist.get(eventdefinitioneditori);

		/******************** EvntDfn_Editor_Nm ********************************************************************************/
		if(eventdefinitioneditori == 0) {e.addEvntDfnEditorNm("[");}
		if(eventdefinitioneditor.hasName()) {

			e.addEvntDfnEditorNm(String.valueOf(eventdefinitioneditor.getName()));
		} else {
			e.addEvntDfnEditorNm("NULL");
		}

		if(eventdefinitioneditori == eventdefinitioneditorlist.size()-1) {e.addEvntDfnEditorNm("]");}


		/******************** eventdefinitioneditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> eventdefinitioneditortelecomlist = eventdefinitioneditor.getTelecom();
		for(int eventdefinitioneditortelecomi = 0; eventdefinitioneditortelecomi<eventdefinitioneditortelecomlist.size();eventdefinitioneditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  eventdefinitioneditortelecom = eventdefinitioneditortelecomlist.get(eventdefinitioneditortelecomi);

		/******************** EvntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(eventdefinitioneditortelecomi == 0) {e.addEvntDfnEditorTlcmVl("[[");}
		if(eventdefinitioneditortelecom.hasValue()) {

			e.addEvntDfnEditorTlcmVl(String.valueOf(eventdefinitioneditortelecom.getValue()));
		} else {
			e.addEvntDfnEditorTlcmVl("NULL");
		}

		if(eventdefinitioneditortelecomi == eventdefinitioneditortelecomlist.size()-1) {e.addEvntDfnEditorTlcmVl("]]");}


		/******************** eventdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioneditortelecomperiod = eventdefinitioneditortelecom.getPeriod();

		/******************** EvntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitioneditortelecomi == 0) {e.addEvntDfnEditorTlcmPrdStrt("[[");}
		if(eventdefinitioneditortelecomperiod.hasStart()) {

			e.addEvntDfnEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitioneditortelecomperiod.getStart())+"\"");
		} else {
			e.addEvntDfnEditorTlcmPrdStrt("NULL");
		}

		if(eventdefinitioneditortelecomi == eventdefinitioneditortelecomlist.size()-1) {e.addEvntDfnEditorTlcmPrdStrt("]]");}


		/******************** EvntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitioneditortelecomi == 0) {e.addEvntDfnEditorTlcmPrdEnd("[[");}
		if(eventdefinitioneditortelecomperiod.hasEnd()) {

			e.addEvntDfnEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitioneditortelecomperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnEditorTlcmPrdEnd("NULL");
		}

		if(eventdefinitioneditortelecomi == eventdefinitioneditortelecomlist.size()-1) {e.addEvntDfnEditorTlcmPrdEnd("]]");}


		/******************** eventdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitioneditortelecomuse = eventdefinitioneditortelecom.getUse();
		if(eventdefinitioneditortelecomuse!=null) {
		if(eventdefinitioneditortelecomi == 0) {

		e.addEvntDfnEditorTlcmUse("[[");		}
			e.addEvntDfnEditorTlcmUse(eventdefinitioneditortelecomuse.toCode());
		if(eventdefinitioneditortelecomi == eventdefinitioneditortelecomlist.size()-1) {

		e.addEvntDfnEditorTlcmUse("]]");		}

		} else {
			e.addEvntDfnEditorTlcmUse("NULL");
		}

		/******************** eventdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitioneditortelecomsystem = eventdefinitioneditortelecom.getSystem();
		if(eventdefinitioneditortelecomsystem!=null) {
		if(eventdefinitioneditortelecomi == 0) {

		e.addEvntDfnEditorTlcmSys("[[");		}
			e.addEvntDfnEditorTlcmSys(eventdefinitioneditortelecomsystem.toCode());
		if(eventdefinitioneditortelecomi == eventdefinitioneditortelecomlist.size()-1) {

		e.addEvntDfnEditorTlcmSys("]]");		}

		} else {
			e.addEvntDfnEditorTlcmSys("NULL");
		}

		/******************** EvntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitioneditortelecomi == 0) {e.addEvntDfnEditorTlcmRnk("[[");}
		if(eventdefinitioneditortelecom.hasRank()) {

			e.addEvntDfnEditorTlcmRnk(String.valueOf(eventdefinitioneditortelecom.getRank()));
		} else {
			e.addEvntDfnEditorTlcmRnk("NULL");
		}

		if(eventdefinitioneditortelecomi == eventdefinitioneditortelecomlist.size()-1) {e.addEvntDfnEditorTlcmRnk("]]");}


		 };
		 };
		/******************** eventdefinitionreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> eventdefinitionreviewerlist = eventdefinition.getReviewer();
		for(int eventdefinitionrevieweri = 0; eventdefinitionrevieweri<eventdefinitionreviewerlist.size();eventdefinitionrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  eventdefinitionreviewer = eventdefinitionreviewerlist.get(eventdefinitionrevieweri);

		/******************** EvntDfn_Rviewr_Nm ********************************************************************************/
		if(eventdefinitionrevieweri == 0) {e.addEvntDfnRviewrNm("[");}
		if(eventdefinitionreviewer.hasName()) {

			e.addEvntDfnRviewrNm(String.valueOf(eventdefinitionreviewer.getName()));
		} else {
			e.addEvntDfnRviewrNm("NULL");
		}

		if(eventdefinitionrevieweri == eventdefinitionreviewerlist.size()-1) {e.addEvntDfnRviewrNm("]");}


		/******************** eventdefinitionreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> eventdefinitionreviewertelecomlist = eventdefinitionreviewer.getTelecom();
		for(int eventdefinitionreviewertelecomi = 0; eventdefinitionreviewertelecomi<eventdefinitionreviewertelecomlist.size();eventdefinitionreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  eventdefinitionreviewertelecom = eventdefinitionreviewertelecomlist.get(eventdefinitionreviewertelecomi);

		/******************** EvntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(eventdefinitionreviewertelecomi == 0) {e.addEvntDfnRviewrTlcmVl("[[");}
		if(eventdefinitionreviewertelecom.hasValue()) {

			e.addEvntDfnRviewrTlcmVl(String.valueOf(eventdefinitionreviewertelecom.getValue()));
		} else {
			e.addEvntDfnRviewrTlcmVl("NULL");
		}

		if(eventdefinitionreviewertelecomi == eventdefinitionreviewertelecomlist.size()-1) {e.addEvntDfnRviewrTlcmVl("]]");}


		/******************** eventdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionreviewertelecomperiod = eventdefinitionreviewertelecom.getPeriod();

		/******************** EvntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitionreviewertelecomi == 0) {e.addEvntDfnRviewrTlcmPrdStrt("[[");}
		if(eventdefinitionreviewertelecomperiod.hasStart()) {

			e.addEvntDfnRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionreviewertelecomperiod.getStart())+"\"");
		} else {
			e.addEvntDfnRviewrTlcmPrdStrt("NULL");
		}

		if(eventdefinitionreviewertelecomi == eventdefinitionreviewertelecomlist.size()-1) {e.addEvntDfnRviewrTlcmPrdStrt("]]");}


		/******************** EvntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitionreviewertelecomi == 0) {e.addEvntDfnRviewrTlcmPrdEnd("[[");}
		if(eventdefinitionreviewertelecomperiod.hasEnd()) {

			e.addEvntDfnRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionreviewertelecomperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnRviewrTlcmPrdEnd("NULL");
		}

		if(eventdefinitionreviewertelecomi == eventdefinitionreviewertelecomlist.size()-1) {e.addEvntDfnRviewrTlcmPrdEnd("]]");}


		/******************** eventdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitionreviewertelecomuse = eventdefinitionreviewertelecom.getUse();
		if(eventdefinitionreviewertelecomuse!=null) {
		if(eventdefinitionreviewertelecomi == 0) {

		e.addEvntDfnRviewrTlcmUse("[[");		}
			e.addEvntDfnRviewrTlcmUse(eventdefinitionreviewertelecomuse.toCode());
		if(eventdefinitionreviewertelecomi == eventdefinitionreviewertelecomlist.size()-1) {

		e.addEvntDfnRviewrTlcmUse("]]");		}

		} else {
			e.addEvntDfnRviewrTlcmUse("NULL");
		}

		/******************** eventdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitionreviewertelecomsystem = eventdefinitionreviewertelecom.getSystem();
		if(eventdefinitionreviewertelecomsystem!=null) {
		if(eventdefinitionreviewertelecomi == 0) {

		e.addEvntDfnRviewrTlcmSys("[[");		}
			e.addEvntDfnRviewrTlcmSys(eventdefinitionreviewertelecomsystem.toCode());
		if(eventdefinitionreviewertelecomi == eventdefinitionreviewertelecomlist.size()-1) {

		e.addEvntDfnRviewrTlcmSys("]]");		}

		} else {
			e.addEvntDfnRviewrTlcmSys("NULL");
		}

		/******************** EvntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitionreviewertelecomi == 0) {e.addEvntDfnRviewrTlcmRnk("[[");}
		if(eventdefinitionreviewertelecom.hasRank()) {

			e.addEvntDfnRviewrTlcmRnk(String.valueOf(eventdefinitionreviewertelecom.getRank()));
		} else {
			e.addEvntDfnRviewrTlcmRnk("NULL");
		}

		if(eventdefinitionreviewertelecomi == eventdefinitionreviewertelecomlist.size()-1) {e.addEvntDfnRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** EvntDfn_Usg ********************************************************************************/
		if(eventdefinition.hasUsage()) {

			e.addEvntDfnUsg(String.valueOf(eventdefinition.getUsage()));
		} else {
			e.addEvntDfnUsg("NULL");
		}


		/******************** EvntDfn_SbjctRfrnc ********************************************************************************/
		if(eventdefinition.hasSubjectReference()) {

			if(eventdefinition.getSubjectReference().getReference() != null) {
			e.addEvntDfnSbjctRfrnc(eventdefinition.getSubjectReference().getReference());
			}
		} else {
			e.addEvntDfnSbjctRfrnc("NULL");
		}


		/******************** eventdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionsubjectcodeableconcept = eventdefinition.getSubjectCodeableConcept();

		/******************** EvntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(eventdefinitionsubjectcodeableconcept.hasText()) {

			e.addEvntDfnSbjctCdbleCncptTxt(String.valueOf(eventdefinitionsubjectcodeableconcept.getText()));
		} else {
			e.addEvntDfnSbjctCdbleCncptTxt("NULL");
		}


		/******************** eventdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitionsubjectcodeableconceptcodinglist = eventdefinitionsubjectcodeableconcept.getCoding();
		for(int eventdefinitionsubjectcodeableconceptcodingi = 0; eventdefinitionsubjectcodeableconceptcodingi<eventdefinitionsubjectcodeableconceptcodinglist.size();eventdefinitionsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitionsubjectcodeableconceptcoding = eventdefinitionsubjectcodeableconceptcodinglist.get(eventdefinitionsubjectcodeableconceptcodingi);

		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcodingi == 0) {e.addEvntDfnSbjctCdbleCncptCdgDsply("[");}
		if(eventdefinitionsubjectcodeableconceptcoding.hasDisplay()) {

			e.addEvntDfnSbjctCdbleCncptCdgDsply(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getDisplay()));
		} else {
			e.addEvntDfnSbjctCdbleCncptCdgDsply("NULL");
		}

		if(eventdefinitionsubjectcodeableconceptcodingi == eventdefinitionsubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnSbjctCdbleCncptCdgDsply("]");}


		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcodingi == 0) {e.addEvntDfnSbjctCdbleCncptCdgVrsn("[");}
		if(eventdefinitionsubjectcodeableconceptcoding.hasVersion()) {

			e.addEvntDfnSbjctCdbleCncptCdgVrsn(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getVersion()));
		} else {
			e.addEvntDfnSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(eventdefinitionsubjectcodeableconceptcodingi == eventdefinitionsubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnSbjctCdbleCncptCdgVrsn("]");}


		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcodingi == 0) {e.addEvntDfnSbjctCdbleCncptCdgCd("[");}
		if(eventdefinitionsubjectcodeableconceptcoding.hasCode()) {

			e.addEvntDfnSbjctCdbleCncptCdgCd(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getCode()));
		} else {
			e.addEvntDfnSbjctCdbleCncptCdgCd("NULL");
		}

		if(eventdefinitionsubjectcodeableconceptcodingi == eventdefinitionsubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnSbjctCdbleCncptCdgCd("]");}


		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcodingi == 0) {e.addEvntDfnSbjctCdbleCncptCdgUsrSltd("[");}
		if(eventdefinitionsubjectcodeableconceptcoding.hasUserSelected()) {

			e.addEvntDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvntDfnSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(eventdefinitionsubjectcodeableconceptcodingi == eventdefinitionsubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnSbjctCdbleCncptCdgUsrSltd("]");}


		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcodingi == 0) {e.addEvntDfnSbjctCdbleCncptCdgSys("[");}
		if(eventdefinitionsubjectcodeableconceptcoding.hasSystem()) {

			e.addEvntDfnSbjctCdbleCncptCdgSys(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getSystem()));
		} else {
			e.addEvntDfnSbjctCdbleCncptCdgSys("NULL");
		}

		if(eventdefinitionsubjectcodeableconceptcodingi == eventdefinitionsubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnSbjctCdbleCncptCdgSys("]");}


		 };
		/******************** EvntDfn_Ttl ********************************************************************************/
		if(eventdefinition.hasTitle()) {

			e.addEvntDfnTtl(String.valueOf(eventdefinition.getTitle()));
		} else {
			e.addEvntDfnTtl("NULL");
		}


		/******************** eventdefinitionrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> eventdefinitionrelatedartifactlist = eventdefinition.getRelatedArtifact();
		for(int eventdefinitionrelatedartifacti = 0; eventdefinitionrelatedartifacti<eventdefinitionrelatedartifactlist.size();eventdefinitionrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  eventdefinitionrelatedartifact = eventdefinitionrelatedartifactlist.get(eventdefinitionrelatedartifacti);

		/******************** EvntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctRsrc("[");}
		if(eventdefinitionrelatedartifact.hasResource()) {

			e.addEvntDfnRltedArtfctRsrc(String.valueOf(eventdefinitionrelatedartifact.getResource()));
		} else {
			e.addEvntDfnRltedArtfctRsrc("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctRsrc("]");}


		/******************** eventdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType eventdefinitionrelatedartifacttype = eventdefinitionrelatedartifact.getType();
		if(eventdefinitionrelatedartifacttype!=null) {
		if(eventdefinitionrelatedartifacti == 0) {

		e.addEvntDfnRltedArtfctTyp("[");		}
			e.addEvntDfnRltedArtfctTyp(eventdefinitionrelatedartifacttype.toCode());
		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {

		e.addEvntDfnRltedArtfctTyp("]");		}

		} else {
			e.addEvntDfnRltedArtfctTyp("NULL");
		}

		/******************** EvntDfn_RltedArtfct_Url ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctUrl("[");}
		if(eventdefinitionrelatedartifact.hasUrl()) {

			e.addEvntDfnRltedArtfctUrl(String.valueOf(eventdefinitionrelatedartifact.getUrl()));
		} else {
			e.addEvntDfnRltedArtfctUrl("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctUrl("]");}


		/******************** EvntDfn_RltedArtfct_Citation ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctCitation("[");}
		if(eventdefinitionrelatedartifact.hasCitation()) {

			e.addEvntDfnRltedArtfctCitation(String.valueOf(eventdefinitionrelatedartifact.getCitation()));
		} else {
			e.addEvntDfnRltedArtfctCitation("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctCitation("]");}


		/******************** EvntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctLbl("[");}
		if(eventdefinitionrelatedartifact.hasLabel()) {

			e.addEvntDfnRltedArtfctLbl(String.valueOf(eventdefinitionrelatedartifact.getLabel()));
		} else {
			e.addEvntDfnRltedArtfctLbl("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctLbl("]");}


		/******************** eventdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment eventdefinitionrelatedartifactdocument = eventdefinitionrelatedartifact.getDocument();

		/******************** EvntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocSz("[");}
		if(eventdefinitionrelatedartifactdocument.hasSize()) {

			e.addEvntDfnRltedArtfctDocSz(String.valueOf(eventdefinitionrelatedartifactdocument.getSize()));
		} else {
			e.addEvntDfnRltedArtfctDocSz("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocSz("]");}


		/******************** EvntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocLnguage("[");}
		if(eventdefinitionrelatedartifactdocument.hasLanguage()) {

			e.addEvntDfnRltedArtfctDocLnguage(String.valueOf(eventdefinitionrelatedartifactdocument.getLanguage()));
		} else {
			e.addEvntDfnRltedArtfctDocLnguage("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocLnguage("]");}


		/******************** EvntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocCntntTyp("[");}
		if(eventdefinitionrelatedartifactdocument.hasContentType()) {

			e.addEvntDfnRltedArtfctDocCntntTyp(String.valueOf(eventdefinitionrelatedartifactdocument.getContentType()));
		} else {
			e.addEvntDfnRltedArtfctDocCntntTyp("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocCntntTyp("]");}


		/******************** EvntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocHash("[");}
		if(eventdefinitionrelatedartifactdocument.hasHash()) {

			e.addEvntDfnRltedArtfctDocHash(new String(eventdefinitionrelatedartifactdocument.getHash()));
		} else {
			e.addEvntDfnRltedArtfctDocHash("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocHash("]");}


		/******************** EvntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocData("[");}
		if(eventdefinitionrelatedartifactdocument.hasData()) {

			e.addEvntDfnRltedArtfctDocData(new String(eventdefinitionrelatedartifactdocument.getData()));
		} else {
			e.addEvntDfnRltedArtfctDocData("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocData("]");}


		/******************** EvntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocCreation("[");}
		if(eventdefinitionrelatedartifactdocument.hasCreation()) {

			e.addEvntDfnRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionrelatedartifactdocument.getCreation())+"\"");
		} else {
			e.addEvntDfnRltedArtfctDocCreation("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocCreation("]");}


		/******************** EvntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocTtl("[");}
		if(eventdefinitionrelatedartifactdocument.hasTitle()) {

			e.addEvntDfnRltedArtfctDocTtl(String.valueOf(eventdefinitionrelatedartifactdocument.getTitle()));
		} else {
			e.addEvntDfnRltedArtfctDocTtl("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocTtl("]");}


		/******************** EvntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(eventdefinitionrelatedartifacti == 0) {e.addEvntDfnRltedArtfctDocUrl("[");}
		if(eventdefinitionrelatedartifactdocument.hasUrl()) {

			e.addEvntDfnRltedArtfctDocUrl(String.valueOf(eventdefinitionrelatedartifactdocument.getUrl()));
		} else {
			e.addEvntDfnRltedArtfctDocUrl("NULL");
		}

		if(eventdefinitionrelatedartifacti == eventdefinitionrelatedartifactlist.size()-1) {e.addEvntDfnRltedArtfctDocUrl("]");}


		 };
		/******************** EvntDfn_Prpse ********************************************************************************/
		if(eventdefinition.hasPurpose()) {

			e.addEvntDfnPrpse(String.valueOf(eventdefinition.getPurpose()));
		} else {
			e.addEvntDfnPrpse("NULL");
		}


		/******************** EvntDfn_Url ********************************************************************************/
		if(eventdefinition.hasUrl()) {

			e.addEvntDfnUrl(String.valueOf(eventdefinition.getUrl()));
		} else {
			e.addEvntDfnUrl("NULL");
		}


		/******************** eventdefinitiontrigger ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TriggerDefinition> eventdefinitiontriggerlist = eventdefinition.getTrigger();
		for(int eventdefinitiontriggeri = 0; eventdefinitiontriggeri<eventdefinitiontriggerlist.size();eventdefinitiontriggeri++ ) {
		org.hl7.fhir.r4.model.TriggerDefinition  eventdefinitiontrigger = eventdefinitiontriggerlist.get(eventdefinitiontriggeri);

		/******************** EvntDfn_Trgr_Nm ********************************************************************************/
		if(eventdefinitiontriggeri == 0) {e.addEvntDfnTrgrNm("[");}
		if(eventdefinitiontrigger.hasName()) {

			e.addEvntDfnTrgrNm(String.valueOf(eventdefinitiontrigger.getName()));
		} else {
			e.addEvntDfnTrgrNm("NULL");
		}

		if(eventdefinitiontriggeri == eventdefinitiontriggerlist.size()-1) {e.addEvntDfnTrgrNm("]");}


		/******************** eventdefinitiontriggertype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerType eventdefinitiontriggertype = eventdefinitiontrigger.getType();
		if(eventdefinitiontriggertype!=null) {
		if(eventdefinitiontriggeri == 0) {

		e.addEvntDfnTrgrTyp("[");		}
			e.addEvntDfnTrgrTyp(eventdefinitiontriggertype.toCode());
		if(eventdefinitiontriggeri == eventdefinitiontriggerlist.size()-1) {

		e.addEvntDfnTrgrTyp("]");		}

		} else {
			e.addEvntDfnTrgrTyp("NULL");
		}

		/******************** eventdefinitiontriggerdata ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement> eventdefinitiontriggerdatalist = eventdefinitiontrigger.getData();
		for(int eventdefinitiontriggerdatai = 0; eventdefinitiontriggerdatai<eventdefinitiontriggerdatalist.size();eventdefinitiontriggerdatai++ ) {
		org.hl7.fhir.r4.model.DataRequirement  eventdefinitiontriggerdata = eventdefinitiontriggerdatalist.get(eventdefinitiontriggerdatai);

		/******************** EvntDfn_Trgr_Data_Typ ********************************************************************************/
		if(eventdefinitiontriggerdatai == 0) {e.addEvntDfnTrgrDataTyp("[[");}
		if(eventdefinitiontriggerdata.hasType()) {

			e.addEvntDfnTrgrDataTyp(String.valueOf(eventdefinitiontriggerdata.getType()));
		} else {
			e.addEvntDfnTrgrDataTyp("NULL");
		}

		if(eventdefinitiontriggerdatai == eventdefinitiontriggerdatalist.size()-1) {e.addEvntDfnTrgrDataTyp("]]");}


		/******************** eventdefinitiontriggerdatasort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> eventdefinitiontriggerdatasortlist = eventdefinitiontriggerdata.getSort();
		for(int eventdefinitiontriggerdatasorti = 0; eventdefinitiontriggerdatasorti<eventdefinitiontriggerdatasortlist.size();eventdefinitiontriggerdatasorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  eventdefinitiontriggerdatasort = eventdefinitiontriggerdatasortlist.get(eventdefinitiontriggerdatasorti);

		/******************** EvntDfn_Trgr_Data_Sort_Path ********************************************************************************/
		if(eventdefinitiontriggerdatasorti == 0) {e.addEvntDfnTrgrDataSortPath("[[[");}
		if(eventdefinitiontriggerdatasort.hasPath()) {

			e.addEvntDfnTrgrDataSortPath(String.valueOf(eventdefinitiontriggerdatasort.getPath()));
		} else {
			e.addEvntDfnTrgrDataSortPath("NULL");
		}

		if(eventdefinitiontriggerdatasorti == eventdefinitiontriggerdatasortlist.size()-1) {e.addEvntDfnTrgrDataSortPath("]]]");}


		/******************** eventdefinitiontriggerdatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection eventdefinitiontriggerdatasortdirection = eventdefinitiontriggerdatasort.getDirection();
		if(eventdefinitiontriggerdatasortdirection!=null) {
		if(eventdefinitiontriggerdatasorti == 0) {

		e.addEvntDfnTrgrDataSortDirection("[[[");		}
			e.addEvntDfnTrgrDataSortDirection(eventdefinitiontriggerdatasortdirection.toCode());
		if(eventdefinitiontriggerdatasorti == eventdefinitiontriggerdatasortlist.size()-1) {

		e.addEvntDfnTrgrDataSortDirection("]]]");		}

		} else {
			e.addEvntDfnTrgrDataSortDirection("NULL");
		}

		 };
		/******************** EvntDfn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(eventdefinitiontriggerdata.hasSubjectReference()) {

			if(eventdefinitiontriggerdata.getSubjectReference().getReference() != null) {
			e.addEvntDfnTrgrDataSbjctRfrnc(eventdefinitiontriggerdata.getSubjectReference().getReference());
			}
		} else {
			e.addEvntDfnTrgrDataSbjctRfrnc("NULL");
		}


		/******************** eventdefinitiontriggerdatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontriggerdatasubjectcodeableconcept = eventdefinitiontriggerdata.getSubjectCodeableConcept();

		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconcept.hasText()) {

			e.addEvntDfnTrgrDataSbjctCdbleCncptTxt(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconcept.getText()));
		} else {
			e.addEvntDfnTrgrDataSbjctCdbleCncptTxt("NULL");
		}


		/******************** eventdefinitiontriggerdatasubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitiontriggerdatasubjectcodeableconceptcodinglist = eventdefinitiontriggerdatasubjectcodeableconcept.getCoding();
		for(int eventdefinitiontriggerdatasubjectcodeableconceptcodingi = 0; eventdefinitiontriggerdatasubjectcodeableconceptcodingi<eventdefinitiontriggerdatasubjectcodeableconceptcodinglist.size();eventdefinitiontriggerdatasubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitiontriggerdatasubjectcodeableconceptcoding = eventdefinitiontriggerdatasubjectcodeableconceptcodinglist.get(eventdefinitiontriggerdatasubjectcodeableconceptcodingi);

		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == 0) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgDsply("[[[");}
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasDisplay()) {

			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgDsply(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getDisplay()));
		} else {
			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgDsply("NULL");
		}

		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == eventdefinitiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgDsply("]]]");}


		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == 0) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn("[[[");}
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasVersion()) {

			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getVersion()));
		} else {
			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == eventdefinitiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn("]]]");}


		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == 0) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgCd("[[[");}
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasCode()) {

			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgCd(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getCode()));
		} else {
			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgCd("NULL");
		}

		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == eventdefinitiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgCd("]]]");}


		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == 0) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd("[[[");}
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasUserSelected()) {

			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == eventdefinitiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd("]]]");}


		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == 0) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgSys("[[[");}
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasSystem()) {

			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgSys(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getSystem()));
		} else {
			e.addEvntDfnTrgrDataSbjctCdbleCncptCdgSys("NULL");
		}

		if(eventdefinitiontriggerdatasubjectcodeableconceptcodingi == eventdefinitiontriggerdatasubjectcodeableconceptcodinglist.size()-1) {e.addEvntDfnTrgrDataSbjctCdbleCncptCdgSys("]]]");}


		 };
		/******************** EvntDfn_Trgr_Data_Profile ********************************************************************************/
		if(eventdefinitiontriggerdata.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<eventdefinitiontriggerdata.getProfile().size(); incr++) {
				array = array + eventdefinitiontriggerdata.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvntDfnTrgrDataProfile(array);

		} else {
			e.addEvntDfnTrgrDataProfile("NULL");
		}


		/******************** EvntDfn_Trgr_Data_MustSupport ********************************************************************************/
		if(eventdefinitiontriggerdata.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<eventdefinitiontriggerdata.getMustSupport().size(); incr++) {
				array = array + eventdefinitiontriggerdata.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvntDfnTrgrDataMustSupport(array);

		} else {
			e.addEvntDfnTrgrDataMustSupport("NULL");
		}


		/******************** eventdefinitiontriggerdatacodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> eventdefinitiontriggerdatacodefilterlist = eventdefinitiontriggerdata.getCodeFilter();
		for(int eventdefinitiontriggerdatacodefilteri = 0; eventdefinitiontriggerdatacodefilteri<eventdefinitiontriggerdatacodefilterlist.size();eventdefinitiontriggerdatacodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  eventdefinitiontriggerdatacodefilter = eventdefinitiontriggerdatacodefilterlist.get(eventdefinitiontriggerdatacodefilteri);

		/******************** EvntDfn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(eventdefinitiontriggerdatacodefilteri == 0) {e.addEvntDfnTrgrDataCdFltrPath("[[[");}
		if(eventdefinitiontriggerdatacodefilter.hasPath()) {

			e.addEvntDfnTrgrDataCdFltrPath(String.valueOf(eventdefinitiontriggerdatacodefilter.getPath()));
		} else {
			e.addEvntDfnTrgrDataCdFltrPath("NULL");
		}

		if(eventdefinitiontriggerdatacodefilteri == eventdefinitiontriggerdatacodefilterlist.size()-1) {e.addEvntDfnTrgrDataCdFltrPath("]]]");}


		/******************** eventdefinitiontriggerdatacodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitiontriggerdatacodefiltercodelist = eventdefinitiontriggerdatacodefilter.getCode();
		for(int eventdefinitiontriggerdatacodefiltercodei = 0; eventdefinitiontriggerdatacodefiltercodei<eventdefinitiontriggerdatacodefiltercodelist.size();eventdefinitiontriggerdatacodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitiontriggerdatacodefiltercode = eventdefinitiontriggerdatacodefiltercodelist.get(eventdefinitiontriggerdatacodefiltercodei);

		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercodei == 0) {e.addEvntDfnTrgrDataCdFltrCdDsply("[[[[");}
		if(eventdefinitiontriggerdatacodefiltercode.hasDisplay()) {

			e.addEvntDfnTrgrDataCdFltrCdDsply(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getDisplay()));
		} else {
			e.addEvntDfnTrgrDataCdFltrCdDsply("NULL");
		}

		if(eventdefinitiontriggerdatacodefiltercodei == eventdefinitiontriggerdatacodefiltercodelist.size()-1) {e.addEvntDfnTrgrDataCdFltrCdDsply("]]]]");}


		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercodei == 0) {e.addEvntDfnTrgrDataCdFltrCdVrsn("[[[[");}
		if(eventdefinitiontriggerdatacodefiltercode.hasVersion()) {

			e.addEvntDfnTrgrDataCdFltrCdVrsn(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getVersion()));
		} else {
			e.addEvntDfnTrgrDataCdFltrCdVrsn("NULL");
		}

		if(eventdefinitiontriggerdatacodefiltercodei == eventdefinitiontriggerdatacodefiltercodelist.size()-1) {e.addEvntDfnTrgrDataCdFltrCdVrsn("]]]]");}


		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercodei == 0) {e.addEvntDfnTrgrDataCdFltrCdUsrSltd("[[[[");}
		if(eventdefinitiontriggerdatacodefiltercode.hasUserSelected()) {

			e.addEvntDfnTrgrDataCdFltrCdUsrSltd(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getUserSelected()));
		} else {
			e.addEvntDfnTrgrDataCdFltrCdUsrSltd("NULL");
		}

		if(eventdefinitiontriggerdatacodefiltercodei == eventdefinitiontriggerdatacodefiltercodelist.size()-1) {e.addEvntDfnTrgrDataCdFltrCdUsrSltd("]]]]");}


		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercodei == 0) {e.addEvntDfnTrgrDataCdFltrCdSys("[[[[");}
		if(eventdefinitiontriggerdatacodefiltercode.hasSystem()) {

			e.addEvntDfnTrgrDataCdFltrCdSys(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getSystem()));
		} else {
			e.addEvntDfnTrgrDataCdFltrCdSys("NULL");
		}

		if(eventdefinitiontriggerdatacodefiltercodei == eventdefinitiontriggerdatacodefiltercodelist.size()-1) {e.addEvntDfnTrgrDataCdFltrCdSys("]]]]");}


		 };
		/******************** EvntDfn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(eventdefinitiontriggerdatacodefilter.hasSearchParam()) {

			e.addEvntDfnTrgrDataCdFltrSrchParam(String.valueOf(eventdefinitiontriggerdatacodefilter.getSearchParam()));
		} else {
			e.addEvntDfnTrgrDataCdFltrSrchParam("NULL");
		}


		/******************** EvntDfn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(eventdefinitiontriggerdatacodefilter.hasValueSet()) {

			e.addEvntDfnTrgrDataCdFltrVlSt(String.valueOf(eventdefinitiontriggerdatacodefilter.getValueSet()));
		} else {
			e.addEvntDfnTrgrDataCdFltrVlSt("NULL");
		}


		 };
		/******************** EvntDfn_Trgr_Data_Lmt ********************************************************************************/
		if(eventdefinitiontriggerdata.hasLimit()) {

			e.addEvntDfnTrgrDataLmt(String.valueOf(eventdefinitiontriggerdata.getLimit()));
		} else {
			e.addEvntDfnTrgrDataLmt("NULL");
		}


		/******************** eventdefinitiontriggerdatadatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> eventdefinitiontriggerdatadatefilterlist = eventdefinitiontriggerdata.getDateFilter();
		for(int eventdefinitiontriggerdatadatefilteri = 0; eventdefinitiontriggerdatadatefilteri<eventdefinitiontriggerdatadatefilterlist.size();eventdefinitiontriggerdatadatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  eventdefinitiontriggerdatadatefilter = eventdefinitiontriggerdatadatefilterlist.get(eventdefinitiontriggerdatadatefilteri);

		/******************** EvntDfn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrPath("[[[");}
		if(eventdefinitiontriggerdatadatefilter.hasPath()) {

			e.addEvntDfnTrgrDataDtFltrPath(String.valueOf(eventdefinitiontriggerdatadatefilter.getPath()));
		} else {
			e.addEvntDfnTrgrDataDtFltrPath("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrPath("]]]");}


		/******************** EvntDfn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrSrchParam("[[[");}
		if(eventdefinitiontriggerdatadatefilter.hasSearchParam()) {

			e.addEvntDfnTrgrDataDtFltrSrchParam(String.valueOf(eventdefinitiontriggerdatadatefilter.getSearchParam()));
		} else {
			e.addEvntDfnTrgrDataDtFltrSrchParam("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrSrchParam("]]]");}


		/******************** eventdefinitiontriggerdatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration eventdefinitiontriggerdatadatefiltervalueduration = eventdefinitiontriggerdatadatefilter.getValueDuration();

		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrVlDurationVl("[[[");}
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasValue()) {

			e.addEvntDfnTrgrDataDtFltrVlDurationVl(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getValue()));
		} else {
			e.addEvntDfnTrgrDataDtFltrVlDurationVl("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrVlDurationVl("]]]");}


		/******************** eventdefinitiontriggerdatadatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggerdatadatefiltervaluedurationcomparator = eventdefinitiontriggerdatadatefiltervalueduration.getComparator();
		if(eventdefinitiontriggerdatadatefiltervaluedurationcomparator!=null) {
		if(eventdefinitiontriggerdatadatefilteri == 0) {

		e.addEvntDfnTrgrDataDtFltrVlDurationCmprtr("[[[");		}
			e.addEvntDfnTrgrDataDtFltrVlDurationCmprtr(eventdefinitiontriggerdatadatefiltervaluedurationcomparator.toCode());
		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {

		e.addEvntDfnTrgrDataDtFltrVlDurationCmprtr("]]]");		}

		} else {
			e.addEvntDfnTrgrDataDtFltrVlDurationCmprtr("NULL");
		}

		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrVlDurationCd("[[[");}
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasCode()) {

			e.addEvntDfnTrgrDataDtFltrVlDurationCd(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getCode()));
		} else {
			e.addEvntDfnTrgrDataDtFltrVlDurationCd("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrVlDurationCd("]]]");}


		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrVlDurationUnt("[[[");}
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasUnit()) {

			e.addEvntDfnTrgrDataDtFltrVlDurationUnt(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getUnit()));
		} else {
			e.addEvntDfnTrgrDataDtFltrVlDurationUnt("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrVlDurationUnt("]]]");}


		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrVlDurationSys("[[[");}
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasSystem()) {

			e.addEvntDfnTrgrDataDtFltrVlDurationSys(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getSystem()));
		} else {
			e.addEvntDfnTrgrDataDtFltrVlDurationSys("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrVlDurationSys("]]]");}


		/******************** EvntDfn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrVlDtTimeTyp("[[[");}
		if(eventdefinitiontriggerdatadatefilter.hasValueDateTimeType()) {

			e.addEvntDfnTrgrDataDtFltrVlDtTimeTyp("\""+eventdefinitiontriggerdatadatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			e.addEvntDfnTrgrDataDtFltrVlDtTimeTyp("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrVlDtTimeTyp("]]]");}


		/******************** eventdefinitiontriggerdatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitiontriggerdatadatefiltervalueperiod = eventdefinitiontriggerdatadatefilter.getValuePeriod();

		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrVlPrdStrt("[[[");}
		if(eventdefinitiontriggerdatadatefiltervalueperiod.hasStart()) {

			e.addEvntDfnTrgrDataDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitiontriggerdatadatefiltervalueperiod.getStart())+"\"");
		} else {
			e.addEvntDfnTrgrDataDtFltrVlPrdStrt("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrVlPrdStrt("]]]");}


		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilteri == 0) {e.addEvntDfnTrgrDataDtFltrVlPrdEnd("[[[");}
		if(eventdefinitiontriggerdatadatefiltervalueperiod.hasEnd()) {

			e.addEvntDfnTrgrDataDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitiontriggerdatadatefiltervalueperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnTrgrDataDtFltrVlPrdEnd("NULL");
		}

		if(eventdefinitiontriggerdatadatefilteri == eventdefinitiontriggerdatadatefilterlist.size()-1) {e.addEvntDfnTrgrDataDtFltrVlPrdEnd("]]]");}


		 };
		 };
		/******************** EvntDfn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(eventdefinitiontrigger.hasTimingDateTimeType()) {

			e.addEvntDfnTrgrTmgDtTimeTyp("\""+eventdefinitiontrigger.getTimingDateTimeType().getValueAsString()+"\"");
		} else {
			e.addEvntDfnTrgrTmgDtTimeTyp("NULL");
		}


		/******************** eventdefinitiontriggercondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression eventdefinitiontriggercondition = eventdefinitiontrigger.getCondition();

		/******************** EvntDfn_Trgr_Cndtn_Nm ********************************************************************************/
		if(eventdefinitiontriggercondition.hasName()) {

			e.addEvntDfnTrgrCndtnNm(String.valueOf(eventdefinitiontriggercondition.getName()));
		} else {
			e.addEvntDfnTrgrCndtnNm("NULL");
		}


		/******************** EvntDfn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(eventdefinitiontriggercondition.hasReference()) {

			e.addEvntDfnTrgrCndtnRfrnc(String.valueOf(eventdefinitiontriggercondition.getReference()));
		} else {
			e.addEvntDfnTrgrCndtnRfrnc("NULL");
		}


		/******************** EvntDfn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(eventdefinitiontriggercondition.hasLanguage()) {

			e.addEvntDfnTrgrCndtnLnguage(String.valueOf(eventdefinitiontriggercondition.getLanguage()));
		} else {
			e.addEvntDfnTrgrCndtnLnguage("NULL");
		}


		/******************** EvntDfn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(eventdefinitiontriggercondition.hasDescription()) {

			e.addEvntDfnTrgrCndtnDscrptn(String.valueOf(eventdefinitiontriggercondition.getDescription()));
		} else {
			e.addEvntDfnTrgrCndtnDscrptn("NULL");
		}


		/******************** EvntDfn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(eventdefinitiontriggercondition.hasExpression()) {

			e.addEvntDfnTrgrCndtnExprsn(String.valueOf(eventdefinitiontriggercondition.getExpression()));
		} else {
			e.addEvntDfnTrgrCndtnExprsn("NULL");
		}


		/******************** eventdefinitiontriggertimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing eventdefinitiontriggertimingtiming = eventdefinitiontrigger.getTimingTiming();

		/******************** eventdefinitiontriggertimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontriggertimingtimingcode = eventdefinitiontriggertimingtiming.getCode();

		/******************** EvntDfn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcode.hasText()) {

			e.addEvntDfnTrgrTmgTmgCdTxt(String.valueOf(eventdefinitiontriggertimingtimingcode.getText()));
		} else {
			e.addEvntDfnTrgrTmgTmgCdTxt("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitiontriggertimingtimingcodecodinglist = eventdefinitiontriggertimingtimingcode.getCoding();
		for(int eventdefinitiontriggertimingtimingcodecodingi = 0; eventdefinitiontriggertimingtimingcodecodingi<eventdefinitiontriggertimingtimingcodecodinglist.size();eventdefinitiontriggertimingtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitiontriggertimingtimingcodecoding = eventdefinitiontriggertimingtimingcodecodinglist.get(eventdefinitiontriggertimingtimingcodecodingi);

		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecodingi == 0) {e.addEvntDfnTrgrTmgTmgCdCdgDsply("[[");}
		if(eventdefinitiontriggertimingtimingcodecoding.hasDisplay()) {

			e.addEvntDfnTrgrTmgTmgCdCdgDsply(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getDisplay()));
		} else {
			e.addEvntDfnTrgrTmgTmgCdCdgDsply("NULL");
		}

		if(eventdefinitiontriggertimingtimingcodecodingi == eventdefinitiontriggertimingtimingcodecodinglist.size()-1) {e.addEvntDfnTrgrTmgTmgCdCdgDsply("]]");}


		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecodingi == 0) {e.addEvntDfnTrgrTmgTmgCdCdgVrsn("[[");}
		if(eventdefinitiontriggertimingtimingcodecoding.hasVersion()) {

			e.addEvntDfnTrgrTmgTmgCdCdgVrsn(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getVersion()));
		} else {
			e.addEvntDfnTrgrTmgTmgCdCdgVrsn("NULL");
		}

		if(eventdefinitiontriggertimingtimingcodecodingi == eventdefinitiontriggertimingtimingcodecodinglist.size()-1) {e.addEvntDfnTrgrTmgTmgCdCdgVrsn("]]");}


		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecodingi == 0) {e.addEvntDfnTrgrTmgTmgCdCdgCd("[[");}
		if(eventdefinitiontriggertimingtimingcodecoding.hasCode()) {

			e.addEvntDfnTrgrTmgTmgCdCdgCd(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getCode()));
		} else {
			e.addEvntDfnTrgrTmgTmgCdCdgCd("NULL");
		}

		if(eventdefinitiontriggertimingtimingcodecodingi == eventdefinitiontriggertimingtimingcodecodinglist.size()-1) {e.addEvntDfnTrgrTmgTmgCdCdgCd("]]");}


		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecodingi == 0) {e.addEvntDfnTrgrTmgTmgCdCdgUsrSltd("[[");}
		if(eventdefinitiontriggertimingtimingcodecoding.hasUserSelected()) {

			e.addEvntDfnTrgrTmgTmgCdCdgUsrSltd(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getUserSelected()));
		} else {
			e.addEvntDfnTrgrTmgTmgCdCdgUsrSltd("NULL");
		}

		if(eventdefinitiontriggertimingtimingcodecodingi == eventdefinitiontriggertimingtimingcodecodinglist.size()-1) {e.addEvntDfnTrgrTmgTmgCdCdgUsrSltd("]]");}


		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecodingi == 0) {e.addEvntDfnTrgrTmgTmgCdCdgSys("[[");}
		if(eventdefinitiontriggertimingtimingcodecoding.hasSystem()) {

			e.addEvntDfnTrgrTmgTmgCdCdgSys(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getSystem()));
		} else {
			e.addEvntDfnTrgrTmgTmgCdCdgSys("NULL");
		}

		if(eventdefinitiontriggertimingtimingcodecodingi == eventdefinitiontriggertimingtimingcodecodinglist.size()-1) {e.addEvntDfnTrgrTmgTmgCdCdgSys("]]");}


		 };
		/******************** EvntDfn_Trgr_TmgTmg_Evnt ********************************************************************************/
		if(eventdefinitiontriggertimingtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<eventdefinitiontriggertimingtiming.getEvent().size(); incr++) {
				array = array + eventdefinitiontriggertimingtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvntDfnTrgrTmgTmgEvnt(array);

		} else {
			e.addEvntDfnTrgrTmgTmgEvnt("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent eventdefinitiontriggertimingtimingrepeat = eventdefinitiontriggertimingtiming.getRepeat();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasOffset()) {

			e.addEvntDfnTrgrTmgTmgRptOff(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getOffset()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptOff("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasCount()) {

			e.addEvntDfnTrgrTmgTmgRptCnt(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getCount()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptCnt("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasPeriod()) {

			e.addEvntDfnTrgrTmgTmgRptPrd(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getPeriod()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptPrd("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasCountMax()) {

			e.addEvntDfnTrgrTmgTmgRptCntMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getCountMax()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptCntMx("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasDurationMax()) {

			e.addEvntDfnTrgrTmgTmgRptDurationMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getDurationMax()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptDurationMx("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitiontriggertimingtimingrepeatboundsperiod = eventdefinitiontriggertimingtimingrepeat.getBoundsPeriod();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsperiod.hasStart()) {

			e.addEvntDfnTrgrTmgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitiontriggertimingtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsPrdStrt("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsperiod.hasEnd()) {

			e.addEvntDfnTrgrTmgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitiontriggertimingtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsPrdEnd("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime eventdefinitiontriggertimingtimingrepeatdurationunit = eventdefinitiontriggertimingtimingrepeat.getDurationUnit();
		if(eventdefinitiontriggertimingtimingrepeatdurationunit!=null) {
			e.addEvntDfnTrgrTmgTmgRptDurationUnt(eventdefinitiontriggertimingtimingrepeatdurationunit.toCode());
		} else {
			e.addEvntDfnTrgrTmgTmgRptDurationUnt("NULL");
		}

		/******************** eventdefinitiontriggertimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration eventdefinitiontriggertimingtimingrepeatboundsduration = eventdefinitiontriggertimingtimingrepeat.getBoundsDuration();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasValue()) {

			e.addEvntDfnTrgrTmgTmgRptBndsDurationVl(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getValue()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsDurationVl("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator = eventdefinitiontriggertimingtimingrepeatboundsduration.getComparator();
		if(eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator!=null) {
			e.addEvntDfnTrgrTmgTmgRptBndsDurationCmprtr(eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator.toCode());
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasCode()) {

			e.addEvntDfnTrgrTmgTmgRptBndsDurationCd(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getCode()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsDurationCd("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasUnit()) {

			e.addEvntDfnTrgrTmgTmgRptBndsDurationUnt(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getUnit()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsDurationUnt("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasSystem()) {

			e.addEvntDfnTrgrTmgTmgRptBndsDurationSys(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getSystem()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsDurationSys("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range eventdefinitiontriggertimingtimingrepeatboundsrange = eventdefinitiontriggertimingtimingrepeat.getBoundsRange();

		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitiontriggertimingtimingrepeatboundsrangelow = eventdefinitiontriggertimingtimingrepeatboundsrange.getLow();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasValue()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngLwVl(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getValue()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngLwVl("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator = eventdefinitiontriggertimingtimingrepeatboundsrangelow.getComparator();
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator!=null) {
			e.addEvntDfnTrgrTmgTmgRptBndsRngLwCmprtr(eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasCode()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngLwCd(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getCode()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngLwCd("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasUnit()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngLwUnt(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getUnit()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasSystem()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngLwSys(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getSystem()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngLwSys("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitiontriggertimingtimingrepeatboundsrangehigh = eventdefinitiontriggertimingtimingrepeatboundsrange.getHigh();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasValue()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngHiVl(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getValue()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngHiVl("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator = eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getComparator();
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator!=null) {
			e.addEvntDfnTrgrTmgTmgRptBndsRngHiCmprtr(eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasCode()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngHiCd(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getCode()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngHiCd("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasUnit()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngHiUnt(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getUnit()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasSystem()) {

			e.addEvntDfnTrgrTmgTmgRptBndsRngHiSys(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getSystem()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptBndsRngHiSys("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasFrequencyMax()) {

			e.addEvntDfnTrgrTmgTmgRptFrqncyMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getFrequencyMax()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptFrqncyMx("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> eventdefinitiontriggertimingtimingrepeatwhenlist = eventdefinitiontriggertimingtimingrepeat.getWhen();
		for(int eventdefinitiontriggertimingtimingrepeatwheni = 0; eventdefinitiontriggertimingtimingrepeatwheni<eventdefinitiontriggertimingtimingrepeatwhenlist.size();eventdefinitiontriggertimingtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  eventdefinitiontriggertimingtimingrepeatwhen = eventdefinitiontriggertimingtimingrepeatwhenlist.get(eventdefinitiontriggertimingtimingrepeatwheni);
		if(eventdefinitiontriggertimingtimingrepeatwhen!=null) {
			e.addEvntDfnTrgrTmgTmgRptWhen(eventdefinitiontriggertimingtimingrepeatwhen.getCode());
		} else {
			e.addEvntDfnTrgrTmgTmgRptWhen("NULL");
		}
		 };

		/******************** eventdefinitiontriggertimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime eventdefinitiontriggertimingtimingrepeatperiodunit = eventdefinitiontriggertimingtimingrepeat.getPeriodUnit();
		if(eventdefinitiontriggertimingtimingrepeatperiodunit!=null) {
			e.addEvntDfnTrgrTmgTmgRptPrdUnt(eventdefinitiontriggertimingtimingrepeatperiodunit.toCode());
		} else {
			e.addEvntDfnTrgrTmgTmgRptPrdUnt("NULL");
		}

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasPeriodMax()) {

			e.addEvntDfnTrgrTmgTmgRptPrdMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getPeriodMax()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptPrdMx("NULL");
		}


		/******************** eventdefinitiontriggertimingtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> eventdefinitiontriggertimingtimingrepeatdayofweeklist = eventdefinitiontriggertimingtimingrepeat.getDayOfWeek();
		for(int eventdefinitiontriggertimingtimingrepeatdayofweeki = 0; eventdefinitiontriggertimingtimingrepeatdayofweeki<eventdefinitiontriggertimingtimingrepeatdayofweeklist.size();eventdefinitiontriggertimingtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  eventdefinitiontriggertimingtimingrepeatdayofweek = eventdefinitiontriggertimingtimingrepeatdayofweeklist.get(eventdefinitiontriggertimingtimingrepeatdayofweeki);
		if(eventdefinitiontriggertimingtimingrepeatdayofweek!=null) {
			e.addEvntDfnTrgrTmgTmgRptDayOfWeek(eventdefinitiontriggertimingtimingrepeatdayofweek.getCode());
		} else {
			e.addEvntDfnTrgrTmgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<eventdefinitiontriggertimingtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + eventdefinitiontriggertimingtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvntDfnTrgrTmgTmgRptTimeOfDay(array);

		} else {
			e.addEvntDfnTrgrTmgTmgRptTimeOfDay("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasDuration()) {

			e.addEvntDfnTrgrTmgTmgRptDuration(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getDuration()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptDuration("NULL");
		}


		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasFrequency()) {

			e.addEvntDfnTrgrTmgTmgRptFrqncy(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getFrequency()));
		} else {
			e.addEvntDfnTrgrTmgTmgRptFrqncy("NULL");
		}


		/******************** EvntDfn_Trgr_TmgRfrnc ********************************************************************************/
		if(eventdefinitiontrigger.hasTimingReference()) {

			if(eventdefinitiontrigger.getTimingReference().getReference() != null) {
			e.addEvntDfnTrgrTmgRfrnc(eventdefinitiontrigger.getTimingReference().getReference());
			}
		} else {
			e.addEvntDfnTrgrTmgRfrnc("NULL");
		}


		/******************** EvntDfn_Trgr_TmgDtTyp ********************************************************************************/
		if(eventdefinitiontrigger.hasTimingDateType()) {

			e.addEvntDfnTrgrTmgDtTyp("\""+eventdefinitiontrigger.getTimingDateType().getValueAsString()+"\"");
		} else {
			e.addEvntDfnTrgrTmgDtTyp("NULL");
		}


		 };
		/******************** EvntDfn_Subtitle ********************************************************************************/
		if(eventdefinition.hasSubtitle()) {

			e.addEvntDfnSubtitle(String.valueOf(eventdefinition.getSubtitle()));
		} else {
			e.addEvntDfnSubtitle("NULL");
		}


		/******************** eventdefinitiontopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> eventdefinitiontopiclist = eventdefinition.getTopic();
		for(int eventdefinitiontopici = 0; eventdefinitiontopici<eventdefinitiontopiclist.size();eventdefinitiontopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  eventdefinitiontopic = eventdefinitiontopiclist.get(eventdefinitiontopici);

		/******************** EvntDfn_Topic_Txt ********************************************************************************/
		if(eventdefinitiontopici == 0) {e.addEvntDfnTopicTxt("[");}
		if(eventdefinitiontopic.hasText()) {

			e.addEvntDfnTopicTxt(String.valueOf(eventdefinitiontopic.getText()));
		} else {
			e.addEvntDfnTopicTxt("NULL");
		}

		if(eventdefinitiontopici == eventdefinitiontopiclist.size()-1) {e.addEvntDfnTopicTxt("]");}


		/******************** eventdefinitiontopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitiontopiccodinglist = eventdefinitiontopic.getCoding();
		for(int eventdefinitiontopiccodingi = 0; eventdefinitiontopiccodingi<eventdefinitiontopiccodinglist.size();eventdefinitiontopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitiontopiccoding = eventdefinitiontopiccodinglist.get(eventdefinitiontopiccodingi);

		/******************** EvntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(eventdefinitiontopiccodingi == 0) {e.addEvntDfnTopicCdgDsply("[[");}
		if(eventdefinitiontopiccoding.hasDisplay()) {

			e.addEvntDfnTopicCdgDsply(String.valueOf(eventdefinitiontopiccoding.getDisplay()));
		} else {
			e.addEvntDfnTopicCdgDsply("NULL");
		}

		if(eventdefinitiontopiccodingi == eventdefinitiontopiccodinglist.size()-1) {e.addEvntDfnTopicCdgDsply("]]");}


		/******************** EvntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitiontopiccodingi == 0) {e.addEvntDfnTopicCdgVrsn("[[");}
		if(eventdefinitiontopiccoding.hasVersion()) {

			e.addEvntDfnTopicCdgVrsn(String.valueOf(eventdefinitiontopiccoding.getVersion()));
		} else {
			e.addEvntDfnTopicCdgVrsn("NULL");
		}

		if(eventdefinitiontopiccodingi == eventdefinitiontopiccodinglist.size()-1) {e.addEvntDfnTopicCdgVrsn("]]");}


		/******************** EvntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(eventdefinitiontopiccodingi == 0) {e.addEvntDfnTopicCdgCd("[[");}
		if(eventdefinitiontopiccoding.hasCode()) {

			e.addEvntDfnTopicCdgCd(String.valueOf(eventdefinitiontopiccoding.getCode()));
		} else {
			e.addEvntDfnTopicCdgCd("NULL");
		}

		if(eventdefinitiontopiccodingi == eventdefinitiontopiccodinglist.size()-1) {e.addEvntDfnTopicCdgCd("]]");}


		/******************** EvntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitiontopiccodingi == 0) {e.addEvntDfnTopicCdgUsrSltd("[[");}
		if(eventdefinitiontopiccoding.hasUserSelected()) {

			e.addEvntDfnTopicCdgUsrSltd(String.valueOf(eventdefinitiontopiccoding.getUserSelected()));
		} else {
			e.addEvntDfnTopicCdgUsrSltd("NULL");
		}

		if(eventdefinitiontopiccodingi == eventdefinitiontopiccodinglist.size()-1) {e.addEvntDfnTopicCdgUsrSltd("]]");}


		/******************** EvntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(eventdefinitiontopiccodingi == 0) {e.addEvntDfnTopicCdgSys("[[");}
		if(eventdefinitiontopiccoding.hasSystem()) {

			e.addEvntDfnTopicCdgSys(String.valueOf(eventdefinitiontopiccoding.getSystem()));
		} else {
			e.addEvntDfnTopicCdgSys("NULL");
		}

		if(eventdefinitiontopiccodingi == eventdefinitiontopiccodinglist.size()-1) {e.addEvntDfnTopicCdgSys("]]");}


		 };
		 };
		/******************** eventdefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> eventdefinitionjurisdictionlist = eventdefinition.getJurisdiction();
		for(int eventdefinitionjurisdictioni = 0; eventdefinitionjurisdictioni<eventdefinitionjurisdictionlist.size();eventdefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  eventdefinitionjurisdiction = eventdefinitionjurisdictionlist.get(eventdefinitionjurisdictioni);

		/******************** EvntDfn_Jrsdctn_Txt ********************************************************************************/
		if(eventdefinitionjurisdictioni == 0) {e.addEvntDfnJrsdctnTxt("[");}
		if(eventdefinitionjurisdiction.hasText()) {

			e.addEvntDfnJrsdctnTxt(String.valueOf(eventdefinitionjurisdiction.getText()));
		} else {
			e.addEvntDfnJrsdctnTxt("NULL");
		}

		if(eventdefinitionjurisdictioni == eventdefinitionjurisdictionlist.size()-1) {e.addEvntDfnJrsdctnTxt("]");}


		/******************** eventdefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitionjurisdictioncodinglist = eventdefinitionjurisdiction.getCoding();
		for(int eventdefinitionjurisdictioncodingi = 0; eventdefinitionjurisdictioncodingi<eventdefinitionjurisdictioncodinglist.size();eventdefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitionjurisdictioncoding = eventdefinitionjurisdictioncodinglist.get(eventdefinitionjurisdictioncodingi);

		/******************** EvntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionjurisdictioncodingi == 0) {e.addEvntDfnJrsdctnCdgDsply("[[");}
		if(eventdefinitionjurisdictioncoding.hasDisplay()) {

			e.addEvntDfnJrsdctnCdgDsply(String.valueOf(eventdefinitionjurisdictioncoding.getDisplay()));
		} else {
			e.addEvntDfnJrsdctnCdgDsply("NULL");
		}

		if(eventdefinitionjurisdictioncodingi == eventdefinitionjurisdictioncodinglist.size()-1) {e.addEvntDfnJrsdctnCdgDsply("]]");}


		/******************** EvntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionjurisdictioncodingi == 0) {e.addEvntDfnJrsdctnCdgVrsn("[[");}
		if(eventdefinitionjurisdictioncoding.hasVersion()) {

			e.addEvntDfnJrsdctnCdgVrsn(String.valueOf(eventdefinitionjurisdictioncoding.getVersion()));
		} else {
			e.addEvntDfnJrsdctnCdgVrsn("NULL");
		}

		if(eventdefinitionjurisdictioncodingi == eventdefinitionjurisdictioncodinglist.size()-1) {e.addEvntDfnJrsdctnCdgVrsn("]]");}


		/******************** EvntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(eventdefinitionjurisdictioncodingi == 0) {e.addEvntDfnJrsdctnCdgCd("[[");}
		if(eventdefinitionjurisdictioncoding.hasCode()) {

			e.addEvntDfnJrsdctnCdgCd(String.valueOf(eventdefinitionjurisdictioncoding.getCode()));
		} else {
			e.addEvntDfnJrsdctnCdgCd("NULL");
		}

		if(eventdefinitionjurisdictioncodingi == eventdefinitionjurisdictioncodinglist.size()-1) {e.addEvntDfnJrsdctnCdgCd("]]");}


		/******************** EvntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionjurisdictioncodingi == 0) {e.addEvntDfnJrsdctnCdgUsrSltd("[[");}
		if(eventdefinitionjurisdictioncoding.hasUserSelected()) {

			e.addEvntDfnJrsdctnCdgUsrSltd(String.valueOf(eventdefinitionjurisdictioncoding.getUserSelected()));
		} else {
			e.addEvntDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(eventdefinitionjurisdictioncodingi == eventdefinitionjurisdictioncodinglist.size()-1) {e.addEvntDfnJrsdctnCdgUsrSltd("]]");}


		/******************** EvntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(eventdefinitionjurisdictioncodingi == 0) {e.addEvntDfnJrsdctnCdgSys("[[");}
		if(eventdefinitionjurisdictioncoding.hasSystem()) {

			e.addEvntDfnJrsdctnCdgSys(String.valueOf(eventdefinitionjurisdictioncoding.getSystem()));
		} else {
			e.addEvntDfnJrsdctnCdgSys("NULL");
		}

		if(eventdefinitionjurisdictioncodingi == eventdefinitionjurisdictioncodinglist.size()-1) {e.addEvntDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** eventdefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> eventdefinitionusecontextlist = eventdefinition.getUseContext();
		for(int eventdefinitionusecontexti = 0; eventdefinitionusecontexti<eventdefinitionusecontextlist.size();eventdefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  eventdefinitionusecontext = eventdefinitionusecontextlist.get(eventdefinitionusecontexti);

		/******************** eventdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionusecontextcode = eventdefinitionusecontext.getCode();

		/******************** EvntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtCdDsply("[");}
		if(eventdefinitionusecontextcode.hasDisplay()) {

			e.addEvntDfnUseCntxtCdDsply(String.valueOf(eventdefinitionusecontextcode.getDisplay()));
		} else {
			e.addEvntDfnUseCntxtCdDsply("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtCdDsply("]");}


		/******************** EvntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtCdVrsn("[");}
		if(eventdefinitionusecontextcode.hasVersion()) {

			e.addEvntDfnUseCntxtCdVrsn(String.valueOf(eventdefinitionusecontextcode.getVersion()));
		} else {
			e.addEvntDfnUseCntxtCdVrsn("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtCdVrsn("]");}


		/******************** EvntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtCdUsrSltd("[");}
		if(eventdefinitionusecontextcode.hasUserSelected()) {

			e.addEvntDfnUseCntxtCdUsrSltd(String.valueOf(eventdefinitionusecontextcode.getUserSelected()));
		} else {
			e.addEvntDfnUseCntxtCdUsrSltd("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtCdUsrSltd("]");}


		/******************** EvntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtCdSys("[");}
		if(eventdefinitionusecontextcode.hasSystem()) {

			e.addEvntDfnUseCntxtCdSys(String.valueOf(eventdefinitionusecontextcode.getSystem()));
		} else {
			e.addEvntDfnUseCntxtCdSys("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtCdSys("]");}


		/******************** EvntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRfrnc("[");}
		if(eventdefinitionusecontext.hasValueReference()) {

			if(eventdefinitionusecontext.getValueReference().getReference() != null) {
			e.addEvntDfnUseCntxtVlRfrnc(eventdefinitionusecontext.getValueReference().getReference());
			}
		} else {
			e.addEvntDfnUseCntxtVlRfrnc("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRfrnc("]");}


		/******************** eventdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionusecontextvaluecodeableconcept = eventdefinitionusecontext.getValueCodeableConcept();

		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlCdbleCncptTxt("[");}
		if(eventdefinitionusecontextvaluecodeableconcept.hasText()) {

			e.addEvntDfnUseCntxtVlCdbleCncptTxt(String.valueOf(eventdefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			e.addEvntDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** eventdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> eventdefinitionusecontextvaluecodeableconceptcodinglist = eventdefinitionusecontextvaluecodeableconcept.getCoding();
		for(int eventdefinitionusecontextvaluecodeableconceptcodingi = 0; eventdefinitionusecontextvaluecodeableconceptcodingi<eventdefinitionusecontextvaluecodeableconceptcodinglist.size();eventdefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  eventdefinitionusecontextvaluecodeableconceptcoding = eventdefinitionusecontextvaluecodeableconceptcodinglist.get(eventdefinitionusecontextvaluecodeableconceptcodingi);

		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcodingi == 0) {e.addEvntDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			e.addEvntDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			e.addEvntDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(eventdefinitionusecontextvaluecodeableconceptcodingi == eventdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvntDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcodingi == 0) {e.addEvntDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			e.addEvntDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			e.addEvntDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(eventdefinitionusecontextvaluecodeableconceptcodingi == eventdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvntDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcodingi == 0) {e.addEvntDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			e.addEvntDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			e.addEvntDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(eventdefinitionusecontextvaluecodeableconceptcodingi == eventdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvntDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcodingi == 0) {e.addEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			e.addEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(eventdefinitionusecontextvaluecodeableconceptcodingi == eventdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcodingi == 0) {e.addEvntDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			e.addEvntDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			e.addEvntDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(eventdefinitionusecontextvaluecodeableconceptcodingi == eventdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvntDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** eventdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range eventdefinitionusecontextvaluerange = eventdefinitionusecontext.getValueRange();

		/******************** eventdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluerangelow = eventdefinitionusecontextvaluerange.getLow();

		/******************** EvntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngLwVl("[");}
		if(eventdefinitionusecontextvaluerangelow.hasValue()) {

			e.addEvntDfnUseCntxtVlRngLwVl(String.valueOf(eventdefinitionusecontextvaluerangelow.getValue()));
		} else {
			e.addEvntDfnUseCntxtVlRngLwVl("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngLwVl("]");}


		/******************** eventdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitionusecontextvaluerangelowcomparator = eventdefinitionusecontextvaluerangelow.getComparator();
		if(eventdefinitionusecontextvaluerangelowcomparator!=null) {
		if(eventdefinitionusecontexti == 0) {

		e.addEvntDfnUseCntxtVlRngLwCmprtr("[");		}
			e.addEvntDfnUseCntxtVlRngLwCmprtr(eventdefinitionusecontextvaluerangelowcomparator.toCode());
		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {

		e.addEvntDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			e.addEvntDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** EvntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngLwCd("[");}
		if(eventdefinitionusecontextvaluerangelow.hasCode()) {

			e.addEvntDfnUseCntxtVlRngLwCd(String.valueOf(eventdefinitionusecontextvaluerangelow.getCode()));
		} else {
			e.addEvntDfnUseCntxtVlRngLwCd("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngLwCd("]");}


		/******************** EvntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngLwUnt("[");}
		if(eventdefinitionusecontextvaluerangelow.hasUnit()) {

			e.addEvntDfnUseCntxtVlRngLwUnt(String.valueOf(eventdefinitionusecontextvaluerangelow.getUnit()));
		} else {
			e.addEvntDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngLwUnt("]");}


		/******************** EvntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngLwSys("[");}
		if(eventdefinitionusecontextvaluerangelow.hasSystem()) {

			e.addEvntDfnUseCntxtVlRngLwSys(String.valueOf(eventdefinitionusecontextvaluerangelow.getSystem()));
		} else {
			e.addEvntDfnUseCntxtVlRngLwSys("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngLwSys("]");}


		/******************** eventdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluerangehigh = eventdefinitionusecontextvaluerange.getHigh();

		/******************** EvntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngHiVl("[");}
		if(eventdefinitionusecontextvaluerangehigh.hasValue()) {

			e.addEvntDfnUseCntxtVlRngHiVl(String.valueOf(eventdefinitionusecontextvaluerangehigh.getValue()));
		} else {
			e.addEvntDfnUseCntxtVlRngHiVl("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngHiVl("]");}


		/******************** eventdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitionusecontextvaluerangehighcomparator = eventdefinitionusecontextvaluerangehigh.getComparator();
		if(eventdefinitionusecontextvaluerangehighcomparator!=null) {
		if(eventdefinitionusecontexti == 0) {

		e.addEvntDfnUseCntxtVlRngHiCmprtr("[");		}
			e.addEvntDfnUseCntxtVlRngHiCmprtr(eventdefinitionusecontextvaluerangehighcomparator.toCode());
		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {

		e.addEvntDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			e.addEvntDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** EvntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngHiCd("[");}
		if(eventdefinitionusecontextvaluerangehigh.hasCode()) {

			e.addEvntDfnUseCntxtVlRngHiCd(String.valueOf(eventdefinitionusecontextvaluerangehigh.getCode()));
		} else {
			e.addEvntDfnUseCntxtVlRngHiCd("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngHiCd("]");}


		/******************** EvntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngHiUnt("[");}
		if(eventdefinitionusecontextvaluerangehigh.hasUnit()) {

			e.addEvntDfnUseCntxtVlRngHiUnt(String.valueOf(eventdefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			e.addEvntDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngHiUnt("]");}


		/******************** EvntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlRngHiSys("[");}
		if(eventdefinitionusecontextvaluerangehigh.hasSystem()) {

			e.addEvntDfnUseCntxtVlRngHiSys(String.valueOf(eventdefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			e.addEvntDfnUseCntxtVlRngHiSys("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlRngHiSys("]");}


		/******************** eventdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluequantity = eventdefinitionusecontext.getValueQuantity();

		/******************** EvntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlQntyVl("[");}
		if(eventdefinitionusecontextvaluequantity.hasValue()) {

			e.addEvntDfnUseCntxtVlQntyVl(String.valueOf(eventdefinitionusecontextvaluequantity.getValue()));
		} else {
			e.addEvntDfnUseCntxtVlQntyVl("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlQntyVl("]");}


		/******************** eventdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitionusecontextvaluequantitycomparator = eventdefinitionusecontextvaluequantity.getComparator();
		if(eventdefinitionusecontextvaluequantitycomparator!=null) {
		if(eventdefinitionusecontexti == 0) {

		e.addEvntDfnUseCntxtVlQntyCmprtr("[");		}
			e.addEvntDfnUseCntxtVlQntyCmprtr(eventdefinitionusecontextvaluequantitycomparator.toCode());
		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {

		e.addEvntDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			e.addEvntDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** EvntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlQntyCd("[");}
		if(eventdefinitionusecontextvaluequantity.hasCode()) {

			e.addEvntDfnUseCntxtVlQntyCd(String.valueOf(eventdefinitionusecontextvaluequantity.getCode()));
		} else {
			e.addEvntDfnUseCntxtVlQntyCd("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlQntyCd("]");}


		/******************** EvntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlQntyUnt("[");}
		if(eventdefinitionusecontextvaluequantity.hasUnit()) {

			e.addEvntDfnUseCntxtVlQntyUnt(String.valueOf(eventdefinitionusecontextvaluequantity.getUnit()));
		} else {
			e.addEvntDfnUseCntxtVlQntyUnt("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlQntyUnt("]");}


		/******************** EvntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(eventdefinitionusecontexti == 0) {e.addEvntDfnUseCntxtVlQntySys("[");}
		if(eventdefinitionusecontextvaluequantity.hasSystem()) {

			e.addEvntDfnUseCntxtVlQntySys(String.valueOf(eventdefinitionusecontextvaluequantity.getSystem()));
		} else {
			e.addEvntDfnUseCntxtVlQntySys("NULL");
		}

		if(eventdefinitionusecontexti == eventdefinitionusecontextlist.size()-1) {e.addEvntDfnUseCntxtVlQntySys("]");}


		 };
		/******************** EvntDfn_Exprmtl ********************************************************************************/
		if(eventdefinition.hasExperimental()) {

			e.addEvntDfnExprmtl(String.valueOf(eventdefinition.getExperimental()));
		} else {
			e.addEvntDfnExprmtl("NULL");
		}


		/******************** EvntDfn_Pblshr ********************************************************************************/
		if(eventdefinition.hasPublisher()) {

			e.addEvntDfnPblshr(String.valueOf(eventdefinition.getPublisher()));
		} else {
			e.addEvntDfnPblshr("NULL");
		}


		/******************** eventdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioneffectiveperiod = eventdefinition.getEffectivePeriod();

		/******************** EvntDfn_EfctivePrd_Strt ********************************************************************************/
		if(eventdefinitioneffectiveperiod.hasStart()) {

			e.addEvntDfnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitioneffectiveperiod.getStart())+"\"");
		} else {
			e.addEvntDfnEfctivePrdStrt("NULL");
		}


		/******************** EvntDfn_EfctivePrd_End ********************************************************************************/
		if(eventdefinitioneffectiveperiod.hasEnd()) {

			e.addEvntDfnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitioneffectiveperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnEfctivePrdEnd("NULL");
		}


		/******************** eventdefinitionauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> eventdefinitionauthorlist = eventdefinition.getAuthor();
		for(int eventdefinitionauthori = 0; eventdefinitionauthori<eventdefinitionauthorlist.size();eventdefinitionauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  eventdefinitionauthor = eventdefinitionauthorlist.get(eventdefinitionauthori);

		/******************** EvntDfn_Athr_Nm ********************************************************************************/
		if(eventdefinitionauthori == 0) {e.addEvntDfnAthrNm("[");}
		if(eventdefinitionauthor.hasName()) {

			e.addEvntDfnAthrNm(String.valueOf(eventdefinitionauthor.getName()));
		} else {
			e.addEvntDfnAthrNm("NULL");
		}

		if(eventdefinitionauthori == eventdefinitionauthorlist.size()-1) {e.addEvntDfnAthrNm("]");}


		/******************** eventdefinitionauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> eventdefinitionauthortelecomlist = eventdefinitionauthor.getTelecom();
		for(int eventdefinitionauthortelecomi = 0; eventdefinitionauthortelecomi<eventdefinitionauthortelecomlist.size();eventdefinitionauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  eventdefinitionauthortelecom = eventdefinitionauthortelecomlist.get(eventdefinitionauthortelecomi);

		/******************** EvntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(eventdefinitionauthortelecomi == 0) {e.addEvntDfnAthrTlcmVl("[[");}
		if(eventdefinitionauthortelecom.hasValue()) {

			e.addEvntDfnAthrTlcmVl(String.valueOf(eventdefinitionauthortelecom.getValue()));
		} else {
			e.addEvntDfnAthrTlcmVl("NULL");
		}

		if(eventdefinitionauthortelecomi == eventdefinitionauthortelecomlist.size()-1) {e.addEvntDfnAthrTlcmVl("]]");}


		/******************** eventdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionauthortelecomperiod = eventdefinitionauthortelecom.getPeriod();

		/******************** EvntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitionauthortelecomi == 0) {e.addEvntDfnAthrTlcmPrdStrt("[[");}
		if(eventdefinitionauthortelecomperiod.hasStart()) {

			e.addEvntDfnAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionauthortelecomperiod.getStart())+"\"");
		} else {
			e.addEvntDfnAthrTlcmPrdStrt("NULL");
		}

		if(eventdefinitionauthortelecomi == eventdefinitionauthortelecomlist.size()-1) {e.addEvntDfnAthrTlcmPrdStrt("]]");}


		/******************** EvntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitionauthortelecomi == 0) {e.addEvntDfnAthrTlcmPrdEnd("[[");}
		if(eventdefinitionauthortelecomperiod.hasEnd()) {

			e.addEvntDfnAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(eventdefinitionauthortelecomperiod.getEnd())+"\"");
		} else {
			e.addEvntDfnAthrTlcmPrdEnd("NULL");
		}

		if(eventdefinitionauthortelecomi == eventdefinitionauthortelecomlist.size()-1) {e.addEvntDfnAthrTlcmPrdEnd("]]");}


		/******************** eventdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitionauthortelecomuse = eventdefinitionauthortelecom.getUse();
		if(eventdefinitionauthortelecomuse!=null) {
		if(eventdefinitionauthortelecomi == 0) {

		e.addEvntDfnAthrTlcmUse("[[");		}
			e.addEvntDfnAthrTlcmUse(eventdefinitionauthortelecomuse.toCode());
		if(eventdefinitionauthortelecomi == eventdefinitionauthortelecomlist.size()-1) {

		e.addEvntDfnAthrTlcmUse("]]");		}

		} else {
			e.addEvntDfnAthrTlcmUse("NULL");
		}

		/******************** eventdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitionauthortelecomsystem = eventdefinitionauthortelecom.getSystem();
		if(eventdefinitionauthortelecomsystem!=null) {
		if(eventdefinitionauthortelecomi == 0) {

		e.addEvntDfnAthrTlcmSys("[[");		}
			e.addEvntDfnAthrTlcmSys(eventdefinitionauthortelecomsystem.toCode());
		if(eventdefinitionauthortelecomi == eventdefinitionauthortelecomlist.size()-1) {

		e.addEvntDfnAthrTlcmSys("]]");		}

		} else {
			e.addEvntDfnAthrTlcmSys("NULL");
		}

		/******************** EvntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitionauthortelecomi == 0) {e.addEvntDfnAthrTlcmRnk("[[");}
		if(eventdefinitionauthortelecom.hasRank()) {

			e.addEvntDfnAthrTlcmRnk(String.valueOf(eventdefinitionauthortelecom.getRank()));
		} else {
			e.addEvntDfnAthrTlcmRnk("NULL");
		}

		if(eventdefinitionauthortelecomi == eventdefinitionauthortelecomlist.size()-1) {e.addEvntDfnAthrTlcmRnk("]]");}


		 };
		 };
		return e;
	}
}
