package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CompartmentDefinition;
public class CompartmentDefinitionBidirectionalConversion 
{
	public CompartmentDefinition CompartmentDefinitions(org.hl7.fhir.r4.model.CompartmentDefinition compartmentdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.CompartmentDefinition c = new  main.java.com.campfhir.model.CompartmentDefinition();

		/******************** id ********************************************************************************/
		c.setId(compartmentdefinition.getIdElement().getIdPart());

		/******************** CmprtmntDfn_Nm ********************************************************************************/
		if(compartmentdefinition.hasName()) {

			c.addCmprtmntDfnNm(String.valueOf(compartmentdefinition.getName()));
		} else {
			c.addCmprtmntDfnNm("NULL");
		}


		/******************** compartmentdefinitionresource ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent> compartmentdefinitionresourcelist = compartmentdefinition.getResource();
		for(int compartmentdefinitionresourcei = 0; compartmentdefinitionresourcei<compartmentdefinitionresourcelist.size();compartmentdefinitionresourcei++ ) {
		org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent  compartmentdefinitionresource = compartmentdefinitionresourcelist.get(compartmentdefinitionresourcei);

		/******************** CmprtmntDfn_Rsrc_Cd ********************************************************************************/
		if(compartmentdefinitionresourcei == 0) {c.addCmprtmntDfnRsrcCd("[");}
		if(compartmentdefinitionresource.hasCode()) {

			c.addCmprtmntDfnRsrcCd(String.valueOf(compartmentdefinitionresource.getCode()));
		} else {
			c.addCmprtmntDfnRsrcCd("NULL");
		}

		if(compartmentdefinitionresourcei == compartmentdefinitionresourcelist.size()-1) {c.addCmprtmntDfnRsrcCd("]");}


		/******************** CmprtmntDfn_Rsrc_Param ********************************************************************************/
		if(compartmentdefinitionresourcei == 0) {c.addCmprtmntDfnRsrcParam("[");}
		if(compartmentdefinitionresource.hasParam()) {

			String  array = "[";
			for(int incr=0; incr<compartmentdefinitionresource.getParam().size(); incr++) {
				array = array + compartmentdefinitionresource.getParam().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmprtmntDfnRsrcParam(array);

		} else {
			c.addCmprtmntDfnRsrcParam("NULL");
		}

		if(compartmentdefinitionresourcei == compartmentdefinitionresourcelist.size()-1) {c.addCmprtmntDfnRsrcParam("]");}


		/******************** CmprtmntDfn_Rsrc_Docation ********************************************************************************/
		if(compartmentdefinitionresourcei == 0) {c.addCmprtmntDfnRsrcDocation("[");}
		if(compartmentdefinitionresource.hasDocumentation()) {

			c.addCmprtmntDfnRsrcDocation(String.valueOf(compartmentdefinitionresource.getDocumentation()));
		} else {
			c.addCmprtmntDfnRsrcDocation("NULL");
		}

		if(compartmentdefinitionresourcei == compartmentdefinitionresourcelist.size()-1) {c.addCmprtmntDfnRsrcDocation("]");}


		 };
		/******************** CmprtmntDfn_Vrsn ********************************************************************************/
		if(compartmentdefinition.hasVersion()) {

			c.addCmprtmntDfnVrsn(String.valueOf(compartmentdefinition.getVersion()));
		} else {
			c.addCmprtmntDfnVrsn("NULL");
		}


		/******************** CmprtmntDfn_Dt ********************************************************************************/
		if(compartmentdefinition.hasDate()) {

			c.addCmprtmntDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(compartmentdefinition.getDate())+"\"");
		} else {
			c.addCmprtmntDfnDt("NULL");
		}


		/******************** compartmentdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType compartmentdefinitioncode = compartmentdefinition.getCode();
		if(compartmentdefinitioncode!=null) {
			c.addCmprtmntDfnCd(compartmentdefinitioncode.toCode());
		} else {
			c.addCmprtmntDfnCd("NULL");
		}

		/******************** compartmentdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus compartmentdefinitionstatus = compartmentdefinition.getStatus();
		if(compartmentdefinitionstatus!=null) {
			c.addCmprtmntDfnSts(compartmentdefinitionstatus.toCode());
		} else {
			c.addCmprtmntDfnSts("NULL");
		}

		/******************** CmprtmntDfn_Dscrptn ********************************************************************************/
		if(compartmentdefinition.hasDescription()) {

			c.addCmprtmntDfnDscrptn(String.valueOf(compartmentdefinition.getDescription()));
		} else {
			c.addCmprtmntDfnDscrptn("NULL");
		}


