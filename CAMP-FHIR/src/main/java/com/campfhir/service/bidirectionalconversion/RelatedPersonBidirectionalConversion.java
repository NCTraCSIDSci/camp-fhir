package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RelatedPerson;
public class RelatedPersonBidirectionalConversion 
{
	public RelatedPerson RelatedPersons(org.hl7.fhir.r4.model.RelatedPerson relatedperson) throws ParseException
	{
		 main.java.com.campfhir.model.RelatedPerson r = new  main.java.com.campfhir.model.RelatedPerson();

		/******************** id ********************************************************************************/
		r.setId(relatedperson.getIdElement().getIdPart());

		/******************** relatedpersonname ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.HumanName> relatedpersonnamelist = relatedperson.getName();
		for(int relatedpersonnamei = 0; relatedpersonnamei<relatedpersonnamelist.size();relatedpersonnamei++ ) {
		org.hl7.fhir.r4.model.HumanName  relatedpersonname = relatedpersonnamelist.get(relatedpersonnamei);

		/******************** relatedpersonnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonnameperiod = relatedpersonname.getPeriod();

		/******************** RltedPrsn_Nm_Prd_Strt ********************************************************************************/
		if(relatedpersonnamei == 0) {r.addRltedPrsnNmPrdStrt("[");}
		if(relatedpersonnameperiod.hasStart()) {

			r.addRltedPrsnNmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonnameperiod.getStart())+"\"");
		} else {
			r.addRltedPrsnNmPrdStrt("NULL");
		}

		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {r.addRltedPrsnNmPrdStrt("]");}


		/******************** RltedPrsn_Nm_Prd_End ********************************************************************************/
		if(relatedpersonnamei == 0) {r.addRltedPrsnNmPrdEnd("[");}
		if(relatedpersonnameperiod.hasEnd()) {

			r.addRltedPrsnNmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonnameperiod.getEnd())+"\"");
		} else {
			r.addRltedPrsnNmPrdEnd("NULL");
		}

		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {r.addRltedPrsnNmPrdEnd("]");}


		/******************** RltedPrsn_Nm_Given ********************************************************************************/
		if(relatedpersonnamei == 0) {r.addRltedPrsnNmGiven("[");}
		if(relatedpersonname.hasGiven()) {

			String  array = "[";
			for(int incr=0; incr<relatedpersonname.getGiven().size(); incr++) {
				array = array + relatedpersonname.getGiven().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRltedPrsnNmGiven(array);

		} else {
			r.addRltedPrsnNmGiven("NULL");
		}

		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {r.addRltedPrsnNmGiven("]");}


		/******************** RltedPrsn_Nm_Fmly ********************************************************************************/
		if(relatedpersonnamei == 0) {r.addRltedPrsnNmFmly("[");}
		if(relatedpersonname.hasFamily()) {

			r.addRltedPrsnNmFmly(String.valueOf(relatedpersonname.getFamily()));
		} else {
			r.addRltedPrsnNmFmly("NULL");
		}

		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {r.addRltedPrsnNmFmly("]");}


		/******************** RltedPrsn_Nm_Suffix ********************************************************************************/
		if(relatedpersonnamei == 0) {r.addRltedPrsnNmSuffix("[");}
		if(relatedpersonname.hasSuffix()) {

			String  array = "[";
			for(int incr=0; incr<relatedpersonname.getSuffix().size(); incr++) {
				array = array + relatedpersonname.getSuffix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRltedPrsnNmSuffix(array);

		} else {
			r.addRltedPrsnNmSuffix("NULL");
		}

		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {r.addRltedPrsnNmSuffix("]");}


		/******************** relatedpersonnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse relatedpersonnameuse = relatedpersonname.getUse();
		if(relatedpersonnameuse!=null) {
		if(relatedpersonnamei == 0) {

		r.addRltedPrsnNmUse("[");		}
			r.addRltedPrsnNmUse(relatedpersonnameuse.toCode());
		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {

		r.addRltedPrsnNmUse("]");		}

		} else {
			r.addRltedPrsnNmUse("NULL");
		}

		/******************** RltedPrsn_Nm_Txt ********************************************************************************/
		if(relatedpersonnamei == 0) {r.addRltedPrsnNmTxt("[");}
		if(relatedpersonname.hasText()) {

			r.addRltedPrsnNmTxt(String.valueOf(relatedpersonname.getText()));
		} else {
			r.addRltedPrsnNmTxt("NULL");
		}

		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {r.addRltedPrsnNmTxt("]");}


		/******************** RltedPrsn_Nm_Prefix ********************************************************************************/
		if(relatedpersonnamei == 0) {r.addRltedPrsnNmPrefix("[");}
		if(relatedpersonname.hasPrefix()) {

			String  array = "[";
			for(int incr=0; incr<relatedpersonname.getPrefix().size(); incr++) {
				array = array + relatedpersonname.getPrefix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRltedPrsnNmPrefix(array);

		} else {
			r.addRltedPrsnNmPrefix("NULL");
		}

		if(relatedpersonnamei == relatedpersonnamelist.size()-1) {r.addRltedPrsnNmPrefix("]");}


		 };
		/******************** relatedpersonaddress ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Address> relatedpersonaddresslist = relatedperson.getAddress();
		for(int relatedpersonaddressi = 0; relatedpersonaddressi<relatedpersonaddresslist.size();relatedpersonaddressi++ ) {
		org.hl7.fhir.r4.model.Address  relatedpersonaddress = relatedpersonaddresslist.get(relatedpersonaddressi);

		/******************** RltedPrsn_Addr_State ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrState("[");}
		if(relatedpersonaddress.hasState()) {

			r.addRltedPrsnAddrState(String.valueOf(relatedpersonaddress.getState()));
		} else {
			r.addRltedPrsnAddrState("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrState("]");}


		/******************** relatedpersonaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType relatedpersonaddresstype = relatedpersonaddress.getType();
		if(relatedpersonaddresstype!=null) {
		if(relatedpersonaddressi == 0) {

		r.addRltedPrsnAddrTyp("[");		}
			r.addRltedPrsnAddrTyp(relatedpersonaddresstype.toCode());
		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {

		r.addRltedPrsnAddrTyp("]");		}

		} else {
			r.addRltedPrsnAddrTyp("NULL");
		}

		/******************** RltedPrsn_Addr_Cntry ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrCntry("[");}
		if(relatedpersonaddress.hasCountry()) {

			r.addRltedPrsnAddrCntry(String.valueOf(relatedpersonaddress.getCountry()));
		} else {
			r.addRltedPrsnAddrCntry("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrCntry("]");}


		/******************** relatedpersonaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonaddressperiod = relatedpersonaddress.getPeriod();

		/******************** RltedPrsn_Addr_Prd_Strt ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrPrdStrt("[");}
		if(relatedpersonaddressperiod.hasStart()) {

			r.addRltedPrsnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonaddressperiod.getStart())+"\"");
		} else {
			r.addRltedPrsnAddrPrdStrt("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrPrdStrt("]");}


		/******************** RltedPrsn_Addr_Prd_End ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrPrdEnd("[");}
		if(relatedpersonaddressperiod.hasEnd()) {

			r.addRltedPrsnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonaddressperiod.getEnd())+"\"");
		} else {
			r.addRltedPrsnAddrPrdEnd("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrPrdEnd("]");}


		/******************** RltedPrsn_Addr_District ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrDistrict("[");}
		if(relatedpersonaddress.hasDistrict()) {

			r.addRltedPrsnAddrDistrict(String.valueOf(relatedpersonaddress.getDistrict()));
		} else {
			r.addRltedPrsnAddrDistrict("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrDistrict("]");}


		/******************** RltedPrsn_Addr_PostalCd ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrPostalCd("[");}
		if(relatedpersonaddress.hasPostalCode()) {

			r.addRltedPrsnAddrPostalCd(String.valueOf(relatedpersonaddress.getPostalCode()));
		} else {
			r.addRltedPrsnAddrPostalCd("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrPostalCd("]");}


		/******************** RltedPrsn_Addr_Line ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrLine("[");}
		if(relatedpersonaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<relatedpersonaddress.getLine().size(); incr++) {
				array = array + relatedpersonaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRltedPrsnAddrLine(array);

		} else {
			r.addRltedPrsnAddrLine("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrLine("]");}


		/******************** RltedPrsn_Addr_City ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrCity("[");}
		if(relatedpersonaddress.hasCity()) {

			r.addRltedPrsnAddrCity(String.valueOf(relatedpersonaddress.getCity()));
		} else {
			r.addRltedPrsnAddrCity("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrCity("]");}


		/******************** relatedpersonaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse relatedpersonaddressuse = relatedpersonaddress.getUse();
		if(relatedpersonaddressuse!=null) {
		if(relatedpersonaddressi == 0) {

		r.addRltedPrsnAddrUse("[");		}
			r.addRltedPrsnAddrUse(relatedpersonaddressuse.toCode());
		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {

		r.addRltedPrsnAddrUse("]");		}

		} else {
			r.addRltedPrsnAddrUse("NULL");
		}

		/******************** RltedPrsn_Addr_Txt ********************************************************************************/
		if(relatedpersonaddressi == 0) {r.addRltedPrsnAddrTxt("[");}
		if(relatedpersonaddress.hasText()) {

			r.addRltedPrsnAddrTxt(String.valueOf(relatedpersonaddress.getText()));
		} else {
			r.addRltedPrsnAddrTxt("NULL");
		}

		if(relatedpersonaddressi == relatedpersonaddresslist.size()-1) {r.addRltedPrsnAddrTxt("]");}


		 };
		/******************** relatedpersonperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonperiod = relatedperson.getPeriod();

		/******************** RltedPrsn_Prd_Strt ********************************************************************************/
		if(relatedpersonperiod.hasStart()) {

			r.addRltedPrsnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonperiod.getStart())+"\"");
		} else {
			r.addRltedPrsnPrdStrt("NULL");
		}


		/******************** RltedPrsn_Prd_End ********************************************************************************/
		if(relatedpersonperiod.hasEnd()) {

			r.addRltedPrsnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonperiod.getEnd())+"\"");
		} else {
			r.addRltedPrsnPrdEnd("NULL");
		}


		/******************** relatedpersonidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> relatedpersonidentifierlist = relatedperson.getIdentifier();
		for(int relatedpersonidentifieri = 0; relatedpersonidentifieri<relatedpersonidentifierlist.size();relatedpersonidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  relatedpersonidentifier = relatedpersonidentifierlist.get(relatedpersonidentifieri);

		/******************** RltedPrsn_Id_Vl ********************************************************************************/
		if(relatedpersonidentifieri == 0) {r.addRltedPrsnIdVl("[");}
		if(relatedpersonidentifier.hasValue()) {

			r.addRltedPrsnIdVl(String.valueOf(relatedpersonidentifier.getValue()));
		} else {
			r.addRltedPrsnIdVl("NULL");
		}

		if(relatedpersonidentifieri == relatedpersonidentifierlist.size()-1) {r.addRltedPrsnIdVl("]");}


		/******************** relatedpersonidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersonidentifiertype = relatedpersonidentifier.getType();

		/******************** RltedPrsn_Id_Typ_Txt ********************************************************************************/
		if(relatedpersonidentifieri == 0) {r.addRltedPrsnIdTypTxt("[");}
		if(relatedpersonidentifiertype.hasText()) {

			r.addRltedPrsnIdTypTxt(String.valueOf(relatedpersonidentifiertype.getText()));
		} else {
			r.addRltedPrsnIdTypTxt("NULL");
		}

		if(relatedpersonidentifieri == relatedpersonidentifierlist.size()-1) {r.addRltedPrsnIdTypTxt("]");}


		/******************** relatedpersonidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> relatedpersonidentifiertypecodinglist = relatedpersonidentifiertype.getCoding();
		for(int relatedpersonidentifiertypecodingi = 0; relatedpersonidentifiertypecodingi<relatedpersonidentifiertypecodinglist.size();relatedpersonidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  relatedpersonidentifiertypecoding = relatedpersonidentifiertypecodinglist.get(relatedpersonidentifiertypecodingi);

		/******************** RltedPrsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(relatedpersonidentifiertypecodingi == 0) {r.addRltedPrsnIdTypCdgDsply("[[");}
		if(relatedpersonidentifiertypecoding.hasDisplay()) {

			r.addRltedPrsnIdTypCdgDsply(String.valueOf(relatedpersonidentifiertypecoding.getDisplay()));
		} else {
			r.addRltedPrsnIdTypCdgDsply("NULL");
		}

		if(relatedpersonidentifiertypecodingi == relatedpersonidentifiertypecodinglist.size()-1) {r.addRltedPrsnIdTypCdgDsply("]]");}


		/******************** RltedPrsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(relatedpersonidentifiertypecodingi == 0) {r.addRltedPrsnIdTypCdgVrsn("[[");}
		if(relatedpersonidentifiertypecoding.hasVersion()) {

			r.addRltedPrsnIdTypCdgVrsn(String.valueOf(relatedpersonidentifiertypecoding.getVersion()));
		} else {
			r.addRltedPrsnIdTypCdgVrsn("NULL");
		}

		if(relatedpersonidentifiertypecodingi == relatedpersonidentifiertypecodinglist.size()-1) {r.addRltedPrsnIdTypCdgVrsn("]]");}


		/******************** RltedPrsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(relatedpersonidentifiertypecodingi == 0) {r.addRltedPrsnIdTypCdgCd("[[");}
		if(relatedpersonidentifiertypecoding.hasCode()) {

			r.addRltedPrsnIdTypCdgCd(String.valueOf(relatedpersonidentifiertypecoding.getCode()));
		} else {
			r.addRltedPrsnIdTypCdgCd("NULL");
		}

		if(relatedpersonidentifiertypecodingi == relatedpersonidentifiertypecodinglist.size()-1) {r.addRltedPrsnIdTypCdgCd("]]");}


		/******************** RltedPrsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(relatedpersonidentifiertypecodingi == 0) {r.addRltedPrsnIdTypCdgUsrSltd("[[");}
		if(relatedpersonidentifiertypecoding.hasUserSelected()) {

			r.addRltedPrsnIdTypCdgUsrSltd(String.valueOf(relatedpersonidentifiertypecoding.getUserSelected()));
		} else {
			r.addRltedPrsnIdTypCdgUsrSltd("NULL");
		}

		if(relatedpersonidentifiertypecodingi == relatedpersonidentifiertypecodinglist.size()-1) {r.addRltedPrsnIdTypCdgUsrSltd("]]");}


		/******************** RltedPrsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(relatedpersonidentifiertypecodingi == 0) {r.addRltedPrsnIdTypCdgSys("[[");}
		if(relatedpersonidentifiertypecoding.hasSystem()) {

			r.addRltedPrsnIdTypCdgSys(String.valueOf(relatedpersonidentifiertypecoding.getSystem()));
		} else {
			r.addRltedPrsnIdTypCdgSys("NULL");
		}

		if(relatedpersonidentifiertypecodingi == relatedpersonidentifiertypecodinglist.size()-1) {r.addRltedPrsnIdTypCdgSys("]]");}


		 };
		/******************** relatedpersonidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonidentifierperiod = relatedpersonidentifier.getPeriod();

		/******************** RltedPrsn_Id_Prd_Strt ********************************************************************************/
		if(relatedpersonidentifieri == 0) {r.addRltedPrsnIdPrdStrt("[");}
		if(relatedpersonidentifierperiod.hasStart()) {

			r.addRltedPrsnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonidentifierperiod.getStart())+"\"");
		} else {
			r.addRltedPrsnIdPrdStrt("NULL");
		}

		if(relatedpersonidentifieri == relatedpersonidentifierlist.size()-1) {r.addRltedPrsnIdPrdStrt("]");}


		/******************** RltedPrsn_Id_Prd_End ********************************************************************************/
		if(relatedpersonidentifieri == 0) {r.addRltedPrsnIdPrdEnd("[");}
		if(relatedpersonidentifierperiod.hasEnd()) {

			r.addRltedPrsnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonidentifierperiod.getEnd())+"\"");
		} else {
			r.addRltedPrsnIdPrdEnd("NULL");
		}

		if(relatedpersonidentifieri == relatedpersonidentifierlist.size()-1) {r.addRltedPrsnIdPrdEnd("]");}


		/******************** relatedpersonidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse relatedpersonidentifieruse = relatedpersonidentifier.getUse();
		if(relatedpersonidentifieruse!=null) {
		if(relatedpersonidentifieri == 0) {

		r.addRltedPrsnIdUse("[");		}
			r.addRltedPrsnIdUse(relatedpersonidentifieruse.toCode());
		if(relatedpersonidentifieri == relatedpersonidentifierlist.size()-1) {

		r.addRltedPrsnIdUse("]");		}

		} else {
			r.addRltedPrsnIdUse("NULL");
		}

		/******************** RltedPrsn_Id_Assigner ********************************************************************************/
		if(relatedpersonidentifieri == 0) {r.addRltedPrsnIdAssigner("[");}
		if(relatedpersonidentifier.hasAssigner()) {

			if(relatedpersonidentifier.getAssigner().getReference() != null) {
			r.addRltedPrsnIdAssigner(relatedpersonidentifier.getAssigner().getReference());
			}
		} else {
			r.addRltedPrsnIdAssigner("NULL");
		}

		if(relatedpersonidentifieri == relatedpersonidentifierlist.size()-1) {r.addRltedPrsnIdAssigner("]");}


		/******************** RltedPrsn_Id_Sys ********************************************************************************/
		if(relatedpersonidentifieri == 0) {r.addRltedPrsnIdSys("[");}
		if(relatedpersonidentifier.hasSystem()) {

			r.addRltedPrsnIdSys(String.valueOf(relatedpersonidentifier.getSystem()));
		} else {
			r.addRltedPrsnIdSys("NULL");
		}

		if(relatedpersonidentifieri == relatedpersonidentifierlist.size()-1) {r.addRltedPrsnIdSys("]");}


		 };
		/******************** relatedpersonrelationship ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> relatedpersonrelationshiplist = relatedperson.getRelationship();
		for(int relatedpersonrelationshipi = 0; relatedpersonrelationshipi<relatedpersonrelationshiplist.size();relatedpersonrelationshipi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  relatedpersonrelationship = relatedpersonrelationshiplist.get(relatedpersonrelationshipi);

		/******************** RltedPrsn_Rltnship_Txt ********************************************************************************/
		if(relatedpersonrelationshipi == 0) {r.addRltedPrsnRltnshipTxt("[");}
		if(relatedpersonrelationship.hasText()) {

			r.addRltedPrsnRltnshipTxt(String.valueOf(relatedpersonrelationship.getText()));
		} else {
			r.addRltedPrsnRltnshipTxt("NULL");
		}

		if(relatedpersonrelationshipi == relatedpersonrelationshiplist.size()-1) {r.addRltedPrsnRltnshipTxt("]");}


		/******************** relatedpersonrelationshipcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> relatedpersonrelationshipcodinglist = relatedpersonrelationship.getCoding();
		for(int relatedpersonrelationshipcodingi = 0; relatedpersonrelationshipcodingi<relatedpersonrelationshipcodinglist.size();relatedpersonrelationshipcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  relatedpersonrelationshipcoding = relatedpersonrelationshipcodinglist.get(relatedpersonrelationshipcodingi);

		/******************** RltedPrsn_Rltnship_Cdg_Dsply ********************************************************************************/
		if(relatedpersonrelationshipcodingi == 0) {r.addRltedPrsnRltnshipCdgDsply("[[");}
		if(relatedpersonrelationshipcoding.hasDisplay()) {

			r.addRltedPrsnRltnshipCdgDsply(String.valueOf(relatedpersonrelationshipcoding.getDisplay()));
		} else {
			r.addRltedPrsnRltnshipCdgDsply("NULL");
		}

		if(relatedpersonrelationshipcodingi == relatedpersonrelationshipcodinglist.size()-1) {r.addRltedPrsnRltnshipCdgDsply("]]");}


		/******************** RltedPrsn_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(relatedpersonrelationshipcodingi == 0) {r.addRltedPrsnRltnshipCdgVrsn("[[");}
		if(relatedpersonrelationshipcoding.hasVersion()) {

			r.addRltedPrsnRltnshipCdgVrsn(String.valueOf(relatedpersonrelationshipcoding.getVersion()));
		} else {
			r.addRltedPrsnRltnshipCdgVrsn("NULL");
		}

		if(relatedpersonrelationshipcodingi == relatedpersonrelationshipcodinglist.size()-1) {r.addRltedPrsnRltnshipCdgVrsn("]]");}


		/******************** RltedPrsn_Rltnship_Cdg_Cd ********************************************************************************/
		if(relatedpersonrelationshipcodingi == 0) {r.addRltedPrsnRltnshipCdgCd("[[");}
		if(relatedpersonrelationshipcoding.hasCode()) {

			r.addRltedPrsnRltnshipCdgCd(String.valueOf(relatedpersonrelationshipcoding.getCode()));
		} else {
			r.addRltedPrsnRltnshipCdgCd("NULL");
		}

		if(relatedpersonrelationshipcodingi == relatedpersonrelationshipcodinglist.size()-1) {r.addRltedPrsnRltnshipCdgCd("]]");}


		/******************** RltedPrsn_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(relatedpersonrelationshipcodingi == 0) {r.addRltedPrsnRltnshipCdgUsrSltd("[[");}
		if(relatedpersonrelationshipcoding.hasUserSelected()) {

			r.addRltedPrsnRltnshipCdgUsrSltd(String.valueOf(relatedpersonrelationshipcoding.getUserSelected()));
		} else {
			r.addRltedPrsnRltnshipCdgUsrSltd("NULL");
		}

		if(relatedpersonrelationshipcodingi == relatedpersonrelationshipcodinglist.size()-1) {r.addRltedPrsnRltnshipCdgUsrSltd("]]");}


		/******************** RltedPrsn_Rltnship_Cdg_Sys ********************************************************************************/
		if(relatedpersonrelationshipcodingi == 0) {r.addRltedPrsnRltnshipCdgSys("[[");}
		if(relatedpersonrelationshipcoding.hasSystem()) {

			r.addRltedPrsnRltnshipCdgSys(String.valueOf(relatedpersonrelationshipcoding.getSystem()));
		} else {
			r.addRltedPrsnRltnshipCdgSys("NULL");
		}

		if(relatedpersonrelationshipcodingi == relatedpersonrelationshipcodinglist.size()-1) {r.addRltedPrsnRltnshipCdgSys("]]");}


		 };
		 };
		/******************** RltedPrsn_Active ********************************************************************************/
		if(relatedperson.hasActive()) {

			r.addRltedPrsnActive(String.valueOf(relatedperson.getActive()));
		} else {
			r.addRltedPrsnActive("NULL");
		}


		/******************** relatedpersonphoto ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> relatedpersonphotolist = relatedperson.getPhoto();
		for(int relatedpersonphotoi = 0; relatedpersonphotoi<relatedpersonphotolist.size();relatedpersonphotoi++ ) {
		org.hl7.fhir.r4.model.Attachment  relatedpersonphoto = relatedpersonphotolist.get(relatedpersonphotoi);

		/******************** RltedPrsn_Photo_Sz ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoSz("[");}
		if(relatedpersonphoto.hasSize()) {

			r.addRltedPrsnPhotoSz(String.valueOf(relatedpersonphoto.getSize()));
		} else {
			r.addRltedPrsnPhotoSz("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoSz("]");}


		/******************** RltedPrsn_Photo_Lnguage ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoLnguage("[");}
		if(relatedpersonphoto.hasLanguage()) {

			r.addRltedPrsnPhotoLnguage(String.valueOf(relatedpersonphoto.getLanguage()));
		} else {
			r.addRltedPrsnPhotoLnguage("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoLnguage("]");}


		/******************** RltedPrsn_Photo_CntntTyp ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoCntntTyp("[");}
		if(relatedpersonphoto.hasContentType()) {

			r.addRltedPrsnPhotoCntntTyp(String.valueOf(relatedpersonphoto.getContentType()));
		} else {
			r.addRltedPrsnPhotoCntntTyp("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoCntntTyp("]");}


		/******************** RltedPrsn_Photo_Hash ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoHash("[");}
		if(relatedpersonphoto.hasHash()) {

			r.addRltedPrsnPhotoHash(new String(relatedpersonphoto.getHash()));
		} else {
			r.addRltedPrsnPhotoHash("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoHash("]");}


		/******************** RltedPrsn_Photo_Data ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoData("[");}
		if(relatedpersonphoto.hasData()) {

			r.addRltedPrsnPhotoData(new String(relatedpersonphoto.getData()));
		} else {
			r.addRltedPrsnPhotoData("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoData("]");}


		/******************** RltedPrsn_Photo_Creation ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoCreation("[");}
		if(relatedpersonphoto.hasCreation()) {

			r.addRltedPrsnPhotoCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersonphoto.getCreation())+"\"");
		} else {
			r.addRltedPrsnPhotoCreation("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoCreation("]");}


		/******************** RltedPrsn_Photo_Ttl ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoTtl("[");}
		if(relatedpersonphoto.hasTitle()) {

			r.addRltedPrsnPhotoTtl(String.valueOf(relatedpersonphoto.getTitle()));
		} else {
			r.addRltedPrsnPhotoTtl("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoTtl("]");}


		/******************** RltedPrsn_Photo_Url ********************************************************************************/
		if(relatedpersonphotoi == 0) {r.addRltedPrsnPhotoUrl("[");}
		if(relatedpersonphoto.hasUrl()) {

			r.addRltedPrsnPhotoUrl(String.valueOf(relatedpersonphoto.getUrl()));
		} else {
			r.addRltedPrsnPhotoUrl("NULL");
		}

		if(relatedpersonphotoi == relatedpersonphotolist.size()-1) {r.addRltedPrsnPhotoUrl("]");}


		 };
		/******************** relatedpersontelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> relatedpersontelecomlist = relatedperson.getTelecom();
		for(int relatedpersontelecomi = 0; relatedpersontelecomi<relatedpersontelecomlist.size();relatedpersontelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  relatedpersontelecom = relatedpersontelecomlist.get(relatedpersontelecomi);

		/******************** RltedPrsn_Tlcm_Vl ********************************************************************************/
		if(relatedpersontelecomi == 0) {r.addRltedPrsnTlcmVl("[");}
		if(relatedpersontelecom.hasValue()) {

			r.addRltedPrsnTlcmVl(String.valueOf(relatedpersontelecom.getValue()));
		} else {
			r.addRltedPrsnTlcmVl("NULL");
		}

		if(relatedpersontelecomi == relatedpersontelecomlist.size()-1) {r.addRltedPrsnTlcmVl("]");}


		/******************** relatedpersontelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersontelecomperiod = relatedpersontelecom.getPeriod();

		/******************** RltedPrsn_Tlcm_Prd_Strt ********************************************************************************/
		if(relatedpersontelecomi == 0) {r.addRltedPrsnTlcmPrdStrt("[");}
		if(relatedpersontelecomperiod.hasStart()) {

			r.addRltedPrsnTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersontelecomperiod.getStart())+"\"");
		} else {
			r.addRltedPrsnTlcmPrdStrt("NULL");
		}

		if(relatedpersontelecomi == relatedpersontelecomlist.size()-1) {r.addRltedPrsnTlcmPrdStrt("]");}


		/******************** RltedPrsn_Tlcm_Prd_End ********************************************************************************/
		if(relatedpersontelecomi == 0) {r.addRltedPrsnTlcmPrdEnd("[");}
		if(relatedpersontelecomperiod.hasEnd()) {

			r.addRltedPrsnTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedpersontelecomperiod.getEnd())+"\"");
		} else {
			r.addRltedPrsnTlcmPrdEnd("NULL");
		}

		if(relatedpersontelecomi == relatedpersontelecomlist.size()-1) {r.addRltedPrsnTlcmPrdEnd("]");}


		/******************** relatedpersontelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse relatedpersontelecomuse = relatedpersontelecom.getUse();
		if(relatedpersontelecomuse!=null) {
		if(relatedpersontelecomi == 0) {

		r.addRltedPrsnTlcmUse("[");		}
			r.addRltedPrsnTlcmUse(relatedpersontelecomuse.toCode());
		if(relatedpersontelecomi == relatedpersontelecomlist.size()-1) {

		r.addRltedPrsnTlcmUse("]");		}

		} else {
			r.addRltedPrsnTlcmUse("NULL");
		}

		/******************** relatedpersontelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem relatedpersontelecomsystem = relatedpersontelecom.getSystem();
		if(relatedpersontelecomsystem!=null) {
		if(relatedpersontelecomi == 0) {

		r.addRltedPrsnTlcmSys("[");		}
			r.addRltedPrsnTlcmSys(relatedpersontelecomsystem.toCode());
		if(relatedpersontelecomi == relatedpersontelecomlist.size()-1) {

		r.addRltedPrsnTlcmSys("]");		}

		} else {
			r.addRltedPrsnTlcmSys("NULL");
		}

		/******************** RltedPrsn_Tlcm_Rnk ********************************************************************************/
		if(relatedpersontelecomi == 0) {r.addRltedPrsnTlcmRnk("[");}
		if(relatedpersontelecom.hasRank()) {

			r.addRltedPrsnTlcmRnk(String.valueOf(relatedpersontelecom.getRank()));
		} else {
			r.addRltedPrsnTlcmRnk("NULL");
		}

		if(relatedpersontelecomi == relatedpersontelecomlist.size()-1) {r.addRltedPrsnTlcmRnk("]");}


		 };
		/******************** relatedpersongender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender relatedpersongender = relatedperson.getGender();
		if(relatedpersongender!=null) {
			r.addRltedPrsnGender(relatedpersongender.toCode());
		} else {
			r.addRltedPrsnGender("NULL");
		}

		/******************** RltedPrsn_BirthDt ********************************************************************************/
		if(relatedperson.hasBirthDate()) {

			r.addRltedPrsnBirthDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(relatedperson.getBirthDate())+"\"");
		} else {
			r.addRltedPrsnBirthDt("NULL");
		}


		/******************** relatedpersoncommunication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent> relatedpersoncommunicationlist = relatedperson.getCommunication();
		for(int relatedpersoncommunicationi = 0; relatedpersoncommunicationi<relatedpersoncommunicationlist.size();relatedpersoncommunicationi++ ) {
		org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent  relatedpersoncommunication = relatedpersoncommunicationlist.get(relatedpersoncommunicationi);

		/******************** relatedpersoncommunicationlanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersoncommunicationlanguage = relatedpersoncommunication.getLanguage();

		/******************** RltedPrsn_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(relatedpersoncommunicationi == 0) {r.addRltedPrsnCmmnctnLnguageTxt("[");}
		if(relatedpersoncommunicationlanguage.hasText()) {

			r.addRltedPrsnCmmnctnLnguageTxt(String.valueOf(relatedpersoncommunicationlanguage.getText()));
		} else {
			r.addRltedPrsnCmmnctnLnguageTxt("NULL");
		}

		if(relatedpersoncommunicationi == relatedpersoncommunicationlist.size()-1) {r.addRltedPrsnCmmnctnLnguageTxt("]");}


		/******************** relatedpersoncommunicationlanguagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> relatedpersoncommunicationlanguagecodinglist = relatedpersoncommunicationlanguage.getCoding();
		for(int relatedpersoncommunicationlanguagecodingi = 0; relatedpersoncommunicationlanguagecodingi<relatedpersoncommunicationlanguagecodinglist.size();relatedpersoncommunicationlanguagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  relatedpersoncommunicationlanguagecoding = relatedpersoncommunicationlanguagecodinglist.get(relatedpersoncommunicationlanguagecodingi);

		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(relatedpersoncommunicationlanguagecodingi == 0) {r.addRltedPrsnCmmnctnLnguageCdgDsply("[[");}
		if(relatedpersoncommunicationlanguagecoding.hasDisplay()) {

			r.addRltedPrsnCmmnctnLnguageCdgDsply(String.valueOf(relatedpersoncommunicationlanguagecoding.getDisplay()));
		} else {
			r.addRltedPrsnCmmnctnLnguageCdgDsply("NULL");
		}

		if(relatedpersoncommunicationlanguagecodingi == relatedpersoncommunicationlanguagecodinglist.size()-1) {r.addRltedPrsnCmmnctnLnguageCdgDsply("]]");}


		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(relatedpersoncommunicationlanguagecodingi == 0) {r.addRltedPrsnCmmnctnLnguageCdgVrsn("[[");}
		if(relatedpersoncommunicationlanguagecoding.hasVersion()) {

			r.addRltedPrsnCmmnctnLnguageCdgVrsn(String.valueOf(relatedpersoncommunicationlanguagecoding.getVersion()));
		} else {
			r.addRltedPrsnCmmnctnLnguageCdgVrsn("NULL");
		}

		if(relatedpersoncommunicationlanguagecodingi == relatedpersoncommunicationlanguagecodinglist.size()-1) {r.addRltedPrsnCmmnctnLnguageCdgVrsn("]]");}


		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(relatedpersoncommunicationlanguagecodingi == 0) {r.addRltedPrsnCmmnctnLnguageCdgCd("[[");}
		if(relatedpersoncommunicationlanguagecoding.hasCode()) {

			r.addRltedPrsnCmmnctnLnguageCdgCd(String.valueOf(relatedpersoncommunicationlanguagecoding.getCode()));
		} else {
			r.addRltedPrsnCmmnctnLnguageCdgCd("NULL");
		}

		if(relatedpersoncommunicationlanguagecodingi == relatedpersoncommunicationlanguagecodinglist.size()-1) {r.addRltedPrsnCmmnctnLnguageCdgCd("]]");}


		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(relatedpersoncommunicationlanguagecodingi == 0) {r.addRltedPrsnCmmnctnLnguageCdgUsrSltd("[[");}
		if(relatedpersoncommunicationlanguagecoding.hasUserSelected()) {

			r.addRltedPrsnCmmnctnLnguageCdgUsrSltd(String.valueOf(relatedpersoncommunicationlanguagecoding.getUserSelected()));
		} else {
			r.addRltedPrsnCmmnctnLnguageCdgUsrSltd("NULL");
		}

		if(relatedpersoncommunicationlanguagecodingi == relatedpersoncommunicationlanguagecodinglist.size()-1) {r.addRltedPrsnCmmnctnLnguageCdgUsrSltd("]]");}


		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(relatedpersoncommunicationlanguagecodingi == 0) {r.addRltedPrsnCmmnctnLnguageCdgSys("[[");}
		if(relatedpersoncommunicationlanguagecoding.hasSystem()) {

			r.addRltedPrsnCmmnctnLnguageCdgSys(String.valueOf(relatedpersoncommunicationlanguagecoding.getSystem()));
		} else {
			r.addRltedPrsnCmmnctnLnguageCdgSys("NULL");
		}

		if(relatedpersoncommunicationlanguagecodingi == relatedpersoncommunicationlanguagecodinglist.size()-1) {r.addRltedPrsnCmmnctnLnguageCdgSys("]]");}


		 };
		/******************** RltedPrsn_Cmmnctn_Preferred ********************************************************************************/
		if(relatedpersoncommunicationi == 0) {r.addRltedPrsnCmmnctnPreferred("[");}
		if(relatedpersoncommunication.hasPreferred()) {

			r.addRltedPrsnCmmnctnPreferred(String.valueOf(relatedpersoncommunication.getPreferred()));
		} else {
			r.addRltedPrsnCmmnctnPreferred("NULL");
		}

		if(relatedpersoncommunicationi == relatedpersoncommunicationlist.size()-1) {r.addRltedPrsnCmmnctnPreferred("]");}


		 };
		/******************** RltedPrsn_Pnt ********************************************************************************/
		if(relatedperson.hasPatient()) {

			if(relatedperson.getPatient().getReference() != null) {
			r.addRltedPrsnPnt(relatedperson.getPatient().getReference());
			}
		} else {
			r.addRltedPrsnPnt("NULL");
		}


		return r;
	}
}
