package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Evidence;
public class EvidenceBidirectionalConversion 
{
	public Evidence Evidences(org.hl7.fhir.r4.model.Evidence evidence) throws ParseException
	{
		 main.java.com.campfhir.model.Evidence e = new  main.java.com.campfhir.model.Evidence();

		/******************** id ********************************************************************************/
		e.setId(evidence.getIdElement().getIdPart());

		/******************** Evdnce_Nm ********************************************************************************/
		if(evidence.hasName()) {

			e.addEvdnceNm(String.valueOf(evidence.getName()));
		} else {
			e.addEvdnceNm("NULL");
		}


		/******************** Evdnce_Vrsn ********************************************************************************/
		if(evidence.hasVersion()) {

			e.addEvdnceVrsn(String.valueOf(evidence.getVersion()));
		} else {
			e.addEvdnceVrsn("NULL");
		}


		/******************** Evdnce_Dt ********************************************************************************/
		if(evidence.hasDate()) {

			e.addEvdnceDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidence.getDate())+"\"");
		} else {
			e.addEvdnceDt("NULL");
		}


		/******************** evidencestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus evidencestatus = evidence.getStatus();
		if(evidencestatus!=null) {
			e.addEvdnceSts(evidencestatus.toCode());
		} else {
			e.addEvdnceSts("NULL");
		}

		/******************** Evdnce_Dscrptn ********************************************************************************/
		if(evidence.hasDescription()) {

			e.addEvdnceDscrptn(String.valueOf(evidence.getDescription()));
		} else {
			e.addEvdnceDscrptn("NULL");
		}


		/******************** evidencenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> evidencenotelist = evidence.getNote();
		for(int evidencenotei = 0; evidencenotei<evidencenotelist.size();evidencenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  evidencenote = evidencenotelist.get(evidencenotei);

		/******************** Evdnce_Nt_Time ********************************************************************************/
		if(evidencenotei == 0) {e.addEvdnceNtTime("[");}
		if(evidencenote.hasTime()) {

			e.addEvdnceNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencenote.getTime())+"\"");
		} else {
			e.addEvdnceNtTime("NULL");
		}

		if(evidencenotei == evidencenotelist.size()-1) {e.addEvdnceNtTime("]");}


		/******************** Evdnce_Nt_AthrRfrnc ********************************************************************************/
		if(evidencenotei == 0) {e.addEvdnceNtAthrRfrnc("[");}
		if(evidencenote.hasAuthorReference()) {

			if(evidencenote.getAuthorReference().getReference() != null) {
			e.addEvdnceNtAthrRfrnc(evidencenote.getAuthorReference().getReference());
			}
		} else {
			e.addEvdnceNtAthrRfrnc("NULL");
		}

		if(evidencenotei == evidencenotelist.size()-1) {e.addEvdnceNtAthrRfrnc("]");}


		/******************** Evdnce_Nt_Txt ********************************************************************************/
		if(evidencenotei == 0) {e.addEvdnceNtTxt("[");}
		if(evidencenote.hasText()) {

			e.addEvdnceNtTxt(String.valueOf(evidencenote.getText()));
		} else {
			e.addEvdnceNtTxt("NULL");
		}

		if(evidencenotei == evidencenotelist.size()-1) {e.addEvdnceNtTxt("]");}


		/******************** Evdnce_Nt_AthrStrgTyp ********************************************************************************/
		if(evidencenotei == 0) {e.addEvdnceNtAthrStrgTyp("[");}
		if(evidencenote.hasAuthorStringType()) {

			e.addEvdnceNtAthrStrgTyp("\""+evidencenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			e.addEvdnceNtAthrStrgTyp("NULL");
		}

		if(evidencenotei == evidencenotelist.size()-1) {e.addEvdnceNtAthrStrgTyp("]");}


		 };
		/******************** evidenceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> evidenceidentifierlist = evidence.getIdentifier();
		for(int evidenceidentifieri = 0; evidenceidentifieri<evidenceidentifierlist.size();evidenceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  evidenceidentifier = evidenceidentifierlist.get(evidenceidentifieri);

		/******************** Evdnce_Id_Vl ********************************************************************************/
		if(evidenceidentifieri == 0) {e.addEvdnceIdVl("[");}
		if(evidenceidentifier.hasValue()) {

			e.addEvdnceIdVl(String.valueOf(evidenceidentifier.getValue()));
		} else {
			e.addEvdnceIdVl("NULL");
		}

		if(evidenceidentifieri == evidenceidentifierlist.size()-1) {e.addEvdnceIdVl("]");}


		/******************** evidenceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidenceidentifiertype = evidenceidentifier.getType();

		/******************** Evdnce_Id_Typ_Txt ********************************************************************************/
		if(evidenceidentifieri == 0) {e.addEvdnceIdTypTxt("[");}
		if(evidenceidentifiertype.hasText()) {

			e.addEvdnceIdTypTxt(String.valueOf(evidenceidentifiertype.getText()));
		} else {
			e.addEvdnceIdTypTxt("NULL");
		}

		if(evidenceidentifieri == evidenceidentifierlist.size()-1) {e.addEvdnceIdTypTxt("]");}


		/******************** evidenceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidenceidentifiertypecodinglist = evidenceidentifiertype.getCoding();
		for(int evidenceidentifiertypecodingi = 0; evidenceidentifiertypecodingi<evidenceidentifiertypecodinglist.size();evidenceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidenceidentifiertypecoding = evidenceidentifiertypecodinglist.get(evidenceidentifiertypecodingi);

		/******************** Evdnce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(evidenceidentifiertypecodingi == 0) {e.addEvdnceIdTypCdgDsply("[[");}
		if(evidenceidentifiertypecoding.hasDisplay()) {

			e.addEvdnceIdTypCdgDsply(String.valueOf(evidenceidentifiertypecoding.getDisplay()));
		} else {
			e.addEvdnceIdTypCdgDsply("NULL");
		}

		if(evidenceidentifiertypecodingi == evidenceidentifiertypecodinglist.size()-1) {e.addEvdnceIdTypCdgDsply("]]");}


		/******************** Evdnce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(evidenceidentifiertypecodingi == 0) {e.addEvdnceIdTypCdgVrsn("[[");}
		if(evidenceidentifiertypecoding.hasVersion()) {

			e.addEvdnceIdTypCdgVrsn(String.valueOf(evidenceidentifiertypecoding.getVersion()));
		} else {
			e.addEvdnceIdTypCdgVrsn("NULL");
		}

		if(evidenceidentifiertypecodingi == evidenceidentifiertypecodinglist.size()-1) {e.addEvdnceIdTypCdgVrsn("]]");}


		/******************** Evdnce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(evidenceidentifiertypecodingi == 0) {e.addEvdnceIdTypCdgCd("[[");}
		if(evidenceidentifiertypecoding.hasCode()) {

			e.addEvdnceIdTypCdgCd(String.valueOf(evidenceidentifiertypecoding.getCode()));
		} else {
			e.addEvdnceIdTypCdgCd("NULL");
		}

		if(evidenceidentifiertypecodingi == evidenceidentifiertypecodinglist.size()-1) {e.addEvdnceIdTypCdgCd("]]");}


		/******************** Evdnce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(evidenceidentifiertypecodingi == 0) {e.addEvdnceIdTypCdgUsrSltd("[[");}
		if(evidenceidentifiertypecoding.hasUserSelected()) {

			e.addEvdnceIdTypCdgUsrSltd(String.valueOf(evidenceidentifiertypecoding.getUserSelected()));
		} else {
			e.addEvdnceIdTypCdgUsrSltd("NULL");
		}

		if(evidenceidentifiertypecodingi == evidenceidentifiertypecodinglist.size()-1) {e.addEvdnceIdTypCdgUsrSltd("]]");}


		/******************** Evdnce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(evidenceidentifiertypecodingi == 0) {e.addEvdnceIdTypCdgSys("[[");}
		if(evidenceidentifiertypecoding.hasSystem()) {

			e.addEvdnceIdTypCdgSys(String.valueOf(evidenceidentifiertypecoding.getSystem()));
		} else {
			e.addEvdnceIdTypCdgSys("NULL");
		}

		if(evidenceidentifiertypecodingi == evidenceidentifiertypecodinglist.size()-1) {e.addEvdnceIdTypCdgSys("]]");}


		 };
		/******************** evidenceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceidentifierperiod = evidenceidentifier.getPeriod();

		/******************** Evdnce_Id_Prd_Strt ********************************************************************************/
		if(evidenceidentifieri == 0) {e.addEvdnceIdPrdStrt("[");}
		if(evidenceidentifierperiod.hasStart()) {

			e.addEvdnceIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceidentifierperiod.getStart())+"\"");
		} else {
			e.addEvdnceIdPrdStrt("NULL");
		}

		if(evidenceidentifieri == evidenceidentifierlist.size()-1) {e.addEvdnceIdPrdStrt("]");}


		/******************** Evdnce_Id_Prd_End ********************************************************************************/
		if(evidenceidentifieri == 0) {e.addEvdnceIdPrdEnd("[");}
		if(evidenceidentifierperiod.hasEnd()) {

			e.addEvdnceIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceidentifierperiod.getEnd())+"\"");
		} else {
			e.addEvdnceIdPrdEnd("NULL");
		}

		if(evidenceidentifieri == evidenceidentifierlist.size()-1) {e.addEvdnceIdPrdEnd("]");}


		/******************** evidenceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse evidenceidentifieruse = evidenceidentifier.getUse();
		if(evidenceidentifieruse!=null) {
		if(evidenceidentifieri == 0) {

		e.addEvdnceIdUse("[");		}
			e.addEvdnceIdUse(evidenceidentifieruse.toCode());
		if(evidenceidentifieri == evidenceidentifierlist.size()-1) {

		e.addEvdnceIdUse("]");		}

		} else {
			e.addEvdnceIdUse("NULL");
		}

		/******************** Evdnce_Id_Assigner ********************************************************************************/
		if(evidenceidentifieri == 0) {e.addEvdnceIdAssigner("[");}
		if(evidenceidentifier.hasAssigner()) {

			if(evidenceidentifier.getAssigner().getReference() != null) {
			e.addEvdnceIdAssigner(evidenceidentifier.getAssigner().getReference());
			}
		} else {
			e.addEvdnceIdAssigner("NULL");
		}

		if(evidenceidentifieri == evidenceidentifierlist.size()-1) {e.addEvdnceIdAssigner("]");}


		/******************** Evdnce_Id_Sys ********************************************************************************/
		if(evidenceidentifieri == 0) {e.addEvdnceIdSys("[");}
		if(evidenceidentifier.hasSystem()) {

			e.addEvdnceIdSys(String.valueOf(evidenceidentifier.getSystem()));
		} else {
			e.addEvdnceIdSys("NULL");
		}

		if(evidenceidentifieri == evidenceidentifierlist.size()-1) {e.addEvdnceIdSys("]");}


		 };
		/******************** Evdnce_Outcome ********************************************************************************/
		if(evidence.hasOutcome()) {

			String  array = "[";
			for(int incr=0; incr<evidence.getOutcome().size(); incr++) {
				array = array + evidence.getOutcome().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceOutcome(array);

		} else {
			e.addEvdnceOutcome("NULL");
		}


		/******************** evidencecontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidencecontactlist = evidence.getContact();
		for(int evidencecontacti = 0; evidencecontacti<evidencecontactlist.size();evidencecontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidencecontact = evidencecontactlist.get(evidencecontacti);

		/******************** Evdnce_Cntct_Nm ********************************************************************************/
		if(evidencecontacti == 0) {e.addEvdnceCntctNm("[");}
		if(evidencecontact.hasName()) {

			e.addEvdnceCntctNm(String.valueOf(evidencecontact.getName()));
		} else {
			e.addEvdnceCntctNm("NULL");
		}

		if(evidencecontacti == evidencecontactlist.size()-1) {e.addEvdnceCntctNm("]");}


		/******************** evidencecontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidencecontacttelecomlist = evidencecontact.getTelecom();
		for(int evidencecontacttelecomi = 0; evidencecontacttelecomi<evidencecontacttelecomlist.size();evidencecontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidencecontacttelecom = evidencecontacttelecomlist.get(evidencecontacttelecomi);

		/******************** Evdnce_Cntct_Tlcm_Vl ********************************************************************************/
		if(evidencecontacttelecomi == 0) {e.addEvdnceCntctTlcmVl("[[");}
		if(evidencecontacttelecom.hasValue()) {

			e.addEvdnceCntctTlcmVl(String.valueOf(evidencecontacttelecom.getValue()));
		} else {
			e.addEvdnceCntctTlcmVl("NULL");
		}

		if(evidencecontacttelecomi == evidencecontacttelecomlist.size()-1) {e.addEvdnceCntctTlcmVl("]]");}


		/******************** evidencecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencecontacttelecomperiod = evidencecontacttelecom.getPeriod();

		/******************** Evdnce_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencecontacttelecomi == 0) {e.addEvdnceCntctTlcmPrdStrt("[[");}
		if(evidencecontacttelecomperiod.hasStart()) {

			e.addEvdnceCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencecontacttelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceCntctTlcmPrdStrt("NULL");
		}

		if(evidencecontacttelecomi == evidencecontacttelecomlist.size()-1) {e.addEvdnceCntctTlcmPrdStrt("]]");}


		/******************** Evdnce_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(evidencecontacttelecomi == 0) {e.addEvdnceCntctTlcmPrdEnd("[[");}
		if(evidencecontacttelecomperiod.hasEnd()) {

			e.addEvdnceCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencecontacttelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceCntctTlcmPrdEnd("NULL");
		}

		if(evidencecontacttelecomi == evidencecontacttelecomlist.size()-1) {e.addEvdnceCntctTlcmPrdEnd("]]");}


		/******************** evidencecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencecontacttelecomuse = evidencecontacttelecom.getUse();
		if(evidencecontacttelecomuse!=null) {
		if(evidencecontacttelecomi == 0) {

		e.addEvdnceCntctTlcmUse("[[");		}
			e.addEvdnceCntctTlcmUse(evidencecontacttelecomuse.toCode());
		if(evidencecontacttelecomi == evidencecontacttelecomlist.size()-1) {

		e.addEvdnceCntctTlcmUse("]]");		}

		} else {
			e.addEvdnceCntctTlcmUse("NULL");
		}

		/******************** evidencecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencecontacttelecomsystem = evidencecontacttelecom.getSystem();
		if(evidencecontacttelecomsystem!=null) {
		if(evidencecontacttelecomi == 0) {

		e.addEvdnceCntctTlcmSys("[[");		}
			e.addEvdnceCntctTlcmSys(evidencecontacttelecomsystem.toCode());
		if(evidencecontacttelecomi == evidencecontacttelecomlist.size()-1) {

		e.addEvdnceCntctTlcmSys("]]");		}

		} else {
			e.addEvdnceCntctTlcmSys("NULL");
		}

		/******************** Evdnce_Cntct_Tlcm_Rnk ********************************************************************************/
		if(evidencecontacttelecomi == 0) {e.addEvdnceCntctTlcmRnk("[[");}
		if(evidencecontacttelecom.hasRank()) {

			e.addEvdnceCntctTlcmRnk(String.valueOf(evidencecontacttelecom.getRank()));
		} else {
			e.addEvdnceCntctTlcmRnk("NULL");
		}

		if(evidencecontacttelecomi == evidencecontacttelecomlist.size()-1) {e.addEvdnceCntctTlcmRnk("]]");}


		 };
		 };
		/******************** Evdnce_Copyright ********************************************************************************/
		if(evidence.hasCopyright()) {

			e.addEvdnceCopyright(String.valueOf(evidence.getCopyright()));
		} else {
			e.addEvdnceCopyright("NULL");
		}


		/******************** Evdnce_ApprovalDt ********************************************************************************/
		if(evidence.hasApprovalDate()) {

			e.addEvdnceApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidence.getApprovalDate())+"\"");
		} else {
			e.addEvdnceApprovalDt("NULL");
		}


		/******************** evidenceendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidenceendorserlist = evidence.getEndorser();
		for(int evidenceendorseri = 0; evidenceendorseri<evidenceendorserlist.size();evidenceendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidenceendorser = evidenceendorserlist.get(evidenceendorseri);

		/******************** Evdnce_Endsr_Nm ********************************************************************************/
		if(evidenceendorseri == 0) {e.addEvdnceEndsrNm("[");}
		if(evidenceendorser.hasName()) {

			e.addEvdnceEndsrNm(String.valueOf(evidenceendorser.getName()));
		} else {
			e.addEvdnceEndsrNm("NULL");
		}

		if(evidenceendorseri == evidenceendorserlist.size()-1) {e.addEvdnceEndsrNm("]");}


		/******************** evidenceendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidenceendorsertelecomlist = evidenceendorser.getTelecom();
		for(int evidenceendorsertelecomi = 0; evidenceendorsertelecomi<evidenceendorsertelecomlist.size();evidenceendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidenceendorsertelecom = evidenceendorsertelecomlist.get(evidenceendorsertelecomi);

		/******************** Evdnce_Endsr_Tlcm_Vl ********************************************************************************/
		if(evidenceendorsertelecomi == 0) {e.addEvdnceEndsrTlcmVl("[[");}
		if(evidenceendorsertelecom.hasValue()) {

			e.addEvdnceEndsrTlcmVl(String.valueOf(evidenceendorsertelecom.getValue()));
		} else {
			e.addEvdnceEndsrTlcmVl("NULL");
		}

		if(evidenceendorsertelecomi == evidenceendorsertelecomlist.size()-1) {e.addEvdnceEndsrTlcmVl("]]");}


		/******************** evidenceendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceendorsertelecomperiod = evidenceendorsertelecom.getPeriod();

		/******************** Evdnce_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidenceendorsertelecomi == 0) {e.addEvdnceEndsrTlcmPrdStrt("[[");}
		if(evidenceendorsertelecomperiod.hasStart()) {

			e.addEvdnceEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceendorsertelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceEndsrTlcmPrdStrt("NULL");
		}

		if(evidenceendorsertelecomi == evidenceendorsertelecomlist.size()-1) {e.addEvdnceEndsrTlcmPrdStrt("]]");}


		/******************** Evdnce_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(evidenceendorsertelecomi == 0) {e.addEvdnceEndsrTlcmPrdEnd("[[");}
		if(evidenceendorsertelecomperiod.hasEnd()) {

			e.addEvdnceEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceendorsertelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceEndsrTlcmPrdEnd("NULL");
		}

		if(evidenceendorsertelecomi == evidenceendorsertelecomlist.size()-1) {e.addEvdnceEndsrTlcmPrdEnd("]]");}


		/******************** evidenceendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidenceendorsertelecomuse = evidenceendorsertelecom.getUse();
		if(evidenceendorsertelecomuse!=null) {
		if(evidenceendorsertelecomi == 0) {

		e.addEvdnceEndsrTlcmUse("[[");		}
			e.addEvdnceEndsrTlcmUse(evidenceendorsertelecomuse.toCode());
		if(evidenceendorsertelecomi == evidenceendorsertelecomlist.size()-1) {

		e.addEvdnceEndsrTlcmUse("]]");		}

		} else {
			e.addEvdnceEndsrTlcmUse("NULL");
		}

		/******************** evidenceendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidenceendorsertelecomsystem = evidenceendorsertelecom.getSystem();
		if(evidenceendorsertelecomsystem!=null) {
		if(evidenceendorsertelecomi == 0) {

		e.addEvdnceEndsrTlcmSys("[[");		}
			e.addEvdnceEndsrTlcmSys(evidenceendorsertelecomsystem.toCode());
		if(evidenceendorsertelecomi == evidenceendorsertelecomlist.size()-1) {

		e.addEvdnceEndsrTlcmSys("]]");		}

		} else {
			e.addEvdnceEndsrTlcmSys("NULL");
		}

		/******************** Evdnce_Endsr_Tlcm_Rnk ********************************************************************************/
		if(evidenceendorsertelecomi == 0) {e.addEvdnceEndsrTlcmRnk("[[");}
		if(evidenceendorsertelecom.hasRank()) {

			e.addEvdnceEndsrTlcmRnk(String.valueOf(evidenceendorsertelecom.getRank()));
		} else {
			e.addEvdnceEndsrTlcmRnk("NULL");
		}

		if(evidenceendorsertelecomi == evidenceendorsertelecomlist.size()-1) {e.addEvdnceEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** Evdnce_LastReviewDt ********************************************************************************/
		if(evidence.hasLastReviewDate()) {

			e.addEvdnceLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidence.getLastReviewDate())+"\"");
		} else {
			e.addEvdnceLastReviewDt("NULL");
		}


		/******************** evidenceeditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidenceeditorlist = evidence.getEditor();
		for(int evidenceeditori = 0; evidenceeditori<evidenceeditorlist.size();evidenceeditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidenceeditor = evidenceeditorlist.get(evidenceeditori);

		/******************** Evdnce_Editor_Nm ********************************************************************************/
		if(evidenceeditori == 0) {e.addEvdnceEditorNm("[");}
		if(evidenceeditor.hasName()) {

			e.addEvdnceEditorNm(String.valueOf(evidenceeditor.getName()));
		} else {
			e.addEvdnceEditorNm("NULL");
		}

		if(evidenceeditori == evidenceeditorlist.size()-1) {e.addEvdnceEditorNm("]");}


		/******************** evidenceeditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidenceeditortelecomlist = evidenceeditor.getTelecom();
		for(int evidenceeditortelecomi = 0; evidenceeditortelecomi<evidenceeditortelecomlist.size();evidenceeditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidenceeditortelecom = evidenceeditortelecomlist.get(evidenceeditortelecomi);

		/******************** Evdnce_Editor_Tlcm_Vl ********************************************************************************/
		if(evidenceeditortelecomi == 0) {e.addEvdnceEditorTlcmVl("[[");}
		if(evidenceeditortelecom.hasValue()) {

			e.addEvdnceEditorTlcmVl(String.valueOf(evidenceeditortelecom.getValue()));
		} else {
			e.addEvdnceEditorTlcmVl("NULL");
		}

		if(evidenceeditortelecomi == evidenceeditortelecomlist.size()-1) {e.addEvdnceEditorTlcmVl("]]");}


		/******************** evidenceeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceeditortelecomperiod = evidenceeditortelecom.getPeriod();

		/******************** Evdnce_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(evidenceeditortelecomi == 0) {e.addEvdnceEditorTlcmPrdStrt("[[");}
		if(evidenceeditortelecomperiod.hasStart()) {

			e.addEvdnceEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceeditortelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceEditorTlcmPrdStrt("NULL");
		}

		if(evidenceeditortelecomi == evidenceeditortelecomlist.size()-1) {e.addEvdnceEditorTlcmPrdStrt("]]");}


		/******************** Evdnce_Editor_Tlcm_Prd_End ********************************************************************************/
		if(evidenceeditortelecomi == 0) {e.addEvdnceEditorTlcmPrdEnd("[[");}
		if(evidenceeditortelecomperiod.hasEnd()) {

			e.addEvdnceEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceeditortelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceEditorTlcmPrdEnd("NULL");
		}

		if(evidenceeditortelecomi == evidenceeditortelecomlist.size()-1) {e.addEvdnceEditorTlcmPrdEnd("]]");}


		/******************** evidenceeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidenceeditortelecomuse = evidenceeditortelecom.getUse();
		if(evidenceeditortelecomuse!=null) {
		if(evidenceeditortelecomi == 0) {

		e.addEvdnceEditorTlcmUse("[[");		}
			e.addEvdnceEditorTlcmUse(evidenceeditortelecomuse.toCode());
		if(evidenceeditortelecomi == evidenceeditortelecomlist.size()-1) {

		e.addEvdnceEditorTlcmUse("]]");		}

		} else {
			e.addEvdnceEditorTlcmUse("NULL");
		}

		/******************** evidenceeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidenceeditortelecomsystem = evidenceeditortelecom.getSystem();
		if(evidenceeditortelecomsystem!=null) {
		if(evidenceeditortelecomi == 0) {

		e.addEvdnceEditorTlcmSys("[[");		}
			e.addEvdnceEditorTlcmSys(evidenceeditortelecomsystem.toCode());
		if(evidenceeditortelecomi == evidenceeditortelecomlist.size()-1) {

		e.addEvdnceEditorTlcmSys("]]");		}

		} else {
			e.addEvdnceEditorTlcmSys("NULL");
		}

		/******************** Evdnce_Editor_Tlcm_Rnk ********************************************************************************/
		if(evidenceeditortelecomi == 0) {e.addEvdnceEditorTlcmRnk("[[");}
		if(evidenceeditortelecom.hasRank()) {

			e.addEvdnceEditorTlcmRnk(String.valueOf(evidenceeditortelecom.getRank()));
		} else {
			e.addEvdnceEditorTlcmRnk("NULL");
		}

		if(evidenceeditortelecomi == evidenceeditortelecomlist.size()-1) {e.addEvdnceEditorTlcmRnk("]]");}


		 };
		 };
		/******************** evidencereviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidencereviewerlist = evidence.getReviewer();
		for(int evidencerevieweri = 0; evidencerevieweri<evidencereviewerlist.size();evidencerevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidencereviewer = evidencereviewerlist.get(evidencerevieweri);

		/******************** Evdnce_Rviewr_Nm ********************************************************************************/
		if(evidencerevieweri == 0) {e.addEvdnceRviewrNm("[");}
		if(evidencereviewer.hasName()) {

			e.addEvdnceRviewrNm(String.valueOf(evidencereviewer.getName()));
		} else {
			e.addEvdnceRviewrNm("NULL");
		}

		if(evidencerevieweri == evidencereviewerlist.size()-1) {e.addEvdnceRviewrNm("]");}


		/******************** evidencereviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidencereviewertelecomlist = evidencereviewer.getTelecom();
		for(int evidencereviewertelecomi = 0; evidencereviewertelecomi<evidencereviewertelecomlist.size();evidencereviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidencereviewertelecom = evidencereviewertelecomlist.get(evidencereviewertelecomi);

		/******************** Evdnce_Rviewr_Tlcm_Vl ********************************************************************************/
		if(evidencereviewertelecomi == 0) {e.addEvdnceRviewrTlcmVl("[[");}
		if(evidencereviewertelecom.hasValue()) {

			e.addEvdnceRviewrTlcmVl(String.valueOf(evidencereviewertelecom.getValue()));
		} else {
			e.addEvdnceRviewrTlcmVl("NULL");
		}

		if(evidencereviewertelecomi == evidencereviewertelecomlist.size()-1) {e.addEvdnceRviewrTlcmVl("]]");}


		/******************** evidencereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencereviewertelecomperiod = evidencereviewertelecom.getPeriod();

		/******************** Evdnce_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencereviewertelecomi == 0) {e.addEvdnceRviewrTlcmPrdStrt("[[");}
		if(evidencereviewertelecomperiod.hasStart()) {

			e.addEvdnceRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencereviewertelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceRviewrTlcmPrdStrt("NULL");
		}

		if(evidencereviewertelecomi == evidencereviewertelecomlist.size()-1) {e.addEvdnceRviewrTlcmPrdStrt("]]");}


		/******************** Evdnce_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(evidencereviewertelecomi == 0) {e.addEvdnceRviewrTlcmPrdEnd("[[");}
		if(evidencereviewertelecomperiod.hasEnd()) {

			e.addEvdnceRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencereviewertelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceRviewrTlcmPrdEnd("NULL");
		}

		if(evidencereviewertelecomi == evidencereviewertelecomlist.size()-1) {e.addEvdnceRviewrTlcmPrdEnd("]]");}


		/******************** evidencereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencereviewertelecomuse = evidencereviewertelecom.getUse();
		if(evidencereviewertelecomuse!=null) {
		if(evidencereviewertelecomi == 0) {

		e.addEvdnceRviewrTlcmUse("[[");		}
			e.addEvdnceRviewrTlcmUse(evidencereviewertelecomuse.toCode());
		if(evidencereviewertelecomi == evidencereviewertelecomlist.size()-1) {

		e.addEvdnceRviewrTlcmUse("]]");		}

		} else {
			e.addEvdnceRviewrTlcmUse("NULL");
		}

		/******************** evidencereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencereviewertelecomsystem = evidencereviewertelecom.getSystem();
		if(evidencereviewertelecomsystem!=null) {
		if(evidencereviewertelecomi == 0) {

		e.addEvdnceRviewrTlcmSys("[[");		}
			e.addEvdnceRviewrTlcmSys(evidencereviewertelecomsystem.toCode());
		if(evidencereviewertelecomi == evidencereviewertelecomlist.size()-1) {

		e.addEvdnceRviewrTlcmSys("]]");		}

		} else {
			e.addEvdnceRviewrTlcmSys("NULL");
		}

		/******************** Evdnce_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(evidencereviewertelecomi == 0) {e.addEvdnceRviewrTlcmRnk("[[");}
		if(evidencereviewertelecom.hasRank()) {

			e.addEvdnceRviewrTlcmRnk(String.valueOf(evidencereviewertelecom.getRank()));
		} else {
			e.addEvdnceRviewrTlcmRnk("NULL");
		}

		if(evidencereviewertelecomi == evidencereviewertelecomlist.size()-1) {e.addEvdnceRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** Evdnce_ExposureBackground ********************************************************************************/
		if(evidence.hasExposureBackground()) {

			if(evidence.getExposureBackground().getReference() != null) {
			e.addEvdnceExposureBackground(evidence.getExposureBackground().getReference());
			}
		} else {
			e.addEvdnceExposureBackground("NULL");
		}


		/******************** Evdnce_Ttl ********************************************************************************/
		if(evidence.hasTitle()) {

			e.addEvdnceTtl(String.valueOf(evidence.getTitle()));
		} else {
			e.addEvdnceTtl("NULL");
		}


		/******************** evidencerelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> evidencerelatedartifactlist = evidence.getRelatedArtifact();
		for(int evidencerelatedartifacti = 0; evidencerelatedartifacti<evidencerelatedartifactlist.size();evidencerelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  evidencerelatedartifact = evidencerelatedartifactlist.get(evidencerelatedartifacti);

		/******************** Evdnce_RltedArtfct_Rsrc ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctRsrc("[");}
		if(evidencerelatedartifact.hasResource()) {

			e.addEvdnceRltedArtfctRsrc(String.valueOf(evidencerelatedartifact.getResource()));
		} else {
			e.addEvdnceRltedArtfctRsrc("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctRsrc("]");}


		/******************** evidencerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType evidencerelatedartifacttype = evidencerelatedartifact.getType();
		if(evidencerelatedartifacttype!=null) {
		if(evidencerelatedartifacti == 0) {

		e.addEvdnceRltedArtfctTyp("[");		}
			e.addEvdnceRltedArtfctTyp(evidencerelatedartifacttype.toCode());
		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {

		e.addEvdnceRltedArtfctTyp("]");		}

		} else {
			e.addEvdnceRltedArtfctTyp("NULL");
		}

		/******************** Evdnce_RltedArtfct_Url ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctUrl("[");}
		if(evidencerelatedartifact.hasUrl()) {

			e.addEvdnceRltedArtfctUrl(String.valueOf(evidencerelatedartifact.getUrl()));
		} else {
			e.addEvdnceRltedArtfctUrl("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctUrl("]");}


		/******************** Evdnce_RltedArtfct_Citation ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctCitation("[");}
		if(evidencerelatedartifact.hasCitation()) {

			e.addEvdnceRltedArtfctCitation(String.valueOf(evidencerelatedartifact.getCitation()));
		} else {
			e.addEvdnceRltedArtfctCitation("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctCitation("]");}


		/******************** Evdnce_RltedArtfct_Lbl ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctLbl("[");}
		if(evidencerelatedartifact.hasLabel()) {

			e.addEvdnceRltedArtfctLbl(String.valueOf(evidencerelatedartifact.getLabel()));
		} else {
			e.addEvdnceRltedArtfctLbl("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctLbl("]");}


		/******************** evidencerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment evidencerelatedartifactdocument = evidencerelatedartifact.getDocument();

		/******************** Evdnce_RltedArtfct_Doc_Sz ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocSz("[");}
		if(evidencerelatedartifactdocument.hasSize()) {

			e.addEvdnceRltedArtfctDocSz(String.valueOf(evidencerelatedartifactdocument.getSize()));
		} else {
			e.addEvdnceRltedArtfctDocSz("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocSz("]");}


		/******************** Evdnce_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocLnguage("[");}
		if(evidencerelatedartifactdocument.hasLanguage()) {

			e.addEvdnceRltedArtfctDocLnguage(String.valueOf(evidencerelatedartifactdocument.getLanguage()));
		} else {
			e.addEvdnceRltedArtfctDocLnguage("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocLnguage("]");}


		/******************** Evdnce_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocCntntTyp("[");}
		if(evidencerelatedartifactdocument.hasContentType()) {

			e.addEvdnceRltedArtfctDocCntntTyp(String.valueOf(evidencerelatedartifactdocument.getContentType()));
		} else {
			e.addEvdnceRltedArtfctDocCntntTyp("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocCntntTyp("]");}


		/******************** Evdnce_RltedArtfct_Doc_Hash ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocHash("[");}
		if(evidencerelatedartifactdocument.hasHash()) {

			e.addEvdnceRltedArtfctDocHash(new String(evidencerelatedartifactdocument.getHash()));
		} else {
			e.addEvdnceRltedArtfctDocHash("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocHash("]");}


		/******************** Evdnce_RltedArtfct_Doc_Data ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocData("[");}
		if(evidencerelatedartifactdocument.hasData()) {

			e.addEvdnceRltedArtfctDocData(new String(evidencerelatedartifactdocument.getData()));
		} else {
			e.addEvdnceRltedArtfctDocData("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocData("]");}


		/******************** Evdnce_RltedArtfct_Doc_Creation ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocCreation("[");}
		if(evidencerelatedartifactdocument.hasCreation()) {

			e.addEvdnceRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencerelatedartifactdocument.getCreation())+"\"");
		} else {
			e.addEvdnceRltedArtfctDocCreation("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocCreation("]");}


		/******************** Evdnce_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocTtl("[");}
		if(evidencerelatedartifactdocument.hasTitle()) {

			e.addEvdnceRltedArtfctDocTtl(String.valueOf(evidencerelatedartifactdocument.getTitle()));
		} else {
			e.addEvdnceRltedArtfctDocTtl("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocTtl("]");}


		/******************** Evdnce_RltedArtfct_Doc_Url ********************************************************************************/
		if(evidencerelatedartifacti == 0) {e.addEvdnceRltedArtfctDocUrl("[");}
		if(evidencerelatedartifactdocument.hasUrl()) {

			e.addEvdnceRltedArtfctDocUrl(String.valueOf(evidencerelatedartifactdocument.getUrl()));
		} else {
			e.addEvdnceRltedArtfctDocUrl("NULL");
		}

		if(evidencerelatedartifacti == evidencerelatedartifactlist.size()-1) {e.addEvdnceRltedArtfctDocUrl("]");}


		 };
		/******************** Evdnce_Url ********************************************************************************/
		if(evidence.hasUrl()) {

			e.addEvdnceUrl(String.valueOf(evidence.getUrl()));
		} else {
			e.addEvdnceUrl("NULL");
		}


		/******************** Evdnce_ExposureVariant ********************************************************************************/
		if(evidence.hasExposureVariant()) {

			String  array = "[";
			for(int incr=0; incr<evidence.getExposureVariant().size(); incr++) {
				array = array + evidence.getExposureVariant().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceExposureVariant(array);

		} else {
			e.addEvdnceExposureVariant("NULL");
		}


		/******************** Evdnce_ShortTtl ********************************************************************************/
		if(evidence.hasShortTitle()) {

			e.addEvdnceShortTtl(String.valueOf(evidence.getShortTitle()));
		} else {
			e.addEvdnceShortTtl("NULL");
		}


		/******************** Evdnce_Subtitle ********************************************************************************/
		if(evidence.hasSubtitle()) {

			e.addEvdnceSubtitle(String.valueOf(evidence.getSubtitle()));
		} else {
			e.addEvdnceSubtitle("NULL");
		}


		/******************** evidencetopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> evidencetopiclist = evidence.getTopic();
		for(int evidencetopici = 0; evidencetopici<evidencetopiclist.size();evidencetopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  evidencetopic = evidencetopiclist.get(evidencetopici);

		/******************** Evdnce_Topic_Txt ********************************************************************************/
		if(evidencetopici == 0) {e.addEvdnceTopicTxt("[");}
		if(evidencetopic.hasText()) {

			e.addEvdnceTopicTxt(String.valueOf(evidencetopic.getText()));
		} else {
			e.addEvdnceTopicTxt("NULL");
		}

		if(evidencetopici == evidencetopiclist.size()-1) {e.addEvdnceTopicTxt("]");}


		/******************** evidencetopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencetopiccodinglist = evidencetopic.getCoding();
		for(int evidencetopiccodingi = 0; evidencetopiccodingi<evidencetopiccodinglist.size();evidencetopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencetopiccoding = evidencetopiccodinglist.get(evidencetopiccodingi);

		/******************** Evdnce_Topic_Cdg_Dsply ********************************************************************************/
		if(evidencetopiccodingi == 0) {e.addEvdnceTopicCdgDsply("[[");}
		if(evidencetopiccoding.hasDisplay()) {

			e.addEvdnceTopicCdgDsply(String.valueOf(evidencetopiccoding.getDisplay()));
		} else {
			e.addEvdnceTopicCdgDsply("NULL");
		}

		if(evidencetopiccodingi == evidencetopiccodinglist.size()-1) {e.addEvdnceTopicCdgDsply("]]");}


		/******************** Evdnce_Topic_Cdg_Vrsn ********************************************************************************/
		if(evidencetopiccodingi == 0) {e.addEvdnceTopicCdgVrsn("[[");}
		if(evidencetopiccoding.hasVersion()) {

			e.addEvdnceTopicCdgVrsn(String.valueOf(evidencetopiccoding.getVersion()));
		} else {
			e.addEvdnceTopicCdgVrsn("NULL");
		}

		if(evidencetopiccodingi == evidencetopiccodinglist.size()-1) {e.addEvdnceTopicCdgVrsn("]]");}


		/******************** Evdnce_Topic_Cdg_Cd ********************************************************************************/
		if(evidencetopiccodingi == 0) {e.addEvdnceTopicCdgCd("[[");}
		if(evidencetopiccoding.hasCode()) {

			e.addEvdnceTopicCdgCd(String.valueOf(evidencetopiccoding.getCode()));
		} else {
			e.addEvdnceTopicCdgCd("NULL");
		}

		if(evidencetopiccodingi == evidencetopiccodinglist.size()-1) {e.addEvdnceTopicCdgCd("]]");}


		/******************** Evdnce_Topic_Cdg_UsrSltd ********************************************************************************/
		if(evidencetopiccodingi == 0) {e.addEvdnceTopicCdgUsrSltd("[[");}
		if(evidencetopiccoding.hasUserSelected()) {

			e.addEvdnceTopicCdgUsrSltd(String.valueOf(evidencetopiccoding.getUserSelected()));
		} else {
			e.addEvdnceTopicCdgUsrSltd("NULL");
		}

		if(evidencetopiccodingi == evidencetopiccodinglist.size()-1) {e.addEvdnceTopicCdgUsrSltd("]]");}


		/******************** Evdnce_Topic_Cdg_Sys ********************************************************************************/
		if(evidencetopiccodingi == 0) {e.addEvdnceTopicCdgSys("[[");}
		if(evidencetopiccoding.hasSystem()) {

			e.addEvdnceTopicCdgSys(String.valueOf(evidencetopiccoding.getSystem()));
		} else {
			e.addEvdnceTopicCdgSys("NULL");
		}

		if(evidencetopiccodingi == evidencetopiccodinglist.size()-1) {e.addEvdnceTopicCdgSys("]]");}


		 };
		 };
		/******************** evidencejurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> evidencejurisdictionlist = evidence.getJurisdiction();
		for(int evidencejurisdictioni = 0; evidencejurisdictioni<evidencejurisdictionlist.size();evidencejurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  evidencejurisdiction = evidencejurisdictionlist.get(evidencejurisdictioni);

		/******************** Evdnce_Jrsdctn_Txt ********************************************************************************/
		if(evidencejurisdictioni == 0) {e.addEvdnceJrsdctnTxt("[");}
		if(evidencejurisdiction.hasText()) {

			e.addEvdnceJrsdctnTxt(String.valueOf(evidencejurisdiction.getText()));
		} else {
			e.addEvdnceJrsdctnTxt("NULL");
		}

		if(evidencejurisdictioni == evidencejurisdictionlist.size()-1) {e.addEvdnceJrsdctnTxt("]");}


		/******************** evidencejurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencejurisdictioncodinglist = evidencejurisdiction.getCoding();
		for(int evidencejurisdictioncodingi = 0; evidencejurisdictioncodingi<evidencejurisdictioncodinglist.size();evidencejurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencejurisdictioncoding = evidencejurisdictioncodinglist.get(evidencejurisdictioncodingi);

		/******************** Evdnce_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(evidencejurisdictioncodingi == 0) {e.addEvdnceJrsdctnCdgDsply("[[");}
		if(evidencejurisdictioncoding.hasDisplay()) {

			e.addEvdnceJrsdctnCdgDsply(String.valueOf(evidencejurisdictioncoding.getDisplay()));
		} else {
			e.addEvdnceJrsdctnCdgDsply("NULL");
		}

		if(evidencejurisdictioncodingi == evidencejurisdictioncodinglist.size()-1) {e.addEvdnceJrsdctnCdgDsply("]]");}


		/******************** Evdnce_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(evidencejurisdictioncodingi == 0) {e.addEvdnceJrsdctnCdgVrsn("[[");}
		if(evidencejurisdictioncoding.hasVersion()) {

			e.addEvdnceJrsdctnCdgVrsn(String.valueOf(evidencejurisdictioncoding.getVersion()));
		} else {
			e.addEvdnceJrsdctnCdgVrsn("NULL");
		}

		if(evidencejurisdictioncodingi == evidencejurisdictioncodinglist.size()-1) {e.addEvdnceJrsdctnCdgVrsn("]]");}


		/******************** Evdnce_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(evidencejurisdictioncodingi == 0) {e.addEvdnceJrsdctnCdgCd("[[");}
		if(evidencejurisdictioncoding.hasCode()) {

			e.addEvdnceJrsdctnCdgCd(String.valueOf(evidencejurisdictioncoding.getCode()));
		} else {
			e.addEvdnceJrsdctnCdgCd("NULL");
		}

		if(evidencejurisdictioncodingi == evidencejurisdictioncodinglist.size()-1) {e.addEvdnceJrsdctnCdgCd("]]");}


		/******************** Evdnce_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(evidencejurisdictioncodingi == 0) {e.addEvdnceJrsdctnCdgUsrSltd("[[");}
		if(evidencejurisdictioncoding.hasUserSelected()) {

			e.addEvdnceJrsdctnCdgUsrSltd(String.valueOf(evidencejurisdictioncoding.getUserSelected()));
		} else {
			e.addEvdnceJrsdctnCdgUsrSltd("NULL");
		}

		if(evidencejurisdictioncodingi == evidencejurisdictioncodinglist.size()-1) {e.addEvdnceJrsdctnCdgUsrSltd("]]");}


		/******************** Evdnce_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(evidencejurisdictioncodingi == 0) {e.addEvdnceJrsdctnCdgSys("[[");}
		if(evidencejurisdictioncoding.hasSystem()) {

			e.addEvdnceJrsdctnCdgSys(String.valueOf(evidencejurisdictioncoding.getSystem()));
		} else {
			e.addEvdnceJrsdctnCdgSys("NULL");
		}

		if(evidencejurisdictioncodingi == evidencejurisdictioncodinglist.size()-1) {e.addEvdnceJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** evidenceusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> evidenceusecontextlist = evidence.getUseContext();
		for(int evidenceusecontexti = 0; evidenceusecontexti<evidenceusecontextlist.size();evidenceusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  evidenceusecontext = evidenceusecontextlist.get(evidenceusecontexti);

		/******************** evidenceusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidenceusecontextcode = evidenceusecontext.getCode();

		/******************** Evdnce_UseCntxt_Cd_Dsply ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtCdDsply("[");}
		if(evidenceusecontextcode.hasDisplay()) {

			e.addEvdnceUseCntxtCdDsply(String.valueOf(evidenceusecontextcode.getDisplay()));
		} else {
			e.addEvdnceUseCntxtCdDsply("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtCdDsply("]");}


		/******************** Evdnce_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtCdVrsn("[");}
		if(evidenceusecontextcode.hasVersion()) {

			e.addEvdnceUseCntxtCdVrsn(String.valueOf(evidenceusecontextcode.getVersion()));
		} else {
			e.addEvdnceUseCntxtCdVrsn("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtCdVrsn("]");}


		/******************** Evdnce_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtCdUsrSltd("[");}
		if(evidenceusecontextcode.hasUserSelected()) {

			e.addEvdnceUseCntxtCdUsrSltd(String.valueOf(evidenceusecontextcode.getUserSelected()));
		} else {
			e.addEvdnceUseCntxtCdUsrSltd("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtCdUsrSltd("]");}


		/******************** Evdnce_UseCntxt_Cd_Sys ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtCdSys("[");}
		if(evidenceusecontextcode.hasSystem()) {

			e.addEvdnceUseCntxtCdSys(String.valueOf(evidenceusecontextcode.getSystem()));
		} else {
			e.addEvdnceUseCntxtCdSys("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtCdSys("]");}


		/******************** Evdnce_UseCntxt_VlRfrnc ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRfrnc("[");}
		if(evidenceusecontext.hasValueReference()) {

			if(evidenceusecontext.getValueReference().getReference() != null) {
			e.addEvdnceUseCntxtVlRfrnc(evidenceusecontext.getValueReference().getReference());
			}
		} else {
			e.addEvdnceUseCntxtVlRfrnc("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRfrnc("]");}


		/******************** evidenceusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidenceusecontextvaluecodeableconcept = evidenceusecontext.getValueCodeableConcept();

		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlCdbleCncptTxt("[");}
		if(evidenceusecontextvaluecodeableconcept.hasText()) {

			e.addEvdnceUseCntxtVlCdbleCncptTxt(String.valueOf(evidenceusecontextvaluecodeableconcept.getText()));
		} else {
			e.addEvdnceUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlCdbleCncptTxt("]");}


		/******************** evidenceusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidenceusecontextvaluecodeableconceptcodinglist = evidenceusecontextvaluecodeableconcept.getCoding();
		for(int evidenceusecontextvaluecodeableconceptcodingi = 0; evidenceusecontextvaluecodeableconceptcodingi<evidenceusecontextvaluecodeableconceptcodinglist.size();evidenceusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidenceusecontextvaluecodeableconceptcoding = evidenceusecontextvaluecodeableconceptcodinglist.get(evidenceusecontextvaluecodeableconceptcodingi);

		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(evidenceusecontextvaluecodeableconceptcoding.hasDisplay()) {

			e.addEvdnceUseCntxtVlCdbleCncptCdgDsply(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			e.addEvdnceUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(evidenceusecontextvaluecodeableconceptcodingi == evidenceusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(evidenceusecontextvaluecodeableconceptcoding.hasVersion()) {

			e.addEvdnceUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			e.addEvdnceUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(evidenceusecontextvaluecodeableconceptcodingi == evidenceusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceUseCntxtVlCdbleCncptCdgCd("[[");}
		if(evidenceusecontextvaluecodeableconceptcoding.hasCode()) {

			e.addEvdnceUseCntxtVlCdbleCncptCdgCd(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			e.addEvdnceUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(evidenceusecontextvaluecodeableconceptcodingi == evidenceusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(evidenceusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			e.addEvdnceUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvdnceUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(evidenceusecontextvaluecodeableconceptcodingi == evidenceusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** Evdnce_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidenceusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceUseCntxtVlCdbleCncptCdgSys("[[");}
		if(evidenceusecontextvaluecodeableconceptcoding.hasSystem()) {

			e.addEvdnceUseCntxtVlCdbleCncptCdgSys(String.valueOf(evidenceusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			e.addEvdnceUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(evidenceusecontextvaluecodeableconceptcodingi == evidenceusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** evidenceusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidenceusecontextvaluerange = evidenceusecontext.getValueRange();

		/******************** evidenceusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluerangelow = evidenceusecontextvaluerange.getLow();

		/******************** Evdnce_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngLwVl("[");}
		if(evidenceusecontextvaluerangelow.hasValue()) {

			e.addEvdnceUseCntxtVlRngLwVl(String.valueOf(evidenceusecontextvaluerangelow.getValue()));
		} else {
			e.addEvdnceUseCntxtVlRngLwVl("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngLwVl("]");}


		/******************** evidenceusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidenceusecontextvaluerangelowcomparator = evidenceusecontextvaluerangelow.getComparator();
		if(evidenceusecontextvaluerangelowcomparator!=null) {
		if(evidenceusecontexti == 0) {

		e.addEvdnceUseCntxtVlRngLwCmprtr("[");		}
			e.addEvdnceUseCntxtVlRngLwCmprtr(evidenceusecontextvaluerangelowcomparator.toCode());
		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {

		e.addEvdnceUseCntxtVlRngLwCmprtr("]");		}

		} else {
			e.addEvdnceUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** Evdnce_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngLwCd("[");}
		if(evidenceusecontextvaluerangelow.hasCode()) {

			e.addEvdnceUseCntxtVlRngLwCd(String.valueOf(evidenceusecontextvaluerangelow.getCode()));
		} else {
			e.addEvdnceUseCntxtVlRngLwCd("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngLwCd("]");}


		/******************** Evdnce_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngLwUnt("[");}
		if(evidenceusecontextvaluerangelow.hasUnit()) {

			e.addEvdnceUseCntxtVlRngLwUnt(String.valueOf(evidenceusecontextvaluerangelow.getUnit()));
		} else {
			e.addEvdnceUseCntxtVlRngLwUnt("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngLwUnt("]");}


		/******************** Evdnce_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngLwSys("[");}
		if(evidenceusecontextvaluerangelow.hasSystem()) {

			e.addEvdnceUseCntxtVlRngLwSys(String.valueOf(evidenceusecontextvaluerangelow.getSystem()));
		} else {
			e.addEvdnceUseCntxtVlRngLwSys("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngLwSys("]");}


		/******************** evidenceusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluerangehigh = evidenceusecontextvaluerange.getHigh();

		/******************** Evdnce_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngHiVl("[");}
		if(evidenceusecontextvaluerangehigh.hasValue()) {

			e.addEvdnceUseCntxtVlRngHiVl(String.valueOf(evidenceusecontextvaluerangehigh.getValue()));
		} else {
			e.addEvdnceUseCntxtVlRngHiVl("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngHiVl("]");}


		/******************** evidenceusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidenceusecontextvaluerangehighcomparator = evidenceusecontextvaluerangehigh.getComparator();
		if(evidenceusecontextvaluerangehighcomparator!=null) {
		if(evidenceusecontexti == 0) {

		e.addEvdnceUseCntxtVlRngHiCmprtr("[");		}
			e.addEvdnceUseCntxtVlRngHiCmprtr(evidenceusecontextvaluerangehighcomparator.toCode());
		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {

		e.addEvdnceUseCntxtVlRngHiCmprtr("]");		}

		} else {
			e.addEvdnceUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** Evdnce_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngHiCd("[");}
		if(evidenceusecontextvaluerangehigh.hasCode()) {

			e.addEvdnceUseCntxtVlRngHiCd(String.valueOf(evidenceusecontextvaluerangehigh.getCode()));
		} else {
			e.addEvdnceUseCntxtVlRngHiCd("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngHiCd("]");}


		/******************** Evdnce_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngHiUnt("[");}
		if(evidenceusecontextvaluerangehigh.hasUnit()) {

			e.addEvdnceUseCntxtVlRngHiUnt(String.valueOf(evidenceusecontextvaluerangehigh.getUnit()));
		} else {
			e.addEvdnceUseCntxtVlRngHiUnt("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngHiUnt("]");}


		/******************** Evdnce_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlRngHiSys("[");}
		if(evidenceusecontextvaluerangehigh.hasSystem()) {

			e.addEvdnceUseCntxtVlRngHiSys(String.valueOf(evidenceusecontextvaluerangehigh.getSystem()));
		} else {
			e.addEvdnceUseCntxtVlRngHiSys("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlRngHiSys("]");}


		/******************** evidenceusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidenceusecontextvaluequantity = evidenceusecontext.getValueQuantity();

		/******************** Evdnce_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlQntyVl("[");}
		if(evidenceusecontextvaluequantity.hasValue()) {

			e.addEvdnceUseCntxtVlQntyVl(String.valueOf(evidenceusecontextvaluequantity.getValue()));
		} else {
			e.addEvdnceUseCntxtVlQntyVl("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlQntyVl("]");}


		/******************** evidenceusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidenceusecontextvaluequantitycomparator = evidenceusecontextvaluequantity.getComparator();
		if(evidenceusecontextvaluequantitycomparator!=null) {
		if(evidenceusecontexti == 0) {

		e.addEvdnceUseCntxtVlQntyCmprtr("[");		}
			e.addEvdnceUseCntxtVlQntyCmprtr(evidenceusecontextvaluequantitycomparator.toCode());
		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {

		e.addEvdnceUseCntxtVlQntyCmprtr("]");		}

		} else {
			e.addEvdnceUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** Evdnce_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlQntyCd("[");}
		if(evidenceusecontextvaluequantity.hasCode()) {

			e.addEvdnceUseCntxtVlQntyCd(String.valueOf(evidenceusecontextvaluequantity.getCode()));
		} else {
			e.addEvdnceUseCntxtVlQntyCd("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlQntyCd("]");}


		/******************** Evdnce_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlQntyUnt("[");}
		if(evidenceusecontextvaluequantity.hasUnit()) {

			e.addEvdnceUseCntxtVlQntyUnt(String.valueOf(evidenceusecontextvaluequantity.getUnit()));
		} else {
			e.addEvdnceUseCntxtVlQntyUnt("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlQntyUnt("]");}


		/******************** Evdnce_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(evidenceusecontexti == 0) {e.addEvdnceUseCntxtVlQntySys("[");}
		if(evidenceusecontextvaluequantity.hasSystem()) {

			e.addEvdnceUseCntxtVlQntySys(String.valueOf(evidenceusecontextvaluequantity.getSystem()));
		} else {
			e.addEvdnceUseCntxtVlQntySys("NULL");
		}

		if(evidenceusecontexti == evidenceusecontextlist.size()-1) {e.addEvdnceUseCntxtVlQntySys("]");}


		 };
		/******************** Evdnce_Pblshr ********************************************************************************/
		if(evidence.hasPublisher()) {

			e.addEvdncePblshr(String.valueOf(evidence.getPublisher()));
		} else {
			e.addEvdncePblshr("NULL");
		}


		/******************** evidenceeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceeffectiveperiod = evidence.getEffectivePeriod();

		/******************** Evdnce_EfctivePrd_Strt ********************************************************************************/
		if(evidenceeffectiveperiod.hasStart()) {

			e.addEvdnceEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceeffectiveperiod.getStart())+"\"");
		} else {
			e.addEvdnceEfctivePrdStrt("NULL");
		}


		/******************** Evdnce_EfctivePrd_End ********************************************************************************/
		if(evidenceeffectiveperiod.hasEnd()) {

			e.addEvdnceEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceeffectiveperiod.getEnd())+"\"");
		} else {
			e.addEvdnceEfctivePrdEnd("NULL");
		}


		/******************** evidenceauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidenceauthorlist = evidence.getAuthor();
		for(int evidenceauthori = 0; evidenceauthori<evidenceauthorlist.size();evidenceauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidenceauthor = evidenceauthorlist.get(evidenceauthori);

		/******************** Evdnce_Athr_Nm ********************************************************************************/
		if(evidenceauthori == 0) {e.addEvdnceAthrNm("[");}
		if(evidenceauthor.hasName()) {

			e.addEvdnceAthrNm(String.valueOf(evidenceauthor.getName()));
		} else {
			e.addEvdnceAthrNm("NULL");
		}

		if(evidenceauthori == evidenceauthorlist.size()-1) {e.addEvdnceAthrNm("]");}


		/******************** evidenceauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidenceauthortelecomlist = evidenceauthor.getTelecom();
		for(int evidenceauthortelecomi = 0; evidenceauthortelecomi<evidenceauthortelecomlist.size();evidenceauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidenceauthortelecom = evidenceauthortelecomlist.get(evidenceauthortelecomi);

		/******************** Evdnce_Athr_Tlcm_Vl ********************************************************************************/
		if(evidenceauthortelecomi == 0) {e.addEvdnceAthrTlcmVl("[[");}
		if(evidenceauthortelecom.hasValue()) {

			e.addEvdnceAthrTlcmVl(String.valueOf(evidenceauthortelecom.getValue()));
		} else {
			e.addEvdnceAthrTlcmVl("NULL");
		}

		if(evidenceauthortelecomi == evidenceauthortelecomlist.size()-1) {e.addEvdnceAthrTlcmVl("]]");}


		/******************** evidenceauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidenceauthortelecomperiod = evidenceauthortelecom.getPeriod();

		/******************** Evdnce_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidenceauthortelecomi == 0) {e.addEvdnceAthrTlcmPrdStrt("[[");}
		if(evidenceauthortelecomperiod.hasStart()) {

			e.addEvdnceAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceauthortelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceAthrTlcmPrdStrt("NULL");
		}

		if(evidenceauthortelecomi == evidenceauthortelecomlist.size()-1) {e.addEvdnceAthrTlcmPrdStrt("]]");}


		/******************** Evdnce_Athr_Tlcm_Prd_End ********************************************************************************/
		if(evidenceauthortelecomi == 0) {e.addEvdnceAthrTlcmPrdEnd("[[");}
		if(evidenceauthortelecomperiod.hasEnd()) {

			e.addEvdnceAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidenceauthortelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceAthrTlcmPrdEnd("NULL");
		}

		if(evidenceauthortelecomi == evidenceauthortelecomlist.size()-1) {e.addEvdnceAthrTlcmPrdEnd("]]");}


		/******************** evidenceauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidenceauthortelecomuse = evidenceauthortelecom.getUse();
		if(evidenceauthortelecomuse!=null) {
		if(evidenceauthortelecomi == 0) {

		e.addEvdnceAthrTlcmUse("[[");		}
			e.addEvdnceAthrTlcmUse(evidenceauthortelecomuse.toCode());
		if(evidenceauthortelecomi == evidenceauthortelecomlist.size()-1) {

		e.addEvdnceAthrTlcmUse("]]");		}

		} else {
			e.addEvdnceAthrTlcmUse("NULL");
		}

		/******************** evidenceauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidenceauthortelecomsystem = evidenceauthortelecom.getSystem();
		if(evidenceauthortelecomsystem!=null) {
		if(evidenceauthortelecomi == 0) {

		e.addEvdnceAthrTlcmSys("[[");		}
			e.addEvdnceAthrTlcmSys(evidenceauthortelecomsystem.toCode());
		if(evidenceauthortelecomi == evidenceauthortelecomlist.size()-1) {

		e.addEvdnceAthrTlcmSys("]]");		}

		} else {
			e.addEvdnceAthrTlcmSys("NULL");
		}

		/******************** Evdnce_Athr_Tlcm_Rnk ********************************************************************************/
		if(evidenceauthortelecomi == 0) {e.addEvdnceAthrTlcmRnk("[[");}
		if(evidenceauthortelecom.hasRank()) {

			e.addEvdnceAthrTlcmRnk(String.valueOf(evidenceauthortelecom.getRank()));
		} else {
			e.addEvdnceAthrTlcmRnk("NULL");
		}

		if(evidenceauthortelecomi == evidenceauthortelecomlist.size()-1) {e.addEvdnceAthrTlcmRnk("]]");}


		 };
		 };
		return e;
	}
}
