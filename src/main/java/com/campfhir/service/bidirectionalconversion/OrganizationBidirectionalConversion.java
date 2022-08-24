package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Organization;
public class OrganizationBidirectionalConversion 
{
	public Organization Organizations(org.hl7.fhir.r4.model.Organization organization) throws ParseException
	{
		 main.java.com.campfhir.model.Organization o = new  main.java.com.campfhir.model.Organization();

		/******************** id ********************************************************************************/
		o.setId(organization.getIdElement().getIdPart());

		/******************** Orgnztn_Nm ********************************************************************************/
		if(organization.hasName()) {

			o.addOrgnztnNm(String.valueOf(organization.getName()));
		} else {
			o.addOrgnztnNm("NULL");
		}


		/******************** organizationtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> organizationtypelist = organization.getType();
		for(int organizationtypei = 0; organizationtypei<organizationtypelist.size();organizationtypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  organizationtype = organizationtypelist.get(organizationtypei);

		/******************** Orgnztn_Typ_Txt ********************************************************************************/
		if(organizationtypei == 0) {o.addOrgnztnTypTxt("[");}
		if(organizationtype.hasText()) {

			o.addOrgnztnTypTxt(String.valueOf(organizationtype.getText()));
		} else {
			o.addOrgnztnTypTxt("NULL");
		}

		if(organizationtypei == organizationtypelist.size()-1) {o.addOrgnztnTypTxt("]");}


		/******************** organizationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> organizationtypecodinglist = organizationtype.getCoding();
		for(int organizationtypecodingi = 0; organizationtypecodingi<organizationtypecodinglist.size();organizationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  organizationtypecoding = organizationtypecodinglist.get(organizationtypecodingi);

		/******************** Orgnztn_Typ_Cdg_Dsply ********************************************************************************/
		if(organizationtypecodingi == 0) {o.addOrgnztnTypCdgDsply("[[");}
		if(organizationtypecoding.hasDisplay()) {

			o.addOrgnztnTypCdgDsply(String.valueOf(organizationtypecoding.getDisplay()));
		} else {
			o.addOrgnztnTypCdgDsply("NULL");
		}

		if(organizationtypecodingi == organizationtypecodinglist.size()-1) {o.addOrgnztnTypCdgDsply("]]");}


		/******************** Orgnztn_Typ_Cdg_Vrsn ********************************************************************************/
		if(organizationtypecodingi == 0) {o.addOrgnztnTypCdgVrsn("[[");}
		if(organizationtypecoding.hasVersion()) {

			o.addOrgnztnTypCdgVrsn(String.valueOf(organizationtypecoding.getVersion()));
		} else {
			o.addOrgnztnTypCdgVrsn("NULL");
		}

		if(organizationtypecodingi == organizationtypecodinglist.size()-1) {o.addOrgnztnTypCdgVrsn("]]");}


		/******************** Orgnztn_Typ_Cdg_Cd ********************************************************************************/
		if(organizationtypecodingi == 0) {o.addOrgnztnTypCdgCd("[[");}
		if(organizationtypecoding.hasCode()) {

			o.addOrgnztnTypCdgCd(String.valueOf(organizationtypecoding.getCode()));
		} else {
			o.addOrgnztnTypCdgCd("NULL");
		}

		if(organizationtypecodingi == organizationtypecodinglist.size()-1) {o.addOrgnztnTypCdgCd("]]");}


		/******************** Orgnztn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(organizationtypecodingi == 0) {o.addOrgnztnTypCdgUsrSltd("[[");}
		if(organizationtypecoding.hasUserSelected()) {

			o.addOrgnztnTypCdgUsrSltd(String.valueOf(organizationtypecoding.getUserSelected()));
		} else {
			o.addOrgnztnTypCdgUsrSltd("NULL");
		}

		if(organizationtypecodingi == organizationtypecodinglist.size()-1) {o.addOrgnztnTypCdgUsrSltd("]]");}


		/******************** Orgnztn_Typ_Cdg_Sys ********************************************************************************/
		if(organizationtypecodingi == 0) {o.addOrgnztnTypCdgSys("[[");}
		if(organizationtypecoding.hasSystem()) {

			o.addOrgnztnTypCdgSys(String.valueOf(organizationtypecoding.getSystem()));
		} else {
			o.addOrgnztnTypCdgSys("NULL");
		}

		if(organizationtypecodingi == organizationtypecodinglist.size()-1) {o.addOrgnztnTypCdgSys("]]");}


		 };
		 };
		/******************** organizationaddress ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Address> organizationaddresslist = organization.getAddress();
		for(int organizationaddressi = 0; organizationaddressi<organizationaddresslist.size();organizationaddressi++ ) {
		org.hl7.fhir.r4.model.Address  organizationaddress = organizationaddresslist.get(organizationaddressi);

		/******************** Orgnztn_Addr_State ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrState("[");}
		if(organizationaddress.hasState()) {

			o.addOrgnztnAddrState(String.valueOf(organizationaddress.getState()));
		} else {
			o.addOrgnztnAddrState("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrState("]");}


		/******************** organizationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType organizationaddresstype = organizationaddress.getType();
		if(organizationaddresstype!=null) {
		if(organizationaddressi == 0) {

		o.addOrgnztnAddrTyp("[");		}
			o.addOrgnztnAddrTyp(organizationaddresstype.toCode());
		if(organizationaddressi == organizationaddresslist.size()-1) {

		o.addOrgnztnAddrTyp("]");		}

		} else {
			o.addOrgnztnAddrTyp("NULL");
		}

		/******************** Orgnztn_Addr_Cntry ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrCntry("[");}
		if(organizationaddress.hasCountry()) {

			o.addOrgnztnAddrCntry(String.valueOf(organizationaddress.getCountry()));
		} else {
			o.addOrgnztnAddrCntry("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrCntry("]");}


		/******************** organizationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationaddressperiod = organizationaddress.getPeriod();

		/******************** Orgnztn_Addr_Prd_Strt ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrPrdStrt("[");}
		if(organizationaddressperiod.hasStart()) {

			o.addOrgnztnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaddressperiod.getStart())+"\"");
		} else {
			o.addOrgnztnAddrPrdStrt("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrPrdStrt("]");}


		/******************** Orgnztn_Addr_Prd_End ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrPrdEnd("[");}
		if(organizationaddressperiod.hasEnd()) {

			o.addOrgnztnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationaddressperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnAddrPrdEnd("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrPrdEnd("]");}


		/******************** Orgnztn_Addr_District ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrDistrict("[");}
		if(organizationaddress.hasDistrict()) {

			o.addOrgnztnAddrDistrict(String.valueOf(organizationaddress.getDistrict()));
		} else {
			o.addOrgnztnAddrDistrict("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrDistrict("]");}


		/******************** Orgnztn_Addr_PostalCd ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrPostalCd("[");}
		if(organizationaddress.hasPostalCode()) {

			o.addOrgnztnAddrPostalCd(String.valueOf(organizationaddress.getPostalCode()));
		} else {
			o.addOrgnztnAddrPostalCd("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrPostalCd("]");}


		/******************** Orgnztn_Addr_Line ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrLine("[");}
		if(organizationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<organizationaddress.getLine().size(); incr++) {
				array = array + organizationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnAddrLine(array);

		} else {
			o.addOrgnztnAddrLine("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrLine("]");}


		/******************** Orgnztn_Addr_City ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrCity("[");}
		if(organizationaddress.hasCity()) {

			o.addOrgnztnAddrCity(String.valueOf(organizationaddress.getCity()));
		} else {
			o.addOrgnztnAddrCity("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrCity("]");}


		/******************** organizationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse organizationaddressuse = organizationaddress.getUse();
		if(organizationaddressuse!=null) {
		if(organizationaddressi == 0) {

		o.addOrgnztnAddrUse("[");		}
			o.addOrgnztnAddrUse(organizationaddressuse.toCode());
		if(organizationaddressi == organizationaddresslist.size()-1) {

		o.addOrgnztnAddrUse("]");		}

		} else {
			o.addOrgnztnAddrUse("NULL");
		}

		/******************** Orgnztn_Addr_Txt ********************************************************************************/
		if(organizationaddressi == 0) {o.addOrgnztnAddrTxt("[");}
		if(organizationaddress.hasText()) {

			o.addOrgnztnAddrTxt(String.valueOf(organizationaddress.getText()));
		} else {
			o.addOrgnztnAddrTxt("NULL");
		}

		if(organizationaddressi == organizationaddresslist.size()-1) {o.addOrgnztnAddrTxt("]");}


		 };
		/******************** Orgnztn_Endpoint ********************************************************************************/
		if(organization.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<organization.getEndpoint().size(); incr++) {
				array = array + organization.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnEndpoint(array);

		} else {
			o.addOrgnztnEndpoint("NULL");
		}


		/******************** organizationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> organizationidentifierlist = organization.getIdentifier();
		for(int organizationidentifieri = 0; organizationidentifieri<organizationidentifierlist.size();organizationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  organizationidentifier = organizationidentifierlist.get(organizationidentifieri);

		/******************** Orgnztn_Id_Vl ********************************************************************************/
		if(organizationidentifieri == 0) {o.addOrgnztnIdVl("[");}
		if(organizationidentifier.hasValue()) {

			o.addOrgnztnIdVl(String.valueOf(organizationidentifier.getValue()));
		} else {
			o.addOrgnztnIdVl("NULL");
		}

		if(organizationidentifieri == organizationidentifierlist.size()-1) {o.addOrgnztnIdVl("]");}


		/******************** organizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationidentifiertype = organizationidentifier.getType();

		/******************** Orgnztn_Id_Typ_Txt ********************************************************************************/
		if(organizationidentifieri == 0) {o.addOrgnztnIdTypTxt("[");}
		if(organizationidentifiertype.hasText()) {

			o.addOrgnztnIdTypTxt(String.valueOf(organizationidentifiertype.getText()));
		} else {
			o.addOrgnztnIdTypTxt("NULL");
		}

		if(organizationidentifieri == organizationidentifierlist.size()-1) {o.addOrgnztnIdTypTxt("]");}


		/******************** organizationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> organizationidentifiertypecodinglist = organizationidentifiertype.getCoding();
		for(int organizationidentifiertypecodingi = 0; organizationidentifiertypecodingi<organizationidentifiertypecodinglist.size();organizationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  organizationidentifiertypecoding = organizationidentifiertypecodinglist.get(organizationidentifiertypecodingi);

		/******************** Orgnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(organizationidentifiertypecodingi == 0) {o.addOrgnztnIdTypCdgDsply("[[");}
		if(organizationidentifiertypecoding.hasDisplay()) {

			o.addOrgnztnIdTypCdgDsply(String.valueOf(organizationidentifiertypecoding.getDisplay()));
		} else {
			o.addOrgnztnIdTypCdgDsply("NULL");
		}

		if(organizationidentifiertypecodingi == organizationidentifiertypecodinglist.size()-1) {o.addOrgnztnIdTypCdgDsply("]]");}


		/******************** Orgnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(organizationidentifiertypecodingi == 0) {o.addOrgnztnIdTypCdgVrsn("[[");}
		if(organizationidentifiertypecoding.hasVersion()) {

			o.addOrgnztnIdTypCdgVrsn(String.valueOf(organizationidentifiertypecoding.getVersion()));
		} else {
			o.addOrgnztnIdTypCdgVrsn("NULL");
		}

		if(organizationidentifiertypecodingi == organizationidentifiertypecodinglist.size()-1) {o.addOrgnztnIdTypCdgVrsn("]]");}


		/******************** Orgnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(organizationidentifiertypecodingi == 0) {o.addOrgnztnIdTypCdgCd("[[");}
		if(organizationidentifiertypecoding.hasCode()) {

			o.addOrgnztnIdTypCdgCd(String.valueOf(organizationidentifiertypecoding.getCode()));
		} else {
			o.addOrgnztnIdTypCdgCd("NULL");
		}

		if(organizationidentifiertypecodingi == organizationidentifiertypecodinglist.size()-1) {o.addOrgnztnIdTypCdgCd("]]");}


		/******************** Orgnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(organizationidentifiertypecodingi == 0) {o.addOrgnztnIdTypCdgUsrSltd("[[");}
		if(organizationidentifiertypecoding.hasUserSelected()) {

			o.addOrgnztnIdTypCdgUsrSltd(String.valueOf(organizationidentifiertypecoding.getUserSelected()));
		} else {
			o.addOrgnztnIdTypCdgUsrSltd("NULL");
		}

		if(organizationidentifiertypecodingi == organizationidentifiertypecodinglist.size()-1) {o.addOrgnztnIdTypCdgUsrSltd("]]");}


		/******************** Orgnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(organizationidentifiertypecodingi == 0) {o.addOrgnztnIdTypCdgSys("[[");}
		if(organizationidentifiertypecoding.hasSystem()) {

			o.addOrgnztnIdTypCdgSys(String.valueOf(organizationidentifiertypecoding.getSystem()));
		} else {
			o.addOrgnztnIdTypCdgSys("NULL");
		}

		if(organizationidentifiertypecodingi == organizationidentifiertypecodinglist.size()-1) {o.addOrgnztnIdTypCdgSys("]]");}


		 };
		/******************** organizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationidentifierperiod = organizationidentifier.getPeriod();

		/******************** Orgnztn_Id_Prd_Strt ********************************************************************************/
		if(organizationidentifieri == 0) {o.addOrgnztnIdPrdStrt("[");}
		if(organizationidentifierperiod.hasStart()) {

			o.addOrgnztnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationidentifierperiod.getStart())+"\"");
		} else {
			o.addOrgnztnIdPrdStrt("NULL");
		}

		if(organizationidentifieri == organizationidentifierlist.size()-1) {o.addOrgnztnIdPrdStrt("]");}


		/******************** Orgnztn_Id_Prd_End ********************************************************************************/
		if(organizationidentifieri == 0) {o.addOrgnztnIdPrdEnd("[");}
		if(organizationidentifierperiod.hasEnd()) {

			o.addOrgnztnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationidentifierperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnIdPrdEnd("NULL");
		}

		if(organizationidentifieri == organizationidentifierlist.size()-1) {o.addOrgnztnIdPrdEnd("]");}


		/******************** organizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse organizationidentifieruse = organizationidentifier.getUse();
		if(organizationidentifieruse!=null) {
		if(organizationidentifieri == 0) {

		o.addOrgnztnIdUse("[");		}
			o.addOrgnztnIdUse(organizationidentifieruse.toCode());
		if(organizationidentifieri == organizationidentifierlist.size()-1) {

		o.addOrgnztnIdUse("]");		}

		} else {
			o.addOrgnztnIdUse("NULL");
		}

		/******************** Orgnztn_Id_Assigner ********************************************************************************/
		if(organizationidentifieri == 0) {o.addOrgnztnIdAssigner("[");}
		if(organizationidentifier.hasAssigner()) {

			if(organizationidentifier.getAssigner().getReference() != null) {
			o.addOrgnztnIdAssigner(organizationidentifier.getAssigner().getReference());
			}
		} else {
			o.addOrgnztnIdAssigner("NULL");
		}

		if(organizationidentifieri == organizationidentifierlist.size()-1) {o.addOrgnztnIdAssigner("]");}


		/******************** Orgnztn_Id_Sys ********************************************************************************/
		if(organizationidentifieri == 0) {o.addOrgnztnIdSys("[");}
		if(organizationidentifier.hasSystem()) {

			o.addOrgnztnIdSys(String.valueOf(organizationidentifier.getSystem()));
		} else {
			o.addOrgnztnIdSys("NULL");
		}

		if(organizationidentifieri == organizationidentifierlist.size()-1) {o.addOrgnztnIdSys("]");}


		 };
		/******************** organizationcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Organization.OrganizationContactComponent> organizationcontactlist = organization.getContact();
		for(int organizationcontacti = 0; organizationcontacti<organizationcontactlist.size();organizationcontacti++ ) {
		org.hl7.fhir.r4.model.Organization.OrganizationContactComponent  organizationcontact = organizationcontactlist.get(organizationcontacti);

		/******************** organizationcontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName organizationcontactname = organizationcontact.getName();

		/******************** organizationcontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontactnameperiod = organizationcontactname.getPeriod();

		/******************** Orgnztn_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctNmPrdStrt("[");}
		if(organizationcontactnameperiod.hasStart()) {

			o.addOrgnztnCntctNmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationcontactnameperiod.getStart())+"\"");
		} else {
			o.addOrgnztnCntctNmPrdStrt("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctNmPrdStrt("]");}


		/******************** Orgnztn_Cntct_Nm_Prd_End ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctNmPrdEnd("[");}
		if(organizationcontactnameperiod.hasEnd()) {

			o.addOrgnztnCntctNmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationcontactnameperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnCntctNmPrdEnd("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctNmPrdEnd("]");}


		/******************** Orgnztn_Cntct_Nm_Given ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctNmGiven("[");}
		if(organizationcontactname.hasGiven()) {

			String  array = "[";
			for(int incr=0; incr<organizationcontactname.getGiven().size(); incr++) {
				array = array + organizationcontactname.getGiven().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnCntctNmGiven(array);

		} else {
			o.addOrgnztnCntctNmGiven("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctNmGiven("]");}


		/******************** Orgnztn_Cntct_Nm_Fmly ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctNmFmly("[");}
		if(organizationcontactname.hasFamily()) {

			o.addOrgnztnCntctNmFmly(String.valueOf(organizationcontactname.getFamily()));
		} else {
			o.addOrgnztnCntctNmFmly("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctNmFmly("]");}


		/******************** Orgnztn_Cntct_Nm_Suffix ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctNmSuffix("[");}
		if(organizationcontactname.hasSuffix()) {

			String  array = "[";
			for(int incr=0; incr<organizationcontactname.getSuffix().size(); incr++) {
				array = array + organizationcontactname.getSuffix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnCntctNmSuffix(array);

		} else {
			o.addOrgnztnCntctNmSuffix("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctNmSuffix("]");}


		/******************** organizationcontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse organizationcontactnameuse = organizationcontactname.getUse();
		if(organizationcontactnameuse!=null) {
		if(organizationcontacti == 0) {

		o.addOrgnztnCntctNmUse("[");		}
			o.addOrgnztnCntctNmUse(organizationcontactnameuse.toCode());
		if(organizationcontacti == organizationcontactlist.size()-1) {

		o.addOrgnztnCntctNmUse("]");		}

		} else {
			o.addOrgnztnCntctNmUse("NULL");
		}

		/******************** Orgnztn_Cntct_Nm_Txt ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctNmTxt("[");}
		if(organizationcontactname.hasText()) {

			o.addOrgnztnCntctNmTxt(String.valueOf(organizationcontactname.getText()));
		} else {
			o.addOrgnztnCntctNmTxt("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctNmTxt("]");}


		/******************** Orgnztn_Cntct_Nm_Prefix ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctNmPrefix("[");}
		if(organizationcontactname.hasPrefix()) {

			String  array = "[";
			for(int incr=0; incr<organizationcontactname.getPrefix().size(); incr++) {
				array = array + organizationcontactname.getPrefix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnCntctNmPrefix(array);

		} else {
			o.addOrgnztnCntctNmPrefix("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctNmPrefix("]");}


		/******************** organizationcontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address organizationcontactaddress = organizationcontact.getAddress();

		/******************** Orgnztn_Cntct_Addr_State ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrState("[");}
		if(organizationcontactaddress.hasState()) {

			o.addOrgnztnCntctAddrState(String.valueOf(organizationcontactaddress.getState()));
		} else {
			o.addOrgnztnCntctAddrState("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrState("]");}


		/******************** organizationcontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType organizationcontactaddresstype = organizationcontactaddress.getType();
		if(organizationcontactaddresstype!=null) {
		if(organizationcontacti == 0) {

		o.addOrgnztnCntctAddrTyp("[");		}
			o.addOrgnztnCntctAddrTyp(organizationcontactaddresstype.toCode());
		if(organizationcontacti == organizationcontactlist.size()-1) {

		o.addOrgnztnCntctAddrTyp("]");		}

		} else {
			o.addOrgnztnCntctAddrTyp("NULL");
		}

		/******************** Orgnztn_Cntct_Addr_Cntry ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrCntry("[");}
		if(organizationcontactaddress.hasCountry()) {

			o.addOrgnztnCntctAddrCntry(String.valueOf(organizationcontactaddress.getCountry()));
		} else {
			o.addOrgnztnCntctAddrCntry("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrCntry("]");}


		/******************** organizationcontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontactaddressperiod = organizationcontactaddress.getPeriod();

		/******************** Orgnztn_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrPrdStrt("[");}
		if(organizationcontactaddressperiod.hasStart()) {

			o.addOrgnztnCntctAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationcontactaddressperiod.getStart())+"\"");
		} else {
			o.addOrgnztnCntctAddrPrdStrt("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrPrdStrt("]");}


		/******************** Orgnztn_Cntct_Addr_Prd_End ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrPrdEnd("[");}
		if(organizationcontactaddressperiod.hasEnd()) {

			o.addOrgnztnCntctAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationcontactaddressperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnCntctAddrPrdEnd("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrPrdEnd("]");}


		/******************** Orgnztn_Cntct_Addr_District ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrDistrict("[");}
		if(organizationcontactaddress.hasDistrict()) {

			o.addOrgnztnCntctAddrDistrict(String.valueOf(organizationcontactaddress.getDistrict()));
		} else {
			o.addOrgnztnCntctAddrDistrict("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrDistrict("]");}


		/******************** Orgnztn_Cntct_Addr_PostalCd ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrPostalCd("[");}
		if(organizationcontactaddress.hasPostalCode()) {

			o.addOrgnztnCntctAddrPostalCd(String.valueOf(organizationcontactaddress.getPostalCode()));
		} else {
			o.addOrgnztnCntctAddrPostalCd("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrPostalCd("]");}


		/******************** Orgnztn_Cntct_Addr_Line ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrLine("[");}
		if(organizationcontactaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<organizationcontactaddress.getLine().size(); incr++) {
				array = array + organizationcontactaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnCntctAddrLine(array);

		} else {
			o.addOrgnztnCntctAddrLine("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrLine("]");}


		/******************** Orgnztn_Cntct_Addr_City ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrCity("[");}
		if(organizationcontactaddress.hasCity()) {

			o.addOrgnztnCntctAddrCity(String.valueOf(organizationcontactaddress.getCity()));
		} else {
			o.addOrgnztnCntctAddrCity("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrCity("]");}


		/******************** organizationcontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse organizationcontactaddressuse = organizationcontactaddress.getUse();
		if(organizationcontactaddressuse!=null) {
		if(organizationcontacti == 0) {

		o.addOrgnztnCntctAddrUse("[");		}
			o.addOrgnztnCntctAddrUse(organizationcontactaddressuse.toCode());
		if(organizationcontacti == organizationcontactlist.size()-1) {

		o.addOrgnztnCntctAddrUse("]");		}

		} else {
			o.addOrgnztnCntctAddrUse("NULL");
		}

		/******************** Orgnztn_Cntct_Addr_Txt ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctAddrTxt("[");}
		if(organizationcontactaddress.hasText()) {

			o.addOrgnztnCntctAddrTxt(String.valueOf(organizationcontactaddress.getText()));
		} else {
			o.addOrgnztnCntctAddrTxt("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctAddrTxt("]");}


		/******************** organizationcontactpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept organizationcontactpurpose = organizationcontact.getPurpose();

		/******************** Orgnztn_Cntct_Prpse_Txt ********************************************************************************/
		if(organizationcontacti == 0) {o.addOrgnztnCntctPrpseTxt("[");}
		if(organizationcontactpurpose.hasText()) {

			o.addOrgnztnCntctPrpseTxt(String.valueOf(organizationcontactpurpose.getText()));
		} else {
			o.addOrgnztnCntctPrpseTxt("NULL");
		}

		if(organizationcontacti == organizationcontactlist.size()-1) {o.addOrgnztnCntctPrpseTxt("]");}


		/******************** organizationcontactpurposecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> organizationcontactpurposecodinglist = organizationcontactpurpose.getCoding();
		for(int organizationcontactpurposecodingi = 0; organizationcontactpurposecodingi<organizationcontactpurposecodinglist.size();organizationcontactpurposecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  organizationcontactpurposecoding = organizationcontactpurposecodinglist.get(organizationcontactpurposecodingi);

		/******************** Orgnztn_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(organizationcontactpurposecodingi == 0) {o.addOrgnztnCntctPrpseCdgDsply("[[");}
		if(organizationcontactpurposecoding.hasDisplay()) {

			o.addOrgnztnCntctPrpseCdgDsply(String.valueOf(organizationcontactpurposecoding.getDisplay()));
		} else {
			o.addOrgnztnCntctPrpseCdgDsply("NULL");
		}

		if(organizationcontactpurposecodingi == organizationcontactpurposecodinglist.size()-1) {o.addOrgnztnCntctPrpseCdgDsply("]]");}


		/******************** Orgnztn_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(organizationcontactpurposecodingi == 0) {o.addOrgnztnCntctPrpseCdgVrsn("[[");}
		if(organizationcontactpurposecoding.hasVersion()) {

			o.addOrgnztnCntctPrpseCdgVrsn(String.valueOf(organizationcontactpurposecoding.getVersion()));
		} else {
			o.addOrgnztnCntctPrpseCdgVrsn("NULL");
		}

		if(organizationcontactpurposecodingi == organizationcontactpurposecodinglist.size()-1) {o.addOrgnztnCntctPrpseCdgVrsn("]]");}


		/******************** Orgnztn_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(organizationcontactpurposecodingi == 0) {o.addOrgnztnCntctPrpseCdgCd("[[");}
		if(organizationcontactpurposecoding.hasCode()) {

			o.addOrgnztnCntctPrpseCdgCd(String.valueOf(organizationcontactpurposecoding.getCode()));
		} else {
			o.addOrgnztnCntctPrpseCdgCd("NULL");
		}

		if(organizationcontactpurposecodingi == organizationcontactpurposecodinglist.size()-1) {o.addOrgnztnCntctPrpseCdgCd("]]");}


		/******************** Orgnztn_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(organizationcontactpurposecodingi == 0) {o.addOrgnztnCntctPrpseCdgUsrSltd("[[");}
		if(organizationcontactpurposecoding.hasUserSelected()) {

			o.addOrgnztnCntctPrpseCdgUsrSltd(String.valueOf(organizationcontactpurposecoding.getUserSelected()));
		} else {
			o.addOrgnztnCntctPrpseCdgUsrSltd("NULL");
		}

		if(organizationcontactpurposecodingi == organizationcontactpurposecodinglist.size()-1) {o.addOrgnztnCntctPrpseCdgUsrSltd("]]");}


		/******************** Orgnztn_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(organizationcontactpurposecodingi == 0) {o.addOrgnztnCntctPrpseCdgSys("[[");}
		if(organizationcontactpurposecoding.hasSystem()) {

			o.addOrgnztnCntctPrpseCdgSys(String.valueOf(organizationcontactpurposecoding.getSystem()));
		} else {
			o.addOrgnztnCntctPrpseCdgSys("NULL");
		}

		if(organizationcontactpurposecodingi == organizationcontactpurposecodinglist.size()-1) {o.addOrgnztnCntctPrpseCdgSys("]]");}


		 };
		/******************** organizationcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> organizationcontacttelecomlist = organizationcontact.getTelecom();
		for(int organizationcontacttelecomi = 0; organizationcontacttelecomi<organizationcontacttelecomlist.size();organizationcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  organizationcontacttelecom = organizationcontacttelecomlist.get(organizationcontacttelecomi);

		/******************** Orgnztn_Cntct_Tlcm_Vl ********************************************************************************/
		if(organizationcontacttelecomi == 0) {o.addOrgnztnCntctTlcmVl("[[");}
		if(organizationcontacttelecom.hasValue()) {

			o.addOrgnztnCntctTlcmVl(String.valueOf(organizationcontacttelecom.getValue()));
		} else {
			o.addOrgnztnCntctTlcmVl("NULL");
		}

		if(organizationcontacttelecomi == organizationcontacttelecomlist.size()-1) {o.addOrgnztnCntctTlcmVl("]]");}


		/******************** organizationcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationcontacttelecomperiod = organizationcontacttelecom.getPeriod();

		/******************** Orgnztn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(organizationcontacttelecomi == 0) {o.addOrgnztnCntctTlcmPrdStrt("[[");}
		if(organizationcontacttelecomperiod.hasStart()) {

			o.addOrgnztnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationcontacttelecomperiod.getStart())+"\"");
		} else {
			o.addOrgnztnCntctTlcmPrdStrt("NULL");
		}

		if(organizationcontacttelecomi == organizationcontacttelecomlist.size()-1) {o.addOrgnztnCntctTlcmPrdStrt("]]");}


		/******************** Orgnztn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(organizationcontacttelecomi == 0) {o.addOrgnztnCntctTlcmPrdEnd("[[");}
		if(organizationcontacttelecomperiod.hasEnd()) {

			o.addOrgnztnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationcontacttelecomperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnCntctTlcmPrdEnd("NULL");
		}

		if(organizationcontacttelecomi == organizationcontacttelecomlist.size()-1) {o.addOrgnztnCntctTlcmPrdEnd("]]");}


		/******************** organizationcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse organizationcontacttelecomuse = organizationcontacttelecom.getUse();
		if(organizationcontacttelecomuse!=null) {
		if(organizationcontacttelecomi == 0) {

		o.addOrgnztnCntctTlcmUse("[[");		}
			o.addOrgnztnCntctTlcmUse(organizationcontacttelecomuse.toCode());
		if(organizationcontacttelecomi == organizationcontacttelecomlist.size()-1) {

		o.addOrgnztnCntctTlcmUse("]]");		}

		} else {
			o.addOrgnztnCntctTlcmUse("NULL");
		}

		/******************** organizationcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem organizationcontacttelecomsystem = organizationcontacttelecom.getSystem();
		if(organizationcontacttelecomsystem!=null) {
		if(organizationcontacttelecomi == 0) {

		o.addOrgnztnCntctTlcmSys("[[");		}
			o.addOrgnztnCntctTlcmSys(organizationcontacttelecomsystem.toCode());
		if(organizationcontacttelecomi == organizationcontacttelecomlist.size()-1) {

		o.addOrgnztnCntctTlcmSys("]]");		}

		} else {
			o.addOrgnztnCntctTlcmSys("NULL");
		}

		/******************** Orgnztn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(organizationcontacttelecomi == 0) {o.addOrgnztnCntctTlcmRnk("[[");}
		if(organizationcontacttelecom.hasRank()) {

			o.addOrgnztnCntctTlcmRnk(String.valueOf(organizationcontacttelecom.getRank()));
		} else {
			o.addOrgnztnCntctTlcmRnk("NULL");
		}

		if(organizationcontacttelecomi == organizationcontacttelecomlist.size()-1) {o.addOrgnztnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** Orgnztn_Active ********************************************************************************/
		if(organization.hasActive()) {

			o.addOrgnztnActive(String.valueOf(organization.getActive()));
		} else {
			o.addOrgnztnActive("NULL");
		}


		/******************** organizationtelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> organizationtelecomlist = organization.getTelecom();
		for(int organizationtelecomi = 0; organizationtelecomi<organizationtelecomlist.size();organizationtelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  organizationtelecom = organizationtelecomlist.get(organizationtelecomi);

		/******************** Orgnztn_Tlcm_Vl ********************************************************************************/
		if(organizationtelecomi == 0) {o.addOrgnztnTlcmVl("[");}
		if(organizationtelecom.hasValue()) {

			o.addOrgnztnTlcmVl(String.valueOf(organizationtelecom.getValue()));
		} else {
			o.addOrgnztnTlcmVl("NULL");
		}

		if(organizationtelecomi == organizationtelecomlist.size()-1) {o.addOrgnztnTlcmVl("]");}


		/******************** organizationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period organizationtelecomperiod = organizationtelecom.getPeriod();

		/******************** Orgnztn_Tlcm_Prd_Strt ********************************************************************************/
		if(organizationtelecomi == 0) {o.addOrgnztnTlcmPrdStrt("[");}
		if(organizationtelecomperiod.hasStart()) {

			o.addOrgnztnTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationtelecomperiod.getStart())+"\"");
		} else {
			o.addOrgnztnTlcmPrdStrt("NULL");
		}

		if(organizationtelecomi == organizationtelecomlist.size()-1) {o.addOrgnztnTlcmPrdStrt("]");}


		/******************** Orgnztn_Tlcm_Prd_End ********************************************************************************/
		if(organizationtelecomi == 0) {o.addOrgnztnTlcmPrdEnd("[");}
		if(organizationtelecomperiod.hasEnd()) {

			o.addOrgnztnTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(organizationtelecomperiod.getEnd())+"\"");
		} else {
			o.addOrgnztnTlcmPrdEnd("NULL");
		}

		if(organizationtelecomi == organizationtelecomlist.size()-1) {o.addOrgnztnTlcmPrdEnd("]");}


		/******************** organizationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse organizationtelecomuse = organizationtelecom.getUse();
		if(organizationtelecomuse!=null) {
		if(organizationtelecomi == 0) {

		o.addOrgnztnTlcmUse("[");		}
			o.addOrgnztnTlcmUse(organizationtelecomuse.toCode());
		if(organizationtelecomi == organizationtelecomlist.size()-1) {

		o.addOrgnztnTlcmUse("]");		}

		} else {
			o.addOrgnztnTlcmUse("NULL");
		}

		/******************** organizationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem organizationtelecomsystem = organizationtelecom.getSystem();
		if(organizationtelecomsystem!=null) {
		if(organizationtelecomi == 0) {

		o.addOrgnztnTlcmSys("[");		}
			o.addOrgnztnTlcmSys(organizationtelecomsystem.toCode());
		if(organizationtelecomi == organizationtelecomlist.size()-1) {

		o.addOrgnztnTlcmSys("]");		}

		} else {
			o.addOrgnztnTlcmSys("NULL");
		}

		/******************** Orgnztn_Tlcm_Rnk ********************************************************************************/
		if(organizationtelecomi == 0) {o.addOrgnztnTlcmRnk("[");}
		if(organizationtelecom.hasRank()) {

			o.addOrgnztnTlcmRnk(String.valueOf(organizationtelecom.getRank()));
		} else {
			o.addOrgnztnTlcmRnk("NULL");
		}

		if(organizationtelecomi == organizationtelecomlist.size()-1) {o.addOrgnztnTlcmRnk("]");}


		 };
		/******************** Orgnztn_Alias ********************************************************************************/
		if(organization.hasAlias()) {

			String  array = "[";
			for(int incr=0; incr<organization.getAlias().size(); incr++) {
				array = array + organization.getAlias().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOrgnztnAlias(array);

		} else {
			o.addOrgnztnAlias("NULL");
		}


		/******************** Orgnztn_PartOf ********************************************************************************/
		if(organization.hasPartOf()) {

			if(organization.getPartOf().getReference() != null) {
			o.addOrgnztnPartOf(organization.getPartOf().getReference());
			}
		} else {
			o.addOrgnztnPartOf("NULL");
		}


		return o;
	}
}
