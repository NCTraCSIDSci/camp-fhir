package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Basic;
public class BasicBidirectionalConversion 
{
	public Basic Basics(org.hl7.fhir.r4.model.Basic basic) throws ParseException
	{
		 main.java.com.campfhir.model.Basic b = new  main.java.com.campfhir.model.Basic();

		/******************** id ********************************************************************************/
		basic.setId(b.getId());

		/******************** basiccode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept basiccode = basic.getCode();

		/******************** basiccodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding basiccodecoding = basiccode.getCodingFirstRep();

		/******************** Basic_Cd_Cdg_Dsply ********************************************************************************/
		if(basiccodecoding.hasDisplay()) {
			b.setBasicCdCdgDsply(String.valueOf(basiccodecoding.getDisplay()));
		}
		/******************** Basic_Cd_Cdg_Vrsn ********************************************************************************/
		if(basiccodecoding.hasVersion()) {
			b.setBasicCdCdgVrsn(String.valueOf(basiccodecoding.getVersion()));
		}
		/******************** Basic_Cd_Cdg_Cd ********************************************************************************/
		if(basiccodecoding.hasCode()) {
			b.setBasicCdCdgCd(String.valueOf(basiccodecoding.getCode()));
		}
		/******************** Basic_Cd_Cdg_Sys ********************************************************************************/
		if(basiccodecoding.hasSystem()) {
			b.setBasicCdCdgSys(String.valueOf(basiccodecoding.getSystem()));
		}
		/******************** Basic_Cd_Cdg_UsrSltd ********************************************************************************/
		if(basiccodecoding.hasUserSelected()) {
			b.setBasicCdCdgUsrSltd(String.valueOf(basiccodecoding.getUserSelected()));
		}
		/******************** Basic_Cd_Txt ********************************************************************************/
		if(basiccode.hasText()) {
			b.setBasicCdTxt(String.valueOf(basiccode.getText()));
		}
		/******************** Basic_Athr ********************************************************************************/
		if(basic.hasAuthor()) {
			b.setBasicAthr(String.valueOf(basic.getAuthor()));
		}
		/******************** Basic_Sbjct ********************************************************************************/
		if(basic.hasSubject()) {
			b.setBasicSbjct(String.valueOf(basic.getSubject()));
		}
		/******************** Basic_Created ********************************************************************************/
		if(basic.hasCreated()) {
			b.setBasicCreated(String.valueOf(basic.getCreated()));
		}
		/******************** basicidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier basicidentifier = basic.getIdentifierFirstRep();

		/******************** Basic_Id_Vl ********************************************************************************/
		if(basicidentifier.hasValue()) {
			b.setBasicIdVl(String.valueOf(basicidentifier.getValue()));
		}
		/******************** basicidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept basicidentifiertype = basicidentifier.getType();

		/******************** basicidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding basicidentifiertypecoding = basicidentifiertype.getCodingFirstRep();

		/******************** Basic_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(basicidentifiertypecoding.hasDisplay()) {
			b.setBasicIdTypCdgDsply(String.valueOf(basicidentifiertypecoding.getDisplay()));
		}
		/******************** Basic_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(basicidentifiertypecoding.hasVersion()) {
			b.setBasicIdTypCdgVrsn(String.valueOf(basicidentifiertypecoding.getVersion()));
		}
		/******************** Basic_Id_Typ_Cdg_Cd ********************************************************************************/
		if(basicidentifiertypecoding.hasCode()) {
			b.setBasicIdTypCdgCd(String.valueOf(basicidentifiertypecoding.getCode()));
		}
		/******************** Basic_Id_Typ_Cdg_Sys ********************************************************************************/
		if(basicidentifiertypecoding.hasSystem()) {
			b.setBasicIdTypCdgSys(String.valueOf(basicidentifiertypecoding.getSystem()));
		}
		/******************** Basic_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(basicidentifiertypecoding.hasUserSelected()) {
			b.setBasicIdTypCdgUsrSltd(String.valueOf(basicidentifiertypecoding.getUserSelected()));
		}
		/******************** Basic_Id_Typ_Txt ********************************************************************************/
		if(basicidentifiertype.hasText()) {
			b.setBasicIdTypTxt(String.valueOf(basicidentifiertype.getText()));
		}
		/******************** Basic_Id_Sys ********************************************************************************/
		if(basicidentifier.hasSystem()) {
			b.setBasicIdSys(String.valueOf(basicidentifier.getSystem()));
		}
		/******************** Basic_Id_Assigner ********************************************************************************/
		if(basicidentifier.hasAssigner()) {
			b.setBasicIdAssigner(String.valueOf(basicidentifier.getAssigner()));
		}
		/******************** basicidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period basicidentifierperiod = basicidentifier.getPeriod();

		/******************** Basic_Id_Prd_End ********************************************************************************/
		if(basicidentifierperiod.hasEnd()) {
			b.setBasicIdPrdEnd(String.valueOf(basicidentifierperiod.getEnd()));
		}
		/******************** Basic_Id_Prd_Strt ********************************************************************************/
		if(basicidentifierperiod.hasStart()) {
			b.setBasicIdPrdStrt(String.valueOf(basicidentifierperiod.getStart()));
		}
		/******************** basicidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse basicidentifieruse = basicidentifier.getUse();
		b.setBasicIdUse(basicidentifieruse.toCode());

		return b;
	}
}
