package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ActivityDefinition;
public class ActivityDefinitionBidirectionalConversion 
{
	public ActivityDefinition ActivityDefinitions(org.hl7.fhir.r4.model.ActivityDefinition activitydefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ActivityDefinition a = new  main.java.com.campfhir.model.ActivityDefinition();

		/******************** id ********************************************************************************/
		a.setId(activitydefinition.getIdElement().getIdPart());

		/******************** ActvtyDfn_Nm ********************************************************************************/
		if(activitydefinition.hasName()) {

			a.addActvtyDfnNm(String.valueOf(activitydefinition.getName()));
		} else {
			a.addActvtyDfnNm("NULL");
		}


		/******************** ActvtyDfn_Lctn ********************************************************************************/
		if(activitydefinition.hasLocation()) {

			if(activitydefinition.getLocation().getReference() != null) {
			a.addActvtyDfnLctn(activitydefinition.getLocation().getReference());
			}
		} else {
			a.addActvtyDfnLctn("NULL");
		}


		/******************** activitydefinitionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.RequestPriority activitydefinitionpriority = activitydefinition.getPriority();
		if(activitydefinitionpriority!=null) {
			a.addActvtyDfnPriority(activitydefinitionpriority.toCode());
		} else {
			a.addActvtyDfnPriority("NULL");
		}

		/******************** ActvtyDfn_Vrsn ********************************************************************************/
		if(activitydefinition.hasVersion()) {

			a.addActvtyDfnVrsn(String.valueOf(activitydefinition.getVersion()));
		} else {
			a.addActvtyDfnVrsn("NULL");
		}


		/******************** ActvtyDfn_Dt ********************************************************************************/
		if(activitydefinition.hasDate()) {

			a.addActvtyDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinition.getDate())+"\"");
		} else {
			a.addActvtyDfnDt("NULL");
		}


		/******************** activitydefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitioncode = activitydefinition.getCode();

		/******************** ActvtyDfn_Cd_Txt ********************************************************************************/
		if(activitydefinitioncode.hasText()) {

			a.addActvtyDfnCdTxt(String.valueOf(activitydefinitioncode.getText()));
		} else {
			a.addActvtyDfnCdTxt("NULL");
		}


		/******************** activitydefinitioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitioncodecodinglist = activitydefinitioncode.getCoding();
		for(int activitydefinitioncodecodingi = 0; activitydefinitioncodecodingi<activitydefinitioncodecodinglist.size();activitydefinitioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitioncodecoding = activitydefinitioncodecodinglist.get(activitydefinitioncodecodingi);

		/******************** ActvtyDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitioncodecodingi == 0) {a.addActvtyDfnCdCdgDsply("[");}
		if(activitydefinitioncodecoding.hasDisplay()) {

			a.addActvtyDfnCdCdgDsply(String.valueOf(activitydefinitioncodecoding.getDisplay()));
		} else {
			a.addActvtyDfnCdCdgDsply("NULL");
		}

		if(activitydefinitioncodecodingi == activitydefinitioncodecodinglist.size()-1) {a.addActvtyDfnCdCdgDsply("]");}


		/******************** ActvtyDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitioncodecodingi == 0) {a.addActvtyDfnCdCdgVrsn("[");}
		if(activitydefinitioncodecoding.hasVersion()) {

			a.addActvtyDfnCdCdgVrsn(String.valueOf(activitydefinitioncodecoding.getVersion()));
		} else {
			a.addActvtyDfnCdCdgVrsn("NULL");
		}

		if(activitydefinitioncodecodingi == activitydefinitioncodecodinglist.size()-1) {a.addActvtyDfnCdCdgVrsn("]");}


		/******************** ActvtyDfn_Cd_Cdg_Cd ********************************************************************************/
		if(activitydefinitioncodecodingi == 0) {a.addActvtyDfnCdCdgCd("[");}
		if(activitydefinitioncodecoding.hasCode()) {

			a.addActvtyDfnCdCdgCd(String.valueOf(activitydefinitioncodecoding.getCode()));
		} else {
			a.addActvtyDfnCdCdgCd("NULL");
		}

		if(activitydefinitioncodecodingi == activitydefinitioncodecodinglist.size()-1) {a.addActvtyDfnCdCdgCd("]");}


		/******************** ActvtyDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitioncodecodingi == 0) {a.addActvtyDfnCdCdgUsrSltd("[");}
		if(activitydefinitioncodecoding.hasUserSelected()) {

			a.addActvtyDfnCdCdgUsrSltd(String.valueOf(activitydefinitioncodecoding.getUserSelected()));
		} else {
			a.addActvtyDfnCdCdgUsrSltd("NULL");
		}

		if(activitydefinitioncodecodingi == activitydefinitioncodecodinglist.size()-1) {a.addActvtyDfnCdCdgUsrSltd("]");}


		/******************** ActvtyDfn_Cd_Cdg_Sys ********************************************************************************/
		if(activitydefinitioncodecodingi == 0) {a.addActvtyDfnCdCdgSys("[");}
		if(activitydefinitioncodecoding.hasSystem()) {

			a.addActvtyDfnCdCdgSys(String.valueOf(activitydefinitioncodecoding.getSystem()));
		} else {
			a.addActvtyDfnCdCdgSys("NULL");
		}

		if(activitydefinitioncodecodingi == activitydefinitioncodecodinglist.size()-1) {a.addActvtyDfnCdCdgSys("]");}


		 };
		/******************** activitydefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus activitydefinitionstatus = activitydefinition.getStatus();
		if(activitydefinitionstatus!=null) {
			a.addActvtyDfnSts(activitydefinitionstatus.toCode());
		} else {
			a.addActvtyDfnSts("NULL");
		}

		/******************** ActvtyDfn_Dscrptn ********************************************************************************/
		if(activitydefinition.hasDescription()) {

			a.addActvtyDfnDscrptn(String.valueOf(activitydefinition.getDescription()));
		} else {
			a.addActvtyDfnDscrptn("NULL");
		}


		/******************** activitydefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> activitydefinitionidentifierlist = activitydefinition.getIdentifier();
		for(int activitydefinitionidentifieri = 0; activitydefinitionidentifieri<activitydefinitionidentifierlist.size();activitydefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  activitydefinitionidentifier = activitydefinitionidentifierlist.get(activitydefinitionidentifieri);

		/******************** ActvtyDfn_Id_Vl ********************************************************************************/
		if(activitydefinitionidentifieri == 0) {a.addActvtyDfnIdVl("[");}
		if(activitydefinitionidentifier.hasValue()) {

			a.addActvtyDfnIdVl(String.valueOf(activitydefinitionidentifier.getValue()));
		} else {
			a.addActvtyDfnIdVl("NULL");
		}

		if(activitydefinitionidentifieri == activitydefinitionidentifierlist.size()-1) {a.addActvtyDfnIdVl("]");}


		/******************** activitydefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionidentifiertype = activitydefinitionidentifier.getType();

		/******************** ActvtyDfn_Id_Typ_Txt ********************************************************************************/
		if(activitydefinitionidentifieri == 0) {a.addActvtyDfnIdTypTxt("[");}
		if(activitydefinitionidentifiertype.hasText()) {

			a.addActvtyDfnIdTypTxt(String.valueOf(activitydefinitionidentifiertype.getText()));
		} else {
			a.addActvtyDfnIdTypTxt("NULL");
		}

		if(activitydefinitionidentifieri == activitydefinitionidentifierlist.size()-1) {a.addActvtyDfnIdTypTxt("]");}


		/******************** activitydefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitionidentifiertypecodinglist = activitydefinitionidentifiertype.getCoding();
		for(int activitydefinitionidentifiertypecodingi = 0; activitydefinitionidentifiertypecodingi<activitydefinitionidentifiertypecodinglist.size();activitydefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitionidentifiertypecoding = activitydefinitionidentifiertypecodinglist.get(activitydefinitionidentifiertypecodingi);

		/******************** ActvtyDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionidentifiertypecodingi == 0) {a.addActvtyDfnIdTypCdgDsply("[[");}
		if(activitydefinitionidentifiertypecoding.hasDisplay()) {

			a.addActvtyDfnIdTypCdgDsply(String.valueOf(activitydefinitionidentifiertypecoding.getDisplay()));
		} else {
			a.addActvtyDfnIdTypCdgDsply("NULL");
		}

		if(activitydefinitionidentifiertypecodingi == activitydefinitionidentifiertypecodinglist.size()-1) {a.addActvtyDfnIdTypCdgDsply("]]");}


		/******************** ActvtyDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionidentifiertypecodingi == 0) {a.addActvtyDfnIdTypCdgVrsn("[[");}
		if(activitydefinitionidentifiertypecoding.hasVersion()) {

			a.addActvtyDfnIdTypCdgVrsn(String.valueOf(activitydefinitionidentifiertypecoding.getVersion()));
		} else {
			a.addActvtyDfnIdTypCdgVrsn("NULL");
		}

		if(activitydefinitionidentifiertypecodingi == activitydefinitionidentifiertypecodinglist.size()-1) {a.addActvtyDfnIdTypCdgVrsn("]]");}


		/******************** ActvtyDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(activitydefinitionidentifiertypecodingi == 0) {a.addActvtyDfnIdTypCdgCd("[[");}
		if(activitydefinitionidentifiertypecoding.hasCode()) {

			a.addActvtyDfnIdTypCdgCd(String.valueOf(activitydefinitionidentifiertypecoding.getCode()));
		} else {
			a.addActvtyDfnIdTypCdgCd("NULL");
		}

		if(activitydefinitionidentifiertypecodingi == activitydefinitionidentifiertypecodinglist.size()-1) {a.addActvtyDfnIdTypCdgCd("]]");}


		/******************** ActvtyDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionidentifiertypecodingi == 0) {a.addActvtyDfnIdTypCdgUsrSltd("[[");}
		if(activitydefinitionidentifiertypecoding.hasUserSelected()) {

			a.addActvtyDfnIdTypCdgUsrSltd(String.valueOf(activitydefinitionidentifiertypecoding.getUserSelected()));
		} else {
			a.addActvtyDfnIdTypCdgUsrSltd("NULL");
		}

		if(activitydefinitionidentifiertypecodingi == activitydefinitionidentifiertypecodinglist.size()-1) {a.addActvtyDfnIdTypCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(activitydefinitionidentifiertypecodingi == 0) {a.addActvtyDfnIdTypCdgSys("[[");}
		if(activitydefinitionidentifiertypecoding.hasSystem()) {

			a.addActvtyDfnIdTypCdgSys(String.valueOf(activitydefinitionidentifiertypecoding.getSystem()));
		} else {
			a.addActvtyDfnIdTypCdgSys("NULL");
		}

		if(activitydefinitionidentifiertypecodingi == activitydefinitionidentifiertypecodinglist.size()-1) {a.addActvtyDfnIdTypCdgSys("]]");}


		 };
		/******************** activitydefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionidentifierperiod = activitydefinitionidentifier.getPeriod();

		/******************** ActvtyDfn_Id_Prd_Strt ********************************************************************************/
		if(activitydefinitionidentifieri == 0) {a.addActvtyDfnIdPrdStrt("[");}
		if(activitydefinitionidentifierperiod.hasStart()) {

			a.addActvtyDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionidentifierperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnIdPrdStrt("NULL");
		}

		if(activitydefinitionidentifieri == activitydefinitionidentifierlist.size()-1) {a.addActvtyDfnIdPrdStrt("]");}


		/******************** ActvtyDfn_Id_Prd_End ********************************************************************************/
		if(activitydefinitionidentifieri == 0) {a.addActvtyDfnIdPrdEnd("[");}
		if(activitydefinitionidentifierperiod.hasEnd()) {

			a.addActvtyDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionidentifierperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnIdPrdEnd("NULL");
		}

		if(activitydefinitionidentifieri == activitydefinitionidentifierlist.size()-1) {a.addActvtyDfnIdPrdEnd("]");}


		/******************** activitydefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse activitydefinitionidentifieruse = activitydefinitionidentifier.getUse();
		if(activitydefinitionidentifieruse!=null) {
		if(activitydefinitionidentifieri == 0) {

		a.addActvtyDfnIdUse("[");		}
			a.addActvtyDfnIdUse(activitydefinitionidentifieruse.toCode());
		if(activitydefinitionidentifieri == activitydefinitionidentifierlist.size()-1) {

		a.addActvtyDfnIdUse("]");		}

		} else {
			a.addActvtyDfnIdUse("NULL");
		}

		/******************** ActvtyDfn_Id_Assigner ********************************************************************************/
		if(activitydefinitionidentifieri == 0) {a.addActvtyDfnIdAssigner("[");}
		if(activitydefinitionidentifier.hasAssigner()) {

			if(activitydefinitionidentifier.getAssigner().getReference() != null) {
			a.addActvtyDfnIdAssigner(activitydefinitionidentifier.getAssigner().getReference());
			}
		} else {
			a.addActvtyDfnIdAssigner("NULL");
		}

		if(activitydefinitionidentifieri == activitydefinitionidentifierlist.size()-1) {a.addActvtyDfnIdAssigner("]");}


		/******************** ActvtyDfn_Id_Sys ********************************************************************************/
		if(activitydefinitionidentifieri == 0) {a.addActvtyDfnIdSys("[");}
		if(activitydefinitionidentifier.hasSystem()) {

			a.addActvtyDfnIdSys(String.valueOf(activitydefinitionidentifier.getSystem()));
		} else {
			a.addActvtyDfnIdSys("NULL");
		}

		if(activitydefinitionidentifieri == activitydefinitionidentifierlist.size()-1) {a.addActvtyDfnIdSys("]");}


		 };
		/******************** activitydefinitionbodysite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> activitydefinitionbodysitelist = activitydefinition.getBodySite();
		for(int activitydefinitionbodysitei = 0; activitydefinitionbodysitei<activitydefinitionbodysitelist.size();activitydefinitionbodysitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  activitydefinitionbodysite = activitydefinitionbodysitelist.get(activitydefinitionbodysitei);

		/******************** ActvtyDfn_BodySite_Txt ********************************************************************************/
		if(activitydefinitionbodysitei == 0) {a.addActvtyDfnBodySiteTxt("[");}
		if(activitydefinitionbodysite.hasText()) {

			a.addActvtyDfnBodySiteTxt(String.valueOf(activitydefinitionbodysite.getText()));
		} else {
			a.addActvtyDfnBodySiteTxt("NULL");
		}

		if(activitydefinitionbodysitei == activitydefinitionbodysitelist.size()-1) {a.addActvtyDfnBodySiteTxt("]");}


		/******************** activitydefinitionbodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitionbodysitecodinglist = activitydefinitionbodysite.getCoding();
		for(int activitydefinitionbodysitecodingi = 0; activitydefinitionbodysitecodingi<activitydefinitionbodysitecodinglist.size();activitydefinitionbodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitionbodysitecoding = activitydefinitionbodysitecodinglist.get(activitydefinitionbodysitecodingi);

		/******************** ActvtyDfn_BodySite_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionbodysitecodingi == 0) {a.addActvtyDfnBodySiteCdgDsply("[[");}
		if(activitydefinitionbodysitecoding.hasDisplay()) {

			a.addActvtyDfnBodySiteCdgDsply(String.valueOf(activitydefinitionbodysitecoding.getDisplay()));
		} else {
			a.addActvtyDfnBodySiteCdgDsply("NULL");
		}

		if(activitydefinitionbodysitecodingi == activitydefinitionbodysitecodinglist.size()-1) {a.addActvtyDfnBodySiteCdgDsply("]]");}


		/******************** ActvtyDfn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionbodysitecodingi == 0) {a.addActvtyDfnBodySiteCdgVrsn("[[");}
		if(activitydefinitionbodysitecoding.hasVersion()) {

			a.addActvtyDfnBodySiteCdgVrsn(String.valueOf(activitydefinitionbodysitecoding.getVersion()));
		} else {
			a.addActvtyDfnBodySiteCdgVrsn("NULL");
		}

		if(activitydefinitionbodysitecodingi == activitydefinitionbodysitecodinglist.size()-1) {a.addActvtyDfnBodySiteCdgVrsn("]]");}


		/******************** ActvtyDfn_BodySite_Cdg_Cd ********************************************************************************/
		if(activitydefinitionbodysitecodingi == 0) {a.addActvtyDfnBodySiteCdgCd("[[");}
		if(activitydefinitionbodysitecoding.hasCode()) {

			a.addActvtyDfnBodySiteCdgCd(String.valueOf(activitydefinitionbodysitecoding.getCode()));
		} else {
			a.addActvtyDfnBodySiteCdgCd("NULL");
		}

		if(activitydefinitionbodysitecodingi == activitydefinitionbodysitecodinglist.size()-1) {a.addActvtyDfnBodySiteCdgCd("]]");}


		/******************** ActvtyDfn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionbodysitecodingi == 0) {a.addActvtyDfnBodySiteCdgUsrSltd("[[");}
		if(activitydefinitionbodysitecoding.hasUserSelected()) {

			a.addActvtyDfnBodySiteCdgUsrSltd(String.valueOf(activitydefinitionbodysitecoding.getUserSelected()));
		} else {
			a.addActvtyDfnBodySiteCdgUsrSltd("NULL");
		}

		if(activitydefinitionbodysitecodingi == activitydefinitionbodysitecodinglist.size()-1) {a.addActvtyDfnBodySiteCdgUsrSltd("]]");}


		/******************** ActvtyDfn_BodySite_Cdg_Sys ********************************************************************************/
		if(activitydefinitionbodysitecodingi == 0) {a.addActvtyDfnBodySiteCdgSys("[[");}
		if(activitydefinitionbodysitecoding.hasSystem()) {

			a.addActvtyDfnBodySiteCdgSys(String.valueOf(activitydefinitionbodysitecoding.getSystem()));
		} else {
			a.addActvtyDfnBodySiteCdgSys("NULL");
		}

		if(activitydefinitionbodysitecodingi == activitydefinitionbodysitecodinglist.size()-1) {a.addActvtyDfnBodySiteCdgSys("]]");}


		 };
		 };
		/******************** activitydefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> activitydefinitioncontactlist = activitydefinition.getContact();
		for(int activitydefinitioncontacti = 0; activitydefinitioncontacti<activitydefinitioncontactlist.size();activitydefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  activitydefinitioncontact = activitydefinitioncontactlist.get(activitydefinitioncontacti);

		/******************** ActvtyDfn_Cntct_Nm ********************************************************************************/
		if(activitydefinitioncontacti == 0) {a.addActvtyDfnCntctNm("[");}
		if(activitydefinitioncontact.hasName()) {

			a.addActvtyDfnCntctNm(String.valueOf(activitydefinitioncontact.getName()));
		} else {
			a.addActvtyDfnCntctNm("NULL");
		}

		if(activitydefinitioncontacti == activitydefinitioncontactlist.size()-1) {a.addActvtyDfnCntctNm("]");}


		/******************** activitydefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> activitydefinitioncontacttelecomlist = activitydefinitioncontact.getTelecom();
		for(int activitydefinitioncontacttelecomi = 0; activitydefinitioncontacttelecomi<activitydefinitioncontacttelecomlist.size();activitydefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  activitydefinitioncontacttelecom = activitydefinitioncontacttelecomlist.get(activitydefinitioncontacttelecomi);

		/******************** ActvtyDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(activitydefinitioncontacttelecomi == 0) {a.addActvtyDfnCntctTlcmVl("[[");}
		if(activitydefinitioncontacttelecom.hasValue()) {

			a.addActvtyDfnCntctTlcmVl(String.valueOf(activitydefinitioncontacttelecom.getValue()));
		} else {
			a.addActvtyDfnCntctTlcmVl("NULL");
		}

		if(activitydefinitioncontacttelecomi == activitydefinitioncontacttelecomlist.size()-1) {a.addActvtyDfnCntctTlcmVl("]]");}


		/******************** activitydefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioncontacttelecomperiod = activitydefinitioncontacttelecom.getPeriod();

		/******************** ActvtyDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitioncontacttelecomi == 0) {a.addActvtyDfnCntctTlcmPrdStrt("[[");}
		if(activitydefinitioncontacttelecomperiod.hasStart()) {

			a.addActvtyDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnCntctTlcmPrdStrt("NULL");
		}

		if(activitydefinitioncontacttelecomi == activitydefinitioncontacttelecomlist.size()-1) {a.addActvtyDfnCntctTlcmPrdStrt("]]");}


		/******************** ActvtyDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitioncontacttelecomi == 0) {a.addActvtyDfnCntctTlcmPrdEnd("[[");}
		if(activitydefinitioncontacttelecomperiod.hasEnd()) {

			a.addActvtyDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnCntctTlcmPrdEnd("NULL");
		}

		if(activitydefinitioncontacttelecomi == activitydefinitioncontacttelecomlist.size()-1) {a.addActvtyDfnCntctTlcmPrdEnd("]]");}


		/******************** activitydefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitioncontacttelecomuse = activitydefinitioncontacttelecom.getUse();
		if(activitydefinitioncontacttelecomuse!=null) {
		if(activitydefinitioncontacttelecomi == 0) {

		a.addActvtyDfnCntctTlcmUse("[[");		}
			a.addActvtyDfnCntctTlcmUse(activitydefinitioncontacttelecomuse.toCode());
		if(activitydefinitioncontacttelecomi == activitydefinitioncontacttelecomlist.size()-1) {

		a.addActvtyDfnCntctTlcmUse("]]");		}

		} else {
			a.addActvtyDfnCntctTlcmUse("NULL");
		}

		/******************** activitydefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitioncontacttelecomsystem = activitydefinitioncontacttelecom.getSystem();
		if(activitydefinitioncontacttelecomsystem!=null) {
		if(activitydefinitioncontacttelecomi == 0) {

		a.addActvtyDfnCntctTlcmSys("[[");		}
			a.addActvtyDfnCntctTlcmSys(activitydefinitioncontacttelecomsystem.toCode());
		if(activitydefinitioncontacttelecomi == activitydefinitioncontacttelecomlist.size()-1) {

		a.addActvtyDfnCntctTlcmSys("]]");		}

		} else {
			a.addActvtyDfnCntctTlcmSys("NULL");
		}

		/******************** ActvtyDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitioncontacttelecomi == 0) {a.addActvtyDfnCntctTlcmRnk("[[");}
		if(activitydefinitioncontacttelecom.hasRank()) {

			a.addActvtyDfnCntctTlcmRnk(String.valueOf(activitydefinitioncontacttelecom.getRank()));
		} else {
			a.addActvtyDfnCntctTlcmRnk("NULL");
		}

		if(activitydefinitioncontacttelecomi == activitydefinitioncontacttelecomlist.size()-1) {a.addActvtyDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** ActvtyDfn_Transform ********************************************************************************/
		if(activitydefinition.hasTransform()) {

			a.addActvtyDfnTransform(String.valueOf(activitydefinition.getTransform()));
		} else {
			a.addActvtyDfnTransform("NULL");
		}


		/******************** activitydefinitiondosage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage> activitydefinitiondosagelist = activitydefinition.getDosage();
		for(int activitydefinitiondosagei = 0; activitydefinitiondosagei<activitydefinitiondosagelist.size();activitydefinitiondosagei++ ) {
		org.hl7.fhir.r4.model.Dosage  activitydefinitiondosage = activitydefinitiondosagelist.get(activitydefinitiondosagei);

		/******************** activitydefinitiondosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagemethod = activitydefinitiondosage.getMethod();

		/******************** ActvtyDfn_Dsg_Mthd_Txt ********************************************************************************/
		if(activitydefinitiondosagei == 0) {a.addActvtyDfnDsgMthdTxt("[");}
		if(activitydefinitiondosagemethod.hasText()) {

			a.addActvtyDfnDsgMthdTxt(String.valueOf(activitydefinitiondosagemethod.getText()));
		} else {
			a.addActvtyDfnDsgMthdTxt("NULL");
		}

		if(activitydefinitiondosagei == activitydefinitiondosagelist.size()-1) {a.addActvtyDfnDsgMthdTxt("]");}


		/******************** activitydefinitiondosagemethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiondosagemethodcodinglist = activitydefinitiondosagemethod.getCoding();
		for(int activitydefinitiondosagemethodcodingi = 0; activitydefinitiondosagemethodcodingi<activitydefinitiondosagemethodcodinglist.size();activitydefinitiondosagemethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiondosagemethodcoding = activitydefinitiondosagemethodcodinglist.get(activitydefinitiondosagemethodcodingi);

		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagemethodcodingi == 0) {a.addActvtyDfnDsgMthdCdgDsply("[[");}
		if(activitydefinitiondosagemethodcoding.hasDisplay()) {

			a.addActvtyDfnDsgMthdCdgDsply(String.valueOf(activitydefinitiondosagemethodcoding.getDisplay()));
		} else {
			a.addActvtyDfnDsgMthdCdgDsply("NULL");
		}

		if(activitydefinitiondosagemethodcodingi == activitydefinitiondosagemethodcodinglist.size()-1) {a.addActvtyDfnDsgMthdCdgDsply("]]");}


		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagemethodcodingi == 0) {a.addActvtyDfnDsgMthdCdgVrsn("[[");}
		if(activitydefinitiondosagemethodcoding.hasVersion()) {

			a.addActvtyDfnDsgMthdCdgVrsn(String.valueOf(activitydefinitiondosagemethodcoding.getVersion()));
		} else {
			a.addActvtyDfnDsgMthdCdgVrsn("NULL");
		}

		if(activitydefinitiondosagemethodcodingi == activitydefinitiondosagemethodcodinglist.size()-1) {a.addActvtyDfnDsgMthdCdgVrsn("]]");}


		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagemethodcodingi == 0) {a.addActvtyDfnDsgMthdCdgCd("[[");}
		if(activitydefinitiondosagemethodcoding.hasCode()) {

			a.addActvtyDfnDsgMthdCdgCd(String.valueOf(activitydefinitiondosagemethodcoding.getCode()));
		} else {
			a.addActvtyDfnDsgMthdCdgCd("NULL");
		}

		if(activitydefinitiondosagemethodcodingi == activitydefinitiondosagemethodcodinglist.size()-1) {a.addActvtyDfnDsgMthdCdgCd("]]");}


		/******************** ActvtyDfn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagemethodcodingi == 0) {a.addActvtyDfnDsgMthdCdgUsrSltd("[[");}
		if(activitydefinitiondosagemethodcoding.hasUserSelected()) {

			a.addActvtyDfnDsgMthdCdgUsrSltd(String.valueOf(activitydefinitiondosagemethodcoding.getUserSelected()));
		} else {
			a.addActvtyDfnDsgMthdCdgUsrSltd("NULL");
		}

		if(activitydefinitiondosagemethodcodingi == activitydefinitiondosagemethodcodinglist.size()-1) {a.addActvtyDfnDsgMthdCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagemethodcodingi == 0) {a.addActvtyDfnDsgMthdCdgSys("[[");}
		if(activitydefinitiondosagemethodcoding.hasSystem()) {

			a.addActvtyDfnDsgMthdCdgSys(String.valueOf(activitydefinitiondosagemethodcoding.getSystem()));
		} else {
			a.addActvtyDfnDsgMthdCdgSys("NULL");
		}

		if(activitydefinitiondosagemethodcodingi == activitydefinitiondosagemethodcodinglist.size()-1) {a.addActvtyDfnDsgMthdCdgSys("]]");}


		 };
		/******************** activitydefinitiondosagedoseandrate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent> activitydefinitiondosagedoseandratelist = activitydefinitiondosage.getDoseAndRate();
		for(int activitydefinitiondosagedoseandratei = 0; activitydefinitiondosagedoseandratei<activitydefinitiondosagedoseandratelist.size();activitydefinitiondosagedoseandratei++ ) {
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent  activitydefinitiondosagedoseandrate = activitydefinitiondosagedoseandratelist.get(activitydefinitiondosagedoseandratei);

		/******************** activitydefinitiondosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagedoseandratetype = activitydefinitiondosagedoseandrate.getType();

		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtTypTxt("[[");}
		if(activitydefinitiondosagedoseandratetype.hasText()) {

			a.addActvtyDfnDsgDoseAndRtTypTxt(String.valueOf(activitydefinitiondosagedoseandratetype.getText()));
		} else {
			a.addActvtyDfnDsgDoseAndRtTypTxt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtTypTxt("]]");}


		/******************** activitydefinitiondosagedoseandratetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiondosagedoseandratetypecodinglist = activitydefinitiondosagedoseandratetype.getCoding();
		for(int activitydefinitiondosagedoseandratetypecodingi = 0; activitydefinitiondosagedoseandratetypecodingi<activitydefinitiondosagedoseandratetypecodinglist.size();activitydefinitiondosagedoseandratetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiondosagedoseandratetypecoding = activitydefinitiondosagedoseandratetypecodinglist.get(activitydefinitiondosagedoseandratetypecodingi);

		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecodingi == 0) {a.addActvtyDfnDsgDoseAndRtTypCdgDsply("[[[");}
		if(activitydefinitiondosagedoseandratetypecoding.hasDisplay()) {

			a.addActvtyDfnDsgDoseAndRtTypCdgDsply(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getDisplay()));
		} else {
			a.addActvtyDfnDsgDoseAndRtTypCdgDsply("NULL");
		}

		if(activitydefinitiondosagedoseandratetypecodingi == activitydefinitiondosagedoseandratetypecodinglist.size()-1) {a.addActvtyDfnDsgDoseAndRtTypCdgDsply("]]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecodingi == 0) {a.addActvtyDfnDsgDoseAndRtTypCdgVrsn("[[[");}
		if(activitydefinitiondosagedoseandratetypecoding.hasVersion()) {

			a.addActvtyDfnDsgDoseAndRtTypCdgVrsn(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getVersion()));
		} else {
			a.addActvtyDfnDsgDoseAndRtTypCdgVrsn("NULL");
		}

		if(activitydefinitiondosagedoseandratetypecodingi == activitydefinitiondosagedoseandratetypecodinglist.size()-1) {a.addActvtyDfnDsgDoseAndRtTypCdgVrsn("]]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecodingi == 0) {a.addActvtyDfnDsgDoseAndRtTypCdgCd("[[[");}
		if(activitydefinitiondosagedoseandratetypecoding.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtTypCdgCd(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtTypCdgCd("NULL");
		}

		if(activitydefinitiondosagedoseandratetypecodingi == activitydefinitiondosagedoseandratetypecodinglist.size()-1) {a.addActvtyDfnDsgDoseAndRtTypCdgCd("]]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecodingi == 0) {a.addActvtyDfnDsgDoseAndRtTypCdgUsrSltd("[[[");}
		if(activitydefinitiondosagedoseandratetypecoding.hasUserSelected()) {

			a.addActvtyDfnDsgDoseAndRtTypCdgUsrSltd(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getUserSelected()));
		} else {
			a.addActvtyDfnDsgDoseAndRtTypCdgUsrSltd("NULL");
		}

		if(activitydefinitiondosagedoseandratetypecodingi == activitydefinitiondosagedoseandratetypecodinglist.size()-1) {a.addActvtyDfnDsgDoseAndRtTypCdgUsrSltd("]]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratetypecodingi == 0) {a.addActvtyDfnDsgDoseAndRtTypCdgSys("[[[");}
		if(activitydefinitiondosagedoseandratetypecoding.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtTypCdgSys(String.valueOf(activitydefinitiondosagedoseandratetypecoding.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtTypCdgSys("NULL");
		}

		if(activitydefinitiondosagedoseandratetypecodingi == activitydefinitiondosagedoseandratetypecodinglist.size()-1) {a.addActvtyDfnDsgDoseAndRtTypCdgSys("]]]");}


		 };
		/******************** activitydefinitiondosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagedoseandratedoserange = activitydefinitiondosagedoseandrate.getDoseRange();

		/******************** activitydefinitiondosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedoserangelow = activitydefinitiondosagedoseandratedoserange.getLow();

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngLwVl("[[");}
		if(activitydefinitiondosagedoseandratedoserangelow.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngLwVl(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngLwVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngLwVl("]]");}


		/******************** activitydefinitiondosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandratedoserangelowcomparator = activitydefinitiondosagedoseandratedoserangelow.getComparator();
		if(activitydefinitiondosagedoseandratedoserangelowcomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtDoseRngLwCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtDoseRngLwCmprtr(activitydefinitiondosagedoseandratedoserangelowcomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtDoseRngLwCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngLwCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngLwCd("[[");}
		if(activitydefinitiondosagedoseandratedoserangelow.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngLwCd(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngLwCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngLwCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngLwUnt("[[");}
		if(activitydefinitiondosagedoseandratedoserangelow.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngLwUnt(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngLwUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngLwUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngLwSys("[[");}
		if(activitydefinitiondosagedoseandratedoserangelow.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngLwSys(String.valueOf(activitydefinitiondosagedoseandratedoserangelow.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngLwSys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngLwSys("]]");}


		/******************** activitydefinitiondosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedoserangehigh = activitydefinitiondosagedoseandratedoserange.getHigh();

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngHiVl("[[");}
		if(activitydefinitiondosagedoseandratedoserangehigh.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngHiVl(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngHiVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngHiVl("]]");}


		/******************** activitydefinitiondosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandratedoserangehighcomparator = activitydefinitiondosagedoseandratedoserangehigh.getComparator();
		if(activitydefinitiondosagedoseandratedoserangehighcomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtDoseRngHiCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtDoseRngHiCmprtr(activitydefinitiondosagedoseandratedoserangehighcomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtDoseRngHiCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngHiCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngHiCd("[[");}
		if(activitydefinitiondosagedoseandratedoserangehigh.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngHiCd(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngHiCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngHiCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngHiUnt("[[");}
		if(activitydefinitiondosagedoseandratedoserangehigh.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngHiUnt(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngHiUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngHiUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseRngHiSys("[[");}
		if(activitydefinitiondosagedoseandratedoserangehigh.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtDoseRngHiSys(String.valueOf(activitydefinitiondosagedoseandratedoserangehigh.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseRngHiSys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseRngHiSys("]]");}


		/******************** activitydefinitiondosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateratequantity = activitydefinitiondosagedoseandrate.getRateQuantity();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtQntyVl("[[");}
		if(activitydefinitiondosagedoseandrateratequantity.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtRtQntyVl(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtQntyVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtQntyVl("]]");}


		/******************** activitydefinitiondosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateratequantitycomparator = activitydefinitiondosagedoseandrateratequantity.getComparator();
		if(activitydefinitiondosagedoseandrateratequantitycomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtRtQntyCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtRtQntyCmprtr(activitydefinitiondosagedoseandrateratequantitycomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtRtQntyCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtRtQntyCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtQntyCd("[[");}
		if(activitydefinitiondosagedoseandrateratequantity.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtRtQntyCd(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtQntyCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtQntyCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtQntyUnt("[[");}
		if(activitydefinitiondosagedoseandrateratequantity.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtRtQntyUnt(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtQntyUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtQntyUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtQntySys("[[");}
		if(activitydefinitiondosagedoseandrateratequantity.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtRtQntySys(String.valueOf(activitydefinitiondosagedoseandrateratequantity.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtQntySys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtQntySys("]]");}


		/******************** activitydefinitiondosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio activitydefinitiondosagedoseandraterateratio = activitydefinitiondosagedoseandrate.getRateRatio();

		/******************** activitydefinitiondosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterationumerator = activitydefinitiondosagedoseandraterateratio.getNumerator();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrVl("[[");}
		if(activitydefinitiondosagedoseandrateraterationumerator.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrVl(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrVl("]]");}


		/******************** activitydefinitiondosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateraterationumeratorcomparator = activitydefinitiondosagedoseandrateraterationumerator.getComparator();
		if(activitydefinitiondosagedoseandrateraterationumeratorcomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr(activitydefinitiondosagedoseandrateraterationumeratorcomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCd("[[");}
		if(activitydefinitiondosagedoseandrateraterationumerator.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCd(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt("[[");}
		if(activitydefinitiondosagedoseandrateraterationumerator.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrSys("[[");}
		if(activitydefinitiondosagedoseandrateraterationumerator.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrSys(String.valueOf(activitydefinitiondosagedoseandrateraterationumerator.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrSys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioNmrtrSys("]]");}


		/******************** activitydefinitiondosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandraterateratiodenominator = activitydefinitiondosagedoseandraterateratio.getDenominator();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrVl("[[");}
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrVl(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrVl("]]");}


		/******************** activitydefinitiondosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandraterateratiodenominatorcomparator = activitydefinitiondosagedoseandraterateratiodenominator.getComparator();
		if(activitydefinitiondosagedoseandraterateratiodenominatorcomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr(activitydefinitiondosagedoseandraterateratiodenominatorcomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCd("[[");}
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCd(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt("[[");}
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrSys("[[");}
		if(activitydefinitiondosagedoseandraterateratiodenominator.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrSys(String.valueOf(activitydefinitiondosagedoseandraterateratiodenominator.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrSys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRtioDnmntrSys("]]");}


		/******************** activitydefinitiondosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagedoseandrateraterange = activitydefinitiondosagedoseandrate.getRateRange();

		/******************** activitydefinitiondosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterangelow = activitydefinitiondosagedoseandrateraterange.getLow();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngLwVl("[[");}
		if(activitydefinitiondosagedoseandrateraterangelow.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtRtRngLwVl(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngLwVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngLwVl("]]");}


		/******************** activitydefinitiondosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateraterangelowcomparator = activitydefinitiondosagedoseandrateraterangelow.getComparator();
		if(activitydefinitiondosagedoseandrateraterangelowcomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtRtRngLwCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtRtRngLwCmprtr(activitydefinitiondosagedoseandrateraterangelowcomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtRtRngLwCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngLwCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngLwCd("[[");}
		if(activitydefinitiondosagedoseandrateraterangelow.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtRtRngLwCd(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngLwCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngLwCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngLwUnt("[[");}
		if(activitydefinitiondosagedoseandrateraterangelow.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtRtRngLwUnt(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngLwUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngLwUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngLwSys("[[");}
		if(activitydefinitiondosagedoseandrateraterangelow.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtRtRngLwSys(String.valueOf(activitydefinitiondosagedoseandrateraterangelow.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngLwSys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngLwSys("]]");}


		/******************** activitydefinitiondosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterangehigh = activitydefinitiondosagedoseandrateraterange.getHigh();

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngHiVl("[[");}
		if(activitydefinitiondosagedoseandrateraterangehigh.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtRtRngHiVl(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngHiVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngHiVl("]]");}


		/******************** activitydefinitiondosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandrateraterangehighcomparator = activitydefinitiondosagedoseandrateraterangehigh.getComparator();
		if(activitydefinitiondosagedoseandrateraterangehighcomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtRtRngHiCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtRtRngHiCmprtr(activitydefinitiondosagedoseandrateraterangehighcomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtRtRngHiCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngHiCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngHiCd("[[");}
		if(activitydefinitiondosagedoseandrateraterangehigh.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtRtRngHiCd(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngHiCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngHiCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngHiUnt("[[");}
		if(activitydefinitiondosagedoseandrateraterangehigh.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtRtRngHiUnt(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngHiUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngHiUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtRtRngHiSys("[[");}
		if(activitydefinitiondosagedoseandrateraterangehigh.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtRtRngHiSys(String.valueOf(activitydefinitiondosagedoseandrateraterangehigh.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtRtRngHiSys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtRtRngHiSys("]]");}


		/******************** activitydefinitiondosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedosequantity = activitydefinitiondosagedoseandrate.getDoseQuantity();

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseQntyVl("[[");}
		if(activitydefinitiondosagedoseandratedosequantity.hasValue()) {

			a.addActvtyDfnDsgDoseAndRtDoseQntyVl(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getValue()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseQntyVl("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseQntyVl("]]");}


		/******************** activitydefinitiondosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagedoseandratedosequantitycomparator = activitydefinitiondosagedoseandratedosequantity.getComparator();
		if(activitydefinitiondosagedoseandratedosequantitycomparator!=null) {
		if(activitydefinitiondosagedoseandratei == 0) {

		a.addActvtyDfnDsgDoseAndRtDoseQntyCmprtr("[[");		}
			a.addActvtyDfnDsgDoseAndRtDoseQntyCmprtr(activitydefinitiondosagedoseandratedosequantitycomparator.toCode());
		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {

		a.addActvtyDfnDsgDoseAndRtDoseQntyCmprtr("]]");		}

		} else {
			a.addActvtyDfnDsgDoseAndRtDoseQntyCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseQntyCd("[[");}
		if(activitydefinitiondosagedoseandratedosequantity.hasCode()) {

			a.addActvtyDfnDsgDoseAndRtDoseQntyCd(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getCode()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseQntyCd("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseQntyCd("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseQntyUnt("[[");}
		if(activitydefinitiondosagedoseandratedosequantity.hasUnit()) {

			a.addActvtyDfnDsgDoseAndRtDoseQntyUnt(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getUnit()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseQntyUnt("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseQntyUnt("]]");}


		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(activitydefinitiondosagedoseandratei == 0) {a.addActvtyDfnDsgDoseAndRtDoseQntySys("[[");}
		if(activitydefinitiondosagedoseandratedosequantity.hasSystem()) {

			a.addActvtyDfnDsgDoseAndRtDoseQntySys(String.valueOf(activitydefinitiondosagedoseandratedosequantity.getSystem()));
		} else {
			a.addActvtyDfnDsgDoseAndRtDoseQntySys("NULL");
		}

		if(activitydefinitiondosagedoseandratei == activitydefinitiondosagedoseandratelist.size()-1) {a.addActvtyDfnDsgDoseAndRtDoseQntySys("]]");}


		 };
		/******************** ActvtyDfn_Dsg_Sqnc ********************************************************************************/
		if(activitydefinitiondosage.hasSequence()) {

			a.addActvtyDfnDsgSqnc(String.valueOf(activitydefinitiondosage.getSequence()));
		} else {
			a.addActvtyDfnDsgSqnc("NULL");
		}


		/******************** activitydefinitiondosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagesite = activitydefinitiondosage.getSite();

		/******************** ActvtyDfn_Dsg_Site_Txt ********************************************************************************/
		if(activitydefinitiondosagesite.hasText()) {

			a.addActvtyDfnDsgSiteTxt(String.valueOf(activitydefinitiondosagesite.getText()));
		} else {
			a.addActvtyDfnDsgSiteTxt("NULL");
		}


		/******************** activitydefinitiondosagesitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiondosagesitecodinglist = activitydefinitiondosagesite.getCoding();
		for(int activitydefinitiondosagesitecodingi = 0; activitydefinitiondosagesitecodingi<activitydefinitiondosagesitecodinglist.size();activitydefinitiondosagesitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiondosagesitecoding = activitydefinitiondosagesitecodinglist.get(activitydefinitiondosagesitecodingi);

		/******************** ActvtyDfn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagesitecodingi == 0) {a.addActvtyDfnDsgSiteCdgDsply("[[");}
		if(activitydefinitiondosagesitecoding.hasDisplay()) {

			a.addActvtyDfnDsgSiteCdgDsply(String.valueOf(activitydefinitiondosagesitecoding.getDisplay()));
		} else {
			a.addActvtyDfnDsgSiteCdgDsply("NULL");
		}

		if(activitydefinitiondosagesitecodingi == activitydefinitiondosagesitecodinglist.size()-1) {a.addActvtyDfnDsgSiteCdgDsply("]]");}


		/******************** ActvtyDfn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagesitecodingi == 0) {a.addActvtyDfnDsgSiteCdgVrsn("[[");}
		if(activitydefinitiondosagesitecoding.hasVersion()) {

			a.addActvtyDfnDsgSiteCdgVrsn(String.valueOf(activitydefinitiondosagesitecoding.getVersion()));
		} else {
			a.addActvtyDfnDsgSiteCdgVrsn("NULL");
		}

		if(activitydefinitiondosagesitecodingi == activitydefinitiondosagesitecodinglist.size()-1) {a.addActvtyDfnDsgSiteCdgVrsn("]]");}


		/******************** ActvtyDfn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagesitecodingi == 0) {a.addActvtyDfnDsgSiteCdgCd("[[");}
		if(activitydefinitiondosagesitecoding.hasCode()) {

			a.addActvtyDfnDsgSiteCdgCd(String.valueOf(activitydefinitiondosagesitecoding.getCode()));
		} else {
			a.addActvtyDfnDsgSiteCdgCd("NULL");
		}

		if(activitydefinitiondosagesitecodingi == activitydefinitiondosagesitecodinglist.size()-1) {a.addActvtyDfnDsgSiteCdgCd("]]");}


		/******************** ActvtyDfn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagesitecodingi == 0) {a.addActvtyDfnDsgSiteCdgUsrSltd("[[");}
		if(activitydefinitiondosagesitecoding.hasUserSelected()) {

			a.addActvtyDfnDsgSiteCdgUsrSltd(String.valueOf(activitydefinitiondosagesitecoding.getUserSelected()));
		} else {
			a.addActvtyDfnDsgSiteCdgUsrSltd("NULL");
		}

		if(activitydefinitiondosagesitecodingi == activitydefinitiondosagesitecodinglist.size()-1) {a.addActvtyDfnDsgSiteCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagesitecodingi == 0) {a.addActvtyDfnDsgSiteCdgSys("[[");}
		if(activitydefinitiondosagesitecoding.hasSystem()) {

			a.addActvtyDfnDsgSiteCdgSys(String.valueOf(activitydefinitiondosagesitecoding.getSystem()));
		} else {
			a.addActvtyDfnDsgSiteCdgSys("NULL");
		}

		if(activitydefinitiondosagesitecodingi == activitydefinitiondosagesitecodinglist.size()-1) {a.addActvtyDfnDsgSiteCdgSys("]]");}


		 };
		/******************** ActvtyDfn_Dsg_PntInstrctn ********************************************************************************/
		if(activitydefinitiondosage.hasPatientInstruction()) {

			a.addActvtyDfnDsgPntInstrctn(String.valueOf(activitydefinitiondosage.getPatientInstruction()));
		} else {
			a.addActvtyDfnDsgPntInstrctn("NULL");
		}


		/******************** ActvtyDfn_Dsg_Txt ********************************************************************************/
		if(activitydefinitiondosage.hasText()) {

			a.addActvtyDfnDsgTxt(String.valueOf(activitydefinitiondosage.getText()));
		} else {
			a.addActvtyDfnDsgTxt("NULL");
		}


		/******************** activitydefinitiondosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing activitydefinitiondosagetiming = activitydefinitiondosage.getTiming();

		/******************** activitydefinitiondosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagetimingcode = activitydefinitiondosagetiming.getCode();

		/******************** ActvtyDfn_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(activitydefinitiondosagetimingcode.hasText()) {

			a.addActvtyDfnDsgTmgCdTxt(String.valueOf(activitydefinitiondosagetimingcode.getText()));
		} else {
			a.addActvtyDfnDsgTmgCdTxt("NULL");
		}


		/******************** activitydefinitiondosagetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiondosagetimingcodecodinglist = activitydefinitiondosagetimingcode.getCoding();
		for(int activitydefinitiondosagetimingcodecodingi = 0; activitydefinitiondosagetimingcodecodingi<activitydefinitiondosagetimingcodecodinglist.size();activitydefinitiondosagetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiondosagetimingcodecoding = activitydefinitiondosagetimingcodecodinglist.get(activitydefinitiondosagetimingcodecodingi);

		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosagetimingcodecodingi == 0) {a.addActvtyDfnDsgTmgCdCdgDsply("[[");}
		if(activitydefinitiondosagetimingcodecoding.hasDisplay()) {

			a.addActvtyDfnDsgTmgCdCdgDsply(String.valueOf(activitydefinitiondosagetimingcodecoding.getDisplay()));
		} else {
			a.addActvtyDfnDsgTmgCdCdgDsply("NULL");
		}

		if(activitydefinitiondosagetimingcodecodingi == activitydefinitiondosagetimingcodecodinglist.size()-1) {a.addActvtyDfnDsgTmgCdCdgDsply("]]");}


		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosagetimingcodecodingi == 0) {a.addActvtyDfnDsgTmgCdCdgVrsn("[[");}
		if(activitydefinitiondosagetimingcodecoding.hasVersion()) {

			a.addActvtyDfnDsgTmgCdCdgVrsn(String.valueOf(activitydefinitiondosagetimingcodecoding.getVersion()));
		} else {
			a.addActvtyDfnDsgTmgCdCdgVrsn("NULL");
		}

		if(activitydefinitiondosagetimingcodecodingi == activitydefinitiondosagetimingcodecodinglist.size()-1) {a.addActvtyDfnDsgTmgCdCdgVrsn("]]");}


		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosagetimingcodecodingi == 0) {a.addActvtyDfnDsgTmgCdCdgCd("[[");}
		if(activitydefinitiondosagetimingcodecoding.hasCode()) {

			a.addActvtyDfnDsgTmgCdCdgCd(String.valueOf(activitydefinitiondosagetimingcodecoding.getCode()));
		} else {
			a.addActvtyDfnDsgTmgCdCdgCd("NULL");
		}

		if(activitydefinitiondosagetimingcodecodingi == activitydefinitiondosagetimingcodecodinglist.size()-1) {a.addActvtyDfnDsgTmgCdCdgCd("]]");}


		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosagetimingcodecodingi == 0) {a.addActvtyDfnDsgTmgCdCdgUsrSltd("[[");}
		if(activitydefinitiondosagetimingcodecoding.hasUserSelected()) {

			a.addActvtyDfnDsgTmgCdCdgUsrSltd(String.valueOf(activitydefinitiondosagetimingcodecoding.getUserSelected()));
		} else {
			a.addActvtyDfnDsgTmgCdCdgUsrSltd("NULL");
		}

		if(activitydefinitiondosagetimingcodecodingi == activitydefinitiondosagetimingcodecodinglist.size()-1) {a.addActvtyDfnDsgTmgCdCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosagetimingcodecodingi == 0) {a.addActvtyDfnDsgTmgCdCdgSys("[[");}
		if(activitydefinitiondosagetimingcodecoding.hasSystem()) {

			a.addActvtyDfnDsgTmgCdCdgSys(String.valueOf(activitydefinitiondosagetimingcodecoding.getSystem()));
		} else {
			a.addActvtyDfnDsgTmgCdCdgSys("NULL");
		}

		if(activitydefinitiondosagetimingcodecodingi == activitydefinitiondosagetimingcodecodinglist.size()-1) {a.addActvtyDfnDsgTmgCdCdgSys("]]");}


		 };
		/******************** ActvtyDfn_Dsg_Tmg_Evnt ********************************************************************************/
		if(activitydefinitiondosagetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinitiondosagetiming.getEvent().size(); incr++) {
				array = array + activitydefinitiondosagetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnDsgTmgEvnt(array);

		} else {
			a.addActvtyDfnDsgTmgEvnt("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent activitydefinitiondosagetimingrepeat = activitydefinitiondosagetiming.getRepeat();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasOffset()) {

			a.addActvtyDfnDsgTmgRptOff(String.valueOf(activitydefinitiondosagetimingrepeat.getOffset()));
		} else {
			a.addActvtyDfnDsgTmgRptOff("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasCount()) {

			a.addActvtyDfnDsgTmgRptCnt(String.valueOf(activitydefinitiondosagetimingrepeat.getCount()));
		} else {
			a.addActvtyDfnDsgTmgRptCnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasPeriod()) {

			a.addActvtyDfnDsgTmgRptPrd(String.valueOf(activitydefinitiondosagetimingrepeat.getPeriod()));
		} else {
			a.addActvtyDfnDsgTmgRptPrd("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasCountMax()) {

			a.addActvtyDfnDsgTmgRptCntMx(String.valueOf(activitydefinitiondosagetimingrepeat.getCountMax()));
		} else {
			a.addActvtyDfnDsgTmgRptCntMx("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasDurationMax()) {

			a.addActvtyDfnDsgTmgRptDurationMx(String.valueOf(activitydefinitiondosagetimingrepeat.getDurationMax()));
		} else {
			a.addActvtyDfnDsgTmgRptDurationMx("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiondosagetimingrepeatboundsperiod = activitydefinitiondosagetimingrepeat.getBoundsPeriod();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsperiod.hasStart()) {

			a.addActvtyDfnDsgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitiondosagetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnDsgTmgRptBndsPrdStrt("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsperiod.hasEnd()) {

			a.addActvtyDfnDsgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitiondosagetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnDsgTmgRptBndsPrdEnd("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiondosagetimingrepeatdurationunit = activitydefinitiondosagetimingrepeat.getDurationUnit();
		if(activitydefinitiondosagetimingrepeatdurationunit!=null) {
			a.addActvtyDfnDsgTmgRptDurationUnt(activitydefinitiondosagetimingrepeatdurationunit.toCode());
		} else {
			a.addActvtyDfnDsgTmgRptDurationUnt("NULL");
		}

		/******************** activitydefinitiondosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiondosagetimingrepeatboundsduration = activitydefinitiondosagetimingrepeat.getBoundsDuration();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsduration.hasValue()) {

			a.addActvtyDfnDsgTmgRptBndsDurationVl(String.valueOf(activitydefinitiondosagetimingrepeatboundsduration.getValue()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsDurationVl("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagetimingrepeatboundsdurationcomparator = activitydefinitiondosagetimingrepeatboundsduration.getComparator();
		if(activitydefinitiondosagetimingrepeatboundsdurationcomparator!=null) {
			a.addActvtyDfnDsgTmgRptBndsDurationCmprtr(activitydefinitiondosagetimingrepeatboundsdurationcomparator.toCode());
		} else {
			a.addActvtyDfnDsgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsduration.hasCode()) {

			a.addActvtyDfnDsgTmgRptBndsDurationCd(String.valueOf(activitydefinitiondosagetimingrepeatboundsduration.getCode()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsDurationCd("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsduration.hasUnit()) {

			a.addActvtyDfnDsgTmgRptBndsDurationUnt(String.valueOf(activitydefinitiondosagetimingrepeatboundsduration.getUnit()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsDurationUnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsduration.hasSystem()) {

			a.addActvtyDfnDsgTmgRptBndsDurationSys(String.valueOf(activitydefinitiondosagetimingrepeatboundsduration.getSystem()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsDurationSys("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagetimingrepeatboundsrange = activitydefinitiondosagetimingrepeat.getBoundsRange();

		/******************** activitydefinitiondosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagetimingrepeatboundsrangelow = activitydefinitiondosagetimingrepeatboundsrange.getLow();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasValue()) {

			a.addActvtyDfnDsgTmgRptBndsRngLwVl(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getValue()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngLwVl("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagetimingrepeatboundsrangelowcomparator = activitydefinitiondosagetimingrepeatboundsrangelow.getComparator();
		if(activitydefinitiondosagetimingrepeatboundsrangelowcomparator!=null) {
			a.addActvtyDfnDsgTmgRptBndsRngLwCmprtr(activitydefinitiondosagetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasCode()) {

			a.addActvtyDfnDsgTmgRptBndsRngLwCd(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getCode()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngLwCd("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasUnit()) {

			a.addActvtyDfnDsgTmgRptBndsRngLwUnt(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getUnit()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangelow.hasSystem()) {

			a.addActvtyDfnDsgTmgRptBndsRngLwSys(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangelow.getSystem()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngLwSys("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagetimingrepeatboundsrangehigh = activitydefinitiondosagetimingrepeatboundsrange.getHigh();

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasValue()) {

			a.addActvtyDfnDsgTmgRptBndsRngHiVl(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getValue()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngHiVl("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagetimingrepeatboundsrangehighcomparator = activitydefinitiondosagetimingrepeatboundsrangehigh.getComparator();
		if(activitydefinitiondosagetimingrepeatboundsrangehighcomparator!=null) {
			a.addActvtyDfnDsgTmgRptBndsRngHiCmprtr(activitydefinitiondosagetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasCode()) {

			a.addActvtyDfnDsgTmgRptBndsRngHiCd(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getCode()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngHiCd("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasUnit()) {

			a.addActvtyDfnDsgTmgRptBndsRngHiUnt(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getUnit()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiondosagetimingrepeatboundsrangehigh.hasSystem()) {

			a.addActvtyDfnDsgTmgRptBndsRngHiSys(String.valueOf(activitydefinitiondosagetimingrepeatboundsrangehigh.getSystem()));
		} else {
			a.addActvtyDfnDsgTmgRptBndsRngHiSys("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasFrequencyMax()) {

			a.addActvtyDfnDsgTmgRptFrqncyMx(String.valueOf(activitydefinitiondosagetimingrepeat.getFrequencyMax()));
		} else {
			a.addActvtyDfnDsgTmgRptFrqncyMx("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> activitydefinitiondosagetimingrepeatwhenlist = activitydefinitiondosagetimingrepeat.getWhen();
		for(int activitydefinitiondosagetimingrepeatwheni = 0; activitydefinitiondosagetimingrepeatwheni<activitydefinitiondosagetimingrepeatwhenlist.size();activitydefinitiondosagetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  activitydefinitiondosagetimingrepeatwhen = activitydefinitiondosagetimingrepeatwhenlist.get(activitydefinitiondosagetimingrepeatwheni);
		if(activitydefinitiondosagetimingrepeatwhen!=null) {
			a.addActvtyDfnDsgTmgRptWhen(activitydefinitiondosagetimingrepeatwhen.getCode());
		} else {
			a.addActvtyDfnDsgTmgRptWhen("NULL");
		}
		 };

		/******************** activitydefinitiondosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiondosagetimingrepeatperiodunit = activitydefinitiondosagetimingrepeat.getPeriodUnit();
		if(activitydefinitiondosagetimingrepeatperiodunit!=null) {
			a.addActvtyDfnDsgTmgRptPrdUnt(activitydefinitiondosagetimingrepeatperiodunit.toCode());
		} else {
			a.addActvtyDfnDsgTmgRptPrdUnt("NULL");
		}

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasPeriodMax()) {

			a.addActvtyDfnDsgTmgRptPrdMx(String.valueOf(activitydefinitiondosagetimingrepeat.getPeriodMax()));
		} else {
			a.addActvtyDfnDsgTmgRptPrdMx("NULL");
		}


		/******************** activitydefinitiondosagetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> activitydefinitiondosagetimingrepeatdayofweeklist = activitydefinitiondosagetimingrepeat.getDayOfWeek();
		for(int activitydefinitiondosagetimingrepeatdayofweeki = 0; activitydefinitiondosagetimingrepeatdayofweeki<activitydefinitiondosagetimingrepeatdayofweeklist.size();activitydefinitiondosagetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  activitydefinitiondosagetimingrepeatdayofweek = activitydefinitiondosagetimingrepeatdayofweeklist.get(activitydefinitiondosagetimingrepeatdayofweeki);
		if(activitydefinitiondosagetimingrepeatdayofweek!=null) {
			a.addActvtyDfnDsgTmgRptDayOfWeek(activitydefinitiondosagetimingrepeatdayofweek.getCode());
		} else {
			a.addActvtyDfnDsgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinitiondosagetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + activitydefinitiondosagetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnDsgTmgRptTimeOfDay(array);

		} else {
			a.addActvtyDfnDsgTmgRptTimeOfDay("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasDuration()) {

			a.addActvtyDfnDsgTmgRptDuration(String.valueOf(activitydefinitiondosagetimingrepeat.getDuration()));
		} else {
			a.addActvtyDfnDsgTmgRptDuration("NULL");
		}


		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(activitydefinitiondosagetimingrepeat.hasFrequency()) {

			a.addActvtyDfnDsgTmgRptFrqncy(String.valueOf(activitydefinitiondosagetimingrepeat.getFrequency()));
		} else {
			a.addActvtyDfnDsgTmgRptFrqncy("NULL");
		}


		/******************** activitydefinitiondosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperadministration = activitydefinitiondosage.getMaxDosePerAdministration();

		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasValue()) {

			a.addActvtyDfnDsgMxDosePerAdmnstnVl(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getValue()));
		} else {
			a.addActvtyDfnDsgMxDosePerAdmnstnVl("NULL");
		}


		/******************** activitydefinitiondosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperadministrationcomparator = activitydefinitiondosagemaxdoseperadministration.getComparator();
		if(activitydefinitiondosagemaxdoseperadministrationcomparator!=null) {
			a.addActvtyDfnDsgMxDosePerAdmnstnCmprtr(activitydefinitiondosagemaxdoseperadministrationcomparator.toCode());
		} else {
			a.addActvtyDfnDsgMxDosePerAdmnstnCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasCode()) {

			a.addActvtyDfnDsgMxDosePerAdmnstnCd(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getCode()));
		} else {
			a.addActvtyDfnDsgMxDosePerAdmnstnCd("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasUnit()) {

			a.addActvtyDfnDsgMxDosePerAdmnstnUnt(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getUnit()));
		} else {
			a.addActvtyDfnDsgMxDosePerAdmnstnUnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperadministration.hasSystem()) {

			a.addActvtyDfnDsgMxDosePerAdmnstnSys(String.valueOf(activitydefinitiondosagemaxdoseperadministration.getSystem()));
		} else {
			a.addActvtyDfnDsgMxDosePerAdmnstnSys("NULL");
		}


		/******************** activitydefinitiondosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio activitydefinitiondosagemaxdoseperperiod = activitydefinitiondosage.getMaxDosePerPeriod();

		/******************** activitydefinitiondosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperperiodnumerator = activitydefinitiondosagemaxdoseperperiod.getNumerator();

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasValue()) {

			a.addActvtyDfnDsgMxDosePerPrdNmrtrVl(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getValue()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdNmrtrVl("NULL");
		}


		/******************** activitydefinitiondosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperperiodnumeratorcomparator = activitydefinitiondosagemaxdoseperperiodnumerator.getComparator();
		if(activitydefinitiondosagemaxdoseperperiodnumeratorcomparator!=null) {
			a.addActvtyDfnDsgMxDosePerPrdNmrtrCmprtr(activitydefinitiondosagemaxdoseperperiodnumeratorcomparator.toCode());
		} else {
			a.addActvtyDfnDsgMxDosePerPrdNmrtrCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasCode()) {

			a.addActvtyDfnDsgMxDosePerPrdNmrtrCd(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getCode()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdNmrtrCd("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasUnit()) {

			a.addActvtyDfnDsgMxDosePerPrdNmrtrUnt(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getUnit()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdNmrtrUnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperiodnumerator.hasSystem()) {

			a.addActvtyDfnDsgMxDosePerPrdNmrtrSys(String.valueOf(activitydefinitiondosagemaxdoseperperiodnumerator.getSystem()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdNmrtrSys("NULL");
		}


		/******************** activitydefinitiondosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperperioddenominator = activitydefinitiondosagemaxdoseperperiod.getDenominator();

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasValue()) {

			a.addActvtyDfnDsgMxDosePerPrdDnmntrVl(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getValue()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdDnmntrVl("NULL");
		}


		/******************** activitydefinitiondosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperperioddenominatorcomparator = activitydefinitiondosagemaxdoseperperioddenominator.getComparator();
		if(activitydefinitiondosagemaxdoseperperioddenominatorcomparator!=null) {
			a.addActvtyDfnDsgMxDosePerPrdDnmntrCmprtr(activitydefinitiondosagemaxdoseperperioddenominatorcomparator.toCode());
		} else {
			a.addActvtyDfnDsgMxDosePerPrdDnmntrCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasCode()) {

			a.addActvtyDfnDsgMxDosePerPrdDnmntrCd(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getCode()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdDnmntrCd("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasUnit()) {

			a.addActvtyDfnDsgMxDosePerPrdDnmntrUnt(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getUnit()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdDnmntrUnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperperioddenominator.hasSystem()) {

			a.addActvtyDfnDsgMxDosePerPrdDnmntrSys(String.valueOf(activitydefinitiondosagemaxdoseperperioddenominator.getSystem()));
		} else {
			a.addActvtyDfnDsgMxDosePerPrdDnmntrSys("NULL");
		}


		/******************** activitydefinitiondosageadditionalinstruction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> activitydefinitiondosageadditionalinstructionlist = activitydefinitiondosage.getAdditionalInstruction();
		for(int activitydefinitiondosageadditionalinstructioni = 0; activitydefinitiondosageadditionalinstructioni<activitydefinitiondosageadditionalinstructionlist.size();activitydefinitiondosageadditionalinstructioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  activitydefinitiondosageadditionalinstruction = activitydefinitiondosageadditionalinstructionlist.get(activitydefinitiondosageadditionalinstructioni);

		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioni == 0) {a.addActvtyDfnDsgAddtnlInstrctnTxt("[[");}
		if(activitydefinitiondosageadditionalinstruction.hasText()) {

			a.addActvtyDfnDsgAddtnlInstrctnTxt(String.valueOf(activitydefinitiondosageadditionalinstruction.getText()));
		} else {
			a.addActvtyDfnDsgAddtnlInstrctnTxt("NULL");
		}

		if(activitydefinitiondosageadditionalinstructioni == activitydefinitiondosageadditionalinstructionlist.size()-1) {a.addActvtyDfnDsgAddtnlInstrctnTxt("]]");}


		/******************** activitydefinitiondosageadditionalinstructioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiondosageadditionalinstructioncodinglist = activitydefinitiondosageadditionalinstruction.getCoding();
		for(int activitydefinitiondosageadditionalinstructioncodingi = 0; activitydefinitiondosageadditionalinstructioncodingi<activitydefinitiondosageadditionalinstructioncodinglist.size();activitydefinitiondosageadditionalinstructioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiondosageadditionalinstructioncoding = activitydefinitiondosageadditionalinstructioncodinglist.get(activitydefinitiondosageadditionalinstructioncodingi);

		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncodingi == 0) {a.addActvtyDfnDsgAddtnlInstrctnCdgDsply("[[[");}
		if(activitydefinitiondosageadditionalinstructioncoding.hasDisplay()) {

			a.addActvtyDfnDsgAddtnlInstrctnCdgDsply(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getDisplay()));
		} else {
			a.addActvtyDfnDsgAddtnlInstrctnCdgDsply("NULL");
		}

		if(activitydefinitiondosageadditionalinstructioncodingi == activitydefinitiondosageadditionalinstructioncodinglist.size()-1) {a.addActvtyDfnDsgAddtnlInstrctnCdgDsply("]]]");}


		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncodingi == 0) {a.addActvtyDfnDsgAddtnlInstrctnCdgVrsn("[[[");}
		if(activitydefinitiondosageadditionalinstructioncoding.hasVersion()) {

			a.addActvtyDfnDsgAddtnlInstrctnCdgVrsn(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getVersion()));
		} else {
			a.addActvtyDfnDsgAddtnlInstrctnCdgVrsn("NULL");
		}

		if(activitydefinitiondosageadditionalinstructioncodingi == activitydefinitiondosageadditionalinstructioncodinglist.size()-1) {a.addActvtyDfnDsgAddtnlInstrctnCdgVrsn("]]]");}


		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncodingi == 0) {a.addActvtyDfnDsgAddtnlInstrctnCdgCd("[[[");}
		if(activitydefinitiondosageadditionalinstructioncoding.hasCode()) {

			a.addActvtyDfnDsgAddtnlInstrctnCdgCd(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getCode()));
		} else {
			a.addActvtyDfnDsgAddtnlInstrctnCdgCd("NULL");
		}

		if(activitydefinitiondosageadditionalinstructioncodingi == activitydefinitiondosageadditionalinstructioncodinglist.size()-1) {a.addActvtyDfnDsgAddtnlInstrctnCdgCd("]]]");}


		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncodingi == 0) {a.addActvtyDfnDsgAddtnlInstrctnCdgUsrSltd("[[[");}
		if(activitydefinitiondosageadditionalinstructioncoding.hasUserSelected()) {

			a.addActvtyDfnDsgAddtnlInstrctnCdgUsrSltd(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getUserSelected()));
		} else {
			a.addActvtyDfnDsgAddtnlInstrctnCdgUsrSltd("NULL");
		}

		if(activitydefinitiondosageadditionalinstructioncodingi == activitydefinitiondosageadditionalinstructioncodinglist.size()-1) {a.addActvtyDfnDsgAddtnlInstrctnCdgUsrSltd("]]]");}


		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosageadditionalinstructioncodingi == 0) {a.addActvtyDfnDsgAddtnlInstrctnCdgSys("[[[");}
		if(activitydefinitiondosageadditionalinstructioncoding.hasSystem()) {

			a.addActvtyDfnDsgAddtnlInstrctnCdgSys(String.valueOf(activitydefinitiondosageadditionalinstructioncoding.getSystem()));
		} else {
			a.addActvtyDfnDsgAddtnlInstrctnCdgSys("NULL");
		}

		if(activitydefinitiondosageadditionalinstructioncodingi == activitydefinitiondosageadditionalinstructioncodinglist.size()-1) {a.addActvtyDfnDsgAddtnlInstrctnCdgSys("]]]");}


		 };
		 };
		/******************** activitydefinitiondosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperlifetime = activitydefinitiondosage.getMaxDosePerLifetime();

		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasValue()) {

			a.addActvtyDfnDsgMxDosePerLifetimeVl(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getValue()));
		} else {
			a.addActvtyDfnDsgMxDosePerLifetimeVl("NULL");
		}


		/******************** activitydefinitiondosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiondosagemaxdoseperlifetimecomparator = activitydefinitiondosagemaxdoseperlifetime.getComparator();
		if(activitydefinitiondosagemaxdoseperlifetimecomparator!=null) {
			a.addActvtyDfnDsgMxDosePerLifetimeCmprtr(activitydefinitiondosagemaxdoseperlifetimecomparator.toCode());
		} else {
			a.addActvtyDfnDsgMxDosePerLifetimeCmprtr("NULL");
		}

		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasCode()) {

			a.addActvtyDfnDsgMxDosePerLifetimeCd(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getCode()));
		} else {
			a.addActvtyDfnDsgMxDosePerLifetimeCd("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasUnit()) {

			a.addActvtyDfnDsgMxDosePerLifetimeUnt(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getUnit()));
		} else {
			a.addActvtyDfnDsgMxDosePerLifetimeUnt("NULL");
		}


		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(activitydefinitiondosagemaxdoseperlifetime.hasSystem()) {

			a.addActvtyDfnDsgMxDosePerLifetimeSys(String.valueOf(activitydefinitiondosagemaxdoseperlifetime.getSystem()));
		} else {
			a.addActvtyDfnDsgMxDosePerLifetimeSys("NULL");
		}


		/******************** activitydefinitiondosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageasneededcodeableconcept = activitydefinitiondosage.getAsNeededCodeableConcept();

		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconcept.hasText()) {

			a.addActvtyDfnDsgAsNdCdbleCncptTxt(String.valueOf(activitydefinitiondosageasneededcodeableconcept.getText()));
		} else {
			a.addActvtyDfnDsgAsNdCdbleCncptTxt("NULL");
		}


		/******************** activitydefinitiondosageasneededcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiondosageasneededcodeableconceptcodinglist = activitydefinitiondosageasneededcodeableconcept.getCoding();
		for(int activitydefinitiondosageasneededcodeableconceptcodingi = 0; activitydefinitiondosageasneededcodeableconceptcodingi<activitydefinitiondosageasneededcodeableconceptcodinglist.size();activitydefinitiondosageasneededcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiondosageasneededcodeableconceptcoding = activitydefinitiondosageasneededcodeableconceptcodinglist.get(activitydefinitiondosageasneededcodeableconceptcodingi);

		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcodingi == 0) {a.addActvtyDfnDsgAsNdCdbleCncptCdgDsply("[[");}
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasDisplay()) {

			a.addActvtyDfnDsgAsNdCdbleCncptCdgDsply(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getDisplay()));
		} else {
			a.addActvtyDfnDsgAsNdCdbleCncptCdgDsply("NULL");
		}

		if(activitydefinitiondosageasneededcodeableconceptcodingi == activitydefinitiondosageasneededcodeableconceptcodinglist.size()-1) {a.addActvtyDfnDsgAsNdCdbleCncptCdgDsply("]]");}


		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcodingi == 0) {a.addActvtyDfnDsgAsNdCdbleCncptCdgVrsn("[[");}
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasVersion()) {

			a.addActvtyDfnDsgAsNdCdbleCncptCdgVrsn(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getVersion()));
		} else {
			a.addActvtyDfnDsgAsNdCdbleCncptCdgVrsn("NULL");
		}

		if(activitydefinitiondosageasneededcodeableconceptcodingi == activitydefinitiondosageasneededcodeableconceptcodinglist.size()-1) {a.addActvtyDfnDsgAsNdCdbleCncptCdgVrsn("]]");}


		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcodingi == 0) {a.addActvtyDfnDsgAsNdCdbleCncptCdgCd("[[");}
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasCode()) {

			a.addActvtyDfnDsgAsNdCdbleCncptCdgCd(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getCode()));
		} else {
			a.addActvtyDfnDsgAsNdCdbleCncptCdgCd("NULL");
		}

		if(activitydefinitiondosageasneededcodeableconceptcodingi == activitydefinitiondosageasneededcodeableconceptcodinglist.size()-1) {a.addActvtyDfnDsgAsNdCdbleCncptCdgCd("]]");}


		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcodingi == 0) {a.addActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd("[[");}
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasUserSelected()) {

			a.addActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getUserSelected()));
		} else {
			a.addActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd("NULL");
		}

		if(activitydefinitiondosageasneededcodeableconceptcodingi == activitydefinitiondosageasneededcodeableconceptcodinglist.size()-1) {a.addActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosageasneededcodeableconceptcodingi == 0) {a.addActvtyDfnDsgAsNdCdbleCncptCdgSys("[[");}
		if(activitydefinitiondosageasneededcodeableconceptcoding.hasSystem()) {

			a.addActvtyDfnDsgAsNdCdbleCncptCdgSys(String.valueOf(activitydefinitiondosageasneededcodeableconceptcoding.getSystem()));
		} else {
			a.addActvtyDfnDsgAsNdCdbleCncptCdgSys("NULL");
		}

		if(activitydefinitiondosageasneededcodeableconceptcodingi == activitydefinitiondosageasneededcodeableconceptcodinglist.size()-1) {a.addActvtyDfnDsgAsNdCdbleCncptCdgSys("]]");}


		 };
		/******************** ActvtyDfn_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(activitydefinitiondosage.hasAsNeededBooleanType()) {

			a.addActvtyDfnDsgAsNdBooleanTyp("\""+activitydefinitiondosage.getAsNeededBooleanType().getValueAsString()+"\"");
		} else {
			a.addActvtyDfnDsgAsNdBooleanTyp("NULL");
		}


		/******************** activitydefinitiondosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageroute = activitydefinitiondosage.getRoute();

		/******************** ActvtyDfn_Dsg_Route_Txt ********************************************************************************/
		if(activitydefinitiondosageroute.hasText()) {

			a.addActvtyDfnDsgRouteTxt(String.valueOf(activitydefinitiondosageroute.getText()));
		} else {
			a.addActvtyDfnDsgRouteTxt("NULL");
		}


		/******************** activitydefinitiondosageroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiondosageroutecodinglist = activitydefinitiondosageroute.getCoding();
		for(int activitydefinitiondosageroutecodingi = 0; activitydefinitiondosageroutecodingi<activitydefinitiondosageroutecodinglist.size();activitydefinitiondosageroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiondosageroutecoding = activitydefinitiondosageroutecodinglist.get(activitydefinitiondosageroutecodingi);

		/******************** ActvtyDfn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiondosageroutecodingi == 0) {a.addActvtyDfnDsgRouteCdgDsply("[[");}
		if(activitydefinitiondosageroutecoding.hasDisplay()) {

			a.addActvtyDfnDsgRouteCdgDsply(String.valueOf(activitydefinitiondosageroutecoding.getDisplay()));
		} else {
			a.addActvtyDfnDsgRouteCdgDsply("NULL");
		}

		if(activitydefinitiondosageroutecodingi == activitydefinitiondosageroutecodinglist.size()-1) {a.addActvtyDfnDsgRouteCdgDsply("]]");}


		/******************** ActvtyDfn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiondosageroutecodingi == 0) {a.addActvtyDfnDsgRouteCdgVrsn("[[");}
		if(activitydefinitiondosageroutecoding.hasVersion()) {

			a.addActvtyDfnDsgRouteCdgVrsn(String.valueOf(activitydefinitiondosageroutecoding.getVersion()));
		} else {
			a.addActvtyDfnDsgRouteCdgVrsn("NULL");
		}

		if(activitydefinitiondosageroutecodingi == activitydefinitiondosageroutecodinglist.size()-1) {a.addActvtyDfnDsgRouteCdgVrsn("]]");}


		/******************** ActvtyDfn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(activitydefinitiondosageroutecodingi == 0) {a.addActvtyDfnDsgRouteCdgCd("[[");}
		if(activitydefinitiondosageroutecoding.hasCode()) {

			a.addActvtyDfnDsgRouteCdgCd(String.valueOf(activitydefinitiondosageroutecoding.getCode()));
		} else {
			a.addActvtyDfnDsgRouteCdgCd("NULL");
		}

		if(activitydefinitiondosageroutecodingi == activitydefinitiondosageroutecodinglist.size()-1) {a.addActvtyDfnDsgRouteCdgCd("]]");}


		/******************** ActvtyDfn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiondosageroutecodingi == 0) {a.addActvtyDfnDsgRouteCdgUsrSltd("[[");}
		if(activitydefinitiondosageroutecoding.hasUserSelected()) {

			a.addActvtyDfnDsgRouteCdgUsrSltd(String.valueOf(activitydefinitiondosageroutecoding.getUserSelected()));
		} else {
			a.addActvtyDfnDsgRouteCdgUsrSltd("NULL");
		}

		if(activitydefinitiondosageroutecodingi == activitydefinitiondosageroutecodinglist.size()-1) {a.addActvtyDfnDsgRouteCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(activitydefinitiondosageroutecodingi == 0) {a.addActvtyDfnDsgRouteCdgSys("[[");}
		if(activitydefinitiondosageroutecoding.hasSystem()) {

			a.addActvtyDfnDsgRouteCdgSys(String.valueOf(activitydefinitiondosageroutecoding.getSystem()));
		} else {
			a.addActvtyDfnDsgRouteCdgSys("NULL");
		}

		if(activitydefinitiondosageroutecodingi == activitydefinitiondosageroutecodinglist.size()-1) {a.addActvtyDfnDsgRouteCdgSys("]]");}


		 };
		 };
		/******************** ActvtyDfn_TmgDtTimeTyp ********************************************************************************/
		if(activitydefinition.hasTimingDateTimeType()) {

			a.addActvtyDfnTmgDtTimeTyp("\""+activitydefinition.getTimingDateTimeType().getValueAsString()+"\"");
		} else {
			a.addActvtyDfnTmgDtTimeTyp("NULL");
		}


		/******************** activitydefinitiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age activitydefinitiontimingage = activitydefinition.getTimingAge();

		/******************** ActvtyDfn_TmgAge_Vl ********************************************************************************/
		if(activitydefinitiontimingage.hasValue()) {

			a.addActvtyDfnTmgAgeVl(String.valueOf(activitydefinitiontimingage.getValue()));
		} else {
			a.addActvtyDfnTmgAgeVl("NULL");
		}


		/******************** activitydefinitiontimingagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingagecomparator = activitydefinitiontimingage.getComparator();
		if(activitydefinitiontimingagecomparator!=null) {
			a.addActvtyDfnTmgAgeCmprtr(activitydefinitiontimingagecomparator.toCode());
		} else {
			a.addActvtyDfnTmgAgeCmprtr("NULL");
		}

		/******************** ActvtyDfn_TmgAge_Cd ********************************************************************************/
		if(activitydefinitiontimingage.hasCode()) {

			a.addActvtyDfnTmgAgeCd(String.valueOf(activitydefinitiontimingage.getCode()));
		} else {
			a.addActvtyDfnTmgAgeCd("NULL");
		}


		/******************** ActvtyDfn_TmgAge_Unt ********************************************************************************/
		if(activitydefinitiontimingage.hasUnit()) {

			a.addActvtyDfnTmgAgeUnt(String.valueOf(activitydefinitiontimingage.getUnit()));
		} else {
			a.addActvtyDfnTmgAgeUnt("NULL");
		}


		/******************** ActvtyDfn_TmgAge_Sys ********************************************************************************/
		if(activitydefinitiontimingage.hasSystem()) {

			a.addActvtyDfnTmgAgeSys(String.valueOf(activitydefinitiontimingage.getSystem()));
		} else {
			a.addActvtyDfnTmgAgeSys("NULL");
		}


		/******************** activitydefinitiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiontimingduration = activitydefinition.getTimingDuration();

		/******************** ActvtyDfn_TmgDuration_Vl ********************************************************************************/
		if(activitydefinitiontimingduration.hasValue()) {

			a.addActvtyDfnTmgDurationVl(String.valueOf(activitydefinitiontimingduration.getValue()));
		} else {
			a.addActvtyDfnTmgDurationVl("NULL");
		}


		/******************** activitydefinitiontimingdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingdurationcomparator = activitydefinitiontimingduration.getComparator();
		if(activitydefinitiontimingdurationcomparator!=null) {
			a.addActvtyDfnTmgDurationCmprtr(activitydefinitiontimingdurationcomparator.toCode());
		} else {
			a.addActvtyDfnTmgDurationCmprtr("NULL");
		}

		/******************** ActvtyDfn_TmgDuration_Cd ********************************************************************************/
		if(activitydefinitiontimingduration.hasCode()) {

			a.addActvtyDfnTmgDurationCd(String.valueOf(activitydefinitiontimingduration.getCode()));
		} else {
			a.addActvtyDfnTmgDurationCd("NULL");
		}


		/******************** ActvtyDfn_TmgDuration_Unt ********************************************************************************/
		if(activitydefinitiontimingduration.hasUnit()) {

			a.addActvtyDfnTmgDurationUnt(String.valueOf(activitydefinitiontimingduration.getUnit()));
		} else {
			a.addActvtyDfnTmgDurationUnt("NULL");
		}


		/******************** ActvtyDfn_TmgDuration_Sys ********************************************************************************/
		if(activitydefinitiontimingduration.hasSystem()) {

			a.addActvtyDfnTmgDurationSys(String.valueOf(activitydefinitiontimingduration.getSystem()));
		} else {
			a.addActvtyDfnTmgDurationSys("NULL");
		}


		/******************** activitydefinitiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiontimingrange = activitydefinition.getTimingRange();

		/******************** activitydefinitiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingrangelow = activitydefinitiontimingrange.getLow();

		/******************** ActvtyDfn_TmgRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasValue()) {

			a.addActvtyDfnTmgRngLwVl(String.valueOf(activitydefinitiontimingrangelow.getValue()));
		} else {
			a.addActvtyDfnTmgRngLwVl("NULL");
		}


		/******************** activitydefinitiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingrangelowcomparator = activitydefinitiontimingrangelow.getComparator();
		if(activitydefinitiontimingrangelowcomparator!=null) {
			a.addActvtyDfnTmgRngLwCmprtr(activitydefinitiontimingrangelowcomparator.toCode());
		} else {
			a.addActvtyDfnTmgRngLwCmprtr("NULL");
		}

		/******************** ActvtyDfn_TmgRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasCode()) {

			a.addActvtyDfnTmgRngLwCd(String.valueOf(activitydefinitiontimingrangelow.getCode()));
		} else {
			a.addActvtyDfnTmgRngLwCd("NULL");
		}


		/******************** ActvtyDfn_TmgRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasUnit()) {

			a.addActvtyDfnTmgRngLwUnt(String.valueOf(activitydefinitiontimingrangelow.getUnit()));
		} else {
			a.addActvtyDfnTmgRngLwUnt("NULL");
		}


		/******************** ActvtyDfn_TmgRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiontimingrangelow.hasSystem()) {

			a.addActvtyDfnTmgRngLwSys(String.valueOf(activitydefinitiontimingrangelow.getSystem()));
		} else {
			a.addActvtyDfnTmgRngLwSys("NULL");
		}


		/******************** activitydefinitiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingrangehigh = activitydefinitiontimingrange.getHigh();

		/******************** ActvtyDfn_TmgRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasValue()) {

			a.addActvtyDfnTmgRngHiVl(String.valueOf(activitydefinitiontimingrangehigh.getValue()));
		} else {
			a.addActvtyDfnTmgRngHiVl("NULL");
		}


		/******************** activitydefinitiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingrangehighcomparator = activitydefinitiontimingrangehigh.getComparator();
		if(activitydefinitiontimingrangehighcomparator!=null) {
			a.addActvtyDfnTmgRngHiCmprtr(activitydefinitiontimingrangehighcomparator.toCode());
		} else {
			a.addActvtyDfnTmgRngHiCmprtr("NULL");
		}

		/******************** ActvtyDfn_TmgRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasCode()) {

			a.addActvtyDfnTmgRngHiCd(String.valueOf(activitydefinitiontimingrangehigh.getCode()));
		} else {
			a.addActvtyDfnTmgRngHiCd("NULL");
		}


		/******************** ActvtyDfn_TmgRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasUnit()) {

			a.addActvtyDfnTmgRngHiUnt(String.valueOf(activitydefinitiontimingrangehigh.getUnit()));
		} else {
			a.addActvtyDfnTmgRngHiUnt("NULL");
		}


		/******************** ActvtyDfn_TmgRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiontimingrangehigh.hasSystem()) {

			a.addActvtyDfnTmgRngHiSys(String.valueOf(activitydefinitiontimingrangehigh.getSystem()));
		} else {
			a.addActvtyDfnTmgRngHiSys("NULL");
		}


		/******************** ActvtyDfn_Copyright ********************************************************************************/
		if(activitydefinition.hasCopyright()) {

			a.addActvtyDfnCopyright(String.valueOf(activitydefinition.getCopyright()));
		} else {
			a.addActvtyDfnCopyright("NULL");
		}


		/******************** ActvtyDfn_ApprovalDt ********************************************************************************/
		if(activitydefinition.hasApprovalDate()) {

			a.addActvtyDfnApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinition.getApprovalDate())+"\"");
		} else {
			a.addActvtyDfnApprovalDt("NULL");
		}


		/******************** activitydefinitionendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> activitydefinitionendorserlist = activitydefinition.getEndorser();
		for(int activitydefinitionendorseri = 0; activitydefinitionendorseri<activitydefinitionendorserlist.size();activitydefinitionendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  activitydefinitionendorser = activitydefinitionendorserlist.get(activitydefinitionendorseri);

		/******************** ActvtyDfn_Endsr_Nm ********************************************************************************/
		if(activitydefinitionendorseri == 0) {a.addActvtyDfnEndsrNm("[");}
		if(activitydefinitionendorser.hasName()) {

			a.addActvtyDfnEndsrNm(String.valueOf(activitydefinitionendorser.getName()));
		} else {
			a.addActvtyDfnEndsrNm("NULL");
		}

		if(activitydefinitionendorseri == activitydefinitionendorserlist.size()-1) {a.addActvtyDfnEndsrNm("]");}


		/******************** activitydefinitionendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> activitydefinitionendorsertelecomlist = activitydefinitionendorser.getTelecom();
		for(int activitydefinitionendorsertelecomi = 0; activitydefinitionendorsertelecomi<activitydefinitionendorsertelecomlist.size();activitydefinitionendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  activitydefinitionendorsertelecom = activitydefinitionendorsertelecomlist.get(activitydefinitionendorsertelecomi);

		/******************** ActvtyDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(activitydefinitionendorsertelecomi == 0) {a.addActvtyDfnEndsrTlcmVl("[[");}
		if(activitydefinitionendorsertelecom.hasValue()) {

			a.addActvtyDfnEndsrTlcmVl(String.valueOf(activitydefinitionendorsertelecom.getValue()));
		} else {
			a.addActvtyDfnEndsrTlcmVl("NULL");
		}

		if(activitydefinitionendorsertelecomi == activitydefinitionendorsertelecomlist.size()-1) {a.addActvtyDfnEndsrTlcmVl("]]");}


		/******************** activitydefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionendorsertelecomperiod = activitydefinitionendorsertelecom.getPeriod();

		/******************** ActvtyDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitionendorsertelecomi == 0) {a.addActvtyDfnEndsrTlcmPrdStrt("[[");}
		if(activitydefinitionendorsertelecomperiod.hasStart()) {

			a.addActvtyDfnEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionendorsertelecomperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnEndsrTlcmPrdStrt("NULL");
		}

		if(activitydefinitionendorsertelecomi == activitydefinitionendorsertelecomlist.size()-1) {a.addActvtyDfnEndsrTlcmPrdStrt("]]");}


		/******************** ActvtyDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitionendorsertelecomi == 0) {a.addActvtyDfnEndsrTlcmPrdEnd("[[");}
		if(activitydefinitionendorsertelecomperiod.hasEnd()) {

			a.addActvtyDfnEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionendorsertelecomperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnEndsrTlcmPrdEnd("NULL");
		}

		if(activitydefinitionendorsertelecomi == activitydefinitionendorsertelecomlist.size()-1) {a.addActvtyDfnEndsrTlcmPrdEnd("]]");}


		/******************** activitydefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitionendorsertelecomuse = activitydefinitionendorsertelecom.getUse();
		if(activitydefinitionendorsertelecomuse!=null) {
		if(activitydefinitionendorsertelecomi == 0) {

		a.addActvtyDfnEndsrTlcmUse("[[");		}
			a.addActvtyDfnEndsrTlcmUse(activitydefinitionendorsertelecomuse.toCode());
		if(activitydefinitionendorsertelecomi == activitydefinitionendorsertelecomlist.size()-1) {

		a.addActvtyDfnEndsrTlcmUse("]]");		}

		} else {
			a.addActvtyDfnEndsrTlcmUse("NULL");
		}

		/******************** activitydefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitionendorsertelecomsystem = activitydefinitionendorsertelecom.getSystem();
		if(activitydefinitionendorsertelecomsystem!=null) {
		if(activitydefinitionendorsertelecomi == 0) {

		a.addActvtyDfnEndsrTlcmSys("[[");		}
			a.addActvtyDfnEndsrTlcmSys(activitydefinitionendorsertelecomsystem.toCode());
		if(activitydefinitionendorsertelecomi == activitydefinitionendorsertelecomlist.size()-1) {

		a.addActvtyDfnEndsrTlcmSys("]]");		}

		} else {
			a.addActvtyDfnEndsrTlcmSys("NULL");
		}

		/******************** ActvtyDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitionendorsertelecomi == 0) {a.addActvtyDfnEndsrTlcmRnk("[[");}
		if(activitydefinitionendorsertelecom.hasRank()) {

			a.addActvtyDfnEndsrTlcmRnk(String.valueOf(activitydefinitionendorsertelecom.getRank()));
		} else {
			a.addActvtyDfnEndsrTlcmRnk("NULL");
		}

		if(activitydefinitionendorsertelecomi == activitydefinitionendorsertelecomlist.size()-1) {a.addActvtyDfnEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** ActvtyDfn_LastReviewDt ********************************************************************************/
		if(activitydefinition.hasLastReviewDate()) {

			a.addActvtyDfnLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinition.getLastReviewDate())+"\"");
		} else {
			a.addActvtyDfnLastReviewDt("NULL");
		}


		/******************** activitydefinitioneditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> activitydefinitioneditorlist = activitydefinition.getEditor();
		for(int activitydefinitioneditori = 0; activitydefinitioneditori<activitydefinitioneditorlist.size();activitydefinitioneditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  activitydefinitioneditor = activitydefinitioneditorlist.get(activitydefinitioneditori);

		/******************** ActvtyDfn_Editor_Nm ********************************************************************************/
		if(activitydefinitioneditori == 0) {a.addActvtyDfnEditorNm("[");}
		if(activitydefinitioneditor.hasName()) {

			a.addActvtyDfnEditorNm(String.valueOf(activitydefinitioneditor.getName()));
		} else {
			a.addActvtyDfnEditorNm("NULL");
		}

		if(activitydefinitioneditori == activitydefinitioneditorlist.size()-1) {a.addActvtyDfnEditorNm("]");}


		/******************** activitydefinitioneditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> activitydefinitioneditortelecomlist = activitydefinitioneditor.getTelecom();
		for(int activitydefinitioneditortelecomi = 0; activitydefinitioneditortelecomi<activitydefinitioneditortelecomlist.size();activitydefinitioneditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  activitydefinitioneditortelecom = activitydefinitioneditortelecomlist.get(activitydefinitioneditortelecomi);

		/******************** ActvtyDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(activitydefinitioneditortelecomi == 0) {a.addActvtyDfnEditorTlcmVl("[[");}
		if(activitydefinitioneditortelecom.hasValue()) {

			a.addActvtyDfnEditorTlcmVl(String.valueOf(activitydefinitioneditortelecom.getValue()));
		} else {
			a.addActvtyDfnEditorTlcmVl("NULL");
		}

		if(activitydefinitioneditortelecomi == activitydefinitioneditortelecomlist.size()-1) {a.addActvtyDfnEditorTlcmVl("]]");}


		/******************** activitydefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioneditortelecomperiod = activitydefinitioneditortelecom.getPeriod();

		/******************** ActvtyDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitioneditortelecomi == 0) {a.addActvtyDfnEditorTlcmPrdStrt("[[");}
		if(activitydefinitioneditortelecomperiod.hasStart()) {

			a.addActvtyDfnEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitioneditortelecomperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnEditorTlcmPrdStrt("NULL");
		}

		if(activitydefinitioneditortelecomi == activitydefinitioneditortelecomlist.size()-1) {a.addActvtyDfnEditorTlcmPrdStrt("]]");}


		/******************** ActvtyDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitioneditortelecomi == 0) {a.addActvtyDfnEditorTlcmPrdEnd("[[");}
		if(activitydefinitioneditortelecomperiod.hasEnd()) {

			a.addActvtyDfnEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitioneditortelecomperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnEditorTlcmPrdEnd("NULL");
		}

		if(activitydefinitioneditortelecomi == activitydefinitioneditortelecomlist.size()-1) {a.addActvtyDfnEditorTlcmPrdEnd("]]");}


		/******************** activitydefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitioneditortelecomuse = activitydefinitioneditortelecom.getUse();
		if(activitydefinitioneditortelecomuse!=null) {
		if(activitydefinitioneditortelecomi == 0) {

		a.addActvtyDfnEditorTlcmUse("[[");		}
			a.addActvtyDfnEditorTlcmUse(activitydefinitioneditortelecomuse.toCode());
		if(activitydefinitioneditortelecomi == activitydefinitioneditortelecomlist.size()-1) {

		a.addActvtyDfnEditorTlcmUse("]]");		}

		} else {
			a.addActvtyDfnEditorTlcmUse("NULL");
		}

		/******************** activitydefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitioneditortelecomsystem = activitydefinitioneditortelecom.getSystem();
		if(activitydefinitioneditortelecomsystem!=null) {
		if(activitydefinitioneditortelecomi == 0) {

		a.addActvtyDfnEditorTlcmSys("[[");		}
			a.addActvtyDfnEditorTlcmSys(activitydefinitioneditortelecomsystem.toCode());
		if(activitydefinitioneditortelecomi == activitydefinitioneditortelecomlist.size()-1) {

		a.addActvtyDfnEditorTlcmSys("]]");		}

		} else {
			a.addActvtyDfnEditorTlcmSys("NULL");
		}

		/******************** ActvtyDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitioneditortelecomi == 0) {a.addActvtyDfnEditorTlcmRnk("[[");}
		if(activitydefinitioneditortelecom.hasRank()) {

			a.addActvtyDfnEditorTlcmRnk(String.valueOf(activitydefinitioneditortelecom.getRank()));
		} else {
			a.addActvtyDfnEditorTlcmRnk("NULL");
		}

		if(activitydefinitioneditortelecomi == activitydefinitioneditortelecomlist.size()-1) {a.addActvtyDfnEditorTlcmRnk("]]");}


		 };
		 };
		/******************** activitydefinitionreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> activitydefinitionreviewerlist = activitydefinition.getReviewer();
		for(int activitydefinitionrevieweri = 0; activitydefinitionrevieweri<activitydefinitionreviewerlist.size();activitydefinitionrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  activitydefinitionreviewer = activitydefinitionreviewerlist.get(activitydefinitionrevieweri);

		/******************** ActvtyDfn_Rviewr_Nm ********************************************************************************/
		if(activitydefinitionrevieweri == 0) {a.addActvtyDfnRviewrNm("[");}
		if(activitydefinitionreviewer.hasName()) {

			a.addActvtyDfnRviewrNm(String.valueOf(activitydefinitionreviewer.getName()));
		} else {
			a.addActvtyDfnRviewrNm("NULL");
		}

		if(activitydefinitionrevieweri == activitydefinitionreviewerlist.size()-1) {a.addActvtyDfnRviewrNm("]");}


		/******************** activitydefinitionreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> activitydefinitionreviewertelecomlist = activitydefinitionreviewer.getTelecom();
		for(int activitydefinitionreviewertelecomi = 0; activitydefinitionreviewertelecomi<activitydefinitionreviewertelecomlist.size();activitydefinitionreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  activitydefinitionreviewertelecom = activitydefinitionreviewertelecomlist.get(activitydefinitionreviewertelecomi);

		/******************** ActvtyDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(activitydefinitionreviewertelecomi == 0) {a.addActvtyDfnRviewrTlcmVl("[[");}
		if(activitydefinitionreviewertelecom.hasValue()) {

			a.addActvtyDfnRviewrTlcmVl(String.valueOf(activitydefinitionreviewertelecom.getValue()));
		} else {
			a.addActvtyDfnRviewrTlcmVl("NULL");
		}

		if(activitydefinitionreviewertelecomi == activitydefinitionreviewertelecomlist.size()-1) {a.addActvtyDfnRviewrTlcmVl("]]");}


		/******************** activitydefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionreviewertelecomperiod = activitydefinitionreviewertelecom.getPeriod();

		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitionreviewertelecomi == 0) {a.addActvtyDfnRviewrTlcmPrdStrt("[[");}
		if(activitydefinitionreviewertelecomperiod.hasStart()) {

			a.addActvtyDfnRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionreviewertelecomperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnRviewrTlcmPrdStrt("NULL");
		}

		if(activitydefinitionreviewertelecomi == activitydefinitionreviewertelecomlist.size()-1) {a.addActvtyDfnRviewrTlcmPrdStrt("]]");}


		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitionreviewertelecomi == 0) {a.addActvtyDfnRviewrTlcmPrdEnd("[[");}
		if(activitydefinitionreviewertelecomperiod.hasEnd()) {

			a.addActvtyDfnRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionreviewertelecomperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnRviewrTlcmPrdEnd("NULL");
		}

		if(activitydefinitionreviewertelecomi == activitydefinitionreviewertelecomlist.size()-1) {a.addActvtyDfnRviewrTlcmPrdEnd("]]");}


		/******************** activitydefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitionreviewertelecomuse = activitydefinitionreviewertelecom.getUse();
		if(activitydefinitionreviewertelecomuse!=null) {
		if(activitydefinitionreviewertelecomi == 0) {

		a.addActvtyDfnRviewrTlcmUse("[[");		}
			a.addActvtyDfnRviewrTlcmUse(activitydefinitionreviewertelecomuse.toCode());
		if(activitydefinitionreviewertelecomi == activitydefinitionreviewertelecomlist.size()-1) {

		a.addActvtyDfnRviewrTlcmUse("]]");		}

		} else {
			a.addActvtyDfnRviewrTlcmUse("NULL");
		}

		/******************** activitydefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitionreviewertelecomsystem = activitydefinitionreviewertelecom.getSystem();
		if(activitydefinitionreviewertelecomsystem!=null) {
		if(activitydefinitionreviewertelecomi == 0) {

		a.addActvtyDfnRviewrTlcmSys("[[");		}
			a.addActvtyDfnRviewrTlcmSys(activitydefinitionreviewertelecomsystem.toCode());
		if(activitydefinitionreviewertelecomi == activitydefinitionreviewertelecomlist.size()-1) {

		a.addActvtyDfnRviewrTlcmSys("]]");		}

		} else {
			a.addActvtyDfnRviewrTlcmSys("NULL");
		}

		/******************** ActvtyDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitionreviewertelecomi == 0) {a.addActvtyDfnRviewrTlcmRnk("[[");}
		if(activitydefinitionreviewertelecom.hasRank()) {

			a.addActvtyDfnRviewrTlcmRnk(String.valueOf(activitydefinitionreviewertelecom.getRank()));
		} else {
			a.addActvtyDfnRviewrTlcmRnk("NULL");
		}

		if(activitydefinitionreviewertelecomi == activitydefinitionreviewertelecomlist.size()-1) {a.addActvtyDfnRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** ActvtyDfn_Usg ********************************************************************************/
		if(activitydefinition.hasUsage()) {

			a.addActvtyDfnUsg(String.valueOf(activitydefinition.getUsage()));
		} else {
			a.addActvtyDfnUsg("NULL");
		}


		/******************** activitydefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind activitydefinitionkind = activitydefinition.getKind();
		if(activitydefinitionkind!=null) {
			a.addActvtyDfnKind(activitydefinitionkind.toCode());
		} else {
			a.addActvtyDfnKind("NULL");
		}

		/******************** ActvtyDfn_Library ********************************************************************************/
		if(activitydefinition.hasLibrary()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinition.getLibrary().size(); incr++) {
				array = array + activitydefinition.getLibrary().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnLibrary(array);

		} else {
			a.addActvtyDfnLibrary("NULL");
		}


		/******************** ActvtyDfn_SbjctRfrnc ********************************************************************************/
		if(activitydefinition.hasSubjectReference()) {

			if(activitydefinition.getSubjectReference().getReference() != null) {
			a.addActvtyDfnSbjctRfrnc(activitydefinition.getSubjectReference().getReference());
			}
		} else {
			a.addActvtyDfnSbjctRfrnc("NULL");
		}


		/******************** ActvtyDfn_SpcmnRqrment ********************************************************************************/
		if(activitydefinition.hasSpecimenRequirement()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinition.getSpecimenRequirement().size(); incr++) {
				array = array + activitydefinition.getSpecimenRequirement().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnSpcmnRqrment(array);

		} else {
			a.addActvtyDfnSpcmnRqrment("NULL");
		}


		/******************** activitydefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionsubjectcodeableconcept = activitydefinition.getSubjectCodeableConcept();

		/******************** ActvtyDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitionsubjectcodeableconcept.hasText()) {

			a.addActvtyDfnSbjctCdbleCncptTxt(String.valueOf(activitydefinitionsubjectcodeableconcept.getText()));
		} else {
			a.addActvtyDfnSbjctCdbleCncptTxt("NULL");
		}


		/******************** activitydefinitionsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitionsubjectcodeableconceptcodinglist = activitydefinitionsubjectcodeableconcept.getCoding();
		for(int activitydefinitionsubjectcodeableconceptcodingi = 0; activitydefinitionsubjectcodeableconceptcodingi<activitydefinitionsubjectcodeableconceptcodinglist.size();activitydefinitionsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitionsubjectcodeableconceptcoding = activitydefinitionsubjectcodeableconceptcodinglist.get(activitydefinitionsubjectcodeableconceptcodingi);

		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcodingi == 0) {a.addActvtyDfnSbjctCdbleCncptCdgDsply("[");}
		if(activitydefinitionsubjectcodeableconceptcoding.hasDisplay()) {

			a.addActvtyDfnSbjctCdbleCncptCdgDsply(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getDisplay()));
		} else {
			a.addActvtyDfnSbjctCdbleCncptCdgDsply("NULL");
		}

		if(activitydefinitionsubjectcodeableconceptcodingi == activitydefinitionsubjectcodeableconceptcodinglist.size()-1) {a.addActvtyDfnSbjctCdbleCncptCdgDsply("]");}


		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcodingi == 0) {a.addActvtyDfnSbjctCdbleCncptCdgVrsn("[");}
		if(activitydefinitionsubjectcodeableconceptcoding.hasVersion()) {

			a.addActvtyDfnSbjctCdbleCncptCdgVrsn(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getVersion()));
		} else {
			a.addActvtyDfnSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(activitydefinitionsubjectcodeableconceptcodingi == activitydefinitionsubjectcodeableconceptcodinglist.size()-1) {a.addActvtyDfnSbjctCdbleCncptCdgVrsn("]");}


		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcodingi == 0) {a.addActvtyDfnSbjctCdbleCncptCdgCd("[");}
		if(activitydefinitionsubjectcodeableconceptcoding.hasCode()) {

			a.addActvtyDfnSbjctCdbleCncptCdgCd(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getCode()));
		} else {
			a.addActvtyDfnSbjctCdbleCncptCdgCd("NULL");
		}

		if(activitydefinitionsubjectcodeableconceptcodingi == activitydefinitionsubjectcodeableconceptcodinglist.size()-1) {a.addActvtyDfnSbjctCdbleCncptCdgCd("]");}


		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcodingi == 0) {a.addActvtyDfnSbjctCdbleCncptCdgUsrSltd("[");}
		if(activitydefinitionsubjectcodeableconceptcoding.hasUserSelected()) {

			a.addActvtyDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			a.addActvtyDfnSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(activitydefinitionsubjectcodeableconceptcodingi == activitydefinitionsubjectcodeableconceptcodinglist.size()-1) {a.addActvtyDfnSbjctCdbleCncptCdgUsrSltd("]");}


		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitionsubjectcodeableconceptcodingi == 0) {a.addActvtyDfnSbjctCdbleCncptCdgSys("[");}
		if(activitydefinitionsubjectcodeableconceptcoding.hasSystem()) {

			a.addActvtyDfnSbjctCdbleCncptCdgSys(String.valueOf(activitydefinitionsubjectcodeableconceptcoding.getSystem()));
		} else {
			a.addActvtyDfnSbjctCdbleCncptCdgSys("NULL");
		}

		if(activitydefinitionsubjectcodeableconceptcodingi == activitydefinitionsubjectcodeableconceptcodinglist.size()-1) {a.addActvtyDfnSbjctCdbleCncptCdgSys("]");}


		 };
		/******************** ActvtyDfn_ObsrvtnRqrment ********************************************************************************/
		if(activitydefinition.hasObservationRequirement()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinition.getObservationRequirement().size(); incr++) {
				array = array + activitydefinition.getObservationRequirement().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnObsrvtnRqrment(array);

		} else {
			a.addActvtyDfnObsrvtnRqrment("NULL");
		}


		/******************** ActvtyDfn_ObsrvtnRsltRqrment ********************************************************************************/
		if(activitydefinition.hasObservationResultRequirement()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinition.getObservationResultRequirement().size(); incr++) {
				array = array + activitydefinition.getObservationResultRequirement().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnObsrvtnRsltRqrment(array);

		} else {
			a.addActvtyDfnObsrvtnRsltRqrment("NULL");
		}


		/******************** activitydefinitionproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionproductcodeableconcept = activitydefinition.getProductCodeableConcept();

		/******************** ActvtyDfn_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitionproductcodeableconcept.hasText()) {

			a.addActvtyDfnPrdctCdbleCncptTxt(String.valueOf(activitydefinitionproductcodeableconcept.getText()));
		} else {
			a.addActvtyDfnPrdctCdbleCncptTxt("NULL");
		}


		/******************** activitydefinitionproductcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitionproductcodeableconceptcodinglist = activitydefinitionproductcodeableconcept.getCoding();
		for(int activitydefinitionproductcodeableconceptcodingi = 0; activitydefinitionproductcodeableconceptcodingi<activitydefinitionproductcodeableconceptcodinglist.size();activitydefinitionproductcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitionproductcodeableconceptcoding = activitydefinitionproductcodeableconceptcodinglist.get(activitydefinitionproductcodeableconceptcodingi);

		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcodingi == 0) {a.addActvtyDfnPrdctCdbleCncptCdgDsply("[");}
		if(activitydefinitionproductcodeableconceptcoding.hasDisplay()) {

			a.addActvtyDfnPrdctCdbleCncptCdgDsply(String.valueOf(activitydefinitionproductcodeableconceptcoding.getDisplay()));
		} else {
			a.addActvtyDfnPrdctCdbleCncptCdgDsply("NULL");
		}

		if(activitydefinitionproductcodeableconceptcodingi == activitydefinitionproductcodeableconceptcodinglist.size()-1) {a.addActvtyDfnPrdctCdbleCncptCdgDsply("]");}


		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcodingi == 0) {a.addActvtyDfnPrdctCdbleCncptCdgVrsn("[");}
		if(activitydefinitionproductcodeableconceptcoding.hasVersion()) {

			a.addActvtyDfnPrdctCdbleCncptCdgVrsn(String.valueOf(activitydefinitionproductcodeableconceptcoding.getVersion()));
		} else {
			a.addActvtyDfnPrdctCdbleCncptCdgVrsn("NULL");
		}

		if(activitydefinitionproductcodeableconceptcodingi == activitydefinitionproductcodeableconceptcodinglist.size()-1) {a.addActvtyDfnPrdctCdbleCncptCdgVrsn("]");}


		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcodingi == 0) {a.addActvtyDfnPrdctCdbleCncptCdgCd("[");}
		if(activitydefinitionproductcodeableconceptcoding.hasCode()) {

			a.addActvtyDfnPrdctCdbleCncptCdgCd(String.valueOf(activitydefinitionproductcodeableconceptcoding.getCode()));
		} else {
			a.addActvtyDfnPrdctCdbleCncptCdgCd("NULL");
		}

		if(activitydefinitionproductcodeableconceptcodingi == activitydefinitionproductcodeableconceptcodinglist.size()-1) {a.addActvtyDfnPrdctCdbleCncptCdgCd("]");}


		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcodingi == 0) {a.addActvtyDfnPrdctCdbleCncptCdgUsrSltd("[");}
		if(activitydefinitionproductcodeableconceptcoding.hasUserSelected()) {

			a.addActvtyDfnPrdctCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitionproductcodeableconceptcoding.getUserSelected()));
		} else {
			a.addActvtyDfnPrdctCdbleCncptCdgUsrSltd("NULL");
		}

		if(activitydefinitionproductcodeableconceptcodingi == activitydefinitionproductcodeableconceptcodinglist.size()-1) {a.addActvtyDfnPrdctCdbleCncptCdgUsrSltd("]");}


		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitionproductcodeableconceptcodingi == 0) {a.addActvtyDfnPrdctCdbleCncptCdgSys("[");}
		if(activitydefinitionproductcodeableconceptcoding.hasSystem()) {

			a.addActvtyDfnPrdctCdbleCncptCdgSys(String.valueOf(activitydefinitionproductcodeableconceptcoding.getSystem()));
		} else {
			a.addActvtyDfnPrdctCdbleCncptCdgSys("NULL");
		}

		if(activitydefinitionproductcodeableconceptcodingi == activitydefinitionproductcodeableconceptcodinglist.size()-1) {a.addActvtyDfnPrdctCdbleCncptCdgSys("]");}


		 };
		/******************** ActvtyDfn_PrdctRfrnc ********************************************************************************/
		if(activitydefinition.hasProductReference()) {

			if(activitydefinition.getProductReference().getReference() != null) {
			a.addActvtyDfnPrdctRfrnc(activitydefinition.getProductReference().getReference());
			}
		} else {
			a.addActvtyDfnPrdctRfrnc("NULL");
		}


		/******************** ActvtyDfn_Ttl ********************************************************************************/
		if(activitydefinition.hasTitle()) {

			a.addActvtyDfnTtl(String.valueOf(activitydefinition.getTitle()));
		} else {
			a.addActvtyDfnTtl("NULL");
		}


		/******************** activitydefinitionrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> activitydefinitionrelatedartifactlist = activitydefinition.getRelatedArtifact();
		for(int activitydefinitionrelatedartifacti = 0; activitydefinitionrelatedartifacti<activitydefinitionrelatedartifactlist.size();activitydefinitionrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  activitydefinitionrelatedartifact = activitydefinitionrelatedartifactlist.get(activitydefinitionrelatedartifacti);

		/******************** ActvtyDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctRsrc("[");}
		if(activitydefinitionrelatedartifact.hasResource()) {

			a.addActvtyDfnRltedArtfctRsrc(String.valueOf(activitydefinitionrelatedartifact.getResource()));
		} else {
			a.addActvtyDfnRltedArtfctRsrc("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctRsrc("]");}


		/******************** activitydefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType activitydefinitionrelatedartifacttype = activitydefinitionrelatedartifact.getType();
		if(activitydefinitionrelatedartifacttype!=null) {
		if(activitydefinitionrelatedartifacti == 0) {

		a.addActvtyDfnRltedArtfctTyp("[");		}
			a.addActvtyDfnRltedArtfctTyp(activitydefinitionrelatedartifacttype.toCode());
		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {

		a.addActvtyDfnRltedArtfctTyp("]");		}

		} else {
			a.addActvtyDfnRltedArtfctTyp("NULL");
		}

		/******************** ActvtyDfn_RltedArtfct_Url ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctUrl("[");}
		if(activitydefinitionrelatedartifact.hasUrl()) {

			a.addActvtyDfnRltedArtfctUrl(String.valueOf(activitydefinitionrelatedartifact.getUrl()));
		} else {
			a.addActvtyDfnRltedArtfctUrl("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctUrl("]");}


		/******************** ActvtyDfn_RltedArtfct_Citation ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctCitation("[");}
		if(activitydefinitionrelatedartifact.hasCitation()) {

			a.addActvtyDfnRltedArtfctCitation(String.valueOf(activitydefinitionrelatedartifact.getCitation()));
		} else {
			a.addActvtyDfnRltedArtfctCitation("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctCitation("]");}


		/******************** ActvtyDfn_RltedArtfct_Lbl ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctLbl("[");}
		if(activitydefinitionrelatedartifact.hasLabel()) {

			a.addActvtyDfnRltedArtfctLbl(String.valueOf(activitydefinitionrelatedartifact.getLabel()));
		} else {
			a.addActvtyDfnRltedArtfctLbl("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctLbl("]");}


		/******************** activitydefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment activitydefinitionrelatedartifactdocument = activitydefinitionrelatedartifact.getDocument();

		/******************** ActvtyDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocSz("[");}
		if(activitydefinitionrelatedartifactdocument.hasSize()) {

			a.addActvtyDfnRltedArtfctDocSz(String.valueOf(activitydefinitionrelatedartifactdocument.getSize()));
		} else {
			a.addActvtyDfnRltedArtfctDocSz("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocSz("]");}


		/******************** ActvtyDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocLnguage("[");}
		if(activitydefinitionrelatedartifactdocument.hasLanguage()) {

			a.addActvtyDfnRltedArtfctDocLnguage(String.valueOf(activitydefinitionrelatedartifactdocument.getLanguage()));
		} else {
			a.addActvtyDfnRltedArtfctDocLnguage("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocLnguage("]");}


		/******************** ActvtyDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocCntntTyp("[");}
		if(activitydefinitionrelatedartifactdocument.hasContentType()) {

			a.addActvtyDfnRltedArtfctDocCntntTyp(String.valueOf(activitydefinitionrelatedartifactdocument.getContentType()));
		} else {
			a.addActvtyDfnRltedArtfctDocCntntTyp("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocCntntTyp("]");}


		/******************** ActvtyDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocHash("[");}
		if(activitydefinitionrelatedartifactdocument.hasHash()) {

			a.addActvtyDfnRltedArtfctDocHash(new String(activitydefinitionrelatedartifactdocument.getHash()));
		} else {
			a.addActvtyDfnRltedArtfctDocHash("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocHash("]");}


		/******************** ActvtyDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocData("[");}
		if(activitydefinitionrelatedartifactdocument.hasData()) {

			a.addActvtyDfnRltedArtfctDocData(new String(activitydefinitionrelatedartifactdocument.getData()));
		} else {
			a.addActvtyDfnRltedArtfctDocData("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocData("]");}


		/******************** ActvtyDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocCreation("[");}
		if(activitydefinitionrelatedartifactdocument.hasCreation()) {

			a.addActvtyDfnRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionrelatedartifactdocument.getCreation())+"\"");
		} else {
			a.addActvtyDfnRltedArtfctDocCreation("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocCreation("]");}


		/******************** ActvtyDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocTtl("[");}
		if(activitydefinitionrelatedartifactdocument.hasTitle()) {

			a.addActvtyDfnRltedArtfctDocTtl(String.valueOf(activitydefinitionrelatedartifactdocument.getTitle()));
		} else {
			a.addActvtyDfnRltedArtfctDocTtl("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocTtl("]");}


		/******************** ActvtyDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(activitydefinitionrelatedartifacti == 0) {a.addActvtyDfnRltedArtfctDocUrl("[");}
		if(activitydefinitionrelatedartifactdocument.hasUrl()) {

			a.addActvtyDfnRltedArtfctDocUrl(String.valueOf(activitydefinitionrelatedartifactdocument.getUrl()));
		} else {
			a.addActvtyDfnRltedArtfctDocUrl("NULL");
		}

		if(activitydefinitionrelatedartifacti == activitydefinitionrelatedartifactlist.size()-1) {a.addActvtyDfnRltedArtfctDocUrl("]");}


		 };
		/******************** ActvtyDfn_Prpse ********************************************************************************/
		if(activitydefinition.hasPurpose()) {

			a.addActvtyDfnPrpse(String.valueOf(activitydefinition.getPurpose()));
		} else {
			a.addActvtyDfnPrpse("NULL");
		}


		/******************** ActvtyDfn_Url ********************************************************************************/
		if(activitydefinition.hasUrl()) {

			a.addActvtyDfnUrl(String.valueOf(activitydefinition.getUrl()));
		} else {
			a.addActvtyDfnUrl("NULL");
		}


		/******************** ActvtyDfn_Profile ********************************************************************************/
		if(activitydefinition.hasProfile()) {

			a.addActvtyDfnProfile(String.valueOf(activitydefinition.getProfile()));
		} else {
			a.addActvtyDfnProfile("NULL");
		}


		/******************** activitydefinitiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing activitydefinitiontimingtiming = activitydefinition.getTimingTiming();

		/******************** activitydefinitiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiontimingtimingcode = activitydefinitiontimingtiming.getCode();

		/******************** ActvtyDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(activitydefinitiontimingtimingcode.hasText()) {

			a.addActvtyDfnTmgTmgCdTxt(String.valueOf(activitydefinitiontimingtimingcode.getText()));
		} else {
			a.addActvtyDfnTmgTmgCdTxt("NULL");
		}


		/******************** activitydefinitiontimingtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiontimingtimingcodecodinglist = activitydefinitiontimingtimingcode.getCoding();
		for(int activitydefinitiontimingtimingcodecodingi = 0; activitydefinitiontimingtimingcodecodingi<activitydefinitiontimingtimingcodecodinglist.size();activitydefinitiontimingtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiontimingtimingcodecoding = activitydefinitiontimingtimingcodecodinglist.get(activitydefinitiontimingtimingcodecodingi);

		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiontimingtimingcodecodingi == 0) {a.addActvtyDfnTmgTmgCdCdgDsply("[");}
		if(activitydefinitiontimingtimingcodecoding.hasDisplay()) {

			a.addActvtyDfnTmgTmgCdCdgDsply(String.valueOf(activitydefinitiontimingtimingcodecoding.getDisplay()));
		} else {
			a.addActvtyDfnTmgTmgCdCdgDsply("NULL");
		}

		if(activitydefinitiontimingtimingcodecodingi == activitydefinitiontimingtimingcodecodinglist.size()-1) {a.addActvtyDfnTmgTmgCdCdgDsply("]");}


		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiontimingtimingcodecodingi == 0) {a.addActvtyDfnTmgTmgCdCdgVrsn("[");}
		if(activitydefinitiontimingtimingcodecoding.hasVersion()) {

			a.addActvtyDfnTmgTmgCdCdgVrsn(String.valueOf(activitydefinitiontimingtimingcodecoding.getVersion()));
		} else {
			a.addActvtyDfnTmgTmgCdCdgVrsn("NULL");
		}

		if(activitydefinitiontimingtimingcodecodingi == activitydefinitiontimingtimingcodecodinglist.size()-1) {a.addActvtyDfnTmgTmgCdCdgVrsn("]");}


		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(activitydefinitiontimingtimingcodecodingi == 0) {a.addActvtyDfnTmgTmgCdCdgCd("[");}
		if(activitydefinitiontimingtimingcodecoding.hasCode()) {

			a.addActvtyDfnTmgTmgCdCdgCd(String.valueOf(activitydefinitiontimingtimingcodecoding.getCode()));
		} else {
			a.addActvtyDfnTmgTmgCdCdgCd("NULL");
		}

		if(activitydefinitiontimingtimingcodecodingi == activitydefinitiontimingtimingcodecodinglist.size()-1) {a.addActvtyDfnTmgTmgCdCdgCd("]");}


		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiontimingtimingcodecodingi == 0) {a.addActvtyDfnTmgTmgCdCdgUsrSltd("[");}
		if(activitydefinitiontimingtimingcodecoding.hasUserSelected()) {

			a.addActvtyDfnTmgTmgCdCdgUsrSltd(String.valueOf(activitydefinitiontimingtimingcodecoding.getUserSelected()));
		} else {
			a.addActvtyDfnTmgTmgCdCdgUsrSltd("NULL");
		}

		if(activitydefinitiontimingtimingcodecodingi == activitydefinitiontimingtimingcodecodinglist.size()-1) {a.addActvtyDfnTmgTmgCdCdgUsrSltd("]");}


		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(activitydefinitiontimingtimingcodecodingi == 0) {a.addActvtyDfnTmgTmgCdCdgSys("[");}
		if(activitydefinitiontimingtimingcodecoding.hasSystem()) {

			a.addActvtyDfnTmgTmgCdCdgSys(String.valueOf(activitydefinitiontimingtimingcodecoding.getSystem()));
		} else {
			a.addActvtyDfnTmgTmgCdCdgSys("NULL");
		}

		if(activitydefinitiontimingtimingcodecodingi == activitydefinitiontimingtimingcodecodinglist.size()-1) {a.addActvtyDfnTmgTmgCdCdgSys("]");}


		 };
		/******************** ActvtyDfn_TmgTmg_Evnt ********************************************************************************/
		if(activitydefinitiontimingtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinitiontimingtiming.getEvent().size(); incr++) {
				array = array + activitydefinitiontimingtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnTmgTmgEvnt(array);

		} else {
			a.addActvtyDfnTmgTmgEvnt("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent activitydefinitiontimingtimingrepeat = activitydefinitiontimingtiming.getRepeat();

		/******************** ActvtyDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasOffset()) {

			a.addActvtyDfnTmgTmgRptOff(String.valueOf(activitydefinitiontimingtimingrepeat.getOffset()));
		} else {
			a.addActvtyDfnTmgTmgRptOff("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasCount()) {

			a.addActvtyDfnTmgTmgRptCnt(String.valueOf(activitydefinitiontimingtimingrepeat.getCount()));
		} else {
			a.addActvtyDfnTmgTmgRptCnt("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasPeriod()) {

			a.addActvtyDfnTmgTmgRptPrd(String.valueOf(activitydefinitiontimingtimingrepeat.getPeriod()));
		} else {
			a.addActvtyDfnTmgTmgRptPrd("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasCountMax()) {

			a.addActvtyDfnTmgTmgRptCntMx(String.valueOf(activitydefinitiontimingtimingrepeat.getCountMax()));
		} else {
			a.addActvtyDfnTmgTmgRptCntMx("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasDurationMax()) {

			a.addActvtyDfnTmgTmgRptDurationMx(String.valueOf(activitydefinitiontimingtimingrepeat.getDurationMax()));
		} else {
			a.addActvtyDfnTmgTmgRptDurationMx("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiontimingtimingrepeatboundsperiod = activitydefinitiontimingtimingrepeat.getBoundsPeriod();

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsperiod.hasStart()) {

			a.addActvtyDfnTmgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitiontimingtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnTmgTmgRptBndsPrdStrt("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsperiod.hasEnd()) {

			a.addActvtyDfnTmgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitiontimingtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnTmgTmgRptBndsPrdEnd("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiontimingtimingrepeatdurationunit = activitydefinitiontimingtimingrepeat.getDurationUnit();
		if(activitydefinitiontimingtimingrepeatdurationunit!=null) {
			a.addActvtyDfnTmgTmgRptDurationUnt(activitydefinitiontimingtimingrepeatdurationunit.toCode());
		} else {
			a.addActvtyDfnTmgTmgRptDurationUnt("NULL");
		}

		/******************** activitydefinitiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiontimingtimingrepeatboundsduration = activitydefinitiontimingtimingrepeat.getBoundsDuration();

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsduration.hasValue()) {

			a.addActvtyDfnTmgTmgRptBndsDurationVl(String.valueOf(activitydefinitiontimingtimingrepeatboundsduration.getValue()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsDurationVl("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingtimingrepeatboundsdurationcomparator = activitydefinitiontimingtimingrepeatboundsduration.getComparator();
		if(activitydefinitiontimingtimingrepeatboundsdurationcomparator!=null) {
			a.addActvtyDfnTmgTmgRptBndsDurationCmprtr(activitydefinitiontimingtimingrepeatboundsdurationcomparator.toCode());
		} else {
			a.addActvtyDfnTmgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsduration.hasCode()) {

			a.addActvtyDfnTmgTmgRptBndsDurationCd(String.valueOf(activitydefinitiontimingtimingrepeatboundsduration.getCode()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsDurationCd("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsduration.hasUnit()) {

			a.addActvtyDfnTmgTmgRptBndsDurationUnt(String.valueOf(activitydefinitiontimingtimingrepeatboundsduration.getUnit()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsDurationUnt("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsduration.hasSystem()) {

			a.addActvtyDfnTmgTmgRptBndsDurationSys(String.valueOf(activitydefinitiontimingtimingrepeatboundsduration.getSystem()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsDurationSys("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiontimingtimingrepeatboundsrange = activitydefinitiontimingtimingrepeat.getBoundsRange();

		/******************** activitydefinitiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingtimingrepeatboundsrangelow = activitydefinitiontimingtimingrepeatboundsrange.getLow();

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasValue()) {

			a.addActvtyDfnTmgTmgRptBndsRngLwVl(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getValue()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngLwVl("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingtimingrepeatboundsrangelowcomparator = activitydefinitiontimingtimingrepeatboundsrangelow.getComparator();
		if(activitydefinitiontimingtimingrepeatboundsrangelowcomparator!=null) {
			a.addActvtyDfnTmgTmgRptBndsRngLwCmprtr(activitydefinitiontimingtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasCode()) {

			a.addActvtyDfnTmgTmgRptBndsRngLwCd(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getCode()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngLwCd("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasUnit()) {

			a.addActvtyDfnTmgTmgRptBndsRngLwUnt(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getUnit()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangelow.hasSystem()) {

			a.addActvtyDfnTmgTmgRptBndsRngLwSys(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangelow.getSystem()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngLwSys("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingtimingrepeatboundsrangehigh = activitydefinitiontimingtimingrepeatboundsrange.getHigh();

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasValue()) {

			a.addActvtyDfnTmgTmgRptBndsRngHiVl(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getValue()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngHiVl("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitiontimingtimingrepeatboundsrangehighcomparator = activitydefinitiontimingtimingrepeatboundsrangehigh.getComparator();
		if(activitydefinitiontimingtimingrepeatboundsrangehighcomparator!=null) {
			a.addActvtyDfnTmgTmgRptBndsRngHiCmprtr(activitydefinitiontimingtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasCode()) {

			a.addActvtyDfnTmgTmgRptBndsRngHiCd(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getCode()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngHiCd("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasUnit()) {

			a.addActvtyDfnTmgTmgRptBndsRngHiUnt(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getUnit()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(activitydefinitiontimingtimingrepeatboundsrangehigh.hasSystem()) {

			a.addActvtyDfnTmgTmgRptBndsRngHiSys(String.valueOf(activitydefinitiontimingtimingrepeatboundsrangehigh.getSystem()));
		} else {
			a.addActvtyDfnTmgTmgRptBndsRngHiSys("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasFrequencyMax()) {

			a.addActvtyDfnTmgTmgRptFrqncyMx(String.valueOf(activitydefinitiontimingtimingrepeat.getFrequencyMax()));
		} else {
			a.addActvtyDfnTmgTmgRptFrqncyMx("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> activitydefinitiontimingtimingrepeatwhenlist = activitydefinitiontimingtimingrepeat.getWhen();
		for(int activitydefinitiontimingtimingrepeatwheni = 0; activitydefinitiontimingtimingrepeatwheni<activitydefinitiontimingtimingrepeatwhenlist.size();activitydefinitiontimingtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  activitydefinitiontimingtimingrepeatwhen = activitydefinitiontimingtimingrepeatwhenlist.get(activitydefinitiontimingtimingrepeatwheni);
		if(activitydefinitiontimingtimingrepeatwhen!=null) {
			a.addActvtyDfnTmgTmgRptWhen(activitydefinitiontimingtimingrepeatwhen.getCode());
		} else {
			a.addActvtyDfnTmgTmgRptWhen("NULL");
		}
		 };

		/******************** activitydefinitiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime activitydefinitiontimingtimingrepeatperiodunit = activitydefinitiontimingtimingrepeat.getPeriodUnit();
		if(activitydefinitiontimingtimingrepeatperiodunit!=null) {
			a.addActvtyDfnTmgTmgRptPrdUnt(activitydefinitiontimingtimingrepeatperiodunit.toCode());
		} else {
			a.addActvtyDfnTmgTmgRptPrdUnt("NULL");
		}

		/******************** ActvtyDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasPeriodMax()) {

			a.addActvtyDfnTmgTmgRptPrdMx(String.valueOf(activitydefinitiontimingtimingrepeat.getPeriodMax()));
		} else {
			a.addActvtyDfnTmgTmgRptPrdMx("NULL");
		}


		/******************** activitydefinitiontimingtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> activitydefinitiontimingtimingrepeatdayofweeklist = activitydefinitiontimingtimingrepeat.getDayOfWeek();
		for(int activitydefinitiontimingtimingrepeatdayofweeki = 0; activitydefinitiontimingtimingrepeatdayofweeki<activitydefinitiontimingtimingrepeatdayofweeklist.size();activitydefinitiontimingtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  activitydefinitiontimingtimingrepeatdayofweek = activitydefinitiontimingtimingrepeatdayofweeklist.get(activitydefinitiontimingtimingrepeatdayofweeki);
		if(activitydefinitiontimingtimingrepeatdayofweek!=null) {
			a.addActvtyDfnTmgTmgRptDayOfWeek(activitydefinitiontimingtimingrepeatdayofweek.getCode());
		} else {
			a.addActvtyDfnTmgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** ActvtyDfn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<activitydefinitiontimingtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + activitydefinitiontimingtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addActvtyDfnTmgTmgRptTimeOfDay(array);

		} else {
			a.addActvtyDfnTmgTmgRptTimeOfDay("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasDuration()) {

			a.addActvtyDfnTmgTmgRptDuration(String.valueOf(activitydefinitiontimingtimingrepeat.getDuration()));
		} else {
			a.addActvtyDfnTmgTmgRptDuration("NULL");
		}


		/******************** ActvtyDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(activitydefinitiontimingtimingrepeat.hasFrequency()) {

			a.addActvtyDfnTmgTmgRptFrqncy(String.valueOf(activitydefinitiontimingtimingrepeat.getFrequency()));
		} else {
			a.addActvtyDfnTmgTmgRptFrqncy("NULL");
		}


		/******************** activitydefinitiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiontimingperiod = activitydefinition.getTimingPeriod();

		/******************** ActvtyDfn_TmgPrd_Strt ********************************************************************************/
		if(activitydefinitiontimingperiod.hasStart()) {

			a.addActvtyDfnTmgPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitiontimingperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnTmgPrdStrt("NULL");
		}


		/******************** ActvtyDfn_TmgPrd_End ********************************************************************************/
		if(activitydefinitiontimingperiod.hasEnd()) {

			a.addActvtyDfnTmgPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitiontimingperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnTmgPrdEnd("NULL");
		}


		/******************** ActvtyDfn_Subtitle ********************************************************************************/
		if(activitydefinition.hasSubtitle()) {

			a.addActvtyDfnSubtitle(String.valueOf(activitydefinition.getSubtitle()));
		} else {
			a.addActvtyDfnSubtitle("NULL");
		}


		/******************** activitydefinitiontopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> activitydefinitiontopiclist = activitydefinition.getTopic();
		for(int activitydefinitiontopici = 0; activitydefinitiontopici<activitydefinitiontopiclist.size();activitydefinitiontopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  activitydefinitiontopic = activitydefinitiontopiclist.get(activitydefinitiontopici);

		/******************** ActvtyDfn_Topic_Txt ********************************************************************************/
		if(activitydefinitiontopici == 0) {a.addActvtyDfnTopicTxt("[");}
		if(activitydefinitiontopic.hasText()) {

			a.addActvtyDfnTopicTxt(String.valueOf(activitydefinitiontopic.getText()));
		} else {
			a.addActvtyDfnTopicTxt("NULL");
		}

		if(activitydefinitiontopici == activitydefinitiontopiclist.size()-1) {a.addActvtyDfnTopicTxt("]");}


		/******************** activitydefinitiontopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitiontopiccodinglist = activitydefinitiontopic.getCoding();
		for(int activitydefinitiontopiccodingi = 0; activitydefinitiontopiccodingi<activitydefinitiontopiccodinglist.size();activitydefinitiontopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitiontopiccoding = activitydefinitiontopiccodinglist.get(activitydefinitiontopiccodingi);

		/******************** ActvtyDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(activitydefinitiontopiccodingi == 0) {a.addActvtyDfnTopicCdgDsply("[[");}
		if(activitydefinitiontopiccoding.hasDisplay()) {

			a.addActvtyDfnTopicCdgDsply(String.valueOf(activitydefinitiontopiccoding.getDisplay()));
		} else {
			a.addActvtyDfnTopicCdgDsply("NULL");
		}

		if(activitydefinitiontopiccodingi == activitydefinitiontopiccodinglist.size()-1) {a.addActvtyDfnTopicCdgDsply("]]");}


		/******************** ActvtyDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitiontopiccodingi == 0) {a.addActvtyDfnTopicCdgVrsn("[[");}
		if(activitydefinitiontopiccoding.hasVersion()) {

			a.addActvtyDfnTopicCdgVrsn(String.valueOf(activitydefinitiontopiccoding.getVersion()));
		} else {
			a.addActvtyDfnTopicCdgVrsn("NULL");
		}

		if(activitydefinitiontopiccodingi == activitydefinitiontopiccodinglist.size()-1) {a.addActvtyDfnTopicCdgVrsn("]]");}


		/******************** ActvtyDfn_Topic_Cdg_Cd ********************************************************************************/
		if(activitydefinitiontopiccodingi == 0) {a.addActvtyDfnTopicCdgCd("[[");}
		if(activitydefinitiontopiccoding.hasCode()) {

			a.addActvtyDfnTopicCdgCd(String.valueOf(activitydefinitiontopiccoding.getCode()));
		} else {
			a.addActvtyDfnTopicCdgCd("NULL");
		}

		if(activitydefinitiontopiccodingi == activitydefinitiontopiccodinglist.size()-1) {a.addActvtyDfnTopicCdgCd("]]");}


		/******************** ActvtyDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitiontopiccodingi == 0) {a.addActvtyDfnTopicCdgUsrSltd("[[");}
		if(activitydefinitiontopiccoding.hasUserSelected()) {

			a.addActvtyDfnTopicCdgUsrSltd(String.valueOf(activitydefinitiontopiccoding.getUserSelected()));
		} else {
			a.addActvtyDfnTopicCdgUsrSltd("NULL");
		}

		if(activitydefinitiontopiccodingi == activitydefinitiontopiccodinglist.size()-1) {a.addActvtyDfnTopicCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Topic_Cdg_Sys ********************************************************************************/
		if(activitydefinitiontopiccodingi == 0) {a.addActvtyDfnTopicCdgSys("[[");}
		if(activitydefinitiontopiccoding.hasSystem()) {

			a.addActvtyDfnTopicCdgSys(String.valueOf(activitydefinitiontopiccoding.getSystem()));
		} else {
			a.addActvtyDfnTopicCdgSys("NULL");
		}

		if(activitydefinitiontopiccodingi == activitydefinitiontopiccodinglist.size()-1) {a.addActvtyDfnTopicCdgSys("]]");}


		 };
		 };
		/******************** activitydefinitionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionquantity = activitydefinition.getQuantity();

		/******************** ActvtyDfn_Qnty_Vl ********************************************************************************/
		if(activitydefinitionquantity.hasValue()) {

			a.addActvtyDfnQntyVl(String.valueOf(activitydefinitionquantity.getValue()));
		} else {
			a.addActvtyDfnQntyVl("NULL");
		}


		/******************** activitydefinitionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionquantitycomparator = activitydefinitionquantity.getComparator();
		if(activitydefinitionquantitycomparator!=null) {
			a.addActvtyDfnQntyCmprtr(activitydefinitionquantitycomparator.toCode());
		} else {
			a.addActvtyDfnQntyCmprtr("NULL");
		}

		/******************** ActvtyDfn_Qnty_Cd ********************************************************************************/
		if(activitydefinitionquantity.hasCode()) {

			a.addActvtyDfnQntyCd(String.valueOf(activitydefinitionquantity.getCode()));
		} else {
			a.addActvtyDfnQntyCd("NULL");
		}


		/******************** ActvtyDfn_Qnty_Unt ********************************************************************************/
		if(activitydefinitionquantity.hasUnit()) {

			a.addActvtyDfnQntyUnt(String.valueOf(activitydefinitionquantity.getUnit()));
		} else {
			a.addActvtyDfnQntyUnt("NULL");
		}


		/******************** ActvtyDfn_Qnty_Sys ********************************************************************************/
		if(activitydefinitionquantity.hasSystem()) {

			a.addActvtyDfnQntySys(String.valueOf(activitydefinitionquantity.getSystem()));
		} else {
			a.addActvtyDfnQntySys("NULL");
		}


		/******************** activitydefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> activitydefinitionjurisdictionlist = activitydefinition.getJurisdiction();
		for(int activitydefinitionjurisdictioni = 0; activitydefinitionjurisdictioni<activitydefinitionjurisdictionlist.size();activitydefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  activitydefinitionjurisdiction = activitydefinitionjurisdictionlist.get(activitydefinitionjurisdictioni);

		/******************** ActvtyDfn_Jrsdctn_Txt ********************************************************************************/
		if(activitydefinitionjurisdictioni == 0) {a.addActvtyDfnJrsdctnTxt("[");}
		if(activitydefinitionjurisdiction.hasText()) {

			a.addActvtyDfnJrsdctnTxt(String.valueOf(activitydefinitionjurisdiction.getText()));
		} else {
			a.addActvtyDfnJrsdctnTxt("NULL");
		}

		if(activitydefinitionjurisdictioni == activitydefinitionjurisdictionlist.size()-1) {a.addActvtyDfnJrsdctnTxt("]");}


		/******************** activitydefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitionjurisdictioncodinglist = activitydefinitionjurisdiction.getCoding();
		for(int activitydefinitionjurisdictioncodingi = 0; activitydefinitionjurisdictioncodingi<activitydefinitionjurisdictioncodinglist.size();activitydefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitionjurisdictioncoding = activitydefinitionjurisdictioncodinglist.get(activitydefinitionjurisdictioncodingi);

		/******************** ActvtyDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionjurisdictioncodingi == 0) {a.addActvtyDfnJrsdctnCdgDsply("[[");}
		if(activitydefinitionjurisdictioncoding.hasDisplay()) {

			a.addActvtyDfnJrsdctnCdgDsply(String.valueOf(activitydefinitionjurisdictioncoding.getDisplay()));
		} else {
			a.addActvtyDfnJrsdctnCdgDsply("NULL");
		}

		if(activitydefinitionjurisdictioncodingi == activitydefinitionjurisdictioncodinglist.size()-1) {a.addActvtyDfnJrsdctnCdgDsply("]]");}


		/******************** ActvtyDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionjurisdictioncodingi == 0) {a.addActvtyDfnJrsdctnCdgVrsn("[[");}
		if(activitydefinitionjurisdictioncoding.hasVersion()) {

			a.addActvtyDfnJrsdctnCdgVrsn(String.valueOf(activitydefinitionjurisdictioncoding.getVersion()));
		} else {
			a.addActvtyDfnJrsdctnCdgVrsn("NULL");
		}

		if(activitydefinitionjurisdictioncodingi == activitydefinitionjurisdictioncodinglist.size()-1) {a.addActvtyDfnJrsdctnCdgVrsn("]]");}


		/******************** ActvtyDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(activitydefinitionjurisdictioncodingi == 0) {a.addActvtyDfnJrsdctnCdgCd("[[");}
		if(activitydefinitionjurisdictioncoding.hasCode()) {

			a.addActvtyDfnJrsdctnCdgCd(String.valueOf(activitydefinitionjurisdictioncoding.getCode()));
		} else {
			a.addActvtyDfnJrsdctnCdgCd("NULL");
		}

		if(activitydefinitionjurisdictioncodingi == activitydefinitionjurisdictioncodinglist.size()-1) {a.addActvtyDfnJrsdctnCdgCd("]]");}


		/******************** ActvtyDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionjurisdictioncodingi == 0) {a.addActvtyDfnJrsdctnCdgUsrSltd("[[");}
		if(activitydefinitionjurisdictioncoding.hasUserSelected()) {

			a.addActvtyDfnJrsdctnCdgUsrSltd(String.valueOf(activitydefinitionjurisdictioncoding.getUserSelected()));
		} else {
			a.addActvtyDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(activitydefinitionjurisdictioncodingi == activitydefinitionjurisdictioncodinglist.size()-1) {a.addActvtyDfnJrsdctnCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(activitydefinitionjurisdictioncodingi == 0) {a.addActvtyDfnJrsdctnCdgSys("[[");}
		if(activitydefinitionjurisdictioncoding.hasSystem()) {

			a.addActvtyDfnJrsdctnCdgSys(String.valueOf(activitydefinitionjurisdictioncoding.getSystem()));
		} else {
			a.addActvtyDfnJrsdctnCdgSys("NULL");
		}

		if(activitydefinitionjurisdictioncodingi == activitydefinitionjurisdictioncodinglist.size()-1) {a.addActvtyDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** activitydefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> activitydefinitionusecontextlist = activitydefinition.getUseContext();
		for(int activitydefinitionusecontexti = 0; activitydefinitionusecontexti<activitydefinitionusecontextlist.size();activitydefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  activitydefinitionusecontext = activitydefinitionusecontextlist.get(activitydefinitionusecontexti);

		/******************** activitydefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionusecontextcode = activitydefinitionusecontext.getCode();

		/******************** ActvtyDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtCdDsply("[");}
		if(activitydefinitionusecontextcode.hasDisplay()) {

			a.addActvtyDfnUseCntxtCdDsply(String.valueOf(activitydefinitionusecontextcode.getDisplay()));
		} else {
			a.addActvtyDfnUseCntxtCdDsply("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtCdDsply("]");}


		/******************** ActvtyDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtCdVrsn("[");}
		if(activitydefinitionusecontextcode.hasVersion()) {

			a.addActvtyDfnUseCntxtCdVrsn(String.valueOf(activitydefinitionusecontextcode.getVersion()));
		} else {
			a.addActvtyDfnUseCntxtCdVrsn("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtCdVrsn("]");}


		/******************** ActvtyDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtCdUsrSltd("[");}
		if(activitydefinitionusecontextcode.hasUserSelected()) {

			a.addActvtyDfnUseCntxtCdUsrSltd(String.valueOf(activitydefinitionusecontextcode.getUserSelected()));
		} else {
			a.addActvtyDfnUseCntxtCdUsrSltd("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtCdUsrSltd("]");}


		/******************** ActvtyDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtCdSys("[");}
		if(activitydefinitionusecontextcode.hasSystem()) {

			a.addActvtyDfnUseCntxtCdSys(String.valueOf(activitydefinitionusecontextcode.getSystem()));
		} else {
			a.addActvtyDfnUseCntxtCdSys("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtCdSys("]");}


		/******************** ActvtyDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRfrnc("[");}
		if(activitydefinitionusecontext.hasValueReference()) {

			if(activitydefinitionusecontext.getValueReference().getReference() != null) {
			a.addActvtyDfnUseCntxtVlRfrnc(activitydefinitionusecontext.getValueReference().getReference());
			}
		} else {
			a.addActvtyDfnUseCntxtVlRfrnc("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRfrnc("]");}


		/******************** activitydefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionusecontextvaluecodeableconcept = activitydefinitionusecontext.getValueCodeableConcept();

		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlCdbleCncptTxt("[");}
		if(activitydefinitionusecontextvaluecodeableconcept.hasText()) {

			a.addActvtyDfnUseCntxtVlCdbleCncptTxt(String.valueOf(activitydefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			a.addActvtyDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** activitydefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitionusecontextvaluecodeableconceptcodinglist = activitydefinitionusecontextvaluecodeableconcept.getCoding();
		for(int activitydefinitionusecontextvaluecodeableconceptcodingi = 0; activitydefinitionusecontextvaluecodeableconceptcodingi<activitydefinitionusecontextvaluecodeableconceptcodinglist.size();activitydefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitionusecontextvaluecodeableconceptcoding = activitydefinitionusecontextvaluecodeableconceptcodinglist.get(activitydefinitionusecontextvaluecodeableconceptcodingi);

		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcodingi == 0) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			a.addActvtyDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			a.addActvtyDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(activitydefinitionusecontextvaluecodeableconceptcodingi == activitydefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcodingi == 0) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			a.addActvtyDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			a.addActvtyDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(activitydefinitionusecontextvaluecodeableconceptcodingi == activitydefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcodingi == 0) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			a.addActvtyDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			a.addActvtyDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(activitydefinitionusecontextvaluecodeableconceptcodingi == activitydefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcodingi == 0) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			a.addActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			a.addActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(activitydefinitionusecontextvaluecodeableconceptcodingi == activitydefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(activitydefinitionusecontextvaluecodeableconceptcodingi == 0) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(activitydefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			a.addActvtyDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(activitydefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			a.addActvtyDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(activitydefinitionusecontextvaluecodeableconceptcodingi == activitydefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {a.addActvtyDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** activitydefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitionusecontextvaluerange = activitydefinitionusecontext.getValueRange();

		/******************** activitydefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluerangelow = activitydefinitionusecontextvaluerange.getLow();

		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngLwVl("[");}
		if(activitydefinitionusecontextvaluerangelow.hasValue()) {

			a.addActvtyDfnUseCntxtVlRngLwVl(String.valueOf(activitydefinitionusecontextvaluerangelow.getValue()));
		} else {
			a.addActvtyDfnUseCntxtVlRngLwVl("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngLwVl("]");}


		/******************** activitydefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionusecontextvaluerangelowcomparator = activitydefinitionusecontextvaluerangelow.getComparator();
		if(activitydefinitionusecontextvaluerangelowcomparator!=null) {
		if(activitydefinitionusecontexti == 0) {

		a.addActvtyDfnUseCntxtVlRngLwCmprtr("[");		}
			a.addActvtyDfnUseCntxtVlRngLwCmprtr(activitydefinitionusecontextvaluerangelowcomparator.toCode());
		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {

		a.addActvtyDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			a.addActvtyDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngLwCd("[");}
		if(activitydefinitionusecontextvaluerangelow.hasCode()) {

			a.addActvtyDfnUseCntxtVlRngLwCd(String.valueOf(activitydefinitionusecontextvaluerangelow.getCode()));
		} else {
			a.addActvtyDfnUseCntxtVlRngLwCd("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngLwCd("]");}


		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngLwUnt("[");}
		if(activitydefinitionusecontextvaluerangelow.hasUnit()) {

			a.addActvtyDfnUseCntxtVlRngLwUnt(String.valueOf(activitydefinitionusecontextvaluerangelow.getUnit()));
		} else {
			a.addActvtyDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngLwUnt("]");}


		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngLwSys("[");}
		if(activitydefinitionusecontextvaluerangelow.hasSystem()) {

			a.addActvtyDfnUseCntxtVlRngLwSys(String.valueOf(activitydefinitionusecontextvaluerangelow.getSystem()));
		} else {
			a.addActvtyDfnUseCntxtVlRngLwSys("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngLwSys("]");}


		/******************** activitydefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluerangehigh = activitydefinitionusecontextvaluerange.getHigh();

		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngHiVl("[");}
		if(activitydefinitionusecontextvaluerangehigh.hasValue()) {

			a.addActvtyDfnUseCntxtVlRngHiVl(String.valueOf(activitydefinitionusecontextvaluerangehigh.getValue()));
		} else {
			a.addActvtyDfnUseCntxtVlRngHiVl("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngHiVl("]");}


		/******************** activitydefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionusecontextvaluerangehighcomparator = activitydefinitionusecontextvaluerangehigh.getComparator();
		if(activitydefinitionusecontextvaluerangehighcomparator!=null) {
		if(activitydefinitionusecontexti == 0) {

		a.addActvtyDfnUseCntxtVlRngHiCmprtr("[");		}
			a.addActvtyDfnUseCntxtVlRngHiCmprtr(activitydefinitionusecontextvaluerangehighcomparator.toCode());
		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {

		a.addActvtyDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			a.addActvtyDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngHiCd("[");}
		if(activitydefinitionusecontextvaluerangehigh.hasCode()) {

			a.addActvtyDfnUseCntxtVlRngHiCd(String.valueOf(activitydefinitionusecontextvaluerangehigh.getCode()));
		} else {
			a.addActvtyDfnUseCntxtVlRngHiCd("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngHiCd("]");}


		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngHiUnt("[");}
		if(activitydefinitionusecontextvaluerangehigh.hasUnit()) {

			a.addActvtyDfnUseCntxtVlRngHiUnt(String.valueOf(activitydefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			a.addActvtyDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngHiUnt("]");}


		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlRngHiSys("[");}
		if(activitydefinitionusecontextvaluerangehigh.hasSystem()) {

			a.addActvtyDfnUseCntxtVlRngHiSys(String.valueOf(activitydefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			a.addActvtyDfnUseCntxtVlRngHiSys("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlRngHiSys("]");}


		/******************** activitydefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluequantity = activitydefinitionusecontext.getValueQuantity();

		/******************** ActvtyDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlQntyVl("[");}
		if(activitydefinitionusecontextvaluequantity.hasValue()) {

			a.addActvtyDfnUseCntxtVlQntyVl(String.valueOf(activitydefinitionusecontextvaluequantity.getValue()));
		} else {
			a.addActvtyDfnUseCntxtVlQntyVl("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlQntyVl("]");}


		/******************** activitydefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator activitydefinitionusecontextvaluequantitycomparator = activitydefinitionusecontextvaluequantity.getComparator();
		if(activitydefinitionusecontextvaluequantitycomparator!=null) {
		if(activitydefinitionusecontexti == 0) {

		a.addActvtyDfnUseCntxtVlQntyCmprtr("[");		}
			a.addActvtyDfnUseCntxtVlQntyCmprtr(activitydefinitionusecontextvaluequantitycomparator.toCode());
		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {

		a.addActvtyDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			a.addActvtyDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** ActvtyDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlQntyCd("[");}
		if(activitydefinitionusecontextvaluequantity.hasCode()) {

			a.addActvtyDfnUseCntxtVlQntyCd(String.valueOf(activitydefinitionusecontextvaluequantity.getCode()));
		} else {
			a.addActvtyDfnUseCntxtVlQntyCd("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlQntyCd("]");}


		/******************** ActvtyDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlQntyUnt("[");}
		if(activitydefinitionusecontextvaluequantity.hasUnit()) {

			a.addActvtyDfnUseCntxtVlQntyUnt(String.valueOf(activitydefinitionusecontextvaluequantity.getUnit()));
		} else {
			a.addActvtyDfnUseCntxtVlQntyUnt("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlQntyUnt("]");}


		/******************** ActvtyDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(activitydefinitionusecontexti == 0) {a.addActvtyDfnUseCntxtVlQntySys("[");}
		if(activitydefinitionusecontextvaluequantity.hasSystem()) {

			a.addActvtyDfnUseCntxtVlQntySys(String.valueOf(activitydefinitionusecontextvaluequantity.getSystem()));
		} else {
			a.addActvtyDfnUseCntxtVlQntySys("NULL");
		}

		if(activitydefinitionusecontexti == activitydefinitionusecontextlist.size()-1) {a.addActvtyDfnUseCntxtVlQntySys("]");}


		 };
		/******************** ActvtyDfn_Exprmtl ********************************************************************************/
		if(activitydefinition.hasExperimental()) {

			a.addActvtyDfnExprmtl(String.valueOf(activitydefinition.getExperimental()));
		} else {
			a.addActvtyDfnExprmtl("NULL");
		}


		/******************** ActvtyDfn_Pblshr ********************************************************************************/
		if(activitydefinition.hasPublisher()) {

			a.addActvtyDfnPblshr(String.valueOf(activitydefinition.getPublisher()));
		} else {
			a.addActvtyDfnPblshr("NULL");
		}


		/******************** activitydefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioneffectiveperiod = activitydefinition.getEffectivePeriod();

		/******************** ActvtyDfn_EfctivePrd_Strt ********************************************************************************/
		if(activitydefinitioneffectiveperiod.hasStart()) {

			a.addActvtyDfnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitioneffectiveperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnEfctivePrdStrt("NULL");
		}


		/******************** ActvtyDfn_EfctivePrd_End ********************************************************************************/
		if(activitydefinitioneffectiveperiod.hasEnd()) {

			a.addActvtyDfnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitioneffectiveperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnEfctivePrdEnd("NULL");
		}


		/******************** activitydefinitiondynamicvalue ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent> activitydefinitiondynamicvaluelist = activitydefinition.getDynamicValue();
		for(int activitydefinitiondynamicvaluei = 0; activitydefinitiondynamicvaluei<activitydefinitiondynamicvaluelist.size();activitydefinitiondynamicvaluei++ ) {
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent  activitydefinitiondynamicvalue = activitydefinitiondynamicvaluelist.get(activitydefinitiondynamicvaluei);

		/******************** ActvtyDfn_DynamicVl_Path ********************************************************************************/
		if(activitydefinitiondynamicvaluei == 0) {a.addActvtyDfnDynamicVlPath("[");}
		if(activitydefinitiondynamicvalue.hasPath()) {

			a.addActvtyDfnDynamicVlPath(String.valueOf(activitydefinitiondynamicvalue.getPath()));
		} else {
			a.addActvtyDfnDynamicVlPath("NULL");
		}

		if(activitydefinitiondynamicvaluei == activitydefinitiondynamicvaluelist.size()-1) {a.addActvtyDfnDynamicVlPath("]");}


		/******************** activitydefinitiondynamicvalueexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression activitydefinitiondynamicvalueexpression = activitydefinitiondynamicvalue.getExpression();

		/******************** ActvtyDfn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(activitydefinitiondynamicvaluei == 0) {a.addActvtyDfnDynamicVlExprsnNm("[");}
		if(activitydefinitiondynamicvalueexpression.hasName()) {

			a.addActvtyDfnDynamicVlExprsnNm(String.valueOf(activitydefinitiondynamicvalueexpression.getName()));
		} else {
			a.addActvtyDfnDynamicVlExprsnNm("NULL");
		}

		if(activitydefinitiondynamicvaluei == activitydefinitiondynamicvaluelist.size()-1) {a.addActvtyDfnDynamicVlExprsnNm("]");}


		/******************** ActvtyDfn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(activitydefinitiondynamicvaluei == 0) {a.addActvtyDfnDynamicVlExprsnRfrnc("[");}
		if(activitydefinitiondynamicvalueexpression.hasReference()) {

			a.addActvtyDfnDynamicVlExprsnRfrnc(String.valueOf(activitydefinitiondynamicvalueexpression.getReference()));
		} else {
			a.addActvtyDfnDynamicVlExprsnRfrnc("NULL");
		}

		if(activitydefinitiondynamicvaluei == activitydefinitiondynamicvaluelist.size()-1) {a.addActvtyDfnDynamicVlExprsnRfrnc("]");}


		/******************** ActvtyDfn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(activitydefinitiondynamicvaluei == 0) {a.addActvtyDfnDynamicVlExprsnLnguage("[");}
		if(activitydefinitiondynamicvalueexpression.hasLanguage()) {

			a.addActvtyDfnDynamicVlExprsnLnguage(String.valueOf(activitydefinitiondynamicvalueexpression.getLanguage()));
		} else {
			a.addActvtyDfnDynamicVlExprsnLnguage("NULL");
		}

		if(activitydefinitiondynamicvaluei == activitydefinitiondynamicvaluelist.size()-1) {a.addActvtyDfnDynamicVlExprsnLnguage("]");}


		/******************** ActvtyDfn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(activitydefinitiondynamicvaluei == 0) {a.addActvtyDfnDynamicVlExprsnDscrptn("[");}
		if(activitydefinitiondynamicvalueexpression.hasDescription()) {

			a.addActvtyDfnDynamicVlExprsnDscrptn(String.valueOf(activitydefinitiondynamicvalueexpression.getDescription()));
		} else {
			a.addActvtyDfnDynamicVlExprsnDscrptn("NULL");
		}

		if(activitydefinitiondynamicvaluei == activitydefinitiondynamicvaluelist.size()-1) {a.addActvtyDfnDynamicVlExprsnDscrptn("]");}


		 };
		/******************** activitydefinitionauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> activitydefinitionauthorlist = activitydefinition.getAuthor();
		for(int activitydefinitionauthori = 0; activitydefinitionauthori<activitydefinitionauthorlist.size();activitydefinitionauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  activitydefinitionauthor = activitydefinitionauthorlist.get(activitydefinitionauthori);

		/******************** ActvtyDfn_Athr_Nm ********************************************************************************/
		if(activitydefinitionauthori == 0) {a.addActvtyDfnAthrNm("[");}
		if(activitydefinitionauthor.hasName()) {

			a.addActvtyDfnAthrNm(String.valueOf(activitydefinitionauthor.getName()));
		} else {
			a.addActvtyDfnAthrNm("NULL");
		}

		if(activitydefinitionauthori == activitydefinitionauthorlist.size()-1) {a.addActvtyDfnAthrNm("]");}


		/******************** activitydefinitionauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> activitydefinitionauthortelecomlist = activitydefinitionauthor.getTelecom();
		for(int activitydefinitionauthortelecomi = 0; activitydefinitionauthortelecomi<activitydefinitionauthortelecomlist.size();activitydefinitionauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  activitydefinitionauthortelecom = activitydefinitionauthortelecomlist.get(activitydefinitionauthortelecomi);

		/******************** ActvtyDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(activitydefinitionauthortelecomi == 0) {a.addActvtyDfnAthrTlcmVl("[[");}
		if(activitydefinitionauthortelecom.hasValue()) {

			a.addActvtyDfnAthrTlcmVl(String.valueOf(activitydefinitionauthortelecom.getValue()));
		} else {
			a.addActvtyDfnAthrTlcmVl("NULL");
		}

		if(activitydefinitionauthortelecomi == activitydefinitionauthortelecomlist.size()-1) {a.addActvtyDfnAthrTlcmVl("]]");}


		/******************** activitydefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionauthortelecomperiod = activitydefinitionauthortelecom.getPeriod();

		/******************** ActvtyDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(activitydefinitionauthortelecomi == 0) {a.addActvtyDfnAthrTlcmPrdStrt("[[");}
		if(activitydefinitionauthortelecomperiod.hasStart()) {

			a.addActvtyDfnAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionauthortelecomperiod.getStart())+"\"");
		} else {
			a.addActvtyDfnAthrTlcmPrdStrt("NULL");
		}

		if(activitydefinitionauthortelecomi == activitydefinitionauthortelecomlist.size()-1) {a.addActvtyDfnAthrTlcmPrdStrt("]]");}


		/******************** ActvtyDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(activitydefinitionauthortelecomi == 0) {a.addActvtyDfnAthrTlcmPrdEnd("[[");}
		if(activitydefinitionauthortelecomperiod.hasEnd()) {

			a.addActvtyDfnAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(activitydefinitionauthortelecomperiod.getEnd())+"\"");
		} else {
			a.addActvtyDfnAthrTlcmPrdEnd("NULL");
		}

		if(activitydefinitionauthortelecomi == activitydefinitionauthortelecomlist.size()-1) {a.addActvtyDfnAthrTlcmPrdEnd("]]");}


		/******************** activitydefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse activitydefinitionauthortelecomuse = activitydefinitionauthortelecom.getUse();
		if(activitydefinitionauthortelecomuse!=null) {
		if(activitydefinitionauthortelecomi == 0) {

		a.addActvtyDfnAthrTlcmUse("[[");		}
			a.addActvtyDfnAthrTlcmUse(activitydefinitionauthortelecomuse.toCode());
		if(activitydefinitionauthortelecomi == activitydefinitionauthortelecomlist.size()-1) {

		a.addActvtyDfnAthrTlcmUse("]]");		}

		} else {
			a.addActvtyDfnAthrTlcmUse("NULL");
		}

		/******************** activitydefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem activitydefinitionauthortelecomsystem = activitydefinitionauthortelecom.getSystem();
		if(activitydefinitionauthortelecomsystem!=null) {
		if(activitydefinitionauthortelecomi == 0) {

		a.addActvtyDfnAthrTlcmSys("[[");		}
			a.addActvtyDfnAthrTlcmSys(activitydefinitionauthortelecomsystem.toCode());
		if(activitydefinitionauthortelecomi == activitydefinitionauthortelecomlist.size()-1) {

		a.addActvtyDfnAthrTlcmSys("]]");		}

		} else {
			a.addActvtyDfnAthrTlcmSys("NULL");
		}

		/******************** ActvtyDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(activitydefinitionauthortelecomi == 0) {a.addActvtyDfnAthrTlcmRnk("[[");}
		if(activitydefinitionauthortelecom.hasRank()) {

			a.addActvtyDfnAthrTlcmRnk(String.valueOf(activitydefinitionauthortelecom.getRank()));
		} else {
			a.addActvtyDfnAthrTlcmRnk("NULL");
		}

		if(activitydefinitionauthortelecomi == activitydefinitionauthortelecomlist.size()-1) {a.addActvtyDfnAthrTlcmRnk("]]");}


		 };
		 };
		/******************** activitydefinitionintent ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.RequestIntent activitydefinitionintent = activitydefinition.getIntent();
		if(activitydefinitionintent!=null) {
			a.addActvtyDfnIntent(activitydefinitionintent.toCode());
		} else {
			a.addActvtyDfnIntent("NULL");
		}

		/******************** activitydefinitionparticipant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent> activitydefinitionparticipantlist = activitydefinition.getParticipant();
		for(int activitydefinitionparticipanti = 0; activitydefinitionparticipanti<activitydefinitionparticipantlist.size();activitydefinitionparticipanti++ ) {
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent  activitydefinitionparticipant = activitydefinitionparticipantlist.get(activitydefinitionparticipanti);

		/******************** activitydefinitionparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType activitydefinitionparticipanttype = activitydefinitionparticipant.getType();
		if(activitydefinitionparticipanttype!=null) {
		if(activitydefinitionparticipanti == 0) {

		a.addActvtyDfnPrtcpntTyp("[");		}
			a.addActvtyDfnPrtcpntTyp(activitydefinitionparticipanttype.toCode());
		if(activitydefinitionparticipanti == activitydefinitionparticipantlist.size()-1) {

		a.addActvtyDfnPrtcpntTyp("]");		}

		} else {
			a.addActvtyDfnPrtcpntTyp("NULL");
		}

		/******************** activitydefinitionparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionparticipantrole = activitydefinitionparticipant.getRole();

		/******************** ActvtyDfn_Prtcpnt_Role_Txt ********************************************************************************/
		if(activitydefinitionparticipanti == 0) {a.addActvtyDfnPrtcpntRoleTxt("[");}
		if(activitydefinitionparticipantrole.hasText()) {

			a.addActvtyDfnPrtcpntRoleTxt(String.valueOf(activitydefinitionparticipantrole.getText()));
		} else {
			a.addActvtyDfnPrtcpntRoleTxt("NULL");
		}

		if(activitydefinitionparticipanti == activitydefinitionparticipantlist.size()-1) {a.addActvtyDfnPrtcpntRoleTxt("]");}


		/******************** activitydefinitionparticipantrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> activitydefinitionparticipantrolecodinglist = activitydefinitionparticipantrole.getCoding();
		for(int activitydefinitionparticipantrolecodingi = 0; activitydefinitionparticipantrolecodingi<activitydefinitionparticipantrolecodinglist.size();activitydefinitionparticipantrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  activitydefinitionparticipantrolecoding = activitydefinitionparticipantrolecodinglist.get(activitydefinitionparticipantrolecodingi);

		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(activitydefinitionparticipantrolecodingi == 0) {a.addActvtyDfnPrtcpntRoleCdgDsply("[[");}
		if(activitydefinitionparticipantrolecoding.hasDisplay()) {

			a.addActvtyDfnPrtcpntRoleCdgDsply(String.valueOf(activitydefinitionparticipantrolecoding.getDisplay()));
		} else {
			a.addActvtyDfnPrtcpntRoleCdgDsply("NULL");
		}

		if(activitydefinitionparticipantrolecodingi == activitydefinitionparticipantrolecodinglist.size()-1) {a.addActvtyDfnPrtcpntRoleCdgDsply("]]");}


		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(activitydefinitionparticipantrolecodingi == 0) {a.addActvtyDfnPrtcpntRoleCdgVrsn("[[");}
		if(activitydefinitionparticipantrolecoding.hasVersion()) {

			a.addActvtyDfnPrtcpntRoleCdgVrsn(String.valueOf(activitydefinitionparticipantrolecoding.getVersion()));
		} else {
			a.addActvtyDfnPrtcpntRoleCdgVrsn("NULL");
		}

		if(activitydefinitionparticipantrolecodingi == activitydefinitionparticipantrolecodinglist.size()-1) {a.addActvtyDfnPrtcpntRoleCdgVrsn("]]");}


		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(activitydefinitionparticipantrolecodingi == 0) {a.addActvtyDfnPrtcpntRoleCdgCd("[[");}
		if(activitydefinitionparticipantrolecoding.hasCode()) {

			a.addActvtyDfnPrtcpntRoleCdgCd(String.valueOf(activitydefinitionparticipantrolecoding.getCode()));
		} else {
			a.addActvtyDfnPrtcpntRoleCdgCd("NULL");
		}

		if(activitydefinitionparticipantrolecodingi == activitydefinitionparticipantrolecodinglist.size()-1) {a.addActvtyDfnPrtcpntRoleCdgCd("]]");}


		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(activitydefinitionparticipantrolecodingi == 0) {a.addActvtyDfnPrtcpntRoleCdgUsrSltd("[[");}
		if(activitydefinitionparticipantrolecoding.hasUserSelected()) {

			a.addActvtyDfnPrtcpntRoleCdgUsrSltd(String.valueOf(activitydefinitionparticipantrolecoding.getUserSelected()));
		} else {
			a.addActvtyDfnPrtcpntRoleCdgUsrSltd("NULL");
		}

		if(activitydefinitionparticipantrolecodingi == activitydefinitionparticipantrolecodinglist.size()-1) {a.addActvtyDfnPrtcpntRoleCdgUsrSltd("]]");}


		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(activitydefinitionparticipantrolecodingi == 0) {a.addActvtyDfnPrtcpntRoleCdgSys("[[");}
		if(activitydefinitionparticipantrolecoding.hasSystem()) {

			a.addActvtyDfnPrtcpntRoleCdgSys(String.valueOf(activitydefinitionparticipantrolecoding.getSystem()));
		} else {
			a.addActvtyDfnPrtcpntRoleCdgSys("NULL");
		}

		if(activitydefinitionparticipantrolecodingi == activitydefinitionparticipantrolecodinglist.size()-1) {a.addActvtyDfnPrtcpntRoleCdgSys("]]");}


		 };
		 };
		/******************** ActvtyDfn_DoNotPerform ********************************************************************************/
		if(activitydefinition.hasDoNotPerform()) {

			a.addActvtyDfnDoNotPerform(String.valueOf(activitydefinition.getDoNotPerform()));
		} else {
			a.addActvtyDfnDoNotPerform("NULL");
		}


		return a;
	}
}
