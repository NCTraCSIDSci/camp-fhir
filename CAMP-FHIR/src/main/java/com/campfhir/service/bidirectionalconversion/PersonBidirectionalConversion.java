package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Person;
public class PersonBidirectionalConversion 
{
	public Person Persons(org.hl7.fhir.r4.model.Person person) throws ParseException
	{
		 main.java.com.campfhir.model.Person p = new  main.java.com.campfhir.model.Person();

		/******************** id ********************************************************************************/
		p.setId(person.getIdElement().getIdPart());

		/******************** personname ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.HumanName> personnamelist = person.getName();
		for(int personnamei = 0; personnamei<personnamelist.size();personnamei++ ) {
		org.hl7.fhir.r4.model.HumanName  personname = personnamelist.get(personnamei);

		/******************** personnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personnameperiod = personname.getPeriod();

		/******************** Prsn_Nm_Prd_Strt ********************************************************************************/
		if(personnamei == 0) {p.addPrsnNmPrdStrt("[");}
		if(personnameperiod.hasStart()) {

			p.addPrsnNmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(personnameperiod.getStart())+"\"");
		} else {
			p.addPrsnNmPrdStrt("NULL");
		}

		if(personnamei == personnamelist.size()-1) {p.addPrsnNmPrdStrt("]");}


