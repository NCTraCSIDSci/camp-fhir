package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OperationDefinition;
public class OperationDefinitionBidirectionalConversion 
{
	public OperationDefinition OperationDefinitions(org.hl7.fhir.r4.model.OperationDefinition operationdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.OperationDefinition o = new  main.java.com.campfhir.model.OperationDefinition();

		/******************** id ********************************************************************************/
		o.setId(operationdefinition.getIdElement().getIdPart());

		/******************** OprtnDfn_Nm ********************************************************************************/
		if(operationdefinition.hasName()) {

			o.addOprtnDfnNm(String.valueOf(operationdefinition.getName()));
		} else {
			o.addOprtnDfnNm("NULL");
		}


		/******************** OprtnDfn_Rsrc ********************************************************************************/
		if(operationdefinition.hasResource()) {

			String  array = "[";
			for(int incr=0; incr<operationdefinition.getResource().size(); incr++) {
				array = array + operationdefinition.getResource().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOprtnDfnRsrc(array);

		} else {
			o.addOprtnDfnRsrc("NULL");
		}


		/******************** OprtnDfn_Instance ********************************************************************************/
		if(operationdefinition.hasInstance()) {

			o.addOprtnDfnInstance(String.valueOf(operationdefinition.getInstance()));
		} else {
			o.addOprtnDfnInstance("NULL");
		}


		/******************** OprtnDfn_Typ ********************************************************************************/
		if(operationdefinition.hasType()) {

			o.addOprtnDfnTyp(String.valueOf(operationdefinition.getType()));
		} else {
			o.addOprtnDfnTyp("NULL");
		}


		/******************** OprtnDfn_Comment ********************************************************************************/
		if(operationdefinition.hasComment()) {

			o.addOprtnDfnComment(String.valueOf(operationdefinition.getComment()));
		} else {
			o.addOprtnDfnComment("NULL");
		}


		/******************** OprtnDfn_Base ********************************************************************************/
		if(operationdefinition.hasBase()) {

			o.addOprtnDfnBase(String.valueOf(operationdefinition.getBase()));
		} else {
			o.addOprtnDfnBase("NULL");
		}


		/******************** OprtnDfn_Vrsn ********************************************************************************/
		if(operationdefinition.hasVersion()) {

			o.addOprtnDfnVrsn(String.valueOf(operationdefinition.getVersion()));
		} else {
			o.addOprtnDfnVrsn("NULL");
		}


		/******************** OprtnDfn_Dt ********************************************************************************/
		if(operationdefinition.hasDate()) {

			o.addOprtnDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(operationdefinition.getDate())+"\"");
		} else {
			o.addOprtnDfnDt("NULL");
		}


		/******************** OprtnDfn_Cd ********************************************************************************/
		if(operationdefinition.hasCode()) {

			o.addOprtnDfnCd(String.valueOf(operationdefinition.getCode()));
		} else {
			o.addOprtnDfnCd("NULL");
		}


		/******************** operationdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus operationdefinitionstatus = operationdefinition.getStatus();
		if(operationdefinitionstatus!=null) {
			o.addOprtnDfnSts(operationdefinitionstatus.toCode());
		} else {
			o.addOprtnDfnSts("NULL");
		}

		/******************** OprtnDfn_Dscrptn ********************************************************************************/
		if(operationdefinition.hasDescription()) {

			o.addOprtnDfnDscrptn(String.valueOf(operationdefinition.getDescription()));
		} else {
			o.addOprtnDfnDscrptn("NULL");
		}


		/******************** operationdefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> operationdefinitioncontactlist = operationdefinition.getContact();
		for(int operationdefinitioncontacti = 0; operationdefinitioncontacti<operationdefinitioncontactlist.size();operationdefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  operationdefinitioncontact = operationdefinitioncontactlist.get(operationdefinitioncontacti);

		/******************** OprtnDfn_Cntct_Nm ********************************************************************************/
		if(operationdefinitioncontacti == 0) {o.addOprtnDfnCntctNm("[");}
		if(operationdefinitioncontact.hasName()) {

			o.addOprtnDfnCntctNm(String.valueOf(operationdefinitioncontact.getName()));
		} else {
			o.addOprtnDfnCntctNm("NULL");
		}

		if(operationdefinitioncontacti == operationdefinitioncontactlist.size()-1) {o.addOprtnDfnCntctNm("]");}


		/******************** operationdefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> operationdefinitioncontacttelecomlist = operationdefinitioncontact.getTelecom();
		for(int operationdefinitioncontacttelecomi = 0; operationdefinitioncontacttelecomi<operationdefinitioncontacttelecomlist.size();operationdefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  operationdefinitioncontacttelecom = operationdefinitioncontacttelecomlist.get(operationdefinitioncontacttelecomi);

		/******************** OprtnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(operationdefinitioncontacttelecomi == 0) {o.addOprtnDfnCntctTlcmVl("[[");}
		if(operationdefinitioncontacttelecom.hasValue()) {

			o.addOprtnDfnCntctTlcmVl(String.valueOf(operationdefinitioncontacttelecom.getValue()));
		} else {
			o.addOprtnDfnCntctTlcmVl("NULL");
		}

		if(operationdefinitioncontacttelecomi == operationdefinitioncontacttelecomlist.size()-1) {o.addOprtnDfnCntctTlcmVl("]]");}


		/******************** operationdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period operationdefinitioncontacttelecomperiod = operationdefinitioncontacttelecom.getPeriod();

		/******************** OprtnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(operationdefinitioncontacttelecomi == 0) {o.addOprtnDfnCntctTlcmPrdStrt("[[");}
		if(operationdefinitioncontacttelecomperiod.hasStart()) {

			o.addOprtnDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(operationdefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			o.addOprtnDfnCntctTlcmPrdStrt("NULL");
		}

		if(operationdefinitioncontacttelecomi == operationdefinitioncontacttelecomlist.size()-1) {o.addOprtnDfnCntctTlcmPrdStrt("]]");}


		/******************** OprtnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(operationdefinitioncontacttelecomi == 0) {o.addOprtnDfnCntctTlcmPrdEnd("[[");}
		if(operationdefinitioncontacttelecomperiod.hasEnd()) {

			o.addOprtnDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(operationdefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			o.addOprtnDfnCntctTlcmPrdEnd("NULL");
		}

		if(operationdefinitioncontacttelecomi == operationdefinitioncontacttelecomlist.size()-1) {o.addOprtnDfnCntctTlcmPrdEnd("]]");}


		/******************** operationdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse operationdefinitioncontacttelecomuse = operationdefinitioncontacttelecom.getUse();
		if(operationdefinitioncontacttelecomuse!=null) {
		if(operationdefinitioncontacttelecomi == 0) {

		o.addOprtnDfnCntctTlcmUse("[[");		}
			o.addOprtnDfnCntctTlcmUse(operationdefinitioncontacttelecomuse.toCode());
		if(operationdefinitioncontacttelecomi == operationdefinitioncontacttelecomlist.size()-1) {

		o.addOprtnDfnCntctTlcmUse("]]");		}

		} else {
			o.addOprtnDfnCntctTlcmUse("NULL");
		}

		/******************** operationdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem operationdefinitioncontacttelecomsystem = operationdefinitioncontacttelecom.getSystem();
		if(operationdefinitioncontacttelecomsystem!=null) {
		if(operationdefinitioncontacttelecomi == 0) {

		o.addOprtnDfnCntctTlcmSys("[[");		}
			o.addOprtnDfnCntctTlcmSys(operationdefinitioncontacttelecomsystem.toCode());
		if(operationdefinitioncontacttelecomi == operationdefinitioncontacttelecomlist.size()-1) {

		o.addOprtnDfnCntctTlcmSys("]]");		}

		} else {
			o.addOprtnDfnCntctTlcmSys("NULL");
		}

		/******************** OprtnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(operationdefinitioncontacttelecomi == 0) {o.addOprtnDfnCntctTlcmRnk("[[");}
		if(operationdefinitioncontacttelecom.hasRank()) {

			o.addOprtnDfnCntctTlcmRnk(String.valueOf(operationdefinitioncontacttelecom.getRank()));
		} else {
			o.addOprtnDfnCntctTlcmRnk("NULL");
		}

		if(operationdefinitioncontacttelecomi == operationdefinitioncontacttelecomlist.size()-1) {o.addOprtnDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** operationdefinitionparameter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent> operationdefinitionparameterlist = operationdefinition.getParameter();
		for(int operationdefinitionparameteri = 0; operationdefinitionparameteri<operationdefinitionparameterlist.size();operationdefinitionparameteri++ ) {
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent  operationdefinitionparameter = operationdefinitionparameterlist.get(operationdefinitionparameteri);

		/******************** OprtnDfn_Prmtr_Nm ********************************************************************************/
		if(operationdefinitionparameteri == 0) {o.addOprtnDfnPrmtrNm("[");}
		if(operationdefinitionparameter.hasName()) {

			o.addOprtnDfnPrmtrNm(String.valueOf(operationdefinitionparameter.getName()));
		} else {
			o.addOprtnDfnPrmtrNm("NULL");
		}

		if(operationdefinitionparameteri == operationdefinitionparameterlist.size()-1) {o.addOprtnDfnPrmtrNm("]");}


		/******************** OprtnDfn_Prmtr_Typ ********************************************************************************/
		if(operationdefinitionparameteri == 0) {o.addOprtnDfnPrmtrTyp("[");}
		if(operationdefinitionparameter.hasType()) {

			o.addOprtnDfnPrmtrTyp(String.valueOf(operationdefinitionparameter.getType()));
		} else {
			o.addOprtnDfnPrmtrTyp("NULL");
		}

		if(operationdefinitionparameteri == operationdefinitionparameterlist.size()-1) {o.addOprtnDfnPrmtrTyp("]");}


		/******************** operationdefinitionparameteruse ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse operationdefinitionparameteruse = operationdefinitionparameter.getUse();
		if(operationdefinitionparameteruse!=null) {
		if(operationdefinitionparameteri == 0) {

		o.addOprtnDfnPrmtrUse("[");		}
			o.addOprtnDfnPrmtrUse(operationdefinitionparameteruse.toCode());
		if(operationdefinitionparameteri == operationdefinitionparameterlist.size()-1) {

		o.addOprtnDfnPrmtrUse("]");		}

		} else {
			o.addOprtnDfnPrmtrUse("NULL");
		}

		/******************** OprtnDfn_Prmtr_TarProfile ********************************************************************************/
		if(operationdefinitionparameteri == 0) {o.addOprtnDfnPrmtrTarProfile("[");}
		if(operationdefinitionparameter.hasTargetProfile()) {

			String  array = "[";
			for(int incr=0; incr<operationdefinitionparameter.getTargetProfile().size(); incr++) {
				array = array + operationdefinitionparameter.getTargetProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOprtnDfnPrmtrTarProfile(array);

		} else {
			o.addOprtnDfnPrmtrTarProfile("NULL");
		}

		if(operationdefinitionparameteri == operationdefinitionparameterlist.size()-1) {o.addOprtnDfnPrmtrTarProfile("]");}


		/******************** operationdefinitionparameterreferencedfrom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent> operationdefinitionparameterreferencedfromlist = operationdefinitionparameter.getReferencedFrom();
		for(int operationdefinitionparameterreferencedfromi = 0; operationdefinitionparameterreferencedfromi<operationdefinitionparameterreferencedfromlist.size();operationdefinitionparameterreferencedfromi++ ) {
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent  operationdefinitionparameterreferencedfrom = operationdefinitionparameterreferencedfromlist.get(operationdefinitionparameterreferencedfromi);

		/******************** OprtnDfn_Prmtr_RfrncdFrom_Src ********************************************************************************/
		if(operationdefinitionparameterreferencedfromi == 0) {o.addOprtnDfnPrmtrRfrncdFromSrc("[[");}
		if(operationdefinitionparameterreferencedfrom.hasSource()) {

			o.addOprtnDfnPrmtrRfrncdFromSrc(String.valueOf(operationdefinitionparameterreferencedfrom.getSource()));
		} else {
			o.addOprtnDfnPrmtrRfrncdFromSrc("NULL");
		}

		if(operationdefinitionparameterreferencedfromi == operationdefinitionparameterreferencedfromlist.size()-1) {o.addOprtnDfnPrmtrRfrncdFromSrc("]]");}


		/******************** OprtnDfn_Prmtr_RfrncdFrom_SrcId ********************************************************************************/
		if(operationdefinitionparameterreferencedfromi == 0) {o.addOprtnDfnPrmtrRfrncdFromSrcId("[[");}
		if(operationdefinitionparameterreferencedfrom.hasSourceId()) {

			o.addOprtnDfnPrmtrRfrncdFromSrcId(String.valueOf(operationdefinitionparameterreferencedfrom.getSourceId()));
		} else {
			o.addOprtnDfnPrmtrRfrncdFromSrcId("NULL");
		}

		if(operationdefinitionparameterreferencedfromi == operationdefinitionparameterreferencedfromlist.size()-1) {o.addOprtnDfnPrmtrRfrncdFromSrcId("]]");}


		 };
		/******************** operationdefinitionparametersearchtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType operationdefinitionparametersearchtype = operationdefinitionparameter.getSearchType();
		if(operationdefinitionparametersearchtype!=null) {
			o.addOprtnDfnPrmtrSrchTyp(operationdefinitionparametersearchtype.toCode());
		} else {
			o.addOprtnDfnPrmtrSrchTyp("NULL");
		}

		/******************** operationdefinitionparameterbinding ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent operationdefinitionparameterbinding = operationdefinitionparameter.getBinding();

		/******************** operationdefinitionparameterbindingstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.BindingStrength operationdefinitionparameterbindingstrength = operationdefinitionparameterbinding.getStrength();
		if(operationdefinitionparameterbindingstrength!=null) {
			o.addOprtnDfnPrmtrBindingStr(operationdefinitionparameterbindingstrength.toCode());
		} else {
			o.addOprtnDfnPrmtrBindingStr("NULL");
		}

		/******************** OprtnDfn_Prmtr_Binding_VlSt ********************************************************************************/
		if(operationdefinitionparameterbinding.hasValueSet()) {

			o.addOprtnDfnPrmtrBindingVlSt(String.valueOf(operationdefinitionparameterbinding.getValueSet()));
		} else {
			o.addOprtnDfnPrmtrBindingVlSt("NULL");
		}


		/******************** OprtnDfn_Prmtr_Min ********************************************************************************/
		if(operationdefinitionparameter.hasMin()) {

			o.addOprtnDfnPrmtrMin(String.valueOf(operationdefinitionparameter.getMin()));
		} else {
			o.addOprtnDfnPrmtrMin("NULL");
		}


		/******************** OprtnDfn_Prmtr_Mx ********************************************************************************/
		if(operationdefinitionparameter.hasMax()) {

			o.addOprtnDfnPrmtrMx(String.valueOf(operationdefinitionparameter.getMax()));
		} else {
			o.addOprtnDfnPrmtrMx("NULL");
		}


		/******************** OprtnDfn_Prmtr_Docation ********************************************************************************/
		if(operationdefinitionparameter.hasDocumentation()) {

			o.addOprtnDfnPrmtrDocation(String.valueOf(operationdefinitionparameter.getDocumentation()));
		} else {
			o.addOprtnDfnPrmtrDocation("NULL");
		}


		 };
		/******************** operationdefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationKind operationdefinitionkind = operationdefinition.getKind();
		if(operationdefinitionkind!=null) {
			o.addOprtnDfnKind(operationdefinitionkind.toCode());
		} else {
			o.addOprtnDfnKind("NULL");
		}

		/******************** OprtnDfn_Ttl ********************************************************************************/
		if(operationdefinition.hasTitle()) {

			o.addOprtnDfnTtl(String.valueOf(operationdefinition.getTitle()));
		} else {
			o.addOprtnDfnTtl("NULL");
		}


