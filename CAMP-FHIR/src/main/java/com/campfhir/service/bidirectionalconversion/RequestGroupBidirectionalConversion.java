package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RequestGroup;
public class RequestGroupBidirectionalConversion 
{
	public RequestGroup RequestGroups(org.hl7.fhir.r4.model.RequestGroup requestgroup) throws ParseException
	{
		 main.java.com.campfhir.model.RequestGroup r = new  main.java.com.campfhir.model.RequestGroup();

		/******************** id ********************************************************************************/
		r.setId(requestgroup.getIdElement().getIdPart());

		/******************** requestgrouppriority ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestPriority requestgrouppriority = requestgroup.getPriority();
		if(requestgrouppriority!=null) {
			r.addRqstGrpPriority(requestgrouppriority.toCode());
		} else {
			r.addRqstGrpPriority("NULL");
		}

		/******************** requestgroupaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent> requestgroupactionlist = requestgroup.getAction();
		for(int requestgroupactioni = 0; requestgroupactioni<requestgroupactionlist.size();requestgroupactioni++ ) {
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionComponent  requestgroupaction = requestgroupactionlist.get(requestgroupactioni);

		/******************** RqstGrp_Actn_Rsrc ********************************************************************************/
		if(requestgroupactioni == 0) {r.addRqstGrpActnRsrc("[");}
		if(requestgroupaction.hasResource()) {

			if(requestgroupaction.getResource().getReference() != null) {
			r.addRqstGrpActnRsrc(requestgroupaction.getResource().getReference());
			}
		} else {
			r.addRqstGrpActnRsrc("NULL");
		}

		if(requestgroupactioni == requestgroupactionlist.size()-1) {r.addRqstGrpActnRsrc("]");}


		/******************** requestgroupactionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestPriority requestgroupactionpriority = requestgroupaction.getPriority();
		if(requestgroupactionpriority!=null) {
		if(requestgroupactioni == 0) {

		r.addRqstGrpActnPriority("[");		}
			r.addRqstGrpActnPriority(requestgroupactionpriority.toCode());
		if(requestgroupactioni == requestgroupactionlist.size()-1) {

		r.addRqstGrpActnPriority("]");		}

		} else {
			r.addRqstGrpActnPriority("NULL");
		}

		/******************** requestgroupactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactiontype = requestgroupaction.getType();

		/******************** RqstGrp_Actn_Typ_Txt ********************************************************************************/
		if(requestgroupactioni == 0) {r.addRqstGrpActnTypTxt("[");}
		if(requestgroupactiontype.hasText()) {

			r.addRqstGrpActnTypTxt(String.valueOf(requestgroupactiontype.getText()));
		} else {
			r.addRqstGrpActnTypTxt("NULL");
		}

		if(requestgroupactioni == requestgroupactionlist.size()-1) {r.addRqstGrpActnTypTxt("]");}


		/******************** requestgroupactiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> requestgroupactiontypecodinglist = requestgroupactiontype.getCoding();
		for(int requestgroupactiontypecodingi = 0; requestgroupactiontypecodingi<requestgroupactiontypecodinglist.size();requestgroupactiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  requestgroupactiontypecoding = requestgroupactiontypecodinglist.get(requestgroupactiontypecodingi);

		/******************** RqstGrp_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(requestgroupactiontypecodingi == 0) {r.addRqstGrpActnTypCdgDsply("[[");}
		if(requestgroupactiontypecoding.hasDisplay()) {

			r.addRqstGrpActnTypCdgDsply(String.valueOf(requestgroupactiontypecoding.getDisplay()));
		} else {
			r.addRqstGrpActnTypCdgDsply("NULL");
		}

		if(requestgroupactiontypecodingi == requestgroupactiontypecodinglist.size()-1) {r.addRqstGrpActnTypCdgDsply("]]");}


		/******************** RqstGrp_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(requestgroupactiontypecodingi == 0) {r.addRqstGrpActnTypCdgVrsn("[[");}
		if(requestgroupactiontypecoding.hasVersion()) {

			r.addRqstGrpActnTypCdgVrsn(String.valueOf(requestgroupactiontypecoding.getVersion()));
		} else {
			r.addRqstGrpActnTypCdgVrsn("NULL");
		}

		if(requestgroupactiontypecodingi == requestgroupactiontypecodinglist.size()-1) {r.addRqstGrpActnTypCdgVrsn("]]");}


		/******************** RqstGrp_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(requestgroupactiontypecodingi == 0) {r.addRqstGrpActnTypCdgCd("[[");}
		if(requestgroupactiontypecoding.hasCode()) {

			r.addRqstGrpActnTypCdgCd(String.valueOf(requestgroupactiontypecoding.getCode()));
		} else {
			r.addRqstGrpActnTypCdgCd("NULL");
		}

		if(requestgroupactiontypecodingi == requestgroupactiontypecodinglist.size()-1) {r.addRqstGrpActnTypCdgCd("]]");}


		/******************** RqstGrp_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupactiontypecodingi == 0) {r.addRqstGrpActnTypCdgUsrSltd("[[");}
		if(requestgroupactiontypecoding.hasUserSelected()) {

			r.addRqstGrpActnTypCdgUsrSltd(String.valueOf(requestgroupactiontypecoding.getUserSelected()));
		} else {
			r.addRqstGrpActnTypCdgUsrSltd("NULL");
		}

		if(requestgroupactiontypecodingi == requestgroupactiontypecodinglist.size()-1) {r.addRqstGrpActnTypCdgUsrSltd("]]");}


		/******************** RqstGrp_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(requestgroupactiontypecodingi == 0) {r.addRqstGrpActnTypCdgSys("[[");}
		if(requestgroupactiontypecoding.hasSystem()) {

			r.addRqstGrpActnTypCdgSys(String.valueOf(requestgroupactiontypecoding.getSystem()));
		} else {
			r.addRqstGrpActnTypCdgSys("NULL");
		}

		if(requestgroupactiontypecodingi == requestgroupactiontypecodinglist.size()-1) {r.addRqstGrpActnTypCdgSys("]]");}


		 };
		/******************** requestgroupactioncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> requestgroupactioncodelist = requestgroupaction.getCode();
		for(int requestgroupactioncodei = 0; requestgroupactioncodei<requestgroupactioncodelist.size();requestgroupactioncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  requestgroupactioncode = requestgroupactioncodelist.get(requestgroupactioncodei);

		/******************** RqstGrp_Actn_Cd_Txt ********************************************************************************/
		if(requestgroupactioncodei == 0) {r.addRqstGrpActnCdTxt("[[");}
		if(requestgroupactioncode.hasText()) {

			r.addRqstGrpActnCdTxt(String.valueOf(requestgroupactioncode.getText()));
		} else {
			r.addRqstGrpActnCdTxt("NULL");
		}

		if(requestgroupactioncodei == requestgroupactioncodelist.size()-1) {r.addRqstGrpActnCdTxt("]]");}


		/******************** requestgroupactioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> requestgroupactioncodecodinglist = requestgroupactioncode.getCoding();
		for(int requestgroupactioncodecodingi = 0; requestgroupactioncodecodingi<requestgroupactioncodecodinglist.size();requestgroupactioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  requestgroupactioncodecoding = requestgroupactioncodecodinglist.get(requestgroupactioncodecodingi);

		/******************** RqstGrp_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(requestgroupactioncodecodingi == 0) {r.addRqstGrpActnCdCdgDsply("[[[");}
		if(requestgroupactioncodecoding.hasDisplay()) {

			r.addRqstGrpActnCdCdgDsply(String.valueOf(requestgroupactioncodecoding.getDisplay()));
		} else {
			r.addRqstGrpActnCdCdgDsply("NULL");
		}

		if(requestgroupactioncodecodingi == requestgroupactioncodecodinglist.size()-1) {r.addRqstGrpActnCdCdgDsply("]]]");}


		/******************** RqstGrp_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupactioncodecodingi == 0) {r.addRqstGrpActnCdCdgVrsn("[[[");}
		if(requestgroupactioncodecoding.hasVersion()) {

			r.addRqstGrpActnCdCdgVrsn(String.valueOf(requestgroupactioncodecoding.getVersion()));
		} else {
			r.addRqstGrpActnCdCdgVrsn("NULL");
		}

		if(requestgroupactioncodecodingi == requestgroupactioncodecodinglist.size()-1) {r.addRqstGrpActnCdCdgVrsn("]]]");}


		/******************** RqstGrp_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(requestgroupactioncodecodingi == 0) {r.addRqstGrpActnCdCdgCd("[[[");}
		if(requestgroupactioncodecoding.hasCode()) {

			r.addRqstGrpActnCdCdgCd(String.valueOf(requestgroupactioncodecoding.getCode()));
		} else {
			r.addRqstGrpActnCdCdgCd("NULL");
		}

		if(requestgroupactioncodecodingi == requestgroupactioncodecodinglist.size()-1) {r.addRqstGrpActnCdCdgCd("]]]");}


		/******************** RqstGrp_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupactioncodecodingi == 0) {r.addRqstGrpActnCdCdgUsrSltd("[[[");}
		if(requestgroupactioncodecoding.hasUserSelected()) {

			r.addRqstGrpActnCdCdgUsrSltd(String.valueOf(requestgroupactioncodecoding.getUserSelected()));
		} else {
			r.addRqstGrpActnCdCdgUsrSltd("NULL");
		}

		if(requestgroupactioncodecodingi == requestgroupactioncodecodinglist.size()-1) {r.addRqstGrpActnCdCdgUsrSltd("]]]");}


		/******************** RqstGrp_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(requestgroupactioncodecodingi == 0) {r.addRqstGrpActnCdCdgSys("[[[");}
		if(requestgroupactioncodecoding.hasSystem()) {

			r.addRqstGrpActnCdCdgSys(String.valueOf(requestgroupactioncodecoding.getSystem()));
		} else {
			r.addRqstGrpActnCdCdgSys("NULL");
		}

		if(requestgroupactioncodecodingi == requestgroupactioncodecodinglist.size()-1) {r.addRqstGrpActnCdCdgSys("]]]");}


		 };
		 };
		/******************** RqstGrp_Actn_Dscrptn ********************************************************************************/
		if(requestgroupaction.hasDescription()) {

			r.addRqstGrpActnDscrptn(String.valueOf(requestgroupaction.getDescription()));
		} else {
			r.addRqstGrpActnDscrptn("NULL");
		}


		/******************** RqstGrp_Actn_TmgDtTimeTyp ********************************************************************************/
		if(requestgroupaction.hasTimingDateTimeType()) {

			r.addRqstGrpActnTmgDtTimeTyp("\""+requestgroupaction.getTimingDateTimeType().getValueAsString()+"\"");
		} else {
			r.addRqstGrpActnTmgDtTimeTyp("NULL");
		}


		/******************** requestgroupactiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age requestgroupactiontimingage = requestgroupaction.getTimingAge();

		/******************** RqstGrp_Actn_TmgAge_Vl ********************************************************************************/
		if(requestgroupactiontimingage.hasValue()) {

			r.addRqstGrpActnTmgAgeVl(String.valueOf(requestgroupactiontimingage.getValue()));
		} else {
			r.addRqstGrpActnTmgAgeVl("NULL");
		}


		/******************** requestgroupactiontimingagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingagecomparator = requestgroupactiontimingage.getComparator();
		if(requestgroupactiontimingagecomparator!=null) {
			r.addRqstGrpActnTmgAgeCmprtr(requestgroupactiontimingagecomparator.toCode());
		} else {
			r.addRqstGrpActnTmgAgeCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_TmgAge_Cd ********************************************************************************/
		if(requestgroupactiontimingage.hasCode()) {

			r.addRqstGrpActnTmgAgeCd(String.valueOf(requestgroupactiontimingage.getCode()));
		} else {
			r.addRqstGrpActnTmgAgeCd("NULL");
		}


		/******************** RqstGrp_Actn_TmgAge_Unt ********************************************************************************/
		if(requestgroupactiontimingage.hasUnit()) {

			r.addRqstGrpActnTmgAgeUnt(String.valueOf(requestgroupactiontimingage.getUnit()));
		} else {
			r.addRqstGrpActnTmgAgeUnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgAge_Sys ********************************************************************************/
		if(requestgroupactiontimingage.hasSystem()) {

			r.addRqstGrpActnTmgAgeSys(String.valueOf(requestgroupactiontimingage.getSystem()));
		} else {
			r.addRqstGrpActnTmgAgeSys("NULL");
		}


		/******************** requestgroupactiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactiontimingduration = requestgroupaction.getTimingDuration();

		/******************** RqstGrp_Actn_TmgDuration_Vl ********************************************************************************/
		if(requestgroupactiontimingduration.hasValue()) {

			r.addRqstGrpActnTmgDurationVl(String.valueOf(requestgroupactiontimingduration.getValue()));
		} else {
			r.addRqstGrpActnTmgDurationVl("NULL");
		}


		/******************** requestgroupactiontimingdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingdurationcomparator = requestgroupactiontimingduration.getComparator();
		if(requestgroupactiontimingdurationcomparator!=null) {
			r.addRqstGrpActnTmgDurationCmprtr(requestgroupactiontimingdurationcomparator.toCode());
		} else {
			r.addRqstGrpActnTmgDurationCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_TmgDuration_Cd ********************************************************************************/
		if(requestgroupactiontimingduration.hasCode()) {

			r.addRqstGrpActnTmgDurationCd(String.valueOf(requestgroupactiontimingduration.getCode()));
		} else {
			r.addRqstGrpActnTmgDurationCd("NULL");
		}


		/******************** RqstGrp_Actn_TmgDuration_Unt ********************************************************************************/
		if(requestgroupactiontimingduration.hasUnit()) {

			r.addRqstGrpActnTmgDurationUnt(String.valueOf(requestgroupactiontimingduration.getUnit()));
		} else {
			r.addRqstGrpActnTmgDurationUnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgDuration_Sys ********************************************************************************/
		if(requestgroupactiontimingduration.hasSystem()) {

			r.addRqstGrpActnTmgDurationSys(String.valueOf(requestgroupactiontimingduration.getSystem()));
		} else {
			r.addRqstGrpActnTmgDurationSys("NULL");
		}


		/******************** requestgroupactiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactiontimingrange = requestgroupaction.getTimingRange();

		/******************** requestgroupactiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingrangelow = requestgroupactiontimingrange.getLow();

		/******************** RqstGrp_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasValue()) {

			r.addRqstGrpActnTmgRngLwVl(String.valueOf(requestgroupactiontimingrangelow.getValue()));
		} else {
			r.addRqstGrpActnTmgRngLwVl("NULL");
		}


		/******************** requestgroupactiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingrangelowcomparator = requestgroupactiontimingrangelow.getComparator();
		if(requestgroupactiontimingrangelowcomparator!=null) {
			r.addRqstGrpActnTmgRngLwCmprtr(requestgroupactiontimingrangelowcomparator.toCode());
		} else {
			r.addRqstGrpActnTmgRngLwCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasCode()) {

			r.addRqstGrpActnTmgRngLwCd(String.valueOf(requestgroupactiontimingrangelow.getCode()));
		} else {
			r.addRqstGrpActnTmgRngLwCd("NULL");
		}


		/******************** RqstGrp_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasUnit()) {

			r.addRqstGrpActnTmgRngLwUnt(String.valueOf(requestgroupactiontimingrangelow.getUnit()));
		} else {
			r.addRqstGrpActnTmgRngLwUnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(requestgroupactiontimingrangelow.hasSystem()) {

			r.addRqstGrpActnTmgRngLwSys(String.valueOf(requestgroupactiontimingrangelow.getSystem()));
		} else {
			r.addRqstGrpActnTmgRngLwSys("NULL");
		}


		/******************** requestgroupactiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingrangehigh = requestgroupactiontimingrange.getHigh();

		/******************** RqstGrp_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasValue()) {

			r.addRqstGrpActnTmgRngHiVl(String.valueOf(requestgroupactiontimingrangehigh.getValue()));
		} else {
			r.addRqstGrpActnTmgRngHiVl("NULL");
		}


		/******************** requestgroupactiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingrangehighcomparator = requestgroupactiontimingrangehigh.getComparator();
		if(requestgroupactiontimingrangehighcomparator!=null) {
			r.addRqstGrpActnTmgRngHiCmprtr(requestgroupactiontimingrangehighcomparator.toCode());
		} else {
			r.addRqstGrpActnTmgRngHiCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasCode()) {

			r.addRqstGrpActnTmgRngHiCd(String.valueOf(requestgroupactiontimingrangehigh.getCode()));
		} else {
			r.addRqstGrpActnTmgRngHiCd("NULL");
		}


		/******************** RqstGrp_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasUnit()) {

			r.addRqstGrpActnTmgRngHiUnt(String.valueOf(requestgroupactiontimingrangehigh.getUnit()));
		} else {
			r.addRqstGrpActnTmgRngHiUnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(requestgroupactiontimingrangehigh.hasSystem()) {

			r.addRqstGrpActnTmgRngHiSys(String.valueOf(requestgroupactiontimingrangehigh.getSystem()));
		} else {
			r.addRqstGrpActnTmgRngHiSys("NULL");
		}


		/******************** RqstGrp_Actn_Ttl ********************************************************************************/
		if(requestgroupaction.hasTitle()) {

			r.addRqstGrpActnTtl(String.valueOf(requestgroupaction.getTitle()));
		} else {
			r.addRqstGrpActnTtl("NULL");
		}


		/******************** requestgroupactioncondition ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent> requestgroupactionconditionlist = requestgroupaction.getCondition();
		for(int requestgroupactionconditioni = 0; requestgroupactionconditioni<requestgroupactionconditionlist.size();requestgroupactionconditioni++ ) {
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionConditionComponent  requestgroupactioncondition = requestgroupactionconditionlist.get(requestgroupactionconditioni);

		/******************** requestgroupactionconditionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression requestgroupactionconditionexpression = requestgroupactioncondition.getExpression();

		/******************** RqstGrp_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(requestgroupactionconditioni == 0) {r.addRqstGrpActnCndtnExprsnNm("[[");}
		if(requestgroupactionconditionexpression.hasName()) {

			r.addRqstGrpActnCndtnExprsnNm(String.valueOf(requestgroupactionconditionexpression.getName()));
		} else {
			r.addRqstGrpActnCndtnExprsnNm("NULL");
		}

		if(requestgroupactionconditioni == requestgroupactionconditionlist.size()-1) {r.addRqstGrpActnCndtnExprsnNm("]]");}


		/******************** RqstGrp_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(requestgroupactionconditioni == 0) {r.addRqstGrpActnCndtnExprsnRfrnc("[[");}
		if(requestgroupactionconditionexpression.hasReference()) {

			r.addRqstGrpActnCndtnExprsnRfrnc(String.valueOf(requestgroupactionconditionexpression.getReference()));
		} else {
			r.addRqstGrpActnCndtnExprsnRfrnc("NULL");
		}

		if(requestgroupactionconditioni == requestgroupactionconditionlist.size()-1) {r.addRqstGrpActnCndtnExprsnRfrnc("]]");}


		/******************** RqstGrp_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(requestgroupactionconditioni == 0) {r.addRqstGrpActnCndtnExprsnLnguage("[[");}
		if(requestgroupactionconditionexpression.hasLanguage()) {

			r.addRqstGrpActnCndtnExprsnLnguage(String.valueOf(requestgroupactionconditionexpression.getLanguage()));
		} else {
			r.addRqstGrpActnCndtnExprsnLnguage("NULL");
		}

		if(requestgroupactionconditioni == requestgroupactionconditionlist.size()-1) {r.addRqstGrpActnCndtnExprsnLnguage("]]");}


		/******************** RqstGrp_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(requestgroupactionconditioni == 0) {r.addRqstGrpActnCndtnExprsnDscrptn("[[");}
		if(requestgroupactionconditionexpression.hasDescription()) {

			r.addRqstGrpActnCndtnExprsnDscrptn(String.valueOf(requestgroupactionconditionexpression.getDescription()));
		} else {
			r.addRqstGrpActnCndtnExprsnDscrptn("NULL");
		}

		if(requestgroupactionconditioni == requestgroupactionconditionlist.size()-1) {r.addRqstGrpActnCndtnExprsnDscrptn("]]");}


		/******************** requestgroupactionconditionkind ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionConditionKind requestgroupactionconditionkind = requestgroupactioncondition.getKind();
		if(requestgroupactionconditionkind!=null) {
		if(requestgroupactionconditioni == 0) {

		r.addRqstGrpActnCndtnKind("[[");		}
			r.addRqstGrpActnCndtnKind(requestgroupactionconditionkind.toCode());
		if(requestgroupactionconditioni == requestgroupactionconditionlist.size()-1) {

		r.addRqstGrpActnCndtnKind("]]");		}

		} else {
			r.addRqstGrpActnCndtnKind("NULL");
		}

		 };
		/******************** requestgroupactiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing requestgroupactiontimingtiming = requestgroupaction.getTimingTiming();

		/******************** requestgroupactiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupactiontimingtimingcode = requestgroupactiontimingtiming.getCode();

		/******************** RqstGrp_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(requestgroupactiontimingtimingcode.hasText()) {

			r.addRqstGrpActnTmgTmgCdTxt(String.valueOf(requestgroupactiontimingtimingcode.getText()));
		} else {
			r.addRqstGrpActnTmgTmgCdTxt("NULL");
		}


		/******************** requestgroupactiontimingtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> requestgroupactiontimingtimingcodecodinglist = requestgroupactiontimingtimingcode.getCoding();
		for(int requestgroupactiontimingtimingcodecodingi = 0; requestgroupactiontimingtimingcodecodingi<requestgroupactiontimingtimingcodecodinglist.size();requestgroupactiontimingtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  requestgroupactiontimingtimingcodecoding = requestgroupactiontimingtimingcodecodinglist.get(requestgroupactiontimingtimingcodecodingi);

		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(requestgroupactiontimingtimingcodecodingi == 0) {r.addRqstGrpActnTmgTmgCdCdgDsply("[[");}
		if(requestgroupactiontimingtimingcodecoding.hasDisplay()) {

			r.addRqstGrpActnTmgTmgCdCdgDsply(String.valueOf(requestgroupactiontimingtimingcodecoding.getDisplay()));
		} else {
			r.addRqstGrpActnTmgTmgCdCdgDsply("NULL");
		}

		if(requestgroupactiontimingtimingcodecodingi == requestgroupactiontimingtimingcodecodinglist.size()-1) {r.addRqstGrpActnTmgTmgCdCdgDsply("]]");}


		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupactiontimingtimingcodecodingi == 0) {r.addRqstGrpActnTmgTmgCdCdgVrsn("[[");}
		if(requestgroupactiontimingtimingcodecoding.hasVersion()) {

			r.addRqstGrpActnTmgTmgCdCdgVrsn(String.valueOf(requestgroupactiontimingtimingcodecoding.getVersion()));
		} else {
			r.addRqstGrpActnTmgTmgCdCdgVrsn("NULL");
		}

		if(requestgroupactiontimingtimingcodecodingi == requestgroupactiontimingtimingcodecodinglist.size()-1) {r.addRqstGrpActnTmgTmgCdCdgVrsn("]]");}


		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingcodecodingi == 0) {r.addRqstGrpActnTmgTmgCdCdgCd("[[");}
		if(requestgroupactiontimingtimingcodecoding.hasCode()) {

			r.addRqstGrpActnTmgTmgCdCdgCd(String.valueOf(requestgroupactiontimingtimingcodecoding.getCode()));
		} else {
			r.addRqstGrpActnTmgTmgCdCdgCd("NULL");
		}

		if(requestgroupactiontimingtimingcodecodingi == requestgroupactiontimingtimingcodecodinglist.size()-1) {r.addRqstGrpActnTmgTmgCdCdgCd("]]");}


		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupactiontimingtimingcodecodingi == 0) {r.addRqstGrpActnTmgTmgCdCdgUsrSltd("[[");}
		if(requestgroupactiontimingtimingcodecoding.hasUserSelected()) {

			r.addRqstGrpActnTmgTmgCdCdgUsrSltd(String.valueOf(requestgroupactiontimingtimingcodecoding.getUserSelected()));
		} else {
			r.addRqstGrpActnTmgTmgCdCdgUsrSltd("NULL");
		}

		if(requestgroupactiontimingtimingcodecodingi == requestgroupactiontimingtimingcodecodinglist.size()-1) {r.addRqstGrpActnTmgTmgCdCdgUsrSltd("]]");}


		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingcodecodingi == 0) {r.addRqstGrpActnTmgTmgCdCdgSys("[[");}
		if(requestgroupactiontimingtimingcodecoding.hasSystem()) {

			r.addRqstGrpActnTmgTmgCdCdgSys(String.valueOf(requestgroupactiontimingtimingcodecoding.getSystem()));
		} else {
			r.addRqstGrpActnTmgTmgCdCdgSys("NULL");
		}

		if(requestgroupactiontimingtimingcodecodingi == requestgroupactiontimingtimingcodecodinglist.size()-1) {r.addRqstGrpActnTmgTmgCdCdgSys("]]");}


		 };
		/******************** RqstGrp_Actn_TmgTmg_Evnt ********************************************************************************/
		if(requestgroupactiontimingtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<requestgroupactiontimingtiming.getEvent().size(); incr++) {
				array = array + requestgroupactiontimingtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpActnTmgTmgEvnt(array);

		} else {
			r.addRqstGrpActnTmgTmgEvnt("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent requestgroupactiontimingtimingrepeat = requestgroupactiontimingtiming.getRepeat();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasOffset()) {

			r.addRqstGrpActnTmgTmgRptOff(String.valueOf(requestgroupactiontimingtimingrepeat.getOffset()));
		} else {
			r.addRqstGrpActnTmgTmgRptOff("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasCount()) {

			r.addRqstGrpActnTmgTmgRptCnt(String.valueOf(requestgroupactiontimingtimingrepeat.getCount()));
		} else {
			r.addRqstGrpActnTmgTmgRptCnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasPeriod()) {

			r.addRqstGrpActnTmgTmgRptPrd(String.valueOf(requestgroupactiontimingtimingrepeat.getPeriod()));
		} else {
			r.addRqstGrpActnTmgTmgRptPrd("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasCountMax()) {

			r.addRqstGrpActnTmgTmgRptCntMx(String.valueOf(requestgroupactiontimingtimingrepeat.getCountMax()));
		} else {
			r.addRqstGrpActnTmgTmgRptCntMx("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasDurationMax()) {

			r.addRqstGrpActnTmgTmgRptDurationMx(String.valueOf(requestgroupactiontimingtimingrepeat.getDurationMax()));
		} else {
			r.addRqstGrpActnTmgTmgRptDurationMx("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupactiontimingtimingrepeatboundsperiod = requestgroupactiontimingtimingrepeat.getBoundsPeriod();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsperiod.hasStart()) {

			r.addRqstGrpActnTmgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupactiontimingtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			r.addRqstGrpActnTmgTmgRptBndsPrdStrt("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsperiod.hasEnd()) {

			r.addRqstGrpActnTmgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupactiontimingtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			r.addRqstGrpActnTmgTmgRptBndsPrdEnd("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime requestgroupactiontimingtimingrepeatdurationunit = requestgroupactiontimingtimingrepeat.getDurationUnit();
		if(requestgroupactiontimingtimingrepeatdurationunit!=null) {
			r.addRqstGrpActnTmgTmgRptDurationUnt(requestgroupactiontimingtimingrepeatdurationunit.toCode());
		} else {
			r.addRqstGrpActnTmgTmgRptDurationUnt("NULL");
		}

		/******************** requestgroupactiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactiontimingtimingrepeatboundsduration = requestgroupactiontimingtimingrepeat.getBoundsDuration();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasValue()) {

			r.addRqstGrpActnTmgTmgRptBndsDurationVl(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getValue()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsDurationVl("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingtimingrepeatboundsdurationcomparator = requestgroupactiontimingtimingrepeatboundsduration.getComparator();
		if(requestgroupactiontimingtimingrepeatboundsdurationcomparator!=null) {
			r.addRqstGrpActnTmgTmgRptBndsDurationCmprtr(requestgroupactiontimingtimingrepeatboundsdurationcomparator.toCode());
		} else {
			r.addRqstGrpActnTmgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasCode()) {

			r.addRqstGrpActnTmgTmgRptBndsDurationCd(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getCode()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsDurationCd("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasUnit()) {

			r.addRqstGrpActnTmgTmgRptBndsDurationUnt(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getUnit()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsDurationUnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsduration.hasSystem()) {

			r.addRqstGrpActnTmgTmgRptBndsDurationSys(String.valueOf(requestgroupactiontimingtimingrepeatboundsduration.getSystem()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsDurationSys("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactiontimingtimingrepeatboundsrange = requestgroupactiontimingtimingrepeat.getBoundsRange();

		/******************** requestgroupactiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingtimingrepeatboundsrangelow = requestgroupactiontimingtimingrepeatboundsrange.getLow();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasValue()) {

			r.addRqstGrpActnTmgTmgRptBndsRngLwVl(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getValue()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngLwVl("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingtimingrepeatboundsrangelowcomparator = requestgroupactiontimingtimingrepeatboundsrangelow.getComparator();
		if(requestgroupactiontimingtimingrepeatboundsrangelowcomparator!=null) {
			r.addRqstGrpActnTmgTmgRptBndsRngLwCmprtr(requestgroupactiontimingtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasCode()) {

			r.addRqstGrpActnTmgTmgRptBndsRngLwCd(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getCode()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngLwCd("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasUnit()) {

			r.addRqstGrpActnTmgTmgRptBndsRngLwUnt(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getUnit()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangelow.hasSystem()) {

			r.addRqstGrpActnTmgTmgRptBndsRngLwSys(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangelow.getSystem()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngLwSys("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactiontimingtimingrepeatboundsrangehigh = requestgroupactiontimingtimingrepeatboundsrange.getHigh();

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasValue()) {

			r.addRqstGrpActnTmgTmgRptBndsRngHiVl(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getValue()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngHiVl("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactiontimingtimingrepeatboundsrangehighcomparator = requestgroupactiontimingtimingrepeatboundsrangehigh.getComparator();
		if(requestgroupactiontimingtimingrepeatboundsrangehighcomparator!=null) {
			r.addRqstGrpActnTmgTmgRptBndsRngHiCmprtr(requestgroupactiontimingtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasCode()) {

			r.addRqstGrpActnTmgTmgRptBndsRngHiCd(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getCode()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngHiCd("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasUnit()) {

			r.addRqstGrpActnTmgTmgRptBndsRngHiUnt(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getUnit()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(requestgroupactiontimingtimingrepeatboundsrangehigh.hasSystem()) {

			r.addRqstGrpActnTmgTmgRptBndsRngHiSys(String.valueOf(requestgroupactiontimingtimingrepeatboundsrangehigh.getSystem()));
		} else {
			r.addRqstGrpActnTmgTmgRptBndsRngHiSys("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasFrequencyMax()) {

			r.addRqstGrpActnTmgTmgRptFrqncyMx(String.valueOf(requestgroupactiontimingtimingrepeat.getFrequencyMax()));
		} else {
			r.addRqstGrpActnTmgTmgRptFrqncyMx("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> requestgroupactiontimingtimingrepeatwhenlist = requestgroupactiontimingtimingrepeat.getWhen();
		for(int requestgroupactiontimingtimingrepeatwheni = 0; requestgroupactiontimingtimingrepeatwheni<requestgroupactiontimingtimingrepeatwhenlist.size();requestgroupactiontimingtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  requestgroupactiontimingtimingrepeatwhen = requestgroupactiontimingtimingrepeatwhenlist.get(requestgroupactiontimingtimingrepeatwheni);
		if(requestgroupactiontimingtimingrepeatwhen!=null) {
			r.addRqstGrpActnTmgTmgRptWhen(requestgroupactiontimingtimingrepeatwhen.getCode());
		} else {
			r.addRqstGrpActnTmgTmgRptWhen("NULL");
		}
		 };

		/******************** requestgroupactiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime requestgroupactiontimingtimingrepeatperiodunit = requestgroupactiontimingtimingrepeat.getPeriodUnit();
		if(requestgroupactiontimingtimingrepeatperiodunit!=null) {
			r.addRqstGrpActnTmgTmgRptPrdUnt(requestgroupactiontimingtimingrepeatperiodunit.toCode());
		} else {
			r.addRqstGrpActnTmgTmgRptPrdUnt("NULL");
		}

		/******************** RqstGrp_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasPeriodMax()) {

			r.addRqstGrpActnTmgTmgRptPrdMx(String.valueOf(requestgroupactiontimingtimingrepeat.getPeriodMax()));
		} else {
			r.addRqstGrpActnTmgTmgRptPrdMx("NULL");
		}


		/******************** requestgroupactiontimingtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> requestgroupactiontimingtimingrepeatdayofweeklist = requestgroupactiontimingtimingrepeat.getDayOfWeek();
		for(int requestgroupactiontimingtimingrepeatdayofweeki = 0; requestgroupactiontimingtimingrepeatdayofweeki<requestgroupactiontimingtimingrepeatdayofweeklist.size();requestgroupactiontimingtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  requestgroupactiontimingtimingrepeatdayofweek = requestgroupactiontimingtimingrepeatdayofweeklist.get(requestgroupactiontimingtimingrepeatdayofweeki);
		if(requestgroupactiontimingtimingrepeatdayofweek!=null) {
			r.addRqstGrpActnTmgTmgRptDayOfWeek(requestgroupactiontimingtimingrepeatdayofweek.getCode());
		} else {
			r.addRqstGrpActnTmgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** RqstGrp_Actn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<requestgroupactiontimingtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + requestgroupactiontimingtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpActnTmgTmgRptTimeOfDay(array);

		} else {
			r.addRqstGrpActnTmgTmgRptTimeOfDay("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasDuration()) {

			r.addRqstGrpActnTmgTmgRptDuration(String.valueOf(requestgroupactiontimingtimingrepeat.getDuration()));
		} else {
			r.addRqstGrpActnTmgTmgRptDuration("NULL");
		}


		/******************** RqstGrp_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(requestgroupactiontimingtimingrepeat.hasFrequency()) {

			r.addRqstGrpActnTmgTmgRptFrqncy(String.valueOf(requestgroupactiontimingtimingrepeat.getFrequency()));
		} else {
			r.addRqstGrpActnTmgTmgRptFrqncy("NULL");
		}


		/******************** requestgroupactiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupactiontimingperiod = requestgroupaction.getTimingPeriod();

		/******************** RqstGrp_Actn_TmgPrd_Strt ********************************************************************************/
		if(requestgroupactiontimingperiod.hasStart()) {

			r.addRqstGrpActnTmgPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupactiontimingperiod.getStart())+"\"");
		} else {
			r.addRqstGrpActnTmgPrdStrt("NULL");
		}


		/******************** RqstGrp_Actn_TmgPrd_End ********************************************************************************/
		if(requestgroupactiontimingperiod.hasEnd()) {

			r.addRqstGrpActnTmgPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupactiontimingperiod.getEnd())+"\"");
		} else {
			r.addRqstGrpActnTmgPrdEnd("NULL");
		}


		/******************** requestgroupactiondocumentation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> requestgroupactiondocumentationlist = requestgroupaction.getDocumentation();
		for(int requestgroupactiondocumentationi = 0; requestgroupactiondocumentationi<requestgroupactiondocumentationlist.size();requestgroupactiondocumentationi++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  requestgroupactiondocumentation = requestgroupactiondocumentationlist.get(requestgroupactiondocumentationi);

		/******************** RqstGrp_Actn_Docation_Rsrc ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationRsrc("[[");}
		if(requestgroupactiondocumentation.hasResource()) {

			r.addRqstGrpActnDocationRsrc(String.valueOf(requestgroupactiondocumentation.getResource()));
		} else {
			r.addRqstGrpActnDocationRsrc("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationRsrc("]]");}


		/******************** requestgroupactiondocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType requestgroupactiondocumentationtype = requestgroupactiondocumentation.getType();
		if(requestgroupactiondocumentationtype!=null) {
		if(requestgroupactiondocumentationi == 0) {

		r.addRqstGrpActnDocationTyp("[[");		}
			r.addRqstGrpActnDocationTyp(requestgroupactiondocumentationtype.toCode());
		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {

		r.addRqstGrpActnDocationTyp("]]");		}

		} else {
			r.addRqstGrpActnDocationTyp("NULL");
		}

		/******************** RqstGrp_Actn_Docation_Url ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationUrl("[[");}
		if(requestgroupactiondocumentation.hasUrl()) {

			r.addRqstGrpActnDocationUrl(String.valueOf(requestgroupactiondocumentation.getUrl()));
		} else {
			r.addRqstGrpActnDocationUrl("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationUrl("]]");}


		/******************** RqstGrp_Actn_Docation_Citation ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationCitation("[[");}
		if(requestgroupactiondocumentation.hasCitation()) {

			r.addRqstGrpActnDocationCitation(String.valueOf(requestgroupactiondocumentation.getCitation()));
		} else {
			r.addRqstGrpActnDocationCitation("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationCitation("]]");}


		/******************** RqstGrp_Actn_Docation_Lbl ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationLbl("[[");}
		if(requestgroupactiondocumentation.hasLabel()) {

			r.addRqstGrpActnDocationLbl(String.valueOf(requestgroupactiondocumentation.getLabel()));
		} else {
			r.addRqstGrpActnDocationLbl("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationLbl("]]");}


		/******************** requestgroupactiondocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment requestgroupactiondocumentationdocument = requestgroupactiondocumentation.getDocument();

		/******************** RqstGrp_Actn_Docation_Doc_Sz ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocSz("[[");}
		if(requestgroupactiondocumentationdocument.hasSize()) {

			r.addRqstGrpActnDocationDocSz(String.valueOf(requestgroupactiondocumentationdocument.getSize()));
		} else {
			r.addRqstGrpActnDocationDocSz("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocSz("]]");}


		/******************** RqstGrp_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocLnguage("[[");}
		if(requestgroupactiondocumentationdocument.hasLanguage()) {

			r.addRqstGrpActnDocationDocLnguage(String.valueOf(requestgroupactiondocumentationdocument.getLanguage()));
		} else {
			r.addRqstGrpActnDocationDocLnguage("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocLnguage("]]");}


		/******************** RqstGrp_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocCntntTyp("[[");}
		if(requestgroupactiondocumentationdocument.hasContentType()) {

			r.addRqstGrpActnDocationDocCntntTyp(String.valueOf(requestgroupactiondocumentationdocument.getContentType()));
		} else {
			r.addRqstGrpActnDocationDocCntntTyp("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocCntntTyp("]]");}


		/******************** RqstGrp_Actn_Docation_Doc_Hash ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocHash("[[");}
		if(requestgroupactiondocumentationdocument.hasHash()) {

			r.addRqstGrpActnDocationDocHash(new String(requestgroupactiondocumentationdocument.getHash()));
		} else {
			r.addRqstGrpActnDocationDocHash("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocHash("]]");}


		/******************** RqstGrp_Actn_Docation_Doc_Data ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocData("[[");}
		if(requestgroupactiondocumentationdocument.hasData()) {

			r.addRqstGrpActnDocationDocData(new String(requestgroupactiondocumentationdocument.getData()));
		} else {
			r.addRqstGrpActnDocationDocData("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocData("]]");}


		/******************** RqstGrp_Actn_Docation_Doc_Creation ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocCreation("[[");}
		if(requestgroupactiondocumentationdocument.hasCreation()) {

			r.addRqstGrpActnDocationDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupactiondocumentationdocument.getCreation())+"\"");
		} else {
			r.addRqstGrpActnDocationDocCreation("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocCreation("]]");}


		/******************** RqstGrp_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocTtl("[[");}
		if(requestgroupactiondocumentationdocument.hasTitle()) {

			r.addRqstGrpActnDocationDocTtl(String.valueOf(requestgroupactiondocumentationdocument.getTitle()));
		} else {
			r.addRqstGrpActnDocationDocTtl("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocTtl("]]");}


		/******************** RqstGrp_Actn_Docation_Doc_Url ********************************************************************************/
		if(requestgroupactiondocumentationi == 0) {r.addRqstGrpActnDocationDocUrl("[[");}
		if(requestgroupactiondocumentationdocument.hasUrl()) {

			r.addRqstGrpActnDocationDocUrl(String.valueOf(requestgroupactiondocumentationdocument.getUrl()));
		} else {
			r.addRqstGrpActnDocationDocUrl("NULL");
		}

		if(requestgroupactiondocumentationi == requestgroupactiondocumentationlist.size()-1) {r.addRqstGrpActnDocationDocUrl("]]");}


		 };
		/******************** requestgroupactionrelatedaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent> requestgroupactionrelatedactionlist = requestgroupaction.getRelatedAction();
		for(int requestgroupactionrelatedactioni = 0; requestgroupactionrelatedactioni<requestgroupactionrelatedactionlist.size();requestgroupactionrelatedactioni++ ) {
		org.hl7.fhir.r4.model.RequestGroup.RequestGroupActionRelatedActionComponent  requestgroupactionrelatedaction = requestgroupactionrelatedactionlist.get(requestgroupactionrelatedactioni);

		/******************** requestgroupactionrelatedactionrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionRelationshipType requestgroupactionrelatedactionrelationship = requestgroupactionrelatedaction.getRelationship();
		if(requestgroupactionrelatedactionrelationship!=null) {
		if(requestgroupactionrelatedactioni == 0) {

		r.addRqstGrpActnRltedActnRltnship("[[");		}
			r.addRqstGrpActnRltedActnRltnship(requestgroupactionrelatedactionrelationship.toCode());
		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {

		r.addRqstGrpActnRltedActnRltnship("]]");		}

		} else {
			r.addRqstGrpActnRltedActnRltnship("NULL");
		}

		/******************** RqstGrp_Actn_RltedActn_ActnId ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnActnId("[[");}
		if(requestgroupactionrelatedaction.hasActionId()) {

			r.addRqstGrpActnRltedActnActnId(String.valueOf(requestgroupactionrelatedaction.getActionId()));
		} else {
			r.addRqstGrpActnRltedActnActnId("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnActnId("]]");}


		/******************** requestgroupactionrelatedactionoffduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration requestgroupactionrelatedactionoffduration = requestgroupactionrelatedaction.getOffsetDuration();

		/******************** RqstGrp_Actn_RltedActn_OffDuration_Vl ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffDurationVl("[[");}
		if(requestgroupactionrelatedactionoffduration.hasValue()) {

			r.addRqstGrpActnRltedActnOffDurationVl(String.valueOf(requestgroupactionrelatedactionoffduration.getValue()));
		} else {
			r.addRqstGrpActnRltedActnOffDurationVl("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffDurationVl("]]");}


		/******************** requestgroupactionrelatedactionoffdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactionrelatedactionoffdurationcomparator = requestgroupactionrelatedactionoffduration.getComparator();
		if(requestgroupactionrelatedactionoffdurationcomparator!=null) {
		if(requestgroupactionrelatedactioni == 0) {

		r.addRqstGrpActnRltedActnOffDurationCmprtr("[[");		}
			r.addRqstGrpActnRltedActnOffDurationCmprtr(requestgroupactionrelatedactionoffdurationcomparator.toCode());
		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {

		r.addRqstGrpActnRltedActnOffDurationCmprtr("]]");		}

		} else {
			r.addRqstGrpActnRltedActnOffDurationCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_RltedActn_OffDuration_Cd ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffDurationCd("[[");}
		if(requestgroupactionrelatedactionoffduration.hasCode()) {

			r.addRqstGrpActnRltedActnOffDurationCd(String.valueOf(requestgroupactionrelatedactionoffduration.getCode()));
		} else {
			r.addRqstGrpActnRltedActnOffDurationCd("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffDurationCd("]]");}


		/******************** RqstGrp_Actn_RltedActn_OffDuration_Unt ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffDurationUnt("[[");}
		if(requestgroupactionrelatedactionoffduration.hasUnit()) {

			r.addRqstGrpActnRltedActnOffDurationUnt(String.valueOf(requestgroupactionrelatedactionoffduration.getUnit()));
		} else {
			r.addRqstGrpActnRltedActnOffDurationUnt("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffDurationUnt("]]");}


		/******************** RqstGrp_Actn_RltedActn_OffDuration_Sys ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffDurationSys("[[");}
		if(requestgroupactionrelatedactionoffduration.hasSystem()) {

			r.addRqstGrpActnRltedActnOffDurationSys(String.valueOf(requestgroupactionrelatedactionoffduration.getSystem()));
		} else {
			r.addRqstGrpActnRltedActnOffDurationSys("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffDurationSys("]]");}


		/******************** requestgroupactionrelatedactionoffrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range requestgroupactionrelatedactionoffrange = requestgroupactionrelatedaction.getOffsetRange();

		/******************** requestgroupactionrelatedactionoffrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactionrelatedactionoffrangelow = requestgroupactionrelatedactionoffrange.getLow();

		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngLwVl("[[");}
		if(requestgroupactionrelatedactionoffrangelow.hasValue()) {

			r.addRqstGrpActnRltedActnOffRngLwVl(String.valueOf(requestgroupactionrelatedactionoffrangelow.getValue()));
		} else {
			r.addRqstGrpActnRltedActnOffRngLwVl("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngLwVl("]]");}


		/******************** requestgroupactionrelatedactionoffrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactionrelatedactionoffrangelowcomparator = requestgroupactionrelatedactionoffrangelow.getComparator();
		if(requestgroupactionrelatedactionoffrangelowcomparator!=null) {
		if(requestgroupactionrelatedactioni == 0) {

		r.addRqstGrpActnRltedActnOffRngLwCmprtr("[[");		}
			r.addRqstGrpActnRltedActnOffRngLwCmprtr(requestgroupactionrelatedactionoffrangelowcomparator.toCode());
		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {

		r.addRqstGrpActnRltedActnOffRngLwCmprtr("]]");		}

		} else {
			r.addRqstGrpActnRltedActnOffRngLwCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngLwCd("[[");}
		if(requestgroupactionrelatedactionoffrangelow.hasCode()) {

			r.addRqstGrpActnRltedActnOffRngLwCd(String.valueOf(requestgroupactionrelatedactionoffrangelow.getCode()));
		} else {
			r.addRqstGrpActnRltedActnOffRngLwCd("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngLwCd("]]");}


		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngLwUnt("[[");}
		if(requestgroupactionrelatedactionoffrangelow.hasUnit()) {

			r.addRqstGrpActnRltedActnOffRngLwUnt(String.valueOf(requestgroupactionrelatedactionoffrangelow.getUnit()));
		} else {
			r.addRqstGrpActnRltedActnOffRngLwUnt("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngLwUnt("]]");}


		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngLwSys("[[");}
		if(requestgroupactionrelatedactionoffrangelow.hasSystem()) {

			r.addRqstGrpActnRltedActnOffRngLwSys(String.valueOf(requestgroupactionrelatedactionoffrangelow.getSystem()));
		} else {
			r.addRqstGrpActnRltedActnOffRngLwSys("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngLwSys("]]");}


		/******************** requestgroupactionrelatedactionoffrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity requestgroupactionrelatedactionoffrangehigh = requestgroupactionrelatedactionoffrange.getHigh();

		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngHiVl("[[");}
		if(requestgroupactionrelatedactionoffrangehigh.hasValue()) {

			r.addRqstGrpActnRltedActnOffRngHiVl(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getValue()));
		} else {
			r.addRqstGrpActnRltedActnOffRngHiVl("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngHiVl("]]");}


		/******************** requestgroupactionrelatedactionoffrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator requestgroupactionrelatedactionoffrangehighcomparator = requestgroupactionrelatedactionoffrangehigh.getComparator();
		if(requestgroupactionrelatedactionoffrangehighcomparator!=null) {
		if(requestgroupactionrelatedactioni == 0) {

		r.addRqstGrpActnRltedActnOffRngHiCmprtr("[[");		}
			r.addRqstGrpActnRltedActnOffRngHiCmprtr(requestgroupactionrelatedactionoffrangehighcomparator.toCode());
		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {

		r.addRqstGrpActnRltedActnOffRngHiCmprtr("]]");		}

		} else {
			r.addRqstGrpActnRltedActnOffRngHiCmprtr("NULL");
		}

		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngHiCd("[[");}
		if(requestgroupactionrelatedactionoffrangehigh.hasCode()) {

			r.addRqstGrpActnRltedActnOffRngHiCd(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getCode()));
		} else {
			r.addRqstGrpActnRltedActnOffRngHiCd("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngHiCd("]]");}


		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngHiUnt("[[");}
		if(requestgroupactionrelatedactionoffrangehigh.hasUnit()) {

			r.addRqstGrpActnRltedActnOffRngHiUnt(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getUnit()));
		} else {
			r.addRqstGrpActnRltedActnOffRngHiUnt("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngHiUnt("]]");}


		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(requestgroupactionrelatedactioni == 0) {r.addRqstGrpActnRltedActnOffRngHiSys("[[");}
		if(requestgroupactionrelatedactionoffrangehigh.hasSystem()) {

			r.addRqstGrpActnRltedActnOffRngHiSys(String.valueOf(requestgroupactionrelatedactionoffrangehigh.getSystem()));
		} else {
			r.addRqstGrpActnRltedActnOffRngHiSys("NULL");
		}

		if(requestgroupactionrelatedactioni == requestgroupactionrelatedactionlist.size()-1) {r.addRqstGrpActnRltedActnOffRngHiSys("]]");}


		 };
		/******************** RqstGrp_Actn_Prefix ********************************************************************************/
		if(requestgroupaction.hasPrefix()) {

			r.addRqstGrpActnPrefix(String.valueOf(requestgroupaction.getPrefix()));
		} else {
			r.addRqstGrpActnPrefix("NULL");
		}


		/******************** RqstGrp_Actn_TxtEquivalent ********************************************************************************/
		if(requestgroupaction.hasTextEquivalent()) {

			r.addRqstGrpActnTxtEquivalent(String.valueOf(requestgroupaction.getTextEquivalent()));
		} else {
			r.addRqstGrpActnTxtEquivalent("NULL");
		}


		/******************** requestgroupactiongroupingbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionGroupingBehavior requestgroupactiongroupingbehavior = requestgroupaction.getGroupingBehavior();
		if(requestgroupactiongroupingbehavior!=null) {
			r.addRqstGrpActnGrpingBehavior(requestgroupactiongroupingbehavior.toCode());
		} else {
			r.addRqstGrpActnGrpingBehavior("NULL");
		}

		/******************** requestgroupactionselectionbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionSelectionBehavior requestgroupactionselectionbehavior = requestgroupaction.getSelectionBehavior();
		if(requestgroupactionselectionbehavior!=null) {
			r.addRqstGrpActnSelectionBehavior(requestgroupactionselectionbehavior.toCode());
		} else {
			r.addRqstGrpActnSelectionBehavior("NULL");
		}

		/******************** requestgroupactionprecheckbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionPrecheckBehavior requestgroupactionprecheckbehavior = requestgroupaction.getPrecheckBehavior();
		if(requestgroupactionprecheckbehavior!=null) {
			r.addRqstGrpActnPrecheckBehavior(requestgroupactionprecheckbehavior.toCode());
		} else {
			r.addRqstGrpActnPrecheckBehavior("NULL");
		}

		/******************** requestgroupactionrequiredbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionRequiredBehavior requestgroupactionrequiredbehavior = requestgroupaction.getRequiredBehavior();
		if(requestgroupactionrequiredbehavior!=null) {
			r.addRqstGrpActnRequiredBehavior(requestgroupactionrequiredbehavior.toCode());
		} else {
			r.addRqstGrpActnRequiredBehavior("NULL");
		}

		/******************** requestgroupactioncardinalitybehavior ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.ActionCardinalityBehavior requestgroupactioncardinalitybehavior = requestgroupaction.getCardinalityBehavior();
		if(requestgroupactioncardinalitybehavior!=null) {
			r.addRqstGrpActnCardinalityBehavior(requestgroupactioncardinalitybehavior.toCode());
		} else {
			r.addRqstGrpActnCardinalityBehavior("NULL");
		}

		/******************** RqstGrp_Actn_Prtcpnt ********************************************************************************/
		if(requestgroupaction.hasParticipant()) {

			String  array = "[";
			for(int incr=0; incr<requestgroupaction.getParticipant().size(); incr++) {
				array = array + requestgroupaction.getParticipant().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpActnPrtcpnt(array);

		} else {
			r.addRqstGrpActnPrtcpnt("NULL");
		}


		 };
		/******************** requestgroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupcode = requestgroup.getCode();

		/******************** RqstGrp_Cd_Txt ********************************************************************************/
		if(requestgroupcode.hasText()) {

			r.addRqstGrpCdTxt(String.valueOf(requestgroupcode.getText()));
		} else {
			r.addRqstGrpCdTxt("NULL");
		}


		/******************** requestgroupcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> requestgroupcodecodinglist = requestgroupcode.getCoding();
		for(int requestgroupcodecodingi = 0; requestgroupcodecodingi<requestgroupcodecodinglist.size();requestgroupcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  requestgroupcodecoding = requestgroupcodecodinglist.get(requestgroupcodecodingi);

		/******************** RqstGrp_Cd_Cdg_Dsply ********************************************************************************/
		if(requestgroupcodecodingi == 0) {r.addRqstGrpCdCdgDsply("[");}
		if(requestgroupcodecoding.hasDisplay()) {

			r.addRqstGrpCdCdgDsply(String.valueOf(requestgroupcodecoding.getDisplay()));
		} else {
			r.addRqstGrpCdCdgDsply("NULL");
		}

		if(requestgroupcodecodingi == requestgroupcodecodinglist.size()-1) {r.addRqstGrpCdCdgDsply("]");}


		/******************** RqstGrp_Cd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupcodecodingi == 0) {r.addRqstGrpCdCdgVrsn("[");}
		if(requestgroupcodecoding.hasVersion()) {

			r.addRqstGrpCdCdgVrsn(String.valueOf(requestgroupcodecoding.getVersion()));
		} else {
			r.addRqstGrpCdCdgVrsn("NULL");
		}

		if(requestgroupcodecodingi == requestgroupcodecodinglist.size()-1) {r.addRqstGrpCdCdgVrsn("]");}


		/******************** RqstGrp_Cd_Cdg_Cd ********************************************************************************/
		if(requestgroupcodecodingi == 0) {r.addRqstGrpCdCdgCd("[");}
		if(requestgroupcodecoding.hasCode()) {

			r.addRqstGrpCdCdgCd(String.valueOf(requestgroupcodecoding.getCode()));
		} else {
			r.addRqstGrpCdCdgCd("NULL");
		}

		if(requestgroupcodecodingi == requestgroupcodecodinglist.size()-1) {r.addRqstGrpCdCdgCd("]");}


		/******************** RqstGrp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupcodecodingi == 0) {r.addRqstGrpCdCdgUsrSltd("[");}
		if(requestgroupcodecoding.hasUserSelected()) {

			r.addRqstGrpCdCdgUsrSltd(String.valueOf(requestgroupcodecoding.getUserSelected()));
		} else {
			r.addRqstGrpCdCdgUsrSltd("NULL");
		}

		if(requestgroupcodecodingi == requestgroupcodecodinglist.size()-1) {r.addRqstGrpCdCdgUsrSltd("]");}


		/******************** RqstGrp_Cd_Cdg_Sys ********************************************************************************/
		if(requestgroupcodecodingi == 0) {r.addRqstGrpCdCdgSys("[");}
		if(requestgroupcodecoding.hasSystem()) {

			r.addRqstGrpCdCdgSys(String.valueOf(requestgroupcodecoding.getSystem()));
		} else {
			r.addRqstGrpCdCdgSys("NULL");
		}

		if(requestgroupcodecodingi == requestgroupcodecodinglist.size()-1) {r.addRqstGrpCdCdgSys("]");}


		 };
		/******************** RqstGrp_Sbjct ********************************************************************************/
		if(requestgroup.hasSubject()) {

			if(requestgroup.getSubject().getReference() != null) {
			r.addRqstGrpSbjct(requestgroup.getSubject().getReference());
			}
		} else {
			r.addRqstGrpSbjct("NULL");
		}


		/******************** requestgroupstatus ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestStatus requestgroupstatus = requestgroup.getStatus();
		if(requestgroupstatus!=null) {
			r.addRqstGrpSts(requestgroupstatus.toCode());
		} else {
			r.addRqstGrpSts("NULL");
		}

		/******************** RqstGrp_Enc ********************************************************************************/
		if(requestgroup.hasEncounter()) {

			if(requestgroup.getEncounter().getReference() != null) {
			r.addRqstGrpEnc(requestgroup.getEncounter().getReference());
			}
		} else {
			r.addRqstGrpEnc("NULL");
		}


		/******************** RqstGrp_BasedOn ********************************************************************************/
		if(requestgroup.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<requestgroup.getBasedOn().size(); incr++) {
				array = array + requestgroup.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpBasedOn(array);

		} else {
			r.addRqstGrpBasedOn("NULL");
		}


		/******************** requestgroupreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> requestgroupreasoncodelist = requestgroup.getReasonCode();
		for(int requestgroupreasoncodei = 0; requestgroupreasoncodei<requestgroupreasoncodelist.size();requestgroupreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  requestgroupreasoncode = requestgroupreasoncodelist.get(requestgroupreasoncodei);

		/******************** RqstGrp_RsnCd_Txt ********************************************************************************/
		if(requestgroupreasoncodei == 0) {r.addRqstGrpRsnCdTxt("[");}
		if(requestgroupreasoncode.hasText()) {

			r.addRqstGrpRsnCdTxt(String.valueOf(requestgroupreasoncode.getText()));
		} else {
			r.addRqstGrpRsnCdTxt("NULL");
		}

		if(requestgroupreasoncodei == requestgroupreasoncodelist.size()-1) {r.addRqstGrpRsnCdTxt("]");}


		/******************** requestgroupreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> requestgroupreasoncodecodinglist = requestgroupreasoncode.getCoding();
		for(int requestgroupreasoncodecodingi = 0; requestgroupreasoncodecodingi<requestgroupreasoncodecodinglist.size();requestgroupreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  requestgroupreasoncodecoding = requestgroupreasoncodecodinglist.get(requestgroupreasoncodecodingi);

		/******************** RqstGrp_RsnCd_Cdg_Dsply ********************************************************************************/
		if(requestgroupreasoncodecodingi == 0) {r.addRqstGrpRsnCdCdgDsply("[[");}
		if(requestgroupreasoncodecoding.hasDisplay()) {

			r.addRqstGrpRsnCdCdgDsply(String.valueOf(requestgroupreasoncodecoding.getDisplay()));
		} else {
			r.addRqstGrpRsnCdCdgDsply("NULL");
		}

		if(requestgroupreasoncodecodingi == requestgroupreasoncodecodinglist.size()-1) {r.addRqstGrpRsnCdCdgDsply("]]");}


		/******************** RqstGrp_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(requestgroupreasoncodecodingi == 0) {r.addRqstGrpRsnCdCdgVrsn("[[");}
		if(requestgroupreasoncodecoding.hasVersion()) {

			r.addRqstGrpRsnCdCdgVrsn(String.valueOf(requestgroupreasoncodecoding.getVersion()));
		} else {
			r.addRqstGrpRsnCdCdgVrsn("NULL");
		}

		if(requestgroupreasoncodecodingi == requestgroupreasoncodecodinglist.size()-1) {r.addRqstGrpRsnCdCdgVrsn("]]");}


		/******************** RqstGrp_RsnCd_Cdg_Cd ********************************************************************************/
		if(requestgroupreasoncodecodingi == 0) {r.addRqstGrpRsnCdCdgCd("[[");}
		if(requestgroupreasoncodecoding.hasCode()) {

			r.addRqstGrpRsnCdCdgCd(String.valueOf(requestgroupreasoncodecoding.getCode()));
		} else {
			r.addRqstGrpRsnCdCdgCd("NULL");
		}

		if(requestgroupreasoncodecodingi == requestgroupreasoncodecodinglist.size()-1) {r.addRqstGrpRsnCdCdgCd("]]");}


		/******************** RqstGrp_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupreasoncodecodingi == 0) {r.addRqstGrpRsnCdCdgUsrSltd("[[");}
		if(requestgroupreasoncodecoding.hasUserSelected()) {

			r.addRqstGrpRsnCdCdgUsrSltd(String.valueOf(requestgroupreasoncodecoding.getUserSelected()));
		} else {
			r.addRqstGrpRsnCdCdgUsrSltd("NULL");
		}

		if(requestgroupreasoncodecodingi == requestgroupreasoncodecodinglist.size()-1) {r.addRqstGrpRsnCdCdgUsrSltd("]]");}


		/******************** RqstGrp_RsnCd_Cdg_Sys ********************************************************************************/
		if(requestgroupreasoncodecodingi == 0) {r.addRqstGrpRsnCdCdgSys("[[");}
		if(requestgroupreasoncodecoding.hasSystem()) {

			r.addRqstGrpRsnCdCdgSys(String.valueOf(requestgroupreasoncodecoding.getSystem()));
		} else {
			r.addRqstGrpRsnCdCdgSys("NULL");
		}

		if(requestgroupreasoncodecodingi == requestgroupreasoncodecodinglist.size()-1) {r.addRqstGrpRsnCdCdgSys("]]");}


		 };
		 };
		/******************** requestgroupnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> requestgroupnotelist = requestgroup.getNote();
		for(int requestgroupnotei = 0; requestgroupnotei<requestgroupnotelist.size();requestgroupnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  requestgroupnote = requestgroupnotelist.get(requestgroupnotei);

		/******************** RqstGrp_Nt_Time ********************************************************************************/
		if(requestgroupnotei == 0) {r.addRqstGrpNtTime("[");}
		if(requestgroupnote.hasTime()) {

			r.addRqstGrpNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupnote.getTime())+"\"");
		} else {
			r.addRqstGrpNtTime("NULL");
		}

		if(requestgroupnotei == requestgroupnotelist.size()-1) {r.addRqstGrpNtTime("]");}


		/******************** RqstGrp_Nt_AthrRfrnc ********************************************************************************/
		if(requestgroupnotei == 0) {r.addRqstGrpNtAthrRfrnc("[");}
		if(requestgroupnote.hasAuthorReference()) {

			if(requestgroupnote.getAuthorReference().getReference() != null) {
			r.addRqstGrpNtAthrRfrnc(requestgroupnote.getAuthorReference().getReference());
			}
		} else {
			r.addRqstGrpNtAthrRfrnc("NULL");
		}

		if(requestgroupnotei == requestgroupnotelist.size()-1) {r.addRqstGrpNtAthrRfrnc("]");}


		/******************** RqstGrp_Nt_Txt ********************************************************************************/
		if(requestgroupnotei == 0) {r.addRqstGrpNtTxt("[");}
		if(requestgroupnote.hasText()) {

			r.addRqstGrpNtTxt(String.valueOf(requestgroupnote.getText()));
		} else {
			r.addRqstGrpNtTxt("NULL");
		}

		if(requestgroupnotei == requestgroupnotelist.size()-1) {r.addRqstGrpNtTxt("]");}


		/******************** RqstGrp_Nt_AthrStrgTyp ********************************************************************************/
		if(requestgroupnotei == 0) {r.addRqstGrpNtAthrStrgTyp("[");}
		if(requestgroupnote.hasAuthorStringType()) {

			r.addRqstGrpNtAthrStrgTyp("\""+requestgroupnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			r.addRqstGrpNtAthrStrgTyp("NULL");
		}

		if(requestgroupnotei == requestgroupnotelist.size()-1) {r.addRqstGrpNtAthrStrgTyp("]");}


		 };
		/******************** RqstGrp_RsnRfrnc ********************************************************************************/
		if(requestgroup.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<requestgroup.getReasonReference().size(); incr++) {
				array = array + requestgroup.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpRsnRfrnc(array);

		} else {
			r.addRqstGrpRsnRfrnc("NULL");
		}


		/******************** requestgroupidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> requestgroupidentifierlist = requestgroup.getIdentifier();
		for(int requestgroupidentifieri = 0; requestgroupidentifieri<requestgroupidentifierlist.size();requestgroupidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  requestgroupidentifier = requestgroupidentifierlist.get(requestgroupidentifieri);

		/******************** RqstGrp_Id_Vl ********************************************************************************/
		if(requestgroupidentifieri == 0) {r.addRqstGrpIdVl("[");}
		if(requestgroupidentifier.hasValue()) {

			r.addRqstGrpIdVl(String.valueOf(requestgroupidentifier.getValue()));
		} else {
			r.addRqstGrpIdVl("NULL");
		}

		if(requestgroupidentifieri == requestgroupidentifierlist.size()-1) {r.addRqstGrpIdVl("]");}


		/******************** requestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupidentifiertype = requestgroupidentifier.getType();

		/******************** RqstGrp_Id_Typ_Txt ********************************************************************************/
		if(requestgroupidentifieri == 0) {r.addRqstGrpIdTypTxt("[");}
		if(requestgroupidentifiertype.hasText()) {

			r.addRqstGrpIdTypTxt(String.valueOf(requestgroupidentifiertype.getText()));
		} else {
			r.addRqstGrpIdTypTxt("NULL");
		}

		if(requestgroupidentifieri == requestgroupidentifierlist.size()-1) {r.addRqstGrpIdTypTxt("]");}


		/******************** requestgroupidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> requestgroupidentifiertypecodinglist = requestgroupidentifiertype.getCoding();
		for(int requestgroupidentifiertypecodingi = 0; requestgroupidentifiertypecodingi<requestgroupidentifiertypecodinglist.size();requestgroupidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  requestgroupidentifiertypecoding = requestgroupidentifiertypecodinglist.get(requestgroupidentifiertypecodingi);

		/******************** RqstGrp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(requestgroupidentifiertypecodingi == 0) {r.addRqstGrpIdTypCdgDsply("[[");}
		if(requestgroupidentifiertypecoding.hasDisplay()) {

			r.addRqstGrpIdTypCdgDsply(String.valueOf(requestgroupidentifiertypecoding.getDisplay()));
		} else {
			r.addRqstGrpIdTypCdgDsply("NULL");
		}

		if(requestgroupidentifiertypecodingi == requestgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpIdTypCdgDsply("]]");}


		/******************** RqstGrp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(requestgroupidentifiertypecodingi == 0) {r.addRqstGrpIdTypCdgVrsn("[[");}
		if(requestgroupidentifiertypecoding.hasVersion()) {

			r.addRqstGrpIdTypCdgVrsn(String.valueOf(requestgroupidentifiertypecoding.getVersion()));
		} else {
			r.addRqstGrpIdTypCdgVrsn("NULL");
		}

		if(requestgroupidentifiertypecodingi == requestgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpIdTypCdgVrsn("]]");}


		/******************** RqstGrp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(requestgroupidentifiertypecodingi == 0) {r.addRqstGrpIdTypCdgCd("[[");}
		if(requestgroupidentifiertypecoding.hasCode()) {

			r.addRqstGrpIdTypCdgCd(String.valueOf(requestgroupidentifiertypecoding.getCode()));
		} else {
			r.addRqstGrpIdTypCdgCd("NULL");
		}

		if(requestgroupidentifiertypecodingi == requestgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpIdTypCdgCd("]]");}


		/******************** RqstGrp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupidentifiertypecodingi == 0) {r.addRqstGrpIdTypCdgUsrSltd("[[");}
		if(requestgroupidentifiertypecoding.hasUserSelected()) {

			r.addRqstGrpIdTypCdgUsrSltd(String.valueOf(requestgroupidentifiertypecoding.getUserSelected()));
		} else {
			r.addRqstGrpIdTypCdgUsrSltd("NULL");
		}

		if(requestgroupidentifiertypecodingi == requestgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpIdTypCdgUsrSltd("]]");}


		/******************** RqstGrp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(requestgroupidentifiertypecodingi == 0) {r.addRqstGrpIdTypCdgSys("[[");}
		if(requestgroupidentifiertypecoding.hasSystem()) {

			r.addRqstGrpIdTypCdgSys(String.valueOf(requestgroupidentifiertypecoding.getSystem()));
		} else {
			r.addRqstGrpIdTypCdgSys("NULL");
		}

		if(requestgroupidentifiertypecodingi == requestgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpIdTypCdgSys("]]");}


		 };
		/******************** requestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupidentifierperiod = requestgroupidentifier.getPeriod();

		/******************** RqstGrp_Id_Prd_Strt ********************************************************************************/
		if(requestgroupidentifieri == 0) {r.addRqstGrpIdPrdStrt("[");}
		if(requestgroupidentifierperiod.hasStart()) {

			r.addRqstGrpIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupidentifierperiod.getStart())+"\"");
		} else {
			r.addRqstGrpIdPrdStrt("NULL");
		}

		if(requestgroupidentifieri == requestgroupidentifierlist.size()-1) {r.addRqstGrpIdPrdStrt("]");}


		/******************** RqstGrp_Id_Prd_End ********************************************************************************/
		if(requestgroupidentifieri == 0) {r.addRqstGrpIdPrdEnd("[");}
		if(requestgroupidentifierperiod.hasEnd()) {

			r.addRqstGrpIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupidentifierperiod.getEnd())+"\"");
		} else {
			r.addRqstGrpIdPrdEnd("NULL");
		}

		if(requestgroupidentifieri == requestgroupidentifierlist.size()-1) {r.addRqstGrpIdPrdEnd("]");}


		/******************** requestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse requestgroupidentifieruse = requestgroupidentifier.getUse();
		if(requestgroupidentifieruse!=null) {
		if(requestgroupidentifieri == 0) {

		r.addRqstGrpIdUse("[");		}
			r.addRqstGrpIdUse(requestgroupidentifieruse.toCode());
		if(requestgroupidentifieri == requestgroupidentifierlist.size()-1) {

		r.addRqstGrpIdUse("]");		}

		} else {
			r.addRqstGrpIdUse("NULL");
		}

		/******************** RqstGrp_Id_Assigner ********************************************************************************/
		if(requestgroupidentifieri == 0) {r.addRqstGrpIdAssigner("[");}
		if(requestgroupidentifier.hasAssigner()) {

			if(requestgroupidentifier.getAssigner().getReference() != null) {
			r.addRqstGrpIdAssigner(requestgroupidentifier.getAssigner().getReference());
			}
		} else {
			r.addRqstGrpIdAssigner("NULL");
		}

		if(requestgroupidentifieri == requestgroupidentifierlist.size()-1) {r.addRqstGrpIdAssigner("]");}


		/******************** RqstGrp_Id_Sys ********************************************************************************/
		if(requestgroupidentifieri == 0) {r.addRqstGrpIdSys("[");}
		if(requestgroupidentifier.hasSystem()) {

			r.addRqstGrpIdSys(String.valueOf(requestgroupidentifier.getSystem()));
		} else {
			r.addRqstGrpIdSys("NULL");
		}

		if(requestgroupidentifieri == requestgroupidentifierlist.size()-1) {r.addRqstGrpIdSys("]");}


		 };
		/******************** requestgroupgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier requestgroupgroupidentifier = requestgroup.getGroupIdentifier();

		/******************** RqstGrp_GrpId_Vl ********************************************************************************/
		if(requestgroupgroupidentifier.hasValue()) {

			r.addRqstGrpGrpIdVl(String.valueOf(requestgroupgroupidentifier.getValue()));
		} else {
			r.addRqstGrpGrpIdVl("NULL");
		}


		/******************** requestgroupgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept requestgroupgroupidentifiertype = requestgroupgroupidentifier.getType();

		/******************** RqstGrp_GrpId_Typ_Txt ********************************************************************************/
		if(requestgroupgroupidentifiertype.hasText()) {

			r.addRqstGrpGrpIdTypTxt(String.valueOf(requestgroupgroupidentifiertype.getText()));
		} else {
			r.addRqstGrpGrpIdTypTxt("NULL");
		}


		/******************** requestgroupgroupidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> requestgroupgroupidentifiertypecodinglist = requestgroupgroupidentifiertype.getCoding();
		for(int requestgroupgroupidentifiertypecodingi = 0; requestgroupgroupidentifiertypecodingi<requestgroupgroupidentifiertypecodinglist.size();requestgroupgroupidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  requestgroupgroupidentifiertypecoding = requestgroupgroupidentifiertypecodinglist.get(requestgroupgroupidentifiertypecodingi);

		/******************** RqstGrp_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(requestgroupgroupidentifiertypecodingi == 0) {r.addRqstGrpGrpIdTypCdgDsply("[");}
		if(requestgroupgroupidentifiertypecoding.hasDisplay()) {

			r.addRqstGrpGrpIdTypCdgDsply(String.valueOf(requestgroupgroupidentifiertypecoding.getDisplay()));
		} else {
			r.addRqstGrpGrpIdTypCdgDsply("NULL");
		}

		if(requestgroupgroupidentifiertypecodingi == requestgroupgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpGrpIdTypCdgDsply("]");}


		/******************** RqstGrp_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(requestgroupgroupidentifiertypecodingi == 0) {r.addRqstGrpGrpIdTypCdgVrsn("[");}
		if(requestgroupgroupidentifiertypecoding.hasVersion()) {

			r.addRqstGrpGrpIdTypCdgVrsn(String.valueOf(requestgroupgroupidentifiertypecoding.getVersion()));
		} else {
			r.addRqstGrpGrpIdTypCdgVrsn("NULL");
		}

		if(requestgroupgroupidentifiertypecodingi == requestgroupgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpGrpIdTypCdgVrsn("]");}


		/******************** RqstGrp_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(requestgroupgroupidentifiertypecodingi == 0) {r.addRqstGrpGrpIdTypCdgCd("[");}
		if(requestgroupgroupidentifiertypecoding.hasCode()) {

			r.addRqstGrpGrpIdTypCdgCd(String.valueOf(requestgroupgroupidentifiertypecoding.getCode()));
		} else {
			r.addRqstGrpGrpIdTypCdgCd("NULL");
		}

		if(requestgroupgroupidentifiertypecodingi == requestgroupgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpGrpIdTypCdgCd("]");}


		/******************** RqstGrp_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(requestgroupgroupidentifiertypecodingi == 0) {r.addRqstGrpGrpIdTypCdgUsrSltd("[");}
		if(requestgroupgroupidentifiertypecoding.hasUserSelected()) {

			r.addRqstGrpGrpIdTypCdgUsrSltd(String.valueOf(requestgroupgroupidentifiertypecoding.getUserSelected()));
		} else {
			r.addRqstGrpGrpIdTypCdgUsrSltd("NULL");
		}

		if(requestgroupgroupidentifiertypecodingi == requestgroupgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpGrpIdTypCdgUsrSltd("]");}


		/******************** RqstGrp_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(requestgroupgroupidentifiertypecodingi == 0) {r.addRqstGrpGrpIdTypCdgSys("[");}
		if(requestgroupgroupidentifiertypecoding.hasSystem()) {

			r.addRqstGrpGrpIdTypCdgSys(String.valueOf(requestgroupgroupidentifiertypecoding.getSystem()));
		} else {
			r.addRqstGrpGrpIdTypCdgSys("NULL");
		}

		if(requestgroupgroupidentifiertypecodingi == requestgroupgroupidentifiertypecodinglist.size()-1) {r.addRqstGrpGrpIdTypCdgSys("]");}


		 };
		/******************** requestgroupgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period requestgroupgroupidentifierperiod = requestgroupgroupidentifier.getPeriod();

		/******************** RqstGrp_GrpId_Prd_Strt ********************************************************************************/
		if(requestgroupgroupidentifierperiod.hasStart()) {

			r.addRqstGrpGrpIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupgroupidentifierperiod.getStart())+"\"");
		} else {
			r.addRqstGrpGrpIdPrdStrt("NULL");
		}


		/******************** RqstGrp_GrpId_Prd_End ********************************************************************************/
		if(requestgroupgroupidentifierperiod.hasEnd()) {

			r.addRqstGrpGrpIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroupgroupidentifierperiod.getEnd())+"\"");
		} else {
			r.addRqstGrpGrpIdPrdEnd("NULL");
		}


		/******************** requestgroupgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse requestgroupgroupidentifieruse = requestgroupgroupidentifier.getUse();
		if(requestgroupgroupidentifieruse!=null) {
			r.addRqstGrpGrpIdUse(requestgroupgroupidentifieruse.toCode());
		} else {
			r.addRqstGrpGrpIdUse("NULL");
		}

		/******************** RqstGrp_GrpId_Assigner ********************************************************************************/
		if(requestgroupgroupidentifier.hasAssigner()) {

			if(requestgroupgroupidentifier.getAssigner().getReference() != null) {
			r.addRqstGrpGrpIdAssigner(requestgroupgroupidentifier.getAssigner().getReference());
			}
		} else {
			r.addRqstGrpGrpIdAssigner("NULL");
		}


		/******************** RqstGrp_GrpId_Sys ********************************************************************************/
		if(requestgroupgroupidentifier.hasSystem()) {

			r.addRqstGrpGrpIdSys(String.valueOf(requestgroupgroupidentifier.getSystem()));
		} else {
			r.addRqstGrpGrpIdSys("NULL");
		}


		/******************** RqstGrp_Replaces ********************************************************************************/
		if(requestgroup.hasReplaces()) {

			String  array = "[";
			for(int incr=0; incr<requestgroup.getReplaces().size(); incr++) {
				array = array + requestgroup.getReplaces().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpReplaces(array);

		} else {
			r.addRqstGrpReplaces("NULL");
		}


		/******************** RqstGrp_InstantiatesUri ********************************************************************************/
		if(requestgroup.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<requestgroup.getInstantiatesUri().size(); incr++) {
				array = array + requestgroup.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpInstantiatesUri(array);

		} else {
			r.addRqstGrpInstantiatesUri("NULL");
		}


		/******************** RqstGrp_InstantiatesCanonical ********************************************************************************/
		if(requestgroup.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<requestgroup.getInstantiatesCanonical().size(); incr++) {
				array = array + requestgroup.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRqstGrpInstantiatesCanonical(array);

		} else {
			r.addRqstGrpInstantiatesCanonical("NULL");
		}


		/******************** RqstGrp_Athr ********************************************************************************/
		if(requestgroup.hasAuthor()) {

			if(requestgroup.getAuthor().getReference() != null) {
			r.addRqstGrpAthr(requestgroup.getAuthor().getReference());
			}
		} else {
			r.addRqstGrpAthr("NULL");
		}


		/******************** RqstGrp_AthredOn ********************************************************************************/
		if(requestgroup.hasAuthoredOn()) {

			r.addRqstGrpAthredOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(requestgroup.getAuthoredOn())+"\"");
		} else {
			r.addRqstGrpAthredOn("NULL");
		}


		/******************** requestgroupintent ********************************************************************************/
		org.hl7.fhir.r4.model.RequestGroup.RequestIntent requestgroupintent = requestgroup.getIntent();
		if(requestgroupintent!=null) {
			r.addRqstGrpIntent(requestgroupintent.toCode());
		} else {
			r.addRqstGrpIntent("NULL");
		}

		return r;
	}
}
