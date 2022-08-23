package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ValueSet;
public class ValueSetBidirectionalConversion 
{
	public ValueSet ValueSets(org.hl7.fhir.r4.model.ValueSet valueset) throws ParseException
	{
		 main.java.com.campfhir.model.ValueSet v = new  main.java.com.campfhir.model.ValueSet();

		/******************** id ********************************************************************************/
		v.setId(valueset.getIdElement().getIdPart());

		/******************** VlSt_Nm ********************************************************************************/
		if(valueset.hasName()) {

			v.addVlStNm(String.valueOf(valueset.getName()));
		} else {
			v.addVlStNm("NULL");
		}


		/******************** VlSt_Vrsn ********************************************************************************/
		if(valueset.hasVersion()) {

			v.addVlStVrsn(String.valueOf(valueset.getVersion()));
		} else {
			v.addVlStVrsn("NULL");
		}


		/******************** VlSt_Dt ********************************************************************************/
		if(valueset.hasDate()) {

			v.addVlStDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(valueset.getDate())+"\"");
		} else {
			v.addVlStDt("NULL");
		}


		/******************** valuesetstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus valuesetstatus = valueset.getStatus();
		if(valuesetstatus!=null) {
			v.addVlStSts(valuesetstatus.toCode());
		} else {
			v.addVlStSts("NULL");
		}

		/******************** VlSt_Dscrptn ********************************************************************************/
		if(valueset.hasDescription()) {

			v.addVlStDscrptn(String.valueOf(valueset.getDescription()));
		} else {
			v.addVlStDscrptn("NULL");
		}


		/******************** valuesetidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> valuesetidentifierlist = valueset.getIdentifier();
		for(int valuesetidentifieri = 0; valuesetidentifieri<valuesetidentifierlist.size();valuesetidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  valuesetidentifier = valuesetidentifierlist.get(valuesetidentifieri);

		/******************** VlSt_Id_Vl ********************************************************************************/
		if(valuesetidentifieri == 0) {v.addVlStIdVl("[");}
		if(valuesetidentifier.hasValue()) {

			v.addVlStIdVl(String.valueOf(valuesetidentifier.getValue()));
		} else {
			v.addVlStIdVl("NULL");
		}

		if(valuesetidentifieri == valuesetidentifierlist.size()-1) {v.addVlStIdVl("]");}


		/******************** valuesetidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetidentifiertype = valuesetidentifier.getType();

		/******************** VlSt_Id_Typ_Txt ********************************************************************************/
		if(valuesetidentifieri == 0) {v.addVlStIdTypTxt("[");}
		if(valuesetidentifiertype.hasText()) {

			v.addVlStIdTypTxt(String.valueOf(valuesetidentifiertype.getText()));
		} else {
			v.addVlStIdTypTxt("NULL");
		}

		if(valuesetidentifieri == valuesetidentifierlist.size()-1) {v.addVlStIdTypTxt("]");}


