package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Flag;
public class FlagBidirectionalConversion 
{
	public Flag Flags(org.hl7.fhir.r4.model.Flag flag) throws ParseException
	{
		 main.java.com.campfhir.model.Flag f = new  main.java.com.campfhir.model.Flag();

		/******************** id ********************************************************************************/
		f.setId(flag.getIdElement().getIdPart());

		/******************** flagcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagcode = flag.getCode();

		/******************** Flag_Cd_Txt ********************************************************************************/
		if(flagcode.hasText()) {

			f.addFlagCdTxt(String.valueOf(flagcode.getText()));
		} else {
			f.addFlagCdTxt("NULL");
		}


		/******************** flagcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> flagcodecodinglist = flagcode.getCoding();
		for(int flagcodecodingi = 0; flagcodecodingi<flagcodecodinglist.size();flagcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  flagcodecoding = flagcodecodinglist.get(flagcodecodingi);

		/******************** Flag_Cd_Cdg_Dsply ********************************************************************************/
		if(flagcodecodingi == 0) {f.addFlagCdCdgDsply("[");}
		if(flagcodecoding.hasDisplay()) {

			f.addFlagCdCdgDsply(String.valueOf(flagcodecoding.getDisplay()));
		} else {
			f.addFlagCdCdgDsply("NULL");
		}

		if(flagcodecodingi == flagcodecodinglist.size()-1) {f.addFlagCdCdgDsply("]");}


		/******************** Flag_Cd_Cdg_Vrsn ********************************************************************************/
		if(flagcodecodingi == 0) {f.addFlagCdCdgVrsn("[");}
		if(flagcodecoding.hasVersion()) {

			f.addFlagCdCdgVrsn(String.valueOf(flagcodecoding.getVersion()));
		} else {
			f.addFlagCdCdgVrsn("NULL");
		}

		if(flagcodecodingi == flagcodecodinglist.size()-1) {f.addFlagCdCdgVrsn("]");}


		/******************** Flag_Cd_Cdg_Cd ********************************************************************************/
		if(flagcodecodingi == 0) {f.addFlagCdCdgCd("[");}
		if(flagcodecoding.hasCode()) {

			f.addFlagCdCdgCd(String.valueOf(flagcodecoding.getCode()));
		} else {
			f.addFlagCdCdgCd("NULL");
		}

		if(flagcodecodingi == flagcodecodinglist.size()-1) {f.addFlagCdCdgCd("]");}


		/******************** Flag_Cd_Cdg_UsrSltd ********************************************************************************/
		if(flagcodecodingi == 0) {f.addFlagCdCdgUsrSltd("[");}
		if(flagcodecoding.hasUserSelected()) {

			f.addFlagCdCdgUsrSltd(String.valueOf(flagcodecoding.getUserSelected()));
		} else {
			f.addFlagCdCdgUsrSltd("NULL");
		}

		if(flagcodecodingi == flagcodecodinglist.size()-1) {f.addFlagCdCdgUsrSltd("]");}


		/******************** Flag_Cd_Cdg_Sys ********************************************************************************/
		if(flagcodecodingi == 0) {f.addFlagCdCdgSys("[");}
		if(flagcodecoding.hasSystem()) {

			f.addFlagCdCdgSys(String.valueOf(flagcodecoding.getSystem()));
		} else {
			f.addFlagCdCdgSys("NULL");
		}

		if(flagcodecodingi == flagcodecodinglist.size()-1) {f.addFlagCdCdgSys("]");}


		 };
		/******************** Flag_Sbjct ********************************************************************************/
		if(flag.hasSubject()) {

			if(flag.getSubject().getReference() != null) {
			f.addFlagSbjct(flag.getSubject().getReference());
			}
		} else {
			f.addFlagSbjct("NULL");
		}


