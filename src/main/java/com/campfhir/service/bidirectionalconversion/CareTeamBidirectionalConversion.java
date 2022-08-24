package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CareTeam;
public class CareTeamBidirectionalConversion 
{
	public CareTeam CareTeams(org.hl7.fhir.r4.model.CareTeam careteam) throws ParseException
	{
		 main.java.com.campfhir.model.CareTeam c = new  main.java.com.campfhir.model.CareTeam();

		/******************** id ********************************************************************************/
		c.setId(careteam.getIdElement().getIdPart());

		/******************** CareTeam_Nm ********************************************************************************/
		if(careteam.hasName()) {

			c.addCareTeamNm(String.valueOf(careteam.getName()));
		} else {
			c.addCareTeamNm("NULL");
		}


		/******************** CareTeam_Sbjct ********************************************************************************/
		if(careteam.hasSubject()) {

			if(careteam.getSubject().getReference() != null) {
			c.addCareTeamSbjct(careteam.getSubject().getReference());
			}
		} else {
			c.addCareTeamSbjct("NULL");
		}


		/******************** careteamstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CareTeam.CareTeamStatus careteamstatus = careteam.getStatus();
		if(careteamstatus!=null) {
			c.addCareTeamSts(careteamstatus.toCode());
		} else {
			c.addCareTeamSts("NULL");
		}

		/******************** CareTeam_Enc ********************************************************************************/
		if(careteam.hasEncounter()) {

			if(careteam.getEncounter().getReference() != null) {
			c.addCareTeamEnc(careteam.getEncounter().getReference());
			}
		} else {
			c.addCareTeamEnc("NULL");
		}


		/******************** careteamreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> careteamreasoncodelist = careteam.getReasonCode();
		for(int careteamreasoncodei = 0; careteamreasoncodei<careteamreasoncodelist.size();careteamreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  careteamreasoncode = careteamreasoncodelist.get(careteamreasoncodei);

		/******************** CareTeam_RsnCd_Txt ********************************************************************************/
		if(careteamreasoncodei == 0) {c.addCareTeamRsnCdTxt("[");}
		if(careteamreasoncode.hasText()) {

			c.addCareTeamRsnCdTxt(String.valueOf(careteamreasoncode.getText()));
		} else {
			c.addCareTeamRsnCdTxt("NULL");
		}

		if(careteamreasoncodei == careteamreasoncodelist.size()-1) {c.addCareTeamRsnCdTxt("]");}


		/******************** careteamreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careteamreasoncodecodinglist = careteamreasoncode.getCoding();
		for(int careteamreasoncodecodingi = 0; careteamreasoncodecodingi<careteamreasoncodecodinglist.size();careteamreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careteamreasoncodecoding = careteamreasoncodecodinglist.get(careteamreasoncodecodingi);

		/******************** CareTeam_RsnCd_Cdg_Dsply ********************************************************************************/
		if(careteamreasoncodecodingi == 0) {c.addCareTeamRsnCdCdgDsply("[[");}
		if(careteamreasoncodecoding.hasDisplay()) {

			c.addCareTeamRsnCdCdgDsply(String.valueOf(careteamreasoncodecoding.getDisplay()));
		} else {
			c.addCareTeamRsnCdCdgDsply("NULL");
		}

		if(careteamreasoncodecodingi == careteamreasoncodecodinglist.size()-1) {c.addCareTeamRsnCdCdgDsply("]]");}


		/******************** CareTeam_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(careteamreasoncodecodingi == 0) {c.addCareTeamRsnCdCdgVrsn("[[");}
		if(careteamreasoncodecoding.hasVersion()) {

			c.addCareTeamRsnCdCdgVrsn(String.valueOf(careteamreasoncodecoding.getVersion()));
		} else {
			c.addCareTeamRsnCdCdgVrsn("NULL");
		}

		if(careteamreasoncodecodingi == careteamreasoncodecodinglist.size()-1) {c.addCareTeamRsnCdCdgVrsn("]]");}


		/******************** CareTeam_RsnCd_Cdg_Cd ********************************************************************************/
		if(careteamreasoncodecodingi == 0) {c.addCareTeamRsnCdCdgCd("[[");}
		if(careteamreasoncodecoding.hasCode()) {

			c.addCareTeamRsnCdCdgCd(String.valueOf(careteamreasoncodecoding.getCode()));
		} else {
			c.addCareTeamRsnCdCdgCd("NULL");
		}

		if(careteamreasoncodecodingi == careteamreasoncodecodinglist.size()-1) {c.addCareTeamRsnCdCdgCd("]]");}


		/******************** CareTeam_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(careteamreasoncodecodingi == 0) {c.addCareTeamRsnCdCdgUsrSltd("[[");}
		if(careteamreasoncodecoding.hasUserSelected()) {

			c.addCareTeamRsnCdCdgUsrSltd(String.valueOf(careteamreasoncodecoding.getUserSelected()));
		} else {
			c.addCareTeamRsnCdCdgUsrSltd("NULL");
		}

		if(careteamreasoncodecodingi == careteamreasoncodecodinglist.size()-1) {c.addCareTeamRsnCdCdgUsrSltd("]]");}


		/******************** CareTeam_RsnCd_Cdg_Sys ********************************************************************************/
		if(careteamreasoncodecodingi == 0) {c.addCareTeamRsnCdCdgSys("[[");}
		if(careteamreasoncodecoding.hasSystem()) {

			c.addCareTeamRsnCdCdgSys(String.valueOf(careteamreasoncodecoding.getSystem()));
		} else {
			c.addCareTeamRsnCdCdgSys("NULL");
		}

		if(careteamreasoncodecodingi == careteamreasoncodecodinglist.size()-1) {c.addCareTeamRsnCdCdgSys("]]");}


		 };
		 };
		/******************** careteamnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> careteamnotelist = careteam.getNote();
		for(int careteamnotei = 0; careteamnotei<careteamnotelist.size();careteamnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  careteamnote = careteamnotelist.get(careteamnotei);

		/******************** CareTeam_Nt_Time ********************************************************************************/
		if(careteamnotei == 0) {c.addCareTeamNtTime("[");}
		if(careteamnote.hasTime()) {

			c.addCareTeamNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamnote.getTime())+"\"");
		} else {
			c.addCareTeamNtTime("NULL");
		}

		if(careteamnotei == careteamnotelist.size()-1) {c.addCareTeamNtTime("]");}


		/******************** CareTeam_Nt_AthrRfrnc ********************************************************************************/
		if(careteamnotei == 0) {c.addCareTeamNtAthrRfrnc("[");}
		if(careteamnote.hasAuthorReference()) {

			if(careteamnote.getAuthorReference().getReference() != null) {
			c.addCareTeamNtAthrRfrnc(careteamnote.getAuthorReference().getReference());
			}
		} else {
			c.addCareTeamNtAthrRfrnc("NULL");
		}

		if(careteamnotei == careteamnotelist.size()-1) {c.addCareTeamNtAthrRfrnc("]");}


		/******************** CareTeam_Nt_Txt ********************************************************************************/
		if(careteamnotei == 0) {c.addCareTeamNtTxt("[");}
		if(careteamnote.hasText()) {

			c.addCareTeamNtTxt(String.valueOf(careteamnote.getText()));
		} else {
			c.addCareTeamNtTxt("NULL");
		}

		if(careteamnotei == careteamnotelist.size()-1) {c.addCareTeamNtTxt("]");}


		/******************** CareTeam_Nt_AthrStrgTyp ********************************************************************************/
		if(careteamnotei == 0) {c.addCareTeamNtAthrStrgTyp("[");}
		if(careteamnote.hasAuthorStringType()) {

			c.addCareTeamNtAthrStrgTyp("\""+careteamnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addCareTeamNtAthrStrgTyp("NULL");
		}

		if(careteamnotei == careteamnotelist.size()-1) {c.addCareTeamNtAthrStrgTyp("]");}


		 };
		/******************** CareTeam_RsnRfrnc ********************************************************************************/
		if(careteam.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<careteam.getReasonReference().size(); incr++) {
				array = array + careteam.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCareTeamRsnRfrnc(array);

		} else {
			c.addCareTeamRsnRfrnc("NULL");
		}


		/******************** careteamperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamperiod = careteam.getPeriod();

		/******************** CareTeam_Prd_Strt ********************************************************************************/
		if(careteamperiod.hasStart()) {

			c.addCareTeamPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamperiod.getStart())+"\"");
		} else {
			c.addCareTeamPrdStrt("NULL");
		}


		/******************** CareTeam_Prd_End ********************************************************************************/
		if(careteamperiod.hasEnd()) {

			c.addCareTeamPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamperiod.getEnd())+"\"");
		} else {
			c.addCareTeamPrdEnd("NULL");
		}


		/******************** careteamidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> careteamidentifierlist = careteam.getIdentifier();
		for(int careteamidentifieri = 0; careteamidentifieri<careteamidentifierlist.size();careteamidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  careteamidentifier = careteamidentifierlist.get(careteamidentifieri);

		/******************** CareTeam_Id_Vl ********************************************************************************/
		if(careteamidentifieri == 0) {c.addCareTeamIdVl("[");}
		if(careteamidentifier.hasValue()) {

			c.addCareTeamIdVl(String.valueOf(careteamidentifier.getValue()));
		} else {
			c.addCareTeamIdVl("NULL");
		}

		if(careteamidentifieri == careteamidentifierlist.size()-1) {c.addCareTeamIdVl("]");}


		/******************** careteamidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamidentifiertype = careteamidentifier.getType();

		/******************** CareTeam_Id_Typ_Txt ********************************************************************************/
		if(careteamidentifieri == 0) {c.addCareTeamIdTypTxt("[");}
		if(careteamidentifiertype.hasText()) {

			c.addCareTeamIdTypTxt(String.valueOf(careteamidentifiertype.getText()));
		} else {
			c.addCareTeamIdTypTxt("NULL");
		}

		if(careteamidentifieri == careteamidentifierlist.size()-1) {c.addCareTeamIdTypTxt("]");}


		/******************** careteamidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careteamidentifiertypecodinglist = careteamidentifiertype.getCoding();
		for(int careteamidentifiertypecodingi = 0; careteamidentifiertypecodingi<careteamidentifiertypecodinglist.size();careteamidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careteamidentifiertypecoding = careteamidentifiertypecodinglist.get(careteamidentifiertypecodingi);

		/******************** CareTeam_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(careteamidentifiertypecodingi == 0) {c.addCareTeamIdTypCdgDsply("[[");}
		if(careteamidentifiertypecoding.hasDisplay()) {

			c.addCareTeamIdTypCdgDsply(String.valueOf(careteamidentifiertypecoding.getDisplay()));
		} else {
			c.addCareTeamIdTypCdgDsply("NULL");
		}

		if(careteamidentifiertypecodingi == careteamidentifiertypecodinglist.size()-1) {c.addCareTeamIdTypCdgDsply("]]");}


		/******************** CareTeam_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(careteamidentifiertypecodingi == 0) {c.addCareTeamIdTypCdgVrsn("[[");}
		if(careteamidentifiertypecoding.hasVersion()) {

			c.addCareTeamIdTypCdgVrsn(String.valueOf(careteamidentifiertypecoding.getVersion()));
		} else {
			c.addCareTeamIdTypCdgVrsn("NULL");
		}

		if(careteamidentifiertypecodingi == careteamidentifiertypecodinglist.size()-1) {c.addCareTeamIdTypCdgVrsn("]]");}


		/******************** CareTeam_Id_Typ_Cdg_Cd ********************************************************************************/
		if(careteamidentifiertypecodingi == 0) {c.addCareTeamIdTypCdgCd("[[");}
		if(careteamidentifiertypecoding.hasCode()) {

			c.addCareTeamIdTypCdgCd(String.valueOf(careteamidentifiertypecoding.getCode()));
		} else {
			c.addCareTeamIdTypCdgCd("NULL");
		}

		if(careteamidentifiertypecodingi == careteamidentifiertypecodinglist.size()-1) {c.addCareTeamIdTypCdgCd("]]");}


		/******************** CareTeam_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(careteamidentifiertypecodingi == 0) {c.addCareTeamIdTypCdgUsrSltd("[[");}
		if(careteamidentifiertypecoding.hasUserSelected()) {

			c.addCareTeamIdTypCdgUsrSltd(String.valueOf(careteamidentifiertypecoding.getUserSelected()));
		} else {
			c.addCareTeamIdTypCdgUsrSltd("NULL");
		}

		if(careteamidentifiertypecodingi == careteamidentifiertypecodinglist.size()-1) {c.addCareTeamIdTypCdgUsrSltd("]]");}


		/******************** CareTeam_Id_Typ_Cdg_Sys ********************************************************************************/
		if(careteamidentifiertypecodingi == 0) {c.addCareTeamIdTypCdgSys("[[");}
		if(careteamidentifiertypecoding.hasSystem()) {

			c.addCareTeamIdTypCdgSys(String.valueOf(careteamidentifiertypecoding.getSystem()));
		} else {
			c.addCareTeamIdTypCdgSys("NULL");
		}

		if(careteamidentifiertypecodingi == careteamidentifiertypecodinglist.size()-1) {c.addCareTeamIdTypCdgSys("]]");}


		 };
		/******************** careteamidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamidentifierperiod = careteamidentifier.getPeriod();

		/******************** CareTeam_Id_Prd_Strt ********************************************************************************/
		if(careteamidentifieri == 0) {c.addCareTeamIdPrdStrt("[");}
		if(careteamidentifierperiod.hasStart()) {

			c.addCareTeamIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamidentifierperiod.getStart())+"\"");
		} else {
			c.addCareTeamIdPrdStrt("NULL");
		}

		if(careteamidentifieri == careteamidentifierlist.size()-1) {c.addCareTeamIdPrdStrt("]");}


		/******************** CareTeam_Id_Prd_End ********************************************************************************/
		if(careteamidentifieri == 0) {c.addCareTeamIdPrdEnd("[");}
		if(careteamidentifierperiod.hasEnd()) {

			c.addCareTeamIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamidentifierperiod.getEnd())+"\"");
		} else {
			c.addCareTeamIdPrdEnd("NULL");
		}

		if(careteamidentifieri == careteamidentifierlist.size()-1) {c.addCareTeamIdPrdEnd("]");}


		/******************** careteamidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse careteamidentifieruse = careteamidentifier.getUse();
		if(careteamidentifieruse!=null) {
		if(careteamidentifieri == 0) {

		c.addCareTeamIdUse("[");		}
			c.addCareTeamIdUse(careteamidentifieruse.toCode());
		if(careteamidentifieri == careteamidentifierlist.size()-1) {

		c.addCareTeamIdUse("]");		}

		} else {
			c.addCareTeamIdUse("NULL");
		}

		/******************** CareTeam_Id_Assigner ********************************************************************************/
		if(careteamidentifieri == 0) {c.addCareTeamIdAssigner("[");}
		if(careteamidentifier.hasAssigner()) {

			if(careteamidentifier.getAssigner().getReference() != null) {
			c.addCareTeamIdAssigner(careteamidentifier.getAssigner().getReference());
			}
		} else {
			c.addCareTeamIdAssigner("NULL");
		}

		if(careteamidentifieri == careteamidentifierlist.size()-1) {c.addCareTeamIdAssigner("]");}


		/******************** CareTeam_Id_Sys ********************************************************************************/
		if(careteamidentifieri == 0) {c.addCareTeamIdSys("[");}
		if(careteamidentifier.hasSystem()) {

			c.addCareTeamIdSys(String.valueOf(careteamidentifier.getSystem()));
		} else {
			c.addCareTeamIdSys("NULL");
		}

		if(careteamidentifieri == careteamidentifierlist.size()-1) {c.addCareTeamIdSys("]");}


		 };
		/******************** careteamcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> careteamcategorylist = careteam.getCategory();
		for(int careteamcategoryi = 0; careteamcategoryi<careteamcategorylist.size();careteamcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  careteamcategory = careteamcategorylist.get(careteamcategoryi);

		/******************** CareTeam_Ctgry_Txt ********************************************************************************/
		if(careteamcategoryi == 0) {c.addCareTeamCtgryTxt("[");}
		if(careteamcategory.hasText()) {

			c.addCareTeamCtgryTxt(String.valueOf(careteamcategory.getText()));
		} else {
			c.addCareTeamCtgryTxt("NULL");
		}

		if(careteamcategoryi == careteamcategorylist.size()-1) {c.addCareTeamCtgryTxt("]");}


		/******************** careteamcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careteamcategorycodinglist = careteamcategory.getCoding();
		for(int careteamcategorycodingi = 0; careteamcategorycodingi<careteamcategorycodinglist.size();careteamcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careteamcategorycoding = careteamcategorycodinglist.get(careteamcategorycodingi);

		/******************** CareTeam_Ctgry_Cdg_Dsply ********************************************************************************/
		if(careteamcategorycodingi == 0) {c.addCareTeamCtgryCdgDsply("[[");}
		if(careteamcategorycoding.hasDisplay()) {

			c.addCareTeamCtgryCdgDsply(String.valueOf(careteamcategorycoding.getDisplay()));
		} else {
			c.addCareTeamCtgryCdgDsply("NULL");
		}

		if(careteamcategorycodingi == careteamcategorycodinglist.size()-1) {c.addCareTeamCtgryCdgDsply("]]");}


		/******************** CareTeam_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(careteamcategorycodingi == 0) {c.addCareTeamCtgryCdgVrsn("[[");}
		if(careteamcategorycoding.hasVersion()) {

			c.addCareTeamCtgryCdgVrsn(String.valueOf(careteamcategorycoding.getVersion()));
		} else {
			c.addCareTeamCtgryCdgVrsn("NULL");
		}

		if(careteamcategorycodingi == careteamcategorycodinglist.size()-1) {c.addCareTeamCtgryCdgVrsn("]]");}


		/******************** CareTeam_Ctgry_Cdg_Cd ********************************************************************************/
		if(careteamcategorycodingi == 0) {c.addCareTeamCtgryCdgCd("[[");}
		if(careteamcategorycoding.hasCode()) {

			c.addCareTeamCtgryCdgCd(String.valueOf(careteamcategorycoding.getCode()));
		} else {
			c.addCareTeamCtgryCdgCd("NULL");
		}

		if(careteamcategorycodingi == careteamcategorycodinglist.size()-1) {c.addCareTeamCtgryCdgCd("]]");}


		/******************** CareTeam_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(careteamcategorycodingi == 0) {c.addCareTeamCtgryCdgUsrSltd("[[");}
		if(careteamcategorycoding.hasUserSelected()) {

			c.addCareTeamCtgryCdgUsrSltd(String.valueOf(careteamcategorycoding.getUserSelected()));
		} else {
			c.addCareTeamCtgryCdgUsrSltd("NULL");
		}

		if(careteamcategorycodingi == careteamcategorycodinglist.size()-1) {c.addCareTeamCtgryCdgUsrSltd("]]");}


		/******************** CareTeam_Ctgry_Cdg_Sys ********************************************************************************/
		if(careteamcategorycodingi == 0) {c.addCareTeamCtgryCdgSys("[[");}
		if(careteamcategorycoding.hasSystem()) {

			c.addCareTeamCtgryCdgSys(String.valueOf(careteamcategorycoding.getSystem()));
		} else {
			c.addCareTeamCtgryCdgSys("NULL");
		}

		if(careteamcategorycodingi == careteamcategorycodinglist.size()-1) {c.addCareTeamCtgryCdgSys("]]");}


		 };
		 };
		/******************** careteamtelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> careteamtelecomlist = careteam.getTelecom();
		for(int careteamtelecomi = 0; careteamtelecomi<careteamtelecomlist.size();careteamtelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  careteamtelecom = careteamtelecomlist.get(careteamtelecomi);

		/******************** CareTeam_Tlcm_Vl ********************************************************************************/
		if(careteamtelecomi == 0) {c.addCareTeamTlcmVl("[");}
		if(careteamtelecom.hasValue()) {

			c.addCareTeamTlcmVl(String.valueOf(careteamtelecom.getValue()));
		} else {
			c.addCareTeamTlcmVl("NULL");
		}

		if(careteamtelecomi == careteamtelecomlist.size()-1) {c.addCareTeamTlcmVl("]");}


		/******************** careteamtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamtelecomperiod = careteamtelecom.getPeriod();

		/******************** CareTeam_Tlcm_Prd_Strt ********************************************************************************/
		if(careteamtelecomi == 0) {c.addCareTeamTlcmPrdStrt("[");}
		if(careteamtelecomperiod.hasStart()) {

			c.addCareTeamTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamtelecomperiod.getStart())+"\"");
		} else {
			c.addCareTeamTlcmPrdStrt("NULL");
		}

		if(careteamtelecomi == careteamtelecomlist.size()-1) {c.addCareTeamTlcmPrdStrt("]");}


		/******************** CareTeam_Tlcm_Prd_End ********************************************************************************/
		if(careteamtelecomi == 0) {c.addCareTeamTlcmPrdEnd("[");}
		if(careteamtelecomperiod.hasEnd()) {

			c.addCareTeamTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamtelecomperiod.getEnd())+"\"");
		} else {
			c.addCareTeamTlcmPrdEnd("NULL");
		}

		if(careteamtelecomi == careteamtelecomlist.size()-1) {c.addCareTeamTlcmPrdEnd("]");}


		/******************** careteamtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse careteamtelecomuse = careteamtelecom.getUse();
		if(careteamtelecomuse!=null) {
		if(careteamtelecomi == 0) {

		c.addCareTeamTlcmUse("[");		}
			c.addCareTeamTlcmUse(careteamtelecomuse.toCode());
		if(careteamtelecomi == careteamtelecomlist.size()-1) {

		c.addCareTeamTlcmUse("]");		}

		} else {
			c.addCareTeamTlcmUse("NULL");
		}

		/******************** careteamtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem careteamtelecomsystem = careteamtelecom.getSystem();
		if(careteamtelecomsystem!=null) {
		if(careteamtelecomi == 0) {

		c.addCareTeamTlcmSys("[");		}
			c.addCareTeamTlcmSys(careteamtelecomsystem.toCode());
		if(careteamtelecomi == careteamtelecomlist.size()-1) {

		c.addCareTeamTlcmSys("]");		}

		} else {
			c.addCareTeamTlcmSys("NULL");
		}

		/******************** CareTeam_Tlcm_Rnk ********************************************************************************/
		if(careteamtelecomi == 0) {c.addCareTeamTlcmRnk("[");}
		if(careteamtelecom.hasRank()) {

			c.addCareTeamTlcmRnk(String.valueOf(careteamtelecom.getRank()));
		} else {
			c.addCareTeamTlcmRnk("NULL");
		}

		if(careteamtelecomi == careteamtelecomlist.size()-1) {c.addCareTeamTlcmRnk("]");}


		 };
		/******************** CareTeam_ManagingOrgnztn ********************************************************************************/
		if(careteam.hasManagingOrganization()) {

			String  array = "[";
			for(int incr=0; incr<careteam.getManagingOrganization().size(); incr++) {
				array = array + careteam.getManagingOrganization().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCareTeamManagingOrgnztn(array);

		} else {
			c.addCareTeamManagingOrgnztn("NULL");
		}


		/******************** careteamparticipant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CareTeam.CareTeamParticipantComponent> careteamparticipantlist = careteam.getParticipant();
		for(int careteamparticipanti = 0; careteamparticipanti<careteamparticipantlist.size();careteamparticipanti++ ) {
		org.hl7.fhir.r4.model.CareTeam.CareTeamParticipantComponent  careteamparticipant = careteamparticipantlist.get(careteamparticipanti);

		/******************** careteamparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamparticipantperiod = careteamparticipant.getPeriod();

		/******************** CareTeam_Prtcpnt_Prd_Strt ********************************************************************************/
		if(careteamparticipanti == 0) {c.addCareTeamPrtcpntPrdStrt("[");}
		if(careteamparticipantperiod.hasStart()) {

			c.addCareTeamPrtcpntPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamparticipantperiod.getStart())+"\"");
		} else {
			c.addCareTeamPrtcpntPrdStrt("NULL");
		}

		if(careteamparticipanti == careteamparticipantlist.size()-1) {c.addCareTeamPrtcpntPrdStrt("]");}


		/******************** CareTeam_Prtcpnt_Prd_End ********************************************************************************/
		if(careteamparticipanti == 0) {c.addCareTeamPrtcpntPrdEnd("[");}
		if(careteamparticipantperiod.hasEnd()) {

			c.addCareTeamPrtcpntPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careteamparticipantperiod.getEnd())+"\"");
		} else {
			c.addCareTeamPrtcpntPrdEnd("NULL");
		}

		if(careteamparticipanti == careteamparticipantlist.size()-1) {c.addCareTeamPrtcpntPrdEnd("]");}


		/******************** careteamparticipantrole ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> careteamparticipantrolelist = careteamparticipant.getRole();
		for(int careteamparticipantrolei = 0; careteamparticipantrolei<careteamparticipantrolelist.size();careteamparticipantrolei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  careteamparticipantrole = careteamparticipantrolelist.get(careteamparticipantrolei);

		/******************** CareTeam_Prtcpnt_Role_Txt ********************************************************************************/
		if(careteamparticipantrolei == 0) {c.addCareTeamPrtcpntRoleTxt("[[");}
		if(careteamparticipantrole.hasText()) {

			c.addCareTeamPrtcpntRoleTxt(String.valueOf(careteamparticipantrole.getText()));
		} else {
			c.addCareTeamPrtcpntRoleTxt("NULL");
		}

		if(careteamparticipantrolei == careteamparticipantrolelist.size()-1) {c.addCareTeamPrtcpntRoleTxt("]]");}


		/******************** careteamparticipantrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careteamparticipantrolecodinglist = careteamparticipantrole.getCoding();
		for(int careteamparticipantrolecodingi = 0; careteamparticipantrolecodingi<careteamparticipantrolecodinglist.size();careteamparticipantrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careteamparticipantrolecoding = careteamparticipantrolecodinglist.get(careteamparticipantrolecodingi);

		/******************** CareTeam_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(careteamparticipantrolecodingi == 0) {c.addCareTeamPrtcpntRoleCdgDsply("[[[");}
		if(careteamparticipantrolecoding.hasDisplay()) {

			c.addCareTeamPrtcpntRoleCdgDsply(String.valueOf(careteamparticipantrolecoding.getDisplay()));
		} else {
			c.addCareTeamPrtcpntRoleCdgDsply("NULL");
		}

		if(careteamparticipantrolecodingi == careteamparticipantrolecodinglist.size()-1) {c.addCareTeamPrtcpntRoleCdgDsply("]]]");}


		/******************** CareTeam_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(careteamparticipantrolecodingi == 0) {c.addCareTeamPrtcpntRoleCdgVrsn("[[[");}
		if(careteamparticipantrolecoding.hasVersion()) {

			c.addCareTeamPrtcpntRoleCdgVrsn(String.valueOf(careteamparticipantrolecoding.getVersion()));
		} else {
			c.addCareTeamPrtcpntRoleCdgVrsn("NULL");
		}

		if(careteamparticipantrolecodingi == careteamparticipantrolecodinglist.size()-1) {c.addCareTeamPrtcpntRoleCdgVrsn("]]]");}


		/******************** CareTeam_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(careteamparticipantrolecodingi == 0) {c.addCareTeamPrtcpntRoleCdgCd("[[[");}
		if(careteamparticipantrolecoding.hasCode()) {

			c.addCareTeamPrtcpntRoleCdgCd(String.valueOf(careteamparticipantrolecoding.getCode()));
		} else {
			c.addCareTeamPrtcpntRoleCdgCd("NULL");
		}

		if(careteamparticipantrolecodingi == careteamparticipantrolecodinglist.size()-1) {c.addCareTeamPrtcpntRoleCdgCd("]]]");}


		/******************** CareTeam_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(careteamparticipantrolecodingi == 0) {c.addCareTeamPrtcpntRoleCdgUsrSltd("[[[");}
		if(careteamparticipantrolecoding.hasUserSelected()) {

			c.addCareTeamPrtcpntRoleCdgUsrSltd(String.valueOf(careteamparticipantrolecoding.getUserSelected()));
		} else {
			c.addCareTeamPrtcpntRoleCdgUsrSltd("NULL");
		}

		if(careteamparticipantrolecodingi == careteamparticipantrolecodinglist.size()-1) {c.addCareTeamPrtcpntRoleCdgUsrSltd("]]]");}


		/******************** CareTeam_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(careteamparticipantrolecodingi == 0) {c.addCareTeamPrtcpntRoleCdgSys("[[[");}
		if(careteamparticipantrolecoding.hasSystem()) {

			c.addCareTeamPrtcpntRoleCdgSys(String.valueOf(careteamparticipantrolecoding.getSystem()));
		} else {
			c.addCareTeamPrtcpntRoleCdgSys("NULL");
		}

		if(careteamparticipantrolecodingi == careteamparticipantrolecodinglist.size()-1) {c.addCareTeamPrtcpntRoleCdgSys("]]]");}


		 };
		 };
		/******************** CareTeam_Prtcpnt_OnBehalfOf ********************************************************************************/
		if(careteamparticipant.hasOnBehalfOf()) {

			if(careteamparticipant.getOnBehalfOf().getReference() != null) {
			c.addCareTeamPrtcpntOnBehalfOf(careteamparticipant.getOnBehalfOf().getReference());
			}
		} else {
			c.addCareTeamPrtcpntOnBehalfOf("NULL");
		}


		/******************** CareTeam_Prtcpnt_Mmbr ********************************************************************************/
		if(careteamparticipant.hasMember()) {

			if(careteamparticipant.getMember().getReference() != null) {
			c.addCareTeamPrtcpntMmbr(careteamparticipant.getMember().getReference());
			}
		} else {
			c.addCareTeamPrtcpntMmbr("NULL");
		}


		 };
		return c;
	}
}