		/******************** valuesetidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> valuesetidentifiertypecodinglist = valuesetidentifiertype.getCoding();
		for(int valuesetidentifiertypecodingi = 0; valuesetidentifiertypecodingi<valuesetidentifiertypecodinglist.size();valuesetidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  valuesetidentifiertypecoding = valuesetidentifiertypecodinglist.get(valuesetidentifiertypecodingi);

		/******************** VlSt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(valuesetidentifiertypecodingi == 0) {v.addVlStIdTypCdgDsply("[[");}
		if(valuesetidentifiertypecoding.hasDisplay()) {

			v.addVlStIdTypCdgDsply(String.valueOf(valuesetidentifiertypecoding.getDisplay()));
		} else {
			v.addVlStIdTypCdgDsply("NULL");
		}

		if(valuesetidentifiertypecodingi == valuesetidentifiertypecodinglist.size()-1) {v.addVlStIdTypCdgDsply("]]");}


		/******************** VlSt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(valuesetidentifiertypecodingi == 0) {v.addVlStIdTypCdgVrsn("[[");}
		if(valuesetidentifiertypecoding.hasVersion()) {

			v.addVlStIdTypCdgVrsn(String.valueOf(valuesetidentifiertypecoding.getVersion()));
		} else {
			v.addVlStIdTypCdgVrsn("NULL");
		}

		if(valuesetidentifiertypecodingi == valuesetidentifiertypecodinglist.size()-1) {v.addVlStIdTypCdgVrsn("]]");}


		/******************** VlSt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(valuesetidentifiertypecodingi == 0) {v.addVlStIdTypCdgCd("[[");}
		if(valuesetidentifiertypecoding.hasCode()) {

			v.addVlStIdTypCdgCd(String.valueOf(valuesetidentifiertypecoding.getCode()));
		} else {
			v.addVlStIdTypCdgCd("NULL");
		}

		if(valuesetidentifiertypecodingi == valuesetidentifiertypecodinglist.size()-1) {v.addVlStIdTypCdgCd("]]");}


		/******************** VlSt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(valuesetidentifiertypecodingi == 0) {v.addVlStIdTypCdgUsrSltd("[[");}
		if(valuesetidentifiertypecoding.hasUserSelected()) {

			v.addVlStIdTypCdgUsrSltd(String.valueOf(valuesetidentifiertypecoding.getUserSelected()));
		} else {
			v.addVlStIdTypCdgUsrSltd("NULL");
		}

		if(valuesetidentifiertypecodingi == valuesetidentifiertypecodinglist.size()-1) {v.addVlStIdTypCdgUsrSltd("]]");}


		/******************** VlSt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(valuesetidentifiertypecodingi == 0) {v.addVlStIdTypCdgSys("[[");}
		if(valuesetidentifiertypecoding.hasSystem()) {

			v.addVlStIdTypCdgSys(String.valueOf(valuesetidentifiertypecoding.getSystem()));
		} else {
			v.addVlStIdTypCdgSys("NULL");
		}

		if(valuesetidentifiertypecodingi == valuesetidentifiertypecodinglist.size()-1) {v.addVlStIdTypCdgSys("]]");}


		 };
		/******************** valuesetidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period valuesetidentifierperiod = valuesetidentifier.getPeriod();

		/******************** VlSt_Id_Prd_Strt ********************************************************************************/
		if(valuesetidentifieri == 0) {v.addVlStIdPrdStrt("[");}
		if(valuesetidentifierperiod.hasStart()) {

			v.addVlStIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(valuesetidentifierperiod.getStart())+"\"");
		} else {
			v.addVlStIdPrdStrt("NULL");
		}

		if(valuesetidentifieri == valuesetidentifierlist.size()-1) {v.addVlStIdPrdStrt("]");}


		/******************** VlSt_Id_Prd_End ********************************************************************************/
		if(valuesetidentifieri == 0) {v.addVlStIdPrdEnd("[");}
		if(valuesetidentifierperiod.hasEnd()) {

			v.addVlStIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(valuesetidentifierperiod.getEnd())+"\"");
		} else {
			v.addVlStIdPrdEnd("NULL");
		}

		if(valuesetidentifieri == valuesetidentifierlist.size()-1) {v.addVlStIdPrdEnd("]");}


		/******************** valuesetidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse valuesetidentifieruse = valuesetidentifier.getUse();
		if(valuesetidentifieruse!=null) {
		if(valuesetidentifieri == 0) {

		v.addVlStIdUse("[");		}
			v.addVlStIdUse(valuesetidentifieruse.toCode());
		if(valuesetidentifieri == valuesetidentifierlist.size()-1) {

		v.addVlStIdUse("]");		}

		} else {
			v.addVlStIdUse("NULL");
		}

		/******************** VlSt_Id_Assigner ********************************************************************************/
		if(valuesetidentifieri == 0) {v.addVlStIdAssigner("[");}
		if(valuesetidentifier.hasAssigner()) {

			if(valuesetidentifier.getAssigner().getReference() != null) {
			v.addVlStIdAssigner(valuesetidentifier.getAssigner().getReference());
			}
		} else {
			v.addVlStIdAssigner("NULL");
		}

		if(valuesetidentifieri == valuesetidentifierlist.size()-1) {v.addVlStIdAssigner("]");}


		/******************** VlSt_Id_Sys ********************************************************************************/
		if(valuesetidentifieri == 0) {v.addVlStIdSys("[");}
		if(valuesetidentifier.hasSystem()) {

			v.addVlStIdSys(String.valueOf(valuesetidentifier.getSystem()));
		} else {
			v.addVlStIdSys("NULL");
		}

		if(valuesetidentifieri == valuesetidentifierlist.size()-1) {v.addVlStIdSys("]");}


		 };
		/******************** valuesetcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> valuesetcontactlist = valueset.getContact();
		for(int valuesetcontacti = 0; valuesetcontacti<valuesetcontactlist.size();valuesetcontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  valuesetcontact = valuesetcontactlist.get(valuesetcontacti);

		/******************** VlSt_Cntct_Nm ********************************************************************************/
		if(valuesetcontacti == 0) {v.addVlStCntctNm("[");}
		if(valuesetcontact.hasName()) {

			v.addVlStCntctNm(String.valueOf(valuesetcontact.getName()));
		} else {
			v.addVlStCntctNm("NULL");
		}

		if(valuesetcontacti == valuesetcontactlist.size()-1) {v.addVlStCntctNm("]");}


		/******************** valuesetcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> valuesetcontacttelecomlist = valuesetcontact.getTelecom();
		for(int valuesetcontacttelecomi = 0; valuesetcontacttelecomi<valuesetcontacttelecomlist.size();valuesetcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  valuesetcontacttelecom = valuesetcontacttelecomlist.get(valuesetcontacttelecomi);

		/******************** VlSt_Cntct_Tlcm_Vl ********************************************************************************/
		if(valuesetcontacttelecomi == 0) {v.addVlStCntctTlcmVl("[[");}
		if(valuesetcontacttelecom.hasValue()) {

			v.addVlStCntctTlcmVl(String.valueOf(valuesetcontacttelecom.getValue()));
		} else {
			v.addVlStCntctTlcmVl("NULL");
		}

		if(valuesetcontacttelecomi == valuesetcontacttelecomlist.size()-1) {v.addVlStCntctTlcmVl("]]");}


		/******************** valuesetcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period valuesetcontacttelecomperiod = valuesetcontacttelecom.getPeriod();

		/******************** VlSt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(valuesetcontacttelecomi == 0) {v.addVlStCntctTlcmPrdStrt("[[");}
		if(valuesetcontacttelecomperiod.hasStart()) {

			v.addVlStCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(valuesetcontacttelecomperiod.getStart())+"\"");
		} else {
			v.addVlStCntctTlcmPrdStrt("NULL");
		}

		if(valuesetcontacttelecomi == valuesetcontacttelecomlist.size()-1) {v.addVlStCntctTlcmPrdStrt("]]");}


		/******************** VlSt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(valuesetcontacttelecomi == 0) {v.addVlStCntctTlcmPrdEnd("[[");}
		if(valuesetcontacttelecomperiod.hasEnd()) {

			v.addVlStCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(valuesetcontacttelecomperiod.getEnd())+"\"");
		} else {
			v.addVlStCntctTlcmPrdEnd("NULL");
		}

		if(valuesetcontacttelecomi == valuesetcontacttelecomlist.size()-1) {v.addVlStCntctTlcmPrdEnd("]]");}


		/******************** valuesetcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse valuesetcontacttelecomuse = valuesetcontacttelecom.getUse();
		if(valuesetcontacttelecomuse!=null) {
		if(valuesetcontacttelecomi == 0) {

		v.addVlStCntctTlcmUse("[[");		}
			v.addVlStCntctTlcmUse(valuesetcontacttelecomuse.toCode());
		if(valuesetcontacttelecomi == valuesetcontacttelecomlist.size()-1) {

		v.addVlStCntctTlcmUse("]]");		}

		} else {
			v.addVlStCntctTlcmUse("NULL");
		}

		/******************** valuesetcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem valuesetcontacttelecomsystem = valuesetcontacttelecom.getSystem();
		if(valuesetcontacttelecomsystem!=null) {
		if(valuesetcontacttelecomi == 0) {

		v.addVlStCntctTlcmSys("[[");		}
			v.addVlStCntctTlcmSys(valuesetcontacttelecomsystem.toCode());
		if(valuesetcontacttelecomi == valuesetcontacttelecomlist.size()-1) {

		v.addVlStCntctTlcmSys("]]");		}

		} else {
			v.addVlStCntctTlcmSys("NULL");
		}

		/******************** VlSt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(valuesetcontacttelecomi == 0) {v.addVlStCntctTlcmRnk("[[");}
		if(valuesetcontacttelecom.hasRank()) {

			v.addVlStCntctTlcmRnk(String.valueOf(valuesetcontacttelecom.getRank()));
		} else {
			v.addVlStCntctTlcmRnk("NULL");
		}

		if(valuesetcontacttelecomi == valuesetcontacttelecomlist.size()-1) {v.addVlStCntctTlcmRnk("]]");}


		 };
		 };
		/******************** VlSt_Copyright ********************************************************************************/
		if(valueset.hasCopyright()) {

			v.addVlStCopyright(String.valueOf(valueset.getCopyright()));
		} else {
			v.addVlStCopyright("NULL");
		}


		/******************** VlSt_Ttl ********************************************************************************/
		if(valueset.hasTitle()) {

			v.addVlStTtl(String.valueOf(valueset.getTitle()));
		} else {
			v.addVlStTtl("NULL");
		}


		/******************** VlSt_Prpse ********************************************************************************/
		if(valueset.hasPurpose()) {

			v.addVlStPrpse(String.valueOf(valueset.getPurpose()));
		} else {
			v.addVlStPrpse("NULL");
		}


		/******************** VlSt_Url ********************************************************************************/
		if(valueset.hasUrl()) {

			v.addVlStUrl(String.valueOf(valueset.getUrl()));
		} else {
			v.addVlStUrl("NULL");
		}


		/******************** valuesetjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> valuesetjurisdictionlist = valueset.getJurisdiction();
		for(int valuesetjurisdictioni = 0; valuesetjurisdictioni<valuesetjurisdictionlist.size();valuesetjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  valuesetjurisdiction = valuesetjurisdictionlist.get(valuesetjurisdictioni);

		/******************** VlSt_Jrsdctn_Txt ********************************************************************************/
		if(valuesetjurisdictioni == 0) {v.addVlStJrsdctnTxt("[");}
		if(valuesetjurisdiction.hasText()) {

			v.addVlStJrsdctnTxt(String.valueOf(valuesetjurisdiction.getText()));
		} else {
			v.addVlStJrsdctnTxt("NULL");
		}

		if(valuesetjurisdictioni == valuesetjurisdictionlist.size()-1) {v.addVlStJrsdctnTxt("]");}


		/******************** valuesetjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> valuesetjurisdictioncodinglist = valuesetjurisdiction.getCoding();
		for(int valuesetjurisdictioncodingi = 0; valuesetjurisdictioncodingi<valuesetjurisdictioncodinglist.size();valuesetjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  valuesetjurisdictioncoding = valuesetjurisdictioncodinglist.get(valuesetjurisdictioncodingi);

		/******************** VlSt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(valuesetjurisdictioncodingi == 0) {v.addVlStJrsdctnCdgDsply("[[");}
		if(valuesetjurisdictioncoding.hasDisplay()) {

			v.addVlStJrsdctnCdgDsply(String.valueOf(valuesetjurisdictioncoding.getDisplay()));
		} else {
			v.addVlStJrsdctnCdgDsply("NULL");
		}

		if(valuesetjurisdictioncodingi == valuesetjurisdictioncodinglist.size()-1) {v.addVlStJrsdctnCdgDsply("]]");}


		/******************** VlSt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(valuesetjurisdictioncodingi == 0) {v.addVlStJrsdctnCdgVrsn("[[");}
		if(valuesetjurisdictioncoding.hasVersion()) {

			v.addVlStJrsdctnCdgVrsn(String.valueOf(valuesetjurisdictioncoding.getVersion()));
		} else {
			v.addVlStJrsdctnCdgVrsn("NULL");
		}

		if(valuesetjurisdictioncodingi == valuesetjurisdictioncodinglist.size()-1) {v.addVlStJrsdctnCdgVrsn("]]");}


		/******************** VlSt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(valuesetjurisdictioncodingi == 0) {v.addVlStJrsdctnCdgCd("[[");}
		if(valuesetjurisdictioncoding.hasCode()) {

			v.addVlStJrsdctnCdgCd(String.valueOf(valuesetjurisdictioncoding.getCode()));
		} else {
			v.addVlStJrsdctnCdgCd("NULL");
		}

		if(valuesetjurisdictioncodingi == valuesetjurisdictioncodinglist.size()-1) {v.addVlStJrsdctnCdgCd("]]");}


		/******************** VlSt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(valuesetjurisdictioncodingi == 0) {v.addVlStJrsdctnCdgUsrSltd("[[");}
		if(valuesetjurisdictioncoding.hasUserSelected()) {

			v.addVlStJrsdctnCdgUsrSltd(String.valueOf(valuesetjurisdictioncoding.getUserSelected()));
		} else {
			v.addVlStJrsdctnCdgUsrSltd("NULL");
		}

		if(valuesetjurisdictioncodingi == valuesetjurisdictioncodinglist.size()-1) {v.addVlStJrsdctnCdgUsrSltd("]]");}


		/******************** VlSt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(valuesetjurisdictioncodingi == 0) {v.addVlStJrsdctnCdgSys("[[");}
		if(valuesetjurisdictioncoding.hasSystem()) {

			v.addVlStJrsdctnCdgSys(String.valueOf(valuesetjurisdictioncoding.getSystem()));
		} else {
			v.addVlStJrsdctnCdgSys("NULL");
		}

		if(valuesetjurisdictioncodingi == valuesetjurisdictioncodinglist.size()-1) {v.addVlStJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** valuesetusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> valuesetusecontextlist = valueset.getUseContext();
		for(int valuesetusecontexti = 0; valuesetusecontexti<valuesetusecontextlist.size();valuesetusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  valuesetusecontext = valuesetusecontextlist.get(valuesetusecontexti);

		/******************** valuesetusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetusecontextcode = valuesetusecontext.getCode();

		/******************** VlSt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtCdDsply("[");}
		if(valuesetusecontextcode.hasDisplay()) {

			v.addVlStUseCntxtCdDsply(String.valueOf(valuesetusecontextcode.getDisplay()));
		} else {
			v.addVlStUseCntxtCdDsply("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtCdDsply("]");}


		/******************** VlSt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtCdVrsn("[");}
		if(valuesetusecontextcode.hasVersion()) {

			v.addVlStUseCntxtCdVrsn(String.valueOf(valuesetusecontextcode.getVersion()));
		} else {
			v.addVlStUseCntxtCdVrsn("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtCdVrsn("]");}


		/******************** VlSt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtCdUsrSltd("[");}
		if(valuesetusecontextcode.hasUserSelected()) {

			v.addVlStUseCntxtCdUsrSltd(String.valueOf(valuesetusecontextcode.getUserSelected()));
		} else {
			v.addVlStUseCntxtCdUsrSltd("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtCdUsrSltd("]");}


		/******************** VlSt_UseCntxt_Cd_Sys ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtCdSys("[");}
		if(valuesetusecontextcode.hasSystem()) {

			v.addVlStUseCntxtCdSys(String.valueOf(valuesetusecontextcode.getSystem()));
		} else {
			v.addVlStUseCntxtCdSys("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtCdSys("]");}


		/******************** VlSt_UseCntxt_VlRfrnc ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRfrnc("[");}
		if(valuesetusecontext.hasValueReference()) {

			if(valuesetusecontext.getValueReference().getReference() != null) {
			v.addVlStUseCntxtVlRfrnc(valuesetusecontext.getValueReference().getReference());
			}
		} else {
			v.addVlStUseCntxtVlRfrnc("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRfrnc("]");}


		/******************** valuesetusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetusecontextvaluecodeableconcept = valuesetusecontext.getValueCodeableConcept();

		/******************** VlSt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlCdbleCncptTxt("[");}
		if(valuesetusecontextvaluecodeableconcept.hasText()) {

			v.addVlStUseCntxtVlCdbleCncptTxt(String.valueOf(valuesetusecontextvaluecodeableconcept.getText()));
		} else {
			v.addVlStUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlCdbleCncptTxt("]");}


		/******************** valuesetusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> valuesetusecontextvaluecodeableconceptcodinglist = valuesetusecontextvaluecodeableconcept.getCoding();
		for(int valuesetusecontextvaluecodeableconceptcodingi = 0; valuesetusecontextvaluecodeableconceptcodingi<valuesetusecontextvaluecodeableconceptcodinglist.size();valuesetusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  valuesetusecontextvaluecodeableconceptcoding = valuesetusecontextvaluecodeableconceptcodinglist.get(valuesetusecontextvaluecodeableconceptcodingi);

		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcodingi == 0) {v.addVlStUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(valuesetusecontextvaluecodeableconceptcoding.hasDisplay()) {

			v.addVlStUseCntxtVlCdbleCncptCdgDsply(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			v.addVlStUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(valuesetusecontextvaluecodeableconceptcodingi == valuesetusecontextvaluecodeableconceptcodinglist.size()-1) {v.addVlStUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcodingi == 0) {v.addVlStUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(valuesetusecontextvaluecodeableconceptcoding.hasVersion()) {

			v.addVlStUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			v.addVlStUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(valuesetusecontextvaluecodeableconceptcodingi == valuesetusecontextvaluecodeableconceptcodinglist.size()-1) {v.addVlStUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcodingi == 0) {v.addVlStUseCntxtVlCdbleCncptCdgCd("[[");}
		if(valuesetusecontextvaluecodeableconceptcoding.hasCode()) {

			v.addVlStUseCntxtVlCdbleCncptCdgCd(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			v.addVlStUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(valuesetusecontextvaluecodeableconceptcodingi == valuesetusecontextvaluecodeableconceptcodinglist.size()-1) {v.addVlStUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcodingi == 0) {v.addVlStUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(valuesetusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			v.addVlStUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			v.addVlStUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(valuesetusecontextvaluecodeableconceptcodingi == valuesetusecontextvaluecodeableconceptcodinglist.size()-1) {v.addVlStUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcodingi == 0) {v.addVlStUseCntxtVlCdbleCncptCdgSys("[[");}
		if(valuesetusecontextvaluecodeableconceptcoding.hasSystem()) {

			v.addVlStUseCntxtVlCdbleCncptCdgSys(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			v.addVlStUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(valuesetusecontextvaluecodeableconceptcodingi == valuesetusecontextvaluecodeableconceptcodinglist.size()-1) {v.addVlStUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** valuesetusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range valuesetusecontextvaluerange = valuesetusecontext.getValueRange();

		/******************** valuesetusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluerangelow = valuesetusecontextvaluerange.getLow();

		/******************** VlSt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngLwVl("[");}
		if(valuesetusecontextvaluerangelow.hasValue()) {

			v.addVlStUseCntxtVlRngLwVl(String.valueOf(valuesetusecontextvaluerangelow.getValue()));
		} else {
			v.addVlStUseCntxtVlRngLwVl("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngLwVl("]");}


		/******************** valuesetusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator valuesetusecontextvaluerangelowcomparator = valuesetusecontextvaluerangelow.getComparator();
		if(valuesetusecontextvaluerangelowcomparator!=null) {
		if(valuesetusecontexti == 0) {

		v.addVlStUseCntxtVlRngLwCmprtr("[");		}
			v.addVlStUseCntxtVlRngLwCmprtr(valuesetusecontextvaluerangelowcomparator.toCode());
		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {

		v.addVlStUseCntxtVlRngLwCmprtr("]");		}

		} else {
			v.addVlStUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** VlSt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngLwCd("[");}
		if(valuesetusecontextvaluerangelow.hasCode()) {

			v.addVlStUseCntxtVlRngLwCd(String.valueOf(valuesetusecontextvaluerangelow.getCode()));
		} else {
			v.addVlStUseCntxtVlRngLwCd("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngLwCd("]");}


		/******************** VlSt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngLwUnt("[");}
		if(valuesetusecontextvaluerangelow.hasUnit()) {

			v.addVlStUseCntxtVlRngLwUnt(String.valueOf(valuesetusecontextvaluerangelow.getUnit()));
		} else {
			v.addVlStUseCntxtVlRngLwUnt("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngLwUnt("]");}


		/******************** VlSt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngLwSys("[");}
		if(valuesetusecontextvaluerangelow.hasSystem()) {

			v.addVlStUseCntxtVlRngLwSys(String.valueOf(valuesetusecontextvaluerangelow.getSystem()));
		} else {
			v.addVlStUseCntxtVlRngLwSys("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngLwSys("]");}


		/******************** valuesetusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluerangehigh = valuesetusecontextvaluerange.getHigh();

		/******************** VlSt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngHiVl("[");}
		if(valuesetusecontextvaluerangehigh.hasValue()) {

			v.addVlStUseCntxtVlRngHiVl(String.valueOf(valuesetusecontextvaluerangehigh.getValue()));
		} else {
			v.addVlStUseCntxtVlRngHiVl("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngHiVl("]");}


		/******************** valuesetusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator valuesetusecontextvaluerangehighcomparator = valuesetusecontextvaluerangehigh.getComparator();
		if(valuesetusecontextvaluerangehighcomparator!=null) {
		if(valuesetusecontexti == 0) {

		v.addVlStUseCntxtVlRngHiCmprtr("[");		}
			v.addVlStUseCntxtVlRngHiCmprtr(valuesetusecontextvaluerangehighcomparator.toCode());
		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {

		v.addVlStUseCntxtVlRngHiCmprtr("]");		}

		} else {
			v.addVlStUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** VlSt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngHiCd("[");}
		if(valuesetusecontextvaluerangehigh.hasCode()) {

			v.addVlStUseCntxtVlRngHiCd(String.valueOf(valuesetusecontextvaluerangehigh.getCode()));
		} else {
			v.addVlStUseCntxtVlRngHiCd("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngHiCd("]");}


		/******************** VlSt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngHiUnt("[");}
		if(valuesetusecontextvaluerangehigh.hasUnit()) {

			v.addVlStUseCntxtVlRngHiUnt(String.valueOf(valuesetusecontextvaluerangehigh.getUnit()));
		} else {
			v.addVlStUseCntxtVlRngHiUnt("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngHiUnt("]");}


		/******************** VlSt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlRngHiSys("[");}
		if(valuesetusecontextvaluerangehigh.hasSystem()) {

			v.addVlStUseCntxtVlRngHiSys(String.valueOf(valuesetusecontextvaluerangehigh.getSystem()));
		} else {
			v.addVlStUseCntxtVlRngHiSys("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlRngHiSys("]");}


		/******************** valuesetusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluequantity = valuesetusecontext.getValueQuantity();

		/******************** VlSt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlQntyVl("[");}
		if(valuesetusecontextvaluequantity.hasValue()) {

			v.addVlStUseCntxtVlQntyVl(String.valueOf(valuesetusecontextvaluequantity.getValue()));
		} else {
			v.addVlStUseCntxtVlQntyVl("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlQntyVl("]");}


		/******************** valuesetusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator valuesetusecontextvaluequantitycomparator = valuesetusecontextvaluequantity.getComparator();
		if(valuesetusecontextvaluequantitycomparator!=null) {
		if(valuesetusecontexti == 0) {

		v.addVlStUseCntxtVlQntyCmprtr("[");		}
			v.addVlStUseCntxtVlQntyCmprtr(valuesetusecontextvaluequantitycomparator.toCode());
		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {

		v.addVlStUseCntxtVlQntyCmprtr("]");		}

		} else {
			v.addVlStUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** VlSt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlQntyCd("[");}
		if(valuesetusecontextvaluequantity.hasCode()) {

			v.addVlStUseCntxtVlQntyCd(String.valueOf(valuesetusecontextvaluequantity.getCode()));
		} else {
			v.addVlStUseCntxtVlQntyCd("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlQntyCd("]");}


		/******************** VlSt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlQntyUnt("[");}
		if(valuesetusecontextvaluequantity.hasUnit()) {

			v.addVlStUseCntxtVlQntyUnt(String.valueOf(valuesetusecontextvaluequantity.getUnit()));
		} else {
			v.addVlStUseCntxtVlQntyUnt("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlQntyUnt("]");}


		/******************** VlSt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(valuesetusecontexti == 0) {v.addVlStUseCntxtVlQntySys("[");}
		if(valuesetusecontextvaluequantity.hasSystem()) {

			v.addVlStUseCntxtVlQntySys(String.valueOf(valuesetusecontextvaluequantity.getSystem()));
		} else {
			v.addVlStUseCntxtVlQntySys("NULL");
		}

		if(valuesetusecontexti == valuesetusecontextlist.size()-1) {v.addVlStUseCntxtVlQntySys("]");}


		 };
		/******************** VlSt_Exprmtl ********************************************************************************/
		if(valueset.hasExperimental()) {

			v.addVlStExprmtl(String.valueOf(valueset.getExperimental()));
		} else {
			v.addVlStExprmtl("NULL");
		}


		/******************** VlSt_Pblshr ********************************************************************************/
		if(valueset.hasPublisher()) {

			v.addVlStPblshr(String.valueOf(valueset.getPublisher()));
		} else {
			v.addVlStPblshr("NULL");
		}


		/******************** valuesetexpansion ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionComponent valuesetexpansion = valueset.getExpansion();

		/******************** VlSt_Expansion_Off ********************************************************************************/
		if(valuesetexpansion.hasOffset()) {

			v.addVlStExpansionOff(String.valueOf(valuesetexpansion.getOffset()));
		} else {
			v.addVlStExpansionOff("NULL");
		}


		/******************** VlSt_Expansion_Timestamp ********************************************************************************/
		if(valuesetexpansion.hasTimestamp()) {

			v.addVlStExpansionTimestamp("\""+ca.uhn.fhir.util.DateUtils.formatDate(valuesetexpansion.getTimestamp())+"\"");
		} else {
			v.addVlStExpansionTimestamp("NULL");
		}


		/******************** valuesetexpansioncontains ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent> valuesetexpansioncontainslist = valuesetexpansion.getContains();
		for(int valuesetexpansioncontainsi = 0; valuesetexpansioncontainsi<valuesetexpansioncontainslist.size();valuesetexpansioncontainsi++ ) {
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent  valuesetexpansioncontains = valuesetexpansioncontainslist.get(valuesetexpansioncontainsi);

		/******************** VlSt_Expansion_Contains_Cd ********************************************************************************/
		if(valuesetexpansioncontainsi == 0) {v.addVlStExpansionContainsCd("[");}
		if(valuesetexpansioncontains.hasCode()) {

			v.addVlStExpansionContainsCd(String.valueOf(valuesetexpansioncontains.getCode()));
		} else {
			v.addVlStExpansionContainsCd("NULL");
		}

		if(valuesetexpansioncontainsi == valuesetexpansioncontainslist.size()-1) {v.addVlStExpansionContainsCd("]");}


		/******************** VlSt_Expansion_Contains_Inactive ********************************************************************************/
		if(valuesetexpansioncontainsi == 0) {v.addVlStExpansionContainsInactive("[");}
		if(valuesetexpansioncontains.hasInactive()) {

			v.addVlStExpansionContainsInactive(String.valueOf(valuesetexpansioncontains.getInactive()));
		} else {
			v.addVlStExpansionContainsInactive("NULL");
		}

		if(valuesetexpansioncontainsi == valuesetexpansioncontainslist.size()-1) {v.addVlStExpansionContainsInactive("]");}


		/******************** VlSt_Expansion_Contains_Sys ********************************************************************************/
		if(valuesetexpansioncontainsi == 0) {v.addVlStExpansionContainsSys("[");}
		if(valuesetexpansioncontains.hasSystem()) {

			v.addVlStExpansionContainsSys(String.valueOf(valuesetexpansioncontains.getSystem()));
		} else {
			v.addVlStExpansionContainsSys("NULL");
		}

		if(valuesetexpansioncontainsi == valuesetexpansioncontainslist.size()-1) {v.addVlStExpansionContainsSys("]");}


		/******************** valuesetexpansioncontainsdesignation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent> valuesetexpansioncontainsdesignationlist = valuesetexpansioncontains.getDesignation();
		for(int valuesetexpansioncontainsdesignationi = 0; valuesetexpansioncontainsdesignationi<valuesetexpansioncontainsdesignationlist.size();valuesetexpansioncontainsdesignationi++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent  valuesetexpansioncontainsdesignation = valuesetexpansioncontainsdesignationlist.get(valuesetexpansioncontainsdesignationi);

		/******************** VlSt_Expansion_Contains_Dsgnation_Vl ********************************************************************************/
		if(valuesetexpansioncontainsdesignationi == 0) {v.addVlStExpansionContainsDsgnationVl("[[");}
		if(valuesetexpansioncontainsdesignation.hasValue()) {

			v.addVlStExpansionContainsDsgnationVl(String.valueOf(valuesetexpansioncontainsdesignation.getValue()));
		} else {
			v.addVlStExpansionContainsDsgnationVl("NULL");
		}

		if(valuesetexpansioncontainsdesignationi == valuesetexpansioncontainsdesignationlist.size()-1) {v.addVlStExpansionContainsDsgnationVl("]]");}


		/******************** VlSt_Expansion_Contains_Dsgnation_Lnguage ********************************************************************************/
		if(valuesetexpansioncontainsdesignationi == 0) {v.addVlStExpansionContainsDsgnationLnguage("[[");}
		if(valuesetexpansioncontainsdesignation.hasLanguage()) {

			v.addVlStExpansionContainsDsgnationLnguage(String.valueOf(valuesetexpansioncontainsdesignation.getLanguage()));
		} else {
			v.addVlStExpansionContainsDsgnationLnguage("NULL");
		}

		if(valuesetexpansioncontainsdesignationi == valuesetexpansioncontainsdesignationlist.size()-1) {v.addVlStExpansionContainsDsgnationLnguage("]]");}


		/******************** valuesetexpansioncontainsdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetexpansioncontainsdesignationuse = valuesetexpansioncontainsdesignation.getUse();

		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Dsply ********************************************************************************/
		if(valuesetexpansioncontainsdesignationi == 0) {v.addVlStExpansionContainsDsgnationUseDsply("[[");}
		if(valuesetexpansioncontainsdesignationuse.hasDisplay()) {

			v.addVlStExpansionContainsDsgnationUseDsply(String.valueOf(valuesetexpansioncontainsdesignationuse.getDisplay()));
		} else {
			v.addVlStExpansionContainsDsgnationUseDsply("NULL");
		}

		if(valuesetexpansioncontainsdesignationi == valuesetexpansioncontainsdesignationlist.size()-1) {v.addVlStExpansionContainsDsgnationUseDsply("]]");}


		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Vrsn ********************************************************************************/
		if(valuesetexpansioncontainsdesignationi == 0) {v.addVlStExpansionContainsDsgnationUseVrsn("[[");}
		if(valuesetexpansioncontainsdesignationuse.hasVersion()) {

			v.addVlStExpansionContainsDsgnationUseVrsn(String.valueOf(valuesetexpansioncontainsdesignationuse.getVersion()));
		} else {
			v.addVlStExpansionContainsDsgnationUseVrsn("NULL");
		}

		if(valuesetexpansioncontainsdesignationi == valuesetexpansioncontainsdesignationlist.size()-1) {v.addVlStExpansionContainsDsgnationUseVrsn("]]");}


		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Cd ********************************************************************************/
		if(valuesetexpansioncontainsdesignationi == 0) {v.addVlStExpansionContainsDsgnationUseCd("[[");}
		if(valuesetexpansioncontainsdesignationuse.hasCode()) {

			v.addVlStExpansionContainsDsgnationUseCd(String.valueOf(valuesetexpansioncontainsdesignationuse.getCode()));
		} else {
			v.addVlStExpansionContainsDsgnationUseCd("NULL");
		}

		if(valuesetexpansioncontainsdesignationi == valuesetexpansioncontainsdesignationlist.size()-1) {v.addVlStExpansionContainsDsgnationUseCd("]]");}


		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Sys ********************************************************************************/
		if(valuesetexpansioncontainsdesignationi == 0) {v.addVlStExpansionContainsDsgnationUseSys("[[");}
		if(valuesetexpansioncontainsdesignationuse.hasSystem()) {

			v.addVlStExpansionContainsDsgnationUseSys(String.valueOf(valuesetexpansioncontainsdesignationuse.getSystem()));
		} else {
			v.addVlStExpansionContainsDsgnationUseSys("NULL");
		}

		if(valuesetexpansioncontainsdesignationi == valuesetexpansioncontainsdesignationlist.size()-1) {v.addVlStExpansionContainsDsgnationUseSys("]]");}


		 };
		/******************** VlSt_Expansion_Contains_Abstract ********************************************************************************/
		if(valuesetexpansioncontains.hasAbstract()) {

			v.addVlStExpansionContainsAbstract(String.valueOf(valuesetexpansioncontains.getAbstract()));
		} else {
			v.addVlStExpansionContainsAbstract("NULL");
		}


		 };
		/******************** VlSt_Expansion_Id ********************************************************************************/
		if(valuesetexpansion.hasIdentifier()) {

			v.addVlStExpansionId(String.valueOf(valuesetexpansion.getIdentifier()));
		} else {
			v.addVlStExpansionId("NULL");
		}


		/******************** valuesetexpansionparameter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent> valuesetexpansionparameterlist = valuesetexpansion.getParameter();
		for(int valuesetexpansionparameteri = 0; valuesetexpansionparameteri<valuesetexpansionparameterlist.size();valuesetexpansionparameteri++ ) {
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent  valuesetexpansionparameter = valuesetexpansionparameterlist.get(valuesetexpansionparameteri);

		/******************** VlSt_Expansion_Prmtr_Nm ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrNm("[");}
		if(valuesetexpansionparameter.hasName()) {

			v.addVlStExpansionPrmtrNm(String.valueOf(valuesetexpansionparameter.getName()));
		} else {
			v.addVlStExpansionPrmtrNm("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrNm("]");}


		/******************** VlSt_Expansion_Prmtr_VlDecimalTyp ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrVlDecimalTyp("[");}
		if(valuesetexpansionparameter.hasValueDecimalType()) {

			v.addVlStExpansionPrmtrVlDecimalTyp("\""+valuesetexpansionparameter.getValueDecimalType().getValueAsString()+"\"");
		} else {
			v.addVlStExpansionPrmtrVlDecimalTyp("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrVlDecimalTyp("]");}


		/******************** VlSt_Expansion_Prmtr_VlUriTyp ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrVlUriTyp("[");}
		if(valuesetexpansionparameter.hasValueUriType()) {

			v.addVlStExpansionPrmtrVlUriTyp("\""+valuesetexpansionparameter.getValueUriType().getValueAsString()+"\"");
		} else {
			v.addVlStExpansionPrmtrVlUriTyp("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrVlUriTyp("]");}


		/******************** VlSt_Expansion_Prmtr_VlCdTyp ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrVlCdTyp("[");}
		if(valuesetexpansionparameter.hasValueCodeType()) {

			v.addVlStExpansionPrmtrVlCdTyp("\""+valuesetexpansionparameter.getValueCodeType().getValueAsString()+"\"");
		} else {
			v.addVlStExpansionPrmtrVlCdTyp("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrVlCdTyp("]");}


		/******************** VlSt_Expansion_Prmtr_VlBooleanTyp ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrVlBooleanTyp("[");}
		if(valuesetexpansionparameter.hasValueBooleanType()) {

			v.addVlStExpansionPrmtrVlBooleanTyp("\""+valuesetexpansionparameter.getValueBooleanType().getValueAsString()+"\"");
		} else {
			v.addVlStExpansionPrmtrVlBooleanTyp("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrVlBooleanTyp("]");}


		/******************** VlSt_Expansion_Prmtr_VlDtTimeTyp ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrVlDtTimeTyp("[");}
		if(valuesetexpansionparameter.hasValueDateTimeType()) {

			v.addVlStExpansionPrmtrVlDtTimeTyp("\""+valuesetexpansionparameter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			v.addVlStExpansionPrmtrVlDtTimeTyp("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrVlDtTimeTyp("]");}


		/******************** VlSt_Expansion_Prmtr_VlIntegerTyp ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrVlIntegerTyp("[");}
		if(valuesetexpansionparameter.hasValueIntegerType()) {

			v.addVlStExpansionPrmtrVlIntegerTyp("\""+valuesetexpansionparameter.getValueIntegerType().getValueAsString()+"\"");
		} else {
			v.addVlStExpansionPrmtrVlIntegerTyp("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrVlIntegerTyp("]");}


		/******************** VlSt_Expansion_Prmtr_VlStrgTyp ********************************************************************************/
		if(valuesetexpansionparameteri == 0) {v.addVlStExpansionPrmtrVlStrgTyp("[");}
		if(valuesetexpansionparameter.hasValueStringType()) {

			v.addVlStExpansionPrmtrVlStrgTyp("\""+valuesetexpansionparameter.getValueStringType().getValueAsString()+"\"");
		} else {
			v.addVlStExpansionPrmtrVlStrgTyp("NULL");
		}

		if(valuesetexpansionparameteri == valuesetexpansionparameterlist.size()-1) {v.addVlStExpansionPrmtrVlStrgTyp("]");}


		 };
		/******************** VlSt_Expansion_Total ********************************************************************************/
		if(valuesetexpansion.hasTotal()) {

			v.addVlStExpansionTotal(String.valueOf(valuesetexpansion.getTotal()));
		} else {
			v.addVlStExpansionTotal("NULL");
		}


		/******************** VlSt_Immutable ********************************************************************************/
		if(valueset.hasImmutable()) {

			v.addVlStImmutable(String.valueOf(valueset.getImmutable()));
		} else {
			v.addVlStImmutable("NULL");
		}


		/******************** valuesetcompose ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetComposeComponent valuesetcompose = valueset.getCompose();

		/******************** valuesetcomposeinclude ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent> valuesetcomposeincludelist = valuesetcompose.getInclude();
		for(int valuesetcomposeincludei = 0; valuesetcomposeincludei<valuesetcomposeincludelist.size();valuesetcomposeincludei++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent  valuesetcomposeinclude = valuesetcomposeincludelist.get(valuesetcomposeincludei);

		/******************** valuesetcomposeincludeconcept ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent> valuesetcomposeincludeconceptlist = valuesetcomposeinclude.getConcept();
		for(int valuesetcomposeincludeconcepti = 0; valuesetcomposeincludeconcepti<valuesetcomposeincludeconceptlist.size();valuesetcomposeincludeconcepti++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent  valuesetcomposeincludeconcept = valuesetcomposeincludeconceptlist.get(valuesetcomposeincludeconcepti);

		/******************** VlSt_Compose_Include_Cncpt_Cd ********************************************************************************/
		if(valuesetcomposeincludeconcepti == 0) {v.addVlStComposeIncludeCncptCd("[[");}
		if(valuesetcomposeincludeconcept.hasCode()) {

			v.addVlStComposeIncludeCncptCd(String.valueOf(valuesetcomposeincludeconcept.getCode()));
		} else {
			v.addVlStComposeIncludeCncptCd("NULL");
		}

		if(valuesetcomposeincludeconcepti == valuesetcomposeincludeconceptlist.size()-1) {v.addVlStComposeIncludeCncptCd("]]");}


		/******************** valuesetcomposeincludeconceptdesignation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent> valuesetcomposeincludeconceptdesignationlist = valuesetcomposeincludeconcept.getDesignation();
		for(int valuesetcomposeincludeconceptdesignationi = 0; valuesetcomposeincludeconceptdesignationi<valuesetcomposeincludeconceptdesignationlist.size();valuesetcomposeincludeconceptdesignationi++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent  valuesetcomposeincludeconceptdesignation = valuesetcomposeincludeconceptdesignationlist.get(valuesetcomposeincludeconceptdesignationi);

		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationi == 0) {v.addVlStComposeIncludeCncptDsgnationVl("[[[");}
		if(valuesetcomposeincludeconceptdesignation.hasValue()) {

			v.addVlStComposeIncludeCncptDsgnationVl(String.valueOf(valuesetcomposeincludeconceptdesignation.getValue()));
		} else {
			v.addVlStComposeIncludeCncptDsgnationVl("NULL");
		}

		if(valuesetcomposeincludeconceptdesignationi == valuesetcomposeincludeconceptdesignationlist.size()-1) {v.addVlStComposeIncludeCncptDsgnationVl("]]]");}


		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationi == 0) {v.addVlStComposeIncludeCncptDsgnationLnguage("[[[");}
		if(valuesetcomposeincludeconceptdesignation.hasLanguage()) {

			v.addVlStComposeIncludeCncptDsgnationLnguage(String.valueOf(valuesetcomposeincludeconceptdesignation.getLanguage()));
		} else {
			v.addVlStComposeIncludeCncptDsgnationLnguage("NULL");
		}

		if(valuesetcomposeincludeconceptdesignationi == valuesetcomposeincludeconceptdesignationlist.size()-1) {v.addVlStComposeIncludeCncptDsgnationLnguage("]]]");}


		/******************** valuesetcomposeincludeconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetcomposeincludeconceptdesignationuse = valuesetcomposeincludeconceptdesignation.getUse();

		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationi == 0) {v.addVlStComposeIncludeCncptDsgnationUseDsply("[[[");}
		if(valuesetcomposeincludeconceptdesignationuse.hasDisplay()) {

			v.addVlStComposeIncludeCncptDsgnationUseDsply(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getDisplay()));
		} else {
			v.addVlStComposeIncludeCncptDsgnationUseDsply("NULL");
		}

		if(valuesetcomposeincludeconceptdesignationi == valuesetcomposeincludeconceptdesignationlist.size()-1) {v.addVlStComposeIncludeCncptDsgnationUseDsply("]]]");}


		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationi == 0) {v.addVlStComposeIncludeCncptDsgnationUseVrsn("[[[");}
		if(valuesetcomposeincludeconceptdesignationuse.hasVersion()) {

			v.addVlStComposeIncludeCncptDsgnationUseVrsn(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getVersion()));
		} else {
			v.addVlStComposeIncludeCncptDsgnationUseVrsn("NULL");
		}

		if(valuesetcomposeincludeconceptdesignationi == valuesetcomposeincludeconceptdesignationlist.size()-1) {v.addVlStComposeIncludeCncptDsgnationUseVrsn("]]]");}


		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationi == 0) {v.addVlStComposeIncludeCncptDsgnationUseCd("[[[");}
		if(valuesetcomposeincludeconceptdesignationuse.hasCode()) {

			v.addVlStComposeIncludeCncptDsgnationUseCd(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getCode()));
		} else {
			v.addVlStComposeIncludeCncptDsgnationUseCd("NULL");
		}

		if(valuesetcomposeincludeconceptdesignationi == valuesetcomposeincludeconceptdesignationlist.size()-1) {v.addVlStComposeIncludeCncptDsgnationUseCd("]]]");}


		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationi == 0) {v.addVlStComposeIncludeCncptDsgnationUseSys("[[[");}
		if(valuesetcomposeincludeconceptdesignationuse.hasSystem()) {

			v.addVlStComposeIncludeCncptDsgnationUseSys(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getSystem()));
		} else {
			v.addVlStComposeIncludeCncptDsgnationUseSys("NULL");
		}

		if(valuesetcomposeincludeconceptdesignationi == valuesetcomposeincludeconceptdesignationlist.size()-1) {v.addVlStComposeIncludeCncptDsgnationUseSys("]]]");}


		 };
		 };
		/******************** valuesetcomposeincludefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent> valuesetcomposeincludefilterlist = valuesetcomposeinclude.getFilter();
		for(int valuesetcomposeincludefilteri = 0; valuesetcomposeincludefilteri<valuesetcomposeincludefilterlist.size();valuesetcomposeincludefilteri++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent  valuesetcomposeincludefilter = valuesetcomposeincludefilterlist.get(valuesetcomposeincludefilteri);

		/******************** VlSt_Compose_Include_Fltr_Prpty ********************************************************************************/
		if(valuesetcomposeincludefilteri == 0) {v.addVlStComposeIncludeFltrPrpty("[[");}
		if(valuesetcomposeincludefilter.hasProperty()) {

			v.addVlStComposeIncludeFltrPrpty(String.valueOf(valuesetcomposeincludefilter.getProperty()));
		} else {
			v.addVlStComposeIncludeFltrPrpty("NULL");
		}

		if(valuesetcomposeincludefilteri == valuesetcomposeincludefilterlist.size()-1) {v.addVlStComposeIncludeFltrPrpty("]]");}


		/******************** VlSt_Compose_Include_Fltr_Vl ********************************************************************************/
		if(valuesetcomposeincludefilteri == 0) {v.addVlStComposeIncludeFltrVl("[[");}
		if(valuesetcomposeincludefilter.hasValue()) {

			v.addVlStComposeIncludeFltrVl(String.valueOf(valuesetcomposeincludefilter.getValue()));
		} else {
			v.addVlStComposeIncludeFltrVl("NULL");
		}

		if(valuesetcomposeincludefilteri == valuesetcomposeincludefilterlist.size()-1) {v.addVlStComposeIncludeFltrVl("]]");}


		/******************** valuesetcomposeincludefilterop ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.FilterOperator valuesetcomposeincludefilterop = valuesetcomposeincludefilter.getOp();
		if(valuesetcomposeincludefilterop!=null) {
		if(valuesetcomposeincludefilteri == 0) {

		v.addVlStComposeIncludeFltrOp("[[");		}
			v.addVlStComposeIncludeFltrOp(valuesetcomposeincludefilterop.toCode());
		if(valuesetcomposeincludefilteri == valuesetcomposeincludefilterlist.size()-1) {

		v.addVlStComposeIncludeFltrOp("]]");		}

		} else {
			v.addVlStComposeIncludeFltrOp("NULL");
		}

		 };
		/******************** VlSt_Compose_Include_Sys ********************************************************************************/
		if(valuesetcomposeinclude.hasSystem()) {

			v.addVlStComposeIncludeSys(String.valueOf(valuesetcomposeinclude.getSystem()));
		} else {
			v.addVlStComposeIncludeSys("NULL");
		}


		/******************** VlSt_Compose_Include_VlSt ********************************************************************************/
		if(valuesetcomposeinclude.hasValueSet()) {

			String  array = "[";
			for(int incr=0; incr<valuesetcomposeinclude.getValueSet().size(); incr++) {
				array = array + valuesetcomposeinclude.getValueSet().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			v.addVlStComposeIncludeVlSt(array);

		} else {
			v.addVlStComposeIncludeVlSt("NULL");
		}


		 };
		/******************** valuesetcomposeexclude ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent> valuesetcomposeexcludelist = valuesetcompose.getExclude();
		for(int valuesetcomposeexcludei = 0; valuesetcomposeexcludei<valuesetcomposeexcludelist.size();valuesetcomposeexcludei++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent  valuesetcomposeexclude = valuesetcomposeexcludelist.get(valuesetcomposeexcludei);

		/******************** valuesetcomposeexcludeconcept ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent> valuesetcomposeexcludeconceptlist = valuesetcomposeexclude.getConcept();
		for(int valuesetcomposeexcludeconcepti = 0; valuesetcomposeexcludeconcepti<valuesetcomposeexcludeconceptlist.size();valuesetcomposeexcludeconcepti++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent  valuesetcomposeexcludeconcept = valuesetcomposeexcludeconceptlist.get(valuesetcomposeexcludeconcepti);

		/******************** VlSt_Compose_Exclude_Cncpt_Cd ********************************************************************************/
		if(valuesetcomposeexcludeconcepti == 0) {v.addVlStComposeExcludeCncptCd("[[");}
		if(valuesetcomposeexcludeconcept.hasCode()) {

			v.addVlStComposeExcludeCncptCd(String.valueOf(valuesetcomposeexcludeconcept.getCode()));
		} else {
			v.addVlStComposeExcludeCncptCd("NULL");
		}

		if(valuesetcomposeexcludeconcepti == valuesetcomposeexcludeconceptlist.size()-1) {v.addVlStComposeExcludeCncptCd("]]");}


		/******************** valuesetcomposeexcludeconceptdesignation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent> valuesetcomposeexcludeconceptdesignationlist = valuesetcomposeexcludeconcept.getDesignation();
		for(int valuesetcomposeexcludeconceptdesignationi = 0; valuesetcomposeexcludeconceptdesignationi<valuesetcomposeexcludeconceptdesignationlist.size();valuesetcomposeexcludeconceptdesignationi++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent  valuesetcomposeexcludeconceptdesignation = valuesetcomposeexcludeconceptdesignationlist.get(valuesetcomposeexcludeconceptdesignationi);

		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationi == 0) {v.addVlStComposeExcludeCncptDsgnationVl("[[[");}
		if(valuesetcomposeexcludeconceptdesignation.hasValue()) {

			v.addVlStComposeExcludeCncptDsgnationVl(String.valueOf(valuesetcomposeexcludeconceptdesignation.getValue()));
		} else {
			v.addVlStComposeExcludeCncptDsgnationVl("NULL");
		}

		if(valuesetcomposeexcludeconceptdesignationi == valuesetcomposeexcludeconceptdesignationlist.size()-1) {v.addVlStComposeExcludeCncptDsgnationVl("]]]");}


		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationi == 0) {v.addVlStComposeExcludeCncptDsgnationLnguage("[[[");}
		if(valuesetcomposeexcludeconceptdesignation.hasLanguage()) {

			v.addVlStComposeExcludeCncptDsgnationLnguage(String.valueOf(valuesetcomposeexcludeconceptdesignation.getLanguage()));
		} else {
			v.addVlStComposeExcludeCncptDsgnationLnguage("NULL");
		}

		if(valuesetcomposeexcludeconceptdesignationi == valuesetcomposeexcludeconceptdesignationlist.size()-1) {v.addVlStComposeExcludeCncptDsgnationLnguage("]]]");}


		/******************** valuesetcomposeexcludeconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetcomposeexcludeconceptdesignationuse = valuesetcomposeexcludeconceptdesignation.getUse();

		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationi == 0) {v.addVlStComposeExcludeCncptDsgnationUseDsply("[[[");}
		if(valuesetcomposeexcludeconceptdesignationuse.hasDisplay()) {

			v.addVlStComposeExcludeCncptDsgnationUseDsply(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getDisplay()));
		} else {
			v.addVlStComposeExcludeCncptDsgnationUseDsply("NULL");
		}

		if(valuesetcomposeexcludeconceptdesignationi == valuesetcomposeexcludeconceptdesignationlist.size()-1) {v.addVlStComposeExcludeCncptDsgnationUseDsply("]]]");}


		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationi == 0) {v.addVlStComposeExcludeCncptDsgnationUseVrsn("[[[");}
		if(valuesetcomposeexcludeconceptdesignationuse.hasVersion()) {

			v.addVlStComposeExcludeCncptDsgnationUseVrsn(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getVersion()));
		} else {
			v.addVlStComposeExcludeCncptDsgnationUseVrsn("NULL");
		}

		if(valuesetcomposeexcludeconceptdesignationi == valuesetcomposeexcludeconceptdesignationlist.size()-1) {v.addVlStComposeExcludeCncptDsgnationUseVrsn("]]]");}


		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationi == 0) {v.addVlStComposeExcludeCncptDsgnationUseCd("[[[");}
		if(valuesetcomposeexcludeconceptdesignationuse.hasCode()) {

			v.addVlStComposeExcludeCncptDsgnationUseCd(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getCode()));
		} else {
			v.addVlStComposeExcludeCncptDsgnationUseCd("NULL");
		}

		if(valuesetcomposeexcludeconceptdesignationi == valuesetcomposeexcludeconceptdesignationlist.size()-1) {v.addVlStComposeExcludeCncptDsgnationUseCd("]]]");}


		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationi == 0) {v.addVlStComposeExcludeCncptDsgnationUseSys("[[[");}
		if(valuesetcomposeexcludeconceptdesignationuse.hasSystem()) {

			v.addVlStComposeExcludeCncptDsgnationUseSys(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getSystem()));
		} else {
			v.addVlStComposeExcludeCncptDsgnationUseSys("NULL");
		}

		if(valuesetcomposeexcludeconceptdesignationi == valuesetcomposeexcludeconceptdesignationlist.size()-1) {v.addVlStComposeExcludeCncptDsgnationUseSys("]]]");}


		 };
		 };
		/******************** valuesetcomposeexcludefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent> valuesetcomposeexcludefilterlist = valuesetcomposeexclude.getFilter();
		for(int valuesetcomposeexcludefilteri = 0; valuesetcomposeexcludefilteri<valuesetcomposeexcludefilterlist.size();valuesetcomposeexcludefilteri++ ) {
		org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent  valuesetcomposeexcludefilter = valuesetcomposeexcludefilterlist.get(valuesetcomposeexcludefilteri);

		/******************** VlSt_Compose_Exclude_Fltr_Prpty ********************************************************************************/
		if(valuesetcomposeexcludefilteri == 0) {v.addVlStComposeExcludeFltrPrpty("[[");}
		if(valuesetcomposeexcludefilter.hasProperty()) {

			v.addVlStComposeExcludeFltrPrpty(String.valueOf(valuesetcomposeexcludefilter.getProperty()));
		} else {
			v.addVlStComposeExcludeFltrPrpty("NULL");
		}

		if(valuesetcomposeexcludefilteri == valuesetcomposeexcludefilterlist.size()-1) {v.addVlStComposeExcludeFltrPrpty("]]");}


		/******************** VlSt_Compose_Exclude_Fltr_Vl ********************************************************************************/
		if(valuesetcomposeexcludefilteri == 0) {v.addVlStComposeExcludeFltrVl("[[");}
		if(valuesetcomposeexcludefilter.hasValue()) {

			v.addVlStComposeExcludeFltrVl(String.valueOf(valuesetcomposeexcludefilter.getValue()));
		} else {
			v.addVlStComposeExcludeFltrVl("NULL");
		}

		if(valuesetcomposeexcludefilteri == valuesetcomposeexcludefilterlist.size()-1) {v.addVlStComposeExcludeFltrVl("]]");}


		/******************** valuesetcomposeexcludefilterop ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.FilterOperator valuesetcomposeexcludefilterop = valuesetcomposeexcludefilter.getOp();
		if(valuesetcomposeexcludefilterop!=null) {
		if(valuesetcomposeexcludefilteri == 0) {

		v.addVlStComposeExcludeFltrOp("[[");		}
			v.addVlStComposeExcludeFltrOp(valuesetcomposeexcludefilterop.toCode());
		if(valuesetcomposeexcludefilteri == valuesetcomposeexcludefilterlist.size()-1) {

		v.addVlStComposeExcludeFltrOp("]]");		}

		} else {
			v.addVlStComposeExcludeFltrOp("NULL");
		}

		 };
		/******************** VlSt_Compose_Exclude_Sys ********************************************************************************/
		if(valuesetcomposeexclude.hasSystem()) {

			v.addVlStComposeExcludeSys(String.valueOf(valuesetcomposeexclude.getSystem()));
		} else {
			v.addVlStComposeExcludeSys("NULL");
		}


		/******************** VlSt_Compose_Exclude_VlSt ********************************************************************************/
		if(valuesetcomposeexclude.hasValueSet()) {

			String  array = "[";
			for(int incr=0; incr<valuesetcomposeexclude.getValueSet().size(); incr++) {
				array = array + valuesetcomposeexclude.getValueSet().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			v.addVlStComposeExcludeVlSt(array);

		} else {
			v.addVlStComposeExcludeVlSt("NULL");
		}


		 };
		/******************** VlSt_Compose_Inactive ********************************************************************************/
		if(valuesetcompose.hasInactive()) {

			v.addVlStComposeInactive(String.valueOf(valuesetcompose.getInactive()));
		} else {
			v.addVlStComposeInactive("NULL");
		}


		/******************** VlSt_Compose_LockedDt ********************************************************************************/
		if(valuesetcompose.hasLockedDate()) {

			v.addVlStComposeLockedDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(valuesetcompose.getLockedDate())+"\"");
		} else {
			v.addVlStComposeLockedDt("NULL");
		}


		return v;
	}
}
