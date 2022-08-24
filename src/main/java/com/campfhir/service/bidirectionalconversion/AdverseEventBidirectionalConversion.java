package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AdverseEvent;
public class AdverseEventBidirectionalConversion 
{
	public AdverseEvent AdverseEvents(org.hl7.fhir.r4.model.AdverseEvent adverseevent) throws ParseException
	{
		 main.java.com.campfhir.model.AdverseEvent a = new  main.java.com.campfhir.model.AdverseEvent();

		/******************** id ********************************************************************************/
		a.setId(adverseevent.getIdElement().getIdPart());

		/******************** AdvsEvnt_Lctn ********************************************************************************/
		if(adverseevent.hasLocation()) {

			if(adverseevent.getLocation().getReference() != null) {
			a.addAdvsEvntLctn(adverseevent.getLocation().getReference());
			}
		} else {
			a.addAdvsEvntLctn("NULL");
		}


		/******************** AdvsEvnt_Dt ********************************************************************************/
		if(adverseevent.hasDate()) {

			a.addAdvsEvntDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(adverseevent.getDate())+"\"");
		} else {
			a.addAdvsEvntDt("NULL");
		}


		/******************** AdvsEvnt_Sbjct ********************************************************************************/
		if(adverseevent.hasSubject()) {

			if(adverseevent.getSubject().getReference() != null) {
			a.addAdvsEvntSbjct(adverseevent.getSubject().getReference());
			}
		} else {
			a.addAdvsEvntSbjct("NULL");
		}


		/******************** AdvsEvnt_Enc ********************************************************************************/
		if(adverseevent.hasEncounter()) {

			if(adverseevent.getEncounter().getReference() != null) {
			a.addAdvsEvntEnc(adverseevent.getEncounter().getReference());
			}
		} else {
			a.addAdvsEvntEnc("NULL");
		}


		/******************** adverseeventidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier adverseeventidentifier = adverseevent.getIdentifier();

		/******************** AdvsEvnt_Id_Vl ********************************************************************************/
		if(adverseeventidentifier.hasValue()) {

			a.addAdvsEvntIdVl(String.valueOf(adverseeventidentifier.getValue()));
		} else {
			a.addAdvsEvntIdVl("NULL");
		}


		/******************** adverseeventidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventidentifiertype = adverseeventidentifier.getType();

		/******************** AdvsEvnt_Id_Typ_Txt ********************************************************************************/
		if(adverseeventidentifiertype.hasText()) {

			a.addAdvsEvntIdTypTxt(String.valueOf(adverseeventidentifiertype.getText()));
		} else {
			a.addAdvsEvntIdTypTxt("NULL");
		}


