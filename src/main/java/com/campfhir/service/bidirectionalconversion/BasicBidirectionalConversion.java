package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Basic;
public class BasicBidirectionalConversion 
{
	public Basic Basics(org.hl7.fhir.r4.model.Basic basic) throws ParseException
	{
		 main.java.com.campfhir.model.Basic b = new  main.java.com.campfhir.model.Basic();

		/******************** id ********************************************************************************/
		b.setId(basic.getIdElement().getIdPart());

		/******************** basiccode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept basiccode = basic.getCode();

		/******************** Basic_Cd_Txt ********************************************************************************/
		if(basiccode.hasText()) {

			b.addBasicCdTxt(String.valueOf(basiccode.getText()));
		} else {
			b.addBasicCdTxt("NULL");
		}


		/******************** basiccodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> basiccodecodinglist = basiccode.getCoding();
		for(int basiccodecodingi = 0; basiccodecodingi<basiccodecodinglist.size();basiccodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  basiccodecoding = basiccodecodinglist.get(basiccodecodingi);

		/******************** Basic_Cd_Cdg_Dsply ********************************************************************************/
		if(basiccodecodingi == 0) {b.addBasicCdCdgDsply("[");}
		if(basiccodecoding.hasDisplay()) {

			b.addBasicCdCdgDsply(String.valueOf(basiccodecoding.getDisplay()));
		} else {
			b.addBasicCdCdgDsply("NULL");
		}

		if(basiccodecodingi == basiccodecodinglist.size()-1) {b.addBasicCdCdgDsply("]");}


		/******************** Basic_Cd_Cdg_Vrsn ********************************************************************************/
		if(basiccodecodingi == 0) {b.addBasicCdCdgVrsn("[");}
		if(basiccodecoding.hasVersion()) {

			b.addBasicCdCdgVrsn(String.valueOf(basiccodecoding.getVersion()));
		} else {
			b.addBasicCdCdgVrsn("NULL");
		}

		if(basiccodecodingi == basiccodecodinglist.size()-1) {b.addBasicCdCdgVrsn("]");}


		/******************** Basic_Cd_Cdg_Cd ********************************************************************************/
		if(basiccodecodingi == 0) {b.addBasicCdCdgCd("[");}
		if(basiccodecoding.hasCode()) {

			b.addBasicCdCdgCd(String.valueOf(basiccodecoding.getCode()));
		} else {
			b.addBasicCdCdgCd("NULL");
		}

		if(basiccodecodingi == basiccodecodinglist.size()-1) {b.addBasicCdCdgCd("]");}


		/******************** Basic_Cd_Cdg_UsrSltd ********************************************************************************/
		if(basiccodecodingi == 0) {b.addBasicCdCdgUsrSltd("[");}
		if(basiccodecoding.hasUserSelected()) {

			b.addBasicCdCdgUsrSltd(String.valueOf(basiccodecoding.getUserSelected()));
		} else {
			b.addBasicCdCdgUsrSltd("NULL");
		}

		if(basiccodecodingi == basiccodecodinglist.size()-1) {b.addBasicCdCdgUsrSltd("]");}


		/******************** Basic_Cd_Cdg_Sys ********************************************************************************/
		if(basiccodecodingi == 0) {b.addBasicCdCdgSys("[");}
		if(basiccodecoding.hasSystem()) {

			b.addBasicCdCdgSys(String.valueOf(basiccodecoding.getSystem()));
		} else {
			b.addBasicCdCdgSys("NULL");
		}

		if(basiccodecodingi == basiccodecodinglist.size()-1) {b.addBasicCdCdgSys("]");}


		 };
		/******************** Basic_Sbjct ********************************************************************************/
		if(basic.hasSubject()) {

			if(basic.getSubject().getReference() != null) {
			b.addBasicSbjct(basic.getSubject().getReference());
			}
		} else {
			b.addBasicSbjct("NULL");
		}


