package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Practitioner;
public class PractitionerBidirectionalConversion 
{
	public Practitioner Practitioners(org.hl7.fhir.r4.model.Practitioner practitioner) throws ParseException
	{
		 main.java.com.campfhir.model.Practitioner p = new  main.java.com.campfhir.model.Practitioner();

		/******************** id ********************************************************************************/
		p.setId(practitioner.getIdElement().getIdPart());

		/******************** practitionername ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.HumanName> practitionernamelist = practitioner.getName();
		for(int practitionernamei = 0; practitionernamei<practitionernamelist.size();practitionernamei++ ) {
		org.hl7.fhir.r4.model.HumanName  practitionername = practitionernamelist.get(practitionernamei);

		/******************** practitionernameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionernameperiod = practitionername.getPeriod();

		/******************** Prctitnr_Nm_Prd_Strt ********************************************************************************/
		if(practitionernamei == 0) {p.addPrctitnrNmPrdStrt("[");}
		if(practitionernameperiod.hasStart()) {

			p.addPrctitnrNmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionernameperiod.getStart())+"\"");
		} else {
			p.addPrctitnrNmPrdStrt("NULL");
		}

		if(practitionernamei == practitionernamelist.size()-1) {p.addPrctitnrNmPrdStrt("]");}


		/******************** Prctitnr_Nm_Prd_End ********************************************************************************/
		if(practitionernamei == 0) {p.addPrctitnrNmPrdEnd("[");}
		if(practitionernameperiod.hasEnd()) {

			p.addPrctitnrNmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionernameperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrNmPrdEnd("NULL");
		}

		if(practitionernamei == practitionernamelist.size()-1) {p.addPrctitnrNmPrdEnd("]");}


		/******************** Prctitnr_Nm_Given ********************************************************************************/
		if(practitionernamei == 0) {p.addPrctitnrNmGiven("[");}
		if(practitionername.hasGiven()) {

			String  array = "[";
			for(int incr=0; incr<practitionername.getGiven().size(); incr++) {
				array = array + practitionername.getGiven().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrctitnrNmGiven(array);

		} else {
			p.addPrctitnrNmGiven("NULL");
		}

		if(practitionernamei == practitionernamelist.size()-1) {p.addPrctitnrNmGiven("]");}


		/******************** Prctitnr_Nm_Fmly ********************************************************************************/
		if(practitionernamei == 0) {p.addPrctitnrNmFmly("[");}
		if(practitionername.hasFamily()) {

			p.addPrctitnrNmFmly(String.valueOf(practitionername.getFamily()));
		} else {
			p.addPrctitnrNmFmly("NULL");
		}

		if(practitionernamei == practitionernamelist.size()-1) {p.addPrctitnrNmFmly("]");}


		/******************** Prctitnr_Nm_Suffix ********************************************************************************/
		if(practitionernamei == 0) {p.addPrctitnrNmSuffix("[");}
		if(practitionername.hasSuffix()) {

			String  array = "[";
			for(int incr=0; incr<practitionername.getSuffix().size(); incr++) {
				array = array + practitionername.getSuffix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrctitnrNmSuffix(array);

		} else {
			p.addPrctitnrNmSuffix("NULL");
		}

		if(practitionernamei == practitionernamelist.size()-1) {p.addPrctitnrNmSuffix("]");}


		/******************** practitionernameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse practitionernameuse = practitionername.getUse();
		if(practitionernameuse!=null) {
		if(practitionernamei == 0) {

		p.addPrctitnrNmUse("[");		}
			p.addPrctitnrNmUse(practitionernameuse.toCode());
		if(practitionernamei == practitionernamelist.size()-1) {

		p.addPrctitnrNmUse("]");		}

		} else {
			p.addPrctitnrNmUse("NULL");
		}

		/******************** Prctitnr_Nm_Txt ********************************************************************************/
		if(practitionernamei == 0) {p.addPrctitnrNmTxt("[");}
		if(practitionername.hasText()) {

			p.addPrctitnrNmTxt(String.valueOf(practitionername.getText()));
		} else {
			p.addPrctitnrNmTxt("NULL");
		}

		if(practitionernamei == practitionernamelist.size()-1) {p.addPrctitnrNmTxt("]");}


		/******************** Prctitnr_Nm_Prefix ********************************************************************************/
		if(practitionernamei == 0) {p.addPrctitnrNmPrefix("[");}
		if(practitionername.hasPrefix()) {

			String  array = "[";
			for(int incr=0; incr<practitionername.getPrefix().size(); incr++) {
				array = array + practitionername.getPrefix().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrctitnrNmPrefix(array);

		} else {
			p.addPrctitnrNmPrefix("NULL");
		}

		if(practitionernamei == practitionernamelist.size()-1) {p.addPrctitnrNmPrefix("]");}


		 };
		/******************** practitioneraddress ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Address> practitioneraddresslist = practitioner.getAddress();
		for(int practitioneraddressi = 0; practitioneraddressi<practitioneraddresslist.size();practitioneraddressi++ ) {
		org.hl7.fhir.r4.model.Address  practitioneraddress = practitioneraddresslist.get(practitioneraddressi);

		/******************** Prctitnr_Addr_State ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrState("[");}
		if(practitioneraddress.hasState()) {

			p.addPrctitnrAddrState(String.valueOf(practitioneraddress.getState()));
		} else {
			p.addPrctitnrAddrState("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrState("]");}


		/******************** practitioneraddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType practitioneraddresstype = practitioneraddress.getType();
		if(practitioneraddresstype!=null) {
		if(practitioneraddressi == 0) {

		p.addPrctitnrAddrTyp("[");		}
			p.addPrctitnrAddrTyp(practitioneraddresstype.toCode());
		if(practitioneraddressi == practitioneraddresslist.size()-1) {

		p.addPrctitnrAddrTyp("]");		}

		} else {
			p.addPrctitnrAddrTyp("NULL");
		}

		/******************** Prctitnr_Addr_Cntry ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrCntry("[");}
		if(practitioneraddress.hasCountry()) {

			p.addPrctitnrAddrCntry(String.valueOf(practitioneraddress.getCountry()));
		} else {
			p.addPrctitnrAddrCntry("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrCntry("]");}


		/******************** practitioneraddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitioneraddressperiod = practitioneraddress.getPeriod();

		/******************** Prctitnr_Addr_Prd_Strt ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrPrdStrt("[");}
		if(practitioneraddressperiod.hasStart()) {

			p.addPrctitnrAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitioneraddressperiod.getStart())+"\"");
		} else {
			p.addPrctitnrAddrPrdStrt("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrPrdStrt("]");}


		/******************** Prctitnr_Addr_Prd_End ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrPrdEnd("[");}
		if(practitioneraddressperiod.hasEnd()) {

			p.addPrctitnrAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitioneraddressperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrAddrPrdEnd("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrPrdEnd("]");}


		/******************** Prctitnr_Addr_District ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrDistrict("[");}
		if(practitioneraddress.hasDistrict()) {

			p.addPrctitnrAddrDistrict(String.valueOf(practitioneraddress.getDistrict()));
		} else {
			p.addPrctitnrAddrDistrict("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrDistrict("]");}


		/******************** Prctitnr_Addr_PostalCd ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrPostalCd("[");}
		if(practitioneraddress.hasPostalCode()) {

			p.addPrctitnrAddrPostalCd(String.valueOf(practitioneraddress.getPostalCode()));
		} else {
			p.addPrctitnrAddrPostalCd("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrPostalCd("]");}


		/******************** Prctitnr_Addr_Line ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrLine("[");}
		if(practitioneraddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<practitioneraddress.getLine().size(); incr++) {
				array = array + practitioneraddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrctitnrAddrLine(array);

		} else {
			p.addPrctitnrAddrLine("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrLine("]");}


		/******************** Prctitnr_Addr_City ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrCity("[");}
		if(practitioneraddress.hasCity()) {

			p.addPrctitnrAddrCity(String.valueOf(practitioneraddress.getCity()));
		} else {
			p.addPrctitnrAddrCity("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrCity("]");}


		/******************** practitioneraddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse practitioneraddressuse = practitioneraddress.getUse();
		if(practitioneraddressuse!=null) {
		if(practitioneraddressi == 0) {

		p.addPrctitnrAddrUse("[");		}
			p.addPrctitnrAddrUse(practitioneraddressuse.toCode());
		if(practitioneraddressi == practitioneraddresslist.size()-1) {

		p.addPrctitnrAddrUse("]");		}

		} else {
			p.addPrctitnrAddrUse("NULL");
		}

		/******************** Prctitnr_Addr_Txt ********************************************************************************/
		if(practitioneraddressi == 0) {p.addPrctitnrAddrTxt("[");}
		if(practitioneraddress.hasText()) {

			p.addPrctitnrAddrTxt(String.valueOf(practitioneraddress.getText()));
		} else {
			p.addPrctitnrAddrTxt("NULL");
		}

		if(practitioneraddressi == practitioneraddresslist.size()-1) {p.addPrctitnrAddrTxt("]");}


		 };
		/******************** practitioneridentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> practitioneridentifierlist = practitioner.getIdentifier();
		for(int practitioneridentifieri = 0; practitioneridentifieri<practitioneridentifierlist.size();practitioneridentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  practitioneridentifier = practitioneridentifierlist.get(practitioneridentifieri);

		/******************** Prctitnr_Id_Vl ********************************************************************************/
		if(practitioneridentifieri == 0) {p.addPrctitnrIdVl("[");}
		if(practitioneridentifier.hasValue()) {

			p.addPrctitnrIdVl(String.valueOf(practitioneridentifier.getValue()));
		} else {
			p.addPrctitnrIdVl("NULL");
		}

		if(practitioneridentifieri == practitioneridentifierlist.size()-1) {p.addPrctitnrIdVl("]");}


		/******************** practitioneridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitioneridentifiertype = practitioneridentifier.getType();

		/******************** Prctitnr_Id_Typ_Txt ********************************************************************************/
		if(practitioneridentifieri == 0) {p.addPrctitnrIdTypTxt("[");}
		if(practitioneridentifiertype.hasText()) {

			p.addPrctitnrIdTypTxt(String.valueOf(practitioneridentifiertype.getText()));
		} else {
			p.addPrctitnrIdTypTxt("NULL");
		}

		if(practitioneridentifieri == practitioneridentifierlist.size()-1) {p.addPrctitnrIdTypTxt("]");}


		/******************** practitioneridentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> practitioneridentifiertypecodinglist = practitioneridentifiertype.getCoding();
		for(int practitioneridentifiertypecodingi = 0; practitioneridentifiertypecodingi<practitioneridentifiertypecodinglist.size();practitioneridentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  practitioneridentifiertypecoding = practitioneridentifiertypecodinglist.get(practitioneridentifiertypecodingi);

		/******************** Prctitnr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(practitioneridentifiertypecodingi == 0) {p.addPrctitnrIdTypCdgDsply("[[");}
		if(practitioneridentifiertypecoding.hasDisplay()) {

			p.addPrctitnrIdTypCdgDsply(String.valueOf(practitioneridentifiertypecoding.getDisplay()));
		} else {
			p.addPrctitnrIdTypCdgDsply("NULL");
		}

		if(practitioneridentifiertypecodingi == practitioneridentifiertypecodinglist.size()-1) {p.addPrctitnrIdTypCdgDsply("]]");}


		/******************** Prctitnr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(practitioneridentifiertypecodingi == 0) {p.addPrctitnrIdTypCdgVrsn("[[");}
		if(practitioneridentifiertypecoding.hasVersion()) {

			p.addPrctitnrIdTypCdgVrsn(String.valueOf(practitioneridentifiertypecoding.getVersion()));
		} else {
			p.addPrctitnrIdTypCdgVrsn("NULL");
		}

		if(practitioneridentifiertypecodingi == practitioneridentifiertypecodinglist.size()-1) {p.addPrctitnrIdTypCdgVrsn("]]");}


		/******************** Prctitnr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(practitioneridentifiertypecodingi == 0) {p.addPrctitnrIdTypCdgCd("[[");}
		if(practitioneridentifiertypecoding.hasCode()) {

			p.addPrctitnrIdTypCdgCd(String.valueOf(practitioneridentifiertypecoding.getCode()));
		} else {
			p.addPrctitnrIdTypCdgCd("NULL");
		}

		if(practitioneridentifiertypecodingi == practitioneridentifiertypecodinglist.size()-1) {p.addPrctitnrIdTypCdgCd("]]");}


		/******************** Prctitnr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(practitioneridentifiertypecodingi == 0) {p.addPrctitnrIdTypCdgUsrSltd("[[");}
		if(practitioneridentifiertypecoding.hasUserSelected()) {

			p.addPrctitnrIdTypCdgUsrSltd(String.valueOf(practitioneridentifiertypecoding.getUserSelected()));
		} else {
			p.addPrctitnrIdTypCdgUsrSltd("NULL");
		}

		if(practitioneridentifiertypecodingi == practitioneridentifiertypecodinglist.size()-1) {p.addPrctitnrIdTypCdgUsrSltd("]]");}


		/******************** Prctitnr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(practitioneridentifiertypecodingi == 0) {p.addPrctitnrIdTypCdgSys("[[");}
		if(practitioneridentifiertypecoding.hasSystem()) {

			p.addPrctitnrIdTypCdgSys(String.valueOf(practitioneridentifiertypecoding.getSystem()));
		} else {
			p.addPrctitnrIdTypCdgSys("NULL");
		}

		if(practitioneridentifiertypecodingi == practitioneridentifiertypecodinglist.size()-1) {p.addPrctitnrIdTypCdgSys("]]");}


		 };
		/******************** practitioneridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitioneridentifierperiod = practitioneridentifier.getPeriod();

		/******************** Prctitnr_Id_Prd_Strt ********************************************************************************/
		if(practitioneridentifieri == 0) {p.addPrctitnrIdPrdStrt("[");}
		if(practitioneridentifierperiod.hasStart()) {

			p.addPrctitnrIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitioneridentifierperiod.getStart())+"\"");
		} else {
			p.addPrctitnrIdPrdStrt("NULL");
		}

		if(practitioneridentifieri == practitioneridentifierlist.size()-1) {p.addPrctitnrIdPrdStrt("]");}


		/******************** Prctitnr_Id_Prd_End ********************************************************************************/
		if(practitioneridentifieri == 0) {p.addPrctitnrIdPrdEnd("[");}
		if(practitioneridentifierperiod.hasEnd()) {

			p.addPrctitnrIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitioneridentifierperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrIdPrdEnd("NULL");
		}

		if(practitioneridentifieri == practitioneridentifierlist.size()-1) {p.addPrctitnrIdPrdEnd("]");}


		/******************** practitioneridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse practitioneridentifieruse = practitioneridentifier.getUse();
		if(practitioneridentifieruse!=null) {
		if(practitioneridentifieri == 0) {

		p.addPrctitnrIdUse("[");		}
			p.addPrctitnrIdUse(practitioneridentifieruse.toCode());
		if(practitioneridentifieri == practitioneridentifierlist.size()-1) {

		p.addPrctitnrIdUse("]");		}

		} else {
			p.addPrctitnrIdUse("NULL");
		}

		/******************** Prctitnr_Id_Assigner ********************************************************************************/
		if(practitioneridentifieri == 0) {p.addPrctitnrIdAssigner("[");}
		if(practitioneridentifier.hasAssigner()) {

			if(practitioneridentifier.getAssigner().getReference() != null) {
			p.addPrctitnrIdAssigner(practitioneridentifier.getAssigner().getReference());
			}
		} else {
			p.addPrctitnrIdAssigner("NULL");
		}

		if(practitioneridentifieri == practitioneridentifierlist.size()-1) {p.addPrctitnrIdAssigner("]");}


		/******************** Prctitnr_Id_Sys ********************************************************************************/
		if(practitioneridentifieri == 0) {p.addPrctitnrIdSys("[");}
		if(practitioneridentifier.hasSystem()) {

			p.addPrctitnrIdSys(String.valueOf(practitioneridentifier.getSystem()));
		} else {
			p.addPrctitnrIdSys("NULL");
		}

		if(practitioneridentifieri == practitioneridentifierlist.size()-1) {p.addPrctitnrIdSys("]");}


		 };
		/******************** Prctitnr_Active ********************************************************************************/
		if(practitioner.hasActive()) {

			p.addPrctitnrActive(String.valueOf(practitioner.getActive()));
		} else {
			p.addPrctitnrActive("NULL");
		}


		/******************** practitionerphoto ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> practitionerphotolist = practitioner.getPhoto();
		for(int practitionerphotoi = 0; practitionerphotoi<practitionerphotolist.size();practitionerphotoi++ ) {
		org.hl7.fhir.r4.model.Attachment  practitionerphoto = practitionerphotolist.get(practitionerphotoi);

		/******************** Prctitnr_Photo_Sz ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoSz("[");}
		if(practitionerphoto.hasSize()) {

			p.addPrctitnrPhotoSz(String.valueOf(practitionerphoto.getSize()));
		} else {
			p.addPrctitnrPhotoSz("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoSz("]");}


		/******************** Prctitnr_Photo_Lnguage ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoLnguage("[");}
		if(practitionerphoto.hasLanguage()) {

			p.addPrctitnrPhotoLnguage(String.valueOf(practitionerphoto.getLanguage()));
		} else {
			p.addPrctitnrPhotoLnguage("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoLnguage("]");}


		/******************** Prctitnr_Photo_CntntTyp ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoCntntTyp("[");}
		if(practitionerphoto.hasContentType()) {

			p.addPrctitnrPhotoCntntTyp(String.valueOf(practitionerphoto.getContentType()));
		} else {
			p.addPrctitnrPhotoCntntTyp("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoCntntTyp("]");}


		/******************** Prctitnr_Photo_Hash ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoHash("[");}
		if(practitionerphoto.hasHash()) {

			p.addPrctitnrPhotoHash(new String(practitionerphoto.getHash()));
		} else {
			p.addPrctitnrPhotoHash("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoHash("]");}


		/******************** Prctitnr_Photo_Data ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoData("[");}
		if(practitionerphoto.hasData()) {

			p.addPrctitnrPhotoData(new String(practitionerphoto.getData()));
		} else {
			p.addPrctitnrPhotoData("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoData("]");}


		/******************** Prctitnr_Photo_Creation ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoCreation("[");}
		if(practitionerphoto.hasCreation()) {

			p.addPrctitnrPhotoCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerphoto.getCreation())+"\"");
		} else {
			p.addPrctitnrPhotoCreation("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoCreation("]");}


		/******************** Prctitnr_Photo_Ttl ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoTtl("[");}
		if(practitionerphoto.hasTitle()) {

			p.addPrctitnrPhotoTtl(String.valueOf(practitionerphoto.getTitle()));
		} else {
			p.addPrctitnrPhotoTtl("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoTtl("]");}


		/******************** Prctitnr_Photo_Url ********************************************************************************/
		if(practitionerphotoi == 0) {p.addPrctitnrPhotoUrl("[");}
		if(practitionerphoto.hasUrl()) {

			p.addPrctitnrPhotoUrl(String.valueOf(practitionerphoto.getUrl()));
		} else {
			p.addPrctitnrPhotoUrl("NULL");
		}

		if(practitionerphotoi == practitionerphotolist.size()-1) {p.addPrctitnrPhotoUrl("]");}


		 };
		/******************** practitionertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> practitionertelecomlist = practitioner.getTelecom();
		for(int practitionertelecomi = 0; practitionertelecomi<practitionertelecomlist.size();practitionertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  practitionertelecom = practitionertelecomlist.get(practitionertelecomi);

		/******************** Prctitnr_Tlcm_Vl ********************************************************************************/
		if(practitionertelecomi == 0) {p.addPrctitnrTlcmVl("[");}
		if(practitionertelecom.hasValue()) {

			p.addPrctitnrTlcmVl(String.valueOf(practitionertelecom.getValue()));
		} else {
			p.addPrctitnrTlcmVl("NULL");
		}

		if(practitionertelecomi == practitionertelecomlist.size()-1) {p.addPrctitnrTlcmVl("]");}


		/******************** practitionertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionertelecomperiod = practitionertelecom.getPeriod();

		/******************** Prctitnr_Tlcm_Prd_Strt ********************************************************************************/
		if(practitionertelecomi == 0) {p.addPrctitnrTlcmPrdStrt("[");}
		if(practitionertelecomperiod.hasStart()) {

			p.addPrctitnrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionertelecomperiod.getStart())+"\"");
		} else {
			p.addPrctitnrTlcmPrdStrt("NULL");
		}

		if(practitionertelecomi == practitionertelecomlist.size()-1) {p.addPrctitnrTlcmPrdStrt("]");}


		/******************** Prctitnr_Tlcm_Prd_End ********************************************************************************/
		if(practitionertelecomi == 0) {p.addPrctitnrTlcmPrdEnd("[");}
		if(practitionertelecomperiod.hasEnd()) {

			p.addPrctitnrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionertelecomperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrTlcmPrdEnd("NULL");
		}

		if(practitionertelecomi == practitionertelecomlist.size()-1) {p.addPrctitnrTlcmPrdEnd("]");}


		/******************** practitionertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse practitionertelecomuse = practitionertelecom.getUse();
		if(practitionertelecomuse!=null) {
		if(practitionertelecomi == 0) {

		p.addPrctitnrTlcmUse("[");		}
			p.addPrctitnrTlcmUse(practitionertelecomuse.toCode());
		if(practitionertelecomi == practitionertelecomlist.size()-1) {

		p.addPrctitnrTlcmUse("]");		}

		} else {
			p.addPrctitnrTlcmUse("NULL");
		}

		/******************** practitionertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem practitionertelecomsystem = practitionertelecom.getSystem();
		if(practitionertelecomsystem!=null) {
		if(practitionertelecomi == 0) {

		p.addPrctitnrTlcmSys("[");		}
			p.addPrctitnrTlcmSys(practitionertelecomsystem.toCode());
		if(practitionertelecomi == practitionertelecomlist.size()-1) {

		p.addPrctitnrTlcmSys("]");		}

		} else {
			p.addPrctitnrTlcmSys("NULL");
		}

		/******************** Prctitnr_Tlcm_Rnk ********************************************************************************/
		if(practitionertelecomi == 0) {p.addPrctitnrTlcmRnk("[");}
		if(practitionertelecom.hasRank()) {

			p.addPrctitnrTlcmRnk(String.valueOf(practitionertelecom.getRank()));
		} else {
			p.addPrctitnrTlcmRnk("NULL");
		}

		if(practitionertelecomi == practitionertelecomlist.size()-1) {p.addPrctitnrTlcmRnk("]");}


		 };
		/******************** practitionergender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender practitionergender = practitioner.getGender();
		if(practitionergender!=null) {
			p.addPrctitnrGender(practitionergender.toCode());
		} else {
			p.addPrctitnrGender("NULL");
		}

		/******************** Prctitnr_BirthDt ********************************************************************************/
		if(practitioner.hasBirthDate()) {

			p.addPrctitnrBirthDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitioner.getBirthDate())+"\"");
		} else {
			p.addPrctitnrBirthDt("NULL");
		}


		/******************** practitionercommunication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> practitionercommunicationlist = practitioner.getCommunication();
		for(int practitionercommunicationi = 0; practitionercommunicationi<practitionercommunicationlist.size();practitionercommunicationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  practitionercommunication = practitionercommunicationlist.get(practitionercommunicationi);

		/******************** Prctitnr_Cmmnctn_Txt ********************************************************************************/
		if(practitionercommunicationi == 0) {p.addPrctitnrCmmnctnTxt("[");}
		if(practitionercommunication.hasText()) {

			p.addPrctitnrCmmnctnTxt(String.valueOf(practitionercommunication.getText()));
		} else {
			p.addPrctitnrCmmnctnTxt("NULL");
		}

		if(practitionercommunicationi == practitionercommunicationlist.size()-1) {p.addPrctitnrCmmnctnTxt("]");}


		/******************** practitionercommunicationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> practitionercommunicationcodinglist = practitionercommunication.getCoding();
		for(int practitionercommunicationcodingi = 0; practitionercommunicationcodingi<practitionercommunicationcodinglist.size();practitionercommunicationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  practitionercommunicationcoding = practitionercommunicationcodinglist.get(practitionercommunicationcodingi);

		/******************** Prctitnr_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(practitionercommunicationcodingi == 0) {p.addPrctitnrCmmnctnCdgDsply("[[");}
		if(practitionercommunicationcoding.hasDisplay()) {

			p.addPrctitnrCmmnctnCdgDsply(String.valueOf(practitionercommunicationcoding.getDisplay()));
		} else {
			p.addPrctitnrCmmnctnCdgDsply("NULL");
		}

		if(practitionercommunicationcodingi == practitionercommunicationcodinglist.size()-1) {p.addPrctitnrCmmnctnCdgDsply("]]");}


		/******************** Prctitnr_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(practitionercommunicationcodingi == 0) {p.addPrctitnrCmmnctnCdgVrsn("[[");}
		if(practitionercommunicationcoding.hasVersion()) {

			p.addPrctitnrCmmnctnCdgVrsn(String.valueOf(practitionercommunicationcoding.getVersion()));
		} else {
			p.addPrctitnrCmmnctnCdgVrsn("NULL");
		}

		if(practitionercommunicationcodingi == practitionercommunicationcodinglist.size()-1) {p.addPrctitnrCmmnctnCdgVrsn("]]");}


		/******************** Prctitnr_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(practitionercommunicationcodingi == 0) {p.addPrctitnrCmmnctnCdgCd("[[");}
		if(practitionercommunicationcoding.hasCode()) {

			p.addPrctitnrCmmnctnCdgCd(String.valueOf(practitionercommunicationcoding.getCode()));
		} else {
			p.addPrctitnrCmmnctnCdgCd("NULL");
		}

		if(practitionercommunicationcodingi == practitionercommunicationcodinglist.size()-1) {p.addPrctitnrCmmnctnCdgCd("]]");}


		/******************** Prctitnr_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(practitionercommunicationcodingi == 0) {p.addPrctitnrCmmnctnCdgUsrSltd("[[");}
		if(practitionercommunicationcoding.hasUserSelected()) {

			p.addPrctitnrCmmnctnCdgUsrSltd(String.valueOf(practitionercommunicationcoding.getUserSelected()));
		} else {
			p.addPrctitnrCmmnctnCdgUsrSltd("NULL");
		}

		if(practitionercommunicationcodingi == practitionercommunicationcodinglist.size()-1) {p.addPrctitnrCmmnctnCdgUsrSltd("]]");}


		/******************** Prctitnr_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(practitionercommunicationcodingi == 0) {p.addPrctitnrCmmnctnCdgSys("[[");}
		if(practitionercommunicationcoding.hasSystem()) {

			p.addPrctitnrCmmnctnCdgSys(String.valueOf(practitionercommunicationcoding.getSystem()));
		} else {
			p.addPrctitnrCmmnctnCdgSys("NULL");
		}

		if(practitionercommunicationcodingi == practitionercommunicationcodinglist.size()-1) {p.addPrctitnrCmmnctnCdgSys("]]");}


		 };
		 };
		/******************** practitionerqualification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent> practitionerqualificationlist = practitioner.getQualification();
		for(int practitionerqualificationi = 0; practitionerqualificationi<practitionerqualificationlist.size();practitionerqualificationi++ ) {
		org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent  practitionerqualification = practitionerqualificationlist.get(practitionerqualificationi);

		/******************** practitionerqualificationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerqualificationcode = practitionerqualification.getCode();

		/******************** Prctitnr_Qualification_Cd_Txt ********************************************************************************/
		if(practitionerqualificationi == 0) {p.addPrctitnrQualificationCdTxt("[");}
		if(practitionerqualificationcode.hasText()) {

			p.addPrctitnrQualificationCdTxt(String.valueOf(practitionerqualificationcode.getText()));
		} else {
			p.addPrctitnrQualificationCdTxt("NULL");
		}

		if(practitionerqualificationi == practitionerqualificationlist.size()-1) {p.addPrctitnrQualificationCdTxt("]");}


		/******************** practitionerqualificationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> practitionerqualificationcodecodinglist = practitionerqualificationcode.getCoding();
		for(int practitionerqualificationcodecodingi = 0; practitionerqualificationcodecodingi<practitionerqualificationcodecodinglist.size();practitionerqualificationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  practitionerqualificationcodecoding = practitionerqualificationcodecodinglist.get(practitionerqualificationcodecodingi);

		/******************** Prctitnr_Qualification_Cd_Cdg_Dsply ********************************************************************************/
		if(practitionerqualificationcodecodingi == 0) {p.addPrctitnrQualificationCdCdgDsply("[[");}
		if(practitionerqualificationcodecoding.hasDisplay()) {

			p.addPrctitnrQualificationCdCdgDsply(String.valueOf(practitionerqualificationcodecoding.getDisplay()));
		} else {
			p.addPrctitnrQualificationCdCdgDsply("NULL");
		}

		if(practitionerqualificationcodecodingi == practitionerqualificationcodecodinglist.size()-1) {p.addPrctitnrQualificationCdCdgDsply("]]");}


		/******************** Prctitnr_Qualification_Cd_Cdg_Vrsn ********************************************************************************/
		if(practitionerqualificationcodecodingi == 0) {p.addPrctitnrQualificationCdCdgVrsn("[[");}
		if(practitionerqualificationcodecoding.hasVersion()) {

			p.addPrctitnrQualificationCdCdgVrsn(String.valueOf(practitionerqualificationcodecoding.getVersion()));
		} else {
			p.addPrctitnrQualificationCdCdgVrsn("NULL");
		}

		if(practitionerqualificationcodecodingi == practitionerqualificationcodecodinglist.size()-1) {p.addPrctitnrQualificationCdCdgVrsn("]]");}


		/******************** Prctitnr_Qualification_Cd_Cdg_Cd ********************************************************************************/
		if(practitionerqualificationcodecodingi == 0) {p.addPrctitnrQualificationCdCdgCd("[[");}
		if(practitionerqualificationcodecoding.hasCode()) {

			p.addPrctitnrQualificationCdCdgCd(String.valueOf(practitionerqualificationcodecoding.getCode()));
		} else {
			p.addPrctitnrQualificationCdCdgCd("NULL");
		}

		if(practitionerqualificationcodecodingi == practitionerqualificationcodecodinglist.size()-1) {p.addPrctitnrQualificationCdCdgCd("]]");}


		/******************** Prctitnr_Qualification_Cd_Cdg_UsrSltd ********************************************************************************/
		if(practitionerqualificationcodecodingi == 0) {p.addPrctitnrQualificationCdCdgUsrSltd("[[");}
		if(practitionerqualificationcodecoding.hasUserSelected()) {

			p.addPrctitnrQualificationCdCdgUsrSltd(String.valueOf(practitionerqualificationcodecoding.getUserSelected()));
		} else {
			p.addPrctitnrQualificationCdCdgUsrSltd("NULL");
		}

		if(practitionerqualificationcodecodingi == practitionerqualificationcodecodinglist.size()-1) {p.addPrctitnrQualificationCdCdgUsrSltd("]]");}


		/******************** Prctitnr_Qualification_Cd_Cdg_Sys ********************************************************************************/
		if(practitionerqualificationcodecodingi == 0) {p.addPrctitnrQualificationCdCdgSys("[[");}
		if(practitionerqualificationcodecoding.hasSystem()) {

			p.addPrctitnrQualificationCdCdgSys(String.valueOf(practitionerqualificationcodecoding.getSystem()));
		} else {
			p.addPrctitnrQualificationCdCdgSys("NULL");
		}

		if(practitionerqualificationcodecodingi == practitionerqualificationcodecodinglist.size()-1) {p.addPrctitnrQualificationCdCdgSys("]]");}


		 };
		/******************** practitionerqualificationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerqualificationperiod = practitionerqualification.getPeriod();

		/******************** Prctitnr_Qualification_Prd_Strt ********************************************************************************/
		if(practitionerqualificationi == 0) {p.addPrctitnrQualificationPrdStrt("[");}
		if(practitionerqualificationperiod.hasStart()) {

			p.addPrctitnrQualificationPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerqualificationperiod.getStart())+"\"");
		} else {
			p.addPrctitnrQualificationPrdStrt("NULL");
		}

		if(practitionerqualificationi == practitionerqualificationlist.size()-1) {p.addPrctitnrQualificationPrdStrt("]");}


		/******************** Prctitnr_Qualification_Prd_End ********************************************************************************/
		if(practitionerqualificationi == 0) {p.addPrctitnrQualificationPrdEnd("[");}
		if(practitionerqualificationperiod.hasEnd()) {

			p.addPrctitnrQualificationPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerqualificationperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrQualificationPrdEnd("NULL");
		}

		if(practitionerqualificationi == practitionerqualificationlist.size()-1) {p.addPrctitnrQualificationPrdEnd("]");}


		/******************** practitionerqualificationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> practitionerqualificationidentifierlist = practitionerqualification.getIdentifier();
		for(int practitionerqualificationidentifieri = 0; practitionerqualificationidentifieri<practitionerqualificationidentifierlist.size();practitionerqualificationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  practitionerqualificationidentifier = practitionerqualificationidentifierlist.get(practitionerqualificationidentifieri);

		/******************** Prctitnr_Qualification_Id_Vl ********************************************************************************/
		if(practitionerqualificationidentifieri == 0) {p.addPrctitnrQualificationIdVl("[[");}
		if(practitionerqualificationidentifier.hasValue()) {

			p.addPrctitnrQualificationIdVl(String.valueOf(practitionerqualificationidentifier.getValue()));
		} else {
			p.addPrctitnrQualificationIdVl("NULL");
		}

		if(practitionerqualificationidentifieri == practitionerqualificationidentifierlist.size()-1) {p.addPrctitnrQualificationIdVl("]]");}


		/******************** practitionerqualificationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerqualificationidentifiertype = practitionerqualificationidentifier.getType();

		/******************** Prctitnr_Qualification_Id_Typ_Txt ********************************************************************************/
		if(practitionerqualificationidentifieri == 0) {p.addPrctitnrQualificationIdTypTxt("[[");}
		if(practitionerqualificationidentifiertype.hasText()) {

			p.addPrctitnrQualificationIdTypTxt(String.valueOf(practitionerqualificationidentifiertype.getText()));
		} else {
			p.addPrctitnrQualificationIdTypTxt("NULL");
		}

		if(practitionerqualificationidentifieri == practitionerqualificationidentifierlist.size()-1) {p.addPrctitnrQualificationIdTypTxt("]]");}


		/******************** practitionerqualificationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> practitionerqualificationidentifiertypecodinglist = practitionerqualificationidentifiertype.getCoding();
		for(int practitionerqualificationidentifiertypecodingi = 0; practitionerqualificationidentifiertypecodingi<practitionerqualificationidentifiertypecodinglist.size();practitionerqualificationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  practitionerqualificationidentifiertypecoding = practitionerqualificationidentifiertypecodinglist.get(practitionerqualificationidentifiertypecodingi);

		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(practitionerqualificationidentifiertypecodingi == 0) {p.addPrctitnrQualificationIdTypCdgDsply("[[[");}
		if(practitionerqualificationidentifiertypecoding.hasDisplay()) {

			p.addPrctitnrQualificationIdTypCdgDsply(String.valueOf(practitionerqualificationidentifiertypecoding.getDisplay()));
		} else {
			p.addPrctitnrQualificationIdTypCdgDsply("NULL");
		}

		if(practitionerqualificationidentifiertypecodingi == practitionerqualificationidentifiertypecodinglist.size()-1) {p.addPrctitnrQualificationIdTypCdgDsply("]]]");}


		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(practitionerqualificationidentifiertypecodingi == 0) {p.addPrctitnrQualificationIdTypCdgVrsn("[[[");}
		if(practitionerqualificationidentifiertypecoding.hasVersion()) {

			p.addPrctitnrQualificationIdTypCdgVrsn(String.valueOf(practitionerqualificationidentifiertypecoding.getVersion()));
		} else {
			p.addPrctitnrQualificationIdTypCdgVrsn("NULL");
		}

		if(practitionerqualificationidentifiertypecodingi == practitionerqualificationidentifiertypecodinglist.size()-1) {p.addPrctitnrQualificationIdTypCdgVrsn("]]]");}


		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Cd ********************************************************************************/
		if(practitionerqualificationidentifiertypecodingi == 0) {p.addPrctitnrQualificationIdTypCdgCd("[[[");}
		if(practitionerqualificationidentifiertypecoding.hasCode()) {

			p.addPrctitnrQualificationIdTypCdgCd(String.valueOf(practitionerqualificationidentifiertypecoding.getCode()));
		} else {
			p.addPrctitnrQualificationIdTypCdgCd("NULL");
		}

		if(practitionerqualificationidentifiertypecodingi == practitionerqualificationidentifiertypecodinglist.size()-1) {p.addPrctitnrQualificationIdTypCdgCd("]]]");}


		/******************** Prctitnr_Qualification_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(practitionerqualificationidentifiertypecodingi == 0) {p.addPrctitnrQualificationIdTypCdgUsrSltd("[[[");}
		if(practitionerqualificationidentifiertypecoding.hasUserSelected()) {

			p.addPrctitnrQualificationIdTypCdgUsrSltd(String.valueOf(practitionerqualificationidentifiertypecoding.getUserSelected()));
		} else {
			p.addPrctitnrQualificationIdTypCdgUsrSltd("NULL");
		}

		if(practitionerqualificationidentifiertypecodingi == practitionerqualificationidentifiertypecodinglist.size()-1) {p.addPrctitnrQualificationIdTypCdgUsrSltd("]]]");}


		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Sys ********************************************************************************/
		if(practitionerqualificationidentifiertypecodingi == 0) {p.addPrctitnrQualificationIdTypCdgSys("[[[");}
		if(practitionerqualificationidentifiertypecoding.hasSystem()) {

			p.addPrctitnrQualificationIdTypCdgSys(String.valueOf(practitionerqualificationidentifiertypecoding.getSystem()));
		} else {
			p.addPrctitnrQualificationIdTypCdgSys("NULL");
		}

		if(practitionerqualificationidentifiertypecodingi == practitionerqualificationidentifiertypecodinglist.size()-1) {p.addPrctitnrQualificationIdTypCdgSys("]]]");}


		 };
		/******************** practitionerqualificationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerqualificationidentifierperiod = practitionerqualificationidentifier.getPeriod();

		/******************** Prctitnr_Qualification_Id_Prd_Strt ********************************************************************************/
		if(practitionerqualificationidentifieri == 0) {p.addPrctitnrQualificationIdPrdStrt("[[");}
		if(practitionerqualificationidentifierperiod.hasStart()) {

			p.addPrctitnrQualificationIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerqualificationidentifierperiod.getStart())+"\"");
		} else {
			p.addPrctitnrQualificationIdPrdStrt("NULL");
		}

		if(practitionerqualificationidentifieri == practitionerqualificationidentifierlist.size()-1) {p.addPrctitnrQualificationIdPrdStrt("]]");}


		/******************** Prctitnr_Qualification_Id_Prd_End ********************************************************************************/
		if(practitionerqualificationidentifieri == 0) {p.addPrctitnrQualificationIdPrdEnd("[[");}
		if(practitionerqualificationidentifierperiod.hasEnd()) {

			p.addPrctitnrQualificationIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerqualificationidentifierperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrQualificationIdPrdEnd("NULL");
		}

		if(practitionerqualificationidentifieri == practitionerqualificationidentifierlist.size()-1) {p.addPrctitnrQualificationIdPrdEnd("]]");}


		/******************** practitionerqualificationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse practitionerqualificationidentifieruse = practitionerqualificationidentifier.getUse();
		if(practitionerqualificationidentifieruse!=null) {
		if(practitionerqualificationidentifieri == 0) {

		p.addPrctitnrQualificationIdUse("[[");		}
			p.addPrctitnrQualificationIdUse(practitionerqualificationidentifieruse.toCode());
		if(practitionerqualificationidentifieri == practitionerqualificationidentifierlist.size()-1) {

		p.addPrctitnrQualificationIdUse("]]");		}

		} else {
			p.addPrctitnrQualificationIdUse("NULL");
		}

		/******************** Prctitnr_Qualification_Id_Assigner ********************************************************************************/
		if(practitionerqualificationidentifieri == 0) {p.addPrctitnrQualificationIdAssigner("[[");}
		if(practitionerqualificationidentifier.hasAssigner()) {

			if(practitionerqualificationidentifier.getAssigner().getReference() != null) {
			p.addPrctitnrQualificationIdAssigner(practitionerqualificationidentifier.getAssigner().getReference());
			}
		} else {
			p.addPrctitnrQualificationIdAssigner("NULL");
		}

		if(practitionerqualificationidentifieri == practitionerqualificationidentifierlist.size()-1) {p.addPrctitnrQualificationIdAssigner("]]");}


		/******************** Prctitnr_Qualification_Id_Sys ********************************************************************************/
		if(practitionerqualificationidentifieri == 0) {p.addPrctitnrQualificationIdSys("[[");}
		if(practitionerqualificationidentifier.hasSystem()) {

			p.addPrctitnrQualificationIdSys(String.valueOf(practitionerqualificationidentifier.getSystem()));
		} else {
			p.addPrctitnrQualificationIdSys("NULL");
		}

		if(practitionerqualificationidentifieri == practitionerqualificationidentifierlist.size()-1) {p.addPrctitnrQualificationIdSys("]]");}


		 };
		/******************** Prctitnr_Qualification_Issuer ********************************************************************************/
		if(practitionerqualification.hasIssuer()) {

			if(practitionerqualification.getIssuer().getReference() != null) {
			p.addPrctitnrQualificationIssuer(practitionerqualification.getIssuer().getReference());
			}
		} else {
			p.addPrctitnrQualificationIssuer("NULL");
		}


		 };
		return p;
	}
}