		/******************** flagstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Flag.FlagStatus flagstatus = flag.getStatus();
		if(flagstatus!=null) {
			f.addFlagSts(flagstatus.toCode());
		} else {
			f.addFlagSts("NULL");
		}

		/******************** Flag_Enc ********************************************************************************/
		if(flag.hasEncounter()) {

			if(flag.getEncounter().getReference() != null) {
			f.addFlagEnc(flag.getEncounter().getReference());
			}
		} else {
			f.addFlagEnc("NULL");
		}


		/******************** flagperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period flagperiod = flag.getPeriod();

		/******************** Flag_Prd_Strt ********************************************************************************/
		if(flagperiod.hasStart()) {

			f.addFlagPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(flagperiod.getStart())+"\"");
		} else {
			f.addFlagPrdStrt("NULL");
		}


		/******************** Flag_Prd_End ********************************************************************************/
		if(flagperiod.hasEnd()) {

			f.addFlagPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(flagperiod.getEnd())+"\"");
		} else {
			f.addFlagPrdEnd("NULL");
		}


		/******************** flagidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> flagidentifierlist = flag.getIdentifier();
		for(int flagidentifieri = 0; flagidentifieri<flagidentifierlist.size();flagidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  flagidentifier = flagidentifierlist.get(flagidentifieri);

		/******************** Flag_Id_Vl ********************************************************************************/
		if(flagidentifieri == 0) {f.addFlagIdVl("[");}
		if(flagidentifier.hasValue()) {

			f.addFlagIdVl(String.valueOf(flagidentifier.getValue()));
		} else {
			f.addFlagIdVl("NULL");
		}

		if(flagidentifieri == flagidentifierlist.size()-1) {f.addFlagIdVl("]");}


		/******************** flagidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagidentifiertype = flagidentifier.getType();

		/******************** Flag_Id_Typ_Txt ********************************************************************************/
		if(flagidentifieri == 0) {f.addFlagIdTypTxt("[");}
		if(flagidentifiertype.hasText()) {

			f.addFlagIdTypTxt(String.valueOf(flagidentifiertype.getText()));
		} else {
			f.addFlagIdTypTxt("NULL");
		}

		if(flagidentifieri == flagidentifierlist.size()-1) {f.addFlagIdTypTxt("]");}


		/******************** flagidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> flagidentifiertypecodinglist = flagidentifiertype.getCoding();
		for(int flagidentifiertypecodingi = 0; flagidentifiertypecodingi<flagidentifiertypecodinglist.size();flagidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  flagidentifiertypecoding = flagidentifiertypecodinglist.get(flagidentifiertypecodingi);

		/******************** Flag_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(flagidentifiertypecodingi == 0) {f.addFlagIdTypCdgDsply("[[");}
		if(flagidentifiertypecoding.hasDisplay()) {

			f.addFlagIdTypCdgDsply(String.valueOf(flagidentifiertypecoding.getDisplay()));
		} else {
			f.addFlagIdTypCdgDsply("NULL");
		}

		if(flagidentifiertypecodingi == flagidentifiertypecodinglist.size()-1) {f.addFlagIdTypCdgDsply("]]");}


		/******************** Flag_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(flagidentifiertypecodingi == 0) {f.addFlagIdTypCdgVrsn("[[");}
		if(flagidentifiertypecoding.hasVersion()) {

			f.addFlagIdTypCdgVrsn(String.valueOf(flagidentifiertypecoding.getVersion()));
		} else {
			f.addFlagIdTypCdgVrsn("NULL");
		}

		if(flagidentifiertypecodingi == flagidentifiertypecodinglist.size()-1) {f.addFlagIdTypCdgVrsn("]]");}


		/******************** Flag_Id_Typ_Cdg_Cd ********************************************************************************/
		if(flagidentifiertypecodingi == 0) {f.addFlagIdTypCdgCd("[[");}
		if(flagidentifiertypecoding.hasCode()) {

			f.addFlagIdTypCdgCd(String.valueOf(flagidentifiertypecoding.getCode()));
		} else {
			f.addFlagIdTypCdgCd("NULL");
		}

		if(flagidentifiertypecodingi == flagidentifiertypecodinglist.size()-1) {f.addFlagIdTypCdgCd("]]");}


		/******************** Flag_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(flagidentifiertypecodingi == 0) {f.addFlagIdTypCdgUsrSltd("[[");}
		if(flagidentifiertypecoding.hasUserSelected()) {

			f.addFlagIdTypCdgUsrSltd(String.valueOf(flagidentifiertypecoding.getUserSelected()));
		} else {
			f.addFlagIdTypCdgUsrSltd("NULL");
		}

		if(flagidentifiertypecodingi == flagidentifiertypecodinglist.size()-1) {f.addFlagIdTypCdgUsrSltd("]]");}


		/******************** Flag_Id_Typ_Cdg_Sys ********************************************************************************/
		if(flagidentifiertypecodingi == 0) {f.addFlagIdTypCdgSys("[[");}
		if(flagidentifiertypecoding.hasSystem()) {

			f.addFlagIdTypCdgSys(String.valueOf(flagidentifiertypecoding.getSystem()));
		} else {
			f.addFlagIdTypCdgSys("NULL");
		}

		if(flagidentifiertypecodingi == flagidentifiertypecodinglist.size()-1) {f.addFlagIdTypCdgSys("]]");}


		 };
		/******************** flagidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period flagidentifierperiod = flagidentifier.getPeriod();

		/******************** Flag_Id_Prd_Strt ********************************************************************************/
		if(flagidentifieri == 0) {f.addFlagIdPrdStrt("[");}
		if(flagidentifierperiod.hasStart()) {

			f.addFlagIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(flagidentifierperiod.getStart())+"\"");
		} else {
			f.addFlagIdPrdStrt("NULL");
		}

		if(flagidentifieri == flagidentifierlist.size()-1) {f.addFlagIdPrdStrt("]");}


		/******************** Flag_Id_Prd_End ********************************************************************************/
		if(flagidentifieri == 0) {f.addFlagIdPrdEnd("[");}
		if(flagidentifierperiod.hasEnd()) {

			f.addFlagIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(flagidentifierperiod.getEnd())+"\"");
		} else {
			f.addFlagIdPrdEnd("NULL");
		}

		if(flagidentifieri == flagidentifierlist.size()-1) {f.addFlagIdPrdEnd("]");}


		/******************** flagidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse flagidentifieruse = flagidentifier.getUse();
		if(flagidentifieruse!=null) {
		if(flagidentifieri == 0) {

		f.addFlagIdUse("[");		}
			f.addFlagIdUse(flagidentifieruse.toCode());
		if(flagidentifieri == flagidentifierlist.size()-1) {

		f.addFlagIdUse("]");		}

		} else {
			f.addFlagIdUse("NULL");
		}

		/******************** Flag_Id_Assigner ********************************************************************************/
		if(flagidentifieri == 0) {f.addFlagIdAssigner("[");}
		if(flagidentifier.hasAssigner()) {

			if(flagidentifier.getAssigner().getReference() != null) {
			f.addFlagIdAssigner(flagidentifier.getAssigner().getReference());
			}
		} else {
			f.addFlagIdAssigner("NULL");
		}

		if(flagidentifieri == flagidentifierlist.size()-1) {f.addFlagIdAssigner("]");}


		/******************** Flag_Id_Sys ********************************************************************************/
		if(flagidentifieri == 0) {f.addFlagIdSys("[");}
		if(flagidentifier.hasSystem()) {

			f.addFlagIdSys(String.valueOf(flagidentifier.getSystem()));
		} else {
			f.addFlagIdSys("NULL");
		}

		if(flagidentifieri == flagidentifierlist.size()-1) {f.addFlagIdSys("]");}


		 };
		/******************** flagcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> flagcategorylist = flag.getCategory();
		for(int flagcategoryi = 0; flagcategoryi<flagcategorylist.size();flagcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  flagcategory = flagcategorylist.get(flagcategoryi);

		/******************** Flag_Ctgry_Txt ********************************************************************************/
		if(flagcategoryi == 0) {f.addFlagCtgryTxt("[");}
		if(flagcategory.hasText()) {

			f.addFlagCtgryTxt(String.valueOf(flagcategory.getText()));
		} else {
			f.addFlagCtgryTxt("NULL");
		}

		if(flagcategoryi == flagcategorylist.size()-1) {f.addFlagCtgryTxt("]");}


		/******************** flagcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> flagcategorycodinglist = flagcategory.getCoding();
		for(int flagcategorycodingi = 0; flagcategorycodingi<flagcategorycodinglist.size();flagcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  flagcategorycoding = flagcategorycodinglist.get(flagcategorycodingi);

		/******************** Flag_Ctgry_Cdg_Dsply ********************************************************************************/
		if(flagcategorycodingi == 0) {f.addFlagCtgryCdgDsply("[[");}
		if(flagcategorycoding.hasDisplay()) {

			f.addFlagCtgryCdgDsply(String.valueOf(flagcategorycoding.getDisplay()));
		} else {
			f.addFlagCtgryCdgDsply("NULL");
		}

		if(flagcategorycodingi == flagcategorycodinglist.size()-1) {f.addFlagCtgryCdgDsply("]]");}


		/******************** Flag_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(flagcategorycodingi == 0) {f.addFlagCtgryCdgVrsn("[[");}
		if(flagcategorycoding.hasVersion()) {

			f.addFlagCtgryCdgVrsn(String.valueOf(flagcategorycoding.getVersion()));
		} else {
			f.addFlagCtgryCdgVrsn("NULL");
		}

		if(flagcategorycodingi == flagcategorycodinglist.size()-1) {f.addFlagCtgryCdgVrsn("]]");}


		/******************** Flag_Ctgry_Cdg_Cd ********************************************************************************/
		if(flagcategorycodingi == 0) {f.addFlagCtgryCdgCd("[[");}
		if(flagcategorycoding.hasCode()) {

			f.addFlagCtgryCdgCd(String.valueOf(flagcategorycoding.getCode()));
		} else {
			f.addFlagCtgryCdgCd("NULL");
		}

		if(flagcategorycodingi == flagcategorycodinglist.size()-1) {f.addFlagCtgryCdgCd("]]");}


		/******************** Flag_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(flagcategorycodingi == 0) {f.addFlagCtgryCdgUsrSltd("[[");}
		if(flagcategorycoding.hasUserSelected()) {

			f.addFlagCtgryCdgUsrSltd(String.valueOf(flagcategorycoding.getUserSelected()));
		} else {
			f.addFlagCtgryCdgUsrSltd("NULL");
		}

		if(flagcategorycodingi == flagcategorycodinglist.size()-1) {f.addFlagCtgryCdgUsrSltd("]]");}


		/******************** Flag_Ctgry_Cdg_Sys ********************************************************************************/
		if(flagcategorycodingi == 0) {f.addFlagCtgryCdgSys("[[");}
		if(flagcategorycoding.hasSystem()) {

			f.addFlagCtgryCdgSys(String.valueOf(flagcategorycoding.getSystem()));
		} else {
			f.addFlagCtgryCdgSys("NULL");
		}

		if(flagcategorycodingi == flagcategorycodinglist.size()-1) {f.addFlagCtgryCdgSys("]]");}


		 };
		 };
		/******************** Flag_Athr ********************************************************************************/
		if(flag.hasAuthor()) {

			if(flag.getAuthor().getReference() != null) {
			f.addFlagAthr(flag.getAuthor().getReference());
			}
		} else {
			f.addFlagAthr("NULL");
		}


		return f;
	}
}
