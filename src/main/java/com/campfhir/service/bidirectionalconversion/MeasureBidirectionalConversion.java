package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Measure;
public class MeasureBidirectionalConversion 
{
	public Measure Measures(org.hl7.fhir.r4.model.Measure measure) throws ParseException
	{
		 main.java.com.campfhir.model.Measure m = new  main.java.com.campfhir.model.Measure();

		/******************** id ********************************************************************************/
		m.setId(measure.getIdElement().getIdPart());

		/******************** Msr_Nm ********************************************************************************/
		if(measure.hasName()) {

			m.addMsrNm(String.valueOf(measure.getName()));
		} else {
			m.addMsrNm("NULL");
		}


		/******************** measuretype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> measuretypelist = measure.getType();
		for(int measuretypei = 0; measuretypei<measuretypelist.size();measuretypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  measuretype = measuretypelist.get(measuretypei);

		/******************** Msr_Typ_Txt ********************************************************************************/
		if(measuretypei == 0) {m.addMsrTypTxt("[");}
		if(measuretype.hasText()) {

			m.addMsrTypTxt(String.valueOf(measuretype.getText()));
		} else {
			m.addMsrTypTxt("NULL");
		}

		if(measuretypei == measuretypelist.size()-1) {m.addMsrTypTxt("]");}


		/******************** measuretypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuretypecodinglist = measuretype.getCoding();
		for(int measuretypecodingi = 0; measuretypecodingi<measuretypecodinglist.size();measuretypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuretypecoding = measuretypecodinglist.get(measuretypecodingi);

		/******************** Msr_Typ_Cdg_Dsply ********************************************************************************/
		if(measuretypecodingi == 0) {m.addMsrTypCdgDsply("[[");}
		if(measuretypecoding.hasDisplay()) {

			m.addMsrTypCdgDsply(String.valueOf(measuretypecoding.getDisplay()));
		} else {
			m.addMsrTypCdgDsply("NULL");
		}

		if(measuretypecodingi == measuretypecodinglist.size()-1) {m.addMsrTypCdgDsply("]]");}


		/******************** Msr_Typ_Cdg_Vrsn ********************************************************************************/
		if(measuretypecodingi == 0) {m.addMsrTypCdgVrsn("[[");}
		if(measuretypecoding.hasVersion()) {

			m.addMsrTypCdgVrsn(String.valueOf(measuretypecoding.getVersion()));
		} else {
			m.addMsrTypCdgVrsn("NULL");
		}

		if(measuretypecodingi == measuretypecodinglist.size()-1) {m.addMsrTypCdgVrsn("]]");}


		/******************** Msr_Typ_Cdg_Cd ********************************************************************************/
		if(measuretypecodingi == 0) {m.addMsrTypCdgCd("[[");}
		if(measuretypecoding.hasCode()) {

			m.addMsrTypCdgCd(String.valueOf(measuretypecoding.getCode()));
		} else {
			m.addMsrTypCdgCd("NULL");
		}

		if(measuretypecodingi == measuretypecodinglist.size()-1) {m.addMsrTypCdgCd("]]");}


		/******************** Msr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(measuretypecodingi == 0) {m.addMsrTypCdgUsrSltd("[[");}
		if(measuretypecoding.hasUserSelected()) {

			m.addMsrTypCdgUsrSltd(String.valueOf(measuretypecoding.getUserSelected()));
		} else {
			m.addMsrTypCdgUsrSltd("NULL");
		}

		if(measuretypecodingi == measuretypecodinglist.size()-1) {m.addMsrTypCdgUsrSltd("]]");}


		/******************** Msr_Typ_Cdg_Sys ********************************************************************************/
		if(measuretypecodingi == 0) {m.addMsrTypCdgSys("[[");}
		if(measuretypecoding.hasSystem()) {

			m.addMsrTypCdgSys(String.valueOf(measuretypecoding.getSystem()));
		} else {
			m.addMsrTypCdgSys("NULL");
		}

		if(measuretypecodingi == measuretypecodinglist.size()-1) {m.addMsrTypCdgSys("]]");}


		 };
		 };
		/******************** Msr_Dfn ********************************************************************************/
		if(measure.hasDefinition()) {

			String  array = "[";
			for(int incr=0; incr<measure.getDefinition().size(); incr++) {
				array = array + measure.getDefinition().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMsrDfn(array);

		} else {
			m.addMsrDfn("NULL");
		}


		/******************** Msr_Vrsn ********************************************************************************/
		if(measure.hasVersion()) {

			m.addMsrVrsn(String.valueOf(measure.getVersion()));
		} else {
			m.addMsrVrsn("NULL");
		}


		/******************** measuregroup ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Measure.MeasureGroupComponent> measuregrouplist = measure.getGroup();
		for(int measuregroupi = 0; measuregroupi<measuregrouplist.size();measuregroupi++ ) {
		org.hl7.fhir.r4.model.Measure.MeasureGroupComponent  measuregroup = measuregrouplist.get(measuregroupi);

		/******************** measuregroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupcode = measuregroup.getCode();

		/******************** Msr_Grp_Cd_Txt ********************************************************************************/
		if(measuregroupi == 0) {m.addMsrGrpCdTxt("[");}
		if(measuregroupcode.hasText()) {

			m.addMsrGrpCdTxt(String.valueOf(measuregroupcode.getText()));
		} else {
			m.addMsrGrpCdTxt("NULL");
		}

		if(measuregroupi == measuregrouplist.size()-1) {m.addMsrGrpCdTxt("]");}


		/******************** measuregroupcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuregroupcodecodinglist = measuregroupcode.getCoding();
		for(int measuregroupcodecodingi = 0; measuregroupcodecodingi<measuregroupcodecodinglist.size();measuregroupcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuregroupcodecoding = measuregroupcodecodinglist.get(measuregroupcodecodingi);

		/******************** Msr_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregroupcodecodingi == 0) {m.addMsrGrpCdCdgDsply("[[");}
		if(measuregroupcodecoding.hasDisplay()) {

			m.addMsrGrpCdCdgDsply(String.valueOf(measuregroupcodecoding.getDisplay()));
		} else {
			m.addMsrGrpCdCdgDsply("NULL");
		}

		if(measuregroupcodecodingi == measuregroupcodecodinglist.size()-1) {m.addMsrGrpCdCdgDsply("]]");}


		/******************** Msr_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregroupcodecodingi == 0) {m.addMsrGrpCdCdgVrsn("[[");}
		if(measuregroupcodecoding.hasVersion()) {

			m.addMsrGrpCdCdgVrsn(String.valueOf(measuregroupcodecoding.getVersion()));
		} else {
			m.addMsrGrpCdCdgVrsn("NULL");
		}

		if(measuregroupcodecodingi == measuregroupcodecodinglist.size()-1) {m.addMsrGrpCdCdgVrsn("]]");}


		/******************** Msr_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(measuregroupcodecodingi == 0) {m.addMsrGrpCdCdgCd("[[");}
		if(measuregroupcodecoding.hasCode()) {

			m.addMsrGrpCdCdgCd(String.valueOf(measuregroupcodecoding.getCode()));
		} else {
			m.addMsrGrpCdCdgCd("NULL");
		}

		if(measuregroupcodecodingi == measuregroupcodecodinglist.size()-1) {m.addMsrGrpCdCdgCd("]]");}


		/******************** Msr_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregroupcodecodingi == 0) {m.addMsrGrpCdCdgUsrSltd("[[");}
		if(measuregroupcodecoding.hasUserSelected()) {

			m.addMsrGrpCdCdgUsrSltd(String.valueOf(measuregroupcodecoding.getUserSelected()));
		} else {
			m.addMsrGrpCdCdgUsrSltd("NULL");
		}

		if(measuregroupcodecodingi == measuregroupcodecodinglist.size()-1) {m.addMsrGrpCdCdgUsrSltd("]]");}


		/******************** Msr_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(measuregroupcodecodingi == 0) {m.addMsrGrpCdCdgSys("[[");}
		if(measuregroupcodecoding.hasSystem()) {

			m.addMsrGrpCdCdgSys(String.valueOf(measuregroupcodecoding.getSystem()));
		} else {
			m.addMsrGrpCdCdgSys("NULL");
		}

		if(measuregroupcodecodingi == measuregroupcodecodinglist.size()-1) {m.addMsrGrpCdCdgSys("]]");}


		 };
		/******************** Msr_Grp_Dscrptn ********************************************************************************/
		if(measuregroupi == 0) {m.addMsrGrpDscrptn("[");}
		if(measuregroup.hasDescription()) {

			m.addMsrGrpDscrptn(String.valueOf(measuregroup.getDescription()));
		} else {
			m.addMsrGrpDscrptn("NULL");
		}

		if(measuregroupi == measuregrouplist.size()-1) {m.addMsrGrpDscrptn("]");}


		/******************** measuregroupstratifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent> measuregroupstratifierlist = measuregroup.getStratifier();
		for(int measuregroupstratifieri = 0; measuregroupstratifieri<measuregroupstratifierlist.size();measuregroupstratifieri++ ) {
		org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent  measuregroupstratifier = measuregroupstratifierlist.get(measuregroupstratifieri);

		/******************** measuregroupstratifiercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupstratifiercode = measuregroupstratifier.getCode();

		/******************** Msr_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(measuregroupstratifieri == 0) {m.addMsrGrpStrtfierCdTxt("[[");}
		if(measuregroupstratifiercode.hasText()) {

			m.addMsrGrpStrtfierCdTxt(String.valueOf(measuregroupstratifiercode.getText()));
		} else {
			m.addMsrGrpStrtfierCdTxt("NULL");
		}

		if(measuregroupstratifieri == measuregroupstratifierlist.size()-1) {m.addMsrGrpStrtfierCdTxt("]]");}


		/******************** measuregroupstratifiercodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuregroupstratifiercodecodinglist = measuregroupstratifiercode.getCoding();
		for(int measuregroupstratifiercodecodingi = 0; measuregroupstratifiercodecodingi<measuregroupstratifiercodecodinglist.size();measuregroupstratifiercodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuregroupstratifiercodecoding = measuregroupstratifiercodecodinglist.get(measuregroupstratifiercodecodingi);

		/******************** Msr_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregroupstratifiercodecodingi == 0) {m.addMsrGrpStrtfierCdCdgDsply("[[[");}
		if(measuregroupstratifiercodecoding.hasDisplay()) {

			m.addMsrGrpStrtfierCdCdgDsply(String.valueOf(measuregroupstratifiercodecoding.getDisplay()));
		} else {
			m.addMsrGrpStrtfierCdCdgDsply("NULL");
		}

		if(measuregroupstratifiercodecodingi == measuregroupstratifiercodecodinglist.size()-1) {m.addMsrGrpStrtfierCdCdgDsply("]]]");}


		/******************** Msr_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregroupstratifiercodecodingi == 0) {m.addMsrGrpStrtfierCdCdgVrsn("[[[");}
		if(measuregroupstratifiercodecoding.hasVersion()) {

			m.addMsrGrpStrtfierCdCdgVrsn(String.valueOf(measuregroupstratifiercodecoding.getVersion()));
		} else {
			m.addMsrGrpStrtfierCdCdgVrsn("NULL");
		}

		if(measuregroupstratifiercodecodingi == measuregroupstratifiercodecodinglist.size()-1) {m.addMsrGrpStrtfierCdCdgVrsn("]]]");}


		/******************** Msr_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(measuregroupstratifiercodecodingi == 0) {m.addMsrGrpStrtfierCdCdgCd("[[[");}
		if(measuregroupstratifiercodecoding.hasCode()) {

			m.addMsrGrpStrtfierCdCdgCd(String.valueOf(measuregroupstratifiercodecoding.getCode()));
		} else {
			m.addMsrGrpStrtfierCdCdgCd("NULL");
		}

		if(measuregroupstratifiercodecodingi == measuregroupstratifiercodecodinglist.size()-1) {m.addMsrGrpStrtfierCdCdgCd("]]]");}


		/******************** Msr_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregroupstratifiercodecodingi == 0) {m.addMsrGrpStrtfierCdCdgUsrSltd("[[[");}
		if(measuregroupstratifiercodecoding.hasUserSelected()) {

			m.addMsrGrpStrtfierCdCdgUsrSltd(String.valueOf(measuregroupstratifiercodecoding.getUserSelected()));
		} else {
			m.addMsrGrpStrtfierCdCdgUsrSltd("NULL");
		}

		if(measuregroupstratifiercodecodingi == measuregroupstratifiercodecodinglist.size()-1) {m.addMsrGrpStrtfierCdCdgUsrSltd("]]]");}


		/******************** Msr_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(measuregroupstratifiercodecodingi == 0) {m.addMsrGrpStrtfierCdCdgSys("[[[");}
		if(measuregroupstratifiercodecoding.hasSystem()) {

			m.addMsrGrpStrtfierCdCdgSys(String.valueOf(measuregroupstratifiercodecoding.getSystem()));
		} else {
			m.addMsrGrpStrtfierCdCdgSys("NULL");
		}

		if(measuregroupstratifiercodecodingi == measuregroupstratifiercodecodinglist.size()-1) {m.addMsrGrpStrtfierCdCdgSys("]]]");}


		 };
		/******************** Msr_Grp_Strtfier_Dscrptn ********************************************************************************/
		if(measuregroupstratifieri == 0) {m.addMsrGrpStrtfierDscrptn("[[");}
		if(measuregroupstratifier.hasDescription()) {

			m.addMsrGrpStrtfierDscrptn(String.valueOf(measuregroupstratifier.getDescription()));
		} else {
			m.addMsrGrpStrtfierDscrptn("NULL");
		}

		if(measuregroupstratifieri == measuregroupstratifierlist.size()-1) {m.addMsrGrpStrtfierDscrptn("]]");}


		/******************** measuregroupstratifiercriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregroupstratifiercriteria = measuregroupstratifier.getCriteria();

		/******************** Msr_Grp_Strtfier_Criteria_Nm ********************************************************************************/
		if(measuregroupstratifieri == 0) {m.addMsrGrpStrtfierCriteriaNm("[[");}
		if(measuregroupstratifiercriteria.hasName()) {

			m.addMsrGrpStrtfierCriteriaNm(String.valueOf(measuregroupstratifiercriteria.getName()));
		} else {
			m.addMsrGrpStrtfierCriteriaNm("NULL");
		}

		if(measuregroupstratifieri == measuregroupstratifierlist.size()-1) {m.addMsrGrpStrtfierCriteriaNm("]]");}


		/******************** Msr_Grp_Strtfier_Criteria_Rfrnc ********************************************************************************/
		if(measuregroupstratifieri == 0) {m.addMsrGrpStrtfierCriteriaRfrnc("[[");}
		if(measuregroupstratifiercriteria.hasReference()) {

			m.addMsrGrpStrtfierCriteriaRfrnc(String.valueOf(measuregroupstratifiercriteria.getReference()));
		} else {
			m.addMsrGrpStrtfierCriteriaRfrnc("NULL");
		}

		if(measuregroupstratifieri == measuregroupstratifierlist.size()-1) {m.addMsrGrpStrtfierCriteriaRfrnc("]]");}


		/******************** Msr_Grp_Strtfier_Criteria_Lnguage ********************************************************************************/
		if(measuregroupstratifieri == 0) {m.addMsrGrpStrtfierCriteriaLnguage("[[");}
		if(measuregroupstratifiercriteria.hasLanguage()) {

			m.addMsrGrpStrtfierCriteriaLnguage(String.valueOf(measuregroupstratifiercriteria.getLanguage()));
		} else {
			m.addMsrGrpStrtfierCriteriaLnguage("NULL");
		}

		if(measuregroupstratifieri == measuregroupstratifierlist.size()-1) {m.addMsrGrpStrtfierCriteriaLnguage("]]");}


		/******************** Msr_Grp_Strtfier_Criteria_Dscrptn ********************************************************************************/
		if(measuregroupstratifieri == 0) {m.addMsrGrpStrtfierCriteriaDscrptn("[[");}
		if(measuregroupstratifiercriteria.hasDescription()) {

			m.addMsrGrpStrtfierCriteriaDscrptn(String.valueOf(measuregroupstratifiercriteria.getDescription()));
		} else {
			m.addMsrGrpStrtfierCriteriaDscrptn("NULL");
		}

		if(measuregroupstratifieri == measuregroupstratifierlist.size()-1) {m.addMsrGrpStrtfierCriteriaDscrptn("]]");}


		/******************** Msr_Grp_Strtfier_Criteria_Exprsn ********************************************************************************/
		if(measuregroupstratifieri == 0) {m.addMsrGrpStrtfierCriteriaExprsn("[[");}
		if(measuregroupstratifiercriteria.hasExpression()) {

			m.addMsrGrpStrtfierCriteriaExprsn(String.valueOf(measuregroupstratifiercriteria.getExpression()));
		} else {
			m.addMsrGrpStrtfierCriteriaExprsn("NULL");
		}

		if(measuregroupstratifieri == measuregroupstratifierlist.size()-1) {m.addMsrGrpStrtfierCriteriaExprsn("]]");}


		/******************** measuregroupstratifiercomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent> measuregroupstratifiercomponentlist = measuregroupstratifier.getComponent();
		for(int measuregroupstratifiercomponenti = 0; measuregroupstratifiercomponenti<measuregroupstratifiercomponentlist.size();measuregroupstratifiercomponenti++ ) {
		org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent  measuregroupstratifiercomponent = measuregroupstratifiercomponentlist.get(measuregroupstratifiercomponenti);

		/******************** measuregroupstratifiercomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupstratifiercomponentcode = measuregroupstratifiercomponent.getCode();

		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Txt ********************************************************************************/
		if(measuregroupstratifiercomponenti == 0) {m.addMsrGrpStrtfierCmpntCdTxt("[[[");}
		if(measuregroupstratifiercomponentcode.hasText()) {

			m.addMsrGrpStrtfierCmpntCdTxt(String.valueOf(measuregroupstratifiercomponentcode.getText()));
		} else {
			m.addMsrGrpStrtfierCmpntCdTxt("NULL");
		}

		if(measuregroupstratifiercomponenti == measuregroupstratifiercomponentlist.size()-1) {m.addMsrGrpStrtfierCmpntCdTxt("]]]");}


		/******************** measuregroupstratifiercomponentcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuregroupstratifiercomponentcodecodinglist = measuregroupstratifiercomponentcode.getCoding();
		for(int measuregroupstratifiercomponentcodecodingi = 0; measuregroupstratifiercomponentcodecodingi<measuregroupstratifiercomponentcodecodinglist.size();measuregroupstratifiercomponentcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuregroupstratifiercomponentcodecoding = measuregroupstratifiercomponentcodecodinglist.get(measuregroupstratifiercomponentcodecodingi);

		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregroupstratifiercomponentcodecodingi == 0) {m.addMsrGrpStrtfierCmpntCdCdgDsply("[[[[");}
		if(measuregroupstratifiercomponentcodecoding.hasDisplay()) {

			m.addMsrGrpStrtfierCmpntCdCdgDsply(String.valueOf(measuregroupstratifiercomponentcodecoding.getDisplay()));
		} else {
			m.addMsrGrpStrtfierCmpntCdCdgDsply("NULL");
		}

		if(measuregroupstratifiercomponentcodecodingi == measuregroupstratifiercomponentcodecodinglist.size()-1) {m.addMsrGrpStrtfierCmpntCdCdgDsply("]]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregroupstratifiercomponentcodecodingi == 0) {m.addMsrGrpStrtfierCmpntCdCdgVrsn("[[[[");}
		if(measuregroupstratifiercomponentcodecoding.hasVersion()) {

			m.addMsrGrpStrtfierCmpntCdCdgVrsn(String.valueOf(measuregroupstratifiercomponentcodecoding.getVersion()));
		} else {
			m.addMsrGrpStrtfierCmpntCdCdgVrsn("NULL");
		}

		if(measuregroupstratifiercomponentcodecodingi == measuregroupstratifiercomponentcodecodinglist.size()-1) {m.addMsrGrpStrtfierCmpntCdCdgVrsn("]]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(measuregroupstratifiercomponentcodecodingi == 0) {m.addMsrGrpStrtfierCmpntCdCdgCd("[[[[");}
		if(measuregroupstratifiercomponentcodecoding.hasCode()) {

			m.addMsrGrpStrtfierCmpntCdCdgCd(String.valueOf(measuregroupstratifiercomponentcodecoding.getCode()));
		} else {
			m.addMsrGrpStrtfierCmpntCdCdgCd("NULL");
		}

		if(measuregroupstratifiercomponentcodecodingi == measuregroupstratifiercomponentcodecodinglist.size()-1) {m.addMsrGrpStrtfierCmpntCdCdgCd("]]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregroupstratifiercomponentcodecodingi == 0) {m.addMsrGrpStrtfierCmpntCdCdgUsrSltd("[[[[");}
		if(measuregroupstratifiercomponentcodecoding.hasUserSelected()) {

			m.addMsrGrpStrtfierCmpntCdCdgUsrSltd(String.valueOf(measuregroupstratifiercomponentcodecoding.getUserSelected()));
		} else {
			m.addMsrGrpStrtfierCmpntCdCdgUsrSltd("NULL");
		}

		if(measuregroupstratifiercomponentcodecodingi == measuregroupstratifiercomponentcodecodinglist.size()-1) {m.addMsrGrpStrtfierCmpntCdCdgUsrSltd("]]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(measuregroupstratifiercomponentcodecodingi == 0) {m.addMsrGrpStrtfierCmpntCdCdgSys("[[[[");}
		if(measuregroupstratifiercomponentcodecoding.hasSystem()) {

			m.addMsrGrpStrtfierCmpntCdCdgSys(String.valueOf(measuregroupstratifiercomponentcodecoding.getSystem()));
		} else {
			m.addMsrGrpStrtfierCmpntCdCdgSys("NULL");
		}

		if(measuregroupstratifiercomponentcodecodingi == measuregroupstratifiercomponentcodecodinglist.size()-1) {m.addMsrGrpStrtfierCmpntCdCdgSys("]]]]");}


		 };
		/******************** Msr_Grp_Strtfier_Cmpnt_Dscrptn ********************************************************************************/
		if(measuregroupstratifiercomponenti == 0) {m.addMsrGrpStrtfierCmpntDscrptn("[[[");}
		if(measuregroupstratifiercomponent.hasDescription()) {

			m.addMsrGrpStrtfierCmpntDscrptn(String.valueOf(measuregroupstratifiercomponent.getDescription()));
		} else {
			m.addMsrGrpStrtfierCmpntDscrptn("NULL");
		}

		if(measuregroupstratifiercomponenti == measuregroupstratifiercomponentlist.size()-1) {m.addMsrGrpStrtfierCmpntDscrptn("]]]");}


		/******************** measuregroupstratifiercomponentcriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregroupstratifiercomponentcriteria = measuregroupstratifiercomponent.getCriteria();

		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Nm ********************************************************************************/
		if(measuregroupstratifiercomponenti == 0) {m.addMsrGrpStrtfierCmpntCriteriaNm("[[[");}
		if(measuregroupstratifiercomponentcriteria.hasName()) {

			m.addMsrGrpStrtfierCmpntCriteriaNm(String.valueOf(measuregroupstratifiercomponentcriteria.getName()));
		} else {
			m.addMsrGrpStrtfierCmpntCriteriaNm("NULL");
		}

		if(measuregroupstratifiercomponenti == measuregroupstratifiercomponentlist.size()-1) {m.addMsrGrpStrtfierCmpntCriteriaNm("]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Rfrnc ********************************************************************************/
		if(measuregroupstratifiercomponenti == 0) {m.addMsrGrpStrtfierCmpntCriteriaRfrnc("[[[");}
		if(measuregroupstratifiercomponentcriteria.hasReference()) {

			m.addMsrGrpStrtfierCmpntCriteriaRfrnc(String.valueOf(measuregroupstratifiercomponentcriteria.getReference()));
		} else {
			m.addMsrGrpStrtfierCmpntCriteriaRfrnc("NULL");
		}

		if(measuregroupstratifiercomponenti == measuregroupstratifiercomponentlist.size()-1) {m.addMsrGrpStrtfierCmpntCriteriaRfrnc("]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Lnguage ********************************************************************************/
		if(measuregroupstratifiercomponenti == 0) {m.addMsrGrpStrtfierCmpntCriteriaLnguage("[[[");}
		if(measuregroupstratifiercomponentcriteria.hasLanguage()) {

			m.addMsrGrpStrtfierCmpntCriteriaLnguage(String.valueOf(measuregroupstratifiercomponentcriteria.getLanguage()));
		} else {
			m.addMsrGrpStrtfierCmpntCriteriaLnguage("NULL");
		}

		if(measuregroupstratifiercomponenti == measuregroupstratifiercomponentlist.size()-1) {m.addMsrGrpStrtfierCmpntCriteriaLnguage("]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Dscrptn ********************************************************************************/
		if(measuregroupstratifiercomponenti == 0) {m.addMsrGrpStrtfierCmpntCriteriaDscrptn("[[[");}
		if(measuregroupstratifiercomponentcriteria.hasDescription()) {

			m.addMsrGrpStrtfierCmpntCriteriaDscrptn(String.valueOf(measuregroupstratifiercomponentcriteria.getDescription()));
		} else {
			m.addMsrGrpStrtfierCmpntCriteriaDscrptn("NULL");
		}

		if(measuregroupstratifiercomponenti == measuregroupstratifiercomponentlist.size()-1) {m.addMsrGrpStrtfierCmpntCriteriaDscrptn("]]]");}


		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Exprsn ********************************************************************************/
		if(measuregroupstratifiercomponenti == 0) {m.addMsrGrpStrtfierCmpntCriteriaExprsn("[[[");}
		if(measuregroupstratifiercomponentcriteria.hasExpression()) {

			m.addMsrGrpStrtfierCmpntCriteriaExprsn(String.valueOf(measuregroupstratifiercomponentcriteria.getExpression()));
		} else {
			m.addMsrGrpStrtfierCmpntCriteriaExprsn("NULL");
		}

		if(measuregroupstratifiercomponenti == measuregroupstratifiercomponentlist.size()-1) {m.addMsrGrpStrtfierCmpntCriteriaExprsn("]]]");}


		 };
		 };
		/******************** measuregrouppopulation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent> measuregrouppopulationlist = measuregroup.getPopulation();
		for(int measuregrouppopulationi = 0; measuregrouppopulationi<measuregrouppopulationlist.size();measuregrouppopulationi++ ) {
		org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent  measuregrouppopulation = measuregrouppopulationlist.get(measuregrouppopulationi);

		/******************** measuregrouppopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregrouppopulationcode = measuregrouppopulation.getCode();

		/******************** Msr_Grp_Popln_Cd_Txt ********************************************************************************/
		if(measuregrouppopulationi == 0) {m.addMsrGrpPoplnCdTxt("[[");}
		if(measuregrouppopulationcode.hasText()) {

			m.addMsrGrpPoplnCdTxt(String.valueOf(measuregrouppopulationcode.getText()));
		} else {
			m.addMsrGrpPoplnCdTxt("NULL");
		}

		if(measuregrouppopulationi == measuregrouppopulationlist.size()-1) {m.addMsrGrpPoplnCdTxt("]]");}


		/******************** measuregrouppopulationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuregrouppopulationcodecodinglist = measuregrouppopulationcode.getCoding();
		for(int measuregrouppopulationcodecodingi = 0; measuregrouppopulationcodecodingi<measuregrouppopulationcodecodinglist.size();measuregrouppopulationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuregrouppopulationcodecoding = measuregrouppopulationcodecodinglist.get(measuregrouppopulationcodecodingi);

		/******************** Msr_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregrouppopulationcodecodingi == 0) {m.addMsrGrpPoplnCdCdgDsply("[[[");}
		if(measuregrouppopulationcodecoding.hasDisplay()) {

			m.addMsrGrpPoplnCdCdgDsply(String.valueOf(measuregrouppopulationcodecoding.getDisplay()));
		} else {
			m.addMsrGrpPoplnCdCdgDsply("NULL");
		}

		if(measuregrouppopulationcodecodingi == measuregrouppopulationcodecodinglist.size()-1) {m.addMsrGrpPoplnCdCdgDsply("]]]");}


		/******************** Msr_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregrouppopulationcodecodingi == 0) {m.addMsrGrpPoplnCdCdgVrsn("[[[");}
		if(measuregrouppopulationcodecoding.hasVersion()) {

			m.addMsrGrpPoplnCdCdgVrsn(String.valueOf(measuregrouppopulationcodecoding.getVersion()));
		} else {
			m.addMsrGrpPoplnCdCdgVrsn("NULL");
		}

		if(measuregrouppopulationcodecodingi == measuregrouppopulationcodecodinglist.size()-1) {m.addMsrGrpPoplnCdCdgVrsn("]]]");}


		/******************** Msr_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(measuregrouppopulationcodecodingi == 0) {m.addMsrGrpPoplnCdCdgCd("[[[");}
		if(measuregrouppopulationcodecoding.hasCode()) {

			m.addMsrGrpPoplnCdCdgCd(String.valueOf(measuregrouppopulationcodecoding.getCode()));
		} else {
			m.addMsrGrpPoplnCdCdgCd("NULL");
		}

		if(measuregrouppopulationcodecodingi == measuregrouppopulationcodecodinglist.size()-1) {m.addMsrGrpPoplnCdCdgCd("]]]");}


		/******************** Msr_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregrouppopulationcodecodingi == 0) {m.addMsrGrpPoplnCdCdgUsrSltd("[[[");}
		if(measuregrouppopulationcodecoding.hasUserSelected()) {

			m.addMsrGrpPoplnCdCdgUsrSltd(String.valueOf(measuregrouppopulationcodecoding.getUserSelected()));
		} else {
			m.addMsrGrpPoplnCdCdgUsrSltd("NULL");
		}

		if(measuregrouppopulationcodecodingi == measuregrouppopulationcodecodinglist.size()-1) {m.addMsrGrpPoplnCdCdgUsrSltd("]]]");}


		/******************** Msr_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(measuregrouppopulationcodecodingi == 0) {m.addMsrGrpPoplnCdCdgSys("[[[");}
		if(measuregrouppopulationcodecoding.hasSystem()) {

			m.addMsrGrpPoplnCdCdgSys(String.valueOf(measuregrouppopulationcodecoding.getSystem()));
		} else {
			m.addMsrGrpPoplnCdCdgSys("NULL");
		}

		if(measuregrouppopulationcodecodingi == measuregrouppopulationcodecodinglist.size()-1) {m.addMsrGrpPoplnCdCdgSys("]]]");}


		 };
		/******************** Msr_Grp_Popln_Dscrptn ********************************************************************************/
		if(measuregrouppopulationi == 0) {m.addMsrGrpPoplnDscrptn("[[");}
		if(measuregrouppopulation.hasDescription()) {

			m.addMsrGrpPoplnDscrptn(String.valueOf(measuregrouppopulation.getDescription()));
		} else {
			m.addMsrGrpPoplnDscrptn("NULL");
		}

		if(measuregrouppopulationi == measuregrouppopulationlist.size()-1) {m.addMsrGrpPoplnDscrptn("]]");}


		/******************** measuregrouppopulationcriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregrouppopulationcriteria = measuregrouppopulation.getCriteria();

		/******************** Msr_Grp_Popln_Criteria_Nm ********************************************************************************/
		if(measuregrouppopulationi == 0) {m.addMsrGrpPoplnCriteriaNm("[[");}
		if(measuregrouppopulationcriteria.hasName()) {

			m.addMsrGrpPoplnCriteriaNm(String.valueOf(measuregrouppopulationcriteria.getName()));
		} else {
			m.addMsrGrpPoplnCriteriaNm("NULL");
		}

		if(measuregrouppopulationi == measuregrouppopulationlist.size()-1) {m.addMsrGrpPoplnCriteriaNm("]]");}


		/******************** Msr_Grp_Popln_Criteria_Rfrnc ********************************************************************************/
		if(measuregrouppopulationi == 0) {m.addMsrGrpPoplnCriteriaRfrnc("[[");}
		if(measuregrouppopulationcriteria.hasReference()) {

			m.addMsrGrpPoplnCriteriaRfrnc(String.valueOf(measuregrouppopulationcriteria.getReference()));
		} else {
			m.addMsrGrpPoplnCriteriaRfrnc("NULL");
		}

		if(measuregrouppopulationi == measuregrouppopulationlist.size()-1) {m.addMsrGrpPoplnCriteriaRfrnc("]]");}


		/******************** Msr_Grp_Popln_Criteria_Lnguage ********************************************************************************/
		if(measuregrouppopulationi == 0) {m.addMsrGrpPoplnCriteriaLnguage("[[");}
		if(measuregrouppopulationcriteria.hasLanguage()) {

			m.addMsrGrpPoplnCriteriaLnguage(String.valueOf(measuregrouppopulationcriteria.getLanguage()));
		} else {
			m.addMsrGrpPoplnCriteriaLnguage("NULL");
		}

		if(measuregrouppopulationi == measuregrouppopulationlist.size()-1) {m.addMsrGrpPoplnCriteriaLnguage("]]");}


		/******************** Msr_Grp_Popln_Criteria_Dscrptn ********************************************************************************/
		if(measuregrouppopulationi == 0) {m.addMsrGrpPoplnCriteriaDscrptn("[[");}
		if(measuregrouppopulationcriteria.hasDescription()) {

			m.addMsrGrpPoplnCriteriaDscrptn(String.valueOf(measuregrouppopulationcriteria.getDescription()));
		} else {
			m.addMsrGrpPoplnCriteriaDscrptn("NULL");
		}

		if(measuregrouppopulationi == measuregrouppopulationlist.size()-1) {m.addMsrGrpPoplnCriteriaDscrptn("]]");}


		/******************** Msr_Grp_Popln_Criteria_Exprsn ********************************************************************************/
		if(measuregrouppopulationi == 0) {m.addMsrGrpPoplnCriteriaExprsn("[[");}
		if(measuregrouppopulationcriteria.hasExpression()) {

			m.addMsrGrpPoplnCriteriaExprsn(String.valueOf(measuregrouppopulationcriteria.getExpression()));
		} else {
			m.addMsrGrpPoplnCriteriaExprsn("NULL");
		}

		if(measuregrouppopulationi == measuregrouppopulationlist.size()-1) {m.addMsrGrpPoplnCriteriaExprsn("]]");}


		 };
		 };
		/******************** Msr_Dt ********************************************************************************/
		if(measure.hasDate()) {

			m.addMsrDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measure.getDate())+"\"");
		} else {
			m.addMsrDt("NULL");
		}


		/******************** measurestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus measurestatus = measure.getStatus();
		if(measurestatus!=null) {
			m.addMsrSts(measurestatus.toCode());
		} else {
			m.addMsrSts("NULL");
		}

		/******************** Msr_Dscrptn ********************************************************************************/
		if(measure.hasDescription()) {

			m.addMsrDscrptn(String.valueOf(measure.getDescription()));
		} else {
			m.addMsrDscrptn("NULL");
		}


		/******************** measureidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> measureidentifierlist = measure.getIdentifier();
		for(int measureidentifieri = 0; measureidentifieri<measureidentifierlist.size();measureidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  measureidentifier = measureidentifierlist.get(measureidentifieri);

		/******************** Msr_Id_Vl ********************************************************************************/
		if(measureidentifieri == 0) {m.addMsrIdVl("[");}
		if(measureidentifier.hasValue()) {

			m.addMsrIdVl(String.valueOf(measureidentifier.getValue()));
		} else {
			m.addMsrIdVl("NULL");
		}

		if(measureidentifieri == measureidentifierlist.size()-1) {m.addMsrIdVl("]");}


		/******************** measureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureidentifiertype = measureidentifier.getType();

		/******************** Msr_Id_Typ_Txt ********************************************************************************/
		if(measureidentifieri == 0) {m.addMsrIdTypTxt("[");}
		if(measureidentifiertype.hasText()) {

			m.addMsrIdTypTxt(String.valueOf(measureidentifiertype.getText()));
		} else {
			m.addMsrIdTypTxt("NULL");
		}

		if(measureidentifieri == measureidentifierlist.size()-1) {m.addMsrIdTypTxt("]");}


		/******************** measureidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measureidentifiertypecodinglist = measureidentifiertype.getCoding();
		for(int measureidentifiertypecodingi = 0; measureidentifiertypecodingi<measureidentifiertypecodinglist.size();measureidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measureidentifiertypecoding = measureidentifiertypecodinglist.get(measureidentifiertypecodingi);

		/******************** Msr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(measureidentifiertypecodingi == 0) {m.addMsrIdTypCdgDsply("[[");}
		if(measureidentifiertypecoding.hasDisplay()) {

			m.addMsrIdTypCdgDsply(String.valueOf(measureidentifiertypecoding.getDisplay()));
		} else {
			m.addMsrIdTypCdgDsply("NULL");
		}

		if(measureidentifiertypecodingi == measureidentifiertypecodinglist.size()-1) {m.addMsrIdTypCdgDsply("]]");}


		/******************** Msr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(measureidentifiertypecodingi == 0) {m.addMsrIdTypCdgVrsn("[[");}
		if(measureidentifiertypecoding.hasVersion()) {

			m.addMsrIdTypCdgVrsn(String.valueOf(measureidentifiertypecoding.getVersion()));
		} else {
			m.addMsrIdTypCdgVrsn("NULL");
		}

		if(measureidentifiertypecodingi == measureidentifiertypecodinglist.size()-1) {m.addMsrIdTypCdgVrsn("]]");}


		/******************** Msr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(measureidentifiertypecodingi == 0) {m.addMsrIdTypCdgCd("[[");}
		if(measureidentifiertypecoding.hasCode()) {

			m.addMsrIdTypCdgCd(String.valueOf(measureidentifiertypecoding.getCode()));
		} else {
			m.addMsrIdTypCdgCd("NULL");
		}

		if(measureidentifiertypecodingi == measureidentifiertypecodinglist.size()-1) {m.addMsrIdTypCdgCd("]]");}


		/******************** Msr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(measureidentifiertypecodingi == 0) {m.addMsrIdTypCdgUsrSltd("[[");}
		if(measureidentifiertypecoding.hasUserSelected()) {

			m.addMsrIdTypCdgUsrSltd(String.valueOf(measureidentifiertypecoding.getUserSelected()));
		} else {
			m.addMsrIdTypCdgUsrSltd("NULL");
		}

		if(measureidentifiertypecodingi == measureidentifiertypecodinglist.size()-1) {m.addMsrIdTypCdgUsrSltd("]]");}


		/******************** Msr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(measureidentifiertypecodingi == 0) {m.addMsrIdTypCdgSys("[[");}
		if(measureidentifiertypecoding.hasSystem()) {

			m.addMsrIdTypCdgSys(String.valueOf(measureidentifiertypecoding.getSystem()));
		} else {
			m.addMsrIdTypCdgSys("NULL");
		}

		if(measureidentifiertypecodingi == measureidentifiertypecodinglist.size()-1) {m.addMsrIdTypCdgSys("]]");}


		 };
		/******************** measureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureidentifierperiod = measureidentifier.getPeriod();

		/******************** Msr_Id_Prd_Strt ********************************************************************************/
		if(measureidentifieri == 0) {m.addMsrIdPrdStrt("[");}
		if(measureidentifierperiod.hasStart()) {

			m.addMsrIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureidentifierperiod.getStart())+"\"");
		} else {
			m.addMsrIdPrdStrt("NULL");
		}

		if(measureidentifieri == measureidentifierlist.size()-1) {m.addMsrIdPrdStrt("]");}


		/******************** Msr_Id_Prd_End ********************************************************************************/
		if(measureidentifieri == 0) {m.addMsrIdPrdEnd("[");}
		if(measureidentifierperiod.hasEnd()) {

			m.addMsrIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureidentifierperiod.getEnd())+"\"");
		} else {
			m.addMsrIdPrdEnd("NULL");
		}

		if(measureidentifieri == measureidentifierlist.size()-1) {m.addMsrIdPrdEnd("]");}


		/******************** measureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse measureidentifieruse = measureidentifier.getUse();
		if(measureidentifieruse!=null) {
		if(measureidentifieri == 0) {

		m.addMsrIdUse("[");		}
			m.addMsrIdUse(measureidentifieruse.toCode());
		if(measureidentifieri == measureidentifierlist.size()-1) {

		m.addMsrIdUse("]");		}

		} else {
			m.addMsrIdUse("NULL");
		}

		/******************** Msr_Id_Assigner ********************************************************************************/
		if(measureidentifieri == 0) {m.addMsrIdAssigner("[");}
		if(measureidentifier.hasAssigner()) {

			if(measureidentifier.getAssigner().getReference() != null) {
			m.addMsrIdAssigner(measureidentifier.getAssigner().getReference());
			}
		} else {
			m.addMsrIdAssigner("NULL");
		}

		if(measureidentifieri == measureidentifierlist.size()-1) {m.addMsrIdAssigner("]");}


		/******************** Msr_Id_Sys ********************************************************************************/
		if(measureidentifieri == 0) {m.addMsrIdSys("[");}
		if(measureidentifier.hasSystem()) {

			m.addMsrIdSys(String.valueOf(measureidentifier.getSystem()));
		} else {
			m.addMsrIdSys("NULL");
		}

		if(measureidentifieri == measureidentifierlist.size()-1) {m.addMsrIdSys("]");}


		 };
		/******************** measurecontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> measurecontactlist = measure.getContact();
		for(int measurecontacti = 0; measurecontacti<measurecontactlist.size();measurecontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  measurecontact = measurecontactlist.get(measurecontacti);

		/******************** Msr_Cntct_Nm ********************************************************************************/
		if(measurecontacti == 0) {m.addMsrCntctNm("[");}
		if(measurecontact.hasName()) {

			m.addMsrCntctNm(String.valueOf(measurecontact.getName()));
		} else {
			m.addMsrCntctNm("NULL");
		}

		if(measurecontacti == measurecontactlist.size()-1) {m.addMsrCntctNm("]");}


		/******************** measurecontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> measurecontacttelecomlist = measurecontact.getTelecom();
		for(int measurecontacttelecomi = 0; measurecontacttelecomi<measurecontacttelecomlist.size();measurecontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  measurecontacttelecom = measurecontacttelecomlist.get(measurecontacttelecomi);

		/******************** Msr_Cntct_Tlcm_Vl ********************************************************************************/
		if(measurecontacttelecomi == 0) {m.addMsrCntctTlcmVl("[[");}
		if(measurecontacttelecom.hasValue()) {

			m.addMsrCntctTlcmVl(String.valueOf(measurecontacttelecom.getValue()));
		} else {
			m.addMsrCntctTlcmVl("NULL");
		}

		if(measurecontacttelecomi == measurecontacttelecomlist.size()-1) {m.addMsrCntctTlcmVl("]]");}


		/******************** measurecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurecontacttelecomperiod = measurecontacttelecom.getPeriod();

		/******************** Msr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(measurecontacttelecomi == 0) {m.addMsrCntctTlcmPrdStrt("[[");}
		if(measurecontacttelecomperiod.hasStart()) {

			m.addMsrCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurecontacttelecomperiod.getStart())+"\"");
		} else {
			m.addMsrCntctTlcmPrdStrt("NULL");
		}

		if(measurecontacttelecomi == measurecontacttelecomlist.size()-1) {m.addMsrCntctTlcmPrdStrt("]]");}


		/******************** Msr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(measurecontacttelecomi == 0) {m.addMsrCntctTlcmPrdEnd("[[");}
		if(measurecontacttelecomperiod.hasEnd()) {

			m.addMsrCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurecontacttelecomperiod.getEnd())+"\"");
		} else {
			m.addMsrCntctTlcmPrdEnd("NULL");
		}

		if(measurecontacttelecomi == measurecontacttelecomlist.size()-1) {m.addMsrCntctTlcmPrdEnd("]]");}


		/******************** measurecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measurecontacttelecomuse = measurecontacttelecom.getUse();
		if(measurecontacttelecomuse!=null) {
		if(measurecontacttelecomi == 0) {

		m.addMsrCntctTlcmUse("[[");		}
			m.addMsrCntctTlcmUse(measurecontacttelecomuse.toCode());
		if(measurecontacttelecomi == measurecontacttelecomlist.size()-1) {

		m.addMsrCntctTlcmUse("]]");		}

		} else {
			m.addMsrCntctTlcmUse("NULL");
		}

		/******************** measurecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measurecontacttelecomsystem = measurecontacttelecom.getSystem();
		if(measurecontacttelecomsystem!=null) {
		if(measurecontacttelecomi == 0) {

		m.addMsrCntctTlcmSys("[[");		}
			m.addMsrCntctTlcmSys(measurecontacttelecomsystem.toCode());
		if(measurecontacttelecomi == measurecontacttelecomlist.size()-1) {

		m.addMsrCntctTlcmSys("]]");		}

		} else {
			m.addMsrCntctTlcmSys("NULL");
		}

		/******************** Msr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(measurecontacttelecomi == 0) {m.addMsrCntctTlcmRnk("[[");}
		if(measurecontacttelecom.hasRank()) {

			m.addMsrCntctTlcmRnk(String.valueOf(measurecontacttelecom.getRank()));
		} else {
			m.addMsrCntctTlcmRnk("NULL");
		}

		if(measurecontacttelecomi == measurecontacttelecomlist.size()-1) {m.addMsrCntctTlcmRnk("]]");}


		 };
		 };
		/******************** measureimprovementnotation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureimprovementnotation = measure.getImprovementNotation();

		/******************** Msr_ImprovementNotation_Txt ********************************************************************************/
		if(measureimprovementnotation.hasText()) {

			m.addMsrImprovementNotationTxt(String.valueOf(measureimprovementnotation.getText()));
		} else {
			m.addMsrImprovementNotationTxt("NULL");
		}


		/******************** measureimprovementnotationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measureimprovementnotationcodinglist = measureimprovementnotation.getCoding();
		for(int measureimprovementnotationcodingi = 0; measureimprovementnotationcodingi<measureimprovementnotationcodinglist.size();measureimprovementnotationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measureimprovementnotationcoding = measureimprovementnotationcodinglist.get(measureimprovementnotationcodingi);

		/******************** Msr_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(measureimprovementnotationcodingi == 0) {m.addMsrImprovementNotationCdgDsply("[");}
		if(measureimprovementnotationcoding.hasDisplay()) {

			m.addMsrImprovementNotationCdgDsply(String.valueOf(measureimprovementnotationcoding.getDisplay()));
		} else {
			m.addMsrImprovementNotationCdgDsply("NULL");
		}

		if(measureimprovementnotationcodingi == measureimprovementnotationcodinglist.size()-1) {m.addMsrImprovementNotationCdgDsply("]");}


		/******************** Msr_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(measureimprovementnotationcodingi == 0) {m.addMsrImprovementNotationCdgVrsn("[");}
		if(measureimprovementnotationcoding.hasVersion()) {

			m.addMsrImprovementNotationCdgVrsn(String.valueOf(measureimprovementnotationcoding.getVersion()));
		} else {
			m.addMsrImprovementNotationCdgVrsn("NULL");
		}

		if(measureimprovementnotationcodingi == measureimprovementnotationcodinglist.size()-1) {m.addMsrImprovementNotationCdgVrsn("]");}


		/******************** Msr_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(measureimprovementnotationcodingi == 0) {m.addMsrImprovementNotationCdgCd("[");}
		if(measureimprovementnotationcoding.hasCode()) {

			m.addMsrImprovementNotationCdgCd(String.valueOf(measureimprovementnotationcoding.getCode()));
		} else {
			m.addMsrImprovementNotationCdgCd("NULL");
		}

		if(measureimprovementnotationcodingi == measureimprovementnotationcodinglist.size()-1) {m.addMsrImprovementNotationCdgCd("]");}


		/******************** Msr_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(measureimprovementnotationcodingi == 0) {m.addMsrImprovementNotationCdgUsrSltd("[");}
		if(measureimprovementnotationcoding.hasUserSelected()) {

			m.addMsrImprovementNotationCdgUsrSltd(String.valueOf(measureimprovementnotationcoding.getUserSelected()));
		} else {
			m.addMsrImprovementNotationCdgUsrSltd("NULL");
		}

		if(measureimprovementnotationcodingi == measureimprovementnotationcodinglist.size()-1) {m.addMsrImprovementNotationCdgUsrSltd("]");}


		/******************** Msr_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(measureimprovementnotationcodingi == 0) {m.addMsrImprovementNotationCdgSys("[");}
		if(measureimprovementnotationcoding.hasSystem()) {

			m.addMsrImprovementNotationCdgSys(String.valueOf(measureimprovementnotationcoding.getSystem()));
		} else {
			m.addMsrImprovementNotationCdgSys("NULL");
		}

		if(measureimprovementnotationcodingi == measureimprovementnotationcodinglist.size()-1) {m.addMsrImprovementNotationCdgSys("]");}


		 };
		/******************** Msr_Copyright ********************************************************************************/
		if(measure.hasCopyright()) {

			m.addMsrCopyright(String.valueOf(measure.getCopyright()));
		} else {
			m.addMsrCopyright("NULL");
		}


		/******************** Msr_ApprovalDt ********************************************************************************/
		if(measure.hasApprovalDate()) {

			m.addMsrApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measure.getApprovalDate())+"\"");
		} else {
			m.addMsrApprovalDt("NULL");
		}


		/******************** measureendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> measureendorserlist = measure.getEndorser();
		for(int measureendorseri = 0; measureendorseri<measureendorserlist.size();measureendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  measureendorser = measureendorserlist.get(measureendorseri);

		/******************** Msr_Endsr_Nm ********************************************************************************/
		if(measureendorseri == 0) {m.addMsrEndsrNm("[");}
		if(measureendorser.hasName()) {

			m.addMsrEndsrNm(String.valueOf(measureendorser.getName()));
		} else {
			m.addMsrEndsrNm("NULL");
		}

		if(measureendorseri == measureendorserlist.size()-1) {m.addMsrEndsrNm("]");}


		/******************** measureendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> measureendorsertelecomlist = measureendorser.getTelecom();
		for(int measureendorsertelecomi = 0; measureendorsertelecomi<measureendorsertelecomlist.size();measureendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  measureendorsertelecom = measureendorsertelecomlist.get(measureendorsertelecomi);

		/******************** Msr_Endsr_Tlcm_Vl ********************************************************************************/
		if(measureendorsertelecomi == 0) {m.addMsrEndsrTlcmVl("[[");}
		if(measureendorsertelecom.hasValue()) {

			m.addMsrEndsrTlcmVl(String.valueOf(measureendorsertelecom.getValue()));
		} else {
			m.addMsrEndsrTlcmVl("NULL");
		}

		if(measureendorsertelecomi == measureendorsertelecomlist.size()-1) {m.addMsrEndsrTlcmVl("]]");}


		/******************** measureendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureendorsertelecomperiod = measureendorsertelecom.getPeriod();

		/******************** Msr_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(measureendorsertelecomi == 0) {m.addMsrEndsrTlcmPrdStrt("[[");}
		if(measureendorsertelecomperiod.hasStart()) {

			m.addMsrEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureendorsertelecomperiod.getStart())+"\"");
		} else {
			m.addMsrEndsrTlcmPrdStrt("NULL");
		}

		if(measureendorsertelecomi == measureendorsertelecomlist.size()-1) {m.addMsrEndsrTlcmPrdStrt("]]");}


		/******************** Msr_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(measureendorsertelecomi == 0) {m.addMsrEndsrTlcmPrdEnd("[[");}
		if(measureendorsertelecomperiod.hasEnd()) {

			m.addMsrEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureendorsertelecomperiod.getEnd())+"\"");
		} else {
			m.addMsrEndsrTlcmPrdEnd("NULL");
		}

		if(measureendorsertelecomi == measureendorsertelecomlist.size()-1) {m.addMsrEndsrTlcmPrdEnd("]]");}


		/******************** measureendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measureendorsertelecomuse = measureendorsertelecom.getUse();
		if(measureendorsertelecomuse!=null) {
		if(measureendorsertelecomi == 0) {

		m.addMsrEndsrTlcmUse("[[");		}
			m.addMsrEndsrTlcmUse(measureendorsertelecomuse.toCode());
		if(measureendorsertelecomi == measureendorsertelecomlist.size()-1) {

		m.addMsrEndsrTlcmUse("]]");		}

		} else {
			m.addMsrEndsrTlcmUse("NULL");
		}

		/******************** measureendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measureendorsertelecomsystem = measureendorsertelecom.getSystem();
		if(measureendorsertelecomsystem!=null) {
		if(measureendorsertelecomi == 0) {

		m.addMsrEndsrTlcmSys("[[");		}
			m.addMsrEndsrTlcmSys(measureendorsertelecomsystem.toCode());
		if(measureendorsertelecomi == measureendorsertelecomlist.size()-1) {

		m.addMsrEndsrTlcmSys("]]");		}

		} else {
			m.addMsrEndsrTlcmSys("NULL");
		}

		/******************** Msr_Endsr_Tlcm_Rnk ********************************************************************************/
		if(measureendorsertelecomi == 0) {m.addMsrEndsrTlcmRnk("[[");}
		if(measureendorsertelecom.hasRank()) {

			m.addMsrEndsrTlcmRnk(String.valueOf(measureendorsertelecom.getRank()));
		} else {
			m.addMsrEndsrTlcmRnk("NULL");
		}

		if(measureendorsertelecomi == measureendorsertelecomlist.size()-1) {m.addMsrEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** Msr_LastReviewDt ********************************************************************************/
		if(measure.hasLastReviewDate()) {

			m.addMsrLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measure.getLastReviewDate())+"\"");
		} else {
			m.addMsrLastReviewDt("NULL");
		}


		/******************** measureeditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> measureeditorlist = measure.getEditor();
		for(int measureeditori = 0; measureeditori<measureeditorlist.size();measureeditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  measureeditor = measureeditorlist.get(measureeditori);

		/******************** Msr_Editor_Nm ********************************************************************************/
		if(measureeditori == 0) {m.addMsrEditorNm("[");}
		if(measureeditor.hasName()) {

			m.addMsrEditorNm(String.valueOf(measureeditor.getName()));
		} else {
			m.addMsrEditorNm("NULL");
		}

		if(measureeditori == measureeditorlist.size()-1) {m.addMsrEditorNm("]");}


		/******************** measureeditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> measureeditortelecomlist = measureeditor.getTelecom();
		for(int measureeditortelecomi = 0; measureeditortelecomi<measureeditortelecomlist.size();measureeditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  measureeditortelecom = measureeditortelecomlist.get(measureeditortelecomi);

		/******************** Msr_Editor_Tlcm_Vl ********************************************************************************/
		if(measureeditortelecomi == 0) {m.addMsrEditorTlcmVl("[[");}
		if(measureeditortelecom.hasValue()) {

			m.addMsrEditorTlcmVl(String.valueOf(measureeditortelecom.getValue()));
		} else {
			m.addMsrEditorTlcmVl("NULL");
		}

		if(measureeditortelecomi == measureeditortelecomlist.size()-1) {m.addMsrEditorTlcmVl("]]");}


		/******************** measureeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureeditortelecomperiod = measureeditortelecom.getPeriod();

		/******************** Msr_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(measureeditortelecomi == 0) {m.addMsrEditorTlcmPrdStrt("[[");}
		if(measureeditortelecomperiod.hasStart()) {

			m.addMsrEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureeditortelecomperiod.getStart())+"\"");
		} else {
			m.addMsrEditorTlcmPrdStrt("NULL");
		}

		if(measureeditortelecomi == measureeditortelecomlist.size()-1) {m.addMsrEditorTlcmPrdStrt("]]");}


		/******************** Msr_Editor_Tlcm_Prd_End ********************************************************************************/
		if(measureeditortelecomi == 0) {m.addMsrEditorTlcmPrdEnd("[[");}
		if(measureeditortelecomperiod.hasEnd()) {

			m.addMsrEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureeditortelecomperiod.getEnd())+"\"");
		} else {
			m.addMsrEditorTlcmPrdEnd("NULL");
		}

		if(measureeditortelecomi == measureeditortelecomlist.size()-1) {m.addMsrEditorTlcmPrdEnd("]]");}


		/******************** measureeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measureeditortelecomuse = measureeditortelecom.getUse();
		if(measureeditortelecomuse!=null) {
		if(measureeditortelecomi == 0) {

		m.addMsrEditorTlcmUse("[[");		}
			m.addMsrEditorTlcmUse(measureeditortelecomuse.toCode());
		if(measureeditortelecomi == measureeditortelecomlist.size()-1) {

		m.addMsrEditorTlcmUse("]]");		}

		} else {
			m.addMsrEditorTlcmUse("NULL");
		}

		/******************** measureeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measureeditortelecomsystem = measureeditortelecom.getSystem();
		if(measureeditortelecomsystem!=null) {
		if(measureeditortelecomi == 0) {

		m.addMsrEditorTlcmSys("[[");		}
			m.addMsrEditorTlcmSys(measureeditortelecomsystem.toCode());
		if(measureeditortelecomi == measureeditortelecomlist.size()-1) {

		m.addMsrEditorTlcmSys("]]");		}

		} else {
			m.addMsrEditorTlcmSys("NULL");
		}

		/******************** Msr_Editor_Tlcm_Rnk ********************************************************************************/
		if(measureeditortelecomi == 0) {m.addMsrEditorTlcmRnk("[[");}
		if(measureeditortelecom.hasRank()) {

			m.addMsrEditorTlcmRnk(String.valueOf(measureeditortelecom.getRank()));
		} else {
			m.addMsrEditorTlcmRnk("NULL");
		}

		if(measureeditortelecomi == measureeditortelecomlist.size()-1) {m.addMsrEditorTlcmRnk("]]");}


		 };
		 };
		/******************** measurereviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> measurereviewerlist = measure.getReviewer();
		for(int measurerevieweri = 0; measurerevieweri<measurereviewerlist.size();measurerevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  measurereviewer = measurereviewerlist.get(measurerevieweri);

		/******************** Msr_Rviewr_Nm ********************************************************************************/
		if(measurerevieweri == 0) {m.addMsrRviewrNm("[");}
		if(measurereviewer.hasName()) {

			m.addMsrRviewrNm(String.valueOf(measurereviewer.getName()));
		} else {
			m.addMsrRviewrNm("NULL");
		}

		if(measurerevieweri == measurereviewerlist.size()-1) {m.addMsrRviewrNm("]");}


		/******************** measurereviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> measurereviewertelecomlist = measurereviewer.getTelecom();
		for(int measurereviewertelecomi = 0; measurereviewertelecomi<measurereviewertelecomlist.size();measurereviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  measurereviewertelecom = measurereviewertelecomlist.get(measurereviewertelecomi);

		/******************** Msr_Rviewr_Tlcm_Vl ********************************************************************************/
		if(measurereviewertelecomi == 0) {m.addMsrRviewrTlcmVl("[[");}
		if(measurereviewertelecom.hasValue()) {

			m.addMsrRviewrTlcmVl(String.valueOf(measurereviewertelecom.getValue()));
		} else {
			m.addMsrRviewrTlcmVl("NULL");
		}

		if(measurereviewertelecomi == measurereviewertelecomlist.size()-1) {m.addMsrRviewrTlcmVl("]]");}


		/******************** measurereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereviewertelecomperiod = measurereviewertelecom.getPeriod();

		/******************** Msr_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(measurereviewertelecomi == 0) {m.addMsrRviewrTlcmPrdStrt("[[");}
		if(measurereviewertelecomperiod.hasStart()) {

			m.addMsrRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurereviewertelecomperiod.getStart())+"\"");
		} else {
			m.addMsrRviewrTlcmPrdStrt("NULL");
		}

		if(measurereviewertelecomi == measurereviewertelecomlist.size()-1) {m.addMsrRviewrTlcmPrdStrt("]]");}


		/******************** Msr_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(measurereviewertelecomi == 0) {m.addMsrRviewrTlcmPrdEnd("[[");}
		if(measurereviewertelecomperiod.hasEnd()) {

			m.addMsrRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurereviewertelecomperiod.getEnd())+"\"");
		} else {
			m.addMsrRviewrTlcmPrdEnd("NULL");
		}

		if(measurereviewertelecomi == measurereviewertelecomlist.size()-1) {m.addMsrRviewrTlcmPrdEnd("]]");}


		/******************** measurereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measurereviewertelecomuse = measurereviewertelecom.getUse();
		if(measurereviewertelecomuse!=null) {
		if(measurereviewertelecomi == 0) {

		m.addMsrRviewrTlcmUse("[[");		}
			m.addMsrRviewrTlcmUse(measurereviewertelecomuse.toCode());
		if(measurereviewertelecomi == measurereviewertelecomlist.size()-1) {

		m.addMsrRviewrTlcmUse("]]");		}

		} else {
			m.addMsrRviewrTlcmUse("NULL");
		}

		/******************** measurereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measurereviewertelecomsystem = measurereviewertelecom.getSystem();
		if(measurereviewertelecomsystem!=null) {
		if(measurereviewertelecomi == 0) {

		m.addMsrRviewrTlcmSys("[[");		}
			m.addMsrRviewrTlcmSys(measurereviewertelecomsystem.toCode());
		if(measurereviewertelecomi == measurereviewertelecomlist.size()-1) {

		m.addMsrRviewrTlcmSys("]]");		}

		} else {
			m.addMsrRviewrTlcmSys("NULL");
		}

		/******************** Msr_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(measurereviewertelecomi == 0) {m.addMsrRviewrTlcmRnk("[[");}
		if(measurereviewertelecom.hasRank()) {

			m.addMsrRviewrTlcmRnk(String.valueOf(measurereviewertelecom.getRank()));
		} else {
			m.addMsrRviewrTlcmRnk("NULL");
		}

		if(measurereviewertelecomi == measurereviewertelecomlist.size()-1) {m.addMsrRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** Msr_Usg ********************************************************************************/
		if(measure.hasUsage()) {

			m.addMsrUsg(String.valueOf(measure.getUsage()));
		} else {
			m.addMsrUsg("NULL");
		}


		/******************** Msr_Library ********************************************************************************/
		if(measure.hasLibrary()) {

			String  array = "[";
			for(int incr=0; incr<measure.getLibrary().size(); incr++) {
				array = array + measure.getLibrary().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMsrLibrary(array);

		} else {
			m.addMsrLibrary("NULL");
		}


		/******************** Msr_SbjctRfrnc ********************************************************************************/
		if(measure.hasSubjectReference()) {

			if(measure.getSubjectReference().getReference() != null) {
			m.addMsrSbjctRfrnc(measure.getSubjectReference().getReference());
			}
		} else {
			m.addMsrSbjctRfrnc("NULL");
		}


		/******************** measuresubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresubjectcodeableconcept = measure.getSubjectCodeableConcept();

		/******************** Msr_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(measuresubjectcodeableconcept.hasText()) {

			m.addMsrSbjctCdbleCncptTxt(String.valueOf(measuresubjectcodeableconcept.getText()));
		} else {
			m.addMsrSbjctCdbleCncptTxt("NULL");
		}


		/******************** measuresubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuresubjectcodeableconceptcodinglist = measuresubjectcodeableconcept.getCoding();
		for(int measuresubjectcodeableconceptcodingi = 0; measuresubjectcodeableconceptcodingi<measuresubjectcodeableconceptcodinglist.size();measuresubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuresubjectcodeableconceptcoding = measuresubjectcodeableconceptcodinglist.get(measuresubjectcodeableconceptcodingi);

		/******************** Msr_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(measuresubjectcodeableconceptcodingi == 0) {m.addMsrSbjctCdbleCncptCdgDsply("[");}
		if(measuresubjectcodeableconceptcoding.hasDisplay()) {

			m.addMsrSbjctCdbleCncptCdgDsply(String.valueOf(measuresubjectcodeableconceptcoding.getDisplay()));
		} else {
			m.addMsrSbjctCdbleCncptCdgDsply("NULL");
		}

		if(measuresubjectcodeableconceptcodingi == measuresubjectcodeableconceptcodinglist.size()-1) {m.addMsrSbjctCdbleCncptCdgDsply("]");}


		/******************** Msr_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(measuresubjectcodeableconceptcodingi == 0) {m.addMsrSbjctCdbleCncptCdgVrsn("[");}
		if(measuresubjectcodeableconceptcoding.hasVersion()) {

			m.addMsrSbjctCdbleCncptCdgVrsn(String.valueOf(measuresubjectcodeableconceptcoding.getVersion()));
		} else {
			m.addMsrSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(measuresubjectcodeableconceptcodingi == measuresubjectcodeableconceptcodinglist.size()-1) {m.addMsrSbjctCdbleCncptCdgVrsn("]");}


		/******************** Msr_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(measuresubjectcodeableconceptcodingi == 0) {m.addMsrSbjctCdbleCncptCdgCd("[");}
		if(measuresubjectcodeableconceptcoding.hasCode()) {

			m.addMsrSbjctCdbleCncptCdgCd(String.valueOf(measuresubjectcodeableconceptcoding.getCode()));
		} else {
			m.addMsrSbjctCdbleCncptCdgCd("NULL");
		}

		if(measuresubjectcodeableconceptcodingi == measuresubjectcodeableconceptcodinglist.size()-1) {m.addMsrSbjctCdbleCncptCdgCd("]");}


		/******************** Msr_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(measuresubjectcodeableconceptcodingi == 0) {m.addMsrSbjctCdbleCncptCdgUsrSltd("[");}
		if(measuresubjectcodeableconceptcoding.hasUserSelected()) {

			m.addMsrSbjctCdbleCncptCdgUsrSltd(String.valueOf(measuresubjectcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMsrSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(measuresubjectcodeableconceptcodingi == measuresubjectcodeableconceptcodinglist.size()-1) {m.addMsrSbjctCdbleCncptCdgUsrSltd("]");}


		/******************** Msr_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(measuresubjectcodeableconceptcodingi == 0) {m.addMsrSbjctCdbleCncptCdgSys("[");}
		if(measuresubjectcodeableconceptcoding.hasSystem()) {

			m.addMsrSbjctCdbleCncptCdgSys(String.valueOf(measuresubjectcodeableconceptcoding.getSystem()));
		} else {
			m.addMsrSbjctCdbleCncptCdgSys("NULL");
		}

		if(measuresubjectcodeableconceptcodingi == measuresubjectcodeableconceptcodinglist.size()-1) {m.addMsrSbjctCdbleCncptCdgSys("]");}


		 };
		/******************** measuresupplementaldata ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent> measuresupplementaldatalist = measure.getSupplementalData();
		for(int measuresupplementaldatai = 0; measuresupplementaldatai<measuresupplementaldatalist.size();measuresupplementaldatai++ ) {
		org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent  measuresupplementaldata = measuresupplementaldatalist.get(measuresupplementaldatai);

		/******************** measuresupplementaldatacode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresupplementaldatacode = measuresupplementaldata.getCode();

		/******************** Msr_SupplementalData_Cd_Txt ********************************************************************************/
		if(measuresupplementaldatai == 0) {m.addMsrSupplementalDataCdTxt("[");}
		if(measuresupplementaldatacode.hasText()) {

			m.addMsrSupplementalDataCdTxt(String.valueOf(measuresupplementaldatacode.getText()));
		} else {
			m.addMsrSupplementalDataCdTxt("NULL");
		}

		if(measuresupplementaldatai == measuresupplementaldatalist.size()-1) {m.addMsrSupplementalDataCdTxt("]");}


		/******************** measuresupplementaldatacodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuresupplementaldatacodecodinglist = measuresupplementaldatacode.getCoding();
		for(int measuresupplementaldatacodecodingi = 0; measuresupplementaldatacodecodingi<measuresupplementaldatacodecodinglist.size();measuresupplementaldatacodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuresupplementaldatacodecoding = measuresupplementaldatacodecodinglist.get(measuresupplementaldatacodecodingi);

		/******************** Msr_SupplementalData_Cd_Cdg_Dsply ********************************************************************************/
		if(measuresupplementaldatacodecodingi == 0) {m.addMsrSupplementalDataCdCdgDsply("[[");}
		if(measuresupplementaldatacodecoding.hasDisplay()) {

			m.addMsrSupplementalDataCdCdgDsply(String.valueOf(measuresupplementaldatacodecoding.getDisplay()));
		} else {
			m.addMsrSupplementalDataCdCdgDsply("NULL");
		}

		if(measuresupplementaldatacodecodingi == measuresupplementaldatacodecodinglist.size()-1) {m.addMsrSupplementalDataCdCdgDsply("]]");}


		/******************** Msr_SupplementalData_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuresupplementaldatacodecodingi == 0) {m.addMsrSupplementalDataCdCdgVrsn("[[");}
		if(measuresupplementaldatacodecoding.hasVersion()) {

			m.addMsrSupplementalDataCdCdgVrsn(String.valueOf(measuresupplementaldatacodecoding.getVersion()));
		} else {
			m.addMsrSupplementalDataCdCdgVrsn("NULL");
		}

		if(measuresupplementaldatacodecodingi == measuresupplementaldatacodecodinglist.size()-1) {m.addMsrSupplementalDataCdCdgVrsn("]]");}


		/******************** Msr_SupplementalData_Cd_Cdg_Cd ********************************************************************************/
		if(measuresupplementaldatacodecodingi == 0) {m.addMsrSupplementalDataCdCdgCd("[[");}
		if(measuresupplementaldatacodecoding.hasCode()) {

			m.addMsrSupplementalDataCdCdgCd(String.valueOf(measuresupplementaldatacodecoding.getCode()));
		} else {
			m.addMsrSupplementalDataCdCdgCd("NULL");
		}

		if(measuresupplementaldatacodecodingi == measuresupplementaldatacodecodinglist.size()-1) {m.addMsrSupplementalDataCdCdgCd("]]");}


		/******************** Msr_SupplementalData_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuresupplementaldatacodecodingi == 0) {m.addMsrSupplementalDataCdCdgUsrSltd("[[");}
		if(measuresupplementaldatacodecoding.hasUserSelected()) {

			m.addMsrSupplementalDataCdCdgUsrSltd(String.valueOf(measuresupplementaldatacodecoding.getUserSelected()));
		} else {
			m.addMsrSupplementalDataCdCdgUsrSltd("NULL");
		}

		if(measuresupplementaldatacodecodingi == measuresupplementaldatacodecodinglist.size()-1) {m.addMsrSupplementalDataCdCdgUsrSltd("]]");}


		/******************** Msr_SupplementalData_Cd_Cdg_Sys ********************************************************************************/
		if(measuresupplementaldatacodecodingi == 0) {m.addMsrSupplementalDataCdCdgSys("[[");}
		if(measuresupplementaldatacodecoding.hasSystem()) {

			m.addMsrSupplementalDataCdCdgSys(String.valueOf(measuresupplementaldatacodecoding.getSystem()));
		} else {
			m.addMsrSupplementalDataCdCdgSys("NULL");
		}

		if(measuresupplementaldatacodecodingi == measuresupplementaldatacodecodinglist.size()-1) {m.addMsrSupplementalDataCdCdgSys("]]");}


		 };
		/******************** Msr_SupplementalData_Dscrptn ********************************************************************************/
		if(measuresupplementaldatai == 0) {m.addMsrSupplementalDataDscrptn("[");}
		if(measuresupplementaldata.hasDescription()) {

			m.addMsrSupplementalDataDscrptn(String.valueOf(measuresupplementaldata.getDescription()));
		} else {
			m.addMsrSupplementalDataDscrptn("NULL");
		}

		if(measuresupplementaldatai == measuresupplementaldatalist.size()-1) {m.addMsrSupplementalDataDscrptn("]");}


		/******************** measuresupplementaldatacriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuresupplementaldatacriteria = measuresupplementaldata.getCriteria();

		/******************** Msr_SupplementalData_Criteria_Nm ********************************************************************************/
		if(measuresupplementaldatai == 0) {m.addMsrSupplementalDataCriteriaNm("[");}
		if(measuresupplementaldatacriteria.hasName()) {

			m.addMsrSupplementalDataCriteriaNm(String.valueOf(measuresupplementaldatacriteria.getName()));
		} else {
			m.addMsrSupplementalDataCriteriaNm("NULL");
		}

		if(measuresupplementaldatai == measuresupplementaldatalist.size()-1) {m.addMsrSupplementalDataCriteriaNm("]");}


		/******************** Msr_SupplementalData_Criteria_Rfrnc ********************************************************************************/
		if(measuresupplementaldatai == 0) {m.addMsrSupplementalDataCriteriaRfrnc("[");}
		if(measuresupplementaldatacriteria.hasReference()) {

			m.addMsrSupplementalDataCriteriaRfrnc(String.valueOf(measuresupplementaldatacriteria.getReference()));
		} else {
			m.addMsrSupplementalDataCriteriaRfrnc("NULL");
		}

		if(measuresupplementaldatai == measuresupplementaldatalist.size()-1) {m.addMsrSupplementalDataCriteriaRfrnc("]");}


		/******************** Msr_SupplementalData_Criteria_Lnguage ********************************************************************************/
		if(measuresupplementaldatai == 0) {m.addMsrSupplementalDataCriteriaLnguage("[");}
		if(measuresupplementaldatacriteria.hasLanguage()) {

			m.addMsrSupplementalDataCriteriaLnguage(String.valueOf(measuresupplementaldatacriteria.getLanguage()));
		} else {
			m.addMsrSupplementalDataCriteriaLnguage("NULL");
		}

		if(measuresupplementaldatai == measuresupplementaldatalist.size()-1) {m.addMsrSupplementalDataCriteriaLnguage("]");}


		/******************** Msr_SupplementalData_Criteria_Dscrptn ********************************************************************************/
		if(measuresupplementaldatai == 0) {m.addMsrSupplementalDataCriteriaDscrptn("[");}
		if(measuresupplementaldatacriteria.hasDescription()) {

			m.addMsrSupplementalDataCriteriaDscrptn(String.valueOf(measuresupplementaldatacriteria.getDescription()));
		} else {
			m.addMsrSupplementalDataCriteriaDscrptn("NULL");
		}

		if(measuresupplementaldatai == measuresupplementaldatalist.size()-1) {m.addMsrSupplementalDataCriteriaDscrptn("]");}


		/******************** Msr_SupplementalData_Criteria_Exprsn ********************************************************************************/
		if(measuresupplementaldatai == 0) {m.addMsrSupplementalDataCriteriaExprsn("[");}
		if(measuresupplementaldatacriteria.hasExpression()) {

			m.addMsrSupplementalDataCriteriaExprsn(String.valueOf(measuresupplementaldatacriteria.getExpression()));
		} else {
			m.addMsrSupplementalDataCriteriaExprsn("NULL");
		}

		if(measuresupplementaldatai == measuresupplementaldatalist.size()-1) {m.addMsrSupplementalDataCriteriaExprsn("]");}


		/******************** measuresupplementaldatausage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> measuresupplementaldatausagelist = measuresupplementaldata.getUsage();
		for(int measuresupplementaldatausagei = 0; measuresupplementaldatausagei<measuresupplementaldatausagelist.size();measuresupplementaldatausagei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  measuresupplementaldatausage = measuresupplementaldatausagelist.get(measuresupplementaldatausagei);

		/******************** Msr_SupplementalData_Usg_Txt ********************************************************************************/
		if(measuresupplementaldatausagei == 0) {m.addMsrSupplementalDataUsgTxt("[[");}
		if(measuresupplementaldatausage.hasText()) {

			m.addMsrSupplementalDataUsgTxt(String.valueOf(measuresupplementaldatausage.getText()));
		} else {
			m.addMsrSupplementalDataUsgTxt("NULL");
		}

		if(measuresupplementaldatausagei == measuresupplementaldatausagelist.size()-1) {m.addMsrSupplementalDataUsgTxt("]]");}


		/******************** measuresupplementaldatausagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuresupplementaldatausagecodinglist = measuresupplementaldatausage.getCoding();
		for(int measuresupplementaldatausagecodingi = 0; measuresupplementaldatausagecodingi<measuresupplementaldatausagecodinglist.size();measuresupplementaldatausagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuresupplementaldatausagecoding = measuresupplementaldatausagecodinglist.get(measuresupplementaldatausagecodingi);

		/******************** Msr_SupplementalData_Usg_Cdg_Dsply ********************************************************************************/
		if(measuresupplementaldatausagecodingi == 0) {m.addMsrSupplementalDataUsgCdgDsply("[[[");}
		if(measuresupplementaldatausagecoding.hasDisplay()) {

			m.addMsrSupplementalDataUsgCdgDsply(String.valueOf(measuresupplementaldatausagecoding.getDisplay()));
		} else {
			m.addMsrSupplementalDataUsgCdgDsply("NULL");
		}

		if(measuresupplementaldatausagecodingi == measuresupplementaldatausagecodinglist.size()-1) {m.addMsrSupplementalDataUsgCdgDsply("]]]");}


		/******************** Msr_SupplementalData_Usg_Cdg_Vrsn ********************************************************************************/
		if(measuresupplementaldatausagecodingi == 0) {m.addMsrSupplementalDataUsgCdgVrsn("[[[");}
		if(measuresupplementaldatausagecoding.hasVersion()) {

			m.addMsrSupplementalDataUsgCdgVrsn(String.valueOf(measuresupplementaldatausagecoding.getVersion()));
		} else {
			m.addMsrSupplementalDataUsgCdgVrsn("NULL");
		}

		if(measuresupplementaldatausagecodingi == measuresupplementaldatausagecodinglist.size()-1) {m.addMsrSupplementalDataUsgCdgVrsn("]]]");}


		/******************** Msr_SupplementalData_Usg_Cdg_Cd ********************************************************************************/
		if(measuresupplementaldatausagecodingi == 0) {m.addMsrSupplementalDataUsgCdgCd("[[[");}
		if(measuresupplementaldatausagecoding.hasCode()) {

			m.addMsrSupplementalDataUsgCdgCd(String.valueOf(measuresupplementaldatausagecoding.getCode()));
		} else {
			m.addMsrSupplementalDataUsgCdgCd("NULL");
		}

		if(measuresupplementaldatausagecodingi == measuresupplementaldatausagecodinglist.size()-1) {m.addMsrSupplementalDataUsgCdgCd("]]]");}


		/******************** Msr_SupplementalData_Usg_Cdg_UsrSltd ********************************************************************************/
		if(measuresupplementaldatausagecodingi == 0) {m.addMsrSupplementalDataUsgCdgUsrSltd("[[[");}
		if(measuresupplementaldatausagecoding.hasUserSelected()) {

			m.addMsrSupplementalDataUsgCdgUsrSltd(String.valueOf(measuresupplementaldatausagecoding.getUserSelected()));
		} else {
			m.addMsrSupplementalDataUsgCdgUsrSltd("NULL");
		}

		if(measuresupplementaldatausagecodingi == measuresupplementaldatausagecodinglist.size()-1) {m.addMsrSupplementalDataUsgCdgUsrSltd("]]]");}


		/******************** Msr_SupplementalData_Usg_Cdg_Sys ********************************************************************************/
		if(measuresupplementaldatausagecodingi == 0) {m.addMsrSupplementalDataUsgCdgSys("[[[");}
		if(measuresupplementaldatausagecoding.hasSystem()) {

			m.addMsrSupplementalDataUsgCdgSys(String.valueOf(measuresupplementaldatausagecoding.getSystem()));
		} else {
			m.addMsrSupplementalDataUsgCdgSys("NULL");
		}

		if(measuresupplementaldatausagecodingi == measuresupplementaldatausagecodinglist.size()-1) {m.addMsrSupplementalDataUsgCdgSys("]]]");}


		 };
		 };
		 };
		/******************** measurecompositescoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurecompositescoring = measure.getCompositeScoring();

		/******************** Msr_CompositeScoring_Txt ********************************************************************************/
		if(measurecompositescoring.hasText()) {

			m.addMsrCompositeScoringTxt(String.valueOf(measurecompositescoring.getText()));
		} else {
			m.addMsrCompositeScoringTxt("NULL");
		}


		/******************** measurecompositescoringcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurecompositescoringcodinglist = measurecompositescoring.getCoding();
		for(int measurecompositescoringcodingi = 0; measurecompositescoringcodingi<measurecompositescoringcodinglist.size();measurecompositescoringcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurecompositescoringcoding = measurecompositescoringcodinglist.get(measurecompositescoringcodingi);

		/******************** Msr_CompositeScoring_Cdg_Dsply ********************************************************************************/
		if(measurecompositescoringcodingi == 0) {m.addMsrCompositeScoringCdgDsply("[");}
		if(measurecompositescoringcoding.hasDisplay()) {

			m.addMsrCompositeScoringCdgDsply(String.valueOf(measurecompositescoringcoding.getDisplay()));
		} else {
			m.addMsrCompositeScoringCdgDsply("NULL");
		}

		if(measurecompositescoringcodingi == measurecompositescoringcodinglist.size()-1) {m.addMsrCompositeScoringCdgDsply("]");}


		/******************** Msr_CompositeScoring_Cdg_Vrsn ********************************************************************************/
		if(measurecompositescoringcodingi == 0) {m.addMsrCompositeScoringCdgVrsn("[");}
		if(measurecompositescoringcoding.hasVersion()) {

			m.addMsrCompositeScoringCdgVrsn(String.valueOf(measurecompositescoringcoding.getVersion()));
		} else {
			m.addMsrCompositeScoringCdgVrsn("NULL");
		}

		if(measurecompositescoringcodingi == measurecompositescoringcodinglist.size()-1) {m.addMsrCompositeScoringCdgVrsn("]");}


		/******************** Msr_CompositeScoring_Cdg_Cd ********************************************************************************/
		if(measurecompositescoringcodingi == 0) {m.addMsrCompositeScoringCdgCd("[");}
		if(measurecompositescoringcoding.hasCode()) {

			m.addMsrCompositeScoringCdgCd(String.valueOf(measurecompositescoringcoding.getCode()));
		} else {
			m.addMsrCompositeScoringCdgCd("NULL");
		}

		if(measurecompositescoringcodingi == measurecompositescoringcodinglist.size()-1) {m.addMsrCompositeScoringCdgCd("]");}


		/******************** Msr_CompositeScoring_Cdg_UsrSltd ********************************************************************************/
		if(measurecompositescoringcodingi == 0) {m.addMsrCompositeScoringCdgUsrSltd("[");}
		if(measurecompositescoringcoding.hasUserSelected()) {

			m.addMsrCompositeScoringCdgUsrSltd(String.valueOf(measurecompositescoringcoding.getUserSelected()));
		} else {
			m.addMsrCompositeScoringCdgUsrSltd("NULL");
		}

		if(measurecompositescoringcodingi == measurecompositescoringcodinglist.size()-1) {m.addMsrCompositeScoringCdgUsrSltd("]");}


		/******************** Msr_CompositeScoring_Cdg_Sys ********************************************************************************/
		if(measurecompositescoringcodingi == 0) {m.addMsrCompositeScoringCdgSys("[");}
		if(measurecompositescoringcoding.hasSystem()) {

			m.addMsrCompositeScoringCdgSys(String.valueOf(measurecompositescoringcoding.getSystem()));
		} else {
			m.addMsrCompositeScoringCdgSys("NULL");
		}

		if(measurecompositescoringcodingi == measurecompositescoringcodinglist.size()-1) {m.addMsrCompositeScoringCdgSys("]");}


		 };
		/******************** Msr_ClnclRecmndationStmnt ********************************************************************************/
		if(measure.hasClinicalRecommendationStatement()) {

			m.addMsrClnclRecmndationStmnt(String.valueOf(measure.getClinicalRecommendationStatement()));
		} else {
			m.addMsrClnclRecmndationStmnt("NULL");
		}


		/******************** Msr_Ttl ********************************************************************************/
		if(measure.hasTitle()) {

			m.addMsrTtl(String.valueOf(measure.getTitle()));
		} else {
			m.addMsrTtl("NULL");
		}


		/******************** measurerelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> measurerelatedartifactlist = measure.getRelatedArtifact();
		for(int measurerelatedartifacti = 0; measurerelatedartifacti<measurerelatedartifactlist.size();measurerelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  measurerelatedartifact = measurerelatedartifactlist.get(measurerelatedartifacti);

		/******************** Msr_RltedArtfct_Rsrc ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctRsrc("[");}
		if(measurerelatedartifact.hasResource()) {

			m.addMsrRltedArtfctRsrc(String.valueOf(measurerelatedartifact.getResource()));
		} else {
			m.addMsrRltedArtfctRsrc("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctRsrc("]");}


		/******************** measurerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType measurerelatedartifacttype = measurerelatedartifact.getType();
		if(measurerelatedartifacttype!=null) {
		if(measurerelatedartifacti == 0) {

		m.addMsrRltedArtfctTyp("[");		}
			m.addMsrRltedArtfctTyp(measurerelatedartifacttype.toCode());
		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {

		m.addMsrRltedArtfctTyp("]");		}

		} else {
			m.addMsrRltedArtfctTyp("NULL");
		}

		/******************** Msr_RltedArtfct_Url ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctUrl("[");}
		if(measurerelatedartifact.hasUrl()) {

			m.addMsrRltedArtfctUrl(String.valueOf(measurerelatedartifact.getUrl()));
		} else {
			m.addMsrRltedArtfctUrl("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctUrl("]");}


		/******************** Msr_RltedArtfct_Citation ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctCitation("[");}
		if(measurerelatedartifact.hasCitation()) {

			m.addMsrRltedArtfctCitation(String.valueOf(measurerelatedartifact.getCitation()));
		} else {
			m.addMsrRltedArtfctCitation("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctCitation("]");}


		/******************** Msr_RltedArtfct_Lbl ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctLbl("[");}
		if(measurerelatedartifact.hasLabel()) {

			m.addMsrRltedArtfctLbl(String.valueOf(measurerelatedartifact.getLabel()));
		} else {
			m.addMsrRltedArtfctLbl("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctLbl("]");}


		/******************** measurerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment measurerelatedartifactdocument = measurerelatedartifact.getDocument();

		/******************** Msr_RltedArtfct_Doc_Sz ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocSz("[");}
		if(measurerelatedartifactdocument.hasSize()) {

			m.addMsrRltedArtfctDocSz(String.valueOf(measurerelatedartifactdocument.getSize()));
		} else {
			m.addMsrRltedArtfctDocSz("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocSz("]");}


		/******************** Msr_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocLnguage("[");}
		if(measurerelatedartifactdocument.hasLanguage()) {

			m.addMsrRltedArtfctDocLnguage(String.valueOf(measurerelatedartifactdocument.getLanguage()));
		} else {
			m.addMsrRltedArtfctDocLnguage("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocLnguage("]");}


		/******************** Msr_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocCntntTyp("[");}
		if(measurerelatedartifactdocument.hasContentType()) {

			m.addMsrRltedArtfctDocCntntTyp(String.valueOf(measurerelatedartifactdocument.getContentType()));
		} else {
			m.addMsrRltedArtfctDocCntntTyp("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocCntntTyp("]");}


		/******************** Msr_RltedArtfct_Doc_Hash ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocHash("[");}
		if(measurerelatedartifactdocument.hasHash()) {

			m.addMsrRltedArtfctDocHash(new String(measurerelatedartifactdocument.getHash()));
		} else {
			m.addMsrRltedArtfctDocHash("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocHash("]");}


		/******************** Msr_RltedArtfct_Doc_Data ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocData("[");}
		if(measurerelatedartifactdocument.hasData()) {

			m.addMsrRltedArtfctDocData(new String(measurerelatedartifactdocument.getData()));
		} else {
			m.addMsrRltedArtfctDocData("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocData("]");}


		/******************** Msr_RltedArtfct_Doc_Creation ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocCreation("[");}
		if(measurerelatedartifactdocument.hasCreation()) {

			m.addMsrRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurerelatedartifactdocument.getCreation())+"\"");
		} else {
			m.addMsrRltedArtfctDocCreation("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocCreation("]");}


		/******************** Msr_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocTtl("[");}
		if(measurerelatedartifactdocument.hasTitle()) {

			m.addMsrRltedArtfctDocTtl(String.valueOf(measurerelatedartifactdocument.getTitle()));
		} else {
			m.addMsrRltedArtfctDocTtl("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocTtl("]");}


		/******************** Msr_RltedArtfct_Doc_Url ********************************************************************************/
		if(measurerelatedartifacti == 0) {m.addMsrRltedArtfctDocUrl("[");}
		if(measurerelatedartifactdocument.hasUrl()) {

			m.addMsrRltedArtfctDocUrl(String.valueOf(measurerelatedartifactdocument.getUrl()));
		} else {
			m.addMsrRltedArtfctDocUrl("NULL");
		}

		if(measurerelatedartifacti == measurerelatedartifactlist.size()-1) {m.addMsrRltedArtfctDocUrl("]");}


		 };
		/******************** Msr_Prpse ********************************************************************************/
		if(measure.hasPurpose()) {

			m.addMsrPrpse(String.valueOf(measure.getPurpose()));
		} else {
			m.addMsrPrpse("NULL");
		}


		/******************** Msr_Url ********************************************************************************/
		if(measure.hasUrl()) {

			m.addMsrUrl(String.valueOf(measure.getUrl()));
		} else {
			m.addMsrUrl("NULL");
		}


		/******************** Msr_Subtitle ********************************************************************************/
		if(measure.hasSubtitle()) {

			m.addMsrSubtitle(String.valueOf(measure.getSubtitle()));
		} else {
			m.addMsrSubtitle("NULL");
		}


		/******************** measuretopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> measuretopiclist = measure.getTopic();
		for(int measuretopici = 0; measuretopici<measuretopiclist.size();measuretopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  measuretopic = measuretopiclist.get(measuretopici);

		/******************** Msr_Topic_Txt ********************************************************************************/
		if(measuretopici == 0) {m.addMsrTopicTxt("[");}
		if(measuretopic.hasText()) {

			m.addMsrTopicTxt(String.valueOf(measuretopic.getText()));
		} else {
			m.addMsrTopicTxt("NULL");
		}

		if(measuretopici == measuretopiclist.size()-1) {m.addMsrTopicTxt("]");}


		/******************** measuretopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measuretopiccodinglist = measuretopic.getCoding();
		for(int measuretopiccodingi = 0; measuretopiccodingi<measuretopiccodinglist.size();measuretopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measuretopiccoding = measuretopiccodinglist.get(measuretopiccodingi);

		/******************** Msr_Topic_Cdg_Dsply ********************************************************************************/
		if(measuretopiccodingi == 0) {m.addMsrTopicCdgDsply("[[");}
		if(measuretopiccoding.hasDisplay()) {

			m.addMsrTopicCdgDsply(String.valueOf(measuretopiccoding.getDisplay()));
		} else {
			m.addMsrTopicCdgDsply("NULL");
		}

		if(measuretopiccodingi == measuretopiccodinglist.size()-1) {m.addMsrTopicCdgDsply("]]");}


		/******************** Msr_Topic_Cdg_Vrsn ********************************************************************************/
		if(measuretopiccodingi == 0) {m.addMsrTopicCdgVrsn("[[");}
		if(measuretopiccoding.hasVersion()) {

			m.addMsrTopicCdgVrsn(String.valueOf(measuretopiccoding.getVersion()));
		} else {
			m.addMsrTopicCdgVrsn("NULL");
		}

		if(measuretopiccodingi == measuretopiccodinglist.size()-1) {m.addMsrTopicCdgVrsn("]]");}


		/******************** Msr_Topic_Cdg_Cd ********************************************************************************/
		if(measuretopiccodingi == 0) {m.addMsrTopicCdgCd("[[");}
		if(measuretopiccoding.hasCode()) {

			m.addMsrTopicCdgCd(String.valueOf(measuretopiccoding.getCode()));
		} else {
			m.addMsrTopicCdgCd("NULL");
		}

		if(measuretopiccodingi == measuretopiccodinglist.size()-1) {m.addMsrTopicCdgCd("]]");}


		/******************** Msr_Topic_Cdg_UsrSltd ********************************************************************************/
		if(measuretopiccodingi == 0) {m.addMsrTopicCdgUsrSltd("[[");}
		if(measuretopiccoding.hasUserSelected()) {

			m.addMsrTopicCdgUsrSltd(String.valueOf(measuretopiccoding.getUserSelected()));
		} else {
			m.addMsrTopicCdgUsrSltd("NULL");
		}

		if(measuretopiccodingi == measuretopiccodinglist.size()-1) {m.addMsrTopicCdgUsrSltd("]]");}


		/******************** Msr_Topic_Cdg_Sys ********************************************************************************/
		if(measuretopiccodingi == 0) {m.addMsrTopicCdgSys("[[");}
		if(measuretopiccoding.hasSystem()) {

			m.addMsrTopicCdgSys(String.valueOf(measuretopiccoding.getSystem()));
		} else {
			m.addMsrTopicCdgSys("NULL");
		}

		if(measuretopiccodingi == measuretopiccodinglist.size()-1) {m.addMsrTopicCdgSys("]]");}


		 };
		 };
		/******************** measurejurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> measurejurisdictionlist = measure.getJurisdiction();
		for(int measurejurisdictioni = 0; measurejurisdictioni<measurejurisdictionlist.size();measurejurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  measurejurisdiction = measurejurisdictionlist.get(measurejurisdictioni);

		/******************** Msr_Jrsdctn_Txt ********************************************************************************/
		if(measurejurisdictioni == 0) {m.addMsrJrsdctnTxt("[");}
		if(measurejurisdiction.hasText()) {

			m.addMsrJrsdctnTxt(String.valueOf(measurejurisdiction.getText()));
		} else {
			m.addMsrJrsdctnTxt("NULL");
		}

		if(measurejurisdictioni == measurejurisdictionlist.size()-1) {m.addMsrJrsdctnTxt("]");}


		/******************** measurejurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurejurisdictioncodinglist = measurejurisdiction.getCoding();
		for(int measurejurisdictioncodingi = 0; measurejurisdictioncodingi<measurejurisdictioncodinglist.size();measurejurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurejurisdictioncoding = measurejurisdictioncodinglist.get(measurejurisdictioncodingi);

		/******************** Msr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(measurejurisdictioncodingi == 0) {m.addMsrJrsdctnCdgDsply("[[");}
		if(measurejurisdictioncoding.hasDisplay()) {

			m.addMsrJrsdctnCdgDsply(String.valueOf(measurejurisdictioncoding.getDisplay()));
		} else {
			m.addMsrJrsdctnCdgDsply("NULL");
		}

		if(measurejurisdictioncodingi == measurejurisdictioncodinglist.size()-1) {m.addMsrJrsdctnCdgDsply("]]");}


		/******************** Msr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(measurejurisdictioncodingi == 0) {m.addMsrJrsdctnCdgVrsn("[[");}
		if(measurejurisdictioncoding.hasVersion()) {

			m.addMsrJrsdctnCdgVrsn(String.valueOf(measurejurisdictioncoding.getVersion()));
		} else {
			m.addMsrJrsdctnCdgVrsn("NULL");
		}

		if(measurejurisdictioncodingi == measurejurisdictioncodinglist.size()-1) {m.addMsrJrsdctnCdgVrsn("]]");}


		/******************** Msr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(measurejurisdictioncodingi == 0) {m.addMsrJrsdctnCdgCd("[[");}
		if(measurejurisdictioncoding.hasCode()) {

			m.addMsrJrsdctnCdgCd(String.valueOf(measurejurisdictioncoding.getCode()));
		} else {
			m.addMsrJrsdctnCdgCd("NULL");
		}

		if(measurejurisdictioncodingi == measurejurisdictioncodinglist.size()-1) {m.addMsrJrsdctnCdgCd("]]");}


		/******************** Msr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(measurejurisdictioncodingi == 0) {m.addMsrJrsdctnCdgUsrSltd("[[");}
		if(measurejurisdictioncoding.hasUserSelected()) {

			m.addMsrJrsdctnCdgUsrSltd(String.valueOf(measurejurisdictioncoding.getUserSelected()));
		} else {
			m.addMsrJrsdctnCdgUsrSltd("NULL");
		}

		if(measurejurisdictioncodingi == measurejurisdictioncodinglist.size()-1) {m.addMsrJrsdctnCdgUsrSltd("]]");}


		/******************** Msr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(measurejurisdictioncodingi == 0) {m.addMsrJrsdctnCdgSys("[[");}
		if(measurejurisdictioncoding.hasSystem()) {

			m.addMsrJrsdctnCdgSys(String.valueOf(measurejurisdictioncoding.getSystem()));
		} else {
			m.addMsrJrsdctnCdgSys("NULL");
		}

		if(measurejurisdictioncodingi == measurejurisdictioncodinglist.size()-1) {m.addMsrJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** measureusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> measureusecontextlist = measure.getUseContext();
		for(int measureusecontexti = 0; measureusecontexti<measureusecontextlist.size();measureusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  measureusecontext = measureusecontextlist.get(measureusecontexti);

		/******************** measureusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureusecontextcode = measureusecontext.getCode();

		/******************** Msr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtCdDsply("[");}
		if(measureusecontextcode.hasDisplay()) {

			m.addMsrUseCntxtCdDsply(String.valueOf(measureusecontextcode.getDisplay()));
		} else {
			m.addMsrUseCntxtCdDsply("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtCdDsply("]");}


		/******************** Msr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtCdVrsn("[");}
		if(measureusecontextcode.hasVersion()) {

			m.addMsrUseCntxtCdVrsn(String.valueOf(measureusecontextcode.getVersion()));
		} else {
			m.addMsrUseCntxtCdVrsn("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtCdVrsn("]");}


		/******************** Msr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtCdUsrSltd("[");}
		if(measureusecontextcode.hasUserSelected()) {

			m.addMsrUseCntxtCdUsrSltd(String.valueOf(measureusecontextcode.getUserSelected()));
		} else {
			m.addMsrUseCntxtCdUsrSltd("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtCdUsrSltd("]");}


		/******************** Msr_UseCntxt_Cd_Sys ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtCdSys("[");}
		if(measureusecontextcode.hasSystem()) {

			m.addMsrUseCntxtCdSys(String.valueOf(measureusecontextcode.getSystem()));
		} else {
			m.addMsrUseCntxtCdSys("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtCdSys("]");}


		/******************** Msr_UseCntxt_VlRfrnc ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRfrnc("[");}
		if(measureusecontext.hasValueReference()) {

			if(measureusecontext.getValueReference().getReference() != null) {
			m.addMsrUseCntxtVlRfrnc(measureusecontext.getValueReference().getReference());
			}
		} else {
			m.addMsrUseCntxtVlRfrnc("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRfrnc("]");}


		/******************** measureusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureusecontextvaluecodeableconcept = measureusecontext.getValueCodeableConcept();

		/******************** Msr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlCdbleCncptTxt("[");}
		if(measureusecontextvaluecodeableconcept.hasText()) {

			m.addMsrUseCntxtVlCdbleCncptTxt(String.valueOf(measureusecontextvaluecodeableconcept.getText()));
		} else {
			m.addMsrUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlCdbleCncptTxt("]");}


		/******************** measureusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measureusecontextvaluecodeableconceptcodinglist = measureusecontextvaluecodeableconcept.getCoding();
		for(int measureusecontextvaluecodeableconceptcodingi = 0; measureusecontextvaluecodeableconceptcodingi<measureusecontextvaluecodeableconceptcodinglist.size();measureusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measureusecontextvaluecodeableconceptcoding = measureusecontextvaluecodeableconceptcodinglist.get(measureusecontextvaluecodeableconceptcodingi);

		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcodingi == 0) {m.addMsrUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(measureusecontextvaluecodeableconceptcoding.hasDisplay()) {

			m.addMsrUseCntxtVlCdbleCncptCdgDsply(String.valueOf(measureusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			m.addMsrUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(measureusecontextvaluecodeableconceptcodingi == measureusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsrUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcodingi == 0) {m.addMsrUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(measureusecontextvaluecodeableconceptcoding.hasVersion()) {

			m.addMsrUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(measureusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			m.addMsrUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(measureusecontextvaluecodeableconceptcodingi == measureusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsrUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcodingi == 0) {m.addMsrUseCntxtVlCdbleCncptCdgCd("[[");}
		if(measureusecontextvaluecodeableconceptcoding.hasCode()) {

			m.addMsrUseCntxtVlCdbleCncptCdgCd(String.valueOf(measureusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			m.addMsrUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(measureusecontextvaluecodeableconceptcodingi == measureusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsrUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcodingi == 0) {m.addMsrUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(measureusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			m.addMsrUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(measureusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			m.addMsrUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(measureusecontextvaluecodeableconceptcodingi == measureusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsrUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcodingi == 0) {m.addMsrUseCntxtVlCdbleCncptCdgSys("[[");}
		if(measureusecontextvaluecodeableconceptcoding.hasSystem()) {

			m.addMsrUseCntxtVlCdbleCncptCdgSys(String.valueOf(measureusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			m.addMsrUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(measureusecontextvaluecodeableconceptcodingi == measureusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsrUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** measureusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range measureusecontextvaluerange = measureusecontext.getValueRange();

		/******************** measureusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluerangelow = measureusecontextvaluerange.getLow();

		/******************** Msr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngLwVl("[");}
		if(measureusecontextvaluerangelow.hasValue()) {

			m.addMsrUseCntxtVlRngLwVl(String.valueOf(measureusecontextvaluerangelow.getValue()));
		} else {
			m.addMsrUseCntxtVlRngLwVl("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngLwVl("]");}


		/******************** measureusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measureusecontextvaluerangelowcomparator = measureusecontextvaluerangelow.getComparator();
		if(measureusecontextvaluerangelowcomparator!=null) {
		if(measureusecontexti == 0) {

		m.addMsrUseCntxtVlRngLwCmprtr("[");		}
			m.addMsrUseCntxtVlRngLwCmprtr(measureusecontextvaluerangelowcomparator.toCode());
		if(measureusecontexti == measureusecontextlist.size()-1) {

		m.addMsrUseCntxtVlRngLwCmprtr("]");		}

		} else {
			m.addMsrUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** Msr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngLwCd("[");}
		if(measureusecontextvaluerangelow.hasCode()) {

			m.addMsrUseCntxtVlRngLwCd(String.valueOf(measureusecontextvaluerangelow.getCode()));
		} else {
			m.addMsrUseCntxtVlRngLwCd("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngLwCd("]");}


		/******************** Msr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngLwUnt("[");}
		if(measureusecontextvaluerangelow.hasUnit()) {

			m.addMsrUseCntxtVlRngLwUnt(String.valueOf(measureusecontextvaluerangelow.getUnit()));
		} else {
			m.addMsrUseCntxtVlRngLwUnt("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngLwUnt("]");}


		/******************** Msr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngLwSys("[");}
		if(measureusecontextvaluerangelow.hasSystem()) {

			m.addMsrUseCntxtVlRngLwSys(String.valueOf(measureusecontextvaluerangelow.getSystem()));
		} else {
			m.addMsrUseCntxtVlRngLwSys("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngLwSys("]");}


		/******************** measureusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluerangehigh = measureusecontextvaluerange.getHigh();

		/******************** Msr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngHiVl("[");}
		if(measureusecontextvaluerangehigh.hasValue()) {

			m.addMsrUseCntxtVlRngHiVl(String.valueOf(measureusecontextvaluerangehigh.getValue()));
		} else {
			m.addMsrUseCntxtVlRngHiVl("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngHiVl("]");}


		/******************** measureusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measureusecontextvaluerangehighcomparator = measureusecontextvaluerangehigh.getComparator();
		if(measureusecontextvaluerangehighcomparator!=null) {
		if(measureusecontexti == 0) {

		m.addMsrUseCntxtVlRngHiCmprtr("[");		}
			m.addMsrUseCntxtVlRngHiCmprtr(measureusecontextvaluerangehighcomparator.toCode());
		if(measureusecontexti == measureusecontextlist.size()-1) {

		m.addMsrUseCntxtVlRngHiCmprtr("]");		}

		} else {
			m.addMsrUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** Msr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngHiCd("[");}
		if(measureusecontextvaluerangehigh.hasCode()) {

			m.addMsrUseCntxtVlRngHiCd(String.valueOf(measureusecontextvaluerangehigh.getCode()));
		} else {
			m.addMsrUseCntxtVlRngHiCd("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngHiCd("]");}


		/******************** Msr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngHiUnt("[");}
		if(measureusecontextvaluerangehigh.hasUnit()) {

			m.addMsrUseCntxtVlRngHiUnt(String.valueOf(measureusecontextvaluerangehigh.getUnit()));
		} else {
			m.addMsrUseCntxtVlRngHiUnt("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngHiUnt("]");}


		/******************** Msr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlRngHiSys("[");}
		if(measureusecontextvaluerangehigh.hasSystem()) {

			m.addMsrUseCntxtVlRngHiSys(String.valueOf(measureusecontextvaluerangehigh.getSystem()));
		} else {
			m.addMsrUseCntxtVlRngHiSys("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlRngHiSys("]");}


		/******************** measureusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluequantity = measureusecontext.getValueQuantity();

		/******************** Msr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlQntyVl("[");}
		if(measureusecontextvaluequantity.hasValue()) {

			m.addMsrUseCntxtVlQntyVl(String.valueOf(measureusecontextvaluequantity.getValue()));
		} else {
			m.addMsrUseCntxtVlQntyVl("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlQntyVl("]");}


		/******************** measureusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measureusecontextvaluequantitycomparator = measureusecontextvaluequantity.getComparator();
		if(measureusecontextvaluequantitycomparator!=null) {
		if(measureusecontexti == 0) {

		m.addMsrUseCntxtVlQntyCmprtr("[");		}
			m.addMsrUseCntxtVlQntyCmprtr(measureusecontextvaluequantitycomparator.toCode());
		if(measureusecontexti == measureusecontextlist.size()-1) {

		m.addMsrUseCntxtVlQntyCmprtr("]");		}

		} else {
			m.addMsrUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** Msr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlQntyCd("[");}
		if(measureusecontextvaluequantity.hasCode()) {

			m.addMsrUseCntxtVlQntyCd(String.valueOf(measureusecontextvaluequantity.getCode()));
		} else {
			m.addMsrUseCntxtVlQntyCd("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlQntyCd("]");}


		/******************** Msr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlQntyUnt("[");}
		if(measureusecontextvaluequantity.hasUnit()) {

			m.addMsrUseCntxtVlQntyUnt(String.valueOf(measureusecontextvaluequantity.getUnit()));
		} else {
			m.addMsrUseCntxtVlQntyUnt("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlQntyUnt("]");}


		/******************** Msr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(measureusecontexti == 0) {m.addMsrUseCntxtVlQntySys("[");}
		if(measureusecontextvaluequantity.hasSystem()) {

			m.addMsrUseCntxtVlQntySys(String.valueOf(measureusecontextvaluequantity.getSystem()));
		} else {
			m.addMsrUseCntxtVlQntySys("NULL");
		}

		if(measureusecontexti == measureusecontextlist.size()-1) {m.addMsrUseCntxtVlQntySys("]");}


		 };
		/******************** Msr_Exprmtl ********************************************************************************/
		if(measure.hasExperimental()) {

			m.addMsrExprmtl(String.valueOf(measure.getExperimental()));
		} else {
			m.addMsrExprmtl("NULL");
		}


		/******************** Msr_Pblshr ********************************************************************************/
		if(measure.hasPublisher()) {

			m.addMsrPblshr(String.valueOf(measure.getPublisher()));
		} else {
			m.addMsrPblshr("NULL");
		}


		/******************** measureeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureeffectiveperiod = measure.getEffectivePeriod();

		/******************** Msr_EfctivePrd_Strt ********************************************************************************/
		if(measureeffectiveperiod.hasStart()) {

			m.addMsrEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureeffectiveperiod.getStart())+"\"");
		} else {
			m.addMsrEfctivePrdStrt("NULL");
		}


		/******************** Msr_EfctivePrd_End ********************************************************************************/
		if(measureeffectiveperiod.hasEnd()) {

			m.addMsrEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureeffectiveperiod.getEnd())+"\"");
		} else {
			m.addMsrEfctivePrdEnd("NULL");
		}


		/******************** Msr_Disclaimer ********************************************************************************/
		if(measure.hasDisclaimer()) {

			m.addMsrDisclaimer(String.valueOf(measure.getDisclaimer()));
		} else {
			m.addMsrDisclaimer("NULL");
		}


		/******************** Msr_RtAggregation ********************************************************************************/
		if(measure.hasRateAggregation()) {

			m.addMsrRtAggregation(String.valueOf(measure.getRateAggregation()));
		} else {
			m.addMsrRtAggregation("NULL");
		}


		/******************** Msr_RskAdjustment ********************************************************************************/
		if(measure.hasRiskAdjustment()) {

			m.addMsrRskAdjustment(String.valueOf(measure.getRiskAdjustment()));
		} else {
			m.addMsrRskAdjustment("NULL");
		}


		/******************** measurescoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurescoring = measure.getScoring();

		/******************** Msr_Scoring_Txt ********************************************************************************/
		if(measurescoring.hasText()) {

			m.addMsrScoringTxt(String.valueOf(measurescoring.getText()));
		} else {
			m.addMsrScoringTxt("NULL");
		}


		/******************** measurescoringcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurescoringcodinglist = measurescoring.getCoding();
		for(int measurescoringcodingi = 0; measurescoringcodingi<measurescoringcodinglist.size();measurescoringcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurescoringcoding = measurescoringcodinglist.get(measurescoringcodingi);

		/******************** Msr_Scoring_Cdg_Dsply ********************************************************************************/
		if(measurescoringcodingi == 0) {m.addMsrScoringCdgDsply("[");}
		if(measurescoringcoding.hasDisplay()) {

			m.addMsrScoringCdgDsply(String.valueOf(measurescoringcoding.getDisplay()));
		} else {
			m.addMsrScoringCdgDsply("NULL");
		}

		if(measurescoringcodingi == measurescoringcodinglist.size()-1) {m.addMsrScoringCdgDsply("]");}


		/******************** Msr_Scoring_Cdg_Vrsn ********************************************************************************/
		if(measurescoringcodingi == 0) {m.addMsrScoringCdgVrsn("[");}
		if(measurescoringcoding.hasVersion()) {

			m.addMsrScoringCdgVrsn(String.valueOf(measurescoringcoding.getVersion()));
		} else {
			m.addMsrScoringCdgVrsn("NULL");
		}

		if(measurescoringcodingi == measurescoringcodinglist.size()-1) {m.addMsrScoringCdgVrsn("]");}


		/******************** Msr_Scoring_Cdg_Cd ********************************************************************************/
		if(measurescoringcodingi == 0) {m.addMsrScoringCdgCd("[");}
		if(measurescoringcoding.hasCode()) {

			m.addMsrScoringCdgCd(String.valueOf(measurescoringcoding.getCode()));
		} else {
			m.addMsrScoringCdgCd("NULL");
		}

		if(measurescoringcodingi == measurescoringcodinglist.size()-1) {m.addMsrScoringCdgCd("]");}


		/******************** Msr_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(measurescoringcodingi == 0) {m.addMsrScoringCdgUsrSltd("[");}
		if(measurescoringcoding.hasUserSelected()) {

			m.addMsrScoringCdgUsrSltd(String.valueOf(measurescoringcoding.getUserSelected()));
		} else {
			m.addMsrScoringCdgUsrSltd("NULL");
		}

		if(measurescoringcodingi == measurescoringcodinglist.size()-1) {m.addMsrScoringCdgUsrSltd("]");}


		/******************** Msr_Scoring_Cdg_Sys ********************************************************************************/
		if(measurescoringcodingi == 0) {m.addMsrScoringCdgSys("[");}
		if(measurescoringcoding.hasSystem()) {

			m.addMsrScoringCdgSys(String.valueOf(measurescoringcoding.getSystem()));
		} else {
			m.addMsrScoringCdgSys("NULL");
		}

		if(measurescoringcodingi == measurescoringcodinglist.size()-1) {m.addMsrScoringCdgSys("]");}


		 };
		/******************** Msr_Rtionale ********************************************************************************/
		if(measure.hasRationale()) {

			m.addMsrRtionale(String.valueOf(measure.getRationale()));
		} else {
			m.addMsrRtionale("NULL");
		}


		/******************** Msr_Guidnce ********************************************************************************/
		if(measure.hasGuidance()) {

			m.addMsrGuidnce(String.valueOf(measure.getGuidance()));
		} else {
			m.addMsrGuidnce("NULL");
		}


		/******************** measureauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> measureauthorlist = measure.getAuthor();
		for(int measureauthori = 0; measureauthori<measureauthorlist.size();measureauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  measureauthor = measureauthorlist.get(measureauthori);

		/******************** Msr_Athr_Nm ********************************************************************************/
		if(measureauthori == 0) {m.addMsrAthrNm("[");}
		if(measureauthor.hasName()) {

			m.addMsrAthrNm(String.valueOf(measureauthor.getName()));
		} else {
			m.addMsrAthrNm("NULL");
		}

		if(measureauthori == measureauthorlist.size()-1) {m.addMsrAthrNm("]");}


		/******************** measureauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> measureauthortelecomlist = measureauthor.getTelecom();
		for(int measureauthortelecomi = 0; measureauthortelecomi<measureauthortelecomlist.size();measureauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  measureauthortelecom = measureauthortelecomlist.get(measureauthortelecomi);

		/******************** Msr_Athr_Tlcm_Vl ********************************************************************************/
		if(measureauthortelecomi == 0) {m.addMsrAthrTlcmVl("[[");}
		if(measureauthortelecom.hasValue()) {

			m.addMsrAthrTlcmVl(String.valueOf(measureauthortelecom.getValue()));
		} else {
			m.addMsrAthrTlcmVl("NULL");
		}

		if(measureauthortelecomi == measureauthortelecomlist.size()-1) {m.addMsrAthrTlcmVl("]]");}


		/******************** measureauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureauthortelecomperiod = measureauthortelecom.getPeriod();

		/******************** Msr_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(measureauthortelecomi == 0) {m.addMsrAthrTlcmPrdStrt("[[");}
		if(measureauthortelecomperiod.hasStart()) {

			m.addMsrAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureauthortelecomperiod.getStart())+"\"");
		} else {
			m.addMsrAthrTlcmPrdStrt("NULL");
		}

		if(measureauthortelecomi == measureauthortelecomlist.size()-1) {m.addMsrAthrTlcmPrdStrt("]]");}


		/******************** Msr_Athr_Tlcm_Prd_End ********************************************************************************/
		if(measureauthortelecomi == 0) {m.addMsrAthrTlcmPrdEnd("[[");}
		if(measureauthortelecomperiod.hasEnd()) {

			m.addMsrAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measureauthortelecomperiod.getEnd())+"\"");
		} else {
			m.addMsrAthrTlcmPrdEnd("NULL");
		}

		if(measureauthortelecomi == measureauthortelecomlist.size()-1) {m.addMsrAthrTlcmPrdEnd("]]");}


		/******************** measureauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measureauthortelecomuse = measureauthortelecom.getUse();
		if(measureauthortelecomuse!=null) {
		if(measureauthortelecomi == 0) {

		m.addMsrAthrTlcmUse("[[");		}
			m.addMsrAthrTlcmUse(measureauthortelecomuse.toCode());
		if(measureauthortelecomi == measureauthortelecomlist.size()-1) {

		m.addMsrAthrTlcmUse("]]");		}

		} else {
			m.addMsrAthrTlcmUse("NULL");
		}

		/******************** measureauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measureauthortelecomsystem = measureauthortelecom.getSystem();
		if(measureauthortelecomsystem!=null) {
		if(measureauthortelecomi == 0) {

		m.addMsrAthrTlcmSys("[[");		}
			m.addMsrAthrTlcmSys(measureauthortelecomsystem.toCode());
		if(measureauthortelecomi == measureauthortelecomlist.size()-1) {

		m.addMsrAthrTlcmSys("]]");		}

		} else {
			m.addMsrAthrTlcmSys("NULL");
		}

		/******************** Msr_Athr_Tlcm_Rnk ********************************************************************************/
		if(measureauthortelecomi == 0) {m.addMsrAthrTlcmRnk("[[");}
		if(measureauthortelecom.hasRank()) {

			m.addMsrAthrTlcmRnk(String.valueOf(measureauthortelecom.getRank()));
		} else {
			m.addMsrAthrTlcmRnk("NULL");
		}

		if(measureauthortelecomi == measureauthortelecomlist.size()-1) {m.addMsrAthrTlcmRnk("]]");}


		 };
		 };
		return m;
	}
}
