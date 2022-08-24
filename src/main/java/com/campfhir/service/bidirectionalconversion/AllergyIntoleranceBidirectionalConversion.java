package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AllergyIntolerance;
public class AllergyIntoleranceBidirectionalConversion 
{
	public AllergyIntolerance AllergyIntolerances(org.hl7.fhir.r4.model.AllergyIntolerance allergyintolerance) throws ParseException
	{
		 main.java.com.campfhir.model.AllergyIntolerance a = new  main.java.com.campfhir.model.AllergyIntolerance();

		/******************** id ********************************************************************************/
		a.setId(allergyintolerance.getIdElement().getIdPart());

		/******************** allergyintolerancetype ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceType allergyintolerancetype = allergyintolerance.getType();
		if(allergyintolerancetype!=null) {
			a.addAlrgyIntoleranceTyp(allergyintolerancetype.toCode());
		} else {
			a.addAlrgyIntoleranceTyp("NULL");
		}

		/******************** allergyintolerancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancecode = allergyintolerance.getCode();

		/******************** AlrgyIntolerance_Cd_Txt ********************************************************************************/
		if(allergyintolerancecode.hasText()) {

			a.addAlrgyIntoleranceCdTxt(String.valueOf(allergyintolerancecode.getText()));
		} else {
			a.addAlrgyIntoleranceCdTxt("NULL");
		}


		/******************** allergyintolerancecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> allergyintolerancecodecodinglist = allergyintolerancecode.getCoding();
		for(int allergyintolerancecodecodingi = 0; allergyintolerancecodecodingi<allergyintolerancecodecodinglist.size();allergyintolerancecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  allergyintolerancecodecoding = allergyintolerancecodecodinglist.get(allergyintolerancecodecodingi);

		/******************** AlrgyIntolerance_Cd_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancecodecodingi == 0) {a.addAlrgyIntoleranceCdCdgDsply("[");}
		if(allergyintolerancecodecoding.hasDisplay()) {

			a.addAlrgyIntoleranceCdCdgDsply(String.valueOf(allergyintolerancecodecoding.getDisplay()));
		} else {
			a.addAlrgyIntoleranceCdCdgDsply("NULL");
		}

		if(allergyintolerancecodecodingi == allergyintolerancecodecodinglist.size()-1) {a.addAlrgyIntoleranceCdCdgDsply("]");}


		/******************** AlrgyIntolerance_Cd_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancecodecodingi == 0) {a.addAlrgyIntoleranceCdCdgVrsn("[");}
		if(allergyintolerancecodecoding.hasVersion()) {

			a.addAlrgyIntoleranceCdCdgVrsn(String.valueOf(allergyintolerancecodecoding.getVersion()));
		} else {
			a.addAlrgyIntoleranceCdCdgVrsn("NULL");
		}

		if(allergyintolerancecodecodingi == allergyintolerancecodecodinglist.size()-1) {a.addAlrgyIntoleranceCdCdgVrsn("]");}


		/******************** AlrgyIntolerance_Cd_Cdg_Cd ********************************************************************************/
		if(allergyintolerancecodecodingi == 0) {a.addAlrgyIntoleranceCdCdgCd("[");}
		if(allergyintolerancecodecoding.hasCode()) {

			a.addAlrgyIntoleranceCdCdgCd(String.valueOf(allergyintolerancecodecoding.getCode()));
		} else {
			a.addAlrgyIntoleranceCdCdgCd("NULL");
		}

		if(allergyintolerancecodecodingi == allergyintolerancecodecodinglist.size()-1) {a.addAlrgyIntoleranceCdCdgCd("]");}


		/******************** AlrgyIntolerance_Cd_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancecodecodingi == 0) {a.addAlrgyIntoleranceCdCdgUsrSltd("[");}
		if(allergyintolerancecodecoding.hasUserSelected()) {

			a.addAlrgyIntoleranceCdCdgUsrSltd(String.valueOf(allergyintolerancecodecoding.getUserSelected()));
		} else {
			a.addAlrgyIntoleranceCdCdgUsrSltd("NULL");
		}

		if(allergyintolerancecodecodingi == allergyintolerancecodecodinglist.size()-1) {a.addAlrgyIntoleranceCdCdgUsrSltd("]");}


		/******************** AlrgyIntolerance_Cd_Cdg_Sys ********************************************************************************/
		if(allergyintolerancecodecodingi == 0) {a.addAlrgyIntoleranceCdCdgSys("[");}
		if(allergyintolerancecodecoding.hasSystem()) {

			a.addAlrgyIntoleranceCdCdgSys(String.valueOf(allergyintolerancecodecoding.getSystem()));
		} else {
			a.addAlrgyIntoleranceCdCdgSys("NULL");
		}

		if(allergyintolerancecodecodingi == allergyintolerancecodecodinglist.size()-1) {a.addAlrgyIntoleranceCdCdgSys("]");}


		 };
		/******************** AlrgyIntolerance_Enc ********************************************************************************/
		if(allergyintolerance.hasEncounter()) {

			if(allergyintolerance.getEncounter().getReference() != null) {
			a.addAlrgyIntoleranceEnc(allergyintolerance.getEncounter().getReference());
			}
		} else {
			a.addAlrgyIntoleranceEnc("NULL");
		}


