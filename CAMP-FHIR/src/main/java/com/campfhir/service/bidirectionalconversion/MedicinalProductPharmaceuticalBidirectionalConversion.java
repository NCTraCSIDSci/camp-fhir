package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPharmaceutical;
public class MedicinalProductPharmaceuticalBidirectionalConversion 
{
	public MedicinalProductPharmaceutical MedicinalProductPharmaceuticals(org.hl7.fhir.r4.model.MedicinalProductPharmaceutical medicinalproductpharmaceutical) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductPharmaceutical m = new  main.java.com.campfhir.model.MedicinalProductPharmaceutical();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductpharmaceutical.getIdElement().getIdPart());

		/******************** medicinalproductpharmaceuticalidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicinalproductpharmaceuticalidentifierlist = medicinalproductpharmaceutical.getIdentifier();
		for(int medicinalproductpharmaceuticalidentifieri = 0; medicinalproductpharmaceuticalidentifieri<medicinalproductpharmaceuticalidentifierlist.size();medicinalproductpharmaceuticalidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicinalproductpharmaceuticalidentifier = medicinalproductpharmaceuticalidentifierlist.get(medicinalproductpharmaceuticalidentifieri);

		/******************** MdcnlPrdctPhrmctcl_Id_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifieri == 0) {m.addMdcnlPrdctPhrmctclIdVl("[");}
		if(medicinalproductpharmaceuticalidentifier.hasValue()) {

			m.addMdcnlPrdctPhrmctclIdVl(String.valueOf(medicinalproductpharmaceuticalidentifier.getValue()));
		} else {
			m.addMdcnlPrdctPhrmctclIdVl("NULL");
		}

		if(medicinalproductpharmaceuticalidentifieri == medicinalproductpharmaceuticalidentifierlist.size()-1) {m.addMdcnlPrdctPhrmctclIdVl("]");}


		/******************** medicinalproductpharmaceuticalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalidentifiertype = medicinalproductpharmaceuticalidentifier.getType();

		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifieri == 0) {m.addMdcnlPrdctPhrmctclIdTypTxt("[");}
		if(medicinalproductpharmaceuticalidentifiertype.hasText()) {

			m.addMdcnlPrdctPhrmctclIdTypTxt(String.valueOf(medicinalproductpharmaceuticalidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclIdTypTxt("NULL");
		}

		if(medicinalproductpharmaceuticalidentifieri == medicinalproductpharmaceuticalidentifierlist.size()-1) {m.addMdcnlPrdctPhrmctclIdTypTxt("]");}


		/******************** medicinalproductpharmaceuticalidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticalidentifiertypecodinglist = medicinalproductpharmaceuticalidentifiertype.getCoding();
		for(int medicinalproductpharmaceuticalidentifiertypecodingi = 0; medicinalproductpharmaceuticalidentifiertypecodingi<medicinalproductpharmaceuticalidentifiertypecodinglist.size();medicinalproductpharmaceuticalidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticalidentifiertypecoding = medicinalproductpharmaceuticalidentifiertypecodinglist.get(medicinalproductpharmaceuticalidentifiertypecodingi);

		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecodingi == 0) {m.addMdcnlPrdctPhrmctclIdTypCdgDsply("[[");}
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclIdTypCdgDsply(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclIdTypCdgDsply("NULL");
		}

		if(medicinalproductpharmaceuticalidentifiertypecodingi == medicinalproductpharmaceuticalidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclIdTypCdgDsply("]]");}


		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecodingi == 0) {m.addMdcnlPrdctPhrmctclIdTypCdgVrsn("[[");}
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclIdTypCdgVrsn(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclIdTypCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticalidentifiertypecodingi == medicinalproductpharmaceuticalidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclIdTypCdgVrsn("]]");}


		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecodingi == 0) {m.addMdcnlPrdctPhrmctclIdTypCdgCd("[[");}
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclIdTypCdgCd(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclIdTypCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticalidentifiertypecodingi == medicinalproductpharmaceuticalidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclIdTypCdgCd("]]");}


		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecodingi == 0) {m.addMdcnlPrdctPhrmctclIdTypCdgUsrSltd("[[");}
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclIdTypCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductpharmaceuticalidentifiertypecodingi == medicinalproductpharmaceuticalidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclIdTypCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecodingi == 0) {m.addMdcnlPrdctPhrmctclIdTypCdgSys("[[");}
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclIdTypCdgSys(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclIdTypCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticalidentifiertypecodingi == medicinalproductpharmaceuticalidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclIdTypCdgSys("]]");}


		 };
		/******************** medicinalproductpharmaceuticalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpharmaceuticalidentifierperiod = medicinalproductpharmaceuticalidentifier.getPeriod();

		/******************** MdcnlPrdctPhrmctcl_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifieri == 0) {m.addMdcnlPrdctPhrmctclIdPrdStrt("[");}
		if(medicinalproductpharmaceuticalidentifierperiod.hasStart()) {

			m.addMdcnlPrdctPhrmctclIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpharmaceuticalidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctPhrmctclIdPrdStrt("NULL");
		}

		if(medicinalproductpharmaceuticalidentifieri == medicinalproductpharmaceuticalidentifierlist.size()-1) {m.addMdcnlPrdctPhrmctclIdPrdStrt("]");}


		/******************** MdcnlPrdctPhrmctcl_Id_Prd_End ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifieri == 0) {m.addMdcnlPrdctPhrmctclIdPrdEnd("[");}
		if(medicinalproductpharmaceuticalidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctPhrmctclIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductpharmaceuticalidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctPhrmctclIdPrdEnd("NULL");
		}

		if(medicinalproductpharmaceuticalidentifieri == medicinalproductpharmaceuticalidentifierlist.size()-1) {m.addMdcnlPrdctPhrmctclIdPrdEnd("]");}


		/******************** medicinalproductpharmaceuticalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpharmaceuticalidentifieruse = medicinalproductpharmaceuticalidentifier.getUse();
		if(medicinalproductpharmaceuticalidentifieruse!=null) {
		if(medicinalproductpharmaceuticalidentifieri == 0) {

		m.addMdcnlPrdctPhrmctclIdUse("[");		}
			m.addMdcnlPrdctPhrmctclIdUse(medicinalproductpharmaceuticalidentifieruse.toCode());
		if(medicinalproductpharmaceuticalidentifieri == medicinalproductpharmaceuticalidentifierlist.size()-1) {

		m.addMdcnlPrdctPhrmctclIdUse("]");		}

		} else {
			m.addMdcnlPrdctPhrmctclIdUse("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_Id_Assigner ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifieri == 0) {m.addMdcnlPrdctPhrmctclIdAssigner("[");}
		if(medicinalproductpharmaceuticalidentifier.hasAssigner()) {

			if(medicinalproductpharmaceuticalidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctPhrmctclIdAssigner(medicinalproductpharmaceuticalidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctPhrmctclIdAssigner("NULL");
		}

		if(medicinalproductpharmaceuticalidentifieri == medicinalproductpharmaceuticalidentifierlist.size()-1) {m.addMdcnlPrdctPhrmctclIdAssigner("]");}


		/******************** MdcnlPrdctPhrmctcl_Id_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifieri == 0) {m.addMdcnlPrdctPhrmctclIdSys("[");}
		if(medicinalproductpharmaceuticalidentifier.hasSystem()) {

			m.addMdcnlPrdctPhrmctclIdSys(String.valueOf(medicinalproductpharmaceuticalidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclIdSys("NULL");
		}

		if(medicinalproductpharmaceuticalidentifieri == medicinalproductpharmaceuticalidentifierlist.size()-1) {m.addMdcnlPrdctPhrmctclIdSys("]");}


		 };
		/******************** medicinalproductpharmaceuticalunitofpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalunitofpresentation = medicinalproductpharmaceutical.getUnitOfPresentation();

		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentation.hasText()) {

			m.addMdcnlPrdctPhrmctclUntOfPrsnttnTxt(String.valueOf(medicinalproductpharmaceuticalunitofpresentation.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclUntOfPrsnttnTxt("NULL");
		}


		/******************** medicinalproductpharmaceuticalunitofpresentationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticalunitofpresentationcodinglist = medicinalproductpharmaceuticalunitofpresentation.getCoding();
		for(int medicinalproductpharmaceuticalunitofpresentationcodingi = 0; medicinalproductpharmaceuticalunitofpresentationcodingi<medicinalproductpharmaceuticalunitofpresentationcodinglist.size();medicinalproductpharmaceuticalunitofpresentationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticalunitofpresentationcoding = medicinalproductpharmaceuticalunitofpresentationcodinglist.get(medicinalproductpharmaceuticalunitofpresentationcodingi);

		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcodingi == 0) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply("[");}
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply("NULL");
		}

		if(medicinalproductpharmaceuticalunitofpresentationcodingi == medicinalproductpharmaceuticalunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply("]");}


		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcodingi == 0) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn("[");}
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticalunitofpresentationcodingi == medicinalproductpharmaceuticalunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn("]");}


		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcodingi == 0) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd("[");}
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticalunitofpresentationcodingi == medicinalproductpharmaceuticalunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd("]");}


		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcodingi == 0) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd("[");}
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd("NULL");
		}

		if(medicinalproductpharmaceuticalunitofpresentationcodingi == medicinalproductpharmaceuticalunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd("]");}


		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcodingi == 0) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys("[");}
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticalunitofpresentationcodingi == medicinalproductpharmaceuticalunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys("]");}


		 };
		/******************** medicinalproductpharmaceuticalrouteofadministration ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent> medicinalproductpharmaceuticalrouteofadministrationlist = medicinalproductpharmaceutical.getRouteOfAdministration();
		for(int medicinalproductpharmaceuticalrouteofadministrationi = 0; medicinalproductpharmaceuticalrouteofadministrationi<medicinalproductpharmaceuticalrouteofadministrationlist.size();medicinalproductpharmaceuticalrouteofadministrationi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent  medicinalproductpharmaceuticalrouteofadministration = medicinalproductpharmaceuticalrouteofadministrationlist.get(medicinalproductpharmaceuticalrouteofadministrationi);

		/******************** medicinalproductpharmaceuticalrouteofadministrationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationcode = medicinalproductpharmaceuticalrouteofadministration.getCode();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationcode.hasText()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcode.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticalrouteofadministrationcodecodinglist = medicinalproductpharmaceuticalrouteofadministrationcode.getCoding();
		for(int medicinalproductpharmaceuticalrouteofadministrationcodecodingi = 0; medicinalproductpharmaceuticalrouteofadministrationcodecodingi<medicinalproductpharmaceuticalrouteofadministrationcodecodinglist.size();medicinalproductpharmaceuticalrouteofadministrationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticalrouteofadministrationcodecoding = medicinalproductpharmaceuticalrouteofadministrationcodecodinglist.get(medicinalproductpharmaceuticalrouteofadministrationcodecodingi);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply("[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == medicinalproductpharmaceuticalrouteofadministrationcodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply("]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn("[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == medicinalproductpharmaceuticalrouteofadministrationcodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn("]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd("[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == medicinalproductpharmaceuticalrouteofadministrationcodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd("]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd("[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == medicinalproductpharmaceuticalrouteofadministrationcodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys("[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationcodecodingi == medicinalproductpharmaceuticalrouteofadministrationcodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys("]]");}


		 };
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod = medicinalproductpharmaceuticalrouteofadministration.getMaxDosePerTreatmentPeriod();

		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod.getNumerator();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasValue()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getValue()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getComparator();
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator!=null) {
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr("[");		}
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator.toCode());
		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr("]");		}

		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasUnit()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod.getDenominator();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasValue()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getValue()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getComparator();
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator!=null) {
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr("[");		}
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator.toCode());
		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr("]");		}

		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasUnit()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getUnit()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod = medicinalproductpharmaceuticalrouteofadministration.getMaxTreatmentPeriod();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.hasValue()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.getValue()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiodcomparator = medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.getComparator();
		if(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiodcomparator!=null) {
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCmprtr("[");		}
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiodcomparator.toCode());
		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCmprtr("]");		}

		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCmprtr("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.hasUnit()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.getUnit()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationfirstdose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationfirstdose = medicinalproductpharmaceuticalrouteofadministration.getFirstDose();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasValue()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getValue()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator = medicinalproductpharmaceuticalrouteofadministrationfirstdose.getComparator();
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator!=null) {
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr("[");		}
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr(medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator.toCode());
		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr("]");		}

		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasUnit()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getUnit()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday = medicinalproductpharmaceuticalrouteofadministration.getMaxDosePerDay();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasValue()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getValue()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator = medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getComparator();
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator!=null) {
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr("[");		}
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator.toCode());
		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr("]");		}

		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasUnit()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getUnit()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt("]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys("[");}
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationi == medicinalproductpharmaceuticalrouteofadministrationlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys("]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecies ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent> medicinalproductpharmaceuticalrouteofadministrationtargetspecieslist = medicinalproductpharmaceuticalrouteofadministration.getTargetSpecies();
		for(int medicinalproductpharmaceuticalrouteofadministrationtargetspeciesi = 0; medicinalproductpharmaceuticalrouteofadministrationtargetspeciesi<medicinalproductpharmaceuticalrouteofadministrationtargetspecieslist.size();medicinalproductpharmaceuticalrouteofadministrationtargetspeciesi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent  medicinalproductpharmaceuticalrouteofadministrationtargetspecies = medicinalproductpharmaceuticalrouteofadministrationtargetspecieslist.get(medicinalproductpharmaceuticalrouteofadministrationtargetspeciesi);

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode = medicinalproductpharmaceuticalrouteofadministrationtargetspecies.getCode();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciesi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt("[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode.hasText()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciesi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieslist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt("]]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist = medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode.getCoding();
		for(int medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi = 0; medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi<medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist.size();medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding = medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist.get(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply("]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn("]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd("]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys("]]]");}


		 };
		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent> medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist = medicinalproductpharmaceuticalrouteofadministrationtargetspecies.getWithdrawalPeriod();
		for(int medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi = 0; medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi<medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.size();medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent  medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.get(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi);

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.getValue();

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvaluecomparator = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getComparator();
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvaluecomparator!=null) {
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == 0) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr("[[[");		}
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvaluecomparator.toCode());
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.size()-1) {

		m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr("]]]");		}

		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd("]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.hasUnit()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getUnit()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt("]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys("]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_SprtingInfo ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.hasSupportingInformation()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.getSupportingInformation()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo("]]]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.getTissue();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt("[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue.hasText()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodlist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt("]]]");}


		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue.getCoding();
		for(int medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi = 0; medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi<medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist.size();medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist.get(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp("[[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp("]]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn("[[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn("]]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd("[[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd("]]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs("[[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs("]]]]");}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == 0) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys("[[[[");}
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodingi == medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys("]]]]");}


		 };
		 };
		 };
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxsingledose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxsingledose = medicinalproductpharmaceuticalrouteofadministration.getMaxSingleDose();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasValue()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getValue()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseVl("NULL");
		}


		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator = medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getComparator();
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator!=null) {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator.toCode());
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCmprtr("NULL");
		}

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasCode()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCd("NULL");
		}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasUnit()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getUnit()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseUnt("NULL");
		}


		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasSystem()) {

			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseSys("NULL");
		}


		 };
		/******************** medicinalproductpharmaceuticaladministrabledoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticaladministrabledoseform = medicinalproductpharmaceutical.getAdministrableDoseForm();

		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseform.hasText()) {

			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmTxt(String.valueOf(medicinalproductpharmaceuticaladministrabledoseform.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmTxt("NULL");
		}


		/******************** medicinalproductpharmaceuticaladministrabledoseformcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticaladministrabledoseformcodinglist = medicinalproductpharmaceuticaladministrabledoseform.getCoding();
		for(int medicinalproductpharmaceuticaladministrabledoseformcodingi = 0; medicinalproductpharmaceuticaladministrabledoseformcodingi<medicinalproductpharmaceuticaladministrabledoseformcodinglist.size();medicinalproductpharmaceuticaladministrabledoseformcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticaladministrabledoseformcoding = medicinalproductpharmaceuticaladministrabledoseformcodinglist.get(medicinalproductpharmaceuticaladministrabledoseformcodingi);

		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == 0) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply("[");}
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply("NULL");
		}

		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == medicinalproductpharmaceuticaladministrabledoseformcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply("]");}


		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == 0) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn("[");}
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == medicinalproductpharmaceuticaladministrabledoseformcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn("]");}


		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == 0) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd("[");}
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == medicinalproductpharmaceuticaladministrabledoseformcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd("]");}


		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == 0) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd("[");}
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd("NULL");
		}

		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == medicinalproductpharmaceuticaladministrabledoseformcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd("]");}


		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == 0) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys("[");}
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticaladministrabledoseformcodingi == medicinalproductpharmaceuticaladministrabledoseformcodinglist.size()-1) {m.addMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys("]");}


		 };
		/******************** MdcnlPrdctPhrmctcl_Igrdnt ********************************************************************************/
		if(medicinalproductpharmaceutical.hasIngredient()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpharmaceutical.getIngredient().size(); incr++) {
				array = array + medicinalproductpharmaceutical.getIngredient().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPhrmctclIgrdnt(array);

		} else {
			m.addMdcnlPrdctPhrmctclIgrdnt("NULL");
		}


		/******************** MdcnlPrdctPhrmctcl_Dvc ********************************************************************************/
		if(medicinalproductpharmaceutical.hasDevice()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductpharmaceutical.getDevice().size(); incr++) {
				array = array + medicinalproductpharmaceutical.getDevice().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctPhrmctclDvc(array);

		} else {
			m.addMdcnlPrdctPhrmctclDvc("NULL");
		}


		/******************** medicinalproductpharmaceuticalcharacteristics ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent> medicinalproductpharmaceuticalcharacteristicslist = medicinalproductpharmaceutical.getCharacteristics();
		for(int medicinalproductpharmaceuticalcharacteristicsi = 0; medicinalproductpharmaceuticalcharacteristicsi<medicinalproductpharmaceuticalcharacteristicslist.size();medicinalproductpharmaceuticalcharacteristicsi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent  medicinalproductpharmaceuticalcharacteristics = medicinalproductpharmaceuticalcharacteristicslist.get(medicinalproductpharmaceuticalcharacteristicsi);

		/******************** medicinalproductpharmaceuticalcharacteristicscode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalcharacteristicscode = medicinalproductpharmaceuticalcharacteristics.getCode();

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsCdTxt("[");}
		if(medicinalproductpharmaceuticalcharacteristicscode.hasText()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsCdTxt(String.valueOf(medicinalproductpharmaceuticalcharacteristicscode.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsCdTxt("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicsi == medicinalproductpharmaceuticalcharacteristicslist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsCdTxt("]");}


		/******************** medicinalproductpharmaceuticalcharacteristicscodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticalcharacteristicscodecodinglist = medicinalproductpharmaceuticalcharacteristicscode.getCoding();
		for(int medicinalproductpharmaceuticalcharacteristicscodecodingi = 0; medicinalproductpharmaceuticalcharacteristicscodecodingi<medicinalproductpharmaceuticalcharacteristicscodecodinglist.size();medicinalproductpharmaceuticalcharacteristicscodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticalcharacteristicscodecoding = medicinalproductpharmaceuticalcharacteristicscodecodinglist.get(medicinalproductpharmaceuticalcharacteristicscodecodingi);

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply("[[");}
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == medicinalproductpharmaceuticalcharacteristicscodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn("[[");}
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == medicinalproductpharmaceuticalcharacteristicscodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgCd("[[");}
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgCd(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == medicinalproductpharmaceuticalcharacteristicscodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgCd("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd("[[");}
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == medicinalproductpharmaceuticalcharacteristicscodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgSys("[[");}
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgSys(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicscodecodingi == medicinalproductpharmaceuticalcharacteristicscodecodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsCdCdgSys("]]");}


		 };
		/******************** medicinalproductpharmaceuticalcharacteristicsstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalcharacteristicsstatus = medicinalproductpharmaceuticalcharacteristics.getStatus();

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsStsTxt("[");}
		if(medicinalproductpharmaceuticalcharacteristicsstatus.hasText()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsStsTxt(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatus.getText()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsStsTxt("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicsi == medicinalproductpharmaceuticalcharacteristicslist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsStsTxt("]");}


		/******************** medicinalproductpharmaceuticalcharacteristicsstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductpharmaceuticalcharacteristicsstatuscodinglist = medicinalproductpharmaceuticalcharacteristicsstatus.getCoding();
		for(int medicinalproductpharmaceuticalcharacteristicsstatuscodingi = 0; medicinalproductpharmaceuticalcharacteristicsstatuscodingi<medicinalproductpharmaceuticalcharacteristicsstatuscodinglist.size();medicinalproductpharmaceuticalcharacteristicsstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductpharmaceuticalcharacteristicsstatuscoding = medicinalproductpharmaceuticalcharacteristicsstatuscodinglist.get(medicinalproductpharmaceuticalcharacteristicsstatuscodingi);

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply("[[");}
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasDisplay()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == medicinalproductpharmaceuticalcharacteristicsstatuscodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn("[[");}
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasVersion()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getVersion()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == medicinalproductpharmaceuticalcharacteristicsstatuscodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgCd("[[");}
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasCode()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgCd(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getCode()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgCd("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == medicinalproductpharmaceuticalcharacteristicsstatuscodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgCd("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd("[[");}
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasUserSelected()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == medicinalproductpharmaceuticalcharacteristicsstatuscodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd("]]");}


		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == 0) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgSys("[[");}
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasSystem()) {

			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgSys(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getSystem()));
		} else {
			m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgSys("NULL");
		}

		if(medicinalproductpharmaceuticalcharacteristicsstatuscodingi == medicinalproductpharmaceuticalcharacteristicsstatuscodinglist.size()-1) {m.addMdcnlPrdctPhrmctclCrctrstcsStsCdgSys("]]");}


		 };
		 };
		return m;
	}
}
