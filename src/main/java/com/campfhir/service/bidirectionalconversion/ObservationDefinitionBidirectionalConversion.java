package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ObservationDefinition;
public class ObservationDefinitionBidirectionalConversion 
{
	public ObservationDefinition ObservationDefinitions(org.hl7.fhir.r4.model.ObservationDefinition observationdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ObservationDefinition o = new  main.java.com.campfhir.model.ObservationDefinition();

		/******************** id ********************************************************************************/
		o.setId(observationdefinition.getIdElement().getIdPart());

		/******************** observationdefinitionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionmethod = observationdefinition.getMethod();

		/******************** ObsrvtnDfn_Mthd_Txt ********************************************************************************/
		if(observationdefinitionmethod.hasText()) {

			o.addObsrvtnDfnMthdTxt(String.valueOf(observationdefinitionmethod.getText()));
		} else {
			o.addObsrvtnDfnMthdTxt("NULL");
		}


		/******************** observationdefinitionmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitionmethodcodinglist = observationdefinitionmethod.getCoding();
		for(int observationdefinitionmethodcodingi = 0; observationdefinitionmethodcodingi<observationdefinitionmethodcodinglist.size();observationdefinitionmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitionmethodcoding = observationdefinitionmethodcodinglist.get(observationdefinitionmethodcodingi);

		/******************** ObsrvtnDfn_Mthd_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionmethodcodingi == 0) {o.addObsrvtnDfnMthdCdgDsply("[");}
		if(observationdefinitionmethodcoding.hasDisplay()) {

			o.addObsrvtnDfnMthdCdgDsply(String.valueOf(observationdefinitionmethodcoding.getDisplay()));
		} else {
			o.addObsrvtnDfnMthdCdgDsply("NULL");
		}

		if(observationdefinitionmethodcodingi == observationdefinitionmethodcodinglist.size()-1) {o.addObsrvtnDfnMthdCdgDsply("]");}


		/******************** ObsrvtnDfn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionmethodcodingi == 0) {o.addObsrvtnDfnMthdCdgVrsn("[");}
		if(observationdefinitionmethodcoding.hasVersion()) {

			o.addObsrvtnDfnMthdCdgVrsn(String.valueOf(observationdefinitionmethodcoding.getVersion()));
		} else {
			o.addObsrvtnDfnMthdCdgVrsn("NULL");
		}

		if(observationdefinitionmethodcodingi == observationdefinitionmethodcodinglist.size()-1) {o.addObsrvtnDfnMthdCdgVrsn("]");}


		/******************** ObsrvtnDfn_Mthd_Cdg_Cd ********************************************************************************/
		if(observationdefinitionmethodcodingi == 0) {o.addObsrvtnDfnMthdCdgCd("[");}
		if(observationdefinitionmethodcoding.hasCode()) {

			o.addObsrvtnDfnMthdCdgCd(String.valueOf(observationdefinitionmethodcoding.getCode()));
		} else {
			o.addObsrvtnDfnMthdCdgCd("NULL");
		}

		if(observationdefinitionmethodcodingi == observationdefinitionmethodcodinglist.size()-1) {o.addObsrvtnDfnMthdCdgCd("]");}


		/******************** ObsrvtnDfn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionmethodcodingi == 0) {o.addObsrvtnDfnMthdCdgUsrSltd("[");}
		if(observationdefinitionmethodcoding.hasUserSelected()) {

			o.addObsrvtnDfnMthdCdgUsrSltd(String.valueOf(observationdefinitionmethodcoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnMthdCdgUsrSltd("NULL");
		}

		if(observationdefinitionmethodcodingi == observationdefinitionmethodcodinglist.size()-1) {o.addObsrvtnDfnMthdCdgUsrSltd("]");}


		/******************** ObsrvtnDfn_Mthd_Cdg_Sys ********************************************************************************/
		if(observationdefinitionmethodcodingi == 0) {o.addObsrvtnDfnMthdCdgSys("[");}
		if(observationdefinitionmethodcoding.hasSystem()) {

			o.addObsrvtnDfnMthdCdgSys(String.valueOf(observationdefinitionmethodcoding.getSystem()));
		} else {
			o.addObsrvtnDfnMthdCdgSys("NULL");
		}

		if(observationdefinitionmethodcodingi == observationdefinitionmethodcodinglist.size()-1) {o.addObsrvtnDfnMthdCdgSys("]");}


		 };
		/******************** observationdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitioncode = observationdefinition.getCode();

		/******************** ObsrvtnDfn_Cd_Txt ********************************************************************************/
		if(observationdefinitioncode.hasText()) {

			o.addObsrvtnDfnCdTxt(String.valueOf(observationdefinitioncode.getText()));
		} else {
			o.addObsrvtnDfnCdTxt("NULL");
		}


		/******************** observationdefinitioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitioncodecodinglist = observationdefinitioncode.getCoding();
		for(int observationdefinitioncodecodingi = 0; observationdefinitioncodecodingi<observationdefinitioncodecodinglist.size();observationdefinitioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitioncodecoding = observationdefinitioncodecodinglist.get(observationdefinitioncodecodingi);

		/******************** ObsrvtnDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(observationdefinitioncodecodingi == 0) {o.addObsrvtnDfnCdCdgDsply("[");}
		if(observationdefinitioncodecoding.hasDisplay()) {

			o.addObsrvtnDfnCdCdgDsply(String.valueOf(observationdefinitioncodecoding.getDisplay()));
		} else {
			o.addObsrvtnDfnCdCdgDsply("NULL");
		}

		if(observationdefinitioncodecodingi == observationdefinitioncodecodinglist.size()-1) {o.addObsrvtnDfnCdCdgDsply("]");}


		/******************** ObsrvtnDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitioncodecodingi == 0) {o.addObsrvtnDfnCdCdgVrsn("[");}
		if(observationdefinitioncodecoding.hasVersion()) {

			o.addObsrvtnDfnCdCdgVrsn(String.valueOf(observationdefinitioncodecoding.getVersion()));
		} else {
			o.addObsrvtnDfnCdCdgVrsn("NULL");
		}

		if(observationdefinitioncodecodingi == observationdefinitioncodecodinglist.size()-1) {o.addObsrvtnDfnCdCdgVrsn("]");}


		/******************** ObsrvtnDfn_Cd_Cdg_Cd ********************************************************************************/
		if(observationdefinitioncodecodingi == 0) {o.addObsrvtnDfnCdCdgCd("[");}
		if(observationdefinitioncodecoding.hasCode()) {

			o.addObsrvtnDfnCdCdgCd(String.valueOf(observationdefinitioncodecoding.getCode()));
		} else {
			o.addObsrvtnDfnCdCdgCd("NULL");
		}

