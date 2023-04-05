package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
/***This class takes in a FHIR resource and converts it into a relational format***/

import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.Type;

import main.java.com.campfhir.model.Patient;
public class PatientBidirectionalConversion 
{
	public Patient Patients(org.hl7.fhir.r4.model.Patient patient) throws ParseException
	{
		 main.java.com.campfhir.model.Patient p = new  main.java.com.campfhir.model.Patient();

		/******************** id ********************************************************************************/
		p.setId(patient.getIdElement().getIdPart().replace("urn:uuid:", ""));

		/******************** patientname ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.HumanName> patientnamelist = patient.getName();
		for(int patientnamei = 0; patientnamei<patientnamelist.size();patientnamei++ ) {
		org.hl7.fhir.r4.model.HumanName  patientname = patientnamelist.get(patientnamei);

		/******************** patientnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientnameperiod = patientname.getPeriod();

		/******************** Pnt_Nm_Prd_Strt ********************************************************************************/
		if(patientnamei == 0) {p.addPntNmPrdStrt("[");}
		if(patientnameperiod.hasStart()) {

			p.addPntNmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientnameperiod.getStart())+"\"");
		} else {
			p.addPntNmPrdStrt("NULL");
		}

		if(patientnamei == patientnamelist.size()-1) {p.addPntNmPrdStrt("]");}


		/******************** Pnt_Nm_Prd_End ********************************************************************************/
		if(patientnamei == 0) {p.addPntNmPrdEnd("[");}
		if(patientnameperiod.hasEnd()) {

			p.addPntNmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientnameperiod.getEnd())+"\"");
		} else {
			p.addPntNmPrdEnd("NULL");
		}

		if(patientnamei == patientnamelist.size()-1) {p.addPntNmPrdEnd("]");}


		/******************** Pnt_Nm_Given ********************************************************************************/
		if(patientnamei == 0) {p.addPntNmGiven("[");}
		if(patientname.hasGiven()) {

			String  array = "[";
			for(int incr=0; incr<patientname.getGiven().size(); incr++) {
				array = array + patientname.getGiven().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntNmGiven(array);

		} else {
			p.addPntNmGiven("NULL");
		}

		if(patientnamei == patientnamelist.size()-1) {p.addPntNmGiven("]");}


		/******************** Pnt_Nm_Fmly ********************************************************************************/
		if(patientnamei == 0) {p.addPntNmFmly("[");}
		if(patientname.hasFamily()) {

			p.addPntNmFmly(String.valueOf(patientname.getFamily()));
		} else {
			p.addPntNmFmly("NULL");
		}

		if(patientnamei == patientnamelist.size()-1) {p.addPntNmFmly("]");}


		/******************** Pnt_Nm_Suffix ********************************************************************************/
		if(patientnamei == 0) {p.addPntNmSuffix("[");}
		if(patientname.hasSuffix()) {

			String  array = "[";
			for(int incr=0; incr<patientname.getSuffix().size(); incr++) {
				array = array + patientname.getSuffix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntNmSuffix(array);

		} else {
			p.addPntNmSuffix("NULL");
		}

		if(patientnamei == patientnamelist.size()-1) {p.addPntNmSuffix("]");}


		/******************** patientnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse patientnameuse = patientname.getUse();
		if(patientnameuse!=null) {
		if(patientnamei == 0) {

		p.addPntNmUse("[");		}
			p.addPntNmUse(patientnameuse.toCode());
		if(patientnamei == patientnamelist.size()-1) {

		p.addPntNmUse("]");		}

		} else {
			p.addPntNmUse("NULL");
		}

		/******************** Pnt_Nm_Txt ********************************************************************************/
		if(patientnamei == 0) {p.addPntNmTxt("[");}
		if(patientname.hasText()) {

			p.addPntNmTxt(String.valueOf(patientname.getText()));
		} else {
			p.addPntNmTxt("NULL");
		}

		if(patientnamei == patientnamelist.size()-1) {p.addPntNmTxt("]");}


		/******************** Pnt_Nm_Prefix ********************************************************************************/
		if(patientnamei == 0) {p.addPntNmPrefix("[");}
		if(patientname.hasPrefix()) {

			String  array = "[";
			for(int incr=0; incr<patientname.getPrefix().size(); incr++) {
				array = array + patientname.getPrefix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntNmPrefix(array);

		} else {
			p.addPntNmPrefix("NULL");
		}

		if(patientnamei == patientnamelist.size()-1) {p.addPntNmPrefix("]");}


		 };
		/******************** patientaddress ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Address> patientaddresslist = patient.getAddress();
		for(int patientaddressi = 0; patientaddressi<patientaddresslist.size();patientaddressi++ ) {
		org.hl7.fhir.r4.model.Address  patientaddress = patientaddresslist.get(patientaddressi);

		/******************** Pnt_Addr_State ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrState("[");}
		if(patientaddress.hasState()) {

			p.addPntAddrState(String.valueOf(patientaddress.getState()));
		} else {
			p.addPntAddrState("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrState("]");}


		/******************** patientaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType patientaddresstype = patientaddress.getType();
		if(patientaddresstype!=null) {
		if(patientaddressi == 0) {

		p.addPntAddrTyp("[");		}
			p.addPntAddrTyp(patientaddresstype.toCode());
		if(patientaddressi == patientaddresslist.size()-1) {

		p.addPntAddrTyp("]");		}

		} else {
			p.addPntAddrTyp("NULL");
		}

		/******************** Pnt_Addr_Cntry ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrCntry("[");}
		if(patientaddress.hasCountry()) {

			p.addPntAddrCntry(String.valueOf(patientaddress.getCountry()));
		} else {
			p.addPntAddrCntry("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrCntry("]");}


		/******************** patientaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientaddressperiod = patientaddress.getPeriod();

		/******************** Pnt_Addr_Prd_Strt ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrPrdStrt("[");}
		if(patientaddressperiod.hasStart()) {

			p.addPntAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientaddressperiod.getStart())+"\"");
		} else {
			p.addPntAddrPrdStrt("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrPrdStrt("]");}


		/******************** Pnt_Addr_Prd_End ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrPrdEnd("[");}
		if(patientaddressperiod.hasEnd()) {

			p.addPntAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientaddressperiod.getEnd())+"\"");
		} else {
			p.addPntAddrPrdEnd("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrPrdEnd("]");}


		/******************** Pnt_Addr_District ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrDistrict("[");}
		if(patientaddress.hasDistrict()) {

			p.addPntAddrDistrict(String.valueOf(patientaddress.getDistrict()));
		} else {
			p.addPntAddrDistrict("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrDistrict("]");}


		/******************** Pnt_Addr_PostalCd ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrPostalCd("[");}
		if(patientaddress.hasPostalCode()) {

			p.addPntAddrPostalCd(String.valueOf(patientaddress.getPostalCode()));
		} else {
			p.addPntAddrPostalCd("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrPostalCd("]");}


		/******************** Pnt_Addr_Line ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrLine("[");}
		if(patientaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<patientaddress.getLine().size(); incr++) {
				array = array + patientaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntAddrLine(array);

		} else {
			p.addPntAddrLine("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrLine("]");}


		/******************** Pnt_Addr_City ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrCity("[");}
		if(patientaddress.hasCity()) {

			p.addPntAddrCity(String.valueOf(patientaddress.getCity()));
		} else {
			p.addPntAddrCity("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrCity("]");}


		/******************** patientaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse patientaddressuse = patientaddress.getUse();
		if(patientaddressuse!=null) {
		if(patientaddressi == 0) {

		p.addPntAddrUse("[");		}
			p.addPntAddrUse(patientaddressuse.toCode());
		if(patientaddressi == patientaddresslist.size()-1) {

		p.addPntAddrUse("]");		}

		} else {
			p.addPntAddrUse("NULL");
		}

		/******************** Pnt_Addr_Txt ********************************************************************************/
		if(patientaddressi == 0) {p.addPntAddrTxt("[");}
		if(patientaddress.hasText()) {

			p.addPntAddrTxt(String.valueOf(patientaddress.getText()));
		} else {
			p.addPntAddrTxt("NULL");
		}

		if(patientaddressi == patientaddresslist.size()-1) {p.addPntAddrTxt("]");}


		 };
		/******************** patientidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> patientidentifierlist = patient.getIdentifier();
		for(int patientidentifieri = 0; patientidentifieri<patientidentifierlist.size();patientidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  patientidentifier = patientidentifierlist.get(patientidentifieri);

		/******************** Pnt_Id_Vl ********************************************************************************/
		if(patientidentifieri == 0) {p.addPntIdVl("[");}
		if(patientidentifier.hasValue()) {

			p.addPntIdVl(String.valueOf(patientidentifier.getValue()));
		} else {
			p.addPntIdVl("NULL");
		}

		if(patientidentifieri == patientidentifierlist.size()-1) {p.addPntIdVl("]");}


		/******************** patientidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientidentifiertype = patientidentifier.getType();

		/******************** Pnt_Id_Typ_Txt ********************************************************************************/
		if(patientidentifieri == 0) {p.addPntIdTypTxt("[");}
		if(patientidentifiertype.hasText()) {

			p.addPntIdTypTxt(String.valueOf(patientidentifiertype.getText()));
		} else {
			p.addPntIdTypTxt("NULL");
		}

		if(patientidentifieri == patientidentifierlist.size()-1) {p.addPntIdTypTxt("]");}


		/******************** patientidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> patientidentifiertypecodinglist = patientidentifiertype.getCoding();
		for(int patientidentifiertypecodingi = 0; patientidentifiertypecodingi<patientidentifiertypecodinglist.size();patientidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  patientidentifiertypecoding = patientidentifiertypecodinglist.get(patientidentifiertypecodingi);

		/******************** Pnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(patientidentifiertypecodingi == 0) {p.addPntIdTypCdgDsply("[[");}
		if(patientidentifiertypecoding.hasDisplay()) {

			p.addPntIdTypCdgDsply(String.valueOf(patientidentifiertypecoding.getDisplay()));
		} else {
			p.addPntIdTypCdgDsply("NULL");
		}

		if(patientidentifiertypecodingi == patientidentifiertypecodinglist.size()-1) {p.addPntIdTypCdgDsply("]]");}


		/******************** Pnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(patientidentifiertypecodingi == 0) {p.addPntIdTypCdgVrsn("[[");}
		if(patientidentifiertypecoding.hasVersion()) {

			p.addPntIdTypCdgVrsn(String.valueOf(patientidentifiertypecoding.getVersion()));
		} else {
			p.addPntIdTypCdgVrsn("NULL");
		}

		if(patientidentifiertypecodingi == patientidentifiertypecodinglist.size()-1) {p.addPntIdTypCdgVrsn("]]");}


		/******************** Pnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(patientidentifiertypecodingi == 0) {p.addPntIdTypCdgCd("[[");}
		if(patientidentifiertypecoding.hasCode()) {

			p.addPntIdTypCdgCd(String.valueOf(patientidentifiertypecoding.getCode()));
		} else {
			p.addPntIdTypCdgCd("NULL");
		}

		if(patientidentifiertypecodingi == patientidentifiertypecodinglist.size()-1) {p.addPntIdTypCdgCd("]]");}


		/******************** Pnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(patientidentifiertypecodingi == 0) {p.addPntIdTypCdgUsrSltd("[[");}
		if(patientidentifiertypecoding.hasUserSelected()) {

			p.addPntIdTypCdgUsrSltd(String.valueOf(patientidentifiertypecoding.getUserSelected()));
		} else {
			p.addPntIdTypCdgUsrSltd("NULL");
		}

		if(patientidentifiertypecodingi == patientidentifiertypecodinglist.size()-1) {p.addPntIdTypCdgUsrSltd("]]");}


		/******************** Pnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(patientidentifiertypecodingi == 0) {p.addPntIdTypCdgSys("[[");}
		if(patientidentifiertypecoding.hasSystem()) {

			p.addPntIdTypCdgSys(String.valueOf(patientidentifiertypecoding.getSystem()));
		} else {
			p.addPntIdTypCdgSys("NULL");
		}

		if(patientidentifiertypecodingi == patientidentifiertypecodinglist.size()-1) {p.addPntIdTypCdgSys("]]");}


		 };
		/******************** patientidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientidentifierperiod = patientidentifier.getPeriod();

		/******************** Pnt_Id_Prd_Strt ********************************************************************************/
		if(patientidentifieri == 0) {p.addPntIdPrdStrt("[");}
		if(patientidentifierperiod.hasStart()) {

			p.addPntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientidentifierperiod.getStart())+"\"");
		} else {
			p.addPntIdPrdStrt("NULL");
		}

		if(patientidentifieri == patientidentifierlist.size()-1) {p.addPntIdPrdStrt("]");}


		/******************** Pnt_Id_Prd_End ********************************************************************************/
		if(patientidentifieri == 0) {p.addPntIdPrdEnd("[");}
		if(patientidentifierperiod.hasEnd()) {

			p.addPntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientidentifierperiod.getEnd())+"\"");
		} else {
			p.addPntIdPrdEnd("NULL");
		}

		if(patientidentifieri == patientidentifierlist.size()-1) {p.addPntIdPrdEnd("]");}


		/******************** patientidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse patientidentifieruse = patientidentifier.getUse();
		if(patientidentifieruse!=null) {
		if(patientidentifieri == 0) {

		p.addPntIdUse("[");		}
			p.addPntIdUse(patientidentifieruse.toCode());
		if(patientidentifieri == patientidentifierlist.size()-1) {

		p.addPntIdUse("]");		}

		} else {
			p.addPntIdUse("NULL");
		}

		/******************** Pnt_Id_Assigner ********************************************************************************/
		if(patientidentifieri == 0) {p.addPntIdAssigner("[");}
		if(patientidentifier.hasAssigner()) {

			if(patientidentifier.getAssigner().getReference() != null) {
			p.addPntIdAssigner(patientidentifier.getAssigner().getReference());
			}
		} else {
			p.addPntIdAssigner("NULL");
		}

		if(patientidentifieri == patientidentifierlist.size()-1) {p.addPntIdAssigner("]");}


		/******************** Pnt_Id_Sys ********************************************************************************/
		if(patientidentifieri == 0) {p.addPntIdSys("[");}
		if(patientidentifier.hasSystem()) {

			p.addPntIdSys(String.valueOf(patientidentifier.getSystem()));
		} else {
			p.addPntIdSys("NULL");
		}

		if(patientidentifieri == patientidentifierlist.size()-1) {p.addPntIdSys("]");}


		 };
		/******************** patientcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Patient.ContactComponent> patientcontactlist = patient.getContact();
		for(int patientcontacti = 0; patientcontacti<patientcontactlist.size();patientcontacti++ ) {
		org.hl7.fhir.r4.model.Patient.ContactComponent  patientcontact = patientcontactlist.get(patientcontacti);

		/******************** patientcontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName patientcontactname = patientcontact.getName();

		/******************** patientcontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactnameperiod = patientcontactname.getPeriod();

		/******************** Pnt_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctNmPrdStrt("[");}
		if(patientcontactnameperiod.hasStart()) {

			p.addPntCntctNmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontactnameperiod.getStart())+"\"");
		} else {
			p.addPntCntctNmPrdStrt("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctNmPrdStrt("]");}


		/******************** Pnt_Cntct_Nm_Prd_End ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctNmPrdEnd("[");}
		if(patientcontactnameperiod.hasEnd()) {

			p.addPntCntctNmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontactnameperiod.getEnd())+"\"");
		} else {
			p.addPntCntctNmPrdEnd("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctNmPrdEnd("]");}


		/******************** Pnt_Cntct_Nm_Given ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctNmGiven("[");}
		if(patientcontactname.hasGiven()) {

			String  array = "[";
			for(int incr=0; incr<patientcontactname.getGiven().size(); incr++) {
				array = array + patientcontactname.getGiven().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntCntctNmGiven(array);

		} else {
			p.addPntCntctNmGiven("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctNmGiven("]");}


		/******************** Pnt_Cntct_Nm_Fmly ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctNmFmly("[");}
		if(patientcontactname.hasFamily()) {

			p.addPntCntctNmFmly(String.valueOf(patientcontactname.getFamily()));
		} else {
			p.addPntCntctNmFmly("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctNmFmly("]");}


		/******************** Pnt_Cntct_Nm_Suffix ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctNmSuffix("[");}
		if(patientcontactname.hasSuffix()) {

			String  array = "[";
			for(int incr=0; incr<patientcontactname.getSuffix().size(); incr++) {
				array = array + patientcontactname.getSuffix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntCntctNmSuffix(array);

		} else {
			p.addPntCntctNmSuffix("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctNmSuffix("]");}


		/******************** patientcontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse patientcontactnameuse = patientcontactname.getUse();
		if(patientcontactnameuse!=null) {
		if(patientcontacti == 0) {

		p.addPntCntctNmUse("[");		}
			p.addPntCntctNmUse(patientcontactnameuse.toCode());
		if(patientcontacti == patientcontactlist.size()-1) {

		p.addPntCntctNmUse("]");		}

		} else {
			p.addPntCntctNmUse("NULL");
		}

		/******************** Pnt_Cntct_Nm_Txt ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctNmTxt("[");}
		if(patientcontactname.hasText()) {

			p.addPntCntctNmTxt(String.valueOf(patientcontactname.getText()));
		} else {
			p.addPntCntctNmTxt("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctNmTxt("]");}


		/******************** Pnt_Cntct_Nm_Prefix ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctNmPrefix("[");}
		if(patientcontactname.hasPrefix()) {

			String  array = "[";
			for(int incr=0; incr<patientcontactname.getPrefix().size(); incr++) {
				array = array + patientcontactname.getPrefix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntCntctNmPrefix(array);

		} else {
			p.addPntCntctNmPrefix("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctNmPrefix("]");}


		/******************** patientcontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address patientcontactaddress = patientcontact.getAddress();

		/******************** Pnt_Cntct_Addr_State ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrState("[");}
		if(patientcontactaddress.hasState()) {

			p.addPntCntctAddrState(String.valueOf(patientcontactaddress.getState()));
		} else {
			p.addPntCntctAddrState("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrState("]");}


		/******************** patientcontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType patientcontactaddresstype = patientcontactaddress.getType();
		if(patientcontactaddresstype!=null) {
		if(patientcontacti == 0) {

		p.addPntCntctAddrTyp("[");		}
			p.addPntCntctAddrTyp(patientcontactaddresstype.toCode());
		if(patientcontacti == patientcontactlist.size()-1) {

		p.addPntCntctAddrTyp("]");		}

		} else {
			p.addPntCntctAddrTyp("NULL");
		}

		/******************** Pnt_Cntct_Addr_Cntry ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrCntry("[");}
		if(patientcontactaddress.hasCountry()) {

			p.addPntCntctAddrCntry(String.valueOf(patientcontactaddress.getCountry()));
		} else {
			p.addPntCntctAddrCntry("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrCntry("]");}


		/******************** patientcontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactaddressperiod = patientcontactaddress.getPeriod();

		/******************** Pnt_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrPrdStrt("[");}
		if(patientcontactaddressperiod.hasStart()) {

			p.addPntCntctAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontactaddressperiod.getStart())+"\"");
		} else {
			p.addPntCntctAddrPrdStrt("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrPrdStrt("]");}


		/******************** Pnt_Cntct_Addr_Prd_End ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrPrdEnd("[");}
		if(patientcontactaddressperiod.hasEnd()) {

			p.addPntCntctAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontactaddressperiod.getEnd())+"\"");
		} else {
			p.addPntCntctAddrPrdEnd("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrPrdEnd("]");}


		/******************** Pnt_Cntct_Addr_District ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrDistrict("[");}
		if(patientcontactaddress.hasDistrict()) {

			p.addPntCntctAddrDistrict(String.valueOf(patientcontactaddress.getDistrict()));
		} else {
			p.addPntCntctAddrDistrict("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrDistrict("]");}


		/******************** Pnt_Cntct_Addr_PostalCd ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrPostalCd("[");}
		if(patientcontactaddress.hasPostalCode()) {

			p.addPntCntctAddrPostalCd(String.valueOf(patientcontactaddress.getPostalCode()));
		} else {
			p.addPntCntctAddrPostalCd("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrPostalCd("]");}


		/******************** Pnt_Cntct_Addr_Line ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrLine("[");}
		if(patientcontactaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<patientcontactaddress.getLine().size(); incr++) {
				array = array + patientcontactaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntCntctAddrLine(array);

		} else {
			p.addPntCntctAddrLine("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrLine("]");}


		/******************** Pnt_Cntct_Addr_City ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrCity("[");}
		if(patientcontactaddress.hasCity()) {

			p.addPntCntctAddrCity(String.valueOf(patientcontactaddress.getCity()));
		} else {
			p.addPntCntctAddrCity("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrCity("]");}


		/******************** patientcontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse patientcontactaddressuse = patientcontactaddress.getUse();
		if(patientcontactaddressuse!=null) {
		if(patientcontacti == 0) {

		p.addPntCntctAddrUse("[");		}
			p.addPntCntctAddrUse(patientcontactaddressuse.toCode());
		if(patientcontacti == patientcontactlist.size()-1) {

		p.addPntCntctAddrUse("]");		}

		} else {
			p.addPntCntctAddrUse("NULL");
		}

		/******************** Pnt_Cntct_Addr_Txt ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctAddrTxt("[");}
		if(patientcontactaddress.hasText()) {

			p.addPntCntctAddrTxt(String.valueOf(patientcontactaddress.getText()));
		} else {
			p.addPntCntctAddrTxt("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctAddrTxt("]");}


		/******************** patientcontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactperiod = patientcontact.getPeriod();

		/******************** Pnt_Cntct_Prd_Strt ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctPrdStrt("[");}
		if(patientcontactperiod.hasStart()) {

			p.addPntCntctPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontactperiod.getStart())+"\"");
		} else {
			p.addPntCntctPrdStrt("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctPrdStrt("]");}


		/******************** Pnt_Cntct_Prd_End ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctPrdEnd("[");}
		if(patientcontactperiod.hasEnd()) {

			p.addPntCntctPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontactperiod.getEnd())+"\"");
		} else {
			p.addPntCntctPrdEnd("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctPrdEnd("]");}


		/******************** Pnt_Cntct_Orgnztn ********************************************************************************/
		if(patientcontacti == 0) {p.addPntCntctOrgnztn("[");}
		if(patientcontact.hasOrganization()) {

			if(patientcontact.getOrganization().getReference() != null) {
			p.addPntCntctOrgnztn(patientcontact.getOrganization().getReference());
			}
		} else {
			p.addPntCntctOrgnztn("NULL");
		}

		if(patientcontacti == patientcontactlist.size()-1) {p.addPntCntctOrgnztn("]");}


		/******************** patientcontactrelationship ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> patientcontactrelationshiplist = patientcontact.getRelationship();
		for(int patientcontactrelationshipi = 0; patientcontactrelationshipi<patientcontactrelationshiplist.size();patientcontactrelationshipi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  patientcontactrelationship = patientcontactrelationshiplist.get(patientcontactrelationshipi);

		/******************** Pnt_Cntct_Rltnship_Txt ********************************************************************************/
		if(patientcontactrelationshipi == 0) {p.addPntCntctRltnshipTxt("[[");}
		if(patientcontactrelationship.hasText()) {

			p.addPntCntctRltnshipTxt(String.valueOf(patientcontactrelationship.getText()));
		} else {
			p.addPntCntctRltnshipTxt("NULL");
		}

		if(patientcontactrelationshipi == patientcontactrelationshiplist.size()-1) {p.addPntCntctRltnshipTxt("]]");}


		/******************** patientcontactrelationshipcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> patientcontactrelationshipcodinglist = patientcontactrelationship.getCoding();
		for(int patientcontactrelationshipcodingi = 0; patientcontactrelationshipcodingi<patientcontactrelationshipcodinglist.size();patientcontactrelationshipcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  patientcontactrelationshipcoding = patientcontactrelationshipcodinglist.get(patientcontactrelationshipcodingi);

		/******************** Pnt_Cntct_Rltnship_Cdg_Dsply ********************************************************************************/
		if(patientcontactrelationshipcodingi == 0) {p.addPntCntctRltnshipCdgDsply("[[[");}
		if(patientcontactrelationshipcoding.hasDisplay()) {

			p.addPntCntctRltnshipCdgDsply(String.valueOf(patientcontactrelationshipcoding.getDisplay()));
		} else {
			p.addPntCntctRltnshipCdgDsply("NULL");
		}

		if(patientcontactrelationshipcodingi == patientcontactrelationshipcodinglist.size()-1) {p.addPntCntctRltnshipCdgDsply("]]]");}


		/******************** Pnt_Cntct_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(patientcontactrelationshipcodingi == 0) {p.addPntCntctRltnshipCdgVrsn("[[[");}
		if(patientcontactrelationshipcoding.hasVersion()) {

			p.addPntCntctRltnshipCdgVrsn(String.valueOf(patientcontactrelationshipcoding.getVersion()));
		} else {
			p.addPntCntctRltnshipCdgVrsn("NULL");
		}

		if(patientcontactrelationshipcodingi == patientcontactrelationshipcodinglist.size()-1) {p.addPntCntctRltnshipCdgVrsn("]]]");}


		/******************** Pnt_Cntct_Rltnship_Cdg_Cd ********************************************************************************/
		if(patientcontactrelationshipcodingi == 0) {p.addPntCntctRltnshipCdgCd("[[[");}
		if(patientcontactrelationshipcoding.hasCode()) {

			p.addPntCntctRltnshipCdgCd(String.valueOf(patientcontactrelationshipcoding.getCode()));
		} else {
			p.addPntCntctRltnshipCdgCd("NULL");
		}

		if(patientcontactrelationshipcodingi == patientcontactrelationshipcodinglist.size()-1) {p.addPntCntctRltnshipCdgCd("]]]");}


		/******************** Pnt_Cntct_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(patientcontactrelationshipcodingi == 0) {p.addPntCntctRltnshipCdgUsrSltd("[[[");}
		if(patientcontactrelationshipcoding.hasUserSelected()) {

			p.addPntCntctRltnshipCdgUsrSltd(String.valueOf(patientcontactrelationshipcoding.getUserSelected()));
		} else {
			p.addPntCntctRltnshipCdgUsrSltd("NULL");
		}

		if(patientcontactrelationshipcodingi == patientcontactrelationshipcodinglist.size()-1) {p.addPntCntctRltnshipCdgUsrSltd("]]]");}


		/******************** Pnt_Cntct_Rltnship_Cdg_Sys ********************************************************************************/
		if(patientcontactrelationshipcodingi == 0) {p.addPntCntctRltnshipCdgSys("[[[");}
		if(patientcontactrelationshipcoding.hasSystem()) {

			p.addPntCntctRltnshipCdgSys(String.valueOf(patientcontactrelationshipcoding.getSystem()));
		} else {
			p.addPntCntctRltnshipCdgSys("NULL");
		}

		if(patientcontactrelationshipcodingi == patientcontactrelationshipcodinglist.size()-1) {p.addPntCntctRltnshipCdgSys("]]]");}


		 };
		 };
		/******************** patientcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> patientcontacttelecomlist = patientcontact.getTelecom();
		for(int patientcontacttelecomi = 0; patientcontacttelecomi<patientcontacttelecomlist.size();patientcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  patientcontacttelecom = patientcontacttelecomlist.get(patientcontacttelecomi);

		/******************** Pnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(patientcontacttelecomi == 0) {p.addPntCntctTlcmVl("[[");}
		if(patientcontacttelecom.hasValue()) {

			p.addPntCntctTlcmVl(String.valueOf(patientcontacttelecom.getValue()));
		} else {
			p.addPntCntctTlcmVl("NULL");
		}

		if(patientcontacttelecomi == patientcontacttelecomlist.size()-1) {p.addPntCntctTlcmVl("]]");}


		/******************** patientcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontacttelecomperiod = patientcontacttelecom.getPeriod();

		/******************** Pnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(patientcontacttelecomi == 0) {p.addPntCntctTlcmPrdStrt("[[");}
		if(patientcontacttelecomperiod.hasStart()) {

			p.addPntCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontacttelecomperiod.getStart())+"\"");
		} else {
			p.addPntCntctTlcmPrdStrt("NULL");
		}

		if(patientcontacttelecomi == patientcontacttelecomlist.size()-1) {p.addPntCntctTlcmPrdStrt("]]");}


		/******************** Pnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(patientcontacttelecomi == 0) {p.addPntCntctTlcmPrdEnd("[[");}
		if(patientcontacttelecomperiod.hasEnd()) {

			p.addPntCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientcontacttelecomperiod.getEnd())+"\"");
		} else {
			p.addPntCntctTlcmPrdEnd("NULL");
		}

		if(patientcontacttelecomi == patientcontacttelecomlist.size()-1) {p.addPntCntctTlcmPrdEnd("]]");}


		/******************** patientcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse patientcontacttelecomuse = patientcontacttelecom.getUse();
		if(patientcontacttelecomuse!=null) {
		if(patientcontacttelecomi == 0) {

		p.addPntCntctTlcmUse("[[");		}
			p.addPntCntctTlcmUse(patientcontacttelecomuse.toCode());
		if(patientcontacttelecomi == patientcontacttelecomlist.size()-1) {

		p.addPntCntctTlcmUse("]]");		}

		} else {
			p.addPntCntctTlcmUse("NULL");
		}

		/******************** patientcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem patientcontacttelecomsystem = patientcontacttelecom.getSystem();
		if(patientcontacttelecomsystem!=null) {
		if(patientcontacttelecomi == 0) {

		p.addPntCntctTlcmSys("[[");		}
			p.addPntCntctTlcmSys(patientcontacttelecomsystem.toCode());
		if(patientcontacttelecomi == patientcontacttelecomlist.size()-1) {

		p.addPntCntctTlcmSys("]]");		}

		} else {
			p.addPntCntctTlcmSys("NULL");
		}

		/******************** Pnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(patientcontacttelecomi == 0) {p.addPntCntctTlcmRnk("[[");}
		if(patientcontacttelecom.hasRank()) {

			p.addPntCntctTlcmRnk(String.valueOf(patientcontacttelecom.getRank()));
		} else {
			p.addPntCntctTlcmRnk("NULL");
		}

		if(patientcontacttelecomi == patientcontacttelecomlist.size()-1) {p.addPntCntctTlcmRnk("]]");}


		 };
		/******************** patientcontactgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender patientcontactgender = patientcontact.getGender();
		if(patientcontactgender!=null) {
			p.addPntCntctGender(patientcontactgender.toCode());
		} else {
			p.addPntCntctGender("NULL");
		}

		 };
		/******************** patientlink ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Patient.PatientLinkComponent> patientlinklist = patient.getLink();
		for(int patientlinki = 0; patientlinki<patientlinklist.size();patientlinki++ ) {
		org.hl7.fhir.r4.model.Patient.PatientLinkComponent  patientlink = patientlinklist.get(patientlinki);

		/******************** patientlinktype ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.LinkType patientlinktype = patientlink.getType();
		if(patientlinktype!=null) {
		if(patientlinki == 0) {

		p.addPntLinkTyp("[");		}
			p.addPntLinkTyp(patientlinktype.toCode());
		if(patientlinki == patientlinklist.size()-1) {

		p.addPntLinkTyp("]");		}

		} else {
			p.addPntLinkTyp("NULL");
		}

		/******************** Pnt_Link_Other ********************************************************************************/
		if(patientlinki == 0) {p.addPntLinkOther("[");}
		if(patientlink.hasOther()) {

			if(patientlink.getOther().getReference() != null) {
			p.addPntLinkOther(patientlink.getOther().getReference());
			}
		} else {
			p.addPntLinkOther("NULL");
		}

		if(patientlinki == patientlinklist.size()-1) {p.addPntLinkOther("]");}


		 };
		/******************** patientmaritalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientmaritalstatus = patient.getMaritalStatus();

		/******************** Pnt_MaritalSts_Txt ********************************************************************************/
		if(patientmaritalstatus.hasText()) {

			p.addPntMaritalStsTxt(String.valueOf(patientmaritalstatus.getText()));
		} else {
			p.addPntMaritalStsTxt("NULL");
		}


		/******************** patientmaritalstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> patientmaritalstatuscodinglist = patientmaritalstatus.getCoding();
		for(int patientmaritalstatuscodingi = 0; patientmaritalstatuscodingi<patientmaritalstatuscodinglist.size();patientmaritalstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  patientmaritalstatuscoding = patientmaritalstatuscodinglist.get(patientmaritalstatuscodingi);

		/******************** Pnt_MaritalSts_Cdg_Dsply ********************************************************************************/
		if(patientmaritalstatuscodingi == 0) {p.addPntMaritalStsCdgDsply("[");}
		if(patientmaritalstatuscoding.hasDisplay()) {

			p.addPntMaritalStsCdgDsply(String.valueOf(patientmaritalstatuscoding.getDisplay()));
		} else {
			p.addPntMaritalStsCdgDsply("NULL");
		}

		if(patientmaritalstatuscodingi == patientmaritalstatuscodinglist.size()-1) {p.addPntMaritalStsCdgDsply("]");}


		/******************** Pnt_MaritalSts_Cdg_Vrsn ********************************************************************************/
		if(patientmaritalstatuscodingi == 0) {p.addPntMaritalStsCdgVrsn("[");}
		if(patientmaritalstatuscoding.hasVersion()) {

			p.addPntMaritalStsCdgVrsn(String.valueOf(patientmaritalstatuscoding.getVersion()));
		} else {
			p.addPntMaritalStsCdgVrsn("NULL");
		}

		if(patientmaritalstatuscodingi == patientmaritalstatuscodinglist.size()-1) {p.addPntMaritalStsCdgVrsn("]");}


		/******************** Pnt_MaritalSts_Cdg_Cd ********************************************************************************/
		if(patientmaritalstatuscodingi == 0) {p.addPntMaritalStsCdgCd("[");}
		if(patientmaritalstatuscoding.hasCode()) {

			p.addPntMaritalStsCdgCd(String.valueOf(patientmaritalstatuscoding.getCode()));
		} else {
			p.addPntMaritalStsCdgCd("NULL");
		}

		if(patientmaritalstatuscodingi == patientmaritalstatuscodinglist.size()-1) {p.addPntMaritalStsCdgCd("]");}


		/******************** Pnt_MaritalSts_Cdg_UsrSltd ********************************************************************************/
		if(patientmaritalstatuscodingi == 0) {p.addPntMaritalStsCdgUsrSltd("[");}
		if(patientmaritalstatuscoding.hasUserSelected()) {

			p.addPntMaritalStsCdgUsrSltd(String.valueOf(patientmaritalstatuscoding.getUserSelected()));
		} else {
			p.addPntMaritalStsCdgUsrSltd("NULL");
		}

		if(patientmaritalstatuscodingi == patientmaritalstatuscodinglist.size()-1) {p.addPntMaritalStsCdgUsrSltd("]");}


		/******************** Pnt_MaritalSts_Cdg_Sys ********************************************************************************/
		if(patientmaritalstatuscodingi == 0) {p.addPntMaritalStsCdgSys("[");}
		if(patientmaritalstatuscoding.hasSystem()) {

			p.addPntMaritalStsCdgSys(String.valueOf(patientmaritalstatuscoding.getSystem()));
		} else {
			p.addPntMaritalStsCdgSys("NULL");
		}

		if(patientmaritalstatuscodingi == patientmaritalstatuscodinglist.size()-1) {p.addPntMaritalStsCdgSys("]");}


		 };
		/******************** Pnt_GeneralPrctitnr ********************************************************************************/
		if(patient.hasGeneralPractitioner()) {

			String  array = "[";
			for(int incr=0; incr<patient.getGeneralPractitioner().size(); incr++) {
				array = array + patient.getGeneralPractitioner().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPntGeneralPrctitnr(array);

		} else {
			p.addPntGeneralPrctitnr("NULL");
		}


		/******************** Pnt_MultipleBirthBooleanTyp ********************************************************************************/
		if(patient.hasMultipleBirthBooleanType()) {

			p.addPntMultipleBirthBooleanTyp("\""+patient.getMultipleBirthBooleanType().getValueAsString()+"\"");
		} else {
			p.addPntMultipleBirthBooleanTyp("NULL");
		}


		/******************** Pnt_DeceasedDtTimeTyp ********************************************************************************/
		if(patient.hasDeceasedDateTimeType()) {

			p.addPntDeceasedDtTimeTyp("\""+patient.getDeceasedDateTimeType().getValueAsString()+"\"");
		} else {
			p.addPntDeceasedDtTimeTyp("NULL");
		}


		/******************** Pnt_DeceasedBooleanTyp ********************************************************************************/
		if(patient.hasDeceasedBooleanType()) {

			p.addPntDeceasedBooleanTyp("\""+patient.getDeceasedBooleanType().getValueAsString()+"\"");
		} else {
			p.addPntDeceasedBooleanTyp("NULL");
		}


		/******************** Pnt_MultipleBirthIntegerTyp ********************************************************************************/
		if(patient.hasMultipleBirthIntegerType()) {

			p.addPntMultipleBirthIntegerTyp("\""+patient.getMultipleBirthIntegerType().getValueAsString()+"\"");
		} else {
			p.addPntMultipleBirthIntegerTyp("NULL");
		}


		/******************** Pnt_Active ********************************************************************************/
		if(patient.hasActive()) {

			p.addPntActive(String.valueOf(patient.getActive()));
		} else {
			p.addPntActive("NULL");
		}


		/******************** patientphoto ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> patientphotolist = patient.getPhoto();
		for(int patientphotoi = 0; patientphotoi<patientphotolist.size();patientphotoi++ ) {
		org.hl7.fhir.r4.model.Attachment  patientphoto = patientphotolist.get(patientphotoi);

		/******************** Pnt_Photo_Sz ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoSz("[");}
		if(patientphoto.hasSize()) {

			p.addPntPhotoSz(String.valueOf(patientphoto.getSize()));
		} else {
			p.addPntPhotoSz("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoSz("]");}


		/******************** Pnt_Photo_Lnguage ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoLnguage("[");}
		if(patientphoto.hasLanguage()) {

			p.addPntPhotoLnguage(String.valueOf(patientphoto.getLanguage()));
		} else {
			p.addPntPhotoLnguage("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoLnguage("]");}


		/******************** Pnt_Photo_CntntTyp ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoCntntTyp("[");}
		if(patientphoto.hasContentType()) {

			p.addPntPhotoCntntTyp(String.valueOf(patientphoto.getContentType()));
		} else {
			p.addPntPhotoCntntTyp("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoCntntTyp("]");}


		/******************** Pnt_Photo_Hash ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoHash("[");}
		if(patientphoto.hasHash()) {

			p.addPntPhotoHash(new String(patientphoto.getHash()));
		} else {
			p.addPntPhotoHash("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoHash("]");}


		/******************** Pnt_Photo_Data ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoData("[");}
		if(patientphoto.hasData()) {

			p.addPntPhotoData(new String(patientphoto.getData()));
		} else {
			p.addPntPhotoData("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoData("]");}


		/******************** Pnt_Photo_Creation ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoCreation("[");}
		if(patientphoto.hasCreation()) {

			p.addPntPhotoCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(patientphoto.getCreation())+"\"");
		} else {
			p.addPntPhotoCreation("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoCreation("]");}


		/******************** Pnt_Photo_Ttl ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoTtl("[");}
		if(patientphoto.hasTitle()) {

			p.addPntPhotoTtl(String.valueOf(patientphoto.getTitle()));
		} else {
			p.addPntPhotoTtl("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoTtl("]");}


		/******************** Pnt_Photo_Url ********************************************************************************/
		if(patientphotoi == 0) {p.addPntPhotoUrl("[");}
		if(patientphoto.hasUrl()) {

			p.addPntPhotoUrl(String.valueOf(patientphoto.getUrl()));
		} else {
			p.addPntPhotoUrl("NULL");
		}

		if(patientphotoi == patientphotolist.size()-1) {p.addPntPhotoUrl("]");}


		 };
		/******************** patienttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> patienttelecomlist = patient.getTelecom();
		for(int patienttelecomi = 0; patienttelecomi<patienttelecomlist.size();patienttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  patienttelecom = patienttelecomlist.get(patienttelecomi);

		/******************** Pnt_Tlcm_Vl ********************************************************************************/
		if(patienttelecomi == 0) {p.addPntTlcmVl("[");}
		if(patienttelecom.hasValue()) {

			p.addPntTlcmVl(String.valueOf(patienttelecom.getValue()));
		} else {
			p.addPntTlcmVl("NULL");
		}

		if(patienttelecomi == patienttelecomlist.size()-1) {p.addPntTlcmVl("]");}


		/******************** patienttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patienttelecomperiod = patienttelecom.getPeriod();

		/******************** Pnt_Tlcm_Prd_Strt ********************************************************************************/
		if(patienttelecomi == 0) {p.addPntTlcmPrdStrt("[");}
		if(patienttelecomperiod.hasStart()) {

			p.addPntTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patienttelecomperiod.getStart())+"\"");
		} else {
			p.addPntTlcmPrdStrt("NULL");
		}

		if(patienttelecomi == patienttelecomlist.size()-1) {p.addPntTlcmPrdStrt("]");}


		/******************** Pnt_Tlcm_Prd_End ********************************************************************************/
		if(patienttelecomi == 0) {p.addPntTlcmPrdEnd("[");}
		if(patienttelecomperiod.hasEnd()) {

			p.addPntTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(patienttelecomperiod.getEnd())+"\"");
		} else {
			p.addPntTlcmPrdEnd("NULL");
		}

		if(patienttelecomi == patienttelecomlist.size()-1) {p.addPntTlcmPrdEnd("]");}


		/******************** patienttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse patienttelecomuse = patienttelecom.getUse();
		if(patienttelecomuse!=null) {
		if(patienttelecomi == 0) {

		p.addPntTlcmUse("[");		}
			p.addPntTlcmUse(patienttelecomuse.toCode());
		if(patienttelecomi == patienttelecomlist.size()-1) {

		p.addPntTlcmUse("]");		}

		} else {
			p.addPntTlcmUse("NULL");
		}

		/******************** patienttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem patienttelecomsystem = patienttelecom.getSystem();
		if(patienttelecomsystem!=null) {
		if(patienttelecomi == 0) {

		p.addPntTlcmSys("[");		}
			p.addPntTlcmSys(patienttelecomsystem.toCode());
		if(patienttelecomi == patienttelecomlist.size()-1) {

		p.addPntTlcmSys("]");		}

		} else {
			p.addPntTlcmSys("NULL");
		}

		/******************** Pnt_Tlcm_Rnk ********************************************************************************/
		if(patienttelecomi == 0) {p.addPntTlcmRnk("[");}
		if(patienttelecom.hasRank()) {

			p.addPntTlcmRnk(String.valueOf(patienttelecom.getRank()));
		} else {
			p.addPntTlcmRnk("NULL");
		}

		if(patienttelecomi == patienttelecomlist.size()-1) {p.addPntTlcmRnk("]");}


		 };
		/******************** patientgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender patientgender = patient.getGender();
		if(patientgender!=null) {
			p.addPntGender(patientgender.toCode());
		} else {
			p.addPntGender("NULL");
		}

		/******************** Pnt_BirthDt ********************************************************************************/
		if(patient.hasBirthDate()) {

			p.addPntBirthDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(patient.getBirthDate())+"\"");
		} else {
			p.addPntBirthDt("NULL");
		}


		/******************** patientcommunication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent> patientcommunicationlist = patient.getCommunication();
		for(int patientcommunicationi = 0; patientcommunicationi<patientcommunicationlist.size();patientcommunicationi++ ) {
		org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent  patientcommunication = patientcommunicationlist.get(patientcommunicationi);

		/******************** patientcommunicationlanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientcommunicationlanguage = patientcommunication.getLanguage();

		/******************** Pnt_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(patientcommunicationi == 0) {p.addPntCmmnctnLnguageTxt("[");}
		if(patientcommunicationlanguage.hasText()) {

			p.addPntCmmnctnLnguageTxt(String.valueOf(patientcommunicationlanguage.getText()));
		} else {
			p.addPntCmmnctnLnguageTxt("NULL");
		}

		if(patientcommunicationi == patientcommunicationlist.size()-1) {p.addPntCmmnctnLnguageTxt("]");}


		/******************** patientcommunicationlanguagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> patientcommunicationlanguagecodinglist = patientcommunicationlanguage.getCoding();
		for(int patientcommunicationlanguagecodingi = 0; patientcommunicationlanguagecodingi<patientcommunicationlanguagecodinglist.size();patientcommunicationlanguagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  patientcommunicationlanguagecoding = patientcommunicationlanguagecodinglist.get(patientcommunicationlanguagecodingi);

		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(patientcommunicationlanguagecodingi == 0) {p.addPntCmmnctnLnguageCdgDsply("[[");}
		if(patientcommunicationlanguagecoding.hasDisplay()) {

			p.addPntCmmnctnLnguageCdgDsply(String.valueOf(patientcommunicationlanguagecoding.getDisplay()));
		} else {
			p.addPntCmmnctnLnguageCdgDsply("NULL");
		}

		if(patientcommunicationlanguagecodingi == patientcommunicationlanguagecodinglist.size()-1) {p.addPntCmmnctnLnguageCdgDsply("]]");}


		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(patientcommunicationlanguagecodingi == 0) {p.addPntCmmnctnLnguageCdgVrsn("[[");}
		if(patientcommunicationlanguagecoding.hasVersion()) {

			p.addPntCmmnctnLnguageCdgVrsn(String.valueOf(patientcommunicationlanguagecoding.getVersion()));
		} else {
			p.addPntCmmnctnLnguageCdgVrsn("NULL");
		}

		if(patientcommunicationlanguagecodingi == patientcommunicationlanguagecodinglist.size()-1) {p.addPntCmmnctnLnguageCdgVrsn("]]");}


		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(patientcommunicationlanguagecodingi == 0) {p.addPntCmmnctnLnguageCdgCd("[[");}
		if(patientcommunicationlanguagecoding.hasCode()) {

			p.addPntCmmnctnLnguageCdgCd(String.valueOf(patientcommunicationlanguagecoding.getCode()));
		} else {
			p.addPntCmmnctnLnguageCdgCd("NULL");
		}

		if(patientcommunicationlanguagecodingi == patientcommunicationlanguagecodinglist.size()-1) {p.addPntCmmnctnLnguageCdgCd("]]");}


		/******************** Pnt_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(patientcommunicationlanguagecodingi == 0) {p.addPntCmmnctnLnguageCdgUsrSltd("[[");}
		if(patientcommunicationlanguagecoding.hasUserSelected()) {

			p.addPntCmmnctnLnguageCdgUsrSltd(String.valueOf(patientcommunicationlanguagecoding.getUserSelected()));
		} else {
			p.addPntCmmnctnLnguageCdgUsrSltd("NULL");
		}

		if(patientcommunicationlanguagecodingi == patientcommunicationlanguagecodinglist.size()-1) {p.addPntCmmnctnLnguageCdgUsrSltd("]]");}


		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(patientcommunicationlanguagecodingi == 0) {p.addPntCmmnctnLnguageCdgSys("[[");}
		if(patientcommunicationlanguagecoding.hasSystem()) {

			p.addPntCmmnctnLnguageCdgSys(String.valueOf(patientcommunicationlanguagecoding.getSystem()));
		} else {
			p.addPntCmmnctnLnguageCdgSys("NULL");
		}

		if(patientcommunicationlanguagecodingi == patientcommunicationlanguagecodinglist.size()-1) {p.addPntCmmnctnLnguageCdgSys("]]");}


		 };
		/******************** Pnt_Cmmnctn_Preferred ********************************************************************************/
		if(patientcommunicationi == 0) {p.addPntCmmnctnPreferred("[");}
		if(patientcommunication.hasPreferred()) {

			p.addPntCmmnctnPreferred(String.valueOf(patientcommunication.getPreferred()));
		} else {
			p.addPntCmmnctnPreferred("NULL");
		}

		if(patientcommunicationi == patientcommunicationlist.size()-1) {p.addPntCmmnctnPreferred("]");}


		 };
		/******************** Pnt_ManagingOrgnztn ********************************************************************************/
		if(patient.hasManagingOrganization()) {

			if(patient.getManagingOrganization().getReference() != null) {
			p.addPntManagingOrgnztn(patient.getManagingOrganization().getReference());
			}
		} else {
			p.addPntManagingOrgnztn("NULL");
		}

		/******************** PNT_RACE **************************************************************************************
		 * PNT_RACE maps to Patient / extension / race / coding / code
		 ********************************************************************************************************************/
		
