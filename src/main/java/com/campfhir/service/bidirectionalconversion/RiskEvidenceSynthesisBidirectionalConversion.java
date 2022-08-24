package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskEvidenceSynthesis;
public class RiskEvidenceSynthesisBidirectionalConversion 
{
	public RiskEvidenceSynthesis RiskEvidenceSynthesiss(org.hl7.fhir.r4.model.RiskEvidenceSynthesis riskevidencesynthesis) throws ParseException
	{
		 main.java.com.campfhir.model.RiskEvidenceSynthesis r = new  main.java.com.campfhir.model.RiskEvidenceSynthesis();

		/******************** id ********************************************************************************/
		r.setId(riskevidencesynthesis.getIdElement().getIdPart());

		/******************** RskEvdnceSynths_Nm ********************************************************************************/
		if(riskevidencesynthesis.hasName()) {

			r.addRskEvdnceSynthsNm(String.valueOf(riskevidencesynthesis.getName()));
		} else {
			r.addRskEvdnceSynthsNm("NULL");
		}


		/******************** RskEvdnceSynths_Vrsn ********************************************************************************/
		if(riskevidencesynthesis.hasVersion()) {

			r.addRskEvdnceSynthsVrsn(String.valueOf(riskevidencesynthesis.getVersion()));
		} else {
			r.addRskEvdnceSynthsVrsn("NULL");
		}


		/******************** RskEvdnceSynths_Dt ********************************************************************************/
		if(riskevidencesynthesis.hasDate()) {

			r.addRskEvdnceSynthsDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesis.getDate())+"\"");
		} else {
			r.addRskEvdnceSynthsDt("NULL");
		}


		/******************** riskevidencesynthesisstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus riskevidencesynthesisstatus = riskevidencesynthesis.getStatus();
		if(riskevidencesynthesisstatus!=null) {
			r.addRskEvdnceSynthsSts(riskevidencesynthesisstatus.toCode());
		} else {
			r.addRskEvdnceSynthsSts("NULL");
		}

		/******************** RskEvdnceSynths_Dscrptn ********************************************************************************/
		if(riskevidencesynthesis.hasDescription()) {

			r.addRskEvdnceSynthsDscrptn(String.valueOf(riskevidencesynthesis.getDescription()));
		} else {
			r.addRskEvdnceSynthsDscrptn("NULL");
		}


		/******************** riskevidencesynthesisnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> riskevidencesynthesisnotelist = riskevidencesynthesis.getNote();
		for(int riskevidencesynthesisnotei = 0; riskevidencesynthesisnotei<riskevidencesynthesisnotelist.size();riskevidencesynthesisnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  riskevidencesynthesisnote = riskevidencesynthesisnotelist.get(riskevidencesynthesisnotei);

		/******************** RskEvdnceSynths_Nt_Time ********************************************************************************/
		if(riskevidencesynthesisnotei == 0) {r.addRskEvdnceSynthsNtTime("[");}
		if(riskevidencesynthesisnote.hasTime()) {

			r.addRskEvdnceSynthsNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisnote.getTime())+"\"");
		} else {
			r.addRskEvdnceSynthsNtTime("NULL");
		}

		if(riskevidencesynthesisnotei == riskevidencesynthesisnotelist.size()-1) {r.addRskEvdnceSynthsNtTime("]");}


		/******************** RskEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(riskevidencesynthesisnotei == 0) {r.addRskEvdnceSynthsNtAthrRfrnc("[");}
		if(riskevidencesynthesisnote.hasAuthorReference()) {

			if(riskevidencesynthesisnote.getAuthorReference().getReference() != null) {
			r.addRskEvdnceSynthsNtAthrRfrnc(riskevidencesynthesisnote.getAuthorReference().getReference());
			}
		} else {
			r.addRskEvdnceSynthsNtAthrRfrnc("NULL");
		}

		if(riskevidencesynthesisnotei == riskevidencesynthesisnotelist.size()-1) {r.addRskEvdnceSynthsNtAthrRfrnc("]");}


		/******************** RskEvdnceSynths_Nt_Txt ********************************************************************************/
		if(riskevidencesynthesisnotei == 0) {r.addRskEvdnceSynthsNtTxt("[");}
		if(riskevidencesynthesisnote.hasText()) {

			r.addRskEvdnceSynthsNtTxt(String.valueOf(riskevidencesynthesisnote.getText()));
		} else {
			r.addRskEvdnceSynthsNtTxt("NULL");
		}

		if(riskevidencesynthesisnotei == riskevidencesynthesisnotelist.size()-1) {r.addRskEvdnceSynthsNtTxt("]");}


		/******************** RskEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(riskevidencesynthesisnotei == 0) {r.addRskEvdnceSynthsNtAthrStrgTyp("[");}
		if(riskevidencesynthesisnote.hasAuthorStringType()) {

			r.addRskEvdnceSynthsNtAthrStrgTyp("\""+riskevidencesynthesisnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			r.addRskEvdnceSynthsNtAthrStrgTyp("NULL");
		}

		if(riskevidencesynthesisnotei == riskevidencesynthesisnotelist.size()-1) {r.addRskEvdnceSynthsNtAthrStrgTyp("]");}


		 };
		/******************** riskevidencesynthesisidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> riskevidencesynthesisidentifierlist = riskevidencesynthesis.getIdentifier();
		for(int riskevidencesynthesisidentifieri = 0; riskevidencesynthesisidentifieri<riskevidencesynthesisidentifierlist.size();riskevidencesynthesisidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  riskevidencesynthesisidentifier = riskevidencesynthesisidentifierlist.get(riskevidencesynthesisidentifieri);

		/******************** RskEvdnceSynths_Id_Vl ********************************************************************************/
		if(riskevidencesynthesisidentifieri == 0) {r.addRskEvdnceSynthsIdVl("[");}
		if(riskevidencesynthesisidentifier.hasValue()) {

			r.addRskEvdnceSynthsIdVl(String.valueOf(riskevidencesynthesisidentifier.getValue()));
		} else {
			r.addRskEvdnceSynthsIdVl("NULL");
		}

		if(riskevidencesynthesisidentifieri == riskevidencesynthesisidentifierlist.size()-1) {r.addRskEvdnceSynthsIdVl("]");}


		/******************** riskevidencesynthesisidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisidentifiertype = riskevidencesynthesisidentifier.getType();

		/******************** RskEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesisidentifieri == 0) {r.addRskEvdnceSynthsIdTypTxt("[");}
		if(riskevidencesynthesisidentifiertype.hasText()) {

			r.addRskEvdnceSynthsIdTypTxt(String.valueOf(riskevidencesynthesisidentifiertype.getText()));
		} else {
			r.addRskEvdnceSynthsIdTypTxt("NULL");
		}

		if(riskevidencesynthesisidentifieri == riskevidencesynthesisidentifierlist.size()-1) {r.addRskEvdnceSynthsIdTypTxt("]");}


		/******************** riskevidencesynthesisidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesisidentifiertypecodinglist = riskevidencesynthesisidentifiertype.getCoding();
		for(int riskevidencesynthesisidentifiertypecodingi = 0; riskevidencesynthesisidentifiertypecodingi<riskevidencesynthesisidentifiertypecodinglist.size();riskevidencesynthesisidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesisidentifiertypecoding = riskevidencesynthesisidentifiertypecodinglist.get(riskevidencesynthesisidentifiertypecodingi);

		/******************** RskEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecodingi == 0) {r.addRskEvdnceSynthsIdTypCdgDsply("[[");}
		if(riskevidencesynthesisidentifiertypecoding.hasDisplay()) {

			r.addRskEvdnceSynthsIdTypCdgDsply(String.valueOf(riskevidencesynthesisidentifiertypecoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsIdTypCdgDsply("NULL");
		}

		if(riskevidencesynthesisidentifiertypecodingi == riskevidencesynthesisidentifiertypecodinglist.size()-1) {r.addRskEvdnceSynthsIdTypCdgDsply("]]");}


		/******************** RskEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecodingi == 0) {r.addRskEvdnceSynthsIdTypCdgVrsn("[[");}
		if(riskevidencesynthesisidentifiertypecoding.hasVersion()) {

			r.addRskEvdnceSynthsIdTypCdgVrsn(String.valueOf(riskevidencesynthesisidentifiertypecoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsIdTypCdgVrsn("NULL");
		}

		if(riskevidencesynthesisidentifiertypecodingi == riskevidencesynthesisidentifiertypecodinglist.size()-1) {r.addRskEvdnceSynthsIdTypCdgVrsn("]]");}


		/******************** RskEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecodingi == 0) {r.addRskEvdnceSynthsIdTypCdgCd("[[");}
		if(riskevidencesynthesisidentifiertypecoding.hasCode()) {

			r.addRskEvdnceSynthsIdTypCdgCd(String.valueOf(riskevidencesynthesisidentifiertypecoding.getCode()));
		} else {
			r.addRskEvdnceSynthsIdTypCdgCd("NULL");
		}

		if(riskevidencesynthesisidentifiertypecodingi == riskevidencesynthesisidentifiertypecodinglist.size()-1) {r.addRskEvdnceSynthsIdTypCdgCd("]]");}


		/******************** RskEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecodingi == 0) {r.addRskEvdnceSynthsIdTypCdgUsrSltd("[[");}
		if(riskevidencesynthesisidentifiertypecoding.hasUserSelected()) {

			r.addRskEvdnceSynthsIdTypCdgUsrSltd(String.valueOf(riskevidencesynthesisidentifiertypecoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsIdTypCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesisidentifiertypecodingi == riskevidencesynthesisidentifiertypecodinglist.size()-1) {r.addRskEvdnceSynthsIdTypCdgUsrSltd("]]");}


		/******************** RskEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisidentifiertypecodingi == 0) {r.addRskEvdnceSynthsIdTypCdgSys("[[");}
		if(riskevidencesynthesisidentifiertypecoding.hasSystem()) {

			r.addRskEvdnceSynthsIdTypCdgSys(String.valueOf(riskevidencesynthesisidentifiertypecoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsIdTypCdgSys("NULL");
		}

		if(riskevidencesynthesisidentifiertypecodingi == riskevidencesynthesisidentifiertypecodinglist.size()-1) {r.addRskEvdnceSynthsIdTypCdgSys("]]");}


		 };
		/******************** riskevidencesynthesisidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisidentifierperiod = riskevidencesynthesisidentifier.getPeriod();

		/******************** RskEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisidentifieri == 0) {r.addRskEvdnceSynthsIdPrdStrt("[");}
		if(riskevidencesynthesisidentifierperiod.hasStart()) {

			r.addRskEvdnceSynthsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisidentifierperiod.getStart())+"\"");
		} else {
			r.addRskEvdnceSynthsIdPrdStrt("NULL");
		}

		if(riskevidencesynthesisidentifieri == riskevidencesynthesisidentifierlist.size()-1) {r.addRskEvdnceSynthsIdPrdStrt("]");}


		/******************** RskEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(riskevidencesynthesisidentifieri == 0) {r.addRskEvdnceSynthsIdPrdEnd("[");}
		if(riskevidencesynthesisidentifierperiod.hasEnd()) {

			r.addRskEvdnceSynthsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisidentifierperiod.getEnd())+"\"");
		} else {
			r.addRskEvdnceSynthsIdPrdEnd("NULL");
		}

		if(riskevidencesynthesisidentifieri == riskevidencesynthesisidentifierlist.size()-1) {r.addRskEvdnceSynthsIdPrdEnd("]");}


		/******************** riskevidencesynthesisidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse riskevidencesynthesisidentifieruse = riskevidencesynthesisidentifier.getUse();
		if(riskevidencesynthesisidentifieruse!=null) {
		if(riskevidencesynthesisidentifieri == 0) {

		r.addRskEvdnceSynthsIdUse("[");		}
			r.addRskEvdnceSynthsIdUse(riskevidencesynthesisidentifieruse.toCode());
		if(riskevidencesynthesisidentifieri == riskevidencesynthesisidentifierlist.size()-1) {

		r.addRskEvdnceSynthsIdUse("]");		}

		} else {
			r.addRskEvdnceSynthsIdUse("NULL");
		}

		/******************** RskEvdnceSynths_Id_Assigner ********************************************************************************/
		if(riskevidencesynthesisidentifieri == 0) {r.addRskEvdnceSynthsIdAssigner("[");}
		if(riskevidencesynthesisidentifier.hasAssigner()) {

			if(riskevidencesynthesisidentifier.getAssigner().getReference() != null) {
			r.addRskEvdnceSynthsIdAssigner(riskevidencesynthesisidentifier.getAssigner().getReference());
			}
		} else {
			r.addRskEvdnceSynthsIdAssigner("NULL");
		}

		if(riskevidencesynthesisidentifieri == riskevidencesynthesisidentifierlist.size()-1) {r.addRskEvdnceSynthsIdAssigner("]");}


		/******************** RskEvdnceSynths_Id_Sys ********************************************************************************/
		if(riskevidencesynthesisidentifieri == 0) {r.addRskEvdnceSynthsIdSys("[");}
		if(riskevidencesynthesisidentifier.hasSystem()) {

			r.addRskEvdnceSynthsIdSys(String.valueOf(riskevidencesynthesisidentifier.getSystem()));
		} else {
			r.addRskEvdnceSynthsIdSys("NULL");
		}

		if(riskevidencesynthesisidentifieri == riskevidencesynthesisidentifierlist.size()-1) {r.addRskEvdnceSynthsIdSys("]");}


		 };
		/******************** RskEvdnceSynths_Outcome ********************************************************************************/
		if(riskevidencesynthesis.hasOutcome()) {

			if(riskevidencesynthesis.getOutcome().getReference() != null) {
			r.addRskEvdnceSynthsOutcome(riskevidencesynthesis.getOutcome().getReference());
			}
		} else {
			r.addRskEvdnceSynthsOutcome("NULL");
		}


		/******************** riskevidencesynthesiscontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> riskevidencesynthesiscontactlist = riskevidencesynthesis.getContact();
		for(int riskevidencesynthesiscontacti = 0; riskevidencesynthesiscontacti<riskevidencesynthesiscontactlist.size();riskevidencesynthesiscontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  riskevidencesynthesiscontact = riskevidencesynthesiscontactlist.get(riskevidencesynthesiscontacti);

		/******************** RskEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(riskevidencesynthesiscontacti == 0) {r.addRskEvdnceSynthsCntctNm("[");}
		if(riskevidencesynthesiscontact.hasName()) {

			r.addRskEvdnceSynthsCntctNm(String.valueOf(riskevidencesynthesiscontact.getName()));
		} else {
			r.addRskEvdnceSynthsCntctNm("NULL");
		}

		if(riskevidencesynthesiscontacti == riskevidencesynthesiscontactlist.size()-1) {r.addRskEvdnceSynthsCntctNm("]");}


		/******************** riskevidencesynthesiscontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> riskevidencesynthesiscontacttelecomlist = riskevidencesynthesiscontact.getTelecom();
		for(int riskevidencesynthesiscontacttelecomi = 0; riskevidencesynthesiscontacttelecomi<riskevidencesynthesiscontacttelecomlist.size();riskevidencesynthesiscontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  riskevidencesynthesiscontacttelecom = riskevidencesynthesiscontacttelecomlist.get(riskevidencesynthesiscontacttelecomi);

		/******************** RskEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesiscontacttelecomi == 0) {r.addRskEvdnceSynthsCntctTlcmVl("[[");}
		if(riskevidencesynthesiscontacttelecom.hasValue()) {

			r.addRskEvdnceSynthsCntctTlcmVl(String.valueOf(riskevidencesynthesiscontacttelecom.getValue()));
		} else {
			r.addRskEvdnceSynthsCntctTlcmVl("NULL");
		}

		if(riskevidencesynthesiscontacttelecomi == riskevidencesynthesiscontacttelecomlist.size()-1) {r.addRskEvdnceSynthsCntctTlcmVl("]]");}


		/******************** riskevidencesynthesiscontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiscontacttelecomperiod = riskevidencesynthesiscontacttelecom.getPeriod();

		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesiscontacttelecomi == 0) {r.addRskEvdnceSynthsCntctTlcmPrdStrt("[[");}
		if(riskevidencesynthesiscontacttelecomperiod.hasStart()) {

			r.addRskEvdnceSynthsCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiscontacttelecomperiod.getStart())+"\"");
		} else {
			r.addRskEvdnceSynthsCntctTlcmPrdStrt("NULL");
		}

		if(riskevidencesynthesiscontacttelecomi == riskevidencesynthesiscontacttelecomlist.size()-1) {r.addRskEvdnceSynthsCntctTlcmPrdStrt("]]");}


		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesiscontacttelecomi == 0) {r.addRskEvdnceSynthsCntctTlcmPrdEnd("[[");}
		if(riskevidencesynthesiscontacttelecomperiod.hasEnd()) {

			r.addRskEvdnceSynthsCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiscontacttelecomperiod.getEnd())+"\"");
		} else {
			r.addRskEvdnceSynthsCntctTlcmPrdEnd("NULL");
		}

		if(riskevidencesynthesiscontacttelecomi == riskevidencesynthesiscontacttelecomlist.size()-1) {r.addRskEvdnceSynthsCntctTlcmPrdEnd("]]");}


		/******************** riskevidencesynthesiscontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesiscontacttelecomuse = riskevidencesynthesiscontacttelecom.getUse();
		if(riskevidencesynthesiscontacttelecomuse!=null) {
		if(riskevidencesynthesiscontacttelecomi == 0) {

		r.addRskEvdnceSynthsCntctTlcmUse("[[");		}
			r.addRskEvdnceSynthsCntctTlcmUse(riskevidencesynthesiscontacttelecomuse.toCode());
		if(riskevidencesynthesiscontacttelecomi == riskevidencesynthesiscontacttelecomlist.size()-1) {

		r.addRskEvdnceSynthsCntctTlcmUse("]]");		}

		} else {
			r.addRskEvdnceSynthsCntctTlcmUse("NULL");
		}

		/******************** riskevidencesynthesiscontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesiscontacttelecomsystem = riskevidencesynthesiscontacttelecom.getSystem();
		if(riskevidencesynthesiscontacttelecomsystem!=null) {
		if(riskevidencesynthesiscontacttelecomi == 0) {

		r.addRskEvdnceSynthsCntctTlcmSys("[[");		}
			r.addRskEvdnceSynthsCntctTlcmSys(riskevidencesynthesiscontacttelecomsystem.toCode());
		if(riskevidencesynthesiscontacttelecomi == riskevidencesynthesiscontacttelecomlist.size()-1) {

		r.addRskEvdnceSynthsCntctTlcmSys("]]");		}

		} else {
			r.addRskEvdnceSynthsCntctTlcmSys("NULL");
		}

		/******************** RskEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesiscontacttelecomi == 0) {r.addRskEvdnceSynthsCntctTlcmRnk("[[");}
		if(riskevidencesynthesiscontacttelecom.hasRank()) {

			r.addRskEvdnceSynthsCntctTlcmRnk(String.valueOf(riskevidencesynthesiscontacttelecom.getRank()));
		} else {
			r.addRskEvdnceSynthsCntctTlcmRnk("NULL");
		}

		if(riskevidencesynthesiscontacttelecomi == riskevidencesynthesiscontacttelecomlist.size()-1) {r.addRskEvdnceSynthsCntctTlcmRnk("]]");}


		 };
		 };
		/******************** RskEvdnceSynths_Copyright ********************************************************************************/
		if(riskevidencesynthesis.hasCopyright()) {

			r.addRskEvdnceSynthsCopyright(String.valueOf(riskevidencesynthesis.getCopyright()));
		} else {
			r.addRskEvdnceSynthsCopyright("NULL");
		}


		/******************** RskEvdnceSynths_ApprovalDt ********************************************************************************/
		if(riskevidencesynthesis.hasApprovalDate()) {

			r.addRskEvdnceSynthsApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesis.getApprovalDate())+"\"");
		} else {
			r.addRskEvdnceSynthsApprovalDt("NULL");
		}


		/******************** riskevidencesynthesisendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> riskevidencesynthesisendorserlist = riskevidencesynthesis.getEndorser();
		for(int riskevidencesynthesisendorseri = 0; riskevidencesynthesisendorseri<riskevidencesynthesisendorserlist.size();riskevidencesynthesisendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  riskevidencesynthesisendorser = riskevidencesynthesisendorserlist.get(riskevidencesynthesisendorseri);

		/******************** RskEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(riskevidencesynthesisendorseri == 0) {r.addRskEvdnceSynthsEndsrNm("[");}
		if(riskevidencesynthesisendorser.hasName()) {

			r.addRskEvdnceSynthsEndsrNm(String.valueOf(riskevidencesynthesisendorser.getName()));
		} else {
			r.addRskEvdnceSynthsEndsrNm("NULL");
		}

		if(riskevidencesynthesisendorseri == riskevidencesynthesisendorserlist.size()-1) {r.addRskEvdnceSynthsEndsrNm("]");}


		/******************** riskevidencesynthesisendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> riskevidencesynthesisendorsertelecomlist = riskevidencesynthesisendorser.getTelecom();
		for(int riskevidencesynthesisendorsertelecomi = 0; riskevidencesynthesisendorsertelecomi<riskevidencesynthesisendorsertelecomlist.size();riskevidencesynthesisendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  riskevidencesynthesisendorsertelecom = riskevidencesynthesisendorsertelecomlist.get(riskevidencesynthesisendorsertelecomi);

		/******************** RskEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesisendorsertelecomi == 0) {r.addRskEvdnceSynthsEndsrTlcmVl("[[");}
		if(riskevidencesynthesisendorsertelecom.hasValue()) {

			r.addRskEvdnceSynthsEndsrTlcmVl(String.valueOf(riskevidencesynthesisendorsertelecom.getValue()));
		} else {
			r.addRskEvdnceSynthsEndsrTlcmVl("NULL");
		}

		if(riskevidencesynthesisendorsertelecomi == riskevidencesynthesisendorsertelecomlist.size()-1) {r.addRskEvdnceSynthsEndsrTlcmVl("]]");}


		/******************** riskevidencesynthesisendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisendorsertelecomperiod = riskevidencesynthesisendorsertelecom.getPeriod();

		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisendorsertelecomi == 0) {r.addRskEvdnceSynthsEndsrTlcmPrdStrt("[[");}
		if(riskevidencesynthesisendorsertelecomperiod.hasStart()) {

			r.addRskEvdnceSynthsEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisendorsertelecomperiod.getStart())+"\"");
		} else {
			r.addRskEvdnceSynthsEndsrTlcmPrdStrt("NULL");
		}

		if(riskevidencesynthesisendorsertelecomi == riskevidencesynthesisendorsertelecomlist.size()-1) {r.addRskEvdnceSynthsEndsrTlcmPrdStrt("]]");}


		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesisendorsertelecomi == 0) {r.addRskEvdnceSynthsEndsrTlcmPrdEnd("[[");}
		if(riskevidencesynthesisendorsertelecomperiod.hasEnd()) {

			r.addRskEvdnceSynthsEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisendorsertelecomperiod.getEnd())+"\"");
		} else {
			r.addRskEvdnceSynthsEndsrTlcmPrdEnd("NULL");
		}

		if(riskevidencesynthesisendorsertelecomi == riskevidencesynthesisendorsertelecomlist.size()-1) {r.addRskEvdnceSynthsEndsrTlcmPrdEnd("]]");}


		/******************** riskevidencesynthesisendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesisendorsertelecomuse = riskevidencesynthesisendorsertelecom.getUse();
		if(riskevidencesynthesisendorsertelecomuse!=null) {
		if(riskevidencesynthesisendorsertelecomi == 0) {

		r.addRskEvdnceSynthsEndsrTlcmUse("[[");		}
			r.addRskEvdnceSynthsEndsrTlcmUse(riskevidencesynthesisendorsertelecomuse.toCode());
		if(riskevidencesynthesisendorsertelecomi == riskevidencesynthesisendorsertelecomlist.size()-1) {

		r.addRskEvdnceSynthsEndsrTlcmUse("]]");		}

		} else {
			r.addRskEvdnceSynthsEndsrTlcmUse("NULL");
		}

		/******************** riskevidencesynthesisendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesisendorsertelecomsystem = riskevidencesynthesisendorsertelecom.getSystem();
		if(riskevidencesynthesisendorsertelecomsystem!=null) {
		if(riskevidencesynthesisendorsertelecomi == 0) {

		r.addRskEvdnceSynthsEndsrTlcmSys("[[");		}
			r.addRskEvdnceSynthsEndsrTlcmSys(riskevidencesynthesisendorsertelecomsystem.toCode());
		if(riskevidencesynthesisendorsertelecomi == riskevidencesynthesisendorsertelecomlist.size()-1) {

		r.addRskEvdnceSynthsEndsrTlcmSys("]]");		}

		} else {
			r.addRskEvdnceSynthsEndsrTlcmSys("NULL");
		}

		/******************** RskEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesisendorsertelecomi == 0) {r.addRskEvdnceSynthsEndsrTlcmRnk("[[");}
		if(riskevidencesynthesisendorsertelecom.hasRank()) {

			r.addRskEvdnceSynthsEndsrTlcmRnk(String.valueOf(riskevidencesynthesisendorsertelecom.getRank()));
		} else {
			r.addRskEvdnceSynthsEndsrTlcmRnk("NULL");
		}

		if(riskevidencesynthesisendorsertelecomi == riskevidencesynthesisendorsertelecomlist.size()-1) {r.addRskEvdnceSynthsEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** RskEvdnceSynths_LastReviewDt ********************************************************************************/
		if(riskevidencesynthesis.hasLastReviewDate()) {

			r.addRskEvdnceSynthsLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesis.getLastReviewDate())+"\"");
		} else {
			r.addRskEvdnceSynthsLastReviewDt("NULL");
		}


		/******************** riskevidencesynthesiseditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> riskevidencesynthesiseditorlist = riskevidencesynthesis.getEditor();
		for(int riskevidencesynthesiseditori = 0; riskevidencesynthesiseditori<riskevidencesynthesiseditorlist.size();riskevidencesynthesiseditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  riskevidencesynthesiseditor = riskevidencesynthesiseditorlist.get(riskevidencesynthesiseditori);

		/******************** RskEvdnceSynths_Editor_Nm ********************************************************************************/
		if(riskevidencesynthesiseditori == 0) {r.addRskEvdnceSynthsEditorNm("[");}
		if(riskevidencesynthesiseditor.hasName()) {

			r.addRskEvdnceSynthsEditorNm(String.valueOf(riskevidencesynthesiseditor.getName()));
		} else {
			r.addRskEvdnceSynthsEditorNm("NULL");
		}

		if(riskevidencesynthesiseditori == riskevidencesynthesiseditorlist.size()-1) {r.addRskEvdnceSynthsEditorNm("]");}


		/******************** riskevidencesynthesiseditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> riskevidencesynthesiseditortelecomlist = riskevidencesynthesiseditor.getTelecom();
		for(int riskevidencesynthesiseditortelecomi = 0; riskevidencesynthesiseditortelecomi<riskevidencesynthesiseditortelecomlist.size();riskevidencesynthesiseditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  riskevidencesynthesiseditortelecom = riskevidencesynthesiseditortelecomlist.get(riskevidencesynthesiseditortelecomi);

		/******************** RskEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesiseditortelecomi == 0) {r.addRskEvdnceSynthsEditorTlcmVl("[[");}
		if(riskevidencesynthesiseditortelecom.hasValue()) {

			r.addRskEvdnceSynthsEditorTlcmVl(String.valueOf(riskevidencesynthesiseditortelecom.getValue()));
		} else {
			r.addRskEvdnceSynthsEditorTlcmVl("NULL");
		}

		if(riskevidencesynthesiseditortelecomi == riskevidencesynthesiseditortelecomlist.size()-1) {r.addRskEvdnceSynthsEditorTlcmVl("]]");}


		/******************** riskevidencesynthesiseditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiseditortelecomperiod = riskevidencesynthesiseditortelecom.getPeriod();

		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesiseditortelecomi == 0) {r.addRskEvdnceSynthsEditorTlcmPrdStrt("[[");}
		if(riskevidencesynthesiseditortelecomperiod.hasStart()) {

			r.addRskEvdnceSynthsEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiseditortelecomperiod.getStart())+"\"");
		} else {
			r.addRskEvdnceSynthsEditorTlcmPrdStrt("NULL");
		}

		if(riskevidencesynthesiseditortelecomi == riskevidencesynthesiseditortelecomlist.size()-1) {r.addRskEvdnceSynthsEditorTlcmPrdStrt("]]");}


		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesiseditortelecomi == 0) {r.addRskEvdnceSynthsEditorTlcmPrdEnd("[[");}
		if(riskevidencesynthesiseditortelecomperiod.hasEnd()) {

			r.addRskEvdnceSynthsEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiseditortelecomperiod.getEnd())+"\"");
		} else {
			r.addRskEvdnceSynthsEditorTlcmPrdEnd("NULL");
		}

		if(riskevidencesynthesiseditortelecomi == riskevidencesynthesiseditortelecomlist.size()-1) {r.addRskEvdnceSynthsEditorTlcmPrdEnd("]]");}


		/******************** riskevidencesynthesiseditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesiseditortelecomuse = riskevidencesynthesiseditortelecom.getUse();
		if(riskevidencesynthesiseditortelecomuse!=null) {
		if(riskevidencesynthesiseditortelecomi == 0) {

		r.addRskEvdnceSynthsEditorTlcmUse("[[");		}
			r.addRskEvdnceSynthsEditorTlcmUse(riskevidencesynthesiseditortelecomuse.toCode());
		if(riskevidencesynthesiseditortelecomi == riskevidencesynthesiseditortelecomlist.size()-1) {

		r.addRskEvdnceSynthsEditorTlcmUse("]]");		}

		} else {
			r.addRskEvdnceSynthsEditorTlcmUse("NULL");
		}

		/******************** riskevidencesynthesiseditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesiseditortelecomsystem = riskevidencesynthesiseditortelecom.getSystem();
		if(riskevidencesynthesiseditortelecomsystem!=null) {
		if(riskevidencesynthesiseditortelecomi == 0) {

		r.addRskEvdnceSynthsEditorTlcmSys("[[");		}
			r.addRskEvdnceSynthsEditorTlcmSys(riskevidencesynthesiseditortelecomsystem.toCode());
		if(riskevidencesynthesiseditortelecomi == riskevidencesynthesiseditortelecomlist.size()-1) {

		r.addRskEvdnceSynthsEditorTlcmSys("]]");		}

		} else {
			r.addRskEvdnceSynthsEditorTlcmSys("NULL");
		}

		/******************** RskEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesiseditortelecomi == 0) {r.addRskEvdnceSynthsEditorTlcmRnk("[[");}
		if(riskevidencesynthesiseditortelecom.hasRank()) {

			r.addRskEvdnceSynthsEditorTlcmRnk(String.valueOf(riskevidencesynthesiseditortelecom.getRank()));
		} else {
			r.addRskEvdnceSynthsEditorTlcmRnk("NULL");
		}

		if(riskevidencesynthesiseditortelecomi == riskevidencesynthesiseditortelecomlist.size()-1) {r.addRskEvdnceSynthsEditorTlcmRnk("]]");}


		 };
		 };
		/******************** riskevidencesynthesisreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> riskevidencesynthesisreviewerlist = riskevidencesynthesis.getReviewer();
		for(int riskevidencesynthesisrevieweri = 0; riskevidencesynthesisrevieweri<riskevidencesynthesisreviewerlist.size();riskevidencesynthesisrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  riskevidencesynthesisreviewer = riskevidencesynthesisreviewerlist.get(riskevidencesynthesisrevieweri);

		/******************** RskEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(riskevidencesynthesisrevieweri == 0) {r.addRskEvdnceSynthsRviewrNm("[");}
		if(riskevidencesynthesisreviewer.hasName()) {

			r.addRskEvdnceSynthsRviewrNm(String.valueOf(riskevidencesynthesisreviewer.getName()));
		} else {
			r.addRskEvdnceSynthsRviewrNm("NULL");
		}

		if(riskevidencesynthesisrevieweri == riskevidencesynthesisreviewerlist.size()-1) {r.addRskEvdnceSynthsRviewrNm("]");}


		/******************** riskevidencesynthesisreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> riskevidencesynthesisreviewertelecomlist = riskevidencesynthesisreviewer.getTelecom();
		for(int riskevidencesynthesisreviewertelecomi = 0; riskevidencesynthesisreviewertelecomi<riskevidencesynthesisreviewertelecomlist.size();riskevidencesynthesisreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  riskevidencesynthesisreviewertelecom = riskevidencesynthesisreviewertelecomlist.get(riskevidencesynthesisreviewertelecomi);

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesisreviewertelecomi == 0) {r.addRskEvdnceSynthsRviewrTlcmVl("[[");}
		if(riskevidencesynthesisreviewertelecom.hasValue()) {

			r.addRskEvdnceSynthsRviewrTlcmVl(String.valueOf(riskevidencesynthesisreviewertelecom.getValue()));
		} else {
			r.addRskEvdnceSynthsRviewrTlcmVl("NULL");
		}

		if(riskevidencesynthesisreviewertelecomi == riskevidencesynthesisreviewertelecomlist.size()-1) {r.addRskEvdnceSynthsRviewrTlcmVl("]]");}


		/******************** riskevidencesynthesisreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisreviewertelecomperiod = riskevidencesynthesisreviewertelecom.getPeriod();

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisreviewertelecomi == 0) {r.addRskEvdnceSynthsRviewrTlcmPrdStrt("[[");}
		if(riskevidencesynthesisreviewertelecomperiod.hasStart()) {

			r.addRskEvdnceSynthsRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisreviewertelecomperiod.getStart())+"\"");
		} else {
			r.addRskEvdnceSynthsRviewrTlcmPrdStrt("NULL");
		}

		if(riskevidencesynthesisreviewertelecomi == riskevidencesynthesisreviewertelecomlist.size()-1) {r.addRskEvdnceSynthsRviewrTlcmPrdStrt("]]");}


		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesisreviewertelecomi == 0) {r.addRskEvdnceSynthsRviewrTlcmPrdEnd("[[");}
		if(riskevidencesynthesisreviewertelecomperiod.hasEnd()) {

			r.addRskEvdnceSynthsRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisreviewertelecomperiod.getEnd())+"\"");
		} else {
			r.addRskEvdnceSynthsRviewrTlcmPrdEnd("NULL");
		}

		if(riskevidencesynthesisreviewertelecomi == riskevidencesynthesisreviewertelecomlist.size()-1) {r.addRskEvdnceSynthsRviewrTlcmPrdEnd("]]");}


		/******************** riskevidencesynthesisreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesisreviewertelecomuse = riskevidencesynthesisreviewertelecom.getUse();
		if(riskevidencesynthesisreviewertelecomuse!=null) {
		if(riskevidencesynthesisreviewertelecomi == 0) {

		r.addRskEvdnceSynthsRviewrTlcmUse("[[");		}
			r.addRskEvdnceSynthsRviewrTlcmUse(riskevidencesynthesisreviewertelecomuse.toCode());
		if(riskevidencesynthesisreviewertelecomi == riskevidencesynthesisreviewertelecomlist.size()-1) {

		r.addRskEvdnceSynthsRviewrTlcmUse("]]");		}

		} else {
			r.addRskEvdnceSynthsRviewrTlcmUse("NULL");
		}

		/******************** riskevidencesynthesisreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesisreviewertelecomsystem = riskevidencesynthesisreviewertelecom.getSystem();
		if(riskevidencesynthesisreviewertelecomsystem!=null) {
		if(riskevidencesynthesisreviewertelecomi == 0) {

		r.addRskEvdnceSynthsRviewrTlcmSys("[[");		}
			r.addRskEvdnceSynthsRviewrTlcmSys(riskevidencesynthesisreviewertelecomsystem.toCode());
		if(riskevidencesynthesisreviewertelecomi == riskevidencesynthesisreviewertelecomlist.size()-1) {

		r.addRskEvdnceSynthsRviewrTlcmSys("]]");		}

		} else {
			r.addRskEvdnceSynthsRviewrTlcmSys("NULL");
		}

		/******************** RskEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesisreviewertelecomi == 0) {r.addRskEvdnceSynthsRviewrTlcmRnk("[[");}
		if(riskevidencesynthesisreviewertelecom.hasRank()) {

			r.addRskEvdnceSynthsRviewrTlcmRnk(String.valueOf(riskevidencesynthesisreviewertelecom.getRank()));
		} else {
			r.addRskEvdnceSynthsRviewrTlcmRnk("NULL");
		}

		if(riskevidencesynthesisreviewertelecomi == riskevidencesynthesisreviewertelecomlist.size()-1) {r.addRskEvdnceSynthsRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** riskevidencesynthesissynthesistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesissynthesistype = riskevidencesynthesis.getSynthesisType();

		/******************** RskEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(riskevidencesynthesissynthesistype.hasText()) {

			r.addRskEvdnceSynthsSynthsTypTxt(String.valueOf(riskevidencesynthesissynthesistype.getText()));
		} else {
			r.addRskEvdnceSynthsSynthsTypTxt("NULL");
		}


		/******************** riskevidencesynthesissynthesistypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesissynthesistypecodinglist = riskevidencesynthesissynthesistype.getCoding();
		for(int riskevidencesynthesissynthesistypecodingi = 0; riskevidencesynthesissynthesistypecodingi<riskevidencesynthesissynthesistypecodinglist.size();riskevidencesynthesissynthesistypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesissynthesistypecoding = riskevidencesynthesissynthesistypecodinglist.get(riskevidencesynthesissynthesistypecodingi);

		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesissynthesistypecodingi == 0) {r.addRskEvdnceSynthsSynthsTypCdgDsply("[");}
		if(riskevidencesynthesissynthesistypecoding.hasDisplay()) {

			r.addRskEvdnceSynthsSynthsTypCdgDsply(String.valueOf(riskevidencesynthesissynthesistypecoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsSynthsTypCdgDsply("NULL");
		}

		if(riskevidencesynthesissynthesistypecodingi == riskevidencesynthesissynthesistypecodinglist.size()-1) {r.addRskEvdnceSynthsSynthsTypCdgDsply("]");}


		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesissynthesistypecodingi == 0) {r.addRskEvdnceSynthsSynthsTypCdgVrsn("[");}
		if(riskevidencesynthesissynthesistypecoding.hasVersion()) {

			r.addRskEvdnceSynthsSynthsTypCdgVrsn(String.valueOf(riskevidencesynthesissynthesistypecoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsSynthsTypCdgVrsn("NULL");
		}

		if(riskevidencesynthesissynthesistypecodingi == riskevidencesynthesissynthesistypecodinglist.size()-1) {r.addRskEvdnceSynthsSynthsTypCdgVrsn("]");}


		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesissynthesistypecodingi == 0) {r.addRskEvdnceSynthsSynthsTypCdgCd("[");}
		if(riskevidencesynthesissynthesistypecoding.hasCode()) {

			r.addRskEvdnceSynthsSynthsTypCdgCd(String.valueOf(riskevidencesynthesissynthesistypecoding.getCode()));
		} else {
			r.addRskEvdnceSynthsSynthsTypCdgCd("NULL");
		}

		if(riskevidencesynthesissynthesistypecodingi == riskevidencesynthesissynthesistypecodinglist.size()-1) {r.addRskEvdnceSynthsSynthsTypCdgCd("]");}


		/******************** RskEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesissynthesistypecodingi == 0) {r.addRskEvdnceSynthsSynthsTypCdgUsrSltd("[");}
		if(riskevidencesynthesissynthesistypecoding.hasUserSelected()) {

			r.addRskEvdnceSynthsSynthsTypCdgUsrSltd(String.valueOf(riskevidencesynthesissynthesistypecoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsSynthsTypCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesissynthesistypecodingi == riskevidencesynthesissynthesistypecodinglist.size()-1) {r.addRskEvdnceSynthsSynthsTypCdgUsrSltd("]");}


		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesissynthesistypecodingi == 0) {r.addRskEvdnceSynthsSynthsTypCdgSys("[");}
		if(riskevidencesynthesissynthesistypecoding.hasSystem()) {

			r.addRskEvdnceSynthsSynthsTypCdgSys(String.valueOf(riskevidencesynthesissynthesistypecoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsSynthsTypCdgSys("NULL");
		}

		if(riskevidencesynthesissynthesistypecodingi == riskevidencesynthesissynthesistypecodinglist.size()-1) {r.addRskEvdnceSynthsSynthsTypCdgSys("]");}


		 };
		/******************** riskevidencesynthesissamplesize ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisSampleSizeComponent riskevidencesynthesissamplesize = riskevidencesynthesis.getSampleSize();

		/******************** RskEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(riskevidencesynthesissamplesize.hasDescription()) {

			r.addRskEvdnceSynthsSampleSzDscrptn(String.valueOf(riskevidencesynthesissamplesize.getDescription()));
		} else {
			r.addRskEvdnceSynthsSampleSzDscrptn("NULL");
		}


		/******************** RskEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(riskevidencesynthesissamplesize.hasNumberOfStudies()) {

			r.addRskEvdnceSynthsSampleSzNmbrOfStudies(String.valueOf(riskevidencesynthesissamplesize.getNumberOfStudies()));
		} else {
			r.addRskEvdnceSynthsSampleSzNmbrOfStudies("NULL");
		}


		/******************** RskEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(riskevidencesynthesissamplesize.hasNumberOfParticipants()) {

			r.addRskEvdnceSynthsSampleSzNmbrOfPrtcpnts(String.valueOf(riskevidencesynthesissamplesize.getNumberOfParticipants()));
		} else {
			r.addRskEvdnceSynthsSampleSzNmbrOfPrtcpnts("NULL");
		}


		/******************** riskevidencesynthesisriskestimate ********************************************************************************/
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimateComponent riskevidencesynthesisriskestimate = riskevidencesynthesis.getRiskEstimate();

		/******************** RskEvdnceSynths_RskEstmt_Vl ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasValue()) {

			r.addRskEvdnceSynthsRskEstmtVl(String.valueOf(riskevidencesynthesisriskestimate.getValue()));
		} else {
			r.addRskEvdnceSynthsRskEstmtVl("NULL");
		}


		/******************** riskevidencesynthesisriskestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimatetype = riskevidencesynthesisriskestimate.getType();

		/******************** RskEvdnceSynths_RskEstmt_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesisriskestimatetype.hasText()) {

			r.addRskEvdnceSynthsRskEstmtTypTxt(String.valueOf(riskevidencesynthesisriskestimatetype.getText()));
		} else {
			r.addRskEvdnceSynthsRskEstmtTypTxt("NULL");
		}


		/******************** riskevidencesynthesisriskestimatetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesisriskestimatetypecodinglist = riskevidencesynthesisriskestimatetype.getCoding();
		for(int riskevidencesynthesisriskestimatetypecodingi = 0; riskevidencesynthesisriskestimatetypecodingi<riskevidencesynthesisriskestimatetypecodinglist.size();riskevidencesynthesisriskestimatetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesisriskestimatetypecoding = riskevidencesynthesisriskestimatetypecodinglist.get(riskevidencesynthesisriskestimatetypecodingi);

		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtTypCdgDsply("[");}
		if(riskevidencesynthesisriskestimatetypecoding.hasDisplay()) {

			r.addRskEvdnceSynthsRskEstmtTypCdgDsply(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsRskEstmtTypCdgDsply("NULL");
		}

		if(riskevidencesynthesisriskestimatetypecodingi == riskevidencesynthesisriskestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtTypCdgDsply("]");}


		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtTypCdgVrsn("[");}
		if(riskevidencesynthesisriskestimatetypecoding.hasVersion()) {

			r.addRskEvdnceSynthsRskEstmtTypCdgVrsn(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsRskEstmtTypCdgVrsn("NULL");
		}

		if(riskevidencesynthesisriskestimatetypecodingi == riskevidencesynthesisriskestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtTypCdgVrsn("]");}


		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtTypCdgCd("[");}
		if(riskevidencesynthesisriskestimatetypecoding.hasCode()) {

			r.addRskEvdnceSynthsRskEstmtTypCdgCd(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getCode()));
		} else {
			r.addRskEvdnceSynthsRskEstmtTypCdgCd("NULL");
		}

		if(riskevidencesynthesisriskestimatetypecodingi == riskevidencesynthesisriskestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtTypCdgCd("]");}


		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtTypCdgUsrSltd("[");}
		if(riskevidencesynthesisriskestimatetypecoding.hasUserSelected()) {

			r.addRskEvdnceSynthsRskEstmtTypCdgUsrSltd(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsRskEstmtTypCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesisriskestimatetypecodingi == riskevidencesynthesisriskestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtTypCdgUsrSltd("]");}


		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisriskestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtTypCdgSys("[");}
		if(riskevidencesynthesisriskestimatetypecoding.hasSystem()) {

			r.addRskEvdnceSynthsRskEstmtTypCdgSys(String.valueOf(riskevidencesynthesisriskestimatetypecoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsRskEstmtTypCdgSys("NULL");
		}

		if(riskevidencesynthesisriskestimatetypecodingi == riskevidencesynthesisriskestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtTypCdgSys("]");}


		 };
		/******************** RskEvdnceSynths_RskEstmt_Dscrptn ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasDescription()) {

			r.addRskEvdnceSynthsRskEstmtDscrptn(String.valueOf(riskevidencesynthesisriskestimate.getDescription()));
		} else {
			r.addRskEvdnceSynthsRskEstmtDscrptn("NULL");
		}


		/******************** RskEvdnceSynths_RskEstmt_NmrtrCnt ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasNumeratorCount()) {

			r.addRskEvdnceSynthsRskEstmtNmrtrCnt(String.valueOf(riskevidencesynthesisriskestimate.getNumeratorCount()));
		} else {
			r.addRskEvdnceSynthsRskEstmtNmrtrCnt("NULL");
		}


		/******************** riskevidencesynthesisriskestimateunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimateunitofmeasure = riskevidencesynthesisriskestimate.getUnitOfMeasure();

		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Txt ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasure.hasText()) {

			r.addRskEvdnceSynthsRskEstmtUntOfMsrTxt(String.valueOf(riskevidencesynthesisriskestimateunitofmeasure.getText()));
		} else {
			r.addRskEvdnceSynthsRskEstmtUntOfMsrTxt("NULL");
		}


		/******************** riskevidencesynthesisriskestimateunitofmeasurecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesisriskestimateunitofmeasurecodinglist = riskevidencesynthesisriskestimateunitofmeasure.getCoding();
		for(int riskevidencesynthesisriskestimateunitofmeasurecodingi = 0; riskevidencesynthesisriskestimateunitofmeasurecodingi<riskevidencesynthesisriskestimateunitofmeasurecodinglist.size();riskevidencesynthesisriskestimateunitofmeasurecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesisriskestimateunitofmeasurecoding = riskevidencesynthesisriskestimateunitofmeasurecodinglist.get(riskevidencesynthesisriskestimateunitofmeasurecodingi);

		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == 0) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply("[");}
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasDisplay()) {

			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply("NULL");
		}

		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == riskevidencesynthesisriskestimateunitofmeasurecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply("]");}


		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == 0) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn("[");}
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasVersion()) {

			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn("NULL");
		}

		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == riskevidencesynthesisriskestimateunitofmeasurecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn("]");}


		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == 0) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgCd("[");}
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasCode()) {

			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgCd(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getCode()));
		} else {
			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgCd("NULL");
		}

		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == riskevidencesynthesisriskestimateunitofmeasurecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgCd("]");}


		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == 0) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd("[");}
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasUserSelected()) {

			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == riskevidencesynthesisriskestimateunitofmeasurecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd("]");}


		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == 0) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgSys("[");}
		if(riskevidencesynthesisriskestimateunitofmeasurecoding.hasSystem()) {

			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgSys(String.valueOf(riskevidencesynthesisriskestimateunitofmeasurecoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgSys("NULL");
		}

		if(riskevidencesynthesisriskestimateunitofmeasurecodingi == riskevidencesynthesisriskestimateunitofmeasurecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtUntOfMsrCdgSys("]");}


		 };
		/******************** RskEvdnceSynths_RskEstmt_DnmntrCnt ********************************************************************************/
		if(riskevidencesynthesisriskestimate.hasDenominatorCount()) {

			r.addRskEvdnceSynthsRskEstmtDnmntrCnt(String.valueOf(riskevidencesynthesisriskestimate.getDenominatorCount()));
		} else {
			r.addRskEvdnceSynthsRskEstmtDnmntrCnt("NULL");
		}


		/******************** riskevidencesynthesisriskestimateprecisionestimate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent> riskevidencesynthesisriskestimateprecisionestimatelist = riskevidencesynthesisriskestimate.getPrecisionEstimate();
		for(int riskevidencesynthesisriskestimateprecisionestimatei = 0; riskevidencesynthesisriskestimateprecisionestimatei<riskevidencesynthesisriskestimateprecisionestimatelist.size();riskevidencesynthesisriskestimateprecisionestimatei++ ) {
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisRiskEstimatePrecisionEstimateComponent  riskevidencesynthesisriskestimateprecisionestimate = riskevidencesynthesisriskestimateprecisionestimatelist.get(riskevidencesynthesisriskestimateprecisionestimatei);

		/******************** riskevidencesynthesisriskestimateprecisionestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisriskestimateprecisionestimatetype = riskevidencesynthesisriskestimateprecisionestimate.getType();

		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatei == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt("[");}
		if(riskevidencesynthesisriskestimateprecisionestimatetype.hasText()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetype.getText()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatei == riskevidencesynthesisriskestimateprecisionestimatelist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt("]");}


		/******************** riskevidencesynthesisriskestimateprecisionestimatetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesisriskestimateprecisionestimatetypecodinglist = riskevidencesynthesisriskestimateprecisionestimatetype.getCoding();
		for(int riskevidencesynthesisriskestimateprecisionestimatetypecodingi = 0; riskevidencesynthesisriskestimateprecisionestimatetypecodingi<riskevidencesynthesisriskestimateprecisionestimatetypecodinglist.size();riskevidencesynthesisriskestimateprecisionestimatetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesisriskestimateprecisionestimatetypecoding = riskevidencesynthesisriskestimateprecisionestimatetypecodinglist.get(riskevidencesynthesisriskestimateprecisionestimatetypecodingi);

		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply("[[");}
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasDisplay()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == riskevidencesynthesisriskestimateprecisionestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply("]]");}


		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn("[[");}
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasVersion()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == riskevidencesynthesisriskestimateprecisionestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn("]]");}


		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd("[[");}
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasCode()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getCode()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == riskevidencesynthesisriskestimateprecisionestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd("]]");}


		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd("[[");}
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasUserSelected()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == riskevidencesynthesisriskestimateprecisionestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd("]]");}


		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys("[[");}
		if(riskevidencesynthesisriskestimateprecisionestimatetypecoding.hasSystem()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys(String.valueOf(riskevidencesynthesisriskestimateprecisionestimatetypecoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatetypecodingi == riskevidencesynthesisriskestimateprecisionestimatetypecodinglist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys("]]");}


		 };
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatei == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtLevel("[");}
		if(riskevidencesynthesisriskestimateprecisionestimate.hasLevel()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtLevel(String.valueOf(riskevidencesynthesisriskestimateprecisionestimate.getLevel()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtLevel("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatei == riskevidencesynthesisriskestimateprecisionestimatelist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtLevel("]");}


		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_From ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatei == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtFrom("[");}
		if(riskevidencesynthesisriskestimateprecisionestimate.hasFrom()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtFrom(String.valueOf(riskevidencesynthesisriskestimateprecisionestimate.getFrom()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtFrom("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatei == riskevidencesynthesisriskestimateprecisionestimatelist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtFrom("]");}


		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_To ********************************************************************************/
		if(riskevidencesynthesisriskestimateprecisionestimatei == 0) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTo("[");}
		if(riskevidencesynthesisriskestimateprecisionestimate.hasTo()) {

			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTo(String.valueOf(riskevidencesynthesisriskestimateprecisionestimate.getTo()));
		} else {
			r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTo("NULL");
		}

		if(riskevidencesynthesisriskestimateprecisionestimatei == riskevidencesynthesisriskestimateprecisionestimatelist.size()-1) {r.addRskEvdnceSynthsRskEstmtPrecisionEstmtTo("]");}


		 };
		/******************** RskEvdnceSynths_Exposure ********************************************************************************/
		if(riskevidencesynthesis.hasExposure()) {

			if(riskevidencesynthesis.getExposure().getReference() != null) {
			r.addRskEvdnceSynthsExposure(riskevidencesynthesis.getExposure().getReference());
			}
		} else {
			r.addRskEvdnceSynthsExposure("NULL");
		}


		/******************** riskevidencesynthesisstudytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisstudytype = riskevidencesynthesis.getStudyType();

		/******************** RskEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(riskevidencesynthesisstudytype.hasText()) {

			r.addRskEvdnceSynthsStdyTypTxt(String.valueOf(riskevidencesynthesisstudytype.getText()));
		} else {
			r.addRskEvdnceSynthsStdyTypTxt("NULL");
		}


		/******************** riskevidencesynthesisstudytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesisstudytypecodinglist = riskevidencesynthesisstudytype.getCoding();
		for(int riskevidencesynthesisstudytypecodingi = 0; riskevidencesynthesisstudytypecodingi<riskevidencesynthesisstudytypecodinglist.size();riskevidencesynthesisstudytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesisstudytypecoding = riskevidencesynthesisstudytypecodinglist.get(riskevidencesynthesisstudytypecodingi);

		/******************** RskEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisstudytypecodingi == 0) {r.addRskEvdnceSynthsStdyTypCdgDsply("[");}
		if(riskevidencesynthesisstudytypecoding.hasDisplay()) {

			r.addRskEvdnceSynthsStdyTypCdgDsply(String.valueOf(riskevidencesynthesisstudytypecoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsStdyTypCdgDsply("NULL");
		}

		if(riskevidencesynthesisstudytypecodingi == riskevidencesynthesisstudytypecodinglist.size()-1) {r.addRskEvdnceSynthsStdyTypCdgDsply("]");}


		/******************** RskEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisstudytypecodingi == 0) {r.addRskEvdnceSynthsStdyTypCdgVrsn("[");}
		if(riskevidencesynthesisstudytypecoding.hasVersion()) {

			r.addRskEvdnceSynthsStdyTypCdgVrsn(String.valueOf(riskevidencesynthesisstudytypecoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsStdyTypCdgVrsn("NULL");
		}

		if(riskevidencesynthesisstudytypecodingi == riskevidencesynthesisstudytypecodinglist.size()-1) {r.addRskEvdnceSynthsStdyTypCdgVrsn("]");}


		/******************** RskEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisstudytypecodingi == 0) {r.addRskEvdnceSynthsStdyTypCdgCd("[");}
		if(riskevidencesynthesisstudytypecoding.hasCode()) {

			r.addRskEvdnceSynthsStdyTypCdgCd(String.valueOf(riskevidencesynthesisstudytypecoding.getCode()));
		} else {
			r.addRskEvdnceSynthsStdyTypCdgCd("NULL");
		}

		if(riskevidencesynthesisstudytypecodingi == riskevidencesynthesisstudytypecodinglist.size()-1) {r.addRskEvdnceSynthsStdyTypCdgCd("]");}


		/******************** RskEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisstudytypecodingi == 0) {r.addRskEvdnceSynthsStdyTypCdgUsrSltd("[");}
		if(riskevidencesynthesisstudytypecoding.hasUserSelected()) {

			r.addRskEvdnceSynthsStdyTypCdgUsrSltd(String.valueOf(riskevidencesynthesisstudytypecoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsStdyTypCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesisstudytypecodingi == riskevidencesynthesisstudytypecodinglist.size()-1) {r.addRskEvdnceSynthsStdyTypCdgUsrSltd("]");}


		/******************** RskEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisstudytypecodingi == 0) {r.addRskEvdnceSynthsStdyTypCdgSys("[");}
		if(riskevidencesynthesisstudytypecoding.hasSystem()) {

			r.addRskEvdnceSynthsStdyTypCdgSys(String.valueOf(riskevidencesynthesisstudytypecoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsStdyTypCdgSys("NULL");
		}

		if(riskevidencesynthesisstudytypecodingi == riskevidencesynthesisstudytypecodinglist.size()-1) {r.addRskEvdnceSynthsStdyTypCdgSys("]");}


		 };
		/******************** riskevidencesynthesiscertainty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent> riskevidencesynthesiscertaintylist = riskevidencesynthesis.getCertainty();
		for(int riskevidencesynthesiscertaintyi = 0; riskevidencesynthesiscertaintyi<riskevidencesynthesiscertaintylist.size();riskevidencesynthesiscertaintyi++ ) {
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyComponent  riskevidencesynthesiscertainty = riskevidencesynthesiscertaintylist.get(riskevidencesynthesiscertaintyi);

		/******************** riskevidencesynthesiscertaintynote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> riskevidencesynthesiscertaintynotelist = riskevidencesynthesiscertainty.getNote();
		for(int riskevidencesynthesiscertaintynotei = 0; riskevidencesynthesiscertaintynotei<riskevidencesynthesiscertaintynotelist.size();riskevidencesynthesiscertaintynotei++ ) {
		org.hl7.fhir.r4.model.Annotation  riskevidencesynthesiscertaintynote = riskevidencesynthesiscertaintynotelist.get(riskevidencesynthesiscertaintynotei);

		/******************** RskEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(riskevidencesynthesiscertaintynotei == 0) {r.addRskEvdnceSynthsCrtntyNtTime("[[");}
		if(riskevidencesynthesiscertaintynote.hasTime()) {

			r.addRskEvdnceSynthsCrtntyNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiscertaintynote.getTime())+"\"");
		} else {
			r.addRskEvdnceSynthsCrtntyNtTime("NULL");
		}

		if(riskevidencesynthesiscertaintynotei == riskevidencesynthesiscertaintynotelist.size()-1) {r.addRskEvdnceSynthsCrtntyNtTime("]]");}


		/******************** RskEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(riskevidencesynthesiscertaintynotei == 0) {r.addRskEvdnceSynthsCrtntyNtAthrRfrnc("[[");}
		if(riskevidencesynthesiscertaintynote.hasAuthorReference()) {

			if(riskevidencesynthesiscertaintynote.getAuthorReference().getReference() != null) {
			r.addRskEvdnceSynthsCrtntyNtAthrRfrnc(riskevidencesynthesiscertaintynote.getAuthorReference().getReference());
			}
		} else {
			r.addRskEvdnceSynthsCrtntyNtAthrRfrnc("NULL");
		}

		if(riskevidencesynthesiscertaintynotei == riskevidencesynthesiscertaintynotelist.size()-1) {r.addRskEvdnceSynthsCrtntyNtAthrRfrnc("]]");}


		/******************** RskEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintynotei == 0) {r.addRskEvdnceSynthsCrtntyNtTxt("[[");}
		if(riskevidencesynthesiscertaintynote.hasText()) {

			r.addRskEvdnceSynthsCrtntyNtTxt(String.valueOf(riskevidencesynthesiscertaintynote.getText()));
		} else {
			r.addRskEvdnceSynthsCrtntyNtTxt("NULL");
		}

		if(riskevidencesynthesiscertaintynotei == riskevidencesynthesiscertaintynotelist.size()-1) {r.addRskEvdnceSynthsCrtntyNtTxt("]]");}


		/******************** RskEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(riskevidencesynthesiscertaintynotei == 0) {r.addRskEvdnceSynthsCrtntyNtAthrStrgTyp("[[");}
		if(riskevidencesynthesiscertaintynote.hasAuthorStringType()) {

			r.addRskEvdnceSynthsCrtntyNtAthrStrgTyp("\""+riskevidencesynthesiscertaintynote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			r.addRskEvdnceSynthsCrtntyNtAthrStrgTyp("NULL");
		}

		if(riskevidencesynthesiscertaintynotei == riskevidencesynthesiscertaintynotelist.size()-1) {r.addRskEvdnceSynthsCrtntyNtAthrStrgTyp("]]");}


		 };
		/******************** riskevidencesynthesiscertaintyrating ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> riskevidencesynthesiscertaintyratinglist = riskevidencesynthesiscertainty.getRating();
		for(int riskevidencesynthesiscertaintyratingi = 0; riskevidencesynthesiscertaintyratingi<riskevidencesynthesiscertaintyratinglist.size();riskevidencesynthesiscertaintyratingi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  riskevidencesynthesiscertaintyrating = riskevidencesynthesiscertaintyratinglist.get(riskevidencesynthesiscertaintyratingi);

		/******************** RskEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingi == 0) {r.addRskEvdnceSynthsCrtntyRatingTxt("[[");}
		if(riskevidencesynthesiscertaintyrating.hasText()) {

			r.addRskEvdnceSynthsCrtntyRatingTxt(String.valueOf(riskevidencesynthesiscertaintyrating.getText()));
		} else {
			r.addRskEvdnceSynthsCrtntyRatingTxt("NULL");
		}

		if(riskevidencesynthesiscertaintyratingi == riskevidencesynthesiscertaintyratinglist.size()-1) {r.addRskEvdnceSynthsCrtntyRatingTxt("]]");}


		/******************** riskevidencesynthesiscertaintyratingcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesiscertaintyratingcodinglist = riskevidencesynthesiscertaintyrating.getCoding();
		for(int riskevidencesynthesiscertaintyratingcodingi = 0; riskevidencesynthesiscertaintyratingcodingi<riskevidencesynthesiscertaintyratingcodinglist.size();riskevidencesynthesiscertaintyratingcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesiscertaintyratingcoding = riskevidencesynthesiscertaintyratingcodinglist.get(riskevidencesynthesiscertaintyratingcodingi);

		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyRatingCdgDsply("[[[");}
		if(riskevidencesynthesiscertaintyratingcoding.hasDisplay()) {

			r.addRskEvdnceSynthsCrtntyRatingCdgDsply(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsCrtntyRatingCdgDsply("NULL");
		}

		if(riskevidencesynthesiscertaintyratingcodingi == riskevidencesynthesiscertaintyratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyRatingCdgDsply("]]]");}


		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyRatingCdgVrsn("[[[");}
		if(riskevidencesynthesiscertaintyratingcoding.hasVersion()) {

			r.addRskEvdnceSynthsCrtntyRatingCdgVrsn(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsCrtntyRatingCdgVrsn("NULL");
		}

		if(riskevidencesynthesiscertaintyratingcodingi == riskevidencesynthesiscertaintyratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyRatingCdgVrsn("]]]");}


		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyRatingCdgCd("[[[");}
		if(riskevidencesynthesiscertaintyratingcoding.hasCode()) {

			r.addRskEvdnceSynthsCrtntyRatingCdgCd(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getCode()));
		} else {
			r.addRskEvdnceSynthsCrtntyRatingCdgCd("NULL");
		}

		if(riskevidencesynthesiscertaintyratingcodingi == riskevidencesynthesiscertaintyratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyRatingCdgCd("]]]");}


		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyRatingCdgUsrSltd("[[[");}
		if(riskevidencesynthesiscertaintyratingcoding.hasUserSelected()) {

			r.addRskEvdnceSynthsCrtntyRatingCdgUsrSltd(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsCrtntyRatingCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesiscertaintyratingcodingi == riskevidencesynthesiscertaintyratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyRatingCdgUsrSltd("]]]");}


		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesiscertaintyratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyRatingCdgSys("[[[");}
		if(riskevidencesynthesiscertaintyratingcoding.hasSystem()) {

			r.addRskEvdnceSynthsCrtntyRatingCdgSys(String.valueOf(riskevidencesynthesiscertaintyratingcoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsCrtntyRatingCdgSys("NULL");
		}

		if(riskevidencesynthesiscertaintyratingcodingi == riskevidencesynthesiscertaintyratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyRatingCdgSys("]]]");}


		 };
		 };
		/******************** riskevidencesynthesiscertaintycertaintysubcomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent> riskevidencesynthesiscertaintycertaintysubcomponentlist = riskevidencesynthesiscertainty.getCertaintySubcomponent();
		for(int riskevidencesynthesiscertaintycertaintysubcomponenti = 0; riskevidencesynthesiscertaintycertaintysubcomponenti<riskevidencesynthesiscertaintycertaintysubcomponentlist.size();riskevidencesynthesiscertaintycertaintysubcomponenti++ ) {
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis.RiskEvidenceSynthesisCertaintyCertaintySubcomponentComponent  riskevidencesynthesiscertaintycertaintysubcomponent = riskevidencesynthesiscertaintycertaintysubcomponentlist.get(riskevidencesynthesiscertaintycertaintysubcomponenti);

		/******************** riskevidencesynthesiscertaintycertaintysubcomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesiscertaintycertaintysubcomponenttype = riskevidencesynthesiscertaintycertaintysubcomponent.getType();

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenti == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt("[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponenttype.hasText()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttype.getText()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponenti == riskevidencesynthesiscertaintycertaintysubcomponentlist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt("]]");}


		/******************** riskevidencesynthesiscertaintycertaintysubcomponenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist = riskevidencesynthesiscertaintycertaintysubcomponenttype.getCoding();
		for(int riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi = 0; riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi<riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size();riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesiscertaintycertaintysubcomponenttypecoding = riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.get(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi);

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasDisplay()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply("]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasVersion()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn("]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasCode()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getCode()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd("]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasUserSelected()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd("]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasSystem()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponenttypecoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponenttypecodingi == riskevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys("]]]");}


		 };
		/******************** riskevidencesynthesiscertaintycertaintysubcomponentnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> riskevidencesynthesiscertaintycertaintysubcomponentnotelist = riskevidencesynthesiscertaintycertaintysubcomponent.getNote();
		for(int riskevidencesynthesiscertaintycertaintysubcomponentnotei = 0; riskevidencesynthesiscertaintycertaintysubcomponentnotei<riskevidencesynthesiscertaintycertaintysubcomponentnotelist.size();riskevidencesynthesiscertaintycertaintysubcomponentnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  riskevidencesynthesiscertaintycertaintysubcomponentnote = riskevidencesynthesiscertaintycertaintysubcomponentnotelist.get(riskevidencesynthesiscertaintycertaintysubcomponentnotei);

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasTime()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiscertaintycertaintysubcomponentnote.getTime())+"\"");
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == riskevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime("]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorReference()) {

			if(riskevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorReference().getReference() != null) {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc(riskevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorReference().getReference());
			}
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == riskevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc("]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasText()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentnote.getText()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == riskevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt("]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorStringType()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("\""+riskevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentnotei == riskevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("]]]");}


		 };
		/******************** riskevidencesynthesiscertaintycertaintysubcomponentrating ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> riskevidencesynthesiscertaintycertaintysubcomponentratinglist = riskevidencesynthesiscertaintycertaintysubcomponent.getRating();
		for(int riskevidencesynthesiscertaintycertaintysubcomponentratingi = 0; riskevidencesynthesiscertaintycertaintysubcomponentratingi<riskevidencesynthesiscertaintycertaintysubcomponentratinglist.size();riskevidencesynthesiscertaintycertaintysubcomponentratingi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  riskevidencesynthesiscertaintycertaintysubcomponentrating = riskevidencesynthesiscertaintycertaintysubcomponentratinglist.get(riskevidencesynthesiscertaintycertaintysubcomponentratingi);

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt("[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentrating.hasText()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentrating.getText()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentratingi == riskevidencesynthesiscertaintycertaintysubcomponentratinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt("]]]");}


		/******************** riskevidencesynthesiscertaintycertaintysubcomponentratingcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist = riskevidencesynthesiscertaintycertaintysubcomponentrating.getCoding();
		for(int riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi = 0; riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi<riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size();riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesiscertaintycertaintysubcomponentratingcoding = riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.get(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi);

		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply("[[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasDisplay()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply("]]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn("[[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasVersion()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn("]]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd("[[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasCode()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getCode()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd("]]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd("[[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasUserSelected()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd("]]]]");}


		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys("[[[[");}
		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasSystem()) {

			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys(String.valueOf(riskevidencesynthesiscertaintycertaintysubcomponentratingcoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys("NULL");
		}

		if(riskevidencesynthesiscertaintycertaintysubcomponentratingcodingi == riskevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {r.addRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys("]]]]");}


		 };
		 };
		 };
		 };
		/******************** RskEvdnceSynths_Ttl ********************************************************************************/
		if(riskevidencesynthesis.hasTitle()) {

			r.addRskEvdnceSynthsTtl(String.valueOf(riskevidencesynthesis.getTitle()));
		} else {
			r.addRskEvdnceSynthsTtl("NULL");
		}


		/******************** riskevidencesynthesisrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> riskevidencesynthesisrelatedartifactlist = riskevidencesynthesis.getRelatedArtifact();
		for(int riskevidencesynthesisrelatedartifacti = 0; riskevidencesynthesisrelatedartifacti<riskevidencesynthesisrelatedartifactlist.size();riskevidencesynthesisrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  riskevidencesynthesisrelatedartifact = riskevidencesynthesisrelatedartifactlist.get(riskevidencesynthesisrelatedartifacti);

		/******************** RskEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctRsrc("[");}
		if(riskevidencesynthesisrelatedartifact.hasResource()) {

			r.addRskEvdnceSynthsRltedArtfctRsrc(String.valueOf(riskevidencesynthesisrelatedartifact.getResource()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctRsrc("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctRsrc("]");}


		/******************** riskevidencesynthesisrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType riskevidencesynthesisrelatedartifacttype = riskevidencesynthesisrelatedartifact.getType();
		if(riskevidencesynthesisrelatedartifacttype!=null) {
		if(riskevidencesynthesisrelatedartifacti == 0) {

		r.addRskEvdnceSynthsRltedArtfctTyp("[");		}
			r.addRskEvdnceSynthsRltedArtfctTyp(riskevidencesynthesisrelatedartifacttype.toCode());
		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {

		r.addRskEvdnceSynthsRltedArtfctTyp("]");		}

		} else {
			r.addRskEvdnceSynthsRltedArtfctTyp("NULL");
		}

		/******************** RskEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctUrl("[");}
		if(riskevidencesynthesisrelatedartifact.hasUrl()) {

			r.addRskEvdnceSynthsRltedArtfctUrl(String.valueOf(riskevidencesynthesisrelatedartifact.getUrl()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctUrl("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctUrl("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctCitation("[");}
		if(riskevidencesynthesisrelatedartifact.hasCitation()) {

			r.addRskEvdnceSynthsRltedArtfctCitation(String.valueOf(riskevidencesynthesisrelatedartifact.getCitation()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctCitation("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctCitation("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctLbl("[");}
		if(riskevidencesynthesisrelatedartifact.hasLabel()) {

			r.addRskEvdnceSynthsRltedArtfctLbl(String.valueOf(riskevidencesynthesisrelatedartifact.getLabel()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctLbl("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctLbl("]");}


		/******************** riskevidencesynthesisrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment riskevidencesynthesisrelatedartifactdocument = riskevidencesynthesisrelatedartifact.getDocument();

		/******************** RskEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocSz("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasSize()) {

			r.addRskEvdnceSynthsRltedArtfctDocSz(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getSize()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocSz("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocSz("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocLnguage("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasLanguage()) {

			r.addRskEvdnceSynthsRltedArtfctDocLnguage(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getLanguage()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocLnguage("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocLnguage("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocCntntTyp("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasContentType()) {

			r.addRskEvdnceSynthsRltedArtfctDocCntntTyp(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getContentType()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocCntntTyp("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocCntntTyp("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocHash("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasHash()) {

			r.addRskEvdnceSynthsRltedArtfctDocHash(new String(riskevidencesynthesisrelatedartifactdocument.getHash()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocHash("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocHash("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocData("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasData()) {

			r.addRskEvdnceSynthsRltedArtfctDocData(new String(riskevidencesynthesisrelatedartifactdocument.getData()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocData("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocData("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocCreation("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasCreation()) {

			r.addRskEvdnceSynthsRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisrelatedartifactdocument.getCreation())+"\"");
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocCreation("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocCreation("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocTtl("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasTitle()) {

			r.addRskEvdnceSynthsRltedArtfctDocTtl(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getTitle()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocTtl("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocTtl("]");}


		/******************** RskEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(riskevidencesynthesisrelatedartifacti == 0) {r.addRskEvdnceSynthsRltedArtfctDocUrl("[");}
		if(riskevidencesynthesisrelatedartifactdocument.hasUrl()) {

			r.addRskEvdnceSynthsRltedArtfctDocUrl(String.valueOf(riskevidencesynthesisrelatedartifactdocument.getUrl()));
		} else {
			r.addRskEvdnceSynthsRltedArtfctDocUrl("NULL");
		}

		if(riskevidencesynthesisrelatedartifacti == riskevidencesynthesisrelatedartifactlist.size()-1) {r.addRskEvdnceSynthsRltedArtfctDocUrl("]");}


		 };
		/******************** RskEvdnceSynths_Url ********************************************************************************/
		if(riskevidencesynthesis.hasUrl()) {

			r.addRskEvdnceSynthsUrl(String.valueOf(riskevidencesynthesis.getUrl()));
		} else {
			r.addRskEvdnceSynthsUrl("NULL");
		}


		/******************** riskevidencesynthesistopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> riskevidencesynthesistopiclist = riskevidencesynthesis.getTopic();
		for(int riskevidencesynthesistopici = 0; riskevidencesynthesistopici<riskevidencesynthesistopiclist.size();riskevidencesynthesistopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  riskevidencesynthesistopic = riskevidencesynthesistopiclist.get(riskevidencesynthesistopici);

		/******************** RskEvdnceSynths_Topic_Txt ********************************************************************************/
		if(riskevidencesynthesistopici == 0) {r.addRskEvdnceSynthsTopicTxt("[");}
		if(riskevidencesynthesistopic.hasText()) {

			r.addRskEvdnceSynthsTopicTxt(String.valueOf(riskevidencesynthesistopic.getText()));
		} else {
			r.addRskEvdnceSynthsTopicTxt("NULL");
		}

		if(riskevidencesynthesistopici == riskevidencesynthesistopiclist.size()-1) {r.addRskEvdnceSynthsTopicTxt("]");}


		/******************** riskevidencesynthesistopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesistopiccodinglist = riskevidencesynthesistopic.getCoding();
		for(int riskevidencesynthesistopiccodingi = 0; riskevidencesynthesistopiccodingi<riskevidencesynthesistopiccodinglist.size();riskevidencesynthesistopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesistopiccoding = riskevidencesynthesistopiccodinglist.get(riskevidencesynthesistopiccodingi);

		/******************** RskEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesistopiccodingi == 0) {r.addRskEvdnceSynthsTopicCdgDsply("[[");}
		if(riskevidencesynthesistopiccoding.hasDisplay()) {

			r.addRskEvdnceSynthsTopicCdgDsply(String.valueOf(riskevidencesynthesistopiccoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsTopicCdgDsply("NULL");
		}

		if(riskevidencesynthesistopiccodingi == riskevidencesynthesistopiccodinglist.size()-1) {r.addRskEvdnceSynthsTopicCdgDsply("]]");}


		/******************** RskEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesistopiccodingi == 0) {r.addRskEvdnceSynthsTopicCdgVrsn("[[");}
		if(riskevidencesynthesistopiccoding.hasVersion()) {

			r.addRskEvdnceSynthsTopicCdgVrsn(String.valueOf(riskevidencesynthesistopiccoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsTopicCdgVrsn("NULL");
		}

		if(riskevidencesynthesistopiccodingi == riskevidencesynthesistopiccodinglist.size()-1) {r.addRskEvdnceSynthsTopicCdgVrsn("]]");}


		/******************** RskEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesistopiccodingi == 0) {r.addRskEvdnceSynthsTopicCdgCd("[[");}
		if(riskevidencesynthesistopiccoding.hasCode()) {

			r.addRskEvdnceSynthsTopicCdgCd(String.valueOf(riskevidencesynthesistopiccoding.getCode()));
		} else {
			r.addRskEvdnceSynthsTopicCdgCd("NULL");
		}

		if(riskevidencesynthesistopiccodingi == riskevidencesynthesistopiccodinglist.size()-1) {r.addRskEvdnceSynthsTopicCdgCd("]]");}


		/******************** RskEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesistopiccodingi == 0) {r.addRskEvdnceSynthsTopicCdgUsrSltd("[[");}
		if(riskevidencesynthesistopiccoding.hasUserSelected()) {

			r.addRskEvdnceSynthsTopicCdgUsrSltd(String.valueOf(riskevidencesynthesistopiccoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsTopicCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesistopiccodingi == riskevidencesynthesistopiccodinglist.size()-1) {r.addRskEvdnceSynthsTopicCdgUsrSltd("]]");}


		/******************** RskEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesistopiccodingi == 0) {r.addRskEvdnceSynthsTopicCdgSys("[[");}
		if(riskevidencesynthesistopiccoding.hasSystem()) {

			r.addRskEvdnceSynthsTopicCdgSys(String.valueOf(riskevidencesynthesistopiccoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsTopicCdgSys("NULL");
		}

		if(riskevidencesynthesistopiccodingi == riskevidencesynthesistopiccodinglist.size()-1) {r.addRskEvdnceSynthsTopicCdgSys("]]");}


		 };
		 };
		/******************** RskEvdnceSynths_Popln ********************************************************************************/
		if(riskevidencesynthesis.hasPopulation()) {

			if(riskevidencesynthesis.getPopulation().getReference() != null) {
			r.addRskEvdnceSynthsPopln(riskevidencesynthesis.getPopulation().getReference());
			}
		} else {
			r.addRskEvdnceSynthsPopln("NULL");
		}


		/******************** riskevidencesynthesisjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> riskevidencesynthesisjurisdictionlist = riskevidencesynthesis.getJurisdiction();
		for(int riskevidencesynthesisjurisdictioni = 0; riskevidencesynthesisjurisdictioni<riskevidencesynthesisjurisdictionlist.size();riskevidencesynthesisjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  riskevidencesynthesisjurisdiction = riskevidencesynthesisjurisdictionlist.get(riskevidencesynthesisjurisdictioni);

		/******************** RskEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(riskevidencesynthesisjurisdictioni == 0) {r.addRskEvdnceSynthsJrsdctnTxt("[");}
		if(riskevidencesynthesisjurisdiction.hasText()) {

			r.addRskEvdnceSynthsJrsdctnTxt(String.valueOf(riskevidencesynthesisjurisdiction.getText()));
		} else {
			r.addRskEvdnceSynthsJrsdctnTxt("NULL");
		}

		if(riskevidencesynthesisjurisdictioni == riskevidencesynthesisjurisdictionlist.size()-1) {r.addRskEvdnceSynthsJrsdctnTxt("]");}


		/******************** riskevidencesynthesisjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesisjurisdictioncodinglist = riskevidencesynthesisjurisdiction.getCoding();
		for(int riskevidencesynthesisjurisdictioncodingi = 0; riskevidencesynthesisjurisdictioncodingi<riskevidencesynthesisjurisdictioncodinglist.size();riskevidencesynthesisjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesisjurisdictioncoding = riskevidencesynthesisjurisdictioncodinglist.get(riskevidencesynthesisjurisdictioncodingi);

		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncodingi == 0) {r.addRskEvdnceSynthsJrsdctnCdgDsply("[[");}
		if(riskevidencesynthesisjurisdictioncoding.hasDisplay()) {

			r.addRskEvdnceSynthsJrsdctnCdgDsply(String.valueOf(riskevidencesynthesisjurisdictioncoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsJrsdctnCdgDsply("NULL");
		}

		if(riskevidencesynthesisjurisdictioncodingi == riskevidencesynthesisjurisdictioncodinglist.size()-1) {r.addRskEvdnceSynthsJrsdctnCdgDsply("]]");}


		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncodingi == 0) {r.addRskEvdnceSynthsJrsdctnCdgVrsn("[[");}
		if(riskevidencesynthesisjurisdictioncoding.hasVersion()) {

			r.addRskEvdnceSynthsJrsdctnCdgVrsn(String.valueOf(riskevidencesynthesisjurisdictioncoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsJrsdctnCdgVrsn("NULL");
		}

		if(riskevidencesynthesisjurisdictioncodingi == riskevidencesynthesisjurisdictioncodinglist.size()-1) {r.addRskEvdnceSynthsJrsdctnCdgVrsn("]]");}


		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncodingi == 0) {r.addRskEvdnceSynthsJrsdctnCdgCd("[[");}
		if(riskevidencesynthesisjurisdictioncoding.hasCode()) {

			r.addRskEvdnceSynthsJrsdctnCdgCd(String.valueOf(riskevidencesynthesisjurisdictioncoding.getCode()));
		} else {
			r.addRskEvdnceSynthsJrsdctnCdgCd("NULL");
		}

		if(riskevidencesynthesisjurisdictioncodingi == riskevidencesynthesisjurisdictioncodinglist.size()-1) {r.addRskEvdnceSynthsJrsdctnCdgCd("]]");}


		/******************** RskEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncodingi == 0) {r.addRskEvdnceSynthsJrsdctnCdgUsrSltd("[[");}
		if(riskevidencesynthesisjurisdictioncoding.hasUserSelected()) {

			r.addRskEvdnceSynthsJrsdctnCdgUsrSltd(String.valueOf(riskevidencesynthesisjurisdictioncoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsJrsdctnCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesisjurisdictioncodingi == riskevidencesynthesisjurisdictioncodinglist.size()-1) {r.addRskEvdnceSynthsJrsdctnCdgUsrSltd("]]");}


		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisjurisdictioncodingi == 0) {r.addRskEvdnceSynthsJrsdctnCdgSys("[[");}
		if(riskevidencesynthesisjurisdictioncoding.hasSystem()) {

			r.addRskEvdnceSynthsJrsdctnCdgSys(String.valueOf(riskevidencesynthesisjurisdictioncoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsJrsdctnCdgSys("NULL");
		}

		if(riskevidencesynthesisjurisdictioncodingi == riskevidencesynthesisjurisdictioncodinglist.size()-1) {r.addRskEvdnceSynthsJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** riskevidencesynthesisusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> riskevidencesynthesisusecontextlist = riskevidencesynthesis.getUseContext();
		for(int riskevidencesynthesisusecontexti = 0; riskevidencesynthesisusecontexti<riskevidencesynthesisusecontextlist.size();riskevidencesynthesisusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  riskevidencesynthesisusecontext = riskevidencesynthesisusecontextlist.get(riskevidencesynthesisusecontexti);

		/******************** riskevidencesynthesisusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskevidencesynthesisusecontextcode = riskevidencesynthesisusecontext.getCode();

		/******************** RskEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtCdDsply("[");}
		if(riskevidencesynthesisusecontextcode.hasDisplay()) {

			r.addRskEvdnceSynthsUseCntxtCdDsply(String.valueOf(riskevidencesynthesisusecontextcode.getDisplay()));
		} else {
			r.addRskEvdnceSynthsUseCntxtCdDsply("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtCdDsply("]");}


		/******************** RskEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtCdVrsn("[");}
		if(riskevidencesynthesisusecontextcode.hasVersion()) {

			r.addRskEvdnceSynthsUseCntxtCdVrsn(String.valueOf(riskevidencesynthesisusecontextcode.getVersion()));
		} else {
			r.addRskEvdnceSynthsUseCntxtCdVrsn("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtCdVrsn("]");}


		/******************** RskEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtCdUsrSltd("[");}
		if(riskevidencesynthesisusecontextcode.hasUserSelected()) {

			r.addRskEvdnceSynthsUseCntxtCdUsrSltd(String.valueOf(riskevidencesynthesisusecontextcode.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsUseCntxtCdUsrSltd("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtCdUsrSltd("]");}


		/******************** RskEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtCdSys("[");}
		if(riskevidencesynthesisusecontextcode.hasSystem()) {

			r.addRskEvdnceSynthsUseCntxtCdSys(String.valueOf(riskevidencesynthesisusecontextcode.getSystem()));
		} else {
			r.addRskEvdnceSynthsUseCntxtCdSys("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtCdSys("]");}


		/******************** RskEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRfrnc("[");}
		if(riskevidencesynthesisusecontext.hasValueReference()) {

			if(riskevidencesynthesisusecontext.getValueReference().getReference() != null) {
			r.addRskEvdnceSynthsUseCntxtVlRfrnc(riskevidencesynthesisusecontext.getValueReference().getReference());
			}
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRfrnc("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRfrnc("]");}


		/******************** riskevidencesynthesisusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskevidencesynthesisusecontextvaluecodeableconcept = riskevidencesynthesisusecontext.getValueCodeableConcept();

		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptTxt("[");}
		if(riskevidencesynthesisusecontextvaluecodeableconcept.hasText()) {

			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptTxt(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconcept.getText()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptTxt("]");}


		/******************** riskevidencesynthesisusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskevidencesynthesisusecontextvaluecodeableconceptcodinglist = riskevidencesynthesisusecontextvaluecodeableconcept.getCoding();
		for(int riskevidencesynthesisusecontextvaluecodeableconceptcodingi = 0; riskevidencesynthesisusecontextvaluecodeableconceptcodingi<riskevidencesynthesisusecontextvaluecodeableconceptcodinglist.size();riskevidencesynthesisusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskevidencesynthesisusecontextvaluecodeableconceptcoding = riskevidencesynthesisusecontextvaluecodeableconceptcodinglist.get(riskevidencesynthesisusecontextvaluecodeableconceptcodingi);

		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasDisplay()) {

			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == riskevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasVersion()) {

			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == riskevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd("[[");}
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasCode()) {

			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == riskevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == riskevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys("[[");}
		if(riskevidencesynthesisusecontextvaluecodeableconceptcoding.hasSystem()) {

			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys(String.valueOf(riskevidencesynthesisusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(riskevidencesynthesisusecontextvaluecodeableconceptcodingi == riskevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** riskevidencesynthesisusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskevidencesynthesisusecontextvaluerange = riskevidencesynthesisusecontext.getValueRange();

		/******************** riskevidencesynthesisusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluerangelow = riskevidencesynthesisusecontextvaluerange.getLow();

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngLwVl("[");}
		if(riskevidencesynthesisusecontextvaluerangelow.hasValue()) {

			r.addRskEvdnceSynthsUseCntxtVlRngLwVl(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getValue()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngLwVl("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngLwVl("]");}


		/******************** riskevidencesynthesisusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskevidencesynthesisusecontextvaluerangelowcomparator = riskevidencesynthesisusecontextvaluerangelow.getComparator();
		if(riskevidencesynthesisusecontextvaluerangelowcomparator!=null) {
		if(riskevidencesynthesisusecontexti == 0) {

		r.addRskEvdnceSynthsUseCntxtVlRngLwCmprtr("[");		}
			r.addRskEvdnceSynthsUseCntxtVlRngLwCmprtr(riskevidencesynthesisusecontextvaluerangelowcomparator.toCode());
		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {

		r.addRskEvdnceSynthsUseCntxtVlRngLwCmprtr("]");		}

		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngLwCd("[");}
		if(riskevidencesynthesisusecontextvaluerangelow.hasCode()) {

			r.addRskEvdnceSynthsUseCntxtVlRngLwCd(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getCode()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngLwCd("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngLwCd("]");}


		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngLwUnt("[");}
		if(riskevidencesynthesisusecontextvaluerangelow.hasUnit()) {

			r.addRskEvdnceSynthsUseCntxtVlRngLwUnt(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getUnit()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngLwUnt("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngLwUnt("]");}


		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngLwSys("[");}
		if(riskevidencesynthesisusecontextvaluerangelow.hasSystem()) {

			r.addRskEvdnceSynthsUseCntxtVlRngLwSys(String.valueOf(riskevidencesynthesisusecontextvaluerangelow.getSystem()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngLwSys("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngLwSys("]");}


		/******************** riskevidencesynthesisusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluerangehigh = riskevidencesynthesisusecontextvaluerange.getHigh();

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngHiVl("[");}
		if(riskevidencesynthesisusecontextvaluerangehigh.hasValue()) {

			r.addRskEvdnceSynthsUseCntxtVlRngHiVl(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getValue()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngHiVl("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngHiVl("]");}


		/******************** riskevidencesynthesisusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskevidencesynthesisusecontextvaluerangehighcomparator = riskevidencesynthesisusecontextvaluerangehigh.getComparator();
		if(riskevidencesynthesisusecontextvaluerangehighcomparator!=null) {
		if(riskevidencesynthesisusecontexti == 0) {

		r.addRskEvdnceSynthsUseCntxtVlRngHiCmprtr("[");		}
			r.addRskEvdnceSynthsUseCntxtVlRngHiCmprtr(riskevidencesynthesisusecontextvaluerangehighcomparator.toCode());
		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {

		r.addRskEvdnceSynthsUseCntxtVlRngHiCmprtr("]");		}

		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngHiCd("[");}
		if(riskevidencesynthesisusecontextvaluerangehigh.hasCode()) {

			r.addRskEvdnceSynthsUseCntxtVlRngHiCd(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getCode()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngHiCd("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngHiCd("]");}


		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngHiUnt("[");}
		if(riskevidencesynthesisusecontextvaluerangehigh.hasUnit()) {

			r.addRskEvdnceSynthsUseCntxtVlRngHiUnt(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getUnit()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngHiUnt("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngHiUnt("]");}


		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlRngHiSys("[");}
		if(riskevidencesynthesisusecontextvaluerangehigh.hasSystem()) {

			r.addRskEvdnceSynthsUseCntxtVlRngHiSys(String.valueOf(riskevidencesynthesisusecontextvaluerangehigh.getSystem()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlRngHiSys("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlRngHiSys("]");}


		/******************** riskevidencesynthesisusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskevidencesynthesisusecontextvaluequantity = riskevidencesynthesisusecontext.getValueQuantity();

		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlQntyVl("[");}
		if(riskevidencesynthesisusecontextvaluequantity.hasValue()) {

			r.addRskEvdnceSynthsUseCntxtVlQntyVl(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getValue()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlQntyVl("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlQntyVl("]");}


		/******************** riskevidencesynthesisusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskevidencesynthesisusecontextvaluequantitycomparator = riskevidencesynthesisusecontextvaluequantity.getComparator();
		if(riskevidencesynthesisusecontextvaluequantitycomparator!=null) {
		if(riskevidencesynthesisusecontexti == 0) {

		r.addRskEvdnceSynthsUseCntxtVlQntyCmprtr("[");		}
			r.addRskEvdnceSynthsUseCntxtVlQntyCmprtr(riskevidencesynthesisusecontextvaluequantitycomparator.toCode());
		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {

		r.addRskEvdnceSynthsUseCntxtVlQntyCmprtr("]");		}

		} else {
			r.addRskEvdnceSynthsUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlQntyCd("[");}
		if(riskevidencesynthesisusecontextvaluequantity.hasCode()) {

			r.addRskEvdnceSynthsUseCntxtVlQntyCd(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getCode()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlQntyCd("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlQntyCd("]");}


		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlQntyUnt("[");}
		if(riskevidencesynthesisusecontextvaluequantity.hasUnit()) {

			r.addRskEvdnceSynthsUseCntxtVlQntyUnt(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getUnit()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlQntyUnt("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlQntyUnt("]");}


		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(riskevidencesynthesisusecontexti == 0) {r.addRskEvdnceSynthsUseCntxtVlQntySys("[");}
		if(riskevidencesynthesisusecontextvaluequantity.hasSystem()) {

			r.addRskEvdnceSynthsUseCntxtVlQntySys(String.valueOf(riskevidencesynthesisusecontextvaluequantity.getSystem()));
		} else {
			r.addRskEvdnceSynthsUseCntxtVlQntySys("NULL");
		}

		if(riskevidencesynthesisusecontexti == riskevidencesynthesisusecontextlist.size()-1) {r.addRskEvdnceSynthsUseCntxtVlQntySys("]");}


		 };
		/******************** RskEvdnceSynths_Pblshr ********************************************************************************/
		if(riskevidencesynthesis.hasPublisher()) {

			r.addRskEvdnceSynthsPblshr(String.valueOf(riskevidencesynthesis.getPublisher()));
		} else {
			r.addRskEvdnceSynthsPblshr("NULL");
		}


		/******************** riskevidencesynthesiseffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesiseffectiveperiod = riskevidencesynthesis.getEffectivePeriod();

		/******************** RskEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(riskevidencesynthesiseffectiveperiod.hasStart()) {

			r.addRskEvdnceSynthsEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiseffectiveperiod.getStart())+"\"");
		} else {
			r.addRskEvdnceSynthsEfctivePrdStrt("NULL");
		}


		/******************** RskEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(riskevidencesynthesiseffectiveperiod.hasEnd()) {

			r.addRskEvdnceSynthsEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesiseffectiveperiod.getEnd())+"\"");
		} else {
			r.addRskEvdnceSynthsEfctivePrdEnd("NULL");
		}


		/******************** riskevidencesynthesisauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> riskevidencesynthesisauthorlist = riskevidencesynthesis.getAuthor();
		for(int riskevidencesynthesisauthori = 0; riskevidencesynthesisauthori<riskevidencesynthesisauthorlist.size();riskevidencesynthesisauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  riskevidencesynthesisauthor = riskevidencesynthesisauthorlist.get(riskevidencesynthesisauthori);

		/******************** RskEvdnceSynths_Athr_Nm ********************************************************************************/
		if(riskevidencesynthesisauthori == 0) {r.addRskEvdnceSynthsAthrNm("[");}
		if(riskevidencesynthesisauthor.hasName()) {

			r.addRskEvdnceSynthsAthrNm(String.valueOf(riskevidencesynthesisauthor.getName()));
		} else {
			r.addRskEvdnceSynthsAthrNm("NULL");
		}

		if(riskevidencesynthesisauthori == riskevidencesynthesisauthorlist.size()-1) {r.addRskEvdnceSynthsAthrNm("]");}


		/******************** riskevidencesynthesisauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> riskevidencesynthesisauthortelecomlist = riskevidencesynthesisauthor.getTelecom();
		for(int riskevidencesynthesisauthortelecomi = 0; riskevidencesynthesisauthortelecomi<riskevidencesynthesisauthortelecomlist.size();riskevidencesynthesisauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  riskevidencesynthesisauthortelecom = riskevidencesynthesisauthortelecomlist.get(riskevidencesynthesisauthortelecomi);

		/******************** RskEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(riskevidencesynthesisauthortelecomi == 0) {r.addRskEvdnceSynthsAthrTlcmVl("[[");}
		if(riskevidencesynthesisauthortelecom.hasValue()) {

			r.addRskEvdnceSynthsAthrTlcmVl(String.valueOf(riskevidencesynthesisauthortelecom.getValue()));
		} else {
			r.addRskEvdnceSynthsAthrTlcmVl("NULL");
		}

		if(riskevidencesynthesisauthortelecomi == riskevidencesynthesisauthortelecomlist.size()-1) {r.addRskEvdnceSynthsAthrTlcmVl("]]");}


		/******************** riskevidencesynthesisauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskevidencesynthesisauthortelecomperiod = riskevidencesynthesisauthortelecom.getPeriod();

		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(riskevidencesynthesisauthortelecomi == 0) {r.addRskEvdnceSynthsAthrTlcmPrdStrt("[[");}
		if(riskevidencesynthesisauthortelecomperiod.hasStart()) {

			r.addRskEvdnceSynthsAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisauthortelecomperiod.getStart())+"\"");
		} else {
			r.addRskEvdnceSynthsAthrTlcmPrdStrt("NULL");
		}

		if(riskevidencesynthesisauthortelecomi == riskevidencesynthesisauthortelecomlist.size()-1) {r.addRskEvdnceSynthsAthrTlcmPrdStrt("]]");}


		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(riskevidencesynthesisauthortelecomi == 0) {r.addRskEvdnceSynthsAthrTlcmPrdEnd("[[");}
		if(riskevidencesynthesisauthortelecomperiod.hasEnd()) {

			r.addRskEvdnceSynthsAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskevidencesynthesisauthortelecomperiod.getEnd())+"\"");
		} else {
			r.addRskEvdnceSynthsAthrTlcmPrdEnd("NULL");
		}

		if(riskevidencesynthesisauthortelecomi == riskevidencesynthesisauthortelecomlist.size()-1) {r.addRskEvdnceSynthsAthrTlcmPrdEnd("]]");}


		/******************** riskevidencesynthesisauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse riskevidencesynthesisauthortelecomuse = riskevidencesynthesisauthortelecom.getUse();
		if(riskevidencesynthesisauthortelecomuse!=null) {
		if(riskevidencesynthesisauthortelecomi == 0) {

		r.addRskEvdnceSynthsAthrTlcmUse("[[");		}
			r.addRskEvdnceSynthsAthrTlcmUse(riskevidencesynthesisauthortelecomuse.toCode());
		if(riskevidencesynthesisauthortelecomi == riskevidencesynthesisauthortelecomlist.size()-1) {

		r.addRskEvdnceSynthsAthrTlcmUse("]]");		}

		} else {
			r.addRskEvdnceSynthsAthrTlcmUse("NULL");
		}

		/******************** riskevidencesynthesisauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem riskevidencesynthesisauthortelecomsystem = riskevidencesynthesisauthortelecom.getSystem();
		if(riskevidencesynthesisauthortelecomsystem!=null) {
		if(riskevidencesynthesisauthortelecomi == 0) {

		r.addRskEvdnceSynthsAthrTlcmSys("[[");		}
			r.addRskEvdnceSynthsAthrTlcmSys(riskevidencesynthesisauthortelecomsystem.toCode());
		if(riskevidencesynthesisauthortelecomi == riskevidencesynthesisauthortelecomlist.size()-1) {

		r.addRskEvdnceSynthsAthrTlcmSys("]]");		}

		} else {
			r.addRskEvdnceSynthsAthrTlcmSys("NULL");
		}

		/******************** RskEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(riskevidencesynthesisauthortelecomi == 0) {r.addRskEvdnceSynthsAthrTlcmRnk("[[");}
		if(riskevidencesynthesisauthortelecom.hasRank()) {

			r.addRskEvdnceSynthsAthrTlcmRnk(String.valueOf(riskevidencesynthesisauthortelecom.getRank()));
		} else {
			r.addRskEvdnceSynthsAthrTlcmRnk("NULL");
		}

		if(riskevidencesynthesisauthortelecomi == riskevidencesynthesisauthortelecomlist.size()-1) {r.addRskEvdnceSynthsAthrTlcmRnk("]]");}


		 };
		 };
		return r;
	}
}
