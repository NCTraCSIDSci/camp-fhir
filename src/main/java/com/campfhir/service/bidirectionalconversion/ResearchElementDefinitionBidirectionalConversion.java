package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchElementDefinition;
public class ResearchElementDefinitionBidirectionalConversion 
{
	public ResearchElementDefinition ResearchElementDefinitions(org.hl7.fhir.r4.model.ResearchElementDefinition researchelementdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchElementDefinition r = new  main.java.com.campfhir.model.ResearchElementDefinition();

		/******************** id ********************************************************************************/
		r.setId(researchelementdefinition.getIdElement().getIdPart());

		/******************** RsrchElmntDfn_Nm ********************************************************************************/
		if(researchelementdefinition.hasName()) {

			r.addRsrchElmntDfnNm(String.valueOf(researchelementdefinition.getName()));
		} else {
			r.addRsrchElmntDfnNm("NULL");
		}


		/******************** researchelementdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementType researchelementdefinitiontype = researchelementdefinition.getType();
		if(researchelementdefinitiontype!=null) {
			r.addRsrchElmntDfnTyp(researchelementdefinitiontype.toCode());
		} else {
			r.addRsrchElmntDfnTyp("NULL");
		}

		/******************** RsrchElmntDfn_Comment ********************************************************************************/
		if(researchelementdefinition.hasComment()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinition.getComment().size(); incr++) {
				array = array + researchelementdefinition.getComment().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnComment(array);

		} else {
			r.addRsrchElmntDfnComment("NULL");
		}


		/******************** RsrchElmntDfn_Vrsn ********************************************************************************/
		if(researchelementdefinition.hasVersion()) {

			r.addRsrchElmntDfnVrsn(String.valueOf(researchelementdefinition.getVersion()));
		} else {
			r.addRsrchElmntDfnVrsn("NULL");
		}


		/******************** RsrchElmntDfn_Dt ********************************************************************************/
		if(researchelementdefinition.hasDate()) {

			r.addRsrchElmntDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinition.getDate())+"\"");
		} else {
			r.addRsrchElmntDfnDt("NULL");
		}


		/******************** researchelementdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus researchelementdefinitionstatus = researchelementdefinition.getStatus();
		if(researchelementdefinitionstatus!=null) {
			r.addRsrchElmntDfnSts(researchelementdefinitionstatus.toCode());
		} else {
			r.addRsrchElmntDfnSts("NULL");
		}

		/******************** RsrchElmntDfn_Dscrptn ********************************************************************************/
		if(researchelementdefinition.hasDescription()) {

			r.addRsrchElmntDfnDscrptn(String.valueOf(researchelementdefinition.getDescription()));
		} else {
			r.addRsrchElmntDfnDscrptn("NULL");
		}


		/******************** researchelementdefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> researchelementdefinitionidentifierlist = researchelementdefinition.getIdentifier();
		for(int researchelementdefinitionidentifieri = 0; researchelementdefinitionidentifieri<researchelementdefinitionidentifierlist.size();researchelementdefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  researchelementdefinitionidentifier = researchelementdefinitionidentifierlist.get(researchelementdefinitionidentifieri);

		/******************** RsrchElmntDfn_Id_Vl ********************************************************************************/
		if(researchelementdefinitionidentifieri == 0) {r.addRsrchElmntDfnIdVl("[");}
		if(researchelementdefinitionidentifier.hasValue()) {

			r.addRsrchElmntDfnIdVl(String.valueOf(researchelementdefinitionidentifier.getValue()));
		} else {
			r.addRsrchElmntDfnIdVl("NULL");
		}

		if(researchelementdefinitionidentifieri == researchelementdefinitionidentifierlist.size()-1) {r.addRsrchElmntDfnIdVl("]");}


		/******************** researchelementdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionidentifiertype = researchelementdefinitionidentifier.getType();

		/******************** RsrchElmntDfn_Id_Typ_Txt ********************************************************************************/
		if(researchelementdefinitionidentifieri == 0) {r.addRsrchElmntDfnIdTypTxt("[");}
		if(researchelementdefinitionidentifiertype.hasText()) {

			r.addRsrchElmntDfnIdTypTxt(String.valueOf(researchelementdefinitionidentifiertype.getText()));
		} else {
			r.addRsrchElmntDfnIdTypTxt("NULL");
		}

		if(researchelementdefinitionidentifieri == researchelementdefinitionidentifierlist.size()-1) {r.addRsrchElmntDfnIdTypTxt("]");}


		/******************** researchelementdefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitionidentifiertypecodinglist = researchelementdefinitionidentifiertype.getCoding();
		for(int researchelementdefinitionidentifiertypecodingi = 0; researchelementdefinitionidentifiertypecodingi<researchelementdefinitionidentifiertypecodinglist.size();researchelementdefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitionidentifiertypecoding = researchelementdefinitionidentifiertypecodinglist.get(researchelementdefinitionidentifiertypecodingi);

		/******************** RsrchElmntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionidentifiertypecodingi == 0) {r.addRsrchElmntDfnIdTypCdgDsply("[[");}
		if(researchelementdefinitionidentifiertypecoding.hasDisplay()) {

			r.addRsrchElmntDfnIdTypCdgDsply(String.valueOf(researchelementdefinitionidentifiertypecoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnIdTypCdgDsply("NULL");
		}

		if(researchelementdefinitionidentifiertypecodingi == researchelementdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchElmntDfnIdTypCdgDsply("]]");}


		/******************** RsrchElmntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionidentifiertypecodingi == 0) {r.addRsrchElmntDfnIdTypCdgVrsn("[[");}
		if(researchelementdefinitionidentifiertypecoding.hasVersion()) {

			r.addRsrchElmntDfnIdTypCdgVrsn(String.valueOf(researchelementdefinitionidentifiertypecoding.getVersion()));
		} else {
			r.addRsrchElmntDfnIdTypCdgVrsn("NULL");
		}

		if(researchelementdefinitionidentifiertypecodingi == researchelementdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchElmntDfnIdTypCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionidentifiertypecodingi == 0) {r.addRsrchElmntDfnIdTypCdgCd("[[");}
		if(researchelementdefinitionidentifiertypecoding.hasCode()) {

			r.addRsrchElmntDfnIdTypCdgCd(String.valueOf(researchelementdefinitionidentifiertypecoding.getCode()));
		} else {
			r.addRsrchElmntDfnIdTypCdgCd("NULL");
		}

		if(researchelementdefinitionidentifiertypecodingi == researchelementdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchElmntDfnIdTypCdgCd("]]");}


		/******************** RsrchElmntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionidentifiertypecodingi == 0) {r.addRsrchElmntDfnIdTypCdgUsrSltd("[[");}
		if(researchelementdefinitionidentifiertypecoding.hasUserSelected()) {

			r.addRsrchElmntDfnIdTypCdgUsrSltd(String.valueOf(researchelementdefinitionidentifiertypecoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnIdTypCdgUsrSltd("NULL");
		}

		if(researchelementdefinitionidentifiertypecodingi == researchelementdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchElmntDfnIdTypCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionidentifiertypecodingi == 0) {r.addRsrchElmntDfnIdTypCdgSys("[[");}
		if(researchelementdefinitionidentifiertypecoding.hasSystem()) {

			r.addRsrchElmntDfnIdTypCdgSys(String.valueOf(researchelementdefinitionidentifiertypecoding.getSystem()));
		} else {
			r.addRsrchElmntDfnIdTypCdgSys("NULL");
		}

		if(researchelementdefinitionidentifiertypecodingi == researchelementdefinitionidentifiertypecodinglist.size()-1) {r.addRsrchElmntDfnIdTypCdgSys("]]");}


		 };
		/******************** researchelementdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionidentifierperiod = researchelementdefinitionidentifier.getPeriod();

		/******************** RsrchElmntDfn_Id_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionidentifieri == 0) {r.addRsrchElmntDfnIdPrdStrt("[");}
		if(researchelementdefinitionidentifierperiod.hasStart()) {

			r.addRsrchElmntDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionidentifierperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnIdPrdStrt("NULL");
		}

		if(researchelementdefinitionidentifieri == researchelementdefinitionidentifierlist.size()-1) {r.addRsrchElmntDfnIdPrdStrt("]");}


		/******************** RsrchElmntDfn_Id_Prd_End ********************************************************************************/
		if(researchelementdefinitionidentifieri == 0) {r.addRsrchElmntDfnIdPrdEnd("[");}
		if(researchelementdefinitionidentifierperiod.hasEnd()) {

			r.addRsrchElmntDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionidentifierperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnIdPrdEnd("NULL");
		}

		if(researchelementdefinitionidentifieri == researchelementdefinitionidentifierlist.size()-1) {r.addRsrchElmntDfnIdPrdEnd("]");}


		/******************** researchelementdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchelementdefinitionidentifieruse = researchelementdefinitionidentifier.getUse();
		if(researchelementdefinitionidentifieruse!=null) {
		if(researchelementdefinitionidentifieri == 0) {

		r.addRsrchElmntDfnIdUse("[");		}
			r.addRsrchElmntDfnIdUse(researchelementdefinitionidentifieruse.toCode());
		if(researchelementdefinitionidentifieri == researchelementdefinitionidentifierlist.size()-1) {

		r.addRsrchElmntDfnIdUse("]");		}

		} else {
			r.addRsrchElmntDfnIdUse("NULL");
		}

		/******************** RsrchElmntDfn_Id_Assigner ********************************************************************************/
		if(researchelementdefinitionidentifieri == 0) {r.addRsrchElmntDfnIdAssigner("[");}
		if(researchelementdefinitionidentifier.hasAssigner()) {

			if(researchelementdefinitionidentifier.getAssigner().getReference() != null) {
			r.addRsrchElmntDfnIdAssigner(researchelementdefinitionidentifier.getAssigner().getReference());
			}
		} else {
			r.addRsrchElmntDfnIdAssigner("NULL");
		}

		if(researchelementdefinitionidentifieri == researchelementdefinitionidentifierlist.size()-1) {r.addRsrchElmntDfnIdAssigner("]");}


		/******************** RsrchElmntDfn_Id_Sys ********************************************************************************/
		if(researchelementdefinitionidentifieri == 0) {r.addRsrchElmntDfnIdSys("[");}
		if(researchelementdefinitionidentifier.hasSystem()) {

			r.addRsrchElmntDfnIdSys(String.valueOf(researchelementdefinitionidentifier.getSystem()));
		} else {
			r.addRsrchElmntDfnIdSys("NULL");
		}

		if(researchelementdefinitionidentifieri == researchelementdefinitionidentifierlist.size()-1) {r.addRsrchElmntDfnIdSys("]");}


		 };
		/******************** researchelementdefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchelementdefinitioncontactlist = researchelementdefinition.getContact();
		for(int researchelementdefinitioncontacti = 0; researchelementdefinitioncontacti<researchelementdefinitioncontactlist.size();researchelementdefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchelementdefinitioncontact = researchelementdefinitioncontactlist.get(researchelementdefinitioncontacti);

		/******************** RsrchElmntDfn_Cntct_Nm ********************************************************************************/
		if(researchelementdefinitioncontacti == 0) {r.addRsrchElmntDfnCntctNm("[");}
		if(researchelementdefinitioncontact.hasName()) {

			r.addRsrchElmntDfnCntctNm(String.valueOf(researchelementdefinitioncontact.getName()));
		} else {
			r.addRsrchElmntDfnCntctNm("NULL");
		}

		if(researchelementdefinitioncontacti == researchelementdefinitioncontactlist.size()-1) {r.addRsrchElmntDfnCntctNm("]");}


		/******************** researchelementdefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchelementdefinitioncontacttelecomlist = researchelementdefinitioncontact.getTelecom();
		for(int researchelementdefinitioncontacttelecomi = 0; researchelementdefinitioncontacttelecomi<researchelementdefinitioncontacttelecomlist.size();researchelementdefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchelementdefinitioncontacttelecom = researchelementdefinitioncontacttelecomlist.get(researchelementdefinitioncontacttelecomi);

		/******************** RsrchElmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitioncontacttelecomi == 0) {r.addRsrchElmntDfnCntctTlcmVl("[[");}
		if(researchelementdefinitioncontacttelecom.hasValue()) {

			r.addRsrchElmntDfnCntctTlcmVl(String.valueOf(researchelementdefinitioncontacttelecom.getValue()));
		} else {
			r.addRsrchElmntDfnCntctTlcmVl("NULL");
		}

		if(researchelementdefinitioncontacttelecomi == researchelementdefinitioncontacttelecomlist.size()-1) {r.addRsrchElmntDfnCntctTlcmVl("]]");}


		/******************** researchelementdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncontacttelecomperiod = researchelementdefinitioncontacttelecom.getPeriod();

		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitioncontacttelecomi == 0) {r.addRsrchElmntDfnCntctTlcmPrdStrt("[[");}
		if(researchelementdefinitioncontacttelecomperiod.hasStart()) {

			r.addRsrchElmntDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnCntctTlcmPrdStrt("NULL");
		}

		if(researchelementdefinitioncontacttelecomi == researchelementdefinitioncontacttelecomlist.size()-1) {r.addRsrchElmntDfnCntctTlcmPrdStrt("]]");}


		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitioncontacttelecomi == 0) {r.addRsrchElmntDfnCntctTlcmPrdEnd("[[");}
		if(researchelementdefinitioncontacttelecomperiod.hasEnd()) {

			r.addRsrchElmntDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnCntctTlcmPrdEnd("NULL");
		}

		if(researchelementdefinitioncontacttelecomi == researchelementdefinitioncontacttelecomlist.size()-1) {r.addRsrchElmntDfnCntctTlcmPrdEnd("]]");}


		/******************** researchelementdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitioncontacttelecomuse = researchelementdefinitioncontacttelecom.getUse();
		if(researchelementdefinitioncontacttelecomuse!=null) {
		if(researchelementdefinitioncontacttelecomi == 0) {

		r.addRsrchElmntDfnCntctTlcmUse("[[");		}
			r.addRsrchElmntDfnCntctTlcmUse(researchelementdefinitioncontacttelecomuse.toCode());
		if(researchelementdefinitioncontacttelecomi == researchelementdefinitioncontacttelecomlist.size()-1) {

		r.addRsrchElmntDfnCntctTlcmUse("]]");		}

		} else {
			r.addRsrchElmntDfnCntctTlcmUse("NULL");
		}

		/******************** researchelementdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitioncontacttelecomsystem = researchelementdefinitioncontacttelecom.getSystem();
		if(researchelementdefinitioncontacttelecomsystem!=null) {
		if(researchelementdefinitioncontacttelecomi == 0) {

		r.addRsrchElmntDfnCntctTlcmSys("[[");		}
			r.addRsrchElmntDfnCntctTlcmSys(researchelementdefinitioncontacttelecomsystem.toCode());
		if(researchelementdefinitioncontacttelecomi == researchelementdefinitioncontacttelecomlist.size()-1) {

		r.addRsrchElmntDfnCntctTlcmSys("]]");		}

		} else {
			r.addRsrchElmntDfnCntctTlcmSys("NULL");
		}

		/******************** RsrchElmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitioncontacttelecomi == 0) {r.addRsrchElmntDfnCntctTlcmRnk("[[");}
		if(researchelementdefinitioncontacttelecom.hasRank()) {

			r.addRsrchElmntDfnCntctTlcmRnk(String.valueOf(researchelementdefinitioncontacttelecom.getRank()));
		} else {
			r.addRsrchElmntDfnCntctTlcmRnk("NULL");
		}

		if(researchelementdefinitioncontacttelecomi == researchelementdefinitioncontacttelecomlist.size()-1) {r.addRsrchElmntDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** RsrchElmntDfn_Copyright ********************************************************************************/
		if(researchelementdefinition.hasCopyright()) {

			r.addRsrchElmntDfnCopyright(String.valueOf(researchelementdefinition.getCopyright()));
		} else {
			r.addRsrchElmntDfnCopyright("NULL");
		}


		/******************** RsrchElmntDfn_ApprovalDt ********************************************************************************/
		if(researchelementdefinition.hasApprovalDate()) {

			r.addRsrchElmntDfnApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinition.getApprovalDate())+"\"");
		} else {
			r.addRsrchElmntDfnApprovalDt("NULL");
		}


		/******************** researchelementdefinitionendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchelementdefinitionendorserlist = researchelementdefinition.getEndorser();
		for(int researchelementdefinitionendorseri = 0; researchelementdefinitionendorseri<researchelementdefinitionendorserlist.size();researchelementdefinitionendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchelementdefinitionendorser = researchelementdefinitionendorserlist.get(researchelementdefinitionendorseri);

		/******************** RsrchElmntDfn_Endsr_Nm ********************************************************************************/
		if(researchelementdefinitionendorseri == 0) {r.addRsrchElmntDfnEndsrNm("[");}
		if(researchelementdefinitionendorser.hasName()) {

			r.addRsrchElmntDfnEndsrNm(String.valueOf(researchelementdefinitionendorser.getName()));
		} else {
			r.addRsrchElmntDfnEndsrNm("NULL");
		}

		if(researchelementdefinitionendorseri == researchelementdefinitionendorserlist.size()-1) {r.addRsrchElmntDfnEndsrNm("]");}


		/******************** researchelementdefinitionendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchelementdefinitionendorsertelecomlist = researchelementdefinitionendorser.getTelecom();
		for(int researchelementdefinitionendorsertelecomi = 0; researchelementdefinitionendorsertelecomi<researchelementdefinitionendorsertelecomlist.size();researchelementdefinitionendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchelementdefinitionendorsertelecom = researchelementdefinitionendorsertelecomlist.get(researchelementdefinitionendorsertelecomi);

		/******************** RsrchElmntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitionendorsertelecomi == 0) {r.addRsrchElmntDfnEndsrTlcmVl("[[");}
		if(researchelementdefinitionendorsertelecom.hasValue()) {

			r.addRsrchElmntDfnEndsrTlcmVl(String.valueOf(researchelementdefinitionendorsertelecom.getValue()));
		} else {
			r.addRsrchElmntDfnEndsrTlcmVl("NULL");
		}

		if(researchelementdefinitionendorsertelecomi == researchelementdefinitionendorsertelecomlist.size()-1) {r.addRsrchElmntDfnEndsrTlcmVl("]]");}


		/******************** researchelementdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionendorsertelecomperiod = researchelementdefinitionendorsertelecom.getPeriod();

		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionendorsertelecomi == 0) {r.addRsrchElmntDfnEndsrTlcmPrdStrt("[[");}
		if(researchelementdefinitionendorsertelecomperiod.hasStart()) {

			r.addRsrchElmntDfnEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionendorsertelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnEndsrTlcmPrdStrt("NULL");
		}

		if(researchelementdefinitionendorsertelecomi == researchelementdefinitionendorsertelecomlist.size()-1) {r.addRsrchElmntDfnEndsrTlcmPrdStrt("]]");}


		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitionendorsertelecomi == 0) {r.addRsrchElmntDfnEndsrTlcmPrdEnd("[[");}
		if(researchelementdefinitionendorsertelecomperiod.hasEnd()) {

			r.addRsrchElmntDfnEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionendorsertelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnEndsrTlcmPrdEnd("NULL");
		}

		if(researchelementdefinitionendorsertelecomi == researchelementdefinitionendorsertelecomlist.size()-1) {r.addRsrchElmntDfnEndsrTlcmPrdEnd("]]");}


		/******************** researchelementdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitionendorsertelecomuse = researchelementdefinitionendorsertelecom.getUse();
		if(researchelementdefinitionendorsertelecomuse!=null) {
		if(researchelementdefinitionendorsertelecomi == 0) {

		r.addRsrchElmntDfnEndsrTlcmUse("[[");		}
			r.addRsrchElmntDfnEndsrTlcmUse(researchelementdefinitionendorsertelecomuse.toCode());
		if(researchelementdefinitionendorsertelecomi == researchelementdefinitionendorsertelecomlist.size()-1) {

		r.addRsrchElmntDfnEndsrTlcmUse("]]");		}

		} else {
			r.addRsrchElmntDfnEndsrTlcmUse("NULL");
		}

		/******************** researchelementdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitionendorsertelecomsystem = researchelementdefinitionendorsertelecom.getSystem();
		if(researchelementdefinitionendorsertelecomsystem!=null) {
		if(researchelementdefinitionendorsertelecomi == 0) {

		r.addRsrchElmntDfnEndsrTlcmSys("[[");		}
			r.addRsrchElmntDfnEndsrTlcmSys(researchelementdefinitionendorsertelecomsystem.toCode());
		if(researchelementdefinitionendorsertelecomi == researchelementdefinitionendorsertelecomlist.size()-1) {

		r.addRsrchElmntDfnEndsrTlcmSys("]]");		}

		} else {
			r.addRsrchElmntDfnEndsrTlcmSys("NULL");
		}

		/******************** RsrchElmntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitionendorsertelecomi == 0) {r.addRsrchElmntDfnEndsrTlcmRnk("[[");}
		if(researchelementdefinitionendorsertelecom.hasRank()) {

			r.addRsrchElmntDfnEndsrTlcmRnk(String.valueOf(researchelementdefinitionendorsertelecom.getRank()));
		} else {
			r.addRsrchElmntDfnEndsrTlcmRnk("NULL");
		}

		if(researchelementdefinitionendorsertelecomi == researchelementdefinitionendorsertelecomlist.size()-1) {r.addRsrchElmntDfnEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** RsrchElmntDfn_LastReviewDt ********************************************************************************/
		if(researchelementdefinition.hasLastReviewDate()) {

			r.addRsrchElmntDfnLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinition.getLastReviewDate())+"\"");
		} else {
			r.addRsrchElmntDfnLastReviewDt("NULL");
		}


		/******************** researchelementdefinitioneditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchelementdefinitioneditorlist = researchelementdefinition.getEditor();
		for(int researchelementdefinitioneditori = 0; researchelementdefinitioneditori<researchelementdefinitioneditorlist.size();researchelementdefinitioneditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchelementdefinitioneditor = researchelementdefinitioneditorlist.get(researchelementdefinitioneditori);

		/******************** RsrchElmntDfn_Editor_Nm ********************************************************************************/
		if(researchelementdefinitioneditori == 0) {r.addRsrchElmntDfnEditorNm("[");}
		if(researchelementdefinitioneditor.hasName()) {

			r.addRsrchElmntDfnEditorNm(String.valueOf(researchelementdefinitioneditor.getName()));
		} else {
			r.addRsrchElmntDfnEditorNm("NULL");
		}

		if(researchelementdefinitioneditori == researchelementdefinitioneditorlist.size()-1) {r.addRsrchElmntDfnEditorNm("]");}


		/******************** researchelementdefinitioneditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchelementdefinitioneditortelecomlist = researchelementdefinitioneditor.getTelecom();
		for(int researchelementdefinitioneditortelecomi = 0; researchelementdefinitioneditortelecomi<researchelementdefinitioneditortelecomlist.size();researchelementdefinitioneditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchelementdefinitioneditortelecom = researchelementdefinitioneditortelecomlist.get(researchelementdefinitioneditortelecomi);

		/******************** RsrchElmntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitioneditortelecomi == 0) {r.addRsrchElmntDfnEditorTlcmVl("[[");}
		if(researchelementdefinitioneditortelecom.hasValue()) {

			r.addRsrchElmntDfnEditorTlcmVl(String.valueOf(researchelementdefinitioneditortelecom.getValue()));
		} else {
			r.addRsrchElmntDfnEditorTlcmVl("NULL");
		}

		if(researchelementdefinitioneditortelecomi == researchelementdefinitioneditortelecomlist.size()-1) {r.addRsrchElmntDfnEditorTlcmVl("]]");}


		/******************** researchelementdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioneditortelecomperiod = researchelementdefinitioneditortelecom.getPeriod();

		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitioneditortelecomi == 0) {r.addRsrchElmntDfnEditorTlcmPrdStrt("[[");}
		if(researchelementdefinitioneditortelecomperiod.hasStart()) {

			r.addRsrchElmntDfnEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioneditortelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnEditorTlcmPrdStrt("NULL");
		}

		if(researchelementdefinitioneditortelecomi == researchelementdefinitioneditortelecomlist.size()-1) {r.addRsrchElmntDfnEditorTlcmPrdStrt("]]");}


		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitioneditortelecomi == 0) {r.addRsrchElmntDfnEditorTlcmPrdEnd("[[");}
		if(researchelementdefinitioneditortelecomperiod.hasEnd()) {

			r.addRsrchElmntDfnEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioneditortelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnEditorTlcmPrdEnd("NULL");
		}

		if(researchelementdefinitioneditortelecomi == researchelementdefinitioneditortelecomlist.size()-1) {r.addRsrchElmntDfnEditorTlcmPrdEnd("]]");}


		/******************** researchelementdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitioneditortelecomuse = researchelementdefinitioneditortelecom.getUse();
		if(researchelementdefinitioneditortelecomuse!=null) {
		if(researchelementdefinitioneditortelecomi == 0) {

		r.addRsrchElmntDfnEditorTlcmUse("[[");		}
			r.addRsrchElmntDfnEditorTlcmUse(researchelementdefinitioneditortelecomuse.toCode());
		if(researchelementdefinitioneditortelecomi == researchelementdefinitioneditortelecomlist.size()-1) {

		r.addRsrchElmntDfnEditorTlcmUse("]]");		}

		} else {
			r.addRsrchElmntDfnEditorTlcmUse("NULL");
		}

		/******************** researchelementdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitioneditortelecomsystem = researchelementdefinitioneditortelecom.getSystem();
		if(researchelementdefinitioneditortelecomsystem!=null) {
		if(researchelementdefinitioneditortelecomi == 0) {

		r.addRsrchElmntDfnEditorTlcmSys("[[");		}
			r.addRsrchElmntDfnEditorTlcmSys(researchelementdefinitioneditortelecomsystem.toCode());
		if(researchelementdefinitioneditortelecomi == researchelementdefinitioneditortelecomlist.size()-1) {

		r.addRsrchElmntDfnEditorTlcmSys("]]");		}

		} else {
			r.addRsrchElmntDfnEditorTlcmSys("NULL");
		}

		/******************** RsrchElmntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitioneditortelecomi == 0) {r.addRsrchElmntDfnEditorTlcmRnk("[[");}
		if(researchelementdefinitioneditortelecom.hasRank()) {

			r.addRsrchElmntDfnEditorTlcmRnk(String.valueOf(researchelementdefinitioneditortelecom.getRank()));
		} else {
			r.addRsrchElmntDfnEditorTlcmRnk("NULL");
		}

		if(researchelementdefinitioneditortelecomi == researchelementdefinitioneditortelecomlist.size()-1) {r.addRsrchElmntDfnEditorTlcmRnk("]]");}


		 };
		 };
		/******************** researchelementdefinitionreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchelementdefinitionreviewerlist = researchelementdefinition.getReviewer();
		for(int researchelementdefinitionrevieweri = 0; researchelementdefinitionrevieweri<researchelementdefinitionreviewerlist.size();researchelementdefinitionrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchelementdefinitionreviewer = researchelementdefinitionreviewerlist.get(researchelementdefinitionrevieweri);

		/******************** RsrchElmntDfn_Rviewr_Nm ********************************************************************************/
		if(researchelementdefinitionrevieweri == 0) {r.addRsrchElmntDfnRviewrNm("[");}
		if(researchelementdefinitionreviewer.hasName()) {

			r.addRsrchElmntDfnRviewrNm(String.valueOf(researchelementdefinitionreviewer.getName()));
		} else {
			r.addRsrchElmntDfnRviewrNm("NULL");
		}

		if(researchelementdefinitionrevieweri == researchelementdefinitionreviewerlist.size()-1) {r.addRsrchElmntDfnRviewrNm("]");}


		/******************** researchelementdefinitionreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchelementdefinitionreviewertelecomlist = researchelementdefinitionreviewer.getTelecom();
		for(int researchelementdefinitionreviewertelecomi = 0; researchelementdefinitionreviewertelecomi<researchelementdefinitionreviewertelecomlist.size();researchelementdefinitionreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchelementdefinitionreviewertelecom = researchelementdefinitionreviewertelecomlist.get(researchelementdefinitionreviewertelecomi);

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitionreviewertelecomi == 0) {r.addRsrchElmntDfnRviewrTlcmVl("[[");}
		if(researchelementdefinitionreviewertelecom.hasValue()) {

			r.addRsrchElmntDfnRviewrTlcmVl(String.valueOf(researchelementdefinitionreviewertelecom.getValue()));
		} else {
			r.addRsrchElmntDfnRviewrTlcmVl("NULL");
		}

		if(researchelementdefinitionreviewertelecomi == researchelementdefinitionreviewertelecomlist.size()-1) {r.addRsrchElmntDfnRviewrTlcmVl("]]");}


		/******************** researchelementdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionreviewertelecomperiod = researchelementdefinitionreviewertelecom.getPeriod();

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionreviewertelecomi == 0) {r.addRsrchElmntDfnRviewrTlcmPrdStrt("[[");}
		if(researchelementdefinitionreviewertelecomperiod.hasStart()) {

			r.addRsrchElmntDfnRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionreviewertelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnRviewrTlcmPrdStrt("NULL");
		}

		if(researchelementdefinitionreviewertelecomi == researchelementdefinitionreviewertelecomlist.size()-1) {r.addRsrchElmntDfnRviewrTlcmPrdStrt("]]");}


		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitionreviewertelecomi == 0) {r.addRsrchElmntDfnRviewrTlcmPrdEnd("[[");}
		if(researchelementdefinitionreviewertelecomperiod.hasEnd()) {

			r.addRsrchElmntDfnRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionreviewertelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnRviewrTlcmPrdEnd("NULL");
		}

		if(researchelementdefinitionreviewertelecomi == researchelementdefinitionreviewertelecomlist.size()-1) {r.addRsrchElmntDfnRviewrTlcmPrdEnd("]]");}


		/******************** researchelementdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitionreviewertelecomuse = researchelementdefinitionreviewertelecom.getUse();
		if(researchelementdefinitionreviewertelecomuse!=null) {
		if(researchelementdefinitionreviewertelecomi == 0) {

		r.addRsrchElmntDfnRviewrTlcmUse("[[");		}
			r.addRsrchElmntDfnRviewrTlcmUse(researchelementdefinitionreviewertelecomuse.toCode());
		if(researchelementdefinitionreviewertelecomi == researchelementdefinitionreviewertelecomlist.size()-1) {

		r.addRsrchElmntDfnRviewrTlcmUse("]]");		}

		} else {
			r.addRsrchElmntDfnRviewrTlcmUse("NULL");
		}

		/******************** researchelementdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitionreviewertelecomsystem = researchelementdefinitionreviewertelecom.getSystem();
		if(researchelementdefinitionreviewertelecomsystem!=null) {
		if(researchelementdefinitionreviewertelecomi == 0) {

		r.addRsrchElmntDfnRviewrTlcmSys("[[");		}
			r.addRsrchElmntDfnRviewrTlcmSys(researchelementdefinitionreviewertelecomsystem.toCode());
		if(researchelementdefinitionreviewertelecomi == researchelementdefinitionreviewertelecomlist.size()-1) {

		r.addRsrchElmntDfnRviewrTlcmSys("]]");		}

		} else {
			r.addRsrchElmntDfnRviewrTlcmSys("NULL");
		}

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitionreviewertelecomi == 0) {r.addRsrchElmntDfnRviewrTlcmRnk("[[");}
		if(researchelementdefinitionreviewertelecom.hasRank()) {

			r.addRsrchElmntDfnRviewrTlcmRnk(String.valueOf(researchelementdefinitionreviewertelecom.getRank()));
		} else {
			r.addRsrchElmntDfnRviewrTlcmRnk("NULL");
		}

		if(researchelementdefinitionreviewertelecomi == researchelementdefinitionreviewertelecomlist.size()-1) {r.addRsrchElmntDfnRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** RsrchElmntDfn_Usg ********************************************************************************/
		if(researchelementdefinition.hasUsage()) {

			r.addRsrchElmntDfnUsg(String.valueOf(researchelementdefinition.getUsage()));
		} else {
			r.addRsrchElmntDfnUsg("NULL");
		}


		/******************** RsrchElmntDfn_Library ********************************************************************************/
		if(researchelementdefinition.hasLibrary()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinition.getLibrary().size(); incr++) {
				array = array + researchelementdefinition.getLibrary().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnLibrary(array);

		} else {
			r.addRsrchElmntDfnLibrary("NULL");
		}


		/******************** RsrchElmntDfn_SbjctRfrnc ********************************************************************************/
		if(researchelementdefinition.hasSubjectReference()) {

			if(researchelementdefinition.getSubjectReference().getReference() != null) {
			r.addRsrchElmntDfnSbjctRfrnc(researchelementdefinition.getSubjectReference().getReference());
			}
		} else {
			r.addRsrchElmntDfnSbjctRfrnc("NULL");
		}


		/******************** researchelementdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionsubjectcodeableconcept = researchelementdefinition.getSubjectCodeableConcept();

		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconcept.hasText()) {

			r.addRsrchElmntDfnSbjctCdbleCncptTxt(String.valueOf(researchelementdefinitionsubjectcodeableconcept.getText()));
		} else {
			r.addRsrchElmntDfnSbjctCdbleCncptTxt("NULL");
		}


		/******************** researchelementdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitionsubjectcodeableconceptcodinglist = researchelementdefinitionsubjectcodeableconcept.getCoding();
		for(int researchelementdefinitionsubjectcodeableconceptcodingi = 0; researchelementdefinitionsubjectcodeableconceptcodingi<researchelementdefinitionsubjectcodeableconceptcodinglist.size();researchelementdefinitionsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitionsubjectcodeableconceptcoding = researchelementdefinitionsubjectcodeableconceptcodinglist.get(researchelementdefinitionsubjectcodeableconceptcodingi);

		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnSbjctCdbleCncptCdgDsply("[");}
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasDisplay()) {

			r.addRsrchElmntDfnSbjctCdbleCncptCdgDsply(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnSbjctCdbleCncptCdgDsply("NULL");
		}

		if(researchelementdefinitionsubjectcodeableconceptcodingi == researchelementdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnSbjctCdbleCncptCdgDsply("]");}


		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnSbjctCdbleCncptCdgVrsn("[");}
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasVersion()) {

			r.addRsrchElmntDfnSbjctCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getVersion()));
		} else {
			r.addRsrchElmntDfnSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(researchelementdefinitionsubjectcodeableconceptcodingi == researchelementdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnSbjctCdbleCncptCdgVrsn("]");}


		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnSbjctCdbleCncptCdgCd("[");}
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasCode()) {

			r.addRsrchElmntDfnSbjctCdbleCncptCdgCd(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getCode()));
		} else {
			r.addRsrchElmntDfnSbjctCdbleCncptCdgCd("NULL");
		}

		if(researchelementdefinitionsubjectcodeableconceptcodingi == researchelementdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnSbjctCdbleCncptCdgCd("]");}


		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd("[");}
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasUserSelected()) {

			r.addRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(researchelementdefinitionsubjectcodeableconceptcodingi == researchelementdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd("]");}


		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnSbjctCdbleCncptCdgSys("[");}
		if(researchelementdefinitionsubjectcodeableconceptcoding.hasSystem()) {

			r.addRsrchElmntDfnSbjctCdbleCncptCdgSys(String.valueOf(researchelementdefinitionsubjectcodeableconceptcoding.getSystem()));
		} else {
			r.addRsrchElmntDfnSbjctCdbleCncptCdgSys("NULL");
		}

		if(researchelementdefinitionsubjectcodeableconceptcodingi == researchelementdefinitionsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnSbjctCdbleCncptCdgSys("]");}


		 };
		/******************** RsrchElmntDfn_Ttl ********************************************************************************/
		if(researchelementdefinition.hasTitle()) {

			r.addRsrchElmntDfnTtl(String.valueOf(researchelementdefinition.getTitle()));
		} else {
			r.addRsrchElmntDfnTtl("NULL");
		}


		/******************** researchelementdefinitionrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> researchelementdefinitionrelatedartifactlist = researchelementdefinition.getRelatedArtifact();
		for(int researchelementdefinitionrelatedartifacti = 0; researchelementdefinitionrelatedartifacti<researchelementdefinitionrelatedartifactlist.size();researchelementdefinitionrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  researchelementdefinitionrelatedartifact = researchelementdefinitionrelatedartifactlist.get(researchelementdefinitionrelatedartifacti);

		/******************** RsrchElmntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctRsrc("[");}
		if(researchelementdefinitionrelatedartifact.hasResource()) {

			r.addRsrchElmntDfnRltedArtfctRsrc(String.valueOf(researchelementdefinitionrelatedartifact.getResource()));
		} else {
			r.addRsrchElmntDfnRltedArtfctRsrc("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctRsrc("]");}


		/******************** researchelementdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType researchelementdefinitionrelatedartifacttype = researchelementdefinitionrelatedartifact.getType();
		if(researchelementdefinitionrelatedartifacttype!=null) {
		if(researchelementdefinitionrelatedartifacti == 0) {

		r.addRsrchElmntDfnRltedArtfctTyp("[");		}
			r.addRsrchElmntDfnRltedArtfctTyp(researchelementdefinitionrelatedartifacttype.toCode());
		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {

		r.addRsrchElmntDfnRltedArtfctTyp("]");		}

		} else {
			r.addRsrchElmntDfnRltedArtfctTyp("NULL");
		}

		/******************** RsrchElmntDfn_RltedArtfct_Url ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctUrl("[");}
		if(researchelementdefinitionrelatedartifact.hasUrl()) {

			r.addRsrchElmntDfnRltedArtfctUrl(String.valueOf(researchelementdefinitionrelatedartifact.getUrl()));
		} else {
			r.addRsrchElmntDfnRltedArtfctUrl("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctUrl("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Citation ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctCitation("[");}
		if(researchelementdefinitionrelatedartifact.hasCitation()) {

			r.addRsrchElmntDfnRltedArtfctCitation(String.valueOf(researchelementdefinitionrelatedartifact.getCitation()));
		} else {
			r.addRsrchElmntDfnRltedArtfctCitation("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctCitation("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctLbl("[");}
		if(researchelementdefinitionrelatedartifact.hasLabel()) {

			r.addRsrchElmntDfnRltedArtfctLbl(String.valueOf(researchelementdefinitionrelatedartifact.getLabel()));
		} else {
			r.addRsrchElmntDfnRltedArtfctLbl("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctLbl("]");}


		/******************** researchelementdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchelementdefinitionrelatedartifactdocument = researchelementdefinitionrelatedartifact.getDocument();

		/******************** RsrchElmntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocSz("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasSize()) {

			r.addRsrchElmntDfnRltedArtfctDocSz(String.valueOf(researchelementdefinitionrelatedartifactdocument.getSize()));
		} else {
			r.addRsrchElmntDfnRltedArtfctDocSz("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocSz("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocLnguage("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasLanguage()) {

			r.addRsrchElmntDfnRltedArtfctDocLnguage(String.valueOf(researchelementdefinitionrelatedartifactdocument.getLanguage()));
		} else {
			r.addRsrchElmntDfnRltedArtfctDocLnguage("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocLnguage("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocCntntTyp("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasContentType()) {

			r.addRsrchElmntDfnRltedArtfctDocCntntTyp(String.valueOf(researchelementdefinitionrelatedartifactdocument.getContentType()));
		} else {
			r.addRsrchElmntDfnRltedArtfctDocCntntTyp("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocCntntTyp("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocHash("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasHash()) {

			r.addRsrchElmntDfnRltedArtfctDocHash(new String(researchelementdefinitionrelatedartifactdocument.getHash()));
		} else {
			r.addRsrchElmntDfnRltedArtfctDocHash("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocHash("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocData("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasData()) {

			r.addRsrchElmntDfnRltedArtfctDocData(new String(researchelementdefinitionrelatedartifactdocument.getData()));
		} else {
			r.addRsrchElmntDfnRltedArtfctDocData("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocData("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocCreation("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasCreation()) {

			r.addRsrchElmntDfnRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionrelatedartifactdocument.getCreation())+"\"");
		} else {
			r.addRsrchElmntDfnRltedArtfctDocCreation("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocCreation("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocTtl("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasTitle()) {

			r.addRsrchElmntDfnRltedArtfctDocTtl(String.valueOf(researchelementdefinitionrelatedartifactdocument.getTitle()));
		} else {
			r.addRsrchElmntDfnRltedArtfctDocTtl("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocTtl("]");}


		/******************** RsrchElmntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(researchelementdefinitionrelatedartifacti == 0) {r.addRsrchElmntDfnRltedArtfctDocUrl("[");}
		if(researchelementdefinitionrelatedartifactdocument.hasUrl()) {

			r.addRsrchElmntDfnRltedArtfctDocUrl(String.valueOf(researchelementdefinitionrelatedartifactdocument.getUrl()));
		} else {
			r.addRsrchElmntDfnRltedArtfctDocUrl("NULL");
		}

		if(researchelementdefinitionrelatedartifacti == researchelementdefinitionrelatedartifactlist.size()-1) {r.addRsrchElmntDfnRltedArtfctDocUrl("]");}


		 };
		/******************** RsrchElmntDfn_Prpse ********************************************************************************/
		if(researchelementdefinition.hasPurpose()) {

			r.addRsrchElmntDfnPrpse(String.valueOf(researchelementdefinition.getPurpose()));
		} else {
			r.addRsrchElmntDfnPrpse("NULL");
		}


		/******************** RsrchElmntDfn_Url ********************************************************************************/
		if(researchelementdefinition.hasUrl()) {

			r.addRsrchElmntDfnUrl(String.valueOf(researchelementdefinition.getUrl()));
		} else {
			r.addRsrchElmntDfnUrl("NULL");
		}


		/******************** RsrchElmntDfn_ShortTtl ********************************************************************************/
		if(researchelementdefinition.hasShortTitle()) {

			r.addRsrchElmntDfnShortTtl(String.valueOf(researchelementdefinition.getShortTitle()));
		} else {
			r.addRsrchElmntDfnShortTtl("NULL");
		}


		/******************** researchelementdefinitionvariabletype ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.VariableType researchelementdefinitionvariabletype = researchelementdefinition.getVariableType();
		if(researchelementdefinitionvariabletype!=null) {
			r.addRsrchElmntDfnVrbleTyp(researchelementdefinitionvariabletype.toCode());
		} else {
			r.addRsrchElmntDfnVrbleTyp("NULL");
		}

		/******************** RsrchElmntDfn_Subtitle ********************************************************************************/
		if(researchelementdefinition.hasSubtitle()) {

			r.addRsrchElmntDfnSubtitle(String.valueOf(researchelementdefinition.getSubtitle()));
		} else {
			r.addRsrchElmntDfnSubtitle("NULL");
		}


		/******************** researchelementdefinitiontopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchelementdefinitiontopiclist = researchelementdefinition.getTopic();
		for(int researchelementdefinitiontopici = 0; researchelementdefinitiontopici<researchelementdefinitiontopiclist.size();researchelementdefinitiontopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchelementdefinitiontopic = researchelementdefinitiontopiclist.get(researchelementdefinitiontopici);

		/******************** RsrchElmntDfn_Topic_Txt ********************************************************************************/
		if(researchelementdefinitiontopici == 0) {r.addRsrchElmntDfnTopicTxt("[");}
		if(researchelementdefinitiontopic.hasText()) {

			r.addRsrchElmntDfnTopicTxt(String.valueOf(researchelementdefinitiontopic.getText()));
		} else {
			r.addRsrchElmntDfnTopicTxt("NULL");
		}

		if(researchelementdefinitiontopici == researchelementdefinitiontopiclist.size()-1) {r.addRsrchElmntDfnTopicTxt("]");}


		/******************** researchelementdefinitiontopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitiontopiccodinglist = researchelementdefinitiontopic.getCoding();
		for(int researchelementdefinitiontopiccodingi = 0; researchelementdefinitiontopiccodingi<researchelementdefinitiontopiccodinglist.size();researchelementdefinitiontopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitiontopiccoding = researchelementdefinitiontopiccodinglist.get(researchelementdefinitiontopiccodingi);

		/******************** RsrchElmntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitiontopiccodingi == 0) {r.addRsrchElmntDfnTopicCdgDsply("[[");}
		if(researchelementdefinitiontopiccoding.hasDisplay()) {

			r.addRsrchElmntDfnTopicCdgDsply(String.valueOf(researchelementdefinitiontopiccoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnTopicCdgDsply("NULL");
		}

		if(researchelementdefinitiontopiccodingi == researchelementdefinitiontopiccodinglist.size()-1) {r.addRsrchElmntDfnTopicCdgDsply("]]");}


		/******************** RsrchElmntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitiontopiccodingi == 0) {r.addRsrchElmntDfnTopicCdgVrsn("[[");}
		if(researchelementdefinitiontopiccoding.hasVersion()) {

			r.addRsrchElmntDfnTopicCdgVrsn(String.valueOf(researchelementdefinitiontopiccoding.getVersion()));
		} else {
			r.addRsrchElmntDfnTopicCdgVrsn("NULL");
		}

		if(researchelementdefinitiontopiccodingi == researchelementdefinitiontopiccodinglist.size()-1) {r.addRsrchElmntDfnTopicCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitiontopiccodingi == 0) {r.addRsrchElmntDfnTopicCdgCd("[[");}
		if(researchelementdefinitiontopiccoding.hasCode()) {

			r.addRsrchElmntDfnTopicCdgCd(String.valueOf(researchelementdefinitiontopiccoding.getCode()));
		} else {
			r.addRsrchElmntDfnTopicCdgCd("NULL");
		}

		if(researchelementdefinitiontopiccodingi == researchelementdefinitiontopiccodinglist.size()-1) {r.addRsrchElmntDfnTopicCdgCd("]]");}


		/******************** RsrchElmntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitiontopiccodingi == 0) {r.addRsrchElmntDfnTopicCdgUsrSltd("[[");}
		if(researchelementdefinitiontopiccoding.hasUserSelected()) {

			r.addRsrchElmntDfnTopicCdgUsrSltd(String.valueOf(researchelementdefinitiontopiccoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnTopicCdgUsrSltd("NULL");
		}

		if(researchelementdefinitiontopiccodingi == researchelementdefinitiontopiccodinglist.size()-1) {r.addRsrchElmntDfnTopicCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitiontopiccodingi == 0) {r.addRsrchElmntDfnTopicCdgSys("[[");}
		if(researchelementdefinitiontopiccoding.hasSystem()) {

			r.addRsrchElmntDfnTopicCdgSys(String.valueOf(researchelementdefinitiontopiccoding.getSystem()));
		} else {
			r.addRsrchElmntDfnTopicCdgSys("NULL");
		}

		if(researchelementdefinitiontopiccodingi == researchelementdefinitiontopiccodinglist.size()-1) {r.addRsrchElmntDfnTopicCdgSys("]]");}


		 };
		 };
		/******************** researchelementdefinitioncharacteristic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementDefinitionCharacteristicComponent> researchelementdefinitioncharacteristiclist = researchelementdefinition.getCharacteristic();
		for(int researchelementdefinitioncharacteristici = 0; researchelementdefinitioncharacteristici<researchelementdefinitioncharacteristiclist.size();researchelementdefinitioncharacteristici++ ) {
		org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementDefinitionCharacteristicComponent  researchelementdefinitioncharacteristic = researchelementdefinitioncharacteristiclist.get(researchelementdefinitioncharacteristici);

		/******************** RsrchElmntDfn_Crctrstc_Exclude ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcExclude("[");}
		if(researchelementdefinitioncharacteristic.hasExclude()) {

			r.addRsrchElmntDfnCrctrstcExclude(String.valueOf(researchelementdefinitioncharacteristic.getExclude()));
		} else {
			r.addRsrchElmntDfnCrctrstcExclude("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcExclude("]");}


		/******************** researchelementdefinitioncharacteristicunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicunitofmeasure = researchelementdefinitioncharacteristic.getUnitOfMeasure();

		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcUntOfMsrTxt("[");}
		if(researchelementdefinitioncharacteristicunitofmeasure.hasText()) {

			r.addRsrchElmntDfnCrctrstcUntOfMsrTxt(String.valueOf(researchelementdefinitioncharacteristicunitofmeasure.getText()));
		} else {
			r.addRsrchElmntDfnCrctrstcUntOfMsrTxt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcUntOfMsrTxt("]");}


		/******************** researchelementdefinitioncharacteristicunitofmeasurecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitioncharacteristicunitofmeasurecodinglist = researchelementdefinitioncharacteristicunitofmeasure.getCoding();
		for(int researchelementdefinitioncharacteristicunitofmeasurecodingi = 0; researchelementdefinitioncharacteristicunitofmeasurecodingi<researchelementdefinitioncharacteristicunitofmeasurecodinglist.size();researchelementdefinitioncharacteristicunitofmeasurecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitioncharacteristicunitofmeasurecoding = researchelementdefinitioncharacteristicunitofmeasurecodinglist.get(researchelementdefinitioncharacteristicunitofmeasurecodingi);

		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == 0) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgDsply("[[");}
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgDsply(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == researchelementdefinitioncharacteristicunitofmeasurecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgDsply("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == 0) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn("[[");}
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == researchelementdefinitioncharacteristicunitofmeasurecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == 0) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgCd("[[");}
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasCode()) {

			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgCd(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgCd("NULL");
		}

		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == researchelementdefinitioncharacteristicunitofmeasurecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == 0) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd("[[");}
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd("NULL");
		}

		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == researchelementdefinitioncharacteristicunitofmeasurecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == 0) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgSys("[[");}
		if(researchelementdefinitioncharacteristicunitofmeasurecoding.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgSys(String.valueOf(researchelementdefinitioncharacteristicunitofmeasurecoding.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcUntOfMsrCdgSys("NULL");
		}

		if(researchelementdefinitioncharacteristicunitofmeasurecodingi == researchelementdefinitioncharacteristicunitofmeasurecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUntOfMsrCdgSys("]]");}


		 };
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement researchelementdefinitioncharacteristicdefinitiondatarequirement = researchelementdefinitioncharacteristic.getDefinitionDataRequirement();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentTyp("[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasType()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentTyp(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirement.getType()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentTyp("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentTyp("]");}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> researchelementdefinitioncharacteristicdefinitiondatarequirementsortlist = researchelementdefinitioncharacteristicdefinitiondatarequirement.getSort();
		for(int researchelementdefinitioncharacteristicdefinitiondatarequirementsorti = 0; researchelementdefinitioncharacteristicdefinitiondatarequirementsorti<researchelementdefinitioncharacteristicdefinitiondatarequirementsortlist.size();researchelementdefinitioncharacteristicdefinitiondatarequirementsorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  researchelementdefinitioncharacteristicdefinitiondatarequirementsort = researchelementdefinitioncharacteristicdefinitiondatarequirementsortlist.get(researchelementdefinitioncharacteristicdefinitiondatarequirementsorti);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsorti == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsort.hasPath()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsort.getPath()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsorti == researchelementdefinitioncharacteristicdefinitiondatarequirementsortlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath("]]");}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection = researchelementdefinitioncharacteristicdefinitiondatarequirementsort.getDirection();
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection!=null) {
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsorti == 0) {

		r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection("[[");		}
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection(researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection.toCode());
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsorti == researchelementdefinitioncharacteristicdefinitiondatarequirementsortlist.size()-1) {

		r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection("]]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection("NULL");
		}

		 };
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasSubjectReference()) {

			if(researchelementdefinitioncharacteristicdefinitiondatarequirement.getSubjectReference().getReference() != null) {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctRfrnc(researchelementdefinitioncharacteristicdefinitiondatarequirement.getSubjectReference().getReference());
			}
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctRfrnc("NULL");
		}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept = researchelementdefinitioncharacteristicdefinitiondatarequirement.getSubjectCodeableConcept();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.hasText()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.getText()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt("NULL");
		}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist = researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.getCoding();
		for(int researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi = 0; researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi<researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size();researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding = researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.get(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasCode()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_US ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys("]]");}


		 };
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Profile ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinitioncharacteristicdefinitiondatarequirement.getProfile().size(); incr++) {
				array = array + researchelementdefinitioncharacteristicdefinitiondatarequirement.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentProfile(array);

		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentProfile("NULL");
		}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_MustSupport ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinitioncharacteristicdefinitiondatarequirement.getMustSupport().size(); incr++) {
				array = array + researchelementdefinitioncharacteristicdefinitiondatarequirement.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentMustSupport(array);

		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentMustSupport("NULL");
		}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilterlist = researchelementdefinitioncharacteristicdefinitiondatarequirement.getCodeFilter();
		for(int researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilteri = 0; researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilteri<researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilterlist.size();researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter = researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilterlist.get(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilteri);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.hasPath()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getPath()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath("]]");}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodelist = researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getCode();
		for(int researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei = 0; researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei<researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodelist.size();researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode = researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodelist.get(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply("[[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply("]]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn("[[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn("]]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd("[[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd("]]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys("[[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodei == researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys("]]]");}


		 };
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.hasSearchParam()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getSearchParam()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam("NULL");
		}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.hasValueSet()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.getValueSet()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt("NULL");
		}


		 };
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirement.hasLimit()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentLmt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirement.getLimit()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentLmt("NULL");
		}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist = researchelementdefinitioncharacteristicdefinitiondatarequirement.getDateFilter();
		for(int researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri = 0; researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri<researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size();researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter = researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.get(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.hasPath()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getPath()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.hasSearchParam()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getSearchParam()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam("]]");}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration = researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getValueDuration();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasValue()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl("]]");}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator = researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getComparator();
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator!=null) {
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {

		r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr("[[");		}
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator.toCode());
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {

		r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr("]]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasCode()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys(String.valueOf(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.hasValueDateTimeType()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("\""+researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("]]");}


		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod = researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.getValuePeriod();

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasStart()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == 0) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("[[");}
		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasEnd()) {

			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilteri == researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("]]");}


		 };
		/******************** researchelementdefinitioncharacteristicparticipanteffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectiveduration = researchelementdefinitioncharacteristic.getParticipantEffectiveDuration();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationVl("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasValue()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationVl("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivedurationcomparator = researchelementdefinitioncharacteristicparticipanteffectiveduration.getComparator();
		if(researchelementdefinitioncharacteristicparticipanteffectivedurationcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCmprtr(researchelementdefinitioncharacteristicparticipanteffectivedurationcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasCode()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationUnt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationSys("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectiveduration.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectiveduration.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationSys("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing researchelementdefinitioncharacteristicparticipanteffectivetiming = researchelementdefinitioncharacteristic.getParticipantEffectiveTiming();

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicparticipanteffectivetimingcode = researchelementdefinitioncharacteristicparticipanteffectivetiming.getCode();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcode.hasText()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcode.getText()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist = researchelementdefinitioncharacteristicparticipanteffectivetimingcode.getCoding();
		for(int researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi = 0; researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi<researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist.size();researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding = researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist.get(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi);

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply("[[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply("]]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn("[[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd("[[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasCode()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd("NULL");
		}

		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd("[[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd("NULL");
		}

		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys("[[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys("NULL");
		}

		if(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodingi == researchelementdefinitioncharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys("]]");}


		 };
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evnt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinitioncharacteristicparticipanteffectivetiming.getEvent().size(); incr++) {
				array = array + researchelementdefinitioncharacteristicparticipanteffectivetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt(array);

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat = researchelementdefinitioncharacteristicparticipanteffectivetiming.getRepeat();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasOffset()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getOffset()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasCount()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getCount()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasPeriod()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getPeriod()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasCountMax()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getCountMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasDurationMax()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getDurationMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getBoundsPeriod();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.hasStart()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.hasEnd()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getDurationUnit();
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt("[");		}
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt("NULL");
		}

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getBoundsDuration();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasValue()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getComparator();
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasCode()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getBoundsRange();

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange.getLow();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasValue()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getComparator();
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasCode()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange.getHigh();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasValue()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getComparator();
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasCode()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasFrequencyMax()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getFrequencyMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhenlist = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getWhen();
		for(int researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwheni = 0; researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwheni<researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhenlist.size();researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhen = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhenlist.get(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwheni);
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhen!=null) {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptWhen(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhen.getCode());
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptWhen("NULL");
		}
		 };

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getPeriodUnit();
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit!=null) {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdUnt(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit.toCode());
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdUnt("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasPeriodMax()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdMx(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getPeriodMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdMx("NULL");
		}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweeklist = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getDayOfWeek();
		for(int researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweeki = 0; researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweeki<researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweeklist.size();researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweek = researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweeklist.get(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweeki);
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweek!=null) {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDayOfWeek(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweek.getCode());
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptTimeOfDay(array);

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptTimeOfDay("NULL");
		}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasDuration()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDuration(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getDuration()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDuration("NULL");
		}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.hasFrequency()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncy(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.getFrequency()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncy("NULL");
		}


		/******************** researchelementdefinitioncharacteristicdefinitionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression researchelementdefinitioncharacteristicdefinitionexpression = researchelementdefinitioncharacteristic.getDefinitionExpression();

		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcDfnExprsnNm("[");}
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasName()) {

			r.addRsrchElmntDfnCrctrstcDfnExprsnNm(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getName()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnExprsnNm("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnExprsnNm("]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcDfnExprsnRfrnc("[");}
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasReference()) {

			r.addRsrchElmntDfnCrctrstcDfnExprsnRfrnc(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getReference()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnExprsnRfrnc("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnExprsnRfrnc("]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcDfnExprsnLnguage("[");}
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasLanguage()) {

			r.addRsrchElmntDfnCrctrstcDfnExprsnLnguage(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getLanguage()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnExprsnLnguage("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnExprsnLnguage("]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcDfnExprsnDscrptn("[");}
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasDescription()) {

			r.addRsrchElmntDfnCrctrstcDfnExprsnDscrptn(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getDescription()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnExprsnDscrptn("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnExprsnDscrptn("]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcDfnExprsnExprsn("[");}
		if(researchelementdefinitioncharacteristicdefinitionexpression.hasExpression()) {

			r.addRsrchElmntDfnCrctrstcDfnExprsnExprsn(String.valueOf(researchelementdefinitioncharacteristicdefinitionexpression.getExpression()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnExprsnExprsn("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnExprsnExprsn("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDscrptn ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn("[");}
		if(researchelementdefinitioncharacteristic.hasParticipantEffectiveDescription()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn(String.valueOf(researchelementdefinitioncharacteristic.getParticipantEffectiveDescription()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivegroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasure researchelementdefinitioncharacteristicstudyeffectivegroupmeasure = researchelementdefinitioncharacteristic.getStudyEffectiveGroupMeasure();
		if(researchelementdefinitioncharacteristicstudyeffectivegroupmeasure!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr("[");		}
			r.addRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr(researchelementdefinitioncharacteristicstudyeffectivegroupmeasure.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr("NULL");
		}

		/******************** researchelementdefinitioncharacteristicparticipanteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicparticipanteffectiveperiod = researchelementdefinitioncharacteristic.getParticipantEffectivePeriod();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectiveperiod.hasStart()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicparticipanteffectiveperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectiveperiod.hasEnd()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicparticipanteffectiveperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectiveduration = researchelementdefinitioncharacteristic.getStudyEffectiveDuration();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationVl("[");}
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasValue()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationVl("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivedurationcomparator = researchelementdefinitioncharacteristicstudyeffectiveduration.getComparator();
		if(researchelementdefinitioncharacteristicstudyeffectivedurationcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCmprtr(researchelementdefinitioncharacteristicstudyeffectivedurationcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasCode()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationUnt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationSys("[");}
		if(researchelementdefinitioncharacteristicstudyeffectiveduration.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectiveduration.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDurationSys("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDscrptn ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDscrptn("[");}
		if(researchelementdefinitioncharacteristic.hasStudyEffectiveDescription()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveDscrptn(String.valueOf(researchelementdefinitioncharacteristic.getStudyEffectiveDescription()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDscrptn("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDscrptn("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDtTimeTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp("[");}
		if(researchelementdefinitioncharacteristic.hasStudyEffectiveDateTimeType()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp("\""+researchelementdefinitioncharacteristic.getStudyEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicstudyeffectiveperiod = researchelementdefinitioncharacteristic.getStudyEffectivePeriod();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctivePrdStrt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectiveperiod.hasStart()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicstudyeffectiveperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctivePrdStrt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctivePrdStrt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctivePrdEnd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectiveperiod.hasEnd()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicstudyeffectiveperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctivePrdEnd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctivePrdEnd("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing researchelementdefinitioncharacteristicstudyeffectivetiming = researchelementdefinitioncharacteristic.getStudyEffectiveTiming();

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicstudyeffectivetimingcode = researchelementdefinitioncharacteristicstudyeffectivetiming.getCode();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcode.hasText()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcode.getText()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist = researchelementdefinitioncharacteristicstudyeffectivetimingcode.getCoding();
		for(int researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi = 0; researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi<researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist.size();researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding = researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist.get(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi);

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply("[[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply("]]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn("[[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd("[[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasCode()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd("NULL");
		}

		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd("[[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd("NULL");
		}

		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys("[[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys("NULL");
		}

		if(researchelementdefinitioncharacteristicstudyeffectivetimingcodecodingi == researchelementdefinitioncharacteristicstudyeffectivetimingcodecodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys("]]");}


		 };
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evnt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinitioncharacteristicstudyeffectivetiming.getEvent().size(); incr++) {
				array = array + researchelementdefinitioncharacteristicstudyeffectivetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt(array);

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent researchelementdefinitioncharacteristicstudyeffectivetimingrepeat = researchelementdefinitioncharacteristicstudyeffectivetiming.getRepeat();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Off ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasOffset()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getOffset()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasCount()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getCount()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasPeriod()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getPeriod()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasCountMax()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getCountMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasDurationMax()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getDurationMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getBoundsPeriod();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.hasStart()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.hasEnd()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getDurationUnit();
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt("[");		}
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt("NULL");
		}

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getBoundsDuration();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationVl("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasValue()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationVl("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsdurationcomparator = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getComparator();
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsdurationcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsdurationcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasCode()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationUnt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationSys("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationSys("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getBoundsRange();

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange.getLow();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasValue()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getComparator();
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasCode()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange.getHigh();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasValue()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getComparator();
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasCode()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasFrequencyMax()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getFrequencyMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhenlist = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getWhen();
		for(int researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwheni = 0; researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwheni<researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhenlist.size();researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhen = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhenlist.get(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwheni);
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhen!=null) {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptWhen(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhen.getCode());
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptWhen("NULL");
		}
		 };

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getPeriodUnit();
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit!=null) {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdUnt(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit.toCode());
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdUnt("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasPeriodMax()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdMx(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getPeriodMax()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdMx("NULL");
		}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweeklist = researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getDayOfWeek();
		for(int researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweeki = 0; researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweeki<researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweeklist.size();researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweek = researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweeklist.get(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweeki);
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweek!=null) {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDayOfWeek(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweek.getCode());
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptTimeOfDay(array);

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptTimeOfDay("NULL");
		}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasDuration()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDuration(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getDuration()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDuration("NULL");
		}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.hasFrequency()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncy(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.getFrequency()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncy("NULL");
		}


		/******************** researchelementdefinitioncharacteristicdefinitioncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicdefinitioncodeableconcept = researchelementdefinitioncharacteristic.getDefinitionCodeableConcept();

		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptTxt("[");}
		if(researchelementdefinitioncharacteristicdefinitioncodeableconcept.hasText()) {

			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptTxt(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconcept.getText()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptTxt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptTxt("]");}


		/******************** researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist = researchelementdefinitioncharacteristicdefinitioncodeableconcept.getCoding();
		for(int researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi = 0; researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi<researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist.size();researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding = researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist.get(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi);

		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply("[[");}
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn("[[");}
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd("[[");}
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasCode()) {

			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd("[[");}
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys("[[");}
		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys(String.valueOf(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys("NULL");
		}

		if(researchelementdefinitioncharacteristicdefinitioncodeableconceptcodingi == researchelementdefinitioncharacteristicdefinitioncodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys("]]");}


		 };
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectivetimefromstart = researchelementdefinitioncharacteristic.getStudyEffectiveTimeFromStart();

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtVl("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasValue()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtVl(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtVl("]");}


		/******************** researchelementdefinitioncharacteristicstudyeffectivetimefromstartcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicstudyeffectivetimefromstartcomparator = researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getComparator();
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstartcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCmprtr(researchelementdefinitioncharacteristicstudyeffectivetimefromstartcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCd("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasCode()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCd(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtUnt("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtUnt(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtSys("[");}
		if(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtSys(String.valueOf(researchelementdefinitioncharacteristicstudyeffectivetimefromstart.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtSys("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectivetimefromstart = researchelementdefinitioncharacteristic.getParticipantEffectiveTimeFromStart();

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtVl("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasValue()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtVl(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtVl("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtVl("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimefromstartcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicparticipanteffectivetimefromstartcomparator = researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getComparator();
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstartcomparator!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCmprtr("[");		}
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCmprtr(researchelementdefinitioncharacteristicparticipanteffectivetimefromstartcomparator.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCd("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasCode()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCd(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCd("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCd("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtUnt("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtUnt(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtUnt("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtUnt("]");}


		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtSys("[");}
		if(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtSys(String.valueOf(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtSys("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtSys("]");}


		/******************** researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasure researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure = researchelementdefinitioncharacteristic.getParticipantEffectiveGroupMeasure();
		if(researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure!=null) {
		if(researchelementdefinitioncharacteristici == 0) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr("[");		}
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr(researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure.toCode());
		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {

		r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr("]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristici == 0) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp("[");}
		if(researchelementdefinitioncharacteristic.hasParticipantEffectiveDateTimeType()) {

			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp("\""+researchelementdefinitioncharacteristic.getParticipantEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp("NULL");
		}

		if(researchelementdefinitioncharacteristici == researchelementdefinitioncharacteristiclist.size()-1) {r.addRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp("]");}


		/******************** researchelementdefinitioncharacteristicusagecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> researchelementdefinitioncharacteristicusagecontextlist = researchelementdefinitioncharacteristic.getUsageContext();
		for(int researchelementdefinitioncharacteristicusagecontexti = 0; researchelementdefinitioncharacteristicusagecontexti<researchelementdefinitioncharacteristicusagecontextlist.size();researchelementdefinitioncharacteristicusagecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  researchelementdefinitioncharacteristicusagecontext = researchelementdefinitioncharacteristicusagecontextlist.get(researchelementdefinitioncharacteristicusagecontexti);

		/******************** researchelementdefinitioncharacteristicusagecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicusagecontextcode = researchelementdefinitioncharacteristicusagecontext.getCode();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdDsply("[[");}
		if(researchelementdefinitioncharacteristicusagecontextcode.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtCdDsply(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtCdDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdDsply("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdVrsn("[[");}
		if(researchelementdefinitioncharacteristicusagecontextcode.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtCdVrsn(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtCdVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdVrsn("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd("[[");}
		if(researchelementdefinitioncharacteristicusagecontextcode.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdSys("[[");}
		if(researchelementdefinitioncharacteristicusagecontextcode.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtCdSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextcode.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtCdSys("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtCdSys("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc("[[");}
		if(researchelementdefinitioncharacteristicusagecontext.hasValueReference()) {

			if(researchelementdefinitioncharacteristicusagecontext.getValueReference().getReference() != null) {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc(researchelementdefinitioncharacteristicusagecontext.getValueReference().getReference());
			}
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc("]]");}


		/******************** researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept = researchelementdefinitioncharacteristicusagecontext.getValueCodeableConcept();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.hasText()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.getText()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt("]]");}


		/******************** researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist = researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.getCoding();
		for(int researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi = 0; researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi<researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist.size();researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding = researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist.get(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi);

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply("[[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasDisplay()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply("]]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn("[[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasVersion()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn("]]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd("[[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasCode()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd("]]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd("[[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasUserSelected()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd("]]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys("[[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodingi == researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys("]]]");}


		 };
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicusagecontextvaluerange = researchelementdefinitioncharacteristicusagecontext.getValueRange();

		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluerangelow = researchelementdefinitioncharacteristicusagecontextvaluerange.getLow();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasValue()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl("]]");}


		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator = researchelementdefinitioncharacteristicusagecontextvaluerangelow.getComparator();
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator!=null) {
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {

		r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr("[[");		}
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr(researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator.toCode());
		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {

		r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr("]]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasCode()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangelow.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangelow.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys("]]");}


		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluerangehigh = researchelementdefinitioncharacteristicusagecontextvaluerange.getHigh();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasValue()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl("]]");}


		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator = researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getComparator();
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator!=null) {
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {

		r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr("[[");		}
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr(researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator.toCode());
		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {

		r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr("]]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasCode()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluerangehigh.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys("]]");}


		/******************** researchelementdefinitioncharacteristicusagecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluequantity = researchelementdefinitioncharacteristicusagecontext.getValueQuantity();

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasValue()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getValue()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl("]]");}


		/******************** researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator = researchelementdefinitioncharacteristicusagecontextvaluequantity.getComparator();
		if(researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator!=null) {
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {

		r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr("[[");		}
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr(researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator.toCode());
		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {

		r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr("]]");		}

		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasCode()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getCode()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasUnit()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getUnit()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt("]]");}


		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(researchelementdefinitioncharacteristicusagecontexti == 0) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntySys("[[");}
		if(researchelementdefinitioncharacteristicusagecontextvaluequantity.hasSystem()) {

			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntySys(String.valueOf(researchelementdefinitioncharacteristicusagecontextvaluequantity.getSystem()));
		} else {
			r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntySys("NULL");
		}

		if(researchelementdefinitioncharacteristicusagecontexti == researchelementdefinitioncharacteristicusagecontextlist.size()-1) {r.addRsrchElmntDfnCrctrstcUsgCntxtVlQntySys("]]");}


		 };
		/******************** RsrchElmntDfn_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(researchelementdefinitioncharacteristic.hasDefinitionCanonicalType()) {

			r.addRsrchElmntDfnCrctrstcDfnCanonicalTyp("\""+researchelementdefinitioncharacteristic.getDefinitionCanonicalType().getValueAsString()+"\"");
		} else {
			r.addRsrchElmntDfnCrctrstcDfnCanonicalTyp("NULL");
		}


		 };
		/******************** researchelementdefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> researchelementdefinitionjurisdictionlist = researchelementdefinition.getJurisdiction();
		for(int researchelementdefinitionjurisdictioni = 0; researchelementdefinitionjurisdictioni<researchelementdefinitionjurisdictionlist.size();researchelementdefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  researchelementdefinitionjurisdiction = researchelementdefinitionjurisdictionlist.get(researchelementdefinitionjurisdictioni);

		/******************** RsrchElmntDfn_Jrsdctn_Txt ********************************************************************************/
		if(researchelementdefinitionjurisdictioni == 0) {r.addRsrchElmntDfnJrsdctnTxt("[");}
		if(researchelementdefinitionjurisdiction.hasText()) {

			r.addRsrchElmntDfnJrsdctnTxt(String.valueOf(researchelementdefinitionjurisdiction.getText()));
		} else {
			r.addRsrchElmntDfnJrsdctnTxt("NULL");
		}

		if(researchelementdefinitionjurisdictioni == researchelementdefinitionjurisdictionlist.size()-1) {r.addRsrchElmntDfnJrsdctnTxt("]");}


		/******************** researchelementdefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitionjurisdictioncodinglist = researchelementdefinitionjurisdiction.getCoding();
		for(int researchelementdefinitionjurisdictioncodingi = 0; researchelementdefinitionjurisdictioncodingi<researchelementdefinitionjurisdictioncodinglist.size();researchelementdefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitionjurisdictioncoding = researchelementdefinitionjurisdictioncodinglist.get(researchelementdefinitionjurisdictioncodingi);

		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionjurisdictioncodingi == 0) {r.addRsrchElmntDfnJrsdctnCdgDsply("[[");}
		if(researchelementdefinitionjurisdictioncoding.hasDisplay()) {

			r.addRsrchElmntDfnJrsdctnCdgDsply(String.valueOf(researchelementdefinitionjurisdictioncoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnJrsdctnCdgDsply("NULL");
		}

		if(researchelementdefinitionjurisdictioncodingi == researchelementdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchElmntDfnJrsdctnCdgDsply("]]");}


		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionjurisdictioncodingi == 0) {r.addRsrchElmntDfnJrsdctnCdgVrsn("[[");}
		if(researchelementdefinitionjurisdictioncoding.hasVersion()) {

			r.addRsrchElmntDfnJrsdctnCdgVrsn(String.valueOf(researchelementdefinitionjurisdictioncoding.getVersion()));
		} else {
			r.addRsrchElmntDfnJrsdctnCdgVrsn("NULL");
		}

		if(researchelementdefinitionjurisdictioncodingi == researchelementdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchElmntDfnJrsdctnCdgVrsn("]]");}


		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionjurisdictioncodingi == 0) {r.addRsrchElmntDfnJrsdctnCdgCd("[[");}
		if(researchelementdefinitionjurisdictioncoding.hasCode()) {

			r.addRsrchElmntDfnJrsdctnCdgCd(String.valueOf(researchelementdefinitionjurisdictioncoding.getCode()));
		} else {
			r.addRsrchElmntDfnJrsdctnCdgCd("NULL");
		}

		if(researchelementdefinitionjurisdictioncodingi == researchelementdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchElmntDfnJrsdctnCdgCd("]]");}


		/******************** RsrchElmntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionjurisdictioncodingi == 0) {r.addRsrchElmntDfnJrsdctnCdgUsrSltd("[[");}
		if(researchelementdefinitionjurisdictioncoding.hasUserSelected()) {

			r.addRsrchElmntDfnJrsdctnCdgUsrSltd(String.valueOf(researchelementdefinitionjurisdictioncoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(researchelementdefinitionjurisdictioncodingi == researchelementdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchElmntDfnJrsdctnCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionjurisdictioncodingi == 0) {r.addRsrchElmntDfnJrsdctnCdgSys("[[");}
		if(researchelementdefinitionjurisdictioncoding.hasSystem()) {

			r.addRsrchElmntDfnJrsdctnCdgSys(String.valueOf(researchelementdefinitionjurisdictioncoding.getSystem()));
		} else {
			r.addRsrchElmntDfnJrsdctnCdgSys("NULL");
		}

		if(researchelementdefinitionjurisdictioncodingi == researchelementdefinitionjurisdictioncodinglist.size()-1) {r.addRsrchElmntDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** researchelementdefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> researchelementdefinitionusecontextlist = researchelementdefinition.getUseContext();
		for(int researchelementdefinitionusecontexti = 0; researchelementdefinitionusecontexti<researchelementdefinitionusecontextlist.size();researchelementdefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  researchelementdefinitionusecontext = researchelementdefinitionusecontextlist.get(researchelementdefinitionusecontexti);

		/******************** researchelementdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionusecontextcode = researchelementdefinitionusecontext.getCode();

		/******************** RsrchElmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtCdDsply("[");}
		if(researchelementdefinitionusecontextcode.hasDisplay()) {

			r.addRsrchElmntDfnUseCntxtCdDsply(String.valueOf(researchelementdefinitionusecontextcode.getDisplay()));
		} else {
			r.addRsrchElmntDfnUseCntxtCdDsply("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtCdDsply("]");}


		/******************** RsrchElmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtCdVrsn("[");}
		if(researchelementdefinitionusecontextcode.hasVersion()) {

			r.addRsrchElmntDfnUseCntxtCdVrsn(String.valueOf(researchelementdefinitionusecontextcode.getVersion()));
		} else {
			r.addRsrchElmntDfnUseCntxtCdVrsn("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtCdVrsn("]");}


		/******************** RsrchElmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtCdUsrSltd("[");}
		if(researchelementdefinitionusecontextcode.hasUserSelected()) {

			r.addRsrchElmntDfnUseCntxtCdUsrSltd(String.valueOf(researchelementdefinitionusecontextcode.getUserSelected()));
		} else {
			r.addRsrchElmntDfnUseCntxtCdUsrSltd("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtCdUsrSltd("]");}


		/******************** RsrchElmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtCdSys("[");}
		if(researchelementdefinitionusecontextcode.hasSystem()) {

			r.addRsrchElmntDfnUseCntxtCdSys(String.valueOf(researchelementdefinitionusecontextcode.getSystem()));
		} else {
			r.addRsrchElmntDfnUseCntxtCdSys("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtCdSys("]");}


		/******************** RsrchElmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRfrnc("[");}
		if(researchelementdefinitionusecontext.hasValueReference()) {

			if(researchelementdefinitionusecontext.getValueReference().getReference() != null) {
			r.addRsrchElmntDfnUseCntxtVlRfrnc(researchelementdefinitionusecontext.getValueReference().getReference());
			}
		} else {
			r.addRsrchElmntDfnUseCntxtVlRfrnc("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRfrnc("]");}


		/******************** researchelementdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionusecontextvaluecodeableconcept = researchelementdefinitionusecontext.getValueCodeableConcept();

		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptTxt("[");}
		if(researchelementdefinitionusecontextvaluecodeableconcept.hasText()) {

			r.addRsrchElmntDfnUseCntxtVlCdbleCncptTxt(String.valueOf(researchelementdefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** researchelementdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchelementdefinitionusecontextvaluecodeableconceptcodinglist = researchelementdefinitionusecontextvaluecodeableconcept.getCoding();
		for(int researchelementdefinitionusecontextvaluecodeableconceptcodingi = 0; researchelementdefinitionusecontextvaluecodeableconceptcodingi<researchelementdefinitionusecontextvaluecodeableconceptcodinglist.size();researchelementdefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchelementdefinitionusecontextvaluecodeableconceptcoding = researchelementdefinitionusecontextvaluecodeableconceptcodinglist.get(researchelementdefinitionusecontextvaluecodeableconceptcodingi);

		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == researchelementdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == researchelementdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == researchelementdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == researchelementdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == 0) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(researchelementdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(researchelementdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(researchelementdefinitionusecontextvaluecodeableconceptcodingi == researchelementdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** researchelementdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitionusecontextvaluerange = researchelementdefinitionusecontext.getValueRange();

		/******************** researchelementdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluerangelow = researchelementdefinitionusecontextvaluerange.getLow();

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngLwVl("[");}
		if(researchelementdefinitionusecontextvaluerangelow.hasValue()) {

			r.addRsrchElmntDfnUseCntxtVlRngLwVl(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getValue()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngLwVl("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngLwVl("]");}


		/******************** researchelementdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitionusecontextvaluerangelowcomparator = researchelementdefinitionusecontextvaluerangelow.getComparator();
		if(researchelementdefinitionusecontextvaluerangelowcomparator!=null) {
		if(researchelementdefinitionusecontexti == 0) {

		r.addRsrchElmntDfnUseCntxtVlRngLwCmprtr("[");		}
			r.addRsrchElmntDfnUseCntxtVlRngLwCmprtr(researchelementdefinitionusecontextvaluerangelowcomparator.toCode());
		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {

		r.addRsrchElmntDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngLwCd("[");}
		if(researchelementdefinitionusecontextvaluerangelow.hasCode()) {

			r.addRsrchElmntDfnUseCntxtVlRngLwCd(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getCode()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngLwCd("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngLwCd("]");}


		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngLwUnt("[");}
		if(researchelementdefinitionusecontextvaluerangelow.hasUnit()) {

			r.addRsrchElmntDfnUseCntxtVlRngLwUnt(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getUnit()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngLwUnt("]");}


		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngLwSys("[");}
		if(researchelementdefinitionusecontextvaluerangelow.hasSystem()) {

			r.addRsrchElmntDfnUseCntxtVlRngLwSys(String.valueOf(researchelementdefinitionusecontextvaluerangelow.getSystem()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngLwSys("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngLwSys("]");}


		/******************** researchelementdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluerangehigh = researchelementdefinitionusecontextvaluerange.getHigh();

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngHiVl("[");}
		if(researchelementdefinitionusecontextvaluerangehigh.hasValue()) {

			r.addRsrchElmntDfnUseCntxtVlRngHiVl(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getValue()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngHiVl("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngHiVl("]");}


		/******************** researchelementdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitionusecontextvaluerangehighcomparator = researchelementdefinitionusecontextvaluerangehigh.getComparator();
		if(researchelementdefinitionusecontextvaluerangehighcomparator!=null) {
		if(researchelementdefinitionusecontexti == 0) {

		r.addRsrchElmntDfnUseCntxtVlRngHiCmprtr("[");		}
			r.addRsrchElmntDfnUseCntxtVlRngHiCmprtr(researchelementdefinitionusecontextvaluerangehighcomparator.toCode());
		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {

		r.addRsrchElmntDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngHiCd("[");}
		if(researchelementdefinitionusecontextvaluerangehigh.hasCode()) {

			r.addRsrchElmntDfnUseCntxtVlRngHiCd(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getCode()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngHiCd("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngHiCd("]");}


		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngHiUnt("[");}
		if(researchelementdefinitionusecontextvaluerangehigh.hasUnit()) {

			r.addRsrchElmntDfnUseCntxtVlRngHiUnt(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngHiUnt("]");}


		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlRngHiSys("[");}
		if(researchelementdefinitionusecontextvaluerangehigh.hasSystem()) {

			r.addRsrchElmntDfnUseCntxtVlRngHiSys(String.valueOf(researchelementdefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlRngHiSys("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlRngHiSys("]");}


		/******************** researchelementdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluequantity = researchelementdefinitionusecontext.getValueQuantity();

		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlQntyVl("[");}
		if(researchelementdefinitionusecontextvaluequantity.hasValue()) {

			r.addRsrchElmntDfnUseCntxtVlQntyVl(String.valueOf(researchelementdefinitionusecontextvaluequantity.getValue()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlQntyVl("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlQntyVl("]");}


		/******************** researchelementdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator researchelementdefinitionusecontextvaluequantitycomparator = researchelementdefinitionusecontextvaluequantity.getComparator();
		if(researchelementdefinitionusecontextvaluequantitycomparator!=null) {
		if(researchelementdefinitionusecontexti == 0) {

		r.addRsrchElmntDfnUseCntxtVlQntyCmprtr("[");		}
			r.addRsrchElmntDfnUseCntxtVlQntyCmprtr(researchelementdefinitionusecontextvaluequantitycomparator.toCode());
		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {

		r.addRsrchElmntDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			r.addRsrchElmntDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlQntyCd("[");}
		if(researchelementdefinitionusecontextvaluequantity.hasCode()) {

			r.addRsrchElmntDfnUseCntxtVlQntyCd(String.valueOf(researchelementdefinitionusecontextvaluequantity.getCode()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlQntyCd("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlQntyCd("]");}


		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlQntyUnt("[");}
		if(researchelementdefinitionusecontextvaluequantity.hasUnit()) {

			r.addRsrchElmntDfnUseCntxtVlQntyUnt(String.valueOf(researchelementdefinitionusecontextvaluequantity.getUnit()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlQntyUnt("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlQntyUnt("]");}


		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(researchelementdefinitionusecontexti == 0) {r.addRsrchElmntDfnUseCntxtVlQntySys("[");}
		if(researchelementdefinitionusecontextvaluequantity.hasSystem()) {

			r.addRsrchElmntDfnUseCntxtVlQntySys(String.valueOf(researchelementdefinitionusecontextvaluequantity.getSystem()));
		} else {
			r.addRsrchElmntDfnUseCntxtVlQntySys("NULL");
		}

		if(researchelementdefinitionusecontexti == researchelementdefinitionusecontextlist.size()-1) {r.addRsrchElmntDfnUseCntxtVlQntySys("]");}


		 };
		/******************** RsrchElmntDfn_Exprmtl ********************************************************************************/
		if(researchelementdefinition.hasExperimental()) {

			r.addRsrchElmntDfnExprmtl(String.valueOf(researchelementdefinition.getExperimental()));
		} else {
			r.addRsrchElmntDfnExprmtl("NULL");
		}


		/******************** RsrchElmntDfn_Pblshr ********************************************************************************/
		if(researchelementdefinition.hasPublisher()) {

			r.addRsrchElmntDfnPblshr(String.valueOf(researchelementdefinition.getPublisher()));
		} else {
			r.addRsrchElmntDfnPblshr("NULL");
		}


		/******************** researchelementdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioneffectiveperiod = researchelementdefinition.getEffectivePeriod();

		/******************** RsrchElmntDfn_EfctivePrd_Strt ********************************************************************************/
		if(researchelementdefinitioneffectiveperiod.hasStart()) {

			r.addRsrchElmntDfnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioneffectiveperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnEfctivePrdStrt("NULL");
		}


		/******************** RsrchElmntDfn_EfctivePrd_End ********************************************************************************/
		if(researchelementdefinitioneffectiveperiod.hasEnd()) {

			r.addRsrchElmntDfnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitioneffectiveperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnEfctivePrdEnd("NULL");
		}


		/******************** researchelementdefinitionauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> researchelementdefinitionauthorlist = researchelementdefinition.getAuthor();
		for(int researchelementdefinitionauthori = 0; researchelementdefinitionauthori<researchelementdefinitionauthorlist.size();researchelementdefinitionauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  researchelementdefinitionauthor = researchelementdefinitionauthorlist.get(researchelementdefinitionauthori);

		/******************** RsrchElmntDfn_Athr_Nm ********************************************************************************/
		if(researchelementdefinitionauthori == 0) {r.addRsrchElmntDfnAthrNm("[");}
		if(researchelementdefinitionauthor.hasName()) {

			r.addRsrchElmntDfnAthrNm(String.valueOf(researchelementdefinitionauthor.getName()));
		} else {
			r.addRsrchElmntDfnAthrNm("NULL");
		}

		if(researchelementdefinitionauthori == researchelementdefinitionauthorlist.size()-1) {r.addRsrchElmntDfnAthrNm("]");}


		/******************** researchelementdefinitionauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> researchelementdefinitionauthortelecomlist = researchelementdefinitionauthor.getTelecom();
		for(int researchelementdefinitionauthortelecomi = 0; researchelementdefinitionauthortelecomi<researchelementdefinitionauthortelecomlist.size();researchelementdefinitionauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  researchelementdefinitionauthortelecom = researchelementdefinitionauthortelecomlist.get(researchelementdefinitionauthortelecomi);

		/******************** RsrchElmntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(researchelementdefinitionauthortelecomi == 0) {r.addRsrchElmntDfnAthrTlcmVl("[[");}
		if(researchelementdefinitionauthortelecom.hasValue()) {

			r.addRsrchElmntDfnAthrTlcmVl(String.valueOf(researchelementdefinitionauthortelecom.getValue()));
		} else {
			r.addRsrchElmntDfnAthrTlcmVl("NULL");
		}

		if(researchelementdefinitionauthortelecomi == researchelementdefinitionauthortelecomlist.size()-1) {r.addRsrchElmntDfnAthrTlcmVl("]]");}


		/******************** researchelementdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionauthortelecomperiod = researchelementdefinitionauthortelecom.getPeriod();

		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(researchelementdefinitionauthortelecomi == 0) {r.addRsrchElmntDfnAthrTlcmPrdStrt("[[");}
		if(researchelementdefinitionauthortelecomperiod.hasStart()) {

			r.addRsrchElmntDfnAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionauthortelecomperiod.getStart())+"\"");
		} else {
			r.addRsrchElmntDfnAthrTlcmPrdStrt("NULL");
		}

		if(researchelementdefinitionauthortelecomi == researchelementdefinitionauthortelecomlist.size()-1) {r.addRsrchElmntDfnAthrTlcmPrdStrt("]]");}


		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(researchelementdefinitionauthortelecomi == 0) {r.addRsrchElmntDfnAthrTlcmPrdEnd("[[");}
		if(researchelementdefinitionauthortelecomperiod.hasEnd()) {

			r.addRsrchElmntDfnAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchelementdefinitionauthortelecomperiod.getEnd())+"\"");
		} else {
			r.addRsrchElmntDfnAthrTlcmPrdEnd("NULL");
		}

		if(researchelementdefinitionauthortelecomi == researchelementdefinitionauthortelecomlist.size()-1) {r.addRsrchElmntDfnAthrTlcmPrdEnd("]]");}


		/******************** researchelementdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchelementdefinitionauthortelecomuse = researchelementdefinitionauthortelecom.getUse();
		if(researchelementdefinitionauthortelecomuse!=null) {
		if(researchelementdefinitionauthortelecomi == 0) {

		r.addRsrchElmntDfnAthrTlcmUse("[[");		}
			r.addRsrchElmntDfnAthrTlcmUse(researchelementdefinitionauthortelecomuse.toCode());
		if(researchelementdefinitionauthortelecomi == researchelementdefinitionauthortelecomlist.size()-1) {

		r.addRsrchElmntDfnAthrTlcmUse("]]");		}

		} else {
			r.addRsrchElmntDfnAthrTlcmUse("NULL");
		}

		/******************** researchelementdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchelementdefinitionauthortelecomsystem = researchelementdefinitionauthortelecom.getSystem();
		if(researchelementdefinitionauthortelecomsystem!=null) {
		if(researchelementdefinitionauthortelecomi == 0) {

		r.addRsrchElmntDfnAthrTlcmSys("[[");		}
			r.addRsrchElmntDfnAthrTlcmSys(researchelementdefinitionauthortelecomsystem.toCode());
		if(researchelementdefinitionauthortelecomi == researchelementdefinitionauthortelecomlist.size()-1) {

		r.addRsrchElmntDfnAthrTlcmSys("]]");		}

		} else {
			r.addRsrchElmntDfnAthrTlcmSys("NULL");
		}

		/******************** RsrchElmntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(researchelementdefinitionauthortelecomi == 0) {r.addRsrchElmntDfnAthrTlcmRnk("[[");}
		if(researchelementdefinitionauthortelecom.hasRank()) {

			r.addRsrchElmntDfnAthrTlcmRnk(String.valueOf(researchelementdefinitionauthortelecom.getRank()));
		} else {
			r.addRsrchElmntDfnAthrTlcmRnk("NULL");
		}

		if(researchelementdefinitionauthortelecomi == researchelementdefinitionauthortelecomlist.size()-1) {r.addRsrchElmntDfnAthrTlcmRnk("]]");}


		 };
		 };
		return r;
	}
}
