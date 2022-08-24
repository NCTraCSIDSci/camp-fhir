package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Immunization;
public class ImmunizationBidirectionalConversion 
{
	public Immunization Immunizations(org.hl7.fhir.r4.model.Immunization immunization) throws ParseException
	{
		 main.java.com.campfhir.model.Immunization i = new  main.java.com.campfhir.model.Immunization();

		/******************** id ********************************************************************************/
		i.setId(immunization.getIdElement().getIdPart());

		/******************** Immnztn_Lctn ********************************************************************************/
		if(immunization.hasLocation()) {

			if(immunization.getLocation().getReference() != null) {
			i.addImmnztnLctn(immunization.getLocation().getReference());
			}
		} else {
			i.addImmnztnLctn("NULL");
		}


		/******************** immunizationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Immunization.ImmunizationStatus immunizationstatus = immunization.getStatus();
		if(immunizationstatus!=null) {
			i.addImmnztnSts(immunizationstatus.toCode());
		} else {
			i.addImmnztnSts("NULL");
		}

		/******************** Immnztn_Enc ********************************************************************************/
		if(immunization.hasEncounter()) {

			if(immunization.getEncounter().getReference() != null) {
			i.addImmnztnEnc(immunization.getEncounter().getReference());
			}
		} else {
			i.addImmnztnEnc("NULL");
		}


		/******************** immunizationreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationreasoncodelist = immunization.getReasonCode();
		for(int immunizationreasoncodei = 0; immunizationreasoncodei<immunizationreasoncodelist.size();immunizationreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationreasoncode = immunizationreasoncodelist.get(immunizationreasoncodei);

		/******************** Immnztn_RsnCd_Txt ********************************************************************************/
		if(immunizationreasoncodei == 0) {i.addImmnztnRsnCdTxt("[");}
		if(immunizationreasoncode.hasText()) {

			i.addImmnztnRsnCdTxt(String.valueOf(immunizationreasoncode.getText()));
		} else {
			i.addImmnztnRsnCdTxt("NULL");
		}

		if(immunizationreasoncodei == immunizationreasoncodelist.size()-1) {i.addImmnztnRsnCdTxt("]");}


		/******************** immunizationreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationreasoncodecodinglist = immunizationreasoncode.getCoding();
		for(int immunizationreasoncodecodingi = 0; immunizationreasoncodecodingi<immunizationreasoncodecodinglist.size();immunizationreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationreasoncodecoding = immunizationreasoncodecodinglist.get(immunizationreasoncodecodingi);

		/******************** Immnztn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(immunizationreasoncodecodingi == 0) {i.addImmnztnRsnCdCdgDsply("[[");}
		if(immunizationreasoncodecoding.hasDisplay()) {

			i.addImmnztnRsnCdCdgDsply(String.valueOf(immunizationreasoncodecoding.getDisplay()));
		} else {
			i.addImmnztnRsnCdCdgDsply("NULL");
		}

		if(immunizationreasoncodecodingi == immunizationreasoncodecodinglist.size()-1) {i.addImmnztnRsnCdCdgDsply("]]");}


		/******************** Immnztn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationreasoncodecodingi == 0) {i.addImmnztnRsnCdCdgVrsn("[[");}
		if(immunizationreasoncodecoding.hasVersion()) {

			i.addImmnztnRsnCdCdgVrsn(String.valueOf(immunizationreasoncodecoding.getVersion()));
		} else {
			i.addImmnztnRsnCdCdgVrsn("NULL");
		}

		if(immunizationreasoncodecodingi == immunizationreasoncodecodinglist.size()-1) {i.addImmnztnRsnCdCdgVrsn("]]");}


		/******************** Immnztn_RsnCd_Cdg_Cd ********************************************************************************/
		if(immunizationreasoncodecodingi == 0) {i.addImmnztnRsnCdCdgCd("[[");}
		if(immunizationreasoncodecoding.hasCode()) {

			i.addImmnztnRsnCdCdgCd(String.valueOf(immunizationreasoncodecoding.getCode()));
		} else {
			i.addImmnztnRsnCdCdgCd("NULL");
		}

		if(immunizationreasoncodecodingi == immunizationreasoncodecodinglist.size()-1) {i.addImmnztnRsnCdCdgCd("]]");}


		/******************** Immnztn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationreasoncodecodingi == 0) {i.addImmnztnRsnCdCdgUsrSltd("[[");}
		if(immunizationreasoncodecoding.hasUserSelected()) {

			i.addImmnztnRsnCdCdgUsrSltd(String.valueOf(immunizationreasoncodecoding.getUserSelected()));
		} else {
			i.addImmnztnRsnCdCdgUsrSltd("NULL");
		}

		if(immunizationreasoncodecodingi == immunizationreasoncodecodinglist.size()-1) {i.addImmnztnRsnCdCdgUsrSltd("]]");}


		/******************** Immnztn_RsnCd_Cdg_Sys ********************************************************************************/
		if(immunizationreasoncodecodingi == 0) {i.addImmnztnRsnCdCdgSys("[[");}
		if(immunizationreasoncodecoding.hasSystem()) {

			i.addImmnztnRsnCdCdgSys(String.valueOf(immunizationreasoncodecoding.getSystem()));
		} else {
			i.addImmnztnRsnCdCdgSys("NULL");
		}

		if(immunizationreasoncodecodingi == immunizationreasoncodecodinglist.size()-1) {i.addImmnztnRsnCdCdgSys("]]");}


		 };
		 };
		/******************** immunizationnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> immunizationnotelist = immunization.getNote();
		for(int immunizationnotei = 0; immunizationnotei<immunizationnotelist.size();immunizationnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  immunizationnote = immunizationnotelist.get(immunizationnotei);

		/******************** Immnztn_Nt_Time ********************************************************************************/
		if(immunizationnotei == 0) {i.addImmnztnNtTime("[");}
		if(immunizationnote.hasTime()) {

			i.addImmnztnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationnote.getTime())+"\"");
		} else {
			i.addImmnztnNtTime("NULL");
		}

		if(immunizationnotei == immunizationnotelist.size()-1) {i.addImmnztnNtTime("]");}


		/******************** Immnztn_Nt_AthrRfrnc ********************************************************************************/
		if(immunizationnotei == 0) {i.addImmnztnNtAthrRfrnc("[");}
		if(immunizationnote.hasAuthorReference()) {

			if(immunizationnote.getAuthorReference().getReference() != null) {
			i.addImmnztnNtAthrRfrnc(immunizationnote.getAuthorReference().getReference());
			}
		} else {
			i.addImmnztnNtAthrRfrnc("NULL");
		}

		if(immunizationnotei == immunizationnotelist.size()-1) {i.addImmnztnNtAthrRfrnc("]");}


		/******************** Immnztn_Nt_Txt ********************************************************************************/
		if(immunizationnotei == 0) {i.addImmnztnNtTxt("[");}
		if(immunizationnote.hasText()) {

			i.addImmnztnNtTxt(String.valueOf(immunizationnote.getText()));
		} else {
			i.addImmnztnNtTxt("NULL");
		}

		if(immunizationnotei == immunizationnotelist.size()-1) {i.addImmnztnNtTxt("]");}


		/******************** Immnztn_Nt_AthrStrgTyp ********************************************************************************/
		if(immunizationnotei == 0) {i.addImmnztnNtAthrStrgTyp("[");}
		if(immunizationnote.hasAuthorStringType()) {

			i.addImmnztnNtAthrStrgTyp("\""+immunizationnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnNtAthrStrgTyp("NULL");
		}

		if(immunizationnotei == immunizationnotelist.size()-1) {i.addImmnztnNtAthrStrgTyp("]");}


		 };
		/******************** Immnztn_RsnRfrnc ********************************************************************************/
		if(immunization.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<immunization.getReasonReference().size(); incr++) {
				array = array + immunization.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImmnztnRsnRfrnc(array);

		} else {
			i.addImmnztnRsnRfrnc("NULL");
		}


		/******************** immunizationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> immunizationidentifierlist = immunization.getIdentifier();
		for(int immunizationidentifieri = 0; immunizationidentifieri<immunizationidentifierlist.size();immunizationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  immunizationidentifier = immunizationidentifierlist.get(immunizationidentifieri);

		/******************** Immnztn_Id_Vl ********************************************************************************/
		if(immunizationidentifieri == 0) {i.addImmnztnIdVl("[");}
		if(immunizationidentifier.hasValue()) {

			i.addImmnztnIdVl(String.valueOf(immunizationidentifier.getValue()));
		} else {
			i.addImmnztnIdVl("NULL");
		}

		if(immunizationidentifieri == immunizationidentifierlist.size()-1) {i.addImmnztnIdVl("]");}


		/******************** immunizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationidentifiertype = immunizationidentifier.getType();

		/******************** Immnztn_Id_Typ_Txt ********************************************************************************/
		if(immunizationidentifieri == 0) {i.addImmnztnIdTypTxt("[");}
		if(immunizationidentifiertype.hasText()) {

			i.addImmnztnIdTypTxt(String.valueOf(immunizationidentifiertype.getText()));
		} else {
			i.addImmnztnIdTypTxt("NULL");
		}

		if(immunizationidentifieri == immunizationidentifierlist.size()-1) {i.addImmnztnIdTypTxt("]");}


		/******************** immunizationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationidentifiertypecodinglist = immunizationidentifiertype.getCoding();
		for(int immunizationidentifiertypecodingi = 0; immunizationidentifiertypecodingi<immunizationidentifiertypecodinglist.size();immunizationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationidentifiertypecoding = immunizationidentifiertypecodinglist.get(immunizationidentifiertypecodingi);

		/******************** Immnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(immunizationidentifiertypecodingi == 0) {i.addImmnztnIdTypCdgDsply("[[");}
		if(immunizationidentifiertypecoding.hasDisplay()) {

			i.addImmnztnIdTypCdgDsply(String.valueOf(immunizationidentifiertypecoding.getDisplay()));
		} else {
			i.addImmnztnIdTypCdgDsply("NULL");
		}

		if(immunizationidentifiertypecodingi == immunizationidentifiertypecodinglist.size()-1) {i.addImmnztnIdTypCdgDsply("]]");}


		/******************** Immnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(immunizationidentifiertypecodingi == 0) {i.addImmnztnIdTypCdgVrsn("[[");}
		if(immunizationidentifiertypecoding.hasVersion()) {

			i.addImmnztnIdTypCdgVrsn(String.valueOf(immunizationidentifiertypecoding.getVersion()));
		} else {
			i.addImmnztnIdTypCdgVrsn("NULL");
		}

		if(immunizationidentifiertypecodingi == immunizationidentifiertypecodinglist.size()-1) {i.addImmnztnIdTypCdgVrsn("]]");}


		/******************** Immnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(immunizationidentifiertypecodingi == 0) {i.addImmnztnIdTypCdgCd("[[");}
		if(immunizationidentifiertypecoding.hasCode()) {

			i.addImmnztnIdTypCdgCd(String.valueOf(immunizationidentifiertypecoding.getCode()));
		} else {
			i.addImmnztnIdTypCdgCd("NULL");
		}

		if(immunizationidentifiertypecodingi == immunizationidentifiertypecodinglist.size()-1) {i.addImmnztnIdTypCdgCd("]]");}


		/******************** Immnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(immunizationidentifiertypecodingi == 0) {i.addImmnztnIdTypCdgUsrSltd("[[");}
		if(immunizationidentifiertypecoding.hasUserSelected()) {

			i.addImmnztnIdTypCdgUsrSltd(String.valueOf(immunizationidentifiertypecoding.getUserSelected()));
		} else {
			i.addImmnztnIdTypCdgUsrSltd("NULL");
		}

		if(immunizationidentifiertypecodingi == immunizationidentifiertypecodinglist.size()-1) {i.addImmnztnIdTypCdgUsrSltd("]]");}


		/******************** Immnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(immunizationidentifiertypecodingi == 0) {i.addImmnztnIdTypCdgSys("[[");}
		if(immunizationidentifiertypecoding.hasSystem()) {

			i.addImmnztnIdTypCdgSys(String.valueOf(immunizationidentifiertypecoding.getSystem()));
		} else {
			i.addImmnztnIdTypCdgSys("NULL");
		}

		if(immunizationidentifiertypecodingi == immunizationidentifiertypecodinglist.size()-1) {i.addImmnztnIdTypCdgSys("]]");}


		 };
		/******************** immunizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period immunizationidentifierperiod = immunizationidentifier.getPeriod();

		/******************** Immnztn_Id_Prd_Strt ********************************************************************************/
		if(immunizationidentifieri == 0) {i.addImmnztnIdPrdStrt("[");}
		if(immunizationidentifierperiod.hasStart()) {

			i.addImmnztnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationidentifierperiod.getStart())+"\"");
		} else {
			i.addImmnztnIdPrdStrt("NULL");
		}

		if(immunizationidentifieri == immunizationidentifierlist.size()-1) {i.addImmnztnIdPrdStrt("]");}


		/******************** Immnztn_Id_Prd_End ********************************************************************************/
		if(immunizationidentifieri == 0) {i.addImmnztnIdPrdEnd("[");}
		if(immunizationidentifierperiod.hasEnd()) {

			i.addImmnztnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationidentifierperiod.getEnd())+"\"");
		} else {
			i.addImmnztnIdPrdEnd("NULL");
		}

		if(immunizationidentifieri == immunizationidentifierlist.size()-1) {i.addImmnztnIdPrdEnd("]");}


		/******************** immunizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse immunizationidentifieruse = immunizationidentifier.getUse();
		if(immunizationidentifieruse!=null) {
		if(immunizationidentifieri == 0) {

		i.addImmnztnIdUse("[");		}
			i.addImmnztnIdUse(immunizationidentifieruse.toCode());
		if(immunizationidentifieri == immunizationidentifierlist.size()-1) {

		i.addImmnztnIdUse("]");		}

		} else {
			i.addImmnztnIdUse("NULL");
		}

		/******************** Immnztn_Id_Assigner ********************************************************************************/
		if(immunizationidentifieri == 0) {i.addImmnztnIdAssigner("[");}
		if(immunizationidentifier.hasAssigner()) {

			if(immunizationidentifier.getAssigner().getReference() != null) {
			i.addImmnztnIdAssigner(immunizationidentifier.getAssigner().getReference());
			}
		} else {
			i.addImmnztnIdAssigner("NULL");
		}

		if(immunizationidentifieri == immunizationidentifierlist.size()-1) {i.addImmnztnIdAssigner("]");}


		/******************** Immnztn_Id_Sys ********************************************************************************/
		if(immunizationidentifieri == 0) {i.addImmnztnIdSys("[");}
		if(immunizationidentifier.hasSystem()) {

			i.addImmnztnIdSys(String.valueOf(immunizationidentifier.getSystem()));
		} else {
			i.addImmnztnIdSys("NULL");
		}

		if(immunizationidentifieri == immunizationidentifierlist.size()-1) {i.addImmnztnIdSys("]");}


		 };
		/******************** Immnztn_OccrnceDtTimeTyp ********************************************************************************/
		if(immunization.hasOccurrenceDateTimeType()) {

			i.addImmnztnOccrnceDtTimeTyp("\""+immunization.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			i.addImmnztnOccrnceDtTimeTyp("NULL");
		}


		/******************** immunizationreaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent> immunizationreactionlist = immunization.getReaction();
		for(int immunizationreactioni = 0; immunizationreactioni<immunizationreactionlist.size();immunizationreactioni++ ) {
		org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent  immunizationreaction = immunizationreactionlist.get(immunizationreactioni);

		/******************** Immnztn_Reaction_Dt ********************************************************************************/
		if(immunizationreactioni == 0) {i.addImmnztnReactionDt("[");}
		if(immunizationreaction.hasDate()) {

			i.addImmnztnReactionDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationreaction.getDate())+"\"");
		} else {
			i.addImmnztnReactionDt("NULL");
		}

		if(immunizationreactioni == immunizationreactionlist.size()-1) {i.addImmnztnReactionDt("]");}


		/******************** Immnztn_Reaction_Dtl ********************************************************************************/
		if(immunizationreactioni == 0) {i.addImmnztnReactionDtl("[");}
		if(immunizationreaction.hasDetail()) {

			if(immunizationreaction.getDetail().getReference() != null) {
			i.addImmnztnReactionDtl(immunizationreaction.getDetail().getReference());
			}
		} else {
			i.addImmnztnReactionDtl("NULL");
		}

		if(immunizationreactioni == immunizationreactionlist.size()-1) {i.addImmnztnReactionDtl("]");}


		/******************** Immnztn_Reaction_Rpted ********************************************************************************/
		if(immunizationreactioni == 0) {i.addImmnztnReactionRpted("[");}
		if(immunizationreaction.hasReported()) {

			i.addImmnztnReactionRpted(String.valueOf(immunizationreaction.getReported()));
		} else {
			i.addImmnztnReactionRpted("NULL");
		}

		if(immunizationreactioni == immunizationreactionlist.size()-1) {i.addImmnztnReactionRpted("]");}


		 };
		/******************** Immnztn_Recorded ********************************************************************************/
		if(immunization.hasRecorded()) {

			i.addImmnztnRecorded("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunization.getRecorded())+"\"");
		} else {
			i.addImmnztnRecorded("NULL");
		}


		/******************** immunizationsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationsite = immunization.getSite();

		/******************** Immnztn_Site_Txt ********************************************************************************/
		if(immunizationsite.hasText()) {

			i.addImmnztnSiteTxt(String.valueOf(immunizationsite.getText()));
		} else {
			i.addImmnztnSiteTxt("NULL");
		}


		/******************** immunizationsitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationsitecodinglist = immunizationsite.getCoding();
		for(int immunizationsitecodingi = 0; immunizationsitecodingi<immunizationsitecodinglist.size();immunizationsitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationsitecoding = immunizationsitecodinglist.get(immunizationsitecodingi);

		/******************** Immnztn_Site_Cdg_Dsply ********************************************************************************/
		if(immunizationsitecodingi == 0) {i.addImmnztnSiteCdgDsply("[");}
		if(immunizationsitecoding.hasDisplay()) {

			i.addImmnztnSiteCdgDsply(String.valueOf(immunizationsitecoding.getDisplay()));
		} else {
			i.addImmnztnSiteCdgDsply("NULL");
		}

		if(immunizationsitecodingi == immunizationsitecodinglist.size()-1) {i.addImmnztnSiteCdgDsply("]");}


		/******************** Immnztn_Site_Cdg_Vrsn ********************************************************************************/
		if(immunizationsitecodingi == 0) {i.addImmnztnSiteCdgVrsn("[");}
		if(immunizationsitecoding.hasVersion()) {

			i.addImmnztnSiteCdgVrsn(String.valueOf(immunizationsitecoding.getVersion()));
		} else {
			i.addImmnztnSiteCdgVrsn("NULL");
		}

		if(immunizationsitecodingi == immunizationsitecodinglist.size()-1) {i.addImmnztnSiteCdgVrsn("]");}


		/******************** Immnztn_Site_Cdg_Cd ********************************************************************************/
		if(immunizationsitecodingi == 0) {i.addImmnztnSiteCdgCd("[");}
		if(immunizationsitecoding.hasCode()) {

			i.addImmnztnSiteCdgCd(String.valueOf(immunizationsitecoding.getCode()));
		} else {
			i.addImmnztnSiteCdgCd("NULL");
		}

		if(immunizationsitecodingi == immunizationsitecodinglist.size()-1) {i.addImmnztnSiteCdgCd("]");}


		/******************** Immnztn_Site_Cdg_UsrSltd ********************************************************************************/
		if(immunizationsitecodingi == 0) {i.addImmnztnSiteCdgUsrSltd("[");}
		if(immunizationsitecoding.hasUserSelected()) {

			i.addImmnztnSiteCdgUsrSltd(String.valueOf(immunizationsitecoding.getUserSelected()));
		} else {
			i.addImmnztnSiteCdgUsrSltd("NULL");
		}

		if(immunizationsitecodingi == immunizationsitecodinglist.size()-1) {i.addImmnztnSiteCdgUsrSltd("]");}


		/******************** Immnztn_Site_Cdg_Sys ********************************************************************************/
		if(immunizationsitecodingi == 0) {i.addImmnztnSiteCdgSys("[");}
		if(immunizationsitecoding.hasSystem()) {

			i.addImmnztnSiteCdgSys(String.valueOf(immunizationsitecoding.getSystem()));
		} else {
			i.addImmnztnSiteCdgSys("NULL");
		}

		if(immunizationsitecodingi == immunizationsitecodinglist.size()-1) {i.addImmnztnSiteCdgSys("]");}


		 };
		/******************** immunizationperformer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent> immunizationperformerlist = immunization.getPerformer();
		for(int immunizationperformeri = 0; immunizationperformeri<immunizationperformerlist.size();immunizationperformeri++ ) {
		org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent  immunizationperformer = immunizationperformerlist.get(immunizationperformeri);

		/******************** immunizationperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationperformerfunction = immunizationperformer.getFunction();

		/******************** Immnztn_Prfrmr_Function_Txt ********************************************************************************/
		if(immunizationperformeri == 0) {i.addImmnztnPrfrmrFunctionTxt("[");}
		if(immunizationperformerfunction.hasText()) {

			i.addImmnztnPrfrmrFunctionTxt(String.valueOf(immunizationperformerfunction.getText()));
		} else {
			i.addImmnztnPrfrmrFunctionTxt("NULL");
		}

		if(immunizationperformeri == immunizationperformerlist.size()-1) {i.addImmnztnPrfrmrFunctionTxt("]");}


		/******************** immunizationperformerfunctioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationperformerfunctioncodinglist = immunizationperformerfunction.getCoding();
		for(int immunizationperformerfunctioncodingi = 0; immunizationperformerfunctioncodingi<immunizationperformerfunctioncodinglist.size();immunizationperformerfunctioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationperformerfunctioncoding = immunizationperformerfunctioncodinglist.get(immunizationperformerfunctioncodingi);

		/******************** Immnztn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(immunizationperformerfunctioncodingi == 0) {i.addImmnztnPrfrmrFunctionCdgDsply("[[");}
		if(immunizationperformerfunctioncoding.hasDisplay()) {

			i.addImmnztnPrfrmrFunctionCdgDsply(String.valueOf(immunizationperformerfunctioncoding.getDisplay()));
		} else {
			i.addImmnztnPrfrmrFunctionCdgDsply("NULL");
		}

		if(immunizationperformerfunctioncodingi == immunizationperformerfunctioncodinglist.size()-1) {i.addImmnztnPrfrmrFunctionCdgDsply("]]");}


		/******************** Immnztn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(immunizationperformerfunctioncodingi == 0) {i.addImmnztnPrfrmrFunctionCdgVrsn("[[");}
		if(immunizationperformerfunctioncoding.hasVersion()) {

			i.addImmnztnPrfrmrFunctionCdgVrsn(String.valueOf(immunizationperformerfunctioncoding.getVersion()));
		} else {
			i.addImmnztnPrfrmrFunctionCdgVrsn("NULL");
		}

		if(immunizationperformerfunctioncodingi == immunizationperformerfunctioncodinglist.size()-1) {i.addImmnztnPrfrmrFunctionCdgVrsn("]]");}


		/******************** Immnztn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(immunizationperformerfunctioncodingi == 0) {i.addImmnztnPrfrmrFunctionCdgCd("[[");}
		if(immunizationperformerfunctioncoding.hasCode()) {

			i.addImmnztnPrfrmrFunctionCdgCd(String.valueOf(immunizationperformerfunctioncoding.getCode()));
		} else {
			i.addImmnztnPrfrmrFunctionCdgCd("NULL");
		}

		if(immunizationperformerfunctioncodingi == immunizationperformerfunctioncodinglist.size()-1) {i.addImmnztnPrfrmrFunctionCdgCd("]]");}


		/******************** Immnztn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(immunizationperformerfunctioncodingi == 0) {i.addImmnztnPrfrmrFunctionCdgUsrSltd("[[");}
		if(immunizationperformerfunctioncoding.hasUserSelected()) {

			i.addImmnztnPrfrmrFunctionCdgUsrSltd(String.valueOf(immunizationperformerfunctioncoding.getUserSelected()));
		} else {
			i.addImmnztnPrfrmrFunctionCdgUsrSltd("NULL");
		}

		if(immunizationperformerfunctioncodingi == immunizationperformerfunctioncodinglist.size()-1) {i.addImmnztnPrfrmrFunctionCdgUsrSltd("]]");}


		/******************** Immnztn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(immunizationperformerfunctioncodingi == 0) {i.addImmnztnPrfrmrFunctionCdgSys("[[");}
		if(immunizationperformerfunctioncoding.hasSystem()) {

			i.addImmnztnPrfrmrFunctionCdgSys(String.valueOf(immunizationperformerfunctioncoding.getSystem()));
		} else {
			i.addImmnztnPrfrmrFunctionCdgSys("NULL");
		}

		if(immunizationperformerfunctioncodingi == immunizationperformerfunctioncodinglist.size()-1) {i.addImmnztnPrfrmrFunctionCdgSys("]]");}


		 };
		/******************** Immnztn_Prfrmr_Actor ********************************************************************************/
		if(immunizationperformeri == 0) {i.addImmnztnPrfrmrActor("[");}
		if(immunizationperformer.hasActor()) {

			if(immunizationperformer.getActor().getReference() != null) {
			i.addImmnztnPrfrmrActor(immunizationperformer.getActor().getReference());
			}
		} else {
			i.addImmnztnPrfrmrActor("NULL");
		}

		if(immunizationperformeri == immunizationperformerlist.size()-1) {i.addImmnztnPrfrmrActor("]");}


		 };
		/******************** Immnztn_OccrnceStrgTyp ********************************************************************************/
		if(immunization.hasOccurrenceStringType()) {

			i.addImmnztnOccrnceStrgTyp("\""+immunization.getOccurrenceStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnOccrnceStrgTyp("NULL");
		}


		/******************** immunizationprogrameligibility ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationprogrameligibilitylist = immunization.getProgramEligibility();
		for(int immunizationprogrameligibilityi = 0; immunizationprogrameligibilityi<immunizationprogrameligibilitylist.size();immunizationprogrameligibilityi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationprogrameligibility = immunizationprogrameligibilitylist.get(immunizationprogrameligibilityi);

		/******************** Immnztn_PrgrmElgblty_Txt ********************************************************************************/
		if(immunizationprogrameligibilityi == 0) {i.addImmnztnPrgrmElgbltyTxt("[");}
		if(immunizationprogrameligibility.hasText()) {

			i.addImmnztnPrgrmElgbltyTxt(String.valueOf(immunizationprogrameligibility.getText()));
		} else {
			i.addImmnztnPrgrmElgbltyTxt("NULL");
		}

		if(immunizationprogrameligibilityi == immunizationprogrameligibilitylist.size()-1) {i.addImmnztnPrgrmElgbltyTxt("]");}


		/******************** immunizationprogrameligibilitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationprogrameligibilitycodinglist = immunizationprogrameligibility.getCoding();
		for(int immunizationprogrameligibilitycodingi = 0; immunizationprogrameligibilitycodingi<immunizationprogrameligibilitycodinglist.size();immunizationprogrameligibilitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationprogrameligibilitycoding = immunizationprogrameligibilitycodinglist.get(immunizationprogrameligibilitycodingi);

		/******************** Immnztn_PrgrmElgblty_Cdg_Dsply ********************************************************************************/
		if(immunizationprogrameligibilitycodingi == 0) {i.addImmnztnPrgrmElgbltyCdgDsply("[[");}
		if(immunizationprogrameligibilitycoding.hasDisplay()) {

			i.addImmnztnPrgrmElgbltyCdgDsply(String.valueOf(immunizationprogrameligibilitycoding.getDisplay()));
		} else {
			i.addImmnztnPrgrmElgbltyCdgDsply("NULL");
		}

		if(immunizationprogrameligibilitycodingi == immunizationprogrameligibilitycodinglist.size()-1) {i.addImmnztnPrgrmElgbltyCdgDsply("]]");}


		/******************** Immnztn_PrgrmElgblty_Cdg_Vrsn ********************************************************************************/
		if(immunizationprogrameligibilitycodingi == 0) {i.addImmnztnPrgrmElgbltyCdgVrsn("[[");}
		if(immunizationprogrameligibilitycoding.hasVersion()) {

			i.addImmnztnPrgrmElgbltyCdgVrsn(String.valueOf(immunizationprogrameligibilitycoding.getVersion()));
		} else {
			i.addImmnztnPrgrmElgbltyCdgVrsn("NULL");
		}

		if(immunizationprogrameligibilitycodingi == immunizationprogrameligibilitycodinglist.size()-1) {i.addImmnztnPrgrmElgbltyCdgVrsn("]]");}


		/******************** Immnztn_PrgrmElgblty_Cdg_Cd ********************************************************************************/
		if(immunizationprogrameligibilitycodingi == 0) {i.addImmnztnPrgrmElgbltyCdgCd("[[");}
		if(immunizationprogrameligibilitycoding.hasCode()) {

			i.addImmnztnPrgrmElgbltyCdgCd(String.valueOf(immunizationprogrameligibilitycoding.getCode()));
		} else {
			i.addImmnztnPrgrmElgbltyCdgCd("NULL");
		}

		if(immunizationprogrameligibilitycodingi == immunizationprogrameligibilitycodinglist.size()-1) {i.addImmnztnPrgrmElgbltyCdgCd("]]");}


		/******************** Immnztn_PrgrmElgblty_Cdg_UsrSltd ********************************************************************************/
		if(immunizationprogrameligibilitycodingi == 0) {i.addImmnztnPrgrmElgbltyCdgUsrSltd("[[");}
		if(immunizationprogrameligibilitycoding.hasUserSelected()) {

			i.addImmnztnPrgrmElgbltyCdgUsrSltd(String.valueOf(immunizationprogrameligibilitycoding.getUserSelected()));
		} else {
			i.addImmnztnPrgrmElgbltyCdgUsrSltd("NULL");
		}

		if(immunizationprogrameligibilitycodingi == immunizationprogrameligibilitycodinglist.size()-1) {i.addImmnztnPrgrmElgbltyCdgUsrSltd("]]");}


		/******************** Immnztn_PrgrmElgblty_Cdg_Sys ********************************************************************************/
		if(immunizationprogrameligibilitycodingi == 0) {i.addImmnztnPrgrmElgbltyCdgSys("[[");}
		if(immunizationprogrameligibilitycoding.hasSystem()) {

			i.addImmnztnPrgrmElgbltyCdgSys(String.valueOf(immunizationprogrameligibilitycoding.getSystem()));
		} else {
			i.addImmnztnPrgrmElgbltyCdgSys("NULL");
		}

		if(immunizationprogrameligibilitycodingi == immunizationprogrameligibilitycodinglist.size()-1) {i.addImmnztnPrgrmElgbltyCdgSys("]]");}


		 };
		 };
		/******************** Immnztn_Pnt ********************************************************************************/
		if(immunization.hasPatient()) {

			if(immunization.getPatient().getReference() != null) {
			i.addImmnztnPnt(immunization.getPatient().getReference());
			}
		} else {
			i.addImmnztnPnt("NULL");
		}


		/******************** Immnztn_ExpirationDt ********************************************************************************/
		if(immunization.hasExpirationDate()) {

			i.addImmnztnExpirationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunization.getExpirationDate())+"\"");
		} else {
			i.addImmnztnExpirationDt("NULL");
		}


		/******************** Immnztn_LotNmbr ********************************************************************************/
		if(immunization.hasLotNumber()) {

			i.addImmnztnLotNmbr(String.valueOf(immunization.getLotNumber()));
		} else {
			i.addImmnztnLotNmbr("NULL");
		}


		/******************** Immnztn_Manufacturer ********************************************************************************/
		if(immunization.hasManufacturer()) {

			if(immunization.getManufacturer().getReference() != null) {
			i.addImmnztnManufacturer(immunization.getManufacturer().getReference());
			}
		} else {
			i.addImmnztnManufacturer("NULL");
		}


		/******************** immunizationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationstatusreason = immunization.getStatusReason();

		/******************** Immnztn_StsRsn_Txt ********************************************************************************/
		if(immunizationstatusreason.hasText()) {

			i.addImmnztnStsRsnTxt(String.valueOf(immunizationstatusreason.getText()));
		} else {
			i.addImmnztnStsRsnTxt("NULL");
		}


		/******************** immunizationstatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationstatusreasoncodinglist = immunizationstatusreason.getCoding();
		for(int immunizationstatusreasoncodingi = 0; immunizationstatusreasoncodingi<immunizationstatusreasoncodinglist.size();immunizationstatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationstatusreasoncoding = immunizationstatusreasoncodinglist.get(immunizationstatusreasoncodingi);

		/******************** Immnztn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationstatusreasoncodingi == 0) {i.addImmnztnStsRsnCdgDsply("[");}
		if(immunizationstatusreasoncoding.hasDisplay()) {

			i.addImmnztnStsRsnCdgDsply(String.valueOf(immunizationstatusreasoncoding.getDisplay()));
		} else {
			i.addImmnztnStsRsnCdgDsply("NULL");
		}

		if(immunizationstatusreasoncodingi == immunizationstatusreasoncodinglist.size()-1) {i.addImmnztnStsRsnCdgDsply("]");}


		/******************** Immnztn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationstatusreasoncodingi == 0) {i.addImmnztnStsRsnCdgVrsn("[");}
		if(immunizationstatusreasoncoding.hasVersion()) {

			i.addImmnztnStsRsnCdgVrsn(String.valueOf(immunizationstatusreasoncoding.getVersion()));
		} else {
			i.addImmnztnStsRsnCdgVrsn("NULL");
		}

		if(immunizationstatusreasoncodingi == immunizationstatusreasoncodinglist.size()-1) {i.addImmnztnStsRsnCdgVrsn("]");}


		/******************** Immnztn_StsRsn_Cdg_Cd ********************************************************************************/
		if(immunizationstatusreasoncodingi == 0) {i.addImmnztnStsRsnCdgCd("[");}
		if(immunizationstatusreasoncoding.hasCode()) {

			i.addImmnztnStsRsnCdgCd(String.valueOf(immunizationstatusreasoncoding.getCode()));
		} else {
			i.addImmnztnStsRsnCdgCd("NULL");
		}

		if(immunizationstatusreasoncodingi == immunizationstatusreasoncodinglist.size()-1) {i.addImmnztnStsRsnCdgCd("]");}


		/******************** Immnztn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationstatusreasoncodingi == 0) {i.addImmnztnStsRsnCdgUsrSltd("[");}
		if(immunizationstatusreasoncoding.hasUserSelected()) {

			i.addImmnztnStsRsnCdgUsrSltd(String.valueOf(immunizationstatusreasoncoding.getUserSelected()));
		} else {
			i.addImmnztnStsRsnCdgUsrSltd("NULL");
		}

		if(immunizationstatusreasoncodingi == immunizationstatusreasoncodinglist.size()-1) {i.addImmnztnStsRsnCdgUsrSltd("]");}


		/******************** Immnztn_StsRsn_Cdg_Sys ********************************************************************************/
		if(immunizationstatusreasoncodingi == 0) {i.addImmnztnStsRsnCdgSys("[");}
		if(immunizationstatusreasoncoding.hasSystem()) {

			i.addImmnztnStsRsnCdgSys(String.valueOf(immunizationstatusreasoncoding.getSystem()));
		} else {
			i.addImmnztnStsRsnCdgSys("NULL");
		}

		if(immunizationstatusreasoncodingi == immunizationstatusreasoncodinglist.size()-1) {i.addImmnztnStsRsnCdgSys("]");}


		 };
		/******************** immunizationreportorigin ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationreportorigin = immunization.getReportOrigin();

		/******************** Immnztn_RptOrigin_Txt ********************************************************************************/
		if(immunizationreportorigin.hasText()) {

			i.addImmnztnRptOriginTxt(String.valueOf(immunizationreportorigin.getText()));
		} else {
			i.addImmnztnRptOriginTxt("NULL");
		}


		/******************** immunizationreportorigincoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationreportorigincodinglist = immunizationreportorigin.getCoding();
		for(int immunizationreportorigincodingi = 0; immunizationreportorigincodingi<immunizationreportorigincodinglist.size();immunizationreportorigincodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationreportorigincoding = immunizationreportorigincodinglist.get(immunizationreportorigincodingi);

		/******************** Immnztn_RptOrigin_Cdg_Dsply ********************************************************************************/
		if(immunizationreportorigincodingi == 0) {i.addImmnztnRptOriginCdgDsply("[");}
		if(immunizationreportorigincoding.hasDisplay()) {

			i.addImmnztnRptOriginCdgDsply(String.valueOf(immunizationreportorigincoding.getDisplay()));
		} else {
			i.addImmnztnRptOriginCdgDsply("NULL");
		}

		if(immunizationreportorigincodingi == immunizationreportorigincodinglist.size()-1) {i.addImmnztnRptOriginCdgDsply("]");}


		/******************** Immnztn_RptOrigin_Cdg_Vrsn ********************************************************************************/
		if(immunizationreportorigincodingi == 0) {i.addImmnztnRptOriginCdgVrsn("[");}
		if(immunizationreportorigincoding.hasVersion()) {

			i.addImmnztnRptOriginCdgVrsn(String.valueOf(immunizationreportorigincoding.getVersion()));
		} else {
			i.addImmnztnRptOriginCdgVrsn("NULL");
		}

		if(immunizationreportorigincodingi == immunizationreportorigincodinglist.size()-1) {i.addImmnztnRptOriginCdgVrsn("]");}


		/******************** Immnztn_RptOrigin_Cdg_Cd ********************************************************************************/
		if(immunizationreportorigincodingi == 0) {i.addImmnztnRptOriginCdgCd("[");}
		if(immunizationreportorigincoding.hasCode()) {

			i.addImmnztnRptOriginCdgCd(String.valueOf(immunizationreportorigincoding.getCode()));
		} else {
			i.addImmnztnRptOriginCdgCd("NULL");
		}

		if(immunizationreportorigincodingi == immunizationreportorigincodinglist.size()-1) {i.addImmnztnRptOriginCdgCd("]");}


		/******************** Immnztn_RptOrigin_Cdg_UsrSltd ********************************************************************************/
		if(immunizationreportorigincodingi == 0) {i.addImmnztnRptOriginCdgUsrSltd("[");}
		if(immunizationreportorigincoding.hasUserSelected()) {

			i.addImmnztnRptOriginCdgUsrSltd(String.valueOf(immunizationreportorigincoding.getUserSelected()));
		} else {
			i.addImmnztnRptOriginCdgUsrSltd("NULL");
		}

		if(immunizationreportorigincodingi == immunizationreportorigincodinglist.size()-1) {i.addImmnztnRptOriginCdgUsrSltd("]");}


		/******************** Immnztn_RptOrigin_Cdg_Sys ********************************************************************************/
		if(immunizationreportorigincodingi == 0) {i.addImmnztnRptOriginCdgSys("[");}
		if(immunizationreportorigincoding.hasSystem()) {

			i.addImmnztnRptOriginCdgSys(String.valueOf(immunizationreportorigincoding.getSystem()));
		} else {
			i.addImmnztnRptOriginCdgSys("NULL");
		}

		if(immunizationreportorigincodingi == immunizationreportorigincodinglist.size()-1) {i.addImmnztnRptOriginCdgSys("]");}


		 };
		/******************** immunizationroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationroute = immunization.getRoute();

		/******************** Immnztn_Route_Txt ********************************************************************************/
		if(immunizationroute.hasText()) {

			i.addImmnztnRouteTxt(String.valueOf(immunizationroute.getText()));
		} else {
			i.addImmnztnRouteTxt("NULL");
		}


		/******************** immunizationroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationroutecodinglist = immunizationroute.getCoding();
		for(int immunizationroutecodingi = 0; immunizationroutecodingi<immunizationroutecodinglist.size();immunizationroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationroutecoding = immunizationroutecodinglist.get(immunizationroutecodingi);

		/******************** Immnztn_Route_Cdg_Dsply ********************************************************************************/
		if(immunizationroutecodingi == 0) {i.addImmnztnRouteCdgDsply("[");}
		if(immunizationroutecoding.hasDisplay()) {

			i.addImmnztnRouteCdgDsply(String.valueOf(immunizationroutecoding.getDisplay()));
		} else {
			i.addImmnztnRouteCdgDsply("NULL");
		}

		if(immunizationroutecodingi == immunizationroutecodinglist.size()-1) {i.addImmnztnRouteCdgDsply("]");}


		/******************** Immnztn_Route_Cdg_Vrsn ********************************************************************************/
		if(immunizationroutecodingi == 0) {i.addImmnztnRouteCdgVrsn("[");}
		if(immunizationroutecoding.hasVersion()) {

			i.addImmnztnRouteCdgVrsn(String.valueOf(immunizationroutecoding.getVersion()));
		} else {
			i.addImmnztnRouteCdgVrsn("NULL");
		}

		if(immunizationroutecodingi == immunizationroutecodinglist.size()-1) {i.addImmnztnRouteCdgVrsn("]");}


		/******************** Immnztn_Route_Cdg_Cd ********************************************************************************/
		if(immunizationroutecodingi == 0) {i.addImmnztnRouteCdgCd("[");}
		if(immunizationroutecoding.hasCode()) {

			i.addImmnztnRouteCdgCd(String.valueOf(immunizationroutecoding.getCode()));
		} else {
			i.addImmnztnRouteCdgCd("NULL");
		}

		if(immunizationroutecodingi == immunizationroutecodinglist.size()-1) {i.addImmnztnRouteCdgCd("]");}


		/******************** Immnztn_Route_Cdg_UsrSltd ********************************************************************************/
		if(immunizationroutecodingi == 0) {i.addImmnztnRouteCdgUsrSltd("[");}
		if(immunizationroutecoding.hasUserSelected()) {

			i.addImmnztnRouteCdgUsrSltd(String.valueOf(immunizationroutecoding.getUserSelected()));
		} else {
			i.addImmnztnRouteCdgUsrSltd("NULL");
		}

		if(immunizationroutecodingi == immunizationroutecodinglist.size()-1) {i.addImmnztnRouteCdgUsrSltd("]");}


		/******************** Immnztn_Route_Cdg_Sys ********************************************************************************/
		if(immunizationroutecodingi == 0) {i.addImmnztnRouteCdgSys("[");}
		if(immunizationroutecoding.hasSystem()) {

			i.addImmnztnRouteCdgSys(String.valueOf(immunizationroutecoding.getSystem()));
		} else {
			i.addImmnztnRouteCdgSys("NULL");
		}

		if(immunizationroutecodingi == immunizationroutecodinglist.size()-1) {i.addImmnztnRouteCdgSys("]");}


		 };
		/******************** Immnztn_PrimarySrc ********************************************************************************/
		if(immunization.hasPrimarySource()) {

			i.addImmnztnPrimarySrc(String.valueOf(immunization.getPrimarySource()));
		} else {
			i.addImmnztnPrimarySrc("NULL");
		}


		/******************** immunizationvaccinecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationvaccinecode = immunization.getVaccineCode();

		/******************** Immnztn_VaccineCd_Txt ********************************************************************************/
		if(immunizationvaccinecode.hasText()) {

			i.addImmnztnVaccineCdTxt(String.valueOf(immunizationvaccinecode.getText()));
		} else {
			i.addImmnztnVaccineCdTxt("NULL");
		}


		/******************** immunizationvaccinecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationvaccinecodecodinglist = immunizationvaccinecode.getCoding();
		for(int immunizationvaccinecodecodingi = 0; immunizationvaccinecodecodingi<immunizationvaccinecodecodinglist.size();immunizationvaccinecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationvaccinecodecoding = immunizationvaccinecodecodinglist.get(immunizationvaccinecodecodingi);

		/******************** Immnztn_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(immunizationvaccinecodecodingi == 0) {i.addImmnztnVaccineCdCdgDsply("[");}
		if(immunizationvaccinecodecoding.hasDisplay()) {

			i.addImmnztnVaccineCdCdgDsply(String.valueOf(immunizationvaccinecodecoding.getDisplay()));
		} else {
			i.addImmnztnVaccineCdCdgDsply("NULL");
		}

		if(immunizationvaccinecodecodingi == immunizationvaccinecodecodinglist.size()-1) {i.addImmnztnVaccineCdCdgDsply("]");}


		/******************** Immnztn_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(immunizationvaccinecodecodingi == 0) {i.addImmnztnVaccineCdCdgVrsn("[");}
		if(immunizationvaccinecodecoding.hasVersion()) {

			i.addImmnztnVaccineCdCdgVrsn(String.valueOf(immunizationvaccinecodecoding.getVersion()));
		} else {
			i.addImmnztnVaccineCdCdgVrsn("NULL");
		}

		if(immunizationvaccinecodecodingi == immunizationvaccinecodecodinglist.size()-1) {i.addImmnztnVaccineCdCdgVrsn("]");}


		/******************** Immnztn_VaccineCd_Cdg_Cd ********************************************************************************/
		if(immunizationvaccinecodecodingi == 0) {i.addImmnztnVaccineCdCdgCd("[");}
		if(immunizationvaccinecodecoding.hasCode()) {

			i.addImmnztnVaccineCdCdgCd(String.valueOf(immunizationvaccinecodecoding.getCode()));
		} else {
			i.addImmnztnVaccineCdCdgCd("NULL");
		}

		if(immunizationvaccinecodecodingi == immunizationvaccinecodecodinglist.size()-1) {i.addImmnztnVaccineCdCdgCd("]");}


		/******************** Immnztn_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(immunizationvaccinecodecodingi == 0) {i.addImmnztnVaccineCdCdgUsrSltd("[");}
		if(immunizationvaccinecodecoding.hasUserSelected()) {

			i.addImmnztnVaccineCdCdgUsrSltd(String.valueOf(immunizationvaccinecodecoding.getUserSelected()));
		} else {
			i.addImmnztnVaccineCdCdgUsrSltd("NULL");
		}

		if(immunizationvaccinecodecodingi == immunizationvaccinecodecodinglist.size()-1) {i.addImmnztnVaccineCdCdgUsrSltd("]");}


		/******************** Immnztn_VaccineCd_Cdg_Sys ********************************************************************************/
		if(immunizationvaccinecodecodingi == 0) {i.addImmnztnVaccineCdCdgSys("[");}
		if(immunizationvaccinecodecoding.hasSystem()) {

			i.addImmnztnVaccineCdCdgSys(String.valueOf(immunizationvaccinecodecoding.getSystem()));
		} else {
			i.addImmnztnVaccineCdCdgSys("NULL");
		}

		if(immunizationvaccinecodecodingi == immunizationvaccinecodecodinglist.size()-1) {i.addImmnztnVaccineCdCdgSys("]");}


		 };
		/******************** immunizationeducation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent> immunizationeducationlist = immunization.getEducation();
		for(int immunizationeducationi = 0; immunizationeducationi<immunizationeducationlist.size();immunizationeducationi++ ) {
		org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent  immunizationeducation = immunizationeducationlist.get(immunizationeducationi);

		/******************** Immnztn_Education_Rfrnc ********************************************************************************/
		if(immunizationeducationi == 0) {i.addImmnztnEducationRfrnc("[");}
		if(immunizationeducation.hasReference()) {

			i.addImmnztnEducationRfrnc(String.valueOf(immunizationeducation.getReference()));
		} else {
			i.addImmnztnEducationRfrnc("NULL");
		}

		if(immunizationeducationi == immunizationeducationlist.size()-1) {i.addImmnztnEducationRfrnc("]");}


		/******************** Immnztn_Education_PrsnttnDt ********************************************************************************/
		if(immunizationeducationi == 0) {i.addImmnztnEducationPrsnttnDt("[");}
		if(immunizationeducation.hasPresentationDate()) {

			i.addImmnztnEducationPrsnttnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationeducation.getPresentationDate())+"\"");
		} else {
			i.addImmnztnEducationPrsnttnDt("NULL");
		}

		if(immunizationeducationi == immunizationeducationlist.size()-1) {i.addImmnztnEducationPrsnttnDt("]");}


		/******************** Immnztn_Education_DocTyp ********************************************************************************/
		if(immunizationeducationi == 0) {i.addImmnztnEducationDocTyp("[");}
		if(immunizationeducation.hasDocumentType()) {

			i.addImmnztnEducationDocTyp(String.valueOf(immunizationeducation.getDocumentType()));
		} else {
			i.addImmnztnEducationDocTyp("NULL");
		}

		if(immunizationeducationi == immunizationeducationlist.size()-1) {i.addImmnztnEducationDocTyp("]");}


		/******************** Immnztn_Education_PublicationDt ********************************************************************************/
		if(immunizationeducationi == 0) {i.addImmnztnEducationPublicationDt("[");}
		if(immunizationeducation.hasPublicationDate()) {

			i.addImmnztnEducationPublicationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(immunizationeducation.getPublicationDate())+"\"");
		} else {
			i.addImmnztnEducationPublicationDt("NULL");
		}

		if(immunizationeducationi == immunizationeducationlist.size()-1) {i.addImmnztnEducationPublicationDt("]");}


		 };
		/******************** immunizationfundingsource ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept immunizationfundingsource = immunization.getFundingSource();

		/******************** Immnztn_FundingSrc_Txt ********************************************************************************/
		if(immunizationfundingsource.hasText()) {

			i.addImmnztnFundingSrcTxt(String.valueOf(immunizationfundingsource.getText()));
		} else {
			i.addImmnztnFundingSrcTxt("NULL");
		}


		/******************** immunizationfundingsourcecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationfundingsourcecodinglist = immunizationfundingsource.getCoding();
		for(int immunizationfundingsourcecodingi = 0; immunizationfundingsourcecodingi<immunizationfundingsourcecodinglist.size();immunizationfundingsourcecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationfundingsourcecoding = immunizationfundingsourcecodinglist.get(immunizationfundingsourcecodingi);

		/******************** Immnztn_FundingSrc_Cdg_Dsply ********************************************************************************/
		if(immunizationfundingsourcecodingi == 0) {i.addImmnztnFundingSrcCdgDsply("[");}
		if(immunizationfundingsourcecoding.hasDisplay()) {

			i.addImmnztnFundingSrcCdgDsply(String.valueOf(immunizationfundingsourcecoding.getDisplay()));
		} else {
			i.addImmnztnFundingSrcCdgDsply("NULL");
		}

		if(immunizationfundingsourcecodingi == immunizationfundingsourcecodinglist.size()-1) {i.addImmnztnFundingSrcCdgDsply("]");}


		/******************** Immnztn_FundingSrc_Cdg_Vrsn ********************************************************************************/
		if(immunizationfundingsourcecodingi == 0) {i.addImmnztnFundingSrcCdgVrsn("[");}
		if(immunizationfundingsourcecoding.hasVersion()) {

			i.addImmnztnFundingSrcCdgVrsn(String.valueOf(immunizationfundingsourcecoding.getVersion()));
		} else {
			i.addImmnztnFundingSrcCdgVrsn("NULL");
		}

		if(immunizationfundingsourcecodingi == immunizationfundingsourcecodinglist.size()-1) {i.addImmnztnFundingSrcCdgVrsn("]");}


		/******************** Immnztn_FundingSrc_Cdg_Cd ********************************************************************************/
		if(immunizationfundingsourcecodingi == 0) {i.addImmnztnFundingSrcCdgCd("[");}
		if(immunizationfundingsourcecoding.hasCode()) {

			i.addImmnztnFundingSrcCdgCd(String.valueOf(immunizationfundingsourcecoding.getCode()));
		} else {
			i.addImmnztnFundingSrcCdgCd("NULL");
		}

		if(immunizationfundingsourcecodingi == immunizationfundingsourcecodinglist.size()-1) {i.addImmnztnFundingSrcCdgCd("]");}


		/******************** Immnztn_FundingSrc_Cdg_UsrSltd ********************************************************************************/
		if(immunizationfundingsourcecodingi == 0) {i.addImmnztnFundingSrcCdgUsrSltd("[");}
		if(immunizationfundingsourcecoding.hasUserSelected()) {

			i.addImmnztnFundingSrcCdgUsrSltd(String.valueOf(immunizationfundingsourcecoding.getUserSelected()));
		} else {
			i.addImmnztnFundingSrcCdgUsrSltd("NULL");
		}

		if(immunizationfundingsourcecodingi == immunizationfundingsourcecodinglist.size()-1) {i.addImmnztnFundingSrcCdgUsrSltd("]");}


		/******************** Immnztn_FundingSrc_Cdg_Sys ********************************************************************************/
		if(immunizationfundingsourcecodingi == 0) {i.addImmnztnFundingSrcCdgSys("[");}
		if(immunizationfundingsourcecoding.hasSystem()) {

			i.addImmnztnFundingSrcCdgSys(String.valueOf(immunizationfundingsourcecoding.getSystem()));
		} else {
			i.addImmnztnFundingSrcCdgSys("NULL");
		}

		if(immunizationfundingsourcecodingi == immunizationfundingsourcecodinglist.size()-1) {i.addImmnztnFundingSrcCdgSys("]");}


		 };
		/******************** Immnztn_IsSubpotent ********************************************************************************/
		if(immunization.hasIsSubpotent()) {

			i.addImmnztnIsSubpotent(String.valueOf(immunization.getIsSubpotent()));
		} else {
			i.addImmnztnIsSubpotent("NULL");
		}


		/******************** immunizationdosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity immunizationdosequantity = immunization.getDoseQuantity();

		/******************** Immnztn_DoseQnty_Vl ********************************************************************************/
		if(immunizationdosequantity.hasValue()) {

			i.addImmnztnDoseQntyVl(String.valueOf(immunizationdosequantity.getValue()));
		} else {
			i.addImmnztnDoseQntyVl("NULL");
		}


		/******************** immunizationdosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator immunizationdosequantitycomparator = immunizationdosequantity.getComparator();
		if(immunizationdosequantitycomparator!=null) {
			i.addImmnztnDoseQntyCmprtr(immunizationdosequantitycomparator.toCode());
		} else {
			i.addImmnztnDoseQntyCmprtr("NULL");
		}

		/******************** Immnztn_DoseQnty_Cd ********************************************************************************/
		if(immunizationdosequantity.hasCode()) {

			i.addImmnztnDoseQntyCd(String.valueOf(immunizationdosequantity.getCode()));
		} else {
			i.addImmnztnDoseQntyCd("NULL");
		}


		/******************** Immnztn_DoseQnty_Unt ********************************************************************************/
		if(immunizationdosequantity.hasUnit()) {

			i.addImmnztnDoseQntyUnt(String.valueOf(immunizationdosequantity.getUnit()));
		} else {
			i.addImmnztnDoseQntyUnt("NULL");
		}


		/******************** Immnztn_DoseQnty_Sys ********************************************************************************/
		if(immunizationdosequantity.hasSystem()) {

			i.addImmnztnDoseQntySys(String.valueOf(immunizationdosequantity.getSystem()));
		} else {
			i.addImmnztnDoseQntySys("NULL");
		}


		/******************** immunizationsubpotentreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationsubpotentreasonlist = immunization.getSubpotentReason();
		for(int immunizationsubpotentreasoni = 0; immunizationsubpotentreasoni<immunizationsubpotentreasonlist.size();immunizationsubpotentreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationsubpotentreason = immunizationsubpotentreasonlist.get(immunizationsubpotentreasoni);

		/******************** Immnztn_SubpotentRsn_Txt ********************************************************************************/
		if(immunizationsubpotentreasoni == 0) {i.addImmnztnSubpotentRsnTxt("[");}
		if(immunizationsubpotentreason.hasText()) {

			i.addImmnztnSubpotentRsnTxt(String.valueOf(immunizationsubpotentreason.getText()));
		} else {
			i.addImmnztnSubpotentRsnTxt("NULL");
		}

		if(immunizationsubpotentreasoni == immunizationsubpotentreasonlist.size()-1) {i.addImmnztnSubpotentRsnTxt("]");}


		/******************** immunizationsubpotentreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationsubpotentreasoncodinglist = immunizationsubpotentreason.getCoding();
		for(int immunizationsubpotentreasoncodingi = 0; immunizationsubpotentreasoncodingi<immunizationsubpotentreasoncodinglist.size();immunizationsubpotentreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationsubpotentreasoncoding = immunizationsubpotentreasoncodinglist.get(immunizationsubpotentreasoncodingi);

		/******************** Immnztn_SubpotentRsn_Cdg_Dsply ********************************************************************************/
		if(immunizationsubpotentreasoncodingi == 0) {i.addImmnztnSubpotentRsnCdgDsply("[[");}
		if(immunizationsubpotentreasoncoding.hasDisplay()) {

			i.addImmnztnSubpotentRsnCdgDsply(String.valueOf(immunizationsubpotentreasoncoding.getDisplay()));
		} else {
			i.addImmnztnSubpotentRsnCdgDsply("NULL");
		}

		if(immunizationsubpotentreasoncodingi == immunizationsubpotentreasoncodinglist.size()-1) {i.addImmnztnSubpotentRsnCdgDsply("]]");}


		/******************** Immnztn_SubpotentRsn_Cdg_Vrsn ********************************************************************************/
		if(immunizationsubpotentreasoncodingi == 0) {i.addImmnztnSubpotentRsnCdgVrsn("[[");}
		if(immunizationsubpotentreasoncoding.hasVersion()) {

			i.addImmnztnSubpotentRsnCdgVrsn(String.valueOf(immunizationsubpotentreasoncoding.getVersion()));
		} else {
			i.addImmnztnSubpotentRsnCdgVrsn("NULL");
		}

		if(immunizationsubpotentreasoncodingi == immunizationsubpotentreasoncodinglist.size()-1) {i.addImmnztnSubpotentRsnCdgVrsn("]]");}


		/******************** Immnztn_SubpotentRsn_Cdg_Cd ********************************************************************************/
		if(immunizationsubpotentreasoncodingi == 0) {i.addImmnztnSubpotentRsnCdgCd("[[");}
		if(immunizationsubpotentreasoncoding.hasCode()) {

			i.addImmnztnSubpotentRsnCdgCd(String.valueOf(immunizationsubpotentreasoncoding.getCode()));
		} else {
			i.addImmnztnSubpotentRsnCdgCd("NULL");
		}

		if(immunizationsubpotentreasoncodingi == immunizationsubpotentreasoncodinglist.size()-1) {i.addImmnztnSubpotentRsnCdgCd("]]");}


		/******************** Immnztn_SubpotentRsn_Cdg_UsrSltd ********************************************************************************/
		if(immunizationsubpotentreasoncodingi == 0) {i.addImmnztnSubpotentRsnCdgUsrSltd("[[");}
		if(immunizationsubpotentreasoncoding.hasUserSelected()) {

			i.addImmnztnSubpotentRsnCdgUsrSltd(String.valueOf(immunizationsubpotentreasoncoding.getUserSelected()));
		} else {
			i.addImmnztnSubpotentRsnCdgUsrSltd("NULL");
		}

		if(immunizationsubpotentreasoncodingi == immunizationsubpotentreasoncodinglist.size()-1) {i.addImmnztnSubpotentRsnCdgUsrSltd("]]");}


		/******************** Immnztn_SubpotentRsn_Cdg_Sys ********************************************************************************/
		if(immunizationsubpotentreasoncodingi == 0) {i.addImmnztnSubpotentRsnCdgSys("[[");}
		if(immunizationsubpotentreasoncoding.hasSystem()) {

			i.addImmnztnSubpotentRsnCdgSys(String.valueOf(immunizationsubpotentreasoncoding.getSystem()));
		} else {
			i.addImmnztnSubpotentRsnCdgSys("NULL");
		}

		if(immunizationsubpotentreasoncodingi == immunizationsubpotentreasoncodinglist.size()-1) {i.addImmnztnSubpotentRsnCdgSys("]]");}


		 };
		 };
		/******************** immunizationprotocolapplied ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent> immunizationprotocolappliedlist = immunization.getProtocolApplied();
		for(int immunizationprotocolappliedi = 0; immunizationprotocolappliedi<immunizationprotocolappliedlist.size();immunizationprotocolappliedi++ ) {
		org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent  immunizationprotocolapplied = immunizationprotocolappliedlist.get(immunizationprotocolappliedi);

		/******************** Immnztn_ProtocolApplied_Athrity ********************************************************************************/
		if(immunizationprotocolappliedi == 0) {i.addImmnztnProtocolAppliedAthrity("[");}
		if(immunizationprotocolapplied.hasAuthority()) {

			if(immunizationprotocolapplied.getAuthority().getReference() != null) {
			i.addImmnztnProtocolAppliedAthrity(immunizationprotocolapplied.getAuthority().getReference());
			}
		} else {
			i.addImmnztnProtocolAppliedAthrity("NULL");
		}

		if(immunizationprotocolappliedi == immunizationprotocolappliedlist.size()-1) {i.addImmnztnProtocolAppliedAthrity("]");}


		/******************** Immnztn_ProtocolApplied_Series ********************************************************************************/
		if(immunizationprotocolappliedi == 0) {i.addImmnztnProtocolAppliedSeries("[");}
		if(immunizationprotocolapplied.hasSeries()) {

			i.addImmnztnProtocolAppliedSeries(String.valueOf(immunizationprotocolapplied.getSeries()));
		} else {
			i.addImmnztnProtocolAppliedSeries("NULL");
		}

		if(immunizationprotocolappliedi == immunizationprotocolappliedlist.size()-1) {i.addImmnztnProtocolAppliedSeries("]");}


		/******************** immunizationprotocolappliedtargetdisease ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> immunizationprotocolappliedtargetdiseaselist = immunizationprotocolapplied.getTargetDisease();
		for(int immunizationprotocolappliedtargetdiseasei = 0; immunizationprotocolappliedtargetdiseasei<immunizationprotocolappliedtargetdiseaselist.size();immunizationprotocolappliedtargetdiseasei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  immunizationprotocolappliedtargetdisease = immunizationprotocolappliedtargetdiseaselist.get(immunizationprotocolappliedtargetdiseasei);

		/******************** Immnztn_ProtocolApplied_TarDisease_Txt ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasei == 0) {i.addImmnztnProtocolAppliedTarDiseaseTxt("[[");}
		if(immunizationprotocolappliedtargetdisease.hasText()) {

			i.addImmnztnProtocolAppliedTarDiseaseTxt(String.valueOf(immunizationprotocolappliedtargetdisease.getText()));
		} else {
			i.addImmnztnProtocolAppliedTarDiseaseTxt("NULL");
		}

		if(immunizationprotocolappliedtargetdiseasei == immunizationprotocolappliedtargetdiseaselist.size()-1) {i.addImmnztnProtocolAppliedTarDiseaseTxt("]]");}


		/******************** immunizationprotocolappliedtargetdiseasecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> immunizationprotocolappliedtargetdiseasecodinglist = immunizationprotocolappliedtargetdisease.getCoding();
		for(int immunizationprotocolappliedtargetdiseasecodingi = 0; immunizationprotocolappliedtargetdiseasecodingi<immunizationprotocolappliedtargetdiseasecodinglist.size();immunizationprotocolappliedtargetdiseasecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  immunizationprotocolappliedtargetdiseasecoding = immunizationprotocolappliedtargetdiseasecodinglist.get(immunizationprotocolappliedtargetdiseasecodingi);

		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Dsply ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecodingi == 0) {i.addImmnztnProtocolAppliedTarDiseaseCdgDsply("[[[");}
		if(immunizationprotocolappliedtargetdiseasecoding.hasDisplay()) {

			i.addImmnztnProtocolAppliedTarDiseaseCdgDsply(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getDisplay()));
		} else {
			i.addImmnztnProtocolAppliedTarDiseaseCdgDsply("NULL");
		}

		if(immunizationprotocolappliedtargetdiseasecodingi == immunizationprotocolappliedtargetdiseasecodinglist.size()-1) {i.addImmnztnProtocolAppliedTarDiseaseCdgDsply("]]]");}


		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecodingi == 0) {i.addImmnztnProtocolAppliedTarDiseaseCdgVrsn("[[[");}
		if(immunizationprotocolappliedtargetdiseasecoding.hasVersion()) {

			i.addImmnztnProtocolAppliedTarDiseaseCdgVrsn(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getVersion()));
		} else {
			i.addImmnztnProtocolAppliedTarDiseaseCdgVrsn("NULL");
		}

		if(immunizationprotocolappliedtargetdiseasecodingi == immunizationprotocolappliedtargetdiseasecodinglist.size()-1) {i.addImmnztnProtocolAppliedTarDiseaseCdgVrsn("]]]");}


		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Cd ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecodingi == 0) {i.addImmnztnProtocolAppliedTarDiseaseCdgCd("[[[");}
		if(immunizationprotocolappliedtargetdiseasecoding.hasCode()) {

			i.addImmnztnProtocolAppliedTarDiseaseCdgCd(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getCode()));
		} else {
			i.addImmnztnProtocolAppliedTarDiseaseCdgCd("NULL");
		}

		if(immunizationprotocolappliedtargetdiseasecodingi == immunizationprotocolappliedtargetdiseasecodinglist.size()-1) {i.addImmnztnProtocolAppliedTarDiseaseCdgCd("]]]");}


		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecodingi == 0) {i.addImmnztnProtocolAppliedTarDiseaseCdgUsrSltd("[[[");}
		if(immunizationprotocolappliedtargetdiseasecoding.hasUserSelected()) {

			i.addImmnztnProtocolAppliedTarDiseaseCdgUsrSltd(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getUserSelected()));
		} else {
			i.addImmnztnProtocolAppliedTarDiseaseCdgUsrSltd("NULL");
		}

		if(immunizationprotocolappliedtargetdiseasecodingi == immunizationprotocolappliedtargetdiseasecodinglist.size()-1) {i.addImmnztnProtocolAppliedTarDiseaseCdgUsrSltd("]]]");}


		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Sys ********************************************************************************/
		if(immunizationprotocolappliedtargetdiseasecodingi == 0) {i.addImmnztnProtocolAppliedTarDiseaseCdgSys("[[[");}
		if(immunizationprotocolappliedtargetdiseasecoding.hasSystem()) {

			i.addImmnztnProtocolAppliedTarDiseaseCdgSys(String.valueOf(immunizationprotocolappliedtargetdiseasecoding.getSystem()));
		} else {
			i.addImmnztnProtocolAppliedTarDiseaseCdgSys("NULL");
		}

		if(immunizationprotocolappliedtargetdiseasecodingi == immunizationprotocolappliedtargetdiseasecodinglist.size()-1) {i.addImmnztnProtocolAppliedTarDiseaseCdgSys("]]]");}


		 };
		 };
		/******************** Immnztn_ProtocolApplied_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasDoseNumberPositiveIntType()) {

			i.addImmnztnProtocolAppliedDoseNmbrPositiveIntTyp("\""+immunizationprotocolapplied.getDoseNumberPositiveIntType().getValueAsString()+"\"");
		} else {
			i.addImmnztnProtocolAppliedDoseNmbrPositiveIntTyp("NULL");
		}


		/******************** Immnztn_ProtocolApplied_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasSeriesDosesPositiveIntType()) {

			i.addImmnztnProtocolAppliedSeriesDosesPositiveIntTyp("\""+immunizationprotocolapplied.getSeriesDosesPositiveIntType().getValueAsString()+"\"");
		} else {
			i.addImmnztnProtocolAppliedSeriesDosesPositiveIntTyp("NULL");
		}


		/******************** Immnztn_ProtocolApplied_DoseNmbrStrgTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasDoseNumberStringType()) {

			i.addImmnztnProtocolAppliedDoseNmbrStrgTyp("\""+immunizationprotocolapplied.getDoseNumberStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnProtocolAppliedDoseNmbrStrgTyp("NULL");
		}


		/******************** Immnztn_ProtocolApplied_SeriesDosesStrgTyp ********************************************************************************/
		if(immunizationprotocolapplied.hasSeriesDosesStringType()) {

			i.addImmnztnProtocolAppliedSeriesDosesStrgTyp("\""+immunizationprotocolapplied.getSeriesDosesStringType().getValueAsString()+"\"");
		} else {
			i.addImmnztnProtocolAppliedSeriesDosesStrgTyp("NULL");
		}


		 };
		return i;
	}
}
