package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPackaged;
public class MedicinalProductPackagedBidirectionalConversion 
{
	public MedicinalProductPackaged MedicinalProductPackageds(org.hl7.fhir.r4.model.MedicinalProductPackaged medicinalproductpackaged) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductPackaged m = new  main.java.com.campfhir.model.MedicinalProductPackaged();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductpackaged.getIdElement().getIdPart());

		/******************** medicinalproductpackagedpackageitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent> medicinalproductpackagedpackageitemlist = medicinalproductpackaged.getPackageItem();
		for(int medicinalproductpackagedpackageitemi = 0; medicinalproductpackagedpackageitemi<medicinalproductpackagedpackageitemlist.size();medicinalproductpackagedpackageitemi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent  medicinalproductpackagedpackageitem = medicinalproductpackagedpackageitemlist.get(medicinalproductpackagedpackageitemi);

		/******************** medicinalproductpackagedpackageitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemtype = medicinalproductpackagedpackageitem.getType();

		/******************** MdcnlPrdctPckged_PckgItm_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemi == 0) {m.addMdcnlPrdctPckgedPckgItmTypTxt("[");}
		if(medicinalproductpackagedpackageitemtype.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmTypTxt(String.valueOf(medicinalproductpackagedpackageitemtype.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmTypTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemi == medicinalproductpackagedpackageitemlist.size()-1) {m.addMdcnlPrdctPckgedPckgItmTypTxt("]");}


		/******************** medicinalproductpackagedpackageitemtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemtypecodinglist = medicinalproductpackagedpackageitemtype.getCoding();
		for(int medicinalproductpackagedpackageitemtypecodingi = 0; medicinalproductpackagedpackageitemtypecodingi<medicinalproductpackagedpackageitemtypecodinglist.size();medicinalproductpackagedpackageitemtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemtypecoding = medicinalproductpackagedpackageitemtypecodinglist.get(medicinalproductpackagedpackageitemtypecodingi);

		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmTypCdgDsply("[[");}
		if(medicinalproductpackagedpackageitemtypecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmTypCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemtypecodingi == medicinalproductpackagedpackageitemtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmTypCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmTypCdgVrsn("[[");}
		if(medicinalproductpackagedpackageitemtypecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmTypCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemtypecodingi == medicinalproductpackagedpackageitemtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmTypCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmTypCdgCd("[[");}
		if(medicinalproductpackagedpackageitemtypecoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmTypCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemtypecodingi == medicinalproductpackagedpackageitemtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmTypCdgCd("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmTypCdgUsrSltd("[[");}
		if(medicinalproductpackagedpackageitemtypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemtypecodingi == medicinalproductpackagedpackageitemtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmTypCdgSys("[[");}
		if(medicinalproductpackagedpackageitemtypecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmTypCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemtypecodingi == medicinalproductpackagedpackageitemtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmTypCdgSys("]]");}


		 };
		/******************** medicinalproductpackagedpackageitemidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductpackagedpackageitemidentifierlist = medicinalproductpackagedpackageitem.getIdentifier();
		for(int medicinalproductpackagedpackageitemidentifieri = 0; medicinalproductpackagedpackageitemidentifieri<medicinalproductpackagedpackageitemidentifierlist.size();medicinalproductpackagedpackageitemidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductpackagedpackageitemidentifier = medicinalproductpackagedpackageitemidentifierlist.get(medicinalproductpackagedpackageitemidentifieri);

		/******************** MdcnlPrdctPckged_PckgItm_Id_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifieri == 0) {m.addMdcnlPrdctPckgedPckgItmIdVl("[[");}
		if(medicinalproductpackagedpackageitemidentifier.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmIdVl(String.valueOf(medicinalproductpackagedpackageitemidentifier.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdVl("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifieri == medicinalproductpackagedpackageitemidentifierlist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdVl("]]");}


		/******************** medicinalproductpackagedpackageitemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemidentifiertype = medicinalproductpackagedpackageitemidentifier.getType();

		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifieri == 0) {m.addMdcnlPrdctPckgedPckgItmIdTypTxt("[[");}
		if(medicinalproductpackagedpackageitemidentifiertype.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmIdTypTxt(String.valueOf(medicinalproductpackagedpackageitemidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdTypTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifieri == medicinalproductpackagedpackageitemidentifierlist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdTypTxt("]]");}


		/******************** medicinalproductpackagedpackageitemidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemidentifiertypecodinglist = medicinalproductpackagedpackageitemidentifiertype.getCoding();
		for(int medicinalproductpackagedpackageitemidentifiertypecodingi = 0; medicinalproductpackagedpackageitemidentifiertypecodingi<medicinalproductpackagedpackageitemidentifiertypecodinglist.size();medicinalproductpackagedpackageitemidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemidentifiertypecoding = medicinalproductpackagedpackageitemidentifiertypecodinglist.get(medicinalproductpackagedpackageitemidentifiertypecodingi);

		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgDsply("[[[");}
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmIdTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdTypCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifiertypecodingi == medicinalproductpackagedpackageitemidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgDsply("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgVrsn("[[[");}
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmIdTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdTypCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifiertypecodingi == medicinalproductpackagedpackageitemidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgVrsn("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgCd("[[[");}
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmIdTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdTypCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifiertypecodingi == medicinalproductpackagedpackageitemidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgCd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd("[[[");}
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifiertypecodingi == medicinalproductpackagedpackageitemidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgSys("[[[");}
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmIdTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdTypCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifiertypecodingi == medicinalproductpackagedpackageitemidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdTypCdgSys("]]]");}


		 };
		/******************** medicinalproductpackagedpackageitemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedpackageitemidentifierperiod = medicinalproductpackagedpackageitemidentifier.getPeriod();

		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifieri == 0) {m.addMdcnlPrdctPckgedPckgItmIdPrdStrt("[[");}
		if(medicinalproductpackagedpackageitemidentifierperiod.hasStart()) {

			m.addMdcnlPrdctPckgedPckgItmIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedpackageitemidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdPrdStrt("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifieri == medicinalproductpackagedpackageitemidentifierlist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdPrdStrt("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_End ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifieri == 0) {m.addMdcnlPrdctPckgedPckgItmIdPrdEnd("[[");}
		if(medicinalproductpackagedpackageitemidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctPckgedPckgItmIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedpackageitemidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdPrdEnd("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifieri == medicinalproductpackagedpackageitemidentifierlist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdPrdEnd("]]");}


		/******************** medicinalproductpackagedpackageitemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedpackageitemidentifieruse = medicinalproductpackagedpackageitemidentifier.getUse();
		if(medicinalproductpackagedpackageitemidentifieruse!=null) {
		if(medicinalproductpackagedpackageitemidentifieri == 0) {

		m.addMdcnlPrdctPckgedPckgItmIdUse("[[");		}
			m.addMdcnlPrdctPckgedPckgItmIdUse(medicinalproductpackagedpackageitemidentifieruse.toCode());
		if(medicinalproductpackagedpackageitemidentifieri == medicinalproductpackagedpackageitemidentifierlist.size()-1) {

		m.addMdcnlPrdctPckgedPckgItmIdUse("]]");		}

		} else {
			m.addMdcnlPrdctPckgedPckgItmIdUse("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_Id_Assigner ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifieri == 0) {m.addMdcnlPrdctPckgedPckgItmIdAssigner("[[");}
		if(medicinalproductpackagedpackageitemidentifier.hasAssigner()) {

			if(medicinalproductpackagedpackageitemidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctPckgedPckgItmIdAssigner(medicinalproductpackagedpackageitemidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdAssigner("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifieri == medicinalproductpackagedpackageitemidentifierlist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdAssigner("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Id_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifieri == 0) {m.addMdcnlPrdctPckgedPckgItmIdSys("[[");}
		if(medicinalproductpackagedpackageitemidentifier.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmIdSys(String.valueOf(medicinalproductpackagedpackageitemidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmIdSys("NULL");
		}

		if(medicinalproductpackagedpackageitemidentifieri == medicinalproductpackagedpackageitemidentifierlist.size()-1) {m.addMdcnlPrdctPckgedPckgItmIdSys("]]");}


		 };
		/******************** medicinalproductpackagedpackageitemmaterial ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductpackagedpackageitemmateriallist = medicinalproductpackagedpackageitem.getMaterial();
		for(int medicinalproductpackagedpackageitemmateriali = 0; medicinalproductpackagedpackageitemmateriali<medicinalproductpackagedpackageitemmateriallist.size();medicinalproductpackagedpackageitemmateriali++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductpackagedpackageitemmaterial = medicinalproductpackagedpackageitemmateriallist.get(medicinalproductpackagedpackageitemmateriali);

		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemmateriali == 0) {m.addMdcnlPrdctPckgedPckgItmMtrlTxt("[[");}
		if(medicinalproductpackagedpackageitemmaterial.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmMtrlTxt(String.valueOf(medicinalproductpackagedpackageitemmaterial.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmMtrlTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemmateriali == medicinalproductpackagedpackageitemmateriallist.size()-1) {m.addMdcnlPrdctPckgedPckgItmMtrlTxt("]]");}


		/******************** medicinalproductpackagedpackageitemmaterialcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemmaterialcodinglist = medicinalproductpackagedpackageitemmaterial.getCoding();
		for(int medicinalproductpackagedpackageitemmaterialcodingi = 0; medicinalproductpackagedpackageitemmaterialcodingi<medicinalproductpackagedpackageitemmaterialcodinglist.size();medicinalproductpackagedpackageitemmaterialcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemmaterialcoding = medicinalproductpackagedpackageitemmaterialcodinglist.get(medicinalproductpackagedpackageitemmaterialcodingi);

		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgDsply("[[[");}
		if(medicinalproductpackagedpackageitemmaterialcoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmMtrlCdgDsply(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmMtrlCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemmaterialcodingi == medicinalproductpackagedpackageitemmaterialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgDsply("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgVrsn("[[[");}
		if(medicinalproductpackagedpackageitemmaterialcoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmMtrlCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmMtrlCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemmaterialcodingi == medicinalproductpackagedpackageitemmaterialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgVrsn("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgCd("[[[");}
		if(medicinalproductpackagedpackageitemmaterialcoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmMtrlCdgCd(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmMtrlCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemmaterialcodingi == medicinalproductpackagedpackageitemmaterialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgCd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd("[[[");}
		if(medicinalproductpackagedpackageitemmaterialcoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemmaterialcodingi == medicinalproductpackagedpackageitemmaterialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgSys("[[[");}
		if(medicinalproductpackagedpackageitemmaterialcoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmMtrlCdgSys(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmMtrlCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemmaterialcodingi == medicinalproductpackagedpackageitemmaterialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmMtrlCdgSys("]]]");}


		 };
		 };
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic medicinalproductpackagedpackageitemphysicalcharacteristics = medicinalproductpackagedpackageitem.getPhysicalCharacteristics();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Shape ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristics.hasShape()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsShape(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristics.getShape()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsShape("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsimage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist = medicinalproductpackagedpackageitemphysicalcharacteristics.getImage();
		for(int medicinalproductpackagedpackageitemphysicalcharacteristicsimagei = 0; medicinalproductpackagedpackageitemphysicalcharacteristicsimagei<medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size();medicinalproductpackagedpackageitemphysicalcharacteristicsimagei++ ) {
		org.hl7.fhir.r4.model.Attachment  medicinalproductpackagedpackageitemphysicalcharacteristicsimage = medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.get(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasSize()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getSize()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasLanguage()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getLanguage()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasContentType()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getContentType()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasHash()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash(new String(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getHash()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasData()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData(new String(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getData()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasCreation()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getCreation())+"\"");
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasTitle()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getTitle()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasUrl()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getUrl()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimagei == medicinalproductpackagedpackageitemphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl("]]");}


		 };
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsheight = medicinalproductpackagedpackageitemphysicalcharacteristics.getHeight();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightVl("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getComparator();
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator!=null) {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator.toCode());
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCd("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightUnt("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightSys("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicswidth = medicinalproductpackagedpackageitemphysicalcharacteristics.getWidth();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthVl("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getComparator();
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator!=null) {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator.toCode());
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCd("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthUnt("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthSys("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Color ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristics.hasColor()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpackagedpackageitemphysicalcharacteristics.getColor().size(); incr++) {
				array = array + medicinalproductpackagedpackageitemphysicalcharacteristics.getColor().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsColor(array);

		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsColor("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter = medicinalproductpackagedpackageitemphysicalcharacteristics.getExternalDiameter();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterVl("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getComparator();
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator!=null) {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator.toCode());
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCd("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterUnt("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterSys("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemphysicalcharacteristicsscoring = medicinalproductpackagedpackageitemphysicalcharacteristics.getScoring();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringTxt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringTxt("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist = medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.getCoding();
		for(int medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi = 0; medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi<medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist.size();medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding = medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist.get(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi);

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys("[[");}
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodingi == medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys("]]");}


		 };
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsdepth = medicinalproductpackagedpackageitemphysicalcharacteristics.getDepth();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthVl("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getComparator();
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator!=null) {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator.toCode());
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCd("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthUnt("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthSys("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsweight = medicinalproductpackagedpackageitemphysicalcharacteristics.getWeight();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtVl("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getComparator();
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator!=null) {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator.toCode());
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCd("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtUnt("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtSys("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume = medicinalproductpackagedpackageitemphysicalcharacteristics.getNominalVolume();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeVl("NULL");
		}


		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getComparator();
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator!=null) {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator.toCode());
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCd("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeUnt("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeSys("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristics.hasImprint()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpackagedpackageitemphysicalcharacteristics.getImprint().size(); incr++) {
				array = array + medicinalproductpackagedpackageitemphysicalcharacteristics.getImprint().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImprint(array);

		} else {
			m.addMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImprint("NULL");
		}


		/******************** medicinalproductpackagedpackageitemothercharacteristics ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductpackagedpackageitemothercharacteristicslist = medicinalproductpackagedpackageitem.getOtherCharacteristics();
		for(int medicinalproductpackagedpackageitemothercharacteristicsi = 0; medicinalproductpackagedpackageitemothercharacteristicsi<medicinalproductpackagedpackageitemothercharacteristicslist.size();medicinalproductpackagedpackageitemothercharacteristicsi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductpackagedpackageitemothercharacteristics = medicinalproductpackagedpackageitemothercharacteristicslist.get(medicinalproductpackagedpackageitemothercharacteristicsi);

		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicsi == 0) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt("[[");}
		if(medicinalproductpackagedpackageitemothercharacteristics.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt(String.valueOf(medicinalproductpackagedpackageitemothercharacteristics.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemothercharacteristicsi == medicinalproductpackagedpackageitemothercharacteristicslist.size()-1) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt("]]");}


		/******************** medicinalproductpackagedpackageitemothercharacteristicscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemothercharacteristicscodinglist = medicinalproductpackagedpackageitemothercharacteristics.getCoding();
		for(int medicinalproductpackagedpackageitemothercharacteristicscodingi = 0; medicinalproductpackagedpackageitemothercharacteristicscodingi<medicinalproductpackagedpackageitemothercharacteristicscodinglist.size();medicinalproductpackagedpackageitemothercharacteristicscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemothercharacteristicscoding = medicinalproductpackagedpackageitemothercharacteristicscodinglist.get(medicinalproductpackagedpackageitemothercharacteristicscodingi);

		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == 0) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply("[[[");}
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == medicinalproductpackagedpackageitemothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == 0) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn("[[[");}
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == medicinalproductpackagedpackageitemothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == 0) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd("[[[");}
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == medicinalproductpackagedpackageitemothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == 0) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd("[[[");}
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == medicinalproductpackagedpackageitemothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == 0) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys("[[[");}
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemothercharacteristicscodingi == medicinalproductpackagedpackageitemothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys("]]]");}


		 };
		 };
		/******************** medicinalproductpackagedpackageitemshelflifestorage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ProductShelfLife> medicinalproductpackagedpackageitemshelflifestoragelist = medicinalproductpackagedpackageitem.getShelfLifeStorage();
		for(int medicinalproductpackagedpackageitemshelflifestoragei = 0; medicinalproductpackagedpackageitemshelflifestoragei<medicinalproductpackagedpackageitemshelflifestoragelist.size();medicinalproductpackagedpackageitemshelflifestoragei++ ) {
		org.hl7.fhir.r4.model.ProductShelfLife  medicinalproductpackagedpackageitemshelflifestorage = medicinalproductpackagedpackageitemshelflifestoragelist.get(medicinalproductpackagedpackageitemshelflifestoragei);

		/******************** medicinalproductpackagedpackageitemshelflifestoragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestoragetype = medicinalproductpackagedpackageitemshelflifestorage.getType();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt("[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragetype.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetype.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt("]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestoragetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemshelflifestoragetypecodinglist = medicinalproductpackagedpackageitemshelflifestoragetype.getCoding();
		for(int medicinalproductpackagedpackageitemshelflifestoragetypecodingi = 0; medicinalproductpackagedpackageitemshelflifestoragetypecodingi<medicinalproductpackagedpackageitemshelflifestoragetypecodinglist.size();medicinalproductpackagedpackageitemshelflifestoragetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemshelflifestoragetypecoding = medicinalproductpackagedpackageitemshelflifestoragetypecodinglist.get(medicinalproductpackagedpackageitemshelflifestoragetypecodingi);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == medicinalproductpackagedpackageitemshelflifestoragetypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == medicinalproductpackagedpackageitemshelflifestoragetypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == medicinalproductpackagedpackageitemshelflifestoragetypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == medicinalproductpackagedpackageitemshelflifestoragetypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragetypecodingi == medicinalproductpackagedpackageitemshelflifestoragetypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys("]]]");}


		 };
		/******************** medicinalproductpackagedpackageitemshelflifestorageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemshelflifestorageperiod = medicinalproductpackagedpackageitemshelflifestorage.getPeriod();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl("]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestorageperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemshelflifestorageperiodcomparator = medicinalproductpackagedpackageitemshelflifestorageperiod.getComparator();
		if(medicinalproductpackagedpackageitemshelflifestorageperiodcomparator!=null) {
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {

		m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr("[[");		}
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr(medicinalproductpackagedpackageitemshelflifestorageperiodcomparator.toCode());
		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {

		m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr("]]");		}

		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys("]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedpackageitemshelflifestorageidentifier = medicinalproductpackagedpackageitemshelflifestorage.getIdentifier();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifier.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifier.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl("]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestorageidentifiertype = medicinalproductpackagedpackageitemshelflifestorageidentifier.getType();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertype.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt("]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist = medicinalproductpackagedpackageitemshelflifestorageidentifiertype.getCoding();
		for(int medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi = 0; medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi<medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist.size();medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding = medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist.get(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodingi == medicinalproductpackagedpackageitemshelflifestorageidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys("]]]");}


		 };
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedpackageitemshelflifestorageidentifierperiod = medicinalproductpackagedpackageitemshelflifestorageidentifier.getPeriod();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.hasStart()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd("]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedpackageitemshelflifestorageidentifieruse = medicinalproductpackagedpackageitemshelflifestorageidentifier.getUse();
		if(medicinalproductpackagedpackageitemshelflifestorageidentifieruse!=null) {
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {

		m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse("[[");		}
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse(medicinalproductpackagedpackageitemshelflifestorageidentifieruse.toCode());
		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {

		m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse("]]");		}

		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifier.hasAssigner()) {

			if(medicinalproductpackagedpackageitemshelflifestorageidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner(medicinalproductpackagedpackageitemshelflifestorageidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner("]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys("[[");}
		if(medicinalproductpackagedpackageitemshelflifestorageidentifier.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragei == medicinalproductpackagedpackageitemshelflifestoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys("]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragelist = medicinalproductpackagedpackageitemshelflifestorage.getSpecialPrecautionsForStorage();
		for(int medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragei = 0; medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragei<medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragelist.size();medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage = medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragelist.get(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragei);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragei == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt("[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragei == medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragelist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt("]]]");}


		/******************** medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist = medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.getCoding();
		for(int medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi = 0; medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi<medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist.size();medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding = medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist.get(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi);

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply("[[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply("]]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn("[[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn("]]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd("[[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd("]]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd("[[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd("]]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == 0) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys("[[[[");}
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodingi == medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys("]]]]");}


		 };
		 };
		 };
		/******************** medicinalproductpackagedpackageitemalternatematerial ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductpackagedpackageitemalternatemateriallist = medicinalproductpackagedpackageitem.getAlternateMaterial();
		for(int medicinalproductpackagedpackageitemalternatemateriali = 0; medicinalproductpackagedpackageitemalternatemateriali<medicinalproductpackagedpackageitemalternatemateriallist.size();medicinalproductpackagedpackageitemalternatemateriali++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductpackagedpackageitemalternatematerial = medicinalproductpackagedpackageitemalternatemateriallist.get(medicinalproductpackagedpackageitemalternatemateriali);

		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatemateriali == 0) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlTxt("[[");}
		if(medicinalproductpackagedpackageitemalternatematerial.hasText()) {

			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlTxt(String.valueOf(medicinalproductpackagedpackageitemalternatematerial.getText()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlTxt("NULL");
		}

		if(medicinalproductpackagedpackageitemalternatemateriali == medicinalproductpackagedpackageitemalternatemateriallist.size()-1) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlTxt("]]");}


		/******************** medicinalproductpackagedpackageitemalternatematerialcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedpackageitemalternatematerialcodinglist = medicinalproductpackagedpackageitemalternatematerial.getCoding();
		for(int medicinalproductpackagedpackageitemalternatematerialcodingi = 0; medicinalproductpackagedpackageitemalternatematerialcodingi<medicinalproductpackagedpackageitemalternatematerialcodinglist.size();medicinalproductpackagedpackageitemalternatematerialcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedpackageitemalternatematerialcoding = medicinalproductpackagedpackageitemalternatematerialcodinglist.get(medicinalproductpackagedpackageitemalternatematerialcodingi);

		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply("[[[");}
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply("NULL");
		}

		if(medicinalproductpackagedpackageitemalternatematerialcodingi == medicinalproductpackagedpackageitemalternatematerialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn("[[[");}
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasVersion()) {

			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn("NULL");
		}

		if(medicinalproductpackagedpackageitemalternatematerialcodingi == medicinalproductpackagedpackageitemalternatematerialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd("[[[");}
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd("NULL");
		}

		if(medicinalproductpackagedpackageitemalternatematerialcodingi == medicinalproductpackagedpackageitemalternatematerialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd("[[[");}
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedpackageitemalternatematerialcodingi == medicinalproductpackagedpackageitemalternatematerialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcodingi == 0) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys("[[[");}
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys("NULL");
		}

		if(medicinalproductpackagedpackageitemalternatematerialcodingi == medicinalproductpackagedpackageitemalternatematerialcodinglist.size()-1) {m.addMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys("]]]");}


		 };
		 };
		/******************** MdcnlPrdctPckged_PckgItm_MnfctredItm ********************************************************************************/
		if(medicinalproductpackagedpackageitem.hasManufacturedItem()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpackagedpackageitem.getManufacturedItem().size(); incr++) {
				array = array + medicinalproductpackagedpackageitem.getManufacturedItem().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedPckgItmMnfctredItm(array);

		} else {
			m.addMdcnlPrdctPckgedPckgItmMnfctredItm("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_Dvc ********************************************************************************/
		if(medicinalproductpackagedpackageitem.hasDevice()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpackagedpackageitem.getDevice().size(); incr++) {
				array = array + medicinalproductpackagedpackageitem.getDevice().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedPckgItmDvc(array);

		} else {
			m.addMdcnlPrdctPckgedPckgItmDvc("NULL");
		}


		/******************** medicinalproductpackagedpackageitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemquantity = medicinalproductpackagedpackageitem.getQuantity();

		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasValue()) {

			m.addMdcnlPrdctPckgedPckgItmQntyVl(String.valueOf(medicinalproductpackagedpackageitemquantity.getValue()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmQntyVl("NULL");
		}


		/******************** medicinalproductpackagedpackageitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemquantitycomparator = medicinalproductpackagedpackageitemquantity.getComparator();
		if(medicinalproductpackagedpackageitemquantitycomparator!=null) {
			m.addMdcnlPrdctPckgedPckgItmQntyCmprtr(medicinalproductpackagedpackageitemquantitycomparator.toCode());
		} else {
			m.addMdcnlPrdctPckgedPckgItmQntyCmprtr("NULL");
		}

		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasCode()) {

			m.addMdcnlPrdctPckgedPckgItmQntyCd(String.valueOf(medicinalproductpackagedpackageitemquantity.getCode()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmQntyCd("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasUnit()) {

			m.addMdcnlPrdctPckgedPckgItmQntyUnt(String.valueOf(medicinalproductpackagedpackageitemquantity.getUnit()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmQntyUnt("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasSystem()) {

			m.addMdcnlPrdctPckgedPckgItmQntySys(String.valueOf(medicinalproductpackagedpackageitemquantity.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedPckgItmQntySys("NULL");
		}


		/******************** MdcnlPrdctPckged_PckgItm_Manufacturer ********************************************************************************/
		if(medicinalproductpackagedpackageitem.hasManufacturer()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpackagedpackageitem.getManufacturer().size(); incr++) {
				array = array + medicinalproductpackagedpackageitem.getManufacturer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedPckgItmManufacturer(array);

		} else {
			m.addMdcnlPrdctPckgedPckgItmManufacturer("NULL");
		}


		 };
		/******************** MdcnlPrdctPckged_Sbjct ********************************************************************************/
		if(medicinalproductpackaged.hasSubject()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpackaged.getSubject().size(); incr++) {
				array = array + medicinalproductpackaged.getSubject().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedSbjct(array);

		} else {
			m.addMdcnlPrdctPckgedSbjct("NULL");
		}


		/******************** MdcnlPrdctPckged_Dscrptn ********************************************************************************/
		if(medicinalproductpackaged.hasDescription()) {

			m.addMdcnlPrdctPckgedDscrptn(String.valueOf(medicinalproductpackaged.getDescription()));
		} else {
			m.addMdcnlPrdctPckgedDscrptn("NULL");
		}


		/******************** medicinalproductpackagedidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductpackagedidentifierlist = medicinalproductpackaged.getIdentifier();
		for(int medicinalproductpackagedidentifieri = 0; medicinalproductpackagedidentifieri<medicinalproductpackagedidentifierlist.size();medicinalproductpackagedidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductpackagedidentifier = medicinalproductpackagedidentifierlist.get(medicinalproductpackagedidentifieri);

		/******************** MdcnlPrdctPckged_Id_Vl ********************************************************************************/
		if(medicinalproductpackagedidentifieri == 0) {m.addMdcnlPrdctPckgedIdVl("[");}
		if(medicinalproductpackagedidentifier.hasValue()) {

			m.addMdcnlPrdctPckgedIdVl(String.valueOf(medicinalproductpackagedidentifier.getValue()));
		} else {
			m.addMdcnlPrdctPckgedIdVl("NULL");
		}

		if(medicinalproductpackagedidentifieri == medicinalproductpackagedidentifierlist.size()-1) {m.addMdcnlPrdctPckgedIdVl("]");}


		/******************** medicinalproductpackagedidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedidentifiertype = medicinalproductpackagedidentifier.getType();

		/******************** MdcnlPrdctPckged_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedidentifieri == 0) {m.addMdcnlPrdctPckgedIdTypTxt("[");}
		if(medicinalproductpackagedidentifiertype.hasText()) {

			m.addMdcnlPrdctPckgedIdTypTxt(String.valueOf(medicinalproductpackagedidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctPckgedIdTypTxt("NULL");
		}

		if(medicinalproductpackagedidentifieri == medicinalproductpackagedidentifierlist.size()-1) {m.addMdcnlPrdctPckgedIdTypTxt("]");}


		/******************** medicinalproductpackagedidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedidentifiertypecodinglist = medicinalproductpackagedidentifiertype.getCoding();
		for(int medicinalproductpackagedidentifiertypecodingi = 0; medicinalproductpackagedidentifiertypecodingi<medicinalproductpackagedidentifiertypecodinglist.size();medicinalproductpackagedidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedidentifiertypecoding = medicinalproductpackagedidentifiertypecodinglist.get(medicinalproductpackagedidentifiertypecodingi);

		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedIdTypCdgDsply("[[");}
		if(medicinalproductpackagedidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedIdTypCdgDsply(String.valueOf(medicinalproductpackagedidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedIdTypCdgDsply("NULL");
		}

		if(medicinalproductpackagedidentifiertypecodingi == medicinalproductpackagedidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedIdTypCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedIdTypCdgVrsn("[[");}
		if(medicinalproductpackagedidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedIdTypCdgVrsn(String.valueOf(medicinalproductpackagedidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedIdTypCdgVrsn("NULL");
		}

		if(medicinalproductpackagedidentifiertypecodingi == medicinalproductpackagedidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedIdTypCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedIdTypCdgCd("[[");}
		if(medicinalproductpackagedidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctPckgedIdTypCdgCd(String.valueOf(medicinalproductpackagedidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedIdTypCdgCd("NULL");
		}

		if(medicinalproductpackagedidentifiertypecodingi == medicinalproductpackagedidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedIdTypCdgCd("]]");}


		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedIdTypCdgUsrSltd("[[");}
		if(medicinalproductpackagedidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedIdTypCdgUsrSltd(String.valueOf(medicinalproductpackagedidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedidentifiertypecodingi == medicinalproductpackagedidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedIdTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecodingi == 0) {m.addMdcnlPrdctPckgedIdTypCdgSys("[[");}
		if(medicinalproductpackagedidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedIdTypCdgSys(String.valueOf(medicinalproductpackagedidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedIdTypCdgSys("NULL");
		}

		if(medicinalproductpackagedidentifiertypecodingi == medicinalproductpackagedidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPckgedIdTypCdgSys("]]");}


		 };
		/******************** medicinalproductpackagedidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedidentifierperiod = medicinalproductpackagedidentifier.getPeriod();

		/******************** MdcnlPrdctPckged_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedidentifieri == 0) {m.addMdcnlPrdctPckgedIdPrdStrt("[");}
		if(medicinalproductpackagedidentifierperiod.hasStart()) {

			m.addMdcnlPrdctPckgedIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctPckgedIdPrdStrt("NULL");
		}

		if(medicinalproductpackagedidentifieri == medicinalproductpackagedidentifierlist.size()-1) {m.addMdcnlPrdctPckgedIdPrdStrt("]");}


		/******************** MdcnlPrdctPckged_Id_Prd_End ********************************************************************************/
		if(medicinalproductpackagedidentifieri == 0) {m.addMdcnlPrdctPckgedIdPrdEnd("[");}
		if(medicinalproductpackagedidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctPckgedIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctPckgedIdPrdEnd("NULL");
		}

		if(medicinalproductpackagedidentifieri == medicinalproductpackagedidentifierlist.size()-1) {m.addMdcnlPrdctPckgedIdPrdEnd("]");}


		/******************** medicinalproductpackagedidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedidentifieruse = medicinalproductpackagedidentifier.getUse();
		if(medicinalproductpackagedidentifieruse!=null) {
		if(medicinalproductpackagedidentifieri == 0) {

		m.addMdcnlPrdctPckgedIdUse("[");		}
			m.addMdcnlPrdctPckgedIdUse(medicinalproductpackagedidentifieruse.toCode());
		if(medicinalproductpackagedidentifieri == medicinalproductpackagedidentifierlist.size()-1) {

		m.addMdcnlPrdctPckgedIdUse("]");		}

		} else {
			m.addMdcnlPrdctPckgedIdUse("NULL");
		}

		/******************** MdcnlPrdctPckged_Id_Assigner ********************************************************************************/
		if(medicinalproductpackagedidentifieri == 0) {m.addMdcnlPrdctPckgedIdAssigner("[");}
		if(medicinalproductpackagedidentifier.hasAssigner()) {

			if(medicinalproductpackagedidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctPckgedIdAssigner(medicinalproductpackagedidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctPckgedIdAssigner("NULL");
		}

		if(medicinalproductpackagedidentifieri == medicinalproductpackagedidentifierlist.size()-1) {m.addMdcnlPrdctPckgedIdAssigner("]");}


		/******************** MdcnlPrdctPckged_Id_Sys ********************************************************************************/
		if(medicinalproductpackagedidentifieri == 0) {m.addMdcnlPrdctPckgedIdSys("[");}
		if(medicinalproductpackagedidentifier.hasSystem()) {

			m.addMdcnlPrdctPckgedIdSys(String.valueOf(medicinalproductpackagedidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedIdSys("NULL");
		}

		if(medicinalproductpackagedidentifieri == medicinalproductpackagedidentifierlist.size()-1) {m.addMdcnlPrdctPckgedIdSys("]");}


		 };
		/******************** medicinalproductpackagedmarketingstatus ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MarketingStatus> medicinalproductpackagedmarketingstatuslist = medicinalproductpackaged.getMarketingStatus();
		for(int medicinalproductpackagedmarketingstatusi = 0; medicinalproductpackagedmarketingstatusi<medicinalproductpackagedmarketingstatuslist.size();medicinalproductpackagedmarketingstatusi++ ) {
		org.hl7.fhir.r4.model.MarketingStatus  medicinalproductpackagedmarketingstatus = medicinalproductpackagedmarketingstatuslist.get(medicinalproductpackagedmarketingstatusi);

		/******************** medicinalproductpackagedmarketingstatuscountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatuscountry = medicinalproductpackagedmarketingstatus.getCountry();

		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Txt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusi == 0) {m.addMdcnlPrdctPckgedMarketingStsCntryTxt("[");}
		if(medicinalproductpackagedmarketingstatuscountry.hasText()) {

			m.addMdcnlPrdctPckgedMarketingStsCntryTxt(String.valueOf(medicinalproductpackagedmarketingstatuscountry.getText()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsCntryTxt("NULL");
		}

		if(medicinalproductpackagedmarketingstatusi == medicinalproductpackagedmarketingstatuslist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsCntryTxt("]");}


		/******************** medicinalproductpackagedmarketingstatuscountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedmarketingstatuscountrycodinglist = medicinalproductpackagedmarketingstatuscountry.getCoding();
		for(int medicinalproductpackagedmarketingstatuscountrycodingi = 0; medicinalproductpackagedmarketingstatuscountrycodingi<medicinalproductpackagedmarketingstatuscountrycodinglist.size();medicinalproductpackagedmarketingstatuscountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedmarketingstatuscountrycoding = medicinalproductpackagedmarketingstatuscountrycodinglist.get(medicinalproductpackagedmarketingstatuscountrycodingi);

		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgDsply("[[");}
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedMarketingStsCntryCdgDsply(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsCntryCdgDsply("NULL");
		}

		if(medicinalproductpackagedmarketingstatuscountrycodingi == medicinalproductpackagedmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgVrsn("[[");}
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasVersion()) {

			m.addMdcnlPrdctPckgedMarketingStsCntryCdgVrsn(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsCntryCdgVrsn("NULL");
		}

		if(medicinalproductpackagedmarketingstatuscountrycodingi == medicinalproductpackagedmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgCd("[[");}
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasCode()) {

			m.addMdcnlPrdctPckgedMarketingStsCntryCdgCd(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsCntryCdgCd("NULL");
		}

		if(medicinalproductpackagedmarketingstatuscountrycodingi == medicinalproductpackagedmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgCd("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd("[[");}
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedmarketingstatuscountrycodingi == medicinalproductpackagedmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgSys("[[");}
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasSystem()) {

			m.addMdcnlPrdctPckgedMarketingStsCntryCdgSys(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsCntryCdgSys("NULL");
		}

		if(medicinalproductpackagedmarketingstatuscountrycodingi == medicinalproductpackagedmarketingstatuscountrycodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsCntryCdgSys("]]");}


		 };
		/******************** medicinalproductpackagedmarketingstatusstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatusstatus = medicinalproductpackagedmarketingstatus.getStatus();

		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Txt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusi == 0) {m.addMdcnlPrdctPckgedMarketingStsStsTxt("[");}
		if(medicinalproductpackagedmarketingstatusstatus.hasText()) {

			m.addMdcnlPrdctPckgedMarketingStsStsTxt(String.valueOf(medicinalproductpackagedmarketingstatusstatus.getText()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsStsTxt("NULL");
		}

		if(medicinalproductpackagedmarketingstatusi == medicinalproductpackagedmarketingstatuslist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsStsTxt("]");}


		/******************** medicinalproductpackagedmarketingstatusstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedmarketingstatusstatuscodinglist = medicinalproductpackagedmarketingstatusstatus.getCoding();
		for(int medicinalproductpackagedmarketingstatusstatuscodingi = 0; medicinalproductpackagedmarketingstatusstatuscodingi<medicinalproductpackagedmarketingstatusstatuscodinglist.size();medicinalproductpackagedmarketingstatusstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedmarketingstatusstatuscoding = medicinalproductpackagedmarketingstatusstatuscodinglist.get(medicinalproductpackagedmarketingstatusstatuscodingi);

		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsStsCdgDsply("[[");}
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedMarketingStsStsCdgDsply(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsStsCdgDsply("NULL");
		}

		if(medicinalproductpackagedmarketingstatusstatuscodingi == medicinalproductpackagedmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsStsCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsStsCdgVrsn("[[");}
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasVersion()) {

			m.addMdcnlPrdctPckgedMarketingStsStsCdgVrsn(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsStsCdgVrsn("NULL");
		}

		if(medicinalproductpackagedmarketingstatusstatuscodingi == medicinalproductpackagedmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsStsCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsStsCdgCd("[[");}
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasCode()) {

			m.addMdcnlPrdctPckgedMarketingStsStsCdgCd(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsStsCdgCd("NULL");
		}

		if(medicinalproductpackagedmarketingstatusstatuscodingi == medicinalproductpackagedmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsStsCdgCd("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd("[[");}
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedmarketingstatusstatuscodingi == medicinalproductpackagedmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsStsCdgSys("[[");}
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasSystem()) {

			m.addMdcnlPrdctPckgedMarketingStsStsCdgSys(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsStsCdgSys("NULL");
		}

		if(medicinalproductpackagedmarketingstatusstatuscodingi == medicinalproductpackagedmarketingstatusstatuscodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsStsCdgSys("]]");}


		 };
		/******************** medicinalproductpackagedmarketingstatusjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatusjurisdiction = medicinalproductpackagedmarketingstatus.getJurisdiction();

		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusi == 0) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnTxt("[");}
		if(medicinalproductpackagedmarketingstatusjurisdiction.hasText()) {

			m.addMdcnlPrdctPckgedMarketingStsJrsdctnTxt(String.valueOf(medicinalproductpackagedmarketingstatusjurisdiction.getText()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsJrsdctnTxt("NULL");
		}

		if(medicinalproductpackagedmarketingstatusi == medicinalproductpackagedmarketingstatuslist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnTxt("]");}


		/******************** medicinalproductpackagedmarketingstatusjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedmarketingstatusjurisdictioncodinglist = medicinalproductpackagedmarketingstatusjurisdiction.getCoding();
		for(int medicinalproductpackagedmarketingstatusjurisdictioncodingi = 0; medicinalproductpackagedmarketingstatusjurisdictioncodingi<medicinalproductpackagedmarketingstatusjurisdictioncodinglist.size();medicinalproductpackagedmarketingstatusjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedmarketingstatusjurisdictioncoding = medicinalproductpackagedmarketingstatusjurisdictioncodinglist.get(medicinalproductpackagedmarketingstatusjurisdictioncodingi);

		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply("[[");}
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply("NULL");
		}

		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == medicinalproductpackagedmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn("[[");}
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasVersion()) {

			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn("NULL");
		}

		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == medicinalproductpackagedmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd("[[");}
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasCode()) {

			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd("NULL");
		}

		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == medicinalproductpackagedmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd("[[");}
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == medicinalproductpackagedmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == 0) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys("[[");}
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasSystem()) {

			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys("NULL");
		}

		if(medicinalproductpackagedmarketingstatusjurisdictioncodingi == medicinalproductpackagedmarketingstatusjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys("]]");}


		 };
		/******************** MdcnlPrdctPckged_MarketingSts_RestoreDt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusi == 0) {m.addMdcnlPrdctPckgedMarketingStsRestoreDt("[");}
		if(medicinalproductpackagedmarketingstatus.hasRestoreDate()) {

			m.addMdcnlPrdctPckgedMarketingStsRestoreDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedmarketingstatus.getRestoreDate())+"\"");
		} else {
			m.addMdcnlPrdctPckgedMarketingStsRestoreDt("NULL");
		}

		if(medicinalproductpackagedmarketingstatusi == medicinalproductpackagedmarketingstatuslist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsRestoreDt("]");}


		/******************** medicinalproductpackagedmarketingstatusdaterange ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedmarketingstatusdaterange = medicinalproductpackagedmarketingstatus.getDateRange();

		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_Strt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusi == 0) {m.addMdcnlPrdctPckgedMarketingStsDtRngStrt("[");}
		if(medicinalproductpackagedmarketingstatusdaterange.hasStart()) {

			m.addMdcnlPrdctPckgedMarketingStsDtRngStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedmarketingstatusdaterange.getStart())+"\"");
		} else {
			m.addMdcnlPrdctPckgedMarketingStsDtRngStrt("NULL");
		}

		if(medicinalproductpackagedmarketingstatusi == medicinalproductpackagedmarketingstatuslist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsDtRngStrt("]");}


		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_End ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusi == 0) {m.addMdcnlPrdctPckgedMarketingStsDtRngEnd("[");}
		if(medicinalproductpackagedmarketingstatusdaterange.hasEnd()) {

			m.addMdcnlPrdctPckgedMarketingStsDtRngEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedmarketingstatusdaterange.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctPckgedMarketingStsDtRngEnd("NULL");
		}

		if(medicinalproductpackagedmarketingstatusi == medicinalproductpackagedmarketingstatuslist.size()-1) {m.addMdcnlPrdctPckgedMarketingStsDtRngEnd("]");}


		 };
		/******************** medicinalproductpackagedbatchidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent> medicinalproductpackagedbatchidentifierlist = medicinalproductpackaged.getBatchIdentifier();
		for(int medicinalproductpackagedbatchidentifieri = 0; medicinalproductpackagedbatchidentifieri<medicinalproductpackagedbatchidentifierlist.size();medicinalproductpackagedbatchidentifieri++ ) {
		org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent  medicinalproductpackagedbatchidentifier = medicinalproductpackagedbatchidentifierlist.get(medicinalproductpackagedbatchidentifieri);

		/******************** medicinalproductpackagedbatchidentifierimmediatepackaging ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedbatchidentifierimmediatepackaging = medicinalproductpackagedbatchidentifier.getImmediatePackaging();

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Vl ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingVl("[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackaging.hasValue()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingVl(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackaging.getValue()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingVl("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingVl("]");}


		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedbatchidentifierimmediatepackagingtype = medicinalproductpackagedbatchidentifierimmediatepackaging.getType();

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt("[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtype.hasText()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtype.getText()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt("]");}


		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist = medicinalproductpackagedbatchidentifierimmediatepackagingtype.getCoding();
		for(int medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi = 0; medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi<medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist.size();medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding = medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist.get(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi);

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply("[[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply("NULL");
		}

		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn("[[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn("NULL");
		}

		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd("[[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasCode()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd("NULL");
		}

		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd("]]");}


		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd("[[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys("[[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys("NULL");
		}

		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecodingi == medicinalproductpackagedbatchidentifierimmediatepackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys("]]");}


		 };
		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedbatchidentifierimmediatepackagingperiod = medicinalproductpackagedbatchidentifierimmediatepackaging.getPeriod();

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt("[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.hasStart()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt("]");}


		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_End ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd("[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.hasEnd()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd("]");}


		/******************** medicinalproductpackagedbatchidentifierimmediatepackaginguse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedbatchidentifierimmediatepackaginguse = medicinalproductpackagedbatchidentifierimmediatepackaging.getUse();
		if(medicinalproductpackagedbatchidentifierimmediatepackaginguse!=null) {
		if(medicinalproductpackagedbatchidentifieri == 0) {

		m.addMdcnlPrdctPckgedBatchIdImmediatePackagingUse("[");		}
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingUse(medicinalproductpackagedbatchidentifierimmediatepackaginguse.toCode());
		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {

		m.addMdcnlPrdctPckgedBatchIdImmediatePackagingUse("]");		}

		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingUse("NULL");
		}

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Assigner ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner("[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackaging.hasAssigner()) {

			if(medicinalproductpackagedbatchidentifierimmediatepackaging.getAssigner().getReference() != null) {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner(medicinalproductpackagedbatchidentifierimmediatepackaging.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner("]");}


		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingSys("[");}
		if(medicinalproductpackagedbatchidentifierimmediatepackaging.hasSystem()) {

			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingSys(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackaging.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdImmediatePackagingSys("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdImmediatePackagingSys("]");}


		/******************** medicinalproductpackagedbatchidentifierouterpackaging ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedbatchidentifierouterpackaging = medicinalproductpackagedbatchidentifier.getOuterPackaging();

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Vl ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingVl("[");}
		if(medicinalproductpackagedbatchidentifierouterpackaging.hasValue()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingVl(String.valueOf(medicinalproductpackagedbatchidentifierouterpackaging.getValue()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingVl("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingVl("]");}


		/******************** medicinalproductpackagedbatchidentifierouterpackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedbatchidentifierouterpackagingtype = medicinalproductpackagedbatchidentifierouterpackaging.getType();

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt("[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingtype.hasText()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtype.getText()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt("]");}


		/******************** medicinalproductpackagedbatchidentifierouterpackagingtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist = medicinalproductpackagedbatchidentifierouterpackagingtype.getCoding();
		for(int medicinalproductpackagedbatchidentifierouterpackagingtypecodingi = 0; medicinalproductpackagedbatchidentifierouterpackagingtypecodingi<medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist.size();medicinalproductpackagedbatchidentifierouterpackagingtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedbatchidentifierouterpackagingtypecoding = medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist.get(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi);

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply("[[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply("NULL");
		}

		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply("]]");}


		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn("[[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasVersion()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn("NULL");
		}

		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn("]]");}


		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd("[[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasCode()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd("NULL");
		}

		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd("]]");}


		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd("[[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys("[[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasSystem()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys("NULL");
		}

		if(medicinalproductpackagedbatchidentifierouterpackagingtypecodingi == medicinalproductpackagedbatchidentifierouterpackagingtypecodinglist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys("]]");}


		 };
		/******************** medicinalproductpackagedbatchidentifierouterpackagingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedbatchidentifierouterpackagingperiod = medicinalproductpackagedbatchidentifierouterpackaging.getPeriod();

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt("[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingperiod.hasStart()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedbatchidentifierouterpackagingperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt("]");}


		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_End ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd("[");}
		if(medicinalproductpackagedbatchidentifierouterpackagingperiod.hasEnd()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpackagedbatchidentifierouterpackagingperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd("]");}


		/******************** medicinalproductpackagedbatchidentifierouterpackaginguse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedbatchidentifierouterpackaginguse = medicinalproductpackagedbatchidentifierouterpackaging.getUse();
		if(medicinalproductpackagedbatchidentifierouterpackaginguse!=null) {
		if(medicinalproductpackagedbatchidentifieri == 0) {

		m.addMdcnlPrdctPckgedBatchIdOuterPackagingUse("[");		}
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingUse(medicinalproductpackagedbatchidentifierouterpackaginguse.toCode());
		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {

		m.addMdcnlPrdctPckgedBatchIdOuterPackagingUse("]");		}

		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingUse("NULL");
		}

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Assigner ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingAssigner("[");}
		if(medicinalproductpackagedbatchidentifierouterpackaging.hasAssigner()) {

			if(medicinalproductpackagedbatchidentifierouterpackaging.getAssigner().getReference() != null) {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingAssigner(medicinalproductpackagedbatchidentifierouterpackaging.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingAssigner("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingAssigner("]");}


		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifieri == 0) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingSys("[");}
		if(medicinalproductpackagedbatchidentifierouterpackaging.hasSystem()) {

			m.addMdcnlPrdctPckgedBatchIdOuterPackagingSys(String.valueOf(medicinalproductpackagedbatchidentifierouterpackaging.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedBatchIdOuterPackagingSys("NULL");
		}

		if(medicinalproductpackagedbatchidentifieri == medicinalproductpackagedbatchidentifierlist.size()-1) {m.addMdcnlPrdctPckgedBatchIdOuterPackagingSys("]");}


		 };
		/******************** MdcnlPrdctPckged_MarketingAthztn ********************************************************************************/
		if(medicinalproductpackaged.hasMarketingAuthorization()) {

			if(medicinalproductpackaged.getMarketingAuthorization().getReference() != null) {
			m.addMdcnlPrdctPckgedMarketingAthztn(medicinalproductpackaged.getMarketingAuthorization().getReference());
			}
		} else {
			m.addMdcnlPrdctPckgedMarketingAthztn("NULL");
		}


		/******************** medicinalproductpackagedlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedlegalstatusofsupply = medicinalproductpackaged.getLegalStatusOfSupply();

		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Txt ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupply.hasText()) {

			m.addMdcnlPrdctPckgedLegalStsOfSpplyTxt(String.valueOf(medicinalproductpackagedlegalstatusofsupply.getText()));
		} else {
			m.addMdcnlPrdctPckgedLegalStsOfSpplyTxt("NULL");
		}


		/******************** medicinalproductpackagedlegalstatusofsupplycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpackagedlegalstatusofsupplycodinglist = medicinalproductpackagedlegalstatusofsupply.getCoding();
		for(int medicinalproductpackagedlegalstatusofsupplycodingi = 0; medicinalproductpackagedlegalstatusofsupplycodingi<medicinalproductpackagedlegalstatusofsupplycodinglist.size();medicinalproductpackagedlegalstatusofsupplycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpackagedlegalstatusofsupplycoding = medicinalproductpackagedlegalstatusofsupplycodinglist.get(medicinalproductpackagedlegalstatusofsupplycodingi);

		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply("[");}
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasDisplay()) {

			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply("NULL");
		}

		if(medicinalproductpackagedlegalstatusofsupplycodingi == medicinalproductpackagedlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply("]");}


		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn("[");}
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasVersion()) {

			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getVersion()));
		} else {
			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn("NULL");
		}

		if(medicinalproductpackagedlegalstatusofsupplycodingi == medicinalproductpackagedlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn("]");}


		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgCd("[");}
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasCode()) {

			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgCd(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getCode()));
		} else {
			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgCd("NULL");
		}

		if(medicinalproductpackagedlegalstatusofsupplycodingi == medicinalproductpackagedlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgCd("]");}


		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd("[");}
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasUserSelected()) {

			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd("NULL");
		}

		if(medicinalproductpackagedlegalstatusofsupplycodingi == medicinalproductpackagedlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd("]");}


		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgSys("[");}
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasSystem()) {

			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgSys(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getSystem()));
		} else {
			m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgSys("NULL");
		}

		if(medicinalproductpackagedlegalstatusofsupplycodingi == medicinalproductpackagedlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctPckgedLegalStsOfSpplyCdgSys("]");}


		 };
		/******************** MdcnlPrdctPckged_Manufacturer ********************************************************************************/
		if(medicinalproductpackaged.hasManufacturer()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpackaged.getManufacturer().size(); incr++) {
				array = array + medicinalproductpackaged.getManufacturer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPckgedManufacturer(array);

		} else {
			m.addMdcnlPrdctPckgedManufacturer("NULL");
		}


		return m;
	}
}
