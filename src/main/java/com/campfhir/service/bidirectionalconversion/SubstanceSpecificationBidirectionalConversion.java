package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceSpecification;
public class SubstanceSpecificationBidirectionalConversion 
{
	public SubstanceSpecification SubstanceSpecifications(org.hl7.fhir.r4.model.SubstanceSpecification substancespecification) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceSpecification s = new  main.java.com.campfhir.model.SubstanceSpecification();

		/******************** id ********************************************************************************/
		s.setId(substancespecification.getIdElement().getIdPart());

		/******************** substancespecificationname ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent> substancespecificationnamelist = substancespecification.getName();
		for(int substancespecificationnamei = 0; substancespecificationnamei<substancespecificationnamelist.size();substancespecificationnamei++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameComponent  substancespecificationname = substancespecificationnamelist.get(substancespecificationnamei);

		/******************** substancespecificationnametype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnametype = substancespecificationname.getType();

		/******************** SbstncSpcfctn_Nm_Typ_Txt ********************************************************************************/
		if(substancespecificationnamei == 0) {s.addSbstncSpcfctnNmTypTxt("[");}
		if(substancespecificationnametype.hasText()) {

			s.addSbstncSpcfctnNmTypTxt(String.valueOf(substancespecificationnametype.getText()));
		} else {
			s.addSbstncSpcfctnNmTypTxt("NULL");
		}

		if(substancespecificationnamei == substancespecificationnamelist.size()-1) {s.addSbstncSpcfctnNmTypTxt("]");}


		/******************** substancespecificationnametypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationnametypecodinglist = substancespecificationnametype.getCoding();
		for(int substancespecificationnametypecodingi = 0; substancespecificationnametypecodingi<substancespecificationnametypecodinglist.size();substancespecificationnametypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationnametypecoding = substancespecificationnametypecodinglist.get(substancespecificationnametypecodingi);

		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnametypecodingi == 0) {s.addSbstncSpcfctnNmTypCdgDsply("[[");}
		if(substancespecificationnametypecoding.hasDisplay()) {

			s.addSbstncSpcfctnNmTypCdgDsply(String.valueOf(substancespecificationnametypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnNmTypCdgDsply("NULL");
		}

		if(substancespecificationnametypecodingi == substancespecificationnametypecodinglist.size()-1) {s.addSbstncSpcfctnNmTypCdgDsply("]]");}


		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnametypecodingi == 0) {s.addSbstncSpcfctnNmTypCdgVrsn("[[");}
		if(substancespecificationnametypecoding.hasVersion()) {

			s.addSbstncSpcfctnNmTypCdgVrsn(String.valueOf(substancespecificationnametypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnNmTypCdgVrsn("NULL");
		}

		if(substancespecificationnametypecodingi == substancespecificationnametypecodinglist.size()-1) {s.addSbstncSpcfctnNmTypCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationnametypecodingi == 0) {s.addSbstncSpcfctnNmTypCdgCd("[[");}
		if(substancespecificationnametypecoding.hasCode()) {

			s.addSbstncSpcfctnNmTypCdgCd(String.valueOf(substancespecificationnametypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnNmTypCdgCd("NULL");
		}

		if(substancespecificationnametypecodingi == substancespecificationnametypecodinglist.size()-1) {s.addSbstncSpcfctnNmTypCdgCd("]]");}


		/******************** SbstncSpcfctn_Nm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnametypecodingi == 0) {s.addSbstncSpcfctnNmTypCdgUsrSltd("[[");}
		if(substancespecificationnametypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnNmTypCdgUsrSltd(String.valueOf(substancespecificationnametypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnNmTypCdgUsrSltd("NULL");
		}

		if(substancespecificationnametypecodingi == substancespecificationnametypecodinglist.size()-1) {s.addSbstncSpcfctnNmTypCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationnametypecodingi == 0) {s.addSbstncSpcfctnNmTypCdgSys("[[");}
		if(substancespecificationnametypecoding.hasSystem()) {

			s.addSbstncSpcfctnNmTypCdgSys(String.valueOf(substancespecificationnametypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnNmTypCdgSys("NULL");
		}

		if(substancespecificationnametypecodingi == substancespecificationnametypecodinglist.size()-1) {s.addSbstncSpcfctnNmTypCdgSys("]]");}


		 };
		/******************** substancespecificationnamelanguage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> substancespecificationnamelanguagelist = substancespecificationname.getLanguage();
		for(int substancespecificationnamelanguagei = 0; substancespecificationnamelanguagei<substancespecificationnamelanguagelist.size();substancespecificationnamelanguagei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  substancespecificationnamelanguage = substancespecificationnamelanguagelist.get(substancespecificationnamelanguagei);

		/******************** SbstncSpcfctn_Nm_Lnguage_Txt ********************************************************************************/
		if(substancespecificationnamelanguagei == 0) {s.addSbstncSpcfctnNmLnguageTxt("[[");}
		if(substancespecificationnamelanguage.hasText()) {

			s.addSbstncSpcfctnNmLnguageTxt(String.valueOf(substancespecificationnamelanguage.getText()));
		} else {
			s.addSbstncSpcfctnNmLnguageTxt("NULL");
		}

		if(substancespecificationnamelanguagei == substancespecificationnamelanguagelist.size()-1) {s.addSbstncSpcfctnNmLnguageTxt("]]");}


		/******************** substancespecificationnamelanguagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationnamelanguagecodinglist = substancespecificationnamelanguage.getCoding();
		for(int substancespecificationnamelanguagecodingi = 0; substancespecificationnamelanguagecodingi<substancespecificationnamelanguagecodinglist.size();substancespecificationnamelanguagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationnamelanguagecoding = substancespecificationnamelanguagecodinglist.get(substancespecificationnamelanguagecodingi);

		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamelanguagecodingi == 0) {s.addSbstncSpcfctnNmLnguageCdgDsply("[[[");}
		if(substancespecificationnamelanguagecoding.hasDisplay()) {

			s.addSbstncSpcfctnNmLnguageCdgDsply(String.valueOf(substancespecificationnamelanguagecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnNmLnguageCdgDsply("NULL");
		}

		if(substancespecificationnamelanguagecodingi == substancespecificationnamelanguagecodinglist.size()-1) {s.addSbstncSpcfctnNmLnguageCdgDsply("]]]");}


		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamelanguagecodingi == 0) {s.addSbstncSpcfctnNmLnguageCdgVrsn("[[[");}
		if(substancespecificationnamelanguagecoding.hasVersion()) {

			s.addSbstncSpcfctnNmLnguageCdgVrsn(String.valueOf(substancespecificationnamelanguagecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnNmLnguageCdgVrsn("NULL");
		}

		if(substancespecificationnamelanguagecodingi == substancespecificationnamelanguagecodinglist.size()-1) {s.addSbstncSpcfctnNmLnguageCdgVrsn("]]]");}


		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamelanguagecodingi == 0) {s.addSbstncSpcfctnNmLnguageCdgCd("[[[");}
		if(substancespecificationnamelanguagecoding.hasCode()) {

			s.addSbstncSpcfctnNmLnguageCdgCd(String.valueOf(substancespecificationnamelanguagecoding.getCode()));
		} else {
			s.addSbstncSpcfctnNmLnguageCdgCd("NULL");
		}

		if(substancespecificationnamelanguagecodingi == substancespecificationnamelanguagecodinglist.size()-1) {s.addSbstncSpcfctnNmLnguageCdgCd("]]]");}


		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamelanguagecodingi == 0) {s.addSbstncSpcfctnNmLnguageCdgUsrSltd("[[[");}
		if(substancespecificationnamelanguagecoding.hasUserSelected()) {

			s.addSbstncSpcfctnNmLnguageCdgUsrSltd(String.valueOf(substancespecificationnamelanguagecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnNmLnguageCdgUsrSltd("NULL");
		}

		if(substancespecificationnamelanguagecodingi == substancespecificationnamelanguagecodinglist.size()-1) {s.addSbstncSpcfctnNmLnguageCdgUsrSltd("]]]");}


		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamelanguagecodingi == 0) {s.addSbstncSpcfctnNmLnguageCdgSys("[[[");}
		if(substancespecificationnamelanguagecoding.hasSystem()) {

			s.addSbstncSpcfctnNmLnguageCdgSys(String.valueOf(substancespecificationnamelanguagecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnNmLnguageCdgSys("NULL");
		}

		if(substancespecificationnamelanguagecodingi == substancespecificationnamelanguagecodinglist.size()-1) {s.addSbstncSpcfctnNmLnguageCdgSys("]]]");}


		 };
		 };
		/******************** SbstncSpcfctn_Nm_Src ********************************************************************************/
		if(substancespecificationname.hasSource()) {

			String  array = "[";
			for(int incr=0; incr<substancespecificationname.getSource().size(); incr++) {
				array = array + substancespecificationname.getSource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncSpcfctnNmSrc(array);

		} else {
			s.addSbstncSpcfctnNmSrc("NULL");
		}


		/******************** substancespecificationnamestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnamestatus = substancespecificationname.getStatus();

		/******************** SbstncSpcfctn_Nm_Sts_Txt ********************************************************************************/
		if(substancespecificationnamestatus.hasText()) {

			s.addSbstncSpcfctnNmStsTxt(String.valueOf(substancespecificationnamestatus.getText()));
		} else {
			s.addSbstncSpcfctnNmStsTxt("NULL");
		}


		/******************** substancespecificationnamestatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationnamestatuscodinglist = substancespecificationnamestatus.getCoding();
		for(int substancespecificationnamestatuscodingi = 0; substancespecificationnamestatuscodingi<substancespecificationnamestatuscodinglist.size();substancespecificationnamestatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationnamestatuscoding = substancespecificationnamestatuscodinglist.get(substancespecificationnamestatuscodingi);

		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamestatuscodingi == 0) {s.addSbstncSpcfctnNmStsCdgDsply("[[");}
		if(substancespecificationnamestatuscoding.hasDisplay()) {

			s.addSbstncSpcfctnNmStsCdgDsply(String.valueOf(substancespecificationnamestatuscoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnNmStsCdgDsply("NULL");
		}

		if(substancespecificationnamestatuscodingi == substancespecificationnamestatuscodinglist.size()-1) {s.addSbstncSpcfctnNmStsCdgDsply("]]");}


		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamestatuscodingi == 0) {s.addSbstncSpcfctnNmStsCdgVrsn("[[");}
		if(substancespecificationnamestatuscoding.hasVersion()) {

			s.addSbstncSpcfctnNmStsCdgVrsn(String.valueOf(substancespecificationnamestatuscoding.getVersion()));
		} else {
			s.addSbstncSpcfctnNmStsCdgVrsn("NULL");
		}

		if(substancespecificationnamestatuscodingi == substancespecificationnamestatuscodinglist.size()-1) {s.addSbstncSpcfctnNmStsCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamestatuscodingi == 0) {s.addSbstncSpcfctnNmStsCdgCd("[[");}
		if(substancespecificationnamestatuscoding.hasCode()) {

			s.addSbstncSpcfctnNmStsCdgCd(String.valueOf(substancespecificationnamestatuscoding.getCode()));
		} else {
			s.addSbstncSpcfctnNmStsCdgCd("NULL");
		}

		if(substancespecificationnamestatuscodingi == substancespecificationnamestatuscodinglist.size()-1) {s.addSbstncSpcfctnNmStsCdgCd("]]");}


		/******************** SbstncSpcfctn_Nm_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamestatuscodingi == 0) {s.addSbstncSpcfctnNmStsCdgUsrSltd("[[");}
		if(substancespecificationnamestatuscoding.hasUserSelected()) {

			s.addSbstncSpcfctnNmStsCdgUsrSltd(String.valueOf(substancespecificationnamestatuscoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnNmStsCdgUsrSltd("NULL");
		}

		if(substancespecificationnamestatuscodingi == substancespecificationnamestatuscodinglist.size()-1) {s.addSbstncSpcfctnNmStsCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamestatuscodingi == 0) {s.addSbstncSpcfctnNmStsCdgSys("[[");}
		if(substancespecificationnamestatuscoding.hasSystem()) {

			s.addSbstncSpcfctnNmStsCdgSys(String.valueOf(substancespecificationnamestatuscoding.getSystem()));
		} else {
			s.addSbstncSpcfctnNmStsCdgSys("NULL");
		}

		if(substancespecificationnamestatuscodingi == substancespecificationnamestatuscodinglist.size()-1) {s.addSbstncSpcfctnNmStsCdgSys("]]");}


		 };
		/******************** substancespecificationnamedomain ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> substancespecificationnamedomainlist = substancespecificationname.getDomain();
		for(int substancespecificationnamedomaini = 0; substancespecificationnamedomaini<substancespecificationnamedomainlist.size();substancespecificationnamedomaini++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  substancespecificationnamedomain = substancespecificationnamedomainlist.get(substancespecificationnamedomaini);

		/******************** SbstncSpcfctn_Nm_Domain_Txt ********************************************************************************/
		if(substancespecificationnamedomaini == 0) {s.addSbstncSpcfctnNmDomainTxt("[[");}
		if(substancespecificationnamedomain.hasText()) {

			s.addSbstncSpcfctnNmDomainTxt(String.valueOf(substancespecificationnamedomain.getText()));
		} else {
			s.addSbstncSpcfctnNmDomainTxt("NULL");
		}

		if(substancespecificationnamedomaini == substancespecificationnamedomainlist.size()-1) {s.addSbstncSpcfctnNmDomainTxt("]]");}


		/******************** substancespecificationnamedomaincoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationnamedomaincodinglist = substancespecificationnamedomain.getCoding();
		for(int substancespecificationnamedomaincodingi = 0; substancespecificationnamedomaincodingi<substancespecificationnamedomaincodinglist.size();substancespecificationnamedomaincodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationnamedomaincoding = substancespecificationnamedomaincodinglist.get(substancespecificationnamedomaincodingi);

		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamedomaincodingi == 0) {s.addSbstncSpcfctnNmDomainCdgDsply("[[[");}
		if(substancespecificationnamedomaincoding.hasDisplay()) {

			s.addSbstncSpcfctnNmDomainCdgDsply(String.valueOf(substancespecificationnamedomaincoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnNmDomainCdgDsply("NULL");
		}

		if(substancespecificationnamedomaincodingi == substancespecificationnamedomaincodinglist.size()-1) {s.addSbstncSpcfctnNmDomainCdgDsply("]]]");}


		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamedomaincodingi == 0) {s.addSbstncSpcfctnNmDomainCdgVrsn("[[[");}
		if(substancespecificationnamedomaincoding.hasVersion()) {

			s.addSbstncSpcfctnNmDomainCdgVrsn(String.valueOf(substancespecificationnamedomaincoding.getVersion()));
		} else {
			s.addSbstncSpcfctnNmDomainCdgVrsn("NULL");
		}

		if(substancespecificationnamedomaincodingi == substancespecificationnamedomaincodinglist.size()-1) {s.addSbstncSpcfctnNmDomainCdgVrsn("]]]");}


		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamedomaincodingi == 0) {s.addSbstncSpcfctnNmDomainCdgCd("[[[");}
		if(substancespecificationnamedomaincoding.hasCode()) {

			s.addSbstncSpcfctnNmDomainCdgCd(String.valueOf(substancespecificationnamedomaincoding.getCode()));
		} else {
			s.addSbstncSpcfctnNmDomainCdgCd("NULL");
		}

		if(substancespecificationnamedomaincodingi == substancespecificationnamedomaincodinglist.size()-1) {s.addSbstncSpcfctnNmDomainCdgCd("]]]");}


		/******************** SbstncSpcfctn_Nm_Domain_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamedomaincodingi == 0) {s.addSbstncSpcfctnNmDomainCdgUsrSltd("[[[");}
		if(substancespecificationnamedomaincoding.hasUserSelected()) {

			s.addSbstncSpcfctnNmDomainCdgUsrSltd(String.valueOf(substancespecificationnamedomaincoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnNmDomainCdgUsrSltd("NULL");
		}

		if(substancespecificationnamedomaincodingi == substancespecificationnamedomaincodinglist.size()-1) {s.addSbstncSpcfctnNmDomainCdgUsrSltd("]]]");}


		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamedomaincodingi == 0) {s.addSbstncSpcfctnNmDomainCdgSys("[[[");}
		if(substancespecificationnamedomaincoding.hasSystem()) {

			s.addSbstncSpcfctnNmDomainCdgSys(String.valueOf(substancespecificationnamedomaincoding.getSystem()));
		} else {
			s.addSbstncSpcfctnNmDomainCdgSys("NULL");
		}

		if(substancespecificationnamedomaincodingi == substancespecificationnamedomaincodinglist.size()-1) {s.addSbstncSpcfctnNmDomainCdgSys("]]]");}


		 };
		 };
		/******************** substancespecificationnamejurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> substancespecificationnamejurisdictionlist = substancespecificationname.getJurisdiction();
		for(int substancespecificationnamejurisdictioni = 0; substancespecificationnamejurisdictioni<substancespecificationnamejurisdictionlist.size();substancespecificationnamejurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  substancespecificationnamejurisdiction = substancespecificationnamejurisdictionlist.get(substancespecificationnamejurisdictioni);

		/******************** SbstncSpcfctn_Nm_Jrsdctn_Txt ********************************************************************************/
		if(substancespecificationnamejurisdictioni == 0) {s.addSbstncSpcfctnNmJrsdctnTxt("[[");}
		if(substancespecificationnamejurisdiction.hasText()) {

			s.addSbstncSpcfctnNmJrsdctnTxt(String.valueOf(substancespecificationnamejurisdiction.getText()));
		} else {
			s.addSbstncSpcfctnNmJrsdctnTxt("NULL");
		}

		if(substancespecificationnamejurisdictioni == substancespecificationnamejurisdictionlist.size()-1) {s.addSbstncSpcfctnNmJrsdctnTxt("]]");}


		/******************** substancespecificationnamejurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationnamejurisdictioncodinglist = substancespecificationnamejurisdiction.getCoding();
		for(int substancespecificationnamejurisdictioncodingi = 0; substancespecificationnamejurisdictioncodingi<substancespecificationnamejurisdictioncodinglist.size();substancespecificationnamejurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationnamejurisdictioncoding = substancespecificationnamejurisdictioncodinglist.get(substancespecificationnamejurisdictioncodingi);

		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnamejurisdictioncodingi == 0) {s.addSbstncSpcfctnNmJrsdctnCdgDsply("[[[");}
		if(substancespecificationnamejurisdictioncoding.hasDisplay()) {

			s.addSbstncSpcfctnNmJrsdctnCdgDsply(String.valueOf(substancespecificationnamejurisdictioncoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnNmJrsdctnCdgDsply("NULL");
		}

		if(substancespecificationnamejurisdictioncodingi == substancespecificationnamejurisdictioncodinglist.size()-1) {s.addSbstncSpcfctnNmJrsdctnCdgDsply("]]]");}


		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnamejurisdictioncodingi == 0) {s.addSbstncSpcfctnNmJrsdctnCdgVrsn("[[[");}
		if(substancespecificationnamejurisdictioncoding.hasVersion()) {

			s.addSbstncSpcfctnNmJrsdctnCdgVrsn(String.valueOf(substancespecificationnamejurisdictioncoding.getVersion()));
		} else {
			s.addSbstncSpcfctnNmJrsdctnCdgVrsn("NULL");
		}

		if(substancespecificationnamejurisdictioncodingi == substancespecificationnamejurisdictioncodinglist.size()-1) {s.addSbstncSpcfctnNmJrsdctnCdgVrsn("]]]");}


		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(substancespecificationnamejurisdictioncodingi == 0) {s.addSbstncSpcfctnNmJrsdctnCdgCd("[[[");}
		if(substancespecificationnamejurisdictioncoding.hasCode()) {

			s.addSbstncSpcfctnNmJrsdctnCdgCd(String.valueOf(substancespecificationnamejurisdictioncoding.getCode()));
		} else {
			s.addSbstncSpcfctnNmJrsdctnCdgCd("NULL");
		}

		if(substancespecificationnamejurisdictioncodingi == substancespecificationnamejurisdictioncodinglist.size()-1) {s.addSbstncSpcfctnNmJrsdctnCdgCd("]]]");}


		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnamejurisdictioncodingi == 0) {s.addSbstncSpcfctnNmJrsdctnCdgUsrSltd("[[[");}
		if(substancespecificationnamejurisdictioncoding.hasUserSelected()) {

			s.addSbstncSpcfctnNmJrsdctnCdgUsrSltd(String.valueOf(substancespecificationnamejurisdictioncoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnNmJrsdctnCdgUsrSltd("NULL");
		}

		if(substancespecificationnamejurisdictioncodingi == substancespecificationnamejurisdictioncodinglist.size()-1) {s.addSbstncSpcfctnNmJrsdctnCdgUsrSltd("]]]");}


		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(substancespecificationnamejurisdictioncodingi == 0) {s.addSbstncSpcfctnNmJrsdctnCdgSys("[[[");}
		if(substancespecificationnamejurisdictioncoding.hasSystem()) {

			s.addSbstncSpcfctnNmJrsdctnCdgSys(String.valueOf(substancespecificationnamejurisdictioncoding.getSystem()));
		} else {
			s.addSbstncSpcfctnNmJrsdctnCdgSys("NULL");
		}

		if(substancespecificationnamejurisdictioncodingi == substancespecificationnamejurisdictioncodinglist.size()-1) {s.addSbstncSpcfctnNmJrsdctnCdgSys("]]]");}


		 };
		 };
		/******************** substancespecificationnameofficial ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent> substancespecificationnameofficiallist = substancespecificationname.getOfficial();
		for(int substancespecificationnameofficiali = 0; substancespecificationnameofficiali<substancespecificationnameofficiallist.size();substancespecificationnameofficiali++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationNameOfficialComponent  substancespecificationnameofficial = substancespecificationnameofficiallist.get(substancespecificationnameofficiali);

		/******************** substancespecificationnameofficialauthority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnameofficialauthority = substancespecificationnameofficial.getAuthority();

		/******************** SbstncSpcfctn_Nm_Official_Athrity_Txt ********************************************************************************/
		if(substancespecificationnameofficiali == 0) {s.addSbstncSpcfctnNmOfficialAthrityTxt("[[");}
		if(substancespecificationnameofficialauthority.hasText()) {

			s.addSbstncSpcfctnNmOfficialAthrityTxt(String.valueOf(substancespecificationnameofficialauthority.getText()));
		} else {
			s.addSbstncSpcfctnNmOfficialAthrityTxt("NULL");
		}

		if(substancespecificationnameofficiali == substancespecificationnameofficiallist.size()-1) {s.addSbstncSpcfctnNmOfficialAthrityTxt("]]");}


		/******************** substancespecificationnameofficialauthoritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationnameofficialauthoritycodinglist = substancespecificationnameofficialauthority.getCoding();
		for(int substancespecificationnameofficialauthoritycodingi = 0; substancespecificationnameofficialauthoritycodingi<substancespecificationnameofficialauthoritycodinglist.size();substancespecificationnameofficialauthoritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationnameofficialauthoritycoding = substancespecificationnameofficialauthoritycodinglist.get(substancespecificationnameofficialauthoritycodingi);

		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnameofficialauthoritycodingi == 0) {s.addSbstncSpcfctnNmOfficialAthrityCdgDsply("[[[");}
		if(substancespecificationnameofficialauthoritycoding.hasDisplay()) {

			s.addSbstncSpcfctnNmOfficialAthrityCdgDsply(String.valueOf(substancespecificationnameofficialauthoritycoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnNmOfficialAthrityCdgDsply("NULL");
		}

		if(substancespecificationnameofficialauthoritycodingi == substancespecificationnameofficialauthoritycodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialAthrityCdgDsply("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnameofficialauthoritycodingi == 0) {s.addSbstncSpcfctnNmOfficialAthrityCdgVrsn("[[[");}
		if(substancespecificationnameofficialauthoritycoding.hasVersion()) {

			s.addSbstncSpcfctnNmOfficialAthrityCdgVrsn(String.valueOf(substancespecificationnameofficialauthoritycoding.getVersion()));
		} else {
			s.addSbstncSpcfctnNmOfficialAthrityCdgVrsn("NULL");
		}

		if(substancespecificationnameofficialauthoritycodingi == substancespecificationnameofficialauthoritycodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialAthrityCdgVrsn("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Cd ********************************************************************************/
		if(substancespecificationnameofficialauthoritycodingi == 0) {s.addSbstncSpcfctnNmOfficialAthrityCdgCd("[[[");}
		if(substancespecificationnameofficialauthoritycoding.hasCode()) {

			s.addSbstncSpcfctnNmOfficialAthrityCdgCd(String.valueOf(substancespecificationnameofficialauthoritycoding.getCode()));
		} else {
			s.addSbstncSpcfctnNmOfficialAthrityCdgCd("NULL");
		}

		if(substancespecificationnameofficialauthoritycodingi == substancespecificationnameofficialauthoritycodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialAthrityCdgCd("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnameofficialauthoritycodingi == 0) {s.addSbstncSpcfctnNmOfficialAthrityCdgUsrSltd("[[[");}
		if(substancespecificationnameofficialauthoritycoding.hasUserSelected()) {

			s.addSbstncSpcfctnNmOfficialAthrityCdgUsrSltd(String.valueOf(substancespecificationnameofficialauthoritycoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnNmOfficialAthrityCdgUsrSltd("NULL");
		}

		if(substancespecificationnameofficialauthoritycodingi == substancespecificationnameofficialauthoritycodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialAthrityCdgUsrSltd("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Sys ********************************************************************************/
		if(substancespecificationnameofficialauthoritycodingi == 0) {s.addSbstncSpcfctnNmOfficialAthrityCdgSys("[[[");}
		if(substancespecificationnameofficialauthoritycoding.hasSystem()) {

			s.addSbstncSpcfctnNmOfficialAthrityCdgSys(String.valueOf(substancespecificationnameofficialauthoritycoding.getSystem()));
		} else {
			s.addSbstncSpcfctnNmOfficialAthrityCdgSys("NULL");
		}

		if(substancespecificationnameofficialauthoritycodingi == substancespecificationnameofficialauthoritycodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialAthrityCdgSys("]]]");}


		 };
		/******************** SbstncSpcfctn_Nm_Official_Dt ********************************************************************************/
		if(substancespecificationnameofficiali == 0) {s.addSbstncSpcfctnNmOfficialDt("[[");}
		if(substancespecificationnameofficial.hasDate()) {

			s.addSbstncSpcfctnNmOfficialDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationnameofficial.getDate())+"\"");
		} else {
			s.addSbstncSpcfctnNmOfficialDt("NULL");
		}

		if(substancespecificationnameofficiali == substancespecificationnameofficiallist.size()-1) {s.addSbstncSpcfctnNmOfficialDt("]]");}


		/******************** substancespecificationnameofficialstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationnameofficialstatus = substancespecificationnameofficial.getStatus();

		/******************** SbstncSpcfctn_Nm_Official_Sts_Txt ********************************************************************************/
		if(substancespecificationnameofficiali == 0) {s.addSbstncSpcfctnNmOfficialStsTxt("[[");}
		if(substancespecificationnameofficialstatus.hasText()) {

			s.addSbstncSpcfctnNmOfficialStsTxt(String.valueOf(substancespecificationnameofficialstatus.getText()));
		} else {
			s.addSbstncSpcfctnNmOfficialStsTxt("NULL");
		}

		if(substancespecificationnameofficiali == substancespecificationnameofficiallist.size()-1) {s.addSbstncSpcfctnNmOfficialStsTxt("]]");}


		/******************** substancespecificationnameofficialstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationnameofficialstatuscodinglist = substancespecificationnameofficialstatus.getCoding();
		for(int substancespecificationnameofficialstatuscodingi = 0; substancespecificationnameofficialstatuscodingi<substancespecificationnameofficialstatuscodinglist.size();substancespecificationnameofficialstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationnameofficialstatuscoding = substancespecificationnameofficialstatuscodinglist.get(substancespecificationnameofficialstatuscodingi);

		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationnameofficialstatuscodingi == 0) {s.addSbstncSpcfctnNmOfficialStsCdgDsply("[[[");}
		if(substancespecificationnameofficialstatuscoding.hasDisplay()) {

			s.addSbstncSpcfctnNmOfficialStsCdgDsply(String.valueOf(substancespecificationnameofficialstatuscoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnNmOfficialStsCdgDsply("NULL");
		}

		if(substancespecificationnameofficialstatuscodingi == substancespecificationnameofficialstatuscodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialStsCdgDsply("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationnameofficialstatuscodingi == 0) {s.addSbstncSpcfctnNmOfficialStsCdgVrsn("[[[");}
		if(substancespecificationnameofficialstatuscoding.hasVersion()) {

			s.addSbstncSpcfctnNmOfficialStsCdgVrsn(String.valueOf(substancespecificationnameofficialstatuscoding.getVersion()));
		} else {
			s.addSbstncSpcfctnNmOfficialStsCdgVrsn("NULL");
		}

		if(substancespecificationnameofficialstatuscodingi == substancespecificationnameofficialstatuscodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialStsCdgVrsn("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationnameofficialstatuscodingi == 0) {s.addSbstncSpcfctnNmOfficialStsCdgCd("[[[");}
		if(substancespecificationnameofficialstatuscoding.hasCode()) {

			s.addSbstncSpcfctnNmOfficialStsCdgCd(String.valueOf(substancespecificationnameofficialstatuscoding.getCode()));
		} else {
			s.addSbstncSpcfctnNmOfficialStsCdgCd("NULL");
		}

		if(substancespecificationnameofficialstatuscodingi == substancespecificationnameofficialstatuscodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialStsCdgCd("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationnameofficialstatuscodingi == 0) {s.addSbstncSpcfctnNmOfficialStsCdgUsrSltd("[[[");}
		if(substancespecificationnameofficialstatuscoding.hasUserSelected()) {

			s.addSbstncSpcfctnNmOfficialStsCdgUsrSltd(String.valueOf(substancespecificationnameofficialstatuscoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnNmOfficialStsCdgUsrSltd("NULL");
		}

		if(substancespecificationnameofficialstatuscodingi == substancespecificationnameofficialstatuscodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialStsCdgUsrSltd("]]]");}


		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationnameofficialstatuscodingi == 0) {s.addSbstncSpcfctnNmOfficialStsCdgSys("[[[");}
		if(substancespecificationnameofficialstatuscoding.hasSystem()) {

			s.addSbstncSpcfctnNmOfficialStsCdgSys(String.valueOf(substancespecificationnameofficialstatuscoding.getSystem()));
		} else {
			s.addSbstncSpcfctnNmOfficialStsCdgSys("NULL");
		}

		if(substancespecificationnameofficialstatuscodingi == substancespecificationnameofficialstatuscodinglist.size()-1) {s.addSbstncSpcfctnNmOfficialStsCdgSys("]]]");}


		 };
		 };
		/******************** SbstncSpcfctn_Nm_Preferred ********************************************************************************/
		if(substancespecificationname.hasPreferred()) {

			s.addSbstncSpcfctnNmPreferred(String.valueOf(substancespecificationname.getPreferred()));
		} else {
			s.addSbstncSpcfctnNmPreferred("NULL");
		}


		 };
		/******************** substancespecificationproperty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent> substancespecificationpropertylist = substancespecification.getProperty();
		for(int substancespecificationpropertyi = 0; substancespecificationpropertyi<substancespecificationpropertylist.size();substancespecificationpropertyi++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationPropertyComponent  substancespecificationproperty = substancespecificationpropertylist.get(substancespecificationpropertyi);

		/******************** SbstncSpcfctn_Prpty_Prmtrs ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyPrmtrs("[");}
		if(substancespecificationproperty.hasParameters()) {

			s.addSbstncSpcfctnPrptyPrmtrs(String.valueOf(substancespecificationproperty.getParameters()));
		} else {
			s.addSbstncSpcfctnPrptyPrmtrs("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyPrmtrs("]");}


		/******************** substancespecificationpropertycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertycode = substancespecificationproperty.getCode();

		/******************** SbstncSpcfctn_Prpty_Cd_Txt ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyCdTxt("[");}
		if(substancespecificationpropertycode.hasText()) {

			s.addSbstncSpcfctnPrptyCdTxt(String.valueOf(substancespecificationpropertycode.getText()));
		} else {
			s.addSbstncSpcfctnPrptyCdTxt("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyCdTxt("]");}


		/******************** substancespecificationpropertycodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationpropertycodecodinglist = substancespecificationpropertycode.getCoding();
		for(int substancespecificationpropertycodecodingi = 0; substancespecificationpropertycodecodingi<substancespecificationpropertycodecodinglist.size();substancespecificationpropertycodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationpropertycodecoding = substancespecificationpropertycodecodinglist.get(substancespecificationpropertycodecodingi);

		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationpropertycodecodingi == 0) {s.addSbstncSpcfctnPrptyCdCdgDsply("[[");}
		if(substancespecificationpropertycodecoding.hasDisplay()) {

			s.addSbstncSpcfctnPrptyCdCdgDsply(String.valueOf(substancespecificationpropertycodecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnPrptyCdCdgDsply("NULL");
		}

		if(substancespecificationpropertycodecodingi == substancespecificationpropertycodecodinglist.size()-1) {s.addSbstncSpcfctnPrptyCdCdgDsply("]]");}


		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationpropertycodecodingi == 0) {s.addSbstncSpcfctnPrptyCdCdgVrsn("[[");}
		if(substancespecificationpropertycodecoding.hasVersion()) {

			s.addSbstncSpcfctnPrptyCdCdgVrsn(String.valueOf(substancespecificationpropertycodecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnPrptyCdCdgVrsn("NULL");
		}

		if(substancespecificationpropertycodecodingi == substancespecificationpropertycodecodinglist.size()-1) {s.addSbstncSpcfctnPrptyCdCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Cd ********************************************************************************/
		if(substancespecificationpropertycodecodingi == 0) {s.addSbstncSpcfctnPrptyCdCdgCd("[[");}
		if(substancespecificationpropertycodecoding.hasCode()) {

			s.addSbstncSpcfctnPrptyCdCdgCd(String.valueOf(substancespecificationpropertycodecoding.getCode()));
		} else {
			s.addSbstncSpcfctnPrptyCdCdgCd("NULL");
		}

		if(substancespecificationpropertycodecodingi == substancespecificationpropertycodecodinglist.size()-1) {s.addSbstncSpcfctnPrptyCdCdgCd("]]");}


		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationpropertycodecodingi == 0) {s.addSbstncSpcfctnPrptyCdCdgUsrSltd("[[");}
		if(substancespecificationpropertycodecoding.hasUserSelected()) {

			s.addSbstncSpcfctnPrptyCdCdgUsrSltd(String.valueOf(substancespecificationpropertycodecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnPrptyCdCdgUsrSltd("NULL");
		}

		if(substancespecificationpropertycodecodingi == substancespecificationpropertycodecodinglist.size()-1) {s.addSbstncSpcfctnPrptyCdCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Sys ********************************************************************************/
		if(substancespecificationpropertycodecodingi == 0) {s.addSbstncSpcfctnPrptyCdCdgSys("[[");}
		if(substancespecificationpropertycodecoding.hasSystem()) {

			s.addSbstncSpcfctnPrptyCdCdgSys(String.valueOf(substancespecificationpropertycodecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnPrptyCdCdgSys("NULL");
		}

		if(substancespecificationpropertycodecodingi == substancespecificationpropertycodecodinglist.size()-1) {s.addSbstncSpcfctnPrptyCdCdgSys("]]");}


		 };
		/******************** substancespecificationpropertycategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertycategory = substancespecificationproperty.getCategory();

		/******************** SbstncSpcfctn_Prpty_Ctgry_Txt ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyCtgryTxt("[");}
		if(substancespecificationpropertycategory.hasText()) {

			s.addSbstncSpcfctnPrptyCtgryTxt(String.valueOf(substancespecificationpropertycategory.getText()));
		} else {
			s.addSbstncSpcfctnPrptyCtgryTxt("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyCtgryTxt("]");}


		/******************** substancespecificationpropertycategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationpropertycategorycodinglist = substancespecificationpropertycategory.getCoding();
		for(int substancespecificationpropertycategorycodingi = 0; substancespecificationpropertycategorycodingi<substancespecificationpropertycategorycodinglist.size();substancespecificationpropertycategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationpropertycategorycoding = substancespecificationpropertycategorycodinglist.get(substancespecificationpropertycategorycodingi);

		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Dsply ********************************************************************************/
		if(substancespecificationpropertycategorycodingi == 0) {s.addSbstncSpcfctnPrptyCtgryCdgDsply("[[");}
		if(substancespecificationpropertycategorycoding.hasDisplay()) {

			s.addSbstncSpcfctnPrptyCtgryCdgDsply(String.valueOf(substancespecificationpropertycategorycoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnPrptyCtgryCdgDsply("NULL");
		}

		if(substancespecificationpropertycategorycodingi == substancespecificationpropertycategorycodinglist.size()-1) {s.addSbstncSpcfctnPrptyCtgryCdgDsply("]]");}


		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationpropertycategorycodingi == 0) {s.addSbstncSpcfctnPrptyCtgryCdgVrsn("[[");}
		if(substancespecificationpropertycategorycoding.hasVersion()) {

			s.addSbstncSpcfctnPrptyCtgryCdgVrsn(String.valueOf(substancespecificationpropertycategorycoding.getVersion()));
		} else {
			s.addSbstncSpcfctnPrptyCtgryCdgVrsn("NULL");
		}

		if(substancespecificationpropertycategorycodingi == substancespecificationpropertycategorycodinglist.size()-1) {s.addSbstncSpcfctnPrptyCtgryCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Cd ********************************************************************************/
		if(substancespecificationpropertycategorycodingi == 0) {s.addSbstncSpcfctnPrptyCtgryCdgCd("[[");}
		if(substancespecificationpropertycategorycoding.hasCode()) {

			s.addSbstncSpcfctnPrptyCtgryCdgCd(String.valueOf(substancespecificationpropertycategorycoding.getCode()));
		} else {
			s.addSbstncSpcfctnPrptyCtgryCdgCd("NULL");
		}

		if(substancespecificationpropertycategorycodingi == substancespecificationpropertycategorycodinglist.size()-1) {s.addSbstncSpcfctnPrptyCtgryCdgCd("]]");}


		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationpropertycategorycodingi == 0) {s.addSbstncSpcfctnPrptyCtgryCdgUsrSltd("[[");}
		if(substancespecificationpropertycategorycoding.hasUserSelected()) {

			s.addSbstncSpcfctnPrptyCtgryCdgUsrSltd(String.valueOf(substancespecificationpropertycategorycoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnPrptyCtgryCdgUsrSltd("NULL");
		}

		if(substancespecificationpropertycategorycodingi == substancespecificationpropertycategorycodinglist.size()-1) {s.addSbstncSpcfctnPrptyCtgryCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Sys ********************************************************************************/
		if(substancespecificationpropertycategorycodingi == 0) {s.addSbstncSpcfctnPrptyCtgryCdgSys("[[");}
		if(substancespecificationpropertycategorycoding.hasSystem()) {

			s.addSbstncSpcfctnPrptyCtgryCdgSys(String.valueOf(substancespecificationpropertycategorycoding.getSystem()));
		} else {
			s.addSbstncSpcfctnPrptyCtgryCdgSys("NULL");
		}

		if(substancespecificationpropertycategorycodingi == substancespecificationpropertycategorycodinglist.size()-1) {s.addSbstncSpcfctnPrptyCtgryCdgSys("]]");}


		 };
		/******************** substancespecificationpropertyamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationpropertyamountquantity = substancespecificationproperty.getAmountQuantity();

		/******************** SbstncSpcfctn_Prpty_AmntQnty_Vl ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyAmntQntyVl("[");}
		if(substancespecificationpropertyamountquantity.hasValue()) {

			s.addSbstncSpcfctnPrptyAmntQntyVl(String.valueOf(substancespecificationpropertyamountquantity.getValue()));
		} else {
			s.addSbstncSpcfctnPrptyAmntQntyVl("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyAmntQntyVl("]");}


		/******************** substancespecificationpropertyamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationpropertyamountquantitycomparator = substancespecificationpropertyamountquantity.getComparator();
		if(substancespecificationpropertyamountquantitycomparator!=null) {
		if(substancespecificationpropertyi == 0) {

		s.addSbstncSpcfctnPrptyAmntQntyCmprtr("[");		}
			s.addSbstncSpcfctnPrptyAmntQntyCmprtr(substancespecificationpropertyamountquantitycomparator.toCode());
		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {

		s.addSbstncSpcfctnPrptyAmntQntyCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnPrptyAmntQntyCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Prpty_AmntQnty_Cd ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyAmntQntyCd("[");}
		if(substancespecificationpropertyamountquantity.hasCode()) {

			s.addSbstncSpcfctnPrptyAmntQntyCd(String.valueOf(substancespecificationpropertyamountquantity.getCode()));
		} else {
			s.addSbstncSpcfctnPrptyAmntQntyCd("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyAmntQntyCd("]");}


		/******************** SbstncSpcfctn_Prpty_AmntQnty_Unt ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyAmntQntyUnt("[");}
		if(substancespecificationpropertyamountquantity.hasUnit()) {

			s.addSbstncSpcfctnPrptyAmntQntyUnt(String.valueOf(substancespecificationpropertyamountquantity.getUnit()));
		} else {
			s.addSbstncSpcfctnPrptyAmntQntyUnt("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyAmntQntyUnt("]");}


		/******************** SbstncSpcfctn_Prpty_AmntQnty_Sys ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyAmntQntySys("[");}
		if(substancespecificationpropertyamountquantity.hasSystem()) {

			s.addSbstncSpcfctnPrptyAmntQntySys(String.valueOf(substancespecificationpropertyamountquantity.getSystem()));
		} else {
			s.addSbstncSpcfctnPrptyAmntQntySys("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyAmntQntySys("]");}


		/******************** substancespecificationpropertydefiningsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationpropertydefiningsubstancecodeableconcept = substancespecificationproperty.getDefiningSubstanceCodeableConcept();

		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Txt ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt("[");}
		if(substancespecificationpropertydefiningsubstancecodeableconcept.hasText()) {

			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconcept.getText()));
		} else {
			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt("]");}


		/******************** substancespecificationpropertydefiningsubstancecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationpropertydefiningsubstancecodeableconceptcodinglist = substancespecificationpropertydefiningsubstancecodeableconcept.getCoding();
		for(int substancespecificationpropertydefiningsubstancecodeableconceptcodingi = 0; substancespecificationpropertydefiningsubstancecodeableconceptcodingi<substancespecificationpropertydefiningsubstancecodeableconceptcodinglist.size();substancespecificationpropertydefiningsubstancecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationpropertydefiningsubstancecodeableconceptcoding = substancespecificationpropertydefiningsubstancecodeableconceptcodinglist.get(substancespecificationpropertydefiningsubstancecodeableconceptcodingi);

		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply("[[");}
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasDisplay()) {

			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply("NULL");
		}

		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == substancespecificationpropertydefiningsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply("]]");}


		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn("[[");}
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasVersion()) {

			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getVersion()));
		} else {
			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn("NULL");
		}

		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == substancespecificationpropertydefiningsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd("[[");}
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasCode()) {

			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getCode()));
		} else {
			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd("NULL");
		}

		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == substancespecificationpropertydefiningsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd("]]");}


		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd("[[");}
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasUserSelected()) {

			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd("NULL");
		}

		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == substancespecificationpropertydefiningsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys("[[");}
		if(substancespecificationpropertydefiningsubstancecodeableconceptcoding.hasSystem()) {

			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys(String.valueOf(substancespecificationpropertydefiningsubstancecodeableconceptcoding.getSystem()));
		} else {
			s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys("NULL");
		}

		if(substancespecificationpropertydefiningsubstancecodeableconceptcodingi == substancespecificationpropertydefiningsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys("]]");}


		 };
		/******************** SbstncSpcfctn_Prpty_DefiningSbstncRfrnc ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyDefiningSbstncRfrnc("[");}
		if(substancespecificationproperty.hasDefiningSubstanceReference()) {

			if(substancespecificationproperty.getDefiningSubstanceReference().getReference() != null) {
			s.addSbstncSpcfctnPrptyDefiningSbstncRfrnc(substancespecificationproperty.getDefiningSubstanceReference().getReference());
			}
		} else {
			s.addSbstncSpcfctnPrptyDefiningSbstncRfrnc("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyDefiningSbstncRfrnc("]");}


		/******************** SbstncSpcfctn_Prpty_AmntStrgTyp ********************************************************************************/
		if(substancespecificationpropertyi == 0) {s.addSbstncSpcfctnPrptyAmntStrgTyp("[");}
		if(substancespecificationproperty.hasAmountStringType()) {

			s.addSbstncSpcfctnPrptyAmntStrgTyp("\""+substancespecificationproperty.getAmountStringType().getValueAsString()+"\"");
		} else {
			s.addSbstncSpcfctnPrptyAmntStrgTyp("NULL");
		}

		if(substancespecificationpropertyi == substancespecificationpropertylist.size()-1) {s.addSbstncSpcfctnPrptyAmntStrgTyp("]");}


		 };
		/******************** substancespecificationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationtype = substancespecification.getType();

		/******************** SbstncSpcfctn_Typ_Txt ********************************************************************************/
		if(substancespecificationtype.hasText()) {

			s.addSbstncSpcfctnTypTxt(String.valueOf(substancespecificationtype.getText()));
		} else {
			s.addSbstncSpcfctnTypTxt("NULL");
		}


		/******************** substancespecificationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationtypecodinglist = substancespecificationtype.getCoding();
		for(int substancespecificationtypecodingi = 0; substancespecificationtypecodingi<substancespecificationtypecodinglist.size();substancespecificationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationtypecoding = substancespecificationtypecodinglist.get(substancespecificationtypecodingi);

		/******************** SbstncSpcfctn_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationtypecodingi == 0) {s.addSbstncSpcfctnTypCdgDsply("[");}
		if(substancespecificationtypecoding.hasDisplay()) {

			s.addSbstncSpcfctnTypCdgDsply(String.valueOf(substancespecificationtypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnTypCdgDsply("NULL");
		}

		if(substancespecificationtypecodingi == substancespecificationtypecodinglist.size()-1) {s.addSbstncSpcfctnTypCdgDsply("]");}


		/******************** SbstncSpcfctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationtypecodingi == 0) {s.addSbstncSpcfctnTypCdgVrsn("[");}
		if(substancespecificationtypecoding.hasVersion()) {

			s.addSbstncSpcfctnTypCdgVrsn(String.valueOf(substancespecificationtypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnTypCdgVrsn("NULL");
		}

		if(substancespecificationtypecodingi == substancespecificationtypecodinglist.size()-1) {s.addSbstncSpcfctnTypCdgVrsn("]");}


		/******************** SbstncSpcfctn_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationtypecodingi == 0) {s.addSbstncSpcfctnTypCdgCd("[");}
		if(substancespecificationtypecoding.hasCode()) {

			s.addSbstncSpcfctnTypCdgCd(String.valueOf(substancespecificationtypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnTypCdgCd("NULL");
		}

		if(substancespecificationtypecodingi == substancespecificationtypecodinglist.size()-1) {s.addSbstncSpcfctnTypCdgCd("]");}


		/******************** SbstncSpcfctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationtypecodingi == 0) {s.addSbstncSpcfctnTypCdgUsrSltd("[");}
		if(substancespecificationtypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnTypCdgUsrSltd(String.valueOf(substancespecificationtypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnTypCdgUsrSltd("NULL");
		}

		if(substancespecificationtypecodingi == substancespecificationtypecodinglist.size()-1) {s.addSbstncSpcfctnTypCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationtypecodingi == 0) {s.addSbstncSpcfctnTypCdgSys("[");}
		if(substancespecificationtypecoding.hasSystem()) {

			s.addSbstncSpcfctnTypCdgSys(String.valueOf(substancespecificationtypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnTypCdgSys("NULL");
		}

		if(substancespecificationtypecodingi == substancespecificationtypecodinglist.size()-1) {s.addSbstncSpcfctnTypCdgSys("]");}


		 };
		/******************** SbstncSpcfctn_Comment ********************************************************************************/
		if(substancespecification.hasComment()) {

			s.addSbstncSpcfctnComment(String.valueOf(substancespecification.getComment()));
		} else {
			s.addSbstncSpcfctnComment("NULL");
		}


		/******************** SbstncSpcfctn_Src ********************************************************************************/
		if(substancespecification.hasSource()) {

			String  array = "[";
			for(int incr=0; incr<substancespecification.getSource().size(); incr++) {
				array = array + substancespecification.getSource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncSpcfctnSrc(array);

		} else {
			s.addSbstncSpcfctnSrc("NULL");
		}


		/******************** substancespecificationcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent> substancespecificationcodelist = substancespecification.getCode();
		for(int substancespecificationcodei = 0; substancespecificationcodei<substancespecificationcodelist.size();substancespecificationcodei++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationCodeComponent  substancespecificationcode = substancespecificationcodelist.get(substancespecificationcodei);

		/******************** SbstncSpcfctn_Cd_Comment ********************************************************************************/
		if(substancespecificationcodei == 0) {s.addSbstncSpcfctnCdComment("[");}
		if(substancespecificationcode.hasComment()) {

			s.addSbstncSpcfctnCdComment(String.valueOf(substancespecificationcode.getComment()));
		} else {
			s.addSbstncSpcfctnCdComment("NULL");
		}

		if(substancespecificationcodei == substancespecificationcodelist.size()-1) {s.addSbstncSpcfctnCdComment("]");}


		/******************** SbstncSpcfctn_Cd_Src ********************************************************************************/
		if(substancespecificationcodei == 0) {s.addSbstncSpcfctnCdSrc("[");}
		if(substancespecificationcode.hasSource()) {

			String  array = "[";
			for(int incr=0; incr<substancespecificationcode.getSource().size(); incr++) {
				array = array + substancespecificationcode.getSource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncSpcfctnCdSrc(array);

		} else {
			s.addSbstncSpcfctnCdSrc("NULL");
		}

		if(substancespecificationcodei == substancespecificationcodelist.size()-1) {s.addSbstncSpcfctnCdSrc("]");}


		/******************** substancespecificationcodecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationcodecode = substancespecificationcode.getCode();

		/******************** SbstncSpcfctn_Cd_Cd_Txt ********************************************************************************/
		if(substancespecificationcodei == 0) {s.addSbstncSpcfctnCdCdTxt("[");}
		if(substancespecificationcodecode.hasText()) {

			s.addSbstncSpcfctnCdCdTxt(String.valueOf(substancespecificationcodecode.getText()));
		} else {
			s.addSbstncSpcfctnCdCdTxt("NULL");
		}

		if(substancespecificationcodei == substancespecificationcodelist.size()-1) {s.addSbstncSpcfctnCdCdTxt("]");}


		/******************** substancespecificationcodecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationcodecodecodinglist = substancespecificationcodecode.getCoding();
		for(int substancespecificationcodecodecodingi = 0; substancespecificationcodecodecodingi<substancespecificationcodecodecodinglist.size();substancespecificationcodecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationcodecodecoding = substancespecificationcodecodecodinglist.get(substancespecificationcodecodecodingi);

		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationcodecodecodingi == 0) {s.addSbstncSpcfctnCdCdCdgDsply("[[");}
		if(substancespecificationcodecodecoding.hasDisplay()) {

			s.addSbstncSpcfctnCdCdCdgDsply(String.valueOf(substancespecificationcodecodecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnCdCdCdgDsply("NULL");
		}

		if(substancespecificationcodecodecodingi == substancespecificationcodecodecodinglist.size()-1) {s.addSbstncSpcfctnCdCdCdgDsply("]]");}


		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationcodecodecodingi == 0) {s.addSbstncSpcfctnCdCdCdgVrsn("[[");}
		if(substancespecificationcodecodecoding.hasVersion()) {

			s.addSbstncSpcfctnCdCdCdgVrsn(String.valueOf(substancespecificationcodecodecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnCdCdCdgVrsn("NULL");
		}

		if(substancespecificationcodecodecodingi == substancespecificationcodecodecodinglist.size()-1) {s.addSbstncSpcfctnCdCdCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Cd ********************************************************************************/
		if(substancespecificationcodecodecodingi == 0) {s.addSbstncSpcfctnCdCdCdgCd("[[");}
		if(substancespecificationcodecodecoding.hasCode()) {

			s.addSbstncSpcfctnCdCdCdgCd(String.valueOf(substancespecificationcodecodecoding.getCode()));
		} else {
			s.addSbstncSpcfctnCdCdCdgCd("NULL");
		}

		if(substancespecificationcodecodecodingi == substancespecificationcodecodecodinglist.size()-1) {s.addSbstncSpcfctnCdCdCdgCd("]]");}


		/******************** SbstncSpcfctn_Cd_Cd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationcodecodecodingi == 0) {s.addSbstncSpcfctnCdCdCdgUsrSltd("[[");}
		if(substancespecificationcodecodecoding.hasUserSelected()) {

			s.addSbstncSpcfctnCdCdCdgUsrSltd(String.valueOf(substancespecificationcodecodecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnCdCdCdgUsrSltd("NULL");
		}

		if(substancespecificationcodecodecodingi == substancespecificationcodecodecodinglist.size()-1) {s.addSbstncSpcfctnCdCdCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Sys ********************************************************************************/
		if(substancespecificationcodecodecodingi == 0) {s.addSbstncSpcfctnCdCdCdgSys("[[");}
		if(substancespecificationcodecodecoding.hasSystem()) {

			s.addSbstncSpcfctnCdCdCdgSys(String.valueOf(substancespecificationcodecodecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnCdCdCdgSys("NULL");
		}

		if(substancespecificationcodecodecodingi == substancespecificationcodecodecodinglist.size()-1) {s.addSbstncSpcfctnCdCdCdgSys("]]");}


		 };
		/******************** substancespecificationcodestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationcodestatus = substancespecificationcode.getStatus();

		/******************** SbstncSpcfctn_Cd_Sts_Txt ********************************************************************************/
		if(substancespecificationcodei == 0) {s.addSbstncSpcfctnCdStsTxt("[");}
		if(substancespecificationcodestatus.hasText()) {

			s.addSbstncSpcfctnCdStsTxt(String.valueOf(substancespecificationcodestatus.getText()));
		} else {
			s.addSbstncSpcfctnCdStsTxt("NULL");
		}

		if(substancespecificationcodei == substancespecificationcodelist.size()-1) {s.addSbstncSpcfctnCdStsTxt("]");}


		/******************** substancespecificationcodestatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationcodestatuscodinglist = substancespecificationcodestatus.getCoding();
		for(int substancespecificationcodestatuscodingi = 0; substancespecificationcodestatuscodingi<substancespecificationcodestatuscodinglist.size();substancespecificationcodestatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationcodestatuscoding = substancespecificationcodestatuscodinglist.get(substancespecificationcodestatuscodingi);

		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationcodestatuscodingi == 0) {s.addSbstncSpcfctnCdStsCdgDsply("[[");}
		if(substancespecificationcodestatuscoding.hasDisplay()) {

			s.addSbstncSpcfctnCdStsCdgDsply(String.valueOf(substancespecificationcodestatuscoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnCdStsCdgDsply("NULL");
		}

		if(substancespecificationcodestatuscodingi == substancespecificationcodestatuscodinglist.size()-1) {s.addSbstncSpcfctnCdStsCdgDsply("]]");}


		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationcodestatuscodingi == 0) {s.addSbstncSpcfctnCdStsCdgVrsn("[[");}
		if(substancespecificationcodestatuscoding.hasVersion()) {

			s.addSbstncSpcfctnCdStsCdgVrsn(String.valueOf(substancespecificationcodestatuscoding.getVersion()));
		} else {
			s.addSbstncSpcfctnCdStsCdgVrsn("NULL");
		}

		if(substancespecificationcodestatuscodingi == substancespecificationcodestatuscodinglist.size()-1) {s.addSbstncSpcfctnCdStsCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationcodestatuscodingi == 0) {s.addSbstncSpcfctnCdStsCdgCd("[[");}
		if(substancespecificationcodestatuscoding.hasCode()) {

			s.addSbstncSpcfctnCdStsCdgCd(String.valueOf(substancespecificationcodestatuscoding.getCode()));
		} else {
			s.addSbstncSpcfctnCdStsCdgCd("NULL");
		}

		if(substancespecificationcodestatuscodingi == substancespecificationcodestatuscodinglist.size()-1) {s.addSbstncSpcfctnCdStsCdgCd("]]");}


		/******************** SbstncSpcfctn_Cd_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationcodestatuscodingi == 0) {s.addSbstncSpcfctnCdStsCdgUsrSltd("[[");}
		if(substancespecificationcodestatuscoding.hasUserSelected()) {

			s.addSbstncSpcfctnCdStsCdgUsrSltd(String.valueOf(substancespecificationcodestatuscoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnCdStsCdgUsrSltd("NULL");
		}

		if(substancespecificationcodestatuscodingi == substancespecificationcodestatuscodinglist.size()-1) {s.addSbstncSpcfctnCdStsCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationcodestatuscodingi == 0) {s.addSbstncSpcfctnCdStsCdgSys("[[");}
		if(substancespecificationcodestatuscoding.hasSystem()) {

			s.addSbstncSpcfctnCdStsCdgSys(String.valueOf(substancespecificationcodestatuscoding.getSystem()));
		} else {
			s.addSbstncSpcfctnCdStsCdgSys("NULL");
		}

		if(substancespecificationcodestatuscodingi == substancespecificationcodestatuscodinglist.size()-1) {s.addSbstncSpcfctnCdStsCdgSys("]]");}


		 };
		/******************** SbstncSpcfctn_Cd_StsDt ********************************************************************************/
		if(substancespecificationcodei == 0) {s.addSbstncSpcfctnCdStsDt("[");}
		if(substancespecificationcode.hasStatusDate()) {

			s.addSbstncSpcfctnCdStsDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationcode.getStatusDate())+"\"");
		} else {
			s.addSbstncSpcfctnCdStsDt("NULL");
		}

		if(substancespecificationcodei == substancespecificationcodelist.size()-1) {s.addSbstncSpcfctnCdStsDt("]");}


		 };
		/******************** substancespecificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstatus = substancespecification.getStatus();

		/******************** SbstncSpcfctn_Sts_Txt ********************************************************************************/
		if(substancespecificationstatus.hasText()) {

			s.addSbstncSpcfctnStsTxt(String.valueOf(substancespecificationstatus.getText()));
		} else {
			s.addSbstncSpcfctnStsTxt("NULL");
		}


		/******************** substancespecificationstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstatuscodinglist = substancespecificationstatus.getCoding();
		for(int substancespecificationstatuscodingi = 0; substancespecificationstatuscodingi<substancespecificationstatuscodinglist.size();substancespecificationstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstatuscoding = substancespecificationstatuscodinglist.get(substancespecificationstatuscodingi);

		/******************** SbstncSpcfctn_Sts_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstatuscodingi == 0) {s.addSbstncSpcfctnStsCdgDsply("[");}
		if(substancespecificationstatuscoding.hasDisplay()) {

			s.addSbstncSpcfctnStsCdgDsply(String.valueOf(substancespecificationstatuscoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStsCdgDsply("NULL");
		}

		if(substancespecificationstatuscodingi == substancespecificationstatuscodinglist.size()-1) {s.addSbstncSpcfctnStsCdgDsply("]");}


		/******************** SbstncSpcfctn_Sts_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstatuscodingi == 0) {s.addSbstncSpcfctnStsCdgVrsn("[");}
		if(substancespecificationstatuscoding.hasVersion()) {

			s.addSbstncSpcfctnStsCdgVrsn(String.valueOf(substancespecificationstatuscoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStsCdgVrsn("NULL");
		}

		if(substancespecificationstatuscodingi == substancespecificationstatuscodinglist.size()-1) {s.addSbstncSpcfctnStsCdgVrsn("]");}


		/******************** SbstncSpcfctn_Sts_Cdg_Cd ********************************************************************************/
		if(substancespecificationstatuscodingi == 0) {s.addSbstncSpcfctnStsCdgCd("[");}
		if(substancespecificationstatuscoding.hasCode()) {

			s.addSbstncSpcfctnStsCdgCd(String.valueOf(substancespecificationstatuscoding.getCode()));
		} else {
			s.addSbstncSpcfctnStsCdgCd("NULL");
		}

		if(substancespecificationstatuscodingi == substancespecificationstatuscodinglist.size()-1) {s.addSbstncSpcfctnStsCdgCd("]");}


		/******************** SbstncSpcfctn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstatuscodingi == 0) {s.addSbstncSpcfctnStsCdgUsrSltd("[");}
		if(substancespecificationstatuscoding.hasUserSelected()) {

			s.addSbstncSpcfctnStsCdgUsrSltd(String.valueOf(substancespecificationstatuscoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStsCdgUsrSltd("NULL");
		}

		if(substancespecificationstatuscodingi == substancespecificationstatuscodinglist.size()-1) {s.addSbstncSpcfctnStsCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Sts_Cdg_Sys ********************************************************************************/
		if(substancespecificationstatuscodingi == 0) {s.addSbstncSpcfctnStsCdgSys("[");}
		if(substancespecificationstatuscoding.hasSystem()) {

			s.addSbstncSpcfctnStsCdgSys(String.valueOf(substancespecificationstatuscoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStsCdgSys("NULL");
		}

		if(substancespecificationstatuscodingi == substancespecificationstatuscodinglist.size()-1) {s.addSbstncSpcfctnStsCdgSys("]");}


		 };
		/******************** SbstncSpcfctn_Dscrptn ********************************************************************************/
		if(substancespecification.hasDescription()) {

			s.addSbstncSpcfctnDscrptn(String.valueOf(substancespecification.getDescription()));
		} else {
			s.addSbstncSpcfctnDscrptn("NULL");
		}


		/******************** substancespecificationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationidentifier = substancespecification.getIdentifier();

		/******************** SbstncSpcfctn_Id_Vl ********************************************************************************/
		if(substancespecificationidentifier.hasValue()) {

			s.addSbstncSpcfctnIdVl(String.valueOf(substancespecificationidentifier.getValue()));
		} else {
			s.addSbstncSpcfctnIdVl("NULL");
		}


		/******************** substancespecificationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationidentifiertype = substancespecificationidentifier.getType();

		/******************** SbstncSpcfctn_Id_Typ_Txt ********************************************************************************/
		if(substancespecificationidentifiertype.hasText()) {

			s.addSbstncSpcfctnIdTypTxt(String.valueOf(substancespecificationidentifiertype.getText()));
		} else {
			s.addSbstncSpcfctnIdTypTxt("NULL");
		}


		/******************** substancespecificationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationidentifiertypecodinglist = substancespecificationidentifiertype.getCoding();
		for(int substancespecificationidentifiertypecodingi = 0; substancespecificationidentifiertypecodingi<substancespecificationidentifiertypecodinglist.size();substancespecificationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationidentifiertypecoding = substancespecificationidentifiertypecodinglist.get(substancespecificationidentifiertypecodingi);

		/******************** SbstncSpcfctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationidentifiertypecodingi == 0) {s.addSbstncSpcfctnIdTypCdgDsply("[");}
		if(substancespecificationidentifiertypecoding.hasDisplay()) {

			s.addSbstncSpcfctnIdTypCdgDsply(String.valueOf(substancespecificationidentifiertypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnIdTypCdgDsply("NULL");
		}

		if(substancespecificationidentifiertypecodingi == substancespecificationidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnIdTypCdgDsply("]");}


		/******************** SbstncSpcfctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationidentifiertypecodingi == 0) {s.addSbstncSpcfctnIdTypCdgVrsn("[");}
		if(substancespecificationidentifiertypecoding.hasVersion()) {

			s.addSbstncSpcfctnIdTypCdgVrsn(String.valueOf(substancespecificationidentifiertypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnIdTypCdgVrsn("NULL");
		}

		if(substancespecificationidentifiertypecodingi == substancespecificationidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnIdTypCdgVrsn("]");}


		/******************** SbstncSpcfctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationidentifiertypecodingi == 0) {s.addSbstncSpcfctnIdTypCdgCd("[");}
		if(substancespecificationidentifiertypecoding.hasCode()) {

			s.addSbstncSpcfctnIdTypCdgCd(String.valueOf(substancespecificationidentifiertypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnIdTypCdgCd("NULL");
		}

		if(substancespecificationidentifiertypecodingi == substancespecificationidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnIdTypCdgCd("]");}


		/******************** SbstncSpcfctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationidentifiertypecodingi == 0) {s.addSbstncSpcfctnIdTypCdgUsrSltd("[");}
		if(substancespecificationidentifiertypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnIdTypCdgUsrSltd(String.valueOf(substancespecificationidentifiertypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnIdTypCdgUsrSltd("NULL");
		}

		if(substancespecificationidentifiertypecodingi == substancespecificationidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnIdTypCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationidentifiertypecodingi == 0) {s.addSbstncSpcfctnIdTypCdgSys("[");}
		if(substancespecificationidentifiertypecoding.hasSystem()) {

			s.addSbstncSpcfctnIdTypCdgSys(String.valueOf(substancespecificationidentifiertypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnIdTypCdgSys("NULL");
		}

		if(substancespecificationidentifiertypecodingi == substancespecificationidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnIdTypCdgSys("]");}


		 };
		/******************** substancespecificationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationidentifierperiod = substancespecificationidentifier.getPeriod();

		/******************** SbstncSpcfctn_Id_Prd_Strt ********************************************************************************/
		if(substancespecificationidentifierperiod.hasStart()) {

			s.addSbstncSpcfctnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationidentifierperiod.getStart())+"\"");
		} else {
			s.addSbstncSpcfctnIdPrdStrt("NULL");
		}


		/******************** SbstncSpcfctn_Id_Prd_End ********************************************************************************/
		if(substancespecificationidentifierperiod.hasEnd()) {

			s.addSbstncSpcfctnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationidentifierperiod.getEnd())+"\"");
		} else {
			s.addSbstncSpcfctnIdPrdEnd("NULL");
		}


		/******************** substancespecificationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancespecificationidentifieruse = substancespecificationidentifier.getUse();
		if(substancespecificationidentifieruse!=null) {
			s.addSbstncSpcfctnIdUse(substancespecificationidentifieruse.toCode());
		} else {
			s.addSbstncSpcfctnIdUse("NULL");
		}

		/******************** SbstncSpcfctn_Id_Assigner ********************************************************************************/
		if(substancespecificationidentifier.hasAssigner()) {

			if(substancespecificationidentifier.getAssigner().getReference() != null) {
			s.addSbstncSpcfctnIdAssigner(substancespecificationidentifier.getAssigner().getReference());
			}
		} else {
			s.addSbstncSpcfctnIdAssigner("NULL");
		}


		/******************** SbstncSpcfctn_Id_Sys ********************************************************************************/
		if(substancespecificationidentifier.hasSystem()) {

			s.addSbstncSpcfctnIdSys(String.valueOf(substancespecificationidentifier.getSystem()));
		} else {
			s.addSbstncSpcfctnIdSys("NULL");
		}


		/******************** SbstncSpcfctn_RfrncInfo ********************************************************************************/
		if(substancespecification.hasReferenceInformation()) {

			if(substancespecification.getReferenceInformation().getReference() != null) {
			s.addSbstncSpcfctnRfrncInfo(substancespecification.getReferenceInformation().getReference());
			}
		} else {
			s.addSbstncSpcfctnRfrncInfo("NULL");
		}


		/******************** substancespecificationdomain ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationdomain = substancespecification.getDomain();

		/******************** SbstncSpcfctn_Domain_Txt ********************************************************************************/
		if(substancespecificationdomain.hasText()) {

			s.addSbstncSpcfctnDomainTxt(String.valueOf(substancespecificationdomain.getText()));
		} else {
			s.addSbstncSpcfctnDomainTxt("NULL");
		}


		/******************** substancespecificationdomaincoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationdomaincodinglist = substancespecificationdomain.getCoding();
		for(int substancespecificationdomaincodingi = 0; substancespecificationdomaincodingi<substancespecificationdomaincodinglist.size();substancespecificationdomaincodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationdomaincoding = substancespecificationdomaincodinglist.get(substancespecificationdomaincodingi);

		/******************** SbstncSpcfctn_Domain_Cdg_Dsply ********************************************************************************/
		if(substancespecificationdomaincodingi == 0) {s.addSbstncSpcfctnDomainCdgDsply("[");}
		if(substancespecificationdomaincoding.hasDisplay()) {

			s.addSbstncSpcfctnDomainCdgDsply(String.valueOf(substancespecificationdomaincoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnDomainCdgDsply("NULL");
		}

		if(substancespecificationdomaincodingi == substancespecificationdomaincodinglist.size()-1) {s.addSbstncSpcfctnDomainCdgDsply("]");}


		/******************** SbstncSpcfctn_Domain_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationdomaincodingi == 0) {s.addSbstncSpcfctnDomainCdgVrsn("[");}
		if(substancespecificationdomaincoding.hasVersion()) {

			s.addSbstncSpcfctnDomainCdgVrsn(String.valueOf(substancespecificationdomaincoding.getVersion()));
		} else {
			s.addSbstncSpcfctnDomainCdgVrsn("NULL");
		}

		if(substancespecificationdomaincodingi == substancespecificationdomaincodinglist.size()-1) {s.addSbstncSpcfctnDomainCdgVrsn("]");}


		/******************** SbstncSpcfctn_Domain_Cdg_Cd ********************************************************************************/
		if(substancespecificationdomaincodingi == 0) {s.addSbstncSpcfctnDomainCdgCd("[");}
		if(substancespecificationdomaincoding.hasCode()) {

			s.addSbstncSpcfctnDomainCdgCd(String.valueOf(substancespecificationdomaincoding.getCode()));
		} else {
			s.addSbstncSpcfctnDomainCdgCd("NULL");
		}

		if(substancespecificationdomaincodingi == substancespecificationdomaincodinglist.size()-1) {s.addSbstncSpcfctnDomainCdgCd("]");}


		/******************** SbstncSpcfctn_Domain_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationdomaincodingi == 0) {s.addSbstncSpcfctnDomainCdgUsrSltd("[");}
		if(substancespecificationdomaincoding.hasUserSelected()) {

			s.addSbstncSpcfctnDomainCdgUsrSltd(String.valueOf(substancespecificationdomaincoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnDomainCdgUsrSltd("NULL");
		}

		if(substancespecificationdomaincodingi == substancespecificationdomaincodinglist.size()-1) {s.addSbstncSpcfctnDomainCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Domain_Cdg_Sys ********************************************************************************/
		if(substancespecificationdomaincodingi == 0) {s.addSbstncSpcfctnDomainCdgSys("[");}
		if(substancespecificationdomaincoding.hasSystem()) {

			s.addSbstncSpcfctnDomainCdgSys(String.valueOf(substancespecificationdomaincoding.getSystem()));
		} else {
			s.addSbstncSpcfctnDomainCdgSys("NULL");
		}

		if(substancespecificationdomaincodingi == substancespecificationdomaincodinglist.size()-1) {s.addSbstncSpcfctnDomainCdgSys("]");}


		 };
		/******************** substancespecificationmoiety ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent> substancespecificationmoietylist = substancespecification.getMoiety();
		for(int substancespecificationmoietyi = 0; substancespecificationmoietyi<substancespecificationmoietylist.size();substancespecificationmoietyi++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationMoietyComponent  substancespecificationmoiety = substancespecificationmoietylist.get(substancespecificationmoietyi);

		/******************** SbstncSpcfctn_Moiety_Nm ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyNm("[");}
		if(substancespecificationmoiety.hasName()) {

			s.addSbstncSpcfctnMoietyNm(String.valueOf(substancespecificationmoiety.getName()));
		} else {
			s.addSbstncSpcfctnMoietyNm("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyNm("]");}


		/******************** substancespecificationmoietyidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationmoietyidentifier = substancespecificationmoiety.getIdentifier();

		/******************** SbstncSpcfctn_Moiety_Id_Vl ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyIdVl("[");}
		if(substancespecificationmoietyidentifier.hasValue()) {

			s.addSbstncSpcfctnMoietyIdVl(String.valueOf(substancespecificationmoietyidentifier.getValue()));
		} else {
			s.addSbstncSpcfctnMoietyIdVl("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyIdVl("]");}


		/******************** substancespecificationmoietyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyidentifiertype = substancespecificationmoietyidentifier.getType();

		/******************** SbstncSpcfctn_Moiety_Id_Typ_Txt ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyIdTypTxt("[");}
		if(substancespecificationmoietyidentifiertype.hasText()) {

			s.addSbstncSpcfctnMoietyIdTypTxt(String.valueOf(substancespecificationmoietyidentifiertype.getText()));
		} else {
			s.addSbstncSpcfctnMoietyIdTypTxt("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyIdTypTxt("]");}


		/******************** substancespecificationmoietyidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationmoietyidentifiertypecodinglist = substancespecificationmoietyidentifiertype.getCoding();
		for(int substancespecificationmoietyidentifiertypecodingi = 0; substancespecificationmoietyidentifiertypecodingi<substancespecificationmoietyidentifiertypecodinglist.size();substancespecificationmoietyidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationmoietyidentifiertypecoding = substancespecificationmoietyidentifiertypecodinglist.get(substancespecificationmoietyidentifiertypecodingi);

		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecodingi == 0) {s.addSbstncSpcfctnMoietyIdTypCdgDsply("[[");}
		if(substancespecificationmoietyidentifiertypecoding.hasDisplay()) {

			s.addSbstncSpcfctnMoietyIdTypCdgDsply(String.valueOf(substancespecificationmoietyidentifiertypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnMoietyIdTypCdgDsply("NULL");
		}

		if(substancespecificationmoietyidentifiertypecodingi == substancespecificationmoietyidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnMoietyIdTypCdgDsply("]]");}


		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecodingi == 0) {s.addSbstncSpcfctnMoietyIdTypCdgVrsn("[[");}
		if(substancespecificationmoietyidentifiertypecoding.hasVersion()) {

			s.addSbstncSpcfctnMoietyIdTypCdgVrsn(String.valueOf(substancespecificationmoietyidentifiertypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnMoietyIdTypCdgVrsn("NULL");
		}

		if(substancespecificationmoietyidentifiertypecodingi == substancespecificationmoietyidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnMoietyIdTypCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecodingi == 0) {s.addSbstncSpcfctnMoietyIdTypCdgCd("[[");}
		if(substancespecificationmoietyidentifiertypecoding.hasCode()) {

			s.addSbstncSpcfctnMoietyIdTypCdgCd(String.valueOf(substancespecificationmoietyidentifiertypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnMoietyIdTypCdgCd("NULL");
		}

		if(substancespecificationmoietyidentifiertypecodingi == substancespecificationmoietyidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnMoietyIdTypCdgCd("]]");}


		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecodingi == 0) {s.addSbstncSpcfctnMoietyIdTypCdgUsrSltd("[[");}
		if(substancespecificationmoietyidentifiertypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnMoietyIdTypCdgUsrSltd(String.valueOf(substancespecificationmoietyidentifiertypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnMoietyIdTypCdgUsrSltd("NULL");
		}

		if(substancespecificationmoietyidentifiertypecodingi == substancespecificationmoietyidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnMoietyIdTypCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietyidentifiertypecodingi == 0) {s.addSbstncSpcfctnMoietyIdTypCdgSys("[[");}
		if(substancespecificationmoietyidentifiertypecoding.hasSystem()) {

			s.addSbstncSpcfctnMoietyIdTypCdgSys(String.valueOf(substancespecificationmoietyidentifiertypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnMoietyIdTypCdgSys("NULL");
		}

		if(substancespecificationmoietyidentifiertypecodingi == substancespecificationmoietyidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnMoietyIdTypCdgSys("]]");}


		 };
		/******************** substancespecificationmoietyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationmoietyidentifierperiod = substancespecificationmoietyidentifier.getPeriod();

		/******************** SbstncSpcfctn_Moiety_Id_Prd_Strt ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyIdPrdStrt("[");}
		if(substancespecificationmoietyidentifierperiod.hasStart()) {

			s.addSbstncSpcfctnMoietyIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationmoietyidentifierperiod.getStart())+"\"");
		} else {
			s.addSbstncSpcfctnMoietyIdPrdStrt("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyIdPrdStrt("]");}


		/******************** SbstncSpcfctn_Moiety_Id_Prd_End ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyIdPrdEnd("[");}
		if(substancespecificationmoietyidentifierperiod.hasEnd()) {

			s.addSbstncSpcfctnMoietyIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationmoietyidentifierperiod.getEnd())+"\"");
		} else {
			s.addSbstncSpcfctnMoietyIdPrdEnd("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyIdPrdEnd("]");}


		/******************** substancespecificationmoietyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancespecificationmoietyidentifieruse = substancespecificationmoietyidentifier.getUse();
		if(substancespecificationmoietyidentifieruse!=null) {
		if(substancespecificationmoietyi == 0) {

		s.addSbstncSpcfctnMoietyIdUse("[");		}
			s.addSbstncSpcfctnMoietyIdUse(substancespecificationmoietyidentifieruse.toCode());
		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {

		s.addSbstncSpcfctnMoietyIdUse("]");		}

		} else {
			s.addSbstncSpcfctnMoietyIdUse("NULL");
		}

		/******************** SbstncSpcfctn_Moiety_Id_Assigner ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyIdAssigner("[");}
		if(substancespecificationmoietyidentifier.hasAssigner()) {

			if(substancespecificationmoietyidentifier.getAssigner().getReference() != null) {
			s.addSbstncSpcfctnMoietyIdAssigner(substancespecificationmoietyidentifier.getAssigner().getReference());
			}
		} else {
			s.addSbstncSpcfctnMoietyIdAssigner("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyIdAssigner("]");}


		/******************** SbstncSpcfctn_Moiety_Id_Sys ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyIdSys("[");}
		if(substancespecificationmoietyidentifier.hasSystem()) {

			s.addSbstncSpcfctnMoietyIdSys(String.valueOf(substancespecificationmoietyidentifier.getSystem()));
		} else {
			s.addSbstncSpcfctnMoietyIdSys("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyIdSys("]");}


		/******************** substancespecificationmoietyrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyrole = substancespecificationmoiety.getRole();

		/******************** SbstncSpcfctn_Moiety_Role_Txt ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyRoleTxt("[");}
		if(substancespecificationmoietyrole.hasText()) {

			s.addSbstncSpcfctnMoietyRoleTxt(String.valueOf(substancespecificationmoietyrole.getText()));
		} else {
			s.addSbstncSpcfctnMoietyRoleTxt("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyRoleTxt("]");}


		/******************** substancespecificationmoietyrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationmoietyrolecodinglist = substancespecificationmoietyrole.getCoding();
		for(int substancespecificationmoietyrolecodingi = 0; substancespecificationmoietyrolecodingi<substancespecificationmoietyrolecodinglist.size();substancespecificationmoietyrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationmoietyrolecoding = substancespecificationmoietyrolecodinglist.get(substancespecificationmoietyrolecodingi);

		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietyrolecodingi == 0) {s.addSbstncSpcfctnMoietyRoleCdgDsply("[[");}
		if(substancespecificationmoietyrolecoding.hasDisplay()) {

			s.addSbstncSpcfctnMoietyRoleCdgDsply(String.valueOf(substancespecificationmoietyrolecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnMoietyRoleCdgDsply("NULL");
		}

		if(substancespecificationmoietyrolecodingi == substancespecificationmoietyrolecodinglist.size()-1) {s.addSbstncSpcfctnMoietyRoleCdgDsply("]]");}


		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietyrolecodingi == 0) {s.addSbstncSpcfctnMoietyRoleCdgVrsn("[[");}
		if(substancespecificationmoietyrolecoding.hasVersion()) {

			s.addSbstncSpcfctnMoietyRoleCdgVrsn(String.valueOf(substancespecificationmoietyrolecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnMoietyRoleCdgVrsn("NULL");
		}

		if(substancespecificationmoietyrolecodingi == substancespecificationmoietyrolecodinglist.size()-1) {s.addSbstncSpcfctnMoietyRoleCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietyrolecodingi == 0) {s.addSbstncSpcfctnMoietyRoleCdgCd("[[");}
		if(substancespecificationmoietyrolecoding.hasCode()) {

			s.addSbstncSpcfctnMoietyRoleCdgCd(String.valueOf(substancespecificationmoietyrolecoding.getCode()));
		} else {
			s.addSbstncSpcfctnMoietyRoleCdgCd("NULL");
		}

		if(substancespecificationmoietyrolecodingi == substancespecificationmoietyrolecodinglist.size()-1) {s.addSbstncSpcfctnMoietyRoleCdgCd("]]");}


		/******************** SbstncSpcfctn_Moiety_Role_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietyrolecodingi == 0) {s.addSbstncSpcfctnMoietyRoleCdgUsrSltd("[[");}
		if(substancespecificationmoietyrolecoding.hasUserSelected()) {

			s.addSbstncSpcfctnMoietyRoleCdgUsrSltd(String.valueOf(substancespecificationmoietyrolecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnMoietyRoleCdgUsrSltd("NULL");
		}

		if(substancespecificationmoietyrolecodingi == substancespecificationmoietyrolecodinglist.size()-1) {s.addSbstncSpcfctnMoietyRoleCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietyrolecodingi == 0) {s.addSbstncSpcfctnMoietyRoleCdgSys("[[");}
		if(substancespecificationmoietyrolecoding.hasSystem()) {

			s.addSbstncSpcfctnMoietyRoleCdgSys(String.valueOf(substancespecificationmoietyrolecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnMoietyRoleCdgSys("NULL");
		}

		if(substancespecificationmoietyrolecodingi == substancespecificationmoietyrolecodinglist.size()-1) {s.addSbstncSpcfctnMoietyRoleCdgSys("]]");}


		 };
		/******************** substancespecificationmoietyamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationmoietyamountquantity = substancespecificationmoiety.getAmountQuantity();

		/******************** SbstncSpcfctn_Moiety_AmntQnty_Vl ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyAmntQntyVl("[");}
		if(substancespecificationmoietyamountquantity.hasValue()) {

			s.addSbstncSpcfctnMoietyAmntQntyVl(String.valueOf(substancespecificationmoietyamountquantity.getValue()));
		} else {
			s.addSbstncSpcfctnMoietyAmntQntyVl("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyAmntQntyVl("]");}


		/******************** substancespecificationmoietyamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationmoietyamountquantitycomparator = substancespecificationmoietyamountquantity.getComparator();
		if(substancespecificationmoietyamountquantitycomparator!=null) {
		if(substancespecificationmoietyi == 0) {

		s.addSbstncSpcfctnMoietyAmntQntyCmprtr("[");		}
			s.addSbstncSpcfctnMoietyAmntQntyCmprtr(substancespecificationmoietyamountquantitycomparator.toCode());
		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {

		s.addSbstncSpcfctnMoietyAmntQntyCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnMoietyAmntQntyCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Moiety_AmntQnty_Cd ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyAmntQntyCd("[");}
		if(substancespecificationmoietyamountquantity.hasCode()) {

			s.addSbstncSpcfctnMoietyAmntQntyCd(String.valueOf(substancespecificationmoietyamountquantity.getCode()));
		} else {
			s.addSbstncSpcfctnMoietyAmntQntyCd("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyAmntQntyCd("]");}


		/******************** SbstncSpcfctn_Moiety_AmntQnty_Unt ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyAmntQntyUnt("[");}
		if(substancespecificationmoietyamountquantity.hasUnit()) {

			s.addSbstncSpcfctnMoietyAmntQntyUnt(String.valueOf(substancespecificationmoietyamountquantity.getUnit()));
		} else {
			s.addSbstncSpcfctnMoietyAmntQntyUnt("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyAmntQntyUnt("]");}


		/******************** SbstncSpcfctn_Moiety_AmntQnty_Sys ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyAmntQntySys("[");}
		if(substancespecificationmoietyamountquantity.hasSystem()) {

			s.addSbstncSpcfctnMoietyAmntQntySys(String.valueOf(substancespecificationmoietyamountquantity.getSystem()));
		} else {
			s.addSbstncSpcfctnMoietyAmntQntySys("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyAmntQntySys("]");}


		/******************** SbstncSpcfctn_Moiety_MoleclrFrmula ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyMoleclrFrmula("[");}
		if(substancespecificationmoiety.hasMolecularFormula()) {

			s.addSbstncSpcfctnMoietyMoleclrFrmula(String.valueOf(substancespecificationmoiety.getMolecularFormula()));
		} else {
			s.addSbstncSpcfctnMoietyMoleclrFrmula("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyMoleclrFrmula("]");}


		/******************** SbstncSpcfctn_Moiety_AmntStrgTyp ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyAmntStrgTyp("[");}
		if(substancespecificationmoiety.hasAmountStringType()) {

			s.addSbstncSpcfctnMoietyAmntStrgTyp("\""+substancespecificationmoiety.getAmountStringType().getValueAsString()+"\"");
		} else {
			s.addSbstncSpcfctnMoietyAmntStrgTyp("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyAmntStrgTyp("]");}


		/******************** substancespecificationmoietystereochemistry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietystereochemistry = substancespecificationmoiety.getStereochemistry();

		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Txt ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyStereochemistryTxt("[");}
		if(substancespecificationmoietystereochemistry.hasText()) {

			s.addSbstncSpcfctnMoietyStereochemistryTxt(String.valueOf(substancespecificationmoietystereochemistry.getText()));
		} else {
			s.addSbstncSpcfctnMoietyStereochemistryTxt("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyStereochemistryTxt("]");}


		/******************** substancespecificationmoietystereochemistrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationmoietystereochemistrycodinglist = substancespecificationmoietystereochemistry.getCoding();
		for(int substancespecificationmoietystereochemistrycodingi = 0; substancespecificationmoietystereochemistrycodingi<substancespecificationmoietystereochemistrycodinglist.size();substancespecificationmoietystereochemistrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationmoietystereochemistrycoding = substancespecificationmoietystereochemistrycodinglist.get(substancespecificationmoietystereochemistrycodingi);

		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietystereochemistrycodingi == 0) {s.addSbstncSpcfctnMoietyStereochemistryCdgDsply("[[");}
		if(substancespecificationmoietystereochemistrycoding.hasDisplay()) {

			s.addSbstncSpcfctnMoietyStereochemistryCdgDsply(String.valueOf(substancespecificationmoietystereochemistrycoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnMoietyStereochemistryCdgDsply("NULL");
		}

		if(substancespecificationmoietystereochemistrycodingi == substancespecificationmoietystereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnMoietyStereochemistryCdgDsply("]]");}


		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietystereochemistrycodingi == 0) {s.addSbstncSpcfctnMoietyStereochemistryCdgVrsn("[[");}
		if(substancespecificationmoietystereochemistrycoding.hasVersion()) {

			s.addSbstncSpcfctnMoietyStereochemistryCdgVrsn(String.valueOf(substancespecificationmoietystereochemistrycoding.getVersion()));
		} else {
			s.addSbstncSpcfctnMoietyStereochemistryCdgVrsn("NULL");
		}

		if(substancespecificationmoietystereochemistrycodingi == substancespecificationmoietystereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnMoietyStereochemistryCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietystereochemistrycodingi == 0) {s.addSbstncSpcfctnMoietyStereochemistryCdgCd("[[");}
		if(substancespecificationmoietystereochemistrycoding.hasCode()) {

			s.addSbstncSpcfctnMoietyStereochemistryCdgCd(String.valueOf(substancespecificationmoietystereochemistrycoding.getCode()));
		} else {
			s.addSbstncSpcfctnMoietyStereochemistryCdgCd("NULL");
		}

		if(substancespecificationmoietystereochemistrycodingi == substancespecificationmoietystereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnMoietyStereochemistryCdgCd("]]");}


		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietystereochemistrycodingi == 0) {s.addSbstncSpcfctnMoietyStereochemistryCdgUsrSltd("[[");}
		if(substancespecificationmoietystereochemistrycoding.hasUserSelected()) {

			s.addSbstncSpcfctnMoietyStereochemistryCdgUsrSltd(String.valueOf(substancespecificationmoietystereochemistrycoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnMoietyStereochemistryCdgUsrSltd("NULL");
		}

		if(substancespecificationmoietystereochemistrycodingi == substancespecificationmoietystereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnMoietyStereochemistryCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietystereochemistrycodingi == 0) {s.addSbstncSpcfctnMoietyStereochemistryCdgSys("[[");}
		if(substancespecificationmoietystereochemistrycoding.hasSystem()) {

			s.addSbstncSpcfctnMoietyStereochemistryCdgSys(String.valueOf(substancespecificationmoietystereochemistrycoding.getSystem()));
		} else {
			s.addSbstncSpcfctnMoietyStereochemistryCdgSys("NULL");
		}

		if(substancespecificationmoietystereochemistrycodingi == substancespecificationmoietystereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnMoietyStereochemistryCdgSys("]]");}


		 };
		/******************** substancespecificationmoietyopticalactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmoietyopticalactivity = substancespecificationmoiety.getOpticalActivity();

		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Txt ********************************************************************************/
		if(substancespecificationmoietyi == 0) {s.addSbstncSpcfctnMoietyOpticalActvtyTxt("[");}
		if(substancespecificationmoietyopticalactivity.hasText()) {

			s.addSbstncSpcfctnMoietyOpticalActvtyTxt(String.valueOf(substancespecificationmoietyopticalactivity.getText()));
		} else {
			s.addSbstncSpcfctnMoietyOpticalActvtyTxt("NULL");
		}

		if(substancespecificationmoietyi == substancespecificationmoietylist.size()-1) {s.addSbstncSpcfctnMoietyOpticalActvtyTxt("]");}


		/******************** substancespecificationmoietyopticalactivitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationmoietyopticalactivitycodinglist = substancespecificationmoietyopticalactivity.getCoding();
		for(int substancespecificationmoietyopticalactivitycodingi = 0; substancespecificationmoietyopticalactivitycodingi<substancespecificationmoietyopticalactivitycodinglist.size();substancespecificationmoietyopticalactivitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationmoietyopticalactivitycoding = substancespecificationmoietyopticalactivitycodinglist.get(substancespecificationmoietyopticalactivitycodingi);

		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycodingi == 0) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgDsply("[[");}
		if(substancespecificationmoietyopticalactivitycoding.hasDisplay()) {

			s.addSbstncSpcfctnMoietyOpticalActvtyCdgDsply(String.valueOf(substancespecificationmoietyopticalactivitycoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnMoietyOpticalActvtyCdgDsply("NULL");
		}

		if(substancespecificationmoietyopticalactivitycodingi == substancespecificationmoietyopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgDsply("]]");}


		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycodingi == 0) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgVrsn("[[");}
		if(substancespecificationmoietyopticalactivitycoding.hasVersion()) {

			s.addSbstncSpcfctnMoietyOpticalActvtyCdgVrsn(String.valueOf(substancespecificationmoietyopticalactivitycoding.getVersion()));
		} else {
			s.addSbstncSpcfctnMoietyOpticalActvtyCdgVrsn("NULL");
		}

		if(substancespecificationmoietyopticalactivitycodingi == substancespecificationmoietyopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Cd ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycodingi == 0) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgCd("[[");}
		if(substancespecificationmoietyopticalactivitycoding.hasCode()) {

			s.addSbstncSpcfctnMoietyOpticalActvtyCdgCd(String.valueOf(substancespecificationmoietyopticalactivitycoding.getCode()));
		} else {
			s.addSbstncSpcfctnMoietyOpticalActvtyCdgCd("NULL");
		}

		if(substancespecificationmoietyopticalactivitycodingi == substancespecificationmoietyopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgCd("]]");}


		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycodingi == 0) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd("[[");}
		if(substancespecificationmoietyopticalactivitycoding.hasUserSelected()) {

			s.addSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd(String.valueOf(substancespecificationmoietyopticalactivitycoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd("NULL");
		}

		if(substancespecificationmoietyopticalactivitycodingi == substancespecificationmoietyopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Sys ********************************************************************************/
		if(substancespecificationmoietyopticalactivitycodingi == 0) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgSys("[[");}
		if(substancespecificationmoietyopticalactivitycoding.hasSystem()) {

			s.addSbstncSpcfctnMoietyOpticalActvtyCdgSys(String.valueOf(substancespecificationmoietyopticalactivitycoding.getSystem()));
		} else {
			s.addSbstncSpcfctnMoietyOpticalActvtyCdgSys("NULL");
		}

		if(substancespecificationmoietyopticalactivitycodingi == substancespecificationmoietyopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnMoietyOpticalActvtyCdgSys("]]");}


		 };
		 };
		/******************** substancespecificationstructure ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureComponent substancespecificationstructure = substancespecification.getStructure();

		/******************** SbstncSpcfctn_Strctr_Src ********************************************************************************/
		if(substancespecificationstructure.hasSource()) {

			String  array = "[";
			for(int incr=0; incr<substancespecificationstructure.getSource().size(); incr++) {
				array = array + substancespecificationstructure.getSource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncSpcfctnStrctrSrc(array);

		} else {
			s.addSbstncSpcfctnStrctrSrc("NULL");
		}


		/******************** substancespecificationstructuremolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationstructuremolecularweight = substancespecificationstructure.getMolecularWeight();

		/******************** substancespecificationstructuremolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructuremolecularweightmethod = substancespecificationstructuremolecularweight.getMethod();

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethod.hasText()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtMthdTxt(String.valueOf(substancespecificationstructuremolecularweightmethod.getText()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtMthdTxt("NULL");
		}


		/******************** substancespecificationstructuremolecularweightmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructuremolecularweightmethodcodinglist = substancespecificationstructuremolecularweightmethod.getCoding();
		for(int substancespecificationstructuremolecularweightmethodcodingi = 0; substancespecificationstructuremolecularweightmethodcodingi<substancespecificationstructuremolecularweightmethodcodinglist.size();substancespecificationstructuremolecularweightmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructuremolecularweightmethodcoding = substancespecificationstructuremolecularweightmethodcodinglist.get(substancespecificationstructuremolecularweightmethodcodingi);

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply("[");}
		if(substancespecificationstructuremolecularweightmethodcoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply("NULL");
		}

		if(substancespecificationstructuremolecularweightmethodcodingi == substancespecificationstructuremolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn("[");}
		if(substancespecificationstructuremolecularweightmethodcoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn("NULL");
		}

		if(substancespecificationstructuremolecularweightmethodcodingi == substancespecificationstructuremolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd("[");}
		if(substancespecificationstructuremolecularweightmethodcoding.hasCode()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd("NULL");
		}

		if(substancespecificationstructuremolecularweightmethodcodingi == substancespecificationstructuremolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd("[");}
		if(substancespecificationstructuremolecularweightmethodcoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd("NULL");
		}

		if(substancespecificationstructuremolecularweightmethodcodingi == substancespecificationstructuremolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructuremolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys("[");}
		if(substancespecificationstructuremolecularweightmethodcoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys(String.valueOf(substancespecificationstructuremolecularweightmethodcoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys("NULL");
		}

		if(substancespecificationstructuremolecularweightmethodcodingi == substancespecificationstructuremolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys("]");}


		 };
		/******************** substancespecificationstructuremolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructuremolecularweighttype = substancespecificationstructuremolecularweight.getType();

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Txt ********************************************************************************/
		if(substancespecificationstructuremolecularweighttype.hasText()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtTypTxt(String.valueOf(substancespecificationstructuremolecularweighttype.getText()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtTypTxt("NULL");
		}


		/******************** substancespecificationstructuremolecularweighttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructuremolecularweighttypecodinglist = substancespecificationstructuremolecularweighttype.getCoding();
		for(int substancespecificationstructuremolecularweighttypecodingi = 0; substancespecificationstructuremolecularweighttypecodingi<substancespecificationstructuremolecularweighttypecodinglist.size();substancespecificationstructuremolecularweighttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructuremolecularweighttypecoding = substancespecificationstructuremolecularweighttypecodinglist.get(substancespecificationstructuremolecularweighttypecodingi);

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply("[");}
		if(substancespecificationstructuremolecularweighttypecoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply("NULL");
		}

		if(substancespecificationstructuremolecularweighttypecodingi == substancespecificationstructuremolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn("[");}
		if(substancespecificationstructuremolecularweighttypecoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn("NULL");
		}

		if(substancespecificationstructuremolecularweighttypecodingi == substancespecificationstructuremolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgCd("[");}
		if(substancespecificationstructuremolecularweighttypecoding.hasCode()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgCd(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgCd("NULL");
		}

		if(substancespecificationstructuremolecularweighttypecodingi == substancespecificationstructuremolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgCd("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd("[");}
		if(substancespecificationstructuremolecularweighttypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd("NULL");
		}

		if(substancespecificationstructuremolecularweighttypecodingi == substancespecificationstructuremolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructuremolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgSys("[");}
		if(substancespecificationstructuremolecularweighttypecoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgSys(String.valueOf(substancespecificationstructuremolecularweighttypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgSys("NULL");
		}

		if(substancespecificationstructuremolecularweighttypecodingi == substancespecificationstructuremolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrMoleclrWghtTypCdgSys("]");}


		 };
		/******************** substancespecificationstructuremolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructuremolecularweightamount = substancespecificationstructuremolecularweight.getAmount();

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasValue()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtAmntVl(String.valueOf(substancespecificationstructuremolecularweightamount.getValue()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtAmntVl("NULL");
		}


		/******************** substancespecificationstructuremolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationstructuremolecularweightamountcomparator = substancespecificationstructuremolecularweightamount.getComparator();
		if(substancespecificationstructuremolecularweightamountcomparator!=null) {
			s.addSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr(substancespecificationstructuremolecularweightamountcomparator.toCode());
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasCode()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtAmntCd(String.valueOf(substancespecificationstructuremolecularweightamount.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtAmntCd("NULL");
		}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasUnit()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtAmntUnt(String.valueOf(substancespecificationstructuremolecularweightamount.getUnit()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtAmntUnt("NULL");
		}


		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(substancespecificationstructuremolecularweightamount.hasSystem()) {

			s.addSbstncSpcfctnStrctrMoleclrWghtAmntSys(String.valueOf(substancespecificationstructuremolecularweightamount.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrWghtAmntSys("NULL");
		}


		/******************** SbstncSpcfctn_Strctr_MoleclrFrmula ********************************************************************************/
		if(substancespecificationstructure.hasMolecularFormula()) {

			s.addSbstncSpcfctnStrctrMoleclrFrmula(String.valueOf(substancespecificationstructure.getMolecularFormula()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrFrmula("NULL");
		}


		/******************** SbstncSpcfctn_Strctr_MoleclrFrmulaByMoiety ********************************************************************************/
		if(substancespecificationstructure.hasMolecularFormulaByMoiety()) {

			s.addSbstncSpcfctnStrctrMoleclrFrmulaByMoiety(String.valueOf(substancespecificationstructure.getMolecularFormulaByMoiety()));
		} else {
			s.addSbstncSpcfctnStrctrMoleclrFrmulaByMoiety("NULL");
		}


		/******************** substancespecificationstructurestereochemistry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructurestereochemistry = substancespecificationstructure.getStereochemistry();

		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Txt ********************************************************************************/
		if(substancespecificationstructurestereochemistry.hasText()) {

			s.addSbstncSpcfctnStrctrStereochemistryTxt(String.valueOf(substancespecificationstructurestereochemistry.getText()));
		} else {
			s.addSbstncSpcfctnStrctrStereochemistryTxt("NULL");
		}


		/******************** substancespecificationstructurestereochemistrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructurestereochemistrycodinglist = substancespecificationstructurestereochemistry.getCoding();
		for(int substancespecificationstructurestereochemistrycodingi = 0; substancespecificationstructurestereochemistrycodingi<substancespecificationstructurestereochemistrycodinglist.size();substancespecificationstructurestereochemistrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructurestereochemistrycoding = substancespecificationstructurestereochemistrycodinglist.get(substancespecificationstructurestereochemistrycodingi);

		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructurestereochemistrycodingi == 0) {s.addSbstncSpcfctnStrctrStereochemistryCdgDsply("[");}
		if(substancespecificationstructurestereochemistrycoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrStereochemistryCdgDsply(String.valueOf(substancespecificationstructurestereochemistrycoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrStereochemistryCdgDsply("NULL");
		}

		if(substancespecificationstructurestereochemistrycodingi == substancespecificationstructurestereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnStrctrStereochemistryCdgDsply("]");}


		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructurestereochemistrycodingi == 0) {s.addSbstncSpcfctnStrctrStereochemistryCdgVrsn("[");}
		if(substancespecificationstructurestereochemistrycoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrStereochemistryCdgVrsn(String.valueOf(substancespecificationstructurestereochemistrycoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrStereochemistryCdgVrsn("NULL");
		}

		if(substancespecificationstructurestereochemistrycodingi == substancespecificationstructurestereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnStrctrStereochemistryCdgVrsn("]");}


		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructurestereochemistrycodingi == 0) {s.addSbstncSpcfctnStrctrStereochemistryCdgCd("[");}
		if(substancespecificationstructurestereochemistrycoding.hasCode()) {

			s.addSbstncSpcfctnStrctrStereochemistryCdgCd(String.valueOf(substancespecificationstructurestereochemistrycoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrStereochemistryCdgCd("NULL");
		}

		if(substancespecificationstructurestereochemistrycodingi == substancespecificationstructurestereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnStrctrStereochemistryCdgCd("]");}


		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructurestereochemistrycodingi == 0) {s.addSbstncSpcfctnStrctrStereochemistryCdgUsrSltd("[");}
		if(substancespecificationstructurestereochemistrycoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrStereochemistryCdgUsrSltd(String.valueOf(substancespecificationstructurestereochemistrycoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrStereochemistryCdgUsrSltd("NULL");
		}

		if(substancespecificationstructurestereochemistrycodingi == substancespecificationstructurestereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnStrctrStereochemistryCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructurestereochemistrycodingi == 0) {s.addSbstncSpcfctnStrctrStereochemistryCdgSys("[");}
		if(substancespecificationstructurestereochemistrycoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrStereochemistryCdgSys(String.valueOf(substancespecificationstructurestereochemistrycoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrStereochemistryCdgSys("NULL");
		}

		if(substancespecificationstructurestereochemistrycodingi == substancespecificationstructurestereochemistrycodinglist.size()-1) {s.addSbstncSpcfctnStrctrStereochemistryCdgSys("]");}


		 };
		/******************** substancespecificationstructureopticalactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureopticalactivity = substancespecificationstructure.getOpticalActivity();

		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Txt ********************************************************************************/
		if(substancespecificationstructureopticalactivity.hasText()) {

			s.addSbstncSpcfctnStrctrOpticalActvtyTxt(String.valueOf(substancespecificationstructureopticalactivity.getText()));
		} else {
			s.addSbstncSpcfctnStrctrOpticalActvtyTxt("NULL");
		}


		/******************** substancespecificationstructureopticalactivitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructureopticalactivitycodinglist = substancespecificationstructureopticalactivity.getCoding();
		for(int substancespecificationstructureopticalactivitycodingi = 0; substancespecificationstructureopticalactivitycodingi<substancespecificationstructureopticalactivitycodinglist.size();substancespecificationstructureopticalactivitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructureopticalactivitycoding = substancespecificationstructureopticalactivitycodinglist.get(substancespecificationstructureopticalactivitycodingi);

		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureopticalactivitycodingi == 0) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgDsply("[");}
		if(substancespecificationstructureopticalactivitycoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrOpticalActvtyCdgDsply(String.valueOf(substancespecificationstructureopticalactivitycoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrOpticalActvtyCdgDsply("NULL");
		}

		if(substancespecificationstructureopticalactivitycodingi == substancespecificationstructureopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgDsply("]");}


		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureopticalactivitycodingi == 0) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgVrsn("[");}
		if(substancespecificationstructureopticalactivitycoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrOpticalActvtyCdgVrsn(String.valueOf(substancespecificationstructureopticalactivitycoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrOpticalActvtyCdgVrsn("NULL");
		}

		if(substancespecificationstructureopticalactivitycodingi == substancespecificationstructureopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgVrsn("]");}


		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureopticalactivitycodingi == 0) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgCd("[");}
		if(substancespecificationstructureopticalactivitycoding.hasCode()) {

			s.addSbstncSpcfctnStrctrOpticalActvtyCdgCd(String.valueOf(substancespecificationstructureopticalactivitycoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrOpticalActvtyCdgCd("NULL");
		}

		if(substancespecificationstructureopticalactivitycodingi == substancespecificationstructureopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgCd("]");}


		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureopticalactivitycodingi == 0) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd("[");}
		if(substancespecificationstructureopticalactivitycoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd(String.valueOf(substancespecificationstructureopticalactivitycoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd("NULL");
		}

		if(substancespecificationstructureopticalactivitycodingi == substancespecificationstructureopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd("]");}


		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureopticalactivitycodingi == 0) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgSys("[");}
		if(substancespecificationstructureopticalactivitycoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrOpticalActvtyCdgSys(String.valueOf(substancespecificationstructureopticalactivitycoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrOpticalActvtyCdgSys("NULL");
		}

		if(substancespecificationstructureopticalactivitycodingi == substancespecificationstructureopticalactivitycodinglist.size()-1) {s.addSbstncSpcfctnStrctrOpticalActvtyCdgSys("]");}


		 };
		/******************** substancespecificationstructurerepresentation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent> substancespecificationstructurerepresentationlist = substancespecificationstructure.getRepresentation();
		for(int substancespecificationstructurerepresentationi = 0; substancespecificationstructurerepresentationi<substancespecificationstructurerepresentationlist.size();substancespecificationstructurerepresentationi++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureRepresentationComponent  substancespecificationstructurerepresentation = substancespecificationstructurerepresentationlist.get(substancespecificationstructurerepresentationi);

		/******************** substancespecificationstructurerepresentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructurerepresentationtype = substancespecificationstructurerepresentation.getType();

		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Txt ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationTypTxt("[");}
		if(substancespecificationstructurerepresentationtype.hasText()) {

			s.addSbstncSpcfctnStrctrRepresentationTypTxt(String.valueOf(substancespecificationstructurerepresentationtype.getText()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationTypTxt("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationTypTxt("]");}


		/******************** substancespecificationstructurerepresentationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructurerepresentationtypecodinglist = substancespecificationstructurerepresentationtype.getCoding();
		for(int substancespecificationstructurerepresentationtypecodingi = 0; substancespecificationstructurerepresentationtypecodingi<substancespecificationstructurerepresentationtypecodinglist.size();substancespecificationstructurerepresentationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructurerepresentationtypecoding = substancespecificationstructurerepresentationtypecodinglist.get(substancespecificationstructurerepresentationtypecodingi);

		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecodingi == 0) {s.addSbstncSpcfctnStrctrRepresentationTypCdgDsply("[[");}
		if(substancespecificationstructurerepresentationtypecoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrRepresentationTypCdgDsply(String.valueOf(substancespecificationstructurerepresentationtypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationTypCdgDsply("NULL");
		}

		if(substancespecificationstructurerepresentationtypecodingi == substancespecificationstructurerepresentationtypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationTypCdgDsply("]]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecodingi == 0) {s.addSbstncSpcfctnStrctrRepresentationTypCdgVrsn("[[");}
		if(substancespecificationstructurerepresentationtypecoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrRepresentationTypCdgVrsn(String.valueOf(substancespecificationstructurerepresentationtypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationTypCdgVrsn("NULL");
		}

		if(substancespecificationstructurerepresentationtypecodingi == substancespecificationstructurerepresentationtypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationTypCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecodingi == 0) {s.addSbstncSpcfctnStrctrRepresentationTypCdgCd("[[");}
		if(substancespecificationstructurerepresentationtypecoding.hasCode()) {

			s.addSbstncSpcfctnStrctrRepresentationTypCdgCd(String.valueOf(substancespecificationstructurerepresentationtypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationTypCdgCd("NULL");
		}

		if(substancespecificationstructurerepresentationtypecodingi == substancespecificationstructurerepresentationtypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationTypCdgCd("]]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecodingi == 0) {s.addSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd("[[");}
		if(substancespecificationstructurerepresentationtypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd(String.valueOf(substancespecificationstructurerepresentationtypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd("NULL");
		}

		if(substancespecificationstructurerepresentationtypecodingi == substancespecificationstructurerepresentationtypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructurerepresentationtypecodingi == 0) {s.addSbstncSpcfctnStrctrRepresentationTypCdgSys("[[");}
		if(substancespecificationstructurerepresentationtypecoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrRepresentationTypCdgSys(String.valueOf(substancespecificationstructurerepresentationtypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationTypCdgSys("NULL");
		}

		if(substancespecificationstructurerepresentationtypecodingi == substancespecificationstructurerepresentationtypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationTypCdgSys("]]");}


		 };
		/******************** substancespecificationstructurerepresentationattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substancespecificationstructurerepresentationattachment = substancespecificationstructurerepresentation.getAttachment();

		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Sz ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntSz("[");}
		if(substancespecificationstructurerepresentationattachment.hasSize()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntSz(String.valueOf(substancespecificationstructurerepresentationattachment.getSize()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntSz("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntSz("]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Lnguage ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntLnguage("[");}
		if(substancespecificationstructurerepresentationattachment.hasLanguage()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntLnguage(String.valueOf(substancespecificationstructurerepresentationattachment.getLanguage()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntLnguage("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntLnguage("]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_CntntTyp ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp("[");}
		if(substancespecificationstructurerepresentationattachment.hasContentType()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp(String.valueOf(substancespecificationstructurerepresentationattachment.getContentType()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp("]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Hash ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntHash("[");}
		if(substancespecificationstructurerepresentationattachment.hasHash()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntHash(new String(substancespecificationstructurerepresentationattachment.getHash()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntHash("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntHash("]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Data ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntData("[");}
		if(substancespecificationstructurerepresentationattachment.hasData()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntData(new String(substancespecificationstructurerepresentationattachment.getData()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntData("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntData("]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Creation ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntCreation("[");}
		if(substancespecificationstructurerepresentationattachment.hasCreation()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationstructurerepresentationattachment.getCreation())+"\"");
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntCreation("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntCreation("]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Ttl ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntTtl("[");}
		if(substancespecificationstructurerepresentationattachment.hasTitle()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntTtl(String.valueOf(substancespecificationstructurerepresentationattachment.getTitle()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntTtl("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntTtl("]");}


		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Url ********************************************************************************/
		if(substancespecificationstructurerepresentationi == 0) {s.addSbstncSpcfctnStrctrRepresentationAttchmntUrl("[");}
		if(substancespecificationstructurerepresentationattachment.hasUrl()) {

			s.addSbstncSpcfctnStrctrRepresentationAttchmntUrl(String.valueOf(substancespecificationstructurerepresentationattachment.getUrl()));
		} else {
			s.addSbstncSpcfctnStrctrRepresentationAttchmntUrl("NULL");
		}

		if(substancespecificationstructurerepresentationi == substancespecificationstructurerepresentationlist.size()-1) {s.addSbstncSpcfctnStrctrRepresentationAttchmntUrl("]");}


		 };
		/******************** substancespecificationstructureisotope ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent> substancespecificationstructureisotopelist = substancespecificationstructure.getIsotope();
		for(int substancespecificationstructureisotopei = 0; substancespecificationstructureisotopei<substancespecificationstructureisotopelist.size();substancespecificationstructureisotopei++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeComponent  substancespecificationstructureisotope = substancespecificationstructureisotopelist.get(substancespecificationstructureisotopei);

		/******************** substancespecificationstructureisotopename ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopename = substancespecificationstructureisotope.getName();

		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Txt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeNmTxt("[");}
		if(substancespecificationstructureisotopename.hasText()) {

			s.addSbstncSpcfctnStrctrIsotopeNmTxt(String.valueOf(substancespecificationstructureisotopename.getText()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeNmTxt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeNmTxt("]");}


		/******************** substancespecificationstructureisotopenamecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructureisotopenamecodinglist = substancespecificationstructureisotopename.getCoding();
		for(int substancespecificationstructureisotopenamecodingi = 0; substancespecificationstructureisotopenamecodingi<substancespecificationstructureisotopenamecodinglist.size();substancespecificationstructureisotopenamecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructureisotopenamecoding = substancespecificationstructureisotopenamecodinglist.get(substancespecificationstructureisotopenamecodingi);

		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopenamecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeNmCdgDsply("[[");}
		if(substancespecificationstructureisotopenamecoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrIsotopeNmCdgDsply(String.valueOf(substancespecificationstructureisotopenamecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeNmCdgDsply("NULL");
		}

		if(substancespecificationstructureisotopenamecodingi == substancespecificationstructureisotopenamecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeNmCdgDsply("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopenamecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeNmCdgVrsn("[[");}
		if(substancespecificationstructureisotopenamecoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrIsotopeNmCdgVrsn(String.valueOf(substancespecificationstructureisotopenamecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeNmCdgVrsn("NULL");
		}

		if(substancespecificationstructureisotopenamecodingi == substancespecificationstructureisotopenamecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeNmCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopenamecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeNmCdgCd("[[");}
		if(substancespecificationstructureisotopenamecoding.hasCode()) {

			s.addSbstncSpcfctnStrctrIsotopeNmCdgCd(String.valueOf(substancespecificationstructureisotopenamecoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeNmCdgCd("NULL");
		}

		if(substancespecificationstructureisotopenamecodingi == substancespecificationstructureisotopenamecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeNmCdgCd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopenamecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd("[[");}
		if(substancespecificationstructureisotopenamecoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd(String.valueOf(substancespecificationstructureisotopenamecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd("NULL");
		}

		if(substancespecificationstructureisotopenamecodingi == substancespecificationstructureisotopenamecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopenamecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeNmCdgSys("[[");}
		if(substancespecificationstructureisotopenamecoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeNmCdgSys(String.valueOf(substancespecificationstructureisotopenamecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeNmCdgSys("NULL");
		}

		if(substancespecificationstructureisotopenamecodingi == substancespecificationstructureisotopenamecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeNmCdgSys("]]");}


		 };
		/******************** substancespecificationstructureisotopeidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substancespecificationstructureisotopeidentifier = substancespecificationstructureisotope.getIdentifier();

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Vl ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeIdVl("[");}
		if(substancespecificationstructureisotopeidentifier.hasValue()) {

			s.addSbstncSpcfctnStrctrIsotopeIdVl(String.valueOf(substancespecificationstructureisotopeidentifier.getValue()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdVl("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdVl("]");}


		/******************** substancespecificationstructureisotopeidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopeidentifiertype = substancespecificationstructureisotopeidentifier.getType();

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Txt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeIdTypTxt("[");}
		if(substancespecificationstructureisotopeidentifiertype.hasText()) {

			s.addSbstncSpcfctnStrctrIsotopeIdTypTxt(String.valueOf(substancespecificationstructureisotopeidentifiertype.getText()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdTypTxt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdTypTxt("]");}


		/******************** substancespecificationstructureisotopeidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructureisotopeidentifiertypecodinglist = substancespecificationstructureisotopeidentifiertype.getCoding();
		for(int substancespecificationstructureisotopeidentifiertypecodingi = 0; substancespecificationstructureisotopeidentifiertypecodingi<substancespecificationstructureisotopeidentifiertypecodinglist.size();substancespecificationstructureisotopeidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructureisotopeidentifiertypecoding = substancespecificationstructureisotopeidentifiertypecodinglist.get(substancespecificationstructureisotopeidentifiertypecodingi);

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgDsply("[[");}
		if(substancespecificationstructureisotopeidentifiertypecoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgDsply(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgDsply("NULL");
		}

		if(substancespecificationstructureisotopeidentifiertypecodingi == substancespecificationstructureisotopeidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgDsply("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn("[[");}
		if(substancespecificationstructureisotopeidentifiertypecoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn("NULL");
		}

		if(substancespecificationstructureisotopeidentifiertypecodingi == substancespecificationstructureisotopeidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgCd("[[");}
		if(substancespecificationstructureisotopeidentifiertypecoding.hasCode()) {

			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgCd(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgCd("NULL");
		}

		if(substancespecificationstructureisotopeidentifiertypecodingi == substancespecificationstructureisotopeidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgCd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd("[[");}
		if(substancespecificationstructureisotopeidentifiertypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd("NULL");
		}

		if(substancespecificationstructureisotopeidentifiertypecodingi == substancespecificationstructureisotopeidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopeidentifiertypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgSys("[[");}
		if(substancespecificationstructureisotopeidentifiertypecoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgSys(String.valueOf(substancespecificationstructureisotopeidentifiertypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdTypCdgSys("NULL");
		}

		if(substancespecificationstructureisotopeidentifiertypecodingi == substancespecificationstructureisotopeidentifiertypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdTypCdgSys("]]");}


		 };
		/******************** substancespecificationstructureisotopeidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substancespecificationstructureisotopeidentifierperiod = substancespecificationstructureisotopeidentifier.getPeriod();

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeIdPrdStrt("[");}
		if(substancespecificationstructureisotopeidentifierperiod.hasStart()) {

			s.addSbstncSpcfctnStrctrIsotopeIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationstructureisotopeidentifierperiod.getStart())+"\"");
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdPrdStrt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdPrdStrt("]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_End ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeIdPrdEnd("[");}
		if(substancespecificationstructureisotopeidentifierperiod.hasEnd()) {

			s.addSbstncSpcfctnStrctrIsotopeIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substancespecificationstructureisotopeidentifierperiod.getEnd())+"\"");
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdPrdEnd("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdPrdEnd("]");}


		/******************** substancespecificationstructureisotopeidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substancespecificationstructureisotopeidentifieruse = substancespecificationstructureisotopeidentifier.getUse();
		if(substancespecificationstructureisotopeidentifieruse!=null) {
		if(substancespecificationstructureisotopei == 0) {

		s.addSbstncSpcfctnStrctrIsotopeIdUse("[");		}
			s.addSbstncSpcfctnStrctrIsotopeIdUse(substancespecificationstructureisotopeidentifieruse.toCode());
		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {

		s.addSbstncSpcfctnStrctrIsotopeIdUse("]");		}

		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdUse("NULL");
		}

		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Assigner ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeIdAssigner("[");}
		if(substancespecificationstructureisotopeidentifier.hasAssigner()) {

			if(substancespecificationstructureisotopeidentifier.getAssigner().getReference() != null) {
			s.addSbstncSpcfctnStrctrIsotopeIdAssigner(substancespecificationstructureisotopeidentifier.getAssigner().getReference());
			}
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdAssigner("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdAssigner("]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Sys ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeIdSys("[");}
		if(substancespecificationstructureisotopeidentifier.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeIdSys(String.valueOf(substancespecificationstructureisotopeidentifier.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeIdSys("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeIdSys("]");}


		/******************** substancespecificationstructureisotopemolecularweight ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent substancespecificationstructureisotopemolecularweight = substancespecificationstructureisotope.getMolecularWeight();

		/******************** substancespecificationstructureisotopemolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopemolecularweightmethod = substancespecificationstructureisotopemolecularweight.getMethod();

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt("[");}
		if(substancespecificationstructureisotopemolecularweightmethod.hasText()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt(String.valueOf(substancespecificationstructureisotopemolecularweightmethod.getText()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt("]");}


		/******************** substancespecificationstructureisotopemolecularweightmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructureisotopemolecularweightmethodcodinglist = substancespecificationstructureisotopemolecularweightmethod.getCoding();
		for(int substancespecificationstructureisotopemolecularweightmethodcodingi = 0; substancespecificationstructureisotopemolecularweightmethodcodingi<substancespecificationstructureisotopemolecularweightmethodcodinglist.size();substancespecificationstructureisotopemolecularweightmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructureisotopemolecularweightmethodcoding = substancespecificationstructureisotopemolecularweightmethodcodinglist.get(substancespecificationstructureisotopemolecularweightmethodcodingi);

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply("[[");}
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply("NULL");
		}

		if(substancespecificationstructureisotopemolecularweightmethodcodingi == substancespecificationstructureisotopemolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn("[[");}
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn("NULL");
		}

		if(substancespecificationstructureisotopemolecularweightmethodcodingi == substancespecificationstructureisotopemolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd("[[");}
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasCode()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd("NULL");
		}

		if(substancespecificationstructureisotopemolecularweightmethodcodingi == substancespecificationstructureisotopemolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd("[[");}
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd("NULL");
		}

		if(substancespecificationstructureisotopemolecularweightmethodcodingi == substancespecificationstructureisotopemolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys("[[");}
		if(substancespecificationstructureisotopemolecularweightmethodcoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys(String.valueOf(substancespecificationstructureisotopemolecularweightmethodcoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys("NULL");
		}

		if(substancespecificationstructureisotopemolecularweightmethodcodingi == substancespecificationstructureisotopemolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys("]]");}


		 };
		/******************** substancespecificationstructureisotopemolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopemolecularweighttype = substancespecificationstructureisotopemolecularweight.getType();

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Txt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt("[");}
		if(substancespecificationstructureisotopemolecularweighttype.hasText()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt(String.valueOf(substancespecificationstructureisotopemolecularweighttype.getText()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt("]");}


		/******************** substancespecificationstructureisotopemolecularweighttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructureisotopemolecularweighttypecodinglist = substancespecificationstructureisotopemolecularweighttype.getCoding();
		for(int substancespecificationstructureisotopemolecularweighttypecodingi = 0; substancespecificationstructureisotopemolecularweighttypecodingi<substancespecificationstructureisotopemolecularweighttypecodinglist.size();substancespecificationstructureisotopemolecularweighttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructureisotopemolecularweighttypecoding = substancespecificationstructureisotopemolecularweighttypecodinglist.get(substancespecificationstructureisotopemolecularweighttypecodingi);

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply("[[");}
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply("NULL");
		}

		if(substancespecificationstructureisotopemolecularweighttypecodingi == substancespecificationstructureisotopemolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn("[[");}
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn("NULL");
		}

		if(substancespecificationstructureisotopemolecularweighttypecodingi == substancespecificationstructureisotopemolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd("[[");}
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasCode()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd("NULL");
		}

		if(substancespecificationstructureisotopemolecularweighttypecodingi == substancespecificationstructureisotopemolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd("[[");}
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd("NULL");
		}

		if(substancespecificationstructureisotopemolecularweighttypecodingi == substancespecificationstructureisotopemolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopemolecularweighttypecodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys("[[");}
		if(substancespecificationstructureisotopemolecularweighttypecoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys(String.valueOf(substancespecificationstructureisotopemolecularweighttypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys("NULL");
		}

		if(substancespecificationstructureisotopemolecularweighttypecodingi == substancespecificationstructureisotopemolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys("]]");}


		 };
		/******************** substancespecificationstructureisotopemolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructureisotopemolecularweightamount = substancespecificationstructureisotopemolecularweight.getAmount();

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl("[");}
		if(substancespecificationstructureisotopemolecularweightamount.hasValue()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getValue()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl("]");}


		/******************** substancespecificationstructureisotopemolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationstructureisotopemolecularweightamountcomparator = substancespecificationstructureisotopemolecularweightamount.getComparator();
		if(substancespecificationstructureisotopemolecularweightamountcomparator!=null) {
		if(substancespecificationstructureisotopei == 0) {

		s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr("[");		}
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr(substancespecificationstructureisotopemolecularweightamountcomparator.toCode());
		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {

		s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd("[");}
		if(substancespecificationstructureisotopemolecularweightamount.hasCode()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd("]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt("[");}
		if(substancespecificationstructureisotopemolecularweightamount.hasUnit()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getUnit()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt("]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys("[");}
		if(substancespecificationstructureisotopemolecularweightamount.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys(String.valueOf(substancespecificationstructureisotopemolecularweightamount.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys("]");}


		/******************** substancespecificationstructureisotopesubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationstructureisotopesubstitution = substancespecificationstructureisotope.getSubstitution();

		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Txt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionTxt("[");}
		if(substancespecificationstructureisotopesubstitution.hasText()) {

			s.addSbstncSpcfctnStrctrIsotopeSubstitutionTxt(String.valueOf(substancespecificationstructureisotopesubstitution.getText()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeSubstitutionTxt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionTxt("]");}


		/******************** substancespecificationstructureisotopesubstitutioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationstructureisotopesubstitutioncodinglist = substancespecificationstructureisotopesubstitution.getCoding();
		for(int substancespecificationstructureisotopesubstitutioncodingi = 0; substancespecificationstructureisotopesubstitutioncodingi<substancespecificationstructureisotopesubstitutioncodinglist.size();substancespecificationstructureisotopesubstitutioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationstructureisotopesubstitutioncoding = substancespecificationstructureisotopesubstitutioncodinglist.get(substancespecificationstructureisotopesubstitutioncodingi);

		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Dsply ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply("[[");}
		if(substancespecificationstructureisotopesubstitutioncoding.hasDisplay()) {

			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply("NULL");
		}

		if(substancespecificationstructureisotopesubstitutioncodingi == substancespecificationstructureisotopesubstitutioncodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn("[[");}
		if(substancespecificationstructureisotopesubstitutioncoding.hasVersion()) {

			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getVersion()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn("NULL");
		}

		if(substancespecificationstructureisotopesubstitutioncodingi == substancespecificationstructureisotopesubstitutioncodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Cd ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd("[[");}
		if(substancespecificationstructureisotopesubstitutioncoding.hasCode()) {

			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd("NULL");
		}

		if(substancespecificationstructureisotopesubstitutioncodingi == substancespecificationstructureisotopesubstitutioncodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd("[[");}
		if(substancespecificationstructureisotopesubstitutioncoding.hasUserSelected()) {

			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd("NULL");
		}

		if(substancespecificationstructureisotopesubstitutioncodingi == substancespecificationstructureisotopesubstitutioncodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Sys ********************************************************************************/
		if(substancespecificationstructureisotopesubstitutioncodingi == 0) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys("[[");}
		if(substancespecificationstructureisotopesubstitutioncoding.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys(String.valueOf(substancespecificationstructureisotopesubstitutioncoding.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys("NULL");
		}

		if(substancespecificationstructureisotopesubstitutioncodingi == substancespecificationstructureisotopesubstitutioncodinglist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys("]]");}


		 };
		/******************** substancespecificationstructureisotopehalflife ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationstructureisotopehalflife = substancespecificationstructureisotope.getHalfLife();

		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Vl ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeVl("[");}
		if(substancespecificationstructureisotopehalflife.hasValue()) {

			s.addSbstncSpcfctnStrctrIsotopeHalfLifeVl(String.valueOf(substancespecificationstructureisotopehalflife.getValue()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeHalfLifeVl("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeVl("]");}


		/******************** substancespecificationstructureisotopehalflifecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationstructureisotopehalflifecomparator = substancespecificationstructureisotopehalflife.getComparator();
		if(substancespecificationstructureisotopehalflifecomparator!=null) {
		if(substancespecificationstructureisotopei == 0) {

		s.addSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr("[");		}
			s.addSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr(substancespecificationstructureisotopehalflifecomparator.toCode());
		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {

		s.addSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Cd ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeCd("[");}
		if(substancespecificationstructureisotopehalflife.hasCode()) {

			s.addSbstncSpcfctnStrctrIsotopeHalfLifeCd(String.valueOf(substancespecificationstructureisotopehalflife.getCode()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeHalfLifeCd("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeCd("]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Unt ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeUnt("[");}
		if(substancespecificationstructureisotopehalflife.hasUnit()) {

			s.addSbstncSpcfctnStrctrIsotopeHalfLifeUnt(String.valueOf(substancespecificationstructureisotopehalflife.getUnit()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeHalfLifeUnt("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeUnt("]");}


		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Sys ********************************************************************************/
		if(substancespecificationstructureisotopei == 0) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeSys("[");}
		if(substancespecificationstructureisotopehalflife.hasSystem()) {

			s.addSbstncSpcfctnStrctrIsotopeHalfLifeSys(String.valueOf(substancespecificationstructureisotopehalflife.getSystem()));
		} else {
			s.addSbstncSpcfctnStrctrIsotopeHalfLifeSys("NULL");
		}

		if(substancespecificationstructureisotopei == substancespecificationstructureisotopelist.size()-1) {s.addSbstncSpcfctnStrctrIsotopeHalfLifeSys("]");}


		 };
		/******************** substancespecificationmolecularweight ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent> substancespecificationmolecularweightlist = substancespecification.getMolecularWeight();
		for(int substancespecificationmolecularweighti = 0; substancespecificationmolecularweighti<substancespecificationmolecularweightlist.size();substancespecificationmolecularweighti++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationStructureIsotopeMolecularWeightComponent  substancespecificationmolecularweight = substancespecificationmolecularweightlist.get(substancespecificationmolecularweighti);

		/******************** substancespecificationmolecularweightmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmolecularweightmethod = substancespecificationmolecularweight.getMethod();

		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Txt ********************************************************************************/
		if(substancespecificationmolecularweighti == 0) {s.addSbstncSpcfctnMoleclrWghtMthdTxt("[");}
		if(substancespecificationmolecularweightmethod.hasText()) {

			s.addSbstncSpcfctnMoleclrWghtMthdTxt(String.valueOf(substancespecificationmolecularweightmethod.getText()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtMthdTxt("NULL");
		}

		if(substancespecificationmolecularweighti == substancespecificationmolecularweightlist.size()-1) {s.addSbstncSpcfctnMoleclrWghtMthdTxt("]");}


		/******************** substancespecificationmolecularweightmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationmolecularweightmethodcodinglist = substancespecificationmolecularweightmethod.getCoding();
		for(int substancespecificationmolecularweightmethodcodingi = 0; substancespecificationmolecularweightmethodcodingi<substancespecificationmolecularweightmethodcodinglist.size();substancespecificationmolecularweightmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationmolecularweightmethodcoding = substancespecificationmolecularweightmethodcodinglist.get(substancespecificationmolecularweightmethodcodingi);

		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnMoleclrWghtMthdCdgDsply("[[");}
		if(substancespecificationmolecularweightmethodcoding.hasDisplay()) {

			s.addSbstncSpcfctnMoleclrWghtMthdCdgDsply(String.valueOf(substancespecificationmolecularweightmethodcoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtMthdCdgDsply("NULL");
		}

		if(substancespecificationmolecularweightmethodcodingi == substancespecificationmolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtMthdCdgDsply("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnMoleclrWghtMthdCdgVrsn("[[");}
		if(substancespecificationmolecularweightmethodcoding.hasVersion()) {

			s.addSbstncSpcfctnMoleclrWghtMthdCdgVrsn(String.valueOf(substancespecificationmolecularweightmethodcoding.getVersion()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtMthdCdgVrsn("NULL");
		}

		if(substancespecificationmolecularweightmethodcodingi == substancespecificationmolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtMthdCdgVrsn("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
		if(substancespecificationmolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnMoleclrWghtMthdCdgCd("[[");}
		if(substancespecificationmolecularweightmethodcoding.hasCode()) {

			s.addSbstncSpcfctnMoleclrWghtMthdCdgCd(String.valueOf(substancespecificationmolecularweightmethodcoding.getCode()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtMthdCdgCd("NULL");
		}

		if(substancespecificationmolecularweightmethodcodingi == substancespecificationmolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtMthdCdgCd("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd("[[");}
		if(substancespecificationmolecularweightmethodcoding.hasUserSelected()) {

			s.addSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd(String.valueOf(substancespecificationmolecularweightmethodcoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd("NULL");
		}

		if(substancespecificationmolecularweightmethodcodingi == substancespecificationmolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
		if(substancespecificationmolecularweightmethodcodingi == 0) {s.addSbstncSpcfctnMoleclrWghtMthdCdgSys("[[");}
		if(substancespecificationmolecularweightmethodcoding.hasSystem()) {

			s.addSbstncSpcfctnMoleclrWghtMthdCdgSys(String.valueOf(substancespecificationmolecularweightmethodcoding.getSystem()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtMthdCdgSys("NULL");
		}

		if(substancespecificationmolecularweightmethodcodingi == substancespecificationmolecularweightmethodcodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtMthdCdgSys("]]");}


		 };
		/******************** substancespecificationmolecularweighttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationmolecularweighttype = substancespecificationmolecularweight.getType();

		/******************** SbstncSpcfctn_MoleclrWght_Typ_Txt ********************************************************************************/
		if(substancespecificationmolecularweighti == 0) {s.addSbstncSpcfctnMoleclrWghtTypTxt("[");}
		if(substancespecificationmolecularweighttype.hasText()) {

			s.addSbstncSpcfctnMoleclrWghtTypTxt(String.valueOf(substancespecificationmolecularweighttype.getText()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtTypTxt("NULL");
		}

		if(substancespecificationmolecularweighti == substancespecificationmolecularweightlist.size()-1) {s.addSbstncSpcfctnMoleclrWghtTypTxt("]");}


		/******************** substancespecificationmolecularweighttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationmolecularweighttypecodinglist = substancespecificationmolecularweighttype.getCoding();
		for(int substancespecificationmolecularweighttypecodingi = 0; substancespecificationmolecularweighttypecodingi<substancespecificationmolecularweighttypecodinglist.size();substancespecificationmolecularweighttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationmolecularweighttypecoding = substancespecificationmolecularweighttypecodinglist.get(substancespecificationmolecularweighttypecodingi);

		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
		if(substancespecificationmolecularweighttypecodingi == 0) {s.addSbstncSpcfctnMoleclrWghtTypCdgDsply("[[");}
		if(substancespecificationmolecularweighttypecoding.hasDisplay()) {

			s.addSbstncSpcfctnMoleclrWghtTypCdgDsply(String.valueOf(substancespecificationmolecularweighttypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtTypCdgDsply("NULL");
		}

		if(substancespecificationmolecularweighttypecodingi == substancespecificationmolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtTypCdgDsply("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationmolecularweighttypecodingi == 0) {s.addSbstncSpcfctnMoleclrWghtTypCdgVrsn("[[");}
		if(substancespecificationmolecularweighttypecoding.hasVersion()) {

			s.addSbstncSpcfctnMoleclrWghtTypCdgVrsn(String.valueOf(substancespecificationmolecularweighttypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtTypCdgVrsn("NULL");
		}

		if(substancespecificationmolecularweighttypecodingi == substancespecificationmolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtTypCdgVrsn("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
		if(substancespecificationmolecularweighttypecodingi == 0) {s.addSbstncSpcfctnMoleclrWghtTypCdgCd("[[");}
		if(substancespecificationmolecularweighttypecoding.hasCode()) {

			s.addSbstncSpcfctnMoleclrWghtTypCdgCd(String.valueOf(substancespecificationmolecularweighttypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtTypCdgCd("NULL");
		}

		if(substancespecificationmolecularweighttypecodingi == substancespecificationmolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtTypCdgCd("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationmolecularweighttypecodingi == 0) {s.addSbstncSpcfctnMoleclrWghtTypCdgUsrSltd("[[");}
		if(substancespecificationmolecularweighttypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnMoleclrWghtTypCdgUsrSltd(String.valueOf(substancespecificationmolecularweighttypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtTypCdgUsrSltd("NULL");
		}

		if(substancespecificationmolecularweighttypecodingi == substancespecificationmolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtTypCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
		if(substancespecificationmolecularweighttypecodingi == 0) {s.addSbstncSpcfctnMoleclrWghtTypCdgSys("[[");}
		if(substancespecificationmolecularweighttypecoding.hasSystem()) {

			s.addSbstncSpcfctnMoleclrWghtTypCdgSys(String.valueOf(substancespecificationmolecularweighttypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtTypCdgSys("NULL");
		}

		if(substancespecificationmolecularweighttypecodingi == substancespecificationmolecularweighttypecodinglist.size()-1) {s.addSbstncSpcfctnMoleclrWghtTypCdgSys("]]");}


		 };
		/******************** substancespecificationmolecularweightamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationmolecularweightamount = substancespecificationmolecularweight.getAmount();

		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Vl ********************************************************************************/
		if(substancespecificationmolecularweighti == 0) {s.addSbstncSpcfctnMoleclrWghtAmntVl("[");}
		if(substancespecificationmolecularweightamount.hasValue()) {

			s.addSbstncSpcfctnMoleclrWghtAmntVl(String.valueOf(substancespecificationmolecularweightamount.getValue()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtAmntVl("NULL");
		}

		if(substancespecificationmolecularweighti == substancespecificationmolecularweightlist.size()-1) {s.addSbstncSpcfctnMoleclrWghtAmntVl("]");}


		/******************** substancespecificationmolecularweightamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationmolecularweightamountcomparator = substancespecificationmolecularweightamount.getComparator();
		if(substancespecificationmolecularweightamountcomparator!=null) {
		if(substancespecificationmolecularweighti == 0) {

		s.addSbstncSpcfctnMoleclrWghtAmntCmprtr("[");		}
			s.addSbstncSpcfctnMoleclrWghtAmntCmprtr(substancespecificationmolecularweightamountcomparator.toCode());
		if(substancespecificationmolecularweighti == substancespecificationmolecularweightlist.size()-1) {

		s.addSbstncSpcfctnMoleclrWghtAmntCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnMoleclrWghtAmntCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Cd ********************************************************************************/
		if(substancespecificationmolecularweighti == 0) {s.addSbstncSpcfctnMoleclrWghtAmntCd("[");}
		if(substancespecificationmolecularweightamount.hasCode()) {

			s.addSbstncSpcfctnMoleclrWghtAmntCd(String.valueOf(substancespecificationmolecularweightamount.getCode()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtAmntCd("NULL");
		}

		if(substancespecificationmolecularweighti == substancespecificationmolecularweightlist.size()-1) {s.addSbstncSpcfctnMoleclrWghtAmntCd("]");}


		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Unt ********************************************************************************/
		if(substancespecificationmolecularweighti == 0) {s.addSbstncSpcfctnMoleclrWghtAmntUnt("[");}
		if(substancespecificationmolecularweightamount.hasUnit()) {

			s.addSbstncSpcfctnMoleclrWghtAmntUnt(String.valueOf(substancespecificationmolecularweightamount.getUnit()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtAmntUnt("NULL");
		}

		if(substancespecificationmolecularweighti == substancespecificationmolecularweightlist.size()-1) {s.addSbstncSpcfctnMoleclrWghtAmntUnt("]");}


		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Sys ********************************************************************************/
		if(substancespecificationmolecularweighti == 0) {s.addSbstncSpcfctnMoleclrWghtAmntSys("[");}
		if(substancespecificationmolecularweightamount.hasSystem()) {

			s.addSbstncSpcfctnMoleclrWghtAmntSys(String.valueOf(substancespecificationmolecularweightamount.getSystem()));
		} else {
			s.addSbstncSpcfctnMoleclrWghtAmntSys("NULL");
		}

		if(substancespecificationmolecularweighti == substancespecificationmolecularweightlist.size()-1) {s.addSbstncSpcfctnMoleclrWghtAmntSys("]");}


		 };
		/******************** SbstncSpcfctn_Plymr ********************************************************************************/
		if(substancespecification.hasPolymer()) {

			if(substancespecification.getPolymer().getReference() != null) {
			s.addSbstncSpcfctnPlymr(substancespecification.getPolymer().getReference());
			}
		} else {
			s.addSbstncSpcfctnPlymr("NULL");
		}


		/******************** SbstncSpcfctn_SrcMtrl ********************************************************************************/
		if(substancespecification.hasSourceMaterial()) {

			if(substancespecification.getSourceMaterial().getReference() != null) {
			s.addSbstncSpcfctnSrcMtrl(substancespecification.getSourceMaterial().getReference());
			}
		} else {
			s.addSbstncSpcfctnSrcMtrl("NULL");
		}


		/******************** SbstncSpcfctn_Protein ********************************************************************************/
		if(substancespecification.hasProtein()) {

			if(substancespecification.getProtein().getReference() != null) {
			s.addSbstncSpcfctnProtein(substancespecification.getProtein().getReference());
			}
		} else {
			s.addSbstncSpcfctnProtein("NULL");
		}


		/******************** SbstncSpcfctn_NclicAcid ********************************************************************************/
		if(substancespecification.hasNucleicAcid()) {

			if(substancespecification.getNucleicAcid().getReference() != null) {
			s.addSbstncSpcfctnNclicAcid(substancespecification.getNucleicAcid().getReference());
			}
		} else {
			s.addSbstncSpcfctnNclicAcid("NULL");
		}


		/******************** substancespecificationrelationship ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent> substancespecificationrelationshiplist = substancespecification.getRelationship();
		for(int substancespecificationrelationshipi = 0; substancespecificationrelationshipi<substancespecificationrelationshiplist.size();substancespecificationrelationshipi++ ) {
		org.hl7.fhir.r4.model.SubstanceSpecification.SubstanceSpecificationRelationshipComponent  substancespecificationrelationship = substancespecificationrelationshiplist.get(substancespecificationrelationshipi);

		/******************** SbstncSpcfctn_Rltnship_Src ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipSrc("[");}
		if(substancespecificationrelationship.hasSource()) {

			String  array = "[";
			for(int incr=0; incr<substancespecificationrelationship.getSource().size(); incr++) {
				array = array + substancespecificationrelationship.getSource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncSpcfctnRltnshipSrc(array);

		} else {
			s.addSbstncSpcfctnRltnshipSrc("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipSrc("]");}


		/******************** substancespecificationrelationshipamounttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshipamounttype = substancespecificationrelationship.getAmountType();

		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Txt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntTypTxt("[");}
		if(substancespecificationrelationshipamounttype.hasText()) {

			s.addSbstncSpcfctnRltnshipAmntTypTxt(String.valueOf(substancespecificationrelationshipamounttype.getText()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntTypTxt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntTypTxt("]");}


		/******************** substancespecificationrelationshipamounttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationrelationshipamounttypecodinglist = substancespecificationrelationshipamounttype.getCoding();
		for(int substancespecificationrelationshipamounttypecodingi = 0; substancespecificationrelationshipamounttypecodingi<substancespecificationrelationshipamounttypecodinglist.size();substancespecificationrelationshipamounttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationrelationshipamounttypecoding = substancespecificationrelationshipamounttypecodinglist.get(substancespecificationrelationshipamounttypecodingi);

		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(substancespecificationrelationshipamounttypecodingi == 0) {s.addSbstncSpcfctnRltnshipAmntTypCdgDsply("[[");}
		if(substancespecificationrelationshipamounttypecoding.hasDisplay()) {

			s.addSbstncSpcfctnRltnshipAmntTypCdgDsply(String.valueOf(substancespecificationrelationshipamounttypecoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntTypCdgDsply("NULL");
		}

		if(substancespecificationrelationshipamounttypecodingi == substancespecificationrelationshipamounttypecodinglist.size()-1) {s.addSbstncSpcfctnRltnshipAmntTypCdgDsply("]]");}


		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationrelationshipamounttypecodingi == 0) {s.addSbstncSpcfctnRltnshipAmntTypCdgVrsn("[[");}
		if(substancespecificationrelationshipamounttypecoding.hasVersion()) {

			s.addSbstncSpcfctnRltnshipAmntTypCdgVrsn(String.valueOf(substancespecificationrelationshipamounttypecoding.getVersion()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntTypCdgVrsn("NULL");
		}

		if(substancespecificationrelationshipamounttypecodingi == substancespecificationrelationshipamounttypecodinglist.size()-1) {s.addSbstncSpcfctnRltnshipAmntTypCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Cd ********************************************************************************/
		if(substancespecificationrelationshipamounttypecodingi == 0) {s.addSbstncSpcfctnRltnshipAmntTypCdgCd("[[");}
		if(substancespecificationrelationshipamounttypecoding.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntTypCdgCd(String.valueOf(substancespecificationrelationshipamounttypecoding.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntTypCdgCd("NULL");
		}

		if(substancespecificationrelationshipamounttypecodingi == substancespecificationrelationshipamounttypecodinglist.size()-1) {s.addSbstncSpcfctnRltnshipAmntTypCdgCd("]]");}


		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationrelationshipamounttypecodingi == 0) {s.addSbstncSpcfctnRltnshipAmntTypCdgUsrSltd("[[");}
		if(substancespecificationrelationshipamounttypecoding.hasUserSelected()) {

			s.addSbstncSpcfctnRltnshipAmntTypCdgUsrSltd(String.valueOf(substancespecificationrelationshipamounttypecoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntTypCdgUsrSltd("NULL");
		}

		if(substancespecificationrelationshipamounttypecodingi == substancespecificationrelationshipamounttypecodinglist.size()-1) {s.addSbstncSpcfctnRltnshipAmntTypCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Sys ********************************************************************************/
		if(substancespecificationrelationshipamounttypecodingi == 0) {s.addSbstncSpcfctnRltnshipAmntTypCdgSys("[[");}
		if(substancespecificationrelationshipamounttypecoding.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntTypCdgSys(String.valueOf(substancespecificationrelationshipamounttypecoding.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntTypCdgSys("NULL");
		}

		if(substancespecificationrelationshipamounttypecodingi == substancespecificationrelationshipamounttypecodinglist.size()-1) {s.addSbstncSpcfctnRltnshipAmntTypCdgSys("]]");}


		 };
		/******************** substancespecificationrelationshipamountrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range substancespecificationrelationshipamountrange = substancespecificationrelationship.getAmountRange();

		/******************** substancespecificationrelationshipamountrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrangelow = substancespecificationrelationshipamountrange.getLow();

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Vl ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngLwVl("[");}
		if(substancespecificationrelationshipamountrangelow.hasValue()) {

			s.addSbstncSpcfctnRltnshipAmntRngLwVl(String.valueOf(substancespecificationrelationshipamountrangelow.getValue()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngLwVl("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngLwVl("]");}


		/******************** substancespecificationrelationshipamountrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountrangelowcomparator = substancespecificationrelationshipamountrangelow.getComparator();
		if(substancespecificationrelationshipamountrangelowcomparator!=null) {
		if(substancespecificationrelationshipi == 0) {

		s.addSbstncSpcfctnRltnshipAmntRngLwCmprtr("[");		}
			s.addSbstncSpcfctnRltnshipAmntRngLwCmprtr(substancespecificationrelationshipamountrangelowcomparator.toCode());
		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {

		s.addSbstncSpcfctnRltnshipAmntRngLwCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnRltnshipAmntRngLwCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Cd ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngLwCd("[");}
		if(substancespecificationrelationshipamountrangelow.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntRngLwCd(String.valueOf(substancespecificationrelationshipamountrangelow.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngLwCd("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngLwCd("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Unt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngLwUnt("[");}
		if(substancespecificationrelationshipamountrangelow.hasUnit()) {

			s.addSbstncSpcfctnRltnshipAmntRngLwUnt(String.valueOf(substancespecificationrelationshipamountrangelow.getUnit()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngLwUnt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngLwUnt("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Sys ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngLwSys("[");}
		if(substancespecificationrelationshipamountrangelow.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntRngLwSys(String.valueOf(substancespecificationrelationshipamountrangelow.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngLwSys("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngLwSys("]");}


		/******************** substancespecificationrelationshipamountrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrangehigh = substancespecificationrelationshipamountrange.getHigh();

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Vl ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngHiVl("[");}
		if(substancespecificationrelationshipamountrangehigh.hasValue()) {

			s.addSbstncSpcfctnRltnshipAmntRngHiVl(String.valueOf(substancespecificationrelationshipamountrangehigh.getValue()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngHiVl("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngHiVl("]");}


		/******************** substancespecificationrelationshipamountrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountrangehighcomparator = substancespecificationrelationshipamountrangehigh.getComparator();
		if(substancespecificationrelationshipamountrangehighcomparator!=null) {
		if(substancespecificationrelationshipi == 0) {

		s.addSbstncSpcfctnRltnshipAmntRngHiCmprtr("[");		}
			s.addSbstncSpcfctnRltnshipAmntRngHiCmprtr(substancespecificationrelationshipamountrangehighcomparator.toCode());
		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {

		s.addSbstncSpcfctnRltnshipAmntRngHiCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnRltnshipAmntRngHiCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Cd ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngHiCd("[");}
		if(substancespecificationrelationshipamountrangehigh.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntRngHiCd(String.valueOf(substancespecificationrelationshipamountrangehigh.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngHiCd("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngHiCd("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Unt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngHiUnt("[");}
		if(substancespecificationrelationshipamountrangehigh.hasUnit()) {

			s.addSbstncSpcfctnRltnshipAmntRngHiUnt(String.valueOf(substancespecificationrelationshipamountrangehigh.getUnit()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngHiUnt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngHiUnt("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Sys ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRngHiSys("[");}
		if(substancespecificationrelationshipamountrangehigh.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntRngHiSys(String.valueOf(substancespecificationrelationshipamountrangehigh.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRngHiSys("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRngHiSys("]");}


		/******************** substancespecificationrelationshipamountquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountquantity = substancespecificationrelationship.getAmountQuantity();

		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Vl ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntQntyVl("[");}
		if(substancespecificationrelationshipamountquantity.hasValue()) {

			s.addSbstncSpcfctnRltnshipAmntQntyVl(String.valueOf(substancespecificationrelationshipamountquantity.getValue()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntQntyVl("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntQntyVl("]");}


		/******************** substancespecificationrelationshipamountquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountquantitycomparator = substancespecificationrelationshipamountquantity.getComparator();
		if(substancespecificationrelationshipamountquantitycomparator!=null) {
		if(substancespecificationrelationshipi == 0) {

		s.addSbstncSpcfctnRltnshipAmntQntyCmprtr("[");		}
			s.addSbstncSpcfctnRltnshipAmntQntyCmprtr(substancespecificationrelationshipamountquantitycomparator.toCode());
		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {

		s.addSbstncSpcfctnRltnshipAmntQntyCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnRltnshipAmntQntyCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Cd ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntQntyCd("[");}
		if(substancespecificationrelationshipamountquantity.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntQntyCd(String.valueOf(substancespecificationrelationshipamountquantity.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntQntyCd("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntQntyCd("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Unt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntQntyUnt("[");}
		if(substancespecificationrelationshipamountquantity.hasUnit()) {

			s.addSbstncSpcfctnRltnshipAmntQntyUnt(String.valueOf(substancespecificationrelationshipamountquantity.getUnit()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntQntyUnt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntQntyUnt("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Sys ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntQntySys("[");}
		if(substancespecificationrelationshipamountquantity.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntQntySys(String.valueOf(substancespecificationrelationshipamountquantity.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntQntySys("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntQntySys("]");}


		/******************** substancespecificationrelationshiprelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshiprelationship = substancespecificationrelationship.getRelationship();

		/******************** SbstncSpcfctn_Rltnship_Rltnship_Txt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipRltnshipTxt("[");}
		if(substancespecificationrelationshiprelationship.hasText()) {

			s.addSbstncSpcfctnRltnshipRltnshipTxt(String.valueOf(substancespecificationrelationshiprelationship.getText()));
		} else {
			s.addSbstncSpcfctnRltnshipRltnshipTxt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipRltnshipTxt("]");}


		/******************** substancespecificationrelationshiprelationshipcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationrelationshiprelationshipcodinglist = substancespecificationrelationshiprelationship.getCoding();
		for(int substancespecificationrelationshiprelationshipcodingi = 0; substancespecificationrelationshiprelationshipcodingi<substancespecificationrelationshiprelationshipcodinglist.size();substancespecificationrelationshiprelationshipcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationrelationshiprelationshipcoding = substancespecificationrelationshiprelationshipcodinglist.get(substancespecificationrelationshiprelationshipcodingi);

		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Dsply ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcodingi == 0) {s.addSbstncSpcfctnRltnshipRltnshipCdgDsply("[[");}
		if(substancespecificationrelationshiprelationshipcoding.hasDisplay()) {

			s.addSbstncSpcfctnRltnshipRltnshipCdgDsply(String.valueOf(substancespecificationrelationshiprelationshipcoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnRltnshipRltnshipCdgDsply("NULL");
		}

		if(substancespecificationrelationshiprelationshipcodingi == substancespecificationrelationshiprelationshipcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipRltnshipCdgDsply("]]");}


		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcodingi == 0) {s.addSbstncSpcfctnRltnshipRltnshipCdgVrsn("[[");}
		if(substancespecificationrelationshiprelationshipcoding.hasVersion()) {

			s.addSbstncSpcfctnRltnshipRltnshipCdgVrsn(String.valueOf(substancespecificationrelationshiprelationshipcoding.getVersion()));
		} else {
			s.addSbstncSpcfctnRltnshipRltnshipCdgVrsn("NULL");
		}

		if(substancespecificationrelationshiprelationshipcodingi == substancespecificationrelationshiprelationshipcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipRltnshipCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Cd ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcodingi == 0) {s.addSbstncSpcfctnRltnshipRltnshipCdgCd("[[");}
		if(substancespecificationrelationshiprelationshipcoding.hasCode()) {

			s.addSbstncSpcfctnRltnshipRltnshipCdgCd(String.valueOf(substancespecificationrelationshiprelationshipcoding.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipRltnshipCdgCd("NULL");
		}

		if(substancespecificationrelationshiprelationshipcodingi == substancespecificationrelationshiprelationshipcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipRltnshipCdgCd("]]");}


		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcodingi == 0) {s.addSbstncSpcfctnRltnshipRltnshipCdgUsrSltd("[[");}
		if(substancespecificationrelationshiprelationshipcoding.hasUserSelected()) {

			s.addSbstncSpcfctnRltnshipRltnshipCdgUsrSltd(String.valueOf(substancespecificationrelationshiprelationshipcoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnRltnshipRltnshipCdgUsrSltd("NULL");
		}

		if(substancespecificationrelationshiprelationshipcodingi == substancespecificationrelationshiprelationshipcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipRltnshipCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Sys ********************************************************************************/
		if(substancespecificationrelationshiprelationshipcodingi == 0) {s.addSbstncSpcfctnRltnshipRltnshipCdgSys("[[");}
		if(substancespecificationrelationshiprelationshipcoding.hasSystem()) {

			s.addSbstncSpcfctnRltnshipRltnshipCdgSys(String.valueOf(substancespecificationrelationshiprelationshipcoding.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipRltnshipCdgSys("NULL");
		}

		if(substancespecificationrelationshiprelationshipcodingi == substancespecificationrelationshiprelationshipcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipRltnshipCdgSys("]]");}


		 };
		/******************** SbstncSpcfctn_Rltnship_AmntStrgTyp ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntStrgTyp("[");}
		if(substancespecificationrelationship.hasAmountStringType()) {

			s.addSbstncSpcfctnRltnshipAmntStrgTyp("\""+substancespecificationrelationship.getAmountStringType().getValueAsString()+"\"");
		} else {
			s.addSbstncSpcfctnRltnshipAmntStrgTyp("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntStrgTyp("]");}


		/******************** substancespecificationrelationshipamountratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substancespecificationrelationshipamountratio = substancespecificationrelationship.getAmountRatio();

		/******************** substancespecificationrelationshipamountrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountrationumerator = substancespecificationrelationshipamountratio.getNumerator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Vl ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrVl("[");}
		if(substancespecificationrelationshipamountrationumerator.hasValue()) {

			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrVl(String.valueOf(substancespecificationrelationshipamountrationumerator.getValue()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrVl("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrVl("]");}


		/******************** substancespecificationrelationshipamountrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountrationumeratorcomparator = substancespecificationrelationshipamountrationumerator.getComparator();
		if(substancespecificationrelationshipamountrationumeratorcomparator!=null) {
		if(substancespecificationrelationshipi == 0) {

		s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr("[");		}
			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr(substancespecificationrelationshipamountrationumeratorcomparator.toCode());
		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {

		s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Cd ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCd("[");}
		if(substancespecificationrelationshipamountrationumerator.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCd(String.valueOf(substancespecificationrelationshipamountrationumerator.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCd("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrCd("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Unt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrUnt("[");}
		if(substancespecificationrelationshipamountrationumerator.hasUnit()) {

			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrUnt(String.valueOf(substancespecificationrelationshipamountrationumerator.getUnit()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrUnt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrUnt("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Sys ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrSys("[");}
		if(substancespecificationrelationshipamountrationumerator.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrSys(String.valueOf(substancespecificationrelationshipamountrationumerator.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioNmrtrSys("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioNmrtrSys("]");}


		/******************** substancespecificationrelationshipamountratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiodenominator = substancespecificationrelationshipamountratio.getDenominator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Vl ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrVl("[");}
		if(substancespecificationrelationshipamountratiodenominator.hasValue()) {

			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrVl(String.valueOf(substancespecificationrelationshipamountratiodenominator.getValue()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrVl("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrVl("]");}


		/******************** substancespecificationrelationshipamountratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountratiodenominatorcomparator = substancespecificationrelationshipamountratiodenominator.getComparator();
		if(substancespecificationrelationshipamountratiodenominatorcomparator!=null) {
		if(substancespecificationrelationshipi == 0) {

		s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr("[");		}
			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr(substancespecificationrelationshipamountratiodenominatorcomparator.toCode());
		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {

		s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Cd ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCd("[");}
		if(substancespecificationrelationshipamountratiodenominator.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCd(String.valueOf(substancespecificationrelationshipamountratiodenominator.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCd("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrCd("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Unt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrUnt("[");}
		if(substancespecificationrelationshipamountratiodenominator.hasUnit()) {

			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrUnt(String.valueOf(substancespecificationrelationshipamountratiodenominator.getUnit()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrUnt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrUnt("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Sys ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrSys("[");}
		if(substancespecificationrelationshipamountratiodenominator.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrSys(String.valueOf(substancespecificationrelationshipamountratiodenominator.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioDnmntrSys("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioDnmntrSys("]");}


		/******************** SbstncSpcfctn_Rltnship_IsDefining ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipIsDefining("[");}
		if(substancespecificationrelationship.hasIsDefining()) {

			s.addSbstncSpcfctnRltnshipIsDefining(String.valueOf(substancespecificationrelationship.getIsDefining()));
		} else {
			s.addSbstncSpcfctnRltnshipIsDefining("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipIsDefining("]");}


		/******************** substancespecificationrelationshipsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancespecificationrelationshipsubstancecodeableconcept = substancespecificationrelationship.getSubstanceCodeableConcept();

		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Txt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptTxt("[");}
		if(substancespecificationrelationshipsubstancecodeableconcept.hasText()) {

			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptTxt(String.valueOf(substancespecificationrelationshipsubstancecodeableconcept.getText()));
		} else {
			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptTxt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptTxt("]");}


		/******************** substancespecificationrelationshipsubstancecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substancespecificationrelationshipsubstancecodeableconceptcodinglist = substancespecificationrelationshipsubstancecodeableconcept.getCoding();
		for(int substancespecificationrelationshipsubstancecodeableconceptcodingi = 0; substancespecificationrelationshipsubstancecodeableconceptcodingi<substancespecificationrelationshipsubstancecodeableconceptcodinglist.size();substancespecificationrelationshipsubstancecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substancespecificationrelationshipsubstancecodeableconceptcoding = substancespecificationrelationshipsubstancecodeableconceptcodinglist.get(substancespecificationrelationshipsubstancecodeableconceptcodingi);

		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply("[[");}
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasDisplay()) {

			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getDisplay()));
		} else {
			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply("NULL");
		}

		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == substancespecificationrelationshipsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply("]]");}


		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn("[[");}
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasVersion()) {

			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getVersion()));
		} else {
			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn("NULL");
		}

		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == substancespecificationrelationshipsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn("]]");}


		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd("[[");}
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasCode()) {

			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd("NULL");
		}

		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == substancespecificationrelationshipsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd("]]");}


		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd("[[");}
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasUserSelected()) {

			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getUserSelected()));
		} else {
			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd("NULL");
		}

		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == substancespecificationrelationshipsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd("]]");}


		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == 0) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys("[[");}
		if(substancespecificationrelationshipsubstancecodeableconceptcoding.hasSystem()) {

			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys(String.valueOf(substancespecificationrelationshipsubstancecodeableconceptcoding.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys("NULL");
		}

		if(substancespecificationrelationshipsubstancecodeableconceptcodingi == substancespecificationrelationshipsubstancecodeableconceptcodinglist.size()-1) {s.addSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys("]]");}


		 };
		/******************** SbstncSpcfctn_Rltnship_SbstncRfrnc ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipSbstncRfrnc("[");}
		if(substancespecificationrelationship.hasSubstanceReference()) {

			if(substancespecificationrelationship.getSubstanceReference().getReference() != null) {
			s.addSbstncSpcfctnRltnshipSbstncRfrnc(substancespecificationrelationship.getSubstanceReference().getReference());
			}
		} else {
			s.addSbstncSpcfctnRltnshipSbstncRfrnc("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipSbstncRfrnc("]");}


		/******************** substancespecificationrelationshipamountratiolowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substancespecificationrelationshipamountratiolowlimit = substancespecificationrelationship.getAmountRatioLowLimit();

		/******************** substancespecificationrelationshipamountratiolowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiolowlimitnumerator = substancespecificationrelationshipamountratiolowlimit.getNumerator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Vl ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl("[");}
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasValue()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getValue()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl("]");}


		/******************** substancespecificationrelationshipamountratiolowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountratiolowlimitnumeratorcomparator = substancespecificationrelationshipamountratiolowlimitnumerator.getComparator();
		if(substancespecificationrelationshipamountratiolowlimitnumeratorcomparator!=null) {
		if(substancespecificationrelationshipi == 0) {

		s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr("[");		}
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr(substancespecificationrelationshipamountratiolowlimitnumeratorcomparator.toCode());
		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {

		s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Cd ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd("[");}
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Unt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt("[");}
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasUnit()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getUnit()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Sys ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys("[");}
		if(substancespecificationrelationshipamountratiolowlimitnumerator.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys(String.valueOf(substancespecificationrelationshipamountratiolowlimitnumerator.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys("]");}


		/******************** substancespecificationrelationshipamountratiolowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substancespecificationrelationshipamountratiolowlimitdenominator = substancespecificationrelationshipamountratiolowlimit.getDenominator();

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Vl ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl("[");}
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasValue()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getValue()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl("]");}


		/******************** substancespecificationrelationshipamountratiolowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substancespecificationrelationshipamountratiolowlimitdenominatorcomparator = substancespecificationrelationshipamountratiolowlimitdenominator.getComparator();
		if(substancespecificationrelationshipamountratiolowlimitdenominatorcomparator!=null) {
		if(substancespecificationrelationshipi == 0) {

		s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr("[");		}
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr(substancespecificationrelationshipamountratiolowlimitdenominatorcomparator.toCode());
		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {

		s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr("]");		}

		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr("NULL");
		}

		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Cd ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd("[");}
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasCode()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getCode()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Unt ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt("[");}
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasUnit()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getUnit()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt("]");}


		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Sys ********************************************************************************/
		if(substancespecificationrelationshipi == 0) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys("[");}
		if(substancespecificationrelationshipamountratiolowlimitdenominator.hasSystem()) {

			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys(String.valueOf(substancespecificationrelationshipamountratiolowlimitdenominator.getSystem()));
		} else {
			s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys("NULL");
		}

		if(substancespecificationrelationshipi == substancespecificationrelationshiplist.size()-1) {s.addSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys("]");}


		 };
		return s;
	}
}
