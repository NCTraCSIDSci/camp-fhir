package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EvidenceVariable;
public class EvidenceVariableBidirectionalConversion 
{
	public EvidenceVariable EvidenceVariables(org.hl7.fhir.r4.model.EvidenceVariable evidencevariable) throws ParseException
	{
		 main.java.com.campfhir.model.EvidenceVariable e = new  main.java.com.campfhir.model.EvidenceVariable();

		/******************** id ********************************************************************************/
		e.setId(evidencevariable.getIdElement().getIdPart());

		/******************** EvdnceVrble_Nm ********************************************************************************/
		if(evidencevariable.hasName()) {

			e.addEvdnceVrbleNm(String.valueOf(evidencevariable.getName()));
		} else {
			e.addEvdnceVrbleNm("NULL");
		}


		/******************** evidencevariabletype ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableType evidencevariabletype = evidencevariable.getType();
		if(evidencevariabletype!=null) {
			e.addEvdnceVrbleTyp(evidencevariabletype.toCode());
		} else {
			e.addEvdnceVrbleTyp("NULL");
		}

		/******************** EvdnceVrble_Vrsn ********************************************************************************/
		if(evidencevariable.hasVersion()) {

			e.addEvdnceVrbleVrsn(String.valueOf(evidencevariable.getVersion()));
		} else {
			e.addEvdnceVrbleVrsn("NULL");
		}


		/******************** EvdnceVrble_Dt ********************************************************************************/
		if(evidencevariable.hasDate()) {

			e.addEvdnceVrbleDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariable.getDate())+"\"");
		} else {
			e.addEvdnceVrbleDt("NULL");
		}


		/******************** evidencevariablestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus evidencevariablestatus = evidencevariable.getStatus();
		if(evidencevariablestatus!=null) {
			e.addEvdnceVrbleSts(evidencevariablestatus.toCode());
		} else {
			e.addEvdnceVrbleSts("NULL");
		}

		/******************** EvdnceVrble_Dscrptn ********************************************************************************/
		if(evidencevariable.hasDescription()) {

			e.addEvdnceVrbleDscrptn(String.valueOf(evidencevariable.getDescription()));
		} else {
			e.addEvdnceVrbleDscrptn("NULL");
		}


		/******************** evidencevariablenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> evidencevariablenotelist = evidencevariable.getNote();
		for(int evidencevariablenotei = 0; evidencevariablenotei<evidencevariablenotelist.size();evidencevariablenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  evidencevariablenote = evidencevariablenotelist.get(evidencevariablenotei);

		/******************** EvdnceVrble_Nt_Time ********************************************************************************/
		if(evidencevariablenotei == 0) {e.addEvdnceVrbleNtTime("[");}
		if(evidencevariablenote.hasTime()) {

			e.addEvdnceVrbleNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablenote.getTime())+"\"");
		} else {
			e.addEvdnceVrbleNtTime("NULL");
		}

		if(evidencevariablenotei == evidencevariablenotelist.size()-1) {e.addEvdnceVrbleNtTime("]");}


		/******************** EvdnceVrble_Nt_AthrRfrnc ********************************************************************************/
		if(evidencevariablenotei == 0) {e.addEvdnceVrbleNtAthrRfrnc("[");}
		if(evidencevariablenote.hasAuthorReference()) {

			if(evidencevariablenote.getAuthorReference().getReference() != null) {
			e.addEvdnceVrbleNtAthrRfrnc(evidencevariablenote.getAuthorReference().getReference());
			}
		} else {
			e.addEvdnceVrbleNtAthrRfrnc("NULL");
		}

		if(evidencevariablenotei == evidencevariablenotelist.size()-1) {e.addEvdnceVrbleNtAthrRfrnc("]");}


		/******************** EvdnceVrble_Nt_Txt ********************************************************************************/
		if(evidencevariablenotei == 0) {e.addEvdnceVrbleNtTxt("[");}
		if(evidencevariablenote.hasText()) {

			e.addEvdnceVrbleNtTxt(String.valueOf(evidencevariablenote.getText()));
		} else {
			e.addEvdnceVrbleNtTxt("NULL");
		}

		if(evidencevariablenotei == evidencevariablenotelist.size()-1) {e.addEvdnceVrbleNtTxt("]");}


		/******************** EvdnceVrble_Nt_AthrStrgTyp ********************************************************************************/
		if(evidencevariablenotei == 0) {e.addEvdnceVrbleNtAthrStrgTyp("[");}
		if(evidencevariablenote.hasAuthorStringType()) {

			e.addEvdnceVrbleNtAthrStrgTyp("\""+evidencevariablenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			e.addEvdnceVrbleNtAthrStrgTyp("NULL");
		}

		if(evidencevariablenotei == evidencevariablenotelist.size()-1) {e.addEvdnceVrbleNtAthrStrgTyp("]");}


		 };
		/******************** evidencevariableidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> evidencevariableidentifierlist = evidencevariable.getIdentifier();
		for(int evidencevariableidentifieri = 0; evidencevariableidentifieri<evidencevariableidentifierlist.size();evidencevariableidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  evidencevariableidentifier = evidencevariableidentifierlist.get(evidencevariableidentifieri);

		/******************** EvdnceVrble_Id_Vl ********************************************************************************/
		if(evidencevariableidentifieri == 0) {e.addEvdnceVrbleIdVl("[");}
		if(evidencevariableidentifier.hasValue()) {

			e.addEvdnceVrbleIdVl(String.valueOf(evidencevariableidentifier.getValue()));
		} else {
			e.addEvdnceVrbleIdVl("NULL");
		}

		if(evidencevariableidentifieri == evidencevariableidentifierlist.size()-1) {e.addEvdnceVrbleIdVl("]");}


		/******************** evidencevariableidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariableidentifiertype = evidencevariableidentifier.getType();

		/******************** EvdnceVrble_Id_Typ_Txt ********************************************************************************/
		if(evidencevariableidentifieri == 0) {e.addEvdnceVrbleIdTypTxt("[");}
		if(evidencevariableidentifiertype.hasText()) {

			e.addEvdnceVrbleIdTypTxt(String.valueOf(evidencevariableidentifiertype.getText()));
		} else {
			e.addEvdnceVrbleIdTypTxt("NULL");
		}

		if(evidencevariableidentifieri == evidencevariableidentifierlist.size()-1) {e.addEvdnceVrbleIdTypTxt("]");}


		/******************** evidencevariableidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariableidentifiertypecodinglist = evidencevariableidentifiertype.getCoding();
		for(int evidencevariableidentifiertypecodingi = 0; evidencevariableidentifiertypecodingi<evidencevariableidentifiertypecodinglist.size();evidencevariableidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariableidentifiertypecoding = evidencevariableidentifiertypecodinglist.get(evidencevariableidentifiertypecodingi);

		/******************** EvdnceVrble_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(evidencevariableidentifiertypecodingi == 0) {e.addEvdnceVrbleIdTypCdgDsply("[[");}
		if(evidencevariableidentifiertypecoding.hasDisplay()) {

			e.addEvdnceVrbleIdTypCdgDsply(String.valueOf(evidencevariableidentifiertypecoding.getDisplay()));
		} else {
			e.addEvdnceVrbleIdTypCdgDsply("NULL");
		}

		if(evidencevariableidentifiertypecodingi == evidencevariableidentifiertypecodinglist.size()-1) {e.addEvdnceVrbleIdTypCdgDsply("]]");}


		/******************** EvdnceVrble_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(evidencevariableidentifiertypecodingi == 0) {e.addEvdnceVrbleIdTypCdgVrsn("[[");}
		if(evidencevariableidentifiertypecoding.hasVersion()) {

			e.addEvdnceVrbleIdTypCdgVrsn(String.valueOf(evidencevariableidentifiertypecoding.getVersion()));
		} else {
			e.addEvdnceVrbleIdTypCdgVrsn("NULL");
		}

		if(evidencevariableidentifiertypecodingi == evidencevariableidentifiertypecodinglist.size()-1) {e.addEvdnceVrbleIdTypCdgVrsn("]]");}


		/******************** EvdnceVrble_Id_Typ_Cdg_Cd ********************************************************************************/
		if(evidencevariableidentifiertypecodingi == 0) {e.addEvdnceVrbleIdTypCdgCd("[[");}
		if(evidencevariableidentifiertypecoding.hasCode()) {

			e.addEvdnceVrbleIdTypCdgCd(String.valueOf(evidencevariableidentifiertypecoding.getCode()));
		} else {
			e.addEvdnceVrbleIdTypCdgCd("NULL");
		}

		if(evidencevariableidentifiertypecodingi == evidencevariableidentifiertypecodinglist.size()-1) {e.addEvdnceVrbleIdTypCdgCd("]]");}


		/******************** EvdnceVrble_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariableidentifiertypecodingi == 0) {e.addEvdnceVrbleIdTypCdgUsrSltd("[[");}
		if(evidencevariableidentifiertypecoding.hasUserSelected()) {

			e.addEvdnceVrbleIdTypCdgUsrSltd(String.valueOf(evidencevariableidentifiertypecoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleIdTypCdgUsrSltd("NULL");
		}

		if(evidencevariableidentifiertypecodingi == evidencevariableidentifiertypecodinglist.size()-1) {e.addEvdnceVrbleIdTypCdgUsrSltd("]]");}


		/******************** EvdnceVrble_Id_Typ_Cdg_Sys ********************************************************************************/
		if(evidencevariableidentifiertypecodingi == 0) {e.addEvdnceVrbleIdTypCdgSys("[[");}
		if(evidencevariableidentifiertypecoding.hasSystem()) {

			e.addEvdnceVrbleIdTypCdgSys(String.valueOf(evidencevariableidentifiertypecoding.getSystem()));
		} else {
			e.addEvdnceVrbleIdTypCdgSys("NULL");
		}

		if(evidencevariableidentifiertypecodingi == evidencevariableidentifiertypecodinglist.size()-1) {e.addEvdnceVrbleIdTypCdgSys("]]");}


		 };
		/******************** evidencevariableidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableidentifierperiod = evidencevariableidentifier.getPeriod();

		/******************** EvdnceVrble_Id_Prd_Strt ********************************************************************************/
		if(evidencevariableidentifieri == 0) {e.addEvdnceVrbleIdPrdStrt("[");}
		if(evidencevariableidentifierperiod.hasStart()) {

			e.addEvdnceVrbleIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableidentifierperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleIdPrdStrt("NULL");
		}

		if(evidencevariableidentifieri == evidencevariableidentifierlist.size()-1) {e.addEvdnceVrbleIdPrdStrt("]");}


		/******************** EvdnceVrble_Id_Prd_End ********************************************************************************/
		if(evidencevariableidentifieri == 0) {e.addEvdnceVrbleIdPrdEnd("[");}
		if(evidencevariableidentifierperiod.hasEnd()) {

			e.addEvdnceVrbleIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableidentifierperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleIdPrdEnd("NULL");
		}

		if(evidencevariableidentifieri == evidencevariableidentifierlist.size()-1) {e.addEvdnceVrbleIdPrdEnd("]");}


		/******************** evidencevariableidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse evidencevariableidentifieruse = evidencevariableidentifier.getUse();
		if(evidencevariableidentifieruse!=null) {
		if(evidencevariableidentifieri == 0) {

		e.addEvdnceVrbleIdUse("[");		}
			e.addEvdnceVrbleIdUse(evidencevariableidentifieruse.toCode());
		if(evidencevariableidentifieri == evidencevariableidentifierlist.size()-1) {

		e.addEvdnceVrbleIdUse("]");		}

		} else {
			e.addEvdnceVrbleIdUse("NULL");
		}

		/******************** EvdnceVrble_Id_Assigner ********************************************************************************/
		if(evidencevariableidentifieri == 0) {e.addEvdnceVrbleIdAssigner("[");}
		if(evidencevariableidentifier.hasAssigner()) {

			if(evidencevariableidentifier.getAssigner().getReference() != null) {
			e.addEvdnceVrbleIdAssigner(evidencevariableidentifier.getAssigner().getReference());
			}
		} else {
			e.addEvdnceVrbleIdAssigner("NULL");
		}

		if(evidencevariableidentifieri == evidencevariableidentifierlist.size()-1) {e.addEvdnceVrbleIdAssigner("]");}


		/******************** EvdnceVrble_Id_Sys ********************************************************************************/
		if(evidencevariableidentifieri == 0) {e.addEvdnceVrbleIdSys("[");}
		if(evidencevariableidentifier.hasSystem()) {

			e.addEvdnceVrbleIdSys(String.valueOf(evidencevariableidentifier.getSystem()));
		} else {
			e.addEvdnceVrbleIdSys("NULL");
		}

		if(evidencevariableidentifieri == evidencevariableidentifierlist.size()-1) {e.addEvdnceVrbleIdSys("]");}


		 };
		/******************** evidencevariablecontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidencevariablecontactlist = evidencevariable.getContact();
		for(int evidencevariablecontacti = 0; evidencevariablecontacti<evidencevariablecontactlist.size();evidencevariablecontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidencevariablecontact = evidencevariablecontactlist.get(evidencevariablecontacti);

		/******************** EvdnceVrble_Cntct_Nm ********************************************************************************/
		if(evidencevariablecontacti == 0) {e.addEvdnceVrbleCntctNm("[");}
		if(evidencevariablecontact.hasName()) {

			e.addEvdnceVrbleCntctNm(String.valueOf(evidencevariablecontact.getName()));
		} else {
			e.addEvdnceVrbleCntctNm("NULL");
		}

		if(evidencevariablecontacti == evidencevariablecontactlist.size()-1) {e.addEvdnceVrbleCntctNm("]");}


		/******************** evidencevariablecontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidencevariablecontacttelecomlist = evidencevariablecontact.getTelecom();
		for(int evidencevariablecontacttelecomi = 0; evidencevariablecontacttelecomi<evidencevariablecontacttelecomlist.size();evidencevariablecontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidencevariablecontacttelecom = evidencevariablecontacttelecomlist.get(evidencevariablecontacttelecomi);

		/******************** EvdnceVrble_Cntct_Tlcm_Vl ********************************************************************************/
		if(evidencevariablecontacttelecomi == 0) {e.addEvdnceVrbleCntctTlcmVl("[[");}
		if(evidencevariablecontacttelecom.hasValue()) {

			e.addEvdnceVrbleCntctTlcmVl(String.valueOf(evidencevariablecontacttelecom.getValue()));
		} else {
			e.addEvdnceVrbleCntctTlcmVl("NULL");
		}

		if(evidencevariablecontacttelecomi == evidencevariablecontacttelecomlist.size()-1) {e.addEvdnceVrbleCntctTlcmVl("]]");}


		/******************** evidencevariablecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecontacttelecomperiod = evidencevariablecontacttelecom.getPeriod();

		/******************** EvdnceVrble_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariablecontacttelecomi == 0) {e.addEvdnceVrbleCntctTlcmPrdStrt("[[");}
		if(evidencevariablecontacttelecomperiod.hasStart()) {

			e.addEvdnceVrbleCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecontacttelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleCntctTlcmPrdStrt("NULL");
		}

		if(evidencevariablecontacttelecomi == evidencevariablecontacttelecomlist.size()-1) {e.addEvdnceVrbleCntctTlcmPrdStrt("]]");}


		/******************** EvdnceVrble_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariablecontacttelecomi == 0) {e.addEvdnceVrbleCntctTlcmPrdEnd("[[");}
		if(evidencevariablecontacttelecomperiod.hasEnd()) {

			e.addEvdnceVrbleCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecontacttelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleCntctTlcmPrdEnd("NULL");
		}

		if(evidencevariablecontacttelecomi == evidencevariablecontacttelecomlist.size()-1) {e.addEvdnceVrbleCntctTlcmPrdEnd("]]");}


		/******************** evidencevariablecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariablecontacttelecomuse = evidencevariablecontacttelecom.getUse();
		if(evidencevariablecontacttelecomuse!=null) {
		if(evidencevariablecontacttelecomi == 0) {

		e.addEvdnceVrbleCntctTlcmUse("[[");		}
			e.addEvdnceVrbleCntctTlcmUse(evidencevariablecontacttelecomuse.toCode());
		if(evidencevariablecontacttelecomi == evidencevariablecontacttelecomlist.size()-1) {

		e.addEvdnceVrbleCntctTlcmUse("]]");		}

		} else {
			e.addEvdnceVrbleCntctTlcmUse("NULL");
		}

		/******************** evidencevariablecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariablecontacttelecomsystem = evidencevariablecontacttelecom.getSystem();
		if(evidencevariablecontacttelecomsystem!=null) {
		if(evidencevariablecontacttelecomi == 0) {

		e.addEvdnceVrbleCntctTlcmSys("[[");		}
			e.addEvdnceVrbleCntctTlcmSys(evidencevariablecontacttelecomsystem.toCode());
		if(evidencevariablecontacttelecomi == evidencevariablecontacttelecomlist.size()-1) {

		e.addEvdnceVrbleCntctTlcmSys("]]");		}

		} else {
			e.addEvdnceVrbleCntctTlcmSys("NULL");
		}

		/******************** EvdnceVrble_Cntct_Tlcm_Rnk ********************************************************************************/
		if(evidencevariablecontacttelecomi == 0) {e.addEvdnceVrbleCntctTlcmRnk("[[");}
		if(evidencevariablecontacttelecom.hasRank()) {

			e.addEvdnceVrbleCntctTlcmRnk(String.valueOf(evidencevariablecontacttelecom.getRank()));
		} else {
			e.addEvdnceVrbleCntctTlcmRnk("NULL");
		}

		if(evidencevariablecontacttelecomi == evidencevariablecontacttelecomlist.size()-1) {e.addEvdnceVrbleCntctTlcmRnk("]]");}


		 };
		 };
		/******************** EvdnceVrble_Copyright ********************************************************************************/
		if(evidencevariable.hasCopyright()) {

			e.addEvdnceVrbleCopyright(String.valueOf(evidencevariable.getCopyright()));
		} else {
			e.addEvdnceVrbleCopyright("NULL");
		}


		/******************** EvdnceVrble_ApprovalDt ********************************************************************************/
		if(evidencevariable.hasApprovalDate()) {

			e.addEvdnceVrbleApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariable.getApprovalDate())+"\"");
		} else {
			e.addEvdnceVrbleApprovalDt("NULL");
		}


		/******************** evidencevariableendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidencevariableendorserlist = evidencevariable.getEndorser();
		for(int evidencevariableendorseri = 0; evidencevariableendorseri<evidencevariableendorserlist.size();evidencevariableendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidencevariableendorser = evidencevariableendorserlist.get(evidencevariableendorseri);

		/******************** EvdnceVrble_Endsr_Nm ********************************************************************************/
		if(evidencevariableendorseri == 0) {e.addEvdnceVrbleEndsrNm("[");}
		if(evidencevariableendorser.hasName()) {

			e.addEvdnceVrbleEndsrNm(String.valueOf(evidencevariableendorser.getName()));
		} else {
			e.addEvdnceVrbleEndsrNm("NULL");
		}

		if(evidencevariableendorseri == evidencevariableendorserlist.size()-1) {e.addEvdnceVrbleEndsrNm("]");}


		/******************** evidencevariableendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidencevariableendorsertelecomlist = evidencevariableendorser.getTelecom();
		for(int evidencevariableendorsertelecomi = 0; evidencevariableendorsertelecomi<evidencevariableendorsertelecomlist.size();evidencevariableendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidencevariableendorsertelecom = evidencevariableendorsertelecomlist.get(evidencevariableendorsertelecomi);

		/******************** EvdnceVrble_Endsr_Tlcm_Vl ********************************************************************************/
		if(evidencevariableendorsertelecomi == 0) {e.addEvdnceVrbleEndsrTlcmVl("[[");}
		if(evidencevariableendorsertelecom.hasValue()) {

			e.addEvdnceVrbleEndsrTlcmVl(String.valueOf(evidencevariableendorsertelecom.getValue()));
		} else {
			e.addEvdnceVrbleEndsrTlcmVl("NULL");
		}

		if(evidencevariableendorsertelecomi == evidencevariableendorsertelecomlist.size()-1) {e.addEvdnceVrbleEndsrTlcmVl("]]");}


		/******************** evidencevariableendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableendorsertelecomperiod = evidencevariableendorsertelecom.getPeriod();

		/******************** EvdnceVrble_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariableendorsertelecomi == 0) {e.addEvdnceVrbleEndsrTlcmPrdStrt("[[");}
		if(evidencevariableendorsertelecomperiod.hasStart()) {

			e.addEvdnceVrbleEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableendorsertelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleEndsrTlcmPrdStrt("NULL");
		}

		if(evidencevariableendorsertelecomi == evidencevariableendorsertelecomlist.size()-1) {e.addEvdnceVrbleEndsrTlcmPrdStrt("]]");}


		/******************** EvdnceVrble_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariableendorsertelecomi == 0) {e.addEvdnceVrbleEndsrTlcmPrdEnd("[[");}
		if(evidencevariableendorsertelecomperiod.hasEnd()) {

			e.addEvdnceVrbleEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableendorsertelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleEndsrTlcmPrdEnd("NULL");
		}

		if(evidencevariableendorsertelecomi == evidencevariableendorsertelecomlist.size()-1) {e.addEvdnceVrbleEndsrTlcmPrdEnd("]]");}


		/******************** evidencevariableendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariableendorsertelecomuse = evidencevariableendorsertelecom.getUse();
		if(evidencevariableendorsertelecomuse!=null) {
		if(evidencevariableendorsertelecomi == 0) {

		e.addEvdnceVrbleEndsrTlcmUse("[[");		}
			e.addEvdnceVrbleEndsrTlcmUse(evidencevariableendorsertelecomuse.toCode());
		if(evidencevariableendorsertelecomi == evidencevariableendorsertelecomlist.size()-1) {

		e.addEvdnceVrbleEndsrTlcmUse("]]");		}

		} else {
			e.addEvdnceVrbleEndsrTlcmUse("NULL");
		}

		/******************** evidencevariableendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariableendorsertelecomsystem = evidencevariableendorsertelecom.getSystem();
		if(evidencevariableendorsertelecomsystem!=null) {
		if(evidencevariableendorsertelecomi == 0) {

		e.addEvdnceVrbleEndsrTlcmSys("[[");		}
			e.addEvdnceVrbleEndsrTlcmSys(evidencevariableendorsertelecomsystem.toCode());
		if(evidencevariableendorsertelecomi == evidencevariableendorsertelecomlist.size()-1) {

		e.addEvdnceVrbleEndsrTlcmSys("]]");		}

		} else {
			e.addEvdnceVrbleEndsrTlcmSys("NULL");
		}

		/******************** EvdnceVrble_Endsr_Tlcm_Rnk ********************************************************************************/
		if(evidencevariableendorsertelecomi == 0) {e.addEvdnceVrbleEndsrTlcmRnk("[[");}
		if(evidencevariableendorsertelecom.hasRank()) {

			e.addEvdnceVrbleEndsrTlcmRnk(String.valueOf(evidencevariableendorsertelecom.getRank()));
		} else {
			e.addEvdnceVrbleEndsrTlcmRnk("NULL");
		}

		if(evidencevariableendorsertelecomi == evidencevariableendorsertelecomlist.size()-1) {e.addEvdnceVrbleEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** EvdnceVrble_LastReviewDt ********************************************************************************/
		if(evidencevariable.hasLastReviewDate()) {

			e.addEvdnceVrbleLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariable.getLastReviewDate())+"\"");
		} else {
			e.addEvdnceVrbleLastReviewDt("NULL");
		}


		/******************** evidencevariableeditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidencevariableeditorlist = evidencevariable.getEditor();
		for(int evidencevariableeditori = 0; evidencevariableeditori<evidencevariableeditorlist.size();evidencevariableeditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidencevariableeditor = evidencevariableeditorlist.get(evidencevariableeditori);

		/******************** EvdnceVrble_Editor_Nm ********************************************************************************/
		if(evidencevariableeditori == 0) {e.addEvdnceVrbleEditorNm("[");}
		if(evidencevariableeditor.hasName()) {

			e.addEvdnceVrbleEditorNm(String.valueOf(evidencevariableeditor.getName()));
		} else {
			e.addEvdnceVrbleEditorNm("NULL");
		}

		if(evidencevariableeditori == evidencevariableeditorlist.size()-1) {e.addEvdnceVrbleEditorNm("]");}


		/******************** evidencevariableeditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidencevariableeditortelecomlist = evidencevariableeditor.getTelecom();
		for(int evidencevariableeditortelecomi = 0; evidencevariableeditortelecomi<evidencevariableeditortelecomlist.size();evidencevariableeditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidencevariableeditortelecom = evidencevariableeditortelecomlist.get(evidencevariableeditortelecomi);

		/******************** EvdnceVrble_Editor_Tlcm_Vl ********************************************************************************/
		if(evidencevariableeditortelecomi == 0) {e.addEvdnceVrbleEditorTlcmVl("[[");}
		if(evidencevariableeditortelecom.hasValue()) {

			e.addEvdnceVrbleEditorTlcmVl(String.valueOf(evidencevariableeditortelecom.getValue()));
		} else {
			e.addEvdnceVrbleEditorTlcmVl("NULL");
		}

		if(evidencevariableeditortelecomi == evidencevariableeditortelecomlist.size()-1) {e.addEvdnceVrbleEditorTlcmVl("]]");}


		/******************** evidencevariableeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableeditortelecomperiod = evidencevariableeditortelecom.getPeriod();

		/******************** EvdnceVrble_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariableeditortelecomi == 0) {e.addEvdnceVrbleEditorTlcmPrdStrt("[[");}
		if(evidencevariableeditortelecomperiod.hasStart()) {

			e.addEvdnceVrbleEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableeditortelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleEditorTlcmPrdStrt("NULL");
		}

		if(evidencevariableeditortelecomi == evidencevariableeditortelecomlist.size()-1) {e.addEvdnceVrbleEditorTlcmPrdStrt("]]");}


		/******************** EvdnceVrble_Editor_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariableeditortelecomi == 0) {e.addEvdnceVrbleEditorTlcmPrdEnd("[[");}
		if(evidencevariableeditortelecomperiod.hasEnd()) {

			e.addEvdnceVrbleEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableeditortelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleEditorTlcmPrdEnd("NULL");
		}

		if(evidencevariableeditortelecomi == evidencevariableeditortelecomlist.size()-1) {e.addEvdnceVrbleEditorTlcmPrdEnd("]]");}


		/******************** evidencevariableeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariableeditortelecomuse = evidencevariableeditortelecom.getUse();
		if(evidencevariableeditortelecomuse!=null) {
		if(evidencevariableeditortelecomi == 0) {

		e.addEvdnceVrbleEditorTlcmUse("[[");		}
			e.addEvdnceVrbleEditorTlcmUse(evidencevariableeditortelecomuse.toCode());
		if(evidencevariableeditortelecomi == evidencevariableeditortelecomlist.size()-1) {

		e.addEvdnceVrbleEditorTlcmUse("]]");		}

		} else {
			e.addEvdnceVrbleEditorTlcmUse("NULL");
		}

		/******************** evidencevariableeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariableeditortelecomsystem = evidencevariableeditortelecom.getSystem();
		if(evidencevariableeditortelecomsystem!=null) {
		if(evidencevariableeditortelecomi == 0) {

		e.addEvdnceVrbleEditorTlcmSys("[[");		}
			e.addEvdnceVrbleEditorTlcmSys(evidencevariableeditortelecomsystem.toCode());
		if(evidencevariableeditortelecomi == evidencevariableeditortelecomlist.size()-1) {

		e.addEvdnceVrbleEditorTlcmSys("]]");		}

		} else {
			e.addEvdnceVrbleEditorTlcmSys("NULL");
		}

		/******************** EvdnceVrble_Editor_Tlcm_Rnk ********************************************************************************/
		if(evidencevariableeditortelecomi == 0) {e.addEvdnceVrbleEditorTlcmRnk("[[");}
		if(evidencevariableeditortelecom.hasRank()) {

			e.addEvdnceVrbleEditorTlcmRnk(String.valueOf(evidencevariableeditortelecom.getRank()));
		} else {
			e.addEvdnceVrbleEditorTlcmRnk("NULL");
		}

		if(evidencevariableeditortelecomi == evidencevariableeditortelecomlist.size()-1) {e.addEvdnceVrbleEditorTlcmRnk("]]");}


		 };
		 };
		/******************** evidencevariablereviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidencevariablereviewerlist = evidencevariable.getReviewer();
		for(int evidencevariablerevieweri = 0; evidencevariablerevieweri<evidencevariablereviewerlist.size();evidencevariablerevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidencevariablereviewer = evidencevariablereviewerlist.get(evidencevariablerevieweri);

		/******************** EvdnceVrble_Rviewr_Nm ********************************************************************************/
		if(evidencevariablerevieweri == 0) {e.addEvdnceVrbleRviewrNm("[");}
		if(evidencevariablereviewer.hasName()) {

			e.addEvdnceVrbleRviewrNm(String.valueOf(evidencevariablereviewer.getName()));
		} else {
			e.addEvdnceVrbleRviewrNm("NULL");
		}

		if(evidencevariablerevieweri == evidencevariablereviewerlist.size()-1) {e.addEvdnceVrbleRviewrNm("]");}


		/******************** evidencevariablereviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidencevariablereviewertelecomlist = evidencevariablereviewer.getTelecom();
		for(int evidencevariablereviewertelecomi = 0; evidencevariablereviewertelecomi<evidencevariablereviewertelecomlist.size();evidencevariablereviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidencevariablereviewertelecom = evidencevariablereviewertelecomlist.get(evidencevariablereviewertelecomi);

		/******************** EvdnceVrble_Rviewr_Tlcm_Vl ********************************************************************************/
		if(evidencevariablereviewertelecomi == 0) {e.addEvdnceVrbleRviewrTlcmVl("[[");}
		if(evidencevariablereviewertelecom.hasValue()) {

			e.addEvdnceVrbleRviewrTlcmVl(String.valueOf(evidencevariablereviewertelecom.getValue()));
		} else {
			e.addEvdnceVrbleRviewrTlcmVl("NULL");
		}

		if(evidencevariablereviewertelecomi == evidencevariablereviewertelecomlist.size()-1) {e.addEvdnceVrbleRviewrTlcmVl("]]");}


		/******************** evidencevariablereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablereviewertelecomperiod = evidencevariablereviewertelecom.getPeriod();

		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariablereviewertelecomi == 0) {e.addEvdnceVrbleRviewrTlcmPrdStrt("[[");}
		if(evidencevariablereviewertelecomperiod.hasStart()) {

			e.addEvdnceVrbleRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablereviewertelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleRviewrTlcmPrdStrt("NULL");
		}

		if(evidencevariablereviewertelecomi == evidencevariablereviewertelecomlist.size()-1) {e.addEvdnceVrbleRviewrTlcmPrdStrt("]]");}


		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariablereviewertelecomi == 0) {e.addEvdnceVrbleRviewrTlcmPrdEnd("[[");}
		if(evidencevariablereviewertelecomperiod.hasEnd()) {

			e.addEvdnceVrbleRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablereviewertelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleRviewrTlcmPrdEnd("NULL");
		}

		if(evidencevariablereviewertelecomi == evidencevariablereviewertelecomlist.size()-1) {e.addEvdnceVrbleRviewrTlcmPrdEnd("]]");}


		/******************** evidencevariablereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariablereviewertelecomuse = evidencevariablereviewertelecom.getUse();
		if(evidencevariablereviewertelecomuse!=null) {
		if(evidencevariablereviewertelecomi == 0) {

		e.addEvdnceVrbleRviewrTlcmUse("[[");		}
			e.addEvdnceVrbleRviewrTlcmUse(evidencevariablereviewertelecomuse.toCode());
		if(evidencevariablereviewertelecomi == evidencevariablereviewertelecomlist.size()-1) {

		e.addEvdnceVrbleRviewrTlcmUse("]]");		}

		} else {
			e.addEvdnceVrbleRviewrTlcmUse("NULL");
		}

		/******************** evidencevariablereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariablereviewertelecomsystem = evidencevariablereviewertelecom.getSystem();
		if(evidencevariablereviewertelecomsystem!=null) {
		if(evidencevariablereviewertelecomi == 0) {

		e.addEvdnceVrbleRviewrTlcmSys("[[");		}
			e.addEvdnceVrbleRviewrTlcmSys(evidencevariablereviewertelecomsystem.toCode());
		if(evidencevariablereviewertelecomi == evidencevariablereviewertelecomlist.size()-1) {

		e.addEvdnceVrbleRviewrTlcmSys("]]");		}

		} else {
			e.addEvdnceVrbleRviewrTlcmSys("NULL");
		}

		/******************** EvdnceVrble_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(evidencevariablereviewertelecomi == 0) {e.addEvdnceVrbleRviewrTlcmRnk("[[");}
		if(evidencevariablereviewertelecom.hasRank()) {

			e.addEvdnceVrbleRviewrTlcmRnk(String.valueOf(evidencevariablereviewertelecom.getRank()));
		} else {
			e.addEvdnceVrbleRviewrTlcmRnk("NULL");
		}

		if(evidencevariablereviewertelecomi == evidencevariablereviewertelecomlist.size()-1) {e.addEvdnceVrbleRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** EvdnceVrble_Ttl ********************************************************************************/
		if(evidencevariable.hasTitle()) {

			e.addEvdnceVrbleTtl(String.valueOf(evidencevariable.getTitle()));
		} else {
			e.addEvdnceVrbleTtl("NULL");
		}


		/******************** evidencevariablerelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> evidencevariablerelatedartifactlist = evidencevariable.getRelatedArtifact();
		for(int evidencevariablerelatedartifacti = 0; evidencevariablerelatedartifacti<evidencevariablerelatedartifactlist.size();evidencevariablerelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  evidencevariablerelatedartifact = evidencevariablerelatedartifactlist.get(evidencevariablerelatedartifacti);

		/******************** EvdnceVrble_RltedArtfct_Rsrc ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctRsrc("[");}
		if(evidencevariablerelatedartifact.hasResource()) {

			e.addEvdnceVrbleRltedArtfctRsrc(String.valueOf(evidencevariablerelatedartifact.getResource()));
		} else {
			e.addEvdnceVrbleRltedArtfctRsrc("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctRsrc("]");}


		/******************** evidencevariablerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType evidencevariablerelatedartifacttype = evidencevariablerelatedartifact.getType();
		if(evidencevariablerelatedartifacttype!=null) {
		if(evidencevariablerelatedartifacti == 0) {

		e.addEvdnceVrbleRltedArtfctTyp("[");		}
			e.addEvdnceVrbleRltedArtfctTyp(evidencevariablerelatedartifacttype.toCode());
		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {

		e.addEvdnceVrbleRltedArtfctTyp("]");		}

		} else {
			e.addEvdnceVrbleRltedArtfctTyp("NULL");
		}

		/******************** EvdnceVrble_RltedArtfct_Url ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctUrl("[");}
		if(evidencevariablerelatedartifact.hasUrl()) {

			e.addEvdnceVrbleRltedArtfctUrl(String.valueOf(evidencevariablerelatedartifact.getUrl()));
		} else {
			e.addEvdnceVrbleRltedArtfctUrl("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctUrl("]");}


		/******************** EvdnceVrble_RltedArtfct_Citation ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctCitation("[");}
		if(evidencevariablerelatedartifact.hasCitation()) {

			e.addEvdnceVrbleRltedArtfctCitation(String.valueOf(evidencevariablerelatedartifact.getCitation()));
		} else {
			e.addEvdnceVrbleRltedArtfctCitation("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctCitation("]");}


		/******************** EvdnceVrble_RltedArtfct_Lbl ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctLbl("[");}
		if(evidencevariablerelatedartifact.hasLabel()) {

			e.addEvdnceVrbleRltedArtfctLbl(String.valueOf(evidencevariablerelatedartifact.getLabel()));
		} else {
			e.addEvdnceVrbleRltedArtfctLbl("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctLbl("]");}


		/******************** evidencevariablerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment evidencevariablerelatedartifactdocument = evidencevariablerelatedartifact.getDocument();

		/******************** EvdnceVrble_RltedArtfct_Doc_Sz ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocSz("[");}
		if(evidencevariablerelatedartifactdocument.hasSize()) {

			e.addEvdnceVrbleRltedArtfctDocSz(String.valueOf(evidencevariablerelatedartifactdocument.getSize()));
		} else {
			e.addEvdnceVrbleRltedArtfctDocSz("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocSz("]");}


		/******************** EvdnceVrble_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocLnguage("[");}
		if(evidencevariablerelatedartifactdocument.hasLanguage()) {

			e.addEvdnceVrbleRltedArtfctDocLnguage(String.valueOf(evidencevariablerelatedartifactdocument.getLanguage()));
		} else {
			e.addEvdnceVrbleRltedArtfctDocLnguage("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocLnguage("]");}


		/******************** EvdnceVrble_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocCntntTyp("[");}
		if(evidencevariablerelatedartifactdocument.hasContentType()) {

			e.addEvdnceVrbleRltedArtfctDocCntntTyp(String.valueOf(evidencevariablerelatedartifactdocument.getContentType()));
		} else {
			e.addEvdnceVrbleRltedArtfctDocCntntTyp("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocCntntTyp("]");}


		/******************** EvdnceVrble_RltedArtfct_Doc_Hash ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocHash("[");}
		if(evidencevariablerelatedartifactdocument.hasHash()) {

			e.addEvdnceVrbleRltedArtfctDocHash(new String(evidencevariablerelatedartifactdocument.getHash()));
		} else {
			e.addEvdnceVrbleRltedArtfctDocHash("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocHash("]");}


		/******************** EvdnceVrble_RltedArtfct_Doc_Data ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocData("[");}
		if(evidencevariablerelatedartifactdocument.hasData()) {

			e.addEvdnceVrbleRltedArtfctDocData(new String(evidencevariablerelatedartifactdocument.getData()));
		} else {
			e.addEvdnceVrbleRltedArtfctDocData("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocData("]");}


		/******************** EvdnceVrble_RltedArtfct_Doc_Creation ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocCreation("[");}
		if(evidencevariablerelatedartifactdocument.hasCreation()) {

			e.addEvdnceVrbleRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablerelatedartifactdocument.getCreation())+"\"");
		} else {
			e.addEvdnceVrbleRltedArtfctDocCreation("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocCreation("]");}


		/******************** EvdnceVrble_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocTtl("[");}
		if(evidencevariablerelatedartifactdocument.hasTitle()) {

			e.addEvdnceVrbleRltedArtfctDocTtl(String.valueOf(evidencevariablerelatedartifactdocument.getTitle()));
		} else {
			e.addEvdnceVrbleRltedArtfctDocTtl("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocTtl("]");}


		/******************** EvdnceVrble_RltedArtfct_Doc_Url ********************************************************************************/
		if(evidencevariablerelatedartifacti == 0) {e.addEvdnceVrbleRltedArtfctDocUrl("[");}
		if(evidencevariablerelatedartifactdocument.hasUrl()) {

			e.addEvdnceVrbleRltedArtfctDocUrl(String.valueOf(evidencevariablerelatedartifactdocument.getUrl()));
		} else {
			e.addEvdnceVrbleRltedArtfctDocUrl("NULL");
		}

		if(evidencevariablerelatedartifacti == evidencevariablerelatedartifactlist.size()-1) {e.addEvdnceVrbleRltedArtfctDocUrl("]");}


		 };
		/******************** EvdnceVrble_Url ********************************************************************************/
		if(evidencevariable.hasUrl()) {

			e.addEvdnceVrbleUrl(String.valueOf(evidencevariable.getUrl()));
		} else {
			e.addEvdnceVrbleUrl("NULL");
		}


		/******************** EvdnceVrble_ShortTtl ********************************************************************************/
		if(evidencevariable.hasShortTitle()) {

			e.addEvdnceVrbleShortTtl(String.valueOf(evidencevariable.getShortTitle()));
		} else {
			e.addEvdnceVrbleShortTtl("NULL");
		}


		/******************** EvdnceVrble_Subtitle ********************************************************************************/
		if(evidencevariable.hasSubtitle()) {

			e.addEvdnceVrbleSubtitle(String.valueOf(evidencevariable.getSubtitle()));
		} else {
			e.addEvdnceVrbleSubtitle("NULL");
		}


		/******************** evidencevariabletopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> evidencevariabletopiclist = evidencevariable.getTopic();
		for(int evidencevariabletopici = 0; evidencevariabletopici<evidencevariabletopiclist.size();evidencevariabletopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  evidencevariabletopic = evidencevariabletopiclist.get(evidencevariabletopici);

		/******************** EvdnceVrble_Topic_Txt ********************************************************************************/
		if(evidencevariabletopici == 0) {e.addEvdnceVrbleTopicTxt("[");}
		if(evidencevariabletopic.hasText()) {

			e.addEvdnceVrbleTopicTxt(String.valueOf(evidencevariabletopic.getText()));
		} else {
			e.addEvdnceVrbleTopicTxt("NULL");
		}

		if(evidencevariabletopici == evidencevariabletopiclist.size()-1) {e.addEvdnceVrbleTopicTxt("]");}


		/******************** evidencevariabletopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariabletopiccodinglist = evidencevariabletopic.getCoding();
		for(int evidencevariabletopiccodingi = 0; evidencevariabletopiccodingi<evidencevariabletopiccodinglist.size();evidencevariabletopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariabletopiccoding = evidencevariabletopiccodinglist.get(evidencevariabletopiccodingi);

		/******************** EvdnceVrble_Topic_Cdg_Dsply ********************************************************************************/
		if(evidencevariabletopiccodingi == 0) {e.addEvdnceVrbleTopicCdgDsply("[[");}
		if(evidencevariabletopiccoding.hasDisplay()) {

			e.addEvdnceVrbleTopicCdgDsply(String.valueOf(evidencevariabletopiccoding.getDisplay()));
		} else {
			e.addEvdnceVrbleTopicCdgDsply("NULL");
		}

		if(evidencevariabletopiccodingi == evidencevariabletopiccodinglist.size()-1) {e.addEvdnceVrbleTopicCdgDsply("]]");}


		/******************** EvdnceVrble_Topic_Cdg_Vrsn ********************************************************************************/
		if(evidencevariabletopiccodingi == 0) {e.addEvdnceVrbleTopicCdgVrsn("[[");}
		if(evidencevariabletopiccoding.hasVersion()) {

			e.addEvdnceVrbleTopicCdgVrsn(String.valueOf(evidencevariabletopiccoding.getVersion()));
		} else {
			e.addEvdnceVrbleTopicCdgVrsn("NULL");
		}

		if(evidencevariabletopiccodingi == evidencevariabletopiccodinglist.size()-1) {e.addEvdnceVrbleTopicCdgVrsn("]]");}


		/******************** EvdnceVrble_Topic_Cdg_Cd ********************************************************************************/
		if(evidencevariabletopiccodingi == 0) {e.addEvdnceVrbleTopicCdgCd("[[");}
		if(evidencevariabletopiccoding.hasCode()) {

			e.addEvdnceVrbleTopicCdgCd(String.valueOf(evidencevariabletopiccoding.getCode()));
		} else {
			e.addEvdnceVrbleTopicCdgCd("NULL");
		}

		if(evidencevariabletopiccodingi == evidencevariabletopiccodinglist.size()-1) {e.addEvdnceVrbleTopicCdgCd("]]");}


		/******************** EvdnceVrble_Topic_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariabletopiccodingi == 0) {e.addEvdnceVrbleTopicCdgUsrSltd("[[");}
		if(evidencevariabletopiccoding.hasUserSelected()) {

			e.addEvdnceVrbleTopicCdgUsrSltd(String.valueOf(evidencevariabletopiccoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleTopicCdgUsrSltd("NULL");
		}

		if(evidencevariabletopiccodingi == evidencevariabletopiccodinglist.size()-1) {e.addEvdnceVrbleTopicCdgUsrSltd("]]");}


		/******************** EvdnceVrble_Topic_Cdg_Sys ********************************************************************************/
		if(evidencevariabletopiccodingi == 0) {e.addEvdnceVrbleTopicCdgSys("[[");}
		if(evidencevariabletopiccoding.hasSystem()) {

			e.addEvdnceVrbleTopicCdgSys(String.valueOf(evidencevariabletopiccoding.getSystem()));
		} else {
			e.addEvdnceVrbleTopicCdgSys("NULL");
		}

		if(evidencevariabletopiccodingi == evidencevariabletopiccodinglist.size()-1) {e.addEvdnceVrbleTopicCdgSys("]]");}


		 };
		 };
		/******************** evidencevariablecharacteristic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent> evidencevariablecharacteristiclist = evidencevariable.getCharacteristic();
		for(int evidencevariablecharacteristici = 0; evidencevariablecharacteristici<evidencevariablecharacteristiclist.size();evidencevariablecharacteristici++ ) {
		org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent  evidencevariablecharacteristic = evidencevariablecharacteristiclist.get(evidencevariablecharacteristici);

		/******************** EvdnceVrble_Crctrstc_Dscrptn ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDscrptn("[");}
		if(evidencevariablecharacteristic.hasDescription()) {

			e.addEvdnceVrbleCrctrstcDscrptn(String.valueOf(evidencevariablecharacteristic.getDescription()));
		} else {
			e.addEvdnceVrbleCrctrstcDscrptn("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDscrptn("]");}


		/******************** EvdnceVrble_Crctrstc_Exclude ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcExclude("[");}
		if(evidencevariablecharacteristic.hasExclude()) {

			e.addEvdnceVrbleCrctrstcExclude(String.valueOf(evidencevariablecharacteristic.getExclude()));
		} else {
			e.addEvdnceVrbleCrctrstcExclude("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcExclude("]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinition ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition evidencevariablecharacteristicdefinitiontriggerdefinition = evidencevariablecharacteristic.getDefinitionTriggerDefinition();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Nm ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnNm("[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasName()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnNm(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinition.getName()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnNm("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnNm("]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerType evidencevariablecharacteristicdefinitiontriggerdefinitiontype = evidencevariablecharacteristicdefinitiontriggerdefinition.getType();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontype!=null) {
		if(evidencevariablecharacteristici == 0) {

		e.addEvdnceVrbleCrctrstcDfnTrgrDfnTyp("[");		}
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTyp(evidencevariablecharacteristicdefinitiontriggerdefinitiontype.toCode());
		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {

		e.addEvdnceVrbleCrctrstcDfnTrgrDfnTyp("]");		}

		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTyp("NULL");
		}

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondata ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement> evidencevariablecharacteristicdefinitiontriggerdefinitiondatalist = evidencevariablecharacteristicdefinitiontriggerdefinition.getData();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiondatai = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiondatai<evidencevariablecharacteristicdefinitiontriggerdefinitiondatalist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiondatai++ ) {
		org.hl7.fhir.r4.model.DataRequirement  evidencevariablecharacteristicdefinitiontriggerdefinitiondata = evidencevariablecharacteristicdefinitiontriggerdefinitiondatalist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiondatai);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Typ ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatai == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp("[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasType()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getType()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatai == evidencevariablecharacteristicdefinitiontriggerdefinitiondatalist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp("]]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortlist = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getSort();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti<evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortlist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort = evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortlist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Sort_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.hasPath()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.getPath()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti == evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath("]]]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection = evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.getDirection();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection!=null) {
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti == 0) {

		e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection("[[[");		}
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection.toCode());
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasorti == evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortlist.size()-1) {

		e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection("]]]");		}

		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection("NULL");
		}

		 };
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasSubjectReference()) {

			if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getSubjectReference().getReference() != null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getSubjectReference().getReference());
			}
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getSubjectCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.hasText()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.getText()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist = evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.getCoding();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi<evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding = evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasVersion()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys("]]]");}


		 };
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Profile ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getProfile().size(); incr++) {
				array = array + evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataProfile(array);

		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataProfile("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_MustSupport ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getMustSupport().size(); incr++) {
				array = array + evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataMustSupport(array);

		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataMustSupport("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilterlist = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getCodeFilter();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilteri = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilteri<evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilterlist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter = evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilterlist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilteri);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.hasPath()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getPath()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath("]]]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodelist = evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getCode();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei<evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodelist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode = evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodelist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply("[[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply("]]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn("[[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasVersion()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn("]]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd("[[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd("]]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys("[[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodei == evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys("]]]]");}


		 };
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.hasSearchParam()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getSearchParam()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_VlSt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.hasValueSet()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getValueSet()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt("NULL");
		}


		 };
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Lmt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasLimit()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getLimit()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getDateFilter();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri<evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter = evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.hasPath()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getPath()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.hasSearchParam()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getSearchParam()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam("]]]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration = evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getValueDuration();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasValue()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl("]]]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervaluedurationcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getComparator();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervaluedurationcomparator!=null) {
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {

		e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr("[[[");		}
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervaluedurationcomparator.toCode());
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {

		e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr("]]]");		}

		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasUnit()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.hasValueDateTimeType()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp("\""+evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp("]]]");}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod = evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getValuePeriod();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.hasStart()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd("[[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.hasEnd()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilteri == evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd("]]]");}


		 };
		 };
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasTimingDateTimeType()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTimeTyp("\""+evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingDateTimeType().getValueAsString()+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTimeTyp("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitioncondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression evidencevariablecharacteristicdefinitiontriggerdefinitioncondition = evidencevariablecharacteristicdefinitiontriggerdefinition.getCondition();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Nm ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasName()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnNm(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getName()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnNm("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Rfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasReference()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnRfrnc(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getReference()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnRfrnc("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Lnguage ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasLanguage()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnLnguage(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getLanguage()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnLnguage("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Dscrptn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasDescription()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnDscrptn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getDescription()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnDscrptn("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Exprsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasExpression()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnExprsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getExpression()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnCndtnExprsn("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming = evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingTiming();

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.getCode();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.hasText()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdTxt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.getText()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdTxt("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.getCoding();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi<evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply("[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn("[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasVersion()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd("[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd("[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys("[[");}
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodingi == evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys("]]");}


		 };
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Evnt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.getEvent().size(); incr++) {
				array = array + evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgEvnt(array);

		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgEvnt("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.getRepeat();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasOffset()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptOff(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getOffset()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptOff("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasCount()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getCount()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCnt("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasPeriod()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getPeriod()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrd("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasCountMax()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCntMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getCountMax()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCntMx("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasDurationMax()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getDurationMax()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationMx("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getBoundsPeriod();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.hasStart()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdStrt("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.hasEnd()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdEnd("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getDurationUnit();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit!=null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationUnt(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationUnt("NULL");
		}

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getBoundsDuration();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasValue()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationVl("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsdurationcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getComparator();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsdurationcomparator!=null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsdurationcomparator.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCd("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasUnit()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationUnt("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationSys("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getBoundsRange();

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange.getLow();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasValue()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwVl("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getComparator();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator!=null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCd("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasUnit()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwSys("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange.getHigh();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasValue()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiVl("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getComparator();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator!=null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCd("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasUnit()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiSys("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasFrequencyMax()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncyMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getFrequencyMax()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncyMx("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhenlist = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getWhen();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwheni = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwheni<evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhenlist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhen = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhenlist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwheni);
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhen!=null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptWhen(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhen.getCode());
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptWhen("NULL");
		}
		 };

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getPeriodUnit();
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit!=null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdUnt(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdUnt("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasPeriodMax()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getPeriodMax()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdMx("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweeklist = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getDayOfWeek();
		for(int evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweeki = 0; evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweeki<evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweeklist.size();evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweek = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweeklist.get(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweeki);
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweek!=null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDayOfWeek(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweek.getCode());
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptTimeOfDay(array);

		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptTimeOfDay("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasDuration()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDuration(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getDuration()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDuration("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasFrequency()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncy(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getFrequency()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncy("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasTimingReference()) {

			if(evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingReference().getReference() != null) {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgRfrnc(evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingReference().getReference());
			}
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgRfrnc("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasTimingDateType()) {

			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTyp("\""+evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingDateType().getValueAsString()+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTyp("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnRfrnc ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnRfrnc("[");}
		if(evidencevariablecharacteristic.hasDefinitionReference()) {

			if(evidencevariablecharacteristic.getDefinitionReference().getReference() != null) {
			e.addEvdnceVrbleCrctrstcDfnRfrnc(evidencevariablecharacteristic.getDefinitionReference().getReference());
			}
		} else {
			e.addEvdnceVrbleCrctrstcDfnRfrnc("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnRfrnc("]");}


		/******************** evidencevariablecharacteristicdefinitiondatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement evidencevariablecharacteristicdefinitiondatarequirement = evidencevariablecharacteristic.getDefinitionDataRequirement();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentTyp("[");}
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasType()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentTyp(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirement.getType()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentTyp("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentTyp("]");}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementsort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> evidencevariablecharacteristicdefinitiondatarequirementsortlist = evidencevariablecharacteristicdefinitiondatarequirement.getSort();
		for(int evidencevariablecharacteristicdefinitiondatarequirementsorti = 0; evidencevariablecharacteristicdefinitiondatarequirementsorti<evidencevariablecharacteristicdefinitiondatarequirementsortlist.size();evidencevariablecharacteristicdefinitiondatarequirementsorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  evidencevariablecharacteristicdefinitiondatarequirementsort = evidencevariablecharacteristicdefinitiondatarequirementsortlist.get(evidencevariablecharacteristicdefinitiondatarequirementsorti);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsorti == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortPath("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementsort.hasPath()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortPath(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsort.getPath()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortPath("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementsorti == evidencevariablecharacteristicdefinitiondatarequirementsortlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortPath("]]");}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection evidencevariablecharacteristicdefinitiondatarequirementsortdirection = evidencevariablecharacteristicdefinitiondatarequirementsort.getDirection();
		if(evidencevariablecharacteristicdefinitiondatarequirementsortdirection!=null) {
		if(evidencevariablecharacteristicdefinitiondatarequirementsorti == 0) {

		e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection("[[");		}
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection(evidencevariablecharacteristicdefinitiondatarequirementsortdirection.toCode());
		if(evidencevariablecharacteristicdefinitiondatarequirementsorti == evidencevariablecharacteristicdefinitiondatarequirementsortlist.size()-1) {

		e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection("]]");		}

		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection("NULL");
		}

		 };
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasSubjectReference()) {

			if(evidencevariablecharacteristicdefinitiondatarequirement.getSubjectReference().getReference() != null) {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctRfrnc(evidencevariablecharacteristicdefinitiondatarequirement.getSubjectReference().getReference());
			}
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctRfrnc("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept = evidencevariablecharacteristicdefinitiondatarequirement.getSubjectCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.hasText()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.getText()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist = evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.getCoding();
		for(int evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi = 0; evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi<evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size();evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding = evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.get(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasVersion()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodingi == evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys("]]");}


		 };
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Profile ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicdefinitiondatarequirement.getProfile().size(); incr++) {
				array = array + evidencevariablecharacteristicdefinitiondatarequirement.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentProfile(array);

		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentProfile("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_MustSupport ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicdefinitiondatarequirement.getMustSupport().size(); incr++) {
				array = array + evidencevariablecharacteristicdefinitiondatarequirement.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentMustSupport(array);

		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentMustSupport("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementcodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> evidencevariablecharacteristicdefinitiondatarequirementcodefilterlist = evidencevariablecharacteristicdefinitiondatarequirement.getCodeFilter();
		for(int evidencevariablecharacteristicdefinitiondatarequirementcodefilteri = 0; evidencevariablecharacteristicdefinitiondatarequirementcodefilteri<evidencevariablecharacteristicdefinitiondatarequirementcodefilterlist.size();evidencevariablecharacteristicdefinitiondatarequirementcodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  evidencevariablecharacteristicdefinitiondatarequirementcodefilter = evidencevariablecharacteristicdefinitiondatarequirementcodefilterlist.get(evidencevariablecharacteristicdefinitiondatarequirementcodefilteri);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.hasPath()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getPath()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilteri == evidencevariablecharacteristicdefinitiondatarequirementcodefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath("]]");}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodelist = evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getCode();
		for(int evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei = 0; evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei<evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodelist.size();evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode = evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodelist.get(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply("[[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn("[[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasVersion()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd("[[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd("]]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys("[[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodei == evidencevariablecharacteristicdefinitiondatarequirementcodefiltercodelist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys("]]]");}


		 };
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.hasSearchParam()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getSearchParam()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.hasValueSet()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getValueSet()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt("NULL");
		}


		 };
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasLimit()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentLmt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirement.getLimit()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentLmt("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist = evidencevariablecharacteristicdefinitiondatarequirement.getDateFilter();
		for(int evidencevariablecharacteristicdefinitiondatarequirementdatefilteri = 0; evidencevariablecharacteristicdefinitiondatarequirementdatefilteri<evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size();evidencevariablecharacteristicdefinitiondatarequirementdatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  evidencevariablecharacteristicdefinitiondatarequirementdatefilter = evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.get(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.hasPath()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getPath()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.hasSearchParam()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getSearchParam()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam("]]");}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration = evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getValueDuration();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasValue()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl("]]");}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator = evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getComparator();
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator!=null) {
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {

		e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr("[[");		}
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator.toCode());
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {

		e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr("]]");		}

		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasUnit()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.hasValueDateTimeType()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("\""+evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp("]]");}


		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod = evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getValuePeriod();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasStart()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == 0) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("[[");}
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasEnd()) {

			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("NULL");
		}

		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilteri == evidencevariablecharacteristicdefinitiondatarequirementdatefilterlist.size()-1) {e.addEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd("]]");}


		 };
		/******************** evidencevariablecharacteristicparticipanteffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicparticipanteffectiveduration = evidencevariablecharacteristic.getParticipantEffectiveDuration();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationVl("[");}
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasValue()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationVl(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationVl("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationVl("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivedurationcomparator = evidencevariablecharacteristicparticipanteffectiveduration.getComparator();
		if(evidencevariablecharacteristicparticipanteffectivedurationcomparator!=null) {
		if(evidencevariablecharacteristici == 0) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCmprtr("[");		}
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCmprtr(evidencevariablecharacteristicparticipanteffectivedurationcomparator.toCode());
		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCmprtr("]");		}

		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCd("[");}
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasCode()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCd(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCd("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCd("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationUnt("[");}
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasUnit()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationUnt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationUnt("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationSys("[");}
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasSystem()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationSys(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationSys("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDurationSys("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing evidencevariablecharacteristicparticipanteffectivetiming = evidencevariablecharacteristic.getParticipantEffectiveTiming();

		/******************** evidencevariablecharacteristicparticipanteffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicparticipanteffectivetimingcode = evidencevariablecharacteristicparticipanteffectivetiming.getCode();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingcode.hasText()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcode.getText()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist = evidencevariablecharacteristicparticipanteffectivetimingcode.getCoding();
		for(int evidencevariablecharacteristicparticipanteffectivetimingcodecodingi = 0; evidencevariablecharacteristicparticipanteffectivetimingcodecodingi<evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist.size();evidencevariablecharacteristicparticipanteffectivetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicparticipanteffectivetimingcodecoding = evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist.get(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi);

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply("[[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply("NULL");
		}

		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply("]]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn("[[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasVersion()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn("NULL");
		}

		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn("]]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd("[[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasCode()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd("NULL");
		}

		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd("]]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd("[[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd("]]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys("[[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasSystem()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys("NULL");
		}

		if(evidencevariablecharacteristicparticipanteffectivetimingcodecodingi == evidencevariablecharacteristicparticipanteffectivetimingcodecodinglist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys("]]");}


		 };
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Evnt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt("[");}
		if(evidencevariablecharacteristicparticipanteffectivetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicparticipanteffectivetiming.getEvent().size(); incr++) {
				array = array + evidencevariablecharacteristicparticipanteffectivetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt(array);

		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent evidencevariablecharacteristicparticipanteffectivetimingrepeat = evidencevariablecharacteristicparticipanteffectivetiming.getRepeat();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasOffset()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getOffset()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasCount()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getCount()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasPeriod()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getPeriod()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasCountMax()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getCountMax()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasDurationMax()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getDurationMax()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getBoundsPeriod();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.hasStart()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.hasEnd()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getDurationUnit();
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit!=null) {
		if(evidencevariablecharacteristici == 0) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt("[");		}
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt(evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit.toCode());
		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt("]");		}

		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt("NULL");
		}

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getBoundsDuration();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasValue()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getComparator();
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator!=null) {
		if(evidencevariablecharacteristici == 0) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr("[");		}
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator.toCode());
		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr("]");		}

		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasCode()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasUnit()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasSystem()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getBoundsRange();

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange.getLow();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasValue()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getComparator();
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator!=null) {
		if(evidencevariablecharacteristici == 0) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr("[");		}
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator.toCode());
		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr("]");		}

		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasCode()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasUnit()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasSystem()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange.getHigh();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasValue()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getComparator();
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator!=null) {
		if(evidencevariablecharacteristici == 0) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr("[");		}
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator.toCode());
		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {

		e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr("]");		}

		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasCode()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasUnit()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasSystem()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx("[");}
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasFrequencyMax()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getFrequencyMax()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx("]");}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> evidencevariablecharacteristicparticipanteffectivetimingrepeatwhenlist = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getWhen();
		for(int evidencevariablecharacteristicparticipanteffectivetimingrepeatwheni = 0; evidencevariablecharacteristicparticipanteffectivetimingrepeatwheni<evidencevariablecharacteristicparticipanteffectivetimingrepeatwhenlist.size();evidencevariablecharacteristicparticipanteffectivetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  evidencevariablecharacteristicparticipanteffectivetimingrepeatwhen = evidencevariablecharacteristicparticipanteffectivetimingrepeatwhenlist.get(evidencevariablecharacteristicparticipanteffectivetimingrepeatwheni);
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatwhen!=null) {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptWhen(evidencevariablecharacteristicparticipanteffectivetimingrepeatwhen.getCode());
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptWhen("NULL");
		}
		 };

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getPeriodUnit();
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit!=null) {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdUnt(evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdUnt("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasPeriodMax()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getPeriodMax()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdMx("NULL");
		}


		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweeklist = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getDayOfWeek();
		for(int evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweeki = 0; evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweeki<evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweeklist.size();evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweek = evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweeklist.get(evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweeki);
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweek!=null) {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDayOfWeek(evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweek.getCode());
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<evidencevariablecharacteristicparticipanteffectivetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + evidencevariablecharacteristicparticipanteffectivetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptTimeOfDay(array);

		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptTimeOfDay("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasDuration()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDuration(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getDuration()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDuration("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasFrequency()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncy(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getFrequency()));
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncy("NULL");
		}


		/******************** evidencevariablecharacteristicdefinitionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression evidencevariablecharacteristicdefinitionexpression = evidencevariablecharacteristic.getDefinitionExpression();

		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnExprsnNm("[");}
		if(evidencevariablecharacteristicdefinitionexpression.hasName()) {

			e.addEvdnceVrbleCrctrstcDfnExprsnNm(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getName()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnExprsnNm("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnExprsnNm("]");}


		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnExprsnRfrnc("[");}
		if(evidencevariablecharacteristicdefinitionexpression.hasReference()) {

			e.addEvdnceVrbleCrctrstcDfnExprsnRfrnc(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getReference()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnExprsnRfrnc("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnExprsnRfrnc("]");}


		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnExprsnLnguage("[");}
		if(evidencevariablecharacteristicdefinitionexpression.hasLanguage()) {

			e.addEvdnceVrbleCrctrstcDfnExprsnLnguage(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getLanguage()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnExprsnLnguage("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnExprsnLnguage("]");}


		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnExprsnDscrptn("[");}
		if(evidencevariablecharacteristicdefinitionexpression.hasDescription()) {

			e.addEvdnceVrbleCrctrstcDfnExprsnDscrptn(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getDescription()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnExprsnDscrptn("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnExprsnDscrptn("]");}


		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnExprsnExprsn("[");}
		if(evidencevariablecharacteristicdefinitionexpression.hasExpression()) {

			e.addEvdnceVrbleCrctrstcDfnExprsnExprsn(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getExpression()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnExprsnExprsn("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnExprsnExprsn("]");}


		/******************** evidencevariablecharacteristicparticipanteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicparticipanteffectiveperiod = evidencevariablecharacteristic.getParticipantEffectivePeriod();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt("[");}
		if(evidencevariablecharacteristicparticipanteffectiveperiod.hasStart()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicparticipanteffectiveperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt("]");}


		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd("[");}
		if(evidencevariablecharacteristicparticipanteffectiveperiod.hasEnd()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariablecharacteristicparticipanteffectiveperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd("]");}


		/******************** evidencevariablecharacteristicdefinitioncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitioncodeableconcept = evidencevariablecharacteristic.getDefinitionCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptTxt("[");}
		if(evidencevariablecharacteristicdefinitioncodeableconcept.hasText()) {

			e.addEvdnceVrbleCrctrstcDfnCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconcept.getText()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnCdbleCncptTxt("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptTxt("]");}


		/******************** evidencevariablecharacteristicdefinitioncodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicdefinitioncodeableconceptcodinglist = evidencevariablecharacteristicdefinitioncodeableconcept.getCoding();
		for(int evidencevariablecharacteristicdefinitioncodeableconceptcodingi = 0; evidencevariablecharacteristicdefinitioncodeableconceptcodingi<evidencevariablecharacteristicdefinitioncodeableconceptcodinglist.size();evidencevariablecharacteristicdefinitioncodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicdefinitioncodeableconceptcoding = evidencevariablecharacteristicdefinitioncodeableconceptcodinglist.get(evidencevariablecharacteristicdefinitioncodeableconceptcodingi);

		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply("[[");}
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply("NULL");
		}

		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == evidencevariablecharacteristicdefinitioncodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn("[[");}
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasVersion()) {

			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn("NULL");
		}

		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == evidencevariablecharacteristicdefinitioncodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd("[[");}
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasCode()) {

			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd("NULL");
		}

		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == evidencevariablecharacteristicdefinitioncodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd("[[");}
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == evidencevariablecharacteristicdefinitioncodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd("]]");}


		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys("[[");}
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasSystem()) {

			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys("NULL");
		}

		if(evidencevariablecharacteristicdefinitioncodeableconceptcodingi == evidencevariablecharacteristicdefinitioncodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys("]]");}


		 };
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristici == 0) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp("[");}
		if(evidencevariablecharacteristic.hasParticipantEffectiveDateTimeType()) {

			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp("\""+evidencevariablecharacteristic.getParticipantEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp("NULL");
		}

		if(evidencevariablecharacteristici == evidencevariablecharacteristiclist.size()-1) {e.addEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp("]");}


		/******************** evidencevariablecharacteristicusagecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> evidencevariablecharacteristicusagecontextlist = evidencevariablecharacteristic.getUsageContext();
		for(int evidencevariablecharacteristicusagecontexti = 0; evidencevariablecharacteristicusagecontexti<evidencevariablecharacteristicusagecontextlist.size();evidencevariablecharacteristicusagecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  evidencevariablecharacteristicusagecontext = evidencevariablecharacteristicusagecontextlist.get(evidencevariablecharacteristicusagecontexti);

		/******************** evidencevariablecharacteristicusagecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicusagecontextcode = evidencevariablecharacteristicusagecontext.getCode();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtCdDsply("[[");}
		if(evidencevariablecharacteristicusagecontextcode.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtCdDsply(String.valueOf(evidencevariablecharacteristicusagecontextcode.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtCdDsply("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtCdDsply("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtCdVrsn("[[");}
		if(evidencevariablecharacteristicusagecontextcode.hasVersion()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtCdVrsn(String.valueOf(evidencevariablecharacteristicusagecontextcode.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtCdVrsn("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtCdVrsn("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd("[[");}
		if(evidencevariablecharacteristicusagecontextcode.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd(String.valueOf(evidencevariablecharacteristicusagecontextcode.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtCdSys("[[");}
		if(evidencevariablecharacteristicusagecontextcode.hasSystem()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtCdSys(String.valueOf(evidencevariablecharacteristicusagecontextcode.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtCdSys("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtCdSys("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRfrnc("[[");}
		if(evidencevariablecharacteristicusagecontext.hasValueReference()) {

			if(evidencevariablecharacteristicusagecontext.getValueReference().getReference() != null) {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRfrnc(evidencevariablecharacteristicusagecontext.getValueReference().getReference());
			}
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRfrnc("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRfrnc("]]");}


		/******************** evidencevariablecharacteristicusagecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicusagecontextvaluecodeableconcept = evidencevariablecharacteristicusagecontext.getValueCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt("[[");}
		if(evidencevariablecharacteristicusagecontextvaluecodeableconcept.hasText()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconcept.getText()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt("]]");}


		/******************** evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist = evidencevariablecharacteristicusagecontextvaluecodeableconcept.getCoding();
		for(int evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi = 0; evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi<evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist.size();evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding = evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist.get(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi);

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply("[[[");}
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasDisplay()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply("]]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn("[[[");}
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasVersion()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn("]]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd("[[[");}
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasCode()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd("]]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd("[[[");}
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasUserSelected()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd("]]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys("[[[");}
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasSystem()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcodingi == evidencevariablecharacteristicusagecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys("]]]");}


		 };
		/******************** evidencevariablecharacteristicusagecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicusagecontextvaluerange = evidencevariablecharacteristicusagecontext.getValueRange();

		/******************** evidencevariablecharacteristicusagecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluerangelow = evidencevariablecharacteristicusagecontextvaluerange.getLow();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasValue()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl("]]");}


		/******************** evidencevariablecharacteristicusagecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicusagecontextvaluerangelowcomparator = evidencevariablecharacteristicusagecontextvaluerangelow.getComparator();
		if(evidencevariablecharacteristicusagecontextvaluerangelowcomparator!=null) {
		if(evidencevariablecharacteristicusagecontexti == 0) {

		e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr("[[");		}
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr(evidencevariablecharacteristicusagecontextvaluerangelowcomparator.toCode());
		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {

		e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr("]]");		}

		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasCode()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasUnit()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasSystem()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys("]]");}


		/******************** evidencevariablecharacteristicusagecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluerangehigh = evidencevariablecharacteristicusagecontextvaluerange.getHigh();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasValue()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl("]]");}


		/******************** evidencevariablecharacteristicusagecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicusagecontextvaluerangehighcomparator = evidencevariablecharacteristicusagecontextvaluerangehigh.getComparator();
		if(evidencevariablecharacteristicusagecontextvaluerangehighcomparator!=null) {
		if(evidencevariablecharacteristicusagecontexti == 0) {

		e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr("[[");		}
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr(evidencevariablecharacteristicusagecontextvaluerangehighcomparator.toCode());
		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {

		e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr("]]");		}

		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasCode()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasUnit()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys("[[");}
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasSystem()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys("]]");}


		/******************** evidencevariablecharacteristicusagecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluequantity = evidencevariablecharacteristicusagecontext.getValueQuantity();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyVl("[[");}
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasValue()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyVl(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyVl("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyVl("]]");}


		/******************** evidencevariablecharacteristicusagecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicusagecontextvaluequantitycomparator = evidencevariablecharacteristicusagecontextvaluequantity.getComparator();
		if(evidencevariablecharacteristicusagecontextvaluequantitycomparator!=null) {
		if(evidencevariablecharacteristicusagecontexti == 0) {

		e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr("[[");		}
			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr(evidencevariablecharacteristicusagecontextvaluequantitycomparator.toCode());
		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {

		e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr("]]");		}

		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCd("[[");}
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasCode()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCd("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyCd("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt("[[");}
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasUnit()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt("]]");}


		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontexti == 0) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntySys("[[");}
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasSystem()) {

			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntySys(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcUsgCntxtVlQntySys("NULL");
		}

		if(evidencevariablecharacteristicusagecontexti == evidencevariablecharacteristicusagecontextlist.size()-1) {e.addEvdnceVrbleCrctrstcUsgCntxtVlQntySys("]]");}


		 };
		/******************** evidencevariablecharacteristictimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristictimefromstart = evidencevariablecharacteristic.getTimeFromStart();

		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Vl ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasValue()) {

			e.addEvdnceVrbleCrctrstcTimeFromStrtVl(String.valueOf(evidencevariablecharacteristictimefromstart.getValue()));
		} else {
			e.addEvdnceVrbleCrctrstcTimeFromStrtVl("NULL");
		}


		/******************** evidencevariablecharacteristictimefromstartcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristictimefromstartcomparator = evidencevariablecharacteristictimefromstart.getComparator();
		if(evidencevariablecharacteristictimefromstartcomparator!=null) {
			e.addEvdnceVrbleCrctrstcTimeFromStrtCmprtr(evidencevariablecharacteristictimefromstartcomparator.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcTimeFromStrtCmprtr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Cd ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasCode()) {

			e.addEvdnceVrbleCrctrstcTimeFromStrtCd(String.valueOf(evidencevariablecharacteristictimefromstart.getCode()));
		} else {
			e.addEvdnceVrbleCrctrstcTimeFromStrtCd("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Unt ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasUnit()) {

			e.addEvdnceVrbleCrctrstcTimeFromStrtUnt(String.valueOf(evidencevariablecharacteristictimefromstart.getUnit()));
		} else {
			e.addEvdnceVrbleCrctrstcTimeFromStrtUnt("NULL");
		}


		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Sys ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasSystem()) {

			e.addEvdnceVrbleCrctrstcTimeFromStrtSys(String.valueOf(evidencevariablecharacteristictimefromstart.getSystem()));
		} else {
			e.addEvdnceVrbleCrctrstcTimeFromStrtSys("NULL");
		}


		/******************** evidencevariablecharacteristicgroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.GroupMeasure evidencevariablecharacteristicgroupmeasure = evidencevariablecharacteristic.getGroupMeasure();
		if(evidencevariablecharacteristicgroupmeasure!=null) {
			e.addEvdnceVrbleCrctrstcGrpMsr(evidencevariablecharacteristicgroupmeasure.toCode());
		} else {
			e.addEvdnceVrbleCrctrstcGrpMsr("NULL");
		}

		/******************** EvdnceVrble_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(evidencevariablecharacteristic.hasDefinitionCanonicalType()) {

			e.addEvdnceVrbleCrctrstcDfnCanonicalTyp("\""+evidencevariablecharacteristic.getDefinitionCanonicalType().getValueAsString()+"\"");
		} else {
			e.addEvdnceVrbleCrctrstcDfnCanonicalTyp("NULL");
		}


		 };
		/******************** evidencevariablejurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> evidencevariablejurisdictionlist = evidencevariable.getJurisdiction();
		for(int evidencevariablejurisdictioni = 0; evidencevariablejurisdictioni<evidencevariablejurisdictionlist.size();evidencevariablejurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  evidencevariablejurisdiction = evidencevariablejurisdictionlist.get(evidencevariablejurisdictioni);

		/******************** EvdnceVrble_Jrsdctn_Txt ********************************************************************************/
		if(evidencevariablejurisdictioni == 0) {e.addEvdnceVrbleJrsdctnTxt("[");}
		if(evidencevariablejurisdiction.hasText()) {

			e.addEvdnceVrbleJrsdctnTxt(String.valueOf(evidencevariablejurisdiction.getText()));
		} else {
			e.addEvdnceVrbleJrsdctnTxt("NULL");
		}

		if(evidencevariablejurisdictioni == evidencevariablejurisdictionlist.size()-1) {e.addEvdnceVrbleJrsdctnTxt("]");}


		/******************** evidencevariablejurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariablejurisdictioncodinglist = evidencevariablejurisdiction.getCoding();
		for(int evidencevariablejurisdictioncodingi = 0; evidencevariablejurisdictioncodingi<evidencevariablejurisdictioncodinglist.size();evidencevariablejurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariablejurisdictioncoding = evidencevariablejurisdictioncodinglist.get(evidencevariablejurisdictioncodingi);

		/******************** EvdnceVrble_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(evidencevariablejurisdictioncodingi == 0) {e.addEvdnceVrbleJrsdctnCdgDsply("[[");}
		if(evidencevariablejurisdictioncoding.hasDisplay()) {

			e.addEvdnceVrbleJrsdctnCdgDsply(String.valueOf(evidencevariablejurisdictioncoding.getDisplay()));
		} else {
			e.addEvdnceVrbleJrsdctnCdgDsply("NULL");
		}

		if(evidencevariablejurisdictioncodingi == evidencevariablejurisdictioncodinglist.size()-1) {e.addEvdnceVrbleJrsdctnCdgDsply("]]");}


		/******************** EvdnceVrble_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablejurisdictioncodingi == 0) {e.addEvdnceVrbleJrsdctnCdgVrsn("[[");}
		if(evidencevariablejurisdictioncoding.hasVersion()) {

			e.addEvdnceVrbleJrsdctnCdgVrsn(String.valueOf(evidencevariablejurisdictioncoding.getVersion()));
		} else {
			e.addEvdnceVrbleJrsdctnCdgVrsn("NULL");
		}

		if(evidencevariablejurisdictioncodingi == evidencevariablejurisdictioncodinglist.size()-1) {e.addEvdnceVrbleJrsdctnCdgVrsn("]]");}


		/******************** EvdnceVrble_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(evidencevariablejurisdictioncodingi == 0) {e.addEvdnceVrbleJrsdctnCdgCd("[[");}
		if(evidencevariablejurisdictioncoding.hasCode()) {

			e.addEvdnceVrbleJrsdctnCdgCd(String.valueOf(evidencevariablejurisdictioncoding.getCode()));
		} else {
			e.addEvdnceVrbleJrsdctnCdgCd("NULL");
		}

		if(evidencevariablejurisdictioncodingi == evidencevariablejurisdictioncodinglist.size()-1) {e.addEvdnceVrbleJrsdctnCdgCd("]]");}


		/******************** EvdnceVrble_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablejurisdictioncodingi == 0) {e.addEvdnceVrbleJrsdctnCdgUsrSltd("[[");}
		if(evidencevariablejurisdictioncoding.hasUserSelected()) {

			e.addEvdnceVrbleJrsdctnCdgUsrSltd(String.valueOf(evidencevariablejurisdictioncoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleJrsdctnCdgUsrSltd("NULL");
		}

		if(evidencevariablejurisdictioncodingi == evidencevariablejurisdictioncodinglist.size()-1) {e.addEvdnceVrbleJrsdctnCdgUsrSltd("]]");}


		/******************** EvdnceVrble_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(evidencevariablejurisdictioncodingi == 0) {e.addEvdnceVrbleJrsdctnCdgSys("[[");}
		if(evidencevariablejurisdictioncoding.hasSystem()) {

			e.addEvdnceVrbleJrsdctnCdgSys(String.valueOf(evidencevariablejurisdictioncoding.getSystem()));
		} else {
			e.addEvdnceVrbleJrsdctnCdgSys("NULL");
		}

		if(evidencevariablejurisdictioncodingi == evidencevariablejurisdictioncodinglist.size()-1) {e.addEvdnceVrbleJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** evidencevariableusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> evidencevariableusecontextlist = evidencevariable.getUseContext();
		for(int evidencevariableusecontexti = 0; evidencevariableusecontexti<evidencevariableusecontextlist.size();evidencevariableusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  evidencevariableusecontext = evidencevariableusecontextlist.get(evidencevariableusecontexti);

		/******************** evidencevariableusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariableusecontextcode = evidencevariableusecontext.getCode();

		/******************** EvdnceVrble_UseCntxt_Cd_Dsply ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtCdDsply("[");}
		if(evidencevariableusecontextcode.hasDisplay()) {

			e.addEvdnceVrbleUseCntxtCdDsply(String.valueOf(evidencevariableusecontextcode.getDisplay()));
		} else {
			e.addEvdnceVrbleUseCntxtCdDsply("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtCdDsply("]");}


		/******************** EvdnceVrble_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtCdVrsn("[");}
		if(evidencevariableusecontextcode.hasVersion()) {

			e.addEvdnceVrbleUseCntxtCdVrsn(String.valueOf(evidencevariableusecontextcode.getVersion()));
		} else {
			e.addEvdnceVrbleUseCntxtCdVrsn("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtCdVrsn("]");}


		/******************** EvdnceVrble_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtCdUsrSltd("[");}
		if(evidencevariableusecontextcode.hasUserSelected()) {

			e.addEvdnceVrbleUseCntxtCdUsrSltd(String.valueOf(evidencevariableusecontextcode.getUserSelected()));
		} else {
			e.addEvdnceVrbleUseCntxtCdUsrSltd("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtCdUsrSltd("]");}


		/******************** EvdnceVrble_UseCntxt_Cd_Sys ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtCdSys("[");}
		if(evidencevariableusecontextcode.hasSystem()) {

			e.addEvdnceVrbleUseCntxtCdSys(String.valueOf(evidencevariableusecontextcode.getSystem()));
		} else {
			e.addEvdnceVrbleUseCntxtCdSys("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtCdSys("]");}


		/******************** EvdnceVrble_UseCntxt_VlRfrnc ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRfrnc("[");}
		if(evidencevariableusecontext.hasValueReference()) {

			if(evidencevariableusecontext.getValueReference().getReference() != null) {
			e.addEvdnceVrbleUseCntxtVlRfrnc(evidencevariableusecontext.getValueReference().getReference());
			}
		} else {
			e.addEvdnceVrbleUseCntxtVlRfrnc("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRfrnc("]");}


		/******************** evidencevariableusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariableusecontextvaluecodeableconcept = evidencevariableusecontext.getValueCodeableConcept();

		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlCdbleCncptTxt("[");}
		if(evidencevariableusecontextvaluecodeableconcept.hasText()) {

			e.addEvdnceVrbleUseCntxtVlCdbleCncptTxt(String.valueOf(evidencevariableusecontextvaluecodeableconcept.getText()));
		} else {
			e.addEvdnceVrbleUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlCdbleCncptTxt("]");}


		/******************** evidencevariableusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> evidencevariableusecontextvaluecodeableconceptcodinglist = evidencevariableusecontextvaluecodeableconcept.getCoding();
		for(int evidencevariableusecontextvaluecodeableconceptcodingi = 0; evidencevariableusecontextvaluecodeableconceptcodingi<evidencevariableusecontextvaluecodeableconceptcodinglist.size();evidencevariableusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  evidencevariableusecontextvaluecodeableconceptcoding = evidencevariableusecontextvaluecodeableconceptcodinglist.get(evidencevariableusecontextvaluecodeableconceptcodingi);

		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasDisplay()) {

			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(evidencevariableusecontextvaluecodeableconceptcodingi == evidencevariableusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasVersion()) {

			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(evidencevariableusecontextvaluecodeableconceptcodingi == evidencevariableusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgCd("[[");}
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasCode()) {

			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgCd(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(evidencevariableusecontextvaluecodeableconceptcodingi == evidencevariableusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(evidencevariableusecontextvaluecodeableconceptcodingi == evidencevariableusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcodingi == 0) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgSys("[[");}
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasSystem()) {

			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgSys(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(evidencevariableusecontextvaluecodeableconceptcodingi == evidencevariableusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEvdnceVrbleUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** evidencevariableusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariableusecontextvaluerange = evidencevariableusecontext.getValueRange();

		/******************** evidencevariableusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluerangelow = evidencevariableusecontextvaluerange.getLow();

		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngLwVl("[");}
		if(evidencevariableusecontextvaluerangelow.hasValue()) {

			e.addEvdnceVrbleUseCntxtVlRngLwVl(String.valueOf(evidencevariableusecontextvaluerangelow.getValue()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngLwVl("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngLwVl("]");}


		/******************** evidencevariableusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariableusecontextvaluerangelowcomparator = evidencevariableusecontextvaluerangelow.getComparator();
		if(evidencevariableusecontextvaluerangelowcomparator!=null) {
		if(evidencevariableusecontexti == 0) {

		e.addEvdnceVrbleUseCntxtVlRngLwCmprtr("[");		}
			e.addEvdnceVrbleUseCntxtVlRngLwCmprtr(evidencevariableusecontextvaluerangelowcomparator.toCode());
		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {

		e.addEvdnceVrbleUseCntxtVlRngLwCmprtr("]");		}

		} else {
			e.addEvdnceVrbleUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngLwCd("[");}
		if(evidencevariableusecontextvaluerangelow.hasCode()) {

			e.addEvdnceVrbleUseCntxtVlRngLwCd(String.valueOf(evidencevariableusecontextvaluerangelow.getCode()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngLwCd("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngLwCd("]");}


		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngLwUnt("[");}
		if(evidencevariableusecontextvaluerangelow.hasUnit()) {

			e.addEvdnceVrbleUseCntxtVlRngLwUnt(String.valueOf(evidencevariableusecontextvaluerangelow.getUnit()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngLwUnt("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngLwUnt("]");}


		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngLwSys("[");}
		if(evidencevariableusecontextvaluerangelow.hasSystem()) {

			e.addEvdnceVrbleUseCntxtVlRngLwSys(String.valueOf(evidencevariableusecontextvaluerangelow.getSystem()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngLwSys("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngLwSys("]");}


		/******************** evidencevariableusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluerangehigh = evidencevariableusecontextvaluerange.getHigh();

		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngHiVl("[");}
		if(evidencevariableusecontextvaluerangehigh.hasValue()) {

			e.addEvdnceVrbleUseCntxtVlRngHiVl(String.valueOf(evidencevariableusecontextvaluerangehigh.getValue()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngHiVl("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngHiVl("]");}


		/******************** evidencevariableusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariableusecontextvaluerangehighcomparator = evidencevariableusecontextvaluerangehigh.getComparator();
		if(evidencevariableusecontextvaluerangehighcomparator!=null) {
		if(evidencevariableusecontexti == 0) {

		e.addEvdnceVrbleUseCntxtVlRngHiCmprtr("[");		}
			e.addEvdnceVrbleUseCntxtVlRngHiCmprtr(evidencevariableusecontextvaluerangehighcomparator.toCode());
		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {

		e.addEvdnceVrbleUseCntxtVlRngHiCmprtr("]");		}

		} else {
			e.addEvdnceVrbleUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngHiCd("[");}
		if(evidencevariableusecontextvaluerangehigh.hasCode()) {

			e.addEvdnceVrbleUseCntxtVlRngHiCd(String.valueOf(evidencevariableusecontextvaluerangehigh.getCode()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngHiCd("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngHiCd("]");}


		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngHiUnt("[");}
		if(evidencevariableusecontextvaluerangehigh.hasUnit()) {

			e.addEvdnceVrbleUseCntxtVlRngHiUnt(String.valueOf(evidencevariableusecontextvaluerangehigh.getUnit()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngHiUnt("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngHiUnt("]");}


		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlRngHiSys("[");}
		if(evidencevariableusecontextvaluerangehigh.hasSystem()) {

			e.addEvdnceVrbleUseCntxtVlRngHiSys(String.valueOf(evidencevariableusecontextvaluerangehigh.getSystem()));
		} else {
			e.addEvdnceVrbleUseCntxtVlRngHiSys("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlRngHiSys("]");}


		/******************** evidencevariableusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluequantity = evidencevariableusecontext.getValueQuantity();

		/******************** EvdnceVrble_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlQntyVl("[");}
		if(evidencevariableusecontextvaluequantity.hasValue()) {

			e.addEvdnceVrbleUseCntxtVlQntyVl(String.valueOf(evidencevariableusecontextvaluequantity.getValue()));
		} else {
			e.addEvdnceVrbleUseCntxtVlQntyVl("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlQntyVl("]");}


		/******************** evidencevariableusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariableusecontextvaluequantitycomparator = evidencevariableusecontextvaluequantity.getComparator();
		if(evidencevariableusecontextvaluequantitycomparator!=null) {
		if(evidencevariableusecontexti == 0) {

		e.addEvdnceVrbleUseCntxtVlQntyCmprtr("[");		}
			e.addEvdnceVrbleUseCntxtVlQntyCmprtr(evidencevariableusecontextvaluequantitycomparator.toCode());
		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {

		e.addEvdnceVrbleUseCntxtVlQntyCmprtr("]");		}

		} else {
			e.addEvdnceVrbleUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** EvdnceVrble_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlQntyCd("[");}
		if(evidencevariableusecontextvaluequantity.hasCode()) {

			e.addEvdnceVrbleUseCntxtVlQntyCd(String.valueOf(evidencevariableusecontextvaluequantity.getCode()));
		} else {
			e.addEvdnceVrbleUseCntxtVlQntyCd("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlQntyCd("]");}


		/******************** EvdnceVrble_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlQntyUnt("[");}
		if(evidencevariableusecontextvaluequantity.hasUnit()) {

			e.addEvdnceVrbleUseCntxtVlQntyUnt(String.valueOf(evidencevariableusecontextvaluequantity.getUnit()));
		} else {
			e.addEvdnceVrbleUseCntxtVlQntyUnt("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlQntyUnt("]");}


		/******************** EvdnceVrble_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(evidencevariableusecontexti == 0) {e.addEvdnceVrbleUseCntxtVlQntySys("[");}
		if(evidencevariableusecontextvaluequantity.hasSystem()) {

			e.addEvdnceVrbleUseCntxtVlQntySys(String.valueOf(evidencevariableusecontextvaluequantity.getSystem()));
		} else {
			e.addEvdnceVrbleUseCntxtVlQntySys("NULL");
		}

		if(evidencevariableusecontexti == evidencevariableusecontextlist.size()-1) {e.addEvdnceVrbleUseCntxtVlQntySys("]");}


		 };
		/******************** EvdnceVrble_Pblshr ********************************************************************************/
		if(evidencevariable.hasPublisher()) {

			e.addEvdnceVrblePblshr(String.valueOf(evidencevariable.getPublisher()));
		} else {
			e.addEvdnceVrblePblshr("NULL");
		}


		/******************** evidencevariableeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableeffectiveperiod = evidencevariable.getEffectivePeriod();

		/******************** EvdnceVrble_EfctivePrd_Strt ********************************************************************************/
		if(evidencevariableeffectiveperiod.hasStart()) {

			e.addEvdnceVrbleEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableeffectiveperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleEfctivePrdStrt("NULL");
		}


		/******************** EvdnceVrble_EfctivePrd_End ********************************************************************************/
		if(evidencevariableeffectiveperiod.hasEnd()) {

			e.addEvdnceVrbleEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableeffectiveperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleEfctivePrdEnd("NULL");
		}


		/******************** evidencevariableauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> evidencevariableauthorlist = evidencevariable.getAuthor();
		for(int evidencevariableauthori = 0; evidencevariableauthori<evidencevariableauthorlist.size();evidencevariableauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  evidencevariableauthor = evidencevariableauthorlist.get(evidencevariableauthori);

		/******************** EvdnceVrble_Athr_Nm ********************************************************************************/
		if(evidencevariableauthori == 0) {e.addEvdnceVrbleAthrNm("[");}
		if(evidencevariableauthor.hasName()) {

			e.addEvdnceVrbleAthrNm(String.valueOf(evidencevariableauthor.getName()));
		} else {
			e.addEvdnceVrbleAthrNm("NULL");
		}

		if(evidencevariableauthori == evidencevariableauthorlist.size()-1) {e.addEvdnceVrbleAthrNm("]");}


		/******************** evidencevariableauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> evidencevariableauthortelecomlist = evidencevariableauthor.getTelecom();
		for(int evidencevariableauthortelecomi = 0; evidencevariableauthortelecomi<evidencevariableauthortelecomlist.size();evidencevariableauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  evidencevariableauthortelecom = evidencevariableauthortelecomlist.get(evidencevariableauthortelecomi);

		/******************** EvdnceVrble_Athr_Tlcm_Vl ********************************************************************************/
		if(evidencevariableauthortelecomi == 0) {e.addEvdnceVrbleAthrTlcmVl("[[");}
		if(evidencevariableauthortelecom.hasValue()) {

			e.addEvdnceVrbleAthrTlcmVl(String.valueOf(evidencevariableauthortelecom.getValue()));
		} else {
			e.addEvdnceVrbleAthrTlcmVl("NULL");
		}

		if(evidencevariableauthortelecomi == evidencevariableauthortelecomlist.size()-1) {e.addEvdnceVrbleAthrTlcmVl("]]");}


		/******************** evidencevariableauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableauthortelecomperiod = evidencevariableauthortelecom.getPeriod();

		/******************** EvdnceVrble_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariableauthortelecomi == 0) {e.addEvdnceVrbleAthrTlcmPrdStrt("[[");}
		if(evidencevariableauthortelecomperiod.hasStart()) {

			e.addEvdnceVrbleAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableauthortelecomperiod.getStart())+"\"");
		} else {
			e.addEvdnceVrbleAthrTlcmPrdStrt("NULL");
		}

		if(evidencevariableauthortelecomi == evidencevariableauthortelecomlist.size()-1) {e.addEvdnceVrbleAthrTlcmPrdStrt("]]");}


		/******************** EvdnceVrble_Athr_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariableauthortelecomi == 0) {e.addEvdnceVrbleAthrTlcmPrdEnd("[[");}
		if(evidencevariableauthortelecomperiod.hasEnd()) {

			e.addEvdnceVrbleAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(evidencevariableauthortelecomperiod.getEnd())+"\"");
		} else {
			e.addEvdnceVrbleAthrTlcmPrdEnd("NULL");
		}

		if(evidencevariableauthortelecomi == evidencevariableauthortelecomlist.size()-1) {e.addEvdnceVrbleAthrTlcmPrdEnd("]]");}


		/******************** evidencevariableauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariableauthortelecomuse = evidencevariableauthortelecom.getUse();
		if(evidencevariableauthortelecomuse!=null) {
		if(evidencevariableauthortelecomi == 0) {

		e.addEvdnceVrbleAthrTlcmUse("[[");		}
			e.addEvdnceVrbleAthrTlcmUse(evidencevariableauthortelecomuse.toCode());
		if(evidencevariableauthortelecomi == evidencevariableauthortelecomlist.size()-1) {

		e.addEvdnceVrbleAthrTlcmUse("]]");		}

		} else {
			e.addEvdnceVrbleAthrTlcmUse("NULL");
		}

		/******************** evidencevariableauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariableauthortelecomsystem = evidencevariableauthortelecom.getSystem();
		if(evidencevariableauthortelecomsystem!=null) {
		if(evidencevariableauthortelecomi == 0) {

		e.addEvdnceVrbleAthrTlcmSys("[[");		}
			e.addEvdnceVrbleAthrTlcmSys(evidencevariableauthortelecomsystem.toCode());
		if(evidencevariableauthortelecomi == evidencevariableauthortelecomlist.size()-1) {

		e.addEvdnceVrbleAthrTlcmSys("]]");		}

		} else {
			e.addEvdnceVrbleAthrTlcmSys("NULL");
		}

		/******************** EvdnceVrble_Athr_Tlcm_Rnk ********************************************************************************/
		if(evidencevariableauthortelecomi == 0) {e.addEvdnceVrbleAthrTlcmRnk("[[");}
		if(evidencevariableauthortelecom.hasRank()) {

			e.addEvdnceVrbleAthrTlcmRnk(String.valueOf(evidencevariableauthortelecom.getRank()));
		} else {
			e.addEvdnceVrbleAthrTlcmRnk("NULL");
		}

		if(evidencevariableauthortelecomi == evidencevariableauthortelecomlist.size()-1) {e.addEvdnceVrbleAthrTlcmRnk("]]");}


		 };
		 };
		return e;
	}
}
