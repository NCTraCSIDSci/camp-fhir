package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItemDefinition;
public class ChargeItemDefinitionBidirectionalConversion 
{
	public ChargeItemDefinition ChargeItemDefinitions(org.hl7.fhir.r4.model.ChargeItemDefinition chargeitemdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ChargeItemDefinition c = new  main.java.com.campfhir.model.ChargeItemDefinition();

		/******************** id ********************************************************************************/
		c.setId(chargeitemdefinition.getIdElement().getIdPart());

		/******************** ChrgItmDfn_Instance ********************************************************************************/
		if(chargeitemdefinition.hasInstance()) {

			String  array = "[";
			for(int incr=0; incr<chargeitemdefinition.getInstance().size(); incr++) {
				array = array + chargeitemdefinition.getInstance().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmDfnInstance(array);

		} else {
			c.addChrgItmDfnInstance("NULL");
		}


		/******************** ChrgItmDfn_Vrsn ********************************************************************************/
		if(chargeitemdefinition.hasVersion()) {

			c.addChrgItmDfnVrsn(String.valueOf(chargeitemdefinition.getVersion()));
		} else {
			c.addChrgItmDfnVrsn("NULL");
		}


		/******************** ChrgItmDfn_Dt ********************************************************************************/
		if(chargeitemdefinition.hasDate()) {

			c.addChrgItmDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinition.getDate())+"\"");
		} else {
			c.addChrgItmDfnDt("NULL");
		}


		/******************** chargeitemdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitioncode = chargeitemdefinition.getCode();

		/******************** ChrgItmDfn_Cd_Txt ********************************************************************************/
		if(chargeitemdefinitioncode.hasText()) {

			c.addChrgItmDfnCdTxt(String.valueOf(chargeitemdefinitioncode.getText()));
		} else {
			c.addChrgItmDfnCdTxt("NULL");
		}


		/******************** chargeitemdefinitioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemdefinitioncodecodinglist = chargeitemdefinitioncode.getCoding();
		for(int chargeitemdefinitioncodecodingi = 0; chargeitemdefinitioncodecodingi<chargeitemdefinitioncodecodinglist.size();chargeitemdefinitioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemdefinitioncodecoding = chargeitemdefinitioncodecodinglist.get(chargeitemdefinitioncodecodingi);

		/******************** ChrgItmDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitioncodecodingi == 0) {c.addChrgItmDfnCdCdgDsply("[");}
		if(chargeitemdefinitioncodecoding.hasDisplay()) {

			c.addChrgItmDfnCdCdgDsply(String.valueOf(chargeitemdefinitioncodecoding.getDisplay()));
		} else {
			c.addChrgItmDfnCdCdgDsply("NULL");
		}

		if(chargeitemdefinitioncodecodingi == chargeitemdefinitioncodecodinglist.size()-1) {c.addChrgItmDfnCdCdgDsply("]");}


		/******************** ChrgItmDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitioncodecodingi == 0) {c.addChrgItmDfnCdCdgVrsn("[");}
		if(chargeitemdefinitioncodecoding.hasVersion()) {

			c.addChrgItmDfnCdCdgVrsn(String.valueOf(chargeitemdefinitioncodecoding.getVersion()));
		} else {
			c.addChrgItmDfnCdCdgVrsn("NULL");
		}

		if(chargeitemdefinitioncodecodingi == chargeitemdefinitioncodecodinglist.size()-1) {c.addChrgItmDfnCdCdgVrsn("]");}


		/******************** ChrgItmDfn_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitioncodecodingi == 0) {c.addChrgItmDfnCdCdgCd("[");}
		if(chargeitemdefinitioncodecoding.hasCode()) {

			c.addChrgItmDfnCdCdgCd(String.valueOf(chargeitemdefinitioncodecoding.getCode()));
		} else {
			c.addChrgItmDfnCdCdgCd("NULL");
		}

		if(chargeitemdefinitioncodecodingi == chargeitemdefinitioncodecodinglist.size()-1) {c.addChrgItmDfnCdCdgCd("]");}


		/******************** ChrgItmDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitioncodecodingi == 0) {c.addChrgItmDfnCdCdgUsrSltd("[");}
		if(chargeitemdefinitioncodecoding.hasUserSelected()) {

			c.addChrgItmDfnCdCdgUsrSltd(String.valueOf(chargeitemdefinitioncodecoding.getUserSelected()));
		} else {
			c.addChrgItmDfnCdCdgUsrSltd("NULL");
		}

		if(chargeitemdefinitioncodecodingi == chargeitemdefinitioncodecodinglist.size()-1) {c.addChrgItmDfnCdCdgUsrSltd("]");}


		/******************** ChrgItmDfn_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitioncodecodingi == 0) {c.addChrgItmDfnCdCdgSys("[");}
		if(chargeitemdefinitioncodecoding.hasSystem()) {

			c.addChrgItmDfnCdCdgSys(String.valueOf(chargeitemdefinitioncodecoding.getSystem()));
		} else {
			c.addChrgItmDfnCdCdgSys("NULL");
		}

		if(chargeitemdefinitioncodecodingi == chargeitemdefinitioncodecodinglist.size()-1) {c.addChrgItmDfnCdCdgSys("]");}


		 };
		/******************** chargeitemdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus chargeitemdefinitionstatus = chargeitemdefinition.getStatus();
		if(chargeitemdefinitionstatus!=null) {
			c.addChrgItmDfnSts(chargeitemdefinitionstatus.toCode());
		} else {
			c.addChrgItmDfnSts("NULL");
		}

		/******************** ChrgItmDfn_Dscrptn ********************************************************************************/
		if(chargeitemdefinition.hasDescription()) {

			c.addChrgItmDfnDscrptn(String.valueOf(chargeitemdefinition.getDescription()));
		} else {
			c.addChrgItmDfnDscrptn("NULL");
		}