		/******************** OprtnDfn_Prpse ********************************************************************************/
		if(operationdefinition.hasPurpose()) {

			o.addOprtnDfnPrpse(String.valueOf(operationdefinition.getPurpose()));
		} else {
			o.addOprtnDfnPrpse("NULL");
		}


		/******************** OprtnDfn_Sys ********************************************************************************/
		if(operationdefinition.hasSystem()) {

			o.addOprtnDfnSys(String.valueOf(operationdefinition.getSystem()));
		} else {
			o.addOprtnDfnSys("NULL");
		}


		/******************** OprtnDfn_Url ********************************************************************************/
		if(operationdefinition.hasUrl()) {

			o.addOprtnDfnUrl(String.valueOf(operationdefinition.getUrl()));
		} else {
			o.addOprtnDfnUrl("NULL");
		}


		/******************** OprtnDfn_InputProfile ********************************************************************************/
		if(operationdefinition.hasInputProfile()) {

			o.addOprtnDfnInputProfile(String.valueOf(operationdefinition.getInputProfile()));
		} else {
			o.addOprtnDfnInputProfile("NULL");
		}


		/******************** OprtnDfn_AffectsState ********************************************************************************/
		if(operationdefinition.hasAffectsState()) {

			o.addOprtnDfnAffectsState(String.valueOf(operationdefinition.getAffectsState()));
		} else {
			o.addOprtnDfnAffectsState("NULL");
		}


