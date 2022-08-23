package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Observation;
public class ObservationBidirectionalConversion 
{
	public Observation Observations(org.hl7.fhir.r4.model.Observation observation) throws ParseException
	{
		 main.java.com.campfhir.model.Observation o = new  main.java.com.campfhir.model.Observation();

		/******************** id ********************************************************************************/
		o.setId(observation.getIdElement().getIdPart());

		/******************** observationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationmethod = observation.getMethod();

		/******************** Obsrvtn_Mthd_Txt ********************************************************************************/
		if(observationmethod.hasText()) {

			o.addObsrvtnMthdTxt(String.valueOf(observationmethod.getText()));
		} else {
			o.addObsrvtnMthdTxt("NULL");
		}


		/******************** observationmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationmethodcodinglist = observationmethod.getCoding();
		for(int observationmethodcodingi = 0; observationmethodcodingi<observationmethodcodinglist.size();observationmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationmethodcoding = observationmethodcodinglist.get(observationmethodcodingi);

		/******************** Obsrvtn_Mthd_Cdg_Dsply ********************************************************************************/
		if(observationmethodcodingi == 0) {o.addObsrvtnMthdCdgDsply("[");}
		if(observationmethodcoding.hasDisplay()) {

			o.addObsrvtnMthdCdgDsply(String.valueOf(observationmethodcoding.getDisplay()));
		} else {
			o.addObsrvtnMthdCdgDsply("NULL");
		}

		if(observationmethodcodingi == observationmethodcodinglist.size()-1) {o.addObsrvtnMthdCdgDsply("]");}


		/******************** Obsrvtn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(observationmethodcodingi == 0) {o.addObsrvtnMthdCdgVrsn("[");}
		if(observationmethodcoding.hasVersion()) {

			o.addObsrvtnMthdCdgVrsn(String.valueOf(observationmethodcoding.getVersion()));
		} else {
			o.addObsrvtnMthdCdgVrsn("NULL");
		}

		if(observationmethodcodingi == observationmethodcodinglist.size()-1) {o.addObsrvtnMthdCdgVrsn("]");}


		/******************** Obsrvtn_Mthd_Cdg_Cd ********************************************************************************/
		if(observationmethodcodingi == 0) {o.addObsrvtnMthdCdgCd("[");}
		if(observationmethodcoding.hasCode()) {

			o.addObsrvtnMthdCdgCd(String.valueOf(observationmethodcoding.getCode()));
		} else {
			o.addObsrvtnMthdCdgCd("NULL");
		}

		if(observationmethodcodingi == observationmethodcodinglist.size()-1) {o.addObsrvtnMthdCdgCd("]");}


		/******************** Obsrvtn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(observationmethodcodingi == 0) {o.addObsrvtnMthdCdgUsrSltd("[");}
		if(observationmethodcoding.hasUserSelected()) {

			o.addObsrvtnMthdCdgUsrSltd(String.valueOf(observationmethodcoding.getUserSelected()));
		} else {
			o.addObsrvtnMthdCdgUsrSltd("NULL");
		}

		if(observationmethodcodingi == observationmethodcodinglist.size()-1) {o.addObsrvtnMthdCdgUsrSltd("]");}


		/******************** Obsrvtn_Mthd_Cdg_Sys ********************************************************************************/
		if(observationmethodcodingi == 0) {o.addObsrvtnMthdCdgSys("[");}
		if(observationmethodcoding.hasSystem()) {

			o.addObsrvtnMthdCdgSys(String.valueOf(observationmethodcoding.getSystem()));
		} else {
			o.addObsrvtnMthdCdgSys("NULL");
		}

		if(observationmethodcodingi == observationmethodcodinglist.size()-1) {o.addObsrvtnMthdCdgSys("]");}


		 };
		/******************** observationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcode = observation.getCode();

		/******************** Obsrvtn_Cd_Txt ********************************************************************************/
		if(observationcode.hasText()) {

			o.addObsrvtnCdTxt(String.valueOf(observationcode.getText()));
		} else {
			o.addObsrvtnCdTxt("NULL");
		}


		/******************** observationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcodecodinglist = observationcode.getCoding();
		for(int observationcodecodingi = 0; observationcodecodingi<observationcodecodinglist.size();observationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcodecoding = observationcodecodinglist.get(observationcodecodingi);

		/******************** Obsrvtn_Cd_Cdg_Dsply ********************************************************************************/
		if(observationcodecodingi == 0) {o.addObsrvtnCdCdgDsply("[");}
		if(observationcodecoding.hasDisplay()) {

			o.addObsrvtnCdCdgDsply(String.valueOf(observationcodecoding.getDisplay()));
		} else {
			o.addObsrvtnCdCdgDsply("NULL");
		}

		if(observationcodecodingi == observationcodecodinglist.size()-1) {o.addObsrvtnCdCdgDsply("]");}


		/******************** Obsrvtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationcodecodingi == 0) {o.addObsrvtnCdCdgVrsn("[");}
		if(observationcodecoding.hasVersion()) {

			o.addObsrvtnCdCdgVrsn(String.valueOf(observationcodecoding.getVersion()));
		} else {
			o.addObsrvtnCdCdgVrsn("NULL");
		}

		if(observationcodecodingi == observationcodecodinglist.size()-1) {o.addObsrvtnCdCdgVrsn("]");}


		/******************** Obsrvtn_Cd_Cdg_Cd ********************************************************************************/
		if(observationcodecodingi == 0) {o.addObsrvtnCdCdgCd("[");}
		if(observationcodecoding.hasCode()) {

			o.addObsrvtnCdCdgCd(String.valueOf(observationcodecoding.getCode()));
		} else {
			o.addObsrvtnCdCdgCd("NULL");
		}

		if(observationcodecodingi == observationcodecodinglist.size()-1) {o.addObsrvtnCdCdgCd("]");}


		/******************** Obsrvtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationcodecodingi == 0) {o.addObsrvtnCdCdgUsrSltd("[");}
		if(observationcodecoding.hasUserSelected()) {

			o.addObsrvtnCdCdgUsrSltd(String.valueOf(observationcodecoding.getUserSelected()));
		} else {
			o.addObsrvtnCdCdgUsrSltd("NULL");
		}

		if(observationcodecodingi == observationcodecodinglist.size()-1) {o.addObsrvtnCdCdgUsrSltd("]");}


		/******************** Obsrvtn_Cd_Cdg_Sys ********************************************************************************/
		if(observationcodecodingi == 0) {o.addObsrvtnCdCdgSys("[");}
		if(observationcodecoding.hasSystem()) {

			o.addObsrvtnCdCdgSys(String.valueOf(observationcodecoding.getSystem()));
		} else {
			o.addObsrvtnCdCdgSys("NULL");
		}

