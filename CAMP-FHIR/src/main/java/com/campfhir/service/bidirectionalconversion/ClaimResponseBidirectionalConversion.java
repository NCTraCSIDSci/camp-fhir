package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ClaimResponse;
public class ClaimResponseBidirectionalConversion 
{
	public ClaimResponse ClaimResponses(org.hl7.fhir.r4.model.ClaimResponse claimresponse) throws ParseException
	{
		 main.java.com.campfhir.model.ClaimResponse c = new  main.java.com.campfhir.model.ClaimResponse();

		/******************** id ********************************************************************************/
		claimresponse.setId(c.getId());

		/******************** claimresponsetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsetype = claimresponse.getType();

		/******************** claimresponsetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsetypecoding = claimresponsetype.getCodingFirstRep();

		/******************** ClmRsps_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponsetypecoding.hasDisplay()) {
			c.setClmRspsTypCdgDsply(String.valueOf(claimresponsetypecoding.getDisplay()));
		}
		/******************** ClmRsps_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponsetypecoding.hasVersion()) {
			c.setClmRspsTypCdgVrsn(String.valueOf(claimresponsetypecoding.getVersion()));
		}
		/******************** ClmRsps_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponsetypecoding.hasCode()) {
			c.setClmRspsTypCdgCd(String.valueOf(claimresponsetypecoding.getCode()));
		}
		/******************** ClmRsps_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponsetypecoding.hasSystem()) {
			c.setClmRspsTypCdgSys(String.valueOf(claimresponsetypecoding.getSystem()));
		}
		/******************** ClmRsps_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsetypecoding.hasUserSelected()) {
			c.setClmRspsTypCdgUsrSltd(String.valueOf(claimresponsetypecoding.getUserSelected()));
		}
		/******************** ClmRsps_Typ_Txt ********************************************************************************/
		if(claimresponsetype.hasText()) {
			c.setClmRspsTypTxt(String.valueOf(claimresponsetype.getText()));
		}
		/******************** claimresponseadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadjudication = claimresponse.getAdjudicationFirstRep();

		/******************** ClmRsps_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadjudication.hasValue()) {
			c.setClmRspsAdjdctnVl(String.valueOf(claimresponseadjudication.getValue()));
		}
		/******************** claimresponseadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadjudicationreason = claimresponseadjudication.getReason();

		/******************** claimresponseadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadjudicationreasoncoding = claimresponseadjudicationreason.getCodingFirstRep();

		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadjudicationreasoncoding.hasDisplay()) {
			c.setClmRspsAdjdctnRsnCdgDsply(String.valueOf(claimresponseadjudicationreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadjudicationreasoncoding.hasVersion()) {
			c.setClmRspsAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadjudicationreasoncoding.getVersion()));
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadjudicationreasoncoding.hasCode()) {
			c.setClmRspsAdjdctnRsnCdgCd(String.valueOf(claimresponseadjudicationreasoncoding.getCode()));
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadjudicationreasoncoding.hasSystem()) {
			c.setClmRspsAdjdctnRsnCdgSys(String.valueOf(claimresponseadjudicationreasoncoding.getSystem()));
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadjudicationreasoncoding.hasUserSelected()) {
			c.setClmRspsAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadjudicationreason.hasText()) {
			c.setClmRspsAdjdctnRsnTxt(String.valueOf(claimresponseadjudicationreason.getText()));
		}
		/******************** claimresponseadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadjudicationcategory = claimresponseadjudication.getCategory();

		/******************** claimresponseadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadjudicationcategorycoding = claimresponseadjudicationcategory.getCodingFirstRep();

		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadjudicationcategorycoding.hasDisplay()) {
			c.setClmRspsAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadjudicationcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadjudicationcategorycoding.hasVersion()) {
			c.setClmRspsAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadjudicationcategorycoding.getVersion()));
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadjudicationcategorycoding.hasCode()) {
			c.setClmRspsAdjdctnCtgryCdgCd(String.valueOf(claimresponseadjudicationcategorycoding.getCode()));
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadjudicationcategorycoding.hasSystem()) {
			c.setClmRspsAdjdctnCtgryCdgSys(String.valueOf(claimresponseadjudicationcategorycoding.getSystem()));
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadjudicationcategorycoding.hasUserSelected()) {
			c.setClmRspsAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadjudicationcategory.hasText()) {
			c.setClmRspsAdjdctnCtgryTxt(String.valueOf(claimresponseadjudicationcategory.getText()));
		}
		/******************** claimresponseadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadjudicationamount = claimresponseadjudication.getAmount();

		/******************** ClmRsps_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadjudicationamount.hasValue()) {
			c.setClmRspsAdjdctnAmntVl(String.valueOf(claimresponseadjudicationamount.getValue()));
		}
		/******************** ClmRsps_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadjudicationamount.hasCurrency()) {
			c.setClmRspsAdjdctnAmntCrncy(String.valueOf(claimresponseadjudicationamount.getCurrency()));
		}
		/******************** ClmRsps_CmmnctnRqst ********************************************************************************/
		if(claimresponse.hasCommunicationRequest()) {
			c.setClmRspsCmmnctnRqst(String.valueOf(claimresponse.getCommunicationRequestFirstRep()));
		}
		/******************** claimresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ClaimResponseStatus claimresponsestatus = claimresponse.getStatus();
		c.setClmRspsSts(claimresponsestatus.toCode());

		/******************** ClmRsps_Created ********************************************************************************/
		if(claimresponse.hasCreated()) {
			c.setClmRspsCreated(String.valueOf(claimresponse.getCreated()));
		}
		/******************** ClmRsps_Disposition ********************************************************************************/
		if(claimresponse.hasDisposition()) {
			c.setClmRspsDisposition(String.valueOf(claimresponse.getDisposition()));
		}
		/******************** ClmRsps_Rqst ********************************************************************************/
		if(claimresponse.hasRequest()) {
			c.setClmRspsRqst(String.valueOf(claimresponse.getRequest()));
		}
		/******************** claimresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.RemittanceOutcome claimresponseoutcome = claimresponse.getOutcome();
		c.setClmRspsOutcome(claimresponseoutcome.toCode());

		/******************** ClmRsps_Rqstor ********************************************************************************/
		if(claimresponse.hasRequestor()) {
			c.setClmRspsRqstor(String.valueOf(claimresponse.getRequestor()));
		}
		/******************** claimresponseformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseformcode = claimresponse.getFormCode();

		/******************** claimresponseformcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseformcodecoding = claimresponseformcode.getCodingFirstRep();

		/******************** ClmRsps_FrmCd_Cdg_Dsply ********************************************************************************/
		if(claimresponseformcodecoding.hasDisplay()) {
			c.setClmRspsFrmCdCdgDsply(String.valueOf(claimresponseformcodecoding.getDisplay()));
		}
		/******************** ClmRsps_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimresponseformcodecoding.hasVersion()) {
			c.setClmRspsFrmCdCdgVrsn(String.valueOf(claimresponseformcodecoding.getVersion()));
		}
		/******************** ClmRsps_FrmCd_Cdg_Cd ********************************************************************************/
		if(claimresponseformcodecoding.hasCode()) {
			c.setClmRspsFrmCdCdgCd(String.valueOf(claimresponseformcodecoding.getCode()));
		}
		/******************** ClmRsps_FrmCd_Cdg_Sys ********************************************************************************/
		if(claimresponseformcodecoding.hasSystem()) {
			c.setClmRspsFrmCdCdgSys(String.valueOf(claimresponseformcodecoding.getSystem()));
		}
		/******************** ClmRsps_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseformcodecoding.hasUserSelected()) {
			c.setClmRspsFrmCdCdgUsrSltd(String.valueOf(claimresponseformcodecoding.getUserSelected()));
		}
		/******************** ClmRsps_FrmCd_Txt ********************************************************************************/
		if(claimresponseformcode.hasText()) {
			c.setClmRspsFrmCdTxt(String.valueOf(claimresponseformcode.getText()));
		}
		/******************** ClmRsps_Pnt ********************************************************************************/
		if(claimresponse.hasPatient()) {
			c.setClmRspsPnt(String.valueOf(claimresponse.getPatient()));
		}
		/******************** ClmRsps_Insurer ********************************************************************************/
		if(claimresponse.hasInsurer()) {
			c.setClmRspsInsurer(String.valueOf(claimresponse.getInsurer()));
		}
		/******************** claimresponseprocessnote ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.NoteComponent claimresponseprocessnote = claimresponse.getProcessNoteFirstRep();

		/******************** claimresponseprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteType claimresponseprocessnotetype = claimresponseprocessnote.getType();
		c.setClmRspsProcessNtTyp(claimresponseprocessnotetype.toCode());

		/******************** claimresponseprocessnotelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseprocessnotelanguage = claimresponseprocessnote.getLanguage();

		/******************** claimresponseprocessnotelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseprocessnotelanguagecoding = claimresponseprocessnotelanguage.getCodingFirstRep();

		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(claimresponseprocessnotelanguagecoding.hasDisplay()) {
			c.setClmRspsProcessNtLnguageCdgDsply(String.valueOf(claimresponseprocessnotelanguagecoding.getDisplay()));
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(claimresponseprocessnotelanguagecoding.hasVersion()) {
			c.setClmRspsProcessNtLnguageCdgVrsn(String.valueOf(claimresponseprocessnotelanguagecoding.getVersion()));
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(claimresponseprocessnotelanguagecoding.hasCode()) {
			c.setClmRspsProcessNtLnguageCdgCd(String.valueOf(claimresponseprocessnotelanguagecoding.getCode()));
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(claimresponseprocessnotelanguagecoding.hasSystem()) {
			c.setClmRspsProcessNtLnguageCdgSys(String.valueOf(claimresponseprocessnotelanguagecoding.getSystem()));
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseprocessnotelanguagecoding.hasUserSelected()) {
			c.setClmRspsProcessNtLnguageCdgUsrSltd(String.valueOf(claimresponseprocessnotelanguagecoding.getUserSelected()));
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(claimresponseprocessnotelanguage.hasText()) {
			c.setClmRspsProcessNtLnguageTxt(String.valueOf(claimresponseprocessnotelanguage.getText()));
		}
		/******************** ClmRsps_ProcessNt_Nmbr ********************************************************************************/
		if(claimresponseprocessnote.hasNumber()) {
			c.setClmRspsProcessNtNmbr(String.valueOf(claimresponseprocessnote.getNumber()));
		}
		/******************** ClmRsps_ProcessNt_Txt ********************************************************************************/
		if(claimresponseprocessnote.hasText()) {
			c.setClmRspsProcessNtTxt(String.valueOf(claimresponseprocessnote.getText()));
		}
		/******************** claimresponseerror ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent claimresponseerror = claimresponse.getErrorFirstRep();

		/******************** claimresponseerrorcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseerrorcode = claimresponseerror.getCode();

		/******************** claimresponseerrorcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseerrorcodecoding = claimresponseerrorcode.getCodingFirstRep();

		/******************** ClmRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(claimresponseerrorcodecoding.hasDisplay()) {
			c.setClmRspsErrorCdCdgDsply(String.valueOf(claimresponseerrorcodecoding.getDisplay()));
		}
		/******************** ClmRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(claimresponseerrorcodecoding.hasVersion()) {
			c.setClmRspsErrorCdCdgVrsn(String.valueOf(claimresponseerrorcodecoding.getVersion()));
		}
		/******************** ClmRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(claimresponseerrorcodecoding.hasCode()) {
			c.setClmRspsErrorCdCdgCd(String.valueOf(claimresponseerrorcodecoding.getCode()));
		}
		/******************** ClmRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(claimresponseerrorcodecoding.hasSystem()) {
			c.setClmRspsErrorCdCdgSys(String.valueOf(claimresponseerrorcodecoding.getSystem()));
		}
		/******************** ClmRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseerrorcodecoding.hasUserSelected()) {
			c.setClmRspsErrorCdCdgUsrSltd(String.valueOf(claimresponseerrorcodecoding.getUserSelected()));
		}
		/******************** ClmRsps_Error_Cd_Txt ********************************************************************************/
		if(claimresponseerrorcode.hasText()) {
			c.setClmRspsErrorCdTxt(String.valueOf(claimresponseerrorcode.getText()));
		}
		/******************** ClmRsps_Error_SubDtlSqnc ********************************************************************************/
		if(claimresponseerror.hasSubDetailSequence()) {
			c.setClmRspsErrorSubDtlSqnc(String.valueOf(claimresponseerror.getSubDetailSequence()));
		}
		/******************** ClmRsps_Error_ItmSqnc ********************************************************************************/
		if(claimresponseerror.hasItemSequence()) {
			c.setClmRspsErrorItmSqnc(String.valueOf(claimresponseerror.getItemSequence()));
		}
		/******************** ClmRsps_Error_DtlSqnc ********************************************************************************/
		if(claimresponseerror.hasDetailSequence()) {
			c.setClmRspsErrorDtlSqnc(String.valueOf(claimresponseerror.getDetailSequence()));
		}
		/******************** claimresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimresponseidentifier = claimresponse.getIdentifierFirstRep();

		/******************** ClmRsps_Id_Vl ********************************************************************************/
		if(claimresponseidentifier.hasValue()) {
			c.setClmRspsIdVl(String.valueOf(claimresponseidentifier.getValue()));
		}
		/******************** claimresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseidentifiertype = claimresponseidentifier.getType();

		/******************** claimresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseidentifiertypecoding = claimresponseidentifiertype.getCodingFirstRep();

		/******************** ClmRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponseidentifiertypecoding.hasDisplay()) {
			c.setClmRspsIdTypCdgDsply(String.valueOf(claimresponseidentifiertypecoding.getDisplay()));
		}
		/******************** ClmRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponseidentifiertypecoding.hasVersion()) {
			c.setClmRspsIdTypCdgVrsn(String.valueOf(claimresponseidentifiertypecoding.getVersion()));
		}
		/******************** ClmRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponseidentifiertypecoding.hasCode()) {
			c.setClmRspsIdTypCdgCd(String.valueOf(claimresponseidentifiertypecoding.getCode()));
		}
		/******************** ClmRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponseidentifiertypecoding.hasSystem()) {
			c.setClmRspsIdTypCdgSys(String.valueOf(claimresponseidentifiertypecoding.getSystem()));
		}
		/******************** ClmRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseidentifiertypecoding.hasUserSelected()) {
			c.setClmRspsIdTypCdgUsrSltd(String.valueOf(claimresponseidentifiertypecoding.getUserSelected()));
		}
		/******************** ClmRsps_Id_Typ_Txt ********************************************************************************/
		if(claimresponseidentifiertype.hasText()) {
			c.setClmRspsIdTypTxt(String.valueOf(claimresponseidentifiertype.getText()));
		}
		/******************** ClmRsps_Id_Sys ********************************************************************************/
		if(claimresponseidentifier.hasSystem()) {
			c.setClmRspsIdSys(String.valueOf(claimresponseidentifier.getSystem()));
		}
		/******************** ClmRsps_Id_Assigner ********************************************************************************/
		if(claimresponseidentifier.hasAssigner()) {
			c.setClmRspsIdAssigner(String.valueOf(claimresponseidentifier.getAssigner()));
		}
		/******************** claimresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseidentifierperiod = claimresponseidentifier.getPeriod();

		/******************** ClmRsps_Id_Prd_End ********************************************************************************/
		if(claimresponseidentifierperiod.hasEnd()) {
			c.setClmRspsIdPrdEnd(String.valueOf(claimresponseidentifierperiod.getEnd()));
		}
		/******************** ClmRsps_Id_Prd_Strt ********************************************************************************/
		if(claimresponseidentifierperiod.hasStart()) {
			c.setClmRspsIdPrdStrt(String.valueOf(claimresponseidentifierperiod.getStart()));
		}
		/******************** claimresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimresponseidentifieruse = claimresponseidentifier.getUse();
		c.setClmRspsIdUse(claimresponseidentifieruse.toCode());

		/******************** claimresponsesubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsesubtype = claimresponse.getSubType();

		/******************** claimresponsesubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsesubtypecoding = claimresponsesubtype.getCodingFirstRep();

		/******************** ClmRsps_SubTyp_Cdg_Dsply ********************************************************************************/
		if(claimresponsesubtypecoding.hasDisplay()) {
			c.setClmRspsSubTypCdgDsply(String.valueOf(claimresponsesubtypecoding.getDisplay()));
		}
		/******************** ClmRsps_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(claimresponsesubtypecoding.hasVersion()) {
			c.setClmRspsSubTypCdgVrsn(String.valueOf(claimresponsesubtypecoding.getVersion()));
		}
		/******************** ClmRsps_SubTyp_Cdg_Cd ********************************************************************************/
		if(claimresponsesubtypecoding.hasCode()) {
			c.setClmRspsSubTypCdgCd(String.valueOf(claimresponsesubtypecoding.getCode()));
		}
		/******************** ClmRsps_SubTyp_Cdg_Sys ********************************************************************************/
		if(claimresponsesubtypecoding.hasSystem()) {
			c.setClmRspsSubTypCdgSys(String.valueOf(claimresponsesubtypecoding.getSystem()));
		}
		/******************** ClmRsps_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsesubtypecoding.hasUserSelected()) {
			c.setClmRspsSubTypCdgUsrSltd(String.valueOf(claimresponsesubtypecoding.getUserSelected()));
		}
		/******************** ClmRsps_SubTyp_Txt ********************************************************************************/
		if(claimresponsesubtype.hasText()) {
			c.setClmRspsSubTypTxt(String.valueOf(claimresponsesubtype.getText()));
		}
		/******************** claimresponseitem ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ItemComponent claimresponseitem = claimresponse.getItemFirstRep();

		/******************** claimresponseitemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseitemadjudication = claimresponseitem.getAdjudicationFirstRep();

		/******************** ClmRsps_Itm_Adjdctn_Vl ********************************************************************************/
		if(claimresponseitemadjudication.hasValue()) {
			c.setClmRspsItmAdjdctnVl(String.valueOf(claimresponseitemadjudication.getValue()));
		}
		/******************** claimresponseitemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemadjudicationreason = claimresponseitemadjudication.getReason();

		/******************** claimresponseitemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemadjudicationreasoncoding = claimresponseitemadjudicationreason.getCodingFirstRep();

		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemadjudicationreasoncoding.hasDisplay()) {
			c.setClmRspsItmAdjdctnRsnCdgDsply(String.valueOf(claimresponseitemadjudicationreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemadjudicationreasoncoding.hasVersion()) {
			c.setClmRspsItmAdjdctnRsnCdgVrsn(String.valueOf(claimresponseitemadjudicationreasoncoding.getVersion()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseitemadjudicationreasoncoding.hasCode()) {
			c.setClmRspsItmAdjdctnRsnCdgCd(String.valueOf(claimresponseitemadjudicationreasoncoding.getCode()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseitemadjudicationreasoncoding.hasSystem()) {
			c.setClmRspsItmAdjdctnRsnCdgSys(String.valueOf(claimresponseitemadjudicationreasoncoding.getSystem()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemadjudicationreasoncoding.hasUserSelected()) {
			c.setClmRspsItmAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseitemadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseitemadjudicationreason.hasText()) {
			c.setClmRspsItmAdjdctnRsnTxt(String.valueOf(claimresponseitemadjudicationreason.getText()));
		}
		/******************** claimresponseitemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemadjudicationcategory = claimresponseitemadjudication.getCategory();

		/******************** claimresponseitemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemadjudicationcategorycoding = claimresponseitemadjudicationcategory.getCodingFirstRep();

		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemadjudicationcategorycoding.hasDisplay()) {
			c.setClmRspsItmAdjdctnCtgryCdgDsply(String.valueOf(claimresponseitemadjudicationcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemadjudicationcategorycoding.hasVersion()) {
			c.setClmRspsItmAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseitemadjudicationcategorycoding.getVersion()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseitemadjudicationcategorycoding.hasCode()) {
			c.setClmRspsItmAdjdctnCtgryCdgCd(String.valueOf(claimresponseitemadjudicationcategorycoding.getCode()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseitemadjudicationcategorycoding.hasSystem()) {
			c.setClmRspsItmAdjdctnCtgryCdgSys(String.valueOf(claimresponseitemadjudicationcategorycoding.getSystem()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemadjudicationcategorycoding.hasUserSelected()) {
			c.setClmRspsItmAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseitemadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseitemadjudicationcategory.hasText()) {
			c.setClmRspsItmAdjdctnCtgryTxt(String.valueOf(claimresponseitemadjudicationcategory.getText()));
		}
		/******************** claimresponseitemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemadjudicationamount = claimresponseitemadjudication.getAmount();

		/******************** ClmRsps_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseitemadjudicationamount.hasValue()) {
			c.setClmRspsItmAdjdctnAmntVl(String.valueOf(claimresponseitemadjudicationamount.getValue()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseitemadjudicationamount.hasCurrency()) {
			c.setClmRspsItmAdjdctnAmntCrncy(String.valueOf(claimresponseitemadjudicationamount.getCurrency()));
		}
		/******************** claimresponseitemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent claimresponseitemdetail = claimresponseitem.getDetailFirstRep();

		/******************** claimresponseitemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseitemdetailadjudication = claimresponseitemdetail.getAdjudicationFirstRep();

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseitemdetailadjudication.hasValue()) {
			c.setClmRspsItmDtlAdjdctnVl(String.valueOf(claimresponseitemdetailadjudication.getValue()));
		}
		/******************** claimresponseitemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailadjudicationreason = claimresponseitemdetailadjudication.getReason();

		/******************** claimresponseitemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailadjudicationreasoncoding = claimresponseitemdetailadjudicationreason.getCodingFirstRep();

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncoding.hasDisplay()) {
			c.setClmRspsItmDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncoding.hasVersion()) {
			c.setClmRspsItmDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncoding.hasCode()) {
			c.setClmRspsItmDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncoding.hasSystem()) {
			c.setClmRspsItmDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncoding.hasUserSelected()) {
			c.setClmRspsItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseitemdetailadjudicationreason.hasText()) {
			c.setClmRspsItmDtlAdjdctnRsnTxt(String.valueOf(claimresponseitemdetailadjudicationreason.getText()));
		}
		/******************** claimresponseitemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailadjudicationcategory = claimresponseitemdetailadjudication.getCategory();

		/******************** claimresponseitemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailadjudicationcategorycoding = claimresponseitemdetailadjudicationcategory.getCodingFirstRep();

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycoding.hasDisplay()) {
			c.setClmRspsItmDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycoding.hasVersion()) {
			c.setClmRspsItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycoding.hasCode()) {
			c.setClmRspsItmDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycoding.hasSystem()) {
			c.setClmRspsItmDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycoding.hasUserSelected()) {
			c.setClmRspsItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategory.hasText()) {
			c.setClmRspsItmDtlAdjdctnCtgryTxt(String.valueOf(claimresponseitemdetailadjudicationcategory.getText()));
		}
		/******************** claimresponseitemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemdetailadjudicationamount = claimresponseitemdetailadjudication.getAmount();

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseitemdetailadjudicationamount.hasValue()) {
			c.setClmRspsItmDtlAdjdctnAmntVl(String.valueOf(claimresponseitemdetailadjudicationamount.getValue()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseitemdetailadjudicationamount.hasCurrency()) {
			c.setClmRspsItmDtlAdjdctnAmntCrncy(String.valueOf(claimresponseitemdetailadjudicationamount.getCurrency()));
		}
		/******************** claimresponseitemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent claimresponseitemdetailsubdetail = claimresponseitemdetail.getSubDetailFirstRep();

		/******************** claimresponseitemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseitemdetailsubdetailadjudication = claimresponseitemdetailsubdetail.getAdjudicationFirstRep();

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudication.hasValue()) {
			c.setClmRspsItmDtlSubDtlAdjdctnVl(String.valueOf(claimresponseitemdetailsubdetailadjudication.getValue()));
		}
		/******************** claimresponseitemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailsubdetailadjudicationreason = claimresponseitemdetailsubdetailadjudication.getReason();

		/******************** claimresponseitemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailsubdetailadjudicationreasoncoding = claimresponseitemdetailsubdetailadjudicationreason.getCodingFirstRep();

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {
			c.setClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasVersion()) {
			c.setClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasCode()) {
			c.setClmRspsItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasSystem()) {
			c.setClmRspsItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {
			c.setClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreason.hasText()) {
			c.setClmRspsItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(claimresponseitemdetailsubdetailadjudicationreason.getText()));
		}
		/******************** claimresponseitemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailsubdetailadjudicationcategory = claimresponseitemdetailsubdetailadjudication.getCategory();

		/******************** claimresponseitemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailsubdetailadjudicationcategorycoding = claimresponseitemdetailsubdetailadjudicationcategory.getCodingFirstRep();

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {
			c.setClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasVersion()) {
			c.setClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasCode()) {
			c.setClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasSystem()) {
			c.setClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {
			c.setClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategory.hasText()) {
			c.setClmRspsItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategory.getText()));
		}
		/******************** claimresponseitemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemdetailsubdetailadjudicationamount = claimresponseitemdetailsubdetailadjudication.getAmount();

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationamount.hasValue()) {
			c.setClmRspsItmDtlSubDtlAdjdctnAmntVl(String.valueOf(claimresponseitemdetailsubdetailadjudicationamount.getValue()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationamount.hasCurrency()) {
			c.setClmRspsItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(claimresponseitemdetailsubdetailadjudicationamount.getCurrency()));
		}
		/******************** claimresponsepayment ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.PaymentComponent claimresponsepayment = claimresponse.getPayment();

		/******************** claimresponsepaymenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymenttype = claimresponsepayment.getType();

		/******************** claimresponsepaymenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepaymenttypecoding = claimresponsepaymenttype.getCodingFirstRep();

		/******************** ClmRsps_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponsepaymenttypecoding.hasDisplay()) {
			c.setClmRspsPymntTypCdgDsply(String.valueOf(claimresponsepaymenttypecoding.getDisplay()));
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepaymenttypecoding.hasVersion()) {
			c.setClmRspsPymntTypCdgVrsn(String.valueOf(claimresponsepaymenttypecoding.getVersion()));
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponsepaymenttypecoding.hasCode()) {
			c.setClmRspsPymntTypCdgCd(String.valueOf(claimresponsepaymenttypecoding.getCode()));
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponsepaymenttypecoding.hasSystem()) {
			c.setClmRspsPymntTypCdgSys(String.valueOf(claimresponsepaymenttypecoding.getSystem()));
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepaymenttypecoding.hasUserSelected()) {
			c.setClmRspsPymntTypCdgUsrSltd(String.valueOf(claimresponsepaymenttypecoding.getUserSelected()));
		}
		/******************** ClmRsps_Pymnt_Typ_Txt ********************************************************************************/
		if(claimresponsepaymenttype.hasText()) {
			c.setClmRspsPymntTypTxt(String.valueOf(claimresponsepaymenttype.getText()));
		}
		/******************** ClmRsps_Pymnt_Dt ********************************************************************************/
		if(claimresponsepayment.hasDate()) {
			c.setClmRspsPymntDt(String.valueOf(claimresponsepayment.getDate()));
		}
		/******************** claimresponsepaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimresponsepaymentidentifier = claimresponsepayment.getIdentifier();

		/******************** ClmRsps_Pymnt_Id_Vl ********************************************************************************/
		if(claimresponsepaymentidentifier.hasValue()) {
			c.setClmRspsPymntIdVl(String.valueOf(claimresponsepaymentidentifier.getValue()));
		}
		/******************** claimresponsepaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymentidentifiertype = claimresponsepaymentidentifier.getType();

		/******************** claimresponsepaymentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepaymentidentifiertypecoding = claimresponsepaymentidentifiertype.getCodingFirstRep();

		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponsepaymentidentifiertypecoding.hasDisplay()) {
			c.setClmRspsPymntIdTypCdgDsply(String.valueOf(claimresponsepaymentidentifiertypecoding.getDisplay()));
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepaymentidentifiertypecoding.hasVersion()) {
			c.setClmRspsPymntIdTypCdgVrsn(String.valueOf(claimresponsepaymentidentifiertypecoding.getVersion()));
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponsepaymentidentifiertypecoding.hasCode()) {
			c.setClmRspsPymntIdTypCdgCd(String.valueOf(claimresponsepaymentidentifiertypecoding.getCode()));
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponsepaymentidentifiertypecoding.hasSystem()) {
			c.setClmRspsPymntIdTypCdgSys(String.valueOf(claimresponsepaymentidentifiertypecoding.getSystem()));
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepaymentidentifiertypecoding.hasUserSelected()) {
			c.setClmRspsPymntIdTypCdgUsrSltd(String.valueOf(claimresponsepaymentidentifiertypecoding.getUserSelected()));
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(claimresponsepaymentidentifiertype.hasText()) {
			c.setClmRspsPymntIdTypTxt(String.valueOf(claimresponsepaymentidentifiertype.getText()));
		}
		/******************** ClmRsps_Pymnt_Id_Sys ********************************************************************************/
		if(claimresponsepaymentidentifier.hasSystem()) {
			c.setClmRspsPymntIdSys(String.valueOf(claimresponsepaymentidentifier.getSystem()));
		}
		/******************** ClmRsps_Pymnt_Id_Assigner ********************************************************************************/
		if(claimresponsepaymentidentifier.hasAssigner()) {
			c.setClmRspsPymntIdAssigner(String.valueOf(claimresponsepaymentidentifier.getAssigner()));
		}
		/******************** claimresponsepaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponsepaymentidentifierperiod = claimresponsepaymentidentifier.getPeriod();

		/******************** ClmRsps_Pymnt_Id_Prd_End ********************************************************************************/
		if(claimresponsepaymentidentifierperiod.hasEnd()) {
			c.setClmRspsPymntIdPrdEnd(String.valueOf(claimresponsepaymentidentifierperiod.getEnd()));
		}
		/******************** ClmRsps_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(claimresponsepaymentidentifierperiod.hasStart()) {
			c.setClmRspsPymntIdPrdStrt(String.valueOf(claimresponsepaymentidentifierperiod.getStart()));
		}
		/******************** claimresponsepaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimresponsepaymentidentifieruse = claimresponsepaymentidentifier.getUse();
		c.setClmRspsPymntIdUse(claimresponsepaymentidentifieruse.toCode());

		/******************** claimresponsepaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsepaymentamount = claimresponsepayment.getAmount();

		/******************** ClmRsps_Pymnt_Amnt_Vl ********************************************************************************/
		if(claimresponsepaymentamount.hasValue()) {
			c.setClmRspsPymntAmntVl(String.valueOf(claimresponsepaymentamount.getValue()));
		}
		/******************** ClmRsps_Pymnt_Amnt_Crncy ********************************************************************************/
		if(claimresponsepaymentamount.hasCurrency()) {
			c.setClmRspsPymntAmntCrncy(String.valueOf(claimresponsepaymentamount.getCurrency()));
		}
		/******************** claimresponsepaymentadjustmentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymentadjustmentreason = claimresponsepayment.getAdjustmentReason();

		/******************** claimresponsepaymentadjustmentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepaymentadjustmentreasoncoding = claimresponsepaymentadjustmentreason.getCodingFirstRep();

		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncoding.hasDisplay()) {
			c.setClmRspsPymntAdjustmentRsnCdgDsply(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncoding.hasVersion()) {
			c.setClmRspsPymntAdjustmentRsnCdgVrsn(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getVersion()));
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncoding.hasCode()) {
			c.setClmRspsPymntAdjustmentRsnCdgCd(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getCode()));
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncoding.hasSystem()) {
			c.setClmRspsPymntAdjustmentRsnCdgSys(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getSystem()));
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncoding.hasUserSelected()) {
			c.setClmRspsPymntAdjustmentRsnCdgUsrSltd(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(claimresponsepaymentadjustmentreason.hasText()) {
			c.setClmRspsPymntAdjustmentRsnTxt(String.valueOf(claimresponsepaymentadjustmentreason.getText()));
		}
		/******************** claimresponsepaymentadjustment ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsepaymentadjustment = claimresponsepayment.getAdjustment();

		/******************** ClmRsps_Pymnt_Adjustment_Vl ********************************************************************************/
		if(claimresponsepaymentadjustment.hasValue()) {
			c.setClmRspsPymntAdjustmentVl(String.valueOf(claimresponsepaymentadjustment.getValue()));
		}
		/******************** ClmRsps_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(claimresponsepaymentadjustment.hasCurrency()) {
			c.setClmRspsPymntAdjustmentCrncy(String.valueOf(claimresponsepaymentadjustment.getCurrency()));
		}
		/******************** claimresponsetotal ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.TotalComponent claimresponsetotal = claimresponse.getTotalFirstRep();

		/******************** claimresponsetotalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsetotalcategory = claimresponsetotal.getCategory();

		/******************** claimresponsetotalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsetotalcategorycoding = claimresponsetotalcategory.getCodingFirstRep();

		/******************** ClmRsps_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponsetotalcategorycoding.hasDisplay()) {
			c.setClmRspsTotalCtgryCdgDsply(String.valueOf(claimresponsetotalcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponsetotalcategorycoding.hasVersion()) {
			c.setClmRspsTotalCtgryCdgVrsn(String.valueOf(claimresponsetotalcategorycoding.getVersion()));
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponsetotalcategorycoding.hasCode()) {
			c.setClmRspsTotalCtgryCdgCd(String.valueOf(claimresponsetotalcategorycoding.getCode()));
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponsetotalcategorycoding.hasSystem()) {
			c.setClmRspsTotalCtgryCdgSys(String.valueOf(claimresponsetotalcategorycoding.getSystem()));
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsetotalcategorycoding.hasUserSelected()) {
			c.setClmRspsTotalCtgryCdgUsrSltd(String.valueOf(claimresponsetotalcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_Total_Ctgry_Txt ********************************************************************************/
		if(claimresponsetotalcategory.hasText()) {
			c.setClmRspsTotalCtgryTxt(String.valueOf(claimresponsetotalcategory.getText()));
		}
		/******************** claimresponsetotalamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsetotalamount = claimresponsetotal.getAmount();

		/******************** ClmRsps_Total_Amnt_Vl ********************************************************************************/
		if(claimresponsetotalamount.hasValue()) {
			c.setClmRspsTotalAmntVl(String.valueOf(claimresponsetotalamount.getValue()));
		}
		/******************** ClmRsps_Total_Amnt_Crncy ********************************************************************************/
		if(claimresponsetotalamount.hasCurrency()) {
			c.setClmRspsTotalAmntCrncy(String.valueOf(claimresponsetotalamount.getCurrency()));
		}
		/******************** claimresponseadditem ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent claimresponseadditem = claimresponse.getAddItemFirstRep();

		/******************** claimresponseadditemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadditemadjudication = claimresponseadditem.getAdjudicationFirstRep();

		/******************** ClmRsps_AddItm_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadditemadjudication.hasValue()) {
			c.setClmRspsAddItmAdjdctnVl(String.valueOf(claimresponseadditemadjudication.getValue()));
		}
		/******************** claimresponseadditemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemadjudicationreason = claimresponseadditemadjudication.getReason();

		/******************** claimresponseadditemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemadjudicationreasoncoding = claimresponseadditemadjudicationreason.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncoding.hasDisplay()) {
			c.setClmRspsAddItmAdjdctnRsnCdgDsply(String.valueOf(claimresponseadditemadjudicationreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncoding.hasVersion()) {
			c.setClmRspsAddItmAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadditemadjudicationreasoncoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncoding.hasCode()) {
			c.setClmRspsAddItmAdjdctnRsnCdgCd(String.valueOf(claimresponseadditemadjudicationreasoncoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncoding.hasSystem()) {
			c.setClmRspsAddItmAdjdctnRsnCdgSys(String.valueOf(claimresponseadditemadjudicationreasoncoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncoding.hasUserSelected()) {
			c.setClmRspsAddItmAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadditemadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadditemadjudicationreason.hasText()) {
			c.setClmRspsAddItmAdjdctnRsnTxt(String.valueOf(claimresponseadditemadjudicationreason.getText()));
		}
		/******************** claimresponseadditemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemadjudicationcategory = claimresponseadditemadjudication.getCategory();

		/******************** claimresponseadditemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemadjudicationcategorycoding = claimresponseadditemadjudicationcategory.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycoding.hasDisplay()) {
			c.setClmRspsAddItmAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadditemadjudicationcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycoding.hasVersion()) {
			c.setClmRspsAddItmAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadditemadjudicationcategorycoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycoding.hasCode()) {
			c.setClmRspsAddItmAdjdctnCtgryCdgCd(String.valueOf(claimresponseadditemadjudicationcategorycoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycoding.hasSystem()) {
			c.setClmRspsAddItmAdjdctnCtgryCdgSys(String.valueOf(claimresponseadditemadjudicationcategorycoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycoding.hasUserSelected()) {
			c.setClmRspsAddItmAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadditemadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadditemadjudicationcategory.hasText()) {
			c.setClmRspsAddItmAdjdctnCtgryTxt(String.valueOf(claimresponseadditemadjudicationcategory.getText()));
		}
		/******************** claimresponseadditemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemadjudicationamount = claimresponseadditemadjudication.getAmount();

		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadditemadjudicationamount.hasValue()) {
			c.setClmRspsAddItmAdjdctnAmntVl(String.valueOf(claimresponseadditemadjudicationamount.getValue()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadditemadjudicationamount.hasCurrency()) {
			c.setClmRspsAddItmAdjdctnAmntCrncy(String.valueOf(claimresponseadditemadjudicationamount.getCurrency()));
		}
		/******************** ClmRsps_AddItm_LctnRfrnc ********************************************************************************/
		if(claimresponseadditem.hasLocationReference()) {
			c.setClmRspsAddItmLctnRfrnc(String.valueOf(claimresponseadditem.getLocationReference()));
		}
		/******************** claimresponseadditemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent claimresponseadditemdetail = claimresponseadditem.getDetailFirstRep();

		/******************** claimresponseadditemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadditemdetailadjudication = claimresponseadditemdetail.getAdjudicationFirstRep();

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadditemdetailadjudication.hasValue()) {
			c.setClmRspsAddItmDtlAdjdctnVl(String.valueOf(claimresponseadditemdetailadjudication.getValue()));
		}
		/******************** claimresponseadditemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailadjudicationreason = claimresponseadditemdetailadjudication.getReason();

		/******************** claimresponseadditemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailadjudicationreasoncoding = claimresponseadditemdetailadjudicationreason.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncoding.hasDisplay()) {
			c.setClmRspsAddItmDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncoding.hasVersion()) {
			c.setClmRspsAddItmDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncoding.hasCode()) {
			c.setClmRspsAddItmDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncoding.hasSystem()) {
			c.setClmRspsAddItmDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreason.hasText()) {
			c.setClmRspsAddItmDtlAdjdctnRsnTxt(String.valueOf(claimresponseadditemdetailadjudicationreason.getText()));
		}
		/******************** claimresponseadditemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailadjudicationcategory = claimresponseadditemdetailadjudication.getCategory();

		/******************** claimresponseadditemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailadjudicationcategorycoding = claimresponseadditemdetailadjudicationcategory.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycoding.hasDisplay()) {
			c.setClmRspsAddItmDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycoding.hasVersion()) {
			c.setClmRspsAddItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycoding.hasCode()) {
			c.setClmRspsAddItmDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycoding.hasSystem()) {
			c.setClmRspsAddItmDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategory.hasText()) {
			c.setClmRspsAddItmDtlAdjdctnCtgryTxt(String.valueOf(claimresponseadditemdetailadjudicationcategory.getText()));
		}
		/******************** claimresponseadditemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailadjudicationamount = claimresponseadditemdetailadjudication.getAmount();

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadditemdetailadjudicationamount.hasValue()) {
			c.setClmRspsAddItmDtlAdjdctnAmntVl(String.valueOf(claimresponseadditemdetailadjudicationamount.getValue()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadditemdetailadjudicationamount.hasCurrency()) {
			c.setClmRspsAddItmDtlAdjdctnAmntCrncy(String.valueOf(claimresponseadditemdetailadjudicationamount.getCurrency()));
		}
		/******************** claimresponseadditemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailproductorservice = claimresponseadditemdetail.getProductOrService();

		/******************** claimresponseadditemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailproductorservicecoding = claimresponseadditemdetailproductorservice.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecoding.hasDisplay()) {
			c.setClmRspsAddItmDtlPrdctOrSrvCdgDsply(String.valueOf(claimresponseadditemdetailproductorservicecoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecoding.hasVersion()) {
			c.setClmRspsAddItmDtlPrdctOrSrvCdgVrsn(String.valueOf(claimresponseadditemdetailproductorservicecoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecoding.hasCode()) {
			c.setClmRspsAddItmDtlPrdctOrSrvCdgCd(String.valueOf(claimresponseadditemdetailproductorservicecoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecoding.hasSystem()) {
			c.setClmRspsAddItmDtlPrdctOrSrvCdgSys(String.valueOf(claimresponseadditemdetailproductorservicecoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimresponseadditemdetailproductorservicecoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimresponseadditemdetailproductorservice.hasText()) {
			c.setClmRspsAddItmDtlPrdctOrSrvTxt(String.valueOf(claimresponseadditemdetailproductorservice.getText()));
		}
		/******************** claimresponseadditemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailmodifier = claimresponseadditemdetail.getModifierFirstRep();

		/******************** claimresponseadditemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailmodifiercoding = claimresponseadditemdetailmodifier.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailmodifiercoding.hasDisplay()) {
			c.setClmRspsAddItmDtlMdfrCdgDsply(String.valueOf(claimresponseadditemdetailmodifiercoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailmodifiercoding.hasVersion()) {
			c.setClmRspsAddItmDtlMdfrCdgVrsn(String.valueOf(claimresponseadditemdetailmodifiercoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailmodifiercoding.hasCode()) {
			c.setClmRspsAddItmDtlMdfrCdgCd(String.valueOf(claimresponseadditemdetailmodifiercoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailmodifiercoding.hasSystem()) {
			c.setClmRspsAddItmDtlMdfrCdgSys(String.valueOf(claimresponseadditemdetailmodifiercoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailmodifiercoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlMdfrCdgUsrSltd(String.valueOf(claimresponseadditemdetailmodifiercoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(claimresponseadditemdetailmodifier.hasText()) {
			c.setClmRspsAddItmDtlMdfrTxt(String.valueOf(claimresponseadditemdetailmodifier.getText()));
		}
		/******************** claimresponseadditemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent claimresponseadditemdetailsubdetail = claimresponseadditemdetail.getSubDetailFirstRep();

		/******************** claimresponseadditemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadditemdetailsubdetailadjudication = claimresponseadditemdetailsubdetail.getAdjudicationFirstRep();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudication.hasValue()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnVl(String.valueOf(claimresponseadditemdetailsubdetailadjudication.getValue()));
		}
		/******************** claimresponseadditemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailadjudicationreason = claimresponseadditemdetailsubdetailadjudication.getReason();

		/******************** claimresponseadditemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailadjudicationreasoncoding = claimresponseadditemdetailsubdetailadjudicationreason.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasVersion()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasCode()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasSystem()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreason.hasText()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreason.getText()));
		}
		/******************** claimresponseadditemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailadjudicationcategory = claimresponseadditemdetailsubdetailadjudication.getCategory();

		/******************** claimresponseadditemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailadjudicationcategorycoding = claimresponseadditemdetailsubdetailadjudicationcategory.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasVersion()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasCode()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasSystem()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategory.hasText()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategory.getText()));
		}
		/******************** claimresponseadditemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailadjudicationamount = claimresponseadditemdetailsubdetailadjudication.getAmount();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationamount.hasValue()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnAmntVl(String.valueOf(claimresponseadditemdetailsubdetailadjudicationamount.getValue()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationamount.hasCurrency()) {
			c.setClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(claimresponseadditemdetailsubdetailadjudicationamount.getCurrency()));
		}
		/******************** claimresponseadditemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailproductorservice = claimresponseadditemdetailsubdetail.getProductOrService();

		/******************** claimresponseadditemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailproductorservicecoding = claimresponseadditemdetailsubdetailproductorservice.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasDisplay()) {
			c.setClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasVersion()) {
			c.setClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasCode()) {
			c.setClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasSystem()) {
			c.setClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservice.hasText()) {
			c.setClmRspsAddItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(claimresponseadditemdetailsubdetailproductorservice.getText()));
		}
		/******************** claimresponseadditemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailmodifier = claimresponseadditemdetailsubdetail.getModifierFirstRep();

		/******************** claimresponseadditemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailmodifiercoding = claimresponseadditemdetailsubdetailmodifier.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasDisplay()) {
			c.setClmRspsAddItmDtlSubDtlMdfrCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasVersion()) {
			c.setClmRspsAddItmDtlSubDtlMdfrCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasCode()) {
			c.setClmRspsAddItmDtlSubDtlMdfrCdgCd(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasSystem()) {
			c.setClmRspsAddItmDtlSubDtlMdfrCdgSys(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasUserSelected()) {
			c.setClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifier.hasText()) {
			c.setClmRspsAddItmDtlSubDtlMdfrTxt(String.valueOf(claimresponseadditemdetailsubdetailmodifier.getText()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(claimresponseadditemdetailsubdetail.hasFactor()) {
			c.setClmRspsAddItmDtlSubDtlFactor(String.valueOf(claimresponseadditemdetailsubdetail.getFactor()));
		}
		/******************** claimresponseadditemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailnet = claimresponseadditemdetailsubdetail.getNet();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailnet.hasValue()) {
			c.setClmRspsAddItmDtlSubDtlNetVl(String.valueOf(claimresponseadditemdetailsubdetailnet.getValue()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(claimresponseadditemdetailsubdetailnet.hasCurrency()) {
			c.setClmRspsAddItmDtlSubDtlNetCrncy(String.valueOf(claimresponseadditemdetailsubdetailnet.getCurrency()));
		}
		/******************** claimresponseadditemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailunitprice = claimresponseadditemdetailsubdetail.getUnitPrice();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailunitprice.hasValue()) {
			c.setClmRspsAddItmDtlSubDtlUntPriceVl(String.valueOf(claimresponseadditemdetailsubdetailunitprice.getValue()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(claimresponseadditemdetailsubdetailunitprice.hasCurrency()) {
			c.setClmRspsAddItmDtlSubDtlUntPriceCrncy(String.valueOf(claimresponseadditemdetailsubdetailunitprice.getCurrency()));
		}
		/******************** claimresponseadditemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemdetailsubdetailquantity = claimresponseadditemdetailsubdetail.getQuantity();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasValue()) {
			c.setClmRspsAddItmDtlSubDtlQntyVl(String.valueOf(claimresponseadditemdetailsubdetailquantity.getValue()));
		}
		/******************** claimresponseadditemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimresponseadditemdetailsubdetailquantitycomparator = claimresponseadditemdetailsubdetailquantity.getComparator();
		c.setClmRspsAddItmDtlSubDtlQntyCmprtr(claimresponseadditemdetailsubdetailquantitycomparator.toCode());

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasCode()) {
			c.setClmRspsAddItmDtlSubDtlQntyCd(String.valueOf(claimresponseadditemdetailsubdetailquantity.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasSystem()) {
			c.setClmRspsAddItmDtlSubDtlQntySys(String.valueOf(claimresponseadditemdetailsubdetailquantity.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasUnit()) {
			c.setClmRspsAddItmDtlSubDtlQntyUnt(String.valueOf(claimresponseadditemdetailsubdetailquantity.getUnit()));
		}
		/******************** ClmRsps_AddItm_Dtl_Factor ********************************************************************************/
		if(claimresponseadditemdetail.hasFactor()) {
			c.setClmRspsAddItmDtlFactor(String.valueOf(claimresponseadditemdetail.getFactor()));
		}
		/******************** claimresponseadditemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailnet = claimresponseadditemdetail.getNet();

		/******************** ClmRsps_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(claimresponseadditemdetailnet.hasValue()) {
			c.setClmRspsAddItmDtlNetVl(String.valueOf(claimresponseadditemdetailnet.getValue()));
		}
		/******************** ClmRsps_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(claimresponseadditemdetailnet.hasCurrency()) {
			c.setClmRspsAddItmDtlNetCrncy(String.valueOf(claimresponseadditemdetailnet.getCurrency()));
		}
		/******************** claimresponseadditemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailunitprice = claimresponseadditemdetail.getUnitPrice();

		/******************** ClmRsps_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(claimresponseadditemdetailunitprice.hasValue()) {
			c.setClmRspsAddItmDtlUntPriceVl(String.valueOf(claimresponseadditemdetailunitprice.getValue()));
		}
		/******************** ClmRsps_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(claimresponseadditemdetailunitprice.hasCurrency()) {
			c.setClmRspsAddItmDtlUntPriceCrncy(String.valueOf(claimresponseadditemdetailunitprice.getCurrency()));
		}
		/******************** claimresponseadditemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemdetailquantity = claimresponseadditemdetail.getQuantity();

		/******************** ClmRsps_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasValue()) {
			c.setClmRspsAddItmDtlQntyVl(String.valueOf(claimresponseadditemdetailquantity.getValue()));
		}
		/******************** claimresponseadditemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimresponseadditemdetailquantitycomparator = claimresponseadditemdetailquantity.getComparator();
		c.setClmRspsAddItmDtlQntyCmprtr(claimresponseadditemdetailquantitycomparator.toCode());

		/******************** ClmRsps_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasCode()) {
			c.setClmRspsAddItmDtlQntyCd(String.valueOf(claimresponseadditemdetailquantity.getCode()));
		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasSystem()) {
			c.setClmRspsAddItmDtlQntySys(String.valueOf(claimresponseadditemdetailquantity.getSystem()));
		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasUnit()) {
			c.setClmRspsAddItmDtlQntyUnt(String.valueOf(claimresponseadditemdetailquantity.getUnit()));
		}
		/******************** claimresponseadditembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditembodysite = claimresponseadditem.getBodySite();

		/******************** claimresponseadditembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditembodysitecoding = claimresponseadditembodysite.getCodingFirstRep();

		/******************** ClmRsps_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditembodysitecoding.hasDisplay()) {
			c.setClmRspsAddItmBodySiteCdgDsply(String.valueOf(claimresponseadditembodysitecoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditembodysitecoding.hasVersion()) {
			c.setClmRspsAddItmBodySiteCdgVrsn(String.valueOf(claimresponseadditembodysitecoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(claimresponseadditembodysitecoding.hasCode()) {
			c.setClmRspsAddItmBodySiteCdgCd(String.valueOf(claimresponseadditembodysitecoding.getCode()));
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(claimresponseadditembodysitecoding.hasSystem()) {
			c.setClmRspsAddItmBodySiteCdgSys(String.valueOf(claimresponseadditembodysitecoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditembodysitecoding.hasUserSelected()) {
			c.setClmRspsAddItmBodySiteCdgUsrSltd(String.valueOf(claimresponseadditembodysitecoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_BodySite_Txt ********************************************************************************/
		if(claimresponseadditembodysite.hasText()) {
			c.setClmRspsAddItmBodySiteTxt(String.valueOf(claimresponseadditembodysite.getText()));
		}
		/******************** claimresponseadditemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemproductorservice = claimresponseadditem.getProductOrService();

		/******************** claimresponseadditemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemproductorservicecoding = claimresponseadditemproductorservice.getCodingFirstRep();

		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemproductorservicecoding.hasDisplay()) {
			c.setClmRspsAddItmPrdctOrSrvCdgDsply(String.valueOf(claimresponseadditemproductorservicecoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemproductorservicecoding.hasVersion()) {
			c.setClmRspsAddItmPrdctOrSrvCdgVrsn(String.valueOf(claimresponseadditemproductorservicecoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemproductorservicecoding.hasCode()) {
			c.setClmRspsAddItmPrdctOrSrvCdgCd(String.valueOf(claimresponseadditemproductorservicecoding.getCode()));
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemproductorservicecoding.hasSystem()) {
			c.setClmRspsAddItmPrdctOrSrvCdgSys(String.valueOf(claimresponseadditemproductorservicecoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemproductorservicecoding.hasUserSelected()) {
			c.setClmRspsAddItmPrdctOrSrvCdgUsrSltd(String.valueOf(claimresponseadditemproductorservicecoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(claimresponseadditemproductorservice.hasText()) {
			c.setClmRspsAddItmPrdctOrSrvTxt(String.valueOf(claimresponseadditemproductorservice.getText()));
		}
		/******************** claimresponseadditemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemmodifier = claimresponseadditem.getModifierFirstRep();

		/******************** claimresponseadditemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemmodifiercoding = claimresponseadditemmodifier.getCodingFirstRep();

		/******************** ClmRsps_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemmodifiercoding.hasDisplay()) {
			c.setClmRspsAddItmMdfrCdgDsply(String.valueOf(claimresponseadditemmodifiercoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemmodifiercoding.hasVersion()) {
			c.setClmRspsAddItmMdfrCdgVrsn(String.valueOf(claimresponseadditemmodifiercoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemmodifiercoding.hasCode()) {
			c.setClmRspsAddItmMdfrCdgCd(String.valueOf(claimresponseadditemmodifiercoding.getCode()));
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemmodifiercoding.hasSystem()) {
			c.setClmRspsAddItmMdfrCdgSys(String.valueOf(claimresponseadditemmodifiercoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemmodifiercoding.hasUserSelected()) {
			c.setClmRspsAddItmMdfrCdgUsrSltd(String.valueOf(claimresponseadditemmodifiercoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_Mdfr_Txt ********************************************************************************/
		if(claimresponseadditemmodifier.hasText()) {
			c.setClmRspsAddItmMdfrTxt(String.valueOf(claimresponseadditemmodifier.getText()));
		}
		/******************** ClmRsps_AddItm_Provider ********************************************************************************/
		if(claimresponseadditem.hasProvider()) {
			c.setClmRspsAddItmProvider(String.valueOf(claimresponseadditem.getProviderFirstRep()));
		}
		/******************** claimresponseadditemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemprogramcode = claimresponseadditem.getProgramCodeFirstRep();

		/******************** claimresponseadditemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemprogramcodecoding = claimresponseadditemprogramcode.getCodingFirstRep();

		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemprogramcodecoding.hasDisplay()) {
			c.setClmRspsAddItmPrgrmCdCdgDsply(String.valueOf(claimresponseadditemprogramcodecoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemprogramcodecoding.hasVersion()) {
			c.setClmRspsAddItmPrgrmCdCdgVrsn(String.valueOf(claimresponseadditemprogramcodecoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemprogramcodecoding.hasCode()) {
			c.setClmRspsAddItmPrgrmCdCdgCd(String.valueOf(claimresponseadditemprogramcodecoding.getCode()));
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemprogramcodecoding.hasSystem()) {
			c.setClmRspsAddItmPrgrmCdCdgSys(String.valueOf(claimresponseadditemprogramcodecoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemprogramcodecoding.hasUserSelected()) {
			c.setClmRspsAddItmPrgrmCdCdgUsrSltd(String.valueOf(claimresponseadditemprogramcodecoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(claimresponseadditemprogramcode.hasText()) {
			c.setClmRspsAddItmPrgrmCdTxt(String.valueOf(claimresponseadditemprogramcode.getText()));
		}
		/******************** claimresponseadditemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemlocationcodeableconcept = claimresponseadditem.getLocationCodeableConcept();

		/******************** claimresponseadditemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemlocationcodeableconceptcoding = claimresponseadditemlocationcodeableconcept.getCodingFirstRep();

		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcoding.hasDisplay()) {
			c.setClmRspsAddItmLctnCdbleCncptCdgDsply(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcoding.hasVersion()) {
			c.setClmRspsAddItmLctnCdbleCncptCdgVrsn(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcoding.hasCode()) {
			c.setClmRspsAddItmLctnCdbleCncptCdgCd(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getCode()));
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcoding.hasSystem()) {
			c.setClmRspsAddItmLctnCdbleCncptCdgSys(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcoding.hasUserSelected()) {
			c.setClmRspsAddItmLctnCdbleCncptCdgUsrSltd(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(claimresponseadditemlocationcodeableconcept.hasText()) {
			c.setClmRspsAddItmLctnCdbleCncptTxt(String.valueOf(claimresponseadditemlocationcodeableconcept.getText()));
		}
		/******************** ClmRsps_AddItm_Factor ********************************************************************************/
		if(claimresponseadditem.hasFactor()) {
			c.setClmRspsAddItmFactor(String.valueOf(claimresponseadditem.getFactor()));
		}
		/******************** claimresponseadditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemnet = claimresponseadditem.getNet();

		/******************** ClmRsps_AddItm_Net_Vl ********************************************************************************/
		if(claimresponseadditemnet.hasValue()) {
			c.setClmRspsAddItmNetVl(String.valueOf(claimresponseadditemnet.getValue()));
		}
		/******************** ClmRsps_AddItm_Net_Crncy ********************************************************************************/
		if(claimresponseadditemnet.hasCurrency()) {
			c.setClmRspsAddItmNetCrncy(String.valueOf(claimresponseadditemnet.getCurrency()));
		}
		/******************** claimresponseadditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemunitprice = claimresponseadditem.getUnitPrice();

		/******************** ClmRsps_AddItm_UntPrice_Vl ********************************************************************************/
		if(claimresponseadditemunitprice.hasValue()) {
			c.setClmRspsAddItmUntPriceVl(String.valueOf(claimresponseadditemunitprice.getValue()));
		}
		/******************** ClmRsps_AddItm_UntPrice_Crncy ********************************************************************************/
		if(claimresponseadditemunitprice.hasCurrency()) {
			c.setClmRspsAddItmUntPriceCrncy(String.valueOf(claimresponseadditemunitprice.getCurrency()));
		}
		/******************** claimresponseadditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemquantity = claimresponseadditem.getQuantity();

		/******************** ClmRsps_AddItm_Qnty_Vl ********************************************************************************/
		if(claimresponseadditemquantity.hasValue()) {
			c.setClmRspsAddItmQntyVl(String.valueOf(claimresponseadditemquantity.getValue()));
		}
		/******************** claimresponseadditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimresponseadditemquantitycomparator = claimresponseadditemquantity.getComparator();
		c.setClmRspsAddItmQntyCmprtr(claimresponseadditemquantitycomparator.toCode());

		/******************** ClmRsps_AddItm_Qnty_Cd ********************************************************************************/
		if(claimresponseadditemquantity.hasCode()) {
			c.setClmRspsAddItmQntyCd(String.valueOf(claimresponseadditemquantity.getCode()));
		}
		/******************** ClmRsps_AddItm_Qnty_Sys ********************************************************************************/
		if(claimresponseadditemquantity.hasSystem()) {
			c.setClmRspsAddItmQntySys(String.valueOf(claimresponseadditemquantity.getSystem()));
		}
		/******************** ClmRsps_AddItm_Qnty_Unt ********************************************************************************/
		if(claimresponseadditemquantity.hasUnit()) {
			c.setClmRspsAddItmQntyUnt(String.valueOf(claimresponseadditemquantity.getUnit()));
		}
		/******************** claimresponseadditemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseadditemservicedperiod = claimresponseadditem.getServicedPeriod();

		/******************** ClmRsps_AddItm_SrvdPrd_End ********************************************************************************/
		if(claimresponseadditemservicedperiod.hasEnd()) {
			c.setClmRspsAddItmSrvdPrdEnd(String.valueOf(claimresponseadditemservicedperiod.getEnd()));
		}
		/******************** ClmRsps_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(claimresponseadditemservicedperiod.hasStart()) {
			c.setClmRspsAddItmSrvdPrdStrt(String.valueOf(claimresponseadditemservicedperiod.getStart()));
		}
		/******************** claimresponseadditemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimresponseadditemlocationaddress = claimresponseadditem.getLocationAddress();

		/******************** ClmRsps_AddItm_LctnAddr_State ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasState()) {
			c.setClmRspsAddItmLctnAddrState(String.valueOf(claimresponseadditemlocationaddress.getState()));
		}
		/******************** claimresponseadditemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType claimresponseadditemlocationaddresstype = claimresponseadditemlocationaddress.getType();
		c.setClmRspsAddItmLctnAddrTyp(claimresponseadditemlocationaddresstype.toCode());

		/******************** ClmRsps_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasCountry()) {
			c.setClmRspsAddItmLctnAddrCntry(String.valueOf(claimresponseadditemlocationaddress.getCountry()));
		}
		/******************** ClmRsps_AddItm_LctnAddr_Txt ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasText()) {
			c.setClmRspsAddItmLctnAddrTxt(String.valueOf(claimresponseadditemlocationaddress.getText()));
		}
		/******************** claimresponseadditemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseadditemlocationaddressperiod = claimresponseadditemlocationaddress.getPeriod();

		/******************** ClmRsps_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(claimresponseadditemlocationaddressperiod.hasEnd()) {
			c.setClmRspsAddItmLctnAddrPrdEnd(String.valueOf(claimresponseadditemlocationaddressperiod.getEnd()));
		}
		/******************** ClmRsps_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(claimresponseadditemlocationaddressperiod.hasStart()) {
			c.setClmRspsAddItmLctnAddrPrdStrt(String.valueOf(claimresponseadditemlocationaddressperiod.getStart()));
		}
		/******************** ClmRsps_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasPostalCode()) {
			c.setClmRspsAddItmLctnAddrPostalCd(String.valueOf(claimresponseadditemlocationaddress.getPostalCode()));
		}
		/******************** ClmRsps_AddItm_LctnAddr_City ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasCity()) {
			c.setClmRspsAddItmLctnAddrCity(String.valueOf(claimresponseadditemlocationaddress.getCity()));
		}
		/******************** ClmRsps_AddItm_LctnAddr_District ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasDistrict()) {
			c.setClmRspsAddItmLctnAddrDistrict(String.valueOf(claimresponseadditemlocationaddress.getDistrict()));
		}
		/******************** claimresponseadditemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse claimresponseadditemlocationaddressuse = claimresponseadditemlocationaddress.getUse();
		c.setClmRspsAddItmLctnAddrUse(claimresponseadditemlocationaddressuse.toCode());

		/******************** claimresponseadditemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemsubsite = claimresponseadditem.getSubSiteFirstRep();

		/******************** claimresponseadditemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemsubsitecoding = claimresponseadditemsubsite.getCodingFirstRep();

		/******************** ClmRsps_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemsubsitecoding.hasDisplay()) {
			c.setClmRspsAddItmSubSiteCdgDsply(String.valueOf(claimresponseadditemsubsitecoding.getDisplay()));
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemsubsitecoding.hasVersion()) {
			c.setClmRspsAddItmSubSiteCdgVrsn(String.valueOf(claimresponseadditemsubsitecoding.getVersion()));
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemsubsitecoding.hasCode()) {
			c.setClmRspsAddItmSubSiteCdgCd(String.valueOf(claimresponseadditemsubsitecoding.getCode()));
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemsubsitecoding.hasSystem()) {
			c.setClmRspsAddItmSubSiteCdgSys(String.valueOf(claimresponseadditemsubsitecoding.getSystem()));
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemsubsitecoding.hasUserSelected()) {
			c.setClmRspsAddItmSubSiteCdgUsrSltd(String.valueOf(claimresponseadditemsubsitecoding.getUserSelected()));
		}
		/******************** ClmRsps_AddItm_SubSite_Txt ********************************************************************************/
		if(claimresponseadditemsubsite.hasText()) {
			c.setClmRspsAddItmSubSiteTxt(String.valueOf(claimresponseadditemsubsite.getText()));
		}
		/******************** ClmRsps_AddItm_SrvdDtTyp ********************************************************************************/
		if(claimresponseadditem.hasServicedDateType()) {
			c.setClmRspsAddItmSrvdDtTyp(String.valueOf(claimresponseadditem.getServicedDateType()));
		}
		/******************** claimresponseform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment claimresponseform = claimresponse.getForm();

		/******************** ClmRsps_Frm_Sz ********************************************************************************/
		if(claimresponseform.hasSize()) {
			c.setClmRspsFrmSz(String.valueOf(claimresponseform.getSize()));
		}
		/******************** ClmRsps_Frm_Lnguage ********************************************************************************/
		if(claimresponseform.hasLanguage()) {
			c.setClmRspsFrmLnguage(String.valueOf(claimresponseform.getLanguage()));
		}
		/******************** ClmRsps_Frm_CntntTyp ********************************************************************************/
		if(claimresponseform.hasContentType()) {
			c.setClmRspsFrmCntntTyp(String.valueOf(claimresponseform.getContentType()));
		}
		/******************** ClmRsps_Frm_Url ********************************************************************************/
		if(claimresponseform.hasUrl()) {
			c.setClmRspsFrmUrl(String.valueOf(claimresponseform.getUrl()));
		}
		/******************** ClmRsps_Frm_Ttl ********************************************************************************/
		if(claimresponseform.hasTitle()) {
			c.setClmRspsFrmTtl(String.valueOf(claimresponseform.getTitle()));
		}
		/******************** ClmRsps_Frm_Hash ********************************************************************************/
		if(claimresponseform.hasHash()) {
			c.setClmRspsFrmHash(String.valueOf(claimresponseform.getHash()));
		}

		/******************** ClmRsps_Frm_Data ********************************************************************************/
		if(claimresponseform.hasData()) {
			c.setClmRspsFrmData(String.valueOf(claimresponseform.getData()));
		}

		/******************** ClmRsps_Frm_Creation ********************************************************************************/
		if(claimresponseform.hasCreation()) {
			c.setClmRspsFrmCreation(String.valueOf(claimresponseform.getCreation()));
		}
		/******************** claimresponsepreauthperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponsepreauthperiod = claimresponse.getPreAuthPeriod();

		/******************** ClmRsps_PreAuthPrd_End ********************************************************************************/
		if(claimresponsepreauthperiod.hasEnd()) {
			c.setClmRspsPreAuthPrdEnd(String.valueOf(claimresponsepreauthperiod.getEnd()));
		}
		/******************** ClmRsps_PreAuthPrd_Strt ********************************************************************************/
		if(claimresponsepreauthperiod.hasStart()) {
			c.setClmRspsPreAuthPrdStrt(String.valueOf(claimresponsepreauthperiod.getStart()));
		}
		/******************** claimresponsepayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepayeetype = claimresponse.getPayeeType();

		/******************** claimresponsepayeetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepayeetypecoding = claimresponsepayeetype.getCodingFirstRep();

		/******************** ClmRsps_PayeeTyp_Cdg_Dsply ********************************************************************************/
		if(claimresponsepayeetypecoding.hasDisplay()) {
			c.setClmRspsPayeeTypCdgDsply(String.valueOf(claimresponsepayeetypecoding.getDisplay()));
		}
		/******************** ClmRsps_PayeeTyp_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepayeetypecoding.hasVersion()) {
			c.setClmRspsPayeeTypCdgVrsn(String.valueOf(claimresponsepayeetypecoding.getVersion()));
		}
		/******************** ClmRsps_PayeeTyp_Cdg_Cd ********************************************************************************/
		if(claimresponsepayeetypecoding.hasCode()) {
			c.setClmRspsPayeeTypCdgCd(String.valueOf(claimresponsepayeetypecoding.getCode()));
		}
		/******************** ClmRsps_PayeeTyp_Cdg_Sys ********************************************************************************/
		if(claimresponsepayeetypecoding.hasSystem()) {
			c.setClmRspsPayeeTypCdgSys(String.valueOf(claimresponsepayeetypecoding.getSystem()));
		}
		/******************** ClmRsps_PayeeTyp_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepayeetypecoding.hasUserSelected()) {
			c.setClmRspsPayeeTypCdgUsrSltd(String.valueOf(claimresponsepayeetypecoding.getUserSelected()));
		}
		/******************** ClmRsps_PayeeTyp_Txt ********************************************************************************/
		if(claimresponsepayeetype.hasText()) {
			c.setClmRspsPayeeTypTxt(String.valueOf(claimresponsepayeetype.getText()));
		}
		/******************** claimresponseuse ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.Use claimresponseuse = claimresponse.getUse();
		c.setClmRspsUse(claimresponseuse.toCode());

		/******************** claimresponsefundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsefundsreserve = claimresponse.getFundsReserve();

		/******************** claimresponsefundsreservecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsefundsreservecoding = claimresponsefundsreserve.getCodingFirstRep();

		/******************** ClmRsps_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(claimresponsefundsreservecoding.hasDisplay()) {
			c.setClmRspsFundsReserveCdgDsply(String.valueOf(claimresponsefundsreservecoding.getDisplay()));
		}
		/******************** ClmRsps_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(claimresponsefundsreservecoding.hasVersion()) {
			c.setClmRspsFundsReserveCdgVrsn(String.valueOf(claimresponsefundsreservecoding.getVersion()));
		}
		/******************** ClmRsps_FundsReserve_Cdg_Cd ********************************************************************************/
		if(claimresponsefundsreservecoding.hasCode()) {
			c.setClmRspsFundsReserveCdgCd(String.valueOf(claimresponsefundsreservecoding.getCode()));
		}
		/******************** ClmRsps_FundsReserve_Cdg_Sys ********************************************************************************/
		if(claimresponsefundsreservecoding.hasSystem()) {
			c.setClmRspsFundsReserveCdgSys(String.valueOf(claimresponsefundsreservecoding.getSystem()));
		}
		/******************** ClmRsps_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsefundsreservecoding.hasUserSelected()) {
			c.setClmRspsFundsReserveCdgUsrSltd(String.valueOf(claimresponsefundsreservecoding.getUserSelected()));
		}
		/******************** ClmRsps_FundsReserve_Txt ********************************************************************************/
		if(claimresponsefundsreserve.hasText()) {
			c.setClmRspsFundsReserveTxt(String.valueOf(claimresponsefundsreserve.getText()));
		}
		/******************** ClmRsps_PreAuthRef ********************************************************************************/
		if(claimresponse.hasPreAuthRef()) {
			c.setClmRspsPreAuthRef(String.valueOf(claimresponse.getPreAuthRef()));
		}
		/******************** claimresponseinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent claimresponseinsurance = claimresponse.getInsuranceFirstRep();

		/******************** ClmRsps_Insrnc_Cvg ********************************************************************************/
		if(claimresponseinsurance.hasCoverage()) {
			c.setClmRspsInsrncCvg(String.valueOf(claimresponseinsurance.getCoverage()));
		}
		/******************** ClmRsps_Insrnc_BusinessArrangement ********************************************************************************/
		if(claimresponseinsurance.hasBusinessArrangement()) {
			c.setClmRspsInsrncBusinessArrangement(String.valueOf(claimresponseinsurance.getBusinessArrangement()));
		}
		/******************** ClmRsps_Insrnc_Focal ********************************************************************************/
		if(claimresponseinsurance.hasFocal()) {
			c.setClmRspsInsrncFocal(String.valueOf(claimresponseinsurance.getFocal()));
		}
		/******************** ClmRsps_Insrnc_Sqnc ********************************************************************************/
		if(claimresponseinsurance.hasSequence()) {
			c.setClmRspsInsrncSqnc(String.valueOf(claimresponseinsurance.getSequence()));
		}
		/******************** ClmRsps_Insrnc_ClmRsps ********************************************************************************/
		if(claimresponseinsurance.hasClaimResponse()) {
			c.setClmRspsInsrncClmRsps(String.valueOf(claimresponseinsurance.getClaimResponse()));
		}
		return c;
	}
}