		/******************** Prsn_Nm_Prd_End ********************************************************************************/
		if(personnamei == 0) {p.addPrsnNmPrdEnd("[");}
		if(personnameperiod.hasEnd()) {

			p.addPrsnNmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(personnameperiod.getEnd())+"\"");
		} else {
			p.addPrsnNmPrdEnd("NULL");
		}

		if(personnamei == personnamelist.size()-1) {p.addPrsnNmPrdEnd("]");}


		/******************** Prsn_Nm_Given ********************************************************************************/
		if(personnamei == 0) {p.addPrsnNmGiven("[");}
		if(personname.hasGiven()) {

			String  array = "[";
			for(int incr=0; incr<personname.getGiven().size(); incr++) {
				array = array + personname.getGiven().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrsnNmGiven(array);

		} else {
			p.addPrsnNmGiven("NULL");
		}

		if(personnamei == personnamelist.size()-1) {p.addPrsnNmGiven("]");}


		/******************** Prsn_Nm_Fmly ********************************************************************************/
		if(personnamei == 0) {p.addPrsnNmFmly("[");}
		if(personname.hasFamily()) {

			p.addPrsnNmFmly(String.valueOf(personname.getFamily()));
		} else {
			p.addPrsnNmFmly("NULL");
		}

		if(personnamei == personnamelist.size()-1) {p.addPrsnNmFmly("]");}


		/******************** Prsn_Nm_Suffix ********************************************************************************/
		if(personnamei == 0) {p.addPrsnNmSuffix("[");}
		if(personname.hasSuffix()) {

			String  array = "[";
			for(int incr=0; incr<personname.getSuffix().size(); incr++) {
				array = array + personname.getSuffix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrsnNmSuffix(array);

		} else {
			p.addPrsnNmSuffix("NULL");
		}

		if(personnamei == personnamelist.size()-1) {p.addPrsnNmSuffix("]");}


		/******************** personnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse personnameuse = personname.getUse();
		if(personnameuse!=null) {
		if(personnamei == 0) {

		p.addPrsnNmUse("[");		}
			p.addPrsnNmUse(personnameuse.toCode());
		if(personnamei == personnamelist.size()-1) {

		p.addPrsnNmUse("]");		}

		} else {
			p.addPrsnNmUse("NULL");
		}

		/******************** Prsn_Nm_Txt ********************************************************************************/
		if(personnamei == 0) {p.addPrsnNmTxt("[");}
		if(personname.hasText()) {

			p.addPrsnNmTxt(String.valueOf(personname.getText()));
		} else {
			p.addPrsnNmTxt("NULL");
		}

		if(personnamei == personnamelist.size()-1) {p.addPrsnNmTxt("]");}


		/******************** Prsn_Nm_Prefix ********************************************************************************/
		if(personnamei == 0) {p.addPrsnNmPrefix("[");}
		if(personname.hasPrefix()) {

			String  array = "[";
			for(int incr=0; incr<personname.getPrefix().size(); incr++) {
				array = array + personname.getPrefix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrsnNmPrefix(array);

		} else {
			p.addPrsnNmPrefix("NULL");
		}

		if(personnamei == personnamelist.size()-1) {p.addPrsnNmPrefix("]");}


		 };
		/******************** personaddress ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Address> personaddresslist = person.getAddress();
		for(int personaddressi = 0; personaddressi<personaddresslist.size();personaddressi++ ) {
		org.hl7.fhir.r4.model.Address  personaddress = personaddresslist.get(personaddressi);

		/******************** Prsn_Addr_State ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrState("[");}
		if(personaddress.hasState()) {

			p.addPrsnAddrState(String.valueOf(personaddress.getState()));
		} else {
			p.addPrsnAddrState("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrState("]");}


		/******************** personaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType personaddresstype = personaddress.getType();
		if(personaddresstype!=null) {
		if(personaddressi == 0) {

		p.addPrsnAddrTyp("[");		}
			p.addPrsnAddrTyp(personaddresstype.toCode());
		if(personaddressi == personaddresslist.size()-1) {

		p.addPrsnAddrTyp("]");		}

		} else {
			p.addPrsnAddrTyp("NULL");
		}

		/******************** Prsn_Addr_Cntry ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrCntry("[");}
		if(personaddress.hasCountry()) {

			p.addPrsnAddrCntry(String.valueOf(personaddress.getCountry()));
		} else {
			p.addPrsnAddrCntry("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrCntry("]");}


		/******************** personaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personaddressperiod = personaddress.getPeriod();

		/******************** Prsn_Addr_Prd_Strt ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrPrdStrt("[");}
		if(personaddressperiod.hasStart()) {

			p.addPrsnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(personaddressperiod.getStart())+"\"");
		} else {
			p.addPrsnAddrPrdStrt("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrPrdStrt("]");}


		/******************** Prsn_Addr_Prd_End ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrPrdEnd("[");}
		if(personaddressperiod.hasEnd()) {

			p.addPrsnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(personaddressperiod.getEnd())+"\"");
		} else {
			p.addPrsnAddrPrdEnd("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrPrdEnd("]");}


		/******************** Prsn_Addr_District ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrDistrict("[");}
		if(personaddress.hasDistrict()) {

			p.addPrsnAddrDistrict(String.valueOf(personaddress.getDistrict()));
		} else {
			p.addPrsnAddrDistrict("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrDistrict("]");}


		/******************** Prsn_Addr_PostalCd ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrPostalCd("[");}
		if(personaddress.hasPostalCode()) {

			p.addPrsnAddrPostalCd(String.valueOf(personaddress.getPostalCode()));
		} else {
			p.addPrsnAddrPostalCd("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrPostalCd("]");}


		/******************** Prsn_Addr_Line ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrLine("[");}
		if(personaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<personaddress.getLine().size(); incr++) {
				array = array + personaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrsnAddrLine(array);

		} else {
			p.addPrsnAddrLine("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrLine("]");}


		/******************** Prsn_Addr_City ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrCity("[");}
		if(personaddress.hasCity()) {

			p.addPrsnAddrCity(String.valueOf(personaddress.getCity()));
		} else {
			p.addPrsnAddrCity("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrCity("]");}


		/******************** personaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse personaddressuse = personaddress.getUse();
		if(personaddressuse!=null) {
		if(personaddressi == 0) {

		p.addPrsnAddrUse("[");		}
			p.addPrsnAddrUse(personaddressuse.toCode());
		if(personaddressi == personaddresslist.size()-1) {

		p.addPrsnAddrUse("]");		}

		} else {
			p.addPrsnAddrUse("NULL");
		}

		/******************** Prsn_Addr_Txt ********************************************************************************/
		if(personaddressi == 0) {p.addPrsnAddrTxt("[");}
		if(personaddress.hasText()) {

			p.addPrsnAddrTxt(String.valueOf(personaddress.getText()));
		} else {
			p.addPrsnAddrTxt("NULL");
		}

		if(personaddressi == personaddresslist.size()-1) {p.addPrsnAddrTxt("]");}


		 };
		/******************** personidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> personidentifierlist = person.getIdentifier();
		for(int personidentifieri = 0; personidentifieri<personidentifierlist.size();personidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  personidentifier = personidentifierlist.get(personidentifieri);

		/******************** Prsn_Id_Vl ********************************************************************************/
		if(personidentifieri == 0) {p.addPrsnIdVl("[");}
		if(personidentifier.hasValue()) {

			p.addPrsnIdVl(String.valueOf(personidentifier.getValue()));
		} else {
			p.addPrsnIdVl("NULL");
		}

		if(personidentifieri == personidentifierlist.size()-1) {p.addPrsnIdVl("]");}


		/******************** personidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept personidentifiertype = personidentifier.getType();

		/******************** Prsn_Id_Typ_Txt ********************************************************************************/
		if(personidentifieri == 0) {p.addPrsnIdTypTxt("[");}
		if(personidentifiertype.hasText()) {

			p.addPrsnIdTypTxt(String.valueOf(personidentifiertype.getText()));
		} else {
			p.addPrsnIdTypTxt("NULL");
		}

		if(personidentifieri == personidentifierlist.size()-1) {p.addPrsnIdTypTxt("]");}


		/******************** personidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> personidentifiertypecodinglist = personidentifiertype.getCoding();
		for(int personidentifiertypecodingi = 0; personidentifiertypecodingi<personidentifiertypecodinglist.size();personidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  personidentifiertypecoding = personidentifiertypecodinglist.get(personidentifiertypecodingi);

		/******************** Prsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(personidentifiertypecodingi == 0) {p.addPrsnIdTypCdgDsply("[[");}
		if(personidentifiertypecoding.hasDisplay()) {

			p.addPrsnIdTypCdgDsply(String.valueOf(personidentifiertypecoding.getDisplay()));
		} else {
			p.addPrsnIdTypCdgDsply("NULL");
		}

		if(personidentifiertypecodingi == personidentifiertypecodinglist.size()-1) {p.addPrsnIdTypCdgDsply("]]");}


		/******************** Prsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(personidentifiertypecodingi == 0) {p.addPrsnIdTypCdgVrsn("[[");}
		if(personidentifiertypecoding.hasVersion()) {

			p.addPrsnIdTypCdgVrsn(String.valueOf(personidentifiertypecoding.getVersion()));
		} else {
			p.addPrsnIdTypCdgVrsn("NULL");
		}

		if(personidentifiertypecodingi == personidentifiertypecodinglist.size()-1) {p.addPrsnIdTypCdgVrsn("]]");}


		/******************** Prsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(personidentifiertypecodingi == 0) {p.addPrsnIdTypCdgCd("[[");}
		if(personidentifiertypecoding.hasCode()) {

			p.addPrsnIdTypCdgCd(String.valueOf(personidentifiertypecoding.getCode()));
		} else {
			p.addPrsnIdTypCdgCd("NULL");
		}

		if(personidentifiertypecodingi == personidentifiertypecodinglist.size()-1) {p.addPrsnIdTypCdgCd("]]");}


		/******************** Prsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(personidentifiertypecodingi == 0) {p.addPrsnIdTypCdgUsrSltd("[[");}
		if(personidentifiertypecoding.hasUserSelected()) {

			p.addPrsnIdTypCdgUsrSltd(String.valueOf(personidentifiertypecoding.getUserSelected()));
		} else {
			p.addPrsnIdTypCdgUsrSltd("NULL");
		}

		if(personidentifiertypecodingi == personidentifiertypecodinglist.size()-1) {p.addPrsnIdTypCdgUsrSltd("]]");}


		/******************** Prsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(personidentifiertypecodingi == 0) {p.addPrsnIdTypCdgSys("[[");}
		if(personidentifiertypecoding.hasSystem()) {

			p.addPrsnIdTypCdgSys(String.valueOf(personidentifiertypecoding.getSystem()));
		} else {
			p.addPrsnIdTypCdgSys("NULL");
		}

		if(personidentifiertypecodingi == personidentifiertypecodinglist.size()-1) {p.addPrsnIdTypCdgSys("]]");}


		 };
		/******************** personidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personidentifierperiod = personidentifier.getPeriod();

		/******************** Prsn_Id_Prd_Strt ********************************************************************************/
		if(personidentifieri == 0) {p.addPrsnIdPrdStrt("[");}
		if(personidentifierperiod.hasStart()) {

			p.addPrsnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(personidentifierperiod.getStart())+"\"");
		} else {
			p.addPrsnIdPrdStrt("NULL");
		}

		if(personidentifieri == personidentifierlist.size()-1) {p.addPrsnIdPrdStrt("]");}


		/******************** Prsn_Id_Prd_End ********************************************************************************/
		if(personidentifieri == 0) {p.addPrsnIdPrdEnd("[");}
		if(personidentifierperiod.hasEnd()) {

			p.addPrsnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(personidentifierperiod.getEnd())+"\"");
		} else {
			p.addPrsnIdPrdEnd("NULL");
		}

		if(personidentifieri == personidentifierlist.size()-1) {p.addPrsnIdPrdEnd("]");}


		/******************** personidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse personidentifieruse = personidentifier.getUse();
		if(personidentifieruse!=null) {
		if(personidentifieri == 0) {

		p.addPrsnIdUse("[");		}
			p.addPrsnIdUse(personidentifieruse.toCode());
		if(personidentifieri == personidentifierlist.size()-1) {

		p.addPrsnIdUse("]");		}

		} else {
			p.addPrsnIdUse("NULL");
		}

		/******************** Prsn_Id_Assigner ********************************************************************************/
		if(personidentifieri == 0) {p.addPrsnIdAssigner("[");}
		if(personidentifier.hasAssigner()) {

			if(personidentifier.getAssigner().getReference() != null) {
			p.addPrsnIdAssigner(personidentifier.getAssigner().getReference());
			}
		} else {
			p.addPrsnIdAssigner("NULL");
		}

		if(personidentifieri == personidentifierlist.size()-1) {p.addPrsnIdAssigner("]");}


		/******************** Prsn_Id_Sys ********************************************************************************/
		if(personidentifieri == 0) {p.addPrsnIdSys("[");}
		if(personidentifier.hasSystem()) {

			p.addPrsnIdSys(String.valueOf(personidentifier.getSystem()));
		} else {
			p.addPrsnIdSys("NULL");
		}

		if(personidentifieri == personidentifierlist.size()-1) {p.addPrsnIdSys("]");}


		 };
		/******************** personlink ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Person.PersonLinkComponent> personlinklist = person.getLink();
		for(int personlinki = 0; personlinki<personlinklist.size();personlinki++ ) {
		org.hl7.fhir.r4.model.Person.PersonLinkComponent  personlink = personlinklist.get(personlinki);

		/******************** personlinkassurance ********************************************************************************/
		org.hl7.fhir.r4.model.Person.IdentityAssuranceLevel personlinkassurance = personlink.getAssurance();
		if(personlinkassurance!=null) {
		if(personlinki == 0) {

		p.addPrsnLinkAssurance("[");		}
			p.addPrsnLinkAssurance(personlinkassurance.toCode());
		if(personlinki == personlinklist.size()-1) {

		p.addPrsnLinkAssurance("]");		}

		} else {
			p.addPrsnLinkAssurance("NULL");
		}

		 };
		/******************** Prsn_Active ********************************************************************************/
		if(person.hasActive()) {

			p.addPrsnActive(String.valueOf(person.getActive()));
		} else {
			p.addPrsnActive("NULL");
		}


		/******************** personphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment personphoto = person.getPhoto();

		/******************** Prsn_Photo_Sz ********************************************************************************/
		if(personphoto.hasSize()) {

			p.addPrsnPhotoSz(String.valueOf(personphoto.getSize()));
		} else {
			p.addPrsnPhotoSz("NULL");
		}


		/******************** Prsn_Photo_Lnguage ********************************************************************************/
		if(personphoto.hasLanguage()) {

			p.addPrsnPhotoLnguage(String.valueOf(personphoto.getLanguage()));
		} else {
			p.addPrsnPhotoLnguage("NULL");
		}


		/******************** Prsn_Photo_CntntTyp ********************************************************************************/
		if(personphoto.hasContentType()) {

			p.addPrsnPhotoCntntTyp(String.valueOf(personphoto.getContentType()));
		} else {
			p.addPrsnPhotoCntntTyp("NULL");
		}


		/******************** Prsn_Photo_Hash ********************************************************************************/
		if(personphoto.hasHash()) {

			p.addPrsnPhotoHash(new String(personphoto.getHash()));
		} else {
			p.addPrsnPhotoHash("NULL");
		}


		/******************** Prsn_Photo_Data ********************************************************************************/
		if(personphoto.hasData()) {

			p.addPrsnPhotoData(new String(personphoto.getData()));
		} else {
			p.addPrsnPhotoData("NULL");
		}


		/******************** Prsn_Photo_Creation ********************************************************************************/
		if(personphoto.hasCreation()) {

			p.addPrsnPhotoCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(personphoto.getCreation())+"\"");
		} else {
			p.addPrsnPhotoCreation("NULL");
		}


		/******************** Prsn_Photo_Ttl ********************************************************************************/
		if(personphoto.hasTitle()) {

			p.addPrsnPhotoTtl(String.valueOf(personphoto.getTitle()));
		} else {
			p.addPrsnPhotoTtl("NULL");
		}


		/******************** Prsn_Photo_Url ********************************************************************************/
		if(personphoto.hasUrl()) {

			p.addPrsnPhotoUrl(String.valueOf(personphoto.getUrl()));
		} else {
			p.addPrsnPhotoUrl("NULL");
		}


		/******************** persontelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> persontelecomlist = person.getTelecom();
		for(int persontelecomi = 0; persontelecomi<persontelecomlist.size();persontelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  persontelecom = persontelecomlist.get(persontelecomi);

		/******************** Prsn_Tlcm_Vl ********************************************************************************/
		if(persontelecomi == 0) {p.addPrsnTlcmVl("[");}
		if(persontelecom.hasValue()) {

			p.addPrsnTlcmVl(String.valueOf(persontelecom.getValue()));
		} else {
			p.addPrsnTlcmVl("NULL");
		}

		if(persontelecomi == persontelecomlist.size()-1) {p.addPrsnTlcmVl("]");}


		/******************** persontelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period persontelecomperiod = persontelecom.getPeriod();

		/******************** Prsn_Tlcm_Prd_Strt ********************************************************************************/
		if(persontelecomi == 0) {p.addPrsnTlcmPrdStrt("[");}
		if(persontelecomperiod.hasStart()) {

			p.addPrsnTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(persontelecomperiod.getStart())+"\"");
		} else {
			p.addPrsnTlcmPrdStrt("NULL");
		}

		if(persontelecomi == persontelecomlist.size()-1) {p.addPrsnTlcmPrdStrt("]");}


		/******************** Prsn_Tlcm_Prd_End ********************************************************************************/
		if(persontelecomi == 0) {p.addPrsnTlcmPrdEnd("[");}
		if(persontelecomperiod.hasEnd()) {

			p.addPrsnTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(persontelecomperiod.getEnd())+"\"");
		} else {
			p.addPrsnTlcmPrdEnd("NULL");
		}

		if(persontelecomi == persontelecomlist.size()-1) {p.addPrsnTlcmPrdEnd("]");}


		/******************** persontelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse persontelecomuse = persontelecom.getUse();
		if(persontelecomuse!=null) {
		if(persontelecomi == 0) {

		p.addPrsnTlcmUse("[");		}
			p.addPrsnTlcmUse(persontelecomuse.toCode());
		if(persontelecomi == persontelecomlist.size()-1) {

		p.addPrsnTlcmUse("]");		}

		} else {
			p.addPrsnTlcmUse("NULL");
		}

		/******************** persontelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem persontelecomsystem = persontelecom.getSystem();
		if(persontelecomsystem!=null) {
		if(persontelecomi == 0) {

		p.addPrsnTlcmSys("[");		}
			p.addPrsnTlcmSys(persontelecomsystem.toCode());
		if(persontelecomi == persontelecomlist.size()-1) {

		p.addPrsnTlcmSys("]");		}

		} else {
			p.addPrsnTlcmSys("NULL");
		}

		/******************** Prsn_Tlcm_Rnk ********************************************************************************/
		if(persontelecomi == 0) {p.addPrsnTlcmRnk("[");}
		if(persontelecom.hasRank()) {

			p.addPrsnTlcmRnk(String.valueOf(persontelecom.getRank()));
		} else {
			p.addPrsnTlcmRnk("NULL");
		}

		if(persontelecomi == persontelecomlist.size()-1) {p.addPrsnTlcmRnk("]");}


		 };
		/******************** persongender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender persongender = person.getGender();
		if(persongender!=null) {
			p.addPrsnGender(persongender.toCode());
		} else {
			p.addPrsnGender("NULL");
		}

		/******************** Prsn_BirthDt ********************************************************************************/
		if(person.hasBirthDate()) {

			p.addPrsnBirthDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(person.getBirthDate())+"\"");
		} else {
			p.addPrsnBirthDt("NULL");
		}


		/******************** Prsn_ManagingOrgnztn ********************************************************************************/
		if(person.hasManagingOrganization()) {

			if(person.getManagingOrganization().getReference() != null) {
			p.addPrsnManagingOrgnztn(person.getManagingOrganization().getReference());
			}
		} else {
			p.addPrsnManagingOrgnztn("NULL");
		}


		return p;
	}
}
