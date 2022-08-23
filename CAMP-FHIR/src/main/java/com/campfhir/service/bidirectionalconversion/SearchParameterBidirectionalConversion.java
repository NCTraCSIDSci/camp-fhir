package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SearchParameter;
public class SearchParameterBidirectionalConversion 
{
	public SearchParameter SearchParameters(org.hl7.fhir.r4.model.SearchParameter searchparameter) throws ParseException
	{
		 main.java.com.campfhir.model.SearchParameter s = new  main.java.com.campfhir.model.SearchParameter();

		/******************** id ********************************************************************************/
		s.setId(searchparameter.getIdElement().getIdPart());

		/******************** SrchPrmtr_Nm ********************************************************************************/
		if(searchparameter.hasName()) {

			s.addSrchPrmtrNm(String.valueOf(searchparameter.getName()));
		} else {
			s.addSrchPrmtrNm("NULL");
		}


		/******************** searchparametertype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType searchparametertype = searchparameter.getType();
		if(searchparametertype!=null) {
			s.addSrchPrmtrTyp(searchparametertype.toCode());
		} else {
			s.addSrchPrmtrTyp("NULL");
		}

		/******************** searchparametercomparator ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.SearchParameter.SearchComparator>> searchparametercomparatorlist = searchparameter.getComparator();
		for(int searchparametercomparatori = 0; searchparametercomparatori<searchparametercomparatorlist.size();searchparametercomparatori++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.SearchParameter.SearchComparator>  searchparametercomparator = searchparametercomparatorlist.get(searchparametercomparatori);
		if(searchparametercomparator!=null) {
			s.addSrchPrmtrCmprtr(searchparametercomparator.getCode());
		} else {
			s.addSrchPrmtrCmprtr("NULL");
		}
		 };

		/******************** SrchPrmtr_Base ********************************************************************************/
		if(searchparameter.hasBase()) {

			String  array = "[";
			for(int incr=0; incr<searchparameter.getBase().size(); incr++) {
				array = array + searchparameter.getBase().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrchPrmtrBase(array);

		} else {
			s.addSrchPrmtrBase("NULL");
		}


		/******************** SrchPrmtr_Vrsn ********************************************************************************/
		if(searchparameter.hasVersion()) {

			s.addSrchPrmtrVrsn(String.valueOf(searchparameter.getVersion()));
		} else {
			s.addSrchPrmtrVrsn("NULL");
		}


		/******************** SrchPrmtr_Dt ********************************************************************************/
		if(searchparameter.hasDate()) {

			s.addSrchPrmtrDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(searchparameter.getDate())+"\"");
		} else {
			s.addSrchPrmtrDt("NULL");
		}


		/******************** SrchPrmtr_Cd ********************************************************************************/
		if(searchparameter.hasCode()) {

			s.addSrchPrmtrCd(String.valueOf(searchparameter.getCode()));
		} else {
			s.addSrchPrmtrCd("NULL");
		}


		/******************** searchparameterstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus searchparameterstatus = searchparameter.getStatus();
		if(searchparameterstatus!=null) {
			s.addSrchPrmtrSts(searchparameterstatus.toCode());
		} else {
			s.addSrchPrmtrSts("NULL");
		}

		/******************** SrchPrmtr_Dscrptn ********************************************************************************/
		if(searchparameter.hasDescription()) {

			s.addSrchPrmtrDscrptn(String.valueOf(searchparameter.getDescription()));
		} else {
			s.addSrchPrmtrDscrptn("NULL");
		}


		/******************** searchparametercontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> searchparametercontactlist = searchparameter.getContact();
		for(int searchparametercontacti = 0; searchparametercontacti<searchparametercontactlist.size();searchparametercontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  searchparametercontact = searchparametercontactlist.get(searchparametercontacti);

		/******************** SrchPrmtr_Cntct_Nm ********************************************************************************/
		if(searchparametercontacti == 0) {s.addSrchPrmtrCntctNm("[");}
		if(searchparametercontact.hasName()) {

			s.addSrchPrmtrCntctNm(String.valueOf(searchparametercontact.getName()));
		} else {
			s.addSrchPrmtrCntctNm("NULL");
		}

		if(searchparametercontacti == searchparametercontactlist.size()-1) {s.addSrchPrmtrCntctNm("]");}


		/******************** searchparametercontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> searchparametercontacttelecomlist = searchparametercontact.getTelecom();
		for(int searchparametercontacttelecomi = 0; searchparametercontacttelecomi<searchparametercontacttelecomlist.size();searchparametercontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  searchparametercontacttelecom = searchparametercontacttelecomlist.get(searchparametercontacttelecomi);

		/******************** SrchPrmtr_Cntct_Tlcm_Vl ********************************************************************************/
		if(searchparametercontacttelecomi == 0) {s.addSrchPrmtrCntctTlcmVl("[[");}
		if(searchparametercontacttelecom.hasValue()) {

			s.addSrchPrmtrCntctTlcmVl(String.valueOf(searchparametercontacttelecom.getValue()));
		} else {
			s.addSrchPrmtrCntctTlcmVl("NULL");
		}

		if(searchparametercontacttelecomi == searchparametercontacttelecomlist.size()-1) {s.addSrchPrmtrCntctTlcmVl("]]");}


		/******************** searchparametercontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period searchparametercontacttelecomperiod = searchparametercontacttelecom.getPeriod();

		/******************** SrchPrmtr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(searchparametercontacttelecomi == 0) {s.addSrchPrmtrCntctTlcmPrdStrt("[[");}
		if(searchparametercontacttelecomperiod.hasStart()) {

			s.addSrchPrmtrCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(searchparametercontacttelecomperiod.getStart())+"\"");
		} else {
			s.addSrchPrmtrCntctTlcmPrdStrt("NULL");
		}

		if(searchparametercontacttelecomi == searchparametercontacttelecomlist.size()-1) {s.addSrchPrmtrCntctTlcmPrdStrt("]]");}


		/******************** SrchPrmtr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(searchparametercontacttelecomi == 0) {s.addSrchPrmtrCntctTlcmPrdEnd("[[");}
		if(searchparametercontacttelecomperiod.hasEnd()) {

			s.addSrchPrmtrCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(searchparametercontacttelecomperiod.getEnd())+"\"");
		} else {
			s.addSrchPrmtrCntctTlcmPrdEnd("NULL");
		}

		if(searchparametercontacttelecomi == searchparametercontacttelecomlist.size()-1) {s.addSrchPrmtrCntctTlcmPrdEnd("]]");}


		/******************** searchparametercontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse searchparametercontacttelecomuse = searchparametercontacttelecom.getUse();
		if(searchparametercontacttelecomuse!=null) {
		if(searchparametercontacttelecomi == 0) {

		s.addSrchPrmtrCntctTlcmUse("[[");		}
			s.addSrchPrmtrCntctTlcmUse(searchparametercontacttelecomuse.toCode());
		if(searchparametercontacttelecomi == searchparametercontacttelecomlist.size()-1) {

		s.addSrchPrmtrCntctTlcmUse("]]");		}

		} else {
			s.addSrchPrmtrCntctTlcmUse("NULL");
		}

		/******************** searchparametercontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem searchparametercontacttelecomsystem = searchparametercontacttelecom.getSystem();
		if(searchparametercontacttelecomsystem!=null) {
		if(searchparametercontacttelecomi == 0) {

		s.addSrchPrmtrCntctTlcmSys("[[");		}
			s.addSrchPrmtrCntctTlcmSys(searchparametercontacttelecomsystem.toCode());
		if(searchparametercontacttelecomi == searchparametercontacttelecomlist.size()-1) {

		s.addSrchPrmtrCntctTlcmSys("]]");		}

		} else {
			s.addSrchPrmtrCntctTlcmSys("NULL");
		}

		/******************** SrchPrmtr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(searchparametercontacttelecomi == 0) {s.addSrchPrmtrCntctTlcmRnk("[[");}
		if(searchparametercontacttelecom.hasRank()) {

			s.addSrchPrmtrCntctTlcmRnk(String.valueOf(searchparametercontacttelecom.getRank()));
		} else {
			s.addSrchPrmtrCntctTlcmRnk("NULL");
		}

		if(searchparametercontacttelecomi == searchparametercontacttelecomlist.size()-1) {s.addSrchPrmtrCntctTlcmRnk("]]");}


		 };
		 };
		/******************** searchparameterxpathusage ********************************************************************************/
		org.hl7.fhir.r4.model.SearchParameter.XPathUsageType searchparameterxpathusage = searchparameter.getXpathUsage();
		if(searchparameterxpathusage!=null) {
			s.addSrchPrmtrXpathUsg(searchparameterxpathusage.toCode());
		} else {
			s.addSrchPrmtrXpathUsg("NULL");
		}

		/******************** SrchPrmtr_Xpath ********************************************************************************/
		if(searchparameter.hasXpath()) {

			s.addSrchPrmtrXpath(String.valueOf(searchparameter.getXpath()));
		} else {
			s.addSrchPrmtrXpath("NULL");
		}


		/******************** SrchPrmtr_MultipleOr ********************************************************************************/
		if(searchparameter.hasMultipleOr()) {

			s.addSrchPrmtrMultipleOr(String.valueOf(searchparameter.getMultipleOr()));
		} else {
			s.addSrchPrmtrMultipleOr("NULL");
		}


		/******************** SrchPrmtr_Exprsn ********************************************************************************/
		if(searchparameter.hasExpression()) {

			s.addSrchPrmtrExprsn(String.valueOf(searchparameter.getExpression()));
		} else {
			s.addSrchPrmtrExprsn("NULL");
		}


		/******************** searchparametermodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.SearchParameter.SearchModifierCode>> searchparametermodifierlist = searchparameter.getModifier();
		for(int searchparametermodifieri = 0; searchparametermodifieri<searchparametermodifierlist.size();searchparametermodifieri++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.SearchParameter.SearchModifierCode>  searchparametermodifier = searchparametermodifierlist.get(searchparametermodifieri);
		if(searchparametermodifier!=null) {
			s.addSrchPrmtrMdfr(searchparametermodifier.getCode());
		} else {
			s.addSrchPrmtrMdfr("NULL");
		}
		 };

		/******************** SrchPrmtr_Chain ********************************************************************************/
		if(searchparameter.hasChain()) {

			String  array = "[";
			for(int incr=0; incr<searchparameter.getChain().size(); incr++) {
				array = array + searchparameter.getChain().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrchPrmtrChain(array);

		} else {
			s.addSrchPrmtrChain("NULL");
		}


		/******************** SrchPrmtr_MultipleAnd ********************************************************************************/
		if(searchparameter.hasMultipleAnd()) {

			s.addSrchPrmtrMultipleAnd(String.valueOf(searchparameter.getMultipleAnd()));
		} else {
			s.addSrchPrmtrMultipleAnd("NULL");
		}


		/******************** SrchPrmtr_Prpse ********************************************************************************/
		if(searchparameter.hasPurpose()) {

			s.addSrchPrmtrPrpse(String.valueOf(searchparameter.getPurpose()));
		} else {
			s.addSrchPrmtrPrpse("NULL");
		}


		/******************** SrchPrmtr_Url ********************************************************************************/
		if(searchparameter.hasUrl()) {

			s.addSrchPrmtrUrl(String.valueOf(searchparameter.getUrl()));
		} else {
			s.addSrchPrmtrUrl("NULL");
		}


		/******************** SrchPrmtr_DerivedFrom ********************************************************************************/
		if(searchparameter.hasDerivedFrom()) {

			s.addSrchPrmtrDerivedFrom(String.valueOf(searchparameter.getDerivedFrom()));
		} else {
			s.addSrchPrmtrDerivedFrom("NULL");
		}


		/******************** searchparameterjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> searchparameterjurisdictionlist = searchparameter.getJurisdiction();
		for(int searchparameterjurisdictioni = 0; searchparameterjurisdictioni<searchparameterjurisdictionlist.size();searchparameterjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  searchparameterjurisdiction = searchparameterjurisdictionlist.get(searchparameterjurisdictioni);

		/******************** SrchPrmtr_Jrsdctn_Txt ********************************************************************************/
		if(searchparameterjurisdictioni == 0) {s.addSrchPrmtrJrsdctnTxt("[");}
		if(searchparameterjurisdiction.hasText()) {

			s.addSrchPrmtrJrsdctnTxt(String.valueOf(searchparameterjurisdiction.getText()));
		} else {
			s.addSrchPrmtrJrsdctnTxt("NULL");
		}

		if(searchparameterjurisdictioni == searchparameterjurisdictionlist.size()-1) {s.addSrchPrmtrJrsdctnTxt("]");}


		/******************** searchparameterjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> searchparameterjurisdictioncodinglist = searchparameterjurisdiction.getCoding();
		for(int searchparameterjurisdictioncodingi = 0; searchparameterjurisdictioncodingi<searchparameterjurisdictioncodinglist.size();searchparameterjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  searchparameterjurisdictioncoding = searchparameterjurisdictioncodinglist.get(searchparameterjurisdictioncodingi);

		/******************** SrchPrmtr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(searchparameterjurisdictioncodingi == 0) {s.addSrchPrmtrJrsdctnCdgDsply("[[");}
		if(searchparameterjurisdictioncoding.hasDisplay()) {

			s.addSrchPrmtrJrsdctnCdgDsply(String.valueOf(searchparameterjurisdictioncoding.getDisplay()));
		} else {
			s.addSrchPrmtrJrsdctnCdgDsply("NULL");
		}

		if(searchparameterjurisdictioncodingi == searchparameterjurisdictioncodinglist.size()-1) {s.addSrchPrmtrJrsdctnCdgDsply("]]");}


		/******************** SrchPrmtr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(searchparameterjurisdictioncodingi == 0) {s.addSrchPrmtrJrsdctnCdgVrsn("[[");}
		if(searchparameterjurisdictioncoding.hasVersion()) {

			s.addSrchPrmtrJrsdctnCdgVrsn(String.valueOf(searchparameterjurisdictioncoding.getVersion()));
		} else {
			s.addSrchPrmtrJrsdctnCdgVrsn("NULL");
		}

		if(searchparameterjurisdictioncodingi == searchparameterjurisdictioncodinglist.size()-1) {s.addSrchPrmtrJrsdctnCdgVrsn("]]");}


		/******************** SrchPrmtr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(searchparameterjurisdictioncodingi == 0) {s.addSrchPrmtrJrsdctnCdgCd("[[");}
		if(searchparameterjurisdictioncoding.hasCode()) {

			s.addSrchPrmtrJrsdctnCdgCd(String.valueOf(searchparameterjurisdictioncoding.getCode()));
		} else {
			s.addSrchPrmtrJrsdctnCdgCd("NULL");
		}

		if(searchparameterjurisdictioncodingi == searchparameterjurisdictioncodinglist.size()-1) {s.addSrchPrmtrJrsdctnCdgCd("]]");}


		/******************** SrchPrmtr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(searchparameterjurisdictioncodingi == 0) {s.addSrchPrmtrJrsdctnCdgUsrSltd("[[");}
		if(searchparameterjurisdictioncoding.hasUserSelected()) {

			s.addSrchPrmtrJrsdctnCdgUsrSltd(String.valueOf(searchparameterjurisdictioncoding.getUserSelected()));
		} else {
			s.addSrchPrmtrJrsdctnCdgUsrSltd("NULL");
		}

		if(searchparameterjurisdictioncodingi == searchparameterjurisdictioncodinglist.size()-1) {s.addSrchPrmtrJrsdctnCdgUsrSltd("]]");}


		/******************** SrchPrmtr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(searchparameterjurisdictioncodingi == 0) {s.addSrchPrmtrJrsdctnCdgSys("[[");}
		if(searchparameterjurisdictioncoding.hasSystem()) {

			s.addSrchPrmtrJrsdctnCdgSys(String.valueOf(searchparameterjurisdictioncoding.getSystem()));
		} else {
			s.addSrchPrmtrJrsdctnCdgSys("NULL");
		}

		if(searchparameterjurisdictioncodingi == searchparameterjurisdictioncodinglist.size()-1) {s.addSrchPrmtrJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** searchparameterusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> searchparameterusecontextlist = searchparameter.getUseContext();
		for(int searchparameterusecontexti = 0; searchparameterusecontexti<searchparameterusecontextlist.size();searchparameterusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  searchparameterusecontext = searchparameterusecontextlist.get(searchparameterusecontexti);

		/******************** searchparameterusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding searchparameterusecontextcode = searchparameterusecontext.getCode();

		/******************** SrchPrmtr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtCdDsply("[");}
		if(searchparameterusecontextcode.hasDisplay()) {

			s.addSrchPrmtrUseCntxtCdDsply(String.valueOf(searchparameterusecontextcode.getDisplay()));
		} else {
			s.addSrchPrmtrUseCntxtCdDsply("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtCdDsply("]");}


		/******************** SrchPrmtr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtCdVrsn("[");}
		if(searchparameterusecontextcode.hasVersion()) {

			s.addSrchPrmtrUseCntxtCdVrsn(String.valueOf(searchparameterusecontextcode.getVersion()));
		} else {
			s.addSrchPrmtrUseCntxtCdVrsn("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtCdVrsn("]");}


		/******************** SrchPrmtr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtCdUsrSltd("[");}
		if(searchparameterusecontextcode.hasUserSelected()) {

			s.addSrchPrmtrUseCntxtCdUsrSltd(String.valueOf(searchparameterusecontextcode.getUserSelected()));
		} else {
			s.addSrchPrmtrUseCntxtCdUsrSltd("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtCdUsrSltd("]");}


		/******************** SrchPrmtr_UseCntxt_Cd_Sys ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtCdSys("[");}
		if(searchparameterusecontextcode.hasSystem()) {

			s.addSrchPrmtrUseCntxtCdSys(String.valueOf(searchparameterusecontextcode.getSystem()));
		} else {
			s.addSrchPrmtrUseCntxtCdSys("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtCdSys("]");}


		/******************** SrchPrmtr_UseCntxt_VlRfrnc ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRfrnc("[");}
		if(searchparameterusecontext.hasValueReference()) {

			if(searchparameterusecontext.getValueReference().getReference() != null) {
			s.addSrchPrmtrUseCntxtVlRfrnc(searchparameterusecontext.getValueReference().getReference());
			}
		} else {
			s.addSrchPrmtrUseCntxtVlRfrnc("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRfrnc("]");}


		/******************** searchparameterusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept searchparameterusecontextvaluecodeableconcept = searchparameterusecontext.getValueCodeableConcept();

		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlCdbleCncptTxt("[");}
		if(searchparameterusecontextvaluecodeableconcept.hasText()) {

			s.addSrchPrmtrUseCntxtVlCdbleCncptTxt(String.valueOf(searchparameterusecontextvaluecodeableconcept.getText()));
		} else {
			s.addSrchPrmtrUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlCdbleCncptTxt("]");}


		/******************** searchparameterusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> searchparameterusecontextvaluecodeableconceptcodinglist = searchparameterusecontextvaluecodeableconcept.getCoding();
		for(int searchparameterusecontextvaluecodeableconceptcodingi = 0; searchparameterusecontextvaluecodeableconceptcodingi<searchparameterusecontextvaluecodeableconceptcodinglist.size();searchparameterusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  searchparameterusecontextvaluecodeableconceptcoding = searchparameterusecontextvaluecodeableconceptcodinglist.get(searchparameterusecontextvaluecodeableconceptcodingi);

		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcodingi == 0) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(searchparameterusecontextvaluecodeableconceptcoding.hasDisplay()) {

			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgDsply(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(searchparameterusecontextvaluecodeableconceptcodingi == searchparameterusecontextvaluecodeableconceptcodinglist.size()-1) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcodingi == 0) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(searchparameterusecontextvaluecodeableconceptcoding.hasVersion()) {

			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(searchparameterusecontextvaluecodeableconceptcodingi == searchparameterusecontextvaluecodeableconceptcodinglist.size()-1) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcodingi == 0) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgCd("[[");}
		if(searchparameterusecontextvaluecodeableconceptcoding.hasCode()) {

			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgCd(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(searchparameterusecontextvaluecodeableconceptcodingi == searchparameterusecontextvaluecodeableconceptcodinglist.size()-1) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcodingi == 0) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(searchparameterusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(searchparameterusecontextvaluecodeableconceptcodingi == searchparameterusecontextvaluecodeableconceptcodinglist.size()-1) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcodingi == 0) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgSys("[[");}
		if(searchparameterusecontextvaluecodeableconceptcoding.hasSystem()) {

			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgSys(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			s.addSrchPrmtrUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(searchparameterusecontextvaluecodeableconceptcodingi == searchparameterusecontextvaluecodeableconceptcodinglist.size()-1) {s.addSrchPrmtrUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** searchparameterusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range searchparameterusecontextvaluerange = searchparameterusecontext.getValueRange();

		/******************** searchparameterusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluerangelow = searchparameterusecontextvaluerange.getLow();

		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngLwVl("[");}
		if(searchparameterusecontextvaluerangelow.hasValue()) {

			s.addSrchPrmtrUseCntxtVlRngLwVl(String.valueOf(searchparameterusecontextvaluerangelow.getValue()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngLwVl("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngLwVl("]");}


		/******************** searchparameterusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator searchparameterusecontextvaluerangelowcomparator = searchparameterusecontextvaluerangelow.getComparator();
		if(searchparameterusecontextvaluerangelowcomparator!=null) {
		if(searchparameterusecontexti == 0) {

		s.addSrchPrmtrUseCntxtVlRngLwCmprtr("[");		}
			s.addSrchPrmtrUseCntxtVlRngLwCmprtr(searchparameterusecontextvaluerangelowcomparator.toCode());
		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {

		s.addSrchPrmtrUseCntxtVlRngLwCmprtr("]");		}

		} else {
			s.addSrchPrmtrUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngLwCd("[");}
		if(searchparameterusecontextvaluerangelow.hasCode()) {

			s.addSrchPrmtrUseCntxtVlRngLwCd(String.valueOf(searchparameterusecontextvaluerangelow.getCode()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngLwCd("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngLwCd("]");}


		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngLwUnt("[");}
		if(searchparameterusecontextvaluerangelow.hasUnit()) {

			s.addSrchPrmtrUseCntxtVlRngLwUnt(String.valueOf(searchparameterusecontextvaluerangelow.getUnit()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngLwUnt("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngLwUnt("]");}


		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngLwSys("[");}
		if(searchparameterusecontextvaluerangelow.hasSystem()) {

			s.addSrchPrmtrUseCntxtVlRngLwSys(String.valueOf(searchparameterusecontextvaluerangelow.getSystem()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngLwSys("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngLwSys("]");}


		/******************** searchparameterusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluerangehigh = searchparameterusecontextvaluerange.getHigh();

		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngHiVl("[");}
		if(searchparameterusecontextvaluerangehigh.hasValue()) {

			s.addSrchPrmtrUseCntxtVlRngHiVl(String.valueOf(searchparameterusecontextvaluerangehigh.getValue()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngHiVl("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngHiVl("]");}


		/******************** searchparameterusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator searchparameterusecontextvaluerangehighcomparator = searchparameterusecontextvaluerangehigh.getComparator();
		if(searchparameterusecontextvaluerangehighcomparator!=null) {
		if(searchparameterusecontexti == 0) {

		s.addSrchPrmtrUseCntxtVlRngHiCmprtr("[");		}
			s.addSrchPrmtrUseCntxtVlRngHiCmprtr(searchparameterusecontextvaluerangehighcomparator.toCode());
		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {

		s.addSrchPrmtrUseCntxtVlRngHiCmprtr("]");		}

		} else {
			s.addSrchPrmtrUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngHiCd("[");}
		if(searchparameterusecontextvaluerangehigh.hasCode()) {

			s.addSrchPrmtrUseCntxtVlRngHiCd(String.valueOf(searchparameterusecontextvaluerangehigh.getCode()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngHiCd("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngHiCd("]");}


		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngHiUnt("[");}
		if(searchparameterusecontextvaluerangehigh.hasUnit()) {

			s.addSrchPrmtrUseCntxtVlRngHiUnt(String.valueOf(searchparameterusecontextvaluerangehigh.getUnit()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngHiUnt("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngHiUnt("]");}


		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlRngHiSys("[");}
		if(searchparameterusecontextvaluerangehigh.hasSystem()) {

			s.addSrchPrmtrUseCntxtVlRngHiSys(String.valueOf(searchparameterusecontextvaluerangehigh.getSystem()));
		} else {
			s.addSrchPrmtrUseCntxtVlRngHiSys("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlRngHiSys("]");}


		/******************** searchparameterusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluequantity = searchparameterusecontext.getValueQuantity();

		/******************** SrchPrmtr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlQntyVl("[");}
		if(searchparameterusecontextvaluequantity.hasValue()) {

			s.addSrchPrmtrUseCntxtVlQntyVl(String.valueOf(searchparameterusecontextvaluequantity.getValue()));
		} else {
			s.addSrchPrmtrUseCntxtVlQntyVl("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlQntyVl("]");}


		/******************** searchparameterusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator searchparameterusecontextvaluequantitycomparator = searchparameterusecontextvaluequantity.getComparator();
		if(searchparameterusecontextvaluequantitycomparator!=null) {
		if(searchparameterusecontexti == 0) {

		s.addSrchPrmtrUseCntxtVlQntyCmprtr("[");		}
			s.addSrchPrmtrUseCntxtVlQntyCmprtr(searchparameterusecontextvaluequantitycomparator.toCode());
		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {

		s.addSrchPrmtrUseCntxtVlQntyCmprtr("]");		}

		} else {
			s.addSrchPrmtrUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** SrchPrmtr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlQntyCd("[");}
		if(searchparameterusecontextvaluequantity.hasCode()) {

			s.addSrchPrmtrUseCntxtVlQntyCd(String.valueOf(searchparameterusecontextvaluequantity.getCode()));
		} else {
			s.addSrchPrmtrUseCntxtVlQntyCd("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlQntyCd("]");}


		/******************** SrchPrmtr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlQntyUnt("[");}
		if(searchparameterusecontextvaluequantity.hasUnit()) {

			s.addSrchPrmtrUseCntxtVlQntyUnt(String.valueOf(searchparameterusecontextvaluequantity.getUnit()));
		} else {
			s.addSrchPrmtrUseCntxtVlQntyUnt("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlQntyUnt("]");}


		/******************** SrchPrmtr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(searchparameterusecontexti == 0) {s.addSrchPrmtrUseCntxtVlQntySys("[");}
		if(searchparameterusecontextvaluequantity.hasSystem()) {

			s.addSrchPrmtrUseCntxtVlQntySys(String.valueOf(searchparameterusecontextvaluequantity.getSystem()));
		} else {
			s.addSrchPrmtrUseCntxtVlQntySys("NULL");
		}

		if(searchparameterusecontexti == searchparameterusecontextlist.size()-1) {s.addSrchPrmtrUseCntxtVlQntySys("]");}


		 };
		/******************** SrchPrmtr_Exprmtl ********************************************************************************/
		if(searchparameter.hasExperimental()) {

			s.addSrchPrmtrExprmtl(String.valueOf(searchparameter.getExperimental()));
		} else {
			s.addSrchPrmtrExprmtl("NULL");
		}


		/******************** SrchPrmtr_Pblshr ********************************************************************************/
		if(searchparameter.hasPublisher()) {

			s.addSrchPrmtrPblshr(String.valueOf(searchparameter.getPublisher()));
		} else {
			s.addSrchPrmtrPblshr("NULL");
		}


		/******************** searchparametercomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SearchParameter.SearchParameterComponentComponent> searchparametercomponentlist = searchparameter.getComponent();
		for(int searchparametercomponenti = 0; searchparametercomponenti<searchparametercomponentlist.size();searchparametercomponenti++ ) {
		org.hl7.fhir.r4.model.SearchParameter.SearchParameterComponentComponent  searchparametercomponent = searchparametercomponentlist.get(searchparametercomponenti);

		/******************** SrchPrmtr_Cmpnt_Dfn ********************************************************************************/
		if(searchparametercomponenti == 0) {s.addSrchPrmtrCmpntDfn("[");}
		if(searchparametercomponent.hasDefinition()) {

			s.addSrchPrmtrCmpntDfn(String.valueOf(searchparametercomponent.getDefinition()));
		} else {
			s.addSrchPrmtrCmpntDfn("NULL");
		}

		if(searchparametercomponenti == searchparametercomponentlist.size()-1) {s.addSrchPrmtrCmpntDfn("]");}


		/******************** SrchPrmtr_Cmpnt_Exprsn ********************************************************************************/
		if(searchparametercomponenti == 0) {s.addSrchPrmtrCmpntExprsn("[");}
		if(searchparametercomponent.hasExpression()) {

			s.addSrchPrmtrCmpntExprsn(String.valueOf(searchparametercomponent.getExpression()));
		} else {
			s.addSrchPrmtrCmpntExprsn("NULL");
		}

		if(searchparametercomponenti == searchparametercomponentlist.size()-1) {s.addSrchPrmtrCmpntExprsn("]");}


		 };
		return s;
	}
}
