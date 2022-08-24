package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.GuidanceResponse;
public class GuidanceResponseBidirectionalConversion 
{
	public GuidanceResponse GuidanceResponses(org.hl7.fhir.r4.model.GuidanceResponse guidanceresponse) throws ParseException
	{
		 main.java.com.campfhir.model.GuidanceResponse g = new  main.java.com.campfhir.model.GuidanceResponse();

		/******************** id ********************************************************************************/
		g.setId(guidanceresponse.getIdElement().getIdPart());

		/******************** GuidnceRsps_Rslt ********************************************************************************/
		if(guidanceresponse.hasResult()) {

			if(guidanceresponse.getResult().getReference() != null) {
			g.addGuidnceRspsRslt(guidanceresponse.getResult().getReference());
			}
		} else {
			g.addGuidnceRspsRslt("NULL");
		}


		/******************** GuidnceRsps_Sbjct ********************************************************************************/
		if(guidanceresponse.hasSubject()) {

			if(guidanceresponse.getSubject().getReference() != null) {
			g.addGuidnceRspsSbjct(guidanceresponse.getSubject().getReference());
			}
		} else {
			g.addGuidnceRspsSbjct("NULL");
		}


		/******************** guidanceresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.GuidanceResponse.GuidanceResponseStatus guidanceresponsestatus = guidanceresponse.getStatus();
		if(guidanceresponsestatus!=null) {
			g.addGuidnceRspsSts(guidanceresponsestatus.toCode());
		} else {
			g.addGuidnceRspsSts("NULL");
		}

		/******************** GuidnceRsps_Enc ********************************************************************************/
		if(guidanceresponse.hasEncounter()) {

			if(guidanceresponse.getEncounter().getReference() != null) {
			g.addGuidnceRspsEnc(guidanceresponse.getEncounter().getReference());
			}
		} else {
			g.addGuidnceRspsEnc("NULL");
		}


		/******************** guidanceresponsereasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> guidanceresponsereasoncodelist = guidanceresponse.getReasonCode();
		for(int guidanceresponsereasoncodei = 0; guidanceresponsereasoncodei<guidanceresponsereasoncodelist.size();guidanceresponsereasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  guidanceresponsereasoncode = guidanceresponsereasoncodelist.get(guidanceresponsereasoncodei);

		/******************** GuidnceRsps_RsnCd_Txt ********************************************************************************/
		if(guidanceresponsereasoncodei == 0) {g.addGuidnceRspsRsnCdTxt("[");}
		if(guidanceresponsereasoncode.hasText()) {

			g.addGuidnceRspsRsnCdTxt(String.valueOf(guidanceresponsereasoncode.getText()));
		} else {
			g.addGuidnceRspsRsnCdTxt("NULL");
		}

		if(guidanceresponsereasoncodei == guidanceresponsereasoncodelist.size()-1) {g.addGuidnceRspsRsnCdTxt("]");}


		/******************** guidanceresponsereasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> guidanceresponsereasoncodecodinglist = guidanceresponsereasoncode.getCoding();
		for(int guidanceresponsereasoncodecodingi = 0; guidanceresponsereasoncodecodingi<guidanceresponsereasoncodecodinglist.size();guidanceresponsereasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  guidanceresponsereasoncodecoding = guidanceresponsereasoncodecodinglist.get(guidanceresponsereasoncodecodingi);

		/******************** GuidnceRsps_RsnCd_Cdg_Dsply ********************************************************************************/
		if(guidanceresponsereasoncodecodingi == 0) {g.addGuidnceRspsRsnCdCdgDsply("[[");}
		if(guidanceresponsereasoncodecoding.hasDisplay()) {

			g.addGuidnceRspsRsnCdCdgDsply(String.valueOf(guidanceresponsereasoncodecoding.getDisplay()));
		} else {
			g.addGuidnceRspsRsnCdCdgDsply("NULL");
		}

		if(guidanceresponsereasoncodecodingi == guidanceresponsereasoncodecodinglist.size()-1) {g.addGuidnceRspsRsnCdCdgDsply("]]");}


		/******************** GuidnceRsps_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponsereasoncodecodingi == 0) {g.addGuidnceRspsRsnCdCdgVrsn("[[");}
		if(guidanceresponsereasoncodecoding.hasVersion()) {

			g.addGuidnceRspsRsnCdCdgVrsn(String.valueOf(guidanceresponsereasoncodecoding.getVersion()));
		} else {
			g.addGuidnceRspsRsnCdCdgVrsn("NULL");
		}

		if(guidanceresponsereasoncodecodingi == guidanceresponsereasoncodecodinglist.size()-1) {g.addGuidnceRspsRsnCdCdgVrsn("]]");}


		/******************** GuidnceRsps_RsnCd_Cdg_Cd ********************************************************************************/
		if(guidanceresponsereasoncodecodingi == 0) {g.addGuidnceRspsRsnCdCdgCd("[[");}
		if(guidanceresponsereasoncodecoding.hasCode()) {

			g.addGuidnceRspsRsnCdCdgCd(String.valueOf(guidanceresponsereasoncodecoding.getCode()));
		} else {
			g.addGuidnceRspsRsnCdCdgCd("NULL");
		}

		if(guidanceresponsereasoncodecodingi == guidanceresponsereasoncodecodinglist.size()-1) {g.addGuidnceRspsRsnCdCdgCd("]]");}


		/******************** GuidnceRsps_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponsereasoncodecodingi == 0) {g.addGuidnceRspsRsnCdCdgUsrSltd("[[");}
		if(guidanceresponsereasoncodecoding.hasUserSelected()) {

			g.addGuidnceRspsRsnCdCdgUsrSltd(String.valueOf(guidanceresponsereasoncodecoding.getUserSelected()));
		} else {
			g.addGuidnceRspsRsnCdCdgUsrSltd("NULL");
		}

		if(guidanceresponsereasoncodecodingi == guidanceresponsereasoncodecodinglist.size()-1) {g.addGuidnceRspsRsnCdCdgUsrSltd("]]");}


		/******************** GuidnceRsps_RsnCd_Cdg_Sys ********************************************************************************/
		if(guidanceresponsereasoncodecodingi == 0) {g.addGuidnceRspsRsnCdCdgSys("[[");}
		if(guidanceresponsereasoncodecoding.hasSystem()) {

			g.addGuidnceRspsRsnCdCdgSys(String.valueOf(guidanceresponsereasoncodecoding.getSystem()));
		} else {
			g.addGuidnceRspsRsnCdCdgSys("NULL");
		}

		if(guidanceresponsereasoncodecodingi == guidanceresponsereasoncodecodinglist.size()-1) {g.addGuidnceRspsRsnCdCdgSys("]]");}


		 };
		 };
		/******************** guidanceresponsenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> guidanceresponsenotelist = guidanceresponse.getNote();
		for(int guidanceresponsenotei = 0; guidanceresponsenotei<guidanceresponsenotelist.size();guidanceresponsenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  guidanceresponsenote = guidanceresponsenotelist.get(guidanceresponsenotei);

		/******************** GuidnceRsps_Nt_Time ********************************************************************************/
		if(guidanceresponsenotei == 0) {g.addGuidnceRspsNtTime("[");}
		if(guidanceresponsenote.hasTime()) {

			g.addGuidnceRspsNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponsenote.getTime())+"\"");
		} else {
			g.addGuidnceRspsNtTime("NULL");
		}

		if(guidanceresponsenotei == guidanceresponsenotelist.size()-1) {g.addGuidnceRspsNtTime("]");}


		/******************** GuidnceRsps_Nt_AthrRfrnc ********************************************************************************/
		if(guidanceresponsenotei == 0) {g.addGuidnceRspsNtAthrRfrnc("[");}
		if(guidanceresponsenote.hasAuthorReference()) {

			if(guidanceresponsenote.getAuthorReference().getReference() != null) {
			g.addGuidnceRspsNtAthrRfrnc(guidanceresponsenote.getAuthorReference().getReference());
			}
		} else {
			g.addGuidnceRspsNtAthrRfrnc("NULL");
		}

		if(guidanceresponsenotei == guidanceresponsenotelist.size()-1) {g.addGuidnceRspsNtAthrRfrnc("]");}


		/******************** GuidnceRsps_Nt_Txt ********************************************************************************/
		if(guidanceresponsenotei == 0) {g.addGuidnceRspsNtTxt("[");}
		if(guidanceresponsenote.hasText()) {

			g.addGuidnceRspsNtTxt(String.valueOf(guidanceresponsenote.getText()));
		} else {
			g.addGuidnceRspsNtTxt("NULL");
		}

		if(guidanceresponsenotei == guidanceresponsenotelist.size()-1) {g.addGuidnceRspsNtTxt("]");}


		/******************** GuidnceRsps_Nt_AthrStrgTyp ********************************************************************************/
		if(guidanceresponsenotei == 0) {g.addGuidnceRspsNtAthrStrgTyp("[");}
		if(guidanceresponsenote.hasAuthorStringType()) {

			g.addGuidnceRspsNtAthrStrgTyp("\""+guidanceresponsenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			g.addGuidnceRspsNtAthrStrgTyp("NULL");
		}

		if(guidanceresponsenotei == guidanceresponsenotelist.size()-1) {g.addGuidnceRspsNtAthrStrgTyp("]");}


		 };
		/******************** GuidnceRsps_RsnRfrnc ********************************************************************************/
		if(guidanceresponse.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<guidanceresponse.getReasonReference().size(); incr++) {
				array = array + guidanceresponse.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			g.addGuidnceRspsRsnRfrnc(array);

		} else {
			g.addGuidnceRspsRsnRfrnc("NULL");
		}


		/******************** guidanceresponseidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> guidanceresponseidentifierlist = guidanceresponse.getIdentifier();
		for(int guidanceresponseidentifieri = 0; guidanceresponseidentifieri<guidanceresponseidentifierlist.size();guidanceresponseidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  guidanceresponseidentifier = guidanceresponseidentifierlist.get(guidanceresponseidentifieri);

		/******************** GuidnceRsps_Id_Vl ********************************************************************************/
		if(guidanceresponseidentifieri == 0) {g.addGuidnceRspsIdVl("[");}
		if(guidanceresponseidentifier.hasValue()) {

			g.addGuidnceRspsIdVl(String.valueOf(guidanceresponseidentifier.getValue()));
		} else {
			g.addGuidnceRspsIdVl("NULL");
		}

		if(guidanceresponseidentifieri == guidanceresponseidentifierlist.size()-1) {g.addGuidnceRspsIdVl("]");}


		/******************** guidanceresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponseidentifiertype = guidanceresponseidentifier.getType();

		/******************** GuidnceRsps_Id_Typ_Txt ********************************************************************************/
		if(guidanceresponseidentifieri == 0) {g.addGuidnceRspsIdTypTxt("[");}
		if(guidanceresponseidentifiertype.hasText()) {

			g.addGuidnceRspsIdTypTxt(String.valueOf(guidanceresponseidentifiertype.getText()));
		} else {
			g.addGuidnceRspsIdTypTxt("NULL");
		}

		if(guidanceresponseidentifieri == guidanceresponseidentifierlist.size()-1) {g.addGuidnceRspsIdTypTxt("]");}


		/******************** guidanceresponseidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> guidanceresponseidentifiertypecodinglist = guidanceresponseidentifiertype.getCoding();
		for(int guidanceresponseidentifiertypecodingi = 0; guidanceresponseidentifiertypecodingi<guidanceresponseidentifiertypecodinglist.size();guidanceresponseidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  guidanceresponseidentifiertypecoding = guidanceresponseidentifiertypecodinglist.get(guidanceresponseidentifiertypecodingi);

		/******************** GuidnceRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(guidanceresponseidentifiertypecodingi == 0) {g.addGuidnceRspsIdTypCdgDsply("[[");}
		if(guidanceresponseidentifiertypecoding.hasDisplay()) {

			g.addGuidnceRspsIdTypCdgDsply(String.valueOf(guidanceresponseidentifiertypecoding.getDisplay()));
		} else {
			g.addGuidnceRspsIdTypCdgDsply("NULL");
		}

		if(guidanceresponseidentifiertypecodingi == guidanceresponseidentifiertypecodinglist.size()-1) {g.addGuidnceRspsIdTypCdgDsply("]]");}


		/******************** GuidnceRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponseidentifiertypecodingi == 0) {g.addGuidnceRspsIdTypCdgVrsn("[[");}
		if(guidanceresponseidentifiertypecoding.hasVersion()) {

			g.addGuidnceRspsIdTypCdgVrsn(String.valueOf(guidanceresponseidentifiertypecoding.getVersion()));
		} else {
			g.addGuidnceRspsIdTypCdgVrsn("NULL");
		}

		if(guidanceresponseidentifiertypecodingi == guidanceresponseidentifiertypecodinglist.size()-1) {g.addGuidnceRspsIdTypCdgVrsn("]]");}


		/******************** GuidnceRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(guidanceresponseidentifiertypecodingi == 0) {g.addGuidnceRspsIdTypCdgCd("[[");}
		if(guidanceresponseidentifiertypecoding.hasCode()) {

			g.addGuidnceRspsIdTypCdgCd(String.valueOf(guidanceresponseidentifiertypecoding.getCode()));
		} else {
			g.addGuidnceRspsIdTypCdgCd("NULL");
		}

		if(guidanceresponseidentifiertypecodingi == guidanceresponseidentifiertypecodinglist.size()-1) {g.addGuidnceRspsIdTypCdgCd("]]");}


		/******************** GuidnceRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponseidentifiertypecodingi == 0) {g.addGuidnceRspsIdTypCdgUsrSltd("[[");}
		if(guidanceresponseidentifiertypecoding.hasUserSelected()) {

			g.addGuidnceRspsIdTypCdgUsrSltd(String.valueOf(guidanceresponseidentifiertypecoding.getUserSelected()));
		} else {
			g.addGuidnceRspsIdTypCdgUsrSltd("NULL");
		}

		if(guidanceresponseidentifiertypecodingi == guidanceresponseidentifiertypecodinglist.size()-1) {g.addGuidnceRspsIdTypCdgUsrSltd("]]");}


		/******************** GuidnceRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(guidanceresponseidentifiertypecodingi == 0) {g.addGuidnceRspsIdTypCdgSys("[[");}
		if(guidanceresponseidentifiertypecoding.hasSystem()) {

			g.addGuidnceRspsIdTypCdgSys(String.valueOf(guidanceresponseidentifiertypecoding.getSystem()));
		} else {
			g.addGuidnceRspsIdTypCdgSys("NULL");
		}

		if(guidanceresponseidentifiertypecodingi == guidanceresponseidentifiertypecodinglist.size()-1) {g.addGuidnceRspsIdTypCdgSys("]]");}


		 };
		/******************** guidanceresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponseidentifierperiod = guidanceresponseidentifier.getPeriod();

		/******************** GuidnceRsps_Id_Prd_Strt ********************************************************************************/
		if(guidanceresponseidentifieri == 0) {g.addGuidnceRspsIdPrdStrt("[");}
		if(guidanceresponseidentifierperiod.hasStart()) {

			g.addGuidnceRspsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponseidentifierperiod.getStart())+"\"");
		} else {
			g.addGuidnceRspsIdPrdStrt("NULL");
		}

		if(guidanceresponseidentifieri == guidanceresponseidentifierlist.size()-1) {g.addGuidnceRspsIdPrdStrt("]");}


		/******************** GuidnceRsps_Id_Prd_End ********************************************************************************/
		if(guidanceresponseidentifieri == 0) {g.addGuidnceRspsIdPrdEnd("[");}
		if(guidanceresponseidentifierperiod.hasEnd()) {

			g.addGuidnceRspsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponseidentifierperiod.getEnd())+"\"");
		} else {
			g.addGuidnceRspsIdPrdEnd("NULL");
		}

		if(guidanceresponseidentifieri == guidanceresponseidentifierlist.size()-1) {g.addGuidnceRspsIdPrdEnd("]");}


		/******************** guidanceresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse guidanceresponseidentifieruse = guidanceresponseidentifier.getUse();
		if(guidanceresponseidentifieruse!=null) {
		if(guidanceresponseidentifieri == 0) {

		g.addGuidnceRspsIdUse("[");		}
			g.addGuidnceRspsIdUse(guidanceresponseidentifieruse.toCode());
		if(guidanceresponseidentifieri == guidanceresponseidentifierlist.size()-1) {

		g.addGuidnceRspsIdUse("]");		}

		} else {
			g.addGuidnceRspsIdUse("NULL");
		}

		/******************** GuidnceRsps_Id_Assigner ********************************************************************************/
		if(guidanceresponseidentifieri == 0) {g.addGuidnceRspsIdAssigner("[");}
		if(guidanceresponseidentifier.hasAssigner()) {

			if(guidanceresponseidentifier.getAssigner().getReference() != null) {
			g.addGuidnceRspsIdAssigner(guidanceresponseidentifier.getAssigner().getReference());
			}
		} else {
			g.addGuidnceRspsIdAssigner("NULL");
		}

		if(guidanceresponseidentifieri == guidanceresponseidentifierlist.size()-1) {g.addGuidnceRspsIdAssigner("]");}


		/******************** GuidnceRsps_Id_Sys ********************************************************************************/
		if(guidanceresponseidentifieri == 0) {g.addGuidnceRspsIdSys("[");}
		if(guidanceresponseidentifier.hasSystem()) {

			g.addGuidnceRspsIdSys(String.valueOf(guidanceresponseidentifier.getSystem()));
		} else {
			g.addGuidnceRspsIdSys("NULL");
		}

		if(guidanceresponseidentifieri == guidanceresponseidentifierlist.size()-1) {g.addGuidnceRspsIdSys("]");}


		 };
		/******************** GuidnceRsps_Prfrmr ********************************************************************************/
		if(guidanceresponse.hasPerformer()) {

			if(guidanceresponse.getPerformer().getReference() != null) {
			g.addGuidnceRspsPrfrmr(guidanceresponse.getPerformer().getReference());
			}
		} else {
			g.addGuidnceRspsPrfrmr("NULL");
		}


		/******************** GuidnceRsps_ModuleCanonicalTyp ********************************************************************************/
		if(guidanceresponse.hasModuleCanonicalType()) {

			g.addGuidnceRspsModuleCanonicalTyp("\""+guidanceresponse.getModuleCanonicalType().getValueAsString()+"\"");
		} else {
			g.addGuidnceRspsModuleCanonicalTyp("NULL");
		}


		/******************** GuidnceRsps_OccrnceDtTime ********************************************************************************/
		if(guidanceresponse.hasOccurrenceDateTime()) {

			g.addGuidnceRspsOccrnceDtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponse.getOccurrenceDateTime())+"\"");
		} else {
			g.addGuidnceRspsOccrnceDtTime("NULL");
		}


		/******************** GuidnceRsps_EvaluationMsg ********************************************************************************/
		if(guidanceresponse.hasEvaluationMessage()) {

			String  array = "[";
			for(int incr=0; incr<guidanceresponse.getEvaluationMessage().size(); incr++) {
				array = array + guidanceresponse.getEvaluationMessage().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			g.addGuidnceRspsEvaluationMsg(array);

		} else {
			g.addGuidnceRspsEvaluationMsg("NULL");
		}


		/******************** guidanceresponsemodulecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsemodulecodeableconcept = guidanceresponse.getModuleCodeableConcept();

		/******************** GuidnceRsps_ModuleCdbleCncpt_Txt ********************************************************************************/
		if(guidanceresponsemodulecodeableconcept.hasText()) {

			g.addGuidnceRspsModuleCdbleCncptTxt(String.valueOf(guidanceresponsemodulecodeableconcept.getText()));
		} else {
			g.addGuidnceRspsModuleCdbleCncptTxt("NULL");
		}


		/******************** guidanceresponsemodulecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> guidanceresponsemodulecodeableconceptcodinglist = guidanceresponsemodulecodeableconcept.getCoding();
		for(int guidanceresponsemodulecodeableconceptcodingi = 0; guidanceresponsemodulecodeableconceptcodingi<guidanceresponsemodulecodeableconceptcodinglist.size();guidanceresponsemodulecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  guidanceresponsemodulecodeableconceptcoding = guidanceresponsemodulecodeableconceptcodinglist.get(guidanceresponsemodulecodeableconceptcodingi);

		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcodingi == 0) {g.addGuidnceRspsModuleCdbleCncptCdgDsply("[");}
		if(guidanceresponsemodulecodeableconceptcoding.hasDisplay()) {

			g.addGuidnceRspsModuleCdbleCncptCdgDsply(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getDisplay()));
		} else {
			g.addGuidnceRspsModuleCdbleCncptCdgDsply("NULL");
		}

		if(guidanceresponsemodulecodeableconceptcodingi == guidanceresponsemodulecodeableconceptcodinglist.size()-1) {g.addGuidnceRspsModuleCdbleCncptCdgDsply("]");}


		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcodingi == 0) {g.addGuidnceRspsModuleCdbleCncptCdgVrsn("[");}
		if(guidanceresponsemodulecodeableconceptcoding.hasVersion()) {

			g.addGuidnceRspsModuleCdbleCncptCdgVrsn(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getVersion()));
		} else {
			g.addGuidnceRspsModuleCdbleCncptCdgVrsn("NULL");
		}

		if(guidanceresponsemodulecodeableconceptcodingi == guidanceresponsemodulecodeableconceptcodinglist.size()-1) {g.addGuidnceRspsModuleCdbleCncptCdgVrsn("]");}


		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcodingi == 0) {g.addGuidnceRspsModuleCdbleCncptCdgCd("[");}
		if(guidanceresponsemodulecodeableconceptcoding.hasCode()) {

			g.addGuidnceRspsModuleCdbleCncptCdgCd(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getCode()));
		} else {
			g.addGuidnceRspsModuleCdbleCncptCdgCd("NULL");
		}

		if(guidanceresponsemodulecodeableconceptcodingi == guidanceresponsemodulecodeableconceptcodinglist.size()-1) {g.addGuidnceRspsModuleCdbleCncptCdgCd("]");}


		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcodingi == 0) {g.addGuidnceRspsModuleCdbleCncptCdgUsrSltd("[");}
		if(guidanceresponsemodulecodeableconceptcoding.hasUserSelected()) {

			g.addGuidnceRspsModuleCdbleCncptCdgUsrSltd(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getUserSelected()));
		} else {
			g.addGuidnceRspsModuleCdbleCncptCdgUsrSltd("NULL");
		}

		if(guidanceresponsemodulecodeableconceptcodingi == guidanceresponsemodulecodeableconceptcodinglist.size()-1) {g.addGuidnceRspsModuleCdbleCncptCdgUsrSltd("]");}


		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcodingi == 0) {g.addGuidnceRspsModuleCdbleCncptCdgSys("[");}
		if(guidanceresponsemodulecodeableconceptcoding.hasSystem()) {

			g.addGuidnceRspsModuleCdbleCncptCdgSys(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getSystem()));
		} else {
			g.addGuidnceRspsModuleCdbleCncptCdgSys("NULL");
		}

		if(guidanceresponsemodulecodeableconceptcodingi == guidanceresponsemodulecodeableconceptcodinglist.size()-1) {g.addGuidnceRspsModuleCdbleCncptCdgSys("]");}


		 };
		/******************** GuidnceRsps_OutputPrmtrs ********************************************************************************/
		if(guidanceresponse.hasOutputParameters()) {

			if(guidanceresponse.getOutputParameters().getReference() != null) {
			g.addGuidnceRspsOutputPrmtrs(guidanceresponse.getOutputParameters().getReference());
			}
		} else {
			g.addGuidnceRspsOutputPrmtrs("NULL");
		}


		/******************** guidanceresponserequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier guidanceresponserequestidentifier = guidanceresponse.getRequestIdentifier();

		/******************** GuidnceRsps_RqstId_Vl ********************************************************************************/
		if(guidanceresponserequestidentifier.hasValue()) {

			g.addGuidnceRspsRqstIdVl(String.valueOf(guidanceresponserequestidentifier.getValue()));
		} else {
			g.addGuidnceRspsRqstIdVl("NULL");
		}


		/******************** guidanceresponserequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponserequestidentifiertype = guidanceresponserequestidentifier.getType();

		/******************** GuidnceRsps_RqstId_Typ_Txt ********************************************************************************/
		if(guidanceresponserequestidentifiertype.hasText()) {

			g.addGuidnceRspsRqstIdTypTxt(String.valueOf(guidanceresponserequestidentifiertype.getText()));
		} else {
			g.addGuidnceRspsRqstIdTypTxt("NULL");
		}


		/******************** guidanceresponserequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> guidanceresponserequestidentifiertypecodinglist = guidanceresponserequestidentifiertype.getCoding();
		for(int guidanceresponserequestidentifiertypecodingi = 0; guidanceresponserequestidentifiertypecodingi<guidanceresponserequestidentifiertypecodinglist.size();guidanceresponserequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  guidanceresponserequestidentifiertypecoding = guidanceresponserequestidentifiertypecodinglist.get(guidanceresponserequestidentifiertypecodingi);

		/******************** GuidnceRsps_RqstId_Typ_Cdg_Dsply ********************************************************************************/
		if(guidanceresponserequestidentifiertypecodingi == 0) {g.addGuidnceRspsRqstIdTypCdgDsply("[");}
		if(guidanceresponserequestidentifiertypecoding.hasDisplay()) {

			g.addGuidnceRspsRqstIdTypCdgDsply(String.valueOf(guidanceresponserequestidentifiertypecoding.getDisplay()));
		} else {
			g.addGuidnceRspsRqstIdTypCdgDsply("NULL");
		}

		if(guidanceresponserequestidentifiertypecodingi == guidanceresponserequestidentifiertypecodinglist.size()-1) {g.addGuidnceRspsRqstIdTypCdgDsply("]");}


		/******************** GuidnceRsps_RqstId_Typ_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponserequestidentifiertypecodingi == 0) {g.addGuidnceRspsRqstIdTypCdgVrsn("[");}
		if(guidanceresponserequestidentifiertypecoding.hasVersion()) {

			g.addGuidnceRspsRqstIdTypCdgVrsn(String.valueOf(guidanceresponserequestidentifiertypecoding.getVersion()));
		} else {
			g.addGuidnceRspsRqstIdTypCdgVrsn("NULL");
		}

		if(guidanceresponserequestidentifiertypecodingi == guidanceresponserequestidentifiertypecodinglist.size()-1) {g.addGuidnceRspsRqstIdTypCdgVrsn("]");}


		/******************** GuidnceRsps_RqstId_Typ_Cdg_Cd ********************************************************************************/
		if(guidanceresponserequestidentifiertypecodingi == 0) {g.addGuidnceRspsRqstIdTypCdgCd("[");}
		if(guidanceresponserequestidentifiertypecoding.hasCode()) {

			g.addGuidnceRspsRqstIdTypCdgCd(String.valueOf(guidanceresponserequestidentifiertypecoding.getCode()));
		} else {
			g.addGuidnceRspsRqstIdTypCdgCd("NULL");
		}

		if(guidanceresponserequestidentifiertypecodingi == guidanceresponserequestidentifiertypecodinglist.size()-1) {g.addGuidnceRspsRqstIdTypCdgCd("]");}


		/******************** GuidnceRsps_RqstId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponserequestidentifiertypecodingi == 0) {g.addGuidnceRspsRqstIdTypCdgUsrSltd("[");}
		if(guidanceresponserequestidentifiertypecoding.hasUserSelected()) {

			g.addGuidnceRspsRqstIdTypCdgUsrSltd(String.valueOf(guidanceresponserequestidentifiertypecoding.getUserSelected()));
		} else {
			g.addGuidnceRspsRqstIdTypCdgUsrSltd("NULL");
		}

		if(guidanceresponserequestidentifiertypecodingi == guidanceresponserequestidentifiertypecodinglist.size()-1) {g.addGuidnceRspsRqstIdTypCdgUsrSltd("]");}


		/******************** GuidnceRsps_RqstId_Typ_Cdg_Sys ********************************************************************************/
		if(guidanceresponserequestidentifiertypecodingi == 0) {g.addGuidnceRspsRqstIdTypCdgSys("[");}
		if(guidanceresponserequestidentifiertypecoding.hasSystem()) {

			g.addGuidnceRspsRqstIdTypCdgSys(String.valueOf(guidanceresponserequestidentifiertypecoding.getSystem()));
		} else {
			g.addGuidnceRspsRqstIdTypCdgSys("NULL");
		}

		if(guidanceresponserequestidentifiertypecodingi == guidanceresponserequestidentifiertypecodinglist.size()-1) {g.addGuidnceRspsRqstIdTypCdgSys("]");}


		 };
		/******************** guidanceresponserequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponserequestidentifierperiod = guidanceresponserequestidentifier.getPeriod();

		/******************** GuidnceRsps_RqstId_Prd_Strt ********************************************************************************/
		if(guidanceresponserequestidentifierperiod.hasStart()) {

			g.addGuidnceRspsRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponserequestidentifierperiod.getStart())+"\"");
		} else {
			g.addGuidnceRspsRqstIdPrdStrt("NULL");
		}


		/******************** GuidnceRsps_RqstId_Prd_End ********************************************************************************/
		if(guidanceresponserequestidentifierperiod.hasEnd()) {

			g.addGuidnceRspsRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponserequestidentifierperiod.getEnd())+"\"");
		} else {
			g.addGuidnceRspsRqstIdPrdEnd("NULL");
		}


		/******************** guidanceresponserequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse guidanceresponserequestidentifieruse = guidanceresponserequestidentifier.getUse();
		if(guidanceresponserequestidentifieruse!=null) {
			g.addGuidnceRspsRqstIdUse(guidanceresponserequestidentifieruse.toCode());
		} else {
			g.addGuidnceRspsRqstIdUse("NULL");
		}

		/******************** GuidnceRsps_RqstId_Assigner ********************************************************************************/
		if(guidanceresponserequestidentifier.hasAssigner()) {

			if(guidanceresponserequestidentifier.getAssigner().getReference() != null) {
			g.addGuidnceRspsRqstIdAssigner(guidanceresponserequestidentifier.getAssigner().getReference());
			}
		} else {
			g.addGuidnceRspsRqstIdAssigner("NULL");
		}


		/******************** GuidnceRsps_RqstId_Sys ********************************************************************************/
		if(guidanceresponserequestidentifier.hasSystem()) {

			g.addGuidnceRspsRqstIdSys(String.valueOf(guidanceresponserequestidentifier.getSystem()));
		} else {
			g.addGuidnceRspsRqstIdSys("NULL");
		}


		/******************** GuidnceRsps_ModuleUriTyp ********************************************************************************/
		if(guidanceresponse.hasModuleUriType()) {

			g.addGuidnceRspsModuleUriTyp("\""+guidanceresponse.getModuleUriType().getValueAsString()+"\"");
		} else {
			g.addGuidnceRspsModuleUriTyp("NULL");
		}


		/******************** guidanceresponsedatarequirement ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement> guidanceresponsedatarequirementlist = guidanceresponse.getDataRequirement();
		for(int guidanceresponsedatarequirementi = 0; guidanceresponsedatarequirementi<guidanceresponsedatarequirementlist.size();guidanceresponsedatarequirementi++ ) {
		org.hl7.fhir.r4.model.DataRequirement  guidanceresponsedatarequirement = guidanceresponsedatarequirementlist.get(guidanceresponsedatarequirementi);

		/******************** GuidnceRsps_DataRqrment_Typ ********************************************************************************/
		if(guidanceresponsedatarequirementi == 0) {g.addGuidnceRspsDataRqrmentTyp("[");}
		if(guidanceresponsedatarequirement.hasType()) {

			g.addGuidnceRspsDataRqrmentTyp(String.valueOf(guidanceresponsedatarequirement.getType()));
		} else {
			g.addGuidnceRspsDataRqrmentTyp("NULL");
		}

		if(guidanceresponsedatarequirementi == guidanceresponsedatarequirementlist.size()-1) {g.addGuidnceRspsDataRqrmentTyp("]");}


		/******************** guidanceresponsedatarequirementsort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> guidanceresponsedatarequirementsortlist = guidanceresponsedatarequirement.getSort();
		for(int guidanceresponsedatarequirementsorti = 0; guidanceresponsedatarequirementsorti<guidanceresponsedatarequirementsortlist.size();guidanceresponsedatarequirementsorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  guidanceresponsedatarequirementsort = guidanceresponsedatarequirementsortlist.get(guidanceresponsedatarequirementsorti);

		/******************** GuidnceRsps_DataRqrment_Sort_Path ********************************************************************************/
		if(guidanceresponsedatarequirementsorti == 0) {g.addGuidnceRspsDataRqrmentSortPath("[[");}
		if(guidanceresponsedatarequirementsort.hasPath()) {

			g.addGuidnceRspsDataRqrmentSortPath(String.valueOf(guidanceresponsedatarequirementsort.getPath()));
		} else {
			g.addGuidnceRspsDataRqrmentSortPath("NULL");
		}

		if(guidanceresponsedatarequirementsorti == guidanceresponsedatarequirementsortlist.size()-1) {g.addGuidnceRspsDataRqrmentSortPath("]]");}


		/******************** guidanceresponsedatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection guidanceresponsedatarequirementsortdirection = guidanceresponsedatarequirementsort.getDirection();
		if(guidanceresponsedatarequirementsortdirection!=null) {
		if(guidanceresponsedatarequirementsorti == 0) {

		g.addGuidnceRspsDataRqrmentSortDirection("[[");		}
			g.addGuidnceRspsDataRqrmentSortDirection(guidanceresponsedatarequirementsortdirection.toCode());
		if(guidanceresponsedatarequirementsorti == guidanceresponsedatarequirementsortlist.size()-1) {

		g.addGuidnceRspsDataRqrmentSortDirection("]]");		}

		} else {
			g.addGuidnceRspsDataRqrmentSortDirection("NULL");
		}

		 };
		/******************** GuidnceRsps_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(guidanceresponsedatarequirement.hasSubjectReference()) {

			if(guidanceresponsedatarequirement.getSubjectReference().getReference() != null) {
			g.addGuidnceRspsDataRqrmentSbjctRfrnc(guidanceresponsedatarequirement.getSubjectReference().getReference());
			}
		} else {
			g.addGuidnceRspsDataRqrmentSbjctRfrnc("NULL");
		}


		/******************** guidanceresponsedatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsedatarequirementsubjectcodeableconcept = guidanceresponsedatarequirement.getSubjectCodeableConcept();

		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconcept.hasText()) {

			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptTxt(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconcept.getText()));
		} else {
			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptTxt("NULL");
		}


		/******************** guidanceresponsedatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> guidanceresponsedatarequirementsubjectcodeableconceptcodinglist = guidanceresponsedatarequirementsubjectcodeableconcept.getCoding();
		for(int guidanceresponsedatarequirementsubjectcodeableconceptcodingi = 0; guidanceresponsedatarequirementsubjectcodeableconceptcodingi<guidanceresponsedatarequirementsubjectcodeableconceptcodinglist.size();guidanceresponsedatarequirementsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  guidanceresponsedatarequirementsubjectcodeableconceptcoding = guidanceresponsedatarequirementsubjectcodeableconceptcodinglist.get(guidanceresponsedatarequirementsubjectcodeableconceptcodingi);

		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == 0) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply("[[");}
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasDisplay()) {

			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getDisplay()));
		} else {
			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply("NULL");
		}

		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == guidanceresponsedatarequirementsubjectcodeableconceptcodinglist.size()-1) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply("]]");}


		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == 0) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn("[[");}
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasVersion()) {

			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getVersion()));
		} else {
			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == guidanceresponsedatarequirementsubjectcodeableconceptcodinglist.size()-1) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn("]]");}


		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == 0) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd("[[");}
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasCode()) {

			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getCode()));
		} else {
			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd("NULL");
		}

		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == guidanceresponsedatarequirementsubjectcodeableconceptcodinglist.size()-1) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd("]]");}


		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == 0) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd("[[");}
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {

			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == guidanceresponsedatarequirementsubjectcodeableconceptcodinglist.size()-1) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd("]]");}


		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == 0) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys("[[");}
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasSystem()) {

			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getSystem()));
		} else {
			g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys("NULL");
		}

		if(guidanceresponsedatarequirementsubjectcodeableconceptcodingi == guidanceresponsedatarequirementsubjectcodeableconceptcodinglist.size()-1) {g.addGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys("]]");}


		 };
		/******************** GuidnceRsps_DataRqrment_Profile ********************************************************************************/
		if(guidanceresponsedatarequirement.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<guidanceresponsedatarequirement.getProfile().size(); incr++) {
				array = array + guidanceresponsedatarequirement.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			g.addGuidnceRspsDataRqrmentProfile(array);

		} else {
			g.addGuidnceRspsDataRqrmentProfile("NULL");
		}


		/******************** GuidnceRsps_DataRqrment_MustSupport ********************************************************************************/
		if(guidanceresponsedatarequirement.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<guidanceresponsedatarequirement.getMustSupport().size(); incr++) {
				array = array + guidanceresponsedatarequirement.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			g.addGuidnceRspsDataRqrmentMustSupport(array);

		} else {
			g.addGuidnceRspsDataRqrmentMustSupport("NULL");
		}


		/******************** guidanceresponsedatarequirementcodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> guidanceresponsedatarequirementcodefilterlist = guidanceresponsedatarequirement.getCodeFilter();
		for(int guidanceresponsedatarequirementcodefilteri = 0; guidanceresponsedatarequirementcodefilteri<guidanceresponsedatarequirementcodefilterlist.size();guidanceresponsedatarequirementcodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  guidanceresponsedatarequirementcodefilter = guidanceresponsedatarequirementcodefilterlist.get(guidanceresponsedatarequirementcodefilteri);

		/******************** GuidnceRsps_DataRqrment_CdFltr_Path ********************************************************************************/
		if(guidanceresponsedatarequirementcodefilteri == 0) {g.addGuidnceRspsDataRqrmentCdFltrPath("[[");}
		if(guidanceresponsedatarequirementcodefilter.hasPath()) {

			g.addGuidnceRspsDataRqrmentCdFltrPath(String.valueOf(guidanceresponsedatarequirementcodefilter.getPath()));
		} else {
			g.addGuidnceRspsDataRqrmentCdFltrPath("NULL");
		}

		if(guidanceresponsedatarequirementcodefilteri == guidanceresponsedatarequirementcodefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentCdFltrPath("]]");}


		/******************** guidanceresponsedatarequirementcodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> guidanceresponsedatarequirementcodefiltercodelist = guidanceresponsedatarequirementcodefilter.getCode();
		for(int guidanceresponsedatarequirementcodefiltercodei = 0; guidanceresponsedatarequirementcodefiltercodei<guidanceresponsedatarequirementcodefiltercodelist.size();guidanceresponsedatarequirementcodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  guidanceresponsedatarequirementcodefiltercode = guidanceresponsedatarequirementcodefiltercodelist.get(guidanceresponsedatarequirementcodefiltercodei);

		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercodei == 0) {g.addGuidnceRspsDataRqrmentCdFltrCdDsply("[[[");}
		if(guidanceresponsedatarequirementcodefiltercode.hasDisplay()) {

			g.addGuidnceRspsDataRqrmentCdFltrCdDsply(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getDisplay()));
		} else {
			g.addGuidnceRspsDataRqrmentCdFltrCdDsply("NULL");
		}

		if(guidanceresponsedatarequirementcodefiltercodei == guidanceresponsedatarequirementcodefiltercodelist.size()-1) {g.addGuidnceRspsDataRqrmentCdFltrCdDsply("]]]");}


		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercodei == 0) {g.addGuidnceRspsDataRqrmentCdFltrCdVrsn("[[[");}
		if(guidanceresponsedatarequirementcodefiltercode.hasVersion()) {

			g.addGuidnceRspsDataRqrmentCdFltrCdVrsn(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getVersion()));
		} else {
			g.addGuidnceRspsDataRqrmentCdFltrCdVrsn("NULL");
		}

		if(guidanceresponsedatarequirementcodefiltercodei == guidanceresponsedatarequirementcodefiltercodelist.size()-1) {g.addGuidnceRspsDataRqrmentCdFltrCdVrsn("]]]");}


		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercodei == 0) {g.addGuidnceRspsDataRqrmentCdFltrCdUsrSltd("[[[");}
		if(guidanceresponsedatarequirementcodefiltercode.hasUserSelected()) {

			g.addGuidnceRspsDataRqrmentCdFltrCdUsrSltd(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getUserSelected()));
		} else {
			g.addGuidnceRspsDataRqrmentCdFltrCdUsrSltd("NULL");
		}

		if(guidanceresponsedatarequirementcodefiltercodei == guidanceresponsedatarequirementcodefiltercodelist.size()-1) {g.addGuidnceRspsDataRqrmentCdFltrCdUsrSltd("]]]");}


		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercodei == 0) {g.addGuidnceRspsDataRqrmentCdFltrCdSys("[[[");}
		if(guidanceresponsedatarequirementcodefiltercode.hasSystem()) {

			g.addGuidnceRspsDataRqrmentCdFltrCdSys(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getSystem()));
		} else {
			g.addGuidnceRspsDataRqrmentCdFltrCdSys("NULL");
		}

		if(guidanceresponsedatarequirementcodefiltercodei == guidanceresponsedatarequirementcodefiltercodelist.size()-1) {g.addGuidnceRspsDataRqrmentCdFltrCdSys("]]]");}


		 };
		/******************** GuidnceRsps_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(guidanceresponsedatarequirementcodefilter.hasSearchParam()) {

			g.addGuidnceRspsDataRqrmentCdFltrSrchParam(String.valueOf(guidanceresponsedatarequirementcodefilter.getSearchParam()));
		} else {
			g.addGuidnceRspsDataRqrmentCdFltrSrchParam("NULL");
		}


		/******************** GuidnceRsps_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(guidanceresponsedatarequirementcodefilter.hasValueSet()) {

			g.addGuidnceRspsDataRqrmentCdFltrVlSt(String.valueOf(guidanceresponsedatarequirementcodefilter.getValueSet()));
		} else {
			g.addGuidnceRspsDataRqrmentCdFltrVlSt("NULL");
		}


		 };
		/******************** GuidnceRsps_DataRqrment_Lmt ********************************************************************************/
		if(guidanceresponsedatarequirement.hasLimit()) {

			g.addGuidnceRspsDataRqrmentLmt(String.valueOf(guidanceresponsedatarequirement.getLimit()));
		} else {
			g.addGuidnceRspsDataRqrmentLmt("NULL");
		}


		/******************** guidanceresponsedatarequirementdatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> guidanceresponsedatarequirementdatefilterlist = guidanceresponsedatarequirement.getDateFilter();
		for(int guidanceresponsedatarequirementdatefilteri = 0; guidanceresponsedatarequirementdatefilteri<guidanceresponsedatarequirementdatefilterlist.size();guidanceresponsedatarequirementdatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  guidanceresponsedatarequirementdatefilter = guidanceresponsedatarequirementdatefilterlist.get(guidanceresponsedatarequirementdatefilteri);

		/******************** GuidnceRsps_DataRqrment_DtFltr_Path ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrPath("[[");}
		if(guidanceresponsedatarequirementdatefilter.hasPath()) {

			g.addGuidnceRspsDataRqrmentDtFltrPath(String.valueOf(guidanceresponsedatarequirementdatefilter.getPath()));
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrPath("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrPath("]]");}


		/******************** GuidnceRsps_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrSrchParam("[[");}
		if(guidanceresponsedatarequirementdatefilter.hasSearchParam()) {

			g.addGuidnceRspsDataRqrmentDtFltrSrchParam(String.valueOf(guidanceresponsedatarequirementdatefilter.getSearchParam()));
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrSrchParam("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrSrchParam("]]");}


		/******************** guidanceresponsedatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration guidanceresponsedatarequirementdatefiltervalueduration = guidanceresponsedatarequirementdatefilter.getValueDuration();

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationVl("[[");}
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasValue()) {

			g.addGuidnceRspsDataRqrmentDtFltrVlDurationVl(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getValue()));
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlDurationVl("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationVl("]]");}


		/******************** guidanceresponsedatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator guidanceresponsedatarequirementdatefiltervaluedurationcomparator = guidanceresponsedatarequirementdatefiltervalueduration.getComparator();
		if(guidanceresponsedatarequirementdatefiltervaluedurationcomparator!=null) {
		if(guidanceresponsedatarequirementdatefilteri == 0) {

		g.addGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr("[[");		}
			g.addGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr(guidanceresponsedatarequirementdatefiltervaluedurationcomparator.toCode());
		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {

		g.addGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr("]]");		}

		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr("NULL");
		}

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationCd("[[");}
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasCode()) {

			g.addGuidnceRspsDataRqrmentDtFltrVlDurationCd(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getCode()));
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlDurationCd("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationCd("]]");}


		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationUnt("[[");}
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasUnit()) {

			g.addGuidnceRspsDataRqrmentDtFltrVlDurationUnt(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getUnit()));
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlDurationUnt("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationUnt("]]");}


		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationSys("[[");}
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasSystem()) {

			g.addGuidnceRspsDataRqrmentDtFltrVlDurationSys(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getSystem()));
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlDurationSys("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrVlDurationSys("]]");}


		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp("[[");}
		if(guidanceresponsedatarequirementdatefilter.hasValueDateTimeType()) {

			g.addGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp("\""+guidanceresponsedatarequirementdatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp("]]");}


		/******************** guidanceresponsedatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponsedatarequirementdatefiltervalueperiod = guidanceresponsedatarequirementdatefilter.getValuePeriod();

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrVlPrdStrt("[[");}
		if(guidanceresponsedatarequirementdatefiltervalueperiod.hasStart()) {

			g.addGuidnceRspsDataRqrmentDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponsedatarequirementdatefiltervalueperiod.getStart())+"\"");
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlPrdStrt("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrVlPrdStrt("]]");}


		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilteri == 0) {g.addGuidnceRspsDataRqrmentDtFltrVlPrdEnd("[[");}
		if(guidanceresponsedatarequirementdatefiltervalueperiod.hasEnd()) {

			g.addGuidnceRspsDataRqrmentDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(guidanceresponsedatarequirementdatefiltervalueperiod.getEnd())+"\"");
		} else {
			g.addGuidnceRspsDataRqrmentDtFltrVlPrdEnd("NULL");
		}

		if(guidanceresponsedatarequirementdatefilteri == guidanceresponsedatarequirementdatefilterlist.size()-1) {g.addGuidnceRspsDataRqrmentDtFltrVlPrdEnd("]]");}


		 };
		 };
		return g;
	}
}
