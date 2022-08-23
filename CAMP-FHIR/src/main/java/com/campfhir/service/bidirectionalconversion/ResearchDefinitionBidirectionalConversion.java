package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchDefinition;
public class ResearchDefinitionBidirectionalConversion 
{
	public ResearchDefinition ResearchDefinitions(org.hl7.fhir.r4.model.ResearchDefinition researchdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchDefinition r = new  main.java.com.campfhir.model.ResearchDefinition();

		/******************** id ********************************************************************************/
		r.setId(researchdefinition.getIdElement().getIdPart());

		/******************** RsrchDfn_Nm ********************************************************************************/
		if(researchdefinition.hasName()) {

			r.addRsrchDfnNm(String.valueOf(researchdefinition.getName()));
		} else {
			r.addRsrchDfnNm("NULL");
		}


		/******************** RsrchDfn_Comment ********************************************************************************/
		if(researchdefinition.hasComment()) {

			String  array = "[";
			for(int incr=0; incr<researchdefinition.getComment().size(); incr++) {
				array = array + researchdefinition.getComment().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchDfnComment(array);

		} else {
			r.addRsrchDfnComment("NULL");
		}


		/******************** RsrchDfn_Vrsn ********************************************************************************/
		if(researchdefinition.hasVersion()) {

			r.addRsrchDfnVrsn(String.valueOf(researchdefinition.getVersion()));
		} else {
			r.addRsrchDfnVrsn("NULL");
		}


		/******************** RsrchDfn_Dt ********************************************************************************/
		if(researchdefinition.hasDate()) {

			r.addRsrchDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinition.getDate())+"\"");
		} else {
			r.addRsrchDfnDt("NULL");
		}


		/******************** researchdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus researchdefinitionstatus = researchdefinition.getStatus();
		if(researchdefinitionstatus!=null) {
			r.addRsrchDfnSts(researchdefinitionstatus.toCode());
		} else {
			r.addRsrchDfnSts("NULL");
		}

		/******************** RsrchDfn_Dscrptn ********************************************************************************/
		if(researchdefinition.hasDescription()) {

			r.addRsrchDfnDscrptn(String.valueOf(researchdefinition.getDescription()));
		} else {
			r.addRsrchDfnDscrptn("NULL");
		}


		/******************** researchdefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> researchdefinitionidentifierlist = researchdefinition.getIdentifier();
		for(int researchdefinitionidentifieri = 0; researchdefinitionidentifieri<researchdefinitionidentifierlist.size();researchdefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  researchdefinitionidentifier = researchdefinitionidentifierlist.get(researchdefinitionidentifieri);

		/******************** RsrchDfn_Id_Vl ********************************************************************************/
		if(researchdefinitionidentifieri == 0) {r.addRsrchDfnIdVl("[");}
		if(researchdefinitionidentifier.hasValue()) {

			r.addRsrchDfnIdVl(String.valueOf(researchdefinitionidentifier.getValue()));
		} else {
			r.addRsrchDfnIdVl("NULL");
		}

		if(researchdefinitionidentifieri == researchdefinitionidentifierlist.size()-1) {r.addRsrchDfnIdVl("]");}


		/******************** researchdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionidentifiertype = researchdefinitionidentifier.getType();

		/******************** RsrchDfn_Id_Typ_Txt ********************************************************************************/
		if(researchdefinitionidentifieri == 0) {r.addRsrchDfnIdTypTxt("[");}
		if(researchdefinitionidentifiertype.hasText()) {

			r.addRsrchDfnIdTypTxt(String.valueOf(researchdefinitionidentifiertype.getText()));
		} else {
			r.addRsrchDfnIdTypTxt("NULL");
		}

		if(researchdefinitionidentifieri == researchdefinitionidentifierlist.size()-1) {r.addRsrchDfnIdTypTxt("]");}


