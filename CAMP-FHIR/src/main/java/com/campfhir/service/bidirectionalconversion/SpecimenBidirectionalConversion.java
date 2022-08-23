package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Specimen;
public class SpecimenBidirectionalConversion 
{
	public Specimen Specimens(org.hl7.fhir.r4.model.Specimen specimen) throws ParseException
	{
		 main.java.com.campfhir.model.Specimen s = new  main.java.com.campfhir.model.Specimen();

		/******************** id ********************************************************************************/
		s.setId(specimen.getIdElement().getIdPart());

		/******************** Spcmn_Parent ********************************************************************************/
		if(specimen.hasParent()) {

			String  array = "[";
			for(int incr=0; incr<specimen.getParent().size(); incr++) {
				array = array + specimen.getParent().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpcmnParent(array);

		} else {
			s.addSpcmnParent("NULL");
		}


		/******************** specimentype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimentype = specimen.getType();

		/******************** Spcmn_Typ_Txt ********************************************************************************/
		if(specimentype.hasText()) {

			s.addSpcmnTypTxt(String.valueOf(specimentype.getText()));
		} else {
			s.addSpcmnTypTxt("NULL");
		}


		/******************** specimentypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimentypecodinglist = specimentype.getCoding();
		for(int specimentypecodingi = 0; specimentypecodingi<specimentypecodinglist.size();specimentypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimentypecoding = specimentypecodinglist.get(specimentypecodingi);

		/******************** Spcmn_Typ_Cdg_Dsply ********************************************************************************/
		if(specimentypecodingi == 0) {s.addSpcmnTypCdgDsply("[");}
		if(specimentypecoding.hasDisplay()) {

			s.addSpcmnTypCdgDsply(String.valueOf(specimentypecoding.getDisplay()));
		} else {
			s.addSpcmnTypCdgDsply("NULL");
		}

		if(specimentypecodingi == specimentypecodinglist.size()-1) {s.addSpcmnTypCdgDsply("]");}


		/******************** Spcmn_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimentypecodingi == 0) {s.addSpcmnTypCdgVrsn("[");}
		if(specimentypecoding.hasVersion()) {

			s.addSpcmnTypCdgVrsn(String.valueOf(specimentypecoding.getVersion()));
		} else {
			s.addSpcmnTypCdgVrsn("NULL");
		}

		if(specimentypecodingi == specimentypecodinglist.size()-1) {s.addSpcmnTypCdgVrsn("]");}


		/******************** Spcmn_Typ_Cdg_Cd ********************************************************************************/
		if(specimentypecodingi == 0) {s.addSpcmnTypCdgCd("[");}
		if(specimentypecoding.hasCode()) {

			s.addSpcmnTypCdgCd(String.valueOf(specimentypecoding.getCode()));
		} else {
			s.addSpcmnTypCdgCd("NULL");
		}

		if(specimentypecodingi == specimentypecodinglist.size()-1) {s.addSpcmnTypCdgCd("]");}


		/******************** Spcmn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimentypecodingi == 0) {s.addSpcmnTypCdgUsrSltd("[");}
		if(specimentypecoding.hasUserSelected()) {

			s.addSpcmnTypCdgUsrSltd(String.valueOf(specimentypecoding.getUserSelected()));
		} else {
			s.addSpcmnTypCdgUsrSltd("NULL");
		}

		if(specimentypecodingi == specimentypecodinglist.size()-1) {s.addSpcmnTypCdgUsrSltd("]");}


		/******************** Spcmn_Typ_Cdg_Sys ********************************************************************************/
		if(specimentypecodingi == 0) {s.addSpcmnTypCdgSys("[");}
		if(specimentypecoding.hasSystem()) {

			s.addSpcmnTypCdgSys(String.valueOf(specimentypecoding.getSystem()));
		} else {
			s.addSpcmnTypCdgSys("NULL");
		}

		if(specimentypecodingi == specimentypecodinglist.size()-1) {s.addSpcmnTypCdgSys("]");}


		 };
		/******************** Spcmn_Sbjct ********************************************************************************/
		if(specimen.hasSubject()) {

			if(specimen.getSubject().getReference() != null) {
			s.addSpcmnSbjct(specimen.getSubject().getReference());
			}
		} else {
			s.addSpcmnSbjct("NULL");
		}


		/******************** specimenstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenStatus specimenstatus = specimen.getStatus();
		if(specimenstatus!=null) {
			s.addSpcmnSts(specimenstatus.toCode());
		} else {
			s.addSpcmnSts("NULL");
		}

		/******************** specimennote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> specimennotelist = specimen.getNote();
		for(int specimennotei = 0; specimennotei<specimennotelist.size();specimennotei++ ) {
		org.hl7.fhir.r4.model.Annotation  specimennote = specimennotelist.get(specimennotei);

		/******************** Spcmn_Nt_Time ********************************************************************************/
		if(specimennotei == 0) {s.addSpcmnNtTime("[");}
		if(specimennote.hasTime()) {

			s.addSpcmnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimennote.getTime())+"\"");
		} else {
			s.addSpcmnNtTime("NULL");
		}

		if(specimennotei == specimennotelist.size()-1) {s.addSpcmnNtTime("]");}


		/******************** Spcmn_Nt_AthrRfrnc ********************************************************************************/
		if(specimennotei == 0) {s.addSpcmnNtAthrRfrnc("[");}
		if(specimennote.hasAuthorReference()) {

			if(specimennote.getAuthorReference().getReference() != null) {
			s.addSpcmnNtAthrRfrnc(specimennote.getAuthorReference().getReference());
			}
		} else {
			s.addSpcmnNtAthrRfrnc("NULL");
		}

		if(specimennotei == specimennotelist.size()-1) {s.addSpcmnNtAthrRfrnc("]");}


		/******************** Spcmn_Nt_Txt ********************************************************************************/
		if(specimennotei == 0) {s.addSpcmnNtTxt("[");}
		if(specimennote.hasText()) {

			s.addSpcmnNtTxt(String.valueOf(specimennote.getText()));
		} else {
			s.addSpcmnNtTxt("NULL");
		}

		if(specimennotei == specimennotelist.size()-1) {s.addSpcmnNtTxt("]");}


		/******************** Spcmn_Nt_AthrStrgTyp ********************************************************************************/
		if(specimennotei == 0) {s.addSpcmnNtAthrStrgTyp("[");}
		if(specimennote.hasAuthorStringType()) {

			s.addSpcmnNtAthrStrgTyp("\""+specimennote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			s.addSpcmnNtAthrStrgTyp("NULL");
		}

		if(specimennotei == specimennotelist.size()-1) {s.addSpcmnNtAthrStrgTyp("]");}


		 };
		/******************** Spcmn_Rqst ********************************************************************************/
		if(specimen.hasRequest()) {

			String  array = "[";
			for(int incr=0; incr<specimen.getRequest().size(); incr++) {
				array = array + specimen.getRequest().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpcmnRqst(array);

		} else {
			s.addSpcmnRqst("NULL");
		}


		/******************** specimenidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> specimenidentifierlist = specimen.getIdentifier();
		for(int specimenidentifieri = 0; specimenidentifieri<specimenidentifierlist.size();specimenidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  specimenidentifier = specimenidentifierlist.get(specimenidentifieri);

		/******************** Spcmn_Id_Vl ********************************************************************************/
		if(specimenidentifieri == 0) {s.addSpcmnIdVl("[");}
		if(specimenidentifier.hasValue()) {

			s.addSpcmnIdVl(String.valueOf(specimenidentifier.getValue()));
		} else {
			s.addSpcmnIdVl("NULL");
		}

		if(specimenidentifieri == specimenidentifierlist.size()-1) {s.addSpcmnIdVl("]");}


		/******************** specimenidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenidentifiertype = specimenidentifier.getType();

		/******************** Spcmn_Id_Typ_Txt ********************************************************************************/
		if(specimenidentifieri == 0) {s.addSpcmnIdTypTxt("[");}
		if(specimenidentifiertype.hasText()) {

			s.addSpcmnIdTypTxt(String.valueOf(specimenidentifiertype.getText()));
		} else {
			s.addSpcmnIdTypTxt("NULL");
		}

		if(specimenidentifieri == specimenidentifierlist.size()-1) {s.addSpcmnIdTypTxt("]");}


		/******************** specimenidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimenidentifiertypecodinglist = specimenidentifiertype.getCoding();
		for(int specimenidentifiertypecodingi = 0; specimenidentifiertypecodingi<specimenidentifiertypecodinglist.size();specimenidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimenidentifiertypecoding = specimenidentifiertypecodinglist.get(specimenidentifiertypecodingi);

		/******************** Spcmn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(specimenidentifiertypecodingi == 0) {s.addSpcmnIdTypCdgDsply("[[");}
		if(specimenidentifiertypecoding.hasDisplay()) {

			s.addSpcmnIdTypCdgDsply(String.valueOf(specimenidentifiertypecoding.getDisplay()));
		} else {
			s.addSpcmnIdTypCdgDsply("NULL");
		}

		if(specimenidentifiertypecodingi == specimenidentifiertypecodinglist.size()-1) {s.addSpcmnIdTypCdgDsply("]]");}


		/******************** Spcmn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimenidentifiertypecodingi == 0) {s.addSpcmnIdTypCdgVrsn("[[");}
		if(specimenidentifiertypecoding.hasVersion()) {

			s.addSpcmnIdTypCdgVrsn(String.valueOf(specimenidentifiertypecoding.getVersion()));
		} else {
			s.addSpcmnIdTypCdgVrsn("NULL");
		}

		if(specimenidentifiertypecodingi == specimenidentifiertypecodinglist.size()-1) {s.addSpcmnIdTypCdgVrsn("]]");}


		/******************** Spcmn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(specimenidentifiertypecodingi == 0) {s.addSpcmnIdTypCdgCd("[[");}
		if(specimenidentifiertypecoding.hasCode()) {

			s.addSpcmnIdTypCdgCd(String.valueOf(specimenidentifiertypecoding.getCode()));
		} else {
			s.addSpcmnIdTypCdgCd("NULL");
		}

		if(specimenidentifiertypecodingi == specimenidentifiertypecodinglist.size()-1) {s.addSpcmnIdTypCdgCd("]]");}


		/******************** Spcmn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimenidentifiertypecodingi == 0) {s.addSpcmnIdTypCdgUsrSltd("[[");}
		if(specimenidentifiertypecoding.hasUserSelected()) {

			s.addSpcmnIdTypCdgUsrSltd(String.valueOf(specimenidentifiertypecoding.getUserSelected()));
		} else {
			s.addSpcmnIdTypCdgUsrSltd("NULL");
		}

		if(specimenidentifiertypecodingi == specimenidentifiertypecodinglist.size()-1) {s.addSpcmnIdTypCdgUsrSltd("]]");}


		/******************** Spcmn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(specimenidentifiertypecodingi == 0) {s.addSpcmnIdTypCdgSys("[[");}
		if(specimenidentifiertypecoding.hasSystem()) {

			s.addSpcmnIdTypCdgSys(String.valueOf(specimenidentifiertypecoding.getSystem()));
		} else {
			s.addSpcmnIdTypCdgSys("NULL");
		}

		if(specimenidentifiertypecodingi == specimenidentifiertypecodinglist.size()-1) {s.addSpcmnIdTypCdgSys("]]");}


		 };
		/******************** specimenidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenidentifierperiod = specimenidentifier.getPeriod();

		/******************** Spcmn_Id_Prd_Strt ********************************************************************************/
		if(specimenidentifieri == 0) {s.addSpcmnIdPrdStrt("[");}
		if(specimenidentifierperiod.hasStart()) {

			s.addSpcmnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimenidentifierperiod.getStart())+"\"");
		} else {
			s.addSpcmnIdPrdStrt("NULL");
		}

		if(specimenidentifieri == specimenidentifierlist.size()-1) {s.addSpcmnIdPrdStrt("]");}


		/******************** Spcmn_Id_Prd_End ********************************************************************************/
		if(specimenidentifieri == 0) {s.addSpcmnIdPrdEnd("[");}
		if(specimenidentifierperiod.hasEnd()) {

			s.addSpcmnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimenidentifierperiod.getEnd())+"\"");
		} else {
			s.addSpcmnIdPrdEnd("NULL");
		}

		if(specimenidentifieri == specimenidentifierlist.size()-1) {s.addSpcmnIdPrdEnd("]");}


		/******************** specimenidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimenidentifieruse = specimenidentifier.getUse();
		if(specimenidentifieruse!=null) {
		if(specimenidentifieri == 0) {

		s.addSpcmnIdUse("[");		}
			s.addSpcmnIdUse(specimenidentifieruse.toCode());
		if(specimenidentifieri == specimenidentifierlist.size()-1) {

		s.addSpcmnIdUse("]");		}

		} else {
			s.addSpcmnIdUse("NULL");
		}

		/******************** Spcmn_Id_Assigner ********************************************************************************/
		if(specimenidentifieri == 0) {s.addSpcmnIdAssigner("[");}
		if(specimenidentifier.hasAssigner()) {

			if(specimenidentifier.getAssigner().getReference() != null) {
			s.addSpcmnIdAssigner(specimenidentifier.getAssigner().getReference());
			}
		} else {
			s.addSpcmnIdAssigner("NULL");
		}

		if(specimenidentifieri == specimenidentifierlist.size()-1) {s.addSpcmnIdAssigner("]");}


		/******************** Spcmn_Id_Sys ********************************************************************************/
		if(specimenidentifieri == 0) {s.addSpcmnIdSys("[");}
		if(specimenidentifier.hasSystem()) {

			s.addSpcmnIdSys(String.valueOf(specimenidentifier.getSystem()));
		} else {
			s.addSpcmnIdSys("NULL");
		}

		if(specimenidentifieri == specimenidentifierlist.size()-1) {s.addSpcmnIdSys("]");}


		 };
		/******************** Spcmn_ReceivedTime ********************************************************************************/
		if(specimen.hasReceivedTime()) {

			s.addSpcmnReceivedTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimen.getReceivedTime())+"\"");
		} else {
			s.addSpcmnReceivedTime("NULL");
		}


		/******************** specimencontainer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent> specimencontainerlist = specimen.getContainer();
		for(int specimencontaineri = 0; specimencontaineri<specimencontainerlist.size();specimencontaineri++ ) {
		org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent  specimencontainer = specimencontainerlist.get(specimencontaineri);

		/******************** specimencontainertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontainertype = specimencontainer.getType();

		/******************** Spcmn_Cntainer_Typ_Txt ********************************************************************************/
		if(specimencontaineri == 0) {s.addSpcmnCntainerTypTxt("[");}
		if(specimencontainertype.hasText()) {

			s.addSpcmnCntainerTypTxt(String.valueOf(specimencontainertype.getText()));
		} else {
			s.addSpcmnCntainerTypTxt("NULL");
		}

		if(specimencontaineri == specimencontainerlist.size()-1) {s.addSpcmnCntainerTypTxt("]");}


		/******************** specimencontainertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimencontainertypecodinglist = specimencontainertype.getCoding();
		for(int specimencontainertypecodingi = 0; specimencontainertypecodingi<specimencontainertypecodinglist.size();specimencontainertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimencontainertypecoding = specimencontainertypecodinglist.get(specimencontainertypecodingi);

		/******************** Spcmn_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(specimencontainertypecodingi == 0) {s.addSpcmnCntainerTypCdgDsply("[[");}
		if(specimencontainertypecoding.hasDisplay()) {

			s.addSpcmnCntainerTypCdgDsply(String.valueOf(specimencontainertypecoding.getDisplay()));
		} else {
			s.addSpcmnCntainerTypCdgDsply("NULL");
		}

		if(specimencontainertypecodingi == specimencontainertypecodinglist.size()-1) {s.addSpcmnCntainerTypCdgDsply("]]");}


		/******************** Spcmn_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimencontainertypecodingi == 0) {s.addSpcmnCntainerTypCdgVrsn("[[");}
		if(specimencontainertypecoding.hasVersion()) {

			s.addSpcmnCntainerTypCdgVrsn(String.valueOf(specimencontainertypecoding.getVersion()));
		} else {
			s.addSpcmnCntainerTypCdgVrsn("NULL");
		}

		if(specimencontainertypecodingi == specimencontainertypecodinglist.size()-1) {s.addSpcmnCntainerTypCdgVrsn("]]");}


		/******************** Spcmn_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(specimencontainertypecodingi == 0) {s.addSpcmnCntainerTypCdgCd("[[");}
		if(specimencontainertypecoding.hasCode()) {

			s.addSpcmnCntainerTypCdgCd(String.valueOf(specimencontainertypecoding.getCode()));
		} else {
			s.addSpcmnCntainerTypCdgCd("NULL");
		}

		if(specimencontainertypecodingi == specimencontainertypecodinglist.size()-1) {s.addSpcmnCntainerTypCdgCd("]]");}


		/******************** Spcmn_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimencontainertypecodingi == 0) {s.addSpcmnCntainerTypCdgUsrSltd("[[");}
		if(specimencontainertypecoding.hasUserSelected()) {

			s.addSpcmnCntainerTypCdgUsrSltd(String.valueOf(specimencontainertypecoding.getUserSelected()));
		} else {
			s.addSpcmnCntainerTypCdgUsrSltd("NULL");
		}

		if(specimencontainertypecodingi == specimencontainertypecodinglist.size()-1) {s.addSpcmnCntainerTypCdgUsrSltd("]]");}


		/******************** Spcmn_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(specimencontainertypecodingi == 0) {s.addSpcmnCntainerTypCdgSys("[[");}
		if(specimencontainertypecoding.hasSystem()) {

			s.addSpcmnCntainerTypCdgSys(String.valueOf(specimencontainertypecoding.getSystem()));
		} else {
			s.addSpcmnCntainerTypCdgSys("NULL");
		}

		if(specimencontainertypecodingi == specimencontainertypecodinglist.size()-1) {s.addSpcmnCntainerTypCdgSys("]]");}


		 };
		/******************** Spcmn_Cntainer_Dscrptn ********************************************************************************/
		if(specimencontaineri == 0) {s.addSpcmnCntainerDscrptn("[");}
		if(specimencontainer.hasDescription()) {

			s.addSpcmnCntainerDscrptn(String.valueOf(specimencontainer.getDescription()));
		} else {
			s.addSpcmnCntainerDscrptn("NULL");
		}

		if(specimencontaineri == specimencontainerlist.size()-1) {s.addSpcmnCntainerDscrptn("]");}


		/******************** specimencontaineridentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> specimencontaineridentifierlist = specimencontainer.getIdentifier();
		for(int specimencontaineridentifieri = 0; specimencontaineridentifieri<specimencontaineridentifierlist.size();specimencontaineridentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  specimencontaineridentifier = specimencontaineridentifierlist.get(specimencontaineridentifieri);

		/******************** Spcmn_Cntainer_Id_Vl ********************************************************************************/
		if(specimencontaineridentifieri == 0) {s.addSpcmnCntainerIdVl("[[");}
		if(specimencontaineridentifier.hasValue()) {

			s.addSpcmnCntainerIdVl(String.valueOf(specimencontaineridentifier.getValue()));
		} else {
			s.addSpcmnCntainerIdVl("NULL");
		}

		if(specimencontaineridentifieri == specimencontaineridentifierlist.size()-1) {s.addSpcmnCntainerIdVl("]]");}


		/******************** specimencontaineridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontaineridentifiertype = specimencontaineridentifier.getType();

		/******************** Spcmn_Cntainer_Id_Typ_Txt ********************************************************************************/
		if(specimencontaineridentifieri == 0) {s.addSpcmnCntainerIdTypTxt("[[");}
		if(specimencontaineridentifiertype.hasText()) {

			s.addSpcmnCntainerIdTypTxt(String.valueOf(specimencontaineridentifiertype.getText()));
		} else {
			s.addSpcmnCntainerIdTypTxt("NULL");
		}

		if(specimencontaineridentifieri == specimencontaineridentifierlist.size()-1) {s.addSpcmnCntainerIdTypTxt("]]");}


		/******************** specimencontaineridentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimencontaineridentifiertypecodinglist = specimencontaineridentifiertype.getCoding();
		for(int specimencontaineridentifiertypecodingi = 0; specimencontaineridentifiertypecodingi<specimencontaineridentifiertypecodinglist.size();specimencontaineridentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimencontaineridentifiertypecoding = specimencontaineridentifiertypecodinglist.get(specimencontaineridentifiertypecodingi);

		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(specimencontaineridentifiertypecodingi == 0) {s.addSpcmnCntainerIdTypCdgDsply("[[[");}
		if(specimencontaineridentifiertypecoding.hasDisplay()) {

			s.addSpcmnCntainerIdTypCdgDsply(String.valueOf(specimencontaineridentifiertypecoding.getDisplay()));
		} else {
			s.addSpcmnCntainerIdTypCdgDsply("NULL");
		}

		if(specimencontaineridentifiertypecodingi == specimencontaineridentifiertypecodinglist.size()-1) {s.addSpcmnCntainerIdTypCdgDsply("]]]");}


		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimencontaineridentifiertypecodingi == 0) {s.addSpcmnCntainerIdTypCdgVrsn("[[[");}
		if(specimencontaineridentifiertypecoding.hasVersion()) {

			s.addSpcmnCntainerIdTypCdgVrsn(String.valueOf(specimencontaineridentifiertypecoding.getVersion()));
		} else {
			s.addSpcmnCntainerIdTypCdgVrsn("NULL");
		}

		if(specimencontaineridentifiertypecodingi == specimencontaineridentifiertypecodinglist.size()-1) {s.addSpcmnCntainerIdTypCdgVrsn("]]]");}


		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Cd ********************************************************************************/
		if(specimencontaineridentifiertypecodingi == 0) {s.addSpcmnCntainerIdTypCdgCd("[[[");}
		if(specimencontaineridentifiertypecoding.hasCode()) {

			s.addSpcmnCntainerIdTypCdgCd(String.valueOf(specimencontaineridentifiertypecoding.getCode()));
		} else {
			s.addSpcmnCntainerIdTypCdgCd("NULL");
		}

		if(specimencontaineridentifiertypecodingi == specimencontaineridentifiertypecodinglist.size()-1) {s.addSpcmnCntainerIdTypCdgCd("]]]");}


		/******************** Spcmn_Cntainer_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimencontaineridentifiertypecodingi == 0) {s.addSpcmnCntainerIdTypCdgUsrSltd("[[[");}
		if(specimencontaineridentifiertypecoding.hasUserSelected()) {

			s.addSpcmnCntainerIdTypCdgUsrSltd(String.valueOf(specimencontaineridentifiertypecoding.getUserSelected()));
		} else {
			s.addSpcmnCntainerIdTypCdgUsrSltd("NULL");
		}

		if(specimencontaineridentifiertypecodingi == specimencontaineridentifiertypecodinglist.size()-1) {s.addSpcmnCntainerIdTypCdgUsrSltd("]]]");}


		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Sys ********************************************************************************/
		if(specimencontaineridentifiertypecodingi == 0) {s.addSpcmnCntainerIdTypCdgSys("[[[");}
		if(specimencontaineridentifiertypecoding.hasSystem()) {

			s.addSpcmnCntainerIdTypCdgSys(String.valueOf(specimencontaineridentifiertypecoding.getSystem()));
		} else {
			s.addSpcmnCntainerIdTypCdgSys("NULL");
		}

		if(specimencontaineridentifiertypecodingi == specimencontaineridentifiertypecodinglist.size()-1) {s.addSpcmnCntainerIdTypCdgSys("]]]");}


		 };
		/******************** specimencontaineridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimencontaineridentifierperiod = specimencontaineridentifier.getPeriod();

		/******************** Spcmn_Cntainer_Id_Prd_Strt ********************************************************************************/
		if(specimencontaineridentifieri == 0) {s.addSpcmnCntainerIdPrdStrt("[[");}
		if(specimencontaineridentifierperiod.hasStart()) {

			s.addSpcmnCntainerIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimencontaineridentifierperiod.getStart())+"\"");
		} else {
			s.addSpcmnCntainerIdPrdStrt("NULL");
		}

		if(specimencontaineridentifieri == specimencontaineridentifierlist.size()-1) {s.addSpcmnCntainerIdPrdStrt("]]");}


		/******************** Spcmn_Cntainer_Id_Prd_End ********************************************************************************/
		if(specimencontaineridentifieri == 0) {s.addSpcmnCntainerIdPrdEnd("[[");}
		if(specimencontaineridentifierperiod.hasEnd()) {

			s.addSpcmnCntainerIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimencontaineridentifierperiod.getEnd())+"\"");
		} else {
			s.addSpcmnCntainerIdPrdEnd("NULL");
		}

		if(specimencontaineridentifieri == specimencontaineridentifierlist.size()-1) {s.addSpcmnCntainerIdPrdEnd("]]");}


		/******************** specimencontaineridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimencontaineridentifieruse = specimencontaineridentifier.getUse();
		if(specimencontaineridentifieruse!=null) {
		if(specimencontaineridentifieri == 0) {

		s.addSpcmnCntainerIdUse("[[");		}
			s.addSpcmnCntainerIdUse(specimencontaineridentifieruse.toCode());
		if(specimencontaineridentifieri == specimencontaineridentifierlist.size()-1) {

		s.addSpcmnCntainerIdUse("]]");		}

		} else {
			s.addSpcmnCntainerIdUse("NULL");
		}

		/******************** Spcmn_Cntainer_Id_Assigner ********************************************************************************/
		if(specimencontaineridentifieri == 0) {s.addSpcmnCntainerIdAssigner("[[");}
		if(specimencontaineridentifier.hasAssigner()) {

			if(specimencontaineridentifier.getAssigner().getReference() != null) {
			s.addSpcmnCntainerIdAssigner(specimencontaineridentifier.getAssigner().getReference());
			}
		} else {
			s.addSpcmnCntainerIdAssigner("NULL");
		}

		if(specimencontaineridentifieri == specimencontaineridentifierlist.size()-1) {s.addSpcmnCntainerIdAssigner("]]");}


		/******************** Spcmn_Cntainer_Id_Sys ********************************************************************************/
		if(specimencontaineridentifieri == 0) {s.addSpcmnCntainerIdSys("[[");}
		if(specimencontaineridentifier.hasSystem()) {

			s.addSpcmnCntainerIdSys(String.valueOf(specimencontaineridentifier.getSystem()));
		} else {
			s.addSpcmnCntainerIdSys("NULL");
		}

		if(specimencontaineridentifieri == specimencontaineridentifierlist.size()-1) {s.addSpcmnCntainerIdSys("]]");}


		 };
		/******************** specimencontainercapacity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencontainercapacity = specimencontainer.getCapacity();

		/******************** Spcmn_Cntainer_Capacity_Vl ********************************************************************************/
		if(specimencontainercapacity.hasValue()) {

			s.addSpcmnCntainerCapacityVl(String.valueOf(specimencontainercapacity.getValue()));
		} else {
			s.addSpcmnCntainerCapacityVl("NULL");
		}


		/******************** specimencontainercapacitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencontainercapacitycomparator = specimencontainercapacity.getComparator();
		if(specimencontainercapacitycomparator!=null) {
			s.addSpcmnCntainerCapacityCmprtr(specimencontainercapacitycomparator.toCode());
		} else {
			s.addSpcmnCntainerCapacityCmprtr("NULL");
		}

		/******************** Spcmn_Cntainer_Capacity_Cd ********************************************************************************/
		if(specimencontainercapacity.hasCode()) {

			s.addSpcmnCntainerCapacityCd(String.valueOf(specimencontainercapacity.getCode()));
		} else {
			s.addSpcmnCntainerCapacityCd("NULL");
		}


		/******************** Spcmn_Cntainer_Capacity_Unt ********************************************************************************/
		if(specimencontainercapacity.hasUnit()) {

			s.addSpcmnCntainerCapacityUnt(String.valueOf(specimencontainercapacity.getUnit()));
		} else {
			s.addSpcmnCntainerCapacityUnt("NULL");
		}


		/******************** Spcmn_Cntainer_Capacity_Sys ********************************************************************************/
		if(specimencontainercapacity.hasSystem()) {

			s.addSpcmnCntainerCapacitySys(String.valueOf(specimencontainercapacity.getSystem()));
		} else {
			s.addSpcmnCntainerCapacitySys("NULL");
		}


		/******************** specimencontaineradditivecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontaineradditivecodeableconcept = specimencontainer.getAdditiveCodeableConcept();

		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(specimencontaineradditivecodeableconcept.hasText()) {

			s.addSpcmnCntainerAddtvCdbleCncptTxt(String.valueOf(specimencontaineradditivecodeableconcept.getText()));
		} else {
			s.addSpcmnCntainerAddtvCdbleCncptTxt("NULL");
		}


		/******************** specimencontaineradditivecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimencontaineradditivecodeableconceptcodinglist = specimencontaineradditivecodeableconcept.getCoding();
		for(int specimencontaineradditivecodeableconceptcodingi = 0; specimencontaineradditivecodeableconceptcodingi<specimencontaineradditivecodeableconceptcodinglist.size();specimencontaineradditivecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimencontaineradditivecodeableconceptcoding = specimencontaineradditivecodeableconceptcodinglist.get(specimencontaineradditivecodeableconceptcodingi);

		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcodingi == 0) {s.addSpcmnCntainerAddtvCdbleCncptCdgDsply("[[");}
		if(specimencontaineradditivecodeableconceptcoding.hasDisplay()) {

			s.addSpcmnCntainerAddtvCdbleCncptCdgDsply(String.valueOf(specimencontaineradditivecodeableconceptcoding.getDisplay()));
		} else {
			s.addSpcmnCntainerAddtvCdbleCncptCdgDsply("NULL");
		}

		if(specimencontaineradditivecodeableconceptcodingi == specimencontaineradditivecodeableconceptcodinglist.size()-1) {s.addSpcmnCntainerAddtvCdbleCncptCdgDsply("]]");}


		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcodingi == 0) {s.addSpcmnCntainerAddtvCdbleCncptCdgVrsn("[[");}
		if(specimencontaineradditivecodeableconceptcoding.hasVersion()) {

			s.addSpcmnCntainerAddtvCdbleCncptCdgVrsn(String.valueOf(specimencontaineradditivecodeableconceptcoding.getVersion()));
		} else {
			s.addSpcmnCntainerAddtvCdbleCncptCdgVrsn("NULL");
		}

		if(specimencontaineradditivecodeableconceptcodingi == specimencontaineradditivecodeableconceptcodinglist.size()-1) {s.addSpcmnCntainerAddtvCdbleCncptCdgVrsn("]]");}


		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcodingi == 0) {s.addSpcmnCntainerAddtvCdbleCncptCdgCd("[[");}
		if(specimencontaineradditivecodeableconceptcoding.hasCode()) {

			s.addSpcmnCntainerAddtvCdbleCncptCdgCd(String.valueOf(specimencontaineradditivecodeableconceptcoding.getCode()));
		} else {
			s.addSpcmnCntainerAddtvCdbleCncptCdgCd("NULL");
		}

		if(specimencontaineradditivecodeableconceptcodingi == specimencontaineradditivecodeableconceptcodinglist.size()-1) {s.addSpcmnCntainerAddtvCdbleCncptCdgCd("]]");}


		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcodingi == 0) {s.addSpcmnCntainerAddtvCdbleCncptCdgUsrSltd("[[");}
		if(specimencontaineradditivecodeableconceptcoding.hasUserSelected()) {

			s.addSpcmnCntainerAddtvCdbleCncptCdgUsrSltd(String.valueOf(specimencontaineradditivecodeableconceptcoding.getUserSelected()));
		} else {
			s.addSpcmnCntainerAddtvCdbleCncptCdgUsrSltd("NULL");
		}

		if(specimencontaineradditivecodeableconceptcodingi == specimencontaineradditivecodeableconceptcodinglist.size()-1) {s.addSpcmnCntainerAddtvCdbleCncptCdgUsrSltd("]]");}


		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(specimencontaineradditivecodeableconceptcodingi == 0) {s.addSpcmnCntainerAddtvCdbleCncptCdgSys("[[");}
		if(specimencontaineradditivecodeableconceptcoding.hasSystem()) {

			s.addSpcmnCntainerAddtvCdbleCncptCdgSys(String.valueOf(specimencontaineradditivecodeableconceptcoding.getSystem()));
		} else {
			s.addSpcmnCntainerAddtvCdbleCncptCdgSys("NULL");
		}

		if(specimencontaineradditivecodeableconceptcodingi == specimencontaineradditivecodeableconceptcodinglist.size()-1) {s.addSpcmnCntainerAddtvCdbleCncptCdgSys("]]");}


		 };
		/******************** specimencontainerspecimenquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencontainerspecimenquantity = specimencontainer.getSpecimenQuantity();

		/******************** Spcmn_Cntainer_SpcmnQnty_Vl ********************************************************************************/
		if(specimencontainerspecimenquantity.hasValue()) {

			s.addSpcmnCntainerSpcmnQntyVl(String.valueOf(specimencontainerspecimenquantity.getValue()));
		} else {
			s.addSpcmnCntainerSpcmnQntyVl("NULL");
		}


		/******************** specimencontainerspecimenquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencontainerspecimenquantitycomparator = specimencontainerspecimenquantity.getComparator();
		if(specimencontainerspecimenquantitycomparator!=null) {
			s.addSpcmnCntainerSpcmnQntyCmprtr(specimencontainerspecimenquantitycomparator.toCode());
		} else {
			s.addSpcmnCntainerSpcmnQntyCmprtr("NULL");
		}

		/******************** Spcmn_Cntainer_SpcmnQnty_Cd ********************************************************************************/
		if(specimencontainerspecimenquantity.hasCode()) {

			s.addSpcmnCntainerSpcmnQntyCd(String.valueOf(specimencontainerspecimenquantity.getCode()));
		} else {
			s.addSpcmnCntainerSpcmnQntyCd("NULL");
		}


		/******************** Spcmn_Cntainer_SpcmnQnty_Unt ********************************************************************************/
		if(specimencontainerspecimenquantity.hasUnit()) {

			s.addSpcmnCntainerSpcmnQntyUnt(String.valueOf(specimencontainerspecimenquantity.getUnit()));
		} else {
			s.addSpcmnCntainerSpcmnQntyUnt("NULL");
		}


		/******************** Spcmn_Cntainer_SpcmnQnty_Sys ********************************************************************************/
		if(specimencontainerspecimenquantity.hasSystem()) {

			s.addSpcmnCntainerSpcmnQntySys(String.valueOf(specimencontainerspecimenquantity.getSystem()));
		} else {
			s.addSpcmnCntainerSpcmnQntySys("NULL");
		}


		/******************** Spcmn_Cntainer_AddtvRfrnc ********************************************************************************/
		if(specimencontainer.hasAdditiveReference()) {

			if(specimencontainer.getAdditiveReference().getReference() != null) {
			s.addSpcmnCntainerAddtvRfrnc(specimencontainer.getAdditiveReference().getReference());
			}
		} else {
			s.addSpcmnCntainerAddtvRfrnc("NULL");
		}


		 };
		/******************** specimencondition ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> specimenconditionlist = specimen.getCondition();
		for(int specimenconditioni = 0; specimenconditioni<specimenconditionlist.size();specimenconditioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  specimencondition = specimenconditionlist.get(specimenconditioni);

		/******************** Spcmn_Cndtn_Txt ********************************************************************************/
		if(specimenconditioni == 0) {s.addSpcmnCndtnTxt("[");}
		if(specimencondition.hasText()) {

			s.addSpcmnCndtnTxt(String.valueOf(specimencondition.getText()));
		} else {
			s.addSpcmnCndtnTxt("NULL");
		}

		if(specimenconditioni == specimenconditionlist.size()-1) {s.addSpcmnCndtnTxt("]");}


		/******************** specimenconditioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimenconditioncodinglist = specimencondition.getCoding();
		for(int specimenconditioncodingi = 0; specimenconditioncodingi<specimenconditioncodinglist.size();specimenconditioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimenconditioncoding = specimenconditioncodinglist.get(specimenconditioncodingi);

		/******************** Spcmn_Cndtn_Cdg_Dsply ********************************************************************************/
		if(specimenconditioncodingi == 0) {s.addSpcmnCndtnCdgDsply("[[");}
		if(specimenconditioncoding.hasDisplay()) {

			s.addSpcmnCndtnCdgDsply(String.valueOf(specimenconditioncoding.getDisplay()));
		} else {
			s.addSpcmnCndtnCdgDsply("NULL");
		}

		if(specimenconditioncodingi == specimenconditioncodinglist.size()-1) {s.addSpcmnCndtnCdgDsply("]]");}


		/******************** Spcmn_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(specimenconditioncodingi == 0) {s.addSpcmnCndtnCdgVrsn("[[");}
		if(specimenconditioncoding.hasVersion()) {

			s.addSpcmnCndtnCdgVrsn(String.valueOf(specimenconditioncoding.getVersion()));
		} else {
			s.addSpcmnCndtnCdgVrsn("NULL");
		}

		if(specimenconditioncodingi == specimenconditioncodinglist.size()-1) {s.addSpcmnCndtnCdgVrsn("]]");}


		/******************** Spcmn_Cndtn_Cdg_Cd ********************************************************************************/
		if(specimenconditioncodingi == 0) {s.addSpcmnCndtnCdgCd("[[");}
		if(specimenconditioncoding.hasCode()) {

			s.addSpcmnCndtnCdgCd(String.valueOf(specimenconditioncoding.getCode()));
		} else {
			s.addSpcmnCndtnCdgCd("NULL");
		}

		if(specimenconditioncodingi == specimenconditioncodinglist.size()-1) {s.addSpcmnCndtnCdgCd("]]");}


		/******************** Spcmn_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(specimenconditioncodingi == 0) {s.addSpcmnCndtnCdgUsrSltd("[[");}
		if(specimenconditioncoding.hasUserSelected()) {

			s.addSpcmnCndtnCdgUsrSltd(String.valueOf(specimenconditioncoding.getUserSelected()));
		} else {
			s.addSpcmnCndtnCdgUsrSltd("NULL");
		}

		if(specimenconditioncodingi == specimenconditioncodinglist.size()-1) {s.addSpcmnCndtnCdgUsrSltd("]]");}


		/******************** Spcmn_Cndtn_Cdg_Sys ********************************************************************************/
		if(specimenconditioncodingi == 0) {s.addSpcmnCndtnCdgSys("[[");}
		if(specimenconditioncoding.hasSystem()) {

			s.addSpcmnCndtnCdgSys(String.valueOf(specimenconditioncoding.getSystem()));
		} else {
			s.addSpcmnCndtnCdgSys("NULL");
		}

		if(specimenconditioncodingi == specimenconditioncodinglist.size()-1) {s.addSpcmnCndtnCdgSys("]]");}


		 };
		 };
		/******************** specimenaccessionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimenaccessionidentifier = specimen.getAccessionIdentifier();

		/******************** Spcmn_AccessionId_Vl ********************************************************************************/
		if(specimenaccessionidentifier.hasValue()) {

			s.addSpcmnAccessionIdVl(String.valueOf(specimenaccessionidentifier.getValue()));
		} else {
			s.addSpcmnAccessionIdVl("NULL");
		}


		/******************** specimenaccessionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenaccessionidentifiertype = specimenaccessionidentifier.getType();

		/******************** Spcmn_AccessionId_Typ_Txt ********************************************************************************/
		if(specimenaccessionidentifiertype.hasText()) {

			s.addSpcmnAccessionIdTypTxt(String.valueOf(specimenaccessionidentifiertype.getText()));
		} else {
			s.addSpcmnAccessionIdTypTxt("NULL");
		}


		/******************** specimenaccessionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimenaccessionidentifiertypecodinglist = specimenaccessionidentifiertype.getCoding();
		for(int specimenaccessionidentifiertypecodingi = 0; specimenaccessionidentifiertypecodingi<specimenaccessionidentifiertypecodinglist.size();specimenaccessionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimenaccessionidentifiertypecoding = specimenaccessionidentifiertypecodinglist.get(specimenaccessionidentifiertypecodingi);

		/******************** Spcmn_AccessionId_Typ_Cdg_Dsply ********************************************************************************/
		if(specimenaccessionidentifiertypecodingi == 0) {s.addSpcmnAccessionIdTypCdgDsply("[");}
		if(specimenaccessionidentifiertypecoding.hasDisplay()) {

			s.addSpcmnAccessionIdTypCdgDsply(String.valueOf(specimenaccessionidentifiertypecoding.getDisplay()));
		} else {
			s.addSpcmnAccessionIdTypCdgDsply("NULL");
		}

		if(specimenaccessionidentifiertypecodingi == specimenaccessionidentifiertypecodinglist.size()-1) {s.addSpcmnAccessionIdTypCdgDsply("]");}


		/******************** Spcmn_AccessionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimenaccessionidentifiertypecodingi == 0) {s.addSpcmnAccessionIdTypCdgVrsn("[");}
		if(specimenaccessionidentifiertypecoding.hasVersion()) {

			s.addSpcmnAccessionIdTypCdgVrsn(String.valueOf(specimenaccessionidentifiertypecoding.getVersion()));
		} else {
			s.addSpcmnAccessionIdTypCdgVrsn("NULL");
		}

		if(specimenaccessionidentifiertypecodingi == specimenaccessionidentifiertypecodinglist.size()-1) {s.addSpcmnAccessionIdTypCdgVrsn("]");}


		/******************** Spcmn_AccessionId_Typ_Cdg_Cd ********************************************************************************/
		if(specimenaccessionidentifiertypecodingi == 0) {s.addSpcmnAccessionIdTypCdgCd("[");}
		if(specimenaccessionidentifiertypecoding.hasCode()) {

			s.addSpcmnAccessionIdTypCdgCd(String.valueOf(specimenaccessionidentifiertypecoding.getCode()));
		} else {
			s.addSpcmnAccessionIdTypCdgCd("NULL");
		}

		if(specimenaccessionidentifiertypecodingi == specimenaccessionidentifiertypecodinglist.size()-1) {s.addSpcmnAccessionIdTypCdgCd("]");}


		/******************** Spcmn_AccessionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimenaccessionidentifiertypecodingi == 0) {s.addSpcmnAccessionIdTypCdgUsrSltd("[");}
		if(specimenaccessionidentifiertypecoding.hasUserSelected()) {

			s.addSpcmnAccessionIdTypCdgUsrSltd(String.valueOf(specimenaccessionidentifiertypecoding.getUserSelected()));
		} else {
			s.addSpcmnAccessionIdTypCdgUsrSltd("NULL");
		}

		if(specimenaccessionidentifiertypecodingi == specimenaccessionidentifiertypecodinglist.size()-1) {s.addSpcmnAccessionIdTypCdgUsrSltd("]");}


		/******************** Spcmn_AccessionId_Typ_Cdg_Sys ********************************************************************************/
		if(specimenaccessionidentifiertypecodingi == 0) {s.addSpcmnAccessionIdTypCdgSys("[");}
		if(specimenaccessionidentifiertypecoding.hasSystem()) {

			s.addSpcmnAccessionIdTypCdgSys(String.valueOf(specimenaccessionidentifiertypecoding.getSystem()));
		} else {
			s.addSpcmnAccessionIdTypCdgSys("NULL");
		}

		if(specimenaccessionidentifiertypecodingi == specimenaccessionidentifiertypecodinglist.size()-1) {s.addSpcmnAccessionIdTypCdgSys("]");}


		 };
		/******************** specimenaccessionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenaccessionidentifierperiod = specimenaccessionidentifier.getPeriod();

		/******************** Spcmn_AccessionId_Prd_Strt ********************************************************************************/
		if(specimenaccessionidentifierperiod.hasStart()) {

			s.addSpcmnAccessionIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimenaccessionidentifierperiod.getStart())+"\"");
		} else {
			s.addSpcmnAccessionIdPrdStrt("NULL");
		}


		/******************** Spcmn_AccessionId_Prd_End ********************************************************************************/
		if(specimenaccessionidentifierperiod.hasEnd()) {

			s.addSpcmnAccessionIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimenaccessionidentifierperiod.getEnd())+"\"");
		} else {
			s.addSpcmnAccessionIdPrdEnd("NULL");
		}


		/******************** specimenaccessionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimenaccessionidentifieruse = specimenaccessionidentifier.getUse();
		if(specimenaccessionidentifieruse!=null) {
			s.addSpcmnAccessionIdUse(specimenaccessionidentifieruse.toCode());
		} else {
			s.addSpcmnAccessionIdUse("NULL");
		}

		/******************** Spcmn_AccessionId_Assigner ********************************************************************************/
		if(specimenaccessionidentifier.hasAssigner()) {

			if(specimenaccessionidentifier.getAssigner().getReference() != null) {
			s.addSpcmnAccessionIdAssigner(specimenaccessionidentifier.getAssigner().getReference());
			}
		} else {
			s.addSpcmnAccessionIdAssigner("NULL");
		}


		/******************** Spcmn_AccessionId_Sys ********************************************************************************/
		if(specimenaccessionidentifier.hasSystem()) {

			s.addSpcmnAccessionIdSys(String.valueOf(specimenaccessionidentifier.getSystem()));
		} else {
			s.addSpcmnAccessionIdSys("NULL");
		}


		/******************** specimenprocessing ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent> specimenprocessinglist = specimen.getProcessing();
		for(int specimenprocessingi = 0; specimenprocessingi<specimenprocessinglist.size();specimenprocessingi++ ) {
		org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent  specimenprocessing = specimenprocessinglist.get(specimenprocessingi);

		/******************** Spcmn_Processing_Dscrptn ********************************************************************************/
		if(specimenprocessingi == 0) {s.addSpcmnProcessingDscrptn("[");}
		if(specimenprocessing.hasDescription()) {

			s.addSpcmnProcessingDscrptn(String.valueOf(specimenprocessing.getDescription()));
		} else {
			s.addSpcmnProcessingDscrptn("NULL");
		}

		if(specimenprocessingi == specimenprocessinglist.size()-1) {s.addSpcmnProcessingDscrptn("]");}


		/******************** specimenprocessingprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenprocessingprocedure = specimenprocessing.getProcedure();

		/******************** Spcmn_Processing_Prcdr_Txt ********************************************************************************/
		if(specimenprocessingi == 0) {s.addSpcmnProcessingPrcdrTxt("[");}
		if(specimenprocessingprocedure.hasText()) {

			s.addSpcmnProcessingPrcdrTxt(String.valueOf(specimenprocessingprocedure.getText()));
		} else {
			s.addSpcmnProcessingPrcdrTxt("NULL");
		}

		if(specimenprocessingi == specimenprocessinglist.size()-1) {s.addSpcmnProcessingPrcdrTxt("]");}


		/******************** specimenprocessingprocedurecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimenprocessingprocedurecodinglist = specimenprocessingprocedure.getCoding();
		for(int specimenprocessingprocedurecodingi = 0; specimenprocessingprocedurecodingi<specimenprocessingprocedurecodinglist.size();specimenprocessingprocedurecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimenprocessingprocedurecoding = specimenprocessingprocedurecodinglist.get(specimenprocessingprocedurecodingi);

		/******************** Spcmn_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(specimenprocessingprocedurecodingi == 0) {s.addSpcmnProcessingPrcdrCdgDsply("[[");}
		if(specimenprocessingprocedurecoding.hasDisplay()) {

			s.addSpcmnProcessingPrcdrCdgDsply(String.valueOf(specimenprocessingprocedurecoding.getDisplay()));
		} else {
			s.addSpcmnProcessingPrcdrCdgDsply("NULL");
		}

		if(specimenprocessingprocedurecodingi == specimenprocessingprocedurecodinglist.size()-1) {s.addSpcmnProcessingPrcdrCdgDsply("]]");}


		/******************** Spcmn_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(specimenprocessingprocedurecodingi == 0) {s.addSpcmnProcessingPrcdrCdgVrsn("[[");}
		if(specimenprocessingprocedurecoding.hasVersion()) {

			s.addSpcmnProcessingPrcdrCdgVrsn(String.valueOf(specimenprocessingprocedurecoding.getVersion()));
		} else {
			s.addSpcmnProcessingPrcdrCdgVrsn("NULL");
		}

		if(specimenprocessingprocedurecodingi == specimenprocessingprocedurecodinglist.size()-1) {s.addSpcmnProcessingPrcdrCdgVrsn("]]");}


		/******************** Spcmn_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(specimenprocessingprocedurecodingi == 0) {s.addSpcmnProcessingPrcdrCdgCd("[[");}
		if(specimenprocessingprocedurecoding.hasCode()) {

			s.addSpcmnProcessingPrcdrCdgCd(String.valueOf(specimenprocessingprocedurecoding.getCode()));
		} else {
			s.addSpcmnProcessingPrcdrCdgCd("NULL");
		}

		if(specimenprocessingprocedurecodingi == specimenprocessingprocedurecodinglist.size()-1) {s.addSpcmnProcessingPrcdrCdgCd("]]");}


		/******************** Spcmn_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(specimenprocessingprocedurecodingi == 0) {s.addSpcmnProcessingPrcdrCdgUsrSltd("[[");}
		if(specimenprocessingprocedurecoding.hasUserSelected()) {

			s.addSpcmnProcessingPrcdrCdgUsrSltd(String.valueOf(specimenprocessingprocedurecoding.getUserSelected()));
		} else {
			s.addSpcmnProcessingPrcdrCdgUsrSltd("NULL");
		}

		if(specimenprocessingprocedurecodingi == specimenprocessingprocedurecodinglist.size()-1) {s.addSpcmnProcessingPrcdrCdgUsrSltd("]]");}


		/******************** Spcmn_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(specimenprocessingprocedurecodingi == 0) {s.addSpcmnProcessingPrcdrCdgSys("[[");}
		if(specimenprocessingprocedurecoding.hasSystem()) {

			s.addSpcmnProcessingPrcdrCdgSys(String.valueOf(specimenprocessingprocedurecoding.getSystem()));
		} else {
			s.addSpcmnProcessingPrcdrCdgSys("NULL");
		}

		if(specimenprocessingprocedurecodingi == specimenprocessingprocedurecodinglist.size()-1) {s.addSpcmnProcessingPrcdrCdgSys("]]");}


		 };
		/******************** Spcmn_Processing_Addtv ********************************************************************************/
		if(specimenprocessingi == 0) {s.addSpcmnProcessingAddtv("[");}
		if(specimenprocessing.hasAdditive()) {

			String  array = "[";
			for(int incr=0; incr<specimenprocessing.getAdditive().size(); incr++) {
				array = array + specimenprocessing.getAdditive().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpcmnProcessingAddtv(array);

		} else {
			s.addSpcmnProcessingAddtv("NULL");
		}

		if(specimenprocessingi == specimenprocessinglist.size()-1) {s.addSpcmnProcessingAddtv("]");}


		/******************** specimenprocessingtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenprocessingtimeperiod = specimenprocessing.getTimePeriod();

		/******************** Spcmn_Processing_TimePrd_Strt ********************************************************************************/
		if(specimenprocessingi == 0) {s.addSpcmnProcessingTimePrdStrt("[");}
		if(specimenprocessingtimeperiod.hasStart()) {

			s.addSpcmnProcessingTimePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimenprocessingtimeperiod.getStart())+"\"");
		} else {
			s.addSpcmnProcessingTimePrdStrt("NULL");
		}

		if(specimenprocessingi == specimenprocessinglist.size()-1) {s.addSpcmnProcessingTimePrdStrt("]");}


		/******************** Spcmn_Processing_TimePrd_End ********************************************************************************/
		if(specimenprocessingi == 0) {s.addSpcmnProcessingTimePrdEnd("[");}
		if(specimenprocessingtimeperiod.hasEnd()) {

			s.addSpcmnProcessingTimePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimenprocessingtimeperiod.getEnd())+"\"");
		} else {
			s.addSpcmnProcessingTimePrdEnd("NULL");
		}

		if(specimenprocessingi == specimenprocessinglist.size()-1) {s.addSpcmnProcessingTimePrdEnd("]");}


		/******************** Spcmn_Processing_TimeDtTimeTyp ********************************************************************************/
		if(specimenprocessingi == 0) {s.addSpcmnProcessingTimeDtTimeTyp("[");}
		if(specimenprocessing.hasTimeDateTimeType()) {

			s.addSpcmnProcessingTimeDtTimeTyp("\""+specimenprocessing.getTimeDateTimeType().getValueAsString()+"\"");
		} else {
			s.addSpcmnProcessingTimeDtTimeTyp("NULL");
		}

		if(specimenprocessingi == specimenprocessinglist.size()-1) {s.addSpcmnProcessingTimeDtTimeTyp("]");}


		 };
		/******************** specimencollection ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenCollectionComponent specimencollection = specimen.getCollection();

		/******************** specimencollectionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionmethod = specimencollection.getMethod();

		/******************** Spcmn_Collection_Mthd_Txt ********************************************************************************/
		if(specimencollectionmethod.hasText()) {

			s.addSpcmnCollectionMthdTxt(String.valueOf(specimencollectionmethod.getText()));
		} else {
			s.addSpcmnCollectionMthdTxt("NULL");
		}


		/******************** specimencollectionmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimencollectionmethodcodinglist = specimencollectionmethod.getCoding();
		for(int specimencollectionmethodcodingi = 0; specimencollectionmethodcodingi<specimencollectionmethodcodinglist.size();specimencollectionmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimencollectionmethodcoding = specimencollectionmethodcodinglist.get(specimencollectionmethodcodingi);

		/******************** Spcmn_Collection_Mthd_Cdg_Dsply ********************************************************************************/
		if(specimencollectionmethodcodingi == 0) {s.addSpcmnCollectionMthdCdgDsply("[");}
		if(specimencollectionmethodcoding.hasDisplay()) {

			s.addSpcmnCollectionMthdCdgDsply(String.valueOf(specimencollectionmethodcoding.getDisplay()));
		} else {
			s.addSpcmnCollectionMthdCdgDsply("NULL");
		}

		if(specimencollectionmethodcodingi == specimencollectionmethodcodinglist.size()-1) {s.addSpcmnCollectionMthdCdgDsply("]");}


		/******************** Spcmn_Collection_Mthd_Cdg_Vrsn ********************************************************************************/
		if(specimencollectionmethodcodingi == 0) {s.addSpcmnCollectionMthdCdgVrsn("[");}
		if(specimencollectionmethodcoding.hasVersion()) {

			s.addSpcmnCollectionMthdCdgVrsn(String.valueOf(specimencollectionmethodcoding.getVersion()));
		} else {
			s.addSpcmnCollectionMthdCdgVrsn("NULL");
		}

		if(specimencollectionmethodcodingi == specimencollectionmethodcodinglist.size()-1) {s.addSpcmnCollectionMthdCdgVrsn("]");}


		/******************** Spcmn_Collection_Mthd_Cdg_Cd ********************************************************************************/
		if(specimencollectionmethodcodingi == 0) {s.addSpcmnCollectionMthdCdgCd("[");}
		if(specimencollectionmethodcoding.hasCode()) {

			s.addSpcmnCollectionMthdCdgCd(String.valueOf(specimencollectionmethodcoding.getCode()));
		} else {
			s.addSpcmnCollectionMthdCdgCd("NULL");
		}

		if(specimencollectionmethodcodingi == specimencollectionmethodcodinglist.size()-1) {s.addSpcmnCollectionMthdCdgCd("]");}


		/******************** Spcmn_Collection_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(specimencollectionmethodcodingi == 0) {s.addSpcmnCollectionMthdCdgUsrSltd("[");}
		if(specimencollectionmethodcoding.hasUserSelected()) {

			s.addSpcmnCollectionMthdCdgUsrSltd(String.valueOf(specimencollectionmethodcoding.getUserSelected()));
		} else {
			s.addSpcmnCollectionMthdCdgUsrSltd("NULL");
		}

		if(specimencollectionmethodcodingi == specimencollectionmethodcodinglist.size()-1) {s.addSpcmnCollectionMthdCdgUsrSltd("]");}


		/******************** Spcmn_Collection_Mthd_Cdg_Sys ********************************************************************************/
		if(specimencollectionmethodcodingi == 0) {s.addSpcmnCollectionMthdCdgSys("[");}
		if(specimencollectionmethodcoding.hasSystem()) {

			s.addSpcmnCollectionMthdCdgSys(String.valueOf(specimencollectionmethodcoding.getSystem()));
		} else {
			s.addSpcmnCollectionMthdCdgSys("NULL");
		}

		if(specimencollectionmethodcodingi == specimencollectionmethodcodinglist.size()-1) {s.addSpcmnCollectionMthdCdgSys("]");}


		 };
		/******************** specimencollectionbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionbodysite = specimencollection.getBodySite();

		/******************** Spcmn_Collection_BodySite_Txt ********************************************************************************/
		if(specimencollectionbodysite.hasText()) {

			s.addSpcmnCollectionBodySiteTxt(String.valueOf(specimencollectionbodysite.getText()));
		} else {
			s.addSpcmnCollectionBodySiteTxt("NULL");
		}


		/******************** specimencollectionbodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimencollectionbodysitecodinglist = specimencollectionbodysite.getCoding();
		for(int specimencollectionbodysitecodingi = 0; specimencollectionbodysitecodingi<specimencollectionbodysitecodinglist.size();specimencollectionbodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimencollectionbodysitecoding = specimencollectionbodysitecodinglist.get(specimencollectionbodysitecodingi);

		/******************** Spcmn_Collection_BodySite_Cdg_Dsply ********************************************************************************/
		if(specimencollectionbodysitecodingi == 0) {s.addSpcmnCollectionBodySiteCdgDsply("[");}
		if(specimencollectionbodysitecoding.hasDisplay()) {

			s.addSpcmnCollectionBodySiteCdgDsply(String.valueOf(specimencollectionbodysitecoding.getDisplay()));
		} else {
			s.addSpcmnCollectionBodySiteCdgDsply("NULL");
		}

		if(specimencollectionbodysitecodingi == specimencollectionbodysitecodinglist.size()-1) {s.addSpcmnCollectionBodySiteCdgDsply("]");}


		/******************** Spcmn_Collection_BodySite_Cdg_Vrsn ********************************************************************************/
		if(specimencollectionbodysitecodingi == 0) {s.addSpcmnCollectionBodySiteCdgVrsn("[");}
		if(specimencollectionbodysitecoding.hasVersion()) {

			s.addSpcmnCollectionBodySiteCdgVrsn(String.valueOf(specimencollectionbodysitecoding.getVersion()));
		} else {
			s.addSpcmnCollectionBodySiteCdgVrsn("NULL");
		}

		if(specimencollectionbodysitecodingi == specimencollectionbodysitecodinglist.size()-1) {s.addSpcmnCollectionBodySiteCdgVrsn("]");}


		/******************** Spcmn_Collection_BodySite_Cdg_Cd ********************************************************************************/
		if(specimencollectionbodysitecodingi == 0) {s.addSpcmnCollectionBodySiteCdgCd("[");}
		if(specimencollectionbodysitecoding.hasCode()) {

			s.addSpcmnCollectionBodySiteCdgCd(String.valueOf(specimencollectionbodysitecoding.getCode()));
		} else {
			s.addSpcmnCollectionBodySiteCdgCd("NULL");
		}

		if(specimencollectionbodysitecodingi == specimencollectionbodysitecodinglist.size()-1) {s.addSpcmnCollectionBodySiteCdgCd("]");}


		/******************** Spcmn_Collection_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(specimencollectionbodysitecodingi == 0) {s.addSpcmnCollectionBodySiteCdgUsrSltd("[");}
		if(specimencollectionbodysitecoding.hasUserSelected()) {

			s.addSpcmnCollectionBodySiteCdgUsrSltd(String.valueOf(specimencollectionbodysitecoding.getUserSelected()));
		} else {
			s.addSpcmnCollectionBodySiteCdgUsrSltd("NULL");
		}

		if(specimencollectionbodysitecodingi == specimencollectionbodysitecodinglist.size()-1) {s.addSpcmnCollectionBodySiteCdgUsrSltd("]");}


		/******************** Spcmn_Collection_BodySite_Cdg_Sys ********************************************************************************/
		if(specimencollectionbodysitecodingi == 0) {s.addSpcmnCollectionBodySiteCdgSys("[");}
		if(specimencollectionbodysitecoding.hasSystem()) {

			s.addSpcmnCollectionBodySiteCdgSys(String.valueOf(specimencollectionbodysitecoding.getSystem()));
		} else {
			s.addSpcmnCollectionBodySiteCdgSys("NULL");
		}

		if(specimencollectionbodysitecodingi == specimencollectionbodysitecodinglist.size()-1) {s.addSpcmnCollectionBodySiteCdgSys("]");}


		 };
		/******************** Spcmn_Collection_Collector ********************************************************************************/
		if(specimencollection.hasCollector()) {

			if(specimencollection.getCollector().getReference() != null) {
			s.addSpcmnCollectionCollector(specimencollection.getCollector().getReference());
			}
		} else {
			s.addSpcmnCollectionCollector("NULL");
		}


		/******************** specimencollectioncollectedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimencollectioncollectedperiod = specimencollection.getCollectedPeriod();

		/******************** Spcmn_Collection_CollectedPrd_Strt ********************************************************************************/
		if(specimencollectioncollectedperiod.hasStart()) {

			s.addSpcmnCollectionCollectedPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimencollectioncollectedperiod.getStart())+"\"");
		} else {
			s.addSpcmnCollectionCollectedPrdStrt("NULL");
		}


		/******************** Spcmn_Collection_CollectedPrd_End ********************************************************************************/
		if(specimencollectioncollectedperiod.hasEnd()) {

			s.addSpcmnCollectionCollectedPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(specimencollectioncollectedperiod.getEnd())+"\"");
		} else {
			s.addSpcmnCollectionCollectedPrdEnd("NULL");
		}


		/******************** Spcmn_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(specimencollection.hasCollectedDateTimeType()) {

			s.addSpcmnCollectionCollectedDtTimeTyp("\""+specimencollection.getCollectedDateTimeType().getValueAsString()+"\"");
		} else {
			s.addSpcmnCollectionCollectedDtTimeTyp("NULL");
		}


		/******************** specimencollectionfastingstatusduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimencollectionfastingstatusduration = specimencollection.getFastingStatusDuration();

		/******************** Spcmn_Collection_FastingStsDuration_Vl ********************************************************************************/
		if(specimencollectionfastingstatusduration.hasValue()) {

			s.addSpcmnCollectionFastingStsDurationVl(String.valueOf(specimencollectionfastingstatusduration.getValue()));
		} else {
			s.addSpcmnCollectionFastingStsDurationVl("NULL");
		}


		/******************** specimencollectionfastingstatusdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencollectionfastingstatusdurationcomparator = specimencollectionfastingstatusduration.getComparator();
		if(specimencollectionfastingstatusdurationcomparator!=null) {
			s.addSpcmnCollectionFastingStsDurationCmprtr(specimencollectionfastingstatusdurationcomparator.toCode());
		} else {
			s.addSpcmnCollectionFastingStsDurationCmprtr("NULL");
		}

		/******************** Spcmn_Collection_FastingStsDuration_Cd ********************************************************************************/
		if(specimencollectionfastingstatusduration.hasCode()) {

			s.addSpcmnCollectionFastingStsDurationCd(String.valueOf(specimencollectionfastingstatusduration.getCode()));
		} else {
			s.addSpcmnCollectionFastingStsDurationCd("NULL");
		}


		/******************** Spcmn_Collection_FastingStsDuration_Unt ********************************************************************************/
		if(specimencollectionfastingstatusduration.hasUnit()) {

			s.addSpcmnCollectionFastingStsDurationUnt(String.valueOf(specimencollectionfastingstatusduration.getUnit()));
		} else {
			s.addSpcmnCollectionFastingStsDurationUnt("NULL");
		}


		/******************** Spcmn_Collection_FastingStsDuration_Sys ********************************************************************************/
		if(specimencollectionfastingstatusduration.hasSystem()) {

			s.addSpcmnCollectionFastingStsDurationSys(String.valueOf(specimencollectionfastingstatusduration.getSystem()));
		} else {
			s.addSpcmnCollectionFastingStsDurationSys("NULL");
		}


		/******************** specimencollectionfastingstatuscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionfastingstatuscodeableconcept = specimencollection.getFastingStatusCodeableConcept();

		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Txt ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconcept.hasText()) {

			s.addSpcmnCollectionFastingStsCdbleCncptTxt(String.valueOf(specimencollectionfastingstatuscodeableconcept.getText()));
		} else {
			s.addSpcmnCollectionFastingStsCdbleCncptTxt("NULL");
		}


		/******************** specimencollectionfastingstatuscodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> specimencollectionfastingstatuscodeableconceptcodinglist = specimencollectionfastingstatuscodeableconcept.getCoding();
		for(int specimencollectionfastingstatuscodeableconceptcodingi = 0; specimencollectionfastingstatuscodeableconceptcodingi<specimencollectionfastingstatuscodeableconceptcodinglist.size();specimencollectionfastingstatuscodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  specimencollectionfastingstatuscodeableconceptcoding = specimencollectionfastingstatuscodeableconceptcodinglist.get(specimencollectionfastingstatuscodeableconceptcodingi);

		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcodingi == 0) {s.addSpcmnCollectionFastingStsCdbleCncptCdgDsply("[");}
		if(specimencollectionfastingstatuscodeableconceptcoding.hasDisplay()) {

			s.addSpcmnCollectionFastingStsCdbleCncptCdgDsply(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getDisplay()));
		} else {
			s.addSpcmnCollectionFastingStsCdbleCncptCdgDsply("NULL");
		}

		if(specimencollectionfastingstatuscodeableconceptcodingi == specimencollectionfastingstatuscodeableconceptcodinglist.size()-1) {s.addSpcmnCollectionFastingStsCdbleCncptCdgDsply("]");}


		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcodingi == 0) {s.addSpcmnCollectionFastingStsCdbleCncptCdgVrsn("[");}
		if(specimencollectionfastingstatuscodeableconceptcoding.hasVersion()) {

			s.addSpcmnCollectionFastingStsCdbleCncptCdgVrsn(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getVersion()));
		} else {
			s.addSpcmnCollectionFastingStsCdbleCncptCdgVrsn("NULL");
		}

		if(specimencollectionfastingstatuscodeableconceptcodingi == specimencollectionfastingstatuscodeableconceptcodinglist.size()-1) {s.addSpcmnCollectionFastingStsCdbleCncptCdgVrsn("]");}


		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcodingi == 0) {s.addSpcmnCollectionFastingStsCdbleCncptCdgCd("[");}
		if(specimencollectionfastingstatuscodeableconceptcoding.hasCode()) {

			s.addSpcmnCollectionFastingStsCdbleCncptCdgCd(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getCode()));
		} else {
			s.addSpcmnCollectionFastingStsCdbleCncptCdgCd("NULL");
		}

		if(specimencollectionfastingstatuscodeableconceptcodingi == specimencollectionfastingstatuscodeableconceptcodinglist.size()-1) {s.addSpcmnCollectionFastingStsCdbleCncptCdgCd("]");}


		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcodingi == 0) {s.addSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd("[");}
		if(specimencollectionfastingstatuscodeableconceptcoding.hasUserSelected()) {

			s.addSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getUserSelected()));
		} else {
			s.addSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd("NULL");
		}

		if(specimencollectionfastingstatuscodeableconceptcodingi == specimencollectionfastingstatuscodeableconceptcodinglist.size()-1) {s.addSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd("]");}


		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(specimencollectionfastingstatuscodeableconceptcodingi == 0) {s.addSpcmnCollectionFastingStsCdbleCncptCdgSys("[");}
		if(specimencollectionfastingstatuscodeableconceptcoding.hasSystem()) {

			s.addSpcmnCollectionFastingStsCdbleCncptCdgSys(String.valueOf(specimencollectionfastingstatuscodeableconceptcoding.getSystem()));
		} else {
			s.addSpcmnCollectionFastingStsCdbleCncptCdgSys("NULL");
		}

		if(specimencollectionfastingstatuscodeableconceptcodingi == specimencollectionfastingstatuscodeableconceptcodinglist.size()-1) {s.addSpcmnCollectionFastingStsCdbleCncptCdgSys("]");}


		 };
		/******************** specimencollectionduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimencollectionduration = specimencollection.getDuration();

		/******************** Spcmn_Collection_Duration_Vl ********************************************************************************/
		if(specimencollectionduration.hasValue()) {

			s.addSpcmnCollectionDurationVl(String.valueOf(specimencollectionduration.getValue()));
		} else {
			s.addSpcmnCollectionDurationVl("NULL");
		}


		/******************** specimencollectiondurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencollectiondurationcomparator = specimencollectionduration.getComparator();
		if(specimencollectiondurationcomparator!=null) {
			s.addSpcmnCollectionDurationCmprtr(specimencollectiondurationcomparator.toCode());
		} else {
			s.addSpcmnCollectionDurationCmprtr("NULL");
		}

		/******************** Spcmn_Collection_Duration_Cd ********************************************************************************/
		if(specimencollectionduration.hasCode()) {

			s.addSpcmnCollectionDurationCd(String.valueOf(specimencollectionduration.getCode()));
		} else {
			s.addSpcmnCollectionDurationCd("NULL");
		}


		/******************** Spcmn_Collection_Duration_Unt ********************************************************************************/
		if(specimencollectionduration.hasUnit()) {

			s.addSpcmnCollectionDurationUnt(String.valueOf(specimencollectionduration.getUnit()));
		} else {
			s.addSpcmnCollectionDurationUnt("NULL");
		}


		/******************** Spcmn_Collection_Duration_Sys ********************************************************************************/
		if(specimencollectionduration.hasSystem()) {

			s.addSpcmnCollectionDurationSys(String.valueOf(specimencollectionduration.getSystem()));
		} else {
			s.addSpcmnCollectionDurationSys("NULL");
		}


		/******************** specimencollectionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencollectionquantity = specimencollection.getQuantity();

		/******************** Spcmn_Collection_Qnty_Vl ********************************************************************************/
		if(specimencollectionquantity.hasValue()) {

			s.addSpcmnCollectionQntyVl(String.valueOf(specimencollectionquantity.getValue()));
		} else {
			s.addSpcmnCollectionQntyVl("NULL");
		}


		/******************** specimencollectionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimencollectionquantitycomparator = specimencollectionquantity.getComparator();
		if(specimencollectionquantitycomparator!=null) {
			s.addSpcmnCollectionQntyCmprtr(specimencollectionquantitycomparator.toCode());
		} else {
			s.addSpcmnCollectionQntyCmprtr("NULL");
		}

		/******************** Spcmn_Collection_Qnty_Cd ********************************************************************************/
		if(specimencollectionquantity.hasCode()) {

			s.addSpcmnCollectionQntyCd(String.valueOf(specimencollectionquantity.getCode()));
		} else {
			s.addSpcmnCollectionQntyCd("NULL");
		}


		/******************** Spcmn_Collection_Qnty_Unt ********************************************************************************/
		if(specimencollectionquantity.hasUnit()) {

			s.addSpcmnCollectionQntyUnt(String.valueOf(specimencollectionquantity.getUnit()));
		} else {
			s.addSpcmnCollectionQntyUnt("NULL");
		}


		/******************** Spcmn_Collection_Qnty_Sys ********************************************************************************/
		if(specimencollectionquantity.hasSystem()) {

			s.addSpcmnCollectionQntySys(String.valueOf(specimencollectionquantity.getSystem()));
		} else {
			s.addSpcmnCollectionQntySys("NULL");
		}


		return s;
	}
}
