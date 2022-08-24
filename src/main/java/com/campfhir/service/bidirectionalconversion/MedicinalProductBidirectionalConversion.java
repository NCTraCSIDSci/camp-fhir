package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProduct;
public class MedicinalProductBidirectionalConversion 
{
	public MedicinalProduct MedicinalProducts(org.hl7.fhir.r4.model.MedicinalProduct medicinalproduct) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProduct m = new  main.java.com.campfhir.model.MedicinalProduct();

		/******************** id ********************************************************************************/
		m.setId(medicinalproduct.getIdElement().getIdPart());

		/******************** medicinalproductname ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent> medicinalproductnamelist = medicinalproduct.getName();
		for(int medicinalproductnamei = 0; medicinalproductnamei<medicinalproductnamelist.size();medicinalproductnamei++ ) {
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent  medicinalproductname = medicinalproductnamelist.get(medicinalproductnamei);

		/******************** medicinalproductnamenamepart ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent> medicinalproductnamenamepartlist = medicinalproductname.getNamePart();
		for(int medicinalproductnamenameparti = 0; medicinalproductnamenameparti<medicinalproductnamenamepartlist.size();medicinalproductnamenameparti++ ) {
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent  medicinalproductnamenamepart = medicinalproductnamenamepartlist.get(medicinalproductnamenameparti);

		/******************** medicinalproductnamenameparttype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamenameparttype = medicinalproductnamenamepart.getType();

		/******************** MdcnlPrdct_Nm_NmPart_Typ_Dsply ********************************************************************************/
		if(medicinalproductnamenameparti == 0) {m.addMdcnlPrdctNmNmPartTypDsply("[[");}
		if(medicinalproductnamenameparttype.hasDisplay()) {

			m.addMdcnlPrdctNmNmPartTypDsply(String.valueOf(medicinalproductnamenameparttype.getDisplay()));
		} else {
			m.addMdcnlPrdctNmNmPartTypDsply("NULL");
		}

		if(medicinalproductnamenameparti == medicinalproductnamenamepartlist.size()-1) {m.addMdcnlPrdctNmNmPartTypDsply("]]");}


		/******************** MdcnlPrdct_Nm_NmPart_Typ_Vrsn ********************************************************************************/
		if(medicinalproductnamenameparti == 0) {m.addMdcnlPrdctNmNmPartTypVrsn("[[");}
		if(medicinalproductnamenameparttype.hasVersion()) {

			m.addMdcnlPrdctNmNmPartTypVrsn(String.valueOf(medicinalproductnamenameparttype.getVersion()));
		} else {
			m.addMdcnlPrdctNmNmPartTypVrsn("NULL");
		}

		if(medicinalproductnamenameparti == medicinalproductnamenamepartlist.size()-1) {m.addMdcnlPrdctNmNmPartTypVrsn("]]");}


		/******************** MdcnlPrdct_Nm_NmPart_Typ_Cd ********************************************************************************/
		if(medicinalproductnamenameparti == 0) {m.addMdcnlPrdctNmNmPartTypCd("[[");}
		if(medicinalproductnamenameparttype.hasCode()) {

			m.addMdcnlPrdctNmNmPartTypCd(String.valueOf(medicinalproductnamenameparttype.getCode()));
		} else {
			m.addMdcnlPrdctNmNmPartTypCd("NULL");
		}

		if(medicinalproductnamenameparti == medicinalproductnamenamepartlist.size()-1) {m.addMdcnlPrdctNmNmPartTypCd("]]");}


		/******************** MdcnlPrdct_Nm_NmPart_Typ_UsrSltd ********************************************************************************/
		if(medicinalproductnamenameparti == 0) {m.addMdcnlPrdctNmNmPartTypUsrSltd("[[");}
		if(medicinalproductnamenameparttype.hasUserSelected()) {

			m.addMdcnlPrdctNmNmPartTypUsrSltd(String.valueOf(medicinalproductnamenameparttype.getUserSelected()));
		} else {
			m.addMdcnlPrdctNmNmPartTypUsrSltd("NULL");
		}

		if(medicinalproductnamenameparti == medicinalproductnamenamepartlist.size()-1) {m.addMdcnlPrdctNmNmPartTypUsrSltd("]]");}


		/******************** MdcnlPrdct_Nm_NmPart_Typ_Sys ********************************************************************************/
		if(medicinalproductnamenameparti == 0) {m.addMdcnlPrdctNmNmPartTypSys("[[");}
		if(medicinalproductnamenameparttype.hasSystem()) {

			m.addMdcnlPrdctNmNmPartTypSys(String.valueOf(medicinalproductnamenameparttype.getSystem()));
		} else {
			m.addMdcnlPrdctNmNmPartTypSys("NULL");
		}

		if(medicinalproductnamenameparti == medicinalproductnamenamepartlist.size()-1) {m.addMdcnlPrdctNmNmPartTypSys("]]");}


		/******************** MdcnlPrdct_Nm_NmPart_Part ********************************************************************************/
		if(medicinalproductnamenameparti == 0) {m.addMdcnlPrdctNmNmPartPart("[[");}
		if(medicinalproductnamenamepart.hasPart()) {

			m.addMdcnlPrdctNmNmPartPart(String.valueOf(medicinalproductnamenamepart.getPart()));
		} else {
			m.addMdcnlPrdctNmNmPartPart("NULL");
		}