		/******************** compartmentdefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> compartmentdefinitioncontactlist = compartmentdefinition.getContact();
		for(int compartmentdefinitioncontacti = 0; compartmentdefinitioncontacti<compartmentdefinitioncontactlist.size();compartmentdefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  compartmentdefinitioncontact = compartmentdefinitioncontactlist.get(compartmentdefinitioncontacti);

		/******************** CmprtmntDfn_Cntct_Nm ********************************************************************************/
		if(compartmentdefinitioncontacti == 0) {c.addCmprtmntDfnCntctNm("[");}
		if(compartmentdefinitioncontact.hasName()) {

			c.addCmprtmntDfnCntctNm(String.valueOf(compartmentdefinitioncontact.getName()));
		} else {
			c.addCmprtmntDfnCntctNm("NULL");
		}

		if(compartmentdefinitioncontacti == compartmentdefinitioncontactlist.size()-1) {c.addCmprtmntDfnCntctNm("]");}


		/******************** compartmentdefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> compartmentdefinitioncontacttelecomlist = compartmentdefinitioncontact.getTelecom();
		for(int compartmentdefinitioncontacttelecomi = 0; compartmentdefinitioncontacttelecomi<compartmentdefinitioncontacttelecomlist.size();compartmentdefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  compartmentdefinitioncontacttelecom = compartmentdefinitioncontacttelecomlist.get(compartmentdefinitioncontacttelecomi);

		/******************** CmprtmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(compartmentdefinitioncontacttelecomi == 0) {c.addCmprtmntDfnCntctTlcmVl("[[");}
		if(compartmentdefinitioncontacttelecom.hasValue()) {

			c.addCmprtmntDfnCntctTlcmVl(String.valueOf(compartmentdefinitioncontacttelecom.getValue()));
		} else {
			c.addCmprtmntDfnCntctTlcmVl("NULL");
		}

		if(compartmentdefinitioncontacttelecomi == compartmentdefinitioncontacttelecomlist.size()-1) {c.addCmprtmntDfnCntctTlcmVl("]]");}


		/******************** compartmentdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compartmentdefinitioncontacttelecomperiod = compartmentdefinitioncontacttelecom.getPeriod();

		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(compartmentdefinitioncontacttelecomi == 0) {c.addCmprtmntDfnCntctTlcmPrdStrt("[[");}
		if(compartmentdefinitioncontacttelecomperiod.hasStart()) {

			c.addCmprtmntDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(compartmentdefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			c.addCmprtmntDfnCntctTlcmPrdStrt("NULL");
		}

		if(compartmentdefinitioncontacttelecomi == compartmentdefinitioncontacttelecomlist.size()-1) {c.addCmprtmntDfnCntctTlcmPrdStrt("]]");}


		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(compartmentdefinitioncontacttelecomi == 0) {c.addCmprtmntDfnCntctTlcmPrdEnd("[[");}
		if(compartmentdefinitioncontacttelecomperiod.hasEnd()) {

			c.addCmprtmntDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(compartmentdefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			c.addCmprtmntDfnCntctTlcmPrdEnd("NULL");
		}

		if(compartmentdefinitioncontacttelecomi == compartmentdefinitioncontacttelecomlist.size()-1) {c.addCmprtmntDfnCntctTlcmPrdEnd("]]");}


		/******************** compartmentdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse compartmentdefinitioncontacttelecomuse = compartmentdefinitioncontacttelecom.getUse();
		if(compartmentdefinitioncontacttelecomuse!=null) {
		if(compartmentdefinitioncontacttelecomi == 0) {

		c.addCmprtmntDfnCntctTlcmUse("[[");		}
			c.addCmprtmntDfnCntctTlcmUse(compartmentdefinitioncontacttelecomuse.toCode());
		if(compartmentdefinitioncontacttelecomi == compartmentdefinitioncontacttelecomlist.size()-1) {

		c.addCmprtmntDfnCntctTlcmUse("]]");		}

		} else {
			c.addCmprtmntDfnCntctTlcmUse("NULL");
		}

		/******************** compartmentdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem compartmentdefinitioncontacttelecomsystem = compartmentdefinitioncontacttelecom.getSystem();
		if(compartmentdefinitioncontacttelecomsystem!=null) {
		if(compartmentdefinitioncontacttelecomi == 0) {

		c.addCmprtmntDfnCntctTlcmSys("[[");		}
			c.addCmprtmntDfnCntctTlcmSys(compartmentdefinitioncontacttelecomsystem.toCode());
		if(compartmentdefinitioncontacttelecomi == compartmentdefinitioncontacttelecomlist.size()-1) {

		c.addCmprtmntDfnCntctTlcmSys("]]");		}

		} else {
			c.addCmprtmntDfnCntctTlcmSys("NULL");
		}

		/******************** CmprtmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(compartmentdefinitioncontacttelecomi == 0) {c.addCmprtmntDfnCntctTlcmRnk("[[");}
		if(compartmentdefinitioncontacttelecom.hasRank()) {

			c.addCmprtmntDfnCntctTlcmRnk(String.valueOf(compartmentdefinitioncontacttelecom.getRank()));
		} else {
			c.addCmprtmntDfnCntctTlcmRnk("NULL");
		}

		if(compartmentdefinitioncontacttelecomi == compartmentdefinitioncontacttelecomlist.size()-1) {c.addCmprtmntDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** CmprtmntDfn_Prpse ********************************************************************************/
		if(compartmentdefinition.hasPurpose()) {

			c.addCmprtmntDfnPrpse(String.valueOf(compartmentdefinition.getPurpose()));
		} else {
			c.addCmprtmntDfnPrpse("NULL");
		}