		/******************** chargeitemdefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> chargeitemdefinitionidentifierlist = chargeitemdefinition.getIdentifier();
		for(int chargeitemdefinitionidentifieri = 0; chargeitemdefinitionidentifieri<chargeitemdefinitionidentifierlist.size();chargeitemdefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  chargeitemdefinitionidentifier = chargeitemdefinitionidentifierlist.get(chargeitemdefinitionidentifieri);

		/******************** ChrgItmDfn_Id_Vl ********************************************************************************/
		if(chargeitemdefinitionidentifieri == 0) {c.addChrgItmDfnIdVl("[");}
		if(chargeitemdefinitionidentifier.hasValue()) {

			c.addChrgItmDfnIdVl(String.valueOf(chargeitemdefinitionidentifier.getValue()));
		} else {
			c.addChrgItmDfnIdVl("NULL");
		}

		if(chargeitemdefinitionidentifieri == chargeitemdefinitionidentifierlist.size()-1) {c.addChrgItmDfnIdVl("]");}


		/******************** chargeitemdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionidentifiertype = chargeitemdefinitionidentifier.getType();

		/******************** ChrgItmDfn_Id_Typ_Txt ********************************************************************************/
		if(chargeitemdefinitionidentifieri == 0) {c.addChrgItmDfnIdTypTxt("[");}
		if(chargeitemdefinitionidentifiertype.hasText()) {

			c.addChrgItmDfnIdTypTxt(String.valueOf(chargeitemdefinitionidentifiertype.getText()));
		} else {
			c.addChrgItmDfnIdTypTxt("NULL");
		}

		if(chargeitemdefinitionidentifieri == chargeitemdefinitionidentifierlist.size()-1) {c.addChrgItmDfnIdTypTxt("]");}


