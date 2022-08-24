package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TerminologyCapabilities;
public class TerminologyCapabilitiesBidirectionalConversion 
{
	public TerminologyCapabilities TerminologyCapabilitiess(org.hl7.fhir.r4.model.TerminologyCapabilities terminologycapabilities) throws ParseException
	{
		 main.java.com.campfhir.model.TerminologyCapabilities t = new  main.java.com.campfhir.model.TerminologyCapabilities();

		/******************** id ********************************************************************************/
		t.setId(terminologycapabilities.getIdElement().getIdPart());

		/******************** TrminologyCpnlties_Nm ********************************************************************************/
		if(terminologycapabilities.hasName()) {

			t.addTrminologyCpnltiesNm(String.valueOf(terminologycapabilities.getName()));
		} else {
			t.addTrminologyCpnltiesNm("NULL");
		}


		/******************** TrminologyCpnlties_Vrsn ********************************************************************************/
		if(terminologycapabilities.hasVersion()) {

			t.addTrminologyCpnltiesVrsn(String.valueOf(terminologycapabilities.getVersion()));
		} else {
			t.addTrminologyCpnltiesVrsn("NULL");
		}


		/******************** terminologycapabilitiestranslation ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesTranslationComponent terminologycapabilitiestranslation = terminologycapabilities.getTranslation();

		/******************** TrminologyCpnlties_Translation_NeedsMap ********************************************************************************/
		if(terminologycapabilitiestranslation.hasNeedsMap()) {

			t.addTrminologyCpnltiesTranslationNeedsMap(String.valueOf(terminologycapabilitiestranslation.getNeedsMap()));
		} else {
			t.addTrminologyCpnltiesTranslationNeedsMap("NULL");
		}


		/******************** TrminologyCpnlties_Dt ********************************************************************************/
		if(terminologycapabilities.hasDate()) {

			t.addTrminologyCpnltiesDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(terminologycapabilities.getDate())+"\"");
		} else {
			t.addTrminologyCpnltiesDt("NULL");
		}


		/******************** terminologycapabilitiesstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus terminologycapabilitiesstatus = terminologycapabilities.getStatus();
		if(terminologycapabilitiesstatus!=null) {
			t.addTrminologyCpnltiesSts(terminologycapabilitiesstatus.toCode());
		} else {
			t.addTrminologyCpnltiesSts("NULL");
		}

		/******************** TrminologyCpnlties_Dscrptn ********************************************************************************/
		if(terminologycapabilities.hasDescription()) {

			t.addTrminologyCpnltiesDscrptn(String.valueOf(terminologycapabilities.getDescription()));
		} else {
			t.addTrminologyCpnltiesDscrptn("NULL");
		}


		/******************** terminologycapabilitiescontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> terminologycapabilitiescontactlist = terminologycapabilities.getContact();
		for(int terminologycapabilitiescontacti = 0; terminologycapabilitiescontacti<terminologycapabilitiescontactlist.size();terminologycapabilitiescontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  terminologycapabilitiescontact = terminologycapabilitiescontactlist.get(terminologycapabilitiescontacti);

		/******************** TrminologyCpnlties_Cntct_Nm ********************************************************************************/
		if(terminologycapabilitiescontacti == 0) {t.addTrminologyCpnltiesCntctNm("[");}
		if(terminologycapabilitiescontact.hasName()) {

			t.addTrminologyCpnltiesCntctNm(String.valueOf(terminologycapabilitiescontact.getName()));
		} else {
			t.addTrminologyCpnltiesCntctNm("NULL");
		}

		if(terminologycapabilitiescontacti == terminologycapabilitiescontactlist.size()-1) {t.addTrminologyCpnltiesCntctNm("]");}


		/******************** terminologycapabilitiescontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> terminologycapabilitiescontacttelecomlist = terminologycapabilitiescontact.getTelecom();
		for(int terminologycapabilitiescontacttelecomi = 0; terminologycapabilitiescontacttelecomi<terminologycapabilitiescontacttelecomlist.size();terminologycapabilitiescontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  terminologycapabilitiescontacttelecom = terminologycapabilitiescontacttelecomlist.get(terminologycapabilitiescontacttelecomi);

		/******************** TrminologyCpnlties_Cntct_Tlcm_Vl ********************************************************************************/
		if(terminologycapabilitiescontacttelecomi == 0) {t.addTrminologyCpnltiesCntctTlcmVl("[[");}
		if(terminologycapabilitiescontacttelecom.hasValue()) {

			t.addTrminologyCpnltiesCntctTlcmVl(String.valueOf(terminologycapabilitiescontacttelecom.getValue()));
		} else {
			t.addTrminologyCpnltiesCntctTlcmVl("NULL");
		}

		if(terminologycapabilitiescontacttelecomi == terminologycapabilitiescontacttelecomlist.size()-1) {t.addTrminologyCpnltiesCntctTlcmVl("]]");}


