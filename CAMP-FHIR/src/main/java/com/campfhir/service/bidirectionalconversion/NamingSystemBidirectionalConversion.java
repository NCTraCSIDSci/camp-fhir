package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NamingSystem;
public class NamingSystemBidirectionalConversion 
{
	public NamingSystem NamingSystems(org.hl7.fhir.r4.model.NamingSystem namingsystem) throws ParseException
	{
		 main.java.com.campfhir.model.NamingSystem n = new  main.java.com.campfhir.model.NamingSystem();

		/******************** id ********************************************************************************/
		n.setId(namingsystem.getIdElement().getIdPart());

		/******************** NmingSys_Nm ********************************************************************************/
		if(namingsystem.hasName()) {

			n.addNmingSysNm(String.valueOf(namingsystem.getName()));
		} else {
			n.addNmingSysNm("NULL");
		}


		/******************** namingsystemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemtype = namingsystem.getType();

		/******************** NmingSys_Typ_Txt ********************************************************************************/
		if(namingsystemtype.hasText()) {

			n.addNmingSysTypTxt(String.valueOf(namingsystemtype.getText()));
		} else {
			n.addNmingSysTypTxt("NULL");
		}


		/******************** namingsystemtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> namingsystemtypecodinglist = namingsystemtype.getCoding();
		for(int namingsystemtypecodingi = 0; namingsystemtypecodingi<namingsystemtypecodinglist.size();namingsystemtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  namingsystemtypecoding = namingsystemtypecodinglist.get(namingsystemtypecodingi);

		/******************** NmingSys_Typ_Cdg_Dsply ********************************************************************************/
		if(namingsystemtypecodingi == 0) {n.addNmingSysTypCdgDsply("[");}
		if(namingsystemtypecoding.hasDisplay()) {

			n.addNmingSysTypCdgDsply(String.valueOf(namingsystemtypecoding.getDisplay()));
		} else {
			n.addNmingSysTypCdgDsply("NULL");
		}

		if(namingsystemtypecodingi == namingsystemtypecodinglist.size()-1) {n.addNmingSysTypCdgDsply("]");}


		/******************** NmingSys_Typ_Cdg_Vrsn ********************************************************************************/
		if(namingsystemtypecodingi == 0) {n.addNmingSysTypCdgVrsn("[");}
		if(namingsystemtypecoding.hasVersion()) {

			n.addNmingSysTypCdgVrsn(String.valueOf(namingsystemtypecoding.getVersion()));
		} else {
			n.addNmingSysTypCdgVrsn("NULL");
		}

		if(namingsystemtypecodingi == namingsystemtypecodinglist.size()-1) {n.addNmingSysTypCdgVrsn("]");}


		/******************** NmingSys_Typ_Cdg_Cd ********************************************************************************/
		if(namingsystemtypecodingi == 0) {n.addNmingSysTypCdgCd("[");}
		if(namingsystemtypecoding.hasCode()) {

			n.addNmingSysTypCdgCd(String.valueOf(namingsystemtypecoding.getCode()));
		} else {
			n.addNmingSysTypCdgCd("NULL");
		}

		if(namingsystemtypecodingi == namingsystemtypecodinglist.size()-1) {n.addNmingSysTypCdgCd("]");}


		/******************** NmingSys_Typ_Cdg_UsrSltd ********************************************************************************/
		if(namingsystemtypecodingi == 0) {n.addNmingSysTypCdgUsrSltd("[");}
		if(namingsystemtypecoding.hasUserSelected()) {

			n.addNmingSysTypCdgUsrSltd(String.valueOf(namingsystemtypecoding.getUserSelected()));
		} else {
			n.addNmingSysTypCdgUsrSltd("NULL");
		}

		if(namingsystemtypecodingi == namingsystemtypecodinglist.size()-1) {n.addNmingSysTypCdgUsrSltd("]");}


		/******************** NmingSys_Typ_Cdg_Sys ********************************************************************************/
		if(namingsystemtypecodingi == 0) {n.addNmingSysTypCdgSys("[");}
		if(namingsystemtypecoding.hasSystem()) {

			n.addNmingSysTypCdgSys(String.valueOf(namingsystemtypecoding.getSystem()));
		} else {
			n.addNmingSysTypCdgSys("NULL");
		}

		if(namingsystemtypecodingi == namingsystemtypecodinglist.size()-1) {n.addNmingSysTypCdgSys("]");}


		 };
		/******************** NmingSys_Dt ********************************************************************************/
		if(namingsystem.hasDate()) {

			n.addNmingSysDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(namingsystem.getDate())+"\"");
		} else {
			n.addNmingSysDt("NULL");
		}


		/******************** namingsystemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus namingsystemstatus = namingsystem.getStatus();
		if(namingsystemstatus!=null) {
			n.addNmingSysSts(namingsystemstatus.toCode());
		} else {
			n.addNmingSysSts("NULL");
		}

		/******************** NmingSys_Dscrptn ********************************************************************************/
		if(namingsystem.hasDescription()) {

			n.addNmingSysDscrptn(String.valueOf(namingsystem.getDescription()));
		} else {
			n.addNmingSysDscrptn("NULL");
		}


		/******************** namingsystemcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> namingsystemcontactlist = namingsystem.getContact();
		for(int namingsystemcontacti = 0; namingsystemcontacti<namingsystemcontactlist.size();namingsystemcontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  namingsystemcontact = namingsystemcontactlist.get(namingsystemcontacti);

		/******************** NmingSys_Cntct_Nm ********************************************************************************/
		if(namingsystemcontacti == 0) {n.addNmingSysCntctNm("[");}
		if(namingsystemcontact.hasName()) {

			n.addNmingSysCntctNm(String.valueOf(namingsystemcontact.getName()));
		} else {
			n.addNmingSysCntctNm("NULL");
		}

		if(namingsystemcontacti == namingsystemcontactlist.size()-1) {n.addNmingSysCntctNm("]");}


		/******************** namingsystemcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> namingsystemcontacttelecomlist = namingsystemcontact.getTelecom();
		for(int namingsystemcontacttelecomi = 0; namingsystemcontacttelecomi<namingsystemcontacttelecomlist.size();namingsystemcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  namingsystemcontacttelecom = namingsystemcontacttelecomlist.get(namingsystemcontacttelecomi);

		/******************** NmingSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(namingsystemcontacttelecomi == 0) {n.addNmingSysCntctTlcmVl("[[");}
		if(namingsystemcontacttelecom.hasValue()) {

			n.addNmingSysCntctTlcmVl(String.valueOf(namingsystemcontacttelecom.getValue()));
		} else {
			n.addNmingSysCntctTlcmVl("NULL");
		}

		if(namingsystemcontacttelecomi == namingsystemcontacttelecomlist.size()-1) {n.addNmingSysCntctTlcmVl("]]");}


		/******************** namingsystemcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period namingsystemcontacttelecomperiod = namingsystemcontacttelecom.getPeriod();

		/******************** NmingSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(namingsystemcontacttelecomi == 0) {n.addNmingSysCntctTlcmPrdStrt("[[");}
		if(namingsystemcontacttelecomperiod.hasStart()) {

			n.addNmingSysCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(namingsystemcontacttelecomperiod.getStart())+"\"");
		} else {
			n.addNmingSysCntctTlcmPrdStrt("NULL");
		}

		if(namingsystemcontacttelecomi == namingsystemcontacttelecomlist.size()-1) {n.addNmingSysCntctTlcmPrdStrt("]]");}


		/******************** NmingSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(namingsystemcontacttelecomi == 0) {n.addNmingSysCntctTlcmPrdEnd("[[");}
		if(namingsystemcontacttelecomperiod.hasEnd()) {

			n.addNmingSysCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(namingsystemcontacttelecomperiod.getEnd())+"\"");
		} else {
			n.addNmingSysCntctTlcmPrdEnd("NULL");
		}

		if(namingsystemcontacttelecomi == namingsystemcontacttelecomlist.size()-1) {n.addNmingSysCntctTlcmPrdEnd("]]");}


		/******************** namingsystemcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse namingsystemcontacttelecomuse = namingsystemcontacttelecom.getUse();
		if(namingsystemcontacttelecomuse!=null) {
		if(namingsystemcontacttelecomi == 0) {

		n.addNmingSysCntctTlcmUse("[[");		}
			n.addNmingSysCntctTlcmUse(namingsystemcontacttelecomuse.toCode());
		if(namingsystemcontacttelecomi == namingsystemcontacttelecomlist.size()-1) {

		n.addNmingSysCntctTlcmUse("]]");		}

		} else {
			n.addNmingSysCntctTlcmUse("NULL");
		}

		/******************** namingsystemcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem namingsystemcontacttelecomsystem = namingsystemcontacttelecom.getSystem();
		if(namingsystemcontacttelecomsystem!=null) {
		if(namingsystemcontacttelecomi == 0) {

		n.addNmingSysCntctTlcmSys("[[");		}
			n.addNmingSysCntctTlcmSys(namingsystemcontacttelecomsystem.toCode());
		if(namingsystemcontacttelecomi == namingsystemcontacttelecomlist.size()-1) {

		n.addNmingSysCntctTlcmSys("]]");		}

		} else {
			n.addNmingSysCntctTlcmSys("NULL");
		}

		/******************** NmingSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(namingsystemcontacttelecomi == 0) {n.addNmingSysCntctTlcmRnk("[[");}
		if(namingsystemcontacttelecom.hasRank()) {

			n.addNmingSysCntctTlcmRnk(String.valueOf(namingsystemcontacttelecom.getRank()));
		} else {
			n.addNmingSysCntctTlcmRnk("NULL");
		}

		if(namingsystemcontacttelecomi == namingsystemcontacttelecomlist.size()-1) {n.addNmingSysCntctTlcmRnk("]]");}


		 };
		 };
		/******************** NmingSys_Usg ********************************************************************************/
		if(namingsystem.hasUsage()) {

			n.addNmingSysUsg(String.valueOf(namingsystem.getUsage()));
		} else {
			n.addNmingSysUsg("NULL");
		}


		/******************** namingsystemkind ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemType namingsystemkind = namingsystem.getKind();
		if(namingsystemkind!=null) {
			n.addNmingSysKind(namingsystemkind.toCode());
		} else {
			n.addNmingSysKind("NULL");
		}

		/******************** NmingSys_Responsible ********************************************************************************/
		if(namingsystem.hasResponsible()) {

			n.addNmingSysResponsible(String.valueOf(namingsystem.getResponsible()));
		} else {
			n.addNmingSysResponsible("NULL");
		}


		/******************** namingsystemjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> namingsystemjurisdictionlist = namingsystem.getJurisdiction();
		for(int namingsystemjurisdictioni = 0; namingsystemjurisdictioni<namingsystemjurisdictionlist.size();namingsystemjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  namingsystemjurisdiction = namingsystemjurisdictionlist.get(namingsystemjurisdictioni);

		/******************** NmingSys_Jrsdctn_Txt ********************************************************************************/
		if(namingsystemjurisdictioni == 0) {n.addNmingSysJrsdctnTxt("[");}
		if(namingsystemjurisdiction.hasText()) {

			n.addNmingSysJrsdctnTxt(String.valueOf(namingsystemjurisdiction.getText()));
		} else {
			n.addNmingSysJrsdctnTxt("NULL");
		}

		if(namingsystemjurisdictioni == namingsystemjurisdictionlist.size()-1) {n.addNmingSysJrsdctnTxt("]");}


		/******************** namingsystemjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> namingsystemjurisdictioncodinglist = namingsystemjurisdiction.getCoding();
		for(int namingsystemjurisdictioncodingi = 0; namingsystemjurisdictioncodingi<namingsystemjurisdictioncodinglist.size();namingsystemjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  namingsystemjurisdictioncoding = namingsystemjurisdictioncodinglist.get(namingsystemjurisdictioncodingi);

		/******************** NmingSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(namingsystemjurisdictioncodingi == 0) {n.addNmingSysJrsdctnCdgDsply("[[");}
		if(namingsystemjurisdictioncoding.hasDisplay()) {

			n.addNmingSysJrsdctnCdgDsply(String.valueOf(namingsystemjurisdictioncoding.getDisplay()));
		} else {
			n.addNmingSysJrsdctnCdgDsply("NULL");
		}

		if(namingsystemjurisdictioncodingi == namingsystemjurisdictioncodinglist.size()-1) {n.addNmingSysJrsdctnCdgDsply("]]");}


		/******************** NmingSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(namingsystemjurisdictioncodingi == 0) {n.addNmingSysJrsdctnCdgVrsn("[[");}
		if(namingsystemjurisdictioncoding.hasVersion()) {

			n.addNmingSysJrsdctnCdgVrsn(String.valueOf(namingsystemjurisdictioncoding.getVersion()));
		} else {
			n.addNmingSysJrsdctnCdgVrsn("NULL");
		}

		if(namingsystemjurisdictioncodingi == namingsystemjurisdictioncodinglist.size()-1) {n.addNmingSysJrsdctnCdgVrsn("]]");}


		/******************** NmingSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(namingsystemjurisdictioncodingi == 0) {n.addNmingSysJrsdctnCdgCd("[[");}
		if(namingsystemjurisdictioncoding.hasCode()) {

			n.addNmingSysJrsdctnCdgCd(String.valueOf(namingsystemjurisdictioncoding.getCode()));
		} else {
			n.addNmingSysJrsdctnCdgCd("NULL");
		}

		if(namingsystemjurisdictioncodingi == namingsystemjurisdictioncodinglist.size()-1) {n.addNmingSysJrsdctnCdgCd("]]");}


		/******************** NmingSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(namingsystemjurisdictioncodingi == 0) {n.addNmingSysJrsdctnCdgUsrSltd("[[");}
		if(namingsystemjurisdictioncoding.hasUserSelected()) {

			n.addNmingSysJrsdctnCdgUsrSltd(String.valueOf(namingsystemjurisdictioncoding.getUserSelected()));
		} else {
			n.addNmingSysJrsdctnCdgUsrSltd("NULL");
		}

		if(namingsystemjurisdictioncodingi == namingsystemjurisdictioncodinglist.size()-1) {n.addNmingSysJrsdctnCdgUsrSltd("]]");}


		/******************** NmingSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(namingsystemjurisdictioncodingi == 0) {n.addNmingSysJrsdctnCdgSys("[[");}
		if(namingsystemjurisdictioncoding.hasSystem()) {

			n.addNmingSysJrsdctnCdgSys(String.valueOf(namingsystemjurisdictioncoding.getSystem()));
		} else {
			n.addNmingSysJrsdctnCdgSys("NULL");
		}

		if(namingsystemjurisdictioncodingi == namingsystemjurisdictioncodinglist.size()-1) {n.addNmingSysJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** namingsystemusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> namingsystemusecontextlist = namingsystem.getUseContext();
		for(int namingsystemusecontexti = 0; namingsystemusecontexti<namingsystemusecontextlist.size();namingsystemusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  namingsystemusecontext = namingsystemusecontextlist.get(namingsystemusecontexti);

		/******************** namingsystemusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemusecontextcode = namingsystemusecontext.getCode();

		/******************** NmingSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtCdDsply("[");}
		if(namingsystemusecontextcode.hasDisplay()) {

			n.addNmingSysUseCntxtCdDsply(String.valueOf(namingsystemusecontextcode.getDisplay()));
		} else {
			n.addNmingSysUseCntxtCdDsply("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtCdDsply("]");}


		/******************** NmingSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtCdVrsn("[");}
		if(namingsystemusecontextcode.hasVersion()) {

			n.addNmingSysUseCntxtCdVrsn(String.valueOf(namingsystemusecontextcode.getVersion()));
		} else {
			n.addNmingSysUseCntxtCdVrsn("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtCdVrsn("]");}


		/******************** NmingSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtCdUsrSltd("[");}
		if(namingsystemusecontextcode.hasUserSelected()) {

			n.addNmingSysUseCntxtCdUsrSltd(String.valueOf(namingsystemusecontextcode.getUserSelected()));
		} else {
			n.addNmingSysUseCntxtCdUsrSltd("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtCdUsrSltd("]");}


		/******************** NmingSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtCdSys("[");}
		if(namingsystemusecontextcode.hasSystem()) {

			n.addNmingSysUseCntxtCdSys(String.valueOf(namingsystemusecontextcode.getSystem()));
		} else {
			n.addNmingSysUseCntxtCdSys("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtCdSys("]");}


		/******************** NmingSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRfrnc("[");}
		if(namingsystemusecontext.hasValueReference()) {

			if(namingsystemusecontext.getValueReference().getReference() != null) {
			n.addNmingSysUseCntxtVlRfrnc(namingsystemusecontext.getValueReference().getReference());
			}
		} else {
			n.addNmingSysUseCntxtVlRfrnc("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRfrnc("]");}


		/******************** namingsystemusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemusecontextvaluecodeableconcept = namingsystemusecontext.getValueCodeableConcept();

		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlCdbleCncptTxt("[");}
		if(namingsystemusecontextvaluecodeableconcept.hasText()) {

			n.addNmingSysUseCntxtVlCdbleCncptTxt(String.valueOf(namingsystemusecontextvaluecodeableconcept.getText()));
		} else {
			n.addNmingSysUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlCdbleCncptTxt("]");}


		/******************** namingsystemusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> namingsystemusecontextvaluecodeableconceptcodinglist = namingsystemusecontextvaluecodeableconcept.getCoding();
		for(int namingsystemusecontextvaluecodeableconceptcodingi = 0; namingsystemusecontextvaluecodeableconceptcodingi<namingsystemusecontextvaluecodeableconceptcodinglist.size();namingsystemusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  namingsystemusecontextvaluecodeableconceptcoding = namingsystemusecontextvaluecodeableconceptcodinglist.get(namingsystemusecontextvaluecodeableconceptcodingi);

		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcodingi == 0) {n.addNmingSysUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(namingsystemusecontextvaluecodeableconceptcoding.hasDisplay()) {

			n.addNmingSysUseCntxtVlCdbleCncptCdgDsply(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			n.addNmingSysUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(namingsystemusecontextvaluecodeableconceptcodingi == namingsystemusecontextvaluecodeableconceptcodinglist.size()-1) {n.addNmingSysUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcodingi == 0) {n.addNmingSysUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(namingsystemusecontextvaluecodeableconceptcoding.hasVersion()) {

			n.addNmingSysUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			n.addNmingSysUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(namingsystemusecontextvaluecodeableconceptcodingi == namingsystemusecontextvaluecodeableconceptcodinglist.size()-1) {n.addNmingSysUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcodingi == 0) {n.addNmingSysUseCntxtVlCdbleCncptCdgCd("[[");}
		if(namingsystemusecontextvaluecodeableconceptcoding.hasCode()) {

			n.addNmingSysUseCntxtVlCdbleCncptCdgCd(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			n.addNmingSysUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(namingsystemusecontextvaluecodeableconceptcodingi == namingsystemusecontextvaluecodeableconceptcodinglist.size()-1) {n.addNmingSysUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcodingi == 0) {n.addNmingSysUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(namingsystemusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			n.addNmingSysUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			n.addNmingSysUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(namingsystemusecontextvaluecodeableconceptcodingi == namingsystemusecontextvaluecodeableconceptcodinglist.size()-1) {n.addNmingSysUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcodingi == 0) {n.addNmingSysUseCntxtVlCdbleCncptCdgSys("[[");}
		if(namingsystemusecontextvaluecodeableconceptcoding.hasSystem()) {

			n.addNmingSysUseCntxtVlCdbleCncptCdgSys(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			n.addNmingSysUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(namingsystemusecontextvaluecodeableconceptcodingi == namingsystemusecontextvaluecodeableconceptcodinglist.size()-1) {n.addNmingSysUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** namingsystemusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range namingsystemusecontextvaluerange = namingsystemusecontext.getValueRange();

		/******************** namingsystemusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluerangelow = namingsystemusecontextvaluerange.getLow();

		/******************** NmingSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngLwVl("[");}
		if(namingsystemusecontextvaluerangelow.hasValue()) {

			n.addNmingSysUseCntxtVlRngLwVl(String.valueOf(namingsystemusecontextvaluerangelow.getValue()));
		} else {
			n.addNmingSysUseCntxtVlRngLwVl("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngLwVl("]");}


		/******************** namingsystemusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator namingsystemusecontextvaluerangelowcomparator = namingsystemusecontextvaluerangelow.getComparator();
		if(namingsystemusecontextvaluerangelowcomparator!=null) {
		if(namingsystemusecontexti == 0) {

		n.addNmingSysUseCntxtVlRngLwCmprtr("[");		}
			n.addNmingSysUseCntxtVlRngLwCmprtr(namingsystemusecontextvaluerangelowcomparator.toCode());
		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {

		n.addNmingSysUseCntxtVlRngLwCmprtr("]");		}

		} else {
			n.addNmingSysUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** NmingSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngLwCd("[");}
		if(namingsystemusecontextvaluerangelow.hasCode()) {

			n.addNmingSysUseCntxtVlRngLwCd(String.valueOf(namingsystemusecontextvaluerangelow.getCode()));
		} else {
			n.addNmingSysUseCntxtVlRngLwCd("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngLwCd("]");}


		/******************** NmingSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngLwUnt("[");}
		if(namingsystemusecontextvaluerangelow.hasUnit()) {

			n.addNmingSysUseCntxtVlRngLwUnt(String.valueOf(namingsystemusecontextvaluerangelow.getUnit()));
		} else {
			n.addNmingSysUseCntxtVlRngLwUnt("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngLwUnt("]");}


		/******************** NmingSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngLwSys("[");}
		if(namingsystemusecontextvaluerangelow.hasSystem()) {

			n.addNmingSysUseCntxtVlRngLwSys(String.valueOf(namingsystemusecontextvaluerangelow.getSystem()));
		} else {
			n.addNmingSysUseCntxtVlRngLwSys("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngLwSys("]");}


		/******************** namingsystemusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluerangehigh = namingsystemusecontextvaluerange.getHigh();

		/******************** NmingSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngHiVl("[");}
		if(namingsystemusecontextvaluerangehigh.hasValue()) {

			n.addNmingSysUseCntxtVlRngHiVl(String.valueOf(namingsystemusecontextvaluerangehigh.getValue()));
		} else {
			n.addNmingSysUseCntxtVlRngHiVl("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngHiVl("]");}


		/******************** namingsystemusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator namingsystemusecontextvaluerangehighcomparator = namingsystemusecontextvaluerangehigh.getComparator();
		if(namingsystemusecontextvaluerangehighcomparator!=null) {
		if(namingsystemusecontexti == 0) {

		n.addNmingSysUseCntxtVlRngHiCmprtr("[");		}
			n.addNmingSysUseCntxtVlRngHiCmprtr(namingsystemusecontextvaluerangehighcomparator.toCode());
		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {

		n.addNmingSysUseCntxtVlRngHiCmprtr("]");		}

		} else {
			n.addNmingSysUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** NmingSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngHiCd("[");}
		if(namingsystemusecontextvaluerangehigh.hasCode()) {

			n.addNmingSysUseCntxtVlRngHiCd(String.valueOf(namingsystemusecontextvaluerangehigh.getCode()));
		} else {
			n.addNmingSysUseCntxtVlRngHiCd("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngHiCd("]");}


		/******************** NmingSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngHiUnt("[");}
		if(namingsystemusecontextvaluerangehigh.hasUnit()) {

			n.addNmingSysUseCntxtVlRngHiUnt(String.valueOf(namingsystemusecontextvaluerangehigh.getUnit()));
		} else {
			n.addNmingSysUseCntxtVlRngHiUnt("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngHiUnt("]");}


		/******************** NmingSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlRngHiSys("[");}
		if(namingsystemusecontextvaluerangehigh.hasSystem()) {

			n.addNmingSysUseCntxtVlRngHiSys(String.valueOf(namingsystemusecontextvaluerangehigh.getSystem()));
		} else {
			n.addNmingSysUseCntxtVlRngHiSys("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlRngHiSys("]");}


		/******************** namingsystemusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluequantity = namingsystemusecontext.getValueQuantity();

		/******************** NmingSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlQntyVl("[");}
		if(namingsystemusecontextvaluequantity.hasValue()) {

			n.addNmingSysUseCntxtVlQntyVl(String.valueOf(namingsystemusecontextvaluequantity.getValue()));
		} else {
			n.addNmingSysUseCntxtVlQntyVl("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlQntyVl("]");}


		/******************** namingsystemusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator namingsystemusecontextvaluequantitycomparator = namingsystemusecontextvaluequantity.getComparator();
		if(namingsystemusecontextvaluequantitycomparator!=null) {
		if(namingsystemusecontexti == 0) {

		n.addNmingSysUseCntxtVlQntyCmprtr("[");		}
			n.addNmingSysUseCntxtVlQntyCmprtr(namingsystemusecontextvaluequantitycomparator.toCode());
		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {

		n.addNmingSysUseCntxtVlQntyCmprtr("]");		}

		} else {
			n.addNmingSysUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** NmingSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlQntyCd("[");}
		if(namingsystemusecontextvaluequantity.hasCode()) {

			n.addNmingSysUseCntxtVlQntyCd(String.valueOf(namingsystemusecontextvaluequantity.getCode()));
		} else {
			n.addNmingSysUseCntxtVlQntyCd("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlQntyCd("]");}


		/******************** NmingSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlQntyUnt("[");}
		if(namingsystemusecontextvaluequantity.hasUnit()) {

			n.addNmingSysUseCntxtVlQntyUnt(String.valueOf(namingsystemusecontextvaluequantity.getUnit()));
		} else {
			n.addNmingSysUseCntxtVlQntyUnt("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlQntyUnt("]");}


		/******************** NmingSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(namingsystemusecontexti == 0) {n.addNmingSysUseCntxtVlQntySys("[");}
		if(namingsystemusecontextvaluequantity.hasSystem()) {

			n.addNmingSysUseCntxtVlQntySys(String.valueOf(namingsystemusecontextvaluequantity.getSystem()));
		} else {
			n.addNmingSysUseCntxtVlQntySys("NULL");
		}

		if(namingsystemusecontexti == namingsystemusecontextlist.size()-1) {n.addNmingSysUseCntxtVlQntySys("]");}


		 };
		/******************** NmingSys_Pblshr ********************************************************************************/
		if(namingsystem.hasPublisher()) {

			n.addNmingSysPblshr(String.valueOf(namingsystem.getPublisher()));
		} else {
			n.addNmingSysPblshr("NULL");
		}


		/******************** namingsystemuniqueid ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent> namingsystemuniqueidlist = namingsystem.getUniqueId();
		for(int namingsystemuniqueidi = 0; namingsystemuniqueidi<namingsystemuniqueidlist.size();namingsystemuniqueidi++ ) {
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent  namingsystemuniqueid = namingsystemuniqueidlist.get(namingsystemuniqueidi);

		/******************** NmingSys_UniqueId_Vl ********************************************************************************/
		if(namingsystemuniqueidi == 0) {n.addNmingSysUniqueIdVl("[");}
		if(namingsystemuniqueid.hasValue()) {

			n.addNmingSysUniqueIdVl(String.valueOf(namingsystemuniqueid.getValue()));
		} else {
			n.addNmingSysUniqueIdVl("NULL");
		}

		if(namingsystemuniqueidi == namingsystemuniqueidlist.size()-1) {n.addNmingSysUniqueIdVl("]");}


		/******************** namingsystemuniqueidtype ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemIdentifierType namingsystemuniqueidtype = namingsystemuniqueid.getType();
		if(namingsystemuniqueidtype!=null) {
		if(namingsystemuniqueidi == 0) {

		n.addNmingSysUniqueIdTyp("[");		}
			n.addNmingSysUniqueIdTyp(namingsystemuniqueidtype.toCode());
		if(namingsystemuniqueidi == namingsystemuniqueidlist.size()-1) {

		n.addNmingSysUniqueIdTyp("]");		}

		} else {
			n.addNmingSysUniqueIdTyp("NULL");
		}

		/******************** NmingSys_UniqueId_Comment ********************************************************************************/
		if(namingsystemuniqueidi == 0) {n.addNmingSysUniqueIdComment("[");}
		if(namingsystemuniqueid.hasComment()) {

			n.addNmingSysUniqueIdComment(String.valueOf(namingsystemuniqueid.getComment()));
		} else {
			n.addNmingSysUniqueIdComment("NULL");
		}

		if(namingsystemuniqueidi == namingsystemuniqueidlist.size()-1) {n.addNmingSysUniqueIdComment("]");}


		/******************** namingsystemuniqueidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period namingsystemuniqueidperiod = namingsystemuniqueid.getPeriod();

		/******************** NmingSys_UniqueId_Prd_Strt ********************************************************************************/
		if(namingsystemuniqueidi == 0) {n.addNmingSysUniqueIdPrdStrt("[");}
		if(namingsystemuniqueidperiod.hasStart()) {

			n.addNmingSysUniqueIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(namingsystemuniqueidperiod.getStart())+"\"");
		} else {
			n.addNmingSysUniqueIdPrdStrt("NULL");
		}

		if(namingsystemuniqueidi == namingsystemuniqueidlist.size()-1) {n.addNmingSysUniqueIdPrdStrt("]");}


		/******************** NmingSys_UniqueId_Prd_End ********************************************************************************/
		if(namingsystemuniqueidi == 0) {n.addNmingSysUniqueIdPrdEnd("[");}
		if(namingsystemuniqueidperiod.hasEnd()) {

			n.addNmingSysUniqueIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(namingsystemuniqueidperiod.getEnd())+"\"");
		} else {
			n.addNmingSysUniqueIdPrdEnd("NULL");
		}

		if(namingsystemuniqueidi == namingsystemuniqueidlist.size()-1) {n.addNmingSysUniqueIdPrdEnd("]");}


		/******************** NmingSys_UniqueId_Preferred ********************************************************************************/
		if(namingsystemuniqueidi == 0) {n.addNmingSysUniqueIdPreferred("[");}
		if(namingsystemuniqueid.hasPreferred()) {

			n.addNmingSysUniqueIdPreferred(String.valueOf(namingsystemuniqueid.getPreferred()));
		} else {
			n.addNmingSysUniqueIdPreferred("NULL");
		}

		if(namingsystemuniqueidi == namingsystemuniqueidlist.size()-1) {n.addNmingSysUniqueIdPreferred("]");}


		 };
		return n;
	}
}
