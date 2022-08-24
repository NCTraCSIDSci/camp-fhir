package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EffectEvidenceSynthesis;
public class EffectEvidenceSynthesisBidirectionalConversion 
{
	public EffectEvidenceSynthesis EffectEvidenceSynthesiss(org.hl7.fhir.r4.model.EffectEvidenceSynthesis effectevidencesynthesis) throws ParseException
	{
		 main.java.com.campfhir.model.EffectEvidenceSynthesis e = new  main.java.com.campfhir.model.EffectEvidenceSynthesis();

		/******************** id ********************************************************************************/
		e.setId(effectevidencesynthesis.getIdElement().getIdPart());

		/******************** EfctEvdnceSynths_Nm ********************************************************************************/
		if(effectevidencesynthesis.hasName()) {

			e.addEfctEvdnceSynthsNm(String.valueOf(effectevidencesynthesis.getName()));
		} else {
			e.addEfctEvdnceSynthsNm("NULL");
		}


		/******************** EfctEvdnceSynths_Vrsn ********************************************************************************/
		if(effectevidencesynthesis.hasVersion()) {

			e.addEfctEvdnceSynthsVrsn(String.valueOf(effectevidencesynthesis.getVersion()));
		} else {
			e.addEfctEvdnceSynthsVrsn("NULL");
		}


		/******************** EfctEvdnceSynths_Dt ********************************************************************************/
		if(effectevidencesynthesis.hasDate()) {

			e.addEfctEvdnceSynthsDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesis.getDate())+"\"");
		} else {
			e.addEfctEvdnceSynthsDt("NULL");
		}


		/******************** effectevidencesynthesisstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus effectevidencesynthesisstatus = effectevidencesynthesis.getStatus();
		if(effectevidencesynthesisstatus!=null) {
			e.addEfctEvdnceSynthsSts(effectevidencesynthesisstatus.toCode());
		} else {
			e.addEfctEvdnceSynthsSts("NULL");
		}

		/******************** EfctEvdnceSynths_Dscrptn ********************************************************************************/
		if(effectevidencesynthesis.hasDescription()) {

			e.addEfctEvdnceSynthsDscrptn(String.valueOf(effectevidencesynthesis.getDescription()));
		} else {
			e.addEfctEvdnceSynthsDscrptn("NULL");
		}


		/******************** effectevidencesynthesisnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> effectevidencesynthesisnotelist = effectevidencesynthesis.getNote();
		for(int effectevidencesynthesisnotei = 0; effectevidencesynthesisnotei<effectevidencesynthesisnotelist.size();effectevidencesynthesisnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  effectevidencesynthesisnote = effectevidencesynthesisnotelist.get(effectevidencesynthesisnotei);

		/******************** EfctEvdnceSynths_Nt_Time ********************************************************************************/
		if(effectevidencesynthesisnotei == 0) {e.addEfctEvdnceSynthsNtTime("[");}
		if(effectevidencesynthesisnote.hasTime()) {

			e.addEfctEvdnceSynthsNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisnote.getTime())+"\"");
		} else {
			e.addEfctEvdnceSynthsNtTime("NULL");
		}

		if(effectevidencesynthesisnotei == effectevidencesynthesisnotelist.size()-1) {e.addEfctEvdnceSynthsNtTime("]");}


		/******************** EfctEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(effectevidencesynthesisnotei == 0) {e.addEfctEvdnceSynthsNtAthrRfrnc("[");}
		if(effectevidencesynthesisnote.hasAuthorReference()) {

			if(effectevidencesynthesisnote.getAuthorReference().getReference() != null) {
			e.addEfctEvdnceSynthsNtAthrRfrnc(effectevidencesynthesisnote.getAuthorReference().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsNtAthrRfrnc("NULL");
		}

		if(effectevidencesynthesisnotei == effectevidencesynthesisnotelist.size()-1) {e.addEfctEvdnceSynthsNtAthrRfrnc("]");}


		/******************** EfctEvdnceSynths_Nt_Txt ********************************************************************************/
		if(effectevidencesynthesisnotei == 0) {e.addEfctEvdnceSynthsNtTxt("[");}
		if(effectevidencesynthesisnote.hasText()) {

			e.addEfctEvdnceSynthsNtTxt(String.valueOf(effectevidencesynthesisnote.getText()));
		} else {
			e.addEfctEvdnceSynthsNtTxt("NULL");
		}

		if(effectevidencesynthesisnotei == effectevidencesynthesisnotelist.size()-1) {e.addEfctEvdnceSynthsNtTxt("]");}


		/******************** EfctEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(effectevidencesynthesisnotei == 0) {e.addEfctEvdnceSynthsNtAthrStrgTyp("[");}
		if(effectevidencesynthesisnote.hasAuthorStringType()) {

			e.addEfctEvdnceSynthsNtAthrStrgTyp("\""+effectevidencesynthesisnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			e.addEfctEvdnceSynthsNtAthrStrgTyp("NULL");
		}

		if(effectevidencesynthesisnotei == effectevidencesynthesisnotelist.size()-1) {e.addEfctEvdnceSynthsNtAthrStrgTyp("]");}


		 };
		/******************** effectevidencesynthesisidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> effectevidencesynthesisidentifierlist = effectevidencesynthesis.getIdentifier();
		for(int effectevidencesynthesisidentifieri = 0; effectevidencesynthesisidentifieri<effectevidencesynthesisidentifierlist.size();effectevidencesynthesisidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  effectevidencesynthesisidentifier = effectevidencesynthesisidentifierlist.get(effectevidencesynthesisidentifieri);

		/******************** EfctEvdnceSynths_Id_Vl ********************************************************************************/
		if(effectevidencesynthesisidentifieri == 0) {e.addEfctEvdnceSynthsIdVl("[");}
		if(effectevidencesynthesisidentifier.hasValue()) {

			e.addEfctEvdnceSynthsIdVl(String.valueOf(effectevidencesynthesisidentifier.getValue()));
		} else {
			e.addEfctEvdnceSynthsIdVl("NULL");
		}

		if(effectevidencesynthesisidentifieri == effectevidencesynthesisidentifierlist.size()-1) {e.addEfctEvdnceSynthsIdVl("]");}


		/******************** effectevidencesynthesisidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisidentifiertype = effectevidencesynthesisidentifier.getType();

		/******************** EfctEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesisidentifieri == 0) {e.addEfctEvdnceSynthsIdTypTxt("[");}
		if(effectevidencesynthesisidentifiertype.hasText()) {

			e.addEfctEvdnceSynthsIdTypTxt(String.valueOf(effectevidencesynthesisidentifiertype.getText()));
		} else {
			e.addEfctEvdnceSynthsIdTypTxt("NULL");
		}

		if(effectevidencesynthesisidentifieri == effectevidencesynthesisidentifierlist.size()-1) {e.addEfctEvdnceSynthsIdTypTxt("]");}


		/******************** effectevidencesynthesisidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesisidentifiertypecodinglist = effectevidencesynthesisidentifiertype.getCoding();
		for(int effectevidencesynthesisidentifiertypecodingi = 0; effectevidencesynthesisidentifiertypecodingi<effectevidencesynthesisidentifiertypecodinglist.size();effectevidencesynthesisidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesisidentifiertypecoding = effectevidencesynthesisidentifiertypecodinglist.get(effectevidencesynthesisidentifiertypecodingi);

		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecodingi == 0) {e.addEfctEvdnceSynthsIdTypCdgDsply("[[");}
		if(effectevidencesynthesisidentifiertypecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsIdTypCdgDsply(String.valueOf(effectevidencesynthesisidentifiertypecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsIdTypCdgDsply("NULL");
		}

		if(effectevidencesynthesisidentifiertypecodingi == effectevidencesynthesisidentifiertypecodinglist.size()-1) {e.addEfctEvdnceSynthsIdTypCdgDsply("]]");}


		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecodingi == 0) {e.addEfctEvdnceSynthsIdTypCdgVrsn("[[");}
		if(effectevidencesynthesisidentifiertypecoding.hasVersion()) {

			e.addEfctEvdnceSynthsIdTypCdgVrsn(String.valueOf(effectevidencesynthesisidentifiertypecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsIdTypCdgVrsn("NULL");
		}

		if(effectevidencesynthesisidentifiertypecodingi == effectevidencesynthesisidentifiertypecodinglist.size()-1) {e.addEfctEvdnceSynthsIdTypCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecodingi == 0) {e.addEfctEvdnceSynthsIdTypCdgCd("[[");}
		if(effectevidencesynthesisidentifiertypecoding.hasCode()) {

			e.addEfctEvdnceSynthsIdTypCdgCd(String.valueOf(effectevidencesynthesisidentifiertypecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsIdTypCdgCd("NULL");
		}

		if(effectevidencesynthesisidentifiertypecodingi == effectevidencesynthesisidentifiertypecodinglist.size()-1) {e.addEfctEvdnceSynthsIdTypCdgCd("]]");}


		/******************** EfctEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecodingi == 0) {e.addEfctEvdnceSynthsIdTypCdgUsrSltd("[[");}
		if(effectevidencesynthesisidentifiertypecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsIdTypCdgUsrSltd(String.valueOf(effectevidencesynthesisidentifiertypecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsIdTypCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesisidentifiertypecodingi == effectevidencesynthesisidentifiertypecodinglist.size()-1) {e.addEfctEvdnceSynthsIdTypCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisidentifiertypecodingi == 0) {e.addEfctEvdnceSynthsIdTypCdgSys("[[");}
		if(effectevidencesynthesisidentifiertypecoding.hasSystem()) {

			e.addEfctEvdnceSynthsIdTypCdgSys(String.valueOf(effectevidencesynthesisidentifiertypecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsIdTypCdgSys("NULL");
		}

		if(effectevidencesynthesisidentifiertypecodingi == effectevidencesynthesisidentifiertypecodinglist.size()-1) {e.addEfctEvdnceSynthsIdTypCdgSys("]]");}


		 };
		/******************** effectevidencesynthesisidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisidentifierperiod = effectevidencesynthesisidentifier.getPeriod();

		/******************** EfctEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisidentifieri == 0) {e.addEfctEvdnceSynthsIdPrdStrt("[");}
		if(effectevidencesynthesisidentifierperiod.hasStart()) {

			e.addEfctEvdnceSynthsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisidentifierperiod.getStart())+"\"");
		} else {
			e.addEfctEvdnceSynthsIdPrdStrt("NULL");
		}

		if(effectevidencesynthesisidentifieri == effectevidencesynthesisidentifierlist.size()-1) {e.addEfctEvdnceSynthsIdPrdStrt("]");}


		/******************** EfctEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(effectevidencesynthesisidentifieri == 0) {e.addEfctEvdnceSynthsIdPrdEnd("[");}
		if(effectevidencesynthesisidentifierperiod.hasEnd()) {

			e.addEfctEvdnceSynthsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisidentifierperiod.getEnd())+"\"");
		} else {
			e.addEfctEvdnceSynthsIdPrdEnd("NULL");
		}

		if(effectevidencesynthesisidentifieri == effectevidencesynthesisidentifierlist.size()-1) {e.addEfctEvdnceSynthsIdPrdEnd("]");}


		/******************** effectevidencesynthesisidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse effectevidencesynthesisidentifieruse = effectevidencesynthesisidentifier.getUse();
		if(effectevidencesynthesisidentifieruse!=null) {
		if(effectevidencesynthesisidentifieri == 0) {

		e.addEfctEvdnceSynthsIdUse("[");		}
			e.addEfctEvdnceSynthsIdUse(effectevidencesynthesisidentifieruse.toCode());
		if(effectevidencesynthesisidentifieri == effectevidencesynthesisidentifierlist.size()-1) {

		e.addEfctEvdnceSynthsIdUse("]");		}

		} else {
			e.addEfctEvdnceSynthsIdUse("NULL");
		}

		/******************** EfctEvdnceSynths_Id_Assigner ********************************************************************************/
		if(effectevidencesynthesisidentifieri == 0) {e.addEfctEvdnceSynthsIdAssigner("[");}
		if(effectevidencesynthesisidentifier.hasAssigner()) {

			if(effectevidencesynthesisidentifier.getAssigner().getReference() != null) {
			e.addEfctEvdnceSynthsIdAssigner(effectevidencesynthesisidentifier.getAssigner().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsIdAssigner("NULL");
		}

		if(effectevidencesynthesisidentifieri == effectevidencesynthesisidentifierlist.size()-1) {e.addEfctEvdnceSynthsIdAssigner("]");}


		/******************** EfctEvdnceSynths_Id_Sys ********************************************************************************/
		if(effectevidencesynthesisidentifieri == 0) {e.addEfctEvdnceSynthsIdSys("[");}
		if(effectevidencesynthesisidentifier.hasSystem()) {

			e.addEfctEvdnceSynthsIdSys(String.valueOf(effectevidencesynthesisidentifier.getSystem()));
		} else {
			e.addEfctEvdnceSynthsIdSys("NULL");
		}

		if(effectevidencesynthesisidentifieri == effectevidencesynthesisidentifierlist.size()-1) {e.addEfctEvdnceSynthsIdSys("]");}


		 };
		/******************** EfctEvdnceSynths_Outcome ********************************************************************************/
		if(effectevidencesynthesis.hasOutcome()) {

			if(effectevidencesynthesis.getOutcome().getReference() != null) {
			e.addEfctEvdnceSynthsOutcome(effectevidencesynthesis.getOutcome().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsOutcome("NULL");
		}


		/******************** effectevidencesynthesiscontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> effectevidencesynthesiscontactlist = effectevidencesynthesis.getContact();
		for(int effectevidencesynthesiscontacti = 0; effectevidencesynthesiscontacti<effectevidencesynthesiscontactlist.size();effectevidencesynthesiscontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  effectevidencesynthesiscontact = effectevidencesynthesiscontactlist.get(effectevidencesynthesiscontacti);

		/******************** EfctEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(effectevidencesynthesiscontacti == 0) {e.addEfctEvdnceSynthsCntctNm("[");}
		if(effectevidencesynthesiscontact.hasName()) {

			e.addEfctEvdnceSynthsCntctNm(String.valueOf(effectevidencesynthesiscontact.getName()));
		} else {
			e.addEfctEvdnceSynthsCntctNm("NULL");
		}

		if(effectevidencesynthesiscontacti == effectevidencesynthesiscontactlist.size()-1) {e.addEfctEvdnceSynthsCntctNm("]");}


		/******************** effectevidencesynthesiscontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> effectevidencesynthesiscontacttelecomlist = effectevidencesynthesiscontact.getTelecom();
		for(int effectevidencesynthesiscontacttelecomi = 0; effectevidencesynthesiscontacttelecomi<effectevidencesynthesiscontacttelecomlist.size();effectevidencesynthesiscontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  effectevidencesynthesiscontacttelecom = effectevidencesynthesiscontacttelecomlist.get(effectevidencesynthesiscontacttelecomi);

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesiscontacttelecomi == 0) {e.addEfctEvdnceSynthsCntctTlcmVl("[[");}
		if(effectevidencesynthesiscontacttelecom.hasValue()) {

			e.addEfctEvdnceSynthsCntctTlcmVl(String.valueOf(effectevidencesynthesiscontacttelecom.getValue()));
		} else {
			e.addEfctEvdnceSynthsCntctTlcmVl("NULL");
		}

		if(effectevidencesynthesiscontacttelecomi == effectevidencesynthesiscontacttelecomlist.size()-1) {e.addEfctEvdnceSynthsCntctTlcmVl("]]");}


		/******************** effectevidencesynthesiscontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiscontacttelecomperiod = effectevidencesynthesiscontacttelecom.getPeriod();

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesiscontacttelecomi == 0) {e.addEfctEvdnceSynthsCntctTlcmPrdStrt("[[");}
		if(effectevidencesynthesiscontacttelecomperiod.hasStart()) {

			e.addEfctEvdnceSynthsCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiscontacttelecomperiod.getStart())+"\"");
		} else {
			e.addEfctEvdnceSynthsCntctTlcmPrdStrt("NULL");
		}

		if(effectevidencesynthesiscontacttelecomi == effectevidencesynthesiscontacttelecomlist.size()-1) {e.addEfctEvdnceSynthsCntctTlcmPrdStrt("]]");}


		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesiscontacttelecomi == 0) {e.addEfctEvdnceSynthsCntctTlcmPrdEnd("[[");}
		if(effectevidencesynthesiscontacttelecomperiod.hasEnd()) {

			e.addEfctEvdnceSynthsCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiscontacttelecomperiod.getEnd())+"\"");
		} else {
			e.addEfctEvdnceSynthsCntctTlcmPrdEnd("NULL");
		}

		if(effectevidencesynthesiscontacttelecomi == effectevidencesynthesiscontacttelecomlist.size()-1) {e.addEfctEvdnceSynthsCntctTlcmPrdEnd("]]");}


		/******************** effectevidencesynthesiscontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesiscontacttelecomuse = effectevidencesynthesiscontacttelecom.getUse();
		if(effectevidencesynthesiscontacttelecomuse!=null) {
		if(effectevidencesynthesiscontacttelecomi == 0) {

		e.addEfctEvdnceSynthsCntctTlcmUse("[[");		}
			e.addEfctEvdnceSynthsCntctTlcmUse(effectevidencesynthesiscontacttelecomuse.toCode());
		if(effectevidencesynthesiscontacttelecomi == effectevidencesynthesiscontacttelecomlist.size()-1) {

		e.addEfctEvdnceSynthsCntctTlcmUse("]]");		}

		} else {
			e.addEfctEvdnceSynthsCntctTlcmUse("NULL");
		}

		/******************** effectevidencesynthesiscontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesiscontacttelecomsystem = effectevidencesynthesiscontacttelecom.getSystem();
		if(effectevidencesynthesiscontacttelecomsystem!=null) {
		if(effectevidencesynthesiscontacttelecomi == 0) {

		e.addEfctEvdnceSynthsCntctTlcmSys("[[");		}
			e.addEfctEvdnceSynthsCntctTlcmSys(effectevidencesynthesiscontacttelecomsystem.toCode());
		if(effectevidencesynthesiscontacttelecomi == effectevidencesynthesiscontacttelecomlist.size()-1) {

		e.addEfctEvdnceSynthsCntctTlcmSys("]]");		}

		} else {
			e.addEfctEvdnceSynthsCntctTlcmSys("NULL");
		}

		/******************** EfctEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesiscontacttelecomi == 0) {e.addEfctEvdnceSynthsCntctTlcmRnk("[[");}
		if(effectevidencesynthesiscontacttelecom.hasRank()) {

			e.addEfctEvdnceSynthsCntctTlcmRnk(String.valueOf(effectevidencesynthesiscontacttelecom.getRank()));
		} else {
			e.addEfctEvdnceSynthsCntctTlcmRnk("NULL");
		}

		if(effectevidencesynthesiscontacttelecomi == effectevidencesynthesiscontacttelecomlist.size()-1) {e.addEfctEvdnceSynthsCntctTlcmRnk("]]");}


		 };
		 };
		/******************** effectevidencesynthesiseffectestimate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimateComponent> effectevidencesynthesiseffectestimatelist = effectevidencesynthesis.getEffectEstimate();
		for(int effectevidencesynthesiseffectestimatei = 0; effectevidencesynthesiseffectestimatei<effectevidencesynthesiseffectestimatelist.size();effectevidencesynthesiseffectestimatei++ ) {
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimateComponent  effectevidencesynthesiseffectestimate = effectevidencesynthesiseffectestimatelist.get(effectevidencesynthesiseffectestimatei);

		/******************** EfctEvdnceSynths_EfctEstmt_Vl ********************************************************************************/
		if(effectevidencesynthesiseffectestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtVl("[");}
		if(effectevidencesynthesiseffectestimate.hasValue()) {

			e.addEfctEvdnceSynthsEfctEstmtVl(String.valueOf(effectevidencesynthesiseffectestimate.getValue()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtVl("NULL");
		}

		if(effectevidencesynthesiseffectestimatei == effectevidencesynthesiseffectestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtVl("]");}


		/******************** effectevidencesynthesiseffectestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimatetype = effectevidencesynthesiseffectestimate.getType();

		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtTypTxt("[");}
		if(effectevidencesynthesiseffectestimatetype.hasText()) {

			e.addEfctEvdnceSynthsEfctEstmtTypTxt(String.valueOf(effectevidencesynthesiseffectestimatetype.getText()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtTypTxt("NULL");
		}

		if(effectevidencesynthesiseffectestimatei == effectevidencesynthesiseffectestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtTypTxt("]");}


		/******************** effectevidencesynthesiseffectestimatetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesiseffectestimatetypecodinglist = effectevidencesynthesiseffectestimatetype.getCoding();
		for(int effectevidencesynthesiseffectestimatetypecodingi = 0; effectevidencesynthesiseffectestimatetypecodingi<effectevidencesynthesiseffectestimatetypecodinglist.size();effectevidencesynthesiseffectestimatetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesiseffectestimatetypecoding = effectevidencesynthesiseffectestimatetypecodinglist.get(effectevidencesynthesiseffectestimatetypecodingi);

		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtTypCdgDsply("[[");}
		if(effectevidencesynthesiseffectestimatetypecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsEfctEstmtTypCdgDsply(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtTypCdgDsply("NULL");
		}

		if(effectevidencesynthesiseffectestimatetypecodingi == effectevidencesynthesiseffectestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtTypCdgDsply("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtTypCdgVrsn("[[");}
		if(effectevidencesynthesiseffectestimatetypecoding.hasVersion()) {

			e.addEfctEvdnceSynthsEfctEstmtTypCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtTypCdgVrsn("NULL");
		}

		if(effectevidencesynthesiseffectestimatetypecodingi == effectevidencesynthesiseffectestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtTypCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtTypCdgCd("[[");}
		if(effectevidencesynthesiseffectestimatetypecoding.hasCode()) {

			e.addEfctEvdnceSynthsEfctEstmtTypCdgCd(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtTypCdgCd("NULL");
		}

		if(effectevidencesynthesiseffectestimatetypecodingi == effectevidencesynthesiseffectestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtTypCdgCd("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd("[[");}
		if(effectevidencesynthesiseffectestimatetypecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesiseffectestimatetypecodingi == effectevidencesynthesiseffectestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtTypCdgSys("[[");}
		if(effectevidencesynthesiseffectestimatetypecoding.hasSystem()) {

			e.addEfctEvdnceSynthsEfctEstmtTypCdgSys(String.valueOf(effectevidencesynthesiseffectestimatetypecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtTypCdgSys("NULL");
		}

		if(effectevidencesynthesiseffectestimatetypecodingi == effectevidencesynthesiseffectestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtTypCdgSys("]]");}


		 };
		/******************** EfctEvdnceSynths_EfctEstmt_Dscrptn ********************************************************************************/
		if(effectevidencesynthesiseffectestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtDscrptn("[");}
		if(effectevidencesynthesiseffectestimate.hasDescription()) {

			e.addEfctEvdnceSynthsEfctEstmtDscrptn(String.valueOf(effectevidencesynthesiseffectestimate.getDescription()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtDscrptn("NULL");
		}

		if(effectevidencesynthesiseffectestimatei == effectevidencesynthesiseffectestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtDscrptn("]");}


		/******************** effectevidencesynthesiseffectestimateunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimateunitofmeasure = effectevidencesynthesiseffectestimate.getUnitOfMeasure();

		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrTxt("[");}
		if(effectevidencesynthesiseffectestimateunitofmeasure.hasText()) {

			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrTxt(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasure.getText()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrTxt("NULL");
		}

		if(effectevidencesynthesiseffectestimatei == effectevidencesynthesiseffectestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrTxt("]");}


		/******************** effectevidencesynthesiseffectestimateunitofmeasurecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesiseffectestimateunitofmeasurecodinglist = effectevidencesynthesiseffectestimateunitofmeasure.getCoding();
		for(int effectevidencesynthesiseffectestimateunitofmeasurecodingi = 0; effectevidencesynthesiseffectestimateunitofmeasurecodingi<effectevidencesynthesiseffectestimateunitofmeasurecodinglist.size();effectevidencesynthesiseffectestimateunitofmeasurecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesiseffectestimateunitofmeasurecoding = effectevidencesynthesiseffectestimateunitofmeasurecodinglist.get(effectevidencesynthesiseffectestimateunitofmeasurecodingi);

		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply("[[");}
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply("NULL");
		}

		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == effectevidencesynthesiseffectestimateunitofmeasurecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn("[[");}
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasVersion()) {

			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn("NULL");
		}

		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == effectevidencesynthesiseffectestimateunitofmeasurecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd("[[");}
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasCode()) {

			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd("NULL");
		}

		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == effectevidencesynthesiseffectestimateunitofmeasurecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd("[[");}
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == effectevidencesynthesiseffectestimateunitofmeasurecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys("[[");}
		if(effectevidencesynthesiseffectestimateunitofmeasurecoding.hasSystem()) {

			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys(String.valueOf(effectevidencesynthesiseffectestimateunitofmeasurecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys("NULL");
		}

		if(effectevidencesynthesiseffectestimateunitofmeasurecodingi == effectevidencesynthesiseffectestimateunitofmeasurecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys("]]");}


		 };
		/******************** effectevidencesynthesiseffectestimateprecisionestimate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent> effectevidencesynthesiseffectestimateprecisionestimatelist = effectevidencesynthesiseffectestimate.getPrecisionEstimate();
		for(int effectevidencesynthesiseffectestimateprecisionestimatei = 0; effectevidencesynthesiseffectestimateprecisionestimatei<effectevidencesynthesiseffectestimateprecisionestimatelist.size();effectevidencesynthesiseffectestimateprecisionestimatei++ ) {
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent  effectevidencesynthesiseffectestimateprecisionestimate = effectevidencesynthesiseffectestimateprecisionestimatelist.get(effectevidencesynthesiseffectestimateprecisionestimatei);

		/******************** effectevidencesynthesiseffectestimateprecisionestimatetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimateprecisionestimatetype = effectevidencesynthesiseffectestimateprecisionestimate.getType();

		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt("[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimatetype.hasText()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetype.getText()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatei == effectevidencesynthesiseffectestimateprecisionestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt("]]");}


		/******************** effectevidencesynthesiseffectestimateprecisionestimatetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist = effectevidencesynthesiseffectestimateprecisionestimatetype.getCoding();
		for(int effectevidencesynthesiseffectestimateprecisionestimatetypecodingi = 0; effectevidencesynthesiseffectestimateprecisionestimatetypecodingi<effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist.size();effectevidencesynthesiseffectestimateprecisionestimatetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesiseffectestimateprecisionestimatetypecoding = effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist.get(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi);

		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply("[[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply("]]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn("[[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasVersion()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn("]]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd("[[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasCode()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd("]]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd("[[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd("]]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys("[[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.hasSystem()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimatetypecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatetypecodingi == effectevidencesynthesiseffectestimateprecisionestimatetypecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys("]]]");}


		 };
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel("[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimate.hasLevel()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimate.getLevel()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatei == effectevidencesynthesiseffectestimateprecisionestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_From ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom("[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimate.hasFrom()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimate.getFrom()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatei == effectevidencesynthesiseffectestimateprecisionestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_To ********************************************************************************/
		if(effectevidencesynthesiseffectestimateprecisionestimatei == 0) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo("[[");}
		if(effectevidencesynthesiseffectestimateprecisionestimate.hasTo()) {

			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo(String.valueOf(effectevidencesynthesiseffectestimateprecisionestimate.getTo()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo("NULL");
		}

		if(effectevidencesynthesiseffectestimateprecisionestimatei == effectevidencesynthesiseffectestimateprecisionestimatelist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo("]]");}


		 };
		/******************** effectevidencesynthesiseffectestimatevariantstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiseffectestimatevariantstate = effectevidencesynthesiseffectestimate.getVariantState();

		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Txt ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstate.hasText()) {

			e.addEfctEvdnceSynthsEfctEstmtVariantStateTxt(String.valueOf(effectevidencesynthesiseffectestimatevariantstate.getText()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtVariantStateTxt("NULL");
		}


		/******************** effectevidencesynthesiseffectestimatevariantstatecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesiseffectestimatevariantstatecodinglist = effectevidencesynthesiseffectestimatevariantstate.getCoding();
		for(int effectevidencesynthesiseffectestimatevariantstatecodingi = 0; effectevidencesynthesiseffectestimatevariantstatecodingi<effectevidencesynthesiseffectestimatevariantstatecodinglist.size();effectevidencesynthesiseffectestimatevariantstatecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesiseffectestimatevariantstatecoding = effectevidencesynthesiseffectestimatevariantstatecodinglist.get(effectevidencesynthesiseffectestimatevariantstatecodingi);

		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply("[[");}
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply("NULL");
		}

		if(effectevidencesynthesiseffectestimatevariantstatecodingi == effectevidencesynthesiseffectestimatevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn("[[");}
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasVersion()) {

			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn("NULL");
		}

		if(effectevidencesynthesiseffectestimatevariantstatecodingi == effectevidencesynthesiseffectestimatevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgCd("[[");}
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasCode()) {

			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgCd(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgCd("NULL");
		}

		if(effectevidencesynthesiseffectestimatevariantstatecodingi == effectevidencesynthesiseffectestimatevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgCd("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd("[[");}
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesiseffectestimatevariantstatecodingi == effectevidencesynthesiseffectestimatevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiseffectestimatevariantstatecodingi == 0) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgSys("[[");}
		if(effectevidencesynthesiseffectestimatevariantstatecoding.hasSystem()) {

			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgSys(String.valueOf(effectevidencesynthesiseffectestimatevariantstatecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgSys("NULL");
		}

		if(effectevidencesynthesiseffectestimatevariantstatecodingi == effectevidencesynthesiseffectestimatevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsEfctEstmtVariantStateCdgSys("]]");}


		 };
		 };
		/******************** EfctEvdnceSynths_Copyright ********************************************************************************/
		if(effectevidencesynthesis.hasCopyright()) {

			e.addEfctEvdnceSynthsCopyright(String.valueOf(effectevidencesynthesis.getCopyright()));
		} else {
			e.addEfctEvdnceSynthsCopyright("NULL");
		}


		/******************** EfctEvdnceSynths_ApprovalDt ********************************************************************************/
		if(effectevidencesynthesis.hasApprovalDate()) {

			e.addEfctEvdnceSynthsApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesis.getApprovalDate())+"\"");
		} else {
			e.addEfctEvdnceSynthsApprovalDt("NULL");
		}


		/******************** effectevidencesynthesisendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> effectevidencesynthesisendorserlist = effectevidencesynthesis.getEndorser();
		for(int effectevidencesynthesisendorseri = 0; effectevidencesynthesisendorseri<effectevidencesynthesisendorserlist.size();effectevidencesynthesisendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  effectevidencesynthesisendorser = effectevidencesynthesisendorserlist.get(effectevidencesynthesisendorseri);

		/******************** EfctEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(effectevidencesynthesisendorseri == 0) {e.addEfctEvdnceSynthsEndsrNm("[");}
		if(effectevidencesynthesisendorser.hasName()) {

			e.addEfctEvdnceSynthsEndsrNm(String.valueOf(effectevidencesynthesisendorser.getName()));
		} else {
			e.addEfctEvdnceSynthsEndsrNm("NULL");
		}

		if(effectevidencesynthesisendorseri == effectevidencesynthesisendorserlist.size()-1) {e.addEfctEvdnceSynthsEndsrNm("]");}


		/******************** effectevidencesynthesisendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> effectevidencesynthesisendorsertelecomlist = effectevidencesynthesisendorser.getTelecom();
		for(int effectevidencesynthesisendorsertelecomi = 0; effectevidencesynthesisendorsertelecomi<effectevidencesynthesisendorsertelecomlist.size();effectevidencesynthesisendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  effectevidencesynthesisendorsertelecom = effectevidencesynthesisendorsertelecomlist.get(effectevidencesynthesisendorsertelecomi);

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesisendorsertelecomi == 0) {e.addEfctEvdnceSynthsEndsrTlcmVl("[[");}
		if(effectevidencesynthesisendorsertelecom.hasValue()) {

			e.addEfctEvdnceSynthsEndsrTlcmVl(String.valueOf(effectevidencesynthesisendorsertelecom.getValue()));
		} else {
			e.addEfctEvdnceSynthsEndsrTlcmVl("NULL");
		}

		if(effectevidencesynthesisendorsertelecomi == effectevidencesynthesisendorsertelecomlist.size()-1) {e.addEfctEvdnceSynthsEndsrTlcmVl("]]");}


		/******************** effectevidencesynthesisendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisendorsertelecomperiod = effectevidencesynthesisendorsertelecom.getPeriod();

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisendorsertelecomi == 0) {e.addEfctEvdnceSynthsEndsrTlcmPrdStrt("[[");}
		if(effectevidencesynthesisendorsertelecomperiod.hasStart()) {

			e.addEfctEvdnceSynthsEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisendorsertelecomperiod.getStart())+"\"");
		} else {
			e.addEfctEvdnceSynthsEndsrTlcmPrdStrt("NULL");
		}

		if(effectevidencesynthesisendorsertelecomi == effectevidencesynthesisendorsertelecomlist.size()-1) {e.addEfctEvdnceSynthsEndsrTlcmPrdStrt("]]");}


		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesisendorsertelecomi == 0) {e.addEfctEvdnceSynthsEndsrTlcmPrdEnd("[[");}
		if(effectevidencesynthesisendorsertelecomperiod.hasEnd()) {

			e.addEfctEvdnceSynthsEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisendorsertelecomperiod.getEnd())+"\"");
		} else {
			e.addEfctEvdnceSynthsEndsrTlcmPrdEnd("NULL");
		}

		if(effectevidencesynthesisendorsertelecomi == effectevidencesynthesisendorsertelecomlist.size()-1) {e.addEfctEvdnceSynthsEndsrTlcmPrdEnd("]]");}


		/******************** effectevidencesynthesisendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesisendorsertelecomuse = effectevidencesynthesisendorsertelecom.getUse();
		if(effectevidencesynthesisendorsertelecomuse!=null) {
		if(effectevidencesynthesisendorsertelecomi == 0) {

		e.addEfctEvdnceSynthsEndsrTlcmUse("[[");		}
			e.addEfctEvdnceSynthsEndsrTlcmUse(effectevidencesynthesisendorsertelecomuse.toCode());
		if(effectevidencesynthesisendorsertelecomi == effectevidencesynthesisendorsertelecomlist.size()-1) {

		e.addEfctEvdnceSynthsEndsrTlcmUse("]]");		}

		} else {
			e.addEfctEvdnceSynthsEndsrTlcmUse("NULL");
		}

		/******************** effectevidencesynthesisendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesisendorsertelecomsystem = effectevidencesynthesisendorsertelecom.getSystem();
		if(effectevidencesynthesisendorsertelecomsystem!=null) {
		if(effectevidencesynthesisendorsertelecomi == 0) {

		e.addEfctEvdnceSynthsEndsrTlcmSys("[[");		}
			e.addEfctEvdnceSynthsEndsrTlcmSys(effectevidencesynthesisendorsertelecomsystem.toCode());
		if(effectevidencesynthesisendorsertelecomi == effectevidencesynthesisendorsertelecomlist.size()-1) {

		e.addEfctEvdnceSynthsEndsrTlcmSys("]]");		}

		} else {
			e.addEfctEvdnceSynthsEndsrTlcmSys("NULL");
		}

		/******************** EfctEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesisendorsertelecomi == 0) {e.addEfctEvdnceSynthsEndsrTlcmRnk("[[");}
		if(effectevidencesynthesisendorsertelecom.hasRank()) {

			e.addEfctEvdnceSynthsEndsrTlcmRnk(String.valueOf(effectevidencesynthesisendorsertelecom.getRank()));
		} else {
			e.addEfctEvdnceSynthsEndsrTlcmRnk("NULL");
		}

		if(effectevidencesynthesisendorsertelecomi == effectevidencesynthesisendorsertelecomlist.size()-1) {e.addEfctEvdnceSynthsEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** EfctEvdnceSynths_LastReviewDt ********************************************************************************/
		if(effectevidencesynthesis.hasLastReviewDate()) {

			e.addEfctEvdnceSynthsLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesis.getLastReviewDate())+"\"");
		} else {
			e.addEfctEvdnceSynthsLastReviewDt("NULL");
		}


		/******************** effectevidencesynthesiseditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> effectevidencesynthesiseditorlist = effectevidencesynthesis.getEditor();
		for(int effectevidencesynthesiseditori = 0; effectevidencesynthesiseditori<effectevidencesynthesiseditorlist.size();effectevidencesynthesiseditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  effectevidencesynthesiseditor = effectevidencesynthesiseditorlist.get(effectevidencesynthesiseditori);

		/******************** EfctEvdnceSynths_Editor_Nm ********************************************************************************/
		if(effectevidencesynthesiseditori == 0) {e.addEfctEvdnceSynthsEditorNm("[");}
		if(effectevidencesynthesiseditor.hasName()) {

			e.addEfctEvdnceSynthsEditorNm(String.valueOf(effectevidencesynthesiseditor.getName()));
		} else {
			e.addEfctEvdnceSynthsEditorNm("NULL");
		}

		if(effectevidencesynthesiseditori == effectevidencesynthesiseditorlist.size()-1) {e.addEfctEvdnceSynthsEditorNm("]");}


		/******************** effectevidencesynthesiseditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> effectevidencesynthesiseditortelecomlist = effectevidencesynthesiseditor.getTelecom();
		for(int effectevidencesynthesiseditortelecomi = 0; effectevidencesynthesiseditortelecomi<effectevidencesynthesiseditortelecomlist.size();effectevidencesynthesiseditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  effectevidencesynthesiseditortelecom = effectevidencesynthesiseditortelecomlist.get(effectevidencesynthesiseditortelecomi);

		/******************** EfctEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesiseditortelecomi == 0) {e.addEfctEvdnceSynthsEditorTlcmVl("[[");}
		if(effectevidencesynthesiseditortelecom.hasValue()) {

			e.addEfctEvdnceSynthsEditorTlcmVl(String.valueOf(effectevidencesynthesiseditortelecom.getValue()));
		} else {
			e.addEfctEvdnceSynthsEditorTlcmVl("NULL");
		}

		if(effectevidencesynthesiseditortelecomi == effectevidencesynthesiseditortelecomlist.size()-1) {e.addEfctEvdnceSynthsEditorTlcmVl("]]");}


		/******************** effectevidencesynthesiseditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiseditortelecomperiod = effectevidencesynthesiseditortelecom.getPeriod();

		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesiseditortelecomi == 0) {e.addEfctEvdnceSynthsEditorTlcmPrdStrt("[[");}
		if(effectevidencesynthesiseditortelecomperiod.hasStart()) {

			e.addEfctEvdnceSynthsEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiseditortelecomperiod.getStart())+"\"");
		} else {
			e.addEfctEvdnceSynthsEditorTlcmPrdStrt("NULL");
		}

		if(effectevidencesynthesiseditortelecomi == effectevidencesynthesiseditortelecomlist.size()-1) {e.addEfctEvdnceSynthsEditorTlcmPrdStrt("]]");}


		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesiseditortelecomi == 0) {e.addEfctEvdnceSynthsEditorTlcmPrdEnd("[[");}
		if(effectevidencesynthesiseditortelecomperiod.hasEnd()) {

			e.addEfctEvdnceSynthsEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiseditortelecomperiod.getEnd())+"\"");
		} else {
			e.addEfctEvdnceSynthsEditorTlcmPrdEnd("NULL");
		}

		if(effectevidencesynthesiseditortelecomi == effectevidencesynthesiseditortelecomlist.size()-1) {e.addEfctEvdnceSynthsEditorTlcmPrdEnd("]]");}


		/******************** effectevidencesynthesiseditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesiseditortelecomuse = effectevidencesynthesiseditortelecom.getUse();
		if(effectevidencesynthesiseditortelecomuse!=null) {
		if(effectevidencesynthesiseditortelecomi == 0) {

		e.addEfctEvdnceSynthsEditorTlcmUse("[[");		}
			e.addEfctEvdnceSynthsEditorTlcmUse(effectevidencesynthesiseditortelecomuse.toCode());
		if(effectevidencesynthesiseditortelecomi == effectevidencesynthesiseditortelecomlist.size()-1) {

		e.addEfctEvdnceSynthsEditorTlcmUse("]]");		}

		} else {
			e.addEfctEvdnceSynthsEditorTlcmUse("NULL");
		}

		/******************** effectevidencesynthesiseditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesiseditortelecomsystem = effectevidencesynthesiseditortelecom.getSystem();
		if(effectevidencesynthesiseditortelecomsystem!=null) {
		if(effectevidencesynthesiseditortelecomi == 0) {

		e.addEfctEvdnceSynthsEditorTlcmSys("[[");		}
			e.addEfctEvdnceSynthsEditorTlcmSys(effectevidencesynthesiseditortelecomsystem.toCode());
		if(effectevidencesynthesiseditortelecomi == effectevidencesynthesiseditortelecomlist.size()-1) {

		e.addEfctEvdnceSynthsEditorTlcmSys("]]");		}

		} else {
			e.addEfctEvdnceSynthsEditorTlcmSys("NULL");
		}

		/******************** EfctEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesiseditortelecomi == 0) {e.addEfctEvdnceSynthsEditorTlcmRnk("[[");}
		if(effectevidencesynthesiseditortelecom.hasRank()) {

			e.addEfctEvdnceSynthsEditorTlcmRnk(String.valueOf(effectevidencesynthesiseditortelecom.getRank()));
		} else {
			e.addEfctEvdnceSynthsEditorTlcmRnk("NULL");
		}

		if(effectevidencesynthesiseditortelecomi == effectevidencesynthesiseditortelecomlist.size()-1) {e.addEfctEvdnceSynthsEditorTlcmRnk("]]");}


		 };
		 };
		/******************** effectevidencesynthesisreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> effectevidencesynthesisreviewerlist = effectevidencesynthesis.getReviewer();
		for(int effectevidencesynthesisrevieweri = 0; effectevidencesynthesisrevieweri<effectevidencesynthesisreviewerlist.size();effectevidencesynthesisrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  effectevidencesynthesisreviewer = effectevidencesynthesisreviewerlist.get(effectevidencesynthesisrevieweri);

		/******************** EfctEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(effectevidencesynthesisrevieweri == 0) {e.addEfctEvdnceSynthsRviewrNm("[");}
		if(effectevidencesynthesisreviewer.hasName()) {

			e.addEfctEvdnceSynthsRviewrNm(String.valueOf(effectevidencesynthesisreviewer.getName()));
		} else {
			e.addEfctEvdnceSynthsRviewrNm("NULL");
		}

		if(effectevidencesynthesisrevieweri == effectevidencesynthesisreviewerlist.size()-1) {e.addEfctEvdnceSynthsRviewrNm("]");}


		/******************** effectevidencesynthesisreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> effectevidencesynthesisreviewertelecomlist = effectevidencesynthesisreviewer.getTelecom();
		for(int effectevidencesynthesisreviewertelecomi = 0; effectevidencesynthesisreviewertelecomi<effectevidencesynthesisreviewertelecomlist.size();effectevidencesynthesisreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  effectevidencesynthesisreviewertelecom = effectevidencesynthesisreviewertelecomlist.get(effectevidencesynthesisreviewertelecomi);

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesisreviewertelecomi == 0) {e.addEfctEvdnceSynthsRviewrTlcmVl("[[");}
		if(effectevidencesynthesisreviewertelecom.hasValue()) {

			e.addEfctEvdnceSynthsRviewrTlcmVl(String.valueOf(effectevidencesynthesisreviewertelecom.getValue()));
		} else {
			e.addEfctEvdnceSynthsRviewrTlcmVl("NULL");
		}

		if(effectevidencesynthesisreviewertelecomi == effectevidencesynthesisreviewertelecomlist.size()-1) {e.addEfctEvdnceSynthsRviewrTlcmVl("]]");}


		/******************** effectevidencesynthesisreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisreviewertelecomperiod = effectevidencesynthesisreviewertelecom.getPeriod();

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisreviewertelecomi == 0) {e.addEfctEvdnceSynthsRviewrTlcmPrdStrt("[[");}
		if(effectevidencesynthesisreviewertelecomperiod.hasStart()) {

			e.addEfctEvdnceSynthsRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisreviewertelecomperiod.getStart())+"\"");
		} else {
			e.addEfctEvdnceSynthsRviewrTlcmPrdStrt("NULL");
		}

		if(effectevidencesynthesisreviewertelecomi == effectevidencesynthesisreviewertelecomlist.size()-1) {e.addEfctEvdnceSynthsRviewrTlcmPrdStrt("]]");}


		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesisreviewertelecomi == 0) {e.addEfctEvdnceSynthsRviewrTlcmPrdEnd("[[");}
		if(effectevidencesynthesisreviewertelecomperiod.hasEnd()) {

			e.addEfctEvdnceSynthsRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisreviewertelecomperiod.getEnd())+"\"");
		} else {
			e.addEfctEvdnceSynthsRviewrTlcmPrdEnd("NULL");
		}

		if(effectevidencesynthesisreviewertelecomi == effectevidencesynthesisreviewertelecomlist.size()-1) {e.addEfctEvdnceSynthsRviewrTlcmPrdEnd("]]");}


		/******************** effectevidencesynthesisreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesisreviewertelecomuse = effectevidencesynthesisreviewertelecom.getUse();
		if(effectevidencesynthesisreviewertelecomuse!=null) {
		if(effectevidencesynthesisreviewertelecomi == 0) {

		e.addEfctEvdnceSynthsRviewrTlcmUse("[[");		}
			e.addEfctEvdnceSynthsRviewrTlcmUse(effectevidencesynthesisreviewertelecomuse.toCode());
		if(effectevidencesynthesisreviewertelecomi == effectevidencesynthesisreviewertelecomlist.size()-1) {

		e.addEfctEvdnceSynthsRviewrTlcmUse("]]");		}

		} else {
			e.addEfctEvdnceSynthsRviewrTlcmUse("NULL");
		}

		/******************** effectevidencesynthesisreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesisreviewertelecomsystem = effectevidencesynthesisreviewertelecom.getSystem();
		if(effectevidencesynthesisreviewertelecomsystem!=null) {
		if(effectevidencesynthesisreviewertelecomi == 0) {

		e.addEfctEvdnceSynthsRviewrTlcmSys("[[");		}
			e.addEfctEvdnceSynthsRviewrTlcmSys(effectevidencesynthesisreviewertelecomsystem.toCode());
		if(effectevidencesynthesisreviewertelecomi == effectevidencesynthesisreviewertelecomlist.size()-1) {

		e.addEfctEvdnceSynthsRviewrTlcmSys("]]");		}

		} else {
			e.addEfctEvdnceSynthsRviewrTlcmSys("NULL");
		}

		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesisreviewertelecomi == 0) {e.addEfctEvdnceSynthsRviewrTlcmRnk("[[");}
		if(effectevidencesynthesisreviewertelecom.hasRank()) {

			e.addEfctEvdnceSynthsRviewrTlcmRnk(String.valueOf(effectevidencesynthesisreviewertelecom.getRank()));
		} else {
			e.addEfctEvdnceSynthsRviewrTlcmRnk("NULL");
		}

		if(effectevidencesynthesisreviewertelecomi == effectevidencesynthesisreviewertelecomlist.size()-1) {e.addEfctEvdnceSynthsRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** effectevidencesynthesissynthesistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesissynthesistype = effectevidencesynthesis.getSynthesisType();

		/******************** EfctEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(effectevidencesynthesissynthesistype.hasText()) {

			e.addEfctEvdnceSynthsSynthsTypTxt(String.valueOf(effectevidencesynthesissynthesistype.getText()));
		} else {
			e.addEfctEvdnceSynthsSynthsTypTxt("NULL");
		}


		/******************** effectevidencesynthesissynthesistypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesissynthesistypecodinglist = effectevidencesynthesissynthesistype.getCoding();
		for(int effectevidencesynthesissynthesistypecodingi = 0; effectevidencesynthesissynthesistypecodingi<effectevidencesynthesissynthesistypecodinglist.size();effectevidencesynthesissynthesistypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesissynthesistypecoding = effectevidencesynthesissynthesistypecodinglist.get(effectevidencesynthesissynthesistypecodingi);

		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesissynthesistypecodingi == 0) {e.addEfctEvdnceSynthsSynthsTypCdgDsply("[");}
		if(effectevidencesynthesissynthesistypecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsSynthsTypCdgDsply(String.valueOf(effectevidencesynthesissynthesistypecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsSynthsTypCdgDsply("NULL");
		}

		if(effectevidencesynthesissynthesistypecodingi == effectevidencesynthesissynthesistypecodinglist.size()-1) {e.addEfctEvdnceSynthsSynthsTypCdgDsply("]");}


		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesissynthesistypecodingi == 0) {e.addEfctEvdnceSynthsSynthsTypCdgVrsn("[");}
		if(effectevidencesynthesissynthesistypecoding.hasVersion()) {

			e.addEfctEvdnceSynthsSynthsTypCdgVrsn(String.valueOf(effectevidencesynthesissynthesistypecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsSynthsTypCdgVrsn("NULL");
		}

		if(effectevidencesynthesissynthesistypecodingi == effectevidencesynthesissynthesistypecodinglist.size()-1) {e.addEfctEvdnceSynthsSynthsTypCdgVrsn("]");}


		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesissynthesistypecodingi == 0) {e.addEfctEvdnceSynthsSynthsTypCdgCd("[");}
		if(effectevidencesynthesissynthesistypecoding.hasCode()) {

			e.addEfctEvdnceSynthsSynthsTypCdgCd(String.valueOf(effectevidencesynthesissynthesistypecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsSynthsTypCdgCd("NULL");
		}

		if(effectevidencesynthesissynthesistypecodingi == effectevidencesynthesissynthesistypecodinglist.size()-1) {e.addEfctEvdnceSynthsSynthsTypCdgCd("]");}


		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesissynthesistypecodingi == 0) {e.addEfctEvdnceSynthsSynthsTypCdgUsrSltd("[");}
		if(effectevidencesynthesissynthesistypecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsSynthsTypCdgUsrSltd(String.valueOf(effectevidencesynthesissynthesistypecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsSynthsTypCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesissynthesistypecodingi == effectevidencesynthesissynthesistypecodinglist.size()-1) {e.addEfctEvdnceSynthsSynthsTypCdgUsrSltd("]");}


		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesissynthesistypecodingi == 0) {e.addEfctEvdnceSynthsSynthsTypCdgSys("[");}
		if(effectevidencesynthesissynthesistypecoding.hasSystem()) {

			e.addEfctEvdnceSynthsSynthsTypCdgSys(String.valueOf(effectevidencesynthesissynthesistypecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsSynthsTypCdgSys("NULL");
		}

		if(effectevidencesynthesissynthesistypecodingi == effectevidencesynthesissynthesistypecodinglist.size()-1) {e.addEfctEvdnceSynthsSynthsTypCdgSys("]");}


		 };
		/******************** effectevidencesynthesissamplesize ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisSampleSizeComponent effectevidencesynthesissamplesize = effectevidencesynthesis.getSampleSize();

		/******************** EfctEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(effectevidencesynthesissamplesize.hasDescription()) {

			e.addEfctEvdnceSynthsSampleSzDscrptn(String.valueOf(effectevidencesynthesissamplesize.getDescription()));
		} else {
			e.addEfctEvdnceSynthsSampleSzDscrptn("NULL");
		}


		/******************** EfctEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(effectevidencesynthesissamplesize.hasNumberOfStudies()) {

			e.addEfctEvdnceSynthsSampleSzNmbrOfStudies(String.valueOf(effectevidencesynthesissamplesize.getNumberOfStudies()));
		} else {
			e.addEfctEvdnceSynthsSampleSzNmbrOfStudies("NULL");
		}


		/******************** EfctEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(effectevidencesynthesissamplesize.hasNumberOfParticipants()) {

			e.addEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts(String.valueOf(effectevidencesynthesissamplesize.getNumberOfParticipants()));
		} else {
			e.addEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts("NULL");
		}


		/******************** EfctEvdnceSynths_Exposure ********************************************************************************/
		if(effectevidencesynthesis.hasExposure()) {

			if(effectevidencesynthesis.getExposure().getReference() != null) {
			e.addEfctEvdnceSynthsExposure(effectevidencesynthesis.getExposure().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsExposure("NULL");
		}


		/******************** effectevidencesynthesisstudytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisstudytype = effectevidencesynthesis.getStudyType();

		/******************** EfctEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(effectevidencesynthesisstudytype.hasText()) {

			e.addEfctEvdnceSynthsStdyTypTxt(String.valueOf(effectevidencesynthesisstudytype.getText()));
		} else {
			e.addEfctEvdnceSynthsStdyTypTxt("NULL");
		}


		/******************** effectevidencesynthesisstudytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesisstudytypecodinglist = effectevidencesynthesisstudytype.getCoding();
		for(int effectevidencesynthesisstudytypecodingi = 0; effectevidencesynthesisstudytypecodingi<effectevidencesynthesisstudytypecodinglist.size();effectevidencesynthesisstudytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesisstudytypecoding = effectevidencesynthesisstudytypecodinglist.get(effectevidencesynthesisstudytypecodingi);

		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisstudytypecodingi == 0) {e.addEfctEvdnceSynthsStdyTypCdgDsply("[");}
		if(effectevidencesynthesisstudytypecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsStdyTypCdgDsply(String.valueOf(effectevidencesynthesisstudytypecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsStdyTypCdgDsply("NULL");
		}

		if(effectevidencesynthesisstudytypecodingi == effectevidencesynthesisstudytypecodinglist.size()-1) {e.addEfctEvdnceSynthsStdyTypCdgDsply("]");}


		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisstudytypecodingi == 0) {e.addEfctEvdnceSynthsStdyTypCdgVrsn("[");}
		if(effectevidencesynthesisstudytypecoding.hasVersion()) {

			e.addEfctEvdnceSynthsStdyTypCdgVrsn(String.valueOf(effectevidencesynthesisstudytypecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsStdyTypCdgVrsn("NULL");
		}

		if(effectevidencesynthesisstudytypecodingi == effectevidencesynthesisstudytypecodinglist.size()-1) {e.addEfctEvdnceSynthsStdyTypCdgVrsn("]");}


		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisstudytypecodingi == 0) {e.addEfctEvdnceSynthsStdyTypCdgCd("[");}
		if(effectevidencesynthesisstudytypecoding.hasCode()) {

			e.addEfctEvdnceSynthsStdyTypCdgCd(String.valueOf(effectevidencesynthesisstudytypecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsStdyTypCdgCd("NULL");
		}

		if(effectevidencesynthesisstudytypecodingi == effectevidencesynthesisstudytypecodinglist.size()-1) {e.addEfctEvdnceSynthsStdyTypCdgCd("]");}


		/******************** EfctEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisstudytypecodingi == 0) {e.addEfctEvdnceSynthsStdyTypCdgUsrSltd("[");}
		if(effectevidencesynthesisstudytypecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsStdyTypCdgUsrSltd(String.valueOf(effectevidencesynthesisstudytypecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsStdyTypCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesisstudytypecodingi == effectevidencesynthesisstudytypecodinglist.size()-1) {e.addEfctEvdnceSynthsStdyTypCdgUsrSltd("]");}


		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisstudytypecodingi == 0) {e.addEfctEvdnceSynthsStdyTypCdgSys("[");}
		if(effectevidencesynthesisstudytypecoding.hasSystem()) {

			e.addEfctEvdnceSynthsStdyTypCdgSys(String.valueOf(effectevidencesynthesisstudytypecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsStdyTypCdgSys("NULL");
		}

		if(effectevidencesynthesisstudytypecodingi == effectevidencesynthesisstudytypecodinglist.size()-1) {e.addEfctEvdnceSynthsStdyTypCdgSys("]");}


		 };
		/******************** effectevidencesynthesiscertainty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyComponent> effectevidencesynthesiscertaintylist = effectevidencesynthesis.getCertainty();
		for(int effectevidencesynthesiscertaintyi = 0; effectevidencesynthesiscertaintyi<effectevidencesynthesiscertaintylist.size();effectevidencesynthesiscertaintyi++ ) {
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyComponent  effectevidencesynthesiscertainty = effectevidencesynthesiscertaintylist.get(effectevidencesynthesiscertaintyi);

		/******************** effectevidencesynthesiscertaintynote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> effectevidencesynthesiscertaintynotelist = effectevidencesynthesiscertainty.getNote();
		for(int effectevidencesynthesiscertaintynotei = 0; effectevidencesynthesiscertaintynotei<effectevidencesynthesiscertaintynotelist.size();effectevidencesynthesiscertaintynotei++ ) {
		org.hl7.fhir.r4.model.Annotation  effectevidencesynthesiscertaintynote = effectevidencesynthesiscertaintynotelist.get(effectevidencesynthesiscertaintynotei);

		/******************** EfctEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(effectevidencesynthesiscertaintynotei == 0) {e.addEfctEvdnceSynthsCrtntyNtTime("[[");}
		if(effectevidencesynthesiscertaintynote.hasTime()) {

			e.addEfctEvdnceSynthsCrtntyNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiscertaintynote.getTime())+"\"");
		} else {
			e.addEfctEvdnceSynthsCrtntyNtTime("NULL");
		}

		if(effectevidencesynthesiscertaintynotei == effectevidencesynthesiscertaintynotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyNtTime("]]");}


		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(effectevidencesynthesiscertaintynotei == 0) {e.addEfctEvdnceSynthsCrtntyNtAthrRfrnc("[[");}
		if(effectevidencesynthesiscertaintynote.hasAuthorReference()) {

			if(effectevidencesynthesiscertaintynote.getAuthorReference().getReference() != null) {
			e.addEfctEvdnceSynthsCrtntyNtAthrRfrnc(effectevidencesynthesiscertaintynote.getAuthorReference().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsCrtntyNtAthrRfrnc("NULL");
		}

		if(effectevidencesynthesiscertaintynotei == effectevidencesynthesiscertaintynotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyNtAthrRfrnc("]]");}


		/******************** EfctEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintynotei == 0) {e.addEfctEvdnceSynthsCrtntyNtTxt("[[");}
		if(effectevidencesynthesiscertaintynote.hasText()) {

			e.addEfctEvdnceSynthsCrtntyNtTxt(String.valueOf(effectevidencesynthesiscertaintynote.getText()));
		} else {
			e.addEfctEvdnceSynthsCrtntyNtTxt("NULL");
		}

		if(effectevidencesynthesiscertaintynotei == effectevidencesynthesiscertaintynotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyNtTxt("]]");}


		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(effectevidencesynthesiscertaintynotei == 0) {e.addEfctEvdnceSynthsCrtntyNtAthrStrgTyp("[[");}
		if(effectevidencesynthesiscertaintynote.hasAuthorStringType()) {

			e.addEfctEvdnceSynthsCrtntyNtAthrStrgTyp("\""+effectevidencesynthesiscertaintynote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			e.addEfctEvdnceSynthsCrtntyNtAthrStrgTyp("NULL");
		}

		if(effectevidencesynthesiscertaintynotei == effectevidencesynthesiscertaintynotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyNtAthrStrgTyp("]]");}


		 };
		/******************** effectevidencesynthesiscertaintyrating ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> effectevidencesynthesiscertaintyratinglist = effectevidencesynthesiscertainty.getRating();
		for(int effectevidencesynthesiscertaintyratingi = 0; effectevidencesynthesiscertaintyratingi<effectevidencesynthesiscertaintyratinglist.size();effectevidencesynthesiscertaintyratingi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  effectevidencesynthesiscertaintyrating = effectevidencesynthesiscertaintyratinglist.get(effectevidencesynthesiscertaintyratingi);

		/******************** EfctEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingi == 0) {e.addEfctEvdnceSynthsCrtntyRatingTxt("[[");}
		if(effectevidencesynthesiscertaintyrating.hasText()) {

			e.addEfctEvdnceSynthsCrtntyRatingTxt(String.valueOf(effectevidencesynthesiscertaintyrating.getText()));
		} else {
			e.addEfctEvdnceSynthsCrtntyRatingTxt("NULL");
		}

		if(effectevidencesynthesiscertaintyratingi == effectevidencesynthesiscertaintyratinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyRatingTxt("]]");}


		/******************** effectevidencesynthesiscertaintyratingcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesiscertaintyratingcodinglist = effectevidencesynthesiscertaintyrating.getCoding();
		for(int effectevidencesynthesiscertaintyratingcodingi = 0; effectevidencesynthesiscertaintyratingcodingi<effectevidencesynthesiscertaintyratingcodinglist.size();effectevidencesynthesiscertaintyratingcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesiscertaintyratingcoding = effectevidencesynthesiscertaintyratingcodinglist.get(effectevidencesynthesiscertaintyratingcodingi);

		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyRatingCdgDsply("[[[");}
		if(effectevidencesynthesiscertaintyratingcoding.hasDisplay()) {

			e.addEfctEvdnceSynthsCrtntyRatingCdgDsply(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsCrtntyRatingCdgDsply("NULL");
		}

		if(effectevidencesynthesiscertaintyratingcodingi == effectevidencesynthesiscertaintyratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyRatingCdgDsply("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyRatingCdgVrsn("[[[");}
		if(effectevidencesynthesiscertaintyratingcoding.hasVersion()) {

			e.addEfctEvdnceSynthsCrtntyRatingCdgVrsn(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsCrtntyRatingCdgVrsn("NULL");
		}

		if(effectevidencesynthesiscertaintyratingcodingi == effectevidencesynthesiscertaintyratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyRatingCdgVrsn("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyRatingCdgCd("[[[");}
		if(effectevidencesynthesiscertaintyratingcoding.hasCode()) {

			e.addEfctEvdnceSynthsCrtntyRatingCdgCd(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsCrtntyRatingCdgCd("NULL");
		}

		if(effectevidencesynthesiscertaintyratingcodingi == effectevidencesynthesiscertaintyratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyRatingCdgCd("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyRatingCdgUsrSltd("[[[");}
		if(effectevidencesynthesiscertaintyratingcoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsCrtntyRatingCdgUsrSltd(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsCrtntyRatingCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesiscertaintyratingcodingi == effectevidencesynthesiscertaintyratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyRatingCdgUsrSltd("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiscertaintyratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyRatingCdgSys("[[[");}
		if(effectevidencesynthesiscertaintyratingcoding.hasSystem()) {

			e.addEfctEvdnceSynthsCrtntyRatingCdgSys(String.valueOf(effectevidencesynthesiscertaintyratingcoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsCrtntyRatingCdgSys("NULL");
		}

		if(effectevidencesynthesiscertaintyratingcodingi == effectevidencesynthesiscertaintyratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyRatingCdgSys("]]]");}


		 };
		 };
		/******************** effectevidencesynthesiscertaintycertaintysubcomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent> effectevidencesynthesiscertaintycertaintysubcomponentlist = effectevidencesynthesiscertainty.getCertaintySubcomponent();
		for(int effectevidencesynthesiscertaintycertaintysubcomponenti = 0; effectevidencesynthesiscertaintycertaintysubcomponenti<effectevidencesynthesiscertaintycertaintysubcomponentlist.size();effectevidencesynthesiscertaintycertaintysubcomponenti++ ) {
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent  effectevidencesynthesiscertaintycertaintysubcomponent = effectevidencesynthesiscertaintycertaintysubcomponentlist.get(effectevidencesynthesiscertaintycertaintysubcomponenti);

		/******************** effectevidencesynthesiscertaintycertaintysubcomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesiscertaintycertaintysubcomponenttype = effectevidencesynthesiscertaintycertaintysubcomponent.getType();

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenti == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt("[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponenttype.hasText()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttype.getText()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponenti == effectevidencesynthesiscertaintycertaintysubcomponentlist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt("]]");}


		/******************** effectevidencesynthesiscertaintycertaintysubcomponenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist = effectevidencesynthesiscertaintycertaintysubcomponenttype.getCoding();
		for(int effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi = 0; effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi<effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size();effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesiscertaintycertaintysubcomponenttypecoding = effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.get(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi);

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasVersion()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasCode()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.hasSystem()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponenttypecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponenttypecodingi == effectevidencesynthesiscertaintycertaintysubcomponenttypecodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys("]]]");}


		 };
		/******************** effectevidencesynthesiscertaintycertaintysubcomponentnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> effectevidencesynthesiscertaintycertaintysubcomponentnotelist = effectevidencesynthesiscertaintycertaintysubcomponent.getNote();
		for(int effectevidencesynthesiscertaintycertaintysubcomponentnotei = 0; effectevidencesynthesiscertaintycertaintysubcomponentnotei<effectevidencesynthesiscertaintycertaintysubcomponentnotelist.size();effectevidencesynthesiscertaintycertaintysubcomponentnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  effectevidencesynthesiscertaintycertaintysubcomponentnote = effectevidencesynthesiscertaintycertaintysubcomponentnotelist.get(effectevidencesynthesiscertaintycertaintysubcomponentnotei);

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasTime()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiscertaintycertaintysubcomponentnote.getTime())+"\"");
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == effectevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorReference()) {

			if(effectevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorReference().getReference() != null) {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc(effectevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorReference().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == effectevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasText()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentnote.getText()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == effectevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt("]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentnote.hasAuthorStringType()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("\""+effectevidencesynthesiscertaintycertaintysubcomponentnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentnotei == effectevidencesynthesiscertaintycertaintysubcomponentnotelist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp("]]]");}


		 };
		/******************** effectevidencesynthesiscertaintycertaintysubcomponentrating ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> effectevidencesynthesiscertaintycertaintysubcomponentratinglist = effectevidencesynthesiscertaintycertaintysubcomponent.getRating();
		for(int effectevidencesynthesiscertaintycertaintysubcomponentratingi = 0; effectevidencesynthesiscertaintycertaintysubcomponentratingi<effectevidencesynthesiscertaintycertaintysubcomponentratinglist.size();effectevidencesynthesiscertaintycertaintysubcomponentratingi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  effectevidencesynthesiscertaintycertaintysubcomponentrating = effectevidencesynthesiscertaintycertaintysubcomponentratinglist.get(effectevidencesynthesiscertaintycertaintysubcomponentratingi);

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt("[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentrating.hasText()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentrating.getText()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentratingi == effectevidencesynthesiscertaintycertaintysubcomponentratinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt("]]]");}


		/******************** effectevidencesynthesiscertaintycertaintysubcomponentratingcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist = effectevidencesynthesiscertaintycertaintysubcomponentrating.getCoding();
		for(int effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi = 0; effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi<effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size();effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesiscertaintycertaintysubcomponentratingcoding = effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.get(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi);

		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply("[[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasDisplay()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply("]]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn("[[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasVersion()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn("]]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd("[[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasCode()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd("]]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd("[[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd("]]]]");}


		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == 0) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys("[[[[");}
		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.hasSystem()) {

			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys(String.valueOf(effectevidencesynthesiscertaintycertaintysubcomponentratingcoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys("NULL");
		}

		if(effectevidencesynthesiscertaintycertaintysubcomponentratingcodingi == effectevidencesynthesiscertaintycertaintysubcomponentratingcodinglist.size()-1) {e.addEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys("]]]]");}


		 };
		 };
		 };
		 };
		/******************** EfctEvdnceSynths_Ttl ********************************************************************************/
		if(effectevidencesynthesis.hasTitle()) {

			e.addEfctEvdnceSynthsTtl(String.valueOf(effectevidencesynthesis.getTitle()));
		} else {
			e.addEfctEvdnceSynthsTtl("NULL");
		}


		/******************** effectevidencesynthesisrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> effectevidencesynthesisrelatedartifactlist = effectevidencesynthesis.getRelatedArtifact();
		for(int effectevidencesynthesisrelatedartifacti = 0; effectevidencesynthesisrelatedartifacti<effectevidencesynthesisrelatedartifactlist.size();effectevidencesynthesisrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  effectevidencesynthesisrelatedartifact = effectevidencesynthesisrelatedartifactlist.get(effectevidencesynthesisrelatedartifacti);

		/******************** EfctEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctRsrc("[");}
		if(effectevidencesynthesisrelatedartifact.hasResource()) {

			e.addEfctEvdnceSynthsRltedArtfctRsrc(String.valueOf(effectevidencesynthesisrelatedartifact.getResource()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctRsrc("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctRsrc("]");}


		/******************** effectevidencesynthesisrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType effectevidencesynthesisrelatedartifacttype = effectevidencesynthesisrelatedartifact.getType();
		if(effectevidencesynthesisrelatedartifacttype!=null) {
		if(effectevidencesynthesisrelatedartifacti == 0) {

		e.addEfctEvdnceSynthsRltedArtfctTyp("[");		}
			e.addEfctEvdnceSynthsRltedArtfctTyp(effectevidencesynthesisrelatedartifacttype.toCode());
		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {

		e.addEfctEvdnceSynthsRltedArtfctTyp("]");		}

		} else {
			e.addEfctEvdnceSynthsRltedArtfctTyp("NULL");
		}

		/******************** EfctEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctUrl("[");}
		if(effectevidencesynthesisrelatedartifact.hasUrl()) {

			e.addEfctEvdnceSynthsRltedArtfctUrl(String.valueOf(effectevidencesynthesisrelatedartifact.getUrl()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctUrl("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctUrl("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctCitation("[");}
		if(effectevidencesynthesisrelatedartifact.hasCitation()) {

			e.addEfctEvdnceSynthsRltedArtfctCitation(String.valueOf(effectevidencesynthesisrelatedartifact.getCitation()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctCitation("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctCitation("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctLbl("[");}
		if(effectevidencesynthesisrelatedartifact.hasLabel()) {

			e.addEfctEvdnceSynthsRltedArtfctLbl(String.valueOf(effectevidencesynthesisrelatedartifact.getLabel()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctLbl("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctLbl("]");}


		/******************** effectevidencesynthesisrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment effectevidencesynthesisrelatedartifactdocument = effectevidencesynthesisrelatedartifact.getDocument();

		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocSz("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasSize()) {

			e.addEfctEvdnceSynthsRltedArtfctDocSz(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getSize()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocSz("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocSz("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocLnguage("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasLanguage()) {

			e.addEfctEvdnceSynthsRltedArtfctDocLnguage(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getLanguage()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocLnguage("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocLnguage("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocCntntTyp("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasContentType()) {

			e.addEfctEvdnceSynthsRltedArtfctDocCntntTyp(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getContentType()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocCntntTyp("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocCntntTyp("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocHash("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasHash()) {

			e.addEfctEvdnceSynthsRltedArtfctDocHash(new String(effectevidencesynthesisrelatedartifactdocument.getHash()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocHash("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocHash("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocData("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasData()) {

			e.addEfctEvdnceSynthsRltedArtfctDocData(new String(effectevidencesynthesisrelatedartifactdocument.getData()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocData("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocData("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocCreation("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasCreation()) {

			e.addEfctEvdnceSynthsRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisrelatedartifactdocument.getCreation())+"\"");
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocCreation("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocCreation("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocTtl("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasTitle()) {

			e.addEfctEvdnceSynthsRltedArtfctDocTtl(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getTitle()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocTtl("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocTtl("]");}


		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(effectevidencesynthesisrelatedartifacti == 0) {e.addEfctEvdnceSynthsRltedArtfctDocUrl("[");}
		if(effectevidencesynthesisrelatedartifactdocument.hasUrl()) {

			e.addEfctEvdnceSynthsRltedArtfctDocUrl(String.valueOf(effectevidencesynthesisrelatedartifactdocument.getUrl()));
		} else {
			e.addEfctEvdnceSynthsRltedArtfctDocUrl("NULL");
		}

		if(effectevidencesynthesisrelatedartifacti == effectevidencesynthesisrelatedartifactlist.size()-1) {e.addEfctEvdnceSynthsRltedArtfctDocUrl("]");}


		 };
		/******************** EfctEvdnceSynths_Url ********************************************************************************/
		if(effectevidencesynthesis.hasUrl()) {

			e.addEfctEvdnceSynthsUrl(String.valueOf(effectevidencesynthesis.getUrl()));
		} else {
			e.addEfctEvdnceSynthsUrl("NULL");
		}


		/******************** effectevidencesynthesistopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> effectevidencesynthesistopiclist = effectevidencesynthesis.getTopic();
		for(int effectevidencesynthesistopici = 0; effectevidencesynthesistopici<effectevidencesynthesistopiclist.size();effectevidencesynthesistopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  effectevidencesynthesistopic = effectevidencesynthesistopiclist.get(effectevidencesynthesistopici);

		/******************** EfctEvdnceSynths_Topic_Txt ********************************************************************************/
		if(effectevidencesynthesistopici == 0) {e.addEfctEvdnceSynthsTopicTxt("[");}
		if(effectevidencesynthesistopic.hasText()) {

			e.addEfctEvdnceSynthsTopicTxt(String.valueOf(effectevidencesynthesistopic.getText()));
		} else {
			e.addEfctEvdnceSynthsTopicTxt("NULL");
		}

		if(effectevidencesynthesistopici == effectevidencesynthesistopiclist.size()-1) {e.addEfctEvdnceSynthsTopicTxt("]");}


		/******************** effectevidencesynthesistopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesistopiccodinglist = effectevidencesynthesistopic.getCoding();
		for(int effectevidencesynthesistopiccodingi = 0; effectevidencesynthesistopiccodingi<effectevidencesynthesistopiccodinglist.size();effectevidencesynthesistopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesistopiccoding = effectevidencesynthesistopiccodinglist.get(effectevidencesynthesistopiccodingi);

		/******************** EfctEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesistopiccodingi == 0) {e.addEfctEvdnceSynthsTopicCdgDsply("[[");}
		if(effectevidencesynthesistopiccoding.hasDisplay()) {

			e.addEfctEvdnceSynthsTopicCdgDsply(String.valueOf(effectevidencesynthesistopiccoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsTopicCdgDsply("NULL");
		}

		if(effectevidencesynthesistopiccodingi == effectevidencesynthesistopiccodinglist.size()-1) {e.addEfctEvdnceSynthsTopicCdgDsply("]]");}


		/******************** EfctEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesistopiccodingi == 0) {e.addEfctEvdnceSynthsTopicCdgVrsn("[[");}
		if(effectevidencesynthesistopiccoding.hasVersion()) {

			e.addEfctEvdnceSynthsTopicCdgVrsn(String.valueOf(effectevidencesynthesistopiccoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsTopicCdgVrsn("NULL");
		}

		if(effectevidencesynthesistopiccodingi == effectevidencesynthesistopiccodinglist.size()-1) {e.addEfctEvdnceSynthsTopicCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesistopiccodingi == 0) {e.addEfctEvdnceSynthsTopicCdgCd("[[");}
		if(effectevidencesynthesistopiccoding.hasCode()) {

			e.addEfctEvdnceSynthsTopicCdgCd(String.valueOf(effectevidencesynthesistopiccoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsTopicCdgCd("NULL");
		}

		if(effectevidencesynthesistopiccodingi == effectevidencesynthesistopiccodinglist.size()-1) {e.addEfctEvdnceSynthsTopicCdgCd("]]");}


		/******************** EfctEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesistopiccodingi == 0) {e.addEfctEvdnceSynthsTopicCdgUsrSltd("[[");}
		if(effectevidencesynthesistopiccoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsTopicCdgUsrSltd(String.valueOf(effectevidencesynthesistopiccoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsTopicCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesistopiccodingi == effectevidencesynthesistopiccodinglist.size()-1) {e.addEfctEvdnceSynthsTopicCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesistopiccodingi == 0) {e.addEfctEvdnceSynthsTopicCdgSys("[[");}
		if(effectevidencesynthesistopiccoding.hasSystem()) {

			e.addEfctEvdnceSynthsTopicCdgSys(String.valueOf(effectevidencesynthesistopiccoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsTopicCdgSys("NULL");
		}

		if(effectevidencesynthesistopiccodingi == effectevidencesynthesistopiccodinglist.size()-1) {e.addEfctEvdnceSynthsTopicCdgSys("]]");}


		 };
		 };
		/******************** EfctEvdnceSynths_Popln ********************************************************************************/
		if(effectevidencesynthesis.hasPopulation()) {

			if(effectevidencesynthesis.getPopulation().getReference() != null) {
			e.addEfctEvdnceSynthsPopln(effectevidencesynthesis.getPopulation().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsPopln("NULL");
		}


		/******************** effectevidencesynthesisjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> effectevidencesynthesisjurisdictionlist = effectevidencesynthesis.getJurisdiction();
		for(int effectevidencesynthesisjurisdictioni = 0; effectevidencesynthesisjurisdictioni<effectevidencesynthesisjurisdictionlist.size();effectevidencesynthesisjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  effectevidencesynthesisjurisdiction = effectevidencesynthesisjurisdictionlist.get(effectevidencesynthesisjurisdictioni);

		/******************** EfctEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(effectevidencesynthesisjurisdictioni == 0) {e.addEfctEvdnceSynthsJrsdctnTxt("[");}
		if(effectevidencesynthesisjurisdiction.hasText()) {

			e.addEfctEvdnceSynthsJrsdctnTxt(String.valueOf(effectevidencesynthesisjurisdiction.getText()));
		} else {
			e.addEfctEvdnceSynthsJrsdctnTxt("NULL");
		}

		if(effectevidencesynthesisjurisdictioni == effectevidencesynthesisjurisdictionlist.size()-1) {e.addEfctEvdnceSynthsJrsdctnTxt("]");}


		/******************** effectevidencesynthesisjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesisjurisdictioncodinglist = effectevidencesynthesisjurisdiction.getCoding();
		for(int effectevidencesynthesisjurisdictioncodingi = 0; effectevidencesynthesisjurisdictioncodingi<effectevidencesynthesisjurisdictioncodinglist.size();effectevidencesynthesisjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesisjurisdictioncoding = effectevidencesynthesisjurisdictioncodinglist.get(effectevidencesynthesisjurisdictioncodingi);

		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncodingi == 0) {e.addEfctEvdnceSynthsJrsdctnCdgDsply("[[");}
		if(effectevidencesynthesisjurisdictioncoding.hasDisplay()) {

			e.addEfctEvdnceSynthsJrsdctnCdgDsply(String.valueOf(effectevidencesynthesisjurisdictioncoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsJrsdctnCdgDsply("NULL");
		}

		if(effectevidencesynthesisjurisdictioncodingi == effectevidencesynthesisjurisdictioncodinglist.size()-1) {e.addEfctEvdnceSynthsJrsdctnCdgDsply("]]");}


		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncodingi == 0) {e.addEfctEvdnceSynthsJrsdctnCdgVrsn("[[");}
		if(effectevidencesynthesisjurisdictioncoding.hasVersion()) {

			e.addEfctEvdnceSynthsJrsdctnCdgVrsn(String.valueOf(effectevidencesynthesisjurisdictioncoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsJrsdctnCdgVrsn("NULL");
		}

		if(effectevidencesynthesisjurisdictioncodingi == effectevidencesynthesisjurisdictioncodinglist.size()-1) {e.addEfctEvdnceSynthsJrsdctnCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncodingi == 0) {e.addEfctEvdnceSynthsJrsdctnCdgCd("[[");}
		if(effectevidencesynthesisjurisdictioncoding.hasCode()) {

			e.addEfctEvdnceSynthsJrsdctnCdgCd(String.valueOf(effectevidencesynthesisjurisdictioncoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsJrsdctnCdgCd("NULL");
		}

		if(effectevidencesynthesisjurisdictioncodingi == effectevidencesynthesisjurisdictioncodinglist.size()-1) {e.addEfctEvdnceSynthsJrsdctnCdgCd("]]");}


		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncodingi == 0) {e.addEfctEvdnceSynthsJrsdctnCdgUsrSltd("[[");}
		if(effectevidencesynthesisjurisdictioncoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsJrsdctnCdgUsrSltd(String.valueOf(effectevidencesynthesisjurisdictioncoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsJrsdctnCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesisjurisdictioncodingi == effectevidencesynthesisjurisdictioncodinglist.size()-1) {e.addEfctEvdnceSynthsJrsdctnCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisjurisdictioncodingi == 0) {e.addEfctEvdnceSynthsJrsdctnCdgSys("[[");}
		if(effectevidencesynthesisjurisdictioncoding.hasSystem()) {

			e.addEfctEvdnceSynthsJrsdctnCdgSys(String.valueOf(effectevidencesynthesisjurisdictioncoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsJrsdctnCdgSys("NULL");
		}

		if(effectevidencesynthesisjurisdictioncodingi == effectevidencesynthesisjurisdictioncodinglist.size()-1) {e.addEfctEvdnceSynthsJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** effectevidencesynthesisusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> effectevidencesynthesisusecontextlist = effectevidencesynthesis.getUseContext();
		for(int effectevidencesynthesisusecontexti = 0; effectevidencesynthesisusecontexti<effectevidencesynthesisusecontextlist.size();effectevidencesynthesisusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  effectevidencesynthesisusecontext = effectevidencesynthesisusecontextlist.get(effectevidencesynthesisusecontexti);

		/******************** effectevidencesynthesisusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding effectevidencesynthesisusecontextcode = effectevidencesynthesisusecontext.getCode();

		/******************** EfctEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtCdDsply("[");}
		if(effectevidencesynthesisusecontextcode.hasDisplay()) {

			e.addEfctEvdnceSynthsUseCntxtCdDsply(String.valueOf(effectevidencesynthesisusecontextcode.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtCdDsply("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtCdDsply("]");}


		/******************** EfctEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtCdVrsn("[");}
		if(effectevidencesynthesisusecontextcode.hasVersion()) {

			e.addEfctEvdnceSynthsUseCntxtCdVrsn(String.valueOf(effectevidencesynthesisusecontextcode.getVersion()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtCdVrsn("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtCdVrsn("]");}


		/******************** EfctEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtCdUsrSltd("[");}
		if(effectevidencesynthesisusecontextcode.hasUserSelected()) {

			e.addEfctEvdnceSynthsUseCntxtCdUsrSltd(String.valueOf(effectevidencesynthesisusecontextcode.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtCdUsrSltd("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtCdUsrSltd("]");}


		/******************** EfctEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtCdSys("[");}
		if(effectevidencesynthesisusecontextcode.hasSystem()) {

			e.addEfctEvdnceSynthsUseCntxtCdSys(String.valueOf(effectevidencesynthesisusecontextcode.getSystem()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtCdSys("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtCdSys("]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRfrnc("[");}
		if(effectevidencesynthesisusecontext.hasValueReference()) {

			if(effectevidencesynthesisusecontext.getValueReference().getReference() != null) {
			e.addEfctEvdnceSynthsUseCntxtVlRfrnc(effectevidencesynthesisusecontext.getValueReference().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRfrnc("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRfrnc("]");}


		/******************** effectevidencesynthesisusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisusecontextvaluecodeableconcept = effectevidencesynthesisusecontext.getValueCodeableConcept();

		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt("[");}
		if(effectevidencesynthesisusecontextvaluecodeableconcept.hasText()) {

			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconcept.getText()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt("]");}


		/******************** effectevidencesynthesisusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesisusecontextvaluecodeableconceptcodinglist = effectevidencesynthesisusecontextvaluecodeableconcept.getCoding();
		for(int effectevidencesynthesisusecontextvaluecodeableconceptcodingi = 0; effectevidencesynthesisusecontextvaluecodeableconceptcodingi<effectevidencesynthesisusecontextvaluecodeableconceptcodinglist.size();effectevidencesynthesisusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesisusecontextvaluecodeableconceptcoding = effectevidencesynthesisusecontextvaluecodeableconceptcodinglist.get(effectevidencesynthesisusecontextvaluecodeableconceptcodingi);

		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasDisplay()) {

			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == effectevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasVersion()) {

			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == effectevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd("[[");}
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasCode()) {

			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == effectevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == effectevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == 0) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys("[[");}
		if(effectevidencesynthesisusecontextvaluecodeableconceptcoding.hasSystem()) {

			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys(String.valueOf(effectevidencesynthesisusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(effectevidencesynthesisusecontextvaluecodeableconceptcodingi == effectevidencesynthesisusecontextvaluecodeableconceptcodinglist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** effectevidencesynthesisusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range effectevidencesynthesisusecontextvaluerange = effectevidencesynthesisusecontext.getValueRange();

		/******************** effectevidencesynthesisusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluerangelow = effectevidencesynthesisusecontextvaluerange.getLow();

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngLwVl("[");}
		if(effectevidencesynthesisusecontextvaluerangelow.hasValue()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngLwVl(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getValue()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngLwVl("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngLwVl("]");}


		/******************** effectevidencesynthesisusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator effectevidencesynthesisusecontextvaluerangelowcomparator = effectevidencesynthesisusecontextvaluerangelow.getComparator();
		if(effectevidencesynthesisusecontextvaluerangelowcomparator!=null) {
		if(effectevidencesynthesisusecontexti == 0) {

		e.addEfctEvdnceSynthsUseCntxtVlRngLwCmprtr("[");		}
			e.addEfctEvdnceSynthsUseCntxtVlRngLwCmprtr(effectevidencesynthesisusecontextvaluerangelowcomparator.toCode());
		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {

		e.addEfctEvdnceSynthsUseCntxtVlRngLwCmprtr("]");		}

		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngLwCd("[");}
		if(effectevidencesynthesisusecontextvaluerangelow.hasCode()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngLwCd(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getCode()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngLwCd("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngLwCd("]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngLwUnt("[");}
		if(effectevidencesynthesisusecontextvaluerangelow.hasUnit()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngLwUnt(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getUnit()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngLwUnt("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngLwUnt("]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngLwSys("[");}
		if(effectevidencesynthesisusecontextvaluerangelow.hasSystem()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngLwSys(String.valueOf(effectevidencesynthesisusecontextvaluerangelow.getSystem()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngLwSys("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngLwSys("]");}


		/******************** effectevidencesynthesisusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluerangehigh = effectevidencesynthesisusecontextvaluerange.getHigh();

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngHiVl("[");}
		if(effectevidencesynthesisusecontextvaluerangehigh.hasValue()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngHiVl(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getValue()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngHiVl("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngHiVl("]");}


		/******************** effectevidencesynthesisusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator effectevidencesynthesisusecontextvaluerangehighcomparator = effectevidencesynthesisusecontextvaluerangehigh.getComparator();
		if(effectevidencesynthesisusecontextvaluerangehighcomparator!=null) {
		if(effectevidencesynthesisusecontexti == 0) {

		e.addEfctEvdnceSynthsUseCntxtVlRngHiCmprtr("[");		}
			e.addEfctEvdnceSynthsUseCntxtVlRngHiCmprtr(effectevidencesynthesisusecontextvaluerangehighcomparator.toCode());
		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {

		e.addEfctEvdnceSynthsUseCntxtVlRngHiCmprtr("]");		}

		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngHiCd("[");}
		if(effectevidencesynthesisusecontextvaluerangehigh.hasCode()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngHiCd(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getCode()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngHiCd("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngHiCd("]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngHiUnt("[");}
		if(effectevidencesynthesisusecontextvaluerangehigh.hasUnit()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngHiUnt(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getUnit()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngHiUnt("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngHiUnt("]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlRngHiSys("[");}
		if(effectevidencesynthesisusecontextvaluerangehigh.hasSystem()) {

			e.addEfctEvdnceSynthsUseCntxtVlRngHiSys(String.valueOf(effectevidencesynthesisusecontextvaluerangehigh.getSystem()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlRngHiSys("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlRngHiSys("]");}


		/******************** effectevidencesynthesisusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity effectevidencesynthesisusecontextvaluequantity = effectevidencesynthesisusecontext.getValueQuantity();

		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlQntyVl("[");}
		if(effectevidencesynthesisusecontextvaluequantity.hasValue()) {

			e.addEfctEvdnceSynthsUseCntxtVlQntyVl(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getValue()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlQntyVl("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlQntyVl("]");}


		/******************** effectevidencesynthesisusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator effectevidencesynthesisusecontextvaluequantitycomparator = effectevidencesynthesisusecontextvaluequantity.getComparator();
		if(effectevidencesynthesisusecontextvaluequantitycomparator!=null) {
		if(effectevidencesynthesisusecontexti == 0) {

		e.addEfctEvdnceSynthsUseCntxtVlQntyCmprtr("[");		}
			e.addEfctEvdnceSynthsUseCntxtVlQntyCmprtr(effectevidencesynthesisusecontextvaluequantitycomparator.toCode());
		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {

		e.addEfctEvdnceSynthsUseCntxtVlQntyCmprtr("]");		}

		} else {
			e.addEfctEvdnceSynthsUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlQntyCd("[");}
		if(effectevidencesynthesisusecontextvaluequantity.hasCode()) {

			e.addEfctEvdnceSynthsUseCntxtVlQntyCd(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getCode()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlQntyCd("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlQntyCd("]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlQntyUnt("[");}
		if(effectevidencesynthesisusecontextvaluequantity.hasUnit()) {

			e.addEfctEvdnceSynthsUseCntxtVlQntyUnt(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getUnit()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlQntyUnt("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlQntyUnt("]");}


		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(effectevidencesynthesisusecontexti == 0) {e.addEfctEvdnceSynthsUseCntxtVlQntySys("[");}
		if(effectevidencesynthesisusecontextvaluequantity.hasSystem()) {

			e.addEfctEvdnceSynthsUseCntxtVlQntySys(String.valueOf(effectevidencesynthesisusecontextvaluequantity.getSystem()));
		} else {
			e.addEfctEvdnceSynthsUseCntxtVlQntySys("NULL");
		}

		if(effectevidencesynthesisusecontexti == effectevidencesynthesisusecontextlist.size()-1) {e.addEfctEvdnceSynthsUseCntxtVlQntySys("]");}


		 };
		/******************** EfctEvdnceSynths_Pblshr ********************************************************************************/
		if(effectevidencesynthesis.hasPublisher()) {

			e.addEfctEvdnceSynthsPblshr(String.valueOf(effectevidencesynthesis.getPublisher()));
		} else {
			e.addEfctEvdnceSynthsPblshr("NULL");
		}


		/******************** effectevidencesynthesiseffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesiseffectiveperiod = effectevidencesynthesis.getEffectivePeriod();

		/******************** EfctEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(effectevidencesynthesiseffectiveperiod.hasStart()) {

			e.addEfctEvdnceSynthsEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiseffectiveperiod.getStart())+"\"");
		} else {
			e.addEfctEvdnceSynthsEfctivePrdStrt("NULL");
		}


		/******************** EfctEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(effectevidencesynthesiseffectiveperiod.hasEnd()) {

			e.addEfctEvdnceSynthsEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesiseffectiveperiod.getEnd())+"\"");
		} else {
			e.addEfctEvdnceSynthsEfctivePrdEnd("NULL");
		}


		/******************** EfctEvdnceSynths_ExposureAlternative ********************************************************************************/
		if(effectevidencesynthesis.hasExposureAlternative()) {

			if(effectevidencesynthesis.getExposureAlternative().getReference() != null) {
			e.addEfctEvdnceSynthsExposureAlternative(effectevidencesynthesis.getExposureAlternative().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsExposureAlternative("NULL");
		}


		/******************** effectevidencesynthesisresultsbyexposure ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisResultsByExposureComponent> effectevidencesynthesisresultsbyexposurelist = effectevidencesynthesis.getResultsByExposure();
		for(int effectevidencesynthesisresultsbyexposurei = 0; effectevidencesynthesisresultsbyexposurei<effectevidencesynthesisresultsbyexposurelist.size();effectevidencesynthesisresultsbyexposurei++ ) {
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.EffectEvidenceSynthesisResultsByExposureComponent  effectevidencesynthesisresultsbyexposure = effectevidencesynthesisresultsbyexposurelist.get(effectevidencesynthesisresultsbyexposurei);

		/******************** EfctEvdnceSynths_RsltsByExposure_Dscrptn ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurei == 0) {e.addEfctEvdnceSynthsRsltsByExposureDscrptn("[");}
		if(effectevidencesynthesisresultsbyexposure.hasDescription()) {

			e.addEfctEvdnceSynthsRsltsByExposureDscrptn(String.valueOf(effectevidencesynthesisresultsbyexposure.getDescription()));
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureDscrptn("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurei == effectevidencesynthesisresultsbyexposurelist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureDscrptn("]");}


		/******************** EfctEvdnceSynths_RsltsByExposure_RskEvdnceSynths ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurei == 0) {e.addEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths("[");}
		if(effectevidencesynthesisresultsbyexposure.hasRiskEvidenceSynthesis()) {

			if(effectevidencesynthesisresultsbyexposure.getRiskEvidenceSynthesis().getReference() != null) {
			e.addEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths(effectevidencesynthesisresultsbyexposure.getRiskEvidenceSynthesis().getReference());
			}
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurei == effectevidencesynthesisresultsbyexposurelist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths("]");}


		/******************** effectevidencesynthesisresultsbyexposurevariantstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept effectevidencesynthesisresultsbyexposurevariantstate = effectevidencesynthesisresultsbyexposure.getVariantState();

		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Txt ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurei == 0) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateTxt("[");}
		if(effectevidencesynthesisresultsbyexposurevariantstate.hasText()) {

			e.addEfctEvdnceSynthsRsltsByExposureVariantStateTxt(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstate.getText()));
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureVariantStateTxt("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurei == effectevidencesynthesisresultsbyexposurelist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateTxt("]");}


		/******************** effectevidencesynthesisresultsbyexposurevariantstatecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> effectevidencesynthesisresultsbyexposurevariantstatecodinglist = effectevidencesynthesisresultsbyexposurevariantstate.getCoding();
		for(int effectevidencesynthesisresultsbyexposurevariantstatecodingi = 0; effectevidencesynthesisresultsbyexposurevariantstatecodingi<effectevidencesynthesisresultsbyexposurevariantstatecodinglist.size();effectevidencesynthesisresultsbyexposurevariantstatecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  effectevidencesynthesisresultsbyexposurevariantstatecoding = effectevidencesynthesisresultsbyexposurevariantstatecodinglist.get(effectevidencesynthesisresultsbyexposurevariantstatecodingi);

		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Dsply ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == 0) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply("[[");}
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasDisplay()) {

			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getDisplay()));
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == effectevidencesynthesisresultsbyexposurevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply("]]");}


		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Vrsn ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == 0) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn("[[");}
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasVersion()) {

			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getVersion()));
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == effectevidencesynthesisresultsbyexposurevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn("]]");}


		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Cd ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == 0) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd("[[");}
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasCode()) {

			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getCode()));
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == effectevidencesynthesisresultsbyexposurevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd("]]");}


		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == 0) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd("[[");}
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasUserSelected()) {

			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getUserSelected()));
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == effectevidencesynthesisresultsbyexposurevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd("]]");}


		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Sys ********************************************************************************/
		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == 0) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys("[[");}
		if(effectevidencesynthesisresultsbyexposurevariantstatecoding.hasSystem()) {

			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys(String.valueOf(effectevidencesynthesisresultsbyexposurevariantstatecoding.getSystem()));
		} else {
			e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys("NULL");
		}

		if(effectevidencesynthesisresultsbyexposurevariantstatecodingi == effectevidencesynthesisresultsbyexposurevariantstatecodinglist.size()-1) {e.addEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys("]]");}


		 };
		/******************** effectevidencesynthesisresultsbyexposureexposurestate ********************************************************************************/
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis.ExposureState effectevidencesynthesisresultsbyexposureexposurestate = effectevidencesynthesisresultsbyexposure.getExposureState();
		if(effectevidencesynthesisresultsbyexposureexposurestate!=null) {
		if(effectevidencesynthesisresultsbyexposurei == 0) {

		e.addEfctEvdnceSynthsRsltsByExposureExposureState("[");		}
			e.addEfctEvdnceSynthsRsltsByExposureExposureState(effectevidencesynthesisresultsbyexposureexposurestate.toCode());
		if(effectevidencesynthesisresultsbyexposurei == effectevidencesynthesisresultsbyexposurelist.size()-1) {

		e.addEfctEvdnceSynthsRsltsByExposureExposureState("]");		}

		} else {
			e.addEfctEvdnceSynthsRsltsByExposureExposureState("NULL");
		}

		 };
		/******************** effectevidencesynthesisauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> effectevidencesynthesisauthorlist = effectevidencesynthesis.getAuthor();
		for(int effectevidencesynthesisauthori = 0; effectevidencesynthesisauthori<effectevidencesynthesisauthorlist.size();effectevidencesynthesisauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  effectevidencesynthesisauthor = effectevidencesynthesisauthorlist.get(effectevidencesynthesisauthori);

		/******************** EfctEvdnceSynths_Athr_Nm ********************************************************************************/
		if(effectevidencesynthesisauthori == 0) {e.addEfctEvdnceSynthsAthrNm("[");}
		if(effectevidencesynthesisauthor.hasName()) {

			e.addEfctEvdnceSynthsAthrNm(String.valueOf(effectevidencesynthesisauthor.getName()));
		} else {
			e.addEfctEvdnceSynthsAthrNm("NULL");
		}

		if(effectevidencesynthesisauthori == effectevidencesynthesisauthorlist.size()-1) {e.addEfctEvdnceSynthsAthrNm("]");}


		/******************** effectevidencesynthesisauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> effectevidencesynthesisauthortelecomlist = effectevidencesynthesisauthor.getTelecom();
		for(int effectevidencesynthesisauthortelecomi = 0; effectevidencesynthesisauthortelecomi<effectevidencesynthesisauthortelecomlist.size();effectevidencesynthesisauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  effectevidencesynthesisauthortelecom = effectevidencesynthesisauthortelecomlist.get(effectevidencesynthesisauthortelecomi);

		/******************** EfctEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(effectevidencesynthesisauthortelecomi == 0) {e.addEfctEvdnceSynthsAthrTlcmVl("[[");}
		if(effectevidencesynthesisauthortelecom.hasValue()) {

			e.addEfctEvdnceSynthsAthrTlcmVl(String.valueOf(effectevidencesynthesisauthortelecom.getValue()));
		} else {
			e.addEfctEvdnceSynthsAthrTlcmVl("NULL");
		}

		if(effectevidencesynthesisauthortelecomi == effectevidencesynthesisauthortelecomlist.size()-1) {e.addEfctEvdnceSynthsAthrTlcmVl("]]");}


		/******************** effectevidencesynthesisauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period effectevidencesynthesisauthortelecomperiod = effectevidencesynthesisauthortelecom.getPeriod();

		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(effectevidencesynthesisauthortelecomi == 0) {e.addEfctEvdnceSynthsAthrTlcmPrdStrt("[[");}
		if(effectevidencesynthesisauthortelecomperiod.hasStart()) {

			e.addEfctEvdnceSynthsAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisauthortelecomperiod.getStart())+"\"");
		} else {
			e.addEfctEvdnceSynthsAthrTlcmPrdStrt("NULL");
		}

		if(effectevidencesynthesisauthortelecomi == effectevidencesynthesisauthortelecomlist.size()-1) {e.addEfctEvdnceSynthsAthrTlcmPrdStrt("]]");}


		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(effectevidencesynthesisauthortelecomi == 0) {e.addEfctEvdnceSynthsAthrTlcmPrdEnd("[[");}
		if(effectevidencesynthesisauthortelecomperiod.hasEnd()) {

			e.addEfctEvdnceSynthsAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(effectevidencesynthesisauthortelecomperiod.getEnd())+"\"");
		} else {
			e.addEfctEvdnceSynthsAthrTlcmPrdEnd("NULL");
		}

		if(effectevidencesynthesisauthortelecomi == effectevidencesynthesisauthortelecomlist.size()-1) {e.addEfctEvdnceSynthsAthrTlcmPrdEnd("]]");}


		/******************** effectevidencesynthesisauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse effectevidencesynthesisauthortelecomuse = effectevidencesynthesisauthortelecom.getUse();
		if(effectevidencesynthesisauthortelecomuse!=null) {
		if(effectevidencesynthesisauthortelecomi == 0) {

		e.addEfctEvdnceSynthsAthrTlcmUse("[[");		}
			e.addEfctEvdnceSynthsAthrTlcmUse(effectevidencesynthesisauthortelecomuse.toCode());
		if(effectevidencesynthesisauthortelecomi == effectevidencesynthesisauthortelecomlist.size()-1) {

		e.addEfctEvdnceSynthsAthrTlcmUse("]]");		}

		} else {
			e.addEfctEvdnceSynthsAthrTlcmUse("NULL");
		}

		/******************** effectevidencesynthesisauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem effectevidencesynthesisauthortelecomsystem = effectevidencesynthesisauthortelecom.getSystem();
		if(effectevidencesynthesisauthortelecomsystem!=null) {
		if(effectevidencesynthesisauthortelecomi == 0) {

		e.addEfctEvdnceSynthsAthrTlcmSys("[[");		}
			e.addEfctEvdnceSynthsAthrTlcmSys(effectevidencesynthesisauthortelecomsystem.toCode());
		if(effectevidencesynthesisauthortelecomi == effectevidencesynthesisauthortelecomlist.size()-1) {

		e.addEfctEvdnceSynthsAthrTlcmSys("]]");		}

		} else {
			e.addEfctEvdnceSynthsAthrTlcmSys("NULL");
		}

		/******************** EfctEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(effectevidencesynthesisauthortelecomi == 0) {e.addEfctEvdnceSynthsAthrTlcmRnk("[[");}
		if(effectevidencesynthesisauthortelecom.hasRank()) {

			e.addEfctEvdnceSynthsAthrTlcmRnk(String.valueOf(effectevidencesynthesisauthortelecom.getRank()));
		} else {
			e.addEfctEvdnceSynthsAthrTlcmRnk("NULL");
		}

		if(effectevidencesynthesisauthortelecomi == effectevidencesynthesisauthortelecomlist.size()-1) {e.addEfctEvdnceSynthsAthrTlcmRnk("]]");}


		 };
		 };
		return e;
	}
}