		/******************** operationdefinitionoverload ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent> operationdefinitionoverloadlist = operationdefinition.getOverload();
		for(int operationdefinitionoverloadi = 0; operationdefinitionoverloadi<operationdefinitionoverloadlist.size();operationdefinitionoverloadi++ ) {
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent  operationdefinitionoverload = operationdefinitionoverloadlist.get(operationdefinitionoverloadi);

		/******************** OprtnDfn_Overload_Comment ********************************************************************************/
		if(operationdefinitionoverloadi == 0) {o.addOprtnDfnOverloadComment("[");}
		if(operationdefinitionoverload.hasComment()) {

			o.addOprtnDfnOverloadComment(String.valueOf(operationdefinitionoverload.getComment()));
		} else {
			o.addOprtnDfnOverloadComment("NULL");
		}

		if(operationdefinitionoverloadi == operationdefinitionoverloadlist.size()-1) {o.addOprtnDfnOverloadComment("]");}


		/******************** OprtnDfn_Overload_PrmtrNm ********************************************************************************/
		if(operationdefinitionoverloadi == 0) {o.addOprtnDfnOverloadPrmtrNm("[");}
		if(operationdefinitionoverload.hasParameterName()) {

			String  array = "[";
			for(int incr=0; incr<operationdefinitionoverload.getParameterName().size(); incr++) {
				array = array + operationdefinitionoverload.getParameterName().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOprtnDfnOverloadPrmtrNm(array);

		} else {
			o.addOprtnDfnOverloadPrmtrNm("NULL");
		}

		if(operationdefinitionoverloadi == operationdefinitionoverloadlist.size()-1) {o.addOprtnDfnOverloadPrmtrNm("]");}


		 };
		/******************** OprtnDfn_OutputProfile ********************************************************************************/
		if(operationdefinition.hasOutputProfile()) {

			o.addOprtnDfnOutputProfile(String.valueOf(operationdefinition.getOutputProfile()));
		} else {
			o.addOprtnDfnOutputProfile("NULL");
		}