		/******************** adverseeventidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventidentifiertypecodinglist = adverseeventidentifiertype.getCoding();
		for(int adverseeventidentifiertypecodingi = 0; adverseeventidentifiertypecodingi<adverseeventidentifiertypecodinglist.size();adverseeventidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventidentifiertypecoding = adverseeventidentifiertypecodinglist.get(adverseeventidentifiertypecodingi);

		/******************** AdvsEvnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(adverseeventidentifiertypecodingi == 0) {a.addAdvsEvntIdTypCdgDsply("[");}
		if(adverseeventidentifiertypecoding.hasDisplay()) {

			a.addAdvsEvntIdTypCdgDsply(String.valueOf(adverseeventidentifiertypecoding.getDisplay()));
		} else {
			a.addAdvsEvntIdTypCdgDsply("NULL");
		}

		if(adverseeventidentifiertypecodingi == adverseeventidentifiertypecodinglist.size()-1) {a.addAdvsEvntIdTypCdgDsply("]");}


		/******************** AdvsEvnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(adverseeventidentifiertypecodingi == 0) {a.addAdvsEvntIdTypCdgVrsn("[");}
		if(adverseeventidentifiertypecoding.hasVersion()) {

			a.addAdvsEvntIdTypCdgVrsn(String.valueOf(adverseeventidentifiertypecoding.getVersion()));
		} else {
			a.addAdvsEvntIdTypCdgVrsn("NULL");
		}

		if(adverseeventidentifiertypecodingi == adverseeventidentifiertypecodinglist.size()-1) {a.addAdvsEvntIdTypCdgVrsn("]");}


		/******************** AdvsEvnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(adverseeventidentifiertypecodingi == 0) {a.addAdvsEvntIdTypCdgCd("[");}
		if(adverseeventidentifiertypecoding.hasCode()) {

			a.addAdvsEvntIdTypCdgCd(String.valueOf(adverseeventidentifiertypecoding.getCode()));
		} else {
			a.addAdvsEvntIdTypCdgCd("NULL");
		}

		if(adverseeventidentifiertypecodingi == adverseeventidentifiertypecodinglist.size()-1) {a.addAdvsEvntIdTypCdgCd("]");}


		/******************** AdvsEvnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventidentifiertypecodingi == 0) {a.addAdvsEvntIdTypCdgUsrSltd("[");}
		if(adverseeventidentifiertypecoding.hasUserSelected()) {

			a.addAdvsEvntIdTypCdgUsrSltd(String.valueOf(adverseeventidentifiertypecoding.getUserSelected()));
		} else {
			a.addAdvsEvntIdTypCdgUsrSltd("NULL");
		}

		if(adverseeventidentifiertypecodingi == adverseeventidentifiertypecodinglist.size()-1) {a.addAdvsEvntIdTypCdgUsrSltd("]");}


		/******************** AdvsEvnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(adverseeventidentifiertypecodingi == 0) {a.addAdvsEvntIdTypCdgSys("[");}
		if(adverseeventidentifiertypecoding.hasSystem()) {

			a.addAdvsEvntIdTypCdgSys(String.valueOf(adverseeventidentifiertypecoding.getSystem()));
		} else {
			a.addAdvsEvntIdTypCdgSys("NULL");
		}

		if(adverseeventidentifiertypecodingi == adverseeventidentifiertypecodinglist.size()-1) {a.addAdvsEvntIdTypCdgSys("]");}


		 };
		/******************** adverseeventidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period adverseeventidentifierperiod = adverseeventidentifier.getPeriod();

		/******************** AdvsEvnt_Id_Prd_Strt ********************************************************************************/
		if(adverseeventidentifierperiod.hasStart()) {

			a.addAdvsEvntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(adverseeventidentifierperiod.getStart())+"\"");
		} else {
			a.addAdvsEvntIdPrdStrt("NULL");
		}


		/******************** AdvsEvnt_Id_Prd_End ********************************************************************************/
		if(adverseeventidentifierperiod.hasEnd()) {

			a.addAdvsEvntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(adverseeventidentifierperiod.getEnd())+"\"");
		} else {
			a.addAdvsEvntIdPrdEnd("NULL");
		}


		/******************** adverseeventidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse adverseeventidentifieruse = adverseeventidentifier.getUse();
		if(adverseeventidentifieruse!=null) {
			a.addAdvsEvntIdUse(adverseeventidentifieruse.toCode());
		} else {
			a.addAdvsEvntIdUse("NULL");
		}

		/******************** AdvsEvnt_Id_Assigner ********************************************************************************/
		if(adverseeventidentifier.hasAssigner()) {

			if(adverseeventidentifier.getAssigner().getReference() != null) {
			a.addAdvsEvntIdAssigner(adverseeventidentifier.getAssigner().getReference());
			}
		} else {
			a.addAdvsEvntIdAssigner("NULL");
		}


		/******************** AdvsEvnt_Id_Sys ********************************************************************************/
		if(adverseeventidentifier.hasSystem()) {

			a.addAdvsEvntIdSys(String.valueOf(adverseeventidentifier.getSystem()));
		} else {
			a.addAdvsEvntIdSys("NULL");
		}


		/******************** adverseeventoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventoutcome = adverseevent.getOutcome();

		/******************** AdvsEvnt_Outcome_Txt ********************************************************************************/
		if(adverseeventoutcome.hasText()) {

			a.addAdvsEvntOutcomeTxt(String.valueOf(adverseeventoutcome.getText()));
		} else {
			a.addAdvsEvntOutcomeTxt("NULL");
		}


		/******************** adverseeventoutcomecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventoutcomecodinglist = adverseeventoutcome.getCoding();
		for(int adverseeventoutcomecodingi = 0; adverseeventoutcomecodingi<adverseeventoutcomecodinglist.size();adverseeventoutcomecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventoutcomecoding = adverseeventoutcomecodinglist.get(adverseeventoutcomecodingi);

		/******************** AdvsEvnt_Outcome_Cdg_Dsply ********************************************************************************/
		if(adverseeventoutcomecodingi == 0) {a.addAdvsEvntOutcomeCdgDsply("[");}
		if(adverseeventoutcomecoding.hasDisplay()) {

			a.addAdvsEvntOutcomeCdgDsply(String.valueOf(adverseeventoutcomecoding.getDisplay()));
		} else {
			a.addAdvsEvntOutcomeCdgDsply("NULL");
		}

		if(adverseeventoutcomecodingi == adverseeventoutcomecodinglist.size()-1) {a.addAdvsEvntOutcomeCdgDsply("]");}


		/******************** AdvsEvnt_Outcome_Cdg_Vrsn ********************************************************************************/
		if(adverseeventoutcomecodingi == 0) {a.addAdvsEvntOutcomeCdgVrsn("[");}
		if(adverseeventoutcomecoding.hasVersion()) {

			a.addAdvsEvntOutcomeCdgVrsn(String.valueOf(adverseeventoutcomecoding.getVersion()));
		} else {
			a.addAdvsEvntOutcomeCdgVrsn("NULL");
		}

		if(adverseeventoutcomecodingi == adverseeventoutcomecodinglist.size()-1) {a.addAdvsEvntOutcomeCdgVrsn("]");}


		/******************** AdvsEvnt_Outcome_Cdg_Cd ********************************************************************************/
		if(adverseeventoutcomecodingi == 0) {a.addAdvsEvntOutcomeCdgCd("[");}
		if(adverseeventoutcomecoding.hasCode()) {

			a.addAdvsEvntOutcomeCdgCd(String.valueOf(adverseeventoutcomecoding.getCode()));
		} else {
			a.addAdvsEvntOutcomeCdgCd("NULL");
		}

		if(adverseeventoutcomecodingi == adverseeventoutcomecodinglist.size()-1) {a.addAdvsEvntOutcomeCdgCd("]");}


		/******************** AdvsEvnt_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventoutcomecodingi == 0) {a.addAdvsEvntOutcomeCdgUsrSltd("[");}
		if(adverseeventoutcomecoding.hasUserSelected()) {

			a.addAdvsEvntOutcomeCdgUsrSltd(String.valueOf(adverseeventoutcomecoding.getUserSelected()));
		} else {
			a.addAdvsEvntOutcomeCdgUsrSltd("NULL");
		}

		if(adverseeventoutcomecodingi == adverseeventoutcomecodinglist.size()-1) {a.addAdvsEvntOutcomeCdgUsrSltd("]");}


		/******************** AdvsEvnt_Outcome_Cdg_Sys ********************************************************************************/
		if(adverseeventoutcomecodingi == 0) {a.addAdvsEvntOutcomeCdgSys("[");}
		if(adverseeventoutcomecoding.hasSystem()) {

			a.addAdvsEvntOutcomeCdgSys(String.valueOf(adverseeventoutcomecoding.getSystem()));
		} else {
			a.addAdvsEvntOutcomeCdgSys("NULL");
		}

		if(adverseeventoutcomecodingi == adverseeventoutcomecodinglist.size()-1) {a.addAdvsEvntOutcomeCdgSys("]");}


		 };
		/******************** adverseeventcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> adverseeventcategorylist = adverseevent.getCategory();
		for(int adverseeventcategoryi = 0; adverseeventcategoryi<adverseeventcategorylist.size();adverseeventcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  adverseeventcategory = adverseeventcategorylist.get(adverseeventcategoryi);

		/******************** AdvsEvnt_Ctgry_Txt ********************************************************************************/
		if(adverseeventcategoryi == 0) {a.addAdvsEvntCtgryTxt("[");}
		if(adverseeventcategory.hasText()) {

			a.addAdvsEvntCtgryTxt(String.valueOf(adverseeventcategory.getText()));
		} else {
			a.addAdvsEvntCtgryTxt("NULL");
		}

		if(adverseeventcategoryi == adverseeventcategorylist.size()-1) {a.addAdvsEvntCtgryTxt("]");}


		/******************** adverseeventcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventcategorycodinglist = adverseeventcategory.getCoding();
		for(int adverseeventcategorycodingi = 0; adverseeventcategorycodingi<adverseeventcategorycodinglist.size();adverseeventcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventcategorycoding = adverseeventcategorycodinglist.get(adverseeventcategorycodingi);

		/******************** AdvsEvnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(adverseeventcategorycodingi == 0) {a.addAdvsEvntCtgryCdgDsply("[[");}
		if(adverseeventcategorycoding.hasDisplay()) {

			a.addAdvsEvntCtgryCdgDsply(String.valueOf(adverseeventcategorycoding.getDisplay()));
		} else {
			a.addAdvsEvntCtgryCdgDsply("NULL");
		}

		if(adverseeventcategorycodingi == adverseeventcategorycodinglist.size()-1) {a.addAdvsEvntCtgryCdgDsply("]]");}


		/******************** AdvsEvnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(adverseeventcategorycodingi == 0) {a.addAdvsEvntCtgryCdgVrsn("[[");}
		if(adverseeventcategorycoding.hasVersion()) {

			a.addAdvsEvntCtgryCdgVrsn(String.valueOf(adverseeventcategorycoding.getVersion()));
		} else {
			a.addAdvsEvntCtgryCdgVrsn("NULL");
		}

		if(adverseeventcategorycodingi == adverseeventcategorycodinglist.size()-1) {a.addAdvsEvntCtgryCdgVrsn("]]");}


		/******************** AdvsEvnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(adverseeventcategorycodingi == 0) {a.addAdvsEvntCtgryCdgCd("[[");}
		if(adverseeventcategorycoding.hasCode()) {

			a.addAdvsEvntCtgryCdgCd(String.valueOf(adverseeventcategorycoding.getCode()));
		} else {
			a.addAdvsEvntCtgryCdgCd("NULL");
		}

		if(adverseeventcategorycodingi == adverseeventcategorycodinglist.size()-1) {a.addAdvsEvntCtgryCdgCd("]]");}


		/******************** AdvsEvnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventcategorycodingi == 0) {a.addAdvsEvntCtgryCdgUsrSltd("[[");}
		if(adverseeventcategorycoding.hasUserSelected()) {

			a.addAdvsEvntCtgryCdgUsrSltd(String.valueOf(adverseeventcategorycoding.getUserSelected()));
		} else {
			a.addAdvsEvntCtgryCdgUsrSltd("NULL");
		}

		if(adverseeventcategorycodingi == adverseeventcategorycodinglist.size()-1) {a.addAdvsEvntCtgryCdgUsrSltd("]]");}


		/******************** AdvsEvnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(adverseeventcategorycodingi == 0) {a.addAdvsEvntCtgryCdgSys("[[");}
		if(adverseeventcategorycoding.hasSystem()) {

			a.addAdvsEvntCtgryCdgSys(String.valueOf(adverseeventcategorycoding.getSystem()));
		} else {
			a.addAdvsEvntCtgryCdgSys("NULL");
		}

		if(adverseeventcategorycodingi == adverseeventcategorycodinglist.size()-1) {a.addAdvsEvntCtgryCdgSys("]]");}


		 };
		 };
		/******************** adverseeventseverity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventseverity = adverseevent.getSeverity();

		/******************** AdvsEvnt_Severity_Txt ********************************************************************************/
		if(adverseeventseverity.hasText()) {

			a.addAdvsEvntSeverityTxt(String.valueOf(adverseeventseverity.getText()));
		} else {
			a.addAdvsEvntSeverityTxt("NULL");
		}


		/******************** adverseeventseveritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventseveritycodinglist = adverseeventseverity.getCoding();
		for(int adverseeventseveritycodingi = 0; adverseeventseveritycodingi<adverseeventseveritycodinglist.size();adverseeventseveritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventseveritycoding = adverseeventseveritycodinglist.get(adverseeventseveritycodingi);

		/******************** AdvsEvnt_Severity_Cdg_Dsply ********************************************************************************/
		if(adverseeventseveritycodingi == 0) {a.addAdvsEvntSeverityCdgDsply("[");}
		if(adverseeventseveritycoding.hasDisplay()) {

			a.addAdvsEvntSeverityCdgDsply(String.valueOf(adverseeventseveritycoding.getDisplay()));
		} else {
			a.addAdvsEvntSeverityCdgDsply("NULL");
		}

		if(adverseeventseveritycodingi == adverseeventseveritycodinglist.size()-1) {a.addAdvsEvntSeverityCdgDsply("]");}


		/******************** AdvsEvnt_Severity_Cdg_Vrsn ********************************************************************************/
		if(adverseeventseveritycodingi == 0) {a.addAdvsEvntSeverityCdgVrsn("[");}
		if(adverseeventseveritycoding.hasVersion()) {

			a.addAdvsEvntSeverityCdgVrsn(String.valueOf(adverseeventseveritycoding.getVersion()));
		} else {
			a.addAdvsEvntSeverityCdgVrsn("NULL");
		}

		if(adverseeventseveritycodingi == adverseeventseveritycodinglist.size()-1) {a.addAdvsEvntSeverityCdgVrsn("]");}


		/******************** AdvsEvnt_Severity_Cdg_Cd ********************************************************************************/
		if(adverseeventseveritycodingi == 0) {a.addAdvsEvntSeverityCdgCd("[");}
		if(adverseeventseveritycoding.hasCode()) {

			a.addAdvsEvntSeverityCdgCd(String.valueOf(adverseeventseveritycoding.getCode()));
		} else {
			a.addAdvsEvntSeverityCdgCd("NULL");
		}

		if(adverseeventseveritycodingi == adverseeventseveritycodinglist.size()-1) {a.addAdvsEvntSeverityCdgCd("]");}


		/******************** AdvsEvnt_Severity_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventseveritycodingi == 0) {a.addAdvsEvntSeverityCdgUsrSltd("[");}
		if(adverseeventseveritycoding.hasUserSelected()) {

			a.addAdvsEvntSeverityCdgUsrSltd(String.valueOf(adverseeventseveritycoding.getUserSelected()));
		} else {
			a.addAdvsEvntSeverityCdgUsrSltd("NULL");
		}

		if(adverseeventseveritycodingi == adverseeventseveritycodinglist.size()-1) {a.addAdvsEvntSeverityCdgUsrSltd("]");}


		/******************** AdvsEvnt_Severity_Cdg_Sys ********************************************************************************/
		if(adverseeventseveritycodingi == 0) {a.addAdvsEvntSeverityCdgSys("[");}
		if(adverseeventseveritycoding.hasSystem()) {

			a.addAdvsEvntSeverityCdgSys(String.valueOf(adverseeventseveritycoding.getSystem()));
		} else {
			a.addAdvsEvntSeverityCdgSys("NULL");
		}

		if(adverseeventseveritycodingi == adverseeventseveritycodinglist.size()-1) {a.addAdvsEvntSeverityCdgSys("]");}


		 };
		/******************** AdvsEvnt_Recorder ********************************************************************************/
		if(adverseevent.hasRecorder()) {

			if(adverseevent.getRecorder().getReference() != null) {
			a.addAdvsEvntRecorder(adverseevent.getRecorder().getReference());
			}
		} else {
			a.addAdvsEvntRecorder("NULL");
		}


		/******************** AdvsEvnt_RecordedDt ********************************************************************************/
		if(adverseevent.hasRecordedDate()) {

			a.addAdvsEvntRecordedDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(adverseevent.getRecordedDate())+"\"");
		} else {
			a.addAdvsEvntRecordedDt("NULL");
		}


		/******************** AdvsEvnt_Contributor ********************************************************************************/
		if(adverseevent.hasContributor()) {

			String  array = "[";
			for(int incr=0; incr<adverseevent.getContributor().size(); incr++) {
				array = array + adverseevent.getContributor().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAdvsEvntContributor(array);

		} else {
			a.addAdvsEvntContributor("NULL");
		}


		/******************** AdvsEvnt_Stdy ********************************************************************************/
		if(adverseevent.hasStudy()) {

			String  array = "[";
			for(int incr=0; incr<adverseevent.getStudy().size(); incr++) {
				array = array + adverseevent.getStudy().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAdvsEvntStdy(array);

		} else {
			a.addAdvsEvntStdy("NULL");
		}


		/******************** adverseeventevent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventevent = adverseevent.getEvent();

		/******************** AdvsEvnt_Evnt_Txt ********************************************************************************/
		if(adverseeventevent.hasText()) {

			a.addAdvsEvntEvntTxt(String.valueOf(adverseeventevent.getText()));
		} else {
			a.addAdvsEvntEvntTxt("NULL");
		}


		/******************** adverseeventeventcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventeventcodinglist = adverseeventevent.getCoding();
		for(int adverseeventeventcodingi = 0; adverseeventeventcodingi<adverseeventeventcodinglist.size();adverseeventeventcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventeventcoding = adverseeventeventcodinglist.get(adverseeventeventcodingi);

		/******************** AdvsEvnt_Evnt_Cdg_Dsply ********************************************************************************/
		if(adverseeventeventcodingi == 0) {a.addAdvsEvntEvntCdgDsply("[");}
		if(adverseeventeventcoding.hasDisplay()) {

			a.addAdvsEvntEvntCdgDsply(String.valueOf(adverseeventeventcoding.getDisplay()));
		} else {
			a.addAdvsEvntEvntCdgDsply("NULL");
		}

		if(adverseeventeventcodingi == adverseeventeventcodinglist.size()-1) {a.addAdvsEvntEvntCdgDsply("]");}


		/******************** AdvsEvnt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(adverseeventeventcodingi == 0) {a.addAdvsEvntEvntCdgVrsn("[");}
		if(adverseeventeventcoding.hasVersion()) {

			a.addAdvsEvntEvntCdgVrsn(String.valueOf(adverseeventeventcoding.getVersion()));
		} else {
			a.addAdvsEvntEvntCdgVrsn("NULL");
		}

		if(adverseeventeventcodingi == adverseeventeventcodinglist.size()-1) {a.addAdvsEvntEvntCdgVrsn("]");}


		/******************** AdvsEvnt_Evnt_Cdg_Cd ********************************************************************************/
		if(adverseeventeventcodingi == 0) {a.addAdvsEvntEvntCdgCd("[");}
		if(adverseeventeventcoding.hasCode()) {

			a.addAdvsEvntEvntCdgCd(String.valueOf(adverseeventeventcoding.getCode()));
		} else {
			a.addAdvsEvntEvntCdgCd("NULL");
		}

		if(adverseeventeventcodingi == adverseeventeventcodinglist.size()-1) {a.addAdvsEvntEvntCdgCd("]");}


		/******************** AdvsEvnt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventeventcodingi == 0) {a.addAdvsEvntEvntCdgUsrSltd("[");}
		if(adverseeventeventcoding.hasUserSelected()) {

			a.addAdvsEvntEvntCdgUsrSltd(String.valueOf(adverseeventeventcoding.getUserSelected()));
		} else {
			a.addAdvsEvntEvntCdgUsrSltd("NULL");
		}

		if(adverseeventeventcodingi == adverseeventeventcodinglist.size()-1) {a.addAdvsEvntEvntCdgUsrSltd("]");}


		/******************** AdvsEvnt_Evnt_Cdg_Sys ********************************************************************************/
		if(adverseeventeventcodingi == 0) {a.addAdvsEvntEvntCdgSys("[");}
		if(adverseeventeventcoding.hasSystem()) {

			a.addAdvsEvntEvntCdgSys(String.valueOf(adverseeventeventcoding.getSystem()));
		} else {
			a.addAdvsEvntEvntCdgSys("NULL");
		}

		if(adverseeventeventcodingi == adverseeventeventcodinglist.size()-1) {a.addAdvsEvntEvntCdgSys("]");}


		 };
		/******************** AdvsEvnt_SbjctMedicalHis ********************************************************************************/
		if(adverseevent.hasSubjectMedicalHistory()) {

			String  array = "[";
			for(int incr=0; incr<adverseevent.getSubjectMedicalHistory().size(); incr++) {
				array = array + adverseevent.getSubjectMedicalHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAdvsEvntSbjctMedicalHis(array);

		} else {
			a.addAdvsEvntSbjctMedicalHis("NULL");
		}


		/******************** AdvsEvnt_RfrncDoc ********************************************************************************/
		if(adverseevent.hasReferenceDocument()) {

			String  array = "[";
			for(int incr=0; incr<adverseevent.getReferenceDocument().size(); incr++) {
				array = array + adverseevent.getReferenceDocument().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAdvsEvntRfrncDoc(array);

		} else {
			a.addAdvsEvntRfrncDoc("NULL");
		}


		/******************** AdvsEvnt_RsltingCndtn ********************************************************************************/
		if(adverseevent.hasResultingCondition()) {

			String  array = "[";
			for(int incr=0; incr<adverseevent.getResultingCondition().size(); incr++) {
				array = array + adverseevent.getResultingCondition().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAdvsEvntRsltingCndtn(array);

		} else {
			a.addAdvsEvntRsltingCndtn("NULL");
		}


		/******************** adverseeventsuspectentity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent> adverseeventsuspectentitylist = adverseevent.getSuspectEntity();
		for(int adverseeventsuspectentityi = 0; adverseeventsuspectentityi<adverseeventsuspectentitylist.size();adverseeventsuspectentityi++ ) {
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent  adverseeventsuspectentity = adverseeventsuspectentitylist.get(adverseeventsuspectentityi);

		/******************** AdvsEvnt_SuspectEntity_Instance ********************************************************************************/
		if(adverseeventsuspectentityi == 0) {a.addAdvsEvntSuspectEntityInstance("[");}
		if(adverseeventsuspectentity.hasInstance()) {

			if(adverseeventsuspectentity.getInstance().getReference() != null) {
			a.addAdvsEvntSuspectEntityInstance(adverseeventsuspectentity.getInstance().getReference());
			}
		} else {
			a.addAdvsEvntSuspectEntityInstance("NULL");
		}

		if(adverseeventsuspectentityi == adverseeventsuspectentitylist.size()-1) {a.addAdvsEvntSuspectEntityInstance("]");}


		/******************** adverseeventsuspectentitycausality ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent> adverseeventsuspectentitycausalitylist = adverseeventsuspectentity.getCausality();
		for(int adverseeventsuspectentitycausalityi = 0; adverseeventsuspectentitycausalityi<adverseeventsuspectentitycausalitylist.size();adverseeventsuspectentitycausalityi++ ) {
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent  adverseeventsuspectentitycausality = adverseeventsuspectentitycausalitylist.get(adverseeventsuspectentitycausalityi);

		/******************** adverseeventsuspectentitycausalitymethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventsuspectentitycausalitymethod = adverseeventsuspectentitycausality.getMethod();

		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Txt ********************************************************************************/
		if(adverseeventsuspectentitycausalityi == 0) {a.addAdvsEvntSuspectEntityCausalityMthdTxt("[[");}
		if(adverseeventsuspectentitycausalitymethod.hasText()) {

			a.addAdvsEvntSuspectEntityCausalityMthdTxt(String.valueOf(adverseeventsuspectentitycausalitymethod.getText()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityMthdTxt("NULL");
		}

		if(adverseeventsuspectentitycausalityi == adverseeventsuspectentitycausalitylist.size()-1) {a.addAdvsEvntSuspectEntityCausalityMthdTxt("]]");}


		/******************** adverseeventsuspectentitycausalitymethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventsuspectentitycausalitymethodcodinglist = adverseeventsuspectentitycausalitymethod.getCoding();
		for(int adverseeventsuspectentitycausalitymethodcodingi = 0; adverseeventsuspectentitycausalitymethodcodingi<adverseeventsuspectentitycausalitymethodcodinglist.size();adverseeventsuspectentitycausalitymethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventsuspectentitycausalitymethodcoding = adverseeventsuspectentitycausalitymethodcodinglist.get(adverseeventsuspectentitycausalitymethodcodingi);

		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Dsply ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityMthdCdgDsply("[[[");}
		if(adverseeventsuspectentitycausalitymethodcoding.hasDisplay()) {

			a.addAdvsEvntSuspectEntityCausalityMthdCdgDsply(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getDisplay()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityMthdCdgDsply("NULL");
		}

		if(adverseeventsuspectentitycausalitymethodcodingi == adverseeventsuspectentitycausalitymethodcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityMthdCdgDsply("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityMthdCdgVrsn("[[[");}
		if(adverseeventsuspectentitycausalitymethodcoding.hasVersion()) {

			a.addAdvsEvntSuspectEntityCausalityMthdCdgVrsn(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getVersion()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityMthdCdgVrsn("NULL");
		}

		if(adverseeventsuspectentitycausalitymethodcodingi == adverseeventsuspectentitycausalitymethodcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityMthdCdgVrsn("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Cd ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityMthdCdgCd("[[[");}
		if(adverseeventsuspectentitycausalitymethodcoding.hasCode()) {

			a.addAdvsEvntSuspectEntityCausalityMthdCdgCd(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getCode()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityMthdCdgCd("NULL");
		}

		if(adverseeventsuspectentitycausalitymethodcodingi == adverseeventsuspectentitycausalitymethodcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityMthdCdgCd("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd("[[[");}
		if(adverseeventsuspectentitycausalitymethodcoding.hasUserSelected()) {

			a.addAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getUserSelected()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd("NULL");
		}

		if(adverseeventsuspectentitycausalitymethodcodingi == adverseeventsuspectentitycausalitymethodcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Sys ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityMthdCdgSys("[[[");}
		if(adverseeventsuspectentitycausalitymethodcoding.hasSystem()) {

			a.addAdvsEvntSuspectEntityCausalityMthdCdgSys(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getSystem()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityMthdCdgSys("NULL");
		}

		if(adverseeventsuspectentitycausalitymethodcodingi == adverseeventsuspectentitycausalitymethodcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityMthdCdgSys("]]]");}


		 };
		/******************** AdvsEvnt_SuspectEntity_Causality_PrdctRltedness ********************************************************************************/
		if(adverseeventsuspectentitycausalityi == 0) {a.addAdvsEvntSuspectEntityCausalityPrdctRltedness("[[");}
		if(adverseeventsuspectentitycausality.hasProductRelatedness()) {

			a.addAdvsEvntSuspectEntityCausalityPrdctRltedness(String.valueOf(adverseeventsuspectentitycausality.getProductRelatedness()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityPrdctRltedness("NULL");
		}

		if(adverseeventsuspectentitycausalityi == adverseeventsuspectentitycausalitylist.size()-1) {a.addAdvsEvntSuspectEntityCausalityPrdctRltedness("]]");}


		/******************** adverseeventsuspectentitycausalityassessment ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventsuspectentitycausalityassessment = adverseeventsuspectentitycausality.getAssessment();

		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Txt ********************************************************************************/
		if(adverseeventsuspectentitycausalityi == 0) {a.addAdvsEvntSuspectEntityCausalityAssmntTxt("[[");}
		if(adverseeventsuspectentitycausalityassessment.hasText()) {

			a.addAdvsEvntSuspectEntityCausalityAssmntTxt(String.valueOf(adverseeventsuspectentitycausalityassessment.getText()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityAssmntTxt("NULL");
		}

		if(adverseeventsuspectentitycausalityi == adverseeventsuspectentitycausalitylist.size()-1) {a.addAdvsEvntSuspectEntityCausalityAssmntTxt("]]");}


		/******************** adverseeventsuspectentitycausalityassessmentcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventsuspectentitycausalityassessmentcodinglist = adverseeventsuspectentitycausalityassessment.getCoding();
		for(int adverseeventsuspectentitycausalityassessmentcodingi = 0; adverseeventsuspectentitycausalityassessmentcodingi<adverseeventsuspectentitycausalityassessmentcodinglist.size();adverseeventsuspectentitycausalityassessmentcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventsuspectentitycausalityassessmentcoding = adverseeventsuspectentitycausalityassessmentcodinglist.get(adverseeventsuspectentitycausalityassessmentcodingi);

		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Dsply ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgDsply("[[[");}
		if(adverseeventsuspectentitycausalityassessmentcoding.hasDisplay()) {

			a.addAdvsEvntSuspectEntityCausalityAssmntCdgDsply(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getDisplay()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityAssmntCdgDsply("NULL");
		}

		if(adverseeventsuspectentitycausalityassessmentcodingi == adverseeventsuspectentitycausalityassessmentcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgDsply("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Vrsn ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgVrsn("[[[");}
		if(adverseeventsuspectentitycausalityassessmentcoding.hasVersion()) {

			a.addAdvsEvntSuspectEntityCausalityAssmntCdgVrsn(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getVersion()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityAssmntCdgVrsn("NULL");
		}

		if(adverseeventsuspectentitycausalityassessmentcodingi == adverseeventsuspectentitycausalityassessmentcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgVrsn("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Cd ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgCd("[[[");}
		if(adverseeventsuspectentitycausalityassessmentcoding.hasCode()) {

			a.addAdvsEvntSuspectEntityCausalityAssmntCdgCd(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getCode()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityAssmntCdgCd("NULL");
		}

		if(adverseeventsuspectentitycausalityassessmentcodingi == adverseeventsuspectentitycausalityassessmentcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgCd("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd("[[[");}
		if(adverseeventsuspectentitycausalityassessmentcoding.hasUserSelected()) {

			a.addAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getUserSelected()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd("NULL");
		}

		if(adverseeventsuspectentitycausalityassessmentcodingi == adverseeventsuspectentitycausalityassessmentcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd("]]]");}


		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Sys ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcodingi == 0) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgSys("[[[");}
		if(adverseeventsuspectentitycausalityassessmentcoding.hasSystem()) {

			a.addAdvsEvntSuspectEntityCausalityAssmntCdgSys(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getSystem()));
		} else {
			a.addAdvsEvntSuspectEntityCausalityAssmntCdgSys("NULL");
		}

		if(adverseeventsuspectentitycausalityassessmentcodingi == adverseeventsuspectentitycausalityassessmentcodinglist.size()-1) {a.addAdvsEvntSuspectEntityCausalityAssmntCdgSys("]]]");}


		 };
		/******************** AdvsEvnt_SuspectEntity_Causality_Athr ********************************************************************************/
		if(adverseeventsuspectentitycausalityi == 0) {a.addAdvsEvntSuspectEntityCausalityAthr("[[");}
		if(adverseeventsuspectentitycausality.hasAuthor()) {

			if(adverseeventsuspectentitycausality.getAuthor().getReference() != null) {
			a.addAdvsEvntSuspectEntityCausalityAthr(adverseeventsuspectentitycausality.getAuthor().getReference());
			}
		} else {
			a.addAdvsEvntSuspectEntityCausalityAthr("NULL");
		}

		if(adverseeventsuspectentitycausalityi == adverseeventsuspectentitycausalitylist.size()-1) {a.addAdvsEvntSuspectEntityCausalityAthr("]]");}


		 };
		 };
		/******************** AdvsEvnt_Detected ********************************************************************************/
		if(adverseevent.hasDetected()) {

			a.addAdvsEvntDetected("\""+ca.uhn.fhir.util.DateUtils.formatDate(adverseevent.getDetected())+"\"");
		} else {
			a.addAdvsEvntDetected("NULL");
		}


		/******************** adverseeventseriousness ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventseriousness = adverseevent.getSeriousness();

		/******************** AdvsEvnt_Seriousness_Txt ********************************************************************************/
		if(adverseeventseriousness.hasText()) {

			a.addAdvsEvntSeriousnessTxt(String.valueOf(adverseeventseriousness.getText()));
		} else {
			a.addAdvsEvntSeriousnessTxt("NULL");
		}


		/******************** adverseeventseriousnesscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> adverseeventseriousnesscodinglist = adverseeventseriousness.getCoding();
		for(int adverseeventseriousnesscodingi = 0; adverseeventseriousnesscodingi<adverseeventseriousnesscodinglist.size();adverseeventseriousnesscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  adverseeventseriousnesscoding = adverseeventseriousnesscodinglist.get(adverseeventseriousnesscodingi);

		/******************** AdvsEvnt_Seriousness_Cdg_Dsply ********************************************************************************/
		if(adverseeventseriousnesscodingi == 0) {a.addAdvsEvntSeriousnessCdgDsply("[");}
		if(adverseeventseriousnesscoding.hasDisplay()) {

			a.addAdvsEvntSeriousnessCdgDsply(String.valueOf(adverseeventseriousnesscoding.getDisplay()));
		} else {
			a.addAdvsEvntSeriousnessCdgDsply("NULL");
		}

		if(adverseeventseriousnesscodingi == adverseeventseriousnesscodinglist.size()-1) {a.addAdvsEvntSeriousnessCdgDsply("]");}


		/******************** AdvsEvnt_Seriousness_Cdg_Vrsn ********************************************************************************/
		if(adverseeventseriousnesscodingi == 0) {a.addAdvsEvntSeriousnessCdgVrsn("[");}
		if(adverseeventseriousnesscoding.hasVersion()) {

			a.addAdvsEvntSeriousnessCdgVrsn(String.valueOf(adverseeventseriousnesscoding.getVersion()));
		} else {
			a.addAdvsEvntSeriousnessCdgVrsn("NULL");
		}

		if(adverseeventseriousnesscodingi == adverseeventseriousnesscodinglist.size()-1) {a.addAdvsEvntSeriousnessCdgVrsn("]");}


		/******************** AdvsEvnt_Seriousness_Cdg_Cd ********************************************************************************/
		if(adverseeventseriousnesscodingi == 0) {a.addAdvsEvntSeriousnessCdgCd("[");}
		if(adverseeventseriousnesscoding.hasCode()) {

			a.addAdvsEvntSeriousnessCdgCd(String.valueOf(adverseeventseriousnesscoding.getCode()));
		} else {
			a.addAdvsEvntSeriousnessCdgCd("NULL");
		}

		if(adverseeventseriousnesscodingi == adverseeventseriousnesscodinglist.size()-1) {a.addAdvsEvntSeriousnessCdgCd("]");}


		/******************** AdvsEvnt_Seriousness_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventseriousnesscodingi == 0) {a.addAdvsEvntSeriousnessCdgUsrSltd("[");}
		if(adverseeventseriousnesscoding.hasUserSelected()) {

			a.addAdvsEvntSeriousnessCdgUsrSltd(String.valueOf(adverseeventseriousnesscoding.getUserSelected()));
		} else {
			a.addAdvsEvntSeriousnessCdgUsrSltd("NULL");
		}

		if(adverseeventseriousnesscodingi == adverseeventseriousnesscodinglist.size()-1) {a.addAdvsEvntSeriousnessCdgUsrSltd("]");}


		/******************** AdvsEvnt_Seriousness_Cdg_Sys ********************************************************************************/
		if(adverseeventseriousnesscodingi == 0) {a.addAdvsEvntSeriousnessCdgSys("[");}
		if(adverseeventseriousnesscoding.hasSystem()) {

			a.addAdvsEvntSeriousnessCdgSys(String.valueOf(adverseeventseriousnesscoding.getSystem()));
		} else {
			a.addAdvsEvntSeriousnessCdgSys("NULL");
		}

		if(adverseeventseriousnesscodingi == adverseeventseriousnesscodinglist.size()-1) {a.addAdvsEvntSeriousnessCdgSys("]");}


		 };
		/******************** adverseeventactuality ********************************************************************************/
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventActuality adverseeventactuality = adverseevent.getActuality();
		if(adverseeventactuality!=null) {
			a.addAdvsEvntActuality(adverseeventactuality.toCode());
		} else {
			a.addAdvsEvntActuality("NULL");
		}

		return a;
	}
}