//		org.hl7.fhir.r4.model.Extension race = new org.hl7.fhir.r4.model.Extension().setUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race").setValue(new org.hl7.fhir.r4.model.Coding().setCode(p.getPntRace()).setSystem(p.getPntRaceSystem()).setDisplay(p.getPntRaceDisplay())); 
		Extension raceex = patient.getExtensionByUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race");
		if(raceex != null ) {
			
			if(raceex.getValue() != null) {
				p.setPntRaceSystem(((Coding) raceex.getValue()).getSystem());
				p.setPntRaceDisplay(((Coding) raceex.getValue()).getDisplay());
				p.setPntRace(((Coding) raceex.getValue()).getCode());
			} else {
				if(raceex.getExtensionByUrl("ombCategory") != null) {
					//System.out.println(((Coding) raceex.getExtensionByUrl("ombCategory").getValue()).getCode());
					p.setPntRaceSystem(((Coding) raceex.getExtensionByUrl("ombCategory").getValue()).getSystem());
					p.setPntRaceDisplay(((Coding) raceex.getExtensionByUrl("ombCategory").getValue()).getDisplay());
					p.setPntRace(((Coding) raceex.getExtensionByUrl("ombCategory").getValue()).getCode());
				}
			}
		}
		/******************** PNT_ETHNICITY *********************************************************************************
		 * PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code
		 ********************************************************************************************************************/
		Extension ethex = patient.getExtensionByUrl("https://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity");
		if(ethex != null ) {
//			System.out.println(ethex.getValue());
			if(ethex.getValue() != null) {
				p.setPntEthSystem(((Coding) ethex.getValue()).getSystem());
				p.setPntEthDisplay(((Coding) ethex.getValue()).getDisplay());
				p.setPntEth(((Coding) ethex.getValue()).getCode());
			}  else {
				if(ethex.getExtensionByUrl("ombCategory") != null) {
					//System.out.println(((Coding) raceex.getExtensionByUrl("ombCategory").getValue()).getCode());
					p.setPntEthSystem(((Coding) ethex.getExtensionByUrl("ombCategory").getValue()).getSystem());
					p.setPntEthDisplay(((Coding) ethex.getExtensionByUrl("ombCategory").getValue()).getDisplay());
					p.setPntEth(((Coding) ethex.getExtensionByUrl("ombCategory").getValue()).getCode());
				}
			}
		}

//		org.hl7.fhir.r4.model.Extension ethnicity = new org.hl7.fhir.r4.model.Extension().setUrl("http://terminology.hl7.org/ValueSet/v3-Ethnicity").setValue(new org.hl7.fhir.r4.model.Coding().setCode(p.getPntEth()).setDisplay(p.getPntEthDisplay()).setSystem(p.getPntEthSystem())); 
//		patient.addExtension(ethnicity);
		return p;
	}
}
