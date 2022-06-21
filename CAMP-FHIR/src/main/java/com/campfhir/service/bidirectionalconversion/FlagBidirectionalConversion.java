package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Flag;
public class FlagBidirectionalConversion 
{
	public Flag Flags(org.hl7.fhir.r4.model.Flag flag) throws ParseException
	{
		 main.java.com.campfhir.model.Flag f = new  main.java.com.campfhir.model.Flag();

		/******************** id ********************************************************************************/
		flag.setId(f.getId());

		/******************** flagcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagcode = flag.getCode();

		/******************** flagcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding flagcodecoding = flagcode.getCodingFirstRep();

		/******************** Flag_Cd_Cdg_Dsply ********************************************************************************/
		if(flagcodecoding.hasDisplay()) {
			f.setFlagCdCdgDsply(String.valueOf(flagcodecoding.getDisplay()));
		}
		/******************** Flag_Cd_Cdg_Vrsn ********************************************************************************/
		if(flagcodecoding.hasVersion()) {
			f.setFlagCdCdgVrsn(String.valueOf(flagcodecoding.getVersion()));
		}
		/******************** Flag_Cd_Cdg_Cd ********************************************************************************/
		if(flagcodecoding.hasCode()) {
			f.setFlagCdCdgCd(String.valueOf(flagcodecoding.getCode()));
		}
		/******************** Flag_Cd_Cdg_Sys ********************************************************************************/
		if(flagcodecoding.hasSystem()) {
			f.setFlagCdCdgSys(String.valueOf(flagcodecoding.getSystem()));
		}
		/******************** Flag_Cd_Cdg_UsrSltd ********************************************************************************/
		if(flagcodecoding.hasUserSelected()) {
			f.setFlagCdCdgUsrSltd(String.valueOf(flagcodecoding.getUserSelected()));
		}
		/******************** Flag_Cd_Txt ********************************************************************************/
		if(flagcode.hasText()) {
			f.setFlagCdTxt(String.valueOf(flagcode.getText()));
		}
		/******************** Flag_Athr ********************************************************************************/
		if(flag.hasAuthor()) {
			f.setFlagAthr(String.valueOf(flag.getAuthor()));
		}
		/******************** Flag_Sbjct ********************************************************************************/
		if(flag.hasSubject()) {
			f.setFlagSbjct(String.valueOf(flag.getSubject()));
		}
		/******************** flagstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Flag.FlagStatus flagstatus = flag.getStatus();
		f.setFlagSts(flagstatus.toCode());

		/******************** Flag_Enc ********************************************************************************/
		if(flag.hasEncounter()) {
			f.setFlagEnc(String.valueOf(flag.getEncounter()));
		}
		/******************** flagperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period flagperiod = flag.getPeriod();

		/******************** Flag_Prd_End ********************************************************************************/
		if(flagperiod.hasEnd()) {
			f.setFlagPrdEnd(String.valueOf(flagperiod.getEnd()));
		}
		/******************** Flag_Prd_Strt ********************************************************************************/
		if(flagperiod.hasStart()) {
			f.setFlagPrdStrt(String.valueOf(flagperiod.getStart()));
		}
		/******************** flagcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagcategory = flag.getCategoryFirstRep();

		/******************** flagcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding flagcategorycoding = flagcategory.getCodingFirstRep();

		/******************** Flag_Ctgry_Cdg_Dsply ********************************************************************************/
		if(flagcategorycoding.hasDisplay()) {
			f.setFlagCtgryCdgDsply(String.valueOf(flagcategorycoding.getDisplay()));
		}
		/******************** Flag_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(flagcategorycoding.hasVersion()) {
			f.setFlagCtgryCdgVrsn(String.valueOf(flagcategorycoding.getVersion()));
		}
		/******************** Flag_Ctgry_Cdg_Cd ********************************************************************************/
		if(flagcategorycoding.hasCode()) {
			f.setFlagCtgryCdgCd(String.valueOf(flagcategorycoding.getCode()));
		}
		/******************** Flag_Ctgry_Cdg_Sys ********************************************************************************/
		if(flagcategorycoding.hasSystem()) {
			f.setFlagCtgryCdgSys(String.valueOf(flagcategorycoding.getSystem()));
		}
		/******************** Flag_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(flagcategorycoding.hasUserSelected()) {
			f.setFlagCtgryCdgUsrSltd(String.valueOf(flagcategorycoding.getUserSelected()));
		}
		/******************** Flag_Ctgry_Txt ********************************************************************************/
		if(flagcategory.hasText()) {
			f.setFlagCtgryTxt(String.valueOf(flagcategory.getText()));
		}
		/******************** flagidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier flagidentifier = flag.getIdentifierFirstRep();

		/******************** Flag_Id_Vl ********************************************************************************/
		if(flagidentifier.hasValue()) {
			f.setFlagIdVl(String.valueOf(flagidentifier.getValue()));
		}
		/******************** flagidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept flagidentifiertype = flagidentifier.getType();

		/******************** flagidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding flagidentifiertypecoding = flagidentifiertype.getCodingFirstRep();

		/******************** Flag_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(flagidentifiertypecoding.hasDisplay()) {
			f.setFlagIdTypCdgDsply(String.valueOf(flagidentifiertypecoding.getDisplay()));
		}
		/******************** Flag_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(flagidentifiertypecoding.hasVersion()) {
			f.setFlagIdTypCdgVrsn(String.valueOf(flagidentifiertypecoding.getVersion()));
		}
		/******************** Flag_Id_Typ_Cdg_Cd ********************************************************************************/
		if(flagidentifiertypecoding.hasCode()) {
			f.setFlagIdTypCdgCd(String.valueOf(flagidentifiertypecoding.getCode()));
		}
		/******************** Flag_Id_Typ_Cdg_Sys ********************************************************************************/
		if(flagidentifiertypecoding.hasSystem()) {
			f.setFlagIdTypCdgSys(String.valueOf(flagidentifiertypecoding.getSystem()));
		}
		/******************** Flag_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(flagidentifiertypecoding.hasUserSelected()) {
			f.setFlagIdTypCdgUsrSltd(String.valueOf(flagidentifiertypecoding.getUserSelected()));
		}
		/******************** Flag_Id_Typ_Txt ********************************************************************************/
		if(flagidentifiertype.hasText()) {
			f.setFlagIdTypTxt(String.valueOf(flagidentifiertype.getText()));
		}
		/******************** Flag_Id_Sys ********************************************************************************/
		if(flagidentifier.hasSystem()) {
			f.setFlagIdSys(String.valueOf(flagidentifier.getSystem()));
		}
		/******************** Flag_Id_Assigner ********************************************************************************/
		if(flagidentifier.hasAssigner()) {
			f.setFlagIdAssigner(String.valueOf(flagidentifier.getAssigner()));
		}
		/******************** flagidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period flagidentifierperiod = flagidentifier.getPeriod();

		/******************** Flag_Id_Prd_End ********************************************************************************/
		if(flagidentifierperiod.hasEnd()) {
			f.setFlagIdPrdEnd(String.valueOf(flagidentifierperiod.getEnd()));
		}
		/******************** Flag_Id_Prd_Strt ********************************************************************************/
		if(flagidentifierperiod.hasStart()) {
			f.setFlagIdPrdStrt(String.valueOf(flagidentifierperiod.getStart()));
		}
		/******************** flagidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse flagidentifieruse = flagidentifier.getUse();
		f.setFlagIdUse(flagidentifieruse.toCode());

		return f;
	}
}