		if(observationcodecodingi == observationcodecodinglist.size()-1) {o.addObsrvtnCdCdgSys("]");}


		 };
		/******************** Obsrvtn_Sbjct ********************************************************************************/
		if(observation.hasSubject()) {

			if(observation.getSubject().getReference() != null) {
			o.addObsrvtnSbjct(observation.getSubject().getReference());
			}
		} else {
			o.addObsrvtnSbjct("NULL");
		}


		/******************** observationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationStatus observationstatus = observation.getStatus();
		if(observationstatus!=null) {
			o.addObsrvtnSts(observationstatus.toCode());
		} else {
			o.addObsrvtnSts("NULL");
		}

		/******************** Obsrvtn_Enc ********************************************************************************/
		if(observation.hasEncounter()) {

			if(observation.getEncounter().getReference() != null) {
			o.addObsrvtnEnc(observation.getEncounter().getReference());
			}
		} else {
			o.addObsrvtnEnc("NULL");
		}


		/******************** Obsrvtn_BasedOn ********************************************************************************/
		if(observation.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<observation.getBasedOn().size(); incr++) {
				array = array + observation.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnBasedOn(array);

		} else {
			o.addObsrvtnBasedOn("NULL");
		}


		/******************** observationnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> observationnotelist = observation.getNote();
		for(int observationnotei = 0; observationnotei<observationnotelist.size();observationnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  observationnote = observationnotelist.get(observationnotei);

		/******************** Obsrvtn_Nt_Time ********************************************************************************/
		if(observationnotei == 0) {o.addObsrvtnNtTime("[");}
		if(observationnote.hasTime()) {

			o.addObsrvtnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationnote.getTime())+"\"");
		} else {
			o.addObsrvtnNtTime("NULL");
		}

		if(observationnotei == observationnotelist.size()-1) {o.addObsrvtnNtTime("]");}


		/******************** Obsrvtn_Nt_AthrRfrnc ********************************************************************************/
		if(observationnotei == 0) {o.addObsrvtnNtAthrRfrnc("[");}
		if(observationnote.hasAuthorReference()) {

			if(observationnote.getAuthorReference().getReference() != null) {
			o.addObsrvtnNtAthrRfrnc(observationnote.getAuthorReference().getReference());
			}
		} else {
			o.addObsrvtnNtAthrRfrnc("NULL");
		}

		if(observationnotei == observationnotelist.size()-1) {o.addObsrvtnNtAthrRfrnc("]");}


		/******************** Obsrvtn_Nt_Txt ********************************************************************************/
		if(observationnotei == 0) {o.addObsrvtnNtTxt("[");}
		if(observationnote.hasText()) {

			o.addObsrvtnNtTxt(String.valueOf(observationnote.getText()));
		} else {
			o.addObsrvtnNtTxt("NULL");
		}

		if(observationnotei == observationnotelist.size()-1) {o.addObsrvtnNtTxt("]");}


		/******************** Obsrvtn_Nt_AthrStrgTyp ********************************************************************************/
		if(observationnotei == 0) {o.addObsrvtnNtAthrStrgTyp("[");}
		if(observationnote.hasAuthorStringType()) {

			o.addObsrvtnNtAthrStrgTyp("\""+observationnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnNtAthrStrgTyp("NULL");
		}

		if(observationnotei == observationnotelist.size()-1) {o.addObsrvtnNtAthrStrgTyp("]");}


		 };
		/******************** observationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> observationidentifierlist = observation.getIdentifier();
		for(int observationidentifieri = 0; observationidentifieri<observationidentifierlist.size();observationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  observationidentifier = observationidentifierlist.get(observationidentifieri);

		/******************** Obsrvtn_Id_Vl ********************************************************************************/
		if(observationidentifieri == 0) {o.addObsrvtnIdVl("[");}
		if(observationidentifier.hasValue()) {

			o.addObsrvtnIdVl(String.valueOf(observationidentifier.getValue()));
		} else {
			o.addObsrvtnIdVl("NULL");
		}

		if(observationidentifieri == observationidentifierlist.size()-1) {o.addObsrvtnIdVl("]");}


		/******************** observationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationidentifiertype = observationidentifier.getType();

		/******************** Obsrvtn_Id_Typ_Txt ********************************************************************************/
		if(observationidentifieri == 0) {o.addObsrvtnIdTypTxt("[");}
		if(observationidentifiertype.hasText()) {

			o.addObsrvtnIdTypTxt(String.valueOf(observationidentifiertype.getText()));
		} else {
			o.addObsrvtnIdTypTxt("NULL");
		}

		if(observationidentifieri == observationidentifierlist.size()-1) {o.addObsrvtnIdTypTxt("]");}


		/******************** observationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationidentifiertypecodinglist = observationidentifiertype.getCoding();
		for(int observationidentifiertypecodingi = 0; observationidentifiertypecodingi<observationidentifiertypecodinglist.size();observationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationidentifiertypecoding = observationidentifiertypecodinglist.get(observationidentifiertypecodingi);

		/******************** Obsrvtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(observationidentifiertypecodingi == 0) {o.addObsrvtnIdTypCdgDsply("[[");}
		if(observationidentifiertypecoding.hasDisplay()) {

			o.addObsrvtnIdTypCdgDsply(String.valueOf(observationidentifiertypecoding.getDisplay()));
		} else {
			o.addObsrvtnIdTypCdgDsply("NULL");
		}

		if(observationidentifiertypecodingi == observationidentifiertypecodinglist.size()-1) {o.addObsrvtnIdTypCdgDsply("]]");}


		/******************** Obsrvtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationidentifiertypecodingi == 0) {o.addObsrvtnIdTypCdgVrsn("[[");}
		if(observationidentifiertypecoding.hasVersion()) {

			o.addObsrvtnIdTypCdgVrsn(String.valueOf(observationidentifiertypecoding.getVersion()));
		} else {
			o.addObsrvtnIdTypCdgVrsn("NULL");
		}

		if(observationidentifiertypecodingi == observationidentifiertypecodinglist.size()-1) {o.addObsrvtnIdTypCdgVrsn("]]");}


		/******************** Obsrvtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(observationidentifiertypecodingi == 0) {o.addObsrvtnIdTypCdgCd("[[");}
		if(observationidentifiertypecoding.hasCode()) {

			o.addObsrvtnIdTypCdgCd(String.valueOf(observationidentifiertypecoding.getCode()));
		} else {
			o.addObsrvtnIdTypCdgCd("NULL");
		}

		if(observationidentifiertypecodingi == observationidentifiertypecodinglist.size()-1) {o.addObsrvtnIdTypCdgCd("]]");}


		/******************** Obsrvtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationidentifiertypecodingi == 0) {o.addObsrvtnIdTypCdgUsrSltd("[[");}
		if(observationidentifiertypecoding.hasUserSelected()) {

			o.addObsrvtnIdTypCdgUsrSltd(String.valueOf(observationidentifiertypecoding.getUserSelected()));
		} else {
			o.addObsrvtnIdTypCdgUsrSltd("NULL");
		}

		if(observationidentifiertypecodingi == observationidentifiertypecodinglist.size()-1) {o.addObsrvtnIdTypCdgUsrSltd("]]");}


		/******************** Obsrvtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(observationidentifiertypecodingi == 0) {o.addObsrvtnIdTypCdgSys("[[");}
		if(observationidentifiertypecoding.hasSystem()) {

			o.addObsrvtnIdTypCdgSys(String.valueOf(observationidentifiertypecoding.getSystem()));
		} else {
			o.addObsrvtnIdTypCdgSys("NULL");
		}

		if(observationidentifiertypecodingi == observationidentifiertypecodinglist.size()-1) {o.addObsrvtnIdTypCdgSys("]]");}


		 };
		/******************** observationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationidentifierperiod = observationidentifier.getPeriod();

		/******************** Obsrvtn_Id_Prd_Strt ********************************************************************************/
		if(observationidentifieri == 0) {o.addObsrvtnIdPrdStrt("[");}
		if(observationidentifierperiod.hasStart()) {

			o.addObsrvtnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationidentifierperiod.getStart())+"\"");
		} else {
			o.addObsrvtnIdPrdStrt("NULL");
		}

		if(observationidentifieri == observationidentifierlist.size()-1) {o.addObsrvtnIdPrdStrt("]");}


		/******************** Obsrvtn_Id_Prd_End ********************************************************************************/
		if(observationidentifieri == 0) {o.addObsrvtnIdPrdEnd("[");}
		if(observationidentifierperiod.hasEnd()) {

			o.addObsrvtnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationidentifierperiod.getEnd())+"\"");
		} else {
			o.addObsrvtnIdPrdEnd("NULL");
		}

		if(observationidentifieri == observationidentifierlist.size()-1) {o.addObsrvtnIdPrdEnd("]");}


		/******************** observationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse observationidentifieruse = observationidentifier.getUse();
		if(observationidentifieruse!=null) {
		if(observationidentifieri == 0) {

		o.addObsrvtnIdUse("[");		}
			o.addObsrvtnIdUse(observationidentifieruse.toCode());
		if(observationidentifieri == observationidentifierlist.size()-1) {

		o.addObsrvtnIdUse("]");		}

		} else {
			o.addObsrvtnIdUse("NULL");
		}

		/******************** Obsrvtn_Id_Assigner ********************************************************************************/
		if(observationidentifieri == 0) {o.addObsrvtnIdAssigner("[");}
		if(observationidentifier.hasAssigner()) {

			if(observationidentifier.getAssigner().getReference() != null) {
			o.addObsrvtnIdAssigner(observationidentifier.getAssigner().getReference());
			}
		} else {
			o.addObsrvtnIdAssigner("NULL");
		}

		if(observationidentifieri == observationidentifierlist.size()-1) {o.addObsrvtnIdAssigner("]");}


		/******************** Obsrvtn_Id_Sys ********************************************************************************/
		if(observationidentifieri == 0) {o.addObsrvtnIdSys("[");}
		if(observationidentifier.hasSystem()) {

			o.addObsrvtnIdSys(String.valueOf(observationidentifier.getSystem()));
		} else {
			o.addObsrvtnIdSys("NULL");
		}

		if(observationidentifieri == observationidentifierlist.size()-1) {o.addObsrvtnIdSys("]");}


		 };
		/******************** observationcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> observationcategorylist = observation.getCategory();
		for(int observationcategoryi = 0; observationcategoryi<observationcategorylist.size();observationcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  observationcategory = observationcategorylist.get(observationcategoryi);

		/******************** Obsrvtn_Ctgry_Txt ********************************************************************************/
		if(observationcategoryi == 0) {o.addObsrvtnCtgryTxt("[");}
		if(observationcategory.hasText()) {

			o.addObsrvtnCtgryTxt(String.valueOf(observationcategory.getText()));
		} else {
			o.addObsrvtnCtgryTxt("NULL");
		}

		if(observationcategoryi == observationcategorylist.size()-1) {o.addObsrvtnCtgryTxt("]");}


		/******************** observationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcategorycodinglist = observationcategory.getCoding();
		for(int observationcategorycodingi = 0; observationcategorycodingi<observationcategorycodinglist.size();observationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcategorycoding = observationcategorycodinglist.get(observationcategorycodingi);

		/******************** Obsrvtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(observationcategorycodingi == 0) {o.addObsrvtnCtgryCdgDsply("[[");}
		if(observationcategorycoding.hasDisplay()) {

			o.addObsrvtnCtgryCdgDsply(String.valueOf(observationcategorycoding.getDisplay()));
		} else {
			o.addObsrvtnCtgryCdgDsply("NULL");
		}

		if(observationcategorycodingi == observationcategorycodinglist.size()-1) {o.addObsrvtnCtgryCdgDsply("]]");}


		/******************** Obsrvtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(observationcategorycodingi == 0) {o.addObsrvtnCtgryCdgVrsn("[[");}
		if(observationcategorycoding.hasVersion()) {

			o.addObsrvtnCtgryCdgVrsn(String.valueOf(observationcategorycoding.getVersion()));
		} else {
			o.addObsrvtnCtgryCdgVrsn("NULL");
		}

		if(observationcategorycodingi == observationcategorycodinglist.size()-1) {o.addObsrvtnCtgryCdgVrsn("]]");}


		/******************** Obsrvtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(observationcategorycodingi == 0) {o.addObsrvtnCtgryCdgCd("[[");}
		if(observationcategorycoding.hasCode()) {

			o.addObsrvtnCtgryCdgCd(String.valueOf(observationcategorycoding.getCode()));
		} else {
			o.addObsrvtnCtgryCdgCd("NULL");
		}

		if(observationcategorycodingi == observationcategorycodinglist.size()-1) {o.addObsrvtnCtgryCdgCd("]]");}


		/******************** Obsrvtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(observationcategorycodingi == 0) {o.addObsrvtnCtgryCdgUsrSltd("[[");}
		if(observationcategorycoding.hasUserSelected()) {

			o.addObsrvtnCtgryCdgUsrSltd(String.valueOf(observationcategorycoding.getUserSelected()));
		} else {
			o.addObsrvtnCtgryCdgUsrSltd("NULL");
		}

		if(observationcategorycodingi == observationcategorycodinglist.size()-1) {o.addObsrvtnCtgryCdgUsrSltd("]]");}


		/******************** Obsrvtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(observationcategorycodingi == 0) {o.addObsrvtnCtgryCdgSys("[[");}
		if(observationcategorycoding.hasSystem()) {

			o.addObsrvtnCtgryCdgSys(String.valueOf(observationcategorycoding.getSystem()));
		} else {
			o.addObsrvtnCtgryCdgSys("NULL");
		}

		if(observationcategorycodingi == observationcategorycodinglist.size()-1) {o.addObsrvtnCtgryCdgSys("]]");}


		 };
		 };
		/******************** observationbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationbodysite = observation.getBodySite();

		/******************** Obsrvtn_BodySite_Txt ********************************************************************************/
		if(observationbodysite.hasText()) {

			o.addObsrvtnBodySiteTxt(String.valueOf(observationbodysite.getText()));
		} else {
			o.addObsrvtnBodySiteTxt("NULL");
		}


		/******************** observationbodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationbodysitecodinglist = observationbodysite.getCoding();
		for(int observationbodysitecodingi = 0; observationbodysitecodingi<observationbodysitecodinglist.size();observationbodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationbodysitecoding = observationbodysitecodinglist.get(observationbodysitecodingi);

		/******************** Obsrvtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(observationbodysitecodingi == 0) {o.addObsrvtnBodySiteCdgDsply("[");}
		if(observationbodysitecoding.hasDisplay()) {

			o.addObsrvtnBodySiteCdgDsply(String.valueOf(observationbodysitecoding.getDisplay()));
		} else {
			o.addObsrvtnBodySiteCdgDsply("NULL");
		}

		if(observationbodysitecodingi == observationbodysitecodinglist.size()-1) {o.addObsrvtnBodySiteCdgDsply("]");}


		/******************** Obsrvtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(observationbodysitecodingi == 0) {o.addObsrvtnBodySiteCdgVrsn("[");}
		if(observationbodysitecoding.hasVersion()) {

			o.addObsrvtnBodySiteCdgVrsn(String.valueOf(observationbodysitecoding.getVersion()));
		} else {
			o.addObsrvtnBodySiteCdgVrsn("NULL");
		}

		if(observationbodysitecodingi == observationbodysitecodinglist.size()-1) {o.addObsrvtnBodySiteCdgVrsn("]");}


		/******************** Obsrvtn_BodySite_Cdg_Cd ********************************************************************************/
		if(observationbodysitecodingi == 0) {o.addObsrvtnBodySiteCdgCd("[");}
		if(observationbodysitecoding.hasCode()) {

			o.addObsrvtnBodySiteCdgCd(String.valueOf(observationbodysitecoding.getCode()));
		} else {
			o.addObsrvtnBodySiteCdgCd("NULL");
		}

		if(observationbodysitecodingi == observationbodysitecodinglist.size()-1) {o.addObsrvtnBodySiteCdgCd("]");}


		/******************** Obsrvtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(observationbodysitecodingi == 0) {o.addObsrvtnBodySiteCdgUsrSltd("[");}
		if(observationbodysitecoding.hasUserSelected()) {

			o.addObsrvtnBodySiteCdgUsrSltd(String.valueOf(observationbodysitecoding.getUserSelected()));
		} else {
			o.addObsrvtnBodySiteCdgUsrSltd("NULL");
		}

		if(observationbodysitecodingi == observationbodysitecodinglist.size()-1) {o.addObsrvtnBodySiteCdgUsrSltd("]");}


		/******************** Obsrvtn_BodySite_Cdg_Sys ********************************************************************************/
		if(observationbodysitecodingi == 0) {o.addObsrvtnBodySiteCdgSys("[");}
		if(observationbodysitecoding.hasSystem()) {

			o.addObsrvtnBodySiteCdgSys(String.valueOf(observationbodysitecoding.getSystem()));
		} else {
			o.addObsrvtnBodySiteCdgSys("NULL");
		}

		if(observationbodysitecodingi == observationbodysitecodinglist.size()-1) {o.addObsrvtnBodySiteCdgSys("]");}


		 };
		/******************** Obsrvtn_EfctiveDtTimeTyp ********************************************************************************/
		if(observation.hasEffectiveDateTimeType()) {

			o.addObsrvtnEfctiveDtTimeTyp("\""+observation.getEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnEfctiveDtTimeTyp("NULL");
		}


		/******************** Obsrvtn_Focus ********************************************************************************/
		if(observation.hasFocus()) {

			String  array = "[";
			for(int incr=0; incr<observation.getFocus().size(); incr++) {
				array = array + observation.getFocus().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnFocus(array);

		} else {
			o.addObsrvtnFocus("NULL");
		}


		/******************** Obsrvtn_Prfrmr ********************************************************************************/
		if(observation.hasPerformer()) {

			String  array = "[";
			for(int incr=0; incr<observation.getPerformer().size(); incr++) {
				array = array + observation.getPerformer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnPrfrmr(array);

		} else {
			o.addObsrvtnPrfrmr("NULL");
		}


		/******************** observationdataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdataabsentreason = observation.getDataAbsentReason();

		/******************** Obsrvtn_DataAbsentRsn_Txt ********************************************************************************/
		if(observationdataabsentreason.hasText()) {

			o.addObsrvtnDataAbsentRsnTxt(String.valueOf(observationdataabsentreason.getText()));
		} else {
			o.addObsrvtnDataAbsentRsnTxt("NULL");
		}


		/******************** observationdataabsentreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationdataabsentreasoncodinglist = observationdataabsentreason.getCoding();
		for(int observationdataabsentreasoncodingi = 0; observationdataabsentreasoncodingi<observationdataabsentreasoncodinglist.size();observationdataabsentreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationdataabsentreasoncoding = observationdataabsentreasoncodinglist.get(observationdataabsentreasoncodingi);

		/******************** Obsrvtn_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(observationdataabsentreasoncodingi == 0) {o.addObsrvtnDataAbsentRsnCdgDsply("[");}
		if(observationdataabsentreasoncoding.hasDisplay()) {

			o.addObsrvtnDataAbsentRsnCdgDsply(String.valueOf(observationdataabsentreasoncoding.getDisplay()));
		} else {
			o.addObsrvtnDataAbsentRsnCdgDsply("NULL");
		}

		if(observationdataabsentreasoncodingi == observationdataabsentreasoncodinglist.size()-1) {o.addObsrvtnDataAbsentRsnCdgDsply("]");}


		/******************** Obsrvtn_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(observationdataabsentreasoncodingi == 0) {o.addObsrvtnDataAbsentRsnCdgVrsn("[");}
		if(observationdataabsentreasoncoding.hasVersion()) {

			o.addObsrvtnDataAbsentRsnCdgVrsn(String.valueOf(observationdataabsentreasoncoding.getVersion()));
		} else {
			o.addObsrvtnDataAbsentRsnCdgVrsn("NULL");
		}

		if(observationdataabsentreasoncodingi == observationdataabsentreasoncodinglist.size()-1) {o.addObsrvtnDataAbsentRsnCdgVrsn("]");}


		/******************** Obsrvtn_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(observationdataabsentreasoncodingi == 0) {o.addObsrvtnDataAbsentRsnCdgCd("[");}
		if(observationdataabsentreasoncoding.hasCode()) {

			o.addObsrvtnDataAbsentRsnCdgCd(String.valueOf(observationdataabsentreasoncoding.getCode()));
		} else {
			o.addObsrvtnDataAbsentRsnCdgCd("NULL");
		}

		if(observationdataabsentreasoncodingi == observationdataabsentreasoncodinglist.size()-1) {o.addObsrvtnDataAbsentRsnCdgCd("]");}


		/******************** Obsrvtn_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(observationdataabsentreasoncodingi == 0) {o.addObsrvtnDataAbsentRsnCdgUsrSltd("[");}
		if(observationdataabsentreasoncoding.hasUserSelected()) {

			o.addObsrvtnDataAbsentRsnCdgUsrSltd(String.valueOf(observationdataabsentreasoncoding.getUserSelected()));
		} else {
			o.addObsrvtnDataAbsentRsnCdgUsrSltd("NULL");
		}

		if(observationdataabsentreasoncodingi == observationdataabsentreasoncodinglist.size()-1) {o.addObsrvtnDataAbsentRsnCdgUsrSltd("]");}


		/******************** Obsrvtn_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(observationdataabsentreasoncodingi == 0) {o.addObsrvtnDataAbsentRsnCdgSys("[");}
		if(observationdataabsentreasoncoding.hasSystem()) {

			o.addObsrvtnDataAbsentRsnCdgSys(String.valueOf(observationdataabsentreasoncoding.getSystem()));
		} else {
			o.addObsrvtnDataAbsentRsnCdgSys("NULL");
		}

		if(observationdataabsentreasoncodingi == observationdataabsentreasoncodinglist.size()-1) {o.addObsrvtnDataAbsentRsnCdgSys("]");}


		 };
		/******************** Obsrvtn_DerivedFrom ********************************************************************************/
		if(observation.hasDerivedFrom()) {

			String  array = "[";
			for(int incr=0; incr<observation.getDerivedFrom().size(); incr++) {
				array = array + observation.getDerivedFrom().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnDerivedFrom(array);

		} else {
			o.addObsrvtnDerivedFrom("NULL");
		}


		/******************** Obsrvtn_Dvc ********************************************************************************/
		if(observation.hasDevice()) {

			if(observation.getDevice().getReference() != null) {
			o.addObsrvtnDvc(observation.getDevice().getReference());
			}
		} else {
			o.addObsrvtnDvc("NULL");
		}


		/******************** Obsrvtn_Issued ********************************************************************************/
		if(observation.hasIssued()) {

			o.addObsrvtnIssued("\""+ca.uhn.fhir.util.DateUtils.formatDate(observation.getIssued())+"\"");
		} else {
			o.addObsrvtnIssued("NULL");
		}


		/******************** observationeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationeffectiveperiod = observation.getEffectivePeriod();

		/******************** Obsrvtn_EfctivePrd_Strt ********************************************************************************/
		if(observationeffectiveperiod.hasStart()) {

			o.addObsrvtnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationeffectiveperiod.getStart())+"\"");
		} else {
			o.addObsrvtnEfctivePrdStrt("NULL");
		}


		/******************** Obsrvtn_EfctivePrd_End ********************************************************************************/
		if(observationeffectiveperiod.hasEnd()) {

			o.addObsrvtnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationeffectiveperiod.getEnd())+"\"");
		} else {
			o.addObsrvtnEfctivePrdEnd("NULL");
		}


		/******************** Obsrvtn_Spcmn ********************************************************************************/
		if(observation.hasSpecimen()) {

			if(observation.getSpecimen().getReference() != null) {
			o.addObsrvtnSpcmn(observation.getSpecimen().getReference());
			}
		} else {
			o.addObsrvtnSpcmn("NULL");
		}


		/******************** Obsrvtn_VlBooleanTyp ********************************************************************************/
		if(observation.hasValueBooleanType()) {

			o.addObsrvtnVlBooleanTyp("\""+observation.getValueBooleanType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnVlBooleanTyp("NULL");
		}


		/******************** Obsrvtn_VlDtTimeTyp ********************************************************************************/
		if(observation.hasValueDateTimeType()) {

			o.addObsrvtnVlDtTimeTyp("\""+observation.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnVlDtTimeTyp("NULL");
		}


		/******************** observationvaluesampleddata ********************************************************************************/
		org.hl7.fhir.r4.model.SampledData observationvaluesampleddata = observation.getValueSampledData();

		/******************** Obsrvtn_VlSampledData_Dimensions ********************************************************************************/
		if(observationvaluesampleddata.hasDimensions()) {

			o.addObsrvtnVlSampledDataDimensions(String.valueOf(observationvaluesampleddata.getDimensions()));
		} else {
			o.addObsrvtnVlSampledDataDimensions("NULL");
		}


		/******************** Obsrvtn_VlSampledData_Prd ********************************************************************************/
		if(observationvaluesampleddata.hasPeriod()) {

			o.addObsrvtnVlSampledDataPrd(String.valueOf(observationvaluesampleddata.getPeriod()));
		} else {
			o.addObsrvtnVlSampledDataPrd("NULL");
		}


		/******************** observationvaluesampleddataorigin ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluesampleddataorigin = observationvaluesampleddata.getOrigin();

		/******************** Obsrvtn_VlSampledData_Origin_Vl ********************************************************************************/
		if(observationvaluesampleddataorigin.hasValue()) {

			o.addObsrvtnVlSampledDataOriginVl(String.valueOf(observationvaluesampleddataorigin.getValue()));
		} else {
			o.addObsrvtnVlSampledDataOriginVl("NULL");
		}


		/******************** observationvaluesampleddataorigincomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluesampleddataorigincomparator = observationvaluesampleddataorigin.getComparator();
		if(observationvaluesampleddataorigincomparator!=null) {
			o.addObsrvtnVlSampledDataOriginCmprtr(observationvaluesampleddataorigincomparator.toCode());
		} else {
			o.addObsrvtnVlSampledDataOriginCmprtr("NULL");
		}

		/******************** Obsrvtn_VlSampledData_Origin_Cd ********************************************************************************/
		if(observationvaluesampleddataorigin.hasCode()) {

			o.addObsrvtnVlSampledDataOriginCd(String.valueOf(observationvaluesampleddataorigin.getCode()));
		} else {
			o.addObsrvtnVlSampledDataOriginCd("NULL");
		}


		/******************** Obsrvtn_VlSampledData_Origin_Unt ********************************************************************************/
		if(observationvaluesampleddataorigin.hasUnit()) {

			o.addObsrvtnVlSampledDataOriginUnt(String.valueOf(observationvaluesampleddataorigin.getUnit()));
		} else {
			o.addObsrvtnVlSampledDataOriginUnt("NULL");
		}


		/******************** Obsrvtn_VlSampledData_Origin_Sys ********************************************************************************/
		if(observationvaluesampleddataorigin.hasSystem()) {

			o.addObsrvtnVlSampledDataOriginSys(String.valueOf(observationvaluesampleddataorigin.getSystem()));
		} else {
			o.addObsrvtnVlSampledDataOriginSys("NULL");
		}


		/******************** Obsrvtn_VlSampledData_Data ********************************************************************************/
		if(observationvaluesampleddata.hasData()) {

			o.addObsrvtnVlSampledDataData(String.valueOf(observationvaluesampleddata.getData()));
		} else {
			o.addObsrvtnVlSampledDataData("NULL");
		}


		/******************** Obsrvtn_VlSampledData_Factor ********************************************************************************/
		if(observationvaluesampleddata.hasFactor()) {

			o.addObsrvtnVlSampledDataFactor(String.valueOf(observationvaluesampleddata.getFactor()));
		} else {
			o.addObsrvtnVlSampledDataFactor("NULL");
		}


		/******************** Obsrvtn_VlSampledData_UpperLmt ********************************************************************************/
		if(observationvaluesampleddata.hasUpperLimit()) {

			o.addObsrvtnVlSampledDataUpperLmt(String.valueOf(observationvaluesampleddata.getUpperLimit()));
		} else {
			o.addObsrvtnVlSampledDataUpperLmt("NULL");
		}


		/******************** Obsrvtn_VlSampledData_LwerLmt ********************************************************************************/
		if(observationvaluesampleddata.hasLowerLimit()) {

			o.addObsrvtnVlSampledDataLwerLmt(String.valueOf(observationvaluesampleddata.getLowerLimit()));
		} else {
			o.addObsrvtnVlSampledDataLwerLmt("NULL");
		}


		/******************** Obsrvtn_EfctiveInstantTyp ********************************************************************************/
		if(observation.hasEffectiveInstantType()) {

			o.addObsrvtnEfctiveInstantTyp("\""+observation.getEffectiveInstantType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnEfctiveInstantTyp("NULL");
		}


		/******************** observationvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationvaluecodeableconcept = observation.getValueCodeableConcept();

		/******************** Obsrvtn_VlCdbleCncpt_Txt ********************************************************************************/
		if(observationvaluecodeableconcept.hasText()) {

			o.addObsrvtnVlCdbleCncptTxt(String.valueOf(observationvaluecodeableconcept.getText()));
		} else {
			o.addObsrvtnVlCdbleCncptTxt("NULL");
		}


		/******************** observationvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationvaluecodeableconceptcodinglist = observationvaluecodeableconcept.getCoding();
		for(int observationvaluecodeableconceptcodingi = 0; observationvaluecodeableconceptcodingi<observationvaluecodeableconceptcodinglist.size();observationvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationvaluecodeableconceptcoding = observationvaluecodeableconceptcodinglist.get(observationvaluecodeableconceptcodingi);

		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(observationvaluecodeableconceptcodingi == 0) {o.addObsrvtnVlCdbleCncptCdgDsply("[");}
		if(observationvaluecodeableconceptcoding.hasDisplay()) {

			o.addObsrvtnVlCdbleCncptCdgDsply(String.valueOf(observationvaluecodeableconceptcoding.getDisplay()));
		} else {
			o.addObsrvtnVlCdbleCncptCdgDsply("NULL");
		}

		if(observationvaluecodeableconceptcodingi == observationvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnVlCdbleCncptCdgDsply("]");}


		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(observationvaluecodeableconceptcodingi == 0) {o.addObsrvtnVlCdbleCncptCdgVrsn("[");}
		if(observationvaluecodeableconceptcoding.hasVersion()) {

			o.addObsrvtnVlCdbleCncptCdgVrsn(String.valueOf(observationvaluecodeableconceptcoding.getVersion()));
		} else {
			o.addObsrvtnVlCdbleCncptCdgVrsn("NULL");
		}

		if(observationvaluecodeableconceptcodingi == observationvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnVlCdbleCncptCdgVrsn("]");}


		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(observationvaluecodeableconceptcodingi == 0) {o.addObsrvtnVlCdbleCncptCdgCd("[");}
		if(observationvaluecodeableconceptcoding.hasCode()) {

			o.addObsrvtnVlCdbleCncptCdgCd(String.valueOf(observationvaluecodeableconceptcoding.getCode()));
		} else {
			o.addObsrvtnVlCdbleCncptCdgCd("NULL");
		}

		if(observationvaluecodeableconceptcodingi == observationvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnVlCdbleCncptCdgCd("]");}


		/******************** Obsrvtn_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(observationvaluecodeableconceptcodingi == 0) {o.addObsrvtnVlCdbleCncptCdgUsrSltd("[");}
		if(observationvaluecodeableconceptcoding.hasUserSelected()) {

			o.addObsrvtnVlCdbleCncptCdgUsrSltd(String.valueOf(observationvaluecodeableconceptcoding.getUserSelected()));
		} else {
			o.addObsrvtnVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(observationvaluecodeableconceptcodingi == observationvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnVlCdbleCncptCdgUsrSltd("]");}


		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(observationvaluecodeableconceptcodingi == 0) {o.addObsrvtnVlCdbleCncptCdgSys("[");}
		if(observationvaluecodeableconceptcoding.hasSystem()) {

			o.addObsrvtnVlCdbleCncptCdgSys(String.valueOf(observationvaluecodeableconceptcoding.getSystem()));
		} else {
			o.addObsrvtnVlCdbleCncptCdgSys("NULL");
		}

		if(observationvaluecodeableconceptcodingi == observationvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnVlCdbleCncptCdgSys("]");}


		 };
		/******************** Obsrvtn_VlIntegerTyp ********************************************************************************/
		if(observation.hasValueIntegerType()) {

			o.addObsrvtnVlIntegerTyp("\""+observation.getValueIntegerType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnVlIntegerTyp("NULL");
		}


		/******************** Obsrvtn_PartOf ********************************************************************************/
		if(observation.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<observation.getPartOf().size(); incr++) {
				array = array + observation.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnPartOf(array);

		} else {
			o.addObsrvtnPartOf("NULL");
		}


		/******************** Obsrvtn_VlTimeTyp ********************************************************************************/
		if(observation.hasValueTimeType()) {

			o.addObsrvtnVlTimeTyp("\""+observation.getValueTimeType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnVlTimeTyp("NULL");
		}


		/******************** observationvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationvaluerange = observation.getValueRange();

		/******************** observationvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerangelow = observationvaluerange.getLow();

		/******************** Obsrvtn_VlRng_Lw_Vl ********************************************************************************/
		if(observationvaluerangelow.hasValue()) {

			o.addObsrvtnVlRngLwVl(String.valueOf(observationvaluerangelow.getValue()));
		} else {
			o.addObsrvtnVlRngLwVl("NULL");
		}


		/******************** observationvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluerangelowcomparator = observationvaluerangelow.getComparator();
		if(observationvaluerangelowcomparator!=null) {
			o.addObsrvtnVlRngLwCmprtr(observationvaluerangelowcomparator.toCode());
		} else {
			o.addObsrvtnVlRngLwCmprtr("NULL");
		}

		/******************** Obsrvtn_VlRng_Lw_Cd ********************************************************************************/
		if(observationvaluerangelow.hasCode()) {

			o.addObsrvtnVlRngLwCd(String.valueOf(observationvaluerangelow.getCode()));
		} else {
			o.addObsrvtnVlRngLwCd("NULL");
		}


		/******************** Obsrvtn_VlRng_Lw_Unt ********************************************************************************/
		if(observationvaluerangelow.hasUnit()) {

			o.addObsrvtnVlRngLwUnt(String.valueOf(observationvaluerangelow.getUnit()));
		} else {
			o.addObsrvtnVlRngLwUnt("NULL");
		}


		/******************** Obsrvtn_VlRng_Lw_Sys ********************************************************************************/
		if(observationvaluerangelow.hasSystem()) {

			o.addObsrvtnVlRngLwSys(String.valueOf(observationvaluerangelow.getSystem()));
		} else {
			o.addObsrvtnVlRngLwSys("NULL");
		}


		/******************** observationvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerangehigh = observationvaluerange.getHigh();

		/******************** Obsrvtn_VlRng_Hi_Vl ********************************************************************************/
		if(observationvaluerangehigh.hasValue()) {

			o.addObsrvtnVlRngHiVl(String.valueOf(observationvaluerangehigh.getValue()));
		} else {
			o.addObsrvtnVlRngHiVl("NULL");
		}


		/******************** observationvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluerangehighcomparator = observationvaluerangehigh.getComparator();
		if(observationvaluerangehighcomparator!=null) {
			o.addObsrvtnVlRngHiCmprtr(observationvaluerangehighcomparator.toCode());
		} else {
			o.addObsrvtnVlRngHiCmprtr("NULL");
		}

		/******************** Obsrvtn_VlRng_Hi_Cd ********************************************************************************/
		if(observationvaluerangehigh.hasCode()) {

			o.addObsrvtnVlRngHiCd(String.valueOf(observationvaluerangehigh.getCode()));
		} else {
			o.addObsrvtnVlRngHiCd("NULL");
		}


		/******************** Obsrvtn_VlRng_Hi_Unt ********************************************************************************/
		if(observationvaluerangehigh.hasUnit()) {

			o.addObsrvtnVlRngHiUnt(String.valueOf(observationvaluerangehigh.getUnit()));
		} else {
			o.addObsrvtnVlRngHiUnt("NULL");
		}


		/******************** Obsrvtn_VlRng_Hi_Sys ********************************************************************************/
		if(observationvaluerangehigh.hasSystem()) {

			o.addObsrvtnVlRngHiSys(String.valueOf(observationvaluerangehigh.getSystem()));
		} else {
			o.addObsrvtnVlRngHiSys("NULL");
		}


		/******************** observationeffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing observationeffectivetiming = observation.getEffectiveTiming();

		/******************** observationeffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationeffectivetimingcode = observationeffectivetiming.getCode();

		/******************** Obsrvtn_EfctiveTmg_Cd_Txt ********************************************************************************/
		if(observationeffectivetimingcode.hasText()) {

			o.addObsrvtnEfctiveTmgCdTxt(String.valueOf(observationeffectivetimingcode.getText()));
		} else {
			o.addObsrvtnEfctiveTmgCdTxt("NULL");
		}


		/******************** observationeffectivetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationeffectivetimingcodecodinglist = observationeffectivetimingcode.getCoding();
		for(int observationeffectivetimingcodecodingi = 0; observationeffectivetimingcodecodingi<observationeffectivetimingcodecodinglist.size();observationeffectivetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationeffectivetimingcodecoding = observationeffectivetimingcodecodinglist.get(observationeffectivetimingcodecodingi);

		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(observationeffectivetimingcodecodingi == 0) {o.addObsrvtnEfctiveTmgCdCdgDsply("[");}
		if(observationeffectivetimingcodecoding.hasDisplay()) {

			o.addObsrvtnEfctiveTmgCdCdgDsply(String.valueOf(observationeffectivetimingcodecoding.getDisplay()));
		} else {
			o.addObsrvtnEfctiveTmgCdCdgDsply("NULL");
		}

		if(observationeffectivetimingcodecodingi == observationeffectivetimingcodecodinglist.size()-1) {o.addObsrvtnEfctiveTmgCdCdgDsply("]");}


		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationeffectivetimingcodecodingi == 0) {o.addObsrvtnEfctiveTmgCdCdgVrsn("[");}
		if(observationeffectivetimingcodecoding.hasVersion()) {

			o.addObsrvtnEfctiveTmgCdCdgVrsn(String.valueOf(observationeffectivetimingcodecoding.getVersion()));
		} else {
			o.addObsrvtnEfctiveTmgCdCdgVrsn("NULL");
		}

		if(observationeffectivetimingcodecodingi == observationeffectivetimingcodecodinglist.size()-1) {o.addObsrvtnEfctiveTmgCdCdgVrsn("]");}


		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(observationeffectivetimingcodecodingi == 0) {o.addObsrvtnEfctiveTmgCdCdgCd("[");}
		if(observationeffectivetimingcodecoding.hasCode()) {

			o.addObsrvtnEfctiveTmgCdCdgCd(String.valueOf(observationeffectivetimingcodecoding.getCode()));
		} else {
			o.addObsrvtnEfctiveTmgCdCdgCd("NULL");
		}

		if(observationeffectivetimingcodecodingi == observationeffectivetimingcodecodinglist.size()-1) {o.addObsrvtnEfctiveTmgCdCdgCd("]");}


		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationeffectivetimingcodecodingi == 0) {o.addObsrvtnEfctiveTmgCdCdgUsrSltd("[");}
		if(observationeffectivetimingcodecoding.hasUserSelected()) {

			o.addObsrvtnEfctiveTmgCdCdgUsrSltd(String.valueOf(observationeffectivetimingcodecoding.getUserSelected()));
		} else {
			o.addObsrvtnEfctiveTmgCdCdgUsrSltd("NULL");
		}

		if(observationeffectivetimingcodecodingi == observationeffectivetimingcodecodinglist.size()-1) {o.addObsrvtnEfctiveTmgCdCdgUsrSltd("]");}


		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(observationeffectivetimingcodecodingi == 0) {o.addObsrvtnEfctiveTmgCdCdgSys("[");}
		if(observationeffectivetimingcodecoding.hasSystem()) {

			o.addObsrvtnEfctiveTmgCdCdgSys(String.valueOf(observationeffectivetimingcodecoding.getSystem()));
		} else {
			o.addObsrvtnEfctiveTmgCdCdgSys("NULL");
		}

		if(observationeffectivetimingcodecodingi == observationeffectivetimingcodecodinglist.size()-1) {o.addObsrvtnEfctiveTmgCdCdgSys("]");}


		 };
		/******************** Obsrvtn_EfctiveTmg_Evnt ********************************************************************************/
		if(observationeffectivetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<observationeffectivetiming.getEvent().size(); incr++) {
				array = array + observationeffectivetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnEfctiveTmgEvnt(array);

		} else {
			o.addObsrvtnEfctiveTmgEvnt("NULL");
		}


		/******************** observationeffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent observationeffectivetimingrepeat = observationeffectivetiming.getRepeat();

		/******************** Obsrvtn_EfctiveTmg_Rpt_Off ********************************************************************************/
		if(observationeffectivetimingrepeat.hasOffset()) {

			o.addObsrvtnEfctiveTmgRptOff(String.valueOf(observationeffectivetimingrepeat.getOffset()));
		} else {
			o.addObsrvtnEfctiveTmgRptOff("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(observationeffectivetimingrepeat.hasCount()) {

			o.addObsrvtnEfctiveTmgRptCnt(String.valueOf(observationeffectivetimingrepeat.getCount()));
		} else {
			o.addObsrvtnEfctiveTmgRptCnt("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_Prd ********************************************************************************/
		if(observationeffectivetimingrepeat.hasPeriod()) {

			o.addObsrvtnEfctiveTmgRptPrd(String.valueOf(observationeffectivetimingrepeat.getPeriod()));
		} else {
			o.addObsrvtnEfctiveTmgRptPrd("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasCountMax()) {

			o.addObsrvtnEfctiveTmgRptCntMx(String.valueOf(observationeffectivetimingrepeat.getCountMax()));
		} else {
			o.addObsrvtnEfctiveTmgRptCntMx("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasDurationMax()) {

			o.addObsrvtnEfctiveTmgRptDurationMx(String.valueOf(observationeffectivetimingrepeat.getDurationMax()));
		} else {
			o.addObsrvtnEfctiveTmgRptDurationMx("NULL");
		}


		/******************** observationeffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationeffectivetimingrepeatboundsperiod = observationeffectivetimingrepeat.getBoundsPeriod();

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(observationeffectivetimingrepeatboundsperiod.hasStart()) {

			o.addObsrvtnEfctiveTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationeffectivetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			o.addObsrvtnEfctiveTmgRptBndsPrdStrt("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(observationeffectivetimingrepeatboundsperiod.hasEnd()) {

			o.addObsrvtnEfctiveTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationeffectivetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			o.addObsrvtnEfctiveTmgRptBndsPrdEnd("NULL");
		}


		/******************** observationeffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime observationeffectivetimingrepeatdurationunit = observationeffectivetimingrepeat.getDurationUnit();
		if(observationeffectivetimingrepeatdurationunit!=null) {
			o.addObsrvtnEfctiveTmgRptDurationUnt(observationeffectivetimingrepeatdurationunit.toCode());
		} else {
			o.addObsrvtnEfctiveTmgRptDurationUnt("NULL");
		}

		/******************** observationeffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration observationeffectivetimingrepeatboundsduration = observationeffectivetimingrepeat.getBoundsDuration();

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(observationeffectivetimingrepeatboundsduration.hasValue()) {

			o.addObsrvtnEfctiveTmgRptBndsDurationVl(String.valueOf(observationeffectivetimingrepeatboundsduration.getValue()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsDurationVl("NULL");
		}


		/******************** observationeffectivetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationeffectivetimingrepeatboundsdurationcomparator = observationeffectivetimingrepeatboundsduration.getComparator();
		if(observationeffectivetimingrepeatboundsdurationcomparator!=null) {
			o.addObsrvtnEfctiveTmgRptBndsDurationCmprtr(observationeffectivetimingrepeatboundsdurationcomparator.toCode());
		} else {
			o.addObsrvtnEfctiveTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(observationeffectivetimingrepeatboundsduration.hasCode()) {

			o.addObsrvtnEfctiveTmgRptBndsDurationCd(String.valueOf(observationeffectivetimingrepeatboundsduration.getCode()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsDurationCd("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(observationeffectivetimingrepeatboundsduration.hasUnit()) {

			o.addObsrvtnEfctiveTmgRptBndsDurationUnt(String.valueOf(observationeffectivetimingrepeatboundsduration.getUnit()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsDurationUnt("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(observationeffectivetimingrepeatboundsduration.hasSystem()) {

			o.addObsrvtnEfctiveTmgRptBndsDurationSys(String.valueOf(observationeffectivetimingrepeatboundsduration.getSystem()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsDurationSys("NULL");
		}


		/******************** observationeffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationeffectivetimingrepeatboundsrange = observationeffectivetimingrepeat.getBoundsRange();

		/******************** observationeffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationeffectivetimingrepeatboundsrangelow = observationeffectivetimingrepeatboundsrange.getLow();

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasValue()) {

			o.addObsrvtnEfctiveTmgRptBndsRngLwVl(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getValue()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngLwVl("NULL");
		}


		/******************** observationeffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationeffectivetimingrepeatboundsrangelowcomparator = observationeffectivetimingrepeatboundsrangelow.getComparator();
		if(observationeffectivetimingrepeatboundsrangelowcomparator!=null) {
			o.addObsrvtnEfctiveTmgRptBndsRngLwCmprtr(observationeffectivetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasCode()) {

			o.addObsrvtnEfctiveTmgRptBndsRngLwCd(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getCode()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngLwCd("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasUnit()) {

			o.addObsrvtnEfctiveTmgRptBndsRngLwUnt(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getUnit()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngLwUnt("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasSystem()) {

			o.addObsrvtnEfctiveTmgRptBndsRngLwSys(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getSystem()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngLwSys("NULL");
		}


		/******************** observationeffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationeffectivetimingrepeatboundsrangehigh = observationeffectivetimingrepeatboundsrange.getHigh();

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasValue()) {

			o.addObsrvtnEfctiveTmgRptBndsRngHiVl(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getValue()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngHiVl("NULL");
		}


		/******************** observationeffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationeffectivetimingrepeatboundsrangehighcomparator = observationeffectivetimingrepeatboundsrangehigh.getComparator();
		if(observationeffectivetimingrepeatboundsrangehighcomparator!=null) {
			o.addObsrvtnEfctiveTmgRptBndsRngHiCmprtr(observationeffectivetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasCode()) {

			o.addObsrvtnEfctiveTmgRptBndsRngHiCd(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getCode()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngHiCd("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasUnit()) {

			o.addObsrvtnEfctiveTmgRptBndsRngHiUnt(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getUnit()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngHiUnt("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasSystem()) {

			o.addObsrvtnEfctiveTmgRptBndsRngHiSys(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getSystem()));
		} else {
			o.addObsrvtnEfctiveTmgRptBndsRngHiSys("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasFrequencyMax()) {

			o.addObsrvtnEfctiveTmgRptFrqncyMx(String.valueOf(observationeffectivetimingrepeat.getFrequencyMax()));
		} else {
			o.addObsrvtnEfctiveTmgRptFrqncyMx("NULL");
		}


		/******************** observationeffectivetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> observationeffectivetimingrepeatwhenlist = observationeffectivetimingrepeat.getWhen();
		for(int observationeffectivetimingrepeatwheni = 0; observationeffectivetimingrepeatwheni<observationeffectivetimingrepeatwhenlist.size();observationeffectivetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  observationeffectivetimingrepeatwhen = observationeffectivetimingrepeatwhenlist.get(observationeffectivetimingrepeatwheni);
		if(observationeffectivetimingrepeatwhen!=null) {
			o.addObsrvtnEfctiveTmgRptWhen(observationeffectivetimingrepeatwhen.getCode());
		} else {
			o.addObsrvtnEfctiveTmgRptWhen("NULL");
		}
		 };

		/******************** observationeffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime observationeffectivetimingrepeatperiodunit = observationeffectivetimingrepeat.getPeriodUnit();
		if(observationeffectivetimingrepeatperiodunit!=null) {
			o.addObsrvtnEfctiveTmgRptPrdUnt(observationeffectivetimingrepeatperiodunit.toCode());
		} else {
			o.addObsrvtnEfctiveTmgRptPrdUnt("NULL");
		}

		/******************** Obsrvtn_EfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasPeriodMax()) {

			o.addObsrvtnEfctiveTmgRptPrdMx(String.valueOf(observationeffectivetimingrepeat.getPeriodMax()));
		} else {
			o.addObsrvtnEfctiveTmgRptPrdMx("NULL");
		}


		/******************** observationeffectivetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> observationeffectivetimingrepeatdayofweeklist = observationeffectivetimingrepeat.getDayOfWeek();
		for(int observationeffectivetimingrepeatdayofweeki = 0; observationeffectivetimingrepeatdayofweeki<observationeffectivetimingrepeatdayofweeklist.size();observationeffectivetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  observationeffectivetimingrepeatdayofweek = observationeffectivetimingrepeatdayofweeklist.get(observationeffectivetimingrepeatdayofweeki);
		if(observationeffectivetimingrepeatdayofweek!=null) {
			o.addObsrvtnEfctiveTmgRptDayOfWeek(observationeffectivetimingrepeatdayofweek.getCode());
		} else {
			o.addObsrvtnEfctiveTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** Obsrvtn_EfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(observationeffectivetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<observationeffectivetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + observationeffectivetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnEfctiveTmgRptTimeOfDay(array);

		} else {
			o.addObsrvtnEfctiveTmgRptTimeOfDay("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_Duration ********************************************************************************/
		if(observationeffectivetimingrepeat.hasDuration()) {

			o.addObsrvtnEfctiveTmgRptDuration(String.valueOf(observationeffectivetimingrepeat.getDuration()));
		} else {
			o.addObsrvtnEfctiveTmgRptDuration("NULL");
		}


		/******************** Obsrvtn_EfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(observationeffectivetimingrepeat.hasFrequency()) {

			o.addObsrvtnEfctiveTmgRptFrqncy(String.valueOf(observationeffectivetimingrepeat.getFrequency()));
		} else {
			o.addObsrvtnEfctiveTmgRptFrqncy("NULL");
		}


		/******************** observationvalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationvalueperiod = observation.getValuePeriod();

		/******************** Obsrvtn_VlPrd_Strt ********************************************************************************/
		if(observationvalueperiod.hasStart()) {

			o.addObsrvtnVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationvalueperiod.getStart())+"\"");
		} else {
			o.addObsrvtnVlPrdStrt("NULL");
		}


		/******************** Obsrvtn_VlPrd_End ********************************************************************************/
		if(observationvalueperiod.hasEnd()) {

			o.addObsrvtnVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationvalueperiod.getEnd())+"\"");
		} else {
			o.addObsrvtnVlPrdEnd("NULL");
		}


		/******************** Obsrvtn_VlStrgTyp ********************************************************************************/
		if(observation.hasValueStringType()) {

			o.addObsrvtnVlStrgTyp("\""+observation.getValueStringType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnVlStrgTyp("NULL");
		}


		/******************** observationvalueratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio observationvalueratio = observation.getValueRatio();

		/******************** observationvaluerationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerationumerator = observationvalueratio.getNumerator();

		/******************** Obsrvtn_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(observationvaluerationumerator.hasValue()) {

			o.addObsrvtnVlRtioNmrtrVl(String.valueOf(observationvaluerationumerator.getValue()));
		} else {
			o.addObsrvtnVlRtioNmrtrVl("NULL");
		}


		/******************** observationvaluerationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluerationumeratorcomparator = observationvaluerationumerator.getComparator();
		if(observationvaluerationumeratorcomparator!=null) {
			o.addObsrvtnVlRtioNmrtrCmprtr(observationvaluerationumeratorcomparator.toCode());
		} else {
			o.addObsrvtnVlRtioNmrtrCmprtr("NULL");
		}

		/******************** Obsrvtn_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(observationvaluerationumerator.hasCode()) {

			o.addObsrvtnVlRtioNmrtrCd(String.valueOf(observationvaluerationumerator.getCode()));
		} else {
			o.addObsrvtnVlRtioNmrtrCd("NULL");
		}


		/******************** Obsrvtn_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(observationvaluerationumerator.hasUnit()) {

			o.addObsrvtnVlRtioNmrtrUnt(String.valueOf(observationvaluerationumerator.getUnit()));
		} else {
			o.addObsrvtnVlRtioNmrtrUnt("NULL");
		}


		/******************** Obsrvtn_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(observationvaluerationumerator.hasSystem()) {

			o.addObsrvtnVlRtioNmrtrSys(String.valueOf(observationvaluerationumerator.getSystem()));
		} else {
			o.addObsrvtnVlRtioNmrtrSys("NULL");
		}


		/******************** observationvalueratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvalueratiodenominator = observationvalueratio.getDenominator();

		/******************** Obsrvtn_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(observationvalueratiodenominator.hasValue()) {

			o.addObsrvtnVlRtioDnmntrVl(String.valueOf(observationvalueratiodenominator.getValue()));
		} else {
			o.addObsrvtnVlRtioDnmntrVl("NULL");
		}


		/******************** observationvalueratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvalueratiodenominatorcomparator = observationvalueratiodenominator.getComparator();
		if(observationvalueratiodenominatorcomparator!=null) {
			o.addObsrvtnVlRtioDnmntrCmprtr(observationvalueratiodenominatorcomparator.toCode());
		} else {
			o.addObsrvtnVlRtioDnmntrCmprtr("NULL");
		}

		/******************** Obsrvtn_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(observationvalueratiodenominator.hasCode()) {

			o.addObsrvtnVlRtioDnmntrCd(String.valueOf(observationvalueratiodenominator.getCode()));
		} else {
			o.addObsrvtnVlRtioDnmntrCd("NULL");
		}


		/******************** Obsrvtn_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(observationvalueratiodenominator.hasUnit()) {

			o.addObsrvtnVlRtioDnmntrUnt(String.valueOf(observationvalueratiodenominator.getUnit()));
		} else {
			o.addObsrvtnVlRtioDnmntrUnt("NULL");
		}


		/******************** Obsrvtn_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(observationvalueratiodenominator.hasSystem()) {

			o.addObsrvtnVlRtioDnmntrSys(String.valueOf(observationvalueratiodenominator.getSystem()));
		} else {
			o.addObsrvtnVlRtioDnmntrSys("NULL");
		}


		/******************** observationinterpretation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> observationinterpretationlist = observation.getInterpretation();
		for(int observationinterpretationi = 0; observationinterpretationi<observationinterpretationlist.size();observationinterpretationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  observationinterpretation = observationinterpretationlist.get(observationinterpretationi);

		/******************** Obsrvtn_Interpretation_Txt ********************************************************************************/
		if(observationinterpretationi == 0) {o.addObsrvtnInterpretationTxt("[");}
		if(observationinterpretation.hasText()) {

			o.addObsrvtnInterpretationTxt(String.valueOf(observationinterpretation.getText()));
		} else {
			o.addObsrvtnInterpretationTxt("NULL");
		}

		if(observationinterpretationi == observationinterpretationlist.size()-1) {o.addObsrvtnInterpretationTxt("]");}


		/******************** observationinterpretationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationinterpretationcodinglist = observationinterpretation.getCoding();
		for(int observationinterpretationcodingi = 0; observationinterpretationcodingi<observationinterpretationcodinglist.size();observationinterpretationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationinterpretationcoding = observationinterpretationcodinglist.get(observationinterpretationcodingi);

		/******************** Obsrvtn_Interpretation_Cdg_Dsply ********************************************************************************/
		if(observationinterpretationcodingi == 0) {o.addObsrvtnInterpretationCdgDsply("[[");}
		if(observationinterpretationcoding.hasDisplay()) {

			o.addObsrvtnInterpretationCdgDsply(String.valueOf(observationinterpretationcoding.getDisplay()));
		} else {
			o.addObsrvtnInterpretationCdgDsply("NULL");
		}

		if(observationinterpretationcodingi == observationinterpretationcodinglist.size()-1) {o.addObsrvtnInterpretationCdgDsply("]]");}


		/******************** Obsrvtn_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(observationinterpretationcodingi == 0) {o.addObsrvtnInterpretationCdgVrsn("[[");}
		if(observationinterpretationcoding.hasVersion()) {

			o.addObsrvtnInterpretationCdgVrsn(String.valueOf(observationinterpretationcoding.getVersion()));
		} else {
			o.addObsrvtnInterpretationCdgVrsn("NULL");
		}

		if(observationinterpretationcodingi == observationinterpretationcodinglist.size()-1) {o.addObsrvtnInterpretationCdgVrsn("]]");}


		/******************** Obsrvtn_Interpretation_Cdg_Cd ********************************************************************************/
		if(observationinterpretationcodingi == 0) {o.addObsrvtnInterpretationCdgCd("[[");}
		if(observationinterpretationcoding.hasCode()) {

			o.addObsrvtnInterpretationCdgCd(String.valueOf(observationinterpretationcoding.getCode()));
		} else {
			o.addObsrvtnInterpretationCdgCd("NULL");
		}

		if(observationinterpretationcodingi == observationinterpretationcodinglist.size()-1) {o.addObsrvtnInterpretationCdgCd("]]");}


		/******************** Obsrvtn_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(observationinterpretationcodingi == 0) {o.addObsrvtnInterpretationCdgUsrSltd("[[");}
		if(observationinterpretationcoding.hasUserSelected()) {

			o.addObsrvtnInterpretationCdgUsrSltd(String.valueOf(observationinterpretationcoding.getUserSelected()));
		} else {
			o.addObsrvtnInterpretationCdgUsrSltd("NULL");
		}

		if(observationinterpretationcodingi == observationinterpretationcodinglist.size()-1) {o.addObsrvtnInterpretationCdgUsrSltd("]]");}


		/******************** Obsrvtn_Interpretation_Cdg_Sys ********************************************************************************/
		if(observationinterpretationcodingi == 0) {o.addObsrvtnInterpretationCdgSys("[[");}
		if(observationinterpretationcoding.hasSystem()) {

			o.addObsrvtnInterpretationCdgSys(String.valueOf(observationinterpretationcoding.getSystem()));
		} else {
			o.addObsrvtnInterpretationCdgSys("NULL");
		}

		if(observationinterpretationcodingi == observationinterpretationcodinglist.size()-1) {o.addObsrvtnInterpretationCdgSys("]]");}


		 };
		 };
		/******************** observationvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluequantity = observation.getValueQuantity();

		/******************** Obsrvtn_VlQnty_Vl ********************************************************************************/
		if(observationvaluequantity.hasValue()) {

			o.addObsrvtnVlQntyVl(String.valueOf(observationvaluequantity.getValue()));
		} else {
			o.addObsrvtnVlQntyVl("NULL");
		}


		/******************** observationvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluequantitycomparator = observationvaluequantity.getComparator();
		if(observationvaluequantitycomparator!=null) {
			o.addObsrvtnVlQntyCmprtr(observationvaluequantitycomparator.toCode());
		} else {
			o.addObsrvtnVlQntyCmprtr("NULL");
		}

		/******************** Obsrvtn_VlQnty_Cd ********************************************************************************/
		if(observationvaluequantity.hasCode()) {

			o.addObsrvtnVlQntyCd(String.valueOf(observationvaluequantity.getCode()));
		} else {
			o.addObsrvtnVlQntyCd("NULL");
		}


		/******************** Obsrvtn_VlQnty_Unt ********************************************************************************/
		if(observationvaluequantity.hasUnit()) {

			o.addObsrvtnVlQntyUnt(String.valueOf(observationvaluequantity.getUnit()));
		} else {
			o.addObsrvtnVlQntyUnt("NULL");
		}


		/******************** Obsrvtn_VlQnty_Sys ********************************************************************************/
		if(observationvaluequantity.hasSystem()) {

			o.addObsrvtnVlQntySys(String.valueOf(observationvaluequantity.getSystem()));
		} else {
			o.addObsrvtnVlQntySys("NULL");
		}


		/******************** Obsrvtn_HasMmbr ********************************************************************************/
		if(observation.hasHasMember()) {

			String  array = "[";
			for(int incr=0; incr<observation.getHasMember().size(); incr++) {
				array = array + observation.getHasMember().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addObsrvtnHasMmbr(array);

		} else {
			o.addObsrvtnHasMmbr("NULL");
		}


		/******************** observationreferencerange ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent> observationreferencerangelist = observation.getReferenceRange();
		for(int observationreferencerangei = 0; observationreferencerangei<observationreferencerangelist.size();observationreferencerangei++ ) {
		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent  observationreferencerange = observationreferencerangelist.get(observationreferencerangei);

		/******************** observationreferencerangetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationreferencerangetype = observationreferencerange.getType();

		/******************** Obsrvtn_RfrncRng_Typ_Txt ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngTypTxt("[");}
		if(observationreferencerangetype.hasText()) {

			o.addObsrvtnRfrncRngTypTxt(String.valueOf(observationreferencerangetype.getText()));
		} else {
			o.addObsrvtnRfrncRngTypTxt("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngTypTxt("]");}


		/******************** observationreferencerangetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationreferencerangetypecodinglist = observationreferencerangetype.getCoding();
		for(int observationreferencerangetypecodingi = 0; observationreferencerangetypecodingi<observationreferencerangetypecodinglist.size();observationreferencerangetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationreferencerangetypecoding = observationreferencerangetypecodinglist.get(observationreferencerangetypecodingi);

		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(observationreferencerangetypecodingi == 0) {o.addObsrvtnRfrncRngTypCdgDsply("[[");}
		if(observationreferencerangetypecoding.hasDisplay()) {

			o.addObsrvtnRfrncRngTypCdgDsply(String.valueOf(observationreferencerangetypecoding.getDisplay()));
		} else {
			o.addObsrvtnRfrncRngTypCdgDsply("NULL");
		}

		if(observationreferencerangetypecodingi == observationreferencerangetypecodinglist.size()-1) {o.addObsrvtnRfrncRngTypCdgDsply("]]");}


		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationreferencerangetypecodingi == 0) {o.addObsrvtnRfrncRngTypCdgVrsn("[[");}
		if(observationreferencerangetypecoding.hasVersion()) {

			o.addObsrvtnRfrncRngTypCdgVrsn(String.valueOf(observationreferencerangetypecoding.getVersion()));
		} else {
			o.addObsrvtnRfrncRngTypCdgVrsn("NULL");
		}

		if(observationreferencerangetypecodingi == observationreferencerangetypecodinglist.size()-1) {o.addObsrvtnRfrncRngTypCdgVrsn("]]");}


		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(observationreferencerangetypecodingi == 0) {o.addObsrvtnRfrncRngTypCdgCd("[[");}
		if(observationreferencerangetypecoding.hasCode()) {

			o.addObsrvtnRfrncRngTypCdgCd(String.valueOf(observationreferencerangetypecoding.getCode()));
		} else {
			o.addObsrvtnRfrncRngTypCdgCd("NULL");
		}

		if(observationreferencerangetypecodingi == observationreferencerangetypecodinglist.size()-1) {o.addObsrvtnRfrncRngTypCdgCd("]]");}


		/******************** Obsrvtn_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationreferencerangetypecodingi == 0) {o.addObsrvtnRfrncRngTypCdgUsrSltd("[[");}
		if(observationreferencerangetypecoding.hasUserSelected()) {

			o.addObsrvtnRfrncRngTypCdgUsrSltd(String.valueOf(observationreferencerangetypecoding.getUserSelected()));
		} else {
			o.addObsrvtnRfrncRngTypCdgUsrSltd("NULL");
		}

		if(observationreferencerangetypecodingi == observationreferencerangetypecodinglist.size()-1) {o.addObsrvtnRfrncRngTypCdgUsrSltd("]]");}


		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(observationreferencerangetypecodingi == 0) {o.addObsrvtnRfrncRngTypCdgSys("[[");}
		if(observationreferencerangetypecoding.hasSystem()) {

			o.addObsrvtnRfrncRngTypCdgSys(String.valueOf(observationreferencerangetypecoding.getSystem()));
		} else {
			o.addObsrvtnRfrncRngTypCdgSys("NULL");
		}

		if(observationreferencerangetypecodingi == observationreferencerangetypecodinglist.size()-1) {o.addObsrvtnRfrncRngTypCdgSys("]]");}


		 };
		/******************** Obsrvtn_RfrncRng_Txt ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngTxt("[");}
		if(observationreferencerange.hasText()) {

			o.addObsrvtnRfrncRngTxt(String.valueOf(observationreferencerange.getText()));
		} else {
			o.addObsrvtnRfrncRngTxt("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngTxt("]");}


		/******************** observationreferencerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangelow = observationreferencerange.getLow();

		/******************** Obsrvtn_RfrncRng_Lw_Vl ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngLwVl("[");}
		if(observationreferencerangelow.hasValue()) {

			o.addObsrvtnRfrncRngLwVl(String.valueOf(observationreferencerangelow.getValue()));
		} else {
			o.addObsrvtnRfrncRngLwVl("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngLwVl("]");}


		/******************** observationreferencerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangelowcomparator = observationreferencerangelow.getComparator();
		if(observationreferencerangelowcomparator!=null) {
		if(observationreferencerangei == 0) {

		o.addObsrvtnRfrncRngLwCmprtr("[");		}
			o.addObsrvtnRfrncRngLwCmprtr(observationreferencerangelowcomparator.toCode());
		if(observationreferencerangei == observationreferencerangelist.size()-1) {

		o.addObsrvtnRfrncRngLwCmprtr("]");		}

		} else {
			o.addObsrvtnRfrncRngLwCmprtr("NULL");
		}

		/******************** Obsrvtn_RfrncRng_Lw_Cd ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngLwCd("[");}
		if(observationreferencerangelow.hasCode()) {

			o.addObsrvtnRfrncRngLwCd(String.valueOf(observationreferencerangelow.getCode()));
		} else {
			o.addObsrvtnRfrncRngLwCd("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngLwCd("]");}


		/******************** Obsrvtn_RfrncRng_Lw_Unt ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngLwUnt("[");}
		if(observationreferencerangelow.hasUnit()) {

			o.addObsrvtnRfrncRngLwUnt(String.valueOf(observationreferencerangelow.getUnit()));
		} else {
			o.addObsrvtnRfrncRngLwUnt("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngLwUnt("]");}


		/******************** Obsrvtn_RfrncRng_Lw_Sys ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngLwSys("[");}
		if(observationreferencerangelow.hasSystem()) {

			o.addObsrvtnRfrncRngLwSys(String.valueOf(observationreferencerangelow.getSystem()));
		} else {
			o.addObsrvtnRfrncRngLwSys("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngLwSys("]");}


		/******************** observationreferencerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangehigh = observationreferencerange.getHigh();

		/******************** Obsrvtn_RfrncRng_Hi_Vl ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngHiVl("[");}
		if(observationreferencerangehigh.hasValue()) {

			o.addObsrvtnRfrncRngHiVl(String.valueOf(observationreferencerangehigh.getValue()));
		} else {
			o.addObsrvtnRfrncRngHiVl("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngHiVl("]");}


		/******************** observationreferencerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangehighcomparator = observationreferencerangehigh.getComparator();
		if(observationreferencerangehighcomparator!=null) {
		if(observationreferencerangei == 0) {

		o.addObsrvtnRfrncRngHiCmprtr("[");		}
			o.addObsrvtnRfrncRngHiCmprtr(observationreferencerangehighcomparator.toCode());
		if(observationreferencerangei == observationreferencerangelist.size()-1) {

		o.addObsrvtnRfrncRngHiCmprtr("]");		}

		} else {
			o.addObsrvtnRfrncRngHiCmprtr("NULL");
		}

		/******************** Obsrvtn_RfrncRng_Hi_Cd ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngHiCd("[");}
		if(observationreferencerangehigh.hasCode()) {

			o.addObsrvtnRfrncRngHiCd(String.valueOf(observationreferencerangehigh.getCode()));
		} else {
			o.addObsrvtnRfrncRngHiCd("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngHiCd("]");}


		/******************** Obsrvtn_RfrncRng_Hi_Unt ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngHiUnt("[");}
		if(observationreferencerangehigh.hasUnit()) {

			o.addObsrvtnRfrncRngHiUnt(String.valueOf(observationreferencerangehigh.getUnit()));
		} else {
			o.addObsrvtnRfrncRngHiUnt("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngHiUnt("]");}


		/******************** Obsrvtn_RfrncRng_Hi_Sys ********************************************************************************/
		if(observationreferencerangei == 0) {o.addObsrvtnRfrncRngHiSys("[");}
		if(observationreferencerangehigh.hasSystem()) {

			o.addObsrvtnRfrncRngHiSys(String.valueOf(observationreferencerangehigh.getSystem()));
		} else {
			o.addObsrvtnRfrncRngHiSys("NULL");
		}

		if(observationreferencerangei == observationreferencerangelist.size()-1) {o.addObsrvtnRfrncRngHiSys("]");}


		/******************** observationreferencerangeappliesto ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> observationreferencerangeappliestolist = observationreferencerange.getAppliesTo();
		for(int observationreferencerangeappliestoi = 0; observationreferencerangeappliestoi<observationreferencerangeappliestolist.size();observationreferencerangeappliestoi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  observationreferencerangeappliesto = observationreferencerangeappliestolist.get(observationreferencerangeappliestoi);

		/******************** Obsrvtn_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(observationreferencerangeappliestoi == 0) {o.addObsrvtnRfrncRngAppliesToTxt("[[");}
		if(observationreferencerangeappliesto.hasText()) {

			o.addObsrvtnRfrncRngAppliesToTxt(String.valueOf(observationreferencerangeappliesto.getText()));
		} else {
			o.addObsrvtnRfrncRngAppliesToTxt("NULL");
		}

		if(observationreferencerangeappliestoi == observationreferencerangeappliestolist.size()-1) {o.addObsrvtnRfrncRngAppliesToTxt("]]");}


		/******************** observationreferencerangeappliestocoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationreferencerangeappliestocodinglist = observationreferencerangeappliesto.getCoding();
		for(int observationreferencerangeappliestocodingi = 0; observationreferencerangeappliestocodingi<observationreferencerangeappliestocodinglist.size();observationreferencerangeappliestocodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationreferencerangeappliestocoding = observationreferencerangeappliestocodinglist.get(observationreferencerangeappliestocodingi);

		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(observationreferencerangeappliestocodingi == 0) {o.addObsrvtnRfrncRngAppliesToCdgDsply("[[[");}
		if(observationreferencerangeappliestocoding.hasDisplay()) {

			o.addObsrvtnRfrncRngAppliesToCdgDsply(String.valueOf(observationreferencerangeappliestocoding.getDisplay()));
		} else {
			o.addObsrvtnRfrncRngAppliesToCdgDsply("NULL");
		}

		if(observationreferencerangeappliestocodingi == observationreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnRfrncRngAppliesToCdgDsply("]]]");}


		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(observationreferencerangeappliestocodingi == 0) {o.addObsrvtnRfrncRngAppliesToCdgVrsn("[[[");}
		if(observationreferencerangeappliestocoding.hasVersion()) {

			o.addObsrvtnRfrncRngAppliesToCdgVrsn(String.valueOf(observationreferencerangeappliestocoding.getVersion()));
		} else {
			o.addObsrvtnRfrncRngAppliesToCdgVrsn("NULL");
		}

		if(observationreferencerangeappliestocodingi == observationreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnRfrncRngAppliesToCdgVrsn("]]]");}


		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(observationreferencerangeappliestocodingi == 0) {o.addObsrvtnRfrncRngAppliesToCdgCd("[[[");}
		if(observationreferencerangeappliestocoding.hasCode()) {

			o.addObsrvtnRfrncRngAppliesToCdgCd(String.valueOf(observationreferencerangeappliestocoding.getCode()));
		} else {
			o.addObsrvtnRfrncRngAppliesToCdgCd("NULL");
		}

		if(observationreferencerangeappliestocodingi == observationreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnRfrncRngAppliesToCdgCd("]]]");}


		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(observationreferencerangeappliestocodingi == 0) {o.addObsrvtnRfrncRngAppliesToCdgUsrSltd("[[[");}
		if(observationreferencerangeappliestocoding.hasUserSelected()) {

			o.addObsrvtnRfrncRngAppliesToCdgUsrSltd(String.valueOf(observationreferencerangeappliestocoding.getUserSelected()));
		} else {
			o.addObsrvtnRfrncRngAppliesToCdgUsrSltd("NULL");
		}

		if(observationreferencerangeappliestocodingi == observationreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnRfrncRngAppliesToCdgUsrSltd("]]]");}


		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(observationreferencerangeappliestocodingi == 0) {o.addObsrvtnRfrncRngAppliesToCdgSys("[[[");}
		if(observationreferencerangeappliestocoding.hasSystem()) {

			o.addObsrvtnRfrncRngAppliesToCdgSys(String.valueOf(observationreferencerangeappliestocoding.getSystem()));
		} else {
			o.addObsrvtnRfrncRngAppliesToCdgSys("NULL");
		}

		if(observationreferencerangeappliestocodingi == observationreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnRfrncRngAppliesToCdgSys("]]]");}


		 };
		 };
		/******************** observationreferencerangeage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationreferencerangeage = observationreferencerange.getAge();

		/******************** observationreferencerangeagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangeagelow = observationreferencerangeage.getLow();

		/******************** Obsrvtn_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(observationreferencerangeagelow.hasValue()) {

			o.addObsrvtnRfrncRngAgeLwVl(String.valueOf(observationreferencerangeagelow.getValue()));
		} else {
			o.addObsrvtnRfrncRngAgeLwVl("NULL");
		}


		/******************** observationreferencerangeagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangeagelowcomparator = observationreferencerangeagelow.getComparator();
		if(observationreferencerangeagelowcomparator!=null) {
			o.addObsrvtnRfrncRngAgeLwCmprtr(observationreferencerangeagelowcomparator.toCode());
		} else {
			o.addObsrvtnRfrncRngAgeLwCmprtr("NULL");
		}

		/******************** Obsrvtn_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(observationreferencerangeagelow.hasCode()) {

			o.addObsrvtnRfrncRngAgeLwCd(String.valueOf(observationreferencerangeagelow.getCode()));
		} else {
			o.addObsrvtnRfrncRngAgeLwCd("NULL");
		}


		/******************** Obsrvtn_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(observationreferencerangeagelow.hasUnit()) {

			o.addObsrvtnRfrncRngAgeLwUnt(String.valueOf(observationreferencerangeagelow.getUnit()));
		} else {
			o.addObsrvtnRfrncRngAgeLwUnt("NULL");
		}


		/******************** Obsrvtn_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(observationreferencerangeagelow.hasSystem()) {

			o.addObsrvtnRfrncRngAgeLwSys(String.valueOf(observationreferencerangeagelow.getSystem()));
		} else {
			o.addObsrvtnRfrncRngAgeLwSys("NULL");
		}


		/******************** observationreferencerangeagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangeagehigh = observationreferencerangeage.getHigh();

		/******************** Obsrvtn_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(observationreferencerangeagehigh.hasValue()) {

			o.addObsrvtnRfrncRngAgeHiVl(String.valueOf(observationreferencerangeagehigh.getValue()));
		} else {
			o.addObsrvtnRfrncRngAgeHiVl("NULL");
		}


		/******************** observationreferencerangeagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangeagehighcomparator = observationreferencerangeagehigh.getComparator();
		if(observationreferencerangeagehighcomparator!=null) {
			o.addObsrvtnRfrncRngAgeHiCmprtr(observationreferencerangeagehighcomparator.toCode());
		} else {
			o.addObsrvtnRfrncRngAgeHiCmprtr("NULL");
		}

		/******************** Obsrvtn_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(observationreferencerangeagehigh.hasCode()) {

			o.addObsrvtnRfrncRngAgeHiCd(String.valueOf(observationreferencerangeagehigh.getCode()));
		} else {
			o.addObsrvtnRfrncRngAgeHiCd("NULL");
		}


		/******************** Obsrvtn_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(observationreferencerangeagehigh.hasUnit()) {

			o.addObsrvtnRfrncRngAgeHiUnt(String.valueOf(observationreferencerangeagehigh.getUnit()));
		} else {
			o.addObsrvtnRfrncRngAgeHiUnt("NULL");
		}


		/******************** Obsrvtn_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(observationreferencerangeagehigh.hasSystem()) {

			o.addObsrvtnRfrncRngAgeHiSys(String.valueOf(observationreferencerangeagehigh.getSystem()));
		} else {
			o.addObsrvtnRfrncRngAgeHiSys("NULL");
		}


		 };
		/******************** observationcomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Observation.ObservationComponentComponent> observationcomponentlist = observation.getComponent();
		for(int observationcomponenti = 0; observationcomponenti<observationcomponentlist.size();observationcomponenti++ ) {
		org.hl7.fhir.r4.model.Observation.ObservationComponentComponent  observationcomponent = observationcomponentlist.get(observationcomponenti);

		/******************** observationcomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentcode = observationcomponent.getCode();

		/******************** Obsrvtn_Cmpnt_Cd_Txt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntCdTxt("[");}
		if(observationcomponentcode.hasText()) {

			o.addObsrvtnCmpntCdTxt(String.valueOf(observationcomponentcode.getText()));
		} else {
			o.addObsrvtnCmpntCdTxt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntCdTxt("]");}


		/******************** observationcomponentcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcomponentcodecodinglist = observationcomponentcode.getCoding();
		for(int observationcomponentcodecodingi = 0; observationcomponentcodecodingi<observationcomponentcodecodinglist.size();observationcomponentcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcomponentcodecoding = observationcomponentcodecodinglist.get(observationcomponentcodecodingi);

		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(observationcomponentcodecodingi == 0) {o.addObsrvtnCmpntCdCdgDsply("[[");}
		if(observationcomponentcodecoding.hasDisplay()) {

			o.addObsrvtnCmpntCdCdgDsply(String.valueOf(observationcomponentcodecoding.getDisplay()));
		} else {
			o.addObsrvtnCmpntCdCdgDsply("NULL");
		}

		if(observationcomponentcodecodingi == observationcomponentcodecodinglist.size()-1) {o.addObsrvtnCmpntCdCdgDsply("]]");}


		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentcodecodingi == 0) {o.addObsrvtnCmpntCdCdgVrsn("[[");}
		if(observationcomponentcodecoding.hasVersion()) {

			o.addObsrvtnCmpntCdCdgVrsn(String.valueOf(observationcomponentcodecoding.getVersion()));
		} else {
			o.addObsrvtnCmpntCdCdgVrsn("NULL");
		}

		if(observationcomponentcodecodingi == observationcomponentcodecodinglist.size()-1) {o.addObsrvtnCmpntCdCdgVrsn("]]");}


		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(observationcomponentcodecodingi == 0) {o.addObsrvtnCmpntCdCdgCd("[[");}
		if(observationcomponentcodecoding.hasCode()) {

			o.addObsrvtnCmpntCdCdgCd(String.valueOf(observationcomponentcodecoding.getCode()));
		} else {
			o.addObsrvtnCmpntCdCdgCd("NULL");
		}

		if(observationcomponentcodecodingi == observationcomponentcodecodinglist.size()-1) {o.addObsrvtnCmpntCdCdgCd("]]");}


		/******************** Obsrvtn_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentcodecodingi == 0) {o.addObsrvtnCmpntCdCdgUsrSltd("[[");}
		if(observationcomponentcodecoding.hasUserSelected()) {

			o.addObsrvtnCmpntCdCdgUsrSltd(String.valueOf(observationcomponentcodecoding.getUserSelected()));
		} else {
			o.addObsrvtnCmpntCdCdgUsrSltd("NULL");
		}

		if(observationcomponentcodecodingi == observationcomponentcodecodinglist.size()-1) {o.addObsrvtnCmpntCdCdgUsrSltd("]]");}


		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(observationcomponentcodecodingi == 0) {o.addObsrvtnCmpntCdCdgSys("[[");}
		if(observationcomponentcodecoding.hasSystem()) {

			o.addObsrvtnCmpntCdCdgSys(String.valueOf(observationcomponentcodecoding.getSystem()));
		} else {
			o.addObsrvtnCmpntCdCdgSys("NULL");
		}

		if(observationcomponentcodecodingi == observationcomponentcodecodinglist.size()-1) {o.addObsrvtnCmpntCdCdgSys("]]");}


		 };
		/******************** observationcomponentdataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentdataabsentreason = observationcomponent.getDataAbsentReason();

		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Txt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntDataAbsentRsnTxt("[");}
		if(observationcomponentdataabsentreason.hasText()) {

			o.addObsrvtnCmpntDataAbsentRsnTxt(String.valueOf(observationcomponentdataabsentreason.getText()));
		} else {
			o.addObsrvtnCmpntDataAbsentRsnTxt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntDataAbsentRsnTxt("]");}


		/******************** observationcomponentdataabsentreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcomponentdataabsentreasoncodinglist = observationcomponentdataabsentreason.getCoding();
		for(int observationcomponentdataabsentreasoncodingi = 0; observationcomponentdataabsentreasoncodingi<observationcomponentdataabsentreasoncodinglist.size();observationcomponentdataabsentreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcomponentdataabsentreasoncoding = observationcomponentdataabsentreasoncodinglist.get(observationcomponentdataabsentreasoncodingi);

		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(observationcomponentdataabsentreasoncodingi == 0) {o.addObsrvtnCmpntDataAbsentRsnCdgDsply("[[");}
		if(observationcomponentdataabsentreasoncoding.hasDisplay()) {

			o.addObsrvtnCmpntDataAbsentRsnCdgDsply(String.valueOf(observationcomponentdataabsentreasoncoding.getDisplay()));
		} else {
			o.addObsrvtnCmpntDataAbsentRsnCdgDsply("NULL");
		}

		if(observationcomponentdataabsentreasoncodingi == observationcomponentdataabsentreasoncodinglist.size()-1) {o.addObsrvtnCmpntDataAbsentRsnCdgDsply("]]");}


		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentdataabsentreasoncodingi == 0) {o.addObsrvtnCmpntDataAbsentRsnCdgVrsn("[[");}
		if(observationcomponentdataabsentreasoncoding.hasVersion()) {

			o.addObsrvtnCmpntDataAbsentRsnCdgVrsn(String.valueOf(observationcomponentdataabsentreasoncoding.getVersion()));
		} else {
			o.addObsrvtnCmpntDataAbsentRsnCdgVrsn("NULL");
		}

		if(observationcomponentdataabsentreasoncodingi == observationcomponentdataabsentreasoncodinglist.size()-1) {o.addObsrvtnCmpntDataAbsentRsnCdgVrsn("]]");}


		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(observationcomponentdataabsentreasoncodingi == 0) {o.addObsrvtnCmpntDataAbsentRsnCdgCd("[[");}
		if(observationcomponentdataabsentreasoncoding.hasCode()) {

			o.addObsrvtnCmpntDataAbsentRsnCdgCd(String.valueOf(observationcomponentdataabsentreasoncoding.getCode()));
		} else {
			o.addObsrvtnCmpntDataAbsentRsnCdgCd("NULL");
		}

		if(observationcomponentdataabsentreasoncodingi == observationcomponentdataabsentreasoncodinglist.size()-1) {o.addObsrvtnCmpntDataAbsentRsnCdgCd("]]");}


		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentdataabsentreasoncodingi == 0) {o.addObsrvtnCmpntDataAbsentRsnCdgUsrSltd("[[");}
		if(observationcomponentdataabsentreasoncoding.hasUserSelected()) {

			o.addObsrvtnCmpntDataAbsentRsnCdgUsrSltd(String.valueOf(observationcomponentdataabsentreasoncoding.getUserSelected()));
		} else {
			o.addObsrvtnCmpntDataAbsentRsnCdgUsrSltd("NULL");
		}

		if(observationcomponentdataabsentreasoncodingi == observationcomponentdataabsentreasoncodinglist.size()-1) {o.addObsrvtnCmpntDataAbsentRsnCdgUsrSltd("]]");}


		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(observationcomponentdataabsentreasoncodingi == 0) {o.addObsrvtnCmpntDataAbsentRsnCdgSys("[[");}
		if(observationcomponentdataabsentreasoncoding.hasSystem()) {

			o.addObsrvtnCmpntDataAbsentRsnCdgSys(String.valueOf(observationcomponentdataabsentreasoncoding.getSystem()));
		} else {
			o.addObsrvtnCmpntDataAbsentRsnCdgSys("NULL");
		}

		if(observationcomponentdataabsentreasoncodingi == observationcomponentdataabsentreasoncodinglist.size()-1) {o.addObsrvtnCmpntDataAbsentRsnCdgSys("]]");}


		 };
		/******************** Obsrvtn_Cmpnt_VlBooleanTyp ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlBooleanTyp("[");}
		if(observationcomponent.hasValueBooleanType()) {

			o.addObsrvtnCmpntVlBooleanTyp("\""+observationcomponent.getValueBooleanType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnCmpntVlBooleanTyp("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlBooleanTyp("]");}


		/******************** Obsrvtn_Cmpnt_VlDtTimeTyp ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlDtTimeTyp("[");}
		if(observationcomponent.hasValueDateTimeType()) {

			o.addObsrvtnCmpntVlDtTimeTyp("\""+observationcomponent.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnCmpntVlDtTimeTyp("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlDtTimeTyp("]");}


		/******************** observationcomponentvaluesampleddata ********************************************************************************/
		org.hl7.fhir.r4.model.SampledData observationcomponentvaluesampleddata = observationcomponent.getValueSampledData();

		/******************** Obsrvtn_Cmpnt_VlSampledData_Dimensions ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataDimensions("[");}
		if(observationcomponentvaluesampleddata.hasDimensions()) {

			o.addObsrvtnCmpntVlSampledDataDimensions(String.valueOf(observationcomponentvaluesampleddata.getDimensions()));
		} else {
			o.addObsrvtnCmpntVlSampledDataDimensions("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataDimensions("]");}


		/******************** Obsrvtn_Cmpnt_VlSampledData_Prd ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataPrd("[");}
		if(observationcomponentvaluesampleddata.hasPeriod()) {

			o.addObsrvtnCmpntVlSampledDataPrd(String.valueOf(observationcomponentvaluesampleddata.getPeriod()));
		} else {
			o.addObsrvtnCmpntVlSampledDataPrd("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataPrd("]");}


		/******************** observationcomponentvaluesampleddataorigin ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluesampleddataorigin = observationcomponentvaluesampleddata.getOrigin();

		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Vl ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataOriginVl("[");}
		if(observationcomponentvaluesampleddataorigin.hasValue()) {

			o.addObsrvtnCmpntVlSampledDataOriginVl(String.valueOf(observationcomponentvaluesampleddataorigin.getValue()));
		} else {
			o.addObsrvtnCmpntVlSampledDataOriginVl("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataOriginVl("]");}


		/******************** observationcomponentvaluesampleddataorigincomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluesampleddataorigincomparator = observationcomponentvaluesampleddataorigin.getComparator();
		if(observationcomponentvaluesampleddataorigincomparator!=null) {
		if(observationcomponenti == 0) {

		o.addObsrvtnCmpntVlSampledDataOriginCmprtr("[");		}
			o.addObsrvtnCmpntVlSampledDataOriginCmprtr(observationcomponentvaluesampleddataorigincomparator.toCode());
		if(observationcomponenti == observationcomponentlist.size()-1) {

		o.addObsrvtnCmpntVlSampledDataOriginCmprtr("]");		}

		} else {
			o.addObsrvtnCmpntVlSampledDataOriginCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Cd ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataOriginCd("[");}
		if(observationcomponentvaluesampleddataorigin.hasCode()) {

			o.addObsrvtnCmpntVlSampledDataOriginCd(String.valueOf(observationcomponentvaluesampleddataorigin.getCode()));
		} else {
			o.addObsrvtnCmpntVlSampledDataOriginCd("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataOriginCd("]");}


		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Unt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataOriginUnt("[");}
		if(observationcomponentvaluesampleddataorigin.hasUnit()) {

			o.addObsrvtnCmpntVlSampledDataOriginUnt(String.valueOf(observationcomponentvaluesampleddataorigin.getUnit()));
		} else {
			o.addObsrvtnCmpntVlSampledDataOriginUnt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataOriginUnt("]");}


		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Sys ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataOriginSys("[");}
		if(observationcomponentvaluesampleddataorigin.hasSystem()) {

			o.addObsrvtnCmpntVlSampledDataOriginSys(String.valueOf(observationcomponentvaluesampleddataorigin.getSystem()));
		} else {
			o.addObsrvtnCmpntVlSampledDataOriginSys("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataOriginSys("]");}


		/******************** Obsrvtn_Cmpnt_VlSampledData_Data ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataData("[");}
		if(observationcomponentvaluesampleddata.hasData()) {

			o.addObsrvtnCmpntVlSampledDataData(String.valueOf(observationcomponentvaluesampleddata.getData()));
		} else {
			o.addObsrvtnCmpntVlSampledDataData("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataData("]");}


		/******************** Obsrvtn_Cmpnt_VlSampledData_Factor ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataFactor("[");}
		if(observationcomponentvaluesampleddata.hasFactor()) {

			o.addObsrvtnCmpntVlSampledDataFactor(String.valueOf(observationcomponentvaluesampleddata.getFactor()));
		} else {
			o.addObsrvtnCmpntVlSampledDataFactor("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataFactor("]");}


		/******************** Obsrvtn_Cmpnt_VlSampledData_UpperLmt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataUpperLmt("[");}
		if(observationcomponentvaluesampleddata.hasUpperLimit()) {

			o.addObsrvtnCmpntVlSampledDataUpperLmt(String.valueOf(observationcomponentvaluesampleddata.getUpperLimit()));
		} else {
			o.addObsrvtnCmpntVlSampledDataUpperLmt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataUpperLmt("]");}


		/******************** Obsrvtn_Cmpnt_VlSampledData_LwerLmt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlSampledDataLwerLmt("[");}
		if(observationcomponentvaluesampleddata.hasLowerLimit()) {

			o.addObsrvtnCmpntVlSampledDataLwerLmt(String.valueOf(observationcomponentvaluesampleddata.getLowerLimit()));
		} else {
			o.addObsrvtnCmpntVlSampledDataLwerLmt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlSampledDataLwerLmt("]");}


		/******************** observationcomponentvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentvaluecodeableconcept = observationcomponent.getValueCodeableConcept();

		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Txt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlCdbleCncptTxt("[");}
		if(observationcomponentvaluecodeableconcept.hasText()) {

			o.addObsrvtnCmpntVlCdbleCncptTxt(String.valueOf(observationcomponentvaluecodeableconcept.getText()));
		} else {
			o.addObsrvtnCmpntVlCdbleCncptTxt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlCdbleCncptTxt("]");}


		/******************** observationcomponentvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcomponentvaluecodeableconceptcodinglist = observationcomponentvaluecodeableconcept.getCoding();
		for(int observationcomponentvaluecodeableconceptcodingi = 0; observationcomponentvaluecodeableconceptcodingi<observationcomponentvaluecodeableconceptcodinglist.size();observationcomponentvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcomponentvaluecodeableconceptcoding = observationcomponentvaluecodeableconceptcodinglist.get(observationcomponentvaluecodeableconceptcodingi);

		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcodingi == 0) {o.addObsrvtnCmpntVlCdbleCncptCdgDsply("[[");}
		if(observationcomponentvaluecodeableconceptcoding.hasDisplay()) {

			o.addObsrvtnCmpntVlCdbleCncptCdgDsply(String.valueOf(observationcomponentvaluecodeableconceptcoding.getDisplay()));
		} else {
			o.addObsrvtnCmpntVlCdbleCncptCdgDsply("NULL");
		}

		if(observationcomponentvaluecodeableconceptcodingi == observationcomponentvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnCmpntVlCdbleCncptCdgDsply("]]");}


		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcodingi == 0) {o.addObsrvtnCmpntVlCdbleCncptCdgVrsn("[[");}
		if(observationcomponentvaluecodeableconceptcoding.hasVersion()) {

			o.addObsrvtnCmpntVlCdbleCncptCdgVrsn(String.valueOf(observationcomponentvaluecodeableconceptcoding.getVersion()));
		} else {
			o.addObsrvtnCmpntVlCdbleCncptCdgVrsn("NULL");
		}

		if(observationcomponentvaluecodeableconceptcodingi == observationcomponentvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnCmpntVlCdbleCncptCdgVrsn("]]");}


		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcodingi == 0) {o.addObsrvtnCmpntVlCdbleCncptCdgCd("[[");}
		if(observationcomponentvaluecodeableconceptcoding.hasCode()) {

			o.addObsrvtnCmpntVlCdbleCncptCdgCd(String.valueOf(observationcomponentvaluecodeableconceptcoding.getCode()));
		} else {
			o.addObsrvtnCmpntVlCdbleCncptCdgCd("NULL");
		}

		if(observationcomponentvaluecodeableconceptcodingi == observationcomponentvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnCmpntVlCdbleCncptCdgCd("]]");}


		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcodingi == 0) {o.addObsrvtnCmpntVlCdbleCncptCdgUsrSltd("[[");}
		if(observationcomponentvaluecodeableconceptcoding.hasUserSelected()) {

			o.addObsrvtnCmpntVlCdbleCncptCdgUsrSltd(String.valueOf(observationcomponentvaluecodeableconceptcoding.getUserSelected()));
		} else {
			o.addObsrvtnCmpntVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(observationcomponentvaluecodeableconceptcodingi == observationcomponentvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnCmpntVlCdbleCncptCdgUsrSltd("]]");}


		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcodingi == 0) {o.addObsrvtnCmpntVlCdbleCncptCdgSys("[[");}
		if(observationcomponentvaluecodeableconceptcoding.hasSystem()) {

			o.addObsrvtnCmpntVlCdbleCncptCdgSys(String.valueOf(observationcomponentvaluecodeableconceptcoding.getSystem()));
		} else {
			o.addObsrvtnCmpntVlCdbleCncptCdgSys("NULL");
		}

		if(observationcomponentvaluecodeableconceptcodingi == observationcomponentvaluecodeableconceptcodinglist.size()-1) {o.addObsrvtnCmpntVlCdbleCncptCdgSys("]]");}


		 };
		/******************** Obsrvtn_Cmpnt_VlIntegerTyp ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlIntegerTyp("[");}
		if(observationcomponent.hasValueIntegerType()) {

			o.addObsrvtnCmpntVlIntegerTyp("\""+observationcomponent.getValueIntegerType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnCmpntVlIntegerTyp("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlIntegerTyp("]");}


		/******************** Obsrvtn_Cmpnt_VlTimeTyp ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlTimeTyp("[");}
		if(observationcomponent.hasValueTimeType()) {

			o.addObsrvtnCmpntVlTimeTyp("\""+observationcomponent.getValueTimeType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnCmpntVlTimeTyp("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlTimeTyp("]");}


		/******************** observationcomponentvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationcomponentvaluerange = observationcomponent.getValueRange();

		/******************** observationcomponentvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerangelow = observationcomponentvaluerange.getLow();

		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Vl ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngLwVl("[");}
		if(observationcomponentvaluerangelow.hasValue()) {

			o.addObsrvtnCmpntVlRngLwVl(String.valueOf(observationcomponentvaluerangelow.getValue()));
		} else {
			o.addObsrvtnCmpntVlRngLwVl("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngLwVl("]");}


		/******************** observationcomponentvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluerangelowcomparator = observationcomponentvaluerangelow.getComparator();
		if(observationcomponentvaluerangelowcomparator!=null) {
		if(observationcomponenti == 0) {

		o.addObsrvtnCmpntVlRngLwCmprtr("[");		}
			o.addObsrvtnCmpntVlRngLwCmprtr(observationcomponentvaluerangelowcomparator.toCode());
		if(observationcomponenti == observationcomponentlist.size()-1) {

		o.addObsrvtnCmpntVlRngLwCmprtr("]");		}

		} else {
			o.addObsrvtnCmpntVlRngLwCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Cd ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngLwCd("[");}
		if(observationcomponentvaluerangelow.hasCode()) {

			o.addObsrvtnCmpntVlRngLwCd(String.valueOf(observationcomponentvaluerangelow.getCode()));
		} else {
			o.addObsrvtnCmpntVlRngLwCd("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngLwCd("]");}


		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Unt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngLwUnt("[");}
		if(observationcomponentvaluerangelow.hasUnit()) {

			o.addObsrvtnCmpntVlRngLwUnt(String.valueOf(observationcomponentvaluerangelow.getUnit()));
		} else {
			o.addObsrvtnCmpntVlRngLwUnt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngLwUnt("]");}


		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Sys ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngLwSys("[");}
		if(observationcomponentvaluerangelow.hasSystem()) {

			o.addObsrvtnCmpntVlRngLwSys(String.valueOf(observationcomponentvaluerangelow.getSystem()));
		} else {
			o.addObsrvtnCmpntVlRngLwSys("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngLwSys("]");}


		/******************** observationcomponentvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerangehigh = observationcomponentvaluerange.getHigh();

		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Vl ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngHiVl("[");}
		if(observationcomponentvaluerangehigh.hasValue()) {

			o.addObsrvtnCmpntVlRngHiVl(String.valueOf(observationcomponentvaluerangehigh.getValue()));
		} else {
			o.addObsrvtnCmpntVlRngHiVl("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngHiVl("]");}


		/******************** observationcomponentvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluerangehighcomparator = observationcomponentvaluerangehigh.getComparator();
		if(observationcomponentvaluerangehighcomparator!=null) {
		if(observationcomponenti == 0) {

		o.addObsrvtnCmpntVlRngHiCmprtr("[");		}
			o.addObsrvtnCmpntVlRngHiCmprtr(observationcomponentvaluerangehighcomparator.toCode());
		if(observationcomponenti == observationcomponentlist.size()-1) {

		o.addObsrvtnCmpntVlRngHiCmprtr("]");		}

		} else {
			o.addObsrvtnCmpntVlRngHiCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Cd ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngHiCd("[");}
		if(observationcomponentvaluerangehigh.hasCode()) {

			o.addObsrvtnCmpntVlRngHiCd(String.valueOf(observationcomponentvaluerangehigh.getCode()));
		} else {
			o.addObsrvtnCmpntVlRngHiCd("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngHiCd("]");}


		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Unt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngHiUnt("[");}
		if(observationcomponentvaluerangehigh.hasUnit()) {

			o.addObsrvtnCmpntVlRngHiUnt(String.valueOf(observationcomponentvaluerangehigh.getUnit()));
		} else {
			o.addObsrvtnCmpntVlRngHiUnt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngHiUnt("]");}


		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Sys ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRngHiSys("[");}
		if(observationcomponentvaluerangehigh.hasSystem()) {

			o.addObsrvtnCmpntVlRngHiSys(String.valueOf(observationcomponentvaluerangehigh.getSystem()));
		} else {
			o.addObsrvtnCmpntVlRngHiSys("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRngHiSys("]");}


		/******************** observationcomponentvalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationcomponentvalueperiod = observationcomponent.getValuePeriod();

		/******************** Obsrvtn_Cmpnt_VlPrd_Strt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlPrdStrt("[");}
		if(observationcomponentvalueperiod.hasStart()) {

			o.addObsrvtnCmpntVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationcomponentvalueperiod.getStart())+"\"");
		} else {
			o.addObsrvtnCmpntVlPrdStrt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlPrdStrt("]");}


		/******************** Obsrvtn_Cmpnt_VlPrd_End ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlPrdEnd("[");}
		if(observationcomponentvalueperiod.hasEnd()) {

			o.addObsrvtnCmpntVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(observationcomponentvalueperiod.getEnd())+"\"");
		} else {
			o.addObsrvtnCmpntVlPrdEnd("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlPrdEnd("]");}


		/******************** Obsrvtn_Cmpnt_VlStrgTyp ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlStrgTyp("[");}
		if(observationcomponent.hasValueStringType()) {

			o.addObsrvtnCmpntVlStrgTyp("\""+observationcomponent.getValueStringType().getValueAsString()+"\"");
		} else {
			o.addObsrvtnCmpntVlStrgTyp("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlStrgTyp("]");}


		/******************** observationcomponentvalueratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio observationcomponentvalueratio = observationcomponent.getValueRatio();

		/******************** observationcomponentvaluerationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerationumerator = observationcomponentvalueratio.getNumerator();

		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioNmrtrVl("[");}
		if(observationcomponentvaluerationumerator.hasValue()) {

			o.addObsrvtnCmpntVlRtioNmrtrVl(String.valueOf(observationcomponentvaluerationumerator.getValue()));
		} else {
			o.addObsrvtnCmpntVlRtioNmrtrVl("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioNmrtrVl("]");}


		/******************** observationcomponentvaluerationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluerationumeratorcomparator = observationcomponentvaluerationumerator.getComparator();
		if(observationcomponentvaluerationumeratorcomparator!=null) {
		if(observationcomponenti == 0) {

		o.addObsrvtnCmpntVlRtioNmrtrCmprtr("[");		}
			o.addObsrvtnCmpntVlRtioNmrtrCmprtr(observationcomponentvaluerationumeratorcomparator.toCode());
		if(observationcomponenti == observationcomponentlist.size()-1) {

		o.addObsrvtnCmpntVlRtioNmrtrCmprtr("]");		}

		} else {
			o.addObsrvtnCmpntVlRtioNmrtrCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioNmrtrCd("[");}
		if(observationcomponentvaluerationumerator.hasCode()) {

			o.addObsrvtnCmpntVlRtioNmrtrCd(String.valueOf(observationcomponentvaluerationumerator.getCode()));
		} else {
			o.addObsrvtnCmpntVlRtioNmrtrCd("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioNmrtrCd("]");}


		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioNmrtrUnt("[");}
		if(observationcomponentvaluerationumerator.hasUnit()) {

			o.addObsrvtnCmpntVlRtioNmrtrUnt(String.valueOf(observationcomponentvaluerationumerator.getUnit()));
		} else {
			o.addObsrvtnCmpntVlRtioNmrtrUnt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioNmrtrUnt("]");}


		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioNmrtrSys("[");}
		if(observationcomponentvaluerationumerator.hasSystem()) {

			o.addObsrvtnCmpntVlRtioNmrtrSys(String.valueOf(observationcomponentvaluerationumerator.getSystem()));
		} else {
			o.addObsrvtnCmpntVlRtioNmrtrSys("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioNmrtrSys("]");}


		/******************** observationcomponentvalueratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvalueratiodenominator = observationcomponentvalueratio.getDenominator();

		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioDnmntrVl("[");}
		if(observationcomponentvalueratiodenominator.hasValue()) {

			o.addObsrvtnCmpntVlRtioDnmntrVl(String.valueOf(observationcomponentvalueratiodenominator.getValue()));
		} else {
			o.addObsrvtnCmpntVlRtioDnmntrVl("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioDnmntrVl("]");}


		/******************** observationcomponentvalueratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvalueratiodenominatorcomparator = observationcomponentvalueratiodenominator.getComparator();
		if(observationcomponentvalueratiodenominatorcomparator!=null) {
		if(observationcomponenti == 0) {

		o.addObsrvtnCmpntVlRtioDnmntrCmprtr("[");		}
			o.addObsrvtnCmpntVlRtioDnmntrCmprtr(observationcomponentvalueratiodenominatorcomparator.toCode());
		if(observationcomponenti == observationcomponentlist.size()-1) {

		o.addObsrvtnCmpntVlRtioDnmntrCmprtr("]");		}

		} else {
			o.addObsrvtnCmpntVlRtioDnmntrCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioDnmntrCd("[");}
		if(observationcomponentvalueratiodenominator.hasCode()) {

			o.addObsrvtnCmpntVlRtioDnmntrCd(String.valueOf(observationcomponentvalueratiodenominator.getCode()));
		} else {
			o.addObsrvtnCmpntVlRtioDnmntrCd("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioDnmntrCd("]");}


		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioDnmntrUnt("[");}
		if(observationcomponentvalueratiodenominator.hasUnit()) {

			o.addObsrvtnCmpntVlRtioDnmntrUnt(String.valueOf(observationcomponentvalueratiodenominator.getUnit()));
		} else {
			o.addObsrvtnCmpntVlRtioDnmntrUnt("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioDnmntrUnt("]");}


		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(observationcomponenti == 0) {o.addObsrvtnCmpntVlRtioDnmntrSys("[");}
		if(observationcomponentvalueratiodenominator.hasSystem()) {

			o.addObsrvtnCmpntVlRtioDnmntrSys(String.valueOf(observationcomponentvalueratiodenominator.getSystem()));
		} else {
			o.addObsrvtnCmpntVlRtioDnmntrSys("NULL");
		}

		if(observationcomponenti == observationcomponentlist.size()-1) {o.addObsrvtnCmpntVlRtioDnmntrSys("]");}


		/******************** observationcomponentinterpretation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> observationcomponentinterpretationlist = observationcomponent.getInterpretation();
		for(int observationcomponentinterpretationi = 0; observationcomponentinterpretationi<observationcomponentinterpretationlist.size();observationcomponentinterpretationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  observationcomponentinterpretation = observationcomponentinterpretationlist.get(observationcomponentinterpretationi);

		/******************** Obsrvtn_Cmpnt_Interpretation_Txt ********************************************************************************/
		if(observationcomponentinterpretationi == 0) {o.addObsrvtnCmpntInterpretationTxt("[[");}
		if(observationcomponentinterpretation.hasText()) {

			o.addObsrvtnCmpntInterpretationTxt(String.valueOf(observationcomponentinterpretation.getText()));
		} else {
			o.addObsrvtnCmpntInterpretationTxt("NULL");
		}

		if(observationcomponentinterpretationi == observationcomponentinterpretationlist.size()-1) {o.addObsrvtnCmpntInterpretationTxt("]]");}


		/******************** observationcomponentinterpretationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcomponentinterpretationcodinglist = observationcomponentinterpretation.getCoding();
		for(int observationcomponentinterpretationcodingi = 0; observationcomponentinterpretationcodingi<observationcomponentinterpretationcodinglist.size();observationcomponentinterpretationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcomponentinterpretationcoding = observationcomponentinterpretationcodinglist.get(observationcomponentinterpretationcodingi);

		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Dsply ********************************************************************************/
		if(observationcomponentinterpretationcodingi == 0) {o.addObsrvtnCmpntInterpretationCdgDsply("[[[");}
		if(observationcomponentinterpretationcoding.hasDisplay()) {

			o.addObsrvtnCmpntInterpretationCdgDsply(String.valueOf(observationcomponentinterpretationcoding.getDisplay()));
		} else {
			o.addObsrvtnCmpntInterpretationCdgDsply("NULL");
		}

		if(observationcomponentinterpretationcodingi == observationcomponentinterpretationcodinglist.size()-1) {o.addObsrvtnCmpntInterpretationCdgDsply("]]]");}


		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentinterpretationcodingi == 0) {o.addObsrvtnCmpntInterpretationCdgVrsn("[[[");}
		if(observationcomponentinterpretationcoding.hasVersion()) {

			o.addObsrvtnCmpntInterpretationCdgVrsn(String.valueOf(observationcomponentinterpretationcoding.getVersion()));
		} else {
			o.addObsrvtnCmpntInterpretationCdgVrsn("NULL");
		}

		if(observationcomponentinterpretationcodingi == observationcomponentinterpretationcodinglist.size()-1) {o.addObsrvtnCmpntInterpretationCdgVrsn("]]]");}


		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Cd ********************************************************************************/
		if(observationcomponentinterpretationcodingi == 0) {o.addObsrvtnCmpntInterpretationCdgCd("[[[");}
		if(observationcomponentinterpretationcoding.hasCode()) {

			o.addObsrvtnCmpntInterpretationCdgCd(String.valueOf(observationcomponentinterpretationcoding.getCode()));
		} else {
			o.addObsrvtnCmpntInterpretationCdgCd("NULL");
		}

		if(observationcomponentinterpretationcodingi == observationcomponentinterpretationcodinglist.size()-1) {o.addObsrvtnCmpntInterpretationCdgCd("]]]");}


		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentinterpretationcodingi == 0) {o.addObsrvtnCmpntInterpretationCdgUsrSltd("[[[");}
		if(observationcomponentinterpretationcoding.hasUserSelected()) {

			o.addObsrvtnCmpntInterpretationCdgUsrSltd(String.valueOf(observationcomponentinterpretationcoding.getUserSelected()));
		} else {
			o.addObsrvtnCmpntInterpretationCdgUsrSltd("NULL");
		}

		if(observationcomponentinterpretationcodingi == observationcomponentinterpretationcodinglist.size()-1) {o.addObsrvtnCmpntInterpretationCdgUsrSltd("]]]");}


		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Sys ********************************************************************************/
		if(observationcomponentinterpretationcodingi == 0) {o.addObsrvtnCmpntInterpretationCdgSys("[[[");}
		if(observationcomponentinterpretationcoding.hasSystem()) {

			o.addObsrvtnCmpntInterpretationCdgSys(String.valueOf(observationcomponentinterpretationcoding.getSystem()));
		} else {
			o.addObsrvtnCmpntInterpretationCdgSys("NULL");
		}

		if(observationcomponentinterpretationcodingi == observationcomponentinterpretationcodinglist.size()-1) {o.addObsrvtnCmpntInterpretationCdgSys("]]]");}


		 };
		 };
		/******************** observationcomponentvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluequantity = observationcomponent.getValueQuantity();

		/******************** Obsrvtn_Cmpnt_VlQnty_Vl ********************************************************************************/
		if(observationcomponentvaluequantity.hasValue()) {

			o.addObsrvtnCmpntVlQntyVl(String.valueOf(observationcomponentvaluequantity.getValue()));
		} else {
			o.addObsrvtnCmpntVlQntyVl("NULL");
		}


		/******************** observationcomponentvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluequantitycomparator = observationcomponentvaluequantity.getComparator();
		if(observationcomponentvaluequantitycomparator!=null) {
			o.addObsrvtnCmpntVlQntyCmprtr(observationcomponentvaluequantitycomparator.toCode());
		} else {
			o.addObsrvtnCmpntVlQntyCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_VlQnty_Cd ********************************************************************************/
		if(observationcomponentvaluequantity.hasCode()) {

			o.addObsrvtnCmpntVlQntyCd(String.valueOf(observationcomponentvaluequantity.getCode()));
		} else {
			o.addObsrvtnCmpntVlQntyCd("NULL");
		}


		/******************** Obsrvtn_Cmpnt_VlQnty_Unt ********************************************************************************/
		if(observationcomponentvaluequantity.hasUnit()) {

			o.addObsrvtnCmpntVlQntyUnt(String.valueOf(observationcomponentvaluequantity.getUnit()));
		} else {
			o.addObsrvtnCmpntVlQntyUnt("NULL");
		}


		/******************** Obsrvtn_Cmpnt_VlQnty_Sys ********************************************************************************/
		if(observationcomponentvaluequantity.hasSystem()) {

			o.addObsrvtnCmpntVlQntySys(String.valueOf(observationcomponentvaluequantity.getSystem()));
		} else {
			o.addObsrvtnCmpntVlQntySys("NULL");
		}


		/******************** observationcomponentreferencerange ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent> observationcomponentreferencerangelist = observationcomponent.getReferenceRange();
		for(int observationcomponentreferencerangei = 0; observationcomponentreferencerangei<observationcomponentreferencerangelist.size();observationcomponentreferencerangei++ ) {
		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent  observationcomponentreferencerange = observationcomponentreferencerangelist.get(observationcomponentreferencerangei);

		/******************** observationcomponentreferencerangetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentreferencerangetype = observationcomponentreferencerange.getType();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Txt ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngTypTxt("[[");}
		if(observationcomponentreferencerangetype.hasText()) {

			o.addObsrvtnCmpntRfrncRngTypTxt(String.valueOf(observationcomponentreferencerangetype.getText()));
		} else {
			o.addObsrvtnCmpntRfrncRngTypTxt("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngTypTxt("]]");}


		/******************** observationcomponentreferencerangetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcomponentreferencerangetypecodinglist = observationcomponentreferencerangetype.getCoding();
		for(int observationcomponentreferencerangetypecodingi = 0; observationcomponentreferencerangetypecodingi<observationcomponentreferencerangetypecodinglist.size();observationcomponentreferencerangetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcomponentreferencerangetypecoding = observationcomponentreferencerangetypecodinglist.get(observationcomponentreferencerangetypecodingi);

		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(observationcomponentreferencerangetypecodingi == 0) {o.addObsrvtnCmpntRfrncRngTypCdgDsply("[[[");}
		if(observationcomponentreferencerangetypecoding.hasDisplay()) {

			o.addObsrvtnCmpntRfrncRngTypCdgDsply(String.valueOf(observationcomponentreferencerangetypecoding.getDisplay()));
		} else {
			o.addObsrvtnCmpntRfrncRngTypCdgDsply("NULL");
		}

		if(observationcomponentreferencerangetypecodingi == observationcomponentreferencerangetypecodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngTypCdgDsply("]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentreferencerangetypecodingi == 0) {o.addObsrvtnCmpntRfrncRngTypCdgVrsn("[[[");}
		if(observationcomponentreferencerangetypecoding.hasVersion()) {

			o.addObsrvtnCmpntRfrncRngTypCdgVrsn(String.valueOf(observationcomponentreferencerangetypecoding.getVersion()));
		} else {
			o.addObsrvtnCmpntRfrncRngTypCdgVrsn("NULL");
		}

		if(observationcomponentreferencerangetypecodingi == observationcomponentreferencerangetypecodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngTypCdgVrsn("]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(observationcomponentreferencerangetypecodingi == 0) {o.addObsrvtnCmpntRfrncRngTypCdgCd("[[[");}
		if(observationcomponentreferencerangetypecoding.hasCode()) {

			o.addObsrvtnCmpntRfrncRngTypCdgCd(String.valueOf(observationcomponentreferencerangetypecoding.getCode()));
		} else {
			o.addObsrvtnCmpntRfrncRngTypCdgCd("NULL");
		}

		if(observationcomponentreferencerangetypecodingi == observationcomponentreferencerangetypecodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngTypCdgCd("]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentreferencerangetypecodingi == 0) {o.addObsrvtnCmpntRfrncRngTypCdgUsrSltd("[[[");}
		if(observationcomponentreferencerangetypecoding.hasUserSelected()) {

			o.addObsrvtnCmpntRfrncRngTypCdgUsrSltd(String.valueOf(observationcomponentreferencerangetypecoding.getUserSelected()));
		} else {
			o.addObsrvtnCmpntRfrncRngTypCdgUsrSltd("NULL");
		}

		if(observationcomponentreferencerangetypecodingi == observationcomponentreferencerangetypecodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngTypCdgUsrSltd("]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(observationcomponentreferencerangetypecodingi == 0) {o.addObsrvtnCmpntRfrncRngTypCdgSys("[[[");}
		if(observationcomponentreferencerangetypecoding.hasSystem()) {

			o.addObsrvtnCmpntRfrncRngTypCdgSys(String.valueOf(observationcomponentreferencerangetypecoding.getSystem()));
		} else {
			o.addObsrvtnCmpntRfrncRngTypCdgSys("NULL");
		}

		if(observationcomponentreferencerangetypecodingi == observationcomponentreferencerangetypecodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngTypCdgSys("]]]");}


		 };
		/******************** Obsrvtn_Cmpnt_RfrncRng_Txt ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngTxt("[[");}
		if(observationcomponentreferencerange.hasText()) {

			o.addObsrvtnCmpntRfrncRngTxt(String.valueOf(observationcomponentreferencerange.getText()));
		} else {
			o.addObsrvtnCmpntRfrncRngTxt("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngTxt("]]");}


		/******************** observationcomponentreferencerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangelow = observationcomponentreferencerange.getLow();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Vl ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngLwVl("[[");}
		if(observationcomponentreferencerangelow.hasValue()) {

			o.addObsrvtnCmpntRfrncRngLwVl(String.valueOf(observationcomponentreferencerangelow.getValue()));
		} else {
			o.addObsrvtnCmpntRfrncRngLwVl("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngLwVl("]]");}


		/******************** observationcomponentreferencerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangelowcomparator = observationcomponentreferencerangelow.getComparator();
		if(observationcomponentreferencerangelowcomparator!=null) {
		if(observationcomponentreferencerangei == 0) {

		o.addObsrvtnCmpntRfrncRngLwCmprtr("[[");		}
			o.addObsrvtnCmpntRfrncRngLwCmprtr(observationcomponentreferencerangelowcomparator.toCode());
		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {

		o.addObsrvtnCmpntRfrncRngLwCmprtr("]]");		}

		} else {
			o.addObsrvtnCmpntRfrncRngLwCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Cd ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngLwCd("[[");}
		if(observationcomponentreferencerangelow.hasCode()) {

			o.addObsrvtnCmpntRfrncRngLwCd(String.valueOf(observationcomponentreferencerangelow.getCode()));
		} else {
			o.addObsrvtnCmpntRfrncRngLwCd("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngLwCd("]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Unt ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngLwUnt("[[");}
		if(observationcomponentreferencerangelow.hasUnit()) {

			o.addObsrvtnCmpntRfrncRngLwUnt(String.valueOf(observationcomponentreferencerangelow.getUnit()));
		} else {
			o.addObsrvtnCmpntRfrncRngLwUnt("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngLwUnt("]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Sys ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngLwSys("[[");}
		if(observationcomponentreferencerangelow.hasSystem()) {

			o.addObsrvtnCmpntRfrncRngLwSys(String.valueOf(observationcomponentreferencerangelow.getSystem()));
		} else {
			o.addObsrvtnCmpntRfrncRngLwSys("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngLwSys("]]");}


		/******************** observationcomponentreferencerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangehigh = observationcomponentreferencerange.getHigh();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Vl ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngHiVl("[[");}
		if(observationcomponentreferencerangehigh.hasValue()) {

			o.addObsrvtnCmpntRfrncRngHiVl(String.valueOf(observationcomponentreferencerangehigh.getValue()));
		} else {
			o.addObsrvtnCmpntRfrncRngHiVl("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngHiVl("]]");}


		/******************** observationcomponentreferencerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangehighcomparator = observationcomponentreferencerangehigh.getComparator();
		if(observationcomponentreferencerangehighcomparator!=null) {
		if(observationcomponentreferencerangei == 0) {

		o.addObsrvtnCmpntRfrncRngHiCmprtr("[[");		}
			o.addObsrvtnCmpntRfrncRngHiCmprtr(observationcomponentreferencerangehighcomparator.toCode());
		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {

		o.addObsrvtnCmpntRfrncRngHiCmprtr("]]");		}

		} else {
			o.addObsrvtnCmpntRfrncRngHiCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Cd ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngHiCd("[[");}
		if(observationcomponentreferencerangehigh.hasCode()) {

			o.addObsrvtnCmpntRfrncRngHiCd(String.valueOf(observationcomponentreferencerangehigh.getCode()));
		} else {
			o.addObsrvtnCmpntRfrncRngHiCd("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngHiCd("]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Unt ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngHiUnt("[[");}
		if(observationcomponentreferencerangehigh.hasUnit()) {

			o.addObsrvtnCmpntRfrncRngHiUnt(String.valueOf(observationcomponentreferencerangehigh.getUnit()));
		} else {
			o.addObsrvtnCmpntRfrncRngHiUnt("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngHiUnt("]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Sys ********************************************************************************/
		if(observationcomponentreferencerangei == 0) {o.addObsrvtnCmpntRfrncRngHiSys("[[");}
		if(observationcomponentreferencerangehigh.hasSystem()) {

			o.addObsrvtnCmpntRfrncRngHiSys(String.valueOf(observationcomponentreferencerangehigh.getSystem()));
		} else {
			o.addObsrvtnCmpntRfrncRngHiSys("NULL");
		}

		if(observationcomponentreferencerangei == observationcomponentreferencerangelist.size()-1) {o.addObsrvtnCmpntRfrncRngHiSys("]]");}


		/******************** observationcomponentreferencerangeappliesto ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> observationcomponentreferencerangeappliestolist = observationcomponentreferencerange.getAppliesTo();
		for(int observationcomponentreferencerangeappliestoi = 0; observationcomponentreferencerangeappliestoi<observationcomponentreferencerangeappliestolist.size();observationcomponentreferencerangeappliestoi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  observationcomponentreferencerangeappliesto = observationcomponentreferencerangeappliestolist.get(observationcomponentreferencerangeappliestoi);

		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(observationcomponentreferencerangeappliestoi == 0) {o.addObsrvtnCmpntRfrncRngAppliesToTxt("[[[");}
		if(observationcomponentreferencerangeappliesto.hasText()) {

			o.addObsrvtnCmpntRfrncRngAppliesToTxt(String.valueOf(observationcomponentreferencerangeappliesto.getText()));
		} else {
			o.addObsrvtnCmpntRfrncRngAppliesToTxt("NULL");
		}

		if(observationcomponentreferencerangeappliestoi == observationcomponentreferencerangeappliestolist.size()-1) {o.addObsrvtnCmpntRfrncRngAppliesToTxt("]]]");}


		/******************** observationcomponentreferencerangeappliestocoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> observationcomponentreferencerangeappliestocodinglist = observationcomponentreferencerangeappliesto.getCoding();
		for(int observationcomponentreferencerangeappliestocodingi = 0; observationcomponentreferencerangeappliestocodingi<observationcomponentreferencerangeappliestocodinglist.size();observationcomponentreferencerangeappliestocodingi++ ) {
		org.hl7.fhir.r4.model.Coding  observationcomponentreferencerangeappliestocoding = observationcomponentreferencerangeappliestocodinglist.get(observationcomponentreferencerangeappliestocodingi);

		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(observationcomponentreferencerangeappliestocodingi == 0) {o.addObsrvtnCmpntRfrncRngAppliesToCdgDsply("[[[[");}
		if(observationcomponentreferencerangeappliestocoding.hasDisplay()) {

			o.addObsrvtnCmpntRfrncRngAppliesToCdgDsply(String.valueOf(observationcomponentreferencerangeappliestocoding.getDisplay()));
		} else {
			o.addObsrvtnCmpntRfrncRngAppliesToCdgDsply("NULL");
		}

		if(observationcomponentreferencerangeappliestocodingi == observationcomponentreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngAppliesToCdgDsply("]]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentreferencerangeappliestocodingi == 0) {o.addObsrvtnCmpntRfrncRngAppliesToCdgVrsn("[[[[");}
		if(observationcomponentreferencerangeappliestocoding.hasVersion()) {

			o.addObsrvtnCmpntRfrncRngAppliesToCdgVrsn(String.valueOf(observationcomponentreferencerangeappliestocoding.getVersion()));
		} else {
			o.addObsrvtnCmpntRfrncRngAppliesToCdgVrsn("NULL");
		}

		if(observationcomponentreferencerangeappliestocodingi == observationcomponentreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngAppliesToCdgVrsn("]]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(observationcomponentreferencerangeappliestocodingi == 0) {o.addObsrvtnCmpntRfrncRngAppliesToCdgCd("[[[[");}
		if(observationcomponentreferencerangeappliestocoding.hasCode()) {

			o.addObsrvtnCmpntRfrncRngAppliesToCdgCd(String.valueOf(observationcomponentreferencerangeappliestocoding.getCode()));
		} else {
			o.addObsrvtnCmpntRfrncRngAppliesToCdgCd("NULL");
		}

		if(observationcomponentreferencerangeappliestocodingi == observationcomponentreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngAppliesToCdgCd("]]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentreferencerangeappliestocodingi == 0) {o.addObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd("[[[[");}
		if(observationcomponentreferencerangeappliestocoding.hasUserSelected()) {

			o.addObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd(String.valueOf(observationcomponentreferencerangeappliestocoding.getUserSelected()));
		} else {
			o.addObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd("NULL");
		}

		if(observationcomponentreferencerangeappliestocodingi == observationcomponentreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd("]]]]");}


		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(observationcomponentreferencerangeappliestocodingi == 0) {o.addObsrvtnCmpntRfrncRngAppliesToCdgSys("[[[[");}
		if(observationcomponentreferencerangeappliestocoding.hasSystem()) {

			o.addObsrvtnCmpntRfrncRngAppliesToCdgSys(String.valueOf(observationcomponentreferencerangeappliestocoding.getSystem()));
		} else {
			o.addObsrvtnCmpntRfrncRngAppliesToCdgSys("NULL");
		}

		if(observationcomponentreferencerangeappliestocodingi == observationcomponentreferencerangeappliestocodinglist.size()-1) {o.addObsrvtnCmpntRfrncRngAppliesToCdgSys("]]]]");}


		 };
		 };
		/******************** observationcomponentreferencerangeage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationcomponentreferencerangeage = observationcomponentreferencerange.getAge();

		/******************** observationcomponentreferencerangeagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangeagelow = observationcomponentreferencerangeage.getLow();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasValue()) {

			o.addObsrvtnCmpntRfrncRngAgeLwVl(String.valueOf(observationcomponentreferencerangeagelow.getValue()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeLwVl("NULL");
		}


		/******************** observationcomponentreferencerangeagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangeagelowcomparator = observationcomponentreferencerangeagelow.getComparator();
		if(observationcomponentreferencerangeagelowcomparator!=null) {
			o.addObsrvtnCmpntRfrncRngAgeLwCmprtr(observationcomponentreferencerangeagelowcomparator.toCode());
		} else {
			o.addObsrvtnCmpntRfrncRngAgeLwCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasCode()) {

			o.addObsrvtnCmpntRfrncRngAgeLwCd(String.valueOf(observationcomponentreferencerangeagelow.getCode()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeLwCd("NULL");
		}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasUnit()) {

			o.addObsrvtnCmpntRfrncRngAgeLwUnt(String.valueOf(observationcomponentreferencerangeagelow.getUnit()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeLwUnt("NULL");
		}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasSystem()) {

			o.addObsrvtnCmpntRfrncRngAgeLwSys(String.valueOf(observationcomponentreferencerangeagelow.getSystem()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeLwSys("NULL");
		}


		/******************** observationcomponentreferencerangeagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangeagehigh = observationcomponentreferencerangeage.getHigh();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasValue()) {

			o.addObsrvtnCmpntRfrncRngAgeHiVl(String.valueOf(observationcomponentreferencerangeagehigh.getValue()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeHiVl("NULL");
		}


		/******************** observationcomponentreferencerangeagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangeagehighcomparator = observationcomponentreferencerangeagehigh.getComparator();
		if(observationcomponentreferencerangeagehighcomparator!=null) {
			o.addObsrvtnCmpntRfrncRngAgeHiCmprtr(observationcomponentreferencerangeagehighcomparator.toCode());
		} else {
			o.addObsrvtnCmpntRfrncRngAgeHiCmprtr("NULL");
		}

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasCode()) {

			o.addObsrvtnCmpntRfrncRngAgeHiCd(String.valueOf(observationcomponentreferencerangeagehigh.getCode()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeHiCd("NULL");
		}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasUnit()) {

			o.addObsrvtnCmpntRfrncRngAgeHiUnt(String.valueOf(observationcomponentreferencerangeagehigh.getUnit()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeHiUnt("NULL");
		}


		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasSystem()) {

			o.addObsrvtnCmpntRfrncRngAgeHiSys(String.valueOf(observationcomponentreferencerangeagehigh.getSystem()));
		} else {
			o.addObsrvtnCmpntRfrncRngAgeHiSys("NULL");
		}


		 };
		 };
		return o;
	}
}