		/******************** operationdefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> operationdefinitionjurisdictionlist = operationdefinition.getJurisdiction();
		for(int operationdefinitionjurisdictioni = 0; operationdefinitionjurisdictioni<operationdefinitionjurisdictionlist.size();operationdefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  operationdefinitionjurisdiction = operationdefinitionjurisdictionlist.get(operationdefinitionjurisdictioni);

		/******************** OprtnDfn_Jrsdctn_Txt ********************************************************************************/
		if(operationdefinitionjurisdictioni == 0) {o.addOprtnDfnJrsdctnTxt("[");}
		if(operationdefinitionjurisdiction.hasText()) {

			o.addOprtnDfnJrsdctnTxt(String.valueOf(operationdefinitionjurisdiction.getText()));
		} else {
			o.addOprtnDfnJrsdctnTxt("NULL");
		}

		if(operationdefinitionjurisdictioni == operationdefinitionjurisdictionlist.size()-1) {o.addOprtnDfnJrsdctnTxt("]");}


		/******************** operationdefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> operationdefinitionjurisdictioncodinglist = operationdefinitionjurisdiction.getCoding();
		for(int operationdefinitionjurisdictioncodingi = 0; operationdefinitionjurisdictioncodingi<operationdefinitionjurisdictioncodinglist.size();operationdefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  operationdefinitionjurisdictioncoding = operationdefinitionjurisdictioncodinglist.get(operationdefinitionjurisdictioncodingi);

		/******************** OprtnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(operationdefinitionjurisdictioncodingi == 0) {o.addOprtnDfnJrsdctnCdgDsply("[[");}
		if(operationdefinitionjurisdictioncoding.hasDisplay()) {

			o.addOprtnDfnJrsdctnCdgDsply(String.valueOf(operationdefinitionjurisdictioncoding.getDisplay()));
		} else {
			o.addOprtnDfnJrsdctnCdgDsply("NULL");
		}

		if(operationdefinitionjurisdictioncodingi == operationdefinitionjurisdictioncodinglist.size()-1) {o.addOprtnDfnJrsdctnCdgDsply("]]");}


		/******************** OprtnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(operationdefinitionjurisdictioncodingi == 0) {o.addOprtnDfnJrsdctnCdgVrsn("[[");}
		if(operationdefinitionjurisdictioncoding.hasVersion()) {

			o.addOprtnDfnJrsdctnCdgVrsn(String.valueOf(operationdefinitionjurisdictioncoding.getVersion()));
		} else {
			o.addOprtnDfnJrsdctnCdgVrsn("NULL");
		}

		if(operationdefinitionjurisdictioncodingi == operationdefinitionjurisdictioncodinglist.size()-1) {o.addOprtnDfnJrsdctnCdgVrsn("]]");}


		/******************** OprtnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(operationdefinitionjurisdictioncodingi == 0) {o.addOprtnDfnJrsdctnCdgCd("[[");}
		if(operationdefinitionjurisdictioncoding.hasCode()) {

			o.addOprtnDfnJrsdctnCdgCd(String.valueOf(operationdefinitionjurisdictioncoding.getCode()));
		} else {
			o.addOprtnDfnJrsdctnCdgCd("NULL");
		}

		if(operationdefinitionjurisdictioncodingi == operationdefinitionjurisdictioncodinglist.size()-1) {o.addOprtnDfnJrsdctnCdgCd("]]");}


		/******************** OprtnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(operationdefinitionjurisdictioncodingi == 0) {o.addOprtnDfnJrsdctnCdgUsrSltd("[[");}
		if(operationdefinitionjurisdictioncoding.hasUserSelected()) {

			o.addOprtnDfnJrsdctnCdgUsrSltd(String.valueOf(operationdefinitionjurisdictioncoding.getUserSelected()));
		} else {
			o.addOprtnDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(operationdefinitionjurisdictioncodingi == operationdefinitionjurisdictioncodinglist.size()-1) {o.addOprtnDfnJrsdctnCdgUsrSltd("]]");}


		/******************** OprtnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(operationdefinitionjurisdictioncodingi == 0) {o.addOprtnDfnJrsdctnCdgSys("[[");}
		if(operationdefinitionjurisdictioncoding.hasSystem()) {

			o.addOprtnDfnJrsdctnCdgSys(String.valueOf(operationdefinitionjurisdictioncoding.getSystem()));
		} else {
			o.addOprtnDfnJrsdctnCdgSys("NULL");
		}

		if(operationdefinitionjurisdictioncodingi == operationdefinitionjurisdictioncodinglist.size()-1) {o.addOprtnDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** operationdefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> operationdefinitionusecontextlist = operationdefinition.getUseContext();
		for(int operationdefinitionusecontexti = 0; operationdefinitionusecontexti<operationdefinitionusecontextlist.size();operationdefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  operationdefinitionusecontext = operationdefinitionusecontextlist.get(operationdefinitionusecontexti);

		/******************** operationdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationdefinitionusecontextcode = operationdefinitionusecontext.getCode();

		/******************** OprtnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtCdDsply("[");}
		if(operationdefinitionusecontextcode.hasDisplay()) {

			o.addOprtnDfnUseCntxtCdDsply(String.valueOf(operationdefinitionusecontextcode.getDisplay()));
		} else {
			o.addOprtnDfnUseCntxtCdDsply("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtCdDsply("]");}


		/******************** OprtnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtCdVrsn("[");}
		if(operationdefinitionusecontextcode.hasVersion()) {

			o.addOprtnDfnUseCntxtCdVrsn(String.valueOf(operationdefinitionusecontextcode.getVersion()));
		} else {
			o.addOprtnDfnUseCntxtCdVrsn("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtCdVrsn("]");}


		/******************** OprtnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtCdUsrSltd("[");}
		if(operationdefinitionusecontextcode.hasUserSelected()) {

			o.addOprtnDfnUseCntxtCdUsrSltd(String.valueOf(operationdefinitionusecontextcode.getUserSelected()));
		} else {
			o.addOprtnDfnUseCntxtCdUsrSltd("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtCdUsrSltd("]");}


		/******************** OprtnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtCdSys("[");}
		if(operationdefinitionusecontextcode.hasSystem()) {

			o.addOprtnDfnUseCntxtCdSys(String.valueOf(operationdefinitionusecontextcode.getSystem()));
		} else {
			o.addOprtnDfnUseCntxtCdSys("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtCdSys("]");}


		/******************** OprtnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRfrnc("[");}
		if(operationdefinitionusecontext.hasValueReference()) {

			if(operationdefinitionusecontext.getValueReference().getReference() != null) {
			o.addOprtnDfnUseCntxtVlRfrnc(operationdefinitionusecontext.getValueReference().getReference());
			}
		} else {
			o.addOprtnDfnUseCntxtVlRfrnc("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRfrnc("]");}


		/******************** operationdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationdefinitionusecontextvaluecodeableconcept = operationdefinitionusecontext.getValueCodeableConcept();

		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlCdbleCncptTxt("[");}
		if(operationdefinitionusecontextvaluecodeableconcept.hasText()) {

			o.addOprtnDfnUseCntxtVlCdbleCncptTxt(String.valueOf(operationdefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			o.addOprtnDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** operationdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> operationdefinitionusecontextvaluecodeableconceptcodinglist = operationdefinitionusecontextvaluecodeableconcept.getCoding();
		for(int operationdefinitionusecontextvaluecodeableconceptcodingi = 0; operationdefinitionusecontextvaluecodeableconceptcodingi<operationdefinitionusecontextvaluecodeableconceptcodinglist.size();operationdefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  operationdefinitionusecontextvaluecodeableconceptcoding = operationdefinitionusecontextvaluecodeableconceptcodinglist.get(operationdefinitionusecontextvaluecodeableconceptcodingi);

		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcodingi == 0) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			o.addOprtnDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			o.addOprtnDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(operationdefinitionusecontextvaluecodeableconceptcodingi == operationdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcodingi == 0) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			o.addOprtnDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			o.addOprtnDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(operationdefinitionusecontextvaluecodeableconceptcodingi == operationdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcodingi == 0) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			o.addOprtnDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			o.addOprtnDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(operationdefinitionusecontextvaluecodeableconceptcodingi == operationdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcodingi == 0) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			o.addOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			o.addOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(operationdefinitionusecontextvaluecodeableconceptcodingi == operationdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcodingi == 0) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			o.addOprtnDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			o.addOprtnDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(operationdefinitionusecontextvaluecodeableconceptcodingi == operationdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {o.addOprtnDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** operationdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range operationdefinitionusecontextvaluerange = operationdefinitionusecontext.getValueRange();

		/******************** operationdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluerangelow = operationdefinitionusecontextvaluerange.getLow();

		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngLwVl("[");}
		if(operationdefinitionusecontextvaluerangelow.hasValue()) {

			o.addOprtnDfnUseCntxtVlRngLwVl(String.valueOf(operationdefinitionusecontextvaluerangelow.getValue()));
		} else {
			o.addOprtnDfnUseCntxtVlRngLwVl("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngLwVl("]");}


		/******************** operationdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator operationdefinitionusecontextvaluerangelowcomparator = operationdefinitionusecontextvaluerangelow.getComparator();
		if(operationdefinitionusecontextvaluerangelowcomparator!=null) {
		if(operationdefinitionusecontexti == 0) {

		o.addOprtnDfnUseCntxtVlRngLwCmprtr("[");		}
			o.addOprtnDfnUseCntxtVlRngLwCmprtr(operationdefinitionusecontextvaluerangelowcomparator.toCode());
		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {

		o.addOprtnDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			o.addOprtnDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngLwCd("[");}
		if(operationdefinitionusecontextvaluerangelow.hasCode()) {

			o.addOprtnDfnUseCntxtVlRngLwCd(String.valueOf(operationdefinitionusecontextvaluerangelow.getCode()));
		} else {
			o.addOprtnDfnUseCntxtVlRngLwCd("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngLwCd("]");}


		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngLwUnt("[");}
		if(operationdefinitionusecontextvaluerangelow.hasUnit()) {

			o.addOprtnDfnUseCntxtVlRngLwUnt(String.valueOf(operationdefinitionusecontextvaluerangelow.getUnit()));
		} else {
			o.addOprtnDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngLwUnt("]");}


		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngLwSys("[");}
		if(operationdefinitionusecontextvaluerangelow.hasSystem()) {

			o.addOprtnDfnUseCntxtVlRngLwSys(String.valueOf(operationdefinitionusecontextvaluerangelow.getSystem()));
		} else {
			o.addOprtnDfnUseCntxtVlRngLwSys("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngLwSys("]");}


		/******************** operationdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluerangehigh = operationdefinitionusecontextvaluerange.getHigh();

		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngHiVl("[");}
		if(operationdefinitionusecontextvaluerangehigh.hasValue()) {

			o.addOprtnDfnUseCntxtVlRngHiVl(String.valueOf(operationdefinitionusecontextvaluerangehigh.getValue()));
		} else {
			o.addOprtnDfnUseCntxtVlRngHiVl("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngHiVl("]");}


		/******************** operationdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator operationdefinitionusecontextvaluerangehighcomparator = operationdefinitionusecontextvaluerangehigh.getComparator();
		if(operationdefinitionusecontextvaluerangehighcomparator!=null) {
		if(operationdefinitionusecontexti == 0) {

		o.addOprtnDfnUseCntxtVlRngHiCmprtr("[");		}
			o.addOprtnDfnUseCntxtVlRngHiCmprtr(operationdefinitionusecontextvaluerangehighcomparator.toCode());
		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {

		o.addOprtnDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			o.addOprtnDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngHiCd("[");}
		if(operationdefinitionusecontextvaluerangehigh.hasCode()) {

			o.addOprtnDfnUseCntxtVlRngHiCd(String.valueOf(operationdefinitionusecontextvaluerangehigh.getCode()));
		} else {
			o.addOprtnDfnUseCntxtVlRngHiCd("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngHiCd("]");}


		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngHiUnt("[");}
		if(operationdefinitionusecontextvaluerangehigh.hasUnit()) {

			o.addOprtnDfnUseCntxtVlRngHiUnt(String.valueOf(operationdefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			o.addOprtnDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngHiUnt("]");}


		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlRngHiSys("[");}
		if(operationdefinitionusecontextvaluerangehigh.hasSystem()) {

			o.addOprtnDfnUseCntxtVlRngHiSys(String.valueOf(operationdefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			o.addOprtnDfnUseCntxtVlRngHiSys("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlRngHiSys("]");}


		/******************** operationdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluequantity = operationdefinitionusecontext.getValueQuantity();

		/******************** OprtnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlQntyVl("[");}
		if(operationdefinitionusecontextvaluequantity.hasValue()) {

			o.addOprtnDfnUseCntxtVlQntyVl(String.valueOf(operationdefinitionusecontextvaluequantity.getValue()));
		} else {
			o.addOprtnDfnUseCntxtVlQntyVl("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlQntyVl("]");}


		/******************** operationdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator operationdefinitionusecontextvaluequantitycomparator = operationdefinitionusecontextvaluequantity.getComparator();
		if(operationdefinitionusecontextvaluequantitycomparator!=null) {
		if(operationdefinitionusecontexti == 0) {

		o.addOprtnDfnUseCntxtVlQntyCmprtr("[");		}
			o.addOprtnDfnUseCntxtVlQntyCmprtr(operationdefinitionusecontextvaluequantitycomparator.toCode());
		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {

		o.addOprtnDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			o.addOprtnDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** OprtnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlQntyCd("[");}
		if(operationdefinitionusecontextvaluequantity.hasCode()) {

			o.addOprtnDfnUseCntxtVlQntyCd(String.valueOf(operationdefinitionusecontextvaluequantity.getCode()));
		} else {
			o.addOprtnDfnUseCntxtVlQntyCd("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlQntyCd("]");}


		/******************** OprtnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlQntyUnt("[");}
		if(operationdefinitionusecontextvaluequantity.hasUnit()) {

			o.addOprtnDfnUseCntxtVlQntyUnt(String.valueOf(operationdefinitionusecontextvaluequantity.getUnit()));
		} else {
			o.addOprtnDfnUseCntxtVlQntyUnt("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlQntyUnt("]");}


		/******************** OprtnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(operationdefinitionusecontexti == 0) {o.addOprtnDfnUseCntxtVlQntySys("[");}
		if(operationdefinitionusecontextvaluequantity.hasSystem()) {

			o.addOprtnDfnUseCntxtVlQntySys(String.valueOf(operationdefinitionusecontextvaluequantity.getSystem()));
		} else {
			o.addOprtnDfnUseCntxtVlQntySys("NULL");
		}

		if(operationdefinitionusecontexti == operationdefinitionusecontextlist.size()-1) {o.addOprtnDfnUseCntxtVlQntySys("]");}


		 };
		/******************** OprtnDfn_Exprmtl ********************************************************************************/
		if(operationdefinition.hasExperimental()) {

			o.addOprtnDfnExprmtl(String.valueOf(operationdefinition.getExperimental()));
		} else {
			o.addOprtnDfnExprmtl("NULL");
		}


		/******************** OprtnDfn_Pblshr ********************************************************************************/
		if(operationdefinition.hasPublisher()) {

			o.addOprtnDfnPblshr(String.valueOf(operationdefinition.getPublisher()));
		} else {
			o.addOprtnDfnPblshr("NULL");
		}


		return o;
	}
}
