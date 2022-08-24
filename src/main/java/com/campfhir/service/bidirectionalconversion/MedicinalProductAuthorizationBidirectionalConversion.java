package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductAuthorization;
public class MedicinalProductAuthorizationBidirectionalConversion 
{
	public MedicinalProductAuthorization MedicinalProductAuthorizations(org.hl7.fhir.r4.model.MedicinalProductAuthorization medicinalproductauthorization) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductAuthorization m = new  main.java.com.campfhir.model.MedicinalProductAuthorization();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductauthorization.getIdElement().getIdPart());

		/******************** medicinalproductauthorizationcountry ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductauthorizationcountrylist = medicinalproductauthorization.getCountry();
		for(int medicinalproductauthorizationcountryi = 0; medicinalproductauthorizationcountryi<medicinalproductauthorizationcountrylist.size();medicinalproductauthorizationcountryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductauthorizationcountry = medicinalproductauthorizationcountrylist.get(medicinalproductauthorizationcountryi);

		/******************** MdcnlPrdctAthztn_Cntry_Txt ********************************************************************************/
		if(medicinalproductauthorizationcountryi == 0) {m.addMdcnlPrdctAthztnCntryTxt("[");}
		if(medicinalproductauthorizationcountry.hasText()) {

			m.addMdcnlPrdctAthztnCntryTxt(String.valueOf(medicinalproductauthorizationcountry.getText()));
		} else {
			m.addMdcnlPrdctAthztnCntryTxt("NULL");
		}

		if(medicinalproductauthorizationcountryi == medicinalproductauthorizationcountrylist.size()-1) {m.addMdcnlPrdctAthztnCntryTxt("]");}


		/******************** medicinalproductauthorizationcountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationcountrycodinglist = medicinalproductauthorizationcountry.getCoding();
		for(int medicinalproductauthorizationcountrycodingi = 0; medicinalproductauthorizationcountrycodingi<medicinalproductauthorizationcountrycodinglist.size();medicinalproductauthorizationcountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationcountrycoding = medicinalproductauthorizationcountrycodinglist.get(medicinalproductauthorizationcountrycodingi);

		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnCntryCdgDsply("[[");}
		if(medicinalproductauthorizationcountrycoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnCntryCdgDsply(String.valueOf(medicinalproductauthorizationcountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnCntryCdgDsply("NULL");
		}

		if(medicinalproductauthorizationcountrycodingi == medicinalproductauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnCntryCdgDsply("]]");}


		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnCntryCdgVrsn("[[");}
		if(medicinalproductauthorizationcountrycoding.hasVersion()) {

			m.addMdcnlPrdctAthztnCntryCdgVrsn(String.valueOf(medicinalproductauthorizationcountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnCntryCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationcountrycodingi == medicinalproductauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnCntryCdgVrsn("]]");}


		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnCntryCdgCd("[[");}
		if(medicinalproductauthorizationcountrycoding.hasCode()) {

			m.addMdcnlPrdctAthztnCntryCdgCd(String.valueOf(medicinalproductauthorizationcountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnCntryCdgCd("NULL");
		}

		if(medicinalproductauthorizationcountrycodingi == medicinalproductauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnCntryCdgCd("]]");}


		/******************** MdcnlPrdctAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnCntryCdgUsrSltd("[[");}
		if(medicinalproductauthorizationcountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnCntryCdgUsrSltd(String.valueOf(medicinalproductauthorizationcountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationcountrycodingi == medicinalproductauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnCntryCdgUsrSltd("]]");}


		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnCntryCdgSys("[[");}
		if(medicinalproductauthorizationcountrycoding.hasSystem()) {

			m.addMdcnlPrdctAthztnCntryCdgSys(String.valueOf(medicinalproductauthorizationcountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnCntryCdgSys("NULL");
		}

		if(medicinalproductauthorizationcountrycodingi == medicinalproductauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnCntryCdgSys("]]");}


		 };
		 };
		/******************** MdcnlPrdctAthztn_Sbjct ********************************************************************************/
		if(medicinalproductauthorization.hasSubject()) {

			if(medicinalproductauthorization.getSubject().getReference() != null) {
			m.addMdcnlPrdctAthztnSbjct(medicinalproductauthorization.getSubject().getReference());
			}
		} else {
			m.addMdcnlPrdctAthztnSbjct("NULL");
		}


		/******************** medicinalproductauthorizationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationstatus = medicinalproductauthorization.getStatus();

		/******************** MdcnlPrdctAthztn_Sts_Txt ********************************************************************************/
		if(medicinalproductauthorizationstatus.hasText()) {

			m.addMdcnlPrdctAthztnStsTxt(String.valueOf(medicinalproductauthorizationstatus.getText()));
		} else {
			m.addMdcnlPrdctAthztnStsTxt("NULL");
		}


		/******************** medicinalproductauthorizationstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationstatuscodinglist = medicinalproductauthorizationstatus.getCoding();
		for(int medicinalproductauthorizationstatuscodingi = 0; medicinalproductauthorizationstatuscodingi<medicinalproductauthorizationstatuscodinglist.size();medicinalproductauthorizationstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationstatuscoding = medicinalproductauthorizationstatuscodinglist.get(medicinalproductauthorizationstatuscodingi);

		/******************** MdcnlPrdctAthztn_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationstatuscodingi == 0) {m.addMdcnlPrdctAthztnStsCdgDsply("[");}
		if(medicinalproductauthorizationstatuscoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnStsCdgDsply(String.valueOf(medicinalproductauthorizationstatuscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnStsCdgDsply("NULL");
		}

		if(medicinalproductauthorizationstatuscodingi == medicinalproductauthorizationstatuscodinglist.size()-1) {m.addMdcnlPrdctAthztnStsCdgDsply("]");}


		/******************** MdcnlPrdctAthztn_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationstatuscodingi == 0) {m.addMdcnlPrdctAthztnStsCdgVrsn("[");}
		if(medicinalproductauthorizationstatuscoding.hasVersion()) {

			m.addMdcnlPrdctAthztnStsCdgVrsn(String.valueOf(medicinalproductauthorizationstatuscoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnStsCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationstatuscodingi == medicinalproductauthorizationstatuscodinglist.size()-1) {m.addMdcnlPrdctAthztnStsCdgVrsn("]");}


		/******************** MdcnlPrdctAthztn_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationstatuscodingi == 0) {m.addMdcnlPrdctAthztnStsCdgCd("[");}
		if(medicinalproductauthorizationstatuscoding.hasCode()) {

			m.addMdcnlPrdctAthztnStsCdgCd(String.valueOf(medicinalproductauthorizationstatuscoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnStsCdgCd("NULL");
		}

		if(medicinalproductauthorizationstatuscodingi == medicinalproductauthorizationstatuscodinglist.size()-1) {m.addMdcnlPrdctAthztnStsCdgCd("]");}


		/******************** MdcnlPrdctAthztn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationstatuscodingi == 0) {m.addMdcnlPrdctAthztnStsCdgUsrSltd("[");}
		if(medicinalproductauthorizationstatuscoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnStsCdgUsrSltd(String.valueOf(medicinalproductauthorizationstatuscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnStsCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationstatuscodingi == medicinalproductauthorizationstatuscodinglist.size()-1) {m.addMdcnlPrdctAthztnStsCdgUsrSltd("]");}


		/******************** MdcnlPrdctAthztn_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationstatuscodingi == 0) {m.addMdcnlPrdctAthztnStsCdgSys("[");}
		if(medicinalproductauthorizationstatuscoding.hasSystem()) {

			m.addMdcnlPrdctAthztnStsCdgSys(String.valueOf(medicinalproductauthorizationstatuscoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnStsCdgSys("NULL");
		}

		if(medicinalproductauthorizationstatuscodingi == medicinalproductauthorizationstatuscodinglist.size()-1) {m.addMdcnlPrdctAthztnStsCdgSys("]");}


		 };
		/******************** medicinalproductauthorizationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductauthorizationidentifierlist = medicinalproductauthorization.getIdentifier();
		for(int medicinalproductauthorizationidentifieri = 0; medicinalproductauthorizationidentifieri<medicinalproductauthorizationidentifierlist.size();medicinalproductauthorizationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductauthorizationidentifier = medicinalproductauthorizationidentifierlist.get(medicinalproductauthorizationidentifieri);

		/******************** MdcnlPrdctAthztn_Id_Vl ********************************************************************************/
		if(medicinalproductauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnIdVl("[");}
		if(medicinalproductauthorizationidentifier.hasValue()) {

			m.addMdcnlPrdctAthztnIdVl(String.valueOf(medicinalproductauthorizationidentifier.getValue()));
		} else {
			m.addMdcnlPrdctAthztnIdVl("NULL");
		}

		if(medicinalproductauthorizationidentifieri == medicinalproductauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnIdVl("]");}


		/******************** medicinalproductauthorizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationidentifiertype = medicinalproductauthorizationidentifier.getType();

		/******************** MdcnlPrdctAthztn_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnIdTypTxt("[");}
		if(medicinalproductauthorizationidentifiertype.hasText()) {

			m.addMdcnlPrdctAthztnIdTypTxt(String.valueOf(medicinalproductauthorizationidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctAthztnIdTypTxt("NULL");
		}

		if(medicinalproductauthorizationidentifieri == medicinalproductauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnIdTypTxt("]");}


		/******************** medicinalproductauthorizationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationidentifiertypecodinglist = medicinalproductauthorizationidentifiertype.getCoding();
		for(int medicinalproductauthorizationidentifiertypecodingi = 0; medicinalproductauthorizationidentifiertypecodingi<medicinalproductauthorizationidentifiertypecodinglist.size();medicinalproductauthorizationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationidentifiertypecoding = medicinalproductauthorizationidentifiertypecodinglist.get(medicinalproductauthorizationidentifiertypecodingi);

		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnIdTypCdgDsply("[[");}
		if(medicinalproductauthorizationidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnIdTypCdgDsply(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnIdTypCdgDsply("NULL");
		}

		if(medicinalproductauthorizationidentifiertypecodingi == medicinalproductauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnIdTypCdgDsply("]]");}


		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnIdTypCdgVrsn("[[");}
		if(medicinalproductauthorizationidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctAthztnIdTypCdgVrsn(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnIdTypCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationidentifiertypecodingi == medicinalproductauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnIdTypCdgVrsn("]]");}


		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnIdTypCdgCd("[[");}
		if(medicinalproductauthorizationidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctAthztnIdTypCdgCd(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnIdTypCdgCd("NULL");
		}

		if(medicinalproductauthorizationidentifiertypecodingi == medicinalproductauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnIdTypCdgCd("]]");}


		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnIdTypCdgUsrSltd("[[");}
		if(medicinalproductauthorizationidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnIdTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationidentifiertypecodingi == medicinalproductauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnIdTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnIdTypCdgSys("[[");}
		if(medicinalproductauthorizationidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctAthztnIdTypCdgSys(String.valueOf(medicinalproductauthorizationidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnIdTypCdgSys("NULL");
		}

		if(medicinalproductauthorizationidentifiertypecodingi == medicinalproductauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnIdTypCdgSys("]]");}


		 };
		/******************** medicinalproductauthorizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationidentifierperiod = medicinalproductauthorizationidentifier.getPeriod();

		/******************** MdcnlPrdctAthztn_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnIdPrdStrt("[");}
		if(medicinalproductauthorizationidentifierperiod.hasStart()) {

			m.addMdcnlPrdctAthztnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctAthztnIdPrdStrt("NULL");
		}

		if(medicinalproductauthorizationidentifieri == medicinalproductauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnIdPrdStrt("]");}


		/******************** MdcnlPrdctAthztn_Id_Prd_End ********************************************************************************/
		if(medicinalproductauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnIdPrdEnd("[");}
		if(medicinalproductauthorizationidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctAthztnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctAthztnIdPrdEnd("NULL");
		}

		if(medicinalproductauthorizationidentifieri == medicinalproductauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnIdPrdEnd("]");}


		/******************** medicinalproductauthorizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductauthorizationidentifieruse = medicinalproductauthorizationidentifier.getUse();
		if(medicinalproductauthorizationidentifieruse!=null) {
		if(medicinalproductauthorizationidentifieri == 0) {

		m.addMdcnlPrdctAthztnIdUse("[");		}
			m.addMdcnlPrdctAthztnIdUse(medicinalproductauthorizationidentifieruse.toCode());
		if(medicinalproductauthorizationidentifieri == medicinalproductauthorizationidentifierlist.size()-1) {

		m.addMdcnlPrdctAthztnIdUse("]");		}

		} else {
			m.addMdcnlPrdctAthztnIdUse("NULL");
		}

		/******************** MdcnlPrdctAthztn_Id_Assigner ********************************************************************************/
		if(medicinalproductauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnIdAssigner("[");}
		if(medicinalproductauthorizationidentifier.hasAssigner()) {

			if(medicinalproductauthorizationidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctAthztnIdAssigner(medicinalproductauthorizationidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctAthztnIdAssigner("NULL");
		}

		if(medicinalproductauthorizationidentifieri == medicinalproductauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnIdAssigner("]");}


		/******************** MdcnlPrdctAthztn_Id_Sys ********************************************************************************/
		if(medicinalproductauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnIdSys("[");}
		if(medicinalproductauthorizationidentifier.hasSystem()) {

			m.addMdcnlPrdctAthztnIdSys(String.valueOf(medicinalproductauthorizationidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnIdSys("NULL");
		}

		if(medicinalproductauthorizationidentifieri == medicinalproductauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnIdSys("]");}


		 };
		/******************** medicinalproductauthorizationvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationvalidityperiod = medicinalproductauthorization.getValidityPeriod();

		/******************** MdcnlPrdctAthztn_ValidityPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationvalidityperiod.hasStart()) {

			m.addMdcnlPrdctAthztnValidityPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationvalidityperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctAthztnValidityPrdStrt("NULL");
		}


		/******************** MdcnlPrdctAthztn_ValidityPrd_End ********************************************************************************/
		if(medicinalproductauthorizationvalidityperiod.hasEnd()) {

			m.addMdcnlPrdctAthztnValidityPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationvalidityperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctAthztnValidityPrdEnd("NULL");
		}


		/******************** medicinalproductauthorizationprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationProcedureComponent medicinalproductauthorizationprocedure = medicinalproductauthorization.getProcedure();

		/******************** medicinalproductauthorizationproceduretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationproceduretype = medicinalproductauthorizationprocedure.getType();

		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationproceduretype.hasText()) {

			m.addMdcnlPrdctAthztnPrcdrTypTxt(String.valueOf(medicinalproductauthorizationproceduretype.getText()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrTypTxt("NULL");
		}


		/******************** medicinalproductauthorizationproceduretypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationproceduretypecodinglist = medicinalproductauthorizationproceduretype.getCoding();
		for(int medicinalproductauthorizationproceduretypecodingi = 0; medicinalproductauthorizationproceduretypecodingi<medicinalproductauthorizationproceduretypecodinglist.size();medicinalproductauthorizationproceduretypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationproceduretypecoding = medicinalproductauthorizationproceduretypecodinglist.get(medicinalproductauthorizationproceduretypecodingi);

		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrTypCdgDsply("[");}
		if(medicinalproductauthorizationproceduretypecoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnPrcdrTypCdgDsply(String.valueOf(medicinalproductauthorizationproceduretypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrTypCdgDsply("NULL");
		}

		if(medicinalproductauthorizationproceduretypecodingi == medicinalproductauthorizationproceduretypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrTypCdgDsply("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrTypCdgVrsn("[");}
		if(medicinalproductauthorizationproceduretypecoding.hasVersion()) {

			m.addMdcnlPrdctAthztnPrcdrTypCdgVrsn(String.valueOf(medicinalproductauthorizationproceduretypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrTypCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationproceduretypecodingi == medicinalproductauthorizationproceduretypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrTypCdgVrsn("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrTypCdgCd("[");}
		if(medicinalproductauthorizationproceduretypecoding.hasCode()) {

			m.addMdcnlPrdctAthztnPrcdrTypCdgCd(String.valueOf(medicinalproductauthorizationproceduretypecoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrTypCdgCd("NULL");
		}

		if(medicinalproductauthorizationproceduretypecodingi == medicinalproductauthorizationproceduretypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrTypCdgCd("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrTypCdgUsrSltd("[");}
		if(medicinalproductauthorizationproceduretypecoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnPrcdrTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationproceduretypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrTypCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationproceduretypecodingi == medicinalproductauthorizationproceduretypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrTypCdgUsrSltd("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationproceduretypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrTypCdgSys("[");}
		if(medicinalproductauthorizationproceduretypecoding.hasSystem()) {

			m.addMdcnlPrdctAthztnPrcdrTypCdgSys(String.valueOf(medicinalproductauthorizationproceduretypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrTypCdgSys("NULL");
		}

		if(medicinalproductauthorizationproceduretypecodingi == medicinalproductauthorizationproceduretypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrTypCdgSys("]");}


		 };
		/******************** medicinalproductauthorizationprocedureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductauthorizationprocedureidentifier = medicinalproductauthorizationprocedure.getIdentifier();

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Vl ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifier.hasValue()) {

			m.addMdcnlPrdctAthztnPrcdrIdVl(String.valueOf(medicinalproductauthorizationprocedureidentifier.getValue()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdVl("NULL");
		}


		/******************** medicinalproductauthorizationprocedureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationprocedureidentifiertype = medicinalproductauthorizationprocedureidentifier.getType();

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertype.hasText()) {

			m.addMdcnlPrdctAthztnPrcdrIdTypTxt(String.valueOf(medicinalproductauthorizationprocedureidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdTypTxt("NULL");
		}


		/******************** medicinalproductauthorizationprocedureidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationprocedureidentifiertypecodinglist = medicinalproductauthorizationprocedureidentifiertype.getCoding();
		for(int medicinalproductauthorizationprocedureidentifiertypecodingi = 0; medicinalproductauthorizationprocedureidentifiertypecodingi<medicinalproductauthorizationprocedureidentifiertypecodinglist.size();medicinalproductauthorizationprocedureidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationprocedureidentifiertypecoding = medicinalproductauthorizationprocedureidentifiertypecodinglist.get(medicinalproductauthorizationprocedureidentifiertypecodingi);

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgDsply("[");}
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnPrcdrIdTypCdgDsply(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdTypCdgDsply("NULL");
		}

		if(medicinalproductauthorizationprocedureidentifiertypecodingi == medicinalproductauthorizationprocedureidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgDsply("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgVrsn("[");}
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctAthztnPrcdrIdTypCdgVrsn(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdTypCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationprocedureidentifiertypecodingi == medicinalproductauthorizationprocedureidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgVrsn("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgCd("[");}
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctAthztnPrcdrIdTypCdgCd(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdTypCdgCd("NULL");
		}

		if(medicinalproductauthorizationprocedureidentifiertypecodingi == medicinalproductauthorizationprocedureidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgCd("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd("[");}
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationprocedureidentifiertypecodingi == medicinalproductauthorizationprocedureidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd("]");}


		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgSys("[");}
		if(medicinalproductauthorizationprocedureidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctAthztnPrcdrIdTypCdgSys(String.valueOf(medicinalproductauthorizationprocedureidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdTypCdgSys("NULL");
		}

		if(medicinalproductauthorizationprocedureidentifiertypecodingi == medicinalproductauthorizationprocedureidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnPrcdrIdTypCdgSys("]");}


		 };
		/******************** medicinalproductauthorizationprocedureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationprocedureidentifierperiod = medicinalproductauthorizationprocedureidentifier.getPeriod();

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifierperiod.hasStart()) {

			m.addMdcnlPrdctAthztnPrcdrIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationprocedureidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdPrdStrt("NULL");
		}


		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_End ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctAthztnPrcdrIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationprocedureidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdPrdEnd("NULL");
		}


		/******************** medicinalproductauthorizationprocedureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductauthorizationprocedureidentifieruse = medicinalproductauthorizationprocedureidentifier.getUse();
		if(medicinalproductauthorizationprocedureidentifieruse!=null) {
			m.addMdcnlPrdctAthztnPrcdrIdUse(medicinalproductauthorizationprocedureidentifieruse.toCode());
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdUse("NULL");
		}

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Assigner ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifier.hasAssigner()) {

			if(medicinalproductauthorizationprocedureidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctAthztnPrcdrIdAssigner(medicinalproductauthorizationprocedureidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdAssigner("NULL");
		}


		/******************** MdcnlPrdctAthztn_Prcdr_Id_Sys ********************************************************************************/
		if(medicinalproductauthorizationprocedureidentifier.hasSystem()) {

			m.addMdcnlPrdctAthztnPrcdrIdSys(String.valueOf(medicinalproductauthorizationprocedureidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnPrcdrIdSys("NULL");
		}


		/******************** MdcnlPrdctAthztn_Prcdr_DtDtTimeTyp ********************************************************************************/
		if(medicinalproductauthorizationprocedure.hasDateDateTimeType()) {

			m.addMdcnlPrdctAthztnPrcdrDtDtTimeTyp("\""+medicinalproductauthorizationprocedure.getDateDateTimeType().getValueAsString()+"\"");
		} else {
			m.addMdcnlPrdctAthztnPrcdrDtDtTimeTyp("NULL");
		}


		/******************** medicinalproductauthorizationproceduredateperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationproceduredateperiod = medicinalproductauthorizationprocedure.getDatePeriod();

		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationproceduredateperiod.hasStart()) {

			m.addMdcnlPrdctAthztnPrcdrDtPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationproceduredateperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctAthztnPrcdrDtPrdStrt("NULL");
		}


		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_End ********************************************************************************/
		if(medicinalproductauthorizationproceduredateperiod.hasEnd()) {

			m.addMdcnlPrdctAthztnPrcdrDtPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationproceduredateperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctAthztnPrcdrDtPrdEnd("NULL");
		}


		/******************** MdcnlPrdctAthztn_StsDt ********************************************************************************/
		if(medicinalproductauthorization.hasStatusDate()) {

			m.addMdcnlPrdctAthztnStsDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorization.getStatusDate())+"\"");
		} else {
			m.addMdcnlPrdctAthztnStsDt("NULL");
		}


		/******************** medicinalproductauthorizationdataexclusivityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationdataexclusivityperiod = medicinalproductauthorization.getDataExclusivityPeriod();

		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationdataexclusivityperiod.hasStart()) {

			m.addMdcnlPrdctAthztnDataExclusivityPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationdataexclusivityperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctAthztnDataExclusivityPrdStrt("NULL");
		}


		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_End ********************************************************************************/
		if(medicinalproductauthorizationdataexclusivityperiod.hasEnd()) {

			m.addMdcnlPrdctAthztnDataExclusivityPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationdataexclusivityperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctAthztnDataExclusivityPrdEnd("NULL");
		}


		/******************** MdcnlPrdctAthztn_InternationalBirthDt ********************************************************************************/
		if(medicinalproductauthorization.hasInternationalBirthDate()) {

			m.addMdcnlPrdctAthztnInternationalBirthDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorization.getInternationalBirthDate())+"\"");
		} else {
			m.addMdcnlPrdctAthztnInternationalBirthDt("NULL");
		}


		/******************** medicinalproductauthorizationjurisdictionalauthorization ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent> medicinalproductauthorizationjurisdictionalauthorizationlist = medicinalproductauthorization.getJurisdictionalAuthorization();
		for(int medicinalproductauthorizationjurisdictionalauthorizationi = 0; medicinalproductauthorizationjurisdictionalauthorizationi<medicinalproductauthorizationjurisdictionalauthorizationlist.size();medicinalproductauthorizationjurisdictionalauthorizationi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent  medicinalproductauthorizationjurisdictionalauthorization = medicinalproductauthorizationjurisdictionalauthorizationlist.get(medicinalproductauthorizationjurisdictionalauthorizationi);

		/******************** medicinalproductauthorizationjurisdictionalauthorizationcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationcountry = medicinalproductauthorizationjurisdictionalauthorization.getCountry();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt("[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationcountry.hasText()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountry.getText()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationi == medicinalproductauthorizationjurisdictionalauthorizationlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt("]");}


		/******************** medicinalproductauthorizationjurisdictionalauthorizationcountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist = medicinalproductauthorizationjurisdictionalauthorizationcountry.getCoding();
		for(int medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi = 0; medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi<medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist.size();medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationjurisdictionalauthorizationcountrycoding = medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist.get(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasVersion()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasCode()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.hasSystem()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationcountrycodingi == medicinalproductauthorizationjurisdictionalauthorizationcountrycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys("]]");}


		 };
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductauthorizationjurisdictionalauthorizationidentifierlist = medicinalproductauthorizationjurisdictionalauthorization.getIdentifier();
		for(int medicinalproductauthorizationjurisdictionalauthorizationidentifieri = 0; medicinalproductauthorizationjurisdictionalauthorizationidentifieri<medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size();medicinalproductauthorizationjurisdictionalauthorizationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductauthorizationjurisdictionalauthorizationidentifier = medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.get(medicinalproductauthorizationjurisdictionalauthorizationidentifieri);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Vl ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdVl("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifier.hasValue()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdVl(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifier.getValue()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdVl("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdVl("]]");}


		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationidentifiertype = medicinalproductauthorizationjurisdictionalauthorizationidentifier.getType();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.hasText()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt("]]");}


		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist = medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.getCoding();
		for(int medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi = 0; medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi<medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist.size();medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding = medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist.get(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodingi == medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys("]]]");}


		 };
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod = medicinalproductauthorizationjurisdictionalauthorizationidentifier.getPeriod();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.hasStart()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_End ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd("]]");}


		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductauthorizationjurisdictionalauthorizationidentifieruse = medicinalproductauthorizationjurisdictionalauthorizationidentifier.getUse();
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieruse!=null) {
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == 0) {

		m.addMdcnlPrdctAthztnJrsdctnalAthztnIdUse("[[");		}
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdUse(medicinalproductauthorizationjurisdictionalauthorizationidentifieruse.toCode());
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size()-1) {

		m.addMdcnlPrdctAthztnJrsdctnalAthztnIdUse("]]");		}

		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdUse("NULL");
		}

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Assigner ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifier.hasAssigner()) {

			if(medicinalproductauthorizationjurisdictionalauthorizationidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner(medicinalproductauthorizationjurisdictionalauthorizationidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdSys("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationidentifier.hasSystem()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnIdSys("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationidentifieri == medicinalproductauthorizationjurisdictionalauthorizationidentifierlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnIdSys("]]");}


		 };
		/******************** medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod = medicinalproductauthorizationjurisdictionalauthorization.getValidityPeriod();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.hasStart()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdStrt("NULL");
		}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_End ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.hasEnd()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdEnd("NULL");
		}


		/******************** medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply = medicinalproductauthorizationjurisdictionalauthorization.getLegalStatusOfSupply();

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.hasText()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.getText()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyTxt("NULL");
		}


		/******************** medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist = medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.getCoding();
		for(int medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi = 0; medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi<medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist.size();medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding = medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist.get(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasVersion()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasCode()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd("]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.hasSystem()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodingi == medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys("]]");}


		 };
		/******************** medicinalproductauthorizationjurisdictionalauthorizationjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductauthorizationjurisdictionalauthorizationjurisdictionlist = medicinalproductauthorizationjurisdictionalauthorization.getJurisdiction();
		for(int medicinalproductauthorizationjurisdictionalauthorizationjurisdictioni = 0; medicinalproductauthorizationjurisdictionalauthorizationjurisdictioni<medicinalproductauthorizationjurisdictionalauthorizationjurisdictionlist.size();medicinalproductauthorizationjurisdictionalauthorizationjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductauthorizationjurisdictionalauthorizationjurisdiction = medicinalproductauthorizationjurisdictionalauthorizationjurisdictionlist.get(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioni);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioni == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt("[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.hasText()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.getText()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioni == medicinalproductauthorizationjurisdictionalauthorizationjurisdictionlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt("]]");}


		/******************** medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist = medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.getCoding();
		for(int medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi = 0; medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi<medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist.size();medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding = medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist.get(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasVersion()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasCode()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys("[[[");}
		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.hasSystem()) {

			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys(String.valueOf(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys("NULL");
		}

		if(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys("]]]");}


		 };
		 };
		 };
		/******************** MdcnlPrdctAthztn_DtOfFirstAthztn ********************************************************************************/
		if(medicinalproductauthorization.hasDateOfFirstAuthorization()) {

			m.addMdcnlPrdctAthztnDtOfFirstAthztn("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorization.getDateOfFirstAuthorization())+"\"");
		} else {
			m.addMdcnlPrdctAthztnDtOfFirstAthztn("NULL");
		}


		/******************** medicinalproductauthorizationjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductauthorizationjurisdictionlist = medicinalproductauthorization.getJurisdiction();
		for(int medicinalproductauthorizationjurisdictioni = 0; medicinalproductauthorizationjurisdictioni<medicinalproductauthorizationjurisdictionlist.size();medicinalproductauthorizationjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductauthorizationjurisdiction = medicinalproductauthorizationjurisdictionlist.get(medicinalproductauthorizationjurisdictioni);

		/******************** MdcnlPrdctAthztn_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioni == 0) {m.addMdcnlPrdctAthztnJrsdctnTxt("[");}
		if(medicinalproductauthorizationjurisdiction.hasText()) {

			m.addMdcnlPrdctAthztnJrsdctnTxt(String.valueOf(medicinalproductauthorizationjurisdiction.getText()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnTxt("NULL");
		}

		if(medicinalproductauthorizationjurisdictioni == medicinalproductauthorizationjurisdictionlist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnTxt("]");}


		/******************** medicinalproductauthorizationjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationjurisdictioncodinglist = medicinalproductauthorizationjurisdiction.getCoding();
		for(int medicinalproductauthorizationjurisdictioncodingi = 0; medicinalproductauthorizationjurisdictioncodingi<medicinalproductauthorizationjurisdictioncodinglist.size();medicinalproductauthorizationjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationjurisdictioncoding = medicinalproductauthorizationjurisdictioncodinglist.get(medicinalproductauthorizationjurisdictioncodingi);

		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnCdgDsply("[[");}
		if(medicinalproductauthorizationjurisdictioncoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnJrsdctnCdgDsply(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnCdgDsply("NULL");
		}

		if(medicinalproductauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnCdgDsply("]]");}


		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnCdgVrsn("[[");}
		if(medicinalproductauthorizationjurisdictioncoding.hasVersion()) {

			m.addMdcnlPrdctAthztnJrsdctnCdgVrsn(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnCdgVrsn("]]");}


		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnCdgCd("[[");}
		if(medicinalproductauthorizationjurisdictioncoding.hasCode()) {

			m.addMdcnlPrdctAthztnJrsdctnCdgCd(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnCdgCd("NULL");
		}

		if(medicinalproductauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnCdgCd("]]");}


		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnCdgUsrSltd("[[");}
		if(medicinalproductauthorizationjurisdictioncoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnJrsdctnCdgUsrSltd(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnCdgUsrSltd("]]");}


		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationjurisdictioncodingi == 0) {m.addMdcnlPrdctAthztnJrsdctnCdgSys("[[");}
		if(medicinalproductauthorizationjurisdictioncoding.hasSystem()) {

			m.addMdcnlPrdctAthztnJrsdctnCdgSys(String.valueOf(medicinalproductauthorizationjurisdictioncoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnJrsdctnCdgSys("NULL");
		}

		if(medicinalproductauthorizationjurisdictioncodingi == medicinalproductauthorizationjurisdictioncodinglist.size()-1) {m.addMdcnlPrdctAthztnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** MdcnlPrdctAthztn_RestoreDt ********************************************************************************/
		if(medicinalproductauthorization.hasRestoreDate()) {

			m.addMdcnlPrdctAthztnRestoreDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductauthorization.getRestoreDate())+"\"");
		} else {
			m.addMdcnlPrdctAthztnRestoreDt("NULL");
		}


		/******************** MdcnlPrdctAthztn_Holder ********************************************************************************/
		if(medicinalproductauthorization.hasHolder()) {

			if(medicinalproductauthorization.getHolder().getReference() != null) {
			m.addMdcnlPrdctAthztnHolder(medicinalproductauthorization.getHolder().getReference());
			}
		} else {
			m.addMdcnlPrdctAthztnHolder("NULL");
		}


		/******************** MdcnlPrdctAthztn_Regulator ********************************************************************************/
		if(medicinalproductauthorization.hasRegulator()) {

			if(medicinalproductauthorization.getRegulator().getReference() != null) {
			m.addMdcnlPrdctAthztnRegulator(medicinalproductauthorization.getRegulator().getReference());
			}
		} else {
			m.addMdcnlPrdctAthztnRegulator("NULL");
		}


		/******************** medicinalproductauthorizationlegalbasis ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationlegalbasis = medicinalproductauthorization.getLegalBasis();

		/******************** MdcnlPrdctAthztn_LegalBasis_Txt ********************************************************************************/
		if(medicinalproductauthorizationlegalbasis.hasText()) {

			m.addMdcnlPrdctAthztnLegalBasisTxt(String.valueOf(medicinalproductauthorizationlegalbasis.getText()));
		} else {
			m.addMdcnlPrdctAthztnLegalBasisTxt("NULL");
		}


		/******************** medicinalproductauthorizationlegalbasiscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductauthorizationlegalbasiscodinglist = medicinalproductauthorizationlegalbasis.getCoding();
		for(int medicinalproductauthorizationlegalbasiscodingi = 0; medicinalproductauthorizationlegalbasiscodingi<medicinalproductauthorizationlegalbasiscodinglist.size();medicinalproductauthorizationlegalbasiscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductauthorizationlegalbasiscoding = medicinalproductauthorizationlegalbasiscodinglist.get(medicinalproductauthorizationlegalbasiscodingi);

		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Dsply ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscodingi == 0) {m.addMdcnlPrdctAthztnLegalBasisCdgDsply("[");}
		if(medicinalproductauthorizationlegalbasiscoding.hasDisplay()) {

			m.addMdcnlPrdctAthztnLegalBasisCdgDsply(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctAthztnLegalBasisCdgDsply("NULL");
		}

		if(medicinalproductauthorizationlegalbasiscodingi == medicinalproductauthorizationlegalbasiscodinglist.size()-1) {m.addMdcnlPrdctAthztnLegalBasisCdgDsply("]");}


		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscodingi == 0) {m.addMdcnlPrdctAthztnLegalBasisCdgVrsn("[");}
		if(medicinalproductauthorizationlegalbasiscoding.hasVersion()) {

			m.addMdcnlPrdctAthztnLegalBasisCdgVrsn(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getVersion()));
		} else {
			m.addMdcnlPrdctAthztnLegalBasisCdgVrsn("NULL");
		}

		if(medicinalproductauthorizationlegalbasiscodingi == medicinalproductauthorizationlegalbasiscodinglist.size()-1) {m.addMdcnlPrdctAthztnLegalBasisCdgVrsn("]");}


		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Cd ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscodingi == 0) {m.addMdcnlPrdctAthztnLegalBasisCdgCd("[");}
		if(medicinalproductauthorizationlegalbasiscoding.hasCode()) {

			m.addMdcnlPrdctAthztnLegalBasisCdgCd(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getCode()));
		} else {
			m.addMdcnlPrdctAthztnLegalBasisCdgCd("NULL");
		}

		if(medicinalproductauthorizationlegalbasiscodingi == medicinalproductauthorizationlegalbasiscodinglist.size()-1) {m.addMdcnlPrdctAthztnLegalBasisCdgCd("]");}


		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscodingi == 0) {m.addMdcnlPrdctAthztnLegalBasisCdgUsrSltd("[");}
		if(medicinalproductauthorizationlegalbasiscoding.hasUserSelected()) {

			m.addMdcnlPrdctAthztnLegalBasisCdgUsrSltd(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctAthztnLegalBasisCdgUsrSltd("NULL");
		}

		if(medicinalproductauthorizationlegalbasiscodingi == medicinalproductauthorizationlegalbasiscodinglist.size()-1) {m.addMdcnlPrdctAthztnLegalBasisCdgUsrSltd("]");}


		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Sys ********************************************************************************/
		if(medicinalproductauthorizationlegalbasiscodingi == 0) {m.addMdcnlPrdctAthztnLegalBasisCdgSys("[");}
		if(medicinalproductauthorizationlegalbasiscoding.hasSystem()) {

			m.addMdcnlPrdctAthztnLegalBasisCdgSys(String.valueOf(medicinalproductauthorizationlegalbasiscoding.getSystem()));
		} else {
			m.addMdcnlPrdctAthztnLegalBasisCdgSys("NULL");
		}

		if(medicinalproductauthorizationlegalbasiscodingi == medicinalproductauthorizationlegalbasiscodinglist.size()-1) {m.addMdcnlPrdctAthztnLegalBasisCdgSys("]");}


		 };
		return m;
	}
}