		/******************** Basic_Created ********************************************************************************/
		if(basic.hasCreated()) {

			b.addBasicCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(basic.getCreated())+"\"");
		} else {
			b.addBasicCreated("NULL");
		}


		/******************** basicidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> basicidentifierlist = basic.getIdentifier();
		for(int basicidentifieri = 0; basicidentifieri<basicidentifierlist.size();basicidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  basicidentifier = basicidentifierlist.get(basicidentifieri);

		/******************** Basic_Id_Vl ********************************************************************************/
		if(basicidentifieri == 0) {b.addBasicIdVl("[");}
		if(basicidentifier.hasValue()) {

			b.addBasicIdVl(String.valueOf(basicidentifier.getValue()));
		} else {
			b.addBasicIdVl("NULL");
		}

		if(basicidentifieri == basicidentifierlist.size()-1) {b.addBasicIdVl("]");}


		/******************** basicidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept basicidentifiertype = basicidentifier.getType();

		/******************** Basic_Id_Typ_Txt ********************************************************************************/
		if(basicidentifieri == 0) {b.addBasicIdTypTxt("[");}
		if(basicidentifiertype.hasText()) {

			b.addBasicIdTypTxt(String.valueOf(basicidentifiertype.getText()));
		} else {
			b.addBasicIdTypTxt("NULL");
		}

		if(basicidentifieri == basicidentifierlist.size()-1) {b.addBasicIdTypTxt("]");}


		/******************** basicidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> basicidentifiertypecodinglist = basicidentifiertype.getCoding();
		for(int basicidentifiertypecodingi = 0; basicidentifiertypecodingi<basicidentifiertypecodinglist.size();basicidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  basicidentifiertypecoding = basicidentifiertypecodinglist.get(basicidentifiertypecodingi);

		/******************** Basic_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(basicidentifiertypecodingi == 0) {b.addBasicIdTypCdgDsply("[[");}
		if(basicidentifiertypecoding.hasDisplay()) {

			b.addBasicIdTypCdgDsply(String.valueOf(basicidentifiertypecoding.getDisplay()));
		} else {
			b.addBasicIdTypCdgDsply("NULL");
		}

		if(basicidentifiertypecodingi == basicidentifiertypecodinglist.size()-1) {b.addBasicIdTypCdgDsply("]]");}


		/******************** Basic_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(basicidentifiertypecodingi == 0) {b.addBasicIdTypCdgVrsn("[[");}
		if(basicidentifiertypecoding.hasVersion()) {

			b.addBasicIdTypCdgVrsn(String.valueOf(basicidentifiertypecoding.getVersion()));
		} else {
			b.addBasicIdTypCdgVrsn("NULL");
		}

		if(basicidentifiertypecodingi == basicidentifiertypecodinglist.size()-1) {b.addBasicIdTypCdgVrsn("]]");}


		/******************** Basic_Id_Typ_Cdg_Cd ********************************************************************************/
		if(basicidentifiertypecodingi == 0) {b.addBasicIdTypCdgCd("[[");}
		if(basicidentifiertypecoding.hasCode()) {

			b.addBasicIdTypCdgCd(String.valueOf(basicidentifiertypecoding.getCode()));
		} else {
			b.addBasicIdTypCdgCd("NULL");
		}

		if(basicidentifiertypecodingi == basicidentifiertypecodinglist.size()-1) {b.addBasicIdTypCdgCd("]]");}


		/******************** Basic_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(basicidentifiertypecodingi == 0) {b.addBasicIdTypCdgUsrSltd("[[");}
		if(basicidentifiertypecoding.hasUserSelected()) {

			b.addBasicIdTypCdgUsrSltd(String.valueOf(basicidentifiertypecoding.getUserSelected()));
		} else {
			b.addBasicIdTypCdgUsrSltd("NULL");
		}

		if(basicidentifiertypecodingi == basicidentifiertypecodinglist.size()-1) {b.addBasicIdTypCdgUsrSltd("]]");}


		/******************** Basic_Id_Typ_Cdg_Sys ********************************************************************************/
		if(basicidentifiertypecodingi == 0) {b.addBasicIdTypCdgSys("[[");}
		if(basicidentifiertypecoding.hasSystem()) {

			b.addBasicIdTypCdgSys(String.valueOf(basicidentifiertypecoding.getSystem()));
		} else {
			b.addBasicIdTypCdgSys("NULL");
		}

		if(basicidentifiertypecodingi == basicidentifiertypecodinglist.size()-1) {b.addBasicIdTypCdgSys("]]");}


		 };
		/******************** basicidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period basicidentifierperiod = basicidentifier.getPeriod();

		/******************** Basic_Id_Prd_Strt ********************************************************************************/
		if(basicidentifieri == 0) {b.addBasicIdPrdStrt("[");}
		if(basicidentifierperiod.hasStart()) {

			b.addBasicIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(basicidentifierperiod.getStart())+"\"");
		} else {
			b.addBasicIdPrdStrt("NULL");
		}

		if(basicidentifieri == basicidentifierlist.size()-1) {b.addBasicIdPrdStrt("]");}


		/******************** Basic_Id_Prd_End ********************************************************************************/
		if(basicidentifieri == 0) {b.addBasicIdPrdEnd("[");}
		if(basicidentifierperiod.hasEnd()) {

			b.addBasicIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(basicidentifierperiod.getEnd())+"\"");
		} else {
			b.addBasicIdPrdEnd("NULL");
		}

		if(basicidentifieri == basicidentifierlist.size()-1) {b.addBasicIdPrdEnd("]");}


		/******************** basicidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse basicidentifieruse = basicidentifier.getUse();
		if(basicidentifieruse!=null) {
		if(basicidentifieri == 0) {

		b.addBasicIdUse("[");		}
			b.addBasicIdUse(basicidentifieruse.toCode());
		if(basicidentifieri == basicidentifierlist.size()-1) {

		b.addBasicIdUse("]");		}

		} else {
			b.addBasicIdUse("NULL");
		}

		/******************** Basic_Id_Assigner ********************************************************************************/
		if(basicidentifieri == 0) {b.addBasicIdAssigner("[");}
		if(basicidentifier.hasAssigner()) {

			if(basicidentifier.getAssigner().getReference() != null) {
			b.addBasicIdAssigner(basicidentifier.getAssigner().getReference());
			}
		} else {
			b.addBasicIdAssigner("NULL");
		}

		if(basicidentifieri == basicidentifierlist.size()-1) {b.addBasicIdAssigner("]");}


		/******************** Basic_Id_Sys ********************************************************************************/
		if(basicidentifieri == 0) {b.addBasicIdSys("[");}
		if(basicidentifier.hasSystem()) {

			b.addBasicIdSys(String.valueOf(basicidentifier.getSystem()));
		} else {
			b.addBasicIdSys("NULL");
		}

		if(basicidentifieri == basicidentifierlist.size()-1) {b.addBasicIdSys("]");}


		 };
		/******************** Basic_Athr ********************************************************************************/
		if(basic.hasAuthor()) {

			if(basic.getAuthor().getReference() != null) {
			b.addBasicAthr(basic.getAuthor().getReference());
			}
		} else {
			b.addBasicAthr("NULL");
		}


		return b;
	}
}