		/******************** CmprtmntDfn_Url ********************************************************************************/
		if(compartmentdefinition.hasUrl()) {

			c.addCmprtmntDfnUrl(String.valueOf(compartmentdefinition.getUrl()));
		} else {
			c.addCmprtmntDfnUrl("NULL");
		}


		/******************** compartmentdefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> compartmentdefinitionusecontextlist = compartmentdefinition.getUseContext();
		for(int compartmentdefinitionusecontexti = 0; compartmentdefinitionusecontexti<compartmentdefinitionusecontextlist.size();compartmentdefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  compartmentdefinitionusecontext = compartmentdefinitionusecontextlist.get(compartmentdefinitionusecontexti);

		/******************** compartmentdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compartmentdefinitionusecontextcode = compartmentdefinitionusecontext.getCode();

		/******************** CmprtmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtCdDsply("[");}
		if(compartmentdefinitionusecontextcode.hasDisplay()) {

			c.addCmprtmntDfnUseCntxtCdDsply(String.valueOf(compartmentdefinitionusecontextcode.getDisplay()));
		} else {
			c.addCmprtmntDfnUseCntxtCdDsply("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtCdDsply("]");}


		/******************** CmprtmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtCdVrsn("[");}
		if(compartmentdefinitionusecontextcode.hasVersion()) {

			c.addCmprtmntDfnUseCntxtCdVrsn(String.valueOf(compartmentdefinitionusecontextcode.getVersion()));
		} else {
			c.addCmprtmntDfnUseCntxtCdVrsn("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtCdVrsn("]");}


		/******************** CmprtmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtCdUsrSltd("[");}
		if(compartmentdefinitionusecontextcode.hasUserSelected()) {

			c.addCmprtmntDfnUseCntxtCdUsrSltd(String.valueOf(compartmentdefinitionusecontextcode.getUserSelected()));
		} else {
			c.addCmprtmntDfnUseCntxtCdUsrSltd("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtCdUsrSltd("]");}


		/******************** CmprtmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtCdSys("[");}
		if(compartmentdefinitionusecontextcode.hasSystem()) {

			c.addCmprtmntDfnUseCntxtCdSys(String.valueOf(compartmentdefinitionusecontextcode.getSystem()));
		} else {
			c.addCmprtmntDfnUseCntxtCdSys("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtCdSys("]");}


		/******************** CmprtmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRfrnc("[");}
		if(compartmentdefinitionusecontext.hasValueReference()) {

			if(compartmentdefinitionusecontext.getValueReference().getReference() != null) {
			c.addCmprtmntDfnUseCntxtVlRfrnc(compartmentdefinitionusecontext.getValueReference().getReference());
			}
		} else {
			c.addCmprtmntDfnUseCntxtVlRfrnc("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRfrnc("]");}


		/******************** compartmentdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compartmentdefinitionusecontextvaluecodeableconcept = compartmentdefinitionusecontext.getValueCodeableConcept();

		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlCdbleCncptTxt("[");}
		if(compartmentdefinitionusecontextvaluecodeableconcept.hasText()) {

			c.addCmprtmntDfnUseCntxtVlCdbleCncptTxt(String.valueOf(compartmentdefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			c.addCmprtmntDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** compartmentdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> compartmentdefinitionusecontextvaluecodeableconceptcodinglist = compartmentdefinitionusecontextvaluecodeableconcept.getCoding();
		for(int compartmentdefinitionusecontextvaluecodeableconceptcodingi = 0; compartmentdefinitionusecontextvaluecodeableconceptcodingi<compartmentdefinitionusecontextvaluecodeableconceptcodinglist.size();compartmentdefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  compartmentdefinitionusecontextvaluecodeableconceptcoding = compartmentdefinitionusecontextvaluecodeableconceptcodinglist.get(compartmentdefinitionusecontextvaluecodeableconceptcodingi);

		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == compartmentdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == compartmentdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == compartmentdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == compartmentdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == 0) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(compartmentdefinitionusecontextvaluecodeableconceptcodingi == compartmentdefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCmprtmntDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** compartmentdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range compartmentdefinitionusecontextvaluerange = compartmentdefinitionusecontext.getValueRange();

		/******************** compartmentdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluerangelow = compartmentdefinitionusecontextvaluerange.getLow();

		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngLwVl("[");}
		if(compartmentdefinitionusecontextvaluerangelow.hasValue()) {

			c.addCmprtmntDfnUseCntxtVlRngLwVl(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getValue()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngLwVl("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngLwVl("]");}


		/******************** compartmentdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator compartmentdefinitionusecontextvaluerangelowcomparator = compartmentdefinitionusecontextvaluerangelow.getComparator();
		if(compartmentdefinitionusecontextvaluerangelowcomparator!=null) {
		if(compartmentdefinitionusecontexti == 0) {

		c.addCmprtmntDfnUseCntxtVlRngLwCmprtr("[");		}
			c.addCmprtmntDfnUseCntxtVlRngLwCmprtr(compartmentdefinitionusecontextvaluerangelowcomparator.toCode());
		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {

		c.addCmprtmntDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			c.addCmprtmntDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngLwCd("[");}
		if(compartmentdefinitionusecontextvaluerangelow.hasCode()) {

			c.addCmprtmntDfnUseCntxtVlRngLwCd(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getCode()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngLwCd("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngLwCd("]");}


		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngLwUnt("[");}
		if(compartmentdefinitionusecontextvaluerangelow.hasUnit()) {

			c.addCmprtmntDfnUseCntxtVlRngLwUnt(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getUnit()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngLwUnt("]");}


		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngLwSys("[");}
		if(compartmentdefinitionusecontextvaluerangelow.hasSystem()) {

			c.addCmprtmntDfnUseCntxtVlRngLwSys(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getSystem()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngLwSys("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngLwSys("]");}


		/******************** compartmentdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluerangehigh = compartmentdefinitionusecontextvaluerange.getHigh();

		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngHiVl("[");}
		if(compartmentdefinitionusecontextvaluerangehigh.hasValue()) {

			c.addCmprtmntDfnUseCntxtVlRngHiVl(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getValue()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngHiVl("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngHiVl("]");}


		/******************** compartmentdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator compartmentdefinitionusecontextvaluerangehighcomparator = compartmentdefinitionusecontextvaluerangehigh.getComparator();
		if(compartmentdefinitionusecontextvaluerangehighcomparator!=null) {
		if(compartmentdefinitionusecontexti == 0) {

		c.addCmprtmntDfnUseCntxtVlRngHiCmprtr("[");		}
			c.addCmprtmntDfnUseCntxtVlRngHiCmprtr(compartmentdefinitionusecontextvaluerangehighcomparator.toCode());
		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {

		c.addCmprtmntDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			c.addCmprtmntDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngHiCd("[");}
		if(compartmentdefinitionusecontextvaluerangehigh.hasCode()) {

			c.addCmprtmntDfnUseCntxtVlRngHiCd(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getCode()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngHiCd("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngHiCd("]");}


		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngHiUnt("[");}
		if(compartmentdefinitionusecontextvaluerangehigh.hasUnit()) {

			c.addCmprtmntDfnUseCntxtVlRngHiUnt(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngHiUnt("]");}


		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlRngHiSys("[");}
		if(compartmentdefinitionusecontextvaluerangehigh.hasSystem()) {

			c.addCmprtmntDfnUseCntxtVlRngHiSys(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			c.addCmprtmntDfnUseCntxtVlRngHiSys("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlRngHiSys("]");}


		/******************** compartmentdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluequantity = compartmentdefinitionusecontext.getValueQuantity();

		/******************** CmprtmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlQntyVl("[");}
		if(compartmentdefinitionusecontextvaluequantity.hasValue()) {

			c.addCmprtmntDfnUseCntxtVlQntyVl(String.valueOf(compartmentdefinitionusecontextvaluequantity.getValue()));
		} else {
			c.addCmprtmntDfnUseCntxtVlQntyVl("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlQntyVl("]");}


		/******************** compartmentdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator compartmentdefinitionusecontextvaluequantitycomparator = compartmentdefinitionusecontextvaluequantity.getComparator();
		if(compartmentdefinitionusecontextvaluequantitycomparator!=null) {
		if(compartmentdefinitionusecontexti == 0) {

		c.addCmprtmntDfnUseCntxtVlQntyCmprtr("[");		}
			c.addCmprtmntDfnUseCntxtVlQntyCmprtr(compartmentdefinitionusecontextvaluequantitycomparator.toCode());
		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {

		c.addCmprtmntDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			c.addCmprtmntDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** CmprtmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlQntyCd("[");}
		if(compartmentdefinitionusecontextvaluequantity.hasCode()) {

			c.addCmprtmntDfnUseCntxtVlQntyCd(String.valueOf(compartmentdefinitionusecontextvaluequantity.getCode()));
		} else {
			c.addCmprtmntDfnUseCntxtVlQntyCd("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlQntyCd("]");}


		/******************** CmprtmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlQntyUnt("[");}
		if(compartmentdefinitionusecontextvaluequantity.hasUnit()) {

			c.addCmprtmntDfnUseCntxtVlQntyUnt(String.valueOf(compartmentdefinitionusecontextvaluequantity.getUnit()));
		} else {
			c.addCmprtmntDfnUseCntxtVlQntyUnt("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlQntyUnt("]");}


		/******************** CmprtmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(compartmentdefinitionusecontexti == 0) {c.addCmprtmntDfnUseCntxtVlQntySys("[");}
		if(compartmentdefinitionusecontextvaluequantity.hasSystem()) {

			c.addCmprtmntDfnUseCntxtVlQntySys(String.valueOf(compartmentdefinitionusecontextvaluequantity.getSystem()));
		} else {
			c.addCmprtmntDfnUseCntxtVlQntySys("NULL");
		}

		if(compartmentdefinitionusecontexti == compartmentdefinitionusecontextlist.size()-1) {c.addCmprtmntDfnUseCntxtVlQntySys("]");}


		 };
		/******************** CmprtmntDfn_Exprmtl ********************************************************************************/
		if(compartmentdefinition.hasExperimental()) {

			c.addCmprtmntDfnExprmtl(String.valueOf(compartmentdefinition.getExperimental()));
		} else {
			c.addCmprtmntDfnExprmtl("NULL");
		}


		/******************** CmprtmntDfn_Pblshr ********************************************************************************/
		if(compartmentdefinition.hasPublisher()) {

			c.addCmprtmntDfnPblshr(String.valueOf(compartmentdefinition.getPublisher()));
		} else {
			c.addCmprtmntDfnPblshr("NULL");
		}


		/******************** CmprtmntDfn_Srch ********************************************************************************/
		if(compartmentdefinition.hasSearch()) {

			c.addCmprtmntDfnSrch(String.valueOf(compartmentdefinition.getSearch()));
		} else {
			c.addCmprtmntDfnSrch("NULL");
		}


		return c;
	}
}