		/******************** researchdefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchdefinitionidentifiertypecodinglist = researchdefinitionidentifiertype.getCoding();
		for(int researchdefinitionidentifiertypecodingi = 0; researchdefinitionidentifiertypecodingi<researchdefinitionidentifiertypecodinglist.size();researchdefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchdefinitionidentifiertypecoding = researchdefinitionidentifiertypecodinglist.get(researchdefinitionidentifiertypecodingi);

		/******************** RsrchDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionidentifiertypecodingi == 0) {r.addRsrchDfnIdTypCdgDsply("[[");}
		if(researchdefinitionidentifiertypecoding.hasDisplay()) {

			r.addRsrchDfnIdTypCdgDsply(String.valueOf(researchdefinitionidentifiertypecoding.getDisplay()));
		} else {
			r.addRsrchDfnIdTypCdgDsply("NULL");
		}

		if(researchdefinitionidentifiertypecodingi == researchdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchDfnIdTypCdgDsply("]]");}


		/******************** RsrchDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionidentifiertypecodingi == 0) {r.addRsrchDfnIdTypCdgVrsn("[[");}
		if(researchdefinitionidentifiertypecoding.hasVersion()) {

			r.addRsrchDfnIdTypCdgVrsn(String.valueOf(researchdefinitionidentifiertypecoding.getVersion()));
		} else {
			r.addRsrchDfnIdTypCdgVrsn("NULL");
		}

		if(researchdefinitionidentifiertypecodingi == researchdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchDfnIdTypCdgVrsn("]]");}


		/******************** RsrchDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchdefinitionidentifiertypecodingi == 0) {r.addRsrchDfnIdTypCdgCd("[[");}
		if(researchdefinitionidentifiertypecoding.hasCode()) {

			r.addRsrchDfnIdTypCdgCd(String.valueOf(researchdefinitionidentifiertypecoding.getCode()));
		} else {
			r.addRsrchDfnIdTypCdgCd("NULL");
		}

		if(researchdefinitionidentifiertypecodingi == researchdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchDfnIdTypCdgCd("]]");}


		/******************** RsrchDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionidentifiertypecodingi == 0) {r.addRsrchDfnIdTypCdgUsrSltd("[[");}
		if(researchdefinitionidentifiertypecoding.hasUserSelected()) {

			r.addRsrchDfnIdTypCdgUsrSltd(String.valueOf(researchdefinitionidentifiertypecoding.getUserSelected()));
		} else {
			r.addRsrchDfnIdTypCdgUsrSltd("NULL");
		}

		if(researchdefinitionidentifiertypecodingi == researchdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchDfnIdTypCdgUsrSltd("]]");}


		/******************** RsrchDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchdefinitionidentifiertypecodingi == 0) {r.addRsrchDfnIdTypCdgSys("[[");}
		if(researchdefinitionidentifiertypecoding.hasSystem()) {

			r.addRsrchDfnIdTypCdgSys(String.valueOf(researchdefinitionidentifiertypecoding.getSystem()));
		} else {
			r.addRsrchDfnIdTypCdgSys("NULL");
		}

		if(researchdefinitionidentifiertypecodingi == researchdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchDfnIdTypCdgSys("]]");}


		 };
		/******************** researchdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionidentifierperiod = researchdefinitionidentifier.getPeriod();

		/******************** RsrchDfn_Id_Prd_Strt ********************************************************************************/
		if(researchdefinitionidentifieri == 0) {r.addRsrchDfnIdPrdStrt("[");}
		if(researchdefinitionidentifierperiod.hasStart()) {

			r.addRsrchDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionidentifierperiod.getStart())+"\"");
		} else {
			r.addRsrchDfnIdPrdStrt("NULL");
		}

		if(researchdefinitionidentifieri == researchdefinitionidentifierlist.size()-1) {r.addRsrchDfnIdPrdStrt("]");}


		/******************** RsrchDfn_Id_Prd_End ********************************************************************************/
		if(researchdefinitionidentifieri == 0) {r.addRsrchDfnIdPrdEnd("[");}
		if(researchdefinitionidentifierperiod.hasEnd()) {

			r.addRsrchDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionidentifierperiod.getEnd())+"\"");
		} else {
			r.addRsrchDfnIdPrdEnd("NULL");
		}

		if(researchdefinitionidentifieri == researchdefinitionidentifierlist.size()-1) {r.addRsrchDfnIdPrdEnd("]");}


		/******************** researchdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchdefinitionidentifieruse = researchdefinitionidentifier.getUse();
		if(researchdefinitionidentifieruse!=null) {
		if(researchdefinitionidentifieri == 0) {

		r.addRsrchDfnIdUse("[");		}
			r.addRsrchDfnIdUse(researchdefinitionidentifieruse.toCode());
		if(researchdefinitionidentifieri == researchdefinitionidentifierlist.size()-1) {

		r.addRsrchDfnIdUse("]");		}

		} else {
			r.addRsrchDfnIdUse("NULL");
		}

		/******************** RsrchDfn_Id_Assigner ********************************************************************************/
		if(researchdefinitionidentifieri == 0) {r.addRsrchDfnIdAssigner("[");}
		if(researchdefinitionidentifier.hasAssigner()) {

			if(researchdefinitionidentifier.getAssigner().getReference() != null) {
			r.addRsrchDfnIdAssigner(researchdefinitionidentifier.getAssigner().getReference());
			}
		} else {
			r.addRsrchDfnIdAssigner("NULL");
		}

		if(researchdefinitionidentifieri == researchdefinitionidentifierlist.size()-1) {r.addRsrchDfnIdAssigner("]");}


		/******************** RsrchDfn_Id_Sys ********************************************************************************/
		if(researchdefinitionidentifieri == 0) {r.addRsrchDfnIdSys("[");}
		if(researchdefinitionidentifier.hasSystem()) {

			r.addRsrchDfnIdSys(String.valueOf(researchdefinitionidentifier.getSystem()));
		} else {
			r.addRsrchDfnIdSys("NULL");
		}

		if(researchdefinitionidentifieri == researchdefinitionidentifierlist.size()-1) {r.addRsrchDfnIdSys("]");}


		 };
		/******************** RsrchDfn_Outcome ********************************************************************************/
		if(researchdefinition.hasOutcome()) {

			if(researchdefinition.getOutcome().getReference() != null) {
			r.addRsrchDfnOutcome(researchdefinition.getOutcome().getReference());
			}
		} else {
			r.addRsrchDfnOutcome("NULL");
		}


		/******************** researchdefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchdefinitioncontactlist = researchdefinition.getContact();
		for(int researchdefinitioncontacti = 0; researchdefinitioncontacti<researchdefinitioncontactlist.size();researchdefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchdefinitioncontact = researchdefinitioncontactlist.get(researchdefinitioncontacti);

		/******************** RsrchDfn_Cntct_Nm ********************************************************************************/
		if(researchdefinitioncontacti == 0) {r.addRsrchDfnCntctNm("[");}
		if(researchdefinitioncontact.hasName()) {

			r.addRsrchDfnCntctNm(String.valueOf(researchdefinitioncontact.getName()));
		} else {
			r.addRsrchDfnCntctNm("NULL");
		}

		if(researchdefinitioncontacti == researchdefinitioncontactlist.size()-1) {r.addRsrchDfnCntctNm("]");}


		/******************** researchdefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchdefinitioncontacttelecomlist = researchdefinitioncontact.getTelecom();
		for(int researchdefinitioncontacttelecomi = 0; researchdefinitioncontacttelecomi<researchdefinitioncontacttelecomlist.size();researchdefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchdefinitioncontacttelecom = researchdefinitioncontacttelecomlist.get(researchdefinitioncontacttelecomi);

		/******************** RsrchDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(researchdefinitioncontacttelecomi == 0) {r.addRsrchDfnCntctTlcmVl("[[");}
		if(researchdefinitioncontacttelecom.hasValue()) {

			r.addRsrchDfnCntctTlcmVl(String.valueOf(researchdefinitioncontacttelecom.getValue()));
		} else {
			r.addRsrchDfnCntctTlcmVl("NULL");
		}

		if(researchdefinitioncontacttelecomi == researchdefinitioncontacttelecomlist.size()-1) {r.addRsrchDfnCntctTlcmVl("]]");}


		/******************** researchdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioncontacttelecomperiod = researchdefinitioncontacttelecom.getPeriod();

		/******************** RsrchDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitioncontacttelecomi == 0) {r.addRsrchDfnCntctTlcmPrdStrt("[[");}
		if(researchdefinitioncontacttelecomperiod.hasStart()) {

			r.addRsrchDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchDfnCntctTlcmPrdStrt("NULL");
		}

		if(researchdefinitioncontacttelecomi == researchdefinitioncontacttelecomlist.size()-1) {r.addRsrchDfnCntctTlcmPrdStrt("]]");}


		/******************** RsrchDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitioncontacttelecomi == 0) {r.addRsrchDfnCntctTlcmPrdEnd("[[");}
		if(researchdefinitioncontacttelecomperiod.hasEnd()) {

			r.addRsrchDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchDfnCntctTlcmPrdEnd("NULL");
		}

		if(researchdefinitioncontacttelecomi == researchdefinitioncontacttelecomlist.size()-1) {r.addRsrchDfnCntctTlcmPrdEnd("]]");}


		/******************** researchdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitioncontacttelecomuse = researchdefinitioncontacttelecom.getUse();
		if(researchdefinitioncontacttelecomuse!=null) {
		if(researchdefinitioncontacttelecomi == 0) {

		r.addRsrchDfnCntctTlcmUse("[[");		}
			r.addRsrchDfnCntctTlcmUse(researchdefinitioncontacttelecomuse.toCode());
		if(researchdefinitioncontacttelecomi == researchdefinitioncontacttelecomlist.size()-1) {

		r.addRsrchDfnCntctTlcmUse("]]");		}

		} else {
			r.addRsrchDfnCntctTlcmUse("NULL");
		}

		/******************** researchdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitioncontacttelecomsystem = researchdefinitioncontacttelecom.getSystem();
		if(researchdefinitioncontacttelecomsystem!=null) {
		if(researchdefinitioncontacttelecomi == 0) {

		r.addRsrchDfnCntctTlcmSys("[[");		}
			r.addRsrchDfnCntctTlcmSys(researchdefinitioncontacttelecomsystem.toCode());
		if(researchdefinitioncontacttelecomi == researchdefinitioncontacttelecomlist.size()-1) {

		r.addRsrchDfnCntctTlcmSys("]]");		}

		} else {
			r.addRsrchDfnCntctTlcmSys("NULL");
		}

		/******************** RsrchDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitioncontacttelecomi == 0) {r.addRsrchDfnCntctTlcmRnk("[[");}
		if(researchdefinitioncontacttelecom.hasRank()) {

			r.addRsrchDfnCntctTlcmRnk(String.valueOf(researchdefinitioncontacttelecom.getRank()));
		} else {
			r.addRsrchDfnCntctTlcmRnk("NULL");
		}

		if(researchdefinitioncontacttelecomi == researchdefinitioncontacttelecomlist.size()-1) {r.addRsrchDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** RsrchDfn_Copyright ********************************************************************************/
		if(researchdefinition.hasCopyright()) {

			r.addRsrchDfnCopyright(String.valueOf(researchdefinition.getCopyright()));
		} else {
			r.addRsrchDfnCopyright("NULL");
		}


		/******************** RsrchDfn_ApprovalDt ********************************************************************************/
		if(researchdefinition.hasApprovalDate()) {

			r.addRsrchDfnApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinition.getApprovalDate())+"\"");
		} else {
			r.addRsrchDfnApprovalDt("NULL");
		}


		/******************** researchdefinitionendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchdefinitionendorserlist = researchdefinition.getEndorser();
		for(int researchdefinitionendorseri = 0; researchdefinitionendorseri<researchdefinitionendorserlist.size();researchdefinitionendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchdefinitionendorser = researchdefinitionendorserlist.get(researchdefinitionendorseri);

		/******************** RsrchDfn_Endsr_Nm ********************************************************************************/
		if(researchdefinitionendorseri == 0) {r.addRsrchDfnEndsrNm("[");}
		if(researchdefinitionendorser.hasName()) {

			r.addRsrchDfnEndsrNm(String.valueOf(researchdefinitionendorser.getName()));
		} else {
			r.addRsrchDfnEndsrNm("NULL");
		}

		if(researchdefinitionendorseri == researchdefinitionendorserlist.size()-1) {r.addRsrchDfnEndsrNm("]");}


		/******************** researchdefinitionendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchdefinitionendorsertelecomlist = researchdefinitionendorser.getTelecom();
		for(int researchdefinitionendorsertelecomi = 0; researchdefinitionendorsertelecomi<researchdefinitionendorsertelecomlist.size();researchdefinitionendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchdefinitionendorsertelecom = researchdefinitionendorsertelecomlist.get(researchdefinitionendorsertelecomi);

		/******************** RsrchDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(researchdefinitionendorsertelecomi == 0) {r.addRsrchDfnEndsrTlcmVl("[[");}
		if(researchdefinitionendorsertelecom.hasValue()) {

			r.addRsrchDfnEndsrTlcmVl(String.valueOf(researchdefinitionendorsertelecom.getValue()));
		} else {
			r.addRsrchDfnEndsrTlcmVl("NULL");
		}

		if(researchdefinitionendorsertelecomi == researchdefinitionendorsertelecomlist.size()-1) {r.addRsrchDfnEndsrTlcmVl("]]");}


		/******************** researchdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionendorsertelecomperiod = researchdefinitionendorsertelecom.getPeriod();

		/******************** RsrchDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitionendorsertelecomi == 0) {r.addRsrchDfnEndsrTlcmPrdStrt("[[");}
		if(researchdefinitionendorsertelecomperiod.hasStart()) {

			r.addRsrchDfnEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionendorsertelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchDfnEndsrTlcmPrdStrt("NULL");
		}

		if(researchdefinitionendorsertelecomi == researchdefinitionendorsertelecomlist.size()-1) {r.addRsrchDfnEndsrTlcmPrdStrt("]]");}


		/******************** RsrchDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitionendorsertelecomi == 0) {r.addRsrchDfnEndsrTlcmPrdEnd("[[");}
		if(researchdefinitionendorsertelecomperiod.hasEnd()) {

			r.addRsrchDfnEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionendorsertelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchDfnEndsrTlcmPrdEnd("NULL");
		}

		if(researchdefinitionendorsertelecomi == researchdefinitionendorsertelecomlist.size()-1) {r.addRsrchDfnEndsrTlcmPrdEnd("]]");}


		/******************** researchdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitionendorsertelecomuse = researchdefinitionendorsertelecom.getUse();
		if(researchdefinitionendorsertelecomuse!=null) {
		if(researchdefinitionendorsertelecomi == 0) {

		r.addRsrchDfnEndsrTlcmUse("[[");		}
			r.addRsrchDfnEndsrTlcmUse(researchdefinitionendorsertelecomuse.toCode());
		if(researchdefinitionendorsertelecomi == researchdefinitionendorsertelecomlist.size()-1) {

		r.addRsrchDfnEndsrTlcmUse("]]");		}

		} else {
			r.addRsrchDfnEndsrTlcmUse("NULL");
		}

		/******************** researchdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitionendorsertelecomsystem = researchdefinitionendorsertelecom.getSystem();
		if(researchdefinitionendorsertelecomsystem!=null) {
		if(researchdefinitionendorsertelecomi == 0) {

		r.addRsrchDfnEndsrTlcmSys("[[");		}
			r.addRsrchDfnEndsrTlcmSys(researchdefinitionendorsertelecomsystem.toCode());
		if(researchdefinitionendorsertelecomi == researchdefinitionendorsertelecomlist.size()-1) {

		r.addRsrchDfnEndsrTlcmSys("]]");		}

		} else {
			r.addRsrchDfnEndsrTlcmSys("NULL");
		}

		/******************** RsrchDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitionendorsertelecomi == 0) {r.addRsrchDfnEndsrTlcmRnk("[[");}
		if(researchdefinitionendorsertelecom.hasRank()) {

			r.addRsrchDfnEndsrTlcmRnk(String.valueOf(researchdefinitionendorsertelecom.getRank()));
		} else {
			r.addRsrchDfnEndsrTlcmRnk("NULL");
		}

		if(researchdefinitionendorsertelecomi == researchdefinitionendorsertelecomlist.size()-1) {r.addRsrchDfnEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** RsrchDfn_LastReviewDt ********************************************************************************/
		if(researchdefinition.hasLastReviewDate()) {

			r.addRsrchDfnLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinition.getLastReviewDate())+"\"");
		} else {
			r.addRsrchDfnLastReviewDt("NULL");
		}


		/******************** researchdefinitioneditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchdefinitioneditorlist = researchdefinition.getEditor();
		for(int researchdefinitioneditori = 0; researchdefinitioneditori<researchdefinitioneditorlist.size();researchdefinitioneditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchdefinitioneditor = researchdefinitioneditorlist.get(researchdefinitioneditori);

		/******************** RsrchDfn_Editor_Nm ********************************************************************************/
		if(researchdefinitioneditori == 0) {r.addRsrchDfnEditorNm("[");}
		if(researchdefinitioneditor.hasName()) {

			r.addRsrchDfnEditorNm(String.valueOf(researchdefinitioneditor.getName()));
		} else {
			r.addRsrchDfnEditorNm("NULL");
		}

		if(researchdefinitioneditori == researchdefinitioneditorlist.size()-1) {r.addRsrchDfnEditorNm("]");}


		/******************** researchdefinitioneditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchdefinitioneditortelecomlist = researchdefinitioneditor.getTelecom();
		for(int researchdefinitioneditortelecomi = 0; researchdefinitioneditortelecomi<researchdefinitioneditortelecomlist.size();researchdefinitioneditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchdefinitioneditortelecom = researchdefinitioneditortelecomlist.get(researchdefinitioneditortelecomi);

		/******************** RsrchDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(researchdefinitioneditortelecomi == 0) {r.addRsrchDfnEditorTlcmVl("[[");}
		if(researchdefinitioneditortelecom.hasValue()) {

			r.addRsrchDfnEditorTlcmVl(String.valueOf(researchdefinitioneditortelecom.getValue()));
		} else {
			r.addRsrchDfnEditorTlcmVl("NULL");
		}

		if(researchdefinitioneditortelecomi == researchdefinitioneditortelecomlist.size()-1) {r.addRsrchDfnEditorTlcmVl("]]");}


		/******************** researchdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioneditortelecomperiod = researchdefinitioneditortelecom.getPeriod();

		/******************** RsrchDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitioneditortelecomi == 0) {r.addRsrchDfnEditorTlcmPrdStrt("[[");}
		if(researchdefinitioneditortelecomperiod.hasStart()) {

			r.addRsrchDfnEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitioneditortelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchDfnEditorTlcmPrdStrt("NULL");
		}

		if(researchdefinitioneditortelecomi == researchdefinitioneditortelecomlist.size()-1) {r.addRsrchDfnEditorTlcmPrdStrt("]]");}


		/******************** RsrchDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitioneditortelecomi == 0) {r.addRsrchDfnEditorTlcmPrdEnd("[[");}
		if(researchdefinitioneditortelecomperiod.hasEnd()) {

			r.addRsrchDfnEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitioneditortelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchDfnEditorTlcmPrdEnd("NULL");
		}

		if(researchdefinitioneditortelecomi == researchdefinitioneditortelecomlist.size()-1) {r.addRsrchDfnEditorTlcmPrdEnd("]]");}


		/******************** researchdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitioneditortelecomuse = researchdefinitioneditortelecom.getUse();
		if(researchdefinitioneditortelecomuse!=null) {
		if(researchdefinitioneditortelecomi == 0) {

		r.addRsrchDfnEditorTlcmUse("[[");		}
			r.addRsrchDfnEditorTlcmUse(researchdefinitioneditortelecomuse.toCode());
		if(researchdefinitioneditortelecomi == researchdefinitioneditortelecomlist.size()-1) {

		r.addRsrchDfnEditorTlcmUse("]]");		}

		} else {
			r.addRsrchDfnEditorTlcmUse("NULL");
		}

		/******************** researchdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitioneditortelecomsystem = researchdefinitioneditortelecom.getSystem();
		if(researchdefinitioneditortelecomsystem!=null) {
		if(researchdefinitioneditortelecomi == 0) {

		r.addRsrchDfnEditorTlcmSys("[[");		}
			r.addRsrchDfnEditorTlcmSys(researchdefinitioneditortelecomsystem.toCode());
		if(researchdefinitioneditortelecomi == researchdefinitioneditortelecomlist.size()-1) {

		r.addRsrchDfnEditorTlcmSys("]]");		}

		} else {
			r.addRsrchDfnEditorTlcmSys("NULL");
		}

		/******************** RsrchDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitioneditortelecomi == 0) {r.addRsrchDfnEditorTlcmRnk("[[");}
		if(researchdefinitioneditortelecom.hasRank()) {

			r.addRsrchDfnEditorTlcmRnk(String.valueOf(researchdefinitioneditortelecom.getRank()));
		} else {
			r.addRsrchDfnEditorTlcmRnk("NULL");
		}

		if(researchdefinitioneditortelecomi == researchdefinitioneditortelecomlist.size()-1) {r.addRsrchDfnEditorTlcmRnk("]]");}


		 };
		 };
		/******************** researchdefinitionreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchdefinitionreviewerlist = researchdefinition.getReviewer();
		for(int researchdefinitionrevieweri = 0; researchdefinitionrevieweri<researchdefinitionreviewerlist.size();researchdefinitionrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchdefinitionreviewer = researchdefinitionreviewerlist.get(researchdefinitionrevieweri);

		/******************** RsrchDfn_Rviewr_Nm ********************************************************************************/
		if(researchdefinitionrevieweri == 0) {r.addRsrchDfnRviewrNm("[");}
		if(researchdefinitionreviewer.hasName()) {

			r.addRsrchDfnRviewrNm(String.valueOf(researchdefinitionreviewer.getName()));
		} else {
			r.addRsrchDfnRviewrNm("NULL");
		}

		if(researchdefinitionrevieweri == researchdefinitionreviewerlist.size()-1) {r.addRsrchDfnRviewrNm("]");}


		/******************** researchdefinitionreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchdefinitionreviewertelecomlist = researchdefinitionreviewer.getTelecom();
		for(int researchdefinitionreviewertelecomi = 0; researchdefinitionreviewertelecomi<researchdefinitionreviewertelecomlist.size();researchdefinitionreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchdefinitionreviewertelecom = researchdefinitionreviewertelecomlist.get(researchdefinitionreviewertelecomi);

		/******************** RsrchDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(researchdefinitionreviewertelecomi == 0) {r.addRsrchDfnRviewrTlcmVl("[[");}
		if(researchdefinitionreviewertelecom.hasValue()) {

			r.addRsrchDfnRviewrTlcmVl(String.valueOf(researchdefinitionreviewertelecom.getValue()));
		} else {
			r.addRsrchDfnRviewrTlcmVl("NULL");
		}

		if(researchdefinitionreviewertelecomi == researchdefinitionreviewertelecomlist.size()-1) {r.addRsrchDfnRviewrTlcmVl("]]");}


		/******************** researchdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionreviewertelecomperiod = researchdefinitionreviewertelecom.getPeriod();

		/******************** RsrchDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitionreviewertelecomi == 0) {r.addRsrchDfnRviewrTlcmPrdStrt("[[");}
		if(researchdefinitionreviewertelecomperiod.hasStart()) {

			r.addRsrchDfnRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionreviewertelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchDfnRviewrTlcmPrdStrt("NULL");
		}

		if(researchdefinitionreviewertelecomi == researchdefinitionreviewertelecomlist.size()-1) {r.addRsrchDfnRviewrTlcmPrdStrt("]]");}


		/******************** RsrchDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitionreviewertelecomi == 0) {r.addRsrchDfnRviewrTlcmPrdEnd("[[");}
		if(researchdefinitionreviewertelecomperiod.hasEnd()) {

			r.addRsrchDfnRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionreviewertelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchDfnRviewrTlcmPrdEnd("NULL");
		}

		if(researchdefinitionreviewertelecomi == researchdefinitionreviewertelecomlist.size()-1) {r.addRsrchDfnRviewrTlcmPrdEnd("]]");}


		/******************** researchdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitionreviewertelecomuse = researchdefinitionreviewertelecom.getUse();
		if(researchdefinitionreviewertelecomuse!=null) {
		if(researchdefinitionreviewertelecomi == 0) {

		r.addRsrchDfnRviewrTlcmUse("[[");		}
			r.addRsrchDfnRviewrTlcmUse(researchdefinitionreviewertelecomuse.toCode());
		if(researchdefinitionreviewertelecomi == researchdefinitionreviewertelecomlist.size()-1) {

		r.addRsrchDfnRviewrTlcmUse("]]");		}

		} else {
			r.addRsrchDfnRviewrTlcmUse("NULL");
		}

		/******************** researchdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitionreviewertelecomsystem = researchdefinitionreviewertelecom.getSystem();
		if(researchdefinitionreviewertelecomsystem!=null) {
		if(researchdefinitionreviewertelecomi == 0) {

		r.addRsrchDfnRviewrTlcmSys("[[");		}
			r.addRsrchDfnRviewrTlcmSys(researchdefinitionreviewertelecomsystem.toCode());
		if(researchdefinitionreviewertelecomi == researchdefinitionreviewertelecomlist.size()-1) {

		r.addRsrchDfnRviewrTlcmSys("]]");		}

		} else {
			r.addRsrchDfnRviewrTlcmSys("NULL");
		}

		/******************** RsrchDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitionreviewertelecomi == 0) {r.addRsrchDfnRviewrTlcmRnk("[[");}
		if(researchdefinitionreviewertelecom.hasRank()) {

			r.addRsrchDfnRviewrTlcmRnk(String.valueOf(researchdefinitionreviewertelecom.getRank()));
		} else {
			r.addRsrchDfnRviewrTlcmRnk("NULL");
		}

		if(researchdefinitionreviewertelecomi == researchdefinitionreviewertelecomlist.size()-1) {r.addRsrchDfnRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** RsrchDfn_Exposure ********************************************************************************/
		if(researchdefinition.hasExposure()) {

			if(researchdefinition.getExposure().getReference() != null) {
			r.addRsrchDfnExposure(researchdefinition.getExposure().getReference());
			}
		} else {
			r.addRsrchDfnExposure("NULL");
		}


		/******************** RsrchDfn_Usg ********************************************************************************/
		if(researchdefinition.hasUsage()) {

			r.addRsrchDfnUsg(String.valueOf(researchdefinition.getUsage()));
		} else {
			r.addRsrchDfnUsg("NULL");
		}


		/******************** RsrchDfn_Library ********************************************************************************/
		if(researchdefinition.hasLibrary()) {

			String  array = "[";
			for(int incr=0; incr<researchdefinition.getLibrary().size(); incr++) {
				array = array + researchdefinition.getLibrary().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchDfnLibrary(array);

		} else {
			r.addRsrchDfnLibrary("NULL");
		}


		/******************** RsrchDfn_SbjctRfrnc ********************************************************************************/
		if(researchdefinition.hasSubjectReference()) {

			if(researchdefinition.getSubjectReference().getReference() != null) {
			r.addRsrchDfnSbjctRfrnc(researchdefinition.getSubjectReference().getReference());
			}
		} else {
			r.addRsrchDfnSbjctRfrnc("NULL");
		}


		/******************** researchdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionsubjectcodeableconcept = researchdefinition.getSubjectCodeableConcept();

		/******************** RsrchDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(researchdefinitionsubjectcodeableconcept.hasText()) {

			r.addRsrchDfnSbjctCdbleCncptTxt(String.valueOf(researchdefinitionsubjectcodeableconcept.getText()));
		} else {
			r.addRsrchDfnSbjctCdbleCncptTxt("NULL");
		}


		/******************** researchdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchdefinitionsubjectcodeableconceptcodinglist = researchdefinitionsubjectcodeableconcept.getCoding();
		for(int researchdefinitionsubjectcodeableconceptcodingi = 0; researchdefinitionsubjectcodeableconceptcodingi<researchdefinitionsubjectcodeableconceptcodinglist.size();researchdefinitionsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchdefinitionsubjectcodeableconceptcoding = researchdefinitionsubjectcodeableconceptcodinglist.get(researchdefinitionsubjectcodeableconceptcodingi);

		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchDfnSbjctCdbleCncptCdgDsply("[");}
		if(researchdefinitionsubjectcodeableconceptcoding.hasDisplay()) {

			r.addRsrchDfnSbjctCdbleCncptCdgDsply(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getDisplay()));
		} else {
			r.addRsrchDfnSbjctCdbleCncptCdgDsply("NULL");
		}

		if(researchdefinitionsubjectcodeableconceptcodingi == researchdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchDfnSbjctCdbleCncptCdgDsply("]");}


		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchDfnSbjctCdbleCncptCdgVrsn("[");}
		if(researchdefinitionsubjectcodeableconceptcoding.hasVersion()) {

			r.addRsrchDfnSbjctCdbleCncptCdgVrsn(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getVersion()));
		} else {
			r.addRsrchDfnSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(researchdefinitionsubjectcodeableconceptcodingi == researchdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchDfnSbjctCdbleCncptCdgVrsn("]");}


		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchDfnSbjctCdbleCncptCdgCd("[");}
		if(researchdefinitionsubjectcodeableconceptcoding.hasCode()) {

			r.addRsrchDfnSbjctCdbleCncptCdgCd(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getCode()));
		} else {
			r.addRsrchDfnSbjctCdbleCncptCdgCd("NULL");
		}

		if(researchdefinitionsubjectcodeableconceptcodingi == researchdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchDfnSbjctCdbleCncptCdgCd("]");}


		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchDfnSbjctCdbleCncptCdgUsrSltd("[");}
		if(researchdefinitionsubjectcodeableconceptcoding.hasUserSelected()) {

			r.addRsrchDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			r.addRsrchDfnSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(researchdefinitionsubjectcodeableconceptcodingi == researchdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchDfnSbjctCdbleCncptCdgUsrSltd("]");}


		/******************** RsrchDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchDfnSbjctCdbleCncptCdgSys("[");}
		if(researchdefinitionsubjectcodeableconceptcoding.hasSystem()) {

			r.addRsrchDfnSbjctCdbleCncptCdgSys(String.valueOf(researchdefinitionsubjectcodeableconceptcoding.getSystem()));
		} else {
			r.addRsrchDfnSbjctCdbleCncptCdgSys("NULL");
		}

		if(researchdefinitionsubjectcodeableconceptcodingi == researchdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchDfnSbjctCdbleCncptCdgSys("]");}


		 };
		/******************** RsrchDfn_Ttl ********************************************************************************/
		if(researchdefinition.hasTitle()) {

			r.addRsrchDfnTtl(String.valueOf(researchdefinition.getTitle()));
		} else {
			r.addRsrchDfnTtl("NULL");
		}


		/******************** researchdefinitionrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> researchdefinitionrelatedartifactlist = researchdefinition.getRelatedArtifact();
		for(int researchdefinitionrelatedartifacti = 0; researchdefinitionrelatedartifacti<researchdefinitionrelatedartifactlist.size();researchdefinitionrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  researchdefinitionrelatedartifact = researchdefinitionrelatedartifactlist.get(researchdefinitionrelatedartifacti);

		/******************** RsrchDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctRsrc("[");}
		if(researchdefinitionrelatedartifact.hasResource()) {

			r.addRsrchDfnRltedArtfctRsrc(String.valueOf(researchdefinitionrelatedartifact.getResource()));
		} else {
			r.addRsrchDfnRltedArtfctRsrc("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctRsrc("]");}


		/******************** researchdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType researchdefinitionrelatedartifacttype = researchdefinitionrelatedartifact.getType();
		if(researchdefinitionrelatedartifacttype!=null) {
		if(researchdefinitionrelatedartifacti == 0) {

		r.addRsrchDfnRltedArtfctTyp("[");		}
			r.addRsrchDfnRltedArtfctTyp(researchdefinitionrelatedartifacttype.toCode());
		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {

		r.addRsrchDfnRltedArtfctTyp("]");		}

		} else {
			r.addRsrchDfnRltedArtfctTyp("NULL");
		}

		/******************** RsrchDfn_RltedArtfct_Url ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctUrl("[");}
		if(researchdefinitionrelatedartifact.hasUrl()) {

			r.addRsrchDfnRltedArtfctUrl(String.valueOf(researchdefinitionrelatedartifact.getUrl()));
		} else {
			r.addRsrchDfnRltedArtfctUrl("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctUrl("]");}


		/******************** RsrchDfn_RltedArtfct_Citation ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctCitation("[");}
		if(researchdefinitionrelatedartifact.hasCitation()) {

			r.addRsrchDfnRltedArtfctCitation(String.valueOf(researchdefinitionrelatedartifact.getCitation()));
		} else {
			r.addRsrchDfnRltedArtfctCitation("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctCitation("]");}


		/******************** RsrchDfn_RltedArtfct_Lbl ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctLbl("[");}
		if(researchdefinitionrelatedartifact.hasLabel()) {

			r.addRsrchDfnRltedArtfctLbl(String.valueOf(researchdefinitionrelatedartifact.getLabel()));
		} else {
			r.addRsrchDfnRltedArtfctLbl("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctLbl("]");}


		/******************** researchdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchdefinitionrelatedartifactdocument = researchdefinitionrelatedartifact.getDocument();

		/******************** RsrchDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocSz("[");}
		if(researchdefinitionrelatedartifactdocument.hasSize()) {

			r.addRsrchDfnRltedArtfctDocSz(String.valueOf(researchdefinitionrelatedartifactdocument.getSize()));
		} else {
			r.addRsrchDfnRltedArtfctDocSz("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocSz("]");}


		/******************** RsrchDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocLnguage("[");}
		if(researchdefinitionrelatedartifactdocument.hasLanguage()) {

			r.addRsrchDfnRltedArtfctDocLnguage(String.valueOf(researchdefinitionrelatedartifactdocument.getLanguage()));
		} else {
			r.addRsrchDfnRltedArtfctDocLnguage("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocLnguage("]");}


		/******************** RsrchDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocCntntTyp("[");}
		if(researchdefinitionrelatedartifactdocument.hasContentType()) {

			r.addRsrchDfnRltedArtfctDocCntntTyp(String.valueOf(researchdefinitionrelatedartifactdocument.getContentType()));
		} else {
			r.addRsrchDfnRltedArtfctDocCntntTyp("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocCntntTyp("]");}


		/******************** RsrchDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocHash("[");}
		if(researchdefinitionrelatedartifactdocument.hasHash()) {

			r.addRsrchDfnRltedArtfctDocHash(new String(researchdefinitionrelatedartifactdocument.getHash()));
		} else {
			r.addRsrchDfnRltedArtfctDocHash("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocHash("]");}


		/******************** RsrchDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocData("[");}
		if(researchdefinitionrelatedartifactdocument.hasData()) {

			r.addRsrchDfnRltedArtfctDocData(new String(researchdefinitionrelatedartifactdocument.getData()));
		} else {
			r.addRsrchDfnRltedArtfctDocData("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocData("]");}


		/******************** RsrchDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocCreation("[");}
		if(researchdefinitionrelatedartifactdocument.hasCreation()) {

			r.addRsrchDfnRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionrelatedartifactdocument.getCreation())+"\"");
		} else {
			r.addRsrchDfnRltedArtfctDocCreation("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocCreation("]");}


		/******************** RsrchDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocTtl("[");}
		if(researchdefinitionrelatedartifactdocument.hasTitle()) {

			r.addRsrchDfnRltedArtfctDocTtl(String.valueOf(researchdefinitionrelatedartifactdocument.getTitle()));
		} else {
			r.addRsrchDfnRltedArtfctDocTtl("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocTtl("]");}


		/******************** RsrchDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(researchdefinitionrelatedartifacti == 0) {r.addRsrchDfnRltedArtfctDocUrl("[");}
		if(researchdefinitionrelatedartifactdocument.hasUrl()) {

			r.addRsrchDfnRltedArtfctDocUrl(String.valueOf(researchdefinitionrelatedartifactdocument.getUrl()));
		} else {
			r.addRsrchDfnRltedArtfctDocUrl("NULL");
		}

		if(researchdefinitionrelatedartifacti == researchdefinitionrelatedartifactlist.size()-1) {r.addRsrchDfnRltedArtfctDocUrl("]");}


		 };
		/******************** RsrchDfn_Prpse ********************************************************************************/
		if(researchdefinition.hasPurpose()) {

			r.addRsrchDfnPrpse(String.valueOf(researchdefinition.getPurpose()));
		} else {
			r.addRsrchDfnPrpse("NULL");
		}


		/******************** RsrchDfn_Url ********************************************************************************/
		if(researchdefinition.hasUrl()) {

			r.addRsrchDfnUrl(String.valueOf(researchdefinition.getUrl()));
		} else {
			r.addRsrchDfnUrl("NULL");
		}


		/******************** RsrchDfn_ShortTtl ********************************************************************************/
		if(researchdefinition.hasShortTitle()) {

			r.addRsrchDfnShortTtl(String.valueOf(researchdefinition.getShortTitle()));
		} else {
			r.addRsrchDfnShortTtl("NULL");
		}


		/******************** RsrchDfn_Subtitle ********************************************************************************/
		if(researchdefinition.hasSubtitle()) {

			r.addRsrchDfnSubtitle(String.valueOf(researchdefinition.getSubtitle()));
		} else {
			r.addRsrchDfnSubtitle("NULL");
		}


		/******************** researchdefinitiontopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchdefinitiontopiclist = researchdefinition.getTopic();
		for(int researchdefinitiontopici = 0; researchdefinitiontopici<researchdefinitiontopiclist.size();researchdefinitiontopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchdefinitiontopic = researchdefinitiontopiclist.get(researchdefinitiontopici);

		/******************** RsrchDfn_Topic_Txt ********************************************************************************/
		if(researchdefinitiontopici == 0) {r.addRsrchDfnTopicTxt("[");}
		if(researchdefinitiontopic.hasText()) {

			r.addRsrchDfnTopicTxt(String.valueOf(researchdefinitiontopic.getText()));
		} else {
			r.addRsrchDfnTopicTxt("NULL");
		}

		if(researchdefinitiontopici == researchdefinitiontopiclist.size()-1) {r.addRsrchDfnTopicTxt("]");}


		/******************** researchdefinitiontopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchdefinitiontopiccodinglist = researchdefinitiontopic.getCoding();
		for(int researchdefinitiontopiccodingi = 0; researchdefinitiontopiccodingi<researchdefinitiontopiccodinglist.size();researchdefinitiontopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchdefinitiontopiccoding = researchdefinitiontopiccodinglist.get(researchdefinitiontopiccodingi);

		/******************** RsrchDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(researchdefinitiontopiccodingi == 0) {r.addRsrchDfnTopicCdgDsply("[[");}
		if(researchdefinitiontopiccoding.hasDisplay()) {

			r.addRsrchDfnTopicCdgDsply(String.valueOf(researchdefinitiontopiccoding.getDisplay()));
		} else {
			r.addRsrchDfnTopicCdgDsply("NULL");
		}

		if(researchdefinitiontopiccodingi == researchdefinitiontopiccodinglist.size()-1) {r.addRsrchDfnTopicCdgDsply("]]");}


		/******************** RsrchDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitiontopiccodingi == 0) {r.addRsrchDfnTopicCdgVrsn("[[");}
		if(researchdefinitiontopiccoding.hasVersion()) {

			r.addRsrchDfnTopicCdgVrsn(String.valueOf(researchdefinitiontopiccoding.getVersion()));
		} else {
			r.addRsrchDfnTopicCdgVrsn("NULL");
		}

		if(researchdefinitiontopiccodingi == researchdefinitiontopiccodinglist.size()-1) {r.addRsrchDfnTopicCdgVrsn("]]");}


		/******************** RsrchDfn_Topic_Cdg_Cd ********************************************************************************/
		if(researchdefinitiontopiccodingi == 0) {r.addRsrchDfnTopicCdgCd("[[");}
		if(researchdefinitiontopiccoding.hasCode()) {

			r.addRsrchDfnTopicCdgCd(String.valueOf(researchdefinitiontopiccoding.getCode()));
		} else {
			r.addRsrchDfnTopicCdgCd("NULL");
		}

		if(researchdefinitiontopiccodingi == researchdefinitiontopiccodinglist.size()-1) {r.addRsrchDfnTopicCdgCd("]]");}


		/******************** RsrchDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitiontopiccodingi == 0) {r.addRsrchDfnTopicCdgUsrSltd("[[");}
		if(researchdefinitiontopiccoding.hasUserSelected()) {

			r.addRsrchDfnTopicCdgUsrSltd(String.valueOf(researchdefinitiontopiccoding.getUserSelected()));
		} else {
			r.addRsrchDfnTopicCdgUsrSltd("NULL");
		}

		if(researchdefinitiontopiccodingi == researchdefinitiontopiccodinglist.size()-1) {r.addRsrchDfnTopicCdgUsrSltd("]]");}


		/******************** RsrchDfn_Topic_Cdg_Sys ********************************************************************************/
		if(researchdefinitiontopiccodingi == 0) {r.addRsrchDfnTopicCdgSys("[[");}
		if(researchdefinitiontopiccoding.hasSystem()) {

			r.addRsrchDfnTopicCdgSys(String.valueOf(researchdefinitiontopiccoding.getSystem()));
		} else {
			r.addRsrchDfnTopicCdgSys("NULL");
		}

		if(researchdefinitiontopiccodingi == researchdefinitiontopiccodinglist.size()-1) {r.addRsrchDfnTopicCdgSys("]]");}


		 };
		 };
		/******************** RsrchDfn_Popln ********************************************************************************/
		if(researchdefinition.hasPopulation()) {

			if(researchdefinition.getPopulation().getReference() != null) {
			r.addRsrchDfnPopln(researchdefinition.getPopulation().getReference());
			}
		} else {
			r.addRsrchDfnPopln("NULL");
		}


		/******************** researchdefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchdefinitionjurisdictionlist = researchdefinition.getJurisdiction();
		for(int researchdefinitionjurisdictioni = 0; researchdefinitionjurisdictioni<researchdefinitionjurisdictionlist.size();researchdefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchdefinitionjurisdiction = researchdefinitionjurisdictionlist.get(researchdefinitionjurisdictioni);

		/******************** RsrchDfn_Jrsdctn_Txt ********************************************************************************/
		if(researchdefinitionjurisdictioni == 0) {r.addRsrchDfnJrsdctnTxt("[");}
		if(researchdefinitionjurisdiction.hasText()) {

			r.addRsrchDfnJrsdctnTxt(String.valueOf(researchdefinitionjurisdiction.getText()));
		} else {
			r.addRsrchDfnJrsdctnTxt("NULL");
		}

		if(researchdefinitionjurisdictioni == researchdefinitionjurisdictionlist.size()-1) {r.addRsrchDfnJrsdctnTxt("]");}


		/******************** researchdefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchdefinitionjurisdictioncodinglist = researchdefinitionjurisdiction.getCoding();
		for(int researchdefinitionjurisdictioncodingi = 0; researchdefinitionjurisdictioncodingi<researchdefinitionjurisdictioncodinglist.size();researchdefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchdefinitionjurisdictioncoding = researchdefinitionjurisdictioncodinglist.get(researchdefinitionjurisdictioncodingi);

		/******************** RsrchDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionjurisdictioncodingi == 0) {r.addRsrchDfnJrsdctnCdgDsply("[[");}
		if(researchdefinitionjurisdictioncoding.hasDisplay()) {

			r.addRsrchDfnJrsdctnCdgDsply(String.valueOf(researchdefinitionjurisdictioncoding.getDisplay()));
		} else {
			r.addRsrchDfnJrsdctnCdgDsply("NULL");
		}

		if(researchdefinitionjurisdictioncodingi == researchdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchDfnJrsdctnCdgDsply("]]");}


		/******************** RsrchDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionjurisdictioncodingi == 0) {r.addRsrchDfnJrsdctnCdgVrsn("[[");}
		if(researchdefinitionjurisdictioncoding.hasVersion()) {

			r.addRsrchDfnJrsdctnCdgVrsn(String.valueOf(researchdefinitionjurisdictioncoding.getVersion()));
		} else {
			r.addRsrchDfnJrsdctnCdgVrsn("NULL");
		}

		if(researchdefinitionjurisdictioncodingi == researchdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchDfnJrsdctnCdgVrsn("]]");}


		/******************** RsrchDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(researchdefinitionjurisdictioncodingi == 0) {r.addRsrchDfnJrsdctnCdgCd("[[");}
		if(researchdefinitionjurisdictioncoding.hasCode()) {

			r.addRsrchDfnJrsdctnCdgCd(String.valueOf(researchdefinitionjurisdictioncoding.getCode()));
		} else {
			r.addRsrchDfnJrsdctnCdgCd("NULL");
		}

		if(researchdefinitionjurisdictioncodingi == researchdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchDfnJrsdctnCdgCd("]]");}


		/******************** RsrchDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionjurisdictioncodingi == 0) {r.addRsrchDfnJrsdctnCdgUsrSltd("[[");}
		if(researchdefinitionjurisdictioncoding.hasUserSelected()) {

			r.addRsrchDfnJrsdctnCdgUsrSltd(String.valueOf(researchdefinitionjurisdictioncoding.getUserSelected()));
		} else {
			r.addRsrchDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(researchdefinitionjurisdictioncodingi == researchdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchDfnJrsdctnCdgUsrSltd("]]");}


		/******************** RsrchDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(researchdefinitionjurisdictioncodingi == 0) {r.addRsrchDfnJrsdctnCdgSys("[[");}
		if(researchdefinitionjurisdictioncoding.hasSystem()) {

			r.addRsrchDfnJrsdctnCdgSys(String.valueOf(researchdefinitionjurisdictioncoding.getSystem()));
		} else {
			r.addRsrchDfnJrsdctnCdgSys("NULL");
		}

		if(researchdefinitionjurisdictioncodingi == researchdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** researchdefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> researchdefinitionusecontextlist = researchdefinition.getUseContext();
		for(int researchdefinitionusecontexti = 0; researchdefinitionusecontexti<researchdefinitionusecontextlist.size();researchdefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  researchdefinitionusecontext = researchdefinitionusecontextlist.get(researchdefinitionusecontexti);

		/******************** researchdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchdefinitionusecontextcode = researchdefinitionusecontext.getCode();

		/******************** RsrchDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtCdDsply("[");}
		if(researchdefinitionusecontextcode.hasDisplay()) {

			r.addRsrchDfnUseCntxtCdDsply(String.valueOf(researchdefinitionusecontextcode.getDisplay()));
		} else {
			r.addRsrchDfnUseCntxtCdDsply("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtCdDsply("]");}


		/******************** RsrchDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtCdVrsn("[");}
		if(researchdefinitionusecontextcode.hasVersion()) {

			r.addRsrchDfnUseCntxtCdVrsn(String.valueOf(researchdefinitionusecontextcode.getVersion()));
		} else {
			r.addRsrchDfnUseCntxtCdVrsn("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtCdVrsn("]");}


		/******************** RsrchDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtCdUsrSltd("[");}
		if(researchdefinitionusecontextcode.hasUserSelected()) {

			r.addRsrchDfnUseCntxtCdUsrSltd(String.valueOf(researchdefinitionusecontextcode.getUserSelected()));
		} else {
			r.addRsrchDfnUseCntxtCdUsrSltd("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtCdUsrSltd("]");}


		/******************** RsrchDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtCdSys("[");}
		if(researchdefinitionusecontextcode.hasSystem()) {

			r.addRsrchDfnUseCntxtCdSys(String.valueOf(researchdefinitionusecontextcode.getSystem()));
		} else {
			r.addRsrchDfnUseCntxtCdSys("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtCdSys("]");}


		/******************** RsrchDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRfrnc("[");}
		if(researchdefinitionusecontext.hasValueReference()) {

			if(researchdefinitionusecontext.getValueReference().getReference() != null) {
			r.addRsrchDfnUseCntxtVlRfrnc(researchdefinitionusecontext.getValueReference().getReference());
			}
		} else {
			r.addRsrchDfnUseCntxtVlRfrnc("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRfrnc("]");}


		/******************** researchdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchdefinitionusecontextvaluecodeableconcept = researchdefinitionusecontext.getValueCodeableConcept();

		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlCdbleCncptTxt("[");}
		if(researchdefinitionusecontextvaluecodeableconcept.hasText()) {

			r.addRsrchDfnUseCntxtVlCdbleCncptTxt(String.valueOf(researchdefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			r.addRsrchDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** researchdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchdefinitionusecontextvaluecodeableconceptcodinglist = researchdefinitionusecontextvaluecodeableconcept.getCoding();
		for(int researchdefinitionusecontextvaluecodeableconceptcodingi = 0; researchdefinitionusecontextvaluecodeableconceptcodingi<researchdefinitionusecontextvaluecodeableconceptcodinglist.size();researchdefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchdefinitionusecontextvaluecodeableconceptcoding = researchdefinitionusecontextvaluecodeableconceptcodinglist.get(researchdefinitionusecontextvaluecodeableconceptcodingi);

		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			r.addRsrchDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			r.addRsrchDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(researchdefinitionusecontextvaluecodeableconceptcodingi == researchdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			r.addRsrchDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			r.addRsrchDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(researchdefinitionusecontextvaluecodeableconceptcodingi == researchdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			r.addRsrchDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			r.addRsrchDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(researchdefinitionusecontextvaluecodeableconceptcodingi == researchdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			r.addRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			r.addRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(researchdefinitionusecontextvaluecodeableconceptcodingi == researchdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** RsrchDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(researchdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			r.addRsrchDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(researchdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			r.addRsrchDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(researchdefinitionusecontextvaluecodeableconceptcodingi == researchdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** researchdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchdefinitionusecontextvaluerange = researchdefinitionusecontext.getValueRange();

		/******************** researchdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluerangelow = researchdefinitionusecontextvaluerange.getLow();

		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngLwVl("[");}
		if(researchdefinitionusecontextvaluerangelow.hasValue()) {

			r.addRsrchDfnUseCntxtVlRngLwVl(String.valueOf(researchdefinitionusecontextvaluerangelow.getValue()));
		} else {
			r.addRsrchDfnUseCntxtVlRngLwVl("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngLwVl("]");}


		/******************** researchdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchdefinitionusecontextvaluerangelowcomparator = researchdefinitionusecontextvaluerangelow.getComparator();
		if(researchdefinitionusecontextvaluerangelowcomparator!=null) {
		if(researchdefinitionusecontexti == 0) {

		r.addRsrchDfnUseCntxtVlRngLwCmprtr("[");		}
			r.addRsrchDfnUseCntxtVlRngLwCmprtr(researchdefinitionusecontextvaluerangelowcomparator.toCode());
		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {

		r.addRsrchDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			r.addRsrchDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngLwCd("[");}
		if(researchdefinitionusecontextvaluerangelow.hasCode()) {

			r.addRsrchDfnUseCntxtVlRngLwCd(String.valueOf(researchdefinitionusecontextvaluerangelow.getCode()));
		} else {
			r.addRsrchDfnUseCntxtVlRngLwCd("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngLwCd("]");}


		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngLwUnt("[");}
		if(researchdefinitionusecontextvaluerangelow.hasUnit()) {

			r.addRsrchDfnUseCntxtVlRngLwUnt(String.valueOf(researchdefinitionusecontextvaluerangelow.getUnit()));
		} else {
			r.addRsrchDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngLwUnt("]");}


		/******************** RsrchDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngLwSys("[");}
		if(researchdefinitionusecontextvaluerangelow.hasSystem()) {

			r.addRsrchDfnUseCntxtVlRngLwSys(String.valueOf(researchdefinitionusecontextvaluerangelow.getSystem()));
		} else {
			r.addRsrchDfnUseCntxtVlRngLwSys("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngLwSys("]");}


		/******************** researchdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluerangehigh = researchdefinitionusecontextvaluerange.getHigh();

		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngHiVl("[");}
		if(researchdefinitionusecontextvaluerangehigh.hasValue()) {

			r.addRsrchDfnUseCntxtVlRngHiVl(String.valueOf(researchdefinitionusecontextvaluerangehigh.getValue()));
		} else {
			r.addRsrchDfnUseCntxtVlRngHiVl("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngHiVl("]");}


		/******************** researchdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchdefinitionusecontextvaluerangehighcomparator = researchdefinitionusecontextvaluerangehigh.getComparator();
		if(researchdefinitionusecontextvaluerangehighcomparator!=null) {
		if(researchdefinitionusecontexti == 0) {

		r.addRsrchDfnUseCntxtVlRngHiCmprtr("[");		}
			r.addRsrchDfnUseCntxtVlRngHiCmprtr(researchdefinitionusecontextvaluerangehighcomparator.toCode());
		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {

		r.addRsrchDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			r.addRsrchDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngHiCd("[");}
		if(researchdefinitionusecontextvaluerangehigh.hasCode()) {

			r.addRsrchDfnUseCntxtVlRngHiCd(String.valueOf(researchdefinitionusecontextvaluerangehigh.getCode()));
		} else {
			r.addRsrchDfnUseCntxtVlRngHiCd("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngHiCd("]");}


		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngHiUnt("[");}
		if(researchdefinitionusecontextvaluerangehigh.hasUnit()) {

			r.addRsrchDfnUseCntxtVlRngHiUnt(String.valueOf(researchdefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			r.addRsrchDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngHiUnt("]");}


		/******************** RsrchDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlRngHiSys("[");}
		if(researchdefinitionusecontextvaluerangehigh.hasSystem()) {

			r.addRsrchDfnUseCntxtVlRngHiSys(String.valueOf(researchdefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			r.addRsrchDfnUseCntxtVlRngHiSys("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlRngHiSys("]");}


		/******************** researchdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchdefinitionusecontextvaluequantity = researchdefinitionusecontext.getValueQuantity();

		/******************** RsrchDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlQntyVl("[");}
		if(researchdefinitionusecontextvaluequantity.hasValue()) {

			r.addRsrchDfnUseCntxtVlQntyVl(String.valueOf(researchdefinitionusecontextvaluequantity.getValue()));
		} else {
			r.addRsrchDfnUseCntxtVlQntyVl("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlQntyVl("]");}


		/******************** researchdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchdefinitionusecontextvaluequantitycomparator = researchdefinitionusecontextvaluequantity.getComparator();
		if(researchdefinitionusecontextvaluequantitycomparator!=null) {
		if(researchdefinitionusecontexti == 0) {

		r.addRsrchDfnUseCntxtVlQntyCmprtr("[");		}
			r.addRsrchDfnUseCntxtVlQntyCmprtr(researchdefinitionusecontextvaluequantitycomparator.toCode());
		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {

		r.addRsrchDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			r.addRsrchDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** RsrchDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlQntyCd("[");}
		if(researchdefinitionusecontextvaluequantity.hasCode()) {

			r.addRsrchDfnUseCntxtVlQntyCd(String.valueOf(researchdefinitionusecontextvaluequantity.getCode()));
		} else {
			r.addRsrchDfnUseCntxtVlQntyCd("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlQntyCd("]");}


		/******************** RsrchDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlQntyUnt("[");}
		if(researchdefinitionusecontextvaluequantity.hasUnit()) {

			r.addRsrchDfnUseCntxtVlQntyUnt(String.valueOf(researchdefinitionusecontextvaluequantity.getUnit()));
		} else {
			r.addRsrchDfnUseCntxtVlQntyUnt("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlQntyUnt("]");}


		/******************** RsrchDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(researchdefinitionusecontexti == 0) {r.addRsrchDfnUseCntxtVlQntySys("[");}
		if(researchdefinitionusecontextvaluequantity.hasSystem()) {

			r.addRsrchDfnUseCntxtVlQntySys(String.valueOf(researchdefinitionusecontextvaluequantity.getSystem()));
		} else {
			r.addRsrchDfnUseCntxtVlQntySys("NULL");
		}

		if(researchdefinitionusecontexti == researchdefinitionusecontextlist.size()-1) {r.addRsrchDfnUseCntxtVlQntySys("]");}


		 };
		/******************** RsrchDfn_Exprmtl ********************************************************************************/
		if(researchdefinition.hasExperimental()) {

			r.addRsrchDfnExprmtl(String.valueOf(researchdefinition.getExperimental()));
		} else {
			r.addRsrchDfnExprmtl("NULL");
		}


		/******************** RsrchDfn_Pblshr ********************************************************************************/
		if(researchdefinition.hasPublisher()) {

			r.addRsrchDfnPblshr(String.valueOf(researchdefinition.getPublisher()));
		} else {
			r.addRsrchDfnPblshr("NULL");
		}


		/******************** researchdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitioneffectiveperiod = researchdefinition.getEffectivePeriod();

		/******************** RsrchDfn_EfctivePrd_Strt ********************************************************************************/
		if(researchdefinitioneffectiveperiod.hasStart()) {

			r.addRsrchDfnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitioneffectiveperiod.getStart())+"\"");
		} else {
			r.addRsrchDfnEfctivePrdStrt("NULL");
		}


		/******************** RsrchDfn_EfctivePrd_End ********************************************************************************/
		if(researchdefinitioneffectiveperiod.hasEnd()) {

			r.addRsrchDfnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitioneffectiveperiod.getEnd())+"\"");
		} else {
			r.addRsrchDfnEfctivePrdEnd("NULL");
		}


		/******************** RsrchDfn_ExposureAlternative ********************************************************************************/
		if(researchdefinition.hasExposureAlternative()) {

			if(researchdefinition.getExposureAlternative().getReference() != null) {
			r.addRsrchDfnExposureAlternative(researchdefinition.getExposureAlternative().getReference());
			}
		} else {
			r.addRsrchDfnExposureAlternative("NULL");
		}


		/******************** researchdefinitionauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchdefinitionauthorlist = researchdefinition.getAuthor();
		for(int researchdefinitionauthori = 0; researchdefinitionauthori<researchdefinitionauthorlist.size();researchdefinitionauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchdefinitionauthor = researchdefinitionauthorlist.get(researchdefinitionauthori);

		/******************** RsrchDfn_Athr_Nm ********************************************************************************/
		if(researchdefinitionauthori == 0) {r.addRsrchDfnAthrNm("[");}
		if(researchdefinitionauthor.hasName()) {

			r.addRsrchDfnAthrNm(String.valueOf(researchdefinitionauthor.getName()));
		} else {
			r.addRsrchDfnAthrNm("NULL");
		}

		if(researchdefinitionauthori == researchdefinitionauthorlist.size()-1) {r.addRsrchDfnAthrNm("]");}


		/******************** researchdefinitionauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchdefinitionauthortelecomlist = researchdefinitionauthor.getTelecom();
		for(int researchdefinitionauthortelecomi = 0; researchdefinitionauthortelecomi<researchdefinitionauthortelecomlist.size();researchdefinitionauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchdefinitionauthortelecom = researchdefinitionauthortelecomlist.get(researchdefinitionauthortelecomi);

		/******************** RsrchDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(researchdefinitionauthortelecomi == 0) {r.addRsrchDfnAthrTlcmVl("[[");}
		if(researchdefinitionauthortelecom.hasValue()) {

			r.addRsrchDfnAthrTlcmVl(String.valueOf(researchdefinitionauthortelecom.getValue()));
		} else {
			r.addRsrchDfnAthrTlcmVl("NULL");
		}

		if(researchdefinitionauthortelecomi == researchdefinitionauthortelecomlist.size()-1) {r.addRsrchDfnAthrTlcmVl("]]");}


		/******************** researchdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchdefinitionauthortelecomperiod = researchdefinitionauthortelecom.getPeriod();

		/******************** RsrchDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchdefinitionauthortelecomi == 0) {r.addRsrchDfnAthrTlcmPrdStrt("[[");}
		if(researchdefinitionauthortelecomperiod.hasStart()) {

			r.addRsrchDfnAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionauthortelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchDfnAthrTlcmPrdStrt("NULL");
		}

		if(researchdefinitionauthortelecomi == researchdefinitionauthortelecomlist.size()-1) {r.addRsrchDfnAthrTlcmPrdStrt("]]");}


		/******************** RsrchDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(researchdefinitionauthortelecomi == 0) {r.addRsrchDfnAthrTlcmPrdEnd("[[");}
		if(researchdefinitionauthortelecomperiod.hasEnd()) {

			r.addRsrchDfnAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchdefinitionauthortelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchDfnAthrTlcmPrdEnd("NULL");
		}

		if(researchdefinitionauthortelecomi == researchdefinitionauthortelecomlist.size()-1) {r.addRsrchDfnAthrTlcmPrdEnd("]]");}


		/******************** researchdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchdefinitionauthortelecomuse = researchdefinitionauthortelecom.getUse();
		if(researchdefinitionauthortelecomuse!=null) {
		if(researchdefinitionauthortelecomi == 0) {

		r.addRsrchDfnAthrTlcmUse("[[");		}
			r.addRsrchDfnAthrTlcmUse(researchdefinitionauthortelecomuse.toCode());
		if(researchdefinitionauthortelecomi == researchdefinitionauthortelecomlist.size()-1) {

		r.addRsrchDfnAthrTlcmUse("]]");		}

		} else {
			r.addRsrchDfnAthrTlcmUse("NULL");
		}

		/******************** researchdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchdefinitionauthortelecomsystem = researchdefinitionauthortelecom.getSystem();
		if(researchdefinitionauthortelecomsystem!=null) {
		if(researchdefinitionauthortelecomi == 0) {

		r.addRsrchDfnAthrTlcmSys("[[");		}
			r.addRsrchDfnAthrTlcmSys(researchdefinitionauthortelecomsystem.toCode());
		if(researchdefinitionauthortelecomi == researchdefinitionauthortelecomlist.size()-1) {

		r.addRsrchDfnAthrTlcmSys("]]");		}

		} else {
			r.addRsrchDfnAthrTlcmSys("NULL");
		}

		/******************** RsrchDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(researchdefinitionauthortelecomi == 0) {r.addRsrchDfnAthrTlcmRnk("[[");}
		if(researchdefinitionauthortelecom.hasRank()) {

			r.addRsrchDfnAthrTlcmRnk(String.valueOf(researchdefinitionauthortelecom.getRank()));
		} else {
			r.addRsrchDfnAthrTlcmRnk("NULL");
		}

		if(researchdefinitionauthortelecomi == researchdefinitionauthortelecomlist.size()-1) {r.addRsrchDfnAthrTlcmRnk("]]");}


		 };
		 };
		return r;
	}
}