		/******************** terminologycapabilitiescontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period terminologycapabilitiescontacttelecomperiod = terminologycapabilitiescontacttelecom.getPeriod();

		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(terminologycapabilitiescontacttelecomi == 0) {t.addTrminologyCpnltiesCntctTlcmPrdStrt("[[");}
		if(terminologycapabilitiescontacttelecomperiod.hasStart()) {

			t.addTrminologyCpnltiesCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(terminologycapabilitiescontacttelecomperiod.getStart())+"\"");
		} else {
			t.addTrminologyCpnltiesCntctTlcmPrdStrt("NULL");
		}

		if(terminologycapabilitiescontacttelecomi == terminologycapabilitiescontacttelecomlist.size()-1) {t.addTrminologyCpnltiesCntctTlcmPrdStrt("]]");}


		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(terminologycapabilitiescontacttelecomi == 0) {t.addTrminologyCpnltiesCntctTlcmPrdEnd("[[");}
		if(terminologycapabilitiescontacttelecomperiod.hasEnd()) {

			t.addTrminologyCpnltiesCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(terminologycapabilitiescontacttelecomperiod.getEnd())+"\"");
		} else {
			t.addTrminologyCpnltiesCntctTlcmPrdEnd("NULL");
		}

		if(terminologycapabilitiescontacttelecomi == terminologycapabilitiescontacttelecomlist.size()-1) {t.addTrminologyCpnltiesCntctTlcmPrdEnd("]]");}


		/******************** terminologycapabilitiescontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse terminologycapabilitiescontacttelecomuse = terminologycapabilitiescontacttelecom.getUse();
		if(terminologycapabilitiescontacttelecomuse!=null) {
		if(terminologycapabilitiescontacttelecomi == 0) {

		t.addTrminologyCpnltiesCntctTlcmUse("[[");		}
			t.addTrminologyCpnltiesCntctTlcmUse(terminologycapabilitiescontacttelecomuse.toCode());
		if(terminologycapabilitiescontacttelecomi == terminologycapabilitiescontacttelecomlist.size()-1) {

		t.addTrminologyCpnltiesCntctTlcmUse("]]");		}

		} else {
			t.addTrminologyCpnltiesCntctTlcmUse("NULL");
		}

		/******************** terminologycapabilitiescontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem terminologycapabilitiescontacttelecomsystem = terminologycapabilitiescontacttelecom.getSystem();
		if(terminologycapabilitiescontacttelecomsystem!=null) {
		if(terminologycapabilitiescontacttelecomi == 0) {

		t.addTrminologyCpnltiesCntctTlcmSys("[[");		}
			t.addTrminologyCpnltiesCntctTlcmSys(terminologycapabilitiescontacttelecomsystem.toCode());
		if(terminologycapabilitiescontacttelecomi == terminologycapabilitiescontacttelecomlist.size()-1) {

		t.addTrminologyCpnltiesCntctTlcmSys("]]");		}

		} else {
			t.addTrminologyCpnltiesCntctTlcmSys("NULL");
		}

		/******************** TrminologyCpnlties_Cntct_Tlcm_Rnk ********************************************************************************/
		if(terminologycapabilitiescontacttelecomi == 0) {t.addTrminologyCpnltiesCntctTlcmRnk("[[");}
		if(terminologycapabilitiescontacttelecom.hasRank()) {

			t.addTrminologyCpnltiesCntctTlcmRnk(String.valueOf(terminologycapabilitiescontacttelecom.getRank()));
		} else {
			t.addTrminologyCpnltiesCntctTlcmRnk("NULL");
		}