		if(observationdefinitioncodecodingi == observationdefinitioncodecodinglist.size()-1) {o.addObsrvtnDfnCdCdgCd("]");}


		/******************** ObsrvtnDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitioncodecodingi == 0) {o.addObsrvtnDfnCdCdgUsrSltd("[");}
		if(observationdefinitioncodecoding.hasUserSelected()) {

			o.addObsrvtnDfnCdCdgUsrSltd(String.valueOf(observationdefinitioncodecoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnCdCdgUsrSltd("NULL");
		}

		if(observationdefinitioncodecodingi == observationdefinitioncodecodinglist.size()-1) {o.addObsrvtnDfnCdCdgUsrSltd("]");}


		/******************** ObsrvtnDfn_Cd_Cdg_Sys ********************************************************************************/
		if(observationdefinitioncodecodingi == 0) {o.addObsrvtnDfnCdCdgSys("[");}
		if(observationdefinitioncodecoding.hasSystem()) {

			o.addObsrvtnDfnCdCdgSys(String.valueOf(observationdefinitioncodecoding.getSystem()));
		} else {
			o.addObsrvtnDfnCdCdgSys("NULL");
		}

		if(observationdefinitioncodecodingi == observationdefinitioncodecodinglist.size()-1) {o.addObsrvtnDfnCdCdgSys("]");}


		 };
		/******************** observationdefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> observationdefinitionidentifierlist = observationdefinition.getIdentifier();
		for(int observationdefinitionidentifieri = 0; observationdefinitionidentifieri<observationdefinitionidentifierlist.size();observationdefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  observationdefinitionidentifier = observationdefinitionidentifierlist.get(observationdefinitionidentifieri);

		/******************** ObsrvtnDfn_Id_Vl ********************************************************************************/
		if(observationdefinitionidentifieri == 0) {o.addObsrvtnDfnIdVl("[");}
		if(observationdefinitionidentifier.hasValue()) {

			o.addObsrvtnDfnIdVl(String.valueOf(observationdefinitionidentifier.getValue()));
		} else {
			o.addObsrvtnDfnIdVl("NULL");
		}

		if(observationdefinitionidentifieri == observationdefinitionidentifierlist.size()-1) {o.addObsrvtnDfnIdVl("]");}


		/******************** observationdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionidentifiertype = observationdefinitionidentifier.getType();

		/******************** ObsrvtnDfn_Id_Typ_Txt ********************************************************************************/
		if(observationdefinitionidentifieri == 0) {o.addObsrvtnDfnIdTypTxt("[");}
		if(observationdefinitionidentifiertype.hasText()) {

			o.addObsrvtnDfnIdTypTxt(String.valueOf(observationdefinitionidentifiertype.getText()));
		} else {
			o.addObsrvtnDfnIdTypTxt("NULL");
		}

		if(observationdefinitionidentifieri == observationdefinitionidentifierlist.size()-1) {o.addObsrvtnDfnIdTypTxt("]");}


		/******************** observationdefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitionidentifiertypecodinglist = observationdefinitionidentifiertype.getCoding();
		for(int observationdefinitionidentifiertypecodingi = 0; observationdefinitionidentifiertypecodingi<observationdefinitionidentifiertypecodinglist.size();observationdefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitionidentifiertypecoding = observationdefinitionidentifiertypecodinglist.get(observationdefinitionidentifiertypecodingi);

		/******************** ObsrvtnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionidentifiertypecodingi == 0) {o.addObsrvtnDfnIdTypCdgDsply("[[");}
		if(observationdefinitionidentifiertypecoding.hasDisplay()) {

			o.addObsrvtnDfnIdTypCdgDsply(String.valueOf(observationdefinitionidentifiertypecoding.getDisplay()));
		} else {
			o.addObsrvtnDfnIdTypCdgDsply("NULL");
		}

		if(observationdefinitionidentifiertypecodingi == observationdefinitionidentifiertypecodinglist.size()-1) {o.addObsrvtnDfnIdTypCdgDsply("]]");}


		/******************** ObsrvtnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionidentifiertypecodingi == 0) {o.addObsrvtnDfnIdTypCdgVrsn("[[");}
		if(observationdefinitionidentifiertypecoding.hasVersion()) {

			o.addObsrvtnDfnIdTypCdgVrsn(String.valueOf(observationdefinitionidentifiertypecoding.getVersion()));
		} else {
			o.addObsrvtnDfnIdTypCdgVrsn("NULL");
		}

		if(observationdefinitionidentifiertypecodingi == observationdefinitionidentifiertypecodinglist.size()-1) {o.addObsrvtnDfnIdTypCdgVrsn("]]");}


		/******************** ObsrvtnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(observationdefinitionidentifiertypecodingi == 0) {o.addObsrvtnDfnIdTypCdgCd("[[");}
		if(observationdefinitionidentifiertypecoding.hasCode()) {

			o.addObsrvtnDfnIdTypCdgCd(String.valueOf(observationdefinitionidentifiertypecoding.getCode()));
		} else {
			o.addObsrvtnDfnIdTypCdgCd("NULL");
		}

		if(observationdefinitionidentifiertypecodingi == observationdefinitionidentifiertypecodinglist.size()-1) {o.addObsrvtnDfnIdTypCdgCd("]]");}


		/******************** ObsrvtnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionidentifiertypecodingi == 0) {o.addObsrvtnDfnIdTypCdgUsrSltd("[[");}
		if(observationdefinitionidentifiertypecoding.hasUserSelected()) {

			o.addObsrvtnDfnIdTypCdgUsrSltd(String.valueOf(observationdefinitionidentifiertypecoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnIdTypCdgUsrSltd("NULL");
		}

		if(observationdefinitionidentifiertypecodingi == observationdefinitionidentifiertypecodinglist.size()-1) {o.addObsrvtnDfnIdTypCdgUsrSltd("]]");}


		/******************** ObsrvtnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(observationdefinitionidentifiertypecodingi == 0) {o.addObsrvtnDfnIdTypCdgSys("[[");}
		if(observationdefinitionidentifiertypecoding.hasSystem()) {

			o.addObsrvtnDfnIdTypCdgSys(String.valueOf(observationdefinitionidentifiertypecoding.getSystem()));
		} else {
			o.addObsrvtnDfnIdTypCdgSys("NULL");
		}

		if(observationdefinitionidentifiertypecodingi == observationdefinitionidentifiertypecodinglist.size()-1) {o.addObsrvtnDfnIdTypCdgSys("]]");}


		 };
		/******************** observationdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationdefinitionidentifierperiod = observationdefinitionidentifier.getPeriod();

		/******************** ObsrvtnDfn_Id_Prd_Strt ********************************************************************************/
		if(observationdefinitionidentifieri == 0) {o.addObsrvtnDfnIdPrdStrt("[");}
		if(observationdefinitionidentifierperiod.hasStart()) {

			o.addObsrvtnDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationdefinitionidentifierperiod.getStart())+"\"");
		} else {
			o.addObsrvtnDfnIdPrdStrt("NULL");
		}

		if(observationdefinitionidentifieri == observationdefinitionidentifierlist.size()-1) {o.addObsrvtnDfnIdPrdStrt("]");}


		/******************** ObsrvtnDfn_Id_Prd_End ********************************************************************************/
		if(observationdefinitionidentifieri == 0) {o.addObsrvtnDfnIdPrdEnd("[");}
		if(observationdefinitionidentifierperiod.hasEnd()) {

			o.addObsrvtnDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationdefinitionidentifierperiod.getEnd())+"\"");
		} else {
			o.addObsrvtnDfnIdPrdEnd("NULL");
		}

		if(observationdefinitionidentifieri == observationdefinitionidentifierlist.size()-1) {o.addObsrvtnDfnIdPrdEnd("]");}


		/******************** observationdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse observationdefinitionidentifieruse = observationdefinitionidentifier.getUse();
		if(observationdefinitionidentifieruse!=null) {
		if(observationdefinitionidentifieri == 0) {

		o.addObsrvtnDfnIdUse("[");		}
			o.addObsrvtnDfnIdUse(observationdefinitionidentifieruse.toCode());
		if(observationdefinitionidentifieri == observationdefinitionidentifierlist.size()-1) {

		o.addObsrvtnDfnIdUse("]");		}

		} else {
			o.addObsrvtnDfnIdUse("NULL");
		}

		/******************** ObsrvtnDfn_Id_Assigner ********************************************************************************/
		if(observationdefinitionidentifieri == 0) {o.addObsrvtnDfnIdAssigner("[");}
		if(observationdefinitionidentifier.hasAssigner()) {

			if(observationdefinitionidentifier.getAssigner().getReference() != null) {
			o.addObsrvtnDfnIdAssigner(observationdefinitionidentifier.getAssigner().getReference());
			}
		} else {
			o.addObsrvtnDfnIdAssigner("NULL");
		}

		if(observationdefinitionidentifieri == observationdefinitionidentifierlist.size()-1) {o.addObsrvtnDfnIdAssigner("]");}


		/******************** ObsrvtnDfn_Id_Sys ********************************************************************************/
		if(observationdefinitionidentifieri == 0) {o.addObsrvtnDfnIdSys("[");}
		if(observationdefinitionidentifier.hasSystem()) {

			o.addObsrvtnDfnIdSys(String.valueOf(observationdefinitionidentifier.getSystem()));
		} else {
			o.addObsrvtnDfnIdSys("NULL");
		}

		if(observationdefinitionidentifieri == observationdefinitionidentifierlist.size()-1) {o.addObsrvtnDfnIdSys("]");}


		 };
		/******************** observationdefinitioncategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> observationdefinitioncategorylist = observationdefinition.getCategory();
		for(int observationdefinitioncategoryi = 0; observationdefinitioncategoryi<observationdefinitioncategorylist.size();observationdefinitioncategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  observationdefinitioncategory = observationdefinitioncategorylist.get(observationdefinitioncategoryi);

		/******************** ObsrvtnDfn_Ctgry_Txt ********************************************************************************/
		if(observationdefinitioncategoryi == 0) {o.addObsrvtnDfnCtgryTxt("[");}
		if(observationdefinitioncategory.hasText()) {

			o.addObsrvtnDfnCtgryTxt(String.valueOf(observationdefinitioncategory.getText()));
		} else {
			o.addObsrvtnDfnCtgryTxt("NULL");
		}

		if(observationdefinitioncategoryi == observationdefinitioncategorylist.size()-1) {o.addObsrvtnDfnCtgryTxt("]");}


		/******************** observationdefinitioncategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitioncategorycodinglist = observationdefinitioncategory.getCoding();
		for(int observationdefinitioncategorycodingi = 0; observationdefinitioncategorycodingi<observationdefinitioncategorycodinglist.size();observationdefinitioncategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitioncategorycoding = observationdefinitioncategorycodinglist.get(observationdefinitioncategorycodingi);

		/******************** ObsrvtnDfn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(observationdefinitioncategorycodingi == 0) {o.addObsrvtnDfnCtgryCdgDsply("[[");}
		if(observationdefinitioncategorycoding.hasDisplay()) {

			o.addObsrvtnDfnCtgryCdgDsply(String.valueOf(observationdefinitioncategorycoding.getDisplay()));
		} else {
			o.addObsrvtnDfnCtgryCdgDsply("NULL");
		}

		if(observationdefinitioncategorycodingi == observationdefinitioncategorycodinglist.size()-1) {o.addObsrvtnDfnCtgryCdgDsply("]]");}


		/******************** ObsrvtnDfn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitioncategorycodingi == 0) {o.addObsrvtnDfnCtgryCdgVrsn("[[");}
		if(observationdefinitioncategorycoding.hasVersion()) {

			o.addObsrvtnDfnCtgryCdgVrsn(String.valueOf(observationdefinitioncategorycoding.getVersion()));
		} else {
			o.addObsrvtnDfnCtgryCdgVrsn("NULL");
		}

		if(observationdefinitioncategorycodingi == observationdefinitioncategorycodinglist.size()-1) {o.addObsrvtnDfnCtgryCdgVrsn("]]");}


		/******************** ObsrvtnDfn_Ctgry_Cdg_Cd ********************************************************************************/
		if(observationdefinitioncategorycodingi == 0) {o.addObsrvtnDfnCtgryCdgCd("[[");}
		if(observationdefinitioncategorycoding.hasCode()) {

			o.addObsrvtnDfnCtgryCdgCd(String.valueOf(observationdefinitioncategorycoding.getCode()));
		} else {
			o.addObsrvtnDfnCtgryCdgCd("NULL");
		}

		if(observationdefinitioncategorycodingi == observationdefinitioncategorycodinglist.size()-1) {o.addObsrvtnDfnCtgryCdgCd("]]");}


		/******************** ObsrvtnDfn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitioncategorycodingi == 0) {o.addObsrvtnDfnCtgryCdgUsrSltd("[[");}
		if(observationdefinitioncategorycoding.hasUserSelected()) {

			o.addObsrvtnDfnCtgryCdgUsrSltd(String.valueOf(observationdefinitioncategorycoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnCtgryCdgUsrSltd("NULL");
		}

		if(observationdefinitioncategorycodingi == observationdefinitioncategorycodinglist.size()-1) {o.addObsrvtnDfnCtgryCdgUsrSltd("]]");}


		/******************** ObsrvtnDfn_Ctgry_Cdg_Sys ********************************************************************************/
		if(observationdefinitioncategorycodingi == 0) {o.addObsrvtnDfnCtgryCdgSys("[[");}
		if(observationdefinitioncategorycoding.hasSystem()) {

			o.addObsrvtnDfnCtgryCdgSys(String.valueOf(observationdefinitioncategorycoding.getSystem()));
		} else {
			o.addObsrvtnDfnCtgryCdgSys("NULL");
		}

		if(observationdefinitioncategorycodingi == observationdefinitioncategorycodinglist.size()-1) {o.addObsrvtnDfnCtgryCdgSys("]]");}


		 };
		 };
		/******************** observationdefinitionquantitativedetails ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQuantitativeDetailsComponent observationdefinitionquantitativedetails = observationdefinition.getQuantitativeDetails();

		/******************** observationdefinitionquantitativedetailsunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionquantitativedetailsunit = observationdefinitionquantitativedetails.getUnit();

		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Txt ********************************************************************************/
		if(observationdefinitionquantitativedetailsunit.hasText()) {

			o.addObsrvtnDfnQuantitativeDtlsUntTxt(String.valueOf(observationdefinitionquantitativedetailsunit.getText()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsUntTxt("NULL");
		}


		/******************** observationdefinitionquantitativedetailsunitcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitionquantitativedetailsunitcodinglist = observationdefinitionquantitativedetailsunit.getCoding();
		for(int observationdefinitionquantitativedetailsunitcodingi = 0; observationdefinitionquantitativedetailsunitcodingi<observationdefinitionquantitativedetailsunitcodinglist.size();observationdefinitionquantitativedetailsunitcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitionquantitativedetailsunitcoding = observationdefinitionquantitativedetailsunitcodinglist.get(observationdefinitionquantitativedetailsunitcodingi);

		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsUntCdgDsply("[");}
		if(observationdefinitionquantitativedetailsunitcoding.hasDisplay()) {

			o.addObsrvtnDfnQuantitativeDtlsUntCdgDsply(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getDisplay()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsUntCdgDsply("NULL");
		}

		if(observationdefinitionquantitativedetailsunitcodingi == observationdefinitionquantitativedetailsunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsUntCdgDsply("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsUntCdgVrsn("[");}
		if(observationdefinitionquantitativedetailsunitcoding.hasVersion()) {

			o.addObsrvtnDfnQuantitativeDtlsUntCdgVrsn(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getVersion()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsUntCdgVrsn("NULL");
		}

		if(observationdefinitionquantitativedetailsunitcodingi == observationdefinitionquantitativedetailsunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsUntCdgVrsn("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Cd ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsUntCdgCd("[");}
		if(observationdefinitionquantitativedetailsunitcoding.hasCode()) {

			o.addObsrvtnDfnQuantitativeDtlsUntCdgCd(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getCode()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsUntCdgCd("NULL");
		}

		if(observationdefinitionquantitativedetailsunitcodingi == observationdefinitionquantitativedetailsunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsUntCdgCd("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd("[");}
		if(observationdefinitionquantitativedetailsunitcoding.hasUserSelected()) {

			o.addObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd("NULL");
		}

		if(observationdefinitionquantitativedetailsunitcodingi == observationdefinitionquantitativedetailsunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Sys ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsUntCdgSys("[");}
		if(observationdefinitionquantitativedetailsunitcoding.hasSystem()) {

			o.addObsrvtnDfnQuantitativeDtlsUntCdgSys(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getSystem()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsUntCdgSys("NULL");
		}

		if(observationdefinitionquantitativedetailsunitcodingi == observationdefinitionquantitativedetailsunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsUntCdgSys("]");}


		 };
		/******************** ObsrvtnDfn_QuantitativeDtls_ConversionFactor ********************************************************************************/
		if(observationdefinitionquantitativedetails.hasConversionFactor()) {

			o.addObsrvtnDfnQuantitativeDtlsConversionFactor(String.valueOf(observationdefinitionquantitativedetails.getConversionFactor()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsConversionFactor("NULL");
		}


		/******************** ObsrvtnDfn_QuantitativeDtls_DecimalPrecision ********************************************************************************/
		if(observationdefinitionquantitativedetails.hasDecimalPrecision()) {

			o.addObsrvtnDfnQuantitativeDtlsDecimalPrecision(String.valueOf(observationdefinitionquantitativedetails.getDecimalPrecision()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsDecimalPrecision("NULL");
		}


		/******************** observationdefinitionquantitativedetailscustomaryunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionquantitativedetailscustomaryunit = observationdefinitionquantitativedetails.getCustomaryUnit();

		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Txt ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunit.hasText()) {

			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntTxt(String.valueOf(observationdefinitionquantitativedetailscustomaryunit.getText()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntTxt("NULL");
		}


		/******************** observationdefinitionquantitativedetailscustomaryunitcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitionquantitativedetailscustomaryunitcodinglist = observationdefinitionquantitativedetailscustomaryunit.getCoding();
		for(int observationdefinitionquantitativedetailscustomaryunitcodingi = 0; observationdefinitionquantitativedetailscustomaryunitcodingi<observationdefinitionquantitativedetailscustomaryunitcodinglist.size();observationdefinitionquantitativedetailscustomaryunitcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitionquantitativedetailscustomaryunitcoding = observationdefinitionquantitativedetailscustomaryunitcodinglist.get(observationdefinitionquantitativedetailscustomaryunitcodingi);

		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply("[");}
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasDisplay()) {

			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getDisplay()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply("NULL");
		}

		if(observationdefinitionquantitativedetailscustomaryunitcodingi == observationdefinitionquantitativedetailscustomaryunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn("[");}
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasVersion()) {

			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getVersion()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn("NULL");
		}

		if(observationdefinitionquantitativedetailscustomaryunitcodingi == observationdefinitionquantitativedetailscustomaryunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Cd ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd("[");}
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasCode()) {

			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getCode()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd("NULL");
		}

		if(observationdefinitionquantitativedetailscustomaryunitcodingi == observationdefinitionquantitativedetailscustomaryunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd("[");}
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasUserSelected()) {

			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd("NULL");
		}

		if(observationdefinitionquantitativedetailscustomaryunitcodingi == observationdefinitionquantitativedetailscustomaryunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd("]");}


		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Sys ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcodingi == 0) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys("[");}
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasSystem()) {

			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getSystem()));
		} else {
			o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys("NULL");
		}

		if(observationdefinitionquantitativedetailscustomaryunitcodingi == observationdefinitionquantitativedetailscustomaryunitcodinglist.size()-1) {o.addObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys("]");}


		 };
		/******************** ObsrvtnDfn_CriticalCddVlSt ********************************************************************************/
		if(observationdefinition.hasCriticalCodedValueSet()) {

			if(observationdefinition.getCriticalCodedValueSet().getReference() != null) {
			o.addObsrvtnDfnCriticalCddVlSt(observationdefinition.getCriticalCodedValueSet().getReference());
			}
		} else {
			o.addObsrvtnDfnCriticalCddVlSt("NULL");
		}


		/******************** ObsrvtnDfn_AbnormalCddVlSt ********************************************************************************/
		if(observationdefinition.hasAbnormalCodedValueSet()) {

			if(observationdefinition.getAbnormalCodedValueSet().getReference() != null) {
			o.addObsrvtnDfnAbnormalCddVlSt(observationdefinition.getAbnormalCodedValueSet().getReference());
			}
		} else {
			o.addObsrvtnDfnAbnormalCddVlSt("NULL");
		}


		/******************** ObsrvtnDfn_NormalCddVlSt ********************************************************************************/
		if(observationdefinition.hasNormalCodedValueSet()) {

			if(observationdefinition.getNormalCodedValueSet().getReference() != null) {
			o.addObsrvtnDfnNormalCddVlSt(observationdefinition.getNormalCodedValueSet().getReference());
			}
		} else {
			o.addObsrvtnDfnNormalCddVlSt("NULL");
		}


		/******************** observationdefinitionqualifiedinterval ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent> observationdefinitionqualifiedintervallist = observationdefinition.getQualifiedInterval();
		for(int observationdefinitionqualifiedintervali = 0; observationdefinitionqualifiedintervali<observationdefinitionqualifiedintervallist.size();observationdefinitionqualifiedintervali++ ) {
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent  observationdefinitionqualifiedinterval = observationdefinitionqualifiedintervallist.get(observationdefinitionqualifiedintervali);

		/******************** observationdefinitionqualifiedintervalcontext ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionqualifiedintervalcontext = observationdefinitionqualifiedinterval.getContext();

		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Txt ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalCntxtTxt("[");}
		if(observationdefinitionqualifiedintervalcontext.hasText()) {

			o.addObsrvtnDfnQualifiedIntervalCntxtTxt(String.valueOf(observationdefinitionqualifiedintervalcontext.getText()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalCntxtTxt("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalCntxtTxt("]");}


		/******************** observationdefinitionqualifiedintervalcontextcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitionqualifiedintervalcontextcodinglist = observationdefinitionqualifiedintervalcontext.getCoding();
		for(int observationdefinitionqualifiedintervalcontextcodingi = 0; observationdefinitionqualifiedintervalcontextcodingi<observationdefinitionqualifiedintervalcontextcodinglist.size();observationdefinitionqualifiedintervalcontextcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitionqualifiedintervalcontextcoding = observationdefinitionqualifiedintervalcontextcodinglist.get(observationdefinitionqualifiedintervalcontextcodingi);

		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcodingi == 0) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgDsply("[[");}
		if(observationdefinitionqualifiedintervalcontextcoding.hasDisplay()) {

			o.addObsrvtnDfnQualifiedIntervalCntxtCdgDsply(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getDisplay()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalCntxtCdgDsply("NULL");
		}

		if(observationdefinitionqualifiedintervalcontextcodingi == observationdefinitionqualifiedintervalcontextcodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgDsply("]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcodingi == 0) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgVrsn("[[");}
		if(observationdefinitionqualifiedintervalcontextcoding.hasVersion()) {

			o.addObsrvtnDfnQualifiedIntervalCntxtCdgVrsn(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getVersion()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalCntxtCdgVrsn("NULL");
		}

		if(observationdefinitionqualifiedintervalcontextcodingi == observationdefinitionqualifiedintervalcontextcodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgVrsn("]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcodingi == 0) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgCd("[[");}
		if(observationdefinitionqualifiedintervalcontextcoding.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalCntxtCdgCd(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalCntxtCdgCd("NULL");
		}

		if(observationdefinitionqualifiedintervalcontextcodingi == observationdefinitionqualifiedintervalcontextcodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgCd("]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcodingi == 0) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd("[[");}
		if(observationdefinitionqualifiedintervalcontextcoding.hasUserSelected()) {

			o.addObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd("NULL");
		}

		if(observationdefinitionqualifiedintervalcontextcodingi == observationdefinitionqualifiedintervalcontextcodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd("]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcodingi == 0) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgSys("[[");}
		if(observationdefinitionqualifiedintervalcontextcoding.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalCntxtCdgSys(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalCntxtCdgSys("NULL");
		}

		if(observationdefinitionqualifiedintervalcontextcodingi == observationdefinitionqualifiedintervalcontextcodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalCntxtCdgSys("]]");}


		 };
		/******************** observationdefinitionqualifiedintervalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationRangeCategory observationdefinitionqualifiedintervalcategory = observationdefinitionqualifiedinterval.getCategory();
		if(observationdefinitionqualifiedintervalcategory!=null) {
		if(observationdefinitionqualifiedintervali == 0) {

		o.addObsrvtnDfnQualifiedIntervalCtgry("[");		}
			o.addObsrvtnDfnQualifiedIntervalCtgry(observationdefinitionqualifiedintervalcategory.toCode());
		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {

		o.addObsrvtnDfnQualifiedIntervalCtgry("]");		}

		} else {
			o.addObsrvtnDfnQualifiedIntervalCtgry("NULL");
		}

		/******************** ObsrvtnDfn_QualifiedInterval_Cndtn ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalCndtn("[");}
		if(observationdefinitionqualifiedinterval.hasCondition()) {

			o.addObsrvtnDfnQualifiedIntervalCndtn(String.valueOf(observationdefinitionqualifiedinterval.getCondition()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalCndtn("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalCndtn("]");}


		/******************** observationdefinitionqualifiedintervalgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender observationdefinitionqualifiedintervalgender = observationdefinitionqualifiedinterval.getGender();
		if(observationdefinitionqualifiedintervalgender!=null) {
		if(observationdefinitionqualifiedintervali == 0) {

		o.addObsrvtnDfnQualifiedIntervalGender("[");		}
			o.addObsrvtnDfnQualifiedIntervalGender(observationdefinitionqualifiedintervalgender.toCode());
		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {

		o.addObsrvtnDfnQualifiedIntervalGender("]");		}

		} else {
			o.addObsrvtnDfnQualifiedIntervalGender("NULL");
		}

		/******************** observationdefinitionqualifiedintervalrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalrange = observationdefinitionqualifiedinterval.getRange();

		/******************** observationdefinitionqualifiedintervalrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalrangelow = observationdefinitionqualifiedintervalrange.getLow();

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngLwVl("[");}
		if(observationdefinitionqualifiedintervalrangelow.hasValue()) {

			o.addObsrvtnDfnQualifiedIntervalRngLwVl(String.valueOf(observationdefinitionqualifiedintervalrangelow.getValue()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngLwVl("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngLwVl("]");}


		/******************** observationdefinitionqualifiedintervalrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalrangelowcomparator = observationdefinitionqualifiedintervalrangelow.getComparator();
		if(observationdefinitionqualifiedintervalrangelowcomparator!=null) {
		if(observationdefinitionqualifiedintervali == 0) {

		o.addObsrvtnDfnQualifiedIntervalRngLwCmprtr("[");		}
			o.addObsrvtnDfnQualifiedIntervalRngLwCmprtr(observationdefinitionqualifiedintervalrangelowcomparator.toCode());
		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {

		o.addObsrvtnDfnQualifiedIntervalRngLwCmprtr("]");		}

		} else {
			o.addObsrvtnDfnQualifiedIntervalRngLwCmprtr("NULL");
		}

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngLwCd("[");}
		if(observationdefinitionqualifiedintervalrangelow.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalRngLwCd(String.valueOf(observationdefinitionqualifiedintervalrangelow.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngLwCd("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngLwCd("]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngLwUnt("[");}
		if(observationdefinitionqualifiedintervalrangelow.hasUnit()) {

			o.addObsrvtnDfnQualifiedIntervalRngLwUnt(String.valueOf(observationdefinitionqualifiedintervalrangelow.getUnit()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngLwUnt("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngLwUnt("]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngLwSys("[");}
		if(observationdefinitionqualifiedintervalrangelow.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalRngLwSys(String.valueOf(observationdefinitionqualifiedintervalrangelow.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngLwSys("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngLwSys("]");}


		/******************** observationdefinitionqualifiedintervalrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalrangehigh = observationdefinitionqualifiedintervalrange.getHigh();

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngHiVl("[");}
		if(observationdefinitionqualifiedintervalrangehigh.hasValue()) {

			o.addObsrvtnDfnQualifiedIntervalRngHiVl(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getValue()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngHiVl("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngHiVl("]");}


		/******************** observationdefinitionqualifiedintervalrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalrangehighcomparator = observationdefinitionqualifiedintervalrangehigh.getComparator();
		if(observationdefinitionqualifiedintervalrangehighcomparator!=null) {
		if(observationdefinitionqualifiedintervali == 0) {

		o.addObsrvtnDfnQualifiedIntervalRngHiCmprtr("[");		}
			o.addObsrvtnDfnQualifiedIntervalRngHiCmprtr(observationdefinitionqualifiedintervalrangehighcomparator.toCode());
		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {

		o.addObsrvtnDfnQualifiedIntervalRngHiCmprtr("]");		}

		} else {
			o.addObsrvtnDfnQualifiedIntervalRngHiCmprtr("NULL");
		}

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngHiCd("[");}
		if(observationdefinitionqualifiedintervalrangehigh.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalRngHiCd(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngHiCd("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngHiCd("]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngHiUnt("[");}
		if(observationdefinitionqualifiedintervalrangehigh.hasUnit()) {

			o.addObsrvtnDfnQualifiedIntervalRngHiUnt(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getUnit()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngHiUnt("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngHiUnt("]");}


		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervali == 0) {o.addObsrvtnDfnQualifiedIntervalRngHiSys("[");}
		if(observationdefinitionqualifiedintervalrangehigh.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalRngHiSys(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalRngHiSys("NULL");
		}

		if(observationdefinitionqualifiedintervali == observationdefinitionqualifiedintervallist.size()-1) {o.addObsrvtnDfnQualifiedIntervalRngHiSys("]");}


		/******************** observationdefinitionqualifiedintervalappliesto ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> observationdefinitionqualifiedintervalappliestolist = observationdefinitionqualifiedinterval.getAppliesTo();
		for(int observationdefinitionqualifiedintervalappliestoi = 0; observationdefinitionqualifiedintervalappliestoi<observationdefinitionqualifiedintervalappliestolist.size();observationdefinitionqualifiedintervalappliestoi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  observationdefinitionqualifiedintervalappliesto = observationdefinitionqualifiedintervalappliestolist.get(observationdefinitionqualifiedintervalappliestoi);

		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Txt ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestoi == 0) {o.addObsrvtnDfnQualifiedIntervalAppliesToTxt("[[");}
		if(observationdefinitionqualifiedintervalappliesto.hasText()) {

			o.addObsrvtnDfnQualifiedIntervalAppliesToTxt(String.valueOf(observationdefinitionqualifiedintervalappliesto.getText()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAppliesToTxt("NULL");
		}

		if(observationdefinitionqualifiedintervalappliestoi == observationdefinitionqualifiedintervalappliestolist.size()-1) {o.addObsrvtnDfnQualifiedIntervalAppliesToTxt("]]");}


		/******************** observationdefinitionqualifiedintervalappliestocoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdefinitionqualifiedintervalappliestocodinglist = observationdefinitionqualifiedintervalappliesto.getCoding();
		for(int observationdefinitionqualifiedintervalappliestocodingi = 0; observationdefinitionqualifiedintervalappliestocodingi<observationdefinitionqualifiedintervalappliestocodinglist.size();observationdefinitionqualifiedintervalappliestocodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdefinitionqualifiedintervalappliestocoding = observationdefinitionqualifiedintervalappliestocodinglist.get(observationdefinitionqualifiedintervalappliestocodingi);

		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocodingi == 0) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgDsply("[[[");}
		if(observationdefinitionqualifiedintervalappliestocoding.hasDisplay()) {

			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgDsply(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getDisplay()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgDsply("NULL");
		}

		if(observationdefinitionqualifiedintervalappliestocodingi == observationdefinitionqualifiedintervalappliestocodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgDsply("]]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocodingi == 0) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn("[[[");}
		if(observationdefinitionqualifiedintervalappliestocoding.hasVersion()) {

			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getVersion()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn("NULL");
		}

		if(observationdefinitionqualifiedintervalappliestocodingi == observationdefinitionqualifiedintervalappliestocodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn("]]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocodingi == 0) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgCd("[[[");}
		if(observationdefinitionqualifiedintervalappliestocoding.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgCd(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgCd("NULL");
		}

		if(observationdefinitionqualifiedintervalappliestocodingi == observationdefinitionqualifiedintervalappliestocodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgCd("]]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocodingi == 0) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd("[[[");}
		if(observationdefinitionqualifiedintervalappliestocoding.hasUserSelected()) {

			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getUserSelected()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd("NULL");
		}

		if(observationdefinitionqualifiedintervalappliestocodingi == observationdefinitionqualifiedintervalappliestocodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd("]]]");}


		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocodingi == 0) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgSys("[[[");}
		if(observationdefinitionqualifiedintervalappliestocoding.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgSys(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAppliesToCdgSys("NULL");
		}

		if(observationdefinitionqualifiedintervalappliestocodingi == observationdefinitionqualifiedintervalappliestocodinglist.size()-1) {o.addObsrvtnDfnQualifiedIntervalAppliesToCdgSys("]]]");}


		 };
		 };
		/******************** observationdefinitionqualifiedintervalgestationalage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalgestationalage = observationdefinitionqualifiedinterval.getGestationalAge();

		/******************** observationdefinitionqualifiedintervalgestationalagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalgestationalagelow = observationdefinitionqualifiedintervalgestationalage.getLow();

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasValue()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwVl(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getValue()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwVl("NULL");
		}


		/******************** observationdefinitionqualifiedintervalgestationalagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalgestationalagelowcomparator = observationdefinitionqualifiedintervalgestationalagelow.getComparator();
		if(observationdefinitionqualifiedintervalgestationalagelowcomparator!=null) {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwCmprtr(observationdefinitionqualifiedintervalgestationalagelowcomparator.toCode());
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwCmprtr("NULL");
		}

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwCd(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwCd("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasUnit()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwUnt(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getUnit()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwUnt("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwSys(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeLwSys("NULL");
		}


		/******************** observationdefinitionqualifiedintervalgestationalagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalgestationalagehigh = observationdefinitionqualifiedintervalgestationalage.getHigh();

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasValue()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiVl(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getValue()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiVl("NULL");
		}


		/******************** observationdefinitionqualifiedintervalgestationalagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalgestationalagehighcomparator = observationdefinitionqualifiedintervalgestationalagehigh.getComparator();
		if(observationdefinitionqualifiedintervalgestationalagehighcomparator!=null) {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiCmprtr(observationdefinitionqualifiedintervalgestationalagehighcomparator.toCode());
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiCmprtr("NULL");
		}

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiCd(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiCd("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasUnit()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiUnt(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getUnit()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiUnt("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiSys(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalGestationalAgeHiSys("NULL");
		}


		/******************** observationdefinitionqualifiedintervalage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalage = observationdefinitionqualifiedinterval.getAge();

		/******************** observationdefinitionqualifiedintervalagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalagelow = observationdefinitionqualifiedintervalage.getLow();

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasValue()) {

			o.addObsrvtnDfnQualifiedIntervalAgeLwVl(String.valueOf(observationdefinitionqualifiedintervalagelow.getValue()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeLwVl("NULL");
		}


		/******************** observationdefinitionqualifiedintervalagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalagelowcomparator = observationdefinitionqualifiedintervalagelow.getComparator();
		if(observationdefinitionqualifiedintervalagelowcomparator!=null) {
			o.addObsrvtnDfnQualifiedIntervalAgeLwCmprtr(observationdefinitionqualifiedintervalagelowcomparator.toCode());
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeLwCmprtr("NULL");
		}

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalAgeLwCd(String.valueOf(observationdefinitionqualifiedintervalagelow.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeLwCd("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasUnit()) {

			o.addObsrvtnDfnQualifiedIntervalAgeLwUnt(String.valueOf(observationdefinitionqualifiedintervalagelow.getUnit()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeLwUnt("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalAgeLwSys(String.valueOf(observationdefinitionqualifiedintervalagelow.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeLwSys("NULL");
		}


		/******************** observationdefinitionqualifiedintervalagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalagehigh = observationdefinitionqualifiedintervalage.getHigh();

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasValue()) {

			o.addObsrvtnDfnQualifiedIntervalAgeHiVl(String.valueOf(observationdefinitionqualifiedintervalagehigh.getValue()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeHiVl("NULL");
		}


		/******************** observationdefinitionqualifiedintervalagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalagehighcomparator = observationdefinitionqualifiedintervalagehigh.getComparator();
		if(observationdefinitionqualifiedintervalagehighcomparator!=null) {
			o.addObsrvtnDfnQualifiedIntervalAgeHiCmprtr(observationdefinitionqualifiedintervalagehighcomparator.toCode());
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeHiCmprtr("NULL");
		}

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasCode()) {

			o.addObsrvtnDfnQualifiedIntervalAgeHiCd(String.valueOf(observationdefinitionqualifiedintervalagehigh.getCode()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeHiCd("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasUnit()) {

			o.addObsrvtnDfnQualifiedIntervalAgeHiUnt(String.valueOf(observationdefinitionqualifiedintervalagehigh.getUnit()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeHiUnt("NULL");
		}


		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasSystem()) {

			o.addObsrvtnDfnQualifiedIntervalAgeHiSys(String.valueOf(observationdefinitionqualifiedintervalagehigh.getSystem()));
		} else {
			o.addObsrvtnDfnQualifiedIntervalAgeHiSys("NULL");
		}


		 };
		/******************** ObsrvtnDfn_ValidCddVlSt ********************************************************************************/
		if(observationdefinition.hasValidCodedValueSet()) {

			if(observationdefinition.getValidCodedValueSet().getReference() != null) {
			o.addObsrvtnDfnValidCddVlSt(observationdefinition.getValidCodedValueSet().getReference());
			}
		} else {
			o.addObsrvtnDfnValidCddVlSt("NULL");
		}


		/******************** ObsrvtnDfn_MultipleRsltsAllowed ********************************************************************************/
		if(observationdefinition.hasMultipleResultsAllowed()) {

			o.addObsrvtnDfnMultipleRsltsAllowed(String.valueOf(observationdefinition.getMultipleResultsAllowed()));
		} else {
			o.addObsrvtnDfnMultipleRsltsAllowed("NULL");
		}


		/******************** observationdefinitionpermitteddatatype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.ObservationDefinition.ObservationDataType>> observationdefinitionpermitteddatatypelist = observationdefinition.getPermittedDataType();
		for(int observationdefinitionpermitteddatatypei = 0; observationdefinitionpermitteddatatypei<observationdefinitionpermitteddatatypelist.size();observationdefinitionpermitteddatatypei++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.ObservationDefinition.ObservationDataType>  observationdefinitionpermitteddatatype = observationdefinitionpermitteddatatypelist.get(observationdefinitionpermitteddatatypei);
		if(observationdefinitionpermitteddatatype!=null) {
			o.addObsrvtnDfnPermittedDataTyp(observationdefinitionpermitteddatatype.getCode());
		} else {
			o.addObsrvtnDfnPermittedDataTyp("NULL");
		}
		 };

		/******************** ObsrvtnDfn_PreferredRptNm ********************************************************************************/
		if(observationdefinition.hasPreferredReportName()) {

			o.addObsrvtnDfnPreferredRptNm(String.valueOf(observationdefinition.getPreferredReportName()));
		} else {
			o.addObsrvtnDfnPreferredRptNm("NULL");
		}


		return o;
	}
}