		if(medicinalproductnamenameparti == medicinalproductnamenamepartlist.size()-1) {m.addMdcnlPrdctNmNmPartPart("]]");}


		 };
		/******************** medicinalproductnamecountrylanguage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent> medicinalproductnamecountrylanguagelist = medicinalproductname.getCountryLanguage();
		for(int medicinalproductnamecountrylanguagei = 0; medicinalproductnamecountrylanguagei<medicinalproductnamecountrylanguagelist.size();medicinalproductnamecountrylanguagei++ ) {
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent  medicinalproductnamecountrylanguage = medicinalproductnamecountrylanguagelist.get(medicinalproductnamecountrylanguagei);

		/******************** medicinalproductnamecountrylanguagelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagelanguage = medicinalproductnamecountrylanguage.getLanguage();

		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Txt ********************************************************************************/
		if(medicinalproductnamecountrylanguagei == 0) {m.addMdcnlPrdctNmCntryLnguageLnguageTxt("[[");}
		if(medicinalproductnamecountrylanguagelanguage.hasText()) {

			m.addMdcnlPrdctNmCntryLnguageLnguageTxt(String.valueOf(medicinalproductnamecountrylanguagelanguage.getText()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageLnguageTxt("NULL");
		}

		if(medicinalproductnamecountrylanguagei == medicinalproductnamecountrylanguagelist.size()-1) {m.addMdcnlPrdctNmCntryLnguageLnguageTxt("]]");}


		/******************** medicinalproductnamecountrylanguagelanguagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductnamecountrylanguagelanguagecodinglist = medicinalproductnamecountrylanguagelanguage.getCoding();
		for(int medicinalproductnamecountrylanguagelanguagecodingi = 0; medicinalproductnamecountrylanguagelanguagecodingi<medicinalproductnamecountrylanguagelanguagecodinglist.size();medicinalproductnamecountrylanguagelanguagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductnamecountrylanguagelanguagecoding = medicinalproductnamecountrylanguagelanguagecodinglist.get(medicinalproductnamecountrylanguagelanguagecodingi);

		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Dsply ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecodingi == 0) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgDsply("[[[");}
		if(medicinalproductnamecountrylanguagelanguagecoding.hasDisplay()) {

			m.addMdcnlPrdctNmCntryLnguageLnguageCdgDsply(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageLnguageCdgDsply("NULL");
		}

		if(medicinalproductnamecountrylanguagelanguagecodingi == medicinalproductnamecountrylanguagelanguagecodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgDsply("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecodingi == 0) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgVrsn("[[[");}
		if(medicinalproductnamecountrylanguagelanguagecoding.hasVersion()) {

			m.addMdcnlPrdctNmCntryLnguageLnguageCdgVrsn(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getVersion()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageLnguageCdgVrsn("NULL");
		}

		if(medicinalproductnamecountrylanguagelanguagecodingi == medicinalproductnamecountrylanguagelanguagecodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgVrsn("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Cd ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecodingi == 0) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgCd("[[[");}
		if(medicinalproductnamecountrylanguagelanguagecoding.hasCode()) {

			m.addMdcnlPrdctNmCntryLnguageLnguageCdgCd(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getCode()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageLnguageCdgCd("NULL");
		}

		if(medicinalproductnamecountrylanguagelanguagecodingi == medicinalproductnamecountrylanguagelanguagecodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgCd("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecodingi == 0) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd("[[[");}
		if(medicinalproductnamecountrylanguagelanguagecoding.hasUserSelected()) {

			m.addMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd("NULL");
		}

		if(medicinalproductnamecountrylanguagelanguagecodingi == medicinalproductnamecountrylanguagelanguagecodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Sys ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecodingi == 0) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgSys("[[[");}
		if(medicinalproductnamecountrylanguagelanguagecoding.hasSystem()) {

			m.addMdcnlPrdctNmCntryLnguageLnguageCdgSys(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getSystem()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageLnguageCdgSys("NULL");
		}

		if(medicinalproductnamecountrylanguagelanguagecodingi == medicinalproductnamecountrylanguagelanguagecodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageLnguageCdgSys("]]]");}


		 };
		/******************** medicinalproductnamecountrylanguagecountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagecountry = medicinalproductnamecountrylanguage.getCountry();

		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Txt ********************************************************************************/
		if(medicinalproductnamecountrylanguagei == 0) {m.addMdcnlPrdctNmCntryLnguageCntryTxt("[[");}
		if(medicinalproductnamecountrylanguagecountry.hasText()) {

			m.addMdcnlPrdctNmCntryLnguageCntryTxt(String.valueOf(medicinalproductnamecountrylanguagecountry.getText()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageCntryTxt("NULL");
		}

		if(medicinalproductnamecountrylanguagei == medicinalproductnamecountrylanguagelist.size()-1) {m.addMdcnlPrdctNmCntryLnguageCntryTxt("]]");}


		/******************** medicinalproductnamecountrylanguagecountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductnamecountrylanguagecountrycodinglist = medicinalproductnamecountrylanguagecountry.getCoding();
		for(int medicinalproductnamecountrylanguagecountrycodingi = 0; medicinalproductnamecountrylanguagecountrycodingi<medicinalproductnamecountrylanguagecountrycodinglist.size();medicinalproductnamecountrylanguagecountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductnamecountrylanguagecountrycoding = medicinalproductnamecountrylanguagecountrycodinglist.get(medicinalproductnamecountrylanguagecountrycodingi);

		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycodingi == 0) {m.addMdcnlPrdctNmCntryLnguageCntryCdgDsply("[[[");}
		if(medicinalproductnamecountrylanguagecountrycoding.hasDisplay()) {

			m.addMdcnlPrdctNmCntryLnguageCntryCdgDsply(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageCntryCdgDsply("NULL");
		}

		if(medicinalproductnamecountrylanguagecountrycodingi == medicinalproductnamecountrylanguagecountrycodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageCntryCdgDsply("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycodingi == 0) {m.addMdcnlPrdctNmCntryLnguageCntryCdgVrsn("[[[");}
		if(medicinalproductnamecountrylanguagecountrycoding.hasVersion()) {

			m.addMdcnlPrdctNmCntryLnguageCntryCdgVrsn(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageCntryCdgVrsn("NULL");
		}

		if(medicinalproductnamecountrylanguagecountrycodingi == medicinalproductnamecountrylanguagecountrycodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageCntryCdgVrsn("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycodingi == 0) {m.addMdcnlPrdctNmCntryLnguageCntryCdgCd("[[[");}
		if(medicinalproductnamecountrylanguagecountrycoding.hasCode()) {

			m.addMdcnlPrdctNmCntryLnguageCntryCdgCd(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageCntryCdgCd("NULL");
		}

		if(medicinalproductnamecountrylanguagecountrycodingi == medicinalproductnamecountrylanguagecountrycodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageCntryCdgCd("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycodingi == 0) {m.addMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd("[[[");}
		if(medicinalproductnamecountrylanguagecountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductnamecountrylanguagecountrycodingi == medicinalproductnamecountrylanguagecountrycodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycodingi == 0) {m.addMdcnlPrdctNmCntryLnguageCntryCdgSys("[[[");}
		if(medicinalproductnamecountrylanguagecountrycoding.hasSystem()) {

			m.addMdcnlPrdctNmCntryLnguageCntryCdgSys(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageCntryCdgSys("NULL");
		}

		if(medicinalproductnamecountrylanguagecountrycodingi == medicinalproductnamecountrylanguagecountrycodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageCntryCdgSys("]]]");}


		 };
		/******************** medicinalproductnamecountrylanguagejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagejurisdiction = medicinalproductnamecountrylanguage.getJurisdiction();

		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductnamecountrylanguagei == 0) {m.addMdcnlPrdctNmCntryLnguageJrsdctnTxt("[[");}
		if(medicinalproductnamecountrylanguagejurisdiction.hasText()) {

			m.addMdcnlPrdctNmCntryLnguageJrsdctnTxt(String.valueOf(medicinalproductnamecountrylanguagejurisdiction.getText()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageJrsdctnTxt("NULL");
		}

		if(medicinalproductnamecountrylanguagei == medicinalproductnamecountrylanguagelist.size()-1) {m.addMdcnlPrdctNmCntryLnguageJrsdctnTxt("]]");}


		/******************** medicinalproductnamecountrylanguagejurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductnamecountrylanguagejurisdictioncodinglist = medicinalproductnamecountrylanguagejurisdiction.getCoding();
		for(int medicinalproductnamecountrylanguagejurisdictioncodingi = 0; medicinalproductnamecountrylanguagejurisdictioncodingi<medicinalproductnamecountrylanguagejurisdictioncodinglist.size();medicinalproductnamecountrylanguagejurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductnamecountrylanguagejurisdictioncoding = medicinalproductnamecountrylanguagejurisdictioncodinglist.get(medicinalproductnamecountrylanguagejurisdictioncodingi);

		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncodingi == 0) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply("[[[");}
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasDisplay()) {

			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply("NULL");
		}

		if(medicinalproductnamecountrylanguagejurisdictioncodingi == medicinalproductnamecountrylanguagejurisdictioncodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncodingi == 0) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn("[[[");}
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasVersion()) {

			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn("NULL");
		}

		if(medicinalproductnamecountrylanguagejurisdictioncodingi == medicinalproductnamecountrylanguagejurisdictioncodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncodingi == 0) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgCd("[[[");}
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasCode()) {

			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgCd(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getCode()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgCd("NULL");
		}

		if(medicinalproductnamecountrylanguagejurisdictioncodingi == medicinalproductnamecountrylanguagejurisdictioncodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgCd("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncodingi == 0) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd("[[[");}
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasUserSelected()) {

			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd("NULL");
		}

		if(medicinalproductnamecountrylanguagejurisdictioncodingi == medicinalproductnamecountrylanguagejurisdictioncodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd("]]]");}


		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncodingi == 0) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgSys("[[[");}
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasSystem()) {

			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgSys(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgSys("NULL");
		}

		if(medicinalproductnamecountrylanguagejurisdictioncodingi == medicinalproductnamecountrylanguagejurisdictioncodinglist.size()-1) {m.addMdcnlPrdctNmCntryLnguageJrsdctnCdgSys("]]]");}


		 };
		 };
		/******************** MdcnlPrdct_Nm_PrdctNm ********************************************************************************/
		if(medicinalproductname.hasProductName()) {

			m.addMdcnlPrdctNmPrdctNm(String.valueOf(medicinalproductname.getProductName()));
		} else {
			m.addMdcnlPrdctNmPrdctNm("NULL");
		}


		 };
		/******************** medicinalproducttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproducttype = medicinalproduct.getType();

		/******************** MdcnlPrdct_Typ_Txt ********************************************************************************/
		if(medicinalproducttype.hasText()) {

			m.addMdcnlPrdctTypTxt(String.valueOf(medicinalproducttype.getText()));
		} else {
			m.addMdcnlPrdctTypTxt("NULL");
		}


		/******************** medicinalproducttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproducttypecodinglist = medicinalproducttype.getCoding();
		for(int medicinalproducttypecodingi = 0; medicinalproducttypecodingi<medicinalproducttypecodinglist.size();medicinalproducttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproducttypecoding = medicinalproducttypecodinglist.get(medicinalproducttypecodingi);

		/******************** MdcnlPrdct_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproducttypecodingi == 0) {m.addMdcnlPrdctTypCdgDsply("[");}
		if(medicinalproducttypecoding.hasDisplay()) {

			m.addMdcnlPrdctTypCdgDsply(String.valueOf(medicinalproducttypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctTypCdgDsply("NULL");
		}

		if(medicinalproducttypecodingi == medicinalproducttypecodinglist.size()-1) {m.addMdcnlPrdctTypCdgDsply("]");}


		/******************** MdcnlPrdct_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproducttypecodingi == 0) {m.addMdcnlPrdctTypCdgVrsn("[");}
		if(medicinalproducttypecoding.hasVersion()) {

			m.addMdcnlPrdctTypCdgVrsn(String.valueOf(medicinalproducttypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctTypCdgVrsn("NULL");
		}

		if(medicinalproducttypecodingi == medicinalproducttypecodinglist.size()-1) {m.addMdcnlPrdctTypCdgVrsn("]");}


		/******************** MdcnlPrdct_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproducttypecodingi == 0) {m.addMdcnlPrdctTypCdgCd("[");}
		if(medicinalproducttypecoding.hasCode()) {

			m.addMdcnlPrdctTypCdgCd(String.valueOf(medicinalproducttypecoding.getCode()));
		} else {
			m.addMdcnlPrdctTypCdgCd("NULL");
		}

		if(medicinalproducttypecodingi == medicinalproducttypecodinglist.size()-1) {m.addMdcnlPrdctTypCdgCd("]");}


		/******************** MdcnlPrdct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproducttypecodingi == 0) {m.addMdcnlPrdctTypCdgUsrSltd("[");}
		if(medicinalproducttypecoding.hasUserSelected()) {

			m.addMdcnlPrdctTypCdgUsrSltd(String.valueOf(medicinalproducttypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctTypCdgUsrSltd("NULL");
		}

		if(medicinalproducttypecodingi == medicinalproducttypecodinglist.size()-1) {m.addMdcnlPrdctTypCdgUsrSltd("]");}


		/******************** MdcnlPrdct_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproducttypecodingi == 0) {m.addMdcnlPrdctTypCdgSys("[");}
		if(medicinalproducttypecoding.hasSystem()) {

			m.addMdcnlPrdctTypCdgSys(String.valueOf(medicinalproducttypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctTypCdgSys("NULL");
		}

		if(medicinalproducttypecodingi == medicinalproducttypecodinglist.size()-1) {m.addMdcnlPrdctTypCdgSys("]");}


		 };
		/******************** medicinalproductidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductidentifierlist = medicinalproduct.getIdentifier();
		for(int medicinalproductidentifieri = 0; medicinalproductidentifieri<medicinalproductidentifierlist.size();medicinalproductidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductidentifier = medicinalproductidentifierlist.get(medicinalproductidentifieri);

		/******************** MdcnlPrdct_Id_Vl ********************************************************************************/
		if(medicinalproductidentifieri == 0) {m.addMdcnlPrdctIdVl("[");}
		if(medicinalproductidentifier.hasValue()) {

			m.addMdcnlPrdctIdVl(String.valueOf(medicinalproductidentifier.getValue()));
		} else {
			m.addMdcnlPrdctIdVl("NULL");
		}

		if(medicinalproductidentifieri == medicinalproductidentifierlist.size()-1) {m.addMdcnlPrdctIdVl("]");}


		/******************** medicinalproductidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductidentifiertype = medicinalproductidentifier.getType();

		/******************** MdcnlPrdct_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductidentifieri == 0) {m.addMdcnlPrdctIdTypTxt("[");}
		if(medicinalproductidentifiertype.hasText()) {

			m.addMdcnlPrdctIdTypTxt(String.valueOf(medicinalproductidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctIdTypTxt("NULL");
		}

		if(medicinalproductidentifieri == medicinalproductidentifierlist.size()-1) {m.addMdcnlPrdctIdTypTxt("]");}


		/******************** medicinalproductidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductidentifiertypecodinglist = medicinalproductidentifiertype.getCoding();
		for(int medicinalproductidentifiertypecodingi = 0; medicinalproductidentifiertypecodingi<medicinalproductidentifiertypecodinglist.size();medicinalproductidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductidentifiertypecoding = medicinalproductidentifiertypecodinglist.get(medicinalproductidentifiertypecodingi);

		/******************** MdcnlPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductidentifiertypecodingi == 0) {m.addMdcnlPrdctIdTypCdgDsply("[[");}
		if(medicinalproductidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctIdTypCdgDsply(String.valueOf(medicinalproductidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIdTypCdgDsply("NULL");
		}

		if(medicinalproductidentifiertypecodingi == medicinalproductidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIdTypCdgDsply("]]");}


		/******************** MdcnlPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductidentifiertypecodingi == 0) {m.addMdcnlPrdctIdTypCdgVrsn("[[");}
		if(medicinalproductidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctIdTypCdgVrsn(String.valueOf(medicinalproductidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIdTypCdgVrsn("NULL");
		}

		if(medicinalproductidentifiertypecodingi == medicinalproductidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIdTypCdgVrsn("]]");}


		/******************** MdcnlPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductidentifiertypecodingi == 0) {m.addMdcnlPrdctIdTypCdgCd("[[");}
		if(medicinalproductidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctIdTypCdgCd(String.valueOf(medicinalproductidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctIdTypCdgCd("NULL");
		}

		if(medicinalproductidentifiertypecodingi == medicinalproductidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIdTypCdgCd("]]");}


		/******************** MdcnlPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductidentifiertypecodingi == 0) {m.addMdcnlPrdctIdTypCdgUsrSltd("[[");}
		if(medicinalproductidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctIdTypCdgUsrSltd(String.valueOf(medicinalproductidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductidentifiertypecodingi == medicinalproductidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIdTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductidentifiertypecodingi == 0) {m.addMdcnlPrdctIdTypCdgSys("[[");}
		if(medicinalproductidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctIdTypCdgSys(String.valueOf(medicinalproductidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIdTypCdgSys("NULL");
		}

		if(medicinalproductidentifiertypecodingi == medicinalproductidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIdTypCdgSys("]]");}


		 };
		/******************** medicinalproductidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductidentifierperiod = medicinalproductidentifier.getPeriod();

		/******************** MdcnlPrdct_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductidentifieri == 0) {m.addMdcnlPrdctIdPrdStrt("[");}
		if(medicinalproductidentifierperiod.hasStart()) {

			m.addMdcnlPrdctIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctIdPrdStrt("NULL");
		}

		if(medicinalproductidentifieri == medicinalproductidentifierlist.size()-1) {m.addMdcnlPrdctIdPrdStrt("]");}


		/******************** MdcnlPrdct_Id_Prd_End ********************************************************************************/
		if(medicinalproductidentifieri == 0) {m.addMdcnlPrdctIdPrdEnd("[");}
		if(medicinalproductidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctIdPrdEnd("NULL");
		}

		if(medicinalproductidentifieri == medicinalproductidentifierlist.size()-1) {m.addMdcnlPrdctIdPrdEnd("]");}


		/******************** medicinalproductidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductidentifieruse = medicinalproductidentifier.getUse();
		if(medicinalproductidentifieruse!=null) {
		if(medicinalproductidentifieri == 0) {

		m.addMdcnlPrdctIdUse("[");		}
			m.addMdcnlPrdctIdUse(medicinalproductidentifieruse.toCode());
		if(medicinalproductidentifieri == medicinalproductidentifierlist.size()-1) {

		m.addMdcnlPrdctIdUse("]");		}

		} else {
			m.addMdcnlPrdctIdUse("NULL");
		}

		/******************** MdcnlPrdct_Id_Assigner ********************************************************************************/
		if(medicinalproductidentifieri == 0) {m.addMdcnlPrdctIdAssigner("[");}
		if(medicinalproductidentifier.hasAssigner()) {

			if(medicinalproductidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctIdAssigner(medicinalproductidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctIdAssigner("NULL");
		}

		if(medicinalproductidentifieri == medicinalproductidentifierlist.size()-1) {m.addMdcnlPrdctIdAssigner("]");}


		/******************** MdcnlPrdct_Id_Sys ********************************************************************************/
		if(medicinalproductidentifieri == 0) {m.addMdcnlPrdctIdSys("[");}
		if(medicinalproductidentifier.hasSystem()) {

			m.addMdcnlPrdctIdSys(String.valueOf(medicinalproductidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctIdSys("NULL");
		}

		if(medicinalproductidentifieri == medicinalproductidentifierlist.size()-1) {m.addMdcnlPrdctIdSys("]");}


		 };
		/******************** MdcnlPrdct_Cntct ********************************************************************************/
		if(medicinalproduct.hasContact()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproduct.getContact().size(); incr++) {
				array = array + medicinalproduct.getContact().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctCntct(array);

		} else {
			m.addMdcnlPrdctCntct("NULL");
		}


		/******************** medicinalproductdomain ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductdomain = medicinalproduct.getDomain();

		/******************** MdcnlPrdct_Domain_Dsply ********************************************************************************/
		if(medicinalproductdomain.hasDisplay()) {

			m.addMdcnlPrdctDomainDsply(String.valueOf(medicinalproductdomain.getDisplay()));
		} else {
			m.addMdcnlPrdctDomainDsply("NULL");
		}


		/******************** MdcnlPrdct_Domain_Vrsn ********************************************************************************/
		if(medicinalproductdomain.hasVersion()) {

			m.addMdcnlPrdctDomainVrsn(String.valueOf(medicinalproductdomain.getVersion()));
		} else {
			m.addMdcnlPrdctDomainVrsn("NULL");
		}


		/******************** MdcnlPrdct_Domain_Cd ********************************************************************************/
		if(medicinalproductdomain.hasCode()) {

			m.addMdcnlPrdctDomainCd(String.valueOf(medicinalproductdomain.getCode()));
		} else {
			m.addMdcnlPrdctDomainCd("NULL");
		}


		/******************** MdcnlPrdct_Domain_UsrSltd ********************************************************************************/
		if(medicinalproductdomain.hasUserSelected()) {

			m.addMdcnlPrdctDomainUsrSltd(String.valueOf(medicinalproductdomain.getUserSelected()));
		} else {
			m.addMdcnlPrdctDomainUsrSltd("NULL");
		}


		/******************** MdcnlPrdct_Domain_Sys ********************************************************************************/
		if(medicinalproductdomain.hasSystem()) {

			m.addMdcnlPrdctDomainSys(String.valueOf(medicinalproductdomain.getSystem()));
		} else {
			m.addMdcnlPrdctDomainSys("NULL");
		}


		/******************** medicinalproductmarketingstatus ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MarketingStatus> medicinalproductmarketingstatuslist = medicinalproduct.getMarketingStatus();
		for(int medicinalproductmarketingstatusi = 0; medicinalproductmarketingstatusi<medicinalproductmarketingstatuslist.size();medicinalproductmarketingstatusi++ ) {
		org.hl7.fhir.r4.model.MarketingStatus  medicinalproductmarketingstatus = medicinalproductmarketingstatuslist.get(medicinalproductmarketingstatusi);

		/******************** medicinalproductmarketingstatuscountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatuscountry = medicinalproductmarketingstatus.getCountry();

		/******************** MdcnlPrdct_MarketingSts_Cntry_Txt ********************************************************************************/
		if(medicinalproductmarketingstatusi == 0) {m.addMdcnlPrdctMarketingStsCntryTxt("[");}
		if(medicinalproductmarketingstatuscountry.hasText()) {

			m.addMdcnlPrdctMarketingStsCntryTxt(String.valueOf(medicinalproductmarketingstatuscountry.getText()));
		} else {
			m.addMdcnlPrdctMarketingStsCntryTxt("NULL");
		}

		if(medicinalproductmarketingstatusi == medicinalproductmarketingstatuslist.size()-1) {m.addMdcnlPrdctMarketingStsCntryTxt("]");}


		/******************** medicinalproductmarketingstatuscountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmarketingstatuscountrycodinglist = medicinalproductmarketingstatuscountry.getCoding();
		for(int medicinalproductmarketingstatuscountrycodingi = 0; medicinalproductmarketingstatuscountrycodingi<medicinalproductmarketingstatuscountrycodinglist.size();medicinalproductmarketingstatuscountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmarketingstatuscountrycoding = medicinalproductmarketingstatuscountrycodinglist.get(medicinalproductmarketingstatuscountrycodingi);

		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctMarketingStsCntryCdgDsply("[[");}
		if(medicinalproductmarketingstatuscountrycoding.hasDisplay()) {

			m.addMdcnlPrdctMarketingStsCntryCdgDsply(String.valueOf(medicinalproductmarketingstatuscountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMarketingStsCntryCdgDsply("NULL");
		}

		if(medicinalproductmarketingstatuscountrycodingi == medicinalproductmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctMarketingStsCntryCdgDsply("]]");}


		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctMarketingStsCntryCdgVrsn("[[");}
		if(medicinalproductmarketingstatuscountrycoding.hasVersion()) {

			m.addMdcnlPrdctMarketingStsCntryCdgVrsn(String.valueOf(medicinalproductmarketingstatuscountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctMarketingStsCntryCdgVrsn("NULL");
		}

		if(medicinalproductmarketingstatuscountrycodingi == medicinalproductmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctMarketingStsCntryCdgVrsn("]]");}


		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctMarketingStsCntryCdgCd("[[");}
		if(medicinalproductmarketingstatuscountrycoding.hasCode()) {

			m.addMdcnlPrdctMarketingStsCntryCdgCd(String.valueOf(medicinalproductmarketingstatuscountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctMarketingStsCntryCdgCd("NULL");
		}

		if(medicinalproductmarketingstatuscountrycodingi == medicinalproductmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctMarketingStsCntryCdgCd("]]");}


		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctMarketingStsCntryCdgUsrSltd("[[");}
		if(medicinalproductmarketingstatuscountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctMarketingStsCntryCdgUsrSltd(String.valueOf(medicinalproductmarketingstatuscountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMarketingStsCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductmarketingstatuscountrycodingi == medicinalproductmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctMarketingStsCntryCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctMarketingStsCntryCdgSys("[[");}
		if(medicinalproductmarketingstatuscountrycoding.hasSystem()) {

			m.addMdcnlPrdctMarketingStsCntryCdgSys(String.valueOf(medicinalproductmarketingstatuscountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctMarketingStsCntryCdgSys("NULL");
		}

		if(medicinalproductmarketingstatuscountrycodingi == medicinalproductmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctMarketingStsCntryCdgSys("]]");}


		 };
		/******************** medicinalproductmarketingstatusstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatusstatus = medicinalproductmarketingstatus.getStatus();

		/******************** MdcnlPrdct_MarketingSts_Sts_Txt ********************************************************************************/
		if(medicinalproductmarketingstatusi == 0) {m.addMdcnlPrdctMarketingStsStsTxt("[");}
		if(medicinalproductmarketingstatusstatus.hasText()) {

			m.addMdcnlPrdctMarketingStsStsTxt(String.valueOf(medicinalproductmarketingstatusstatus.getText()));
		} else {
			m.addMdcnlPrdctMarketingStsStsTxt("NULL");
		}

		if(medicinalproductmarketingstatusi == medicinalproductmarketingstatuslist.size()-1) {m.addMdcnlPrdctMarketingStsStsTxt("]");}


		/******************** medicinalproductmarketingstatusstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmarketingstatusstatuscodinglist = medicinalproductmarketingstatusstatus.getCoding();
		for(int medicinalproductmarketingstatusstatuscodingi = 0; medicinalproductmarketingstatusstatuscodingi<medicinalproductmarketingstatusstatuscodinglist.size();medicinalproductmarketingstatusstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmarketingstatusstatuscoding = medicinalproductmarketingstatusstatuscodinglist.get(medicinalproductmarketingstatusstatuscodingi);

		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctMarketingStsStsCdgDsply("[[");}
		if(medicinalproductmarketingstatusstatuscoding.hasDisplay()) {

			m.addMdcnlPrdctMarketingStsStsCdgDsply(String.valueOf(medicinalproductmarketingstatusstatuscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMarketingStsStsCdgDsply("NULL");
		}

		if(medicinalproductmarketingstatusstatuscodingi == medicinalproductmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctMarketingStsStsCdgDsply("]]");}


		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctMarketingStsStsCdgVrsn("[[");}
		if(medicinalproductmarketingstatusstatuscoding.hasVersion()) {

			m.addMdcnlPrdctMarketingStsStsCdgVrsn(String.valueOf(medicinalproductmarketingstatusstatuscoding.getVersion()));
		} else {
			m.addMdcnlPrdctMarketingStsStsCdgVrsn("NULL");
		}

		if(medicinalproductmarketingstatusstatuscodingi == medicinalproductmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctMarketingStsStsCdgVrsn("]]");}


		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctMarketingStsStsCdgCd("[[");}
		if(medicinalproductmarketingstatusstatuscoding.hasCode()) {

			m.addMdcnlPrdctMarketingStsStsCdgCd(String.valueOf(medicinalproductmarketingstatusstatuscoding.getCode()));
		} else {
			m.addMdcnlPrdctMarketingStsStsCdgCd("NULL");
		}

		if(medicinalproductmarketingstatusstatuscodingi == medicinalproductmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctMarketingStsStsCdgCd("]]");}


		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctMarketingStsStsCdgUsrSltd("[[");}
		if(medicinalproductmarketingstatusstatuscoding.hasUserSelected()) {

			m.addMdcnlPrdctMarketingStsStsCdgUsrSltd(String.valueOf(medicinalproductmarketingstatusstatuscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMarketingStsStsCdgUsrSltd("NULL");
		}

		if(medicinalproductmarketingstatusstatuscodingi == medicinalproductmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctMarketingStsStsCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctMarketingStsStsCdgSys("[[");}
		if(medicinalproductmarketingstatusstatuscoding.hasSystem()) {

			m.addMdcnlPrdctMarketingStsStsCdgSys(String.valueOf(medicinalproductmarketingstatusstatuscoding.getSystem()));
		} else {
			m.addMdcnlPrdctMarketingStsStsCdgSys("NULL");
		}

		if(medicinalproductmarketingstatusstatuscodingi == medicinalproductmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctMarketingStsStsCdgSys("]]");}


		 };
		/******************** medicinalproductmarketingstatusjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatusjurisdiction = medicinalproductmarketingstatus.getJurisdiction();

		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductmarketingstatusi == 0) {m.addMdcnlPrdctMarketingStsJrsdctnTxt("[");}
		if(medicinalproductmarketingstatusjurisdiction.hasText()) {

			m.addMdcnlPrdctMarketingStsJrsdctnTxt(String.valueOf(medicinalproductmarketingstatusjurisdiction.getText()));
		} else {
			m.addMdcnlPrdctMarketingStsJrsdctnTxt("NULL");
		}

		if(medicinalproductmarketingstatusi == medicinalproductmarketingstatuslist.size()-1) {m.addMdcnlPrdctMarketingStsJrsdctnTxt("]");}


		/******************** medicinalproductmarketingstatusjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmarketingstatusjurisdictioncodinglist = medicinalproductmarketingstatusjurisdiction.getCoding();
		for(int medicinalproductmarketingstatusjurisdictioncodingi = 0; medicinalproductmarketingstatusjurisdictioncodingi<medicinalproductmarketingstatusjurisdictioncodinglist.size();medicinalproductmarketingstatusjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmarketingstatusjurisdictioncoding = medicinalproductmarketingstatusjurisdictioncodinglist.get(medicinalproductmarketingstatusjurisdictioncodingi);

		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctMarketingStsJrsdctnCdgDsply("[[");}
		if(medicinalproductmarketingstatusjurisdictioncoding.hasDisplay()) {

			m.addMdcnlPrdctMarketingStsJrsdctnCdgDsply(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMarketingStsJrsdctnCdgDsply("NULL");
		}

		if(medicinalproductmarketingstatusjurisdictioncodingi == medicinalproductmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctMarketingStsJrsdctnCdgDsply("]]");}


		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctMarketingStsJrsdctnCdgVrsn("[[");}
		if(medicinalproductmarketingstatusjurisdictioncoding.hasVersion()) {

			m.addMdcnlPrdctMarketingStsJrsdctnCdgVrsn(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctMarketingStsJrsdctnCdgVrsn("NULL");
		}

		if(medicinalproductmarketingstatusjurisdictioncodingi == medicinalproductmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctMarketingStsJrsdctnCdgVrsn("]]");}


		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctMarketingStsJrsdctnCdgCd("[[");}
		if(medicinalproductmarketingstatusjurisdictioncoding.hasCode()) {

			m.addMdcnlPrdctMarketingStsJrsdctnCdgCd(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getCode()));
		} else {
			m.addMdcnlPrdctMarketingStsJrsdctnCdgCd("NULL");
		}

		if(medicinalproductmarketingstatusjurisdictioncodingi == medicinalproductmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctMarketingStsJrsdctnCdgCd("]]");}


		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd("[[");}
		if(medicinalproductmarketingstatusjurisdictioncoding.hasUserSelected()) {

			m.addMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd("NULL");
		}

		if(medicinalproductmarketingstatusjurisdictioncodingi == medicinalproductmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctMarketingStsJrsdctnCdgSys("[[");}
		if(medicinalproductmarketingstatusjurisdictioncoding.hasSystem()) {

			m.addMdcnlPrdctMarketingStsJrsdctnCdgSys(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctMarketingStsJrsdctnCdgSys("NULL");
		}

		if(medicinalproductmarketingstatusjurisdictioncodingi == medicinalproductmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctMarketingStsJrsdctnCdgSys("]]");}


		 };
		/******************** MdcnlPrdct_MarketingSts_RestoreDt ********************************************************************************/
		if(medicinalproductmarketingstatusi == 0) {m.addMdcnlPrdctMarketingStsRestoreDt("[");}
		if(medicinalproductmarketingstatus.hasRestoreDate()) {

			m.addMdcnlPrdctMarketingStsRestoreDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductmarketingstatus.getRestoreDate())+"\"");
		} else {
			m.addMdcnlPrdctMarketingStsRestoreDt("NULL");
		}

		if(medicinalproductmarketingstatusi == medicinalproductmarketingstatuslist.size()-1) {m.addMdcnlPrdctMarketingStsRestoreDt("]");}


		/******************** medicinalproductmarketingstatusdaterange ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductmarketingstatusdaterange = medicinalproductmarketingstatus.getDateRange();

		/******************** MdcnlPrdct_MarketingSts_DtRng_Strt ********************************************************************************/
		if(medicinalproductmarketingstatusi == 0) {m.addMdcnlPrdctMarketingStsDtRngStrt("[");}
		if(medicinalproductmarketingstatusdaterange.hasStart()) {

			m.addMdcnlPrdctMarketingStsDtRngStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductmarketingstatusdaterange.getStart())+"\"");
		} else {
			m.addMdcnlPrdctMarketingStsDtRngStrt("NULL");
		}

		if(medicinalproductmarketingstatusi == medicinalproductmarketingstatuslist.size()-1) {m.addMdcnlPrdctMarketingStsDtRngStrt("]");}


		/******************** MdcnlPrdct_MarketingSts_DtRng_End ********************************************************************************/
		if(medicinalproductmarketingstatusi == 0) {m.addMdcnlPrdctMarketingStsDtRngEnd("[");}
		if(medicinalproductmarketingstatusdaterange.hasEnd()) {

			m.addMdcnlPrdctMarketingStsDtRngEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductmarketingstatusdaterange.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctMarketingStsDtRngEnd("NULL");
		}

		if(medicinalproductmarketingstatusi == medicinalproductmarketingstatuslist.size()-1) {m.addMdcnlPrdctMarketingStsDtRngEnd("]");}


		 };
		/******************** MdcnlPrdct_PckgedMdcnlPrdct ********************************************************************************/
		if(medicinalproduct.hasPackagedMedicinalProduct()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproduct.getPackagedMedicinalProduct().size(); incr++) {
				array = array + medicinalproduct.getPackagedMedicinalProduct().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedMdcnlPrdct(array);

		} else {
			m.addMdcnlPrdctPckgedMdcnlPrdct("NULL");
		}


		/******************** medicinalproductmanufacturingbusinessoperation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent> medicinalproductmanufacturingbusinessoperationlist = medicinalproduct.getManufacturingBusinessOperation();
		for(int medicinalproductmanufacturingbusinessoperationi = 0; medicinalproductmanufacturingbusinessoperationi<medicinalproductmanufacturingbusinessoperationlist.size();medicinalproductmanufacturingbusinessoperationi++ ) {
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent  medicinalproductmanufacturingbusinessoperation = medicinalproductmanufacturingbusinessoperationlist.get(medicinalproductmanufacturingbusinessoperationi);

		/******************** medicinalproductmanufacturingbusinessoperationoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationoperationtype = medicinalproductmanufacturingbusinessoperation.getOperationType();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Txt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt("[");}
		if(medicinalproductmanufacturingbusinessoperationoperationtype.hasText()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtype.getText()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt("]");}


		/******************** medicinalproductmanufacturingbusinessoperationoperationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmanufacturingbusinessoperationoperationtypecodinglist = medicinalproductmanufacturingbusinessoperationoperationtype.getCoding();
		for(int medicinalproductmanufacturingbusinessoperationoperationtypecodingi = 0; medicinalproductmanufacturingbusinessoperationoperationtypecodingi<medicinalproductmanufacturingbusinessoperationoperationtypecodinglist.size();medicinalproductmanufacturingbusinessoperationoperationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmanufacturingbusinessoperationoperationtypecoding = medicinalproductmanufacturingbusinessoperationoperationtypecodinglist.get(medicinalproductmanufacturingbusinessoperationoperationtypecodingi);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply("[[");}
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasDisplay()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == medicinalproductmanufacturingbusinessoperationoperationtypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn("[[");}
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasVersion()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == medicinalproductmanufacturingbusinessoperationoperationtypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd("[[");}
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasCode()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getCode()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == medicinalproductmanufacturingbusinessoperationoperationtypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd("[[");}
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasUserSelected()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == medicinalproductmanufacturingbusinessoperationoperationtypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys("[[");}
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasSystem()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationoperationtypecodingi == medicinalproductmanufacturingbusinessoperationoperationtypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys("]]");}


		 };
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber = medicinalproductmanufacturingbusinessoperation.getAuthorisationReferenceNumber();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Vl ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl("[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.hasValue()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getValue()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl("]");}


		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getType();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Txt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt("[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.hasText()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.getText()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt("]");}


		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.getCoding();
		for(int medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi = 0; medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi<medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist.size();medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist.get(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply("[[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasDisplay()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn("[[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasVersion()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd("[[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasCode()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_US ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs("[[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys("[[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasSystem()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodingi == medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys("]]");}


		 };
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getPeriod();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt("[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.hasStart()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt("]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_End ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd("[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.hasEnd()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd("]");}


		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getUse();
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse!=null) {
		if(medicinalproductmanufacturingbusinessoperationi == 0) {

		m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse("[");		}
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse.toCode());
		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {

		m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse("]");		}

		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse("NULL");
		}

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Assigner ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner("[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.hasAssigner()) {

			if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getAssigner().getReference() != null) {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner("]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys("[");}
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.hasSystem()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys("]");}


		/******************** medicinalproductmanufacturingbusinessoperationconfidentialityindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationconfidentialityindicator = medicinalproductmanufacturingbusinessoperation.getConfidentialityIndicator();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Txt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt("[");}
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicator.hasText()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicator.getText()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt("]");}


		/******************** medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist = medicinalproductmanufacturingbusinessoperationconfidentialityindicator.getCoding();
		for(int medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi = 0; medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi<medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist.size();medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding = medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist.get(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply("[[");}
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasDisplay()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn("[[");}
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasVersion()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getVersion()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd("[[");}
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasCode()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getCode()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd("[[");}
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasUserSelected()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys("[[");}
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasSystem()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodingi == medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcodinglist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys("]]");}


		 };
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt("[");}
		if(medicinalproductmanufacturingbusinessoperation.hasEffectiveDate()) {

			m.addMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductmanufacturingbusinessoperation.getEffectiveDate())+"\"");
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt("]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Regulator ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnRegulator("[");}
		if(medicinalproductmanufacturingbusinessoperation.hasRegulator()) {

			if(medicinalproductmanufacturingbusinessoperation.getRegulator().getReference() != null) {
			m.addMdcnlPrdctMnfctrngBsnssOprtnRegulator(medicinalproductmanufacturingbusinessoperation.getRegulator().getReference());
			}
		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnRegulator("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnRegulator("]");}


		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Manufacturer ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationi == 0) {m.addMdcnlPrdctMnfctrngBsnssOprtnManufacturer("[");}
		if(medicinalproductmanufacturingbusinessoperation.hasManufacturer()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductmanufacturingbusinessoperation.getManufacturer().size(); incr++) {
				array = array + medicinalproductmanufacturingbusinessoperation.getManufacturer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctMnfctrngBsnssOprtnManufacturer(array);

		} else {
			m.addMdcnlPrdctMnfctrngBsnssOprtnManufacturer("NULL");
		}

		if(medicinalproductmanufacturingbusinessoperationi == medicinalproductmanufacturingbusinessoperationlist.size()-1) {m.addMdcnlPrdctMnfctrngBsnssOprtnManufacturer("]");}


		 };
		/******************** medicinalproductspecialdesignation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent> medicinalproductspecialdesignationlist = medicinalproduct.getSpecialDesignation();
		for(int medicinalproductspecialdesignationi = 0; medicinalproductspecialdesignationi<medicinalproductspecialdesignationlist.size();medicinalproductspecialdesignationi++ ) {
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent  medicinalproductspecialdesignation = medicinalproductspecialdesignationlist.get(medicinalproductspecialdesignationi);

		/******************** medicinalproductspecialdesignationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationtype = medicinalproductspecialdesignation.getType();

		/******************** MdcnlPrdct_SpclDsgnation_Typ_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationi == 0) {m.addMdcnlPrdctSpclDsgnationTypTxt("[");}
		if(medicinalproductspecialdesignationtype.hasText()) {

			m.addMdcnlPrdctSpclDsgnationTypTxt(String.valueOf(medicinalproductspecialdesignationtype.getText()));
		} else {
			m.addMdcnlPrdctSpclDsgnationTypTxt("NULL");
		}

		if(medicinalproductspecialdesignationi == medicinalproductspecialdesignationlist.size()-1) {m.addMdcnlPrdctSpclDsgnationTypTxt("]");}


		/******************** medicinalproductspecialdesignationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductspecialdesignationtypecodinglist = medicinalproductspecialdesignationtype.getCoding();
		for(int medicinalproductspecialdesignationtypecodingi = 0; medicinalproductspecialdesignationtypecodingi<medicinalproductspecialdesignationtypecodinglist.size();medicinalproductspecialdesignationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductspecialdesignationtypecoding = medicinalproductspecialdesignationtypecodinglist.get(medicinalproductspecialdesignationtypecodingi);

		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationtypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationTypCdgDsply("[[");}
		if(medicinalproductspecialdesignationtypecoding.hasDisplay()) {

			m.addMdcnlPrdctSpclDsgnationTypCdgDsply(String.valueOf(medicinalproductspecialdesignationtypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctSpclDsgnationTypCdgDsply("NULL");
		}

		if(medicinalproductspecialdesignationtypecodingi == medicinalproductspecialdesignationtypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationTypCdgDsply("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationtypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationTypCdgVrsn("[[");}
		if(medicinalproductspecialdesignationtypecoding.hasVersion()) {

			m.addMdcnlPrdctSpclDsgnationTypCdgVrsn(String.valueOf(medicinalproductspecialdesignationtypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctSpclDsgnationTypCdgVrsn("NULL");
		}

		if(medicinalproductspecialdesignationtypecodingi == medicinalproductspecialdesignationtypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationTypCdgVrsn("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationtypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationTypCdgCd("[[");}
		if(medicinalproductspecialdesignationtypecoding.hasCode()) {

			m.addMdcnlPrdctSpclDsgnationTypCdgCd(String.valueOf(medicinalproductspecialdesignationtypecoding.getCode()));
		} else {
			m.addMdcnlPrdctSpclDsgnationTypCdgCd("NULL");
		}

		if(medicinalproductspecialdesignationtypecodingi == medicinalproductspecialdesignationtypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationTypCdgCd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationtypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationTypCdgUsrSltd("[[");}
		if(medicinalproductspecialdesignationtypecoding.hasUserSelected()) {

			m.addMdcnlPrdctSpclDsgnationTypCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationtypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctSpclDsgnationTypCdgUsrSltd("NULL");
		}

		if(medicinalproductspecialdesignationtypecodingi == medicinalproductspecialdesignationtypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationtypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationTypCdgSys("[[");}
		if(medicinalproductspecialdesignationtypecoding.hasSystem()) {

			m.addMdcnlPrdctSpclDsgnationTypCdgSys(String.valueOf(medicinalproductspecialdesignationtypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctSpclDsgnationTypCdgSys("NULL");
		}

		if(medicinalproductspecialdesignationtypecodingi == medicinalproductspecialdesignationtypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationTypCdgSys("]]");}


		 };
		/******************** MdcnlPrdct_SpclDsgnation_Dt ********************************************************************************/
		if(medicinalproductspecialdesignationi == 0) {m.addMdcnlPrdctSpclDsgnationDt("[");}
		if(medicinalproductspecialdesignation.hasDate()) {

			m.addMdcnlPrdctSpclDsgnationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductspecialdesignation.getDate())+"\"");
		} else {
			m.addMdcnlPrdctSpclDsgnationDt("NULL");
		}

		if(medicinalproductspecialdesignationi == medicinalproductspecialdesignationlist.size()-1) {m.addMdcnlPrdctSpclDsgnationDt("]");}


		/******************** medicinalproductspecialdesignationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationstatus = medicinalproductspecialdesignation.getStatus();

		/******************** MdcnlPrdct_SpclDsgnation_Sts_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationi == 0) {m.addMdcnlPrdctSpclDsgnationStsTxt("[");}
		if(medicinalproductspecialdesignationstatus.hasText()) {

			m.addMdcnlPrdctSpclDsgnationStsTxt(String.valueOf(medicinalproductspecialdesignationstatus.getText()));
		} else {
			m.addMdcnlPrdctSpclDsgnationStsTxt("NULL");
		}

		if(medicinalproductspecialdesignationi == medicinalproductspecialdesignationlist.size()-1) {m.addMdcnlPrdctSpclDsgnationStsTxt("]");}


		/******************** medicinalproductspecialdesignationstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductspecialdesignationstatuscodinglist = medicinalproductspecialdesignationstatus.getCoding();
		for(int medicinalproductspecialdesignationstatuscodingi = 0; medicinalproductspecialdesignationstatuscodingi<medicinalproductspecialdesignationstatuscodinglist.size();medicinalproductspecialdesignationstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductspecialdesignationstatuscoding = medicinalproductspecialdesignationstatuscodinglist.get(medicinalproductspecialdesignationstatuscodingi);

		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscodingi == 0) {m.addMdcnlPrdctSpclDsgnationStsCdgDsply("[[");}
		if(medicinalproductspecialdesignationstatuscoding.hasDisplay()) {

			m.addMdcnlPrdctSpclDsgnationStsCdgDsply(String.valueOf(medicinalproductspecialdesignationstatuscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctSpclDsgnationStsCdgDsply("NULL");
		}

		if(medicinalproductspecialdesignationstatuscodingi == medicinalproductspecialdesignationstatuscodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationStsCdgDsply("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscodingi == 0) {m.addMdcnlPrdctSpclDsgnationStsCdgVrsn("[[");}
		if(medicinalproductspecialdesignationstatuscoding.hasVersion()) {

			m.addMdcnlPrdctSpclDsgnationStsCdgVrsn(String.valueOf(medicinalproductspecialdesignationstatuscoding.getVersion()));
		} else {
			m.addMdcnlPrdctSpclDsgnationStsCdgVrsn("NULL");
		}

		if(medicinalproductspecialdesignationstatuscodingi == medicinalproductspecialdesignationstatuscodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationStsCdgVrsn("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscodingi == 0) {m.addMdcnlPrdctSpclDsgnationStsCdgCd("[[");}
		if(medicinalproductspecialdesignationstatuscoding.hasCode()) {

			m.addMdcnlPrdctSpclDsgnationStsCdgCd(String.valueOf(medicinalproductspecialdesignationstatuscoding.getCode()));
		} else {
			m.addMdcnlPrdctSpclDsgnationStsCdgCd("NULL");
		}

		if(medicinalproductspecialdesignationstatuscodingi == medicinalproductspecialdesignationstatuscodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationStsCdgCd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscodingi == 0) {m.addMdcnlPrdctSpclDsgnationStsCdgUsrSltd("[[");}
		if(medicinalproductspecialdesignationstatuscoding.hasUserSelected()) {

			m.addMdcnlPrdctSpclDsgnationStsCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationstatuscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctSpclDsgnationStsCdgUsrSltd("NULL");
		}

		if(medicinalproductspecialdesignationstatuscodingi == medicinalproductspecialdesignationstatuscodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationStsCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscodingi == 0) {m.addMdcnlPrdctSpclDsgnationStsCdgSys("[[");}
		if(medicinalproductspecialdesignationstatuscoding.hasSystem()) {

			m.addMdcnlPrdctSpclDsgnationStsCdgSys(String.valueOf(medicinalproductspecialdesignationstatuscoding.getSystem()));
		} else {
			m.addMdcnlPrdctSpclDsgnationStsCdgSys("NULL");
		}

		if(medicinalproductspecialdesignationstatuscodingi == medicinalproductspecialdesignationstatuscodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationStsCdgSys("]]");}


		 };
		/******************** medicinalproductspecialdesignationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductspecialdesignationidentifierlist = medicinalproductspecialdesignation.getIdentifier();
		for(int medicinalproductspecialdesignationidentifieri = 0; medicinalproductspecialdesignationidentifieri<medicinalproductspecialdesignationidentifierlist.size();medicinalproductspecialdesignationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductspecialdesignationidentifier = medicinalproductspecialdesignationidentifierlist.get(medicinalproductspecialdesignationidentifieri);

		/******************** MdcnlPrdct_SpclDsgnation_Id_Vl ********************************************************************************/
		if(medicinalproductspecialdesignationidentifieri == 0) {m.addMdcnlPrdctSpclDsgnationIdVl("[[");}
		if(medicinalproductspecialdesignationidentifier.hasValue()) {

			m.addMdcnlPrdctSpclDsgnationIdVl(String.valueOf(medicinalproductspecialdesignationidentifier.getValue()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdVl("NULL");
		}

		if(medicinalproductspecialdesignationidentifieri == medicinalproductspecialdesignationidentifierlist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdVl("]]");}


		/******************** medicinalproductspecialdesignationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationidentifiertype = medicinalproductspecialdesignationidentifier.getType();

		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationidentifieri == 0) {m.addMdcnlPrdctSpclDsgnationIdTypTxt("[[");}
		if(medicinalproductspecialdesignationidentifiertype.hasText()) {

			m.addMdcnlPrdctSpclDsgnationIdTypTxt(String.valueOf(medicinalproductspecialdesignationidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdTypTxt("NULL");
		}

		if(medicinalproductspecialdesignationidentifieri == medicinalproductspecialdesignationidentifierlist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdTypTxt("]]");}


		/******************** medicinalproductspecialdesignationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductspecialdesignationidentifiertypecodinglist = medicinalproductspecialdesignationidentifiertype.getCoding();
		for(int medicinalproductspecialdesignationidentifiertypecodingi = 0; medicinalproductspecialdesignationidentifiertypecodingi<medicinalproductspecialdesignationidentifiertypecodinglist.size();medicinalproductspecialdesignationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductspecialdesignationidentifiertypecoding = medicinalproductspecialdesignationidentifiertypecodinglist.get(medicinalproductspecialdesignationidentifiertypecodingi);

		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIdTypCdgDsply("[[[");}
		if(medicinalproductspecialdesignationidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctSpclDsgnationIdTypCdgDsply(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdTypCdgDsply("NULL");
		}

		if(medicinalproductspecialdesignationidentifiertypecodingi == medicinalproductspecialdesignationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdTypCdgDsply("]]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIdTypCdgVrsn("[[[");}
		if(medicinalproductspecialdesignationidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctSpclDsgnationIdTypCdgVrsn(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdTypCdgVrsn("NULL");
		}

		if(medicinalproductspecialdesignationidentifiertypecodingi == medicinalproductspecialdesignationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdTypCdgVrsn("]]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIdTypCdgCd("[[[");}
		if(medicinalproductspecialdesignationidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctSpclDsgnationIdTypCdgCd(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdTypCdgCd("NULL");
		}

		if(medicinalproductspecialdesignationidentifiertypecodingi == medicinalproductspecialdesignationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdTypCdgCd("]]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd("[[[");}
		if(medicinalproductspecialdesignationidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductspecialdesignationidentifiertypecodingi == medicinalproductspecialdesignationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd("]]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIdTypCdgSys("[[[");}
		if(medicinalproductspecialdesignationidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctSpclDsgnationIdTypCdgSys(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdTypCdgSys("NULL");
		}

		if(medicinalproductspecialdesignationidentifiertypecodingi == medicinalproductspecialdesignationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdTypCdgSys("]]]");}


		 };
		/******************** medicinalproductspecialdesignationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductspecialdesignationidentifierperiod = medicinalproductspecialdesignationidentifier.getPeriod();

		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductspecialdesignationidentifieri == 0) {m.addMdcnlPrdctSpclDsgnationIdPrdStrt("[[");}
		if(medicinalproductspecialdesignationidentifierperiod.hasStart()) {

			m.addMdcnlPrdctSpclDsgnationIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductspecialdesignationidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctSpclDsgnationIdPrdStrt("NULL");
		}

		if(medicinalproductspecialdesignationidentifieri == medicinalproductspecialdesignationidentifierlist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdPrdStrt("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_End ********************************************************************************/
		if(medicinalproductspecialdesignationidentifieri == 0) {m.addMdcnlPrdctSpclDsgnationIdPrdEnd("[[");}
		if(medicinalproductspecialdesignationidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctSpclDsgnationIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductspecialdesignationidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctSpclDsgnationIdPrdEnd("NULL");
		}

		if(medicinalproductspecialdesignationidentifieri == medicinalproductspecialdesignationidentifierlist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdPrdEnd("]]");}


		/******************** medicinalproductspecialdesignationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductspecialdesignationidentifieruse = medicinalproductspecialdesignationidentifier.getUse();
		if(medicinalproductspecialdesignationidentifieruse!=null) {
		if(medicinalproductspecialdesignationidentifieri == 0) {

		m.addMdcnlPrdctSpclDsgnationIdUse("[[");		}
			m.addMdcnlPrdctSpclDsgnationIdUse(medicinalproductspecialdesignationidentifieruse.toCode());
		if(medicinalproductspecialdesignationidentifieri == medicinalproductspecialdesignationidentifierlist.size()-1) {

		m.addMdcnlPrdctSpclDsgnationIdUse("]]");		}

		} else {
			m.addMdcnlPrdctSpclDsgnationIdUse("NULL");
		}

		/******************** MdcnlPrdct_SpclDsgnation_Id_Assigner ********************************************************************************/
		if(medicinalproductspecialdesignationidentifieri == 0) {m.addMdcnlPrdctSpclDsgnationIdAssigner("[[");}
		if(medicinalproductspecialdesignationidentifier.hasAssigner()) {

			if(medicinalproductspecialdesignationidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctSpclDsgnationIdAssigner(medicinalproductspecialdesignationidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctSpclDsgnationIdAssigner("NULL");
		}

		if(medicinalproductspecialdesignationidentifieri == medicinalproductspecialdesignationidentifierlist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdAssigner("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Id_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationidentifieri == 0) {m.addMdcnlPrdctSpclDsgnationIdSys("[[");}
		if(medicinalproductspecialdesignationidentifier.hasSystem()) {

			m.addMdcnlPrdctSpclDsgnationIdSys(String.valueOf(medicinalproductspecialdesignationidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIdSys("NULL");
		}

		if(medicinalproductspecialdesignationidentifieri == medicinalproductspecialdesignationidentifierlist.size()-1) {m.addMdcnlPrdctSpclDsgnationIdSys("]]");}


		 };
		/******************** medicinalproductspecialdesignationspecies ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationspecies = medicinalproductspecialdesignation.getSpecies();

		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationspecies.hasText()) {

			m.addMdcnlPrdctSpclDsgnationSpcsTxt(String.valueOf(medicinalproductspecialdesignationspecies.getText()));
		} else {
			m.addMdcnlPrdctSpclDsgnationSpcsTxt("NULL");
		}


		/******************** medicinalproductspecialdesignationspeciescoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductspecialdesignationspeciescodinglist = medicinalproductspecialdesignationspecies.getCoding();
		for(int medicinalproductspecialdesignationspeciescodingi = 0; medicinalproductspecialdesignationspeciescodingi<medicinalproductspecialdesignationspeciescodinglist.size();medicinalproductspecialdesignationspeciescodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductspecialdesignationspeciescoding = medicinalproductspecialdesignationspeciescodinglist.get(medicinalproductspecialdesignationspeciescodingi);

		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescodingi == 0) {m.addMdcnlPrdctSpclDsgnationSpcsCdgDsply("[[");}
		if(medicinalproductspecialdesignationspeciescoding.hasDisplay()) {

			m.addMdcnlPrdctSpclDsgnationSpcsCdgDsply(String.valueOf(medicinalproductspecialdesignationspeciescoding.getDisplay()));
		} else {
			m.addMdcnlPrdctSpclDsgnationSpcsCdgDsply("NULL");
		}

		if(medicinalproductspecialdesignationspeciescodingi == medicinalproductspecialdesignationspeciescodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationSpcsCdgDsply("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescodingi == 0) {m.addMdcnlPrdctSpclDsgnationSpcsCdgVrsn("[[");}
		if(medicinalproductspecialdesignationspeciescoding.hasVersion()) {

			m.addMdcnlPrdctSpclDsgnationSpcsCdgVrsn(String.valueOf(medicinalproductspecialdesignationspeciescoding.getVersion()));
		} else {
			m.addMdcnlPrdctSpclDsgnationSpcsCdgVrsn("NULL");
		}

		if(medicinalproductspecialdesignationspeciescodingi == medicinalproductspecialdesignationspeciescodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationSpcsCdgVrsn("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescodingi == 0) {m.addMdcnlPrdctSpclDsgnationSpcsCdgCd("[[");}
		if(medicinalproductspecialdesignationspeciescoding.hasCode()) {

			m.addMdcnlPrdctSpclDsgnationSpcsCdgCd(String.valueOf(medicinalproductspecialdesignationspeciescoding.getCode()));
		} else {
			m.addMdcnlPrdctSpclDsgnationSpcsCdgCd("NULL");
		}

		if(medicinalproductspecialdesignationspeciescodingi == medicinalproductspecialdesignationspeciescodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationSpcsCdgCd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescodingi == 0) {m.addMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd("[[");}
		if(medicinalproductspecialdesignationspeciescoding.hasUserSelected()) {

			m.addMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationspeciescoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd("NULL");
		}

		if(medicinalproductspecialdesignationspeciescodingi == medicinalproductspecialdesignationspeciescodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescodingi == 0) {m.addMdcnlPrdctSpclDsgnationSpcsCdgSys("[[");}
		if(medicinalproductspecialdesignationspeciescoding.hasSystem()) {

			m.addMdcnlPrdctSpclDsgnationSpcsCdgSys(String.valueOf(medicinalproductspecialdesignationspeciescoding.getSystem()));
		} else {
			m.addMdcnlPrdctSpclDsgnationSpcsCdgSys("NULL");
		}

		if(medicinalproductspecialdesignationspeciescodingi == medicinalproductspecialdesignationspeciescodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationSpcsCdgSys("]]");}


		 };
		/******************** medicinalproductspecialdesignationintendeduse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationintendeduse = medicinalproductspecialdesignation.getIntendedUse();

		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationintendeduse.hasText()) {

			m.addMdcnlPrdctSpclDsgnationIntendedUseTxt(String.valueOf(medicinalproductspecialdesignationintendeduse.getText()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIntendedUseTxt("NULL");
		}


		/******************** medicinalproductspecialdesignationintendedusecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductspecialdesignationintendedusecodinglist = medicinalproductspecialdesignationintendeduse.getCoding();
		for(int medicinalproductspecialdesignationintendedusecodingi = 0; medicinalproductspecialdesignationintendedusecodingi<medicinalproductspecialdesignationintendedusecodinglist.size();medicinalproductspecialdesignationintendedusecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductspecialdesignationintendedusecoding = medicinalproductspecialdesignationintendedusecodinglist.get(medicinalproductspecialdesignationintendedusecodingi);

		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgDsply("[[");}
		if(medicinalproductspecialdesignationintendedusecoding.hasDisplay()) {

			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgDsply(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgDsply("NULL");
		}

		if(medicinalproductspecialdesignationintendedusecodingi == medicinalproductspecialdesignationintendedusecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgDsply("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn("[[");}
		if(medicinalproductspecialdesignationintendedusecoding.hasVersion()) {

			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getVersion()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn("NULL");
		}

		if(medicinalproductspecialdesignationintendedusecodingi == medicinalproductspecialdesignationintendedusecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgCd("[[");}
		if(medicinalproductspecialdesignationintendedusecoding.hasCode()) {

			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgCd(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getCode()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgCd("NULL");
		}

		if(medicinalproductspecialdesignationintendedusecodingi == medicinalproductspecialdesignationintendedusecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgCd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd("[[");}
		if(medicinalproductspecialdesignationintendedusecoding.hasUserSelected()) {

			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd("NULL");
		}

		if(medicinalproductspecialdesignationintendedusecodingi == medicinalproductspecialdesignationintendedusecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecodingi == 0) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgSys("[[");}
		if(medicinalproductspecialdesignationintendedusecoding.hasSystem()) {

			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgSys(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getSystem()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIntendedUseCdgSys("NULL");
		}

		if(medicinalproductspecialdesignationintendedusecodingi == medicinalproductspecialdesignationintendedusecodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIntendedUseCdgSys("]]");}


		 };
		/******************** MdcnlPrdct_SpclDsgnation_IndctnRfrnc ********************************************************************************/
		if(medicinalproductspecialdesignation.hasIndicationReference()) {

			if(medicinalproductspecialdesignation.getIndicationReference().getReference() != null) {
			m.addMdcnlPrdctSpclDsgnationIndctnRfrnc(medicinalproductspecialdesignation.getIndicationReference().getReference());
			}
		} else {
			m.addMdcnlPrdctSpclDsgnationIndctnRfrnc("NULL");
		}


		/******************** medicinalproductspecialdesignationindicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationindicationcodeableconcept = medicinalproductspecialdesignation.getIndicationCodeableConcept();

		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconcept.hasText()) {

			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptTxt(String.valueOf(medicinalproductspecialdesignationindicationcodeableconcept.getText()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptTxt("NULL");
		}


		/******************** medicinalproductspecialdesignationindicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductspecialdesignationindicationcodeableconceptcodinglist = medicinalproductspecialdesignationindicationcodeableconcept.getCoding();
		for(int medicinalproductspecialdesignationindicationcodeableconceptcodingi = 0; medicinalproductspecialdesignationindicationcodeableconceptcodingi<medicinalproductspecialdesignationindicationcodeableconceptcodinglist.size();medicinalproductspecialdesignationindicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductspecialdesignationindicationcodeableconceptcoding = medicinalproductspecialdesignationindicationcodeableconceptcodinglist.get(medicinalproductspecialdesignationindicationcodeableconceptcodingi);

		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply("[[");}
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasDisplay()) {

			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply("NULL");
		}

		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == medicinalproductspecialdesignationindicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn("[[");}
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasVersion()) {

			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == medicinalproductspecialdesignationindicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd("[[");}
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasCode()) {

			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd("NULL");
		}

		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == medicinalproductspecialdesignationindicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd("[[");}
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == medicinalproductspecialdesignationindicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == 0) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys("[[");}
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasSystem()) {

			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys("NULL");
		}

		if(medicinalproductspecialdesignationindicationcodeableconceptcodingi == medicinalproductspecialdesignationindicationcodeableconceptcodinglist.size()-1) {m.addMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys("]]");}


		 };
		 };
		/******************** MdcnlPrdct_AttachedDoc ********************************************************************************/
		if(medicinalproduct.hasAttachedDocument()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproduct.getAttachedDocument().size(); incr++) {
				array = array + medicinalproduct.getAttachedDocument().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctAttachedDoc(array);

		} else {
			m.addMdcnlPrdctAttachedDoc("NULL");
		}


		/******************** medicinalproductlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductlegalstatusofsupply = medicinalproduct.getLegalStatusOfSupply();

		/******************** MdcnlPrdct_LegalStsOfSpply_Txt ********************************************************************************/
		if(medicinalproductlegalstatusofsupply.hasText()) {

			m.addMdcnlPrdctLegalStsOfSpplyTxt(String.valueOf(medicinalproductlegalstatusofsupply.getText()));
		} else {
			m.addMdcnlPrdctLegalStsOfSpplyTxt("NULL");
		}


		/******************** medicinalproductlegalstatusofsupplycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductlegalstatusofsupplycodinglist = medicinalproductlegalstatusofsupply.getCoding();
		for(int medicinalproductlegalstatusofsupplycodingi = 0; medicinalproductlegalstatusofsupplycodingi<medicinalproductlegalstatusofsupplycodinglist.size();medicinalproductlegalstatusofsupplycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductlegalstatusofsupplycoding = medicinalproductlegalstatusofsupplycodinglist.get(medicinalproductlegalstatusofsupplycodingi);

		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctLegalStsOfSpplyCdgDsply("[");}
		if(medicinalproductlegalstatusofsupplycoding.hasDisplay()) {

			m.addMdcnlPrdctLegalStsOfSpplyCdgDsply(String.valueOf(medicinalproductlegalstatusofsupplycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctLegalStsOfSpplyCdgDsply("NULL");
		}

		if(medicinalproductlegalstatusofsupplycodingi == medicinalproductlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctLegalStsOfSpplyCdgDsply("]");}


		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctLegalStsOfSpplyCdgVrsn("[");}
		if(medicinalproductlegalstatusofsupplycoding.hasVersion()) {

			m.addMdcnlPrdctLegalStsOfSpplyCdgVrsn(String.valueOf(medicinalproductlegalstatusofsupplycoding.getVersion()));
		} else {
			m.addMdcnlPrdctLegalStsOfSpplyCdgVrsn("NULL");
		}

		if(medicinalproductlegalstatusofsupplycodingi == medicinalproductlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctLegalStsOfSpplyCdgVrsn("]");}


		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctLegalStsOfSpplyCdgCd("[");}
		if(medicinalproductlegalstatusofsupplycoding.hasCode()) {

			m.addMdcnlPrdctLegalStsOfSpplyCdgCd(String.valueOf(medicinalproductlegalstatusofsupplycoding.getCode()));
		} else {
			m.addMdcnlPrdctLegalStsOfSpplyCdgCd("NULL");
		}

		if(medicinalproductlegalstatusofsupplycodingi == medicinalproductlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctLegalStsOfSpplyCdgCd("]");}


		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctLegalStsOfSpplyCdgUsrSltd("[");}
		if(medicinalproductlegalstatusofsupplycoding.hasUserSelected()) {

			m.addMdcnlPrdctLegalStsOfSpplyCdgUsrSltd(String.valueOf(medicinalproductlegalstatusofsupplycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctLegalStsOfSpplyCdgUsrSltd("NULL");
		}

		if(medicinalproductlegalstatusofsupplycodingi == medicinalproductlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctLegalStsOfSpplyCdgUsrSltd("]");}


		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctLegalStsOfSpplyCdgSys("[");}
		if(medicinalproductlegalstatusofsupplycoding.hasSystem()) {

			m.addMdcnlPrdctLegalStsOfSpplyCdgSys(String.valueOf(medicinalproductlegalstatusofsupplycoding.getSystem()));
		} else {
			m.addMdcnlPrdctLegalStsOfSpplyCdgSys("NULL");
		}

		if(medicinalproductlegalstatusofsupplycodingi == medicinalproductlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctLegalStsOfSpplyCdgSys("]");}


		 };
		/******************** medicinalproductadditionalmonitoringindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductadditionalmonitoringindicator = medicinalproduct.getAdditionalMonitoringIndicator();

		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Txt ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicator.hasText()) {

			m.addMdcnlPrdctAddtnlMonitoringIndicatorTxt(String.valueOf(medicinalproductadditionalmonitoringindicator.getText()));
		} else {
			m.addMdcnlPrdctAddtnlMonitoringIndicatorTxt("NULL");
		}


		/******************** medicinalproductadditionalmonitoringindicatorcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductadditionalmonitoringindicatorcodinglist = medicinalproductadditionalmonitoringindicator.getCoding();
		for(int medicinalproductadditionalmonitoringindicatorcodingi = 0; medicinalproductadditionalmonitoringindicatorcodingi<medicinalproductadditionalmonitoringindicatorcodinglist.size();medicinalproductadditionalmonitoringindicatorcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductadditionalmonitoringindicatorcoding = medicinalproductadditionalmonitoringindicatorcodinglist.get(medicinalproductadditionalmonitoringindicatorcodingi);

		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Dsply ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcodingi == 0) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply("[");}
		if(medicinalproductadditionalmonitoringindicatorcoding.hasDisplay()) {

			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply("NULL");
		}

		if(medicinalproductadditionalmonitoringindicatorcodingi == medicinalproductadditionalmonitoringindicatorcodinglist.size()-1) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply("]");}


		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcodingi == 0) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn("[");}
		if(medicinalproductadditionalmonitoringindicatorcoding.hasVersion()) {

			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getVersion()));
		} else {
			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn("NULL");
		}

		if(medicinalproductadditionalmonitoringindicatorcodingi == medicinalproductadditionalmonitoringindicatorcodinglist.size()-1) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn("]");}


		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Cd ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcodingi == 0) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgCd("[");}
		if(medicinalproductadditionalmonitoringindicatorcoding.hasCode()) {

			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgCd(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getCode()));
		} else {
			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgCd("NULL");
		}

		if(medicinalproductadditionalmonitoringindicatorcodingi == medicinalproductadditionalmonitoringindicatorcodinglist.size()-1) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgCd("]");}


		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcodingi == 0) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd("[");}
		if(medicinalproductadditionalmonitoringindicatorcoding.hasUserSelected()) {

			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd("NULL");
		}

		if(medicinalproductadditionalmonitoringindicatorcodingi == medicinalproductadditionalmonitoringindicatorcodinglist.size()-1) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd("]");}


		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Sys ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcodingi == 0) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgSys("[");}
		if(medicinalproductadditionalmonitoringindicatorcoding.hasSystem()) {

			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgSys(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getSystem()));
		} else {
			m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgSys("NULL");
		}

		if(medicinalproductadditionalmonitoringindicatorcodingi == medicinalproductadditionalmonitoringindicatorcodinglist.size()-1) {m.addMdcnlPrdctAddtnlMonitoringIndicatorCdgSys("]");}


		 };
		/******************** medicinalproductpaediatricuseindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpaediatricuseindicator = medicinalproduct.getPaediatricUseIndicator();

		/******************** MdcnlPrdct_PaediatricUseIndicator_Txt ********************************************************************************/
		if(medicinalproductpaediatricuseindicator.hasText()) {

			m.addMdcnlPrdctPaediatricUseIndicatorTxt(String.valueOf(medicinalproductpaediatricuseindicator.getText()));
		} else {
			m.addMdcnlPrdctPaediatricUseIndicatorTxt("NULL");
		}


		/******************** medicinalproductpaediatricuseindicatorcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpaediatricuseindicatorcodinglist = medicinalproductpaediatricuseindicator.getCoding();
		for(int medicinalproductpaediatricuseindicatorcodingi = 0; medicinalproductpaediatricuseindicatorcodingi<medicinalproductpaediatricuseindicatorcodinglist.size();medicinalproductpaediatricuseindicatorcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpaediatricuseindicatorcoding = medicinalproductpaediatricuseindicatorcodinglist.get(medicinalproductpaediatricuseindicatorcodingi);

		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcodingi == 0) {m.addMdcnlPrdctPaediatricUseIndicatorCdgDsply("[");}
		if(medicinalproductpaediatricuseindicatorcoding.hasDisplay()) {

			m.addMdcnlPrdctPaediatricUseIndicatorCdgDsply(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPaediatricUseIndicatorCdgDsply("NULL");
		}

		if(medicinalproductpaediatricuseindicatorcodingi == medicinalproductpaediatricuseindicatorcodinglist.size()-1) {m.addMdcnlPrdctPaediatricUseIndicatorCdgDsply("]");}


		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcodingi == 0) {m.addMdcnlPrdctPaediatricUseIndicatorCdgVrsn("[");}
		if(medicinalproductpaediatricuseindicatorcoding.hasVersion()) {

			m.addMdcnlPrdctPaediatricUseIndicatorCdgVrsn(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getVersion()));
		} else {
			m.addMdcnlPrdctPaediatricUseIndicatorCdgVrsn("NULL");
		}

		if(medicinalproductpaediatricuseindicatorcodingi == medicinalproductpaediatricuseindicatorcodinglist.size()-1) {m.addMdcnlPrdctPaediatricUseIndicatorCdgVrsn("]");}


		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Cd ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcodingi == 0) {m.addMdcnlPrdctPaediatricUseIndicatorCdgCd("[");}
		if(medicinalproductpaediatricuseindicatorcoding.hasCode()) {

			m.addMdcnlPrdctPaediatricUseIndicatorCdgCd(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getCode()));
		} else {
			m.addMdcnlPrdctPaediatricUseIndicatorCdgCd("NULL");
		}

		if(medicinalproductpaediatricuseindicatorcodingi == medicinalproductpaediatricuseindicatorcodinglist.size()-1) {m.addMdcnlPrdctPaediatricUseIndicatorCdgCd("]");}


		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcodingi == 0) {m.addMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd("[");}
		if(medicinalproductpaediatricuseindicatorcoding.hasUserSelected()) {

			m.addMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd("NULL");
		}

		if(medicinalproductpaediatricuseindicatorcodingi == medicinalproductpaediatricuseindicatorcodinglist.size()-1) {m.addMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd("]");}


		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Sys ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcodingi == 0) {m.addMdcnlPrdctPaediatricUseIndicatorCdgSys("[");}
		if(medicinalproductpaediatricuseindicatorcoding.hasSystem()) {

			m.addMdcnlPrdctPaediatricUseIndicatorCdgSys(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getSystem()));
		} else {
			m.addMdcnlPrdctPaediatricUseIndicatorCdgSys("NULL");
		}

		if(medicinalproductpaediatricuseindicatorcodingi == medicinalproductpaediatricuseindicatorcodinglist.size()-1) {m.addMdcnlPrdctPaediatricUseIndicatorCdgSys("]");}


		 };
		/******************** medicinalproductproductclassification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductproductclassificationlist = medicinalproduct.getProductClassification();
		for(int medicinalproductproductclassificationi = 0; medicinalproductproductclassificationi<medicinalproductproductclassificationlist.size();medicinalproductproductclassificationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductproductclassification = medicinalproductproductclassificationlist.get(medicinalproductproductclassificationi);

		/******************** MdcnlPrdct_PrdctClsfctn_Txt ********************************************************************************/
		if(medicinalproductproductclassificationi == 0) {m.addMdcnlPrdctPrdctClsfctnTxt("[");}
		if(medicinalproductproductclassification.hasText()) {

			m.addMdcnlPrdctPrdctClsfctnTxt(String.valueOf(medicinalproductproductclassification.getText()));
		} else {
			m.addMdcnlPrdctPrdctClsfctnTxt("NULL");
		}

		if(medicinalproductproductclassificationi == medicinalproductproductclassificationlist.size()-1) {m.addMdcnlPrdctPrdctClsfctnTxt("]");}


		/******************** medicinalproductproductclassificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductproductclassificationcodinglist = medicinalproductproductclassification.getCoding();
		for(int medicinalproductproductclassificationcodingi = 0; medicinalproductproductclassificationcodingi<medicinalproductproductclassificationcodinglist.size();medicinalproductproductclassificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductproductclassificationcoding = medicinalproductproductclassificationcodinglist.get(medicinalproductproductclassificationcodingi);

		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductproductclassificationcodingi == 0) {m.addMdcnlPrdctPrdctClsfctnCdgDsply("[[");}
		if(medicinalproductproductclassificationcoding.hasDisplay()) {

			m.addMdcnlPrdctPrdctClsfctnCdgDsply(String.valueOf(medicinalproductproductclassificationcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPrdctClsfctnCdgDsply("NULL");
		}

		if(medicinalproductproductclassificationcodingi == medicinalproductproductclassificationcodinglist.size()-1) {m.addMdcnlPrdctPrdctClsfctnCdgDsply("]]");}


		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductproductclassificationcodingi == 0) {m.addMdcnlPrdctPrdctClsfctnCdgVrsn("[[");}
		if(medicinalproductproductclassificationcoding.hasVersion()) {

			m.addMdcnlPrdctPrdctClsfctnCdgVrsn(String.valueOf(medicinalproductproductclassificationcoding.getVersion()));
		} else {
			m.addMdcnlPrdctPrdctClsfctnCdgVrsn("NULL");
		}

		if(medicinalproductproductclassificationcodingi == medicinalproductproductclassificationcodinglist.size()-1) {m.addMdcnlPrdctPrdctClsfctnCdgVrsn("]]");}


		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductproductclassificationcodingi == 0) {m.addMdcnlPrdctPrdctClsfctnCdgCd("[[");}
		if(medicinalproductproductclassificationcoding.hasCode()) {

			m.addMdcnlPrdctPrdctClsfctnCdgCd(String.valueOf(medicinalproductproductclassificationcoding.getCode()));
		} else {
			m.addMdcnlPrdctPrdctClsfctnCdgCd("NULL");
		}

		if(medicinalproductproductclassificationcodingi == medicinalproductproductclassificationcodinglist.size()-1) {m.addMdcnlPrdctPrdctClsfctnCdgCd("]]");}


		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductproductclassificationcodingi == 0) {m.addMdcnlPrdctPrdctClsfctnCdgUsrSltd("[[");}
		if(medicinalproductproductclassificationcoding.hasUserSelected()) {

			m.addMdcnlPrdctPrdctClsfctnCdgUsrSltd(String.valueOf(medicinalproductproductclassificationcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPrdctClsfctnCdgUsrSltd("NULL");
		}

		if(medicinalproductproductclassificationcodingi == medicinalproductproductclassificationcodinglist.size()-1) {m.addMdcnlPrdctPrdctClsfctnCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductproductclassificationcodingi == 0) {m.addMdcnlPrdctPrdctClsfctnCdgSys("[[");}
		if(medicinalproductproductclassificationcoding.hasSystem()) {

			m.addMdcnlPrdctPrdctClsfctnCdgSys(String.valueOf(medicinalproductproductclassificationcoding.getSystem()));
		} else {
			m.addMdcnlPrdctPrdctClsfctnCdgSys("NULL");
		}

		if(medicinalproductproductclassificationcodingi == medicinalproductproductclassificationcodinglist.size()-1) {m.addMdcnlPrdctPrdctClsfctnCdgSys("]]");}


		 };
		 };
		/******************** medicinalproductcombinedpharmaceuticaldoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcombinedpharmaceuticaldoseform = medicinalproduct.getCombinedPharmaceuticalDoseForm();

		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Txt ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseform.hasText()) {

			m.addMdcnlPrdctCombinedPhrmctclDoseFrmTxt(String.valueOf(medicinalproductcombinedpharmaceuticaldoseform.getText()));
		} else {
			m.addMdcnlPrdctCombinedPhrmctclDoseFrmTxt("NULL");
		}


		/******************** medicinalproductcombinedpharmaceuticaldoseformcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcombinedpharmaceuticaldoseformcodinglist = medicinalproductcombinedpharmaceuticaldoseform.getCoding();
		for(int medicinalproductcombinedpharmaceuticaldoseformcodingi = 0; medicinalproductcombinedpharmaceuticaldoseformcodingi<medicinalproductcombinedpharmaceuticaldoseformcodinglist.size();medicinalproductcombinedpharmaceuticaldoseformcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcombinedpharmaceuticaldoseformcoding = medicinalproductcombinedpharmaceuticaldoseformcodinglist.get(medicinalproductcombinedpharmaceuticaldoseformcodingi);

		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == 0) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply("[");}
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasDisplay()) {

			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply("NULL");
		}

		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == medicinalproductcombinedpharmaceuticaldoseformcodinglist.size()-1) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply("]");}


		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == 0) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn("[");}
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasVersion()) {

			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getVersion()));
		} else {
			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn("NULL");
		}

		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == medicinalproductcombinedpharmaceuticaldoseformcodinglist.size()-1) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn("]");}


		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Cd ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == 0) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd("[");}
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasCode()) {

			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getCode()));
		} else {
			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd("NULL");
		}

		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == medicinalproductcombinedpharmaceuticaldoseformcodinglist.size()-1) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd("]");}


		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == 0) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd("[");}
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasUserSelected()) {

			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd("NULL");
		}

		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == medicinalproductcombinedpharmaceuticaldoseformcodinglist.size()-1) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd("]");}


		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Sys ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == 0) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys("[");}
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasSystem()) {

			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getSystem()));
		} else {
			m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys("NULL");
		}

		if(medicinalproductcombinedpharmaceuticaldoseformcodingi == medicinalproductcombinedpharmaceuticaldoseformcodinglist.size()-1) {m.addMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys("]");}


		 };
		/******************** MdcnlPrdct_PhrmctclPrdct ********************************************************************************/
		if(medicinalproduct.hasPharmaceuticalProduct()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproduct.getPharmaceuticalProduct().size(); incr++) {
				array = array + medicinalproduct.getPharmaceuticalProduct().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPhrmctclPrdct(array);

		} else {
			m.addMdcnlPrdctPhrmctclPrdct("NULL");
		}


		/******************** MdcnlPrdct_SpclMsrs ********************************************************************************/
		if(medicinalproduct.hasSpecialMeasures()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproduct.getSpecialMeasures().size(); incr++) {
				array = array + medicinalproduct.getSpecialMeasures().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctSpclMsrs(array);

		} else {
			m.addMdcnlPrdctSpclMsrs("NULL");
		}


		/******************** MdcnlPrdct_MasterFile ********************************************************************************/
		if(medicinalproduct.hasMasterFile()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproduct.getMasterFile().size(); incr++) {
				array = array + medicinalproduct.getMasterFile().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctMasterFile(array);

		} else {
			m.addMdcnlPrdctMasterFile("NULL");
		}


		/******************** MdcnlPrdct_ClnclTrial ********************************************************************************/
		if(medicinalproduct.hasClinicalTrial()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproduct.getClinicalTrial().size(); incr++) {
				array = array + medicinalproduct.getClinicalTrial().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctClnclTrial(array);

		} else {
			m.addMdcnlPrdctClnclTrial("NULL");
		}


		/******************** medicinalproductcrossreference ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductcrossreferencelist = medicinalproduct.getCrossReference();
		for(int medicinalproductcrossreferencei = 0; medicinalproductcrossreferencei<medicinalproductcrossreferencelist.size();medicinalproductcrossreferencei++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductcrossreference = medicinalproductcrossreferencelist.get(medicinalproductcrossreferencei);

		/******************** MdcnlPrdct_CrossRfrnc_Vl ********************************************************************************/
		if(medicinalproductcrossreferencei == 0) {m.addMdcnlPrdctCrossRfrncVl("[");}
		if(medicinalproductcrossreference.hasValue()) {

			m.addMdcnlPrdctCrossRfrncVl(String.valueOf(medicinalproductcrossreference.getValue()));
		} else {
			m.addMdcnlPrdctCrossRfrncVl("NULL");
		}

		if(medicinalproductcrossreferencei == medicinalproductcrossreferencelist.size()-1) {m.addMdcnlPrdctCrossRfrncVl("]");}


		/******************** medicinalproductcrossreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcrossreferencetype = medicinalproductcrossreference.getType();

		/******************** MdcnlPrdct_CrossRfrnc_Typ_Txt ********************************************************************************/
		if(medicinalproductcrossreferencei == 0) {m.addMdcnlPrdctCrossRfrncTypTxt("[");}
		if(medicinalproductcrossreferencetype.hasText()) {

			m.addMdcnlPrdctCrossRfrncTypTxt(String.valueOf(medicinalproductcrossreferencetype.getText()));
		} else {
			m.addMdcnlPrdctCrossRfrncTypTxt("NULL");
		}

		if(medicinalproductcrossreferencei == medicinalproductcrossreferencelist.size()-1) {m.addMdcnlPrdctCrossRfrncTypTxt("]");}


		/******************** medicinalproductcrossreferencetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductcrossreferencetypecodinglist = medicinalproductcrossreferencetype.getCoding();
		for(int medicinalproductcrossreferencetypecodingi = 0; medicinalproductcrossreferencetypecodingi<medicinalproductcrossreferencetypecodinglist.size();medicinalproductcrossreferencetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductcrossreferencetypecoding = medicinalproductcrossreferencetypecodinglist.get(medicinalproductcrossreferencetypecodingi);

		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcrossreferencetypecodingi == 0) {m.addMdcnlPrdctCrossRfrncTypCdgDsply("[[");}
		if(medicinalproductcrossreferencetypecoding.hasDisplay()) {

			m.addMdcnlPrdctCrossRfrncTypCdgDsply(String.valueOf(medicinalproductcrossreferencetypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctCrossRfrncTypCdgDsply("NULL");
		}

		if(medicinalproductcrossreferencetypecodingi == medicinalproductcrossreferencetypecodinglist.size()-1) {m.addMdcnlPrdctCrossRfrncTypCdgDsply("]]");}


		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcrossreferencetypecodingi == 0) {m.addMdcnlPrdctCrossRfrncTypCdgVrsn("[[");}
		if(medicinalproductcrossreferencetypecoding.hasVersion()) {

			m.addMdcnlPrdctCrossRfrncTypCdgVrsn(String.valueOf(medicinalproductcrossreferencetypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctCrossRfrncTypCdgVrsn("NULL");
		}

		if(medicinalproductcrossreferencetypecodingi == medicinalproductcrossreferencetypecodinglist.size()-1) {m.addMdcnlPrdctCrossRfrncTypCdgVrsn("]]");}


		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductcrossreferencetypecodingi == 0) {m.addMdcnlPrdctCrossRfrncTypCdgCd("[[");}
		if(medicinalproductcrossreferencetypecoding.hasCode()) {

			m.addMdcnlPrdctCrossRfrncTypCdgCd(String.valueOf(medicinalproductcrossreferencetypecoding.getCode()));
		} else {
			m.addMdcnlPrdctCrossRfrncTypCdgCd("NULL");
		}

		if(medicinalproductcrossreferencetypecodingi == medicinalproductcrossreferencetypecodinglist.size()-1) {m.addMdcnlPrdctCrossRfrncTypCdgCd("]]");}


		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcrossreferencetypecodingi == 0) {m.addMdcnlPrdctCrossRfrncTypCdgUsrSltd("[[");}
		if(medicinalproductcrossreferencetypecoding.hasUserSelected()) {

			m.addMdcnlPrdctCrossRfrncTypCdgUsrSltd(String.valueOf(medicinalproductcrossreferencetypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctCrossRfrncTypCdgUsrSltd("NULL");
		}

		if(medicinalproductcrossreferencetypecodingi == medicinalproductcrossreferencetypecodinglist.size()-1) {m.addMdcnlPrdctCrossRfrncTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductcrossreferencetypecodingi == 0) {m.addMdcnlPrdctCrossRfrncTypCdgSys("[[");}
		if(medicinalproductcrossreferencetypecoding.hasSystem()) {

			m.addMdcnlPrdctCrossRfrncTypCdgSys(String.valueOf(medicinalproductcrossreferencetypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctCrossRfrncTypCdgSys("NULL");
		}

		if(medicinalproductcrossreferencetypecodingi == medicinalproductcrossreferencetypecodinglist.size()-1) {m.addMdcnlPrdctCrossRfrncTypCdgSys("]]");}


		 };
		/******************** medicinalproductcrossreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductcrossreferenceperiod = medicinalproductcrossreference.getPeriod();

		/******************** MdcnlPrdct_CrossRfrnc_Prd_Strt ********************************************************************************/
		if(medicinalproductcrossreferencei == 0) {m.addMdcnlPrdctCrossRfrncPrdStrt("[");}
		if(medicinalproductcrossreferenceperiod.hasStart()) {

			m.addMdcnlPrdctCrossRfrncPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductcrossreferenceperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctCrossRfrncPrdStrt("NULL");
		}

		if(medicinalproductcrossreferencei == medicinalproductcrossreferencelist.size()-1) {m.addMdcnlPrdctCrossRfrncPrdStrt("]");}


		/******************** MdcnlPrdct_CrossRfrnc_Prd_End ********************************************************************************/
		if(medicinalproductcrossreferencei == 0) {m.addMdcnlPrdctCrossRfrncPrdEnd("[");}
		if(medicinalproductcrossreferenceperiod.hasEnd()) {

			m.addMdcnlPrdctCrossRfrncPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductcrossreferenceperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctCrossRfrncPrdEnd("NULL");
		}

		if(medicinalproductcrossreferencei == medicinalproductcrossreferencelist.size()-1) {m.addMdcnlPrdctCrossRfrncPrdEnd("]");}


		/******************** medicinalproductcrossreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductcrossreferenceuse = medicinalproductcrossreference.getUse();
		if(medicinalproductcrossreferenceuse!=null) {
		if(medicinalproductcrossreferencei == 0) {

		m.addMdcnlPrdctCrossRfrncUse("[");		}
			m.addMdcnlPrdctCrossRfrncUse(medicinalproductcrossreferenceuse.toCode());
		if(medicinalproductcrossreferencei == medicinalproductcrossreferencelist.size()-1) {

		m.addMdcnlPrdctCrossRfrncUse("]");		}

		} else {
			m.addMdcnlPrdctCrossRfrncUse("NULL");
		}

		/******************** MdcnlPrdct_CrossRfrnc_Assigner ********************************************************************************/
		if(medicinalproductcrossreferencei == 0) {m.addMdcnlPrdctCrossRfrncAssigner("[");}
		if(medicinalproductcrossreference.hasAssigner()) {

			if(medicinalproductcrossreference.getAssigner().getReference() != null) {
			m.addMdcnlPrdctCrossRfrncAssigner(medicinalproductcrossreference.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctCrossRfrncAssigner("NULL");
		}

		if(medicinalproductcrossreferencei == medicinalproductcrossreferencelist.size()-1) {m.addMdcnlPrdctCrossRfrncAssigner("]");}


		/******************** MdcnlPrdct_CrossRfrnc_Sys ********************************************************************************/
		if(medicinalproductcrossreferencei == 0) {m.addMdcnlPrdctCrossRfrncSys("[");}
		if(medicinalproductcrossreference.hasSystem()) {

			m.addMdcnlPrdctCrossRfrncSys(String.valueOf(medicinalproductcrossreference.getSystem()));
		} else {
			m.addMdcnlPrdctCrossRfrncSys("NULL");
		}

		if(medicinalproductcrossreferencei == medicinalproductcrossreferencelist.size()-1) {m.addMdcnlPrdctCrossRfrncSys("]");}


		 };
		return m;
	}
}