		if(terminologycapabilitiescontacttelecomi == terminologycapabilitiescontacttelecomlist.size()-1) {t.addTrminologyCpnltiesCntctTlcmRnk("]]");}


		 };
		 };
		/******************** TrminologyCpnlties_Copyright ********************************************************************************/
		if(terminologycapabilities.hasCopyright()) {

			t.addTrminologyCpnltiesCopyright(String.valueOf(terminologycapabilities.getCopyright()));
		} else {
			t.addTrminologyCpnltiesCopyright("NULL");
		}


		/******************** terminologycapabilitieskind ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.CapabilityStatementKind terminologycapabilitieskind = terminologycapabilities.getKind();
		if(terminologycapabilitieskind!=null) {
			t.addTrminologyCpnltiesKind(terminologycapabilitieskind.toCode());
		} else {
			t.addTrminologyCpnltiesKind("NULL");
		}

		/******************** TrminologyCpnlties_Ttl ********************************************************************************/
		if(terminologycapabilities.hasTitle()) {

			t.addTrminologyCpnltiesTtl(String.valueOf(terminologycapabilities.getTitle()));
		} else {
			t.addTrminologyCpnltiesTtl("NULL");
		}


		/******************** TrminologyCpnlties_Prpse ********************************************************************************/
		if(terminologycapabilities.hasPurpose()) {

			t.addTrminologyCpnltiesPrpse(String.valueOf(terminologycapabilities.getPurpose()));
		} else {
			t.addTrminologyCpnltiesPrpse("NULL");
		}


		/******************** TrminologyCpnlties_Url ********************************************************************************/
		if(terminologycapabilities.hasUrl()) {

			t.addTrminologyCpnltiesUrl(String.valueOf(terminologycapabilities.getUrl()));
		} else {
			t.addTrminologyCpnltiesUrl("NULL");
		}


		/******************** terminologycapabilitiesjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> terminologycapabilitiesjurisdictionlist = terminologycapabilities.getJurisdiction();
		for(int terminologycapabilitiesjurisdictioni = 0; terminologycapabilitiesjurisdictioni<terminologycapabilitiesjurisdictionlist.size();terminologycapabilitiesjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  terminologycapabilitiesjurisdiction = terminologycapabilitiesjurisdictionlist.get(terminologycapabilitiesjurisdictioni);

		/******************** TrminologyCpnlties_Jrsdctn_Txt ********************************************************************************/
		if(terminologycapabilitiesjurisdictioni == 0) {t.addTrminologyCpnltiesJrsdctnTxt("[");}
		if(terminologycapabilitiesjurisdiction.hasText()) {

			t.addTrminologyCpnltiesJrsdctnTxt(String.valueOf(terminologycapabilitiesjurisdiction.getText()));
		} else {
			t.addTrminologyCpnltiesJrsdctnTxt("NULL");
		}

		if(terminologycapabilitiesjurisdictioni == terminologycapabilitiesjurisdictionlist.size()-1) {t.addTrminologyCpnltiesJrsdctnTxt("]");}


		/******************** terminologycapabilitiesjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> terminologycapabilitiesjurisdictioncodinglist = terminologycapabilitiesjurisdiction.getCoding();
		for(int terminologycapabilitiesjurisdictioncodingi = 0; terminologycapabilitiesjurisdictioncodingi<terminologycapabilitiesjurisdictioncodinglist.size();terminologycapabilitiesjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  terminologycapabilitiesjurisdictioncoding = terminologycapabilitiesjurisdictioncodinglist.get(terminologycapabilitiesjurisdictioncodingi);

		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncodingi == 0) {t.addTrminologyCpnltiesJrsdctnCdgDsply("[[");}
		if(terminologycapabilitiesjurisdictioncoding.hasDisplay()) {

			t.addTrminologyCpnltiesJrsdctnCdgDsply(String.valueOf(terminologycapabilitiesjurisdictioncoding.getDisplay()));
		} else {
			t.addTrminologyCpnltiesJrsdctnCdgDsply("NULL");
		}

		if(terminologycapabilitiesjurisdictioncodingi == terminologycapabilitiesjurisdictioncodinglist.size()-1) {t.addTrminologyCpnltiesJrsdctnCdgDsply("]]");}


		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncodingi == 0) {t.addTrminologyCpnltiesJrsdctnCdgVrsn("[[");}
		if(terminologycapabilitiesjurisdictioncoding.hasVersion()) {

			t.addTrminologyCpnltiesJrsdctnCdgVrsn(String.valueOf(terminologycapabilitiesjurisdictioncoding.getVersion()));
		} else {
			t.addTrminologyCpnltiesJrsdctnCdgVrsn("NULL");
		}

		if(terminologycapabilitiesjurisdictioncodingi == terminologycapabilitiesjurisdictioncodinglist.size()-1) {t.addTrminologyCpnltiesJrsdctnCdgVrsn("]]");}


		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncodingi == 0) {t.addTrminologyCpnltiesJrsdctnCdgCd("[[");}
		if(terminologycapabilitiesjurisdictioncoding.hasCode()) {

			t.addTrminologyCpnltiesJrsdctnCdgCd(String.valueOf(terminologycapabilitiesjurisdictioncoding.getCode()));
		} else {
			t.addTrminologyCpnltiesJrsdctnCdgCd("NULL");
		}

		if(terminologycapabilitiesjurisdictioncodingi == terminologycapabilitiesjurisdictioncodinglist.size()-1) {t.addTrminologyCpnltiesJrsdctnCdgCd("]]");}


		/******************** TrminologyCpnlties_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncodingi == 0) {t.addTrminologyCpnltiesJrsdctnCdgUsrSltd("[[");}
		if(terminologycapabilitiesjurisdictioncoding.hasUserSelected()) {

			t.addTrminologyCpnltiesJrsdctnCdgUsrSltd(String.valueOf(terminologycapabilitiesjurisdictioncoding.getUserSelected()));
		} else {
			t.addTrminologyCpnltiesJrsdctnCdgUsrSltd("NULL");
		}

		if(terminologycapabilitiesjurisdictioncodingi == terminologycapabilitiesjurisdictioncodinglist.size()-1) {t.addTrminologyCpnltiesJrsdctnCdgUsrSltd("]]");}


		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncodingi == 0) {t.addTrminologyCpnltiesJrsdctnCdgSys("[[");}
		if(terminologycapabilitiesjurisdictioncoding.hasSystem()) {

			t.addTrminologyCpnltiesJrsdctnCdgSys(String.valueOf(terminologycapabilitiesjurisdictioncoding.getSystem()));
		} else {
			t.addTrminologyCpnltiesJrsdctnCdgSys("NULL");
		}

		if(terminologycapabilitiesjurisdictioncodingi == terminologycapabilitiesjurisdictioncodinglist.size()-1) {t.addTrminologyCpnltiesJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** terminologycapabilitiesusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> terminologycapabilitiesusecontextlist = terminologycapabilities.getUseContext();
		for(int terminologycapabilitiesusecontexti = 0; terminologycapabilitiesusecontexti<terminologycapabilitiesusecontextlist.size();terminologycapabilitiesusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  terminologycapabilitiesusecontext = terminologycapabilitiesusecontextlist.get(terminologycapabilitiesusecontexti);

		/******************** terminologycapabilitiesusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding terminologycapabilitiesusecontextcode = terminologycapabilitiesusecontext.getCode();

		/******************** TrminologyCpnlties_UseCntxt_Cd_Dsply ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtCdDsply("[");}
		if(terminologycapabilitiesusecontextcode.hasDisplay()) {

			t.addTrminologyCpnltiesUseCntxtCdDsply(String.valueOf(terminologycapabilitiesusecontextcode.getDisplay()));
		} else {
			t.addTrminologyCpnltiesUseCntxtCdDsply("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtCdDsply("]");}


		/******************** TrminologyCpnlties_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtCdVrsn("[");}
		if(terminologycapabilitiesusecontextcode.hasVersion()) {

			t.addTrminologyCpnltiesUseCntxtCdVrsn(String.valueOf(terminologycapabilitiesusecontextcode.getVersion()));
		} else {
			t.addTrminologyCpnltiesUseCntxtCdVrsn("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtCdVrsn("]");}


		/******************** TrminologyCpnlties_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtCdUsrSltd("[");}
		if(terminologycapabilitiesusecontextcode.hasUserSelected()) {

			t.addTrminologyCpnltiesUseCntxtCdUsrSltd(String.valueOf(terminologycapabilitiesusecontextcode.getUserSelected()));
		} else {
			t.addTrminologyCpnltiesUseCntxtCdUsrSltd("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtCdUsrSltd("]");}


		/******************** TrminologyCpnlties_UseCntxt_Cd_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtCdSys("[");}
		if(terminologycapabilitiesusecontextcode.hasSystem()) {

			t.addTrminologyCpnltiesUseCntxtCdSys(String.valueOf(terminologycapabilitiesusecontextcode.getSystem()));
		} else {
			t.addTrminologyCpnltiesUseCntxtCdSys("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtCdSys("]");}


		/******************** TrminologyCpnlties_UseCntxt_VlRfrnc ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRfrnc("[");}
		if(terminologycapabilitiesusecontext.hasValueReference()) {

			if(terminologycapabilitiesusecontext.getValueReference().getReference() != null) {
			t.addTrminologyCpnltiesUseCntxtVlRfrnc(terminologycapabilitiesusecontext.getValueReference().getReference());
			}
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRfrnc("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRfrnc("]");}


		/******************** terminologycapabilitiesusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept terminologycapabilitiesusecontextvaluecodeableconcept = terminologycapabilitiesusecontext.getValueCodeableConcept();

		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptTxt("[");}
		if(terminologycapabilitiesusecontextvaluecodeableconcept.hasText()) {

			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptTxt(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconcept.getText()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptTxt("]");}


		/******************** terminologycapabilitiesusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> terminologycapabilitiesusecontextvaluecodeableconceptcodinglist = terminologycapabilitiesusecontextvaluecodeableconcept.getCoding();
		for(int terminologycapabilitiesusecontextvaluecodeableconceptcodingi = 0; terminologycapabilitiesusecontextvaluecodeableconceptcodingi<terminologycapabilitiesusecontextvaluecodeableconceptcodinglist.size();terminologycapabilitiesusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  terminologycapabilitiesusecontextvaluecodeableconceptcoding = terminologycapabilitiesusecontextvaluecodeableconceptcodinglist.get(terminologycapabilitiesusecontextvaluecodeableconceptcodingi);

		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == 0) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasDisplay()) {

			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == terminologycapabilitiesusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == 0) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasVersion()) {

			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == terminologycapabilitiesusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == 0) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd("[[");}
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasCode()) {

			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == terminologycapabilitiesusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == 0) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == terminologycapabilitiesusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == 0) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys("[[");}
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasSystem()) {

			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(terminologycapabilitiesusecontextvaluecodeableconceptcodingi == terminologycapabilitiesusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** terminologycapabilitiesusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range terminologycapabilitiesusecontextvaluerange = terminologycapabilitiesusecontext.getValueRange();

		/******************** terminologycapabilitiesusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluerangelow = terminologycapabilitiesusecontextvaluerange.getLow();

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngLwVl("[");}
		if(terminologycapabilitiesusecontextvaluerangelow.hasValue()) {

			t.addTrminologyCpnltiesUseCntxtVlRngLwVl(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getValue()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngLwVl("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngLwVl("]");}


		/******************** terminologycapabilitiesusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator terminologycapabilitiesusecontextvaluerangelowcomparator = terminologycapabilitiesusecontextvaluerangelow.getComparator();
		if(terminologycapabilitiesusecontextvaluerangelowcomparator!=null) {
		if(terminologycapabilitiesusecontexti == 0) {

		t.addTrminologyCpnltiesUseCntxtVlRngLwCmprtr("[");		}
			t.addTrminologyCpnltiesUseCntxtVlRngLwCmprtr(terminologycapabilitiesusecontextvaluerangelowcomparator.toCode());
		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {

		t.addTrminologyCpnltiesUseCntxtVlRngLwCmprtr("]");		}

		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngLwCd("[");}
		if(terminologycapabilitiesusecontextvaluerangelow.hasCode()) {

			t.addTrminologyCpnltiesUseCntxtVlRngLwCd(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getCode()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngLwCd("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngLwCd("]");}


		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngLwUnt("[");}
		if(terminologycapabilitiesusecontextvaluerangelow.hasUnit()) {

			t.addTrminologyCpnltiesUseCntxtVlRngLwUnt(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getUnit()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngLwUnt("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngLwUnt("]");}


		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngLwSys("[");}
		if(terminologycapabilitiesusecontextvaluerangelow.hasSystem()) {

			t.addTrminologyCpnltiesUseCntxtVlRngLwSys(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getSystem()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngLwSys("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngLwSys("]");}


		/******************** terminologycapabilitiesusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluerangehigh = terminologycapabilitiesusecontextvaluerange.getHigh();

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngHiVl("[");}
		if(terminologycapabilitiesusecontextvaluerangehigh.hasValue()) {

			t.addTrminologyCpnltiesUseCntxtVlRngHiVl(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getValue()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngHiVl("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngHiVl("]");}


		/******************** terminologycapabilitiesusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator terminologycapabilitiesusecontextvaluerangehighcomparator = terminologycapabilitiesusecontextvaluerangehigh.getComparator();
		if(terminologycapabilitiesusecontextvaluerangehighcomparator!=null) {
		if(terminologycapabilitiesusecontexti == 0) {

		t.addTrminologyCpnltiesUseCntxtVlRngHiCmprtr("[");		}
			t.addTrminologyCpnltiesUseCntxtVlRngHiCmprtr(terminologycapabilitiesusecontextvaluerangehighcomparator.toCode());
		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {

		t.addTrminologyCpnltiesUseCntxtVlRngHiCmprtr("]");		}

		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngHiCd("[");}
		if(terminologycapabilitiesusecontextvaluerangehigh.hasCode()) {

			t.addTrminologyCpnltiesUseCntxtVlRngHiCd(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getCode()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngHiCd("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngHiCd("]");}


		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngHiUnt("[");}
		if(terminologycapabilitiesusecontextvaluerangehigh.hasUnit()) {

			t.addTrminologyCpnltiesUseCntxtVlRngHiUnt(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getUnit()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngHiUnt("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngHiUnt("]");}


		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlRngHiSys("[");}
		if(terminologycapabilitiesusecontextvaluerangehigh.hasSystem()) {

			t.addTrminologyCpnltiesUseCntxtVlRngHiSys(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getSystem()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlRngHiSys("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlRngHiSys("]");}


		/******************** terminologycapabilitiesusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluequantity = terminologycapabilitiesusecontext.getValueQuantity();

		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlQntyVl("[");}
		if(terminologycapabilitiesusecontextvaluequantity.hasValue()) {

			t.addTrminologyCpnltiesUseCntxtVlQntyVl(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getValue()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlQntyVl("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlQntyVl("]");}


		/******************** terminologycapabilitiesusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator terminologycapabilitiesusecontextvaluequantitycomparator = terminologycapabilitiesusecontextvaluequantity.getComparator();
		if(terminologycapabilitiesusecontextvaluequantitycomparator!=null) {
		if(terminologycapabilitiesusecontexti == 0) {

		t.addTrminologyCpnltiesUseCntxtVlQntyCmprtr("[");		}
			t.addTrminologyCpnltiesUseCntxtVlQntyCmprtr(terminologycapabilitiesusecontextvaluequantitycomparator.toCode());
		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {

		t.addTrminologyCpnltiesUseCntxtVlQntyCmprtr("]");		}

		} else {
			t.addTrminologyCpnltiesUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlQntyCd("[");}
		if(terminologycapabilitiesusecontextvaluequantity.hasCode()) {

			t.addTrminologyCpnltiesUseCntxtVlQntyCd(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getCode()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlQntyCd("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlQntyCd("]");}


		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlQntyUnt("[");}
		if(terminologycapabilitiesusecontextvaluequantity.hasUnit()) {

			t.addTrminologyCpnltiesUseCntxtVlQntyUnt(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getUnit()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlQntyUnt("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlQntyUnt("]");}


		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontexti == 0) {t.addTrminologyCpnltiesUseCntxtVlQntySys("[");}
		if(terminologycapabilitiesusecontextvaluequantity.hasSystem()) {

			t.addTrminologyCpnltiesUseCntxtVlQntySys(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getSystem()));
		} else {
			t.addTrminologyCpnltiesUseCntxtVlQntySys("NULL");
		}

		if(terminologycapabilitiesusecontexti == terminologycapabilitiesusecontextlist.size()-1) {t.addTrminologyCpnltiesUseCntxtVlQntySys("]");}


		 };
		/******************** TrminologyCpnlties_Exprmtl ********************************************************************************/
		if(terminologycapabilities.hasExperimental()) {

			t.addTrminologyCpnltiesExprmtl(String.valueOf(terminologycapabilities.getExperimental()));
		} else {
			t.addTrminologyCpnltiesExprmtl("NULL");
		}


		/******************** TrminologyCpnlties_Pblshr ********************************************************************************/
		if(terminologycapabilities.hasPublisher()) {

			t.addTrminologyCpnltiesPblshr(String.valueOf(terminologycapabilities.getPublisher()));
		} else {
			t.addTrminologyCpnltiesPblshr("NULL");
		}


		/******************** TrminologyCpnlties_LockedDt ********************************************************************************/
		if(terminologycapabilities.hasLockedDate()) {

			t.addTrminologyCpnltiesLockedDt(String.valueOf(terminologycapabilities.getLockedDate()));
		} else {
			t.addTrminologyCpnltiesLockedDt("NULL");
		}


		/******************** terminologycapabilitiesimplementation ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesImplementationComponent terminologycapabilitiesimplementation = terminologycapabilities.getImplementation();

		/******************** TrminologyCpnlties_Implementation_Dscrptn ********************************************************************************/
		if(terminologycapabilitiesimplementation.hasDescription()) {

			t.addTrminologyCpnltiesImplementationDscrptn(String.valueOf(terminologycapabilitiesimplementation.getDescription()));
		} else {
			t.addTrminologyCpnltiesImplementationDscrptn("NULL");
		}


		/******************** TrminologyCpnlties_Implementation_Url ********************************************************************************/
		if(terminologycapabilitiesimplementation.hasUrl()) {

			t.addTrminologyCpnltiesImplementationUrl(String.valueOf(terminologycapabilitiesimplementation.getUrl()));
		} else {
			t.addTrminologyCpnltiesImplementationUrl("NULL");
		}


		/******************** terminologycapabilitiessoftware ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesSoftwareComponent terminologycapabilitiessoftware = terminologycapabilities.getSoftware();

		/******************** TrminologyCpnlties_Software_Nm ********************************************************************************/
		if(terminologycapabilitiessoftware.hasName()) {

			t.addTrminologyCpnltiesSoftwareNm(String.valueOf(terminologycapabilitiessoftware.getName()));
		} else {
			t.addTrminologyCpnltiesSoftwareNm("NULL");
		}


		/******************** terminologycapabilitiescodesystem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent> terminologycapabilitiescodesystemlist = terminologycapabilities.getCodeSystem();
		for(int terminologycapabilitiescodesystemi = 0; terminologycapabilitiescodesystemi<terminologycapabilitiescodesystemlist.size();terminologycapabilitiescodesystemi++ ) {
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent  terminologycapabilitiescodesystem = terminologycapabilitiescodesystemlist.get(terminologycapabilitiescodesystemi);

		/******************** terminologycapabilitiescodesystemversion ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent> terminologycapabilitiescodesystemversionlist = terminologycapabilitiescodesystem.getVersion();
		for(int terminologycapabilitiescodesystemversioni = 0; terminologycapabilitiescodesystemversioni<terminologycapabilitiescodesystemversionlist.size();terminologycapabilitiescodesystemversioni++ ) {
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent  terminologycapabilitiescodesystemversion = terminologycapabilitiescodesystemversionlist.get(terminologycapabilitiescodesystemversioni);

		/******************** TrminologyCpnlties_CdSys_Vrsn_Prpty ********************************************************************************/
		if(terminologycapabilitiescodesystemversioni == 0) {t.addTrminologyCpnltiesCdSysVrsnPrpty("[[");}
		if(terminologycapabilitiescodesystemversion.hasProperty()) {

			String  array = "[";
			for(int incr=0; incr<terminologycapabilitiescodesystemversion.getProperty().size(); incr++) {
				array = array + terminologycapabilitiescodesystemversion.getProperty().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTrminologyCpnltiesCdSysVrsnPrpty(array);

		} else {
			t.addTrminologyCpnltiesCdSysVrsnPrpty("NULL");
		}

		if(terminologycapabilitiescodesystemversioni == terminologycapabilitiescodesystemversionlist.size()-1) {t.addTrminologyCpnltiesCdSysVrsnPrpty("]]");}


		/******************** TrminologyCpnlties_CdSys_Vrsn_Lnguage ********************************************************************************/
		if(terminologycapabilitiescodesystemversioni == 0) {t.addTrminologyCpnltiesCdSysVrsnLnguage("[[");}
		if(terminologycapabilitiescodesystemversion.hasLanguage()) {

			String  array = "[";
			for(int incr=0; incr<terminologycapabilitiescodesystemversion.getLanguage().size(); incr++) {
				array = array + terminologycapabilitiescodesystemversion.getLanguage().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTrminologyCpnltiesCdSysVrsnLnguage(array);

		} else {
			t.addTrminologyCpnltiesCdSysVrsnLnguage("NULL");
		}

		if(terminologycapabilitiescodesystemversioni == terminologycapabilitiescodesystemversionlist.size()-1) {t.addTrminologyCpnltiesCdSysVrsnLnguage("]]");}


		/******************** terminologycapabilitiescodesystemversionfilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent> terminologycapabilitiescodesystemversionfilterlist = terminologycapabilitiescodesystemversion.getFilter();
		for(int terminologycapabilitiescodesystemversionfilteri = 0; terminologycapabilitiescodesystemversionfilteri<terminologycapabilitiescodesystemversionfilterlist.size();terminologycapabilitiescodesystemversionfilteri++ ) {
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent  terminologycapabilitiescodesystemversionfilter = terminologycapabilitiescodesystemversionfilterlist.get(terminologycapabilitiescodesystemversionfilteri);

		/******************** TrminologyCpnlties_CdSys_Vrsn_Fltr_Cd ********************************************************************************/
		if(terminologycapabilitiescodesystemversionfilteri == 0) {t.addTrminologyCpnltiesCdSysVrsnFltrCd("[[[");}
		if(terminologycapabilitiescodesystemversionfilter.hasCode()) {

			t.addTrminologyCpnltiesCdSysVrsnFltrCd(String.valueOf(terminologycapabilitiescodesystemversionfilter.getCode()));
		} else {
			t.addTrminologyCpnltiesCdSysVrsnFltrCd("NULL");
		}

		if(terminologycapabilitiescodesystemversionfilteri == terminologycapabilitiescodesystemversionfilterlist.size()-1) {t.addTrminologyCpnltiesCdSysVrsnFltrCd("]]]");}


		/******************** TrminologyCpnlties_CdSys_Vrsn_Fltr_Op ********************************************************************************/
		if(terminologycapabilitiescodesystemversionfilteri == 0) {t.addTrminologyCpnltiesCdSysVrsnFltrOp("[[[");}
		if(terminologycapabilitiescodesystemversionfilter.hasOp()) {

			String  array = "[";
			for(int incr=0; incr<terminologycapabilitiescodesystemversionfilter.getOp().size(); incr++) {
				array = array + terminologycapabilitiescodesystemversionfilter.getOp().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTrminologyCpnltiesCdSysVrsnFltrOp(array);

		} else {
			t.addTrminologyCpnltiesCdSysVrsnFltrOp("NULL");
		}

		if(terminologycapabilitiescodesystemversionfilteri == terminologycapabilitiescodesystemversionfilterlist.size()-1) {t.addTrminologyCpnltiesCdSysVrsnFltrOp("]]]");}


		 };
		/******************** TrminologyCpnlties_CdSys_Vrsn_Cd ********************************************************************************/
		if(terminologycapabilitiescodesystemversion.hasCode()) {

			t.addTrminologyCpnltiesCdSysVrsnCd(String.valueOf(terminologycapabilitiescodesystemversion.getCode()));
		} else {
			t.addTrminologyCpnltiesCdSysVrsnCd("NULL");
		}


		/******************** TrminologyCpnlties_CdSys_Vrsn_IsDefault ********************************************************************************/
		if(terminologycapabilitiescodesystemversion.hasIsDefault()) {

			t.addTrminologyCpnltiesCdSysVrsnIsDefault(String.valueOf(terminologycapabilitiescodesystemversion.getIsDefault()));
		} else {
			t.addTrminologyCpnltiesCdSysVrsnIsDefault("NULL");
		}


		/******************** TrminologyCpnlties_CdSys_Vrsn_Cmpsitional ********************************************************************************/
		if(terminologycapabilitiescodesystemversion.hasCompositional()) {

			t.addTrminologyCpnltiesCdSysVrsnCmpsitional(String.valueOf(terminologycapabilitiescodesystemversion.getCompositional()));
		} else {
			t.addTrminologyCpnltiesCdSysVrsnCmpsitional("NULL");
		}


		 };
		/******************** TrminologyCpnlties_CdSys_Uri ********************************************************************************/
		if(terminologycapabilitiescodesystem.hasUri()) {

			t.addTrminologyCpnltiesCdSysUri(String.valueOf(terminologycapabilitiescodesystem.getUri()));
		} else {
			t.addTrminologyCpnltiesCdSysUri("NULL");
		}


		/******************** TrminologyCpnlties_CdSys_Subsumption ********************************************************************************/
		if(terminologycapabilitiescodesystem.hasSubsumption()) {

			t.addTrminologyCpnltiesCdSysSubsumption(String.valueOf(terminologycapabilitiescodesystem.getSubsumption()));
		} else {
			t.addTrminologyCpnltiesCdSysSubsumption("NULL");
		}


		 };
		/******************** terminologycapabilitiesvalidatecode ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesValidateCodeComponent terminologycapabilitiesvalidatecode = terminologycapabilities.getValidateCode();

		/******************** TrminologyCpnlties_ValidateCd_Translations ********************************************************************************/
		if(terminologycapabilitiesvalidatecode.hasTranslations()) {

			t.addTrminologyCpnltiesValidateCdTranslations(String.valueOf(terminologycapabilitiesvalidatecode.getTranslations()));
		} else {
			t.addTrminologyCpnltiesValidateCdTranslations("NULL");
		}


		/******************** terminologycapabilitiescodesearch ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.CodeSearchSupport terminologycapabilitiescodesearch = terminologycapabilities.getCodeSearch();
		if(terminologycapabilitiescodesearch!=null) {
			t.addTrminologyCpnltiesCdSrch(terminologycapabilitiescodesearch.toCode());
		} else {
			t.addTrminologyCpnltiesCdSrch("NULL");
		}

		/******************** terminologycapabilitiesexpansion ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionComponent terminologycapabilitiesexpansion = terminologycapabilities.getExpansion();

		/******************** terminologycapabilitiesexpansionparameter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent> terminologycapabilitiesexpansionparameterlist = terminologycapabilitiesexpansion.getParameter();
		for(int terminologycapabilitiesexpansionparameteri = 0; terminologycapabilitiesexpansionparameteri<terminologycapabilitiesexpansionparameterlist.size();terminologycapabilitiesexpansionparameteri++ ) {
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent  terminologycapabilitiesexpansionparameter = terminologycapabilitiesexpansionparameterlist.get(terminologycapabilitiesexpansionparameteri);

		/******************** TrminologyCpnlties_Expansion_Prmtr_Nm ********************************************************************************/
		if(terminologycapabilitiesexpansionparameteri == 0) {t.addTrminologyCpnltiesExpansionPrmtrNm("[");}
		if(terminologycapabilitiesexpansionparameter.hasName()) {

			t.addTrminologyCpnltiesExpansionPrmtrNm(String.valueOf(terminologycapabilitiesexpansionparameter.getName()));
		} else {
			t.addTrminologyCpnltiesExpansionPrmtrNm("NULL");
		}

		if(terminologycapabilitiesexpansionparameteri == terminologycapabilitiesexpansionparameterlist.size()-1) {t.addTrminologyCpnltiesExpansionPrmtrNm("]");}


		/******************** TrminologyCpnlties_Expansion_Prmtr_Docation ********************************************************************************/
		if(terminologycapabilitiesexpansionparameteri == 0) {t.addTrminologyCpnltiesExpansionPrmtrDocation("[");}
		if(terminologycapabilitiesexpansionparameter.hasDocumentation()) {

			t.addTrminologyCpnltiesExpansionPrmtrDocation(String.valueOf(terminologycapabilitiesexpansionparameter.getDocumentation()));
		} else {
			t.addTrminologyCpnltiesExpansionPrmtrDocation("NULL");
		}

		if(terminologycapabilitiesexpansionparameteri == terminologycapabilitiesexpansionparameterlist.size()-1) {t.addTrminologyCpnltiesExpansionPrmtrDocation("]");}


		 };
		/******************** TrminologyCpnlties_Expansion_Paging ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasPaging()) {

			t.addTrminologyCpnltiesExpansionPaging(String.valueOf(terminologycapabilitiesexpansion.getPaging()));
		} else {
			t.addTrminologyCpnltiesExpansionPaging("NULL");
		}


		/******************** TrminologyCpnlties_Expansion_Incomplete ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasIncomplete()) {

			t.addTrminologyCpnltiesExpansionIncomplete(String.valueOf(terminologycapabilitiesexpansion.getIncomplete()));
		} else {
			t.addTrminologyCpnltiesExpansionIncomplete("NULL");
		}


		/******************** TrminologyCpnlties_Expansion_Hierarchical ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasHierarchical()) {

			t.addTrminologyCpnltiesExpansionHierarchical(String.valueOf(terminologycapabilitiesexpansion.getHierarchical()));
		} else {
			t.addTrminologyCpnltiesExpansionHierarchical("NULL");
		}


		/******************** TrminologyCpnlties_Expansion_TxtFltr ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasTextFilter()) {

			t.addTrminologyCpnltiesExpansionTxtFltr(String.valueOf(terminologycapabilitiesexpansion.getTextFilter()));
		} else {
			t.addTrminologyCpnltiesExpansionTxtFltr("NULL");
		}


		/******************** terminologycapabilitiesclosure ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesClosureComponent terminologycapabilitiesclosure = terminologycapabilities.getClosure();

		/******************** TrminologyCpnlties_Closure_Translation ********************************************************************************/
		if(terminologycapabilitiesclosure.hasTranslation()) {

			t.addTrminologyCpnltiesClosureTranslation(String.valueOf(terminologycapabilitiesclosure.getTranslation()));
		} else {
			t.addTrminologyCpnltiesClosureTranslation("NULL");
		}


		return t;
	}
}