		/******************** chargeitemdefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemdefinitionidentifiertypecodinglist = chargeitemdefinitionidentifiertype.getCoding();
		for(int chargeitemdefinitionidentifiertypecodingi = 0; chargeitemdefinitionidentifiertypecodingi<chargeitemdefinitionidentifiertypecodinglist.size();chargeitemdefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemdefinitionidentifiertypecoding = chargeitemdefinitionidentifiertypecodinglist.get(chargeitemdefinitionidentifiertypecodingi);

		/******************** ChrgItmDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecodingi == 0) {c.addChrgItmDfnIdTypCdgDsply("[[");}
		if(chargeitemdefinitionidentifiertypecoding.hasDisplay()) {

			c.addChrgItmDfnIdTypCdgDsply(String.valueOf(chargeitemdefinitionidentifiertypecoding.getDisplay()));
		} else {
			c.addChrgItmDfnIdTypCdgDsply("NULL");
		}

		if(chargeitemdefinitionidentifiertypecodingi == chargeitemdefinitionidentifiertypecodinglist.size()-1) {c.addChrgItmDfnIdTypCdgDsply("]]");}


		/******************** ChrgItmDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecodingi == 0) {c.addChrgItmDfnIdTypCdgVrsn("[[");}
		if(chargeitemdefinitionidentifiertypecoding.hasVersion()) {

			c.addChrgItmDfnIdTypCdgVrsn(String.valueOf(chargeitemdefinitionidentifiertypecoding.getVersion()));
		} else {
			c.addChrgItmDfnIdTypCdgVrsn("NULL");
		}

		if(chargeitemdefinitionidentifiertypecodingi == chargeitemdefinitionidentifiertypecodinglist.size()-1) {c.addChrgItmDfnIdTypCdgVrsn("]]");}


		/******************** ChrgItmDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecodingi == 0) {c.addChrgItmDfnIdTypCdgCd("[[");}
		if(chargeitemdefinitionidentifiertypecoding.hasCode()) {

			c.addChrgItmDfnIdTypCdgCd(String.valueOf(chargeitemdefinitionidentifiertypecoding.getCode()));
		} else {
			c.addChrgItmDfnIdTypCdgCd("NULL");
		}

		if(chargeitemdefinitionidentifiertypecodingi == chargeitemdefinitionidentifiertypecodinglist.size()-1) {c.addChrgItmDfnIdTypCdgCd("]]");}


		/******************** ChrgItmDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecodingi == 0) {c.addChrgItmDfnIdTypCdgUsrSltd("[[");}
		if(chargeitemdefinitionidentifiertypecoding.hasUserSelected()) {

			c.addChrgItmDfnIdTypCdgUsrSltd(String.valueOf(chargeitemdefinitionidentifiertypecoding.getUserSelected()));
		} else {
			c.addChrgItmDfnIdTypCdgUsrSltd("NULL");
		}

		if(chargeitemdefinitionidentifiertypecodingi == chargeitemdefinitionidentifiertypecodinglist.size()-1) {c.addChrgItmDfnIdTypCdgUsrSltd("]]");}


		/******************** ChrgItmDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecodingi == 0) {c.addChrgItmDfnIdTypCdgSys("[[");}
		if(chargeitemdefinitionidentifiertypecoding.hasSystem()) {

			c.addChrgItmDfnIdTypCdgSys(String.valueOf(chargeitemdefinitionidentifiertypecoding.getSystem()));
		} else {
			c.addChrgItmDfnIdTypCdgSys("NULL");
		}

		if(chargeitemdefinitionidentifiertypecodingi == chargeitemdefinitionidentifiertypecodinglist.size()-1) {c.addChrgItmDfnIdTypCdgSys("]]");}


		 };
		/******************** chargeitemdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitionidentifierperiod = chargeitemdefinitionidentifier.getPeriod();

		/******************** ChrgItmDfn_Id_Prd_Strt ********************************************************************************/
		if(chargeitemdefinitionidentifieri == 0) {c.addChrgItmDfnIdPrdStrt("[");}
		if(chargeitemdefinitionidentifierperiod.hasStart()) {

			c.addChrgItmDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinitionidentifierperiod.getStart())+"\"");
		} else {
			c.addChrgItmDfnIdPrdStrt("NULL");
		}

		if(chargeitemdefinitionidentifieri == chargeitemdefinitionidentifierlist.size()-1) {c.addChrgItmDfnIdPrdStrt("]");}


		/******************** ChrgItmDfn_Id_Prd_End ********************************************************************************/
		if(chargeitemdefinitionidentifieri == 0) {c.addChrgItmDfnIdPrdEnd("[");}
		if(chargeitemdefinitionidentifierperiod.hasEnd()) {

			c.addChrgItmDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinitionidentifierperiod.getEnd())+"\"");
		} else {
			c.addChrgItmDfnIdPrdEnd("NULL");
		}

		if(chargeitemdefinitionidentifieri == chargeitemdefinitionidentifierlist.size()-1) {c.addChrgItmDfnIdPrdEnd("]");}


		/******************** chargeitemdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse chargeitemdefinitionidentifieruse = chargeitemdefinitionidentifier.getUse();
		if(chargeitemdefinitionidentifieruse!=null) {
		if(chargeitemdefinitionidentifieri == 0) {

		c.addChrgItmDfnIdUse("[");		}
			c.addChrgItmDfnIdUse(chargeitemdefinitionidentifieruse.toCode());
		if(chargeitemdefinitionidentifieri == chargeitemdefinitionidentifierlist.size()-1) {

		c.addChrgItmDfnIdUse("]");		}

		} else {
			c.addChrgItmDfnIdUse("NULL");
		}

		/******************** ChrgItmDfn_Id_Assigner ********************************************************************************/
		if(chargeitemdefinitionidentifieri == 0) {c.addChrgItmDfnIdAssigner("[");}
		if(chargeitemdefinitionidentifier.hasAssigner()) {

			if(chargeitemdefinitionidentifier.getAssigner().getReference() != null) {
			c.addChrgItmDfnIdAssigner(chargeitemdefinitionidentifier.getAssigner().getReference());
			}
		} else {
			c.addChrgItmDfnIdAssigner("NULL");
		}

		if(chargeitemdefinitionidentifieri == chargeitemdefinitionidentifierlist.size()-1) {c.addChrgItmDfnIdAssigner("]");}


		/******************** ChrgItmDfn_Id_Sys ********************************************************************************/
		if(chargeitemdefinitionidentifieri == 0) {c.addChrgItmDfnIdSys("[");}
		if(chargeitemdefinitionidentifier.hasSystem()) {

			c.addChrgItmDfnIdSys(String.valueOf(chargeitemdefinitionidentifier.getSystem()));
		} else {
			c.addChrgItmDfnIdSys("NULL");
		}

		if(chargeitemdefinitionidentifieri == chargeitemdefinitionidentifierlist.size()-1) {c.addChrgItmDfnIdSys("]");}


		 };
		/******************** ChrgItmDfn_Replaces ********************************************************************************/
		if(chargeitemdefinition.hasReplaces()) {

			String  array = "[";
			for(int incr=0; incr<chargeitemdefinition.getReplaces().size(); incr++) {
				array = array + chargeitemdefinition.getReplaces().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmDfnReplaces(array);

		} else {
			c.addChrgItmDfnReplaces("NULL");
		}


		/******************** chargeitemdefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> chargeitemdefinitioncontactlist = chargeitemdefinition.getContact();
		for(int chargeitemdefinitioncontacti = 0; chargeitemdefinitioncontacti<chargeitemdefinitioncontactlist.size();chargeitemdefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  chargeitemdefinitioncontact = chargeitemdefinitioncontactlist.get(chargeitemdefinitioncontacti);

		/******************** ChrgItmDfn_Cntct_Nm ********************************************************************************/
		if(chargeitemdefinitioncontacti == 0) {c.addChrgItmDfnCntctNm("[");}
		if(chargeitemdefinitioncontact.hasName()) {

			c.addChrgItmDfnCntctNm(String.valueOf(chargeitemdefinitioncontact.getName()));
		} else {
			c.addChrgItmDfnCntctNm("NULL");
		}

		if(chargeitemdefinitioncontacti == chargeitemdefinitioncontactlist.size()-1) {c.addChrgItmDfnCntctNm("]");}


		/******************** chargeitemdefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> chargeitemdefinitioncontacttelecomlist = chargeitemdefinitioncontact.getTelecom();
		for(int chargeitemdefinitioncontacttelecomi = 0; chargeitemdefinitioncontacttelecomi<chargeitemdefinitioncontacttelecomlist.size();chargeitemdefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  chargeitemdefinitioncontacttelecom = chargeitemdefinitioncontacttelecomlist.get(chargeitemdefinitioncontacttelecomi);

		/******************** ChrgItmDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(chargeitemdefinitioncontacttelecomi == 0) {c.addChrgItmDfnCntctTlcmVl("[[");}
		if(chargeitemdefinitioncontacttelecom.hasValue()) {

			c.addChrgItmDfnCntctTlcmVl(String.valueOf(chargeitemdefinitioncontacttelecom.getValue()));
		} else {
			c.addChrgItmDfnCntctTlcmVl("NULL");
		}

		if(chargeitemdefinitioncontacttelecomi == chargeitemdefinitioncontacttelecomlist.size()-1) {c.addChrgItmDfnCntctTlcmVl("]]");}


		/******************** chargeitemdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitioncontacttelecomperiod = chargeitemdefinitioncontacttelecom.getPeriod();

		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(chargeitemdefinitioncontacttelecomi == 0) {c.addChrgItmDfnCntctTlcmPrdStrt("[[");}
		if(chargeitemdefinitioncontacttelecomperiod.hasStart()) {

			c.addChrgItmDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			c.addChrgItmDfnCntctTlcmPrdStrt("NULL");
		}

		if(chargeitemdefinitioncontacttelecomi == chargeitemdefinitioncontacttelecomlist.size()-1) {c.addChrgItmDfnCntctTlcmPrdStrt("]]");}


		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(chargeitemdefinitioncontacttelecomi == 0) {c.addChrgItmDfnCntctTlcmPrdEnd("[[");}
		if(chargeitemdefinitioncontacttelecomperiod.hasEnd()) {

			c.addChrgItmDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			c.addChrgItmDfnCntctTlcmPrdEnd("NULL");
		}

		if(chargeitemdefinitioncontacttelecomi == chargeitemdefinitioncontacttelecomlist.size()-1) {c.addChrgItmDfnCntctTlcmPrdEnd("]]");}


		/******************** chargeitemdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse chargeitemdefinitioncontacttelecomuse = chargeitemdefinitioncontacttelecom.getUse();
		if(chargeitemdefinitioncontacttelecomuse!=null) {
		if(chargeitemdefinitioncontacttelecomi == 0) {

		c.addChrgItmDfnCntctTlcmUse("[[");		}
			c.addChrgItmDfnCntctTlcmUse(chargeitemdefinitioncontacttelecomuse.toCode());
		if(chargeitemdefinitioncontacttelecomi == chargeitemdefinitioncontacttelecomlist.size()-1) {

		c.addChrgItmDfnCntctTlcmUse("]]");		}

		} else {
			c.addChrgItmDfnCntctTlcmUse("NULL");
		}

		/******************** chargeitemdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem chargeitemdefinitioncontacttelecomsystem = chargeitemdefinitioncontacttelecom.getSystem();
		if(chargeitemdefinitioncontacttelecomsystem!=null) {
		if(chargeitemdefinitioncontacttelecomi == 0) {

		c.addChrgItmDfnCntctTlcmSys("[[");		}
			c.addChrgItmDfnCntctTlcmSys(chargeitemdefinitioncontacttelecomsystem.toCode());
		if(chargeitemdefinitioncontacttelecomi == chargeitemdefinitioncontacttelecomlist.size()-1) {

		c.addChrgItmDfnCntctTlcmSys("]]");		}

		} else {
			c.addChrgItmDfnCntctTlcmSys("NULL");
		}

		/******************** ChrgItmDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(chargeitemdefinitioncontacttelecomi == 0) {c.addChrgItmDfnCntctTlcmRnk("[[");}
		if(chargeitemdefinitioncontacttelecom.hasRank()) {

			c.addChrgItmDfnCntctTlcmRnk(String.valueOf(chargeitemdefinitioncontacttelecom.getRank()));
		} else {
			c.addChrgItmDfnCntctTlcmRnk("NULL");
		}

		if(chargeitemdefinitioncontacttelecomi == chargeitemdefinitioncontacttelecomlist.size()-1) {c.addChrgItmDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** ChrgItmDfn_Copyright ********************************************************************************/
		if(chargeitemdefinition.hasCopyright()) {

			c.addChrgItmDfnCopyright(String.valueOf(chargeitemdefinition.getCopyright()));
		} else {
			c.addChrgItmDfnCopyright("NULL");
		}


		/******************** ChrgItmDfn_ApprovalDt ********************************************************************************/
		if(chargeitemdefinition.hasApprovalDate()) {

			c.addChrgItmDfnApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinition.getApprovalDate())+"\"");
		} else {
			c.addChrgItmDfnApprovalDt("NULL");
		}


		/******************** ChrgItmDfn_LastReviewDt ********************************************************************************/
		if(chargeitemdefinition.hasLastReviewDate()) {

			c.addChrgItmDfnLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinition.getLastReviewDate())+"\"");
		} else {
			c.addChrgItmDfnLastReviewDt("NULL");
		}


		/******************** ChrgItmDfn_Ttl ********************************************************************************/
		if(chargeitemdefinition.hasTitle()) {

			c.addChrgItmDfnTtl(String.valueOf(chargeitemdefinition.getTitle()));
		} else {
			c.addChrgItmDfnTtl("NULL");
		}


		/******************** ChrgItmDfn_Url ********************************************************************************/
		if(chargeitemdefinition.hasUrl()) {

			c.addChrgItmDfnUrl(String.valueOf(chargeitemdefinition.getUrl()));
		} else {
			c.addChrgItmDfnUrl("NULL");
		}


		/******************** chargeitemdefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> chargeitemdefinitionjurisdictionlist = chargeitemdefinition.getJurisdiction();
		for(int chargeitemdefinitionjurisdictioni = 0; chargeitemdefinitionjurisdictioni<chargeitemdefinitionjurisdictionlist.size();chargeitemdefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  chargeitemdefinitionjurisdiction = chargeitemdefinitionjurisdictionlist.get(chargeitemdefinitionjurisdictioni);

		/******************** ChrgItmDfn_Jrsdctn_Txt ********************************************************************************/
		if(chargeitemdefinitionjurisdictioni == 0) {c.addChrgItmDfnJrsdctnTxt("[");}
		if(chargeitemdefinitionjurisdiction.hasText()) {

			c.addChrgItmDfnJrsdctnTxt(String.valueOf(chargeitemdefinitionjurisdiction.getText()));
		} else {
			c.addChrgItmDfnJrsdctnTxt("NULL");
		}

		if(chargeitemdefinitionjurisdictioni == chargeitemdefinitionjurisdictionlist.size()-1) {c.addChrgItmDfnJrsdctnTxt("]");}


		/******************** chargeitemdefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemdefinitionjurisdictioncodinglist = chargeitemdefinitionjurisdiction.getCoding();
		for(int chargeitemdefinitionjurisdictioncodingi = 0; chargeitemdefinitionjurisdictioncodingi<chargeitemdefinitionjurisdictioncodinglist.size();chargeitemdefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemdefinitionjurisdictioncoding = chargeitemdefinitionjurisdictioncodinglist.get(chargeitemdefinitionjurisdictioncodingi);

		/******************** ChrgItmDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncodingi == 0) {c.addChrgItmDfnJrsdctnCdgDsply("[[");}
		if(chargeitemdefinitionjurisdictioncoding.hasDisplay()) {

			c.addChrgItmDfnJrsdctnCdgDsply(String.valueOf(chargeitemdefinitionjurisdictioncoding.getDisplay()));
		} else {
			c.addChrgItmDfnJrsdctnCdgDsply("NULL");
		}

		if(chargeitemdefinitionjurisdictioncodingi == chargeitemdefinitionjurisdictioncodinglist.size()-1) {c.addChrgItmDfnJrsdctnCdgDsply("]]");}


		/******************** ChrgItmDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncodingi == 0) {c.addChrgItmDfnJrsdctnCdgVrsn("[[");}
		if(chargeitemdefinitionjurisdictioncoding.hasVersion()) {

			c.addChrgItmDfnJrsdctnCdgVrsn(String.valueOf(chargeitemdefinitionjurisdictioncoding.getVersion()));
		} else {
			c.addChrgItmDfnJrsdctnCdgVrsn("NULL");
		}

		if(chargeitemdefinitionjurisdictioncodingi == chargeitemdefinitionjurisdictioncodinglist.size()-1) {c.addChrgItmDfnJrsdctnCdgVrsn("]]");}


		/******************** ChrgItmDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncodingi == 0) {c.addChrgItmDfnJrsdctnCdgCd("[[");}
		if(chargeitemdefinitionjurisdictioncoding.hasCode()) {

			c.addChrgItmDfnJrsdctnCdgCd(String.valueOf(chargeitemdefinitionjurisdictioncoding.getCode()));
		} else {
			c.addChrgItmDfnJrsdctnCdgCd("NULL");
		}

		if(chargeitemdefinitionjurisdictioncodingi == chargeitemdefinitionjurisdictioncodinglist.size()-1) {c.addChrgItmDfnJrsdctnCdgCd("]]");}


		/******************** ChrgItmDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncodingi == 0) {c.addChrgItmDfnJrsdctnCdgUsrSltd("[[");}
		if(chargeitemdefinitionjurisdictioncoding.hasUserSelected()) {

			c.addChrgItmDfnJrsdctnCdgUsrSltd(String.valueOf(chargeitemdefinitionjurisdictioncoding.getUserSelected()));
		} else {
			c.addChrgItmDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(chargeitemdefinitionjurisdictioncodingi == chargeitemdefinitionjurisdictioncodinglist.size()-1) {c.addChrgItmDfnJrsdctnCdgUsrSltd("]]");}


		/******************** ChrgItmDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncodingi == 0) {c.addChrgItmDfnJrsdctnCdgSys("[[");}
		if(chargeitemdefinitionjurisdictioncoding.hasSystem()) {

			c.addChrgItmDfnJrsdctnCdgSys(String.valueOf(chargeitemdefinitionjurisdictioncoding.getSystem()));
		} else {
			c.addChrgItmDfnJrsdctnCdgSys("NULL");
		}

		if(chargeitemdefinitionjurisdictioncodingi == chargeitemdefinitionjurisdictioncodinglist.size()-1) {c.addChrgItmDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** chargeitemdefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> chargeitemdefinitionusecontextlist = chargeitemdefinition.getUseContext();
		for(int chargeitemdefinitionusecontexti = 0; chargeitemdefinitionusecontexti<chargeitemdefinitionusecontextlist.size();chargeitemdefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  chargeitemdefinitionusecontext = chargeitemdefinitionusecontextlist.get(chargeitemdefinitionusecontexti);

		/******************** chargeitemdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionusecontextcode = chargeitemdefinitionusecontext.getCode();

		/******************** ChrgItmDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtCdDsply("[");}
		if(chargeitemdefinitionusecontextcode.hasDisplay()) {

			c.addChrgItmDfnUseCntxtCdDsply(String.valueOf(chargeitemdefinitionusecontextcode.getDisplay()));
		} else {
			c.addChrgItmDfnUseCntxtCdDsply("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtCdDsply("]");}


		/******************** ChrgItmDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtCdVrsn("[");}
		if(chargeitemdefinitionusecontextcode.hasVersion()) {

			c.addChrgItmDfnUseCntxtCdVrsn(String.valueOf(chargeitemdefinitionusecontextcode.getVersion()));
		} else {
			c.addChrgItmDfnUseCntxtCdVrsn("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtCdVrsn("]");}


		/******************** ChrgItmDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtCdUsrSltd("[");}
		if(chargeitemdefinitionusecontextcode.hasUserSelected()) {

			c.addChrgItmDfnUseCntxtCdUsrSltd(String.valueOf(chargeitemdefinitionusecontextcode.getUserSelected()));
		} else {
			c.addChrgItmDfnUseCntxtCdUsrSltd("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtCdUsrSltd("]");}


		/******************** ChrgItmDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtCdSys("[");}
		if(chargeitemdefinitionusecontextcode.hasSystem()) {

			c.addChrgItmDfnUseCntxtCdSys(String.valueOf(chargeitemdefinitionusecontextcode.getSystem()));
		} else {
			c.addChrgItmDfnUseCntxtCdSys("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtCdSys("]");}


		/******************** ChrgItmDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRfrnc("[");}
		if(chargeitemdefinitionusecontext.hasValueReference()) {

			if(chargeitemdefinitionusecontext.getValueReference().getReference() != null) {
			c.addChrgItmDfnUseCntxtVlRfrnc(chargeitemdefinitionusecontext.getValueReference().getReference());
			}
		} else {
			c.addChrgItmDfnUseCntxtVlRfrnc("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRfrnc("]");}


		/******************** chargeitemdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionusecontextvaluecodeableconcept = chargeitemdefinitionusecontext.getValueCodeableConcept();

		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlCdbleCncptTxt("[");}
		if(chargeitemdefinitionusecontextvaluecodeableconcept.hasText()) {

			c.addChrgItmDfnUseCntxtVlCdbleCncptTxt(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			c.addChrgItmDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** chargeitemdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemdefinitionusecontextvaluecodeableconceptcodinglist = chargeitemdefinitionusecontextvaluecodeableconcept.getCoding();
		for(int chargeitemdefinitionusecontextvaluecodeableconceptcodingi = 0; chargeitemdefinitionusecontextvaluecodeableconceptcodingi<chargeitemdefinitionusecontextvaluecodeableconceptcodinglist.size();chargeitemdefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemdefinitionusecontextvaluecodeableconceptcoding = chargeitemdefinitionusecontextvaluecodeableconceptcodinglist.get(chargeitemdefinitionusecontextvaluecodeableconceptcodingi);

		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == chargeitemdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == chargeitemdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == chargeitemdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == chargeitemdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			c.addChrgItmDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(chargeitemdefinitionusecontextvaluecodeableconceptcodingi == chargeitemdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addChrgItmDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** chargeitemdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range chargeitemdefinitionusecontextvaluerange = chargeitemdefinitionusecontext.getValueRange();

		/******************** chargeitemdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluerangelow = chargeitemdefinitionusecontextvaluerange.getLow();

		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngLwVl("[");}
		if(chargeitemdefinitionusecontextvaluerangelow.hasValue()) {

			c.addChrgItmDfnUseCntxtVlRngLwVl(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getValue()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngLwVl("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngLwVl("]");}


		/******************** chargeitemdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemdefinitionusecontextvaluerangelowcomparator = chargeitemdefinitionusecontextvaluerangelow.getComparator();
		if(chargeitemdefinitionusecontextvaluerangelowcomparator!=null) {
		if(chargeitemdefinitionusecontexti == 0) {

		c.addChrgItmDfnUseCntxtVlRngLwCmprtr("[");		}
			c.addChrgItmDfnUseCntxtVlRngLwCmprtr(chargeitemdefinitionusecontextvaluerangelowcomparator.toCode());
		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {

		c.addChrgItmDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			c.addChrgItmDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngLwCd("[");}
		if(chargeitemdefinitionusecontextvaluerangelow.hasCode()) {

			c.addChrgItmDfnUseCntxtVlRngLwCd(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getCode()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngLwCd("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngLwCd("]");}


		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngLwUnt("[");}
		if(chargeitemdefinitionusecontextvaluerangelow.hasUnit()) {

			c.addChrgItmDfnUseCntxtVlRngLwUnt(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getUnit()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngLwUnt("]");}


		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngLwSys("[");}
		if(chargeitemdefinitionusecontextvaluerangelow.hasSystem()) {

			c.addChrgItmDfnUseCntxtVlRngLwSys(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getSystem()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngLwSys("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngLwSys("]");}


		/******************** chargeitemdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluerangehigh = chargeitemdefinitionusecontextvaluerange.getHigh();

		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngHiVl("[");}
		if(chargeitemdefinitionusecontextvaluerangehigh.hasValue()) {

			c.addChrgItmDfnUseCntxtVlRngHiVl(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getValue()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngHiVl("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngHiVl("]");}


		/******************** chargeitemdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemdefinitionusecontextvaluerangehighcomparator = chargeitemdefinitionusecontextvaluerangehigh.getComparator();
		if(chargeitemdefinitionusecontextvaluerangehighcomparator!=null) {
		if(chargeitemdefinitionusecontexti == 0) {

		c.addChrgItmDfnUseCntxtVlRngHiCmprtr("[");		}
			c.addChrgItmDfnUseCntxtVlRngHiCmprtr(chargeitemdefinitionusecontextvaluerangehighcomparator.toCode());
		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {

		c.addChrgItmDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			c.addChrgItmDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngHiCd("[");}
		if(chargeitemdefinitionusecontextvaluerangehigh.hasCode()) {

			c.addChrgItmDfnUseCntxtVlRngHiCd(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getCode()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngHiCd("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngHiCd("]");}


		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngHiUnt("[");}
		if(chargeitemdefinitionusecontextvaluerangehigh.hasUnit()) {

			c.addChrgItmDfnUseCntxtVlRngHiUnt(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngHiUnt("]");}


		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlRngHiSys("[");}
		if(chargeitemdefinitionusecontextvaluerangehigh.hasSystem()) {

			c.addChrgItmDfnUseCntxtVlRngHiSys(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			c.addChrgItmDfnUseCntxtVlRngHiSys("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlRngHiSys("]");}


		/******************** chargeitemdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluequantity = chargeitemdefinitionusecontext.getValueQuantity();

		/******************** ChrgItmDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlQntyVl("[");}
		if(chargeitemdefinitionusecontextvaluequantity.hasValue()) {

			c.addChrgItmDfnUseCntxtVlQntyVl(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getValue()));
		} else {
			c.addChrgItmDfnUseCntxtVlQntyVl("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlQntyVl("]");}


		/******************** chargeitemdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemdefinitionusecontextvaluequantitycomparator = chargeitemdefinitionusecontextvaluequantity.getComparator();
		if(chargeitemdefinitionusecontextvaluequantitycomparator!=null) {
		if(chargeitemdefinitionusecontexti == 0) {

		c.addChrgItmDfnUseCntxtVlQntyCmprtr("[");		}
			c.addChrgItmDfnUseCntxtVlQntyCmprtr(chargeitemdefinitionusecontextvaluequantitycomparator.toCode());
		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {

		c.addChrgItmDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			c.addChrgItmDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** ChrgItmDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlQntyCd("[");}
		if(chargeitemdefinitionusecontextvaluequantity.hasCode()) {

			c.addChrgItmDfnUseCntxtVlQntyCd(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getCode()));
		} else {
			c.addChrgItmDfnUseCntxtVlQntyCd("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlQntyCd("]");}


		/******************** ChrgItmDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlQntyUnt("[");}
		if(chargeitemdefinitionusecontextvaluequantity.hasUnit()) {

			c.addChrgItmDfnUseCntxtVlQntyUnt(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getUnit()));
		} else {
			c.addChrgItmDfnUseCntxtVlQntyUnt("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlQntyUnt("]");}


		/******************** ChrgItmDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontexti == 0) {c.addChrgItmDfnUseCntxtVlQntySys("[");}
		if(chargeitemdefinitionusecontextvaluequantity.hasSystem()) {

			c.addChrgItmDfnUseCntxtVlQntySys(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getSystem()));
		} else {
			c.addChrgItmDfnUseCntxtVlQntySys("NULL");
		}

		if(chargeitemdefinitionusecontexti == chargeitemdefinitionusecontextlist.size()-1) {c.addChrgItmDfnUseCntxtVlQntySys("]");}


		 };
		/******************** ChrgItmDfn_Exprmtl ********************************************************************************/
		if(chargeitemdefinition.hasExperimental()) {

			c.addChrgItmDfnExprmtl(String.valueOf(chargeitemdefinition.getExperimental()));
		} else {
			c.addChrgItmDfnExprmtl("NULL");
		}


		/******************** ChrgItmDfn_Pblshr ********************************************************************************/
		if(chargeitemdefinition.hasPublisher()) {

			c.addChrgItmDfnPblshr(String.valueOf(chargeitemdefinition.getPublisher()));
		} else {
			c.addChrgItmDfnPblshr("NULL");
		}


		/******************** chargeitemdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitioneffectiveperiod = chargeitemdefinition.getEffectivePeriod();

		/******************** ChrgItmDfn_EfctivePrd_Strt ********************************************************************************/
		if(chargeitemdefinitioneffectiveperiod.hasStart()) {

			c.addChrgItmDfnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinitioneffectiveperiod.getStart())+"\"");
		} else {
			c.addChrgItmDfnEfctivePrdStrt("NULL");
		}


		/******************** ChrgItmDfn_EfctivePrd_End ********************************************************************************/
		if(chargeitemdefinitioneffectiveperiod.hasEnd()) {

			c.addChrgItmDfnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(chargeitemdefinitioneffectiveperiod.getEnd())+"\"");
		} else {
			c.addChrgItmDfnEfctivePrdEnd("NULL");
		}


		/******************** ChrgItmDfn_DerivedFromUri ********************************************************************************/
		if(chargeitemdefinition.hasDerivedFromUri()) {

			String  array = "[";
			for(int incr=0; incr<chargeitemdefinition.getDerivedFromUri().size(); incr++) {
				array = array + chargeitemdefinition.getDerivedFromUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmDfnDerivedFromUri(array);

		} else {
			c.addChrgItmDfnDerivedFromUri("NULL");
		}


		/******************** chargeitemdefinitionpropertygroup ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupComponent> chargeitemdefinitionpropertygrouplist = chargeitemdefinition.getPropertyGroup();
		for(int chargeitemdefinitionpropertygroupi = 0; chargeitemdefinitionpropertygroupi<chargeitemdefinitionpropertygrouplist.size();chargeitemdefinitionpropertygroupi++ ) {
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupComponent  chargeitemdefinitionpropertygroup = chargeitemdefinitionpropertygrouplist.get(chargeitemdefinitionpropertygroupi);

		/******************** chargeitemdefinitionpropertygrouppricecomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupPriceComponentComponent> chargeitemdefinitionpropertygrouppricecomponentlist = chargeitemdefinitionpropertygroup.getPriceComponent();
		for(int chargeitemdefinitionpropertygrouppricecomponenti = 0; chargeitemdefinitionpropertygrouppricecomponenti<chargeitemdefinitionpropertygrouppricecomponentlist.size();chargeitemdefinitionpropertygrouppricecomponenti++ ) {
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupPriceComponentComponent  chargeitemdefinitionpropertygrouppricecomponent = chargeitemdefinitionpropertygrouppricecomponentlist.get(chargeitemdefinitionpropertygrouppricecomponenti);

		/******************** chargeitemdefinitionpropertygrouppricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPriceComponentType chargeitemdefinitionpropertygrouppricecomponenttype = chargeitemdefinitionpropertygrouppricecomponent.getType();
		if(chargeitemdefinitionpropertygrouppricecomponenttype!=null) {
		if(chargeitemdefinitionpropertygrouppricecomponenti == 0) {

		c.addChrgItmDfnPrptyGrpPriceCmpntTyp("[[");		}
			c.addChrgItmDfnPrptyGrpPriceCmpntTyp(chargeitemdefinitionpropertygrouppricecomponenttype.toCode());
		if(chargeitemdefinitionpropertygrouppricecomponenti == chargeitemdefinitionpropertygrouppricecomponentlist.size()-1) {

		c.addChrgItmDfnPrptyGrpPriceCmpntTyp("]]");		}

		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntTyp("NULL");
		}

		/******************** chargeitemdefinitionpropertygrouppricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionpropertygrouppricecomponentcode = chargeitemdefinitionpropertygrouppricecomponent.getCode();

		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponenti == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntCdTxt("[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentcode.hasText()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntCdTxt(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcode.getText()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntCdTxt("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponenti == chargeitemdefinitionpropertygrouppricecomponentlist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntCdTxt("]]");}


		/******************** chargeitemdefinitionpropertygrouppricecomponentcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> chargeitemdefinitionpropertygrouppricecomponentcodecodinglist = chargeitemdefinitionpropertygrouppricecomponentcode.getCoding();
		for(int chargeitemdefinitionpropertygrouppricecomponentcodecodingi = 0; chargeitemdefinitionpropertygrouppricecomponentcodecodingi<chargeitemdefinitionpropertygrouppricecomponentcodecodinglist.size();chargeitemdefinitionpropertygrouppricecomponentcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  chargeitemdefinitionpropertygrouppricecomponentcodecoding = chargeitemdefinitionpropertygrouppricecomponentcodecodinglist.get(chargeitemdefinitionpropertygrouppricecomponentcodecodingi);

		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply("[[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasDisplay()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getDisplay()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == chargeitemdefinitionpropertygrouppricecomponentcodecodinglist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply("]]]");}


		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn("[[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasVersion()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getVersion()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == chargeitemdefinitionpropertygrouppricecomponentcodecodinglist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn("]]]");}


		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgCd("[[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasCode()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgCd(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getCode()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgCd("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == chargeitemdefinitionpropertygrouppricecomponentcodecodinglist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgCd("]]]");}


		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd("[[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasUserSelected()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getUserSelected()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == chargeitemdefinitionpropertygrouppricecomponentcodecodinglist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd("]]]");}


		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgSys("[[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasSystem()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgSys(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getSystem()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgSys("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponentcodecodingi == chargeitemdefinitionpropertygrouppricecomponentcodecodinglist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntCdCdgSys("]]]");}


		 };
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Factor ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponenti == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntFactor("[[");}
		if(chargeitemdefinitionpropertygrouppricecomponent.hasFactor()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntFactor(String.valueOf(chargeitemdefinitionpropertygrouppricecomponent.getFactor()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntFactor("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponenti == chargeitemdefinitionpropertygrouppricecomponentlist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntFactor("]]");}


		/******************** chargeitemdefinitionpropertygrouppricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money chargeitemdefinitionpropertygrouppricecomponentamount = chargeitemdefinitionpropertygrouppricecomponent.getAmount();

		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponenti == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntAmntVl("[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentamount.hasValue()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntAmntVl(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentamount.getValue()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntAmntVl("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponenti == chargeitemdefinitionpropertygrouppricecomponentlist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntAmntVl("]]");}


		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponenti == 0) {c.addChrgItmDfnPrptyGrpPriceCmpntAmntCrncy("[[");}
		if(chargeitemdefinitionpropertygrouppricecomponentamount.hasCurrency()) {

			c.addChrgItmDfnPrptyGrpPriceCmpntAmntCrncy(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentamount.getCurrency()));
		} else {
			c.addChrgItmDfnPrptyGrpPriceCmpntAmntCrncy("NULL");
		}

		if(chargeitemdefinitionpropertygrouppricecomponenti == chargeitemdefinitionpropertygrouppricecomponentlist.size()-1) {c.addChrgItmDfnPrptyGrpPriceCmpntAmntCrncy("]]");}


		 };
		/******************** chargeitemdefinitionpropertygroupapplicability ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent> chargeitemdefinitionpropertygroupapplicabilitylist = chargeitemdefinitionpropertygroup.getApplicability();
		for(int chargeitemdefinitionpropertygroupapplicabilityi = 0; chargeitemdefinitionpropertygroupapplicabilityi<chargeitemdefinitionpropertygroupapplicabilitylist.size();chargeitemdefinitionpropertygroupapplicabilityi++ ) {
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent  chargeitemdefinitionpropertygroupapplicability = chargeitemdefinitionpropertygroupapplicabilitylist.get(chargeitemdefinitionpropertygroupapplicabilityi);

		/******************** ChrgItmDfn_PrptyGrp_Applicability_Lnguage ********************************************************************************/
		if(chargeitemdefinitionpropertygroupapplicabilityi == 0) {c.addChrgItmDfnPrptyGrpApplicabilityLnguage("[[");}
		if(chargeitemdefinitionpropertygroupapplicability.hasLanguage()) {

			c.addChrgItmDfnPrptyGrpApplicabilityLnguage(String.valueOf(chargeitemdefinitionpropertygroupapplicability.getLanguage()));
		} else {
			c.addChrgItmDfnPrptyGrpApplicabilityLnguage("NULL");
		}

		if(chargeitemdefinitionpropertygroupapplicabilityi == chargeitemdefinitionpropertygroupapplicabilitylist.size()-1) {c.addChrgItmDfnPrptyGrpApplicabilityLnguage("]]");}


		/******************** ChrgItmDfn_PrptyGrp_Applicability_Dscrptn ********************************************************************************/
		if(chargeitemdefinitionpropertygroupapplicabilityi == 0) {c.addChrgItmDfnPrptyGrpApplicabilityDscrptn("[[");}
		if(chargeitemdefinitionpropertygroupapplicability.hasDescription()) {

			c.addChrgItmDfnPrptyGrpApplicabilityDscrptn(String.valueOf(chargeitemdefinitionpropertygroupapplicability.getDescription()));
		} else {
			c.addChrgItmDfnPrptyGrpApplicabilityDscrptn("NULL");
		}

		if(chargeitemdefinitionpropertygroupapplicabilityi == chargeitemdefinitionpropertygroupapplicabilitylist.size()-1) {c.addChrgItmDfnPrptyGrpApplicabilityDscrptn("]]");}


		/******************** ChrgItmDfn_PrptyGrp_Applicability_Exprsn ********************************************************************************/
		if(chargeitemdefinitionpropertygroupapplicabilityi == 0) {c.addChrgItmDfnPrptyGrpApplicabilityExprsn("[[");}
		if(chargeitemdefinitionpropertygroupapplicability.hasExpression()) {

			c.addChrgItmDfnPrptyGrpApplicabilityExprsn(String.valueOf(chargeitemdefinitionpropertygroupapplicability.getExpression()));
		} else {
			c.addChrgItmDfnPrptyGrpApplicabilityExprsn("NULL");
		}

		if(chargeitemdefinitionpropertygroupapplicabilityi == chargeitemdefinitionpropertygroupapplicabilitylist.size()-1) {c.addChrgItmDfnPrptyGrpApplicabilityExprsn("]]");}


		 };
		 };
		/******************** chargeitemdefinitionapplicability ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent> chargeitemdefinitionapplicabilitylist = chargeitemdefinition.getApplicability();
		for(int chargeitemdefinitionapplicabilityi = 0; chargeitemdefinitionapplicabilityi<chargeitemdefinitionapplicabilitylist.size();chargeitemdefinitionapplicabilityi++ ) {
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent  chargeitemdefinitionapplicability = chargeitemdefinitionapplicabilitylist.get(chargeitemdefinitionapplicabilityi);

		/******************** ChrgItmDfn_Applicability_Lnguage ********************************************************************************/
		if(chargeitemdefinitionapplicabilityi == 0) {c.addChrgItmDfnApplicabilityLnguage("[");}
		if(chargeitemdefinitionapplicability.hasLanguage()) {

			c.addChrgItmDfnApplicabilityLnguage(String.valueOf(chargeitemdefinitionapplicability.getLanguage()));
		} else {
			c.addChrgItmDfnApplicabilityLnguage("NULL");
		}

		if(chargeitemdefinitionapplicabilityi == chargeitemdefinitionapplicabilitylist.size()-1) {c.addChrgItmDfnApplicabilityLnguage("]");}


		/******************** ChrgItmDfn_Applicability_Dscrptn ********************************************************************************/
		if(chargeitemdefinitionapplicabilityi == 0) {c.addChrgItmDfnApplicabilityDscrptn("[");}
		if(chargeitemdefinitionapplicability.hasDescription()) {

			c.addChrgItmDfnApplicabilityDscrptn(String.valueOf(chargeitemdefinitionapplicability.getDescription()));
		} else {
			c.addChrgItmDfnApplicabilityDscrptn("NULL");
		}

		if(chargeitemdefinitionapplicabilityi == chargeitemdefinitionapplicabilitylist.size()-1) {c.addChrgItmDfnApplicabilityDscrptn("]");}


		/******************** ChrgItmDfn_Applicability_Exprsn ********************************************************************************/
		if(chargeitemdefinitionapplicabilityi == 0) {c.addChrgItmDfnApplicabilityExprsn("[");}
		if(chargeitemdefinitionapplicability.hasExpression()) {

			c.addChrgItmDfnApplicabilityExprsn(String.valueOf(chargeitemdefinitionapplicability.getExpression()));
		} else {
			c.addChrgItmDfnApplicabilityExprsn("NULL");
		}

		if(chargeitemdefinitionapplicabilityi == chargeitemdefinitionapplicabilitylist.size()-1) {c.addChrgItmDfnApplicabilityExprsn("]");}


		 };
		/******************** ChrgItmDfn_PartOf ********************************************************************************/
		if(chargeitemdefinition.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<chargeitemdefinition.getPartOf().size(); incr++) {
				array = array + chargeitemdefinition.getPartOf().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addChrgItmDfnPartOf(array);

		} else {
			c.addChrgItmDfnPartOf("NULL");
		}


		return c;
	}
}