		/******************** allergyintolerancenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> allergyintolerancenotelist = allergyintolerance.getNote();
		for(int allergyintolerancenotei = 0; allergyintolerancenotei<allergyintolerancenotelist.size();allergyintolerancenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  allergyintolerancenote = allergyintolerancenotelist.get(allergyintolerancenotei);

		/******************** AlrgyIntolerance_Nt_Time ********************************************************************************/
		if(allergyintolerancenotei == 0) {a.addAlrgyIntoleranceNtTime("[");}
		if(allergyintolerancenote.hasTime()) {

			a.addAlrgyIntoleranceNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintolerancenote.getTime())+"\"");
		} else {
			a.addAlrgyIntoleranceNtTime("NULL");
		}

		if(allergyintolerancenotei == allergyintolerancenotelist.size()-1) {a.addAlrgyIntoleranceNtTime("]");}


		/******************** AlrgyIntolerance_Nt_AthrRfrnc ********************************************************************************/
		if(allergyintolerancenotei == 0) {a.addAlrgyIntoleranceNtAthrRfrnc("[");}
		if(allergyintolerancenote.hasAuthorReference()) {

			if(allergyintolerancenote.getAuthorReference().getReference() != null) {
			a.addAlrgyIntoleranceNtAthrRfrnc(allergyintolerancenote.getAuthorReference().getReference());
			}
		} else {
			a.addAlrgyIntoleranceNtAthrRfrnc("NULL");
		}

		if(allergyintolerancenotei == allergyintolerancenotelist.size()-1) {a.addAlrgyIntoleranceNtAthrRfrnc("]");}


		/******************** AlrgyIntolerance_Nt_Txt ********************************************************************************/
		if(allergyintolerancenotei == 0) {a.addAlrgyIntoleranceNtTxt("[");}
		if(allergyintolerancenote.hasText()) {

			a.addAlrgyIntoleranceNtTxt(String.valueOf(allergyintolerancenote.getText()));
		} else {
			a.addAlrgyIntoleranceNtTxt("NULL");
		}

		if(allergyintolerancenotei == allergyintolerancenotelist.size()-1) {a.addAlrgyIntoleranceNtTxt("]");}


		/******************** AlrgyIntolerance_Nt_AthrStrgTyp ********************************************************************************/
		if(allergyintolerancenotei == 0) {a.addAlrgyIntoleranceNtAthrStrgTyp("[");}
		if(allergyintolerancenote.hasAuthorStringType()) {

			a.addAlrgyIntoleranceNtAthrStrgTyp("\""+allergyintolerancenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			a.addAlrgyIntoleranceNtAthrStrgTyp("NULL");
		}

		if(allergyintolerancenotei == allergyintolerancenotelist.size()-1) {a.addAlrgyIntoleranceNtAthrStrgTyp("]");}


		 };
		/******************** allergyintoleranceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> allergyintoleranceidentifierlist = allergyintolerance.getIdentifier();
		for(int allergyintoleranceidentifieri = 0; allergyintoleranceidentifieri<allergyintoleranceidentifierlist.size();allergyintoleranceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  allergyintoleranceidentifier = allergyintoleranceidentifierlist.get(allergyintoleranceidentifieri);

		/******************** AlrgyIntolerance_Id_Vl ********************************************************************************/
		if(allergyintoleranceidentifieri == 0) {a.addAlrgyIntoleranceIdVl("[");}
		if(allergyintoleranceidentifier.hasValue()) {

			a.addAlrgyIntoleranceIdVl(String.valueOf(allergyintoleranceidentifier.getValue()));
		} else {
			a.addAlrgyIntoleranceIdVl("NULL");
		}

		if(allergyintoleranceidentifieri == allergyintoleranceidentifierlist.size()-1) {a.addAlrgyIntoleranceIdVl("]");}


		/******************** allergyintoleranceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceidentifiertype = allergyintoleranceidentifier.getType();

		/******************** AlrgyIntolerance_Id_Typ_Txt ********************************************************************************/
		if(allergyintoleranceidentifieri == 0) {a.addAlrgyIntoleranceIdTypTxt("[");}
		if(allergyintoleranceidentifiertype.hasText()) {

			a.addAlrgyIntoleranceIdTypTxt(String.valueOf(allergyintoleranceidentifiertype.getText()));
		} else {
			a.addAlrgyIntoleranceIdTypTxt("NULL");
		}

		if(allergyintoleranceidentifieri == allergyintoleranceidentifierlist.size()-1) {a.addAlrgyIntoleranceIdTypTxt("]");}


		/******************** allergyintoleranceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> allergyintoleranceidentifiertypecodinglist = allergyintoleranceidentifiertype.getCoding();
		for(int allergyintoleranceidentifiertypecodingi = 0; allergyintoleranceidentifiertypecodingi<allergyintoleranceidentifiertypecodinglist.size();allergyintoleranceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  allergyintoleranceidentifiertypecoding = allergyintoleranceidentifiertypecodinglist.get(allergyintoleranceidentifiertypecodingi);

		/******************** AlrgyIntolerance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(allergyintoleranceidentifiertypecodingi == 0) {a.addAlrgyIntoleranceIdTypCdgDsply("[[");}
		if(allergyintoleranceidentifiertypecoding.hasDisplay()) {

			a.addAlrgyIntoleranceIdTypCdgDsply(String.valueOf(allergyintoleranceidentifiertypecoding.getDisplay()));
		} else {
			a.addAlrgyIntoleranceIdTypCdgDsply("NULL");
		}

		if(allergyintoleranceidentifiertypecodingi == allergyintoleranceidentifiertypecodinglist.size()-1) {a.addAlrgyIntoleranceIdTypCdgDsply("]]");}


		/******************** AlrgyIntolerance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(allergyintoleranceidentifiertypecodingi == 0) {a.addAlrgyIntoleranceIdTypCdgVrsn("[[");}
		if(allergyintoleranceidentifiertypecoding.hasVersion()) {

			a.addAlrgyIntoleranceIdTypCdgVrsn(String.valueOf(allergyintoleranceidentifiertypecoding.getVersion()));
		} else {
			a.addAlrgyIntoleranceIdTypCdgVrsn("NULL");
		}

		if(allergyintoleranceidentifiertypecodingi == allergyintoleranceidentifiertypecodinglist.size()-1) {a.addAlrgyIntoleranceIdTypCdgVrsn("]]");}


		/******************** AlrgyIntolerance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(allergyintoleranceidentifiertypecodingi == 0) {a.addAlrgyIntoleranceIdTypCdgCd("[[");}
		if(allergyintoleranceidentifiertypecoding.hasCode()) {

			a.addAlrgyIntoleranceIdTypCdgCd(String.valueOf(allergyintoleranceidentifiertypecoding.getCode()));
		} else {
			a.addAlrgyIntoleranceIdTypCdgCd("NULL");
		}

		if(allergyintoleranceidentifiertypecodingi == allergyintoleranceidentifiertypecodinglist.size()-1) {a.addAlrgyIntoleranceIdTypCdgCd("]]");}


		/******************** AlrgyIntolerance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(allergyintoleranceidentifiertypecodingi == 0) {a.addAlrgyIntoleranceIdTypCdgUsrSltd("[[");}
		if(allergyintoleranceidentifiertypecoding.hasUserSelected()) {

			a.addAlrgyIntoleranceIdTypCdgUsrSltd(String.valueOf(allergyintoleranceidentifiertypecoding.getUserSelected()));
		} else {
			a.addAlrgyIntoleranceIdTypCdgUsrSltd("NULL");
		}

		if(allergyintoleranceidentifiertypecodingi == allergyintoleranceidentifiertypecodinglist.size()-1) {a.addAlrgyIntoleranceIdTypCdgUsrSltd("]]");}


		/******************** AlrgyIntolerance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(allergyintoleranceidentifiertypecodingi == 0) {a.addAlrgyIntoleranceIdTypCdgSys("[[");}
		if(allergyintoleranceidentifiertypecoding.hasSystem()) {

			a.addAlrgyIntoleranceIdTypCdgSys(String.valueOf(allergyintoleranceidentifiertypecoding.getSystem()));
		} else {
			a.addAlrgyIntoleranceIdTypCdgSys("NULL");
		}

		if(allergyintoleranceidentifiertypecodingi == allergyintoleranceidentifiertypecodinglist.size()-1) {a.addAlrgyIntoleranceIdTypCdgSys("]]");}


		 };
		/******************** allergyintoleranceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period allergyintoleranceidentifierperiod = allergyintoleranceidentifier.getPeriod();

		/******************** AlrgyIntolerance_Id_Prd_Strt ********************************************************************************/
		if(allergyintoleranceidentifieri == 0) {a.addAlrgyIntoleranceIdPrdStrt("[");}
		if(allergyintoleranceidentifierperiod.hasStart()) {

			a.addAlrgyIntoleranceIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintoleranceidentifierperiod.getStart())+"\"");
		} else {
			a.addAlrgyIntoleranceIdPrdStrt("NULL");
		}

		if(allergyintoleranceidentifieri == allergyintoleranceidentifierlist.size()-1) {a.addAlrgyIntoleranceIdPrdStrt("]");}


		/******************** AlrgyIntolerance_Id_Prd_End ********************************************************************************/
		if(allergyintoleranceidentifieri == 0) {a.addAlrgyIntoleranceIdPrdEnd("[");}
		if(allergyintoleranceidentifierperiod.hasEnd()) {

			a.addAlrgyIntoleranceIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintoleranceidentifierperiod.getEnd())+"\"");
		} else {
			a.addAlrgyIntoleranceIdPrdEnd("NULL");
		}

		if(allergyintoleranceidentifieri == allergyintoleranceidentifierlist.size()-1) {a.addAlrgyIntoleranceIdPrdEnd("]");}


		/******************** allergyintoleranceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse allergyintoleranceidentifieruse = allergyintoleranceidentifier.getUse();
		if(allergyintoleranceidentifieruse!=null) {
		if(allergyintoleranceidentifieri == 0) {

		a.addAlrgyIntoleranceIdUse("[");		}
			a.addAlrgyIntoleranceIdUse(allergyintoleranceidentifieruse.toCode());
		if(allergyintoleranceidentifieri == allergyintoleranceidentifierlist.size()-1) {

		a.addAlrgyIntoleranceIdUse("]");		}

		} else {
			a.addAlrgyIntoleranceIdUse("NULL");
		}

		/******************** AlrgyIntolerance_Id_Assigner ********************************************************************************/
		if(allergyintoleranceidentifieri == 0) {a.addAlrgyIntoleranceIdAssigner("[");}
		if(allergyintoleranceidentifier.hasAssigner()) {

			if(allergyintoleranceidentifier.getAssigner().getReference() != null) {
			a.addAlrgyIntoleranceIdAssigner(allergyintoleranceidentifier.getAssigner().getReference());
			}
		} else {
			a.addAlrgyIntoleranceIdAssigner("NULL");
		}

		if(allergyintoleranceidentifieri == allergyintoleranceidentifierlist.size()-1) {a.addAlrgyIntoleranceIdAssigner("]");}


		/******************** AlrgyIntolerance_Id_Sys ********************************************************************************/
		if(allergyintoleranceidentifieri == 0) {a.addAlrgyIntoleranceIdSys("[");}
		if(allergyintoleranceidentifier.hasSystem()) {

			a.addAlrgyIntoleranceIdSys(String.valueOf(allergyintoleranceidentifier.getSystem()));
		} else {
			a.addAlrgyIntoleranceIdSys("NULL");
		}

		if(allergyintoleranceidentifieri == allergyintoleranceidentifierlist.size()-1) {a.addAlrgyIntoleranceIdSys("]");}


		 };
		/******************** allergyintoleranceclinicalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceclinicalstatus = allergyintolerance.getClinicalStatus();

		/******************** AlrgyIntolerance_ClnclSts_Txt ********************************************************************************/
		if(allergyintoleranceclinicalstatus.hasText()) {

			a.addAlrgyIntoleranceClnclStsTxt(String.valueOf(allergyintoleranceclinicalstatus.getText()));
		} else {
			a.addAlrgyIntoleranceClnclStsTxt("NULL");
		}


		/******************** allergyintoleranceclinicalstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> allergyintoleranceclinicalstatuscodinglist = allergyintoleranceclinicalstatus.getCoding();
		for(int allergyintoleranceclinicalstatuscodingi = 0; allergyintoleranceclinicalstatuscodingi<allergyintoleranceclinicalstatuscodinglist.size();allergyintoleranceclinicalstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  allergyintoleranceclinicalstatuscoding = allergyintoleranceclinicalstatuscodinglist.get(allergyintoleranceclinicalstatuscodingi);

		/******************** AlrgyIntolerance_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(allergyintoleranceclinicalstatuscodingi == 0) {a.addAlrgyIntoleranceClnclStsCdgDsply("[");}
		if(allergyintoleranceclinicalstatuscoding.hasDisplay()) {

			a.addAlrgyIntoleranceClnclStsCdgDsply(String.valueOf(allergyintoleranceclinicalstatuscoding.getDisplay()));
		} else {
			a.addAlrgyIntoleranceClnclStsCdgDsply("NULL");
		}

		if(allergyintoleranceclinicalstatuscodingi == allergyintoleranceclinicalstatuscodinglist.size()-1) {a.addAlrgyIntoleranceClnclStsCdgDsply("]");}


		/******************** AlrgyIntolerance_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(allergyintoleranceclinicalstatuscodingi == 0) {a.addAlrgyIntoleranceClnclStsCdgVrsn("[");}
		if(allergyintoleranceclinicalstatuscoding.hasVersion()) {

			a.addAlrgyIntoleranceClnclStsCdgVrsn(String.valueOf(allergyintoleranceclinicalstatuscoding.getVersion()));
		} else {
			a.addAlrgyIntoleranceClnclStsCdgVrsn("NULL");
		}

		if(allergyintoleranceclinicalstatuscodingi == allergyintoleranceclinicalstatuscodinglist.size()-1) {a.addAlrgyIntoleranceClnclStsCdgVrsn("]");}


		/******************** AlrgyIntolerance_ClnclSts_Cdg_Cd ********************************************************************************/
		if(allergyintoleranceclinicalstatuscodingi == 0) {a.addAlrgyIntoleranceClnclStsCdgCd("[");}
		if(allergyintoleranceclinicalstatuscoding.hasCode()) {

			a.addAlrgyIntoleranceClnclStsCdgCd(String.valueOf(allergyintoleranceclinicalstatuscoding.getCode()));
		} else {
			a.addAlrgyIntoleranceClnclStsCdgCd("NULL");
		}

		if(allergyintoleranceclinicalstatuscodingi == allergyintoleranceclinicalstatuscodinglist.size()-1) {a.addAlrgyIntoleranceClnclStsCdgCd("]");}


		/******************** AlrgyIntolerance_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(allergyintoleranceclinicalstatuscodingi == 0) {a.addAlrgyIntoleranceClnclStsCdgUsrSltd("[");}
		if(allergyintoleranceclinicalstatuscoding.hasUserSelected()) {

			a.addAlrgyIntoleranceClnclStsCdgUsrSltd(String.valueOf(allergyintoleranceclinicalstatuscoding.getUserSelected()));
		} else {
			a.addAlrgyIntoleranceClnclStsCdgUsrSltd("NULL");
		}

		if(allergyintoleranceclinicalstatuscodingi == allergyintoleranceclinicalstatuscodinglist.size()-1) {a.addAlrgyIntoleranceClnclStsCdgUsrSltd("]");}


		/******************** AlrgyIntolerance_ClnclSts_Cdg_Sys ********************************************************************************/
		if(allergyintoleranceclinicalstatuscodingi == 0) {a.addAlrgyIntoleranceClnclStsCdgSys("[");}
		if(allergyintoleranceclinicalstatuscoding.hasSystem()) {

			a.addAlrgyIntoleranceClnclStsCdgSys(String.valueOf(allergyintoleranceclinicalstatuscoding.getSystem()));
		} else {
			a.addAlrgyIntoleranceClnclStsCdgSys("NULL");
		}

		if(allergyintoleranceclinicalstatuscodingi == allergyintoleranceclinicalstatuscodinglist.size()-1) {a.addAlrgyIntoleranceClnclStsCdgSys("]");}


		 };
		/******************** allergyintolerancecategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCategory>> allergyintolerancecategorylist = allergyintolerance.getCategory();
		for(int allergyintolerancecategoryi = 0; allergyintolerancecategoryi<allergyintolerancecategorylist.size();allergyintolerancecategoryi++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCategory>  allergyintolerancecategory = allergyintolerancecategorylist.get(allergyintolerancecategoryi);
		if(allergyintolerancecategory!=null) {
			a.addAlrgyIntoleranceCtgry(allergyintolerancecategory.getCode());
		} else {
			a.addAlrgyIntoleranceCtgry("NULL");
		}
		 };

		/******************** AlrgyIntolerance_OnStrgTyp ********************************************************************************/
		if(allergyintolerance.hasOnsetStringType()) {

			a.addAlrgyIntoleranceOnStrgTyp("\""+allergyintolerance.getOnsetStringType().getValueAsString()+"\"");
		} else {
			a.addAlrgyIntoleranceOnStrgTyp("NULL");
		}


		/******************** allergyintoleranceonrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range allergyintoleranceonrange = allergyintolerance.getOnsetRange();

		/******************** allergyintoleranceonrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity allergyintoleranceonrangelow = allergyintoleranceonrange.getLow();

		/******************** AlrgyIntolerance_OnRng_Lw_Vl ********************************************************************************/
		if(allergyintoleranceonrangelow.hasValue()) {

			a.addAlrgyIntoleranceOnRngLwVl(String.valueOf(allergyintoleranceonrangelow.getValue()));
		} else {
			a.addAlrgyIntoleranceOnRngLwVl("NULL");
		}


		/******************** allergyintoleranceonrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator allergyintoleranceonrangelowcomparator = allergyintoleranceonrangelow.getComparator();
		if(allergyintoleranceonrangelowcomparator!=null) {
			a.addAlrgyIntoleranceOnRngLwCmprtr(allergyintoleranceonrangelowcomparator.toCode());
		} else {
			a.addAlrgyIntoleranceOnRngLwCmprtr("NULL");
		}

		/******************** AlrgyIntolerance_OnRng_Lw_Cd ********************************************************************************/
		if(allergyintoleranceonrangelow.hasCode()) {

			a.addAlrgyIntoleranceOnRngLwCd(String.valueOf(allergyintoleranceonrangelow.getCode()));
		} else {
			a.addAlrgyIntoleranceOnRngLwCd("NULL");
		}


		/******************** AlrgyIntolerance_OnRng_Lw_Unt ********************************************************************************/
		if(allergyintoleranceonrangelow.hasUnit()) {

			a.addAlrgyIntoleranceOnRngLwUnt(String.valueOf(allergyintoleranceonrangelow.getUnit()));
		} else {
			a.addAlrgyIntoleranceOnRngLwUnt("NULL");
		}


		/******************** AlrgyIntolerance_OnRng_Lw_Sys ********************************************************************************/
		if(allergyintoleranceonrangelow.hasSystem()) {

			a.addAlrgyIntoleranceOnRngLwSys(String.valueOf(allergyintoleranceonrangelow.getSystem()));
		} else {
			a.addAlrgyIntoleranceOnRngLwSys("NULL");
		}


		/******************** allergyintoleranceonrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity allergyintoleranceonrangehigh = allergyintoleranceonrange.getHigh();

		/******************** AlrgyIntolerance_OnRng_Hi_Vl ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasValue()) {

			a.addAlrgyIntoleranceOnRngHiVl(String.valueOf(allergyintoleranceonrangehigh.getValue()));
		} else {
			a.addAlrgyIntoleranceOnRngHiVl("NULL");
		}


		/******************** allergyintoleranceonrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator allergyintoleranceonrangehighcomparator = allergyintoleranceonrangehigh.getComparator();
		if(allergyintoleranceonrangehighcomparator!=null) {
			a.addAlrgyIntoleranceOnRngHiCmprtr(allergyintoleranceonrangehighcomparator.toCode());
		} else {
			a.addAlrgyIntoleranceOnRngHiCmprtr("NULL");
		}

		/******************** AlrgyIntolerance_OnRng_Hi_Cd ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasCode()) {

			a.addAlrgyIntoleranceOnRngHiCd(String.valueOf(allergyintoleranceonrangehigh.getCode()));
		} else {
			a.addAlrgyIntoleranceOnRngHiCd("NULL");
		}


		/******************** AlrgyIntolerance_OnRng_Hi_Unt ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasUnit()) {

			a.addAlrgyIntoleranceOnRngHiUnt(String.valueOf(allergyintoleranceonrangehigh.getUnit()));
		} else {
			a.addAlrgyIntoleranceOnRngHiUnt("NULL");
		}


		/******************** AlrgyIntolerance_OnRng_Hi_Sys ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasSystem()) {

			a.addAlrgyIntoleranceOnRngHiSys(String.valueOf(allergyintoleranceonrangehigh.getSystem()));
		} else {
			a.addAlrgyIntoleranceOnRngHiSys("NULL");
		}


		/******************** allergyintoleranceonage ********************************************************************************/
		org.hl7.fhir.r4.model.Age allergyintoleranceonage = allergyintolerance.getOnsetAge();

		/******************** AlrgyIntolerance_OnAge_Vl ********************************************************************************/
		if(allergyintoleranceonage.hasValue()) {

			a.addAlrgyIntoleranceOnAgeVl(String.valueOf(allergyintoleranceonage.getValue()));
		} else {
			a.addAlrgyIntoleranceOnAgeVl("NULL");
		}


		/******************** allergyintoleranceonagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator allergyintoleranceonagecomparator = allergyintoleranceonage.getComparator();
		if(allergyintoleranceonagecomparator!=null) {
			a.addAlrgyIntoleranceOnAgeCmprtr(allergyintoleranceonagecomparator.toCode());
		} else {
			a.addAlrgyIntoleranceOnAgeCmprtr("NULL");
		}

		/******************** AlrgyIntolerance_OnAge_Cd ********************************************************************************/
		if(allergyintoleranceonage.hasCode()) {

			a.addAlrgyIntoleranceOnAgeCd(String.valueOf(allergyintoleranceonage.getCode()));
		} else {
			a.addAlrgyIntoleranceOnAgeCd("NULL");
		}


		/******************** AlrgyIntolerance_OnAge_Unt ********************************************************************************/
		if(allergyintoleranceonage.hasUnit()) {

			a.addAlrgyIntoleranceOnAgeUnt(String.valueOf(allergyintoleranceonage.getUnit()));
		} else {
			a.addAlrgyIntoleranceOnAgeUnt("NULL");
		}


		/******************** AlrgyIntolerance_OnAge_Sys ********************************************************************************/
		if(allergyintoleranceonage.hasSystem()) {

			a.addAlrgyIntoleranceOnAgeSys(String.valueOf(allergyintoleranceonage.getSystem()));
		} else {
			a.addAlrgyIntoleranceOnAgeSys("NULL");
		}


		/******************** allergyintoleranceonperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period allergyintoleranceonperiod = allergyintolerance.getOnsetPeriod();

		/******************** AlrgyIntolerance_OnPrd_Strt ********************************************************************************/
		if(allergyintoleranceonperiod.hasStart()) {

			a.addAlrgyIntoleranceOnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintoleranceonperiod.getStart())+"\"");
		} else {
			a.addAlrgyIntoleranceOnPrdStrt("NULL");
		}


		/******************** AlrgyIntolerance_OnPrd_End ********************************************************************************/
		if(allergyintoleranceonperiod.hasEnd()) {

			a.addAlrgyIntoleranceOnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintoleranceonperiod.getEnd())+"\"");
		} else {
			a.addAlrgyIntoleranceOnPrdEnd("NULL");
		}


		/******************** AlrgyIntolerance_Recorder ********************************************************************************/
		if(allergyintolerance.hasRecorder()) {

			if(allergyintolerance.getRecorder().getReference() != null) {
			a.addAlrgyIntoleranceRecorder(allergyintolerance.getRecorder().getReference());
			}
		} else {
			a.addAlrgyIntoleranceRecorder("NULL");
		}


		/******************** AlrgyIntolerance_Asserter ********************************************************************************/
		if(allergyintolerance.hasAsserter()) {

			if(allergyintolerance.getAsserter().getReference() != null) {
			a.addAlrgyIntoleranceAsserter(allergyintolerance.getAsserter().getReference());
			}
		} else {
			a.addAlrgyIntoleranceAsserter("NULL");
		}


		/******************** AlrgyIntolerance_RecordedDt ********************************************************************************/
		if(allergyintolerance.hasRecordedDate()) {

			a.addAlrgyIntoleranceRecordedDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintolerance.getRecordedDate())+"\"");
		} else {
			a.addAlrgyIntoleranceRecordedDt("NULL");
		}


		/******************** allergyintolerancecriticality ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCriticality allergyintolerancecriticality = allergyintolerance.getCriticality();
		if(allergyintolerancecriticality!=null) {
			a.addAlrgyIntoleranceCriticality(allergyintolerancecriticality.toCode());
		} else {
			a.addAlrgyIntoleranceCriticality("NULL");
		}

		/******************** AlrgyIntolerance_LastOccrnce ********************************************************************************/
		if(allergyintolerance.hasLastOccurrence()) {

			a.addAlrgyIntoleranceLastOccrnce("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintolerance.getLastOccurrence())+"\"");
		} else {
			a.addAlrgyIntoleranceLastOccrnce("NULL");
		}


		/******************** allergyintolerancereaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent> allergyintolerancereactionlist = allergyintolerance.getReaction();
		for(int allergyintolerancereactioni = 0; allergyintolerancereactioni<allergyintolerancereactionlist.size();allergyintolerancereactioni++ ) {
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent  allergyintolerancereaction = allergyintolerancereactionlist.get(allergyintolerancereactioni);

		/******************** AlrgyIntolerance_Reaction_Dscrptn ********************************************************************************/
		if(allergyintolerancereactioni == 0) {a.addAlrgyIntoleranceReactionDscrptn("[");}
		if(allergyintolerancereaction.hasDescription()) {

			a.addAlrgyIntoleranceReactionDscrptn(String.valueOf(allergyintolerancereaction.getDescription()));
		} else {
			a.addAlrgyIntoleranceReactionDscrptn("NULL");
		}

		if(allergyintolerancereactioni == allergyintolerancereactionlist.size()-1) {a.addAlrgyIntoleranceReactionDscrptn("]");}


		/******************** allergyintolerancereactionnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> allergyintolerancereactionnotelist = allergyintolerancereaction.getNote();
		for(int allergyintolerancereactionnotei = 0; allergyintolerancereactionnotei<allergyintolerancereactionnotelist.size();allergyintolerancereactionnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  allergyintolerancereactionnote = allergyintolerancereactionnotelist.get(allergyintolerancereactionnotei);

		/******************** AlrgyIntolerance_Reaction_Nt_Time ********************************************************************************/
		if(allergyintolerancereactionnotei == 0) {a.addAlrgyIntoleranceReactionNtTime("[[");}
		if(allergyintolerancereactionnote.hasTime()) {

			a.addAlrgyIntoleranceReactionNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintolerancereactionnote.getTime())+"\"");
		} else {
			a.addAlrgyIntoleranceReactionNtTime("NULL");
		}

		if(allergyintolerancereactionnotei == allergyintolerancereactionnotelist.size()-1) {a.addAlrgyIntoleranceReactionNtTime("]]");}


		/******************** AlrgyIntolerance_Reaction_Nt_AthrRfrnc ********************************************************************************/
		if(allergyintolerancereactionnotei == 0) {a.addAlrgyIntoleranceReactionNtAthrRfrnc("[[");}
		if(allergyintolerancereactionnote.hasAuthorReference()) {

			if(allergyintolerancereactionnote.getAuthorReference().getReference() != null) {
			a.addAlrgyIntoleranceReactionNtAthrRfrnc(allergyintolerancereactionnote.getAuthorReference().getReference());
			}
		} else {
			a.addAlrgyIntoleranceReactionNtAthrRfrnc("NULL");
		}

		if(allergyintolerancereactionnotei == allergyintolerancereactionnotelist.size()-1) {a.addAlrgyIntoleranceReactionNtAthrRfrnc("]]");}


		/******************** AlrgyIntolerance_Reaction_Nt_Txt ********************************************************************************/
		if(allergyintolerancereactionnotei == 0) {a.addAlrgyIntoleranceReactionNtTxt("[[");}
		if(allergyintolerancereactionnote.hasText()) {

			a.addAlrgyIntoleranceReactionNtTxt(String.valueOf(allergyintolerancereactionnote.getText()));
		} else {
			a.addAlrgyIntoleranceReactionNtTxt("NULL");
		}

		if(allergyintolerancereactionnotei == allergyintolerancereactionnotelist.size()-1) {a.addAlrgyIntoleranceReactionNtTxt("]]");}


		/******************** AlrgyIntolerance_Reaction_Nt_AthrStrgTyp ********************************************************************************/
		if(allergyintolerancereactionnotei == 0) {a.addAlrgyIntoleranceReactionNtAthrStrgTyp("[[");}
		if(allergyintolerancereactionnote.hasAuthorStringType()) {

			a.addAlrgyIntoleranceReactionNtAthrStrgTyp("\""+allergyintolerancereactionnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			a.addAlrgyIntoleranceReactionNtAthrStrgTyp("NULL");
		}

		if(allergyintolerancereactionnotei == allergyintolerancereactionnotelist.size()-1) {a.addAlrgyIntoleranceReactionNtAthrStrgTyp("]]");}


		 };
		/******************** allergyintolerancereactionseverity ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceSeverity allergyintolerancereactionseverity = allergyintolerancereaction.getSeverity();
		if(allergyintolerancereactionseverity!=null) {
			a.addAlrgyIntoleranceReactionSeverity(allergyintolerancereactionseverity.toCode());
		} else {
			a.addAlrgyIntoleranceReactionSeverity("NULL");
		}

		/******************** AlrgyIntolerance_Reaction_On ********************************************************************************/
		if(allergyintolerancereaction.hasOnset()) {

			a.addAlrgyIntoleranceReactionOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(allergyintolerancereaction.getOnset())+"\"");
		} else {
			a.addAlrgyIntoleranceReactionOn("NULL");
		}


		/******************** allergyintolerancereactionsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionsubstance = allergyintolerancereaction.getSubstance();

		/******************** AlrgyIntolerance_Reaction_Sbstnc_Txt ********************************************************************************/
		if(allergyintolerancereactionsubstance.hasText()) {

			a.addAlrgyIntoleranceReactionSbstncTxt(String.valueOf(allergyintolerancereactionsubstance.getText()));
		} else {
			a.addAlrgyIntoleranceReactionSbstncTxt("NULL");
		}


		/******************** allergyintolerancereactionsubstancecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> allergyintolerancereactionsubstancecodinglist = allergyintolerancereactionsubstance.getCoding();
		for(int allergyintolerancereactionsubstancecodingi = 0; allergyintolerancereactionsubstancecodingi<allergyintolerancereactionsubstancecodinglist.size();allergyintolerancereactionsubstancecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  allergyintolerancereactionsubstancecoding = allergyintolerancereactionsubstancecodinglist.get(allergyintolerancereactionsubstancecodingi);

		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancereactionsubstancecodingi == 0) {a.addAlrgyIntoleranceReactionSbstncCdgDsply("[[");}
		if(allergyintolerancereactionsubstancecoding.hasDisplay()) {

			a.addAlrgyIntoleranceReactionSbstncCdgDsply(String.valueOf(allergyintolerancereactionsubstancecoding.getDisplay()));
		} else {
			a.addAlrgyIntoleranceReactionSbstncCdgDsply("NULL");
		}

		if(allergyintolerancereactionsubstancecodingi == allergyintolerancereactionsubstancecodinglist.size()-1) {a.addAlrgyIntoleranceReactionSbstncCdgDsply("]]");}


		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancereactionsubstancecodingi == 0) {a.addAlrgyIntoleranceReactionSbstncCdgVrsn("[[");}
		if(allergyintolerancereactionsubstancecoding.hasVersion()) {

			a.addAlrgyIntoleranceReactionSbstncCdgVrsn(String.valueOf(allergyintolerancereactionsubstancecoding.getVersion()));
		} else {
			a.addAlrgyIntoleranceReactionSbstncCdgVrsn("NULL");
		}

		if(allergyintolerancereactionsubstancecodingi == allergyintolerancereactionsubstancecodinglist.size()-1) {a.addAlrgyIntoleranceReactionSbstncCdgVrsn("]]");}


		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Cd ********************************************************************************/
		if(allergyintolerancereactionsubstancecodingi == 0) {a.addAlrgyIntoleranceReactionSbstncCdgCd("[[");}
		if(allergyintolerancereactionsubstancecoding.hasCode()) {

			a.addAlrgyIntoleranceReactionSbstncCdgCd(String.valueOf(allergyintolerancereactionsubstancecoding.getCode()));
		} else {
			a.addAlrgyIntoleranceReactionSbstncCdgCd("NULL");
		}

		if(allergyintolerancereactionsubstancecodingi == allergyintolerancereactionsubstancecodinglist.size()-1) {a.addAlrgyIntoleranceReactionSbstncCdgCd("]]");}


		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancereactionsubstancecodingi == 0) {a.addAlrgyIntoleranceReactionSbstncCdgUsrSltd("[[");}
		if(allergyintolerancereactionsubstancecoding.hasUserSelected()) {

			a.addAlrgyIntoleranceReactionSbstncCdgUsrSltd(String.valueOf(allergyintolerancereactionsubstancecoding.getUserSelected()));
		} else {
			a.addAlrgyIntoleranceReactionSbstncCdgUsrSltd("NULL");
		}

		if(allergyintolerancereactionsubstancecodingi == allergyintolerancereactionsubstancecodinglist.size()-1) {a.addAlrgyIntoleranceReactionSbstncCdgUsrSltd("]]");}


		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Sys ********************************************************************************/
		if(allergyintolerancereactionsubstancecodingi == 0) {a.addAlrgyIntoleranceReactionSbstncCdgSys("[[");}
		if(allergyintolerancereactionsubstancecoding.hasSystem()) {

			a.addAlrgyIntoleranceReactionSbstncCdgSys(String.valueOf(allergyintolerancereactionsubstancecoding.getSystem()));
		} else {
			a.addAlrgyIntoleranceReactionSbstncCdgSys("NULL");
		}

		if(allergyintolerancereactionsubstancecodingi == allergyintolerancereactionsubstancecodinglist.size()-1) {a.addAlrgyIntoleranceReactionSbstncCdgSys("]]");}


		 };
		/******************** allergyintolerancereactionmanifestation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> allergyintolerancereactionmanifestationlist = allergyintolerancereaction.getManifestation();
		for(int allergyintolerancereactionmanifestationi = 0; allergyintolerancereactionmanifestationi<allergyintolerancereactionmanifestationlist.size();allergyintolerancereactionmanifestationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  allergyintolerancereactionmanifestation = allergyintolerancereactionmanifestationlist.get(allergyintolerancereactionmanifestationi);

		/******************** AlrgyIntolerance_Reaction_Manifestation_Txt ********************************************************************************/
		if(allergyintolerancereactionmanifestationi == 0) {a.addAlrgyIntoleranceReactionManifestationTxt("[[");}
		if(allergyintolerancereactionmanifestation.hasText()) {

			a.addAlrgyIntoleranceReactionManifestationTxt(String.valueOf(allergyintolerancereactionmanifestation.getText()));
		} else {
			a.addAlrgyIntoleranceReactionManifestationTxt("NULL");
		}

		if(allergyintolerancereactionmanifestationi == allergyintolerancereactionmanifestationlist.size()-1) {a.addAlrgyIntoleranceReactionManifestationTxt("]]");}


		/******************** allergyintolerancereactionmanifestationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> allergyintolerancereactionmanifestationcodinglist = allergyintolerancereactionmanifestation.getCoding();
		for(int allergyintolerancereactionmanifestationcodingi = 0; allergyintolerancereactionmanifestationcodingi<allergyintolerancereactionmanifestationcodinglist.size();allergyintolerancereactionmanifestationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  allergyintolerancereactionmanifestationcoding = allergyintolerancereactionmanifestationcodinglist.get(allergyintolerancereactionmanifestationcodingi);

		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancereactionmanifestationcodingi == 0) {a.addAlrgyIntoleranceReactionManifestationCdgDsply("[[[");}
		if(allergyintolerancereactionmanifestationcoding.hasDisplay()) {

			a.addAlrgyIntoleranceReactionManifestationCdgDsply(String.valueOf(allergyintolerancereactionmanifestationcoding.getDisplay()));
		} else {
			a.addAlrgyIntoleranceReactionManifestationCdgDsply("NULL");
		}

		if(allergyintolerancereactionmanifestationcodingi == allergyintolerancereactionmanifestationcodinglist.size()-1) {a.addAlrgyIntoleranceReactionManifestationCdgDsply("]]]");}


		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancereactionmanifestationcodingi == 0) {a.addAlrgyIntoleranceReactionManifestationCdgVrsn("[[[");}
		if(allergyintolerancereactionmanifestationcoding.hasVersion()) {

			a.addAlrgyIntoleranceReactionManifestationCdgVrsn(String.valueOf(allergyintolerancereactionmanifestationcoding.getVersion()));
		} else {
			a.addAlrgyIntoleranceReactionManifestationCdgVrsn("NULL");
		}

		if(allergyintolerancereactionmanifestationcodingi == allergyintolerancereactionmanifestationcodinglist.size()-1) {a.addAlrgyIntoleranceReactionManifestationCdgVrsn("]]]");}


		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Cd ********************************************************************************/
		if(allergyintolerancereactionmanifestationcodingi == 0) {a.addAlrgyIntoleranceReactionManifestationCdgCd("[[[");}
		if(allergyintolerancereactionmanifestationcoding.hasCode()) {

			a.addAlrgyIntoleranceReactionManifestationCdgCd(String.valueOf(allergyintolerancereactionmanifestationcoding.getCode()));
		} else {
			a.addAlrgyIntoleranceReactionManifestationCdgCd("NULL");
		}

		if(allergyintolerancereactionmanifestationcodingi == allergyintolerancereactionmanifestationcodinglist.size()-1) {a.addAlrgyIntoleranceReactionManifestationCdgCd("]]]");}


		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancereactionmanifestationcodingi == 0) {a.addAlrgyIntoleranceReactionManifestationCdgUsrSltd("[[[");}
		if(allergyintolerancereactionmanifestationcoding.hasUserSelected()) {

			a.addAlrgyIntoleranceReactionManifestationCdgUsrSltd(String.valueOf(allergyintolerancereactionmanifestationcoding.getUserSelected()));
		} else {
			a.addAlrgyIntoleranceReactionManifestationCdgUsrSltd("NULL");
		}

		if(allergyintolerancereactionmanifestationcodingi == allergyintolerancereactionmanifestationcodinglist.size()-1) {a.addAlrgyIntoleranceReactionManifestationCdgUsrSltd("]]]");}


		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Sys ********************************************************************************/
		if(allergyintolerancereactionmanifestationcodingi == 0) {a.addAlrgyIntoleranceReactionManifestationCdgSys("[[[");}
		if(allergyintolerancereactionmanifestationcoding.hasSystem()) {

			a.addAlrgyIntoleranceReactionManifestationCdgSys(String.valueOf(allergyintolerancereactionmanifestationcoding.getSystem()));
		} else {
			a.addAlrgyIntoleranceReactionManifestationCdgSys("NULL");
		}

		if(allergyintolerancereactionmanifestationcodingi == allergyintolerancereactionmanifestationcodinglist.size()-1) {a.addAlrgyIntoleranceReactionManifestationCdgSys("]]]");}


		 };
		 };
		/******************** allergyintolerancereactionexposureroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionexposureroute = allergyintolerancereaction.getExposureRoute();

		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Txt ********************************************************************************/
		if(allergyintolerancereactionexposureroute.hasText()) {

			a.addAlrgyIntoleranceReactionExposureRouteTxt(String.valueOf(allergyintolerancereactionexposureroute.getText()));
		} else {
			a.addAlrgyIntoleranceReactionExposureRouteTxt("NULL");
		}


		/******************** allergyintolerancereactionexposureroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> allergyintolerancereactionexposureroutecodinglist = allergyintolerancereactionexposureroute.getCoding();
		for(int allergyintolerancereactionexposureroutecodingi = 0; allergyintolerancereactionexposureroutecodingi<allergyintolerancereactionexposureroutecodinglist.size();allergyintolerancereactionexposureroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  allergyintolerancereactionexposureroutecoding = allergyintolerancereactionexposureroutecodinglist.get(allergyintolerancereactionexposureroutecodingi);

		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancereactionexposureroutecodingi == 0) {a.addAlrgyIntoleranceReactionExposureRouteCdgDsply("[[");}
		if(allergyintolerancereactionexposureroutecoding.hasDisplay()) {

			a.addAlrgyIntoleranceReactionExposureRouteCdgDsply(String.valueOf(allergyintolerancereactionexposureroutecoding.getDisplay()));
		} else {
			a.addAlrgyIntoleranceReactionExposureRouteCdgDsply("NULL");
		}

		if(allergyintolerancereactionexposureroutecodingi == allergyintolerancereactionexposureroutecodinglist.size()-1) {a.addAlrgyIntoleranceReactionExposureRouteCdgDsply("]]");}


		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancereactionexposureroutecodingi == 0) {a.addAlrgyIntoleranceReactionExposureRouteCdgVrsn("[[");}
		if(allergyintolerancereactionexposureroutecoding.hasVersion()) {

			a.addAlrgyIntoleranceReactionExposureRouteCdgVrsn(String.valueOf(allergyintolerancereactionexposureroutecoding.getVersion()));
		} else {
			a.addAlrgyIntoleranceReactionExposureRouteCdgVrsn("NULL");
		}

		if(allergyintolerancereactionexposureroutecodingi == allergyintolerancereactionexposureroutecodinglist.size()-1) {a.addAlrgyIntoleranceReactionExposureRouteCdgVrsn("]]");}


		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Cd ********************************************************************************/
		if(allergyintolerancereactionexposureroutecodingi == 0) {a.addAlrgyIntoleranceReactionExposureRouteCdgCd("[[");}
		if(allergyintolerancereactionexposureroutecoding.hasCode()) {

			a.addAlrgyIntoleranceReactionExposureRouteCdgCd(String.valueOf(allergyintolerancereactionexposureroutecoding.getCode()));
		} else {
			a.addAlrgyIntoleranceReactionExposureRouteCdgCd("NULL");
		}

		if(allergyintolerancereactionexposureroutecodingi == allergyintolerancereactionexposureroutecodinglist.size()-1) {a.addAlrgyIntoleranceReactionExposureRouteCdgCd("]]");}


		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancereactionexposureroutecodingi == 0) {a.addAlrgyIntoleranceReactionExposureRouteCdgUsrSltd("[[");}
		if(allergyintolerancereactionexposureroutecoding.hasUserSelected()) {

			a.addAlrgyIntoleranceReactionExposureRouteCdgUsrSltd(String.valueOf(allergyintolerancereactionexposureroutecoding.getUserSelected()));
		} else {
			a.addAlrgyIntoleranceReactionExposureRouteCdgUsrSltd("NULL");
		}

		if(allergyintolerancereactionexposureroutecodingi == allergyintolerancereactionexposureroutecodinglist.size()-1) {a.addAlrgyIntoleranceReactionExposureRouteCdgUsrSltd("]]");}


		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Sys ********************************************************************************/
		if(allergyintolerancereactionexposureroutecodingi == 0) {a.addAlrgyIntoleranceReactionExposureRouteCdgSys("[[");}
		if(allergyintolerancereactionexposureroutecoding.hasSystem()) {

			a.addAlrgyIntoleranceReactionExposureRouteCdgSys(String.valueOf(allergyintolerancereactionexposureroutecoding.getSystem()));
		} else {
			a.addAlrgyIntoleranceReactionExposureRouteCdgSys("NULL");
		}

		if(allergyintolerancereactionexposureroutecodingi == allergyintolerancereactionexposureroutecodinglist.size()-1) {a.addAlrgyIntoleranceReactionExposureRouteCdgSys("]]");}


		 };
		 };
		/******************** AlrgyIntolerance_Pnt ********************************************************************************/
		if(allergyintolerance.hasPatient()) {

			if(allergyintolerance.getPatient().getReference() != null) {
			a.addAlrgyIntolerancePnt(allergyintolerance.getPatient().getReference());
			}
		} else {
			a.addAlrgyIntolerancePnt("NULL");
		}


		/******************** allergyintoleranceverificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceverificationstatus = allergyintolerance.getVerificationStatus();

		/******************** AlrgyIntolerance_VrfctnSts_Txt ********************************************************************************/
		if(allergyintoleranceverificationstatus.hasText()) {

			a.addAlrgyIntoleranceVrfctnStsTxt(String.valueOf(allergyintoleranceverificationstatus.getText()));
		} else {
			a.addAlrgyIntoleranceVrfctnStsTxt("NULL");
		}


		/******************** allergyintoleranceverificationstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> allergyintoleranceverificationstatuscodinglist = allergyintoleranceverificationstatus.getCoding();
		for(int allergyintoleranceverificationstatuscodingi = 0; allergyintoleranceverificationstatuscodingi<allergyintoleranceverificationstatuscodinglist.size();allergyintoleranceverificationstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  allergyintoleranceverificationstatuscoding = allergyintoleranceverificationstatuscodinglist.get(allergyintoleranceverificationstatuscodingi);

		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(allergyintoleranceverificationstatuscodingi == 0) {a.addAlrgyIntoleranceVrfctnStsCdgDsply("[");}
		if(allergyintoleranceverificationstatuscoding.hasDisplay()) {

			a.addAlrgyIntoleranceVrfctnStsCdgDsply(String.valueOf(allergyintoleranceverificationstatuscoding.getDisplay()));
		} else {
			a.addAlrgyIntoleranceVrfctnStsCdgDsply("NULL");
		}

		if(allergyintoleranceverificationstatuscodingi == allergyintoleranceverificationstatuscodinglist.size()-1) {a.addAlrgyIntoleranceVrfctnStsCdgDsply("]");}


		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(allergyintoleranceverificationstatuscodingi == 0) {a.addAlrgyIntoleranceVrfctnStsCdgVrsn("[");}
		if(allergyintoleranceverificationstatuscoding.hasVersion()) {

			a.addAlrgyIntoleranceVrfctnStsCdgVrsn(String.valueOf(allergyintoleranceverificationstatuscoding.getVersion()));
		} else {
			a.addAlrgyIntoleranceVrfctnStsCdgVrsn("NULL");
		}

		if(allergyintoleranceverificationstatuscodingi == allergyintoleranceverificationstatuscodinglist.size()-1) {a.addAlrgyIntoleranceVrfctnStsCdgVrsn("]");}


		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(allergyintoleranceverificationstatuscodingi == 0) {a.addAlrgyIntoleranceVrfctnStsCdgCd("[");}
		if(allergyintoleranceverificationstatuscoding.hasCode()) {

			a.addAlrgyIntoleranceVrfctnStsCdgCd(String.valueOf(allergyintoleranceverificationstatuscoding.getCode()));
		} else {
			a.addAlrgyIntoleranceVrfctnStsCdgCd("NULL");
		}

		if(allergyintoleranceverificationstatuscodingi == allergyintoleranceverificationstatuscodinglist.size()-1) {a.addAlrgyIntoleranceVrfctnStsCdgCd("]");}


		/******************** AlrgyIntolerance_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(allergyintoleranceverificationstatuscodingi == 0) {a.addAlrgyIntoleranceVrfctnStsCdgUsrSltd("[");}
		if(allergyintoleranceverificationstatuscoding.hasUserSelected()) {

			a.addAlrgyIntoleranceVrfctnStsCdgUsrSltd(String.valueOf(allergyintoleranceverificationstatuscoding.getUserSelected()));
		} else {
			a.addAlrgyIntoleranceVrfctnStsCdgUsrSltd("NULL");
		}

		if(allergyintoleranceverificationstatuscodingi == allergyintoleranceverificationstatuscodinglist.size()-1) {a.addAlrgyIntoleranceVrfctnStsCdgUsrSltd("]");}


		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(allergyintoleranceverificationstatuscodingi == 0) {a.addAlrgyIntoleranceVrfctnStsCdgSys("[");}
		if(allergyintoleranceverificationstatuscoding.hasSystem()) {

			a.addAlrgyIntoleranceVrfctnStsCdgSys(String.valueOf(allergyintoleranceverificationstatuscoding.getSystem()));
		} else {
			a.addAlrgyIntoleranceVrfctnStsCdgSys("NULL");
		}

		if(allergyintoleranceverificationstatuscodingi == allergyintoleranceverificationstatuscodinglist.size()-1) {a.addAlrgyIntoleranceVrfctnStsCdgSys("]");}


		 };
		/******************** AlrgyIntolerance_OnDtTimeTyp ********************************************************************************/
		if(allergyintolerance.hasOnsetDateTimeType()) {

			a.addAlrgyIntoleranceOnDtTimeTyp("\""+allergyintolerance.getOnsetDateTimeType().getValueAsString()+"\"");
		} else {
			a.addAlrgyIntoleranceOnDtTimeTyp("NULL");
		}


		return a;
	}
}
