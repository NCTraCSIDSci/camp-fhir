package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.InsurancePlan;
public class InsurancePlanBidirectionalConversion 
{
	public InsurancePlan InsurancePlans(org.hl7.fhir.r4.model.InsurancePlan insuranceplan) throws ParseException
	{
		 main.java.com.campfhir.model.InsurancePlan i = new  main.java.com.campfhir.model.InsurancePlan();

		/******************** id ********************************************************************************/
		i.setId(insuranceplan.getIdElement().getIdPart());

		/******************** InsrncPln_Nm ********************************************************************************/
		if(insuranceplan.hasName()) {

			i.addInsrncPlnNm(String.valueOf(insuranceplan.getName()));
		} else {
			i.addInsrncPlnNm("NULL");
		}


		/******************** insuranceplantype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> insuranceplantypelist = insuranceplan.getType();
		for(int insuranceplantypei = 0; insuranceplantypei<insuranceplantypelist.size();insuranceplantypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  insuranceplantype = insuranceplantypelist.get(insuranceplantypei);

		/******************** InsrncPln_Typ_Txt ********************************************************************************/
		if(insuranceplantypei == 0) {i.addInsrncPlnTypTxt("[");}
		if(insuranceplantype.hasText()) {

			i.addInsrncPlnTypTxt(String.valueOf(insuranceplantype.getText()));
		} else {
			i.addInsrncPlnTypTxt("NULL");
		}

		if(insuranceplantypei == insuranceplantypelist.size()-1) {i.addInsrncPlnTypTxt("]");}


		/******************** insuranceplantypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplantypecodinglist = insuranceplantype.getCoding();
		for(int insuranceplantypecodingi = 0; insuranceplantypecodingi<insuranceplantypecodinglist.size();insuranceplantypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplantypecoding = insuranceplantypecodinglist.get(insuranceplantypecodingi);

		/******************** InsrncPln_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplantypecodingi == 0) {i.addInsrncPlnTypCdgDsply("[[");}
		if(insuranceplantypecoding.hasDisplay()) {

			i.addInsrncPlnTypCdgDsply(String.valueOf(insuranceplantypecoding.getDisplay()));
		} else {
			i.addInsrncPlnTypCdgDsply("NULL");
		}

		if(insuranceplantypecodingi == insuranceplantypecodinglist.size()-1) {i.addInsrncPlnTypCdgDsply("]]");}


		/******************** InsrncPln_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplantypecodingi == 0) {i.addInsrncPlnTypCdgVrsn("[[");}
		if(insuranceplantypecoding.hasVersion()) {

			i.addInsrncPlnTypCdgVrsn(String.valueOf(insuranceplantypecoding.getVersion()));
		} else {
			i.addInsrncPlnTypCdgVrsn("NULL");
		}

		if(insuranceplantypecodingi == insuranceplantypecodinglist.size()-1) {i.addInsrncPlnTypCdgVrsn("]]");}


		/******************** InsrncPln_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplantypecodingi == 0) {i.addInsrncPlnTypCdgCd("[[");}
		if(insuranceplantypecoding.hasCode()) {

			i.addInsrncPlnTypCdgCd(String.valueOf(insuranceplantypecoding.getCode()));
		} else {
			i.addInsrncPlnTypCdgCd("NULL");
		}

		if(insuranceplantypecodingi == insuranceplantypecodinglist.size()-1) {i.addInsrncPlnTypCdgCd("]]");}


		/******************** InsrncPln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplantypecodingi == 0) {i.addInsrncPlnTypCdgUsrSltd("[[");}
		if(insuranceplantypecoding.hasUserSelected()) {

			i.addInsrncPlnTypCdgUsrSltd(String.valueOf(insuranceplantypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnTypCdgUsrSltd("NULL");
		}

		if(insuranceplantypecodingi == insuranceplantypecodinglist.size()-1) {i.addInsrncPlnTypCdgUsrSltd("]]");}


		/******************** InsrncPln_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplantypecodingi == 0) {i.addInsrncPlnTypCdgSys("[[");}
		if(insuranceplantypecoding.hasSystem()) {

			i.addInsrncPlnTypCdgSys(String.valueOf(insuranceplantypecoding.getSystem()));
		} else {
			i.addInsrncPlnTypCdgSys("NULL");
		}

		if(insuranceplantypecodingi == insuranceplantypecodinglist.size()-1) {i.addInsrncPlnTypCdgSys("]]");}


		 };
		 };
		/******************** insuranceplanstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus insuranceplanstatus = insuranceplan.getStatus();
		if(insuranceplanstatus!=null) {
			i.addInsrncPlnSts(insuranceplanstatus.toCode());
		} else {
			i.addInsrncPlnSts("NULL");
		}

		/******************** InsrncPln_Endpoint ********************************************************************************/
		if(insuranceplan.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplan.getEndpoint().size(); incr++) {
				array = array + insuranceplan.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnEndpoint(array);

		} else {
			i.addInsrncPlnEndpoint("NULL");
		}


		/******************** insuranceplanperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanperiod = insuranceplan.getPeriod();

		/******************** InsrncPln_Prd_Strt ********************************************************************************/
		if(insuranceplanperiod.hasStart()) {

			i.addInsrncPlnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplanperiod.getStart())+"\"");
		} else {
			i.addInsrncPlnPrdStrt("NULL");
		}


		/******************** InsrncPln_Prd_End ********************************************************************************/
		if(insuranceplanperiod.hasEnd()) {

			i.addInsrncPlnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplanperiod.getEnd())+"\"");
		} else {
			i.addInsrncPlnPrdEnd("NULL");
		}


		/******************** insuranceplanidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> insuranceplanidentifierlist = insuranceplan.getIdentifier();
		for(int insuranceplanidentifieri = 0; insuranceplanidentifieri<insuranceplanidentifierlist.size();insuranceplanidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  insuranceplanidentifier = insuranceplanidentifierlist.get(insuranceplanidentifieri);

		/******************** InsrncPln_Id_Vl ********************************************************************************/
		if(insuranceplanidentifieri == 0) {i.addInsrncPlnIdVl("[");}
		if(insuranceplanidentifier.hasValue()) {

			i.addInsrncPlnIdVl(String.valueOf(insuranceplanidentifier.getValue()));
		} else {
			i.addInsrncPlnIdVl("NULL");
		}

		if(insuranceplanidentifieri == insuranceplanidentifierlist.size()-1) {i.addInsrncPlnIdVl("]");}


		/******************** insuranceplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanidentifiertype = insuranceplanidentifier.getType();

		/******************** InsrncPln_Id_Typ_Txt ********************************************************************************/
		if(insuranceplanidentifieri == 0) {i.addInsrncPlnIdTypTxt("[");}
		if(insuranceplanidentifiertype.hasText()) {

			i.addInsrncPlnIdTypTxt(String.valueOf(insuranceplanidentifiertype.getText()));
		} else {
			i.addInsrncPlnIdTypTxt("NULL");
		}

		if(insuranceplanidentifieri == insuranceplanidentifierlist.size()-1) {i.addInsrncPlnIdTypTxt("]");}


		/******************** insuranceplanidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanidentifiertypecodinglist = insuranceplanidentifiertype.getCoding();
		for(int insuranceplanidentifiertypecodingi = 0; insuranceplanidentifiertypecodingi<insuranceplanidentifiertypecodinglist.size();insuranceplanidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanidentifiertypecoding = insuranceplanidentifiertypecodinglist.get(insuranceplanidentifiertypecodingi);

		/******************** InsrncPln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanidentifiertypecodingi == 0) {i.addInsrncPlnIdTypCdgDsply("[[");}
		if(insuranceplanidentifiertypecoding.hasDisplay()) {

			i.addInsrncPlnIdTypCdgDsply(String.valueOf(insuranceplanidentifiertypecoding.getDisplay()));
		} else {
			i.addInsrncPlnIdTypCdgDsply("NULL");
		}

		if(insuranceplanidentifiertypecodingi == insuranceplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnIdTypCdgDsply("]]");}


		/******************** InsrncPln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanidentifiertypecodingi == 0) {i.addInsrncPlnIdTypCdgVrsn("[[");}
		if(insuranceplanidentifiertypecoding.hasVersion()) {

			i.addInsrncPlnIdTypCdgVrsn(String.valueOf(insuranceplanidentifiertypecoding.getVersion()));
		} else {
			i.addInsrncPlnIdTypCdgVrsn("NULL");
		}

		if(insuranceplanidentifiertypecodingi == insuranceplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnIdTypCdgVrsn("]]");}


		/******************** InsrncPln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanidentifiertypecodingi == 0) {i.addInsrncPlnIdTypCdgCd("[[");}
		if(insuranceplanidentifiertypecoding.hasCode()) {

			i.addInsrncPlnIdTypCdgCd(String.valueOf(insuranceplanidentifiertypecoding.getCode()));
		} else {
			i.addInsrncPlnIdTypCdgCd("NULL");
		}

		if(insuranceplanidentifiertypecodingi == insuranceplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnIdTypCdgCd("]]");}


		/******************** InsrncPln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanidentifiertypecodingi == 0) {i.addInsrncPlnIdTypCdgUsrSltd("[[");}
		if(insuranceplanidentifiertypecoding.hasUserSelected()) {

			i.addInsrncPlnIdTypCdgUsrSltd(String.valueOf(insuranceplanidentifiertypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnIdTypCdgUsrSltd("NULL");
		}

		if(insuranceplanidentifiertypecodingi == insuranceplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnIdTypCdgUsrSltd("]]");}


		/******************** InsrncPln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanidentifiertypecodingi == 0) {i.addInsrncPlnIdTypCdgSys("[[");}
		if(insuranceplanidentifiertypecoding.hasSystem()) {

			i.addInsrncPlnIdTypCdgSys(String.valueOf(insuranceplanidentifiertypecoding.getSystem()));
		} else {
			i.addInsrncPlnIdTypCdgSys("NULL");
		}

		if(insuranceplanidentifiertypecodingi == insuranceplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnIdTypCdgSys("]]");}


		 };
		/******************** insuranceplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanidentifierperiod = insuranceplanidentifier.getPeriod();

		/******************** InsrncPln_Id_Prd_Strt ********************************************************************************/
		if(insuranceplanidentifieri == 0) {i.addInsrncPlnIdPrdStrt("[");}
		if(insuranceplanidentifierperiod.hasStart()) {

			i.addInsrncPlnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplanidentifierperiod.getStart())+"\"");
		} else {
			i.addInsrncPlnIdPrdStrt("NULL");
		}

		if(insuranceplanidentifieri == insuranceplanidentifierlist.size()-1) {i.addInsrncPlnIdPrdStrt("]");}


		/******************** InsrncPln_Id_Prd_End ********************************************************************************/
		if(insuranceplanidentifieri == 0) {i.addInsrncPlnIdPrdEnd("[");}
		if(insuranceplanidentifierperiod.hasEnd()) {

			i.addInsrncPlnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplanidentifierperiod.getEnd())+"\"");
		} else {
			i.addInsrncPlnIdPrdEnd("NULL");
		}

		if(insuranceplanidentifieri == insuranceplanidentifierlist.size()-1) {i.addInsrncPlnIdPrdEnd("]");}


		/******************** insuranceplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse insuranceplanidentifieruse = insuranceplanidentifier.getUse();
		if(insuranceplanidentifieruse!=null) {
		if(insuranceplanidentifieri == 0) {

		i.addInsrncPlnIdUse("[");		}
			i.addInsrncPlnIdUse(insuranceplanidentifieruse.toCode());
		if(insuranceplanidentifieri == insuranceplanidentifierlist.size()-1) {

		i.addInsrncPlnIdUse("]");		}

		} else {
			i.addInsrncPlnIdUse("NULL");
		}

		/******************** InsrncPln_Id_Assigner ********************************************************************************/
		if(insuranceplanidentifieri == 0) {i.addInsrncPlnIdAssigner("[");}
		if(insuranceplanidentifier.hasAssigner()) {

			if(insuranceplanidentifier.getAssigner().getReference() != null) {
			i.addInsrncPlnIdAssigner(insuranceplanidentifier.getAssigner().getReference());
			}
		} else {
			i.addInsrncPlnIdAssigner("NULL");
		}

		if(insuranceplanidentifieri == insuranceplanidentifierlist.size()-1) {i.addInsrncPlnIdAssigner("]");}


		/******************** InsrncPln_Id_Sys ********************************************************************************/
		if(insuranceplanidentifieri == 0) {i.addInsrncPlnIdSys("[");}
		if(insuranceplanidentifier.hasSystem()) {

			i.addInsrncPlnIdSys(String.valueOf(insuranceplanidentifier.getSystem()));
		} else {
			i.addInsrncPlnIdSys("NULL");
		}

		if(insuranceplanidentifieri == insuranceplanidentifierlist.size()-1) {i.addInsrncPlnIdSys("]");}


		 };
		/******************** insuranceplancontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent> insuranceplancontactlist = insuranceplan.getContact();
		for(int insuranceplancontacti = 0; insuranceplancontacti<insuranceplancontactlist.size();insuranceplancontacti++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent  insuranceplancontact = insuranceplancontactlist.get(insuranceplancontacti);

		/******************** insuranceplancontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName insuranceplancontactname = insuranceplancontact.getName();

		/******************** insuranceplancontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontactnameperiod = insuranceplancontactname.getPeriod();

		/******************** InsrncPln_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctNmPrdStrt("[");}
		if(insuranceplancontactnameperiod.hasStart()) {

			i.addInsrncPlnCntctNmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplancontactnameperiod.getStart())+"\"");
		} else {
			i.addInsrncPlnCntctNmPrdStrt("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctNmPrdStrt("]");}


		/******************** InsrncPln_Cntct_Nm_Prd_End ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctNmPrdEnd("[");}
		if(insuranceplancontactnameperiod.hasEnd()) {

			i.addInsrncPlnCntctNmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplancontactnameperiod.getEnd())+"\"");
		} else {
			i.addInsrncPlnCntctNmPrdEnd("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctNmPrdEnd("]");}


		/******************** InsrncPln_Cntct_Nm_Given ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctNmGiven("[");}
		if(insuranceplancontactname.hasGiven()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplancontactname.getGiven().size(); incr++) {
				array = array + insuranceplancontactname.getGiven().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnCntctNmGiven(array);

		} else {
			i.addInsrncPlnCntctNmGiven("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctNmGiven("]");}


		/******************** InsrncPln_Cntct_Nm_Fmly ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctNmFmly("[");}
		if(insuranceplancontactname.hasFamily()) {

			i.addInsrncPlnCntctNmFmly(String.valueOf(insuranceplancontactname.getFamily()));
		} else {
			i.addInsrncPlnCntctNmFmly("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctNmFmly("]");}


		/******************** InsrncPln_Cntct_Nm_Suffix ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctNmSuffix("[");}
		if(insuranceplancontactname.hasSuffix()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplancontactname.getSuffix().size(); incr++) {
				array = array + insuranceplancontactname.getSuffix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnCntctNmSuffix(array);

		} else {
			i.addInsrncPlnCntctNmSuffix("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctNmSuffix("]");}


		/******************** insuranceplancontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse insuranceplancontactnameuse = insuranceplancontactname.getUse();
		if(insuranceplancontactnameuse!=null) {
		if(insuranceplancontacti == 0) {

		i.addInsrncPlnCntctNmUse("[");		}
			i.addInsrncPlnCntctNmUse(insuranceplancontactnameuse.toCode());
		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {

		i.addInsrncPlnCntctNmUse("]");		}

		} else {
			i.addInsrncPlnCntctNmUse("NULL");
		}

		/******************** InsrncPln_Cntct_Nm_Txt ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctNmTxt("[");}
		if(insuranceplancontactname.hasText()) {

			i.addInsrncPlnCntctNmTxt(String.valueOf(insuranceplancontactname.getText()));
		} else {
			i.addInsrncPlnCntctNmTxt("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctNmTxt("]");}


		/******************** InsrncPln_Cntct_Nm_Prefix ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctNmPrefix("[");}
		if(insuranceplancontactname.hasPrefix()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplancontactname.getPrefix().size(); incr++) {
				array = array + insuranceplancontactname.getPrefix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnCntctNmPrefix(array);

		} else {
			i.addInsrncPlnCntctNmPrefix("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctNmPrefix("]");}


		/******************** insuranceplancontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address insuranceplancontactaddress = insuranceplancontact.getAddress();

		/******************** InsrncPln_Cntct_Addr_State ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrState("[");}
		if(insuranceplancontactaddress.hasState()) {

			i.addInsrncPlnCntctAddrState(String.valueOf(insuranceplancontactaddress.getState()));
		} else {
			i.addInsrncPlnCntctAddrState("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrState("]");}


		/******************** insuranceplancontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType insuranceplancontactaddresstype = insuranceplancontactaddress.getType();
		if(insuranceplancontactaddresstype!=null) {
		if(insuranceplancontacti == 0) {

		i.addInsrncPlnCntctAddrTyp("[");		}
			i.addInsrncPlnCntctAddrTyp(insuranceplancontactaddresstype.toCode());
		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {

		i.addInsrncPlnCntctAddrTyp("]");		}

		} else {
			i.addInsrncPlnCntctAddrTyp("NULL");
		}

		/******************** InsrncPln_Cntct_Addr_Cntry ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrCntry("[");}
		if(insuranceplancontactaddress.hasCountry()) {

			i.addInsrncPlnCntctAddrCntry(String.valueOf(insuranceplancontactaddress.getCountry()));
		} else {
			i.addInsrncPlnCntctAddrCntry("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrCntry("]");}


		/******************** insuranceplancontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontactaddressperiod = insuranceplancontactaddress.getPeriod();

		/******************** InsrncPln_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrPrdStrt("[");}
		if(insuranceplancontactaddressperiod.hasStart()) {

			i.addInsrncPlnCntctAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplancontactaddressperiod.getStart())+"\"");
		} else {
			i.addInsrncPlnCntctAddrPrdStrt("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrPrdStrt("]");}


		/******************** InsrncPln_Cntct_Addr_Prd_End ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrPrdEnd("[");}
		if(insuranceplancontactaddressperiod.hasEnd()) {

			i.addInsrncPlnCntctAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplancontactaddressperiod.getEnd())+"\"");
		} else {
			i.addInsrncPlnCntctAddrPrdEnd("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrPrdEnd("]");}


		/******************** InsrncPln_Cntct_Addr_District ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrDistrict("[");}
		if(insuranceplancontactaddress.hasDistrict()) {

			i.addInsrncPlnCntctAddrDistrict(String.valueOf(insuranceplancontactaddress.getDistrict()));
		} else {
			i.addInsrncPlnCntctAddrDistrict("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrDistrict("]");}


		/******************** InsrncPln_Cntct_Addr_PostalCd ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrPostalCd("[");}
		if(insuranceplancontactaddress.hasPostalCode()) {

			i.addInsrncPlnCntctAddrPostalCd(String.valueOf(insuranceplancontactaddress.getPostalCode()));
		} else {
			i.addInsrncPlnCntctAddrPostalCd("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrPostalCd("]");}


		/******************** InsrncPln_Cntct_Addr_Line ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrLine("[");}
		if(insuranceplancontactaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplancontactaddress.getLine().size(); incr++) {
				array = array + insuranceplancontactaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnCntctAddrLine(array);

		} else {
			i.addInsrncPlnCntctAddrLine("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrLine("]");}


		/******************** InsrncPln_Cntct_Addr_City ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrCity("[");}
		if(insuranceplancontactaddress.hasCity()) {

			i.addInsrncPlnCntctAddrCity(String.valueOf(insuranceplancontactaddress.getCity()));
		} else {
			i.addInsrncPlnCntctAddrCity("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrCity("]");}


		/******************** insuranceplancontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse insuranceplancontactaddressuse = insuranceplancontactaddress.getUse();
		if(insuranceplancontactaddressuse!=null) {
		if(insuranceplancontacti == 0) {

		i.addInsrncPlnCntctAddrUse("[");		}
			i.addInsrncPlnCntctAddrUse(insuranceplancontactaddressuse.toCode());
		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {

		i.addInsrncPlnCntctAddrUse("]");		}

		} else {
			i.addInsrncPlnCntctAddrUse("NULL");
		}

		/******************** InsrncPln_Cntct_Addr_Txt ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctAddrTxt("[");}
		if(insuranceplancontactaddress.hasText()) {

			i.addInsrncPlnCntctAddrTxt(String.valueOf(insuranceplancontactaddress.getText()));
		} else {
			i.addInsrncPlnCntctAddrTxt("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctAddrTxt("]");}


		/******************** insuranceplancontactpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancontactpurpose = insuranceplancontact.getPurpose();

		/******************** InsrncPln_Cntct_Prpse_Txt ********************************************************************************/
		if(insuranceplancontacti == 0) {i.addInsrncPlnCntctPrpseTxt("[");}
		if(insuranceplancontactpurpose.hasText()) {

			i.addInsrncPlnCntctPrpseTxt(String.valueOf(insuranceplancontactpurpose.getText()));
		} else {
			i.addInsrncPlnCntctPrpseTxt("NULL");
		}

		if(insuranceplancontacti == insuranceplancontactlist.size()-1) {i.addInsrncPlnCntctPrpseTxt("]");}


		/******************** insuranceplancontactpurposecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplancontactpurposecodinglist = insuranceplancontactpurpose.getCoding();
		for(int insuranceplancontactpurposecodingi = 0; insuranceplancontactpurposecodingi<insuranceplancontactpurposecodinglist.size();insuranceplancontactpurposecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplancontactpurposecoding = insuranceplancontactpurposecodinglist.get(insuranceplancontactpurposecodingi);

		/******************** InsrncPln_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(insuranceplancontactpurposecodingi == 0) {i.addInsrncPlnCntctPrpseCdgDsply("[[");}
		if(insuranceplancontactpurposecoding.hasDisplay()) {

			i.addInsrncPlnCntctPrpseCdgDsply(String.valueOf(insuranceplancontactpurposecoding.getDisplay()));
		} else {
			i.addInsrncPlnCntctPrpseCdgDsply("NULL");
		}

		if(insuranceplancontactpurposecodingi == insuranceplancontactpurposecodinglist.size()-1) {i.addInsrncPlnCntctPrpseCdgDsply("]]");}


		/******************** InsrncPln_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancontactpurposecodingi == 0) {i.addInsrncPlnCntctPrpseCdgVrsn("[[");}
		if(insuranceplancontactpurposecoding.hasVersion()) {

			i.addInsrncPlnCntctPrpseCdgVrsn(String.valueOf(insuranceplancontactpurposecoding.getVersion()));
		} else {
			i.addInsrncPlnCntctPrpseCdgVrsn("NULL");
		}

		if(insuranceplancontactpurposecodingi == insuranceplancontactpurposecodinglist.size()-1) {i.addInsrncPlnCntctPrpseCdgVrsn("]]");}


		/******************** InsrncPln_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(insuranceplancontactpurposecodingi == 0) {i.addInsrncPlnCntctPrpseCdgCd("[[");}
		if(insuranceplancontactpurposecoding.hasCode()) {

			i.addInsrncPlnCntctPrpseCdgCd(String.valueOf(insuranceplancontactpurposecoding.getCode()));
		} else {
			i.addInsrncPlnCntctPrpseCdgCd("NULL");
		}

		if(insuranceplancontactpurposecodingi == insuranceplancontactpurposecodinglist.size()-1) {i.addInsrncPlnCntctPrpseCdgCd("]]");}


		/******************** InsrncPln_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancontactpurposecodingi == 0) {i.addInsrncPlnCntctPrpseCdgUsrSltd("[[");}
		if(insuranceplancontactpurposecoding.hasUserSelected()) {

			i.addInsrncPlnCntctPrpseCdgUsrSltd(String.valueOf(insuranceplancontactpurposecoding.getUserSelected()));
		} else {
			i.addInsrncPlnCntctPrpseCdgUsrSltd("NULL");
		}

		if(insuranceplancontactpurposecodingi == insuranceplancontactpurposecodinglist.size()-1) {i.addInsrncPlnCntctPrpseCdgUsrSltd("]]");}


		/******************** InsrncPln_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(insuranceplancontactpurposecodingi == 0) {i.addInsrncPlnCntctPrpseCdgSys("[[");}
		if(insuranceplancontactpurposecoding.hasSystem()) {

			i.addInsrncPlnCntctPrpseCdgSys(String.valueOf(insuranceplancontactpurposecoding.getSystem()));
		} else {
			i.addInsrncPlnCntctPrpseCdgSys("NULL");
		}

		if(insuranceplancontactpurposecodingi == insuranceplancontactpurposecodinglist.size()-1) {i.addInsrncPlnCntctPrpseCdgSys("]]");}


		 };
		/******************** insuranceplancontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> insuranceplancontacttelecomlist = insuranceplancontact.getTelecom();
		for(int insuranceplancontacttelecomi = 0; insuranceplancontacttelecomi<insuranceplancontacttelecomlist.size();insuranceplancontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  insuranceplancontacttelecom = insuranceplancontacttelecomlist.get(insuranceplancontacttelecomi);

		/******************** InsrncPln_Cntct_Tlcm_Vl ********************************************************************************/
		if(insuranceplancontacttelecomi == 0) {i.addInsrncPlnCntctTlcmVl("[[");}
		if(insuranceplancontacttelecom.hasValue()) {

			i.addInsrncPlnCntctTlcmVl(String.valueOf(insuranceplancontacttelecom.getValue()));
		} else {
			i.addInsrncPlnCntctTlcmVl("NULL");
		}

		if(insuranceplancontacttelecomi == insuranceplancontacttelecomlist.size()-1) {i.addInsrncPlnCntctTlcmVl("]]");}


		/******************** insuranceplancontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontacttelecomperiod = insuranceplancontacttelecom.getPeriod();

		/******************** InsrncPln_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(insuranceplancontacttelecomi == 0) {i.addInsrncPlnCntctTlcmPrdStrt("[[");}
		if(insuranceplancontacttelecomperiod.hasStart()) {

			i.addInsrncPlnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplancontacttelecomperiod.getStart())+"\"");
		} else {
			i.addInsrncPlnCntctTlcmPrdStrt("NULL");
		}

		if(insuranceplancontacttelecomi == insuranceplancontacttelecomlist.size()-1) {i.addInsrncPlnCntctTlcmPrdStrt("]]");}


		/******************** InsrncPln_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(insuranceplancontacttelecomi == 0) {i.addInsrncPlnCntctTlcmPrdEnd("[[");}
		if(insuranceplancontacttelecomperiod.hasEnd()) {

			i.addInsrncPlnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplancontacttelecomperiod.getEnd())+"\"");
		} else {
			i.addInsrncPlnCntctTlcmPrdEnd("NULL");
		}

		if(insuranceplancontacttelecomi == insuranceplancontacttelecomlist.size()-1) {i.addInsrncPlnCntctTlcmPrdEnd("]]");}


		/******************** insuranceplancontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse insuranceplancontacttelecomuse = insuranceplancontacttelecom.getUse();
		if(insuranceplancontacttelecomuse!=null) {
		if(insuranceplancontacttelecomi == 0) {

		i.addInsrncPlnCntctTlcmUse("[[");		}
			i.addInsrncPlnCntctTlcmUse(insuranceplancontacttelecomuse.toCode());
		if(insuranceplancontacttelecomi == insuranceplancontacttelecomlist.size()-1) {

		i.addInsrncPlnCntctTlcmUse("]]");		}

		} else {
			i.addInsrncPlnCntctTlcmUse("NULL");
		}

		/******************** insuranceplancontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem insuranceplancontacttelecomsystem = insuranceplancontacttelecom.getSystem();
		if(insuranceplancontacttelecomsystem!=null) {
		if(insuranceplancontacttelecomi == 0) {

		i.addInsrncPlnCntctTlcmSys("[[");		}
			i.addInsrncPlnCntctTlcmSys(insuranceplancontacttelecomsystem.toCode());
		if(insuranceplancontacttelecomi == insuranceplancontacttelecomlist.size()-1) {

		i.addInsrncPlnCntctTlcmSys("]]");		}

		} else {
			i.addInsrncPlnCntctTlcmSys("NULL");
		}

		/******************** InsrncPln_Cntct_Tlcm_Rnk ********************************************************************************/
		if(insuranceplancontacttelecomi == 0) {i.addInsrncPlnCntctTlcmRnk("[[");}
		if(insuranceplancontacttelecom.hasRank()) {

			i.addInsrncPlnCntctTlcmRnk(String.valueOf(insuranceplancontacttelecom.getRank()));
		} else {
			i.addInsrncPlnCntctTlcmRnk("NULL");
		}

		if(insuranceplancontacttelecomi == insuranceplancontacttelecomlist.size()-1) {i.addInsrncPlnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** InsrncPln_Network ********************************************************************************/
		if(insuranceplan.hasNetwork()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplan.getNetwork().size(); incr++) {
				array = array + insuranceplan.getNetwork().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnNetwork(array);

		} else {
			i.addInsrncPlnNetwork("NULL");
		}


		/******************** insuranceplancoverage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent> insuranceplancoveragelist = insuranceplan.getCoverage();
		for(int insuranceplancoveragei = 0; insuranceplancoveragei<insuranceplancoveragelist.size();insuranceplancoveragei++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent  insuranceplancoverage = insuranceplancoveragelist.get(insuranceplancoveragei);

		/******************** insuranceplancoveragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragetype = insuranceplancoverage.getType();

		/******************** InsrncPln_Cvg_Typ_Txt ********************************************************************************/
		if(insuranceplancoveragei == 0) {i.addInsrncPlnCvgTypTxt("[");}
		if(insuranceplancoveragetype.hasText()) {

			i.addInsrncPlnCvgTypTxt(String.valueOf(insuranceplancoveragetype.getText()));
		} else {
			i.addInsrncPlnCvgTypTxt("NULL");
		}

		if(insuranceplancoveragei == insuranceplancoveragelist.size()-1) {i.addInsrncPlnCvgTypTxt("]");}


		/******************** insuranceplancoveragetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplancoveragetypecodinglist = insuranceplancoveragetype.getCoding();
		for(int insuranceplancoveragetypecodingi = 0; insuranceplancoveragetypecodingi<insuranceplancoveragetypecodinglist.size();insuranceplancoveragetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplancoveragetypecoding = insuranceplancoveragetypecodinglist.get(insuranceplancoveragetypecodingi);

		/******************** InsrncPln_Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplancoveragetypecodingi == 0) {i.addInsrncPlnCvgTypCdgDsply("[[");}
		if(insuranceplancoveragetypecoding.hasDisplay()) {

			i.addInsrncPlnCvgTypCdgDsply(String.valueOf(insuranceplancoveragetypecoding.getDisplay()));
		} else {
			i.addInsrncPlnCvgTypCdgDsply("NULL");
		}

		if(insuranceplancoveragetypecodingi == insuranceplancoveragetypecodinglist.size()-1) {i.addInsrncPlnCvgTypCdgDsply("]]");}


		/******************** InsrncPln_Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancoveragetypecodingi == 0) {i.addInsrncPlnCvgTypCdgVrsn("[[");}
		if(insuranceplancoveragetypecoding.hasVersion()) {

			i.addInsrncPlnCvgTypCdgVrsn(String.valueOf(insuranceplancoveragetypecoding.getVersion()));
		} else {
			i.addInsrncPlnCvgTypCdgVrsn("NULL");
		}

		if(insuranceplancoveragetypecodingi == insuranceplancoveragetypecodinglist.size()-1) {i.addInsrncPlnCvgTypCdgVrsn("]]");}


		/******************** InsrncPln_Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplancoveragetypecodingi == 0) {i.addInsrncPlnCvgTypCdgCd("[[");}
		if(insuranceplancoveragetypecoding.hasCode()) {

			i.addInsrncPlnCvgTypCdgCd(String.valueOf(insuranceplancoveragetypecoding.getCode()));
		} else {
			i.addInsrncPlnCvgTypCdgCd("NULL");
		}

		if(insuranceplancoveragetypecodingi == insuranceplancoveragetypecodinglist.size()-1) {i.addInsrncPlnCvgTypCdgCd("]]");}


		/******************** InsrncPln_Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancoveragetypecodingi == 0) {i.addInsrncPlnCvgTypCdgUsrSltd("[[");}
		if(insuranceplancoveragetypecoding.hasUserSelected()) {

			i.addInsrncPlnCvgTypCdgUsrSltd(String.valueOf(insuranceplancoveragetypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnCvgTypCdgUsrSltd("NULL");
		}

		if(insuranceplancoveragetypecodingi == insuranceplancoveragetypecodinglist.size()-1) {i.addInsrncPlnCvgTypCdgUsrSltd("]]");}


		/******************** InsrncPln_Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplancoveragetypecodingi == 0) {i.addInsrncPlnCvgTypCdgSys("[[");}
		if(insuranceplancoveragetypecoding.hasSystem()) {

			i.addInsrncPlnCvgTypCdgSys(String.valueOf(insuranceplancoveragetypecoding.getSystem()));
		} else {
			i.addInsrncPlnCvgTypCdgSys("NULL");
		}

		if(insuranceplancoveragetypecodingi == insuranceplancoveragetypecodinglist.size()-1) {i.addInsrncPlnCvgTypCdgSys("]]");}


		 };
		/******************** InsrncPln_Cvg_Network ********************************************************************************/
		if(insuranceplancoveragei == 0) {i.addInsrncPlnCvgNetwork("[");}
		if(insuranceplancoverage.hasNetwork()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplancoverage.getNetwork().size(); incr++) {
				array = array + insuranceplancoverage.getNetwork().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnCvgNetwork(array);

		} else {
			i.addInsrncPlnCvgNetwork("NULL");
		}

		if(insuranceplancoveragei == insuranceplancoveragelist.size()-1) {i.addInsrncPlnCvgNetwork("]");}


		/******************** insuranceplancoveragebenefit ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent> insuranceplancoveragebenefitlist = insuranceplancoverage.getBenefit();
		for(int insuranceplancoveragebenefiti = 0; insuranceplancoveragebenefiti<insuranceplancoveragebenefitlist.size();insuranceplancoveragebenefiti++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent  insuranceplancoveragebenefit = insuranceplancoveragebenefitlist.get(insuranceplancoveragebenefiti);

		/******************** insuranceplancoveragebenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragebenefittype = insuranceplancoveragebenefit.getType();

		/******************** InsrncPln_Cvg_Bnft_Typ_Txt ********************************************************************************/
		if(insuranceplancoveragebenefiti == 0) {i.addInsrncPlnCvgBnftTypTxt("[[");}
		if(insuranceplancoveragebenefittype.hasText()) {

			i.addInsrncPlnCvgBnftTypTxt(String.valueOf(insuranceplancoveragebenefittype.getText()));
		} else {
			i.addInsrncPlnCvgBnftTypTxt("NULL");
		}

		if(insuranceplancoveragebenefiti == insuranceplancoveragebenefitlist.size()-1) {i.addInsrncPlnCvgBnftTypTxt("]]");}


		/******************** insuranceplancoveragebenefittypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplancoveragebenefittypecodinglist = insuranceplancoveragebenefittype.getCoding();
		for(int insuranceplancoveragebenefittypecodingi = 0; insuranceplancoveragebenefittypecodingi<insuranceplancoveragebenefittypecodinglist.size();insuranceplancoveragebenefittypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplancoveragebenefittypecoding = insuranceplancoveragebenefittypecodinglist.get(insuranceplancoveragebenefittypecodingi);

		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplancoveragebenefittypecodingi == 0) {i.addInsrncPlnCvgBnftTypCdgDsply("[[[");}
		if(insuranceplancoveragebenefittypecoding.hasDisplay()) {

			i.addInsrncPlnCvgBnftTypCdgDsply(String.valueOf(insuranceplancoveragebenefittypecoding.getDisplay()));
		} else {
			i.addInsrncPlnCvgBnftTypCdgDsply("NULL");
		}

		if(insuranceplancoveragebenefittypecodingi == insuranceplancoveragebenefittypecodinglist.size()-1) {i.addInsrncPlnCvgBnftTypCdgDsply("]]]");}


		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancoveragebenefittypecodingi == 0) {i.addInsrncPlnCvgBnftTypCdgVrsn("[[[");}
		if(insuranceplancoveragebenefittypecoding.hasVersion()) {

			i.addInsrncPlnCvgBnftTypCdgVrsn(String.valueOf(insuranceplancoveragebenefittypecoding.getVersion()));
		} else {
			i.addInsrncPlnCvgBnftTypCdgVrsn("NULL");
		}

		if(insuranceplancoveragebenefittypecodingi == insuranceplancoveragebenefittypecodinglist.size()-1) {i.addInsrncPlnCvgBnftTypCdgVrsn("]]]");}


		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplancoveragebenefittypecodingi == 0) {i.addInsrncPlnCvgBnftTypCdgCd("[[[");}
		if(insuranceplancoveragebenefittypecoding.hasCode()) {

			i.addInsrncPlnCvgBnftTypCdgCd(String.valueOf(insuranceplancoveragebenefittypecoding.getCode()));
		} else {
			i.addInsrncPlnCvgBnftTypCdgCd("NULL");
		}

		if(insuranceplancoveragebenefittypecodingi == insuranceplancoveragebenefittypecodinglist.size()-1) {i.addInsrncPlnCvgBnftTypCdgCd("]]]");}


		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancoveragebenefittypecodingi == 0) {i.addInsrncPlnCvgBnftTypCdgUsrSltd("[[[");}
		if(insuranceplancoveragebenefittypecoding.hasUserSelected()) {

			i.addInsrncPlnCvgBnftTypCdgUsrSltd(String.valueOf(insuranceplancoveragebenefittypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnCvgBnftTypCdgUsrSltd("NULL");
		}

		if(insuranceplancoveragebenefittypecodingi == insuranceplancoveragebenefittypecodinglist.size()-1) {i.addInsrncPlnCvgBnftTypCdgUsrSltd("]]]");}


		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplancoveragebenefittypecodingi == 0) {i.addInsrncPlnCvgBnftTypCdgSys("[[[");}
		if(insuranceplancoveragebenefittypecoding.hasSystem()) {

			i.addInsrncPlnCvgBnftTypCdgSys(String.valueOf(insuranceplancoveragebenefittypecoding.getSystem()));
		} else {
			i.addInsrncPlnCvgBnftTypCdgSys("NULL");
		}

		if(insuranceplancoveragebenefittypecodingi == insuranceplancoveragebenefittypecodinglist.size()-1) {i.addInsrncPlnCvgBnftTypCdgSys("]]]");}


		 };
		/******************** InsrncPln_Cvg_Bnft_Rqrment ********************************************************************************/
		if(insuranceplancoveragebenefiti == 0) {i.addInsrncPlnCvgBnftRqrment("[[");}
		if(insuranceplancoveragebenefit.hasRequirement()) {

			i.addInsrncPlnCvgBnftRqrment(String.valueOf(insuranceplancoveragebenefit.getRequirement()));
		} else {
			i.addInsrncPlnCvgBnftRqrment("NULL");
		}

		if(insuranceplancoveragebenefiti == insuranceplancoveragebenefitlist.size()-1) {i.addInsrncPlnCvgBnftRqrment("]]");}


		/******************** insuranceplancoveragebenefitlimit ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent> insuranceplancoveragebenefitlimitlist = insuranceplancoveragebenefit.getLimit();
		for(int insuranceplancoveragebenefitlimiti = 0; insuranceplancoveragebenefitlimiti<insuranceplancoveragebenefitlimitlist.size();insuranceplancoveragebenefitlimiti++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent  insuranceplancoveragebenefitlimit = insuranceplancoveragebenefitlimitlist.get(insuranceplancoveragebenefitlimiti);

		/******************** insuranceplancoveragebenefitlimitvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity insuranceplancoveragebenefitlimitvalue = insuranceplancoveragebenefitlimit.getValue();

		/******************** insuranceplancoveragebenefitlimitvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator insuranceplancoveragebenefitlimitvaluecomparator = insuranceplancoveragebenefitlimitvalue.getComparator();
		if(insuranceplancoveragebenefitlimitvaluecomparator!=null) {
		if(insuranceplancoveragebenefitlimiti == 0) {

		i.addInsrncPlnCvgBnftLmtVlCmprtr("[[[");		}
			i.addInsrncPlnCvgBnftLmtVlCmprtr(insuranceplancoveragebenefitlimitvaluecomparator.toCode());
		if(insuranceplancoveragebenefitlimiti == insuranceplancoveragebenefitlimitlist.size()-1) {

		i.addInsrncPlnCvgBnftLmtVlCmprtr("]]]");		}

		} else {
			i.addInsrncPlnCvgBnftLmtVlCmprtr("NULL");
		}

		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Cd ********************************************************************************/
		if(insuranceplancoveragebenefitlimiti == 0) {i.addInsrncPlnCvgBnftLmtVlCd("[[[");}
		if(insuranceplancoveragebenefitlimitvalue.hasCode()) {

			i.addInsrncPlnCvgBnftLmtVlCd(String.valueOf(insuranceplancoveragebenefitlimitvalue.getCode()));
		} else {
			i.addInsrncPlnCvgBnftLmtVlCd("NULL");
		}

		if(insuranceplancoveragebenefitlimiti == insuranceplancoveragebenefitlimitlist.size()-1) {i.addInsrncPlnCvgBnftLmtVlCd("]]]");}


		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Unt ********************************************************************************/
		if(insuranceplancoveragebenefitlimiti == 0) {i.addInsrncPlnCvgBnftLmtVlUnt("[[[");}
		if(insuranceplancoveragebenefitlimitvalue.hasUnit()) {

			i.addInsrncPlnCvgBnftLmtVlUnt(String.valueOf(insuranceplancoveragebenefitlimitvalue.getUnit()));
		} else {
			i.addInsrncPlnCvgBnftLmtVlUnt("NULL");
		}

		if(insuranceplancoveragebenefitlimiti == insuranceplancoveragebenefitlimitlist.size()-1) {i.addInsrncPlnCvgBnftLmtVlUnt("]]]");}


		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Sys ********************************************************************************/
		if(insuranceplancoveragebenefitlimiti == 0) {i.addInsrncPlnCvgBnftLmtVlSys("[[[");}
		if(insuranceplancoveragebenefitlimitvalue.hasSystem()) {

			i.addInsrncPlnCvgBnftLmtVlSys(String.valueOf(insuranceplancoveragebenefitlimitvalue.getSystem()));
		} else {
			i.addInsrncPlnCvgBnftLmtVlSys("NULL");
		}

		if(insuranceplancoveragebenefitlimiti == insuranceplancoveragebenefitlimitlist.size()-1) {i.addInsrncPlnCvgBnftLmtVlSys("]]]");}


		/******************** insuranceplancoveragebenefitlimitcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragebenefitlimitcode = insuranceplancoveragebenefitlimit.getCode();

		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Txt ********************************************************************************/
		if(insuranceplancoveragebenefitlimiti == 0) {i.addInsrncPlnCvgBnftLmtCdTxt("[[[");}
		if(insuranceplancoveragebenefitlimitcode.hasText()) {

			i.addInsrncPlnCvgBnftLmtCdTxt(String.valueOf(insuranceplancoveragebenefitlimitcode.getText()));
		} else {
			i.addInsrncPlnCvgBnftLmtCdTxt("NULL");
		}

		if(insuranceplancoveragebenefitlimiti == insuranceplancoveragebenefitlimitlist.size()-1) {i.addInsrncPlnCvgBnftLmtCdTxt("]]]");}


		/******************** insuranceplancoveragebenefitlimitcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplancoveragebenefitlimitcodecodinglist = insuranceplancoveragebenefitlimitcode.getCoding();
		for(int insuranceplancoveragebenefitlimitcodecodingi = 0; insuranceplancoveragebenefitlimitcodecodingi<insuranceplancoveragebenefitlimitcodecodinglist.size();insuranceplancoveragebenefitlimitcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplancoveragebenefitlimitcodecoding = insuranceplancoveragebenefitlimitcodecodinglist.get(insuranceplancoveragebenefitlimitcodecodingi);

		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Dsply ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecodingi == 0) {i.addInsrncPlnCvgBnftLmtCdCdgDsply("[[[[");}
		if(insuranceplancoveragebenefitlimitcodecoding.hasDisplay()) {

			i.addInsrncPlnCvgBnftLmtCdCdgDsply(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getDisplay()));
		} else {
			i.addInsrncPlnCvgBnftLmtCdCdgDsply("NULL");
		}

		if(insuranceplancoveragebenefitlimitcodecodingi == insuranceplancoveragebenefitlimitcodecodinglist.size()-1) {i.addInsrncPlnCvgBnftLmtCdCdgDsply("]]]]");}


		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecodingi == 0) {i.addInsrncPlnCvgBnftLmtCdCdgVrsn("[[[[");}
		if(insuranceplancoveragebenefitlimitcodecoding.hasVersion()) {

			i.addInsrncPlnCvgBnftLmtCdCdgVrsn(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getVersion()));
		} else {
			i.addInsrncPlnCvgBnftLmtCdCdgVrsn("NULL");
		}

		if(insuranceplancoveragebenefitlimitcodecodingi == insuranceplancoveragebenefitlimitcodecodinglist.size()-1) {i.addInsrncPlnCvgBnftLmtCdCdgVrsn("]]]]");}


		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Cd ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecodingi == 0) {i.addInsrncPlnCvgBnftLmtCdCdgCd("[[[[");}
		if(insuranceplancoveragebenefitlimitcodecoding.hasCode()) {

			i.addInsrncPlnCvgBnftLmtCdCdgCd(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getCode()));
		} else {
			i.addInsrncPlnCvgBnftLmtCdCdgCd("NULL");
		}

		if(insuranceplancoveragebenefitlimitcodecodingi == insuranceplancoveragebenefitlimitcodecodinglist.size()-1) {i.addInsrncPlnCvgBnftLmtCdCdgCd("]]]]");}


		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecodingi == 0) {i.addInsrncPlnCvgBnftLmtCdCdgUsrSltd("[[[[");}
		if(insuranceplancoveragebenefitlimitcodecoding.hasUserSelected()) {

			i.addInsrncPlnCvgBnftLmtCdCdgUsrSltd(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getUserSelected()));
		} else {
			i.addInsrncPlnCvgBnftLmtCdCdgUsrSltd("NULL");
		}

		if(insuranceplancoveragebenefitlimitcodecodingi == insuranceplancoveragebenefitlimitcodecodinglist.size()-1) {i.addInsrncPlnCvgBnftLmtCdCdgUsrSltd("]]]]");}


		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Sys ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecodingi == 0) {i.addInsrncPlnCvgBnftLmtCdCdgSys("[[[[");}
		if(insuranceplancoveragebenefitlimitcodecoding.hasSystem()) {

			i.addInsrncPlnCvgBnftLmtCdCdgSys(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getSystem()));
		} else {
			i.addInsrncPlnCvgBnftLmtCdCdgSys("NULL");
		}

		if(insuranceplancoveragebenefitlimitcodecodingi == insuranceplancoveragebenefitlimitcodecodinglist.size()-1) {i.addInsrncPlnCvgBnftLmtCdCdgSys("]]]]");}


		 };
		 };
		 };
		 };
		/******************** InsrncPln_Alias ********************************************************************************/
		if(insuranceplan.hasAlias()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplan.getAlias().size(); incr++) {
				array = array + insuranceplan.getAlias().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnAlias(array);

		} else {
			i.addInsrncPlnAlias("NULL");
		}


		/******************** InsrncPln_CvgArea ********************************************************************************/
		if(insuranceplan.hasCoverageArea()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplan.getCoverageArea().size(); incr++) {
				array = array + insuranceplan.getCoverageArea().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnCvgArea(array);

		} else {
			i.addInsrncPlnCvgArea("NULL");
		}


		/******************** InsrncPln_AdministeredBy ********************************************************************************/
		if(insuranceplan.hasAdministeredBy()) {

			if(insuranceplan.getAdministeredBy().getReference() != null) {
			i.addInsrncPlnAdministeredBy(insuranceplan.getAdministeredBy().getReference());
			}
		} else {
			i.addInsrncPlnAdministeredBy("NULL");
		}


		/******************** InsrncPln_OwnedBy ********************************************************************************/
		if(insuranceplan.hasOwnedBy()) {

			if(insuranceplan.getOwnedBy().getReference() != null) {
			i.addInsrncPlnOwnedBy(insuranceplan.getOwnedBy().getReference());
			}
		} else {
			i.addInsrncPlnOwnedBy("NULL");
		}


		/******************** insuranceplanplan ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent> insuranceplanplanlist = insuranceplan.getPlan();
		for(int insuranceplanplani = 0; insuranceplanplani<insuranceplanplanlist.size();insuranceplanplani++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent  insuranceplanplan = insuranceplanplanlist.get(insuranceplanplani);

		/******************** insuranceplanplantype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplantype = insuranceplanplan.getType();

		/******************** InsrncPln_Pln_Typ_Txt ********************************************************************************/
		if(insuranceplanplani == 0) {i.addInsrncPlnPlnTypTxt("[");}
		if(insuranceplanplantype.hasText()) {

			i.addInsrncPlnPlnTypTxt(String.valueOf(insuranceplanplantype.getText()));
		} else {
			i.addInsrncPlnPlnTypTxt("NULL");
		}

		if(insuranceplanplani == insuranceplanplanlist.size()-1) {i.addInsrncPlnPlnTypTxt("]");}


		/******************** insuranceplanplantypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplantypecodinglist = insuranceplanplantype.getCoding();
		for(int insuranceplanplantypecodingi = 0; insuranceplanplantypecodingi<insuranceplanplantypecodinglist.size();insuranceplanplantypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplantypecoding = insuranceplanplantypecodinglist.get(insuranceplanplantypecodingi);

		/******************** InsrncPln_Pln_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplantypecodingi == 0) {i.addInsrncPlnPlnTypCdgDsply("[[");}
		if(insuranceplanplantypecoding.hasDisplay()) {

			i.addInsrncPlnPlnTypCdgDsply(String.valueOf(insuranceplanplantypecoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnTypCdgDsply("NULL");
		}

		if(insuranceplanplantypecodingi == insuranceplanplantypecodinglist.size()-1) {i.addInsrncPlnPlnTypCdgDsply("]]");}


		/******************** InsrncPln_Pln_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplantypecodingi == 0) {i.addInsrncPlnPlnTypCdgVrsn("[[");}
		if(insuranceplanplantypecoding.hasVersion()) {

			i.addInsrncPlnPlnTypCdgVrsn(String.valueOf(insuranceplanplantypecoding.getVersion()));
		} else {
			i.addInsrncPlnPlnTypCdgVrsn("NULL");
		}

		if(insuranceplanplantypecodingi == insuranceplanplantypecodinglist.size()-1) {i.addInsrncPlnPlnTypCdgVrsn("]]");}


		/******************** InsrncPln_Pln_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplantypecodingi == 0) {i.addInsrncPlnPlnTypCdgCd("[[");}
		if(insuranceplanplantypecoding.hasCode()) {

			i.addInsrncPlnPlnTypCdgCd(String.valueOf(insuranceplanplantypecoding.getCode()));
		} else {
			i.addInsrncPlnPlnTypCdgCd("NULL");
		}

		if(insuranceplanplantypecodingi == insuranceplanplantypecodinglist.size()-1) {i.addInsrncPlnPlnTypCdgCd("]]");}


		/******************** InsrncPln_Pln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplantypecodingi == 0) {i.addInsrncPlnPlnTypCdgUsrSltd("[[");}
		if(insuranceplanplantypecoding.hasUserSelected()) {

			i.addInsrncPlnPlnTypCdgUsrSltd(String.valueOf(insuranceplanplantypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnTypCdgUsrSltd("NULL");
		}

		if(insuranceplanplantypecodingi == insuranceplanplantypecodinglist.size()-1) {i.addInsrncPlnPlnTypCdgUsrSltd("]]");}


		/******************** InsrncPln_Pln_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplantypecodingi == 0) {i.addInsrncPlnPlnTypCdgSys("[[");}
		if(insuranceplanplantypecoding.hasSystem()) {

			i.addInsrncPlnPlnTypCdgSys(String.valueOf(insuranceplanplantypecoding.getSystem()));
		} else {
			i.addInsrncPlnPlnTypCdgSys("NULL");
		}

		if(insuranceplanplantypecodingi == insuranceplanplantypecodinglist.size()-1) {i.addInsrncPlnPlnTypCdgSys("]]");}


		 };
		/******************** insuranceplanplanidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> insuranceplanplanidentifierlist = insuranceplanplan.getIdentifier();
		for(int insuranceplanplanidentifieri = 0; insuranceplanplanidentifieri<insuranceplanplanidentifierlist.size();insuranceplanplanidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  insuranceplanplanidentifier = insuranceplanplanidentifierlist.get(insuranceplanplanidentifieri);

		/******************** InsrncPln_Pln_Id_Vl ********************************************************************************/
		if(insuranceplanplanidentifieri == 0) {i.addInsrncPlnPlnIdVl("[[");}
		if(insuranceplanplanidentifier.hasValue()) {

			i.addInsrncPlnPlnIdVl(String.valueOf(insuranceplanplanidentifier.getValue()));
		} else {
			i.addInsrncPlnPlnIdVl("NULL");
		}

		if(insuranceplanplanidentifieri == insuranceplanplanidentifierlist.size()-1) {i.addInsrncPlnPlnIdVl("]]");}


		/******************** insuranceplanplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanidentifiertype = insuranceplanplanidentifier.getType();

		/******************** InsrncPln_Pln_Id_Typ_Txt ********************************************************************************/
		if(insuranceplanplanidentifieri == 0) {i.addInsrncPlnPlnIdTypTxt("[[");}
		if(insuranceplanplanidentifiertype.hasText()) {

			i.addInsrncPlnPlnIdTypTxt(String.valueOf(insuranceplanplanidentifiertype.getText()));
		} else {
			i.addInsrncPlnPlnIdTypTxt("NULL");
		}

		if(insuranceplanplanidentifieri == insuranceplanplanidentifierlist.size()-1) {i.addInsrncPlnPlnIdTypTxt("]]");}


		/******************** insuranceplanplanidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplanidentifiertypecodinglist = insuranceplanplanidentifiertype.getCoding();
		for(int insuranceplanplanidentifiertypecodingi = 0; insuranceplanplanidentifiertypecodingi<insuranceplanplanidentifiertypecodinglist.size();insuranceplanplanidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplanidentifiertypecoding = insuranceplanplanidentifiertypecodinglist.get(insuranceplanplanidentifiertypecodingi);

		/******************** InsrncPln_Pln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanidentifiertypecodingi == 0) {i.addInsrncPlnPlnIdTypCdgDsply("[[[");}
		if(insuranceplanplanidentifiertypecoding.hasDisplay()) {

			i.addInsrncPlnPlnIdTypCdgDsply(String.valueOf(insuranceplanplanidentifiertypecoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnIdTypCdgDsply("NULL");
		}

		if(insuranceplanplanidentifiertypecodingi == insuranceplanplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnPlnIdTypCdgDsply("]]]");}


		/******************** InsrncPln_Pln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanidentifiertypecodingi == 0) {i.addInsrncPlnPlnIdTypCdgVrsn("[[[");}
		if(insuranceplanplanidentifiertypecoding.hasVersion()) {

			i.addInsrncPlnPlnIdTypCdgVrsn(String.valueOf(insuranceplanplanidentifiertypecoding.getVersion()));
		} else {
			i.addInsrncPlnPlnIdTypCdgVrsn("NULL");
		}

		if(insuranceplanplanidentifiertypecodingi == insuranceplanplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnPlnIdTypCdgVrsn("]]]");}


		/******************** InsrncPln_Pln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanidentifiertypecodingi == 0) {i.addInsrncPlnPlnIdTypCdgCd("[[[");}
		if(insuranceplanplanidentifiertypecoding.hasCode()) {

			i.addInsrncPlnPlnIdTypCdgCd(String.valueOf(insuranceplanplanidentifiertypecoding.getCode()));
		} else {
			i.addInsrncPlnPlnIdTypCdgCd("NULL");
		}

		if(insuranceplanplanidentifiertypecodingi == insuranceplanplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnPlnIdTypCdgCd("]]]");}


		/******************** InsrncPln_Pln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanidentifiertypecodingi == 0) {i.addInsrncPlnPlnIdTypCdgUsrSltd("[[[");}
		if(insuranceplanplanidentifiertypecoding.hasUserSelected()) {

			i.addInsrncPlnPlnIdTypCdgUsrSltd(String.valueOf(insuranceplanplanidentifiertypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnIdTypCdgUsrSltd("NULL");
		}

		if(insuranceplanplanidentifiertypecodingi == insuranceplanplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnPlnIdTypCdgUsrSltd("]]]");}


		/******************** InsrncPln_Pln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanidentifiertypecodingi == 0) {i.addInsrncPlnPlnIdTypCdgSys("[[[");}
		if(insuranceplanplanidentifiertypecoding.hasSystem()) {

			i.addInsrncPlnPlnIdTypCdgSys(String.valueOf(insuranceplanplanidentifiertypecoding.getSystem()));
		} else {
			i.addInsrncPlnPlnIdTypCdgSys("NULL");
		}

		if(insuranceplanplanidentifiertypecodingi == insuranceplanplanidentifiertypecodinglist.size()-1) {i.addInsrncPlnPlnIdTypCdgSys("]]]");}


		 };
		/******************** insuranceplanplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanplanidentifierperiod = insuranceplanplanidentifier.getPeriod();

		/******************** InsrncPln_Pln_Id_Prd_Strt ********************************************************************************/
		if(insuranceplanplanidentifieri == 0) {i.addInsrncPlnPlnIdPrdStrt("[[");}
		if(insuranceplanplanidentifierperiod.hasStart()) {

			i.addInsrncPlnPlnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplanplanidentifierperiod.getStart())+"\"");
		} else {
			i.addInsrncPlnPlnIdPrdStrt("NULL");
		}

		if(insuranceplanplanidentifieri == insuranceplanplanidentifierlist.size()-1) {i.addInsrncPlnPlnIdPrdStrt("]]");}


		/******************** InsrncPln_Pln_Id_Prd_End ********************************************************************************/
		if(insuranceplanplanidentifieri == 0) {i.addInsrncPlnPlnIdPrdEnd("[[");}
		if(insuranceplanplanidentifierperiod.hasEnd()) {

			i.addInsrncPlnPlnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(insuranceplanplanidentifierperiod.getEnd())+"\"");
		} else {
			i.addInsrncPlnPlnIdPrdEnd("NULL");
		}

		if(insuranceplanplanidentifieri == insuranceplanplanidentifierlist.size()-1) {i.addInsrncPlnPlnIdPrdEnd("]]");}


		/******************** insuranceplanplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse insuranceplanplanidentifieruse = insuranceplanplanidentifier.getUse();
		if(insuranceplanplanidentifieruse!=null) {
		if(insuranceplanplanidentifieri == 0) {

		i.addInsrncPlnPlnIdUse("[[");		}
			i.addInsrncPlnPlnIdUse(insuranceplanplanidentifieruse.toCode());
		if(insuranceplanplanidentifieri == insuranceplanplanidentifierlist.size()-1) {

		i.addInsrncPlnPlnIdUse("]]");		}

		} else {
			i.addInsrncPlnPlnIdUse("NULL");
		}

		/******************** InsrncPln_Pln_Id_Assigner ********************************************************************************/
		if(insuranceplanplanidentifieri == 0) {i.addInsrncPlnPlnIdAssigner("[[");}
		if(insuranceplanplanidentifier.hasAssigner()) {

			if(insuranceplanplanidentifier.getAssigner().getReference() != null) {
			i.addInsrncPlnPlnIdAssigner(insuranceplanplanidentifier.getAssigner().getReference());
			}
		} else {
			i.addInsrncPlnPlnIdAssigner("NULL");
		}

		if(insuranceplanplanidentifieri == insuranceplanplanidentifierlist.size()-1) {i.addInsrncPlnPlnIdAssigner("]]");}


		/******************** InsrncPln_Pln_Id_Sys ********************************************************************************/
		if(insuranceplanplanidentifieri == 0) {i.addInsrncPlnPlnIdSys("[[");}
		if(insuranceplanplanidentifier.hasSystem()) {

			i.addInsrncPlnPlnIdSys(String.valueOf(insuranceplanplanidentifier.getSystem()));
		} else {
			i.addInsrncPlnPlnIdSys("NULL");
		}

		if(insuranceplanplanidentifieri == insuranceplanplanidentifierlist.size()-1) {i.addInsrncPlnPlnIdSys("]]");}


		 };
		/******************** InsrncPln_Pln_Network ********************************************************************************/
		if(insuranceplanplan.hasNetwork()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplanplan.getNetwork().size(); incr++) {
				array = array + insuranceplanplan.getNetwork().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnPlnNetwork(array);

		} else {
			i.addInsrncPlnPlnNetwork("NULL");
		}


		/******************** insuranceplanplangeneralcost ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent> insuranceplanplangeneralcostlist = insuranceplanplan.getGeneralCost();
		for(int insuranceplanplangeneralcosti = 0; insuranceplanplangeneralcosti<insuranceplanplangeneralcostlist.size();insuranceplanplangeneralcosti++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent  insuranceplanplangeneralcost = insuranceplanplangeneralcostlist.get(insuranceplanplangeneralcosti);

		/******************** insuranceplanplangeneralcosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplangeneralcosttype = insuranceplanplangeneralcost.getType();

		/******************** InsrncPln_Pln_GeneralCst_Typ_Txt ********************************************************************************/
		if(insuranceplanplangeneralcosti == 0) {i.addInsrncPlnPlnGeneralCstTypTxt("[[");}
		if(insuranceplanplangeneralcosttype.hasText()) {

			i.addInsrncPlnPlnGeneralCstTypTxt(String.valueOf(insuranceplanplangeneralcosttype.getText()));
		} else {
			i.addInsrncPlnPlnGeneralCstTypTxt("NULL");
		}

		if(insuranceplanplangeneralcosti == insuranceplanplangeneralcostlist.size()-1) {i.addInsrncPlnPlnGeneralCstTypTxt("]]");}


		/******************** insuranceplanplangeneralcosttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplangeneralcosttypecodinglist = insuranceplanplangeneralcosttype.getCoding();
		for(int insuranceplanplangeneralcosttypecodingi = 0; insuranceplanplangeneralcosttypecodingi<insuranceplanplangeneralcosttypecodinglist.size();insuranceplanplangeneralcosttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplangeneralcosttypecoding = insuranceplanplangeneralcosttypecodinglist.get(insuranceplanplangeneralcosttypecodingi);

		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplangeneralcosttypecodingi == 0) {i.addInsrncPlnPlnGeneralCstTypCdgDsply("[[[");}
		if(insuranceplanplangeneralcosttypecoding.hasDisplay()) {

			i.addInsrncPlnPlnGeneralCstTypCdgDsply(String.valueOf(insuranceplanplangeneralcosttypecoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnGeneralCstTypCdgDsply("NULL");
		}

		if(insuranceplanplangeneralcosttypecodingi == insuranceplanplangeneralcosttypecodinglist.size()-1) {i.addInsrncPlnPlnGeneralCstTypCdgDsply("]]]");}


		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplangeneralcosttypecodingi == 0) {i.addInsrncPlnPlnGeneralCstTypCdgVrsn("[[[");}
		if(insuranceplanplangeneralcosttypecoding.hasVersion()) {

			i.addInsrncPlnPlnGeneralCstTypCdgVrsn(String.valueOf(insuranceplanplangeneralcosttypecoding.getVersion()));
		} else {
			i.addInsrncPlnPlnGeneralCstTypCdgVrsn("NULL");
		}

		if(insuranceplanplangeneralcosttypecodingi == insuranceplanplangeneralcosttypecodinglist.size()-1) {i.addInsrncPlnPlnGeneralCstTypCdgVrsn("]]]");}


		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplangeneralcosttypecodingi == 0) {i.addInsrncPlnPlnGeneralCstTypCdgCd("[[[");}
		if(insuranceplanplangeneralcosttypecoding.hasCode()) {

			i.addInsrncPlnPlnGeneralCstTypCdgCd(String.valueOf(insuranceplanplangeneralcosttypecoding.getCode()));
		} else {
			i.addInsrncPlnPlnGeneralCstTypCdgCd("NULL");
		}

		if(insuranceplanplangeneralcosttypecodingi == insuranceplanplangeneralcosttypecodinglist.size()-1) {i.addInsrncPlnPlnGeneralCstTypCdgCd("]]]");}


		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplangeneralcosttypecodingi == 0) {i.addInsrncPlnPlnGeneralCstTypCdgUsrSltd("[[[");}
		if(insuranceplanplangeneralcosttypecoding.hasUserSelected()) {

			i.addInsrncPlnPlnGeneralCstTypCdgUsrSltd(String.valueOf(insuranceplanplangeneralcosttypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnGeneralCstTypCdgUsrSltd("NULL");
		}

		if(insuranceplanplangeneralcosttypecodingi == insuranceplanplangeneralcosttypecodinglist.size()-1) {i.addInsrncPlnPlnGeneralCstTypCdgUsrSltd("]]]");}


		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplangeneralcosttypecodingi == 0) {i.addInsrncPlnPlnGeneralCstTypCdgSys("[[[");}
		if(insuranceplanplangeneralcosttypecoding.hasSystem()) {

			i.addInsrncPlnPlnGeneralCstTypCdgSys(String.valueOf(insuranceplanplangeneralcosttypecoding.getSystem()));
		} else {
			i.addInsrncPlnPlnGeneralCstTypCdgSys("NULL");
		}

		if(insuranceplanplangeneralcosttypecodingi == insuranceplanplangeneralcosttypecodinglist.size()-1) {i.addInsrncPlnPlnGeneralCstTypCdgSys("]]]");}


		 };
		/******************** InsrncPln_Pln_GeneralCst_Comment ********************************************************************************/
		if(insuranceplanplangeneralcosti == 0) {i.addInsrncPlnPlnGeneralCstComment("[[");}
		if(insuranceplanplangeneralcost.hasComment()) {

			i.addInsrncPlnPlnGeneralCstComment(String.valueOf(insuranceplanplangeneralcost.getComment()));
		} else {
			i.addInsrncPlnPlnGeneralCstComment("NULL");
		}

		if(insuranceplanplangeneralcosti == insuranceplanplangeneralcostlist.size()-1) {i.addInsrncPlnPlnGeneralCstComment("]]");}


		/******************** InsrncPln_Pln_GeneralCst_GrpSz ********************************************************************************/
		if(insuranceplanplangeneralcosti == 0) {i.addInsrncPlnPlnGeneralCstGrpSz("[[");}
		if(insuranceplanplangeneralcost.hasGroupSize()) {

			i.addInsrncPlnPlnGeneralCstGrpSz(String.valueOf(insuranceplanplangeneralcost.getGroupSize()));
		} else {
			i.addInsrncPlnPlnGeneralCstGrpSz("NULL");
		}

		if(insuranceplanplangeneralcosti == insuranceplanplangeneralcostlist.size()-1) {i.addInsrncPlnPlnGeneralCstGrpSz("]]");}


		/******************** insuranceplanplangeneralcostcost ********************************************************************************/
		org.hl7.fhir.r4.model.Money insuranceplanplangeneralcostcost = insuranceplanplangeneralcost.getCost();

		/******************** InsrncPln_Pln_GeneralCst_Cst_Vl ********************************************************************************/
		if(insuranceplanplangeneralcosti == 0) {i.addInsrncPlnPlnGeneralCstCstVl("[[");}
		if(insuranceplanplangeneralcostcost.hasValue()) {

			i.addInsrncPlnPlnGeneralCstCstVl(String.valueOf(insuranceplanplangeneralcostcost.getValue()));
		} else {
			i.addInsrncPlnPlnGeneralCstCstVl("NULL");
		}

		if(insuranceplanplangeneralcosti == insuranceplanplangeneralcostlist.size()-1) {i.addInsrncPlnPlnGeneralCstCstVl("]]");}


		/******************** InsrncPln_Pln_GeneralCst_Cst_Crncy ********************************************************************************/
		if(insuranceplanplangeneralcosti == 0) {i.addInsrncPlnPlnGeneralCstCstCrncy("[[");}
		if(insuranceplanplangeneralcostcost.hasCurrency()) {

			i.addInsrncPlnPlnGeneralCstCstCrncy(String.valueOf(insuranceplanplangeneralcostcost.getCurrency()));
		} else {
			i.addInsrncPlnPlnGeneralCstCstCrncy("NULL");
		}

		if(insuranceplanplangeneralcosti == insuranceplanplangeneralcostlist.size()-1) {i.addInsrncPlnPlnGeneralCstCstCrncy("]]");}


		 };
		/******************** insuranceplanplanspecificcost ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent> insuranceplanplanspecificcostlist = insuranceplanplan.getSpecificCost();
		for(int insuranceplanplanspecificcosti = 0; insuranceplanplanspecificcosti<insuranceplanplanspecificcostlist.size();insuranceplanplanspecificcosti++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent  insuranceplanplanspecificcost = insuranceplanplanspecificcostlist.get(insuranceplanplanspecificcosti);

		/******************** insuranceplanplanspecificcostcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostcategory = insuranceplanplanspecificcost.getCategory();

		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Txt ********************************************************************************/
		if(insuranceplanplanspecificcosti == 0) {i.addInsrncPlnPlnSpecificCstCtgryTxt("[[");}
		if(insuranceplanplanspecificcostcategory.hasText()) {

			i.addInsrncPlnPlnSpecificCstCtgryTxt(String.valueOf(insuranceplanplanspecificcostcategory.getText()));
		} else {
			i.addInsrncPlnPlnSpecificCstCtgryTxt("NULL");
		}

		if(insuranceplanplanspecificcosti == insuranceplanplanspecificcostlist.size()-1) {i.addInsrncPlnPlnSpecificCstCtgryTxt("]]");}


		/******************** insuranceplanplanspecificcostcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplanspecificcostcategorycodinglist = insuranceplanplanspecificcostcategory.getCoding();
		for(int insuranceplanplanspecificcostcategorycodingi = 0; insuranceplanplanspecificcostcategorycodingi<insuranceplanplanspecificcostcategorycodinglist.size();insuranceplanplanspecificcostcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplanspecificcostcategorycoding = insuranceplanplanspecificcostcategorycodinglist.get(insuranceplanplanspecificcostcategorycodingi);

		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycodingi == 0) {i.addInsrncPlnPlnSpecificCstCtgryCdgDsply("[[[");}
		if(insuranceplanplanspecificcostcategorycoding.hasDisplay()) {

			i.addInsrncPlnPlnSpecificCstCtgryCdgDsply(String.valueOf(insuranceplanplanspecificcostcategorycoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnSpecificCstCtgryCdgDsply("NULL");
		}

		if(insuranceplanplanspecificcostcategorycodingi == insuranceplanplanspecificcostcategorycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstCtgryCdgDsply("]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycodingi == 0) {i.addInsrncPlnPlnSpecificCstCtgryCdgVrsn("[[[");}
		if(insuranceplanplanspecificcostcategorycoding.hasVersion()) {

			i.addInsrncPlnPlnSpecificCstCtgryCdgVrsn(String.valueOf(insuranceplanplanspecificcostcategorycoding.getVersion()));
		} else {
			i.addInsrncPlnPlnSpecificCstCtgryCdgVrsn("NULL");
		}

		if(insuranceplanplanspecificcostcategorycodingi == insuranceplanplanspecificcostcategorycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstCtgryCdgVrsn("]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycodingi == 0) {i.addInsrncPlnPlnSpecificCstCtgryCdgCd("[[[");}
		if(insuranceplanplanspecificcostcategorycoding.hasCode()) {

			i.addInsrncPlnPlnSpecificCstCtgryCdgCd(String.valueOf(insuranceplanplanspecificcostcategorycoding.getCode()));
		} else {
			i.addInsrncPlnPlnSpecificCstCtgryCdgCd("NULL");
		}

		if(insuranceplanplanspecificcostcategorycodingi == insuranceplanplanspecificcostcategorycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstCtgryCdgCd("]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycodingi == 0) {i.addInsrncPlnPlnSpecificCstCtgryCdgUsrSltd("[[[");}
		if(insuranceplanplanspecificcostcategorycoding.hasUserSelected()) {

			i.addInsrncPlnPlnSpecificCstCtgryCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostcategorycoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnSpecificCstCtgryCdgUsrSltd("NULL");
		}

		if(insuranceplanplanspecificcostcategorycodingi == insuranceplanplanspecificcostcategorycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstCtgryCdgUsrSltd("]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycodingi == 0) {i.addInsrncPlnPlnSpecificCstCtgryCdgSys("[[[");}
		if(insuranceplanplanspecificcostcategorycoding.hasSystem()) {

			i.addInsrncPlnPlnSpecificCstCtgryCdgSys(String.valueOf(insuranceplanplanspecificcostcategorycoding.getSystem()));
		} else {
			i.addInsrncPlnPlnSpecificCstCtgryCdgSys("NULL");
		}

		if(insuranceplanplanspecificcostcategorycodingi == insuranceplanplanspecificcostcategorycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstCtgryCdgSys("]]]");}


		 };
		/******************** insuranceplanplanspecificcostbenefit ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent> insuranceplanplanspecificcostbenefitlist = insuranceplanplanspecificcost.getBenefit();
		for(int insuranceplanplanspecificcostbenefiti = 0; insuranceplanplanspecificcostbenefiti<insuranceplanplanspecificcostbenefitlist.size();insuranceplanplanspecificcostbenefiti++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent  insuranceplanplanspecificcostbenefit = insuranceplanplanspecificcostbenefitlist.get(insuranceplanplanspecificcostbenefiti);

		/******************** insuranceplanplanspecificcostbenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefittype = insuranceplanplanspecificcostbenefit.getType();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefiti == 0) {i.addInsrncPlnPlnSpecificCstBnftTypTxt("[[[");}
		if(insuranceplanplanspecificcostbenefittype.hasText()) {

			i.addInsrncPlnPlnSpecificCstBnftTypTxt(String.valueOf(insuranceplanplanspecificcostbenefittype.getText()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftTypTxt("NULL");
		}

		if(insuranceplanplanspecificcostbenefiti == insuranceplanplanspecificcostbenefitlist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftTypTxt("]]]");}


		/******************** insuranceplanplanspecificcostbenefittypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplanspecificcostbenefittypecodinglist = insuranceplanplanspecificcostbenefittype.getCoding();
		for(int insuranceplanplanspecificcostbenefittypecodingi = 0; insuranceplanplanspecificcostbenefittypecodingi<insuranceplanplanspecificcostbenefittypecodinglist.size();insuranceplanplanspecificcostbenefittypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplanspecificcostbenefittypecoding = insuranceplanplanspecificcostbenefittypecodinglist.get(insuranceplanplanspecificcostbenefittypecodingi);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftTypCdgDsply("[[[[");}
		if(insuranceplanplanspecificcostbenefittypecoding.hasDisplay()) {

			i.addInsrncPlnPlnSpecificCstBnftTypCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftTypCdgDsply("NULL");
		}

		if(insuranceplanplanspecificcostbenefittypecodingi == insuranceplanplanspecificcostbenefittypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftTypCdgDsply("]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftTypCdgVrsn("[[[[");}
		if(insuranceplanplanspecificcostbenefittypecoding.hasVersion()) {

			i.addInsrncPlnPlnSpecificCstBnftTypCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getVersion()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftTypCdgVrsn("NULL");
		}

		if(insuranceplanplanspecificcostbenefittypecodingi == insuranceplanplanspecificcostbenefittypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftTypCdgVrsn("]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftTypCdgCd("[[[[");}
		if(insuranceplanplanspecificcostbenefittypecoding.hasCode()) {

			i.addInsrncPlnPlnSpecificCstBnftTypCdgCd(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getCode()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftTypCdgCd("NULL");
		}

		if(insuranceplanplanspecificcostbenefittypecodingi == insuranceplanplanspecificcostbenefittypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftTypCdgCd("]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd("[[[[");}
		if(insuranceplanplanspecificcostbenefittypecoding.hasUserSelected()) {

			i.addInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd("NULL");
		}

		if(insuranceplanplanspecificcostbenefittypecodingi == insuranceplanplanspecificcostbenefittypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd("]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftTypCdgSys("[[[[");}
		if(insuranceplanplanspecificcostbenefittypecoding.hasSystem()) {

			i.addInsrncPlnPlnSpecificCstBnftTypCdgSys(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getSystem()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftTypCdgSys("NULL");
		}

		if(insuranceplanplanspecificcostbenefittypecodingi == insuranceplanplanspecificcostbenefittypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftTypCdgSys("]]]]");}


		 };
		/******************** insuranceplanplanspecificcostbenefitcost ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent> insuranceplanplanspecificcostbenefitcostlist = insuranceplanplanspecificcostbenefit.getCost();
		for(int insuranceplanplanspecificcostbenefitcosti = 0; insuranceplanplanspecificcostbenefitcosti<insuranceplanplanspecificcostbenefitcostlist.size();insuranceplanplanspecificcostbenefitcosti++ ) {
		org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent  insuranceplanplanspecificcostbenefitcost = insuranceplanplanspecificcostbenefitcostlist.get(insuranceplanplanspecificcostbenefitcosti);

		/******************** insuranceplanplanspecificcostbenefitcostvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity insuranceplanplanspecificcostbenefitcostvalue = insuranceplanplanspecificcostbenefitcost.getValue();

		/******************** insuranceplanplanspecificcostbenefitcostvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator insuranceplanplanspecificcostbenefitcostvaluecomparator = insuranceplanplanspecificcostbenefitcostvalue.getComparator();
		if(insuranceplanplanspecificcostbenefitcostvaluecomparator!=null) {
		if(insuranceplanplanspecificcostbenefitcosti == 0) {

		i.addInsrncPlnPlnSpecificCstBnftCstVlCmprtr("[[[[");		}
			i.addInsrncPlnPlnSpecificCstBnftCstVlCmprtr(insuranceplanplanspecificcostbenefitcostvaluecomparator.toCode());
		if(insuranceplanplanspecificcostbenefitcosti == insuranceplanplanspecificcostbenefitcostlist.size()-1) {

		i.addInsrncPlnPlnSpecificCstBnftCstVlCmprtr("]]]]");		}

		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstVlCmprtr("NULL");
		}

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosti == 0) {i.addInsrncPlnPlnSpecificCstBnftCstVlCd("[[[[");}
		if(insuranceplanplanspecificcostbenefitcostvalue.hasCode()) {

			i.addInsrncPlnPlnSpecificCstBnftCstVlCd(String.valueOf(insuranceplanplanspecificcostbenefitcostvalue.getCode()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstVlCd("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosti == insuranceplanplanspecificcostbenefitcostlist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstVlCd("]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Unt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosti == 0) {i.addInsrncPlnPlnSpecificCstBnftCstVlUnt("[[[[");}
		if(insuranceplanplanspecificcostbenefitcostvalue.hasUnit()) {

			i.addInsrncPlnPlnSpecificCstBnftCstVlUnt(String.valueOf(insuranceplanplanspecificcostbenefitcostvalue.getUnit()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstVlUnt("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosti == insuranceplanplanspecificcostbenefitcostlist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstVlUnt("]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosti == 0) {i.addInsrncPlnPlnSpecificCstBnftCstVlSys("[[[[");}
		if(insuranceplanplanspecificcostbenefitcostvalue.hasSystem()) {

			i.addInsrncPlnPlnSpecificCstBnftCstVlSys(String.valueOf(insuranceplanplanspecificcostbenefitcostvalue.getSystem()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstVlSys("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosti == insuranceplanplanspecificcostbenefitcostlist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstVlSys("]]]]");}


		/******************** insuranceplanplanspecificcostbenefitcosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcosttype = insuranceplanplanspecificcostbenefitcost.getType();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosti == 0) {i.addInsrncPlnPlnSpecificCstBnftCstTypTxt("[[[[");}
		if(insuranceplanplanspecificcostbenefitcosttype.hasText()) {

			i.addInsrncPlnPlnSpecificCstBnftCstTypTxt(String.valueOf(insuranceplanplanspecificcostbenefitcosttype.getText()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstTypTxt("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosti == insuranceplanplanspecificcostbenefitcostlist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstTypTxt("]]]]");}


		/******************** insuranceplanplanspecificcostbenefitcosttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplanspecificcostbenefitcosttypecodinglist = insuranceplanplanspecificcostbenefitcosttype.getCoding();
		for(int insuranceplanplanspecificcostbenefitcosttypecodingi = 0; insuranceplanplanspecificcostbenefitcosttypecodingi<insuranceplanplanspecificcostbenefitcosttypecodinglist.size();insuranceplanplanspecificcostbenefitcosttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplanspecificcostbenefitcosttypecoding = insuranceplanplanspecificcostbenefitcosttypecodinglist.get(insuranceplanplanspecificcostbenefitcosttypecodingi);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgDsply("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasDisplay()) {

			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgDsply("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosttypecodingi == insuranceplanplanspecificcostbenefitcosttypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgDsply("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasVersion()) {

			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getVersion()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosttypecodingi == insuranceplanplanspecificcostbenefitcosttypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgCd("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasCode()) {

			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgCd(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getCode()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgCd("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosttypecodingi == insuranceplanplanspecificcostbenefitcosttypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgCd("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasUserSelected()) {

			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosttypecodingi == insuranceplanplanspecificcostbenefitcosttypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgSys("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasSystem()) {

			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgSys(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getSystem()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstTypCdgSys("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcosttypecodingi == insuranceplanplanspecificcostbenefitcosttypecodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstTypCdgSys("]]]]]");}


		 };
		/******************** insuranceplanplanspecificcostbenefitcostqualifiers ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> insuranceplanplanspecificcostbenefitcostqualifierslist = insuranceplanplanspecificcostbenefitcost.getQualifiers();
		for(int insuranceplanplanspecificcostbenefitcostqualifiersi = 0; insuranceplanplanspecificcostbenefitcostqualifiersi<insuranceplanplanspecificcostbenefitcostqualifierslist.size();insuranceplanplanspecificcostbenefitcostqualifiersi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  insuranceplanplanspecificcostbenefitcostqualifiers = insuranceplanplanspecificcostbenefitcostqualifierslist.get(insuranceplanplanspecificcostbenefitcostqualifiersi);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifiersi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersTxt("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostqualifiers.hasText()) {

			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersTxt(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifiers.getText()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersTxt("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostqualifiersi == insuranceplanplanspecificcostbenefitcostqualifierslist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersTxt("]]]]]");}


		/******************** insuranceplanplanspecificcostbenefitcostqualifierscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplanspecificcostbenefitcostqualifierscodinglist = insuranceplanplanspecificcostbenefitcostqualifiers.getCoding();
		for(int insuranceplanplanspecificcostbenefitcostqualifierscodingi = 0; insuranceplanplanspecificcostbenefitcostqualifierscodingi<insuranceplanplanspecificcostbenefitcostqualifierscodinglist.size();insuranceplanplanspecificcostbenefitcostqualifierscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplanspecificcostbenefitcostqualifierscoding = insuranceplanplanspecificcostbenefitcostqualifierscodinglist.get(insuranceplanplanspecificcostbenefitcostqualifierscodingi);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply("[[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasDisplay()) {

			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == insuranceplanplanspecificcostbenefitcostqualifierscodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply("]]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn("[[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasVersion()) {

			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getVersion()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == insuranceplanplanspecificcostbenefitcostqualifierscodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn("]]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd("[[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasCode()) {

			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getCode()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == insuranceplanplanspecificcostbenefitcostqualifierscodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd("]]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd("[[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasUserSelected()) {

			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == insuranceplanplanspecificcostbenefitcostqualifierscodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd("]]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys("[[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasSystem()) {

			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getSystem()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostqualifierscodingi == insuranceplanplanspecificcostbenefitcostqualifierscodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys("]]]]]]");}


		 };
		 };
		/******************** insuranceplanplanspecificcostbenefitcostapplicability ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcostapplicability = insuranceplanplanspecificcostbenefitcost.getApplicability();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicability.hasText()) {

			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicability.getText()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt("NULL");
		}


		/******************** insuranceplanplanspecificcostbenefitcostapplicabilitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist = insuranceplanplanspecificcostbenefitcostapplicability.getCoding();
		for(int insuranceplanplanspecificcostbenefitcostapplicabilitycodingi = 0; insuranceplanplanspecificcostbenefitcostapplicabilitycodingi<insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist.size();insuranceplanplanspecificcostbenefitcostapplicabilitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  insuranceplanplanspecificcostbenefitcostapplicabilitycoding = insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist.get(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasDisplay()) {

			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getDisplay()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasVersion()) {

			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getVersion()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasCode()) {

			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getCode()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasUserSelected()) {

			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getUserSelected()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd("]]]]]");}


		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == 0) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys("[[[[[");}
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasSystem()) {

			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getSystem()));
		} else {
			i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys("NULL");
		}

		if(insuranceplanplanspecificcostbenefitcostapplicabilitycodingi == insuranceplanplanspecificcostbenefitcostapplicabilitycodinglist.size()-1) {i.addInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys("]]]]]");}


		 };
		 };
		 };
		 };
		/******************** InsrncPln_Pln_CvgArea ********************************************************************************/
		if(insuranceplanplan.hasCoverageArea()) {

			String  array = "[";
			for(int incr=0; incr<insuranceplanplan.getCoverageArea().size(); incr++) {
				array = array + insuranceplanplan.getCoverageArea().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addInsrncPlnPlnCvgArea(array);

		} else {
			i.addInsrncPlnPlnCvgArea("NULL");
		}


		 };
		return i;
	}
}
