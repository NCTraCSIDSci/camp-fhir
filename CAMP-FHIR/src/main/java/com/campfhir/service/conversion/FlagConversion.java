package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Flag;
public class FlagConversion 
{
	public org.hl7.fhir.r4.model.Flag Flags(Flag f) throws ParseException
	{
		org.hl7.fhir.r4.model.Flag flag = new org.hl7.fhir.r4.model.Flag();

		/******************** id ********************************************************************************/
		flag.setId(f.getId());

		/******************** Flag_Athr ********************************************************************************/
		if(f.getFlagAthr() != null) {
			flag.setAuthor( new org.hl7.fhir.r4.model.Reference(f.getFlagAthr()));
		}
		/******************** flagcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		flag.addCategory(flagcategory);

		/******************** flagcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding flagcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		flagcategory.addCoding(flagcategorycoding);

		/******************** Flag_Ctgry_Cdg_Cd ********************************************************************************/
		if(f.getFlagCtgryCdgCd() != null) {
			flagcategorycoding.setCode(f.getFlagCtgryCdgCd());
		}
		/******************** Flag_Ctgry_Cdg_Dsply ********************************************************************************/
		if(f.getFlagCtgryCdgDsply() != null) {
			flagcategorycoding.setDisplay(f.getFlagCtgryCdgDsply());
		}
		/******************** Flag_Ctgry_Cdg_Sys ********************************************************************************/
		if(f.getFlagCtgryCdgSys() != null) {
			flagcategorycoding.setSystem(f.getFlagCtgryCdgSys());
		}
		/******************** Flag_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(f.getFlagCtgryCdgUsrSltd() != null) {
			flagcategorycoding.setUserSelected(Boolean.parseBoolean(f.getFlagCtgryCdgUsrSltd()));
		}
		/******************** Flag_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(f.getFlagCtgryCdgVrsn() != null) {
			flagcategorycoding.setVersion(f.getFlagCtgryCdgVrsn());
		}
		/******************** Flag_Ctgry_Txt ********************************************************************************/
		if(f.getFlagCtgryTxt() != null) {
			flagcategory.setText(f.getFlagCtgryTxt());
		}
		/******************** flagcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		flag.setCode(flagcode);

		/******************** flagcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding flagcodecoding =  new org.hl7.fhir.r4.model.Coding();
		flagcode.addCoding(flagcodecoding);

		/******************** Flag_Cd_Cdg_Cd ********************************************************************************/
		if(f.getFlagCdCdgCd() != null) {
			flagcodecoding.setCode(f.getFlagCdCdgCd());
		}
		/******************** Flag_Cd_Cdg_Dsply ********************************************************************************/
		if(f.getFlagCdCdgDsply() != null) {
			flagcodecoding.setDisplay(f.getFlagCdCdgDsply());
		}
		/******************** Flag_Cd_Cdg_Sys ********************************************************************************/
		if(f.getFlagCdCdgSys() != null) {
			flagcodecoding.setSystem(f.getFlagCdCdgSys());
		}
		/******************** Flag_Cd_Cdg_UsrSltd ********************************************************************************/
		if(f.getFlagCdCdgUsrSltd() != null) {
			flagcodecoding.setUserSelected(Boolean.parseBoolean(f.getFlagCdCdgUsrSltd()));
		}
		/******************** Flag_Cd_Cdg_Vrsn ********************************************************************************/
		if(f.getFlagCdCdgVrsn() != null) {
			flagcodecoding.setVersion(f.getFlagCdCdgVrsn());
		}
		/******************** Flag_Cd_Txt ********************************************************************************/
		if(f.getFlagCdTxt() != null) {
			flagcode.setText(f.getFlagCdTxt());
		}
		/******************** Flag_Enc ********************************************************************************/
		if(f.getFlagEnc() != null) {
			flag.setEncounter( new org.hl7.fhir.r4.model.Reference(f.getFlagEnc()));
		}
		/******************** flagidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier flagidentifier =  new org.hl7.fhir.r4.model.Identifier();
		flag.addIdentifier(flagidentifier);

		/******************** Flag_Id_Assigner ********************************************************************************/
		if(f.getFlagIdAssigner() != null) {
			flagidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(f.getFlagIdAssigner()));
		}
		/******************** flagidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period flagidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		flagidentifier.setPeriod(flagidentifierperiod);

		/******************** Flag_Id_Prd_End ********************************************************************************/
		if(f.getFlagIdPrdEnd() != null) {
			java.text.SimpleDateFormat Flag_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Flag_Id_Prd_Enddate = Flag_Id_Prd_Endsdf.parse(f.getFlagIdPrdEnd());
			flagidentifierperiod.setEnd(Flag_Id_Prd_Enddate);
		}
		/******************** Flag_Id_Prd_Strt ********************************************************************************/
		if(f.getFlagIdPrdStrt() != null) {
			java.text.SimpleDateFormat Flag_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Flag_Id_Prd_Strtdate = Flag_Id_Prd_Strtsdf.parse(f.getFlagIdPrdStrt());
			flagidentifierperiod.setStart(Flag_Id_Prd_Strtdate);
		}
		/******************** Flag_Id_Sys ********************************************************************************/
		if(f.getFlagIdSys() != null) {
			flagidentifier.setSystem(f.getFlagIdSys());
		}
		/******************** flagidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		flagidentifier.setType(flagidentifiertype);

		/******************** flagidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding flagidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		flagidentifiertype.addCoding(flagidentifiertypecoding);

		/******************** Flag_Id_Typ_Cdg_Cd ********************************************************************************/
		if(f.getFlagIdTypCdgCd() != null) {
			flagidentifiertypecoding.setCode(f.getFlagIdTypCdgCd());
		}
		/******************** Flag_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(f.getFlagIdTypCdgDsply() != null) {
			flagidentifiertypecoding.setDisplay(f.getFlagIdTypCdgDsply());
		}
		/******************** Flag_Id_Typ_Cdg_Sys ********************************************************************************/
		if(f.getFlagIdTypCdgSys() != null) {
			flagidentifiertypecoding.setSystem(f.getFlagIdTypCdgSys());
		}
		/******************** Flag_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(f.getFlagIdTypCdgUsrSltd() != null) {
			flagidentifiertypecoding.setUserSelected(Boolean.parseBoolean(f.getFlagIdTypCdgUsrSltd()));
		}
		/******************** Flag_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(f.getFlagIdTypCdgVrsn() != null) {
			flagidentifiertypecoding.setVersion(f.getFlagIdTypCdgVrsn());
		}
		/******************** Flag_Id_Typ_Txt ********************************************************************************/
		if(f.getFlagIdTypTxt() != null) {
			flagidentifiertype.setText(f.getFlagIdTypTxt());
		}
		/******************** flagidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory flagidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		flagidentifier.setUse(flagidentifieruse.fromCode(f.getFlagIdUse()));

		/******************** Flag_Id_Vl ********************************************************************************/
		if(f.getFlagIdVl() != null) {
			flagidentifier.setValue(f.getFlagIdVl());
		}
		/******************** flagperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period flagperiod =  new org.hl7.fhir.r4.model.Period();
		flag.setPeriod(flagperiod);

		/******************** Flag_Prd_End ********************************************************************************/
		if(f.getFlagPrdEnd() != null) {
			java.text.SimpleDateFormat Flag_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Flag_Prd_Enddate = Flag_Prd_Endsdf.parse(f.getFlagPrdEnd());
			flagperiod.setEnd(Flag_Prd_Enddate);
		}
		/******************** Flag_Prd_Strt ********************************************************************************/
		if(f.getFlagPrdStrt() != null) {
			java.text.SimpleDateFormat Flag_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Flag_Prd_Strtdate = Flag_Prd_Strtsdf.parse(f.getFlagPrdStrt());
			flagperiod.setStart(Flag_Prd_Strtdate);
		}
		/******************** flagstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Flag.FlagStatusEnumFactory flagstatus =  new org.hl7.fhir.r4.model.Flag.FlagStatusEnumFactory();
		flag.setStatus(flagstatus.fromCode(f.getFlagSts()));

		/******************** Flag_Sbjct ********************************************************************************/
		if(f.getFlagSbjct() != null) {
			flag.setSubject( new org.hl7.fhir.r4.model.Reference(f.getFlagSbjct()));
		}
		return flag;
	}
}
